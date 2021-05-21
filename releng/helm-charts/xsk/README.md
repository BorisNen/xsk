# XSK

[XSK](https://github.com/sap/xsk) is compatible environment for SAP HANA Extended Application Services (XS) based applications outside of SAP HANA instance running in a container deployed on Kubernetes.

## Overview

This chart bootstraps a [XSK](https://github.com/sap/xsk) deployment on a [Kubernetes](http://kubernetes.io) cluster using the [Helm](https://helm.sh) package manager.

#### Prerequisites

- Kubernetes 1.19+
- Helm 3+

#### Setup

Add the XSK chart repository:

```
helm repo add dirigible https://eclipse.github.io/dirigible
helm repo update
```

## Deployment

### Basic:

```
helm install dirigible dirigible/dirigible
```

> _**Note:** This will install XSK **Deployment** and **Service** with **ClusterIP** only._

To access the Dirigible instance execute the command that was printed in the console, similar to this one:

```
export POD_NAME=$(kubectl get pods --namespace default -l "app.kubernetes.io/name=dirigible,app.kubernetes.io/instance=dirigible" -o jsonpath="{.items[0].metadata.name}")
echo "Visit http://127.0.0.1:8080 to use your application"
kubectl --namespace default port-forward $POD_NAME 8080:8080    
```

Navigate to: [http://127.0.0.1:8080](http://127.0.0.1:8080)

Login with: `dirigible`/`dirigible`

### Kyma

#### Basic:

```
helm install dirigible dirigible/dirigible \
--set kyma.enabled=true \
--set kyma.apirule.host=<kyma-host>
```

> _**Note:** This will install additionally an **ApiRule** and **XSUAA** **ServiceInstance** and **ServiceBinding**. The appropriate roles should be assigned to the user._

#### Basic with PostgreSQL:

```
helm install dirigible dirigible/dirigible \
--set kyma.enabled=true \
--set kyma.apirule.host=<kyma-host> \
--set database.enabled=true
```

> _**Note:** This will install also **PostgreSQL** database with **1Gi** storage and update the Dirigible datasource configuration to consume the database._

#### Basic with PostgreSQL and Keycloak:

```
helm install dirigible dirigible/dirigible \
--set kyma.enabled=true \
--set kyma.apirule.host=<kyma-host> \
--set database.enabled=true \
--set keycloak.enabled=true \
--set keycloak.install=true
```

> _**Note:** In addition **Keycloak** will be deployed and configured._

#### Custom Configurations

The deployment configuration can be customized by specifying the customization parameters with the `helm install` command using the `--values` or `--set` arguments. Find more information in the [configuration section](#configuration) of this document.

## Upgrading

Upgrade the chart deployment using:

```
helm upgrade dirigible dirigible/dirigible
```

The command upgrades the existing `dirigible` deployment with the most latest release of the chart.

**TIP**: Use `helm repo update` to update information on available charts in the chart repositories.

## Uninstalling

Uninstall the `dirigible` deployment using:

```
helm uninstall dirigible
```

The command uninstall the release named `dirigible` and frees all the kubernetes resources associated with the release.

## Configuration

The following table lists all the configurable parameters expose by the Dirigible chart and their default values.

#### Generic

|             Name             |          Description            |            Default                 |
|------------------------------|---------------------------------|------------------------------------|
| `dirigible.image`            | Custom Dirigible image          | `""`                               |
| `image.repository`           | Dirigible image repo            | `dirigiblelabs/dirigible-all`      |
| `image.repositoryKyma`       | Dirigible Kyma image repo       | `dirigiblelabs/dirigible-sap-kyma` |
| `image.repositoryKeycloak`   | Dirigible Keycloak image repo   | `dirigiblelabs/dirigible-keycloak` |
| `image.pullPolicy`           | Image pull policy               | `IfNotPresent`                     |
| `service.type`               | Service type                    | `ClusterIP`                        |
| `service.port`               | Service port                    | `8080`                             |
| `replicaCount`               | Number of replicas              | `1`                                |
| `imagePullSecrets`           | Image pull secrets              | `[]`                               |
| `nameOverride`               | Name override                   | `""`                               |
| `fullnameOverride`           | Fullname override               | `""`                               |
| `podSecurityContext`         | Pod security context            | `{}`                               |
| `nodeSelector`               | Node selector                   | `{}`                               |
| `tolerations`                | Tolerations                     | `[]`                               |
| `affinity`                   | Affinity                        | `{}`                               |
| `resources`                  | Resources                       | `{}`                               |

#### Basic

|             Name             |          Description            |            Default                 |
|------------------------------|---------------------------------|------------------------------------|
| `volume.enabled`             | Volume to be mounted            | `true`                             |
| `volume.storage`             | Volume storage size             | `1Gi`                              |
| `database.enabled`           | Database to be deployed         | `false`                            |
| `database.image`             | Database image                  | `postgres:13`                      |
| `database.driver`            | Database JDBC driver            | `org.postgresql.Driver`            |
| `database.storage`           | Database storage size           | `1Gi`                              |
| `database.username`          | Database username               | `dirigible`                        |
| `database.password`          | Database password               | `dirigible`                        |
| `ingress.enabled`            | Ingress to be created           | `false`                            |
| `ingress.annotations`        | Ingress annotations             | `{}`                               |
| `ingress.host`               | Ingress host                    | `""`                               |
| `ingress.tls`                | Ingress tls                     | `false`                            |

#### Kyma

|             Name             |          Description            |            Default                 |
|------------------------------|---------------------------------|------------------------------------|
| `kyma.enabled`               | Kyma environment to be used     | `false`                            |
| `kyma.apirule.enabled`       | Kyma ApiRule to be created      | `true`                             |
| `kyma.apirule.host`          | Kyma host to be used in ApiRule | `""`                               |

#### Keycloak

|             Name             |          Description            |            Default                 |
|------------------------------|---------------------------------|------------------------------------|
| `keycloak.enabled`           | Keycloak environment to be used | `false`                            |
| `keycloak.install`           | Keycloak to be installed        | `false`                            |
| `keycloak.name`              | Keycloak deployment name        | `keycloak`                         |
| `keycloak.image`             | Keycloak image                  | `jboss/keycloak:12.0.4`            |
| `keycloak.username`          | Keycloak username               | `admin`                            |
| `keycloak.password`          | Keycloak password               | `admin`                            |
| `keycloak.replicaCount`      | Keycloak number of replicas     | `1`                                |
| `keycloak.realm`             | Keycloak realm to be set        | `master`                           |
| `keycloak.clientId`          | Keycloak clientId to be used    | `dirigible`                        |
| `keycloak.database.enabled`  | Keycloak database to be used    | `false`                            |
| `keycloak.database.enabled`  | Keycloak database to be used    | `true`                             |
| `keycloak.database.image`    | Keycloak database image         | `postgres:13`                      |
| `keycloak.database.storage`  | Keycloak database storage size  | `1Gi`                              |
| `keycloak.database.username` | Keycloak database username      | `keycloak`                         |
| `keycloak.database.password` | Keycloak database password      | `keycloak`                         |

#### Usage

Specify the parameters you which to customize using the `--set` argument to the `helm install` command. For instance,

```
helm install dirigible dirigible/dirigible --set ingress.enabled=true --set ingress.host=my-ingress-host.com
```

The above command sets the `ingress.host` to `my-ingress-host.com`.

Alternatively, a YAML file that specifies the values for the above parameters can be provided while installing the chart. For example,

```
helm install dirigible dirigible/dirigible --values values.yaml
```

**Tip**: You can use the default **values.yaml**.
