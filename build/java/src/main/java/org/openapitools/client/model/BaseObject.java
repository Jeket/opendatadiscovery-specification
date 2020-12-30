/*
 * OpenDataDiscovery API Contract
 * OpenDataDiscovery API Contract
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BaseObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-30T13:37:39.645993+03:00[Europe/Moscow]")
public class BaseObject {
  public static final String SERIALIZED_NAME_ODDRN = "oddrn";
  @SerializedName(SERIALIZED_NAME_ODDRN)
  private String oddrn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public BaseObject oddrn(String oddrn) {
    
    this.oddrn = oddrn;
    return this;
  }

   /**
   * Get oddrn
   * @return oddrn
  **/
  @ApiModelProperty(example = "//aws/glue/{account_id}/{database}/{tablename}", required = true, value = "")

  public String getOddrn() {
    return oddrn;
  }


  public void setOddrn(String oddrn) {
    this.oddrn = oddrn;
  }


  public BaseObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BaseObject owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "//aws/iam/{account_id}/user/name", required = true, value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public BaseObject metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public BaseObject putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseObject baseObject = (BaseObject) o;
    return Objects.equals(this.oddrn, baseObject.oddrn) &&
        Objects.equals(this.name, baseObject.name) &&
        Objects.equals(this.owner, baseObject.owner) &&
        Objects.equals(this.metadata, baseObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oddrn, name, owner, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseObject {\n");
    sb.append("    oddrn: ").append(toIndentedString(oddrn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

