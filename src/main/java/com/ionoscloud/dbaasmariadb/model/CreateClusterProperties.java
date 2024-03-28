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


package com.ionoscloud.dbaasmariadb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.dbaasmariadb.model.Connection;
import com.ionoscloud.dbaasmariadb.model.DBUser;
import com.ionoscloud.dbaasmariadb.model.MaintenanceWindow;
import com.ionoscloud.dbaasmariadb.model.MariadbVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Properties with all data needed to create a new MariaDB cluster. 
 */
@ApiModel(description = "Properties with all data needed to create a new MariaDB cluster. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:00:03.386012Z[Etc/UTC]")

public class CreateClusterProperties {
  
  public static final String SERIALIZED_NAME_MARIADB_VERSION = "mariadbVersion";
  @SerializedName(SERIALIZED_NAME_MARIADB_VERSION)
  private MariadbVersion mariadbVersion;


  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private Integer instances;


  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;


  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;


  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private List<Connection> connections = new ArrayList<Connection>();


  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private MaintenanceWindow maintenanceWindow;


  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private DBUser credentials;

  

  public CreateClusterProperties mariadbVersion(MariadbVersion mariadbVersion) {
    
    this.mariadbVersion = mariadbVersion;
    return this;
  }

   /**
   * Get mariadbVersion
   * @return mariadbVersion
  **/
  @ApiModelProperty(required = true, value = "")

  public MariadbVersion getMariadbVersion() {
    return mariadbVersion;
  }


  public void setMariadbVersion(MariadbVersion mariadbVersion) {
    this.mariadbVersion = mariadbVersion;
  }



  public CreateClusterProperties instances(Integer instances) {
    
    this.instances = instances;
    return this;
  }

   /**
   * The total number of instances in the cluster (one primary and n-1 secondary). 
   * minimum: 1
   * maximum: 5
   * @return instances
  **/
  @ApiModelProperty(example = "3", required = true, value = "The total number of instances in the cluster (one primary and n-1 secondary). ")

  public Integer getInstances() {
    return instances;
  }


  public void setInstances(Integer instances) {
    this.instances = instances;
  }



  public CreateClusterProperties cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The number of CPU cores per instance.
   * minimum: 1
   * @return cores
  **/
  @ApiModelProperty(example = "4", required = true, value = "The number of CPU cores per instance.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }



  public CreateClusterProperties ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The amount of memory per instance in gigabytes (GB).
   * minimum: 4
   * @return ram
  **/
  @ApiModelProperty(example = "4", required = true, value = "The amount of memory per instance in gigabytes (GB).")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }



  public CreateClusterProperties storageSize(Integer storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The amount of storage per instance in gigabytes (GB).
   * minimum: 10
   * maximum: 2000
   * @return storageSize
  **/
  @ApiModelProperty(example = "10", required = true, value = "The amount of storage per instance in gigabytes (GB).")

  public Integer getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }



  public CreateClusterProperties connections(List<Connection> connections) {
    
    this.connections = connections;
    return this;
  }

  public CreateClusterProperties addConnectionsItem(Connection connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * The network connection for your cluster. Only one connection is allowed. 
   * @return connections
  **/
  @ApiModelProperty(required = true, value = "The network connection for your cluster. Only one connection is allowed. ")

  public List<Connection> getConnections() {
    return connections;
  }


  public void setConnections(List<Connection> connections) {
    this.connections = connections;
  }



  public CreateClusterProperties displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The friendly name of your cluster.
   * @return displayName
  **/
  @ApiModelProperty(example = "MariaDB cluster", required = true, value = "The friendly name of your cluster.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }



  public CreateClusterProperties maintenanceWindow(MaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }



  public CreateClusterProperties credentials(DBUser credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(required = true, value = "")

  public DBUser getCredentials() {
    return credentials;
  }


  public void setCredentials(DBUser credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterProperties createClusterProperties = (CreateClusterProperties) o;
    return Objects.equals(this.mariadbVersion, createClusterProperties.mariadbVersion) && Objects.equals(this.instances, createClusterProperties.instances) && Objects.equals(this.cores, createClusterProperties.cores) && Objects.equals(this.ram, createClusterProperties.ram) && Objects.equals(this.storageSize, createClusterProperties.storageSize) && Objects.equals(this.connections, createClusterProperties.connections) && Objects.equals(this.displayName, createClusterProperties.displayName) && Objects.equals(this.maintenanceWindow, createClusterProperties.maintenanceWindow) && Objects.equals(this.credentials, createClusterProperties.credentials);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterProperties {\n");
    
    sb.append("    mariadbVersion: ").append(toIndentedString(mariadbVersion)).append("\n");

    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");

    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");

    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");

    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");

    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");

    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
