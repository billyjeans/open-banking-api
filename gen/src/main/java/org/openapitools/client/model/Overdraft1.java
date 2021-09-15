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
import org.openapitools.client.model.Overdraft1OverdraftTierBandSet;

/**
 * Details about Overdraft rates, fees &amp; charges
 */
@ApiModel(description = "Details about Overdraft rates, fees & charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class Overdraft1 {
  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OVERDRAFT_TIER_BAND_SET = "OverdraftTierBandSet";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_TIER_BAND_SET)
  private List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet = new ArrayList<Overdraft1OverdraftTierBandSet>();


  public Overdraft1 notes(List<String> notes) {
    
    this.notes = notes;
    return this;
  }

  public Overdraft1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Associated Notes about the overdraft rates
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated Notes about the overdraft rates")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  public Overdraft1 overdraftTierBandSet(List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet) {
    
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft1 addOverdraftTierBandSetItem(Overdraft1OverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

   /**
   * Tier band set details
   * @return overdraftTierBandSet
  **/
  @ApiModelProperty(required = true, value = "Tier band set details")

  public List<Overdraft1OverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }


  public void setOverdraftTierBandSet(List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft1 overdraft1 = (Overdraft1) o;
    return Objects.equals(this.notes, overdraft1.notes) &&
        Objects.equals(this.overdraftTierBandSet, overdraft1.overdraftTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1 {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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
