

# OBReadBalance1DataBalance

Set of elements used to define the balance details.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**creditDebitIndicator** | [**OBCreditDebitCode2**](OBCreditDebitCode2.md) |  | 
**type** | [**OBBalanceType1Code**](OBBalanceType1Code.md) |  | 
**dateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**amount** | [**OBReadBalance1DataAmount**](OBReadBalance1DataAmount.md) |  | 
**creditLine** | [**List&lt;OBReadBalance1DataCreditLine&gt;**](OBReadBalance1DataCreditLine.md) |  |  [optional]


