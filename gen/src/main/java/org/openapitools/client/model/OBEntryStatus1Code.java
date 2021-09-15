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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of a transaction entry on the books of the account servicer.
 */
@JsonAdapter(OBEntryStatus1Code.Adapter.class)
public enum OBEntryStatus1Code {
  
  BOOKED("Booked"),
  
  PENDING("Pending");

  private String value;

  OBEntryStatus1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBEntryStatus1Code fromValue(String value) {
    for (OBEntryStatus1Code b : OBEntryStatus1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OBEntryStatus1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final OBEntryStatus1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OBEntryStatus1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OBEntryStatus1Code.fromValue(value);
    }
  }
}
