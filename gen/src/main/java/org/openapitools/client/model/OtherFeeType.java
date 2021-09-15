/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * The version of the OpenAPI document: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
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

/**
 * Other Fee type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee type which is not available in the standard code set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OtherFeeType {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public OtherFeeType code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public OtherFeeType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Long name associated with the code
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Long name associated with the code")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OtherFeeType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeeType otherFeeType = (OtherFeeType) o;
    return Objects.equals(this.code, otherFeeType.code) &&
        Objects.equals(this.name, otherFeeType.name) &&
        Objects.equals(this.description, otherFeeType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeeType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

