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
 * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
 */
@JsonAdapter(OBCreditDebitCode2.Adapter.class)
public enum OBCreditDebitCode2 {
  
  CREDIT("Credit"),
  
  DEBIT("Debit");

  private String value;

  OBCreditDebitCode2(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBCreditDebitCode2 fromValue(String value) {
    for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OBCreditDebitCode2> {
    @Override
    public void write(final JsonWriter jsonWriter, final OBCreditDebitCode2 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OBCreditDebitCode2 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OBCreditDebitCode2.fromValue(value);
    }
  }
}
