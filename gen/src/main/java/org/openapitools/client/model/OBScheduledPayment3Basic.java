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
import org.openapitools.client.model.OBActiveOrHistoricCurrencyAndAmount1;
import org.openapitools.client.model.OBExternalScheduleType1Code;
import org.threeten.bp.OffsetDateTime;

/**
 * OBScheduledPayment3Basic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBScheduledPayment3Basic {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_ID = "ScheduledPaymentId";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_ID)
  private String scheduledPaymentId;

  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_DATE_TIME = "ScheduledPaymentDateTime";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_DATE_TIME)
  private OffsetDateTime scheduledPaymentDateTime;

  public static final String SERIALIZED_NAME_SCHEDULED_TYPE = "ScheduledType";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TYPE)
  private OBExternalScheduleType1Code scheduledType;

  public static final String SERIALIZED_NAME_REFERENCE = "Reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_DEBTOR_REFERENCE = "DebtorReference";
  @SerializedName(SERIALIZED_NAME_DEBTOR_REFERENCE)
  private String debtorReference;

  public static final String SERIALIZED_NAME_INSTRUCTED_AMOUNT = "InstructedAmount";
  @SerializedName(SERIALIZED_NAME_INSTRUCTED_AMOUNT)
  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;


  public OBScheduledPayment3Basic accountId(String accountId) {
    
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


  public OBScheduledPayment3Basic scheduledPaymentId(String scheduledPaymentId) {
    
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")

  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }


  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }


  public OBScheduledPayment3Basic scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

   /**
   * The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }


  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }


  public OBScheduledPayment3Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
    
    this.scheduledType = scheduledType;
    return this;
  }

   /**
   * Get scheduledType
   * @return scheduledType
  **/
  @ApiModelProperty(required = true, value = "")

  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }


  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }


  public OBScheduledPayment3Basic reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public OBScheduledPayment3Basic debtorReference(String debtorReference) {
    
    this.debtorReference = debtorReference;
    return this;
  }

   /**
   * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
   * @return debtorReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.")

  public String getDebtorReference() {
    return debtorReference;
  }


  public void setDebtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
  }


  public OBScheduledPayment3Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }


  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment3Basic obScheduledPayment3Basic = (OBScheduledPayment3Basic) o;
    return Objects.equals(this.accountId, obScheduledPayment3Basic.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3Basic.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Basic.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3Basic.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3Basic.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3Basic.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3Basic.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

