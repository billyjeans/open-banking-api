package io.betterbanking.openbankingapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the interest that may be payable to the Account holders
 */
@ApiModel(description = "Details about the interest that may be payable to the Account holders")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class OBReadProduct2DataOtherProductTypeCreditInterest   {
  @JsonProperty("TierBandSet")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet>();

  public OBReadProduct2DataOtherProductTypeCreditInterest tierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * Get tierBandSet
   * @return tierBandSet
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeCreditInterest obReadProduct2DataOtherProductTypeCreditInterest = (OBReadProduct2DataOtherProductTypeCreditInterest) o;
    return Objects.equals(this.tierBandSet, obReadProduct2DataOtherProductTypeCreditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterest {\n");

    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
