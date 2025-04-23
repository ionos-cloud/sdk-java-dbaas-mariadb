# BackupsApi

All URIs are relative to *https://mariadb.de-txl.ionos.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**backupsFindById**](BackupsApi.md#backupsfindbyid) | **GET** /backups/{backupId} | Fetch backups |
| [**backupsGet**](BackupsApi.md#backupsget) | **GET** /backups | List of backups. |
| [**clusterBackupsGet**](BackupsApi.md#clusterbackupsget) | **GET** /clusters/{clusterId}/backups | List backups of cluster |


<a name="backupsFindById"></a>
# **backupsFindById**
> BackupResponse backupsFindById(backupId)

Fetch backups

Retrieve a MariaDB backup by ID. This value can be found when you GET the list of MariaDB backups. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String backupId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the backup.
    try {
      ApiResponse<BackupResponse> result = apiInstance.backupsFindByIdWithHttpInfo(backupId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#backupsFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backupId** | **String**| The unique ID of the backup. |

### Return type

[**BackupResponse**](../models/BackupResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="backupsGet"></a>
# **backupsGet**
> BackupList backupsGet(limit, offset)

List of backups.

Retrieves all lists of backups for all MariaDB clusters in this contract. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    BackupsApi apiInstance = new BackupsApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<BackupList> result = apiInstance.backupsGetWithHttpInfo(limit, offset, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#backupsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**BackupList**](../models/BackupList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clusterBackupsGet"></a>
# **clusterBackupsGet**
> BackupList clusterBackupsGet(clusterId, limit, offset)

List backups of cluster

Retrieves a list of all backups of the given MariaDB cluster. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.BackupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    BackupsApi apiInstance = new BackupsApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<BackupList> result = apiInstance.clusterBackupsGetWithHttpInfo(clusterId, limit, offset, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupsApi#clusterBackupsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**BackupList**](../models/BackupList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

