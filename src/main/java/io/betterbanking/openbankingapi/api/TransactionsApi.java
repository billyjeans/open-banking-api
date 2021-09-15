/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.betterbanking.openbankingapi.api;

import io.betterbanking.openbankingapi.models.OBErrorResponse1;
import io.betterbanking.openbankingapi.models.OBReadTransaction6;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
@Api(value = "transactions", description = "the transactions API")
public interface TransactionsApi {

    @ApiOperation(value = "Get Transactions", nickname = "getTransactions", notes = "", response = OBReadTransaction6.class, authorizations = {
        @Authorization(value = "PSUOAuth2Security", scopes = { 
            @AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
            })    }, tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Transactions Read", response = OBReadTransaction6.class),
        @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
        @ApiResponse(code = 404, message = "Not found"),
        @ApiResponse(code = 405, message = "Method Not Allowed"),
        @ApiResponse(code = 406, message = "Not Acceptable"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
    @RequestMapping(value = "/transactions",
        produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" }, 
        method = RequestMethod.GET)
    ResponseEntity<OBReadTransaction6> getTransactions(@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization
,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate
,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress
,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId
,@ApiParam(value = "Indicates the user-agent that the PSU is using." ) @RequestHeader(value="x-customer-user-agent", required=false) String xCustomerUserAgent
,@ApiParam(value = "The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "fromBookingDateTime", required = false) OffsetDateTime fromBookingDateTime
,@ApiParam(value = "The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "toBookingDateTime", required = false) OffsetDateTime toBookingDateTime
);

}