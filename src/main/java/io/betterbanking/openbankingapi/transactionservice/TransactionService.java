package io.betterbanking.openbankingapi.transactionservice;


import io.betterbanking.openbankingapi.models.TransactionInformation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {
    public List<TransactionInformation> getAllForAccountNumber(String userName) {
        List<TransactionInformation> transactions= new ArrayList<>();
        TransactionInformation t1 = TransactionInformation.builder().accountNumber("01").eTransactionType(TransactionInformation.ETransactionType.E_BILL_PAYMENT_TRANSACTION).build();
        TransactionInformation t2 = TransactionInformation.builder().accountNumber("02").eTransactionType(TransactionInformation.ETransactionType.E_BILL_PAYMENT_TRANSACTION).build();
        TransactionInformation t3 = TransactionInformation.builder().accountNumber("03").eTransactionType(TransactionInformation.ETransactionType.E_BILL_PAYMENT_TRANSACTION).build();
        TransactionInformation t4 = TransactionInformation.builder().accountNumber("04").eTransactionType(TransactionInformation.ETransactionType.E_BILL_PAYMENT_TRANSACTION).build();
        TransactionInformation t5 = TransactionInformation.builder().accountNumber("05").eTransactionType(TransactionInformation.ETransactionType.E_BILL_PAYMENT_TRANSACTION).build();

        return Arrays.asList(t1,t2,t3,t4,t5);
    }
}
