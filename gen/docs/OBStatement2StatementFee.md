

# OBStatement2StatementFee

Set of elements used to provide details of a fee for the statement resource.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description that may be available for the statement fee. |  [optional]
**creditDebitIndicator** | [**OBCreditDebitCode0**](OBCreditDebitCode0.md) |  | 
**type** | **String** | Fee type, in a coded form. | 
**rate** | [**BigDecimal**](BigDecimal.md) | Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount) |  [optional]
**rateType** | **String** | Description that may be available for the statement fee rate type. |  [optional]
**frequency** | **String** | How frequently the fee is applied to the Account. |  [optional]
**amount** | [**OBActiveOrHistoricCurrencyAndAmount6**](OBActiveOrHistoricCurrencyAndAmount6.md) |  | 



