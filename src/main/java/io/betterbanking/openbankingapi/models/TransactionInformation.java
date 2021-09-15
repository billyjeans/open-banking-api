package io.betterbanking.openbankingapi.models;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

/**
 * Further details of the transaction.  This is the transaction narrative, which is unstructured text.
 */

@Data
@SuperBuilder
@NoArgsConstructor
@ApiModel(description = "Further details of the transaction.  This is the transaction narrative, which is unstructured text.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
public class TransactionInformation {
    private Date date;
    private String accountNumber;
    private String currency;
    private String merchantNmae;
    private String merchantLogo;
    private ETransactionType eTransactionType;


    public enum ETransactionType {
        WIRE_TRANSFER("WIRE_TRANSFER_TRANSACTION"),
        CREDIT_CARD_TRANSACTTION("CREDIT_CARD_TRANSACTION"),
        E_BILL_PAYMENT_TRANSACTION("E_BILL_TRANSACTION"),
        UNKNOWN("UNKNOWN");
        private String code;

        ETransactionType(String s) {
            this.code = s;
        }

        public static ETransactionType getTransactionType(String code) {
            for (ETransactionType value : ETransactionType.values()) {
                if (value.equals(code)) {
                    return value;
                }
            }
            return UNKNOWN;
        }
    }
}
