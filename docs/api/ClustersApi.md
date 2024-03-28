# ClustersApi

All URIs are relative to *https://mariadb.de-txl.ionos.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersDelete**](ClustersApi.md#clustersdelete) | **DELETE** /clusters/{clusterId} | Delete a cluster |
| [**clustersFindById**](ClustersApi.md#clustersfindbyid) | **GET** /clusters/{clusterId} | Fetch a cluster |
| [**clustersGet**](ClustersApi.md#clustersget) | **GET** /clusters | List clusters |
| [**clustersPost**](ClustersApi.md#clusterspost) | **POST** /clusters | Create a cluster |


<a name="clustersDelete"></a>
# **clustersDelete**
> ClusterResponse clustersDelete(clusterId)

Delete a cluster

Delete a MariaDB cluster.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    try {
      ApiResponse<ClusterResponse> result = apiInstance.clustersDeleteWithHttpInfo(clusterId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersDelete");
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

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersFindById"></a>
# **clustersFindById**
> ClusterResponse clustersFindById(clusterId)

Fetch a cluster

You can retrieve a MariaDB cluster by using its ID. This value can be found in the response body when a MariaDB cluster is created or when you GET a list of MariaDB clusters. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ClustersApi apiInstance = new ClustersApi(defaultClient);
    String clusterId = "498ae72f-411f-11eb-9d07-046c59cc737e"; // String | The unique ID of the cluster.
    try {
      ApiResponse<ClusterResponse> result = apiInstance.clustersFindByIdWithHttpInfo(clusterId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersFindById");
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

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersGet"></a>
# **clustersGet**
> ClusterList clustersGet(limit, offset, filterName)

List clusters

Retrieves a list of MariaDB clusters.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ClustersApi apiInstance = new ClustersApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    String filterName = "filterName_example"; // String | Response filter to list only the MariaDB clusters that contain the specified name. The value is case insensitive and matched on the 'displayName' field. 
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<ClusterList> result = apiInstance.clustersGetWithHttpInfo(limit, offset, filterName, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersGet");
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
| **filterName** | **String**| Response filter to list only the MariaDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  | [optional]

### Return type

[**ClusterList**](../models/ClusterList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersPost"></a>
# **clustersPost**
> ClusterResponse clustersPost(createClusterRequest)

Create a cluster

Creates a new MariaDB cluster. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmariadb.ApiClient;
import com.ionoscloud.dbaasmariadb.ApiException;
import com.ionoscloud.dbaasmariadb.ApiResponse;
import com.ionoscloud.dbaasmariadb.Configuration;
import com.ionoscloud.dbaasmariadb.auth.*;
import com.ionoscloud.dbaasmariadb.model.*;
import com.ionoscloud.dbaasmariadb.api.ClustersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ClustersApi apiInstance = new ClustersApi(defaultClient);
    CreateClusterRequest createClusterRequest = new CreateClusterRequest(); // CreateClusterRequest | The cluster to be created.
    try {
      ApiResponse<ClusterResponse> result = apiInstance.clustersPostWithHttpInfo(createClusterRequest);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#clustersPost");
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
| **createClusterRequest** |  [**CreateClusterRequest**](../models/CreateClusterRequest.md)| The cluster to be created. |

### Return type

[**ClusterResponse**](../models/ClusterResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

