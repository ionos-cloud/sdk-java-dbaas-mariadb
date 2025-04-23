

# PatchClusterProperties

Properties of the payload to change a cluster: - instances can only be increased (3, 5, 7), - mariadbVersion can only be increased (no downgrade) - storageSize can only be increased, - ram and cores can be both increased and decreased. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mariadbVersion** | [**MariadbVersion**](MariadbVersion.md) |  |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one primary and n-1 secondary).  |  [optional] |
| **cores** | **Integer** | The number of CPU cores per instance. |  [optional] |
| **ram** | **Integer** | The amount of memory per instance in gigabytes (GB). |  [optional] |
| **storageSize** | **Integer** | The amount of storage per instance in gigabytes (GB). |  [optional] |
| **displayName** | **String** | The friendly name of your cluster. |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |


