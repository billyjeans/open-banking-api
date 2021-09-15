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
 * Set of elements to describe the card instrument used in the transaction.
 */
@ApiModel(description = "Set of elements to describe the card instrument used in the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBTransactionCardInstrument1 {
  /**
   * Name of the card scheme.
   */
  @JsonAdapter(CardSchemeNameEnum.Adapter.class)
  public enum CardSchemeNameEnum {
    AMERICANEXPRESS("AmericanExpress"),
    
    DINERS("Diners"),
    
    DISCOVER("Discover"),
    
    MASTERCARD("MasterCard"),
    
    VISA("VISA");

    private String value;

    CardSchemeNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardSchemeNameEnum fromValue(String value) {
      for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CardSchemeNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardSchemeNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardSchemeNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardSchemeNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_SCHEME_NAME = "CardSchemeName";
  @SerializedName(SERIALIZED_NAME_CARD_SCHEME_NAME)
  private CardSchemeNameEnum cardSchemeName;

  /**
   * The card authorisation type.
   */
  @JsonAdapter(AuthorisationTypeEnum.Adapter.class)
  public enum AuthorisationTypeEnum {
    CONSUMERDEVICE("ConsumerDevice"),
    
    CONTACTLESS("Contactless"),
    
    NONE("None"),
    
    PIN("PIN");

    private String value;

    AuthorisationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorisationTypeEnum fromValue(String value) {
      for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthorisationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorisationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorisationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorisationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHORISATION_TYPE = "AuthorisationType";
  @SerializedName(SERIALIZED_NAME_AUTHORISATION_TYPE)
  private AuthorisationTypeEnum authorisationType;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDENTIFICATION = "Identification";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION)
  private String identification;


  public OBTransactionCardInstrument1 cardSchemeName(CardSchemeNameEnum cardSchemeName) {
    
    this.cardSchemeName = cardSchemeName;
    return this;
  }

   /**
   * Name of the card scheme.
   * @return cardSchemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the card scheme.")

  public CardSchemeNameEnum getCardSchemeName() {
    return cardSchemeName;
  }


  public void setCardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }


  public OBTransactionCardInstrument1 authorisationType(AuthorisationTypeEnum authorisationType) {
    
    this.authorisationType = authorisationType;
    return this;
  }

   /**
   * The card authorisation type.
   * @return authorisationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The card authorisation type.")

  public AuthorisationTypeEnum getAuthorisationType() {
    return authorisationType;
  }


  public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
  }


  public OBTransactionCardInstrument1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the cardholder using the card instrument.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the cardholder using the card instrument.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OBTransactionCardInstrument1 identification(String identification) {
    
    this.identification = identification;
    return this;
  }

   /**
   * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
   * @return identification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.")

  public String getIdentification() {
    return identification;
  }


  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransactionCardInstrument1 obTransactionCardInstrument1 = (OBTransactionCardInstrument1) o;
    return Objects.equals(this.cardSchemeName, obTransactionCardInstrument1.cardSchemeName) &&
        Objects.equals(this.authorisationType, obTransactionCardInstrument1.authorisationType) &&
        Objects.equals(this.name, obTransactionCardInstrument1.name) &&
        Objects.equals(this.identification, obTransactionCardInstrument1.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSchemeName, authorisationType, name, identification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCardInstrument1 {\n");
    sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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
