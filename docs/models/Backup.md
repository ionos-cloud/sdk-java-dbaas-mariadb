

# Backup

A backup object.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clusterId** | **String** | The unique ID of the cluster that was backed up. |  [optional] |
| **location** | **String** | The S3 location where the backups will be stored. |  [optional] |
| **earliestRecoveryTargetTime** | [**OffsetDateTime**](OffsetDateTime.md) | The oldest available timestamp to which you can restore. |  [optional] |
| **size** | **Integer** | Size of all base backups in MiB. This is at least the sum of all base backup sizes.  |  [optional] |
| **baseBackups** | [**List&lt;BaseBackup&gt;**](BaseBackup.md) |  |  [optional] |


