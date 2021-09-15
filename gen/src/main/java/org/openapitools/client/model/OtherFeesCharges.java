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
import org.openapitools.client.model.OtherFeesChargesFeeChargeCap;
import org.openapitools.client.model.OtherFeesChargesFeeChargeDetail;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OtherFeesCharges {
  public static final String SERIALIZED_NAME_FEE_CHARGE_DETAIL = "FeeChargeDetail";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_DETAIL)
  private List<OtherFeesChargesFeeChargeDetail> feeChargeDetail = new ArrayList<OtherFeesChargesFeeChargeDetail>();

  public static final String SERIALIZED_NAME_FEE_CHARGE_CAP = "FeeChargeCap";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_CAP)
  private List<OtherFeesChargesFeeChargeCap> feeChargeCap = null;


  public OtherFeesCharges feeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
    
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesCharges addFeeChargeDetailItem(OtherFeesChargesFeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

   /**
   * Other fees/charges details
   * @return feeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "Other fees/charges details")

  public List<OtherFeesChargesFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }


  public void setFeeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }


  public OtherFeesCharges feeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesCharges addFeeChargeCapItem(OtherFeesChargesFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OtherFeesChargesFeeChargeCap>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

   /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")

  public List<OtherFeesChargesFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }


  public void setFeeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesCharges otherFeesCharges = (OtherFeesCharges) o;
    return Objects.equals(this.feeChargeDetail, otherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, otherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeDetail, feeChargeCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges {\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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
