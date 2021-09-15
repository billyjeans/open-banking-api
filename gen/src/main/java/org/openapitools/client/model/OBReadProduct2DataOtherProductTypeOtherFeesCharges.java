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
import org.openapitools.client.model.OBReadProduct2DataOtherProductTypeFeeChargeCap;
import org.openapitools.client.model.OBReadProduct2DataOtherProductTypeFeeChargeDetail;
import org.openapitools.client.model.OBReadProduct2DataOtherProductTypeOtherTariffType;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBReadProduct2DataOtherProductTypeOtherFeesCharges {
  /**
   * TariffType which defines the fee and charges.
   */
  @JsonAdapter(TariffTypeEnum.Adapter.class)
  public enum TariffTypeEnum {
    TTEL("TTEL"),
    
    TTMX("TTMX"),
    
    TTOT("TTOT");

    private String value;

    TariffTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TariffTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TariffTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TariffTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TariffTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARIFF_TYPE = "TariffType";
  @SerializedName(SERIALIZED_NAME_TARIFF_TYPE)
  private TariffTypeEnum tariffType;

  public static final String SERIALIZED_NAME_TARIFF_NAME = "TariffName";
  @SerializedName(SERIALIZED_NAME_TARIFF_NAME)
  private String tariffName;

  public static final String SERIALIZED_NAME_OTHER_TARIFF_TYPE = "OtherTariffType";
  @SerializedName(SERIALIZED_NAME_OTHER_TARIFF_TYPE)
  private OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType;

  public static final String SERIALIZED_NAME_FEE_CHARGE_DETAIL = "FeeChargeDetail";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_DETAIL)
  private List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeFeeChargeDetail>();

  public static final String SERIALIZED_NAME_FEE_CHARGE_CAP = "FeeChargeCap";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_CAP)
  private List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap = null;


  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    
    this.tariffType = tariffType;
    return this;
  }

   /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TariffType which defines the fee and charges.")

  public TariffTypeEnum getTariffType() {
    return tariffType;
  }


  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }


  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffName(String tariffName) {
    
    this.tariffName = tariffName;
    return this;
  }

   /**
   * Name of the tariff
   * @return tariffName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the tariff")

  public String getTariffName() {
    return tariffName;
  }


  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }


  public OBReadProduct2DataOtherProductTypeOtherFeesCharges otherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    
    this.otherTariffType = otherTariffType;
    return this;
  }

   /**
   * Get otherTariffType
   * @return otherTariffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataOtherProductTypeOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }


  public void setOtherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }


  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeFeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

   /**
   * Get feeChargeDetail
   * @return feeChargeDetail
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }


  public void setFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }


  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeCapItem(OBReadProduct2DataOtherProductTypeFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeFeeChargeCap>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

   /**
   * Get feeChargeCap
   * @return feeChargeCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBReadProduct2DataOtherProductTypeFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }


  public void setFeeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
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
    OBReadProduct2DataOtherProductTypeOtherFeesCharges obReadProduct2DataOtherProductTypeOtherFeesCharges = (OBReadProduct2DataOtherProductTypeOtherFeesCharges) o;
    return Objects.equals(this.tariffType, obReadProduct2DataOtherProductTypeOtherFeesCharges.tariffType) &&
        Objects.equals(this.tariffName, obReadProduct2DataOtherProductTypeOtherFeesCharges.tariffName) &&
        Objects.equals(this.otherTariffType, obReadProduct2DataOtherProductTypeOtherFeesCharges.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obReadProduct2DataOtherProductTypeOtherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataOtherProductTypeOtherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOtherFeesCharges {\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
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
