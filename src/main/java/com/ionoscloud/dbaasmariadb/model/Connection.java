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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about the network connection for your cluster.
 */
@ApiModel(description = "Details about the network connection for your cluster.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:00:03.386012Z[Etc/UTC]")

public class Connection {
  
  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;


  public static final String SERIALIZED_NAME_LAN_ID = "lanId";
  @SerializedName(SERIALIZED_NAME_LAN_ID)
  private String lanId;


  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  

  public Connection datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * The datacenter to connect your cluster to.
   * @return datacenterId
  **/
  @ApiModelProperty(example = "5a029f4a-72e5-11ec-90d6-0242ac120003", required = true, value = "The datacenter to connect your cluster to.")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }



  public Connection lanId(String lanId) {
    
    this.lanId = lanId;
    return this;
  }

   /**
   * The numeric LAN ID to connect your cluster to.
   * @return lanId
  **/
  @ApiModelProperty(example = "2", required = true, value = "The numeric LAN ID to connect your cluster to.")

  public String getLanId() {
    return lanId;
  }


  public void setLanId(String lanId) {
    this.lanId = lanId;
  }



  public Connection cidr(String cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * The IP and subnet for your cluster. Note the following unavailable IP ranges: 10.233.64.0/18 10.233.0.0/18 10.233.114.0/24 
   * @return cidr
  **/
  @ApiModelProperty(example = "192.168.1.100/24", required = true, value = "The IP and subnet for your cluster. Note the following unavailable IP ranges: 10.233.64.0/18 10.233.0.0/18 10.233.114.0/24 ")

  public String getCidr() {
    return cidr;
  }


  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.datacenterId, connection.datacenterId) && Objects.equals(this.lanId, connection.lanId) && Objects.equals(this.cidr, connection.cidr);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");

    sb.append("    lanId: ").append(toIndentedString(lanId)).append("\n");

    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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

