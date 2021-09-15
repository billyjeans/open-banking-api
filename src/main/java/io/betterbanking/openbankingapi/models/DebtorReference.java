package io.betterbanking.openbankingapi.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

/**
 * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
 */
@ApiModel(description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class DebtorReference   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtorReference {\n");

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
