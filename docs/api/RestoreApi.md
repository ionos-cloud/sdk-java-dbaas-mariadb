# RestoreApi

All URIs are relative to *https://mariadb.de-txl.ionos.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersRestore**](RestoreApi.md#clustersrestore) | **POST** /clusters/{clusterId}/restore | In-place restore of a cluster. |


<a name="clustersRestore"></a>
# **clustersRestore**
> clustersRestore(clusterId, restoreRequest)

In-place restore of a cluster.

Restore a MariaDB cluster from a backup.  Conditions:  - The backup must belong to the MariaDB cluster to    be restored.  - The cluster must be in the state \&quot;AVAILABLE\&quot;.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.RestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RestoreApi apiInstance = new RestoreApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    RestoreRequest restoreRequest = new RestoreRequest(); // RestoreRequest | The backup to restore from.
    try {
      apiInstance.clustersRestoreWithHttpInfo(clusterId, restoreRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestoreApi#clustersRestore");
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
| **restoreRequest** |  [**RestoreRequest**](../models/RestoreRequest.md)| The backup to restore from. |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

