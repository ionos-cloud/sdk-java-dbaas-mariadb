

# CreateClusterProperties

Properties with all data needed to create a new MariaDB cluster. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mariadbVersion** | [**MariadbVersion**](MariadbVersion.md) |  |  |
| **instances** | **Integer** | The total number of instances in the cluster (one primary and n-1 secondary).  |  |
| **cores** | **Integer** | The number of CPU cores per instance. |  |
| **ram** | **Integer** | The amount of memory per instance in gigabytes (GB). |  |
| **storageSize** | **Integer** | The amount of storage per instance in gigabytes (GB). |  |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) | The network connection for your cluster. Only one connection is allowed.  |  |
| **displayName** | **String** | The friendly name of your cluster. |  |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **backup** | [**BackupProperties**](BackupProperties.md) |  |  [optional] |
| **credentials** | [**DBUser**](DBUser.md) |  |  |
| **fromBackup** | [**RestoreRequest**](RestoreRequest.md) |  |  [optional] |


