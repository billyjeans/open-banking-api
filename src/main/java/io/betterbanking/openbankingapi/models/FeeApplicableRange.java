package io.betterbanking.openbankingapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Range or amounts or rates for which the fee/charge applies
 */
@ApiModel(description = "Range or amounts or rates for which the fee/charge applies")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class FeeApplicableRange   {
  @JsonProperty("MinimumAmount")
  private String minimumAmount = null;

  @JsonProperty("MaximumAmount")
  private String maximumAmount = null;

  @JsonProperty("MinimumRate")
  private String minimumRate = null;

  @JsonProperty("MaximumRate")
  private String maximumRate = null;

  public FeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

  /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
  **/
  @ApiModelProperty(value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
  
  @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")   public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public FeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

  /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
  **/
  @ApiModelProperty(value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
  
  @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")   public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public FeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }

  /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
  **/
  @ApiModelProperty(value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
  
  @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")   public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }

  public FeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

  /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
  **/
  @ApiModelProperty(value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
  
  @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")   public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeApplicableRange feeApplicableRange = (FeeApplicableRange) o;
    return Objects.equals(this.minimumAmount, feeApplicableRange.minimumAmount) &&
        Objects.equals(this.maximumAmount, feeApplicableRange.maximumAmount) &&
        Objects.equals(this.minimumRate, feeApplicableRange.minimumRate) &&
        Objects.equals(this.maximumRate, feeApplicableRange.maximumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeApplicableRange {\n");

    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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
