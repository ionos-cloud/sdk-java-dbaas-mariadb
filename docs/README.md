[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk)

## Overview

An enterprise-grade Database is provided as a Service (DBaaS) solution that
can be managed through a browser-based \"Data Center Designer\" (DCD) tool or
via an easy to use API.

The API allows you to create additional MariaDB database clusters or modify existing
ones. It is designed to allow users to leverage the same power and
flexibility found within the DCD visual tool. Both tools are consistent with
their concepts and lend well to making the experience smooth and intuitive.


## Getting Started

### Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud.dbaasmariadb</groupId>
  <artifactId>ionos-cloud-sdk-dbaas-mariadb</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud.dbaasmariadb:ionos-cloud-sdk-dbaas-mariadb:1.0.1"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-dbaas-mariadb-1.0.1.jar`
* `target/lib/*.jar`

## Feature Reference

The ionos-cloud-sdk-dbaas-mariadb SDK for JAVA aims to offer access to all resources in the IONOS Container Registry API and also offers some additional features that make the integration easier:
 - authentication for API calls
 - handling of asynchronous requests

## Authentication

All available server URLs are:

- *https://mariadb.de-txl.ionos.com* - Berlin, Germany
- *https://mariadb.de-fra.ionos.com* - Frankfurt, Germany
- *https://mariadb.es-vit.ionos.com* - Logroño, Spain
- *https://mariadb.fr-par.ionos.com* - Paris, France
- *https://mariadb.gb-lhr.ionos.com* - London, Great Britain
- *https://mariadb.us-ewr.ionos.com* - Newark, USA
- *https://mariadb.us-las.ionos.com* - Las Vegas, USA
- *https://mariadb.us-mci.ionos.com* - Lenexa, USA

By default, *https://mariadb.de-txl.ionos.com* is used, however this can be overriden at authentication by changing
the `basePath` in the default client.

The username and password or the authentication token can be manually specified when initializing
the sdk client:

```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP bearer token authorization:
    ApiKeyAuth apiKeyAuthentication = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
    apiKeyAuthentication.setApiKey("IONOS_TOKEN");

    // OR
    // defaultClient.setApiKey("IONOS_TOKEN");

    // Configure API URL
    defaultClient.setBasePath("IONOS_API_URL");
  }
}

```

## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/com.ionoscloud.dbaasmariadb/issues/new/choose

 - Can I contribute to the Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.
