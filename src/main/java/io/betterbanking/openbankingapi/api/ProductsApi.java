package io.betterbanking.openbankingapi.api;

import io.betterbanking.openbankingapi.models.OBErrorResponse1;
import io.betterbanking.openbankingapi.models.OBReadProduct2;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-29T18:15:20.803122+02:00[Europe/Berlin]")
@Api(value = "products", description = "the products API")
public interface ProductsApi {

    @ApiOperation(value = "Get Products", nickname = "getProducts", notes = "", response = OBReadProduct2.class, authorizations = {
            @Authorization(value = "PSUOAuth2Security", scopes = {
                    @AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
            })}, tags = {"Products",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Products Read", response = OBReadProduct2.class),
            @ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
            @ApiResponse(code = 404, message = "Not found"),
            @ApiResponse(code = 405, message = "Method Not Allowed"),
            @ApiResponse(code = 406, message = "Not Acceptable"),
            @ApiResponse(code = 429, message = "Too Many Requests"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class)})
    @RequestMapping(value = "/products",
            produces = {"application/json; charset=utf-8", "application/json", "application/jose+jwe"},
            method = RequestMethod.GET)
    ResponseEntity<OBReadProduct2> getProducts(@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true) @RequestHeader(value = "Authorization", required = true) String authorization
            , @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC") @RequestHeader(value = "x-fapi-auth-date", required = false) String xFapiAuthDate
            , @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP.") @RequestHeader(value = "x-fapi-customer-ip-address", required = false) String xFapiCustomerIpAddress
            , @ApiParam(value = "An RFC4122 UID used as a correlation id.") @RequestHeader(value = "x-fapi-interaction-id", required = false) String xFapiInteractionId
            , @ApiParam(value = "Indicates the user-agent that the PSU is using.") @RequestHeader(value = "x-customer-user-agent", required = false) String xCustomerUserAgent
    );

}
