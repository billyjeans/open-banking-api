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

/**
 * ProductDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class ProductDetails1 {
  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
   */
  @JsonAdapter(SegmentEnum.Adapter.class)
  public enum SegmentEnum {
    BASIC("Basic"),
    
    BENEFITANDREWARD("BenefitAndReward"),
    
    CREDITINTEREST("CreditInterest"),
    
    CASHBACK("Cashback"),
    
    GENERAL("General"),
    
    GRADUATE("Graduate"),
    
    OTHER("Other"),
    
    OVERDRAFT("Overdraft"),
    
    PACKAGED("Packaged"),
    
    PREMIUM("Premium"),
    
    REWARD("Reward"),
    
    STUDENT("Student"),
    
    YOUNGADULT("YoungAdult"),
    
    YOUTH("Youth");

    private String value;

    SegmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SegmentEnum fromValue(String value) {
      for (SegmentEnum b : SegmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SegmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SegmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SegmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEGMENT = "Segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private List<SegmentEnum> segment = null;

  public static final String SERIALIZED_NAME_MONTHLY_MAXIMUM_CHARGE = "MonthlyMaximumCharge";
  @SerializedName(SERIALIZED_NAME_MONTHLY_MAXIMUM_CHARGE)
  private String monthlyMaximumCharge;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;


  public ProductDetails1 segment(List<SegmentEnum> segment) {
    
    this.segment = segment;
    return this;
  }

  public ProductDetails1 addSegmentItem(SegmentEnum segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<SegmentEnum>();
    }
    this.segment.add(segmentItem);
    return this;
  }

   /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
   * @return segment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. ")

  public List<SegmentEnum> getSegment() {
    return segment;
  }


  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }


  public ProductDetails1 monthlyMaximumCharge(String monthlyMaximumCharge) {
    
    this.monthlyMaximumCharge = monthlyMaximumCharge;
    return this;
  }

   /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")

  public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }


  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }


  public ProductDetails1 notes(List<String> notes) {
    
    this.notes = notes;
    return this;
  }

  public ProductDetails1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Optional additional notes to supplement the Core product details
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetails1 productDetails1 = (ProductDetails1) o;
    return Objects.equals(this.segment, productDetails1.segment) &&
        Objects.equals(this.monthlyMaximumCharge, productDetails1.monthlyMaximumCharge) &&
        Objects.equals(this.notes, productDetails1.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, monthlyMaximumCharge, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails1 {\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

