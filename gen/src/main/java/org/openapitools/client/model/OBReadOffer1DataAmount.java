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
 * Amount of money associated with the offer type.
 */
@ApiModel(description = "Amount of money associated with the offer type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBReadOffer1DataAmount {
  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;


  public OBReadOffer1DataAmount amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public OBReadOffer1DataAmount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1DataAmount obReadOffer1DataAmount = (OBReadOffer1DataAmount) o;
    return Objects.equals(this.amount, obReadOffer1DataAmount.amount) &&
        Objects.equals(this.currency, obReadOffer1DataAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1DataAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

