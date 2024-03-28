

# ClusterProperties

Properties of a database cluster.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | The friendly name of your cluster. |  [optional] |
| **mariadbVersion** | [**MariadbVersion**](MariadbVersion.md) |  |  [optional] |
| **dnsName** | **String** | The DNS name pointing to your cluster. |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one primary and n-1 secondary).  |  [optional] |
| **ram** | **Integer** | The amount of memory per instance in gigabytes (GB). |  [optional] |
| **cores** | **Integer** | The number of CPU cores per instance. |  [optional] |
| **storageSize** | **Integer** | The amount of storage per instance in gigabytes (GB). |  [optional] |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |


