/*
 * IONOS DBaaS MariaDB REST API
 * An enterprise-grade Database is provided as a Service (DBaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.  The API allows you to create additional MariaDB database clusters or modify existing ones. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive. 
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.dbaasmariadb;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:00:03.386012Z[Etc/UTC]")
public class Configuration {
    public static final String IONOS_USERNAME_ENV_VAR = "IONOS_USERNAME";
    public static final String IONOS_PASSWORD_ENV_VAR = "IONOS_PASSWORD";
    public static final String IONOS_TOKEN_ENV_VAR    = "IONOS_TOKEN";
    public static final String IONOS_API_URL_ENV_VAR  = "IONOS_API_URL";

    public static final String DEFAULT_IONOS_SERVER_URL = "https://mariadb.de-txl.ionos.com";
    public static final String DEFAULT_IONOS_BASE_PATH  = "";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
