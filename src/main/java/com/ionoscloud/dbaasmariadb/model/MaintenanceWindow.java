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
import com.ionoscloud.dbaasmariadb.model.DayOfTheWeek;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A weekly 4 hour-long window, during which maintenance might occur. 
 */
@ApiModel(description = "A weekly 4 hour-long window, during which maintenance might occur. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-23T11:48:32.695886Z[Etc/UTC]")

public class MaintenanceWindow {
  
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;


  public static final String SERIALIZED_NAME_DAY_OF_THE_WEEK = "dayOfTheWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_THE_WEEK)
  private DayOfTheWeek dayOfTheWeek;

  

  public MaintenanceWindow time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Start of the maintenance window in UTC time.
   * @return time
  **/
  @ApiModelProperty(example = "16:30:59", required = true, value = "Start of the maintenance window in UTC time.")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }



  public MaintenanceWindow dayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
    
    this.dayOfTheWeek = dayOfTheWeek;
    return this;
  }

   /**
   * Get dayOfTheWeek
   * @return dayOfTheWeek
  **/
  @ApiModelProperty(required = true, value = "")

  public DayOfTheWeek getDayOfTheWeek() {
    return dayOfTheWeek;
  }


  public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
    this.dayOfTheWeek = dayOfTheWeek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindow maintenanceWindow = (MaintenanceWindow) o;
    return Objects.equals(this.time, maintenanceWindow.time) && Objects.equals(this.dayOfTheWeek, maintenanceWindow.dayOfTheWeek);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindow {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");

    sb.append("    dayOfTheWeek: ").append(toIndentedString(dayOfTheWeek)).append("\n");
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

