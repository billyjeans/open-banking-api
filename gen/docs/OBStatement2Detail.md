

# OBStatement2Detail

Provides further details on a statement resource.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**statementId** | **String** | Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable. |  [optional]
**statementReference** | **String** | Unique reference for the statement. This reference may be optionally populated if available. |  [optional]
**type** | [**OBExternalStatementType1Code**](OBExternalStatementType1Code.md) |  | 
**startDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**endDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**statementDescription** | **List&lt;String&gt;** |  |  [optional]
**statementBenefit** | [**List&lt;OBStatement2StatementBenefit&gt;**](OBStatement2StatementBenefit.md) |  |  [optional]
**statementFee** | [**List&lt;OBStatement2StatementFee&gt;**](OBStatement2StatementFee.md) |  |  [optional]
**statementInterest** | [**List&lt;OBStatement2StatementInterest&gt;**](OBStatement2StatementInterest.md) |  |  [optional]
**statementAmount** | [**List&lt;OBStatement2StatementAmount&gt;**](OBStatement2StatementAmount.md) |  |  [optional]
**statementDateTime** | [**List&lt;OBStatement2StatementDateTime&gt;**](OBStatement2StatementDateTime.md) |  |  [optional]
**statementRate** | [**List&lt;OBStatement2StatementRate&gt;**](OBStatement2StatementRate.md) |  |  [optional]
**statementValue** | [**List&lt;OBStatement2StatementValue&gt;**](OBStatement2StatementValue.md) |  |  [optional]



