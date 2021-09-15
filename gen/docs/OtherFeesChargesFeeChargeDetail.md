

# OtherFeesChargesFeeChargeDetail

Other fees/charges details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeCategory** | [**FeeCategoryEnum**](#FeeCategoryEnum) | Categorisation of fees and charges into standard categories. | 
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | Fee/Charge Type | 
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**FeeRateTypeEnum**](#FeeRateTypeEnum) | Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How frequently the fee/charge is applied to the account | 
**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How frequently the fee/charge is calculated |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the fee/charge details. |  [optional]
**otherFeeCategoryType** | [**OtherFeeCategoryType**](OtherFeeCategoryType.md) |  |  [optional]
**otherFeeType** | [**OtherFeeType1**](OtherFeeType1.md) |  |  [optional]
**otherFeeRateType** | [**OtherFeeRateType1**](OtherFeeRateType1.md) |  |  [optional]
**otherApplicationFrequency** | [**OtherApplicationFrequency1**](OtherApplicationFrequency1.md) |  |  [optional]
**otherCalculationFrequency** | [**OtherCalculationFrequency1**](OtherCalculationFrequency1.md) |  |  [optional]
**feeChargeCap** | [**List&lt;OtherFeesChargesFeeChargeCap&gt;**](OtherFeesChargesFeeChargeCap.md) | Details about any caps (maximum charges) that apply to a particular fee/charge |  [optional]
**feeApplicableRange** | [**FeeApplicableRange**](FeeApplicableRange.md) |  |  [optional]



## Enum: FeeCategoryEnum

Name | Value
---- | -----
OTHER | &quot;Other&quot;
SERVICING | &quot;Servicing&quot;



## Enum: FeeTypeEnum

Name | Value
---- | -----
SERVICECACCOUNTFEE | &quot;ServiceCAccountFee&quot;
SERVICECACCOUNTFEEMONTHLY | &quot;ServiceCAccountFeeMonthly&quot;
SERVICECOTHER | &quot;ServiceCOther&quot;
OTHER | &quot;Other&quot;



## Enum: FeeRateTypeEnum

Name | Value
---- | -----
LINKEDBASERATE | &quot;LinkedBaseRate&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;
OTHER | &quot;Other&quot;



## Enum: ApplicationFrequencyEnum

Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;



## Enum: CalculationFrequencyEnum

Name | Value
---- | -----
ACCOUNTCLOSING | &quot;AccountClosing&quot;
ACCOUNTOPENING | &quot;AccountOpening&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
CHARGINGPERIOD | &quot;ChargingPeriod&quot;
DAILY | &quot;Daily&quot;
PERITEM | &quot;PerItem&quot;
MONTHLY | &quot;Monthly&quot;
ONACCOUNTANNIVERSARY | &quot;OnAccountAnniversary&quot;
OTHER | &quot;Other&quot;
PERHOUR | &quot;PerHour&quot;
PEROCCURRENCE | &quot;PerOccurrence&quot;
PERSHEET | &quot;PerSheet&quot;
PERTRANSACTION | &quot;PerTransaction&quot;
PERTRANSACTIONAMOUNT | &quot;PerTransactionAmount&quot;
PERTRANSACTIONPERCENTAGE | &quot;PerTransactionPercentage&quot;
QUARTERLY | &quot;Quarterly&quot;
SIXMONTHLY | &quot;SixMonthly&quot;
STATEMENTMONTHLY | &quot;StatementMonthly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;



