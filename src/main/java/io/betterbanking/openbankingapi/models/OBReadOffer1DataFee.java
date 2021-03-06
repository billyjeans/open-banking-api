package io.betterbanking.openbankingapi.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Fee associated with the offer type.
 */
@ApiModel(description = "Fee associated with the offer type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class OBReadOffer1DataFee {
    @JsonProperty("Amount")
    private String amount = null;

    @JsonProperty("Currency")
    private String currency = null;

    public OBReadOffer1DataFee amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

//    @Pattern(regexp = "^\d{1,13}$|^\d{1,13}\.\d{1,5}$")
    @Pattern(regexp="\\d{1,13}$")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBReadOffer1DataFee currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadOffer1DataFee obReadOffer1DataFee = (OBReadOffer1DataFee) o;
        return Objects.equals(this.amount, obReadOffer1DataFee.amount) &&
                Objects.equals(this.currency, obReadOffer1DataFee.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadOffer1DataFee {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
