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
import org.openapitools.client.model.OBExternalPartyType1Code;
import org.openapitools.client.model.OBParty2Address;
import org.openapitools.client.model.OBPartyRelationships1;

/**
 * OBParty2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-29T19:18:25.258264300+02:00[Europe/Berlin]")
public class OBParty2 {
  public static final String SERIALIZED_NAME_PARTY_ID = "PartyId";
  @SerializedName(SERIALIZED_NAME_PARTY_ID)
  private String partyId;

  public static final String SERIALIZED_NAME_PARTY_NUMBER = "PartyNumber";
  @SerializedName(SERIALIZED_NAME_PARTY_NUMBER)
  private String partyNumber;

  public static final String SERIALIZED_NAME_PARTY_TYPE = "PartyType";
  @SerializedName(SERIALIZED_NAME_PARTY_TYPE)
  private OBExternalPartyType1Code partyType;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FULL_LEGAL_NAME = "FullLegalName";
  @SerializedName(SERIALIZED_NAME_FULL_LEGAL_NAME)
  private String fullLegalName;

  public static final String SERIALIZED_NAME_LEGAL_STRUCTURE = "LegalStructure";
  @SerializedName(SERIALIZED_NAME_LEGAL_STRUCTURE)
  private String legalStructure;

  public static final String SERIALIZED_NAME_BENEFICIAL_OWNERSHIP = "BeneficialOwnership";
  @SerializedName(SERIALIZED_NAME_BENEFICIAL_OWNERSHIP)
  private Boolean beneficialOwnership;

  public static final String SERIALIZED_NAME_ACCOUNT_ROLE = "AccountRole";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ROLE)
  private String accountRole;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_MOBILE = "Mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "Relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private OBPartyRelationships1 relationships;

  public static final String SERIALIZED_NAME_ADDRESS = "Address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private List<OBParty2Address> address = null;


  public OBParty2 partyId(String partyId) {
    
    this.partyId = partyId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
   * @return partyId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")

  public String getPartyId() {
    return partyId;
  }


  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }


  public OBParty2 partyNumber(String partyNumber) {
    
    this.partyNumber = partyNumber;
    return this;
  }

   /**
   * Number assigned by an agent to identify its customer.
   * @return partyNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number assigned by an agent to identify its customer.")

  public String getPartyNumber() {
    return partyNumber;
  }


  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }


  public OBParty2 partyType(OBExternalPartyType1Code partyType) {
    
    this.partyType = partyType;
    return this;
  }

   /**
   * Get partyType
   * @return partyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBExternalPartyType1Code getPartyType() {
    return partyType;
  }


  public void setPartyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
  }


  public OBParty2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OBParty2 fullLegalName(String fullLegalName) {
    
    this.fullLegalName = fullLegalName;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 350 characters.
   * @return fullLegalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a character string with a maximum length of 350 characters.")

  public String getFullLegalName() {
    return fullLegalName;
  }


  public void setFullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
  }


  public OBParty2 legalStructure(String legalStructure) {
    
    this.legalStructure = legalStructure;
    return this;
  }

   /**
   * Legal standing of the party.
   * @return legalStructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legal standing of the party.")

  public String getLegalStructure() {
    return legalStructure;
  }


  public void setLegalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
  }


  public OBParty2 beneficialOwnership(Boolean beneficialOwnership) {
    
    this.beneficialOwnership = beneficialOwnership;
    return this;
  }

   /**
   * Get beneficialOwnership
   * @return beneficialOwnership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBeneficialOwnership() {
    return beneficialOwnership;
  }


  public void setBeneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
  }


  public OBParty2 accountRole(String accountRole) {
    
    this.accountRole = accountRole;
    return this;
  }

   /**
   * A party’s role with respect to the related account.
   * @return accountRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A party’s role with respect to the related account.")

  public String getAccountRole() {
    return accountRole;
  }


  public void setAccountRole(String accountRole) {
    this.accountRole = accountRole;
  }


  public OBParty2 emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Address for electronic mail (e-mail).
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address for electronic mail (e-mail).")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public OBParty2 phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Collection of information that identifies a phone number, as defined by telecom services.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of information that identifies a phone number, as defined by telecom services.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public OBParty2 mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Collection of information that identifies a mobile phone number, as defined by telecom services.
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of information that identifies a mobile phone number, as defined by telecom services.")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public OBParty2 relationships(OBPartyRelationships1 relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBPartyRelationships1 getRelationships() {
    return relationships;
  }


  public void setRelationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
  }


  public OBParty2 address(List<OBParty2Address> address) {
    
    this.address = address;
    return this;
  }

  public OBParty2 addAddressItem(OBParty2Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<OBParty2Address>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBParty2Address> getAddress() {
    return address;
  }


  public void setAddress(List<OBParty2Address> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty2 obParty2 = (OBParty2) o;
    return Objects.equals(this.partyId, obParty2.partyId) &&
        Objects.equals(this.partyNumber, obParty2.partyNumber) &&
        Objects.equals(this.partyType, obParty2.partyType) &&
        Objects.equals(this.name, obParty2.name) &&
        Objects.equals(this.fullLegalName, obParty2.fullLegalName) &&
        Objects.equals(this.legalStructure, obParty2.legalStructure) &&
        Objects.equals(this.beneficialOwnership, obParty2.beneficialOwnership) &&
        Objects.equals(this.accountRole, obParty2.accountRole) &&
        Objects.equals(this.emailAddress, obParty2.emailAddress) &&
        Objects.equals(this.phone, obParty2.phone) &&
        Objects.equals(this.mobile, obParty2.mobile) &&
        Objects.equals(this.relationships, obParty2.relationships) &&
        Objects.equals(this.address, obParty2.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, partyNumber, partyType, name, fullLegalName, legalStructure, beneficialOwnership, accountRole, emailAddress, phone, mobile, relationships, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2 {\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullLegalName: ").append(toIndentedString(fullLegalName)).append("\n");
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    beneficialOwnership: ").append(toIndentedString(beneficialOwnership)).append("\n");
    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
