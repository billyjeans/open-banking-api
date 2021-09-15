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
import org.openapitools.client.model.OBAccount4Account;
import org.openapitools.client.model.OBAccountStatus1Code;
import org.openapitools.client.model.OBBranchAndFinancialInstitutionIdentification50;
import org.openapitools.client.model.OBExternalAccountSubType1Code;
import org.openapitools.client.model.OBExternalAccountType1Code;
import org.threeten.bp.OffsetDateTime;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBAccount4Detail {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OBAccountStatus1Code status;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME = "StatusUpdateDateTime";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "AccountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private OBExternalAccountType1Code accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_SUB_TYPE = "AccountSubType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUB_TYPE)
  private OBExternalAccountSubType1Code accountSubType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NICKNAME = "Nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_ACCOUNT = "Account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private List<OBAccount4Account> account = new ArrayList<OBAccount4Account>();

  public static final String SERIALIZED_NAME_SERVICER = "Servicer";
  @SerializedName(SERIALIZED_NAME_SERVICER)
  private OBBranchAndFinancialInstitutionIdentification50 servicer;


  public OBAccount4Detail accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public OBAccount4Detail status(OBAccountStatus1Code status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBAccountStatus1Code getStatus() {
    return status;
  }


  public void setStatus(OBAccountStatus1Code status) {
    this.status = status;
  }


  public OBAccount4Detail statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

   /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }


  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }


  public OBAccount4Detail currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public OBAccount4Detail accountType(OBExternalAccountType1Code accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")

  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }


  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }


  public OBAccount4Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    
    this.accountSubType = accountSubType;
    return this;
  }

   /**
   * Get accountSubType
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "")

  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }


  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }


  public OBAccount4Detail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the description of the account type.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the description of the account type.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public OBAccount4Detail nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public OBAccount4Detail account(List<OBAccount4Account> account) {
    
    this.account = account;
    return this;
  }

  public OBAccount4Detail addAccountItem(OBAccount4Account accountItem) {
    this.account.add(accountItem);
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OBAccount4Account> getAccount() {
    return account;
  }


  public void setAccount(List<OBAccount4Account> account) {
    this.account = account;
  }


  public OBAccount4Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    
    this.servicer = servicer;
    return this;
  }

   /**
   * Get servicer
   * @return servicer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }


  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount4Detail obAccount4Detail = (OBAccount4Detail) o;
    return Objects.equals(this.accountId, obAccount4Detail.accountId) &&
        Objects.equals(this.status, obAccount4Detail.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount4Detail.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount4Detail.currency) &&
        Objects.equals(this.accountType, obAccount4Detail.accountType) &&
        Objects.equals(this.accountSubType, obAccount4Detail.accountSubType) &&
        Objects.equals(this.description, obAccount4Detail.description) &&
        Objects.equals(this.nickname, obAccount4Detail.nickname) &&
        Objects.equals(this.account, obAccount4Detail.account) &&
        Objects.equals(this.servicer, obAccount4Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, account, servicer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount4Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

