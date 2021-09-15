package io.betterbanking.openbankingapi.transactioncontroller;

import io.betterbanking.openbankingapi.dto.TransactionInformationDTO;
import io.betterbanking.openbankingapi.models.TransactionInformation;
import io.betterbanking.openbankingapi.transactionservice.TransactionService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TransactionComponentTest {
    @LocalServerPort
    private int port;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/transactions/123", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
