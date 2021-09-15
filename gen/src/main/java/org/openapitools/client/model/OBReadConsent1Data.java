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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * OBReadConsent1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBReadConsent1Data {
  /**
   * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    READACCOUNTSBASIC("ReadAccountsBasic"),
    
    READACCOUNTSDETAIL("ReadAccountsDetail"),
    
    READBALANCES("ReadBalances"),
    
    READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),
    
    READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),
    
    READDIRECTDEBITS("ReadDirectDebits"),
    
    READOFFERS("ReadOffers"),
    
    READPAN("ReadPAN"),
    
    READPARTY("ReadParty"),
    
    READPARTYPSU("ReadPartyPSU"),
    
    READPRODUCTS("ReadProducts"),
    
    READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),
    
    READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),
    
    READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),
    
    READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),
    
    READSTATEMENTSBASIC("ReadStatementsBasic"),
    
    READSTATEMENTSDETAIL("ReadStatementsDetail"),
    
    READTRANSACTIONSBASIC("ReadTransactionsBasic"),
    
    READTRANSACTIONSCREDITS("ReadTransactionsCredits"),
    
    READTRANSACTIONSDEBITS("ReadTransactionsDebits"),
    
    READTRANSACTIONSDETAIL("ReadTransactionsDetail");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "Permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<PermissionsEnum> permissions = new ArrayList<PermissionsEnum>();

  public static final String SERIALIZED_NAME_EXPIRATION_DATE_TIME = "ExpirationDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE_TIME)
  private OffsetDateTime expirationDateTime;

  public static final String SERIALIZED_NAME_TRANSACTION_FROM_DATE_TIME = "TransactionFromDateTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FROM_DATE_TIME)
  private OffsetDateTime transactionFromDateTime;

  public static final String SERIALIZED_NAME_TRANSACTION_TO_DATE_TIME = "TransactionToDateTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TO_DATE_TIME)
  private OffsetDateTime transactionToDateTime;


  public OBReadConsent1Data permissions(List<PermissionsEnum> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public OBReadConsent1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }


  public OBReadConsent1Data expirationDateTime(OffsetDateTime expirationDateTime) {
    
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }


  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  public OBReadConsent1Data transactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

   /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getTransactionFromDateTime() {
    return transactionFromDateTime;
  }


  public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }


  public OBReadConsent1Data transactionToDateTime(OffsetDateTime transactionToDateTime) {
    
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

   /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getTransactionToDateTime() {
    return transactionToDateTime;
  }


  public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsent1Data obReadConsent1Data = (OBReadConsent1Data) o;
    return Objects.equals(this.permissions, obReadConsent1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsent1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsent1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsent1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1Data {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

