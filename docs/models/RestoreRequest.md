

# RestoreRequest

Request payload to restore a cluster from a backup. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **backupId** | **String** | The unique ID of the resource. |  |
| **recoveryTargetTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp to which the cluster should be restored. If empty, the backup will be applied to the latest timestamp.  This value must be supplied as ISO 8601 timestamp, the backup will be replayed up until the given timestamp. If empty, the backup will be applied completely.  Must be within the earliestRecoveryTargetTime and now.  The earliestRecoveryTargetTime can be looked up in the backup object.  |  [optional] |


