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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The MariaDB version of your cluster.
 */
@JsonAdapter(MariadbVersion.Adapter.class)
public enum MariadbVersion {
  
  _6("10.6"),
  
  _11("10.11");

  private String value;

  MariadbVersion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MariadbVersion fromValue(String value) {
    for (MariadbVersion b : MariadbVersion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MariadbVersion> {
    @Override
    public void write(final JsonWriter jsonWriter, final MariadbVersion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MariadbVersion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MariadbVersion.fromValue(value);
    }
  }
}

