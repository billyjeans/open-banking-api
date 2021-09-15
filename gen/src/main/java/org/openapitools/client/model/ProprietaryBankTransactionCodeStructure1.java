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
 * Set of elements to fully identify a proprietary bank transaction code.
 */
@ApiModel(description = "Set of elements to fully identify a proprietary bank transaction code.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class ProprietaryBankTransactionCodeStructure1 {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ISSUER = "Issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;


  public ProprietaryBankTransactionCodeStructure1 code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
    return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
        Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

