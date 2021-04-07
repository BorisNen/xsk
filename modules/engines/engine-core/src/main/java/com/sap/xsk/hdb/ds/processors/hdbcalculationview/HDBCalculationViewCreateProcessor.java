/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors.hdbcalculationview;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.dirigible.repository.api.RepositoryPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbcalculationview.XSKDataStructureHDBCalculationViewModel;

public class HDBCalculationViewCreateProcessor extends HDBCalculationViewAbstractProcessor {

  private static final Logger logger =
      LoggerFactory.getLogger(HDBCalculationViewCreateProcessor.class);

  private static HDBCalculationViewCreateProcessor INSTANCE =
      new HDBCalculationViewCreateProcessor();

  private HDBCalculationViewCreateProcessor() {}

  public static void execute(
      Connection connection, List<XSKDataStructureHDBCalculationViewModel> hdbCalculationViews)
      throws SQLException {

    if (hdbCalculationViews.isEmpty()) {
      return;
    }

    // Grant Privileges to Container Group API
    INSTANCE.grantPrivilegesToContainerGroupAPI(connection, INSTANCE.getUser());

    // Create a Container Group
    INSTANCE.createContainerGroup(connection, INSTANCE.getGroup());

    // Grant Privileges to the Container Group
    INSTANCE.grantPrivilegesToContainerGroup(connection, INSTANCE.getGroup(), INSTANCE.getUser());

    // Create a Container
    INSTANCE.createContainer(connection, INSTANCE.getGroup(), INSTANCE.getContainer());

    // Grant Privileges to Container API
    INSTANCE.grantPrivilegesToContainerAPI(
        connection, INSTANCE.getGroup(), INSTANCE.getContainer(), INSTANCE.getUser());

    Set<String> folders = enumerateFolders(hdbCalculationViews);

    // Write the files content to the Container
    INSTANCE.writeContentInContainer(
        connection, INSTANCE.getContainer(), folders, hdbCalculationViews);

    // Configure Libraries for the Container
    INSTANCE.configureLibraries(connection, INSTANCE.getContainer());

    // Deploy the Content
    INSTANCE.deployContainerCreateContent(connection, INSTANCE.getContainer(), hdbCalculationViews);

    // Grant Privileges to the Container Schema
    INSTANCE.grantPrivilegesToContainerSchema(
        connection, INSTANCE.getContainer(), INSTANCE.getUser());
  }

  private void deployContainerCreateContent(
      Connection connection,
      String container,
      List<XSKDataStructureHDBCalculationViewModel> hdbCalculationViews)
      throws SQLException {
    executeUpdate(
        connection,
        "CREATE LOCAL TEMPORARY COLUMN TABLE #DEPLOY_PATHS LIKE _SYS_DI.TT_FILESFOLDERS;");
    executeUpdate(connection, "INSERT INTO #DEPLOY_PATHS (PATH) VALUES ('.hdiconfig');");
    for (XSKDataStructureHDBCalculationViewModel next : hdbCalculationViews) {
      executeUpdate(
          connection,
          "INSERT INTO #DEPLOY_PATHS (PATH) VALUES ('" + next.getLocation().substring(1) + "');");
    }
    executeUpdate(
        connection,
        "CREATE LOCAL TEMPORARY COLUMN TABLE #UNDEPLOY_PATHS LIKE _SYS_DI.TT_FILESFOLDERS;");
    executeUpdate(
        connection,
        "CREATE LOCAL TEMPORARY COLUMN TABLE #PATH_PARAMETERS LIKE _SYS_DI.TT_FILESFOLDERS_PARAMETERS;");

    executeQuery(
        connection,
        "CALL "
            + container
            + "#DI.MAKE(#DEPLOY_PATHS, #UNDEPLOY_PATHS, #PATH_PARAMETERS, _SYS_DI.T_NO_PARAMETERS, ?, ?, ?);");

    executeUpdate(connection, "DROP TABLE #DEPLOY_PATHS;");
    executeUpdate(connection, "DROP TABLE #UNDEPLOY_PATHS;");
    executeUpdate(connection, "DROP TABLE #PATH_PARAMETERS;");
  }
}
