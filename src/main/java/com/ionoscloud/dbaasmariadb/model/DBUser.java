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
 * Credentials for the database user to be created.
 */
@ApiModel(description = "Credentials for the database user to be created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-23T11:48:32.695886Z[Etc/UTC]")

public class DBUser {
  
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  

  public DBUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username for the initial MariaDB user. Some system usernames are restricted (e.g. \&quot;mariadb\&quot;, \&quot;admin\&quot;, \&quot;standby\&quot;).  The username should be compliant with the following rules: - Must not exceed 16 characters - Must start with a letter - Must contain only letters, numbers, or underscores 
   * @return username
  **/
  @ApiModelProperty(example = "cluster_admin", required = true, value = "The username for the initial MariaDB user. Some system usernames are restricted (e.g. \"mariadb\", \"admin\", \"standby\").  The username should be compliant with the following rules: - Must not exceed 16 characters - Must start with a letter - Must contain only letters, numbers, or underscores ")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  public DBUser password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password for a MariaDB user.
   * @return password
  **/
  @ApiModelProperty(example = "my-t0p-secret-password", required = true, value = "The password for a MariaDB user.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBUser dbUser = (DBUser) o;
    return Objects.equals(this.username, dbUser.username) && Objects.equals(this.password, dbUser.password);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBUser {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");

    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

