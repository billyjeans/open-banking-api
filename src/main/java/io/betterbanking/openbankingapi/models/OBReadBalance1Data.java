package io.betterbanking.openbankingapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadBalance1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class OBReadBalance1Data   {
  @JsonProperty("Balance")
  @Valid
  private List<OBReadBalance1DataBalance> balance = new ArrayList<OBReadBalance1DataBalance>();

  public OBReadBalance1Data balance(List<OBReadBalance1DataBalance> balance) {
    this.balance = balance;
    return this;
  }

  public OBReadBalance1Data addBalanceItem(OBReadBalance1DataBalance balanceItem) {
    this.balance.add(balanceItem);
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadBalance1DataBalance> getBalance() {
    return balance;
  }

  public void setBalance(List<OBReadBalance1DataBalance> balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1Data obReadBalance1Data = (OBReadBalance1Data) o;
    return Objects.equals(this.balance, obReadBalance1Data.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1Data {\n");

    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
