/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors.hdi;

import com.sap.xsk.hdb.ds.model.hdi.XSKDataStructureHDIModel;
import org.eclipse.dirigible.commons.api.scripting.ScriptingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@Singleton
public class XSKHDIContainerCreateProcessor {

  private static final Logger logger =
      LoggerFactory.getLogger(XSKHDIContainerCreateProcessor.class);

  @Inject
  private XSKGrantPrivilegesContainerGroupAPIProcessor grantPrivilegesContainerGroupAPIProcessor;

  @Inject private XSKCreateContainerGroupProcessor createContainerGroupProcessor;
  @Inject private XSKGrantPrivilegesContainerGroupProcessor grantPrivilegesContainerGroupProcessor;
  @Inject private XSKCreateContainerProcessor createContainerProcessor;
  @Inject private XSKGrantPrivilegesContainerAPIProcessor grantPrivilegesContainerAPIProcessor;
  @Inject private XSKWriteContainerContentProcessor writeContainerContentProcessor;
  @Inject private XSKConfigureLibrariesProcessor configureLibrariesProcessor;
  @Inject private XSKDeployContainerContentProcessor deployContainerContentProcessor;

  @Inject
  private XSKGrantPrivilegesContainerSchemaProcessor grantPrivilegesContainerSchemaProcessor;

  @Inject
  private XSKGrantPrivilegesContainerTargetSchemaProcessor
      grantPrivilegesContainerTargetSchemaProcessor;

  public void execute(Connection connection, XSKDataStructureHDIModel hdiModel) {
    logger.info("Start processing HDI Containers...");
    try {
      logger.info(
          "Start processing HDI Container [{0}] from [{1}] ...",
          hdiModel.getContainer(), hdiModel.getLocation());

      // Grant Privileges to Container Group API
      this.grantPrivilegesContainerGroupAPIProcessor.execute(connection, hdiModel.getUsers());

      // Create a Container Group
      this.createContainerGroupProcessor.execute(connection, hdiModel.getGroup());

      // Grant Privileges to the Container Group
      this.grantPrivilegesContainerGroupProcessor.execute(
          connection, hdiModel.getGroup(), hdiModel.getUsers());

      // Create a Container
      this.createContainerProcessor.execute(
          connection, hdiModel.getGroup(), hdiModel.getContainer());

      // Grant Privileges to Container API
      this.grantPrivilegesContainerAPIProcessor.execute(
          connection, hdiModel.getGroup(), hdiModel.getContainer(), hdiModel.getUsers());

      // Write the files content to the Container
      this.writeContainerContentProcessor.execute(
          connection, hdiModel.getContainer(), hdiModel.getDeploy(), hdiModel.getConfiguration());

      // Configure Libraries for the Container
      this.configureLibrariesProcessor.execute(connection, hdiModel.getContainer());

      // Grant Privileges on the Target Schema
      this.grantPrivilegesContainerTargetSchemaProcessor.execute(
          connection, hdiModel.getContainer(), hdiModel.getUsers());

      // Deploy the Content
      this.deployContainerContentProcessor.execute(
          connection, hdiModel.getContainer(), hdiModel.getDeploy(), hdiModel.getUndeploy());

      // Grant Privileges to the Container Schema
      this.grantPrivilegesContainerSchemaProcessor.execute(
          connection, hdiModel.getContainer(), hdiModel.getUsers());

      logger.info(
          "HDI Container [{0}] from [{1}] finished successfully.",
          hdiModel.getContainer(), hdiModel.getLocation());
    } catch (SQLException | IOException | ScriptingException e) {
      logger.error(
          "HDI Container [{0}] from [{1}] failed.\", hdiModel.getContainer(), hdiModel.getLocation()");
      logger.error(e.getMessage(), e);
    }

    logger.info("Done rocessing HDI Containers.");
  }
}
