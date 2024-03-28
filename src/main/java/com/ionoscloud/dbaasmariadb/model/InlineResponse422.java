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
import com.ionoscloud.dbaasmariadb.model.ErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse422
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:00:03.386012Z[Etc/UTC]")

public class InlineResponse422 {
  
  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private Integer httpStatus;


  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ErrorMessage> messages = new ArrayList<ErrorMessage>();

  

  public InlineResponse422 httpStatus(Integer httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * The HTTP status code of the operation.
   * @return httpStatus
  **/
  @ApiModelProperty(example = "422", required = true, value = "The HTTP status code of the operation.")

  public Integer getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }



  public InlineResponse422 messages(List<ErrorMessage> messages) {
    
    this.messages = messages;
    return this;
  }

  public InlineResponse422 addMessagesItem(ErrorMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ErrorMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<ErrorMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse422 inlineResponse422 = (InlineResponse422) o;
    return Objects.equals(this.httpStatus, inlineResponse422.httpStatus) && Objects.equals(this.messages, inlineResponse422.messages);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse422 {\n");
    
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");

    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
