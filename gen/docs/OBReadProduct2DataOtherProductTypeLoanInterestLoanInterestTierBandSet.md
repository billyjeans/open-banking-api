

# OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet

The group of tiers or bands for which debit interest can be applied.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance | 
**identification** | **String** | Loan interest tierbandset identification. Used by  loan providers for internal use purpose. |  [optional]
**calculationMethod** | [**OBInterestCalculationMethod1Code**](OBInterestCalculationMethod1Code.md) |  | 
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherCalculationMethod** | [**OBOtherCodeType10**](OBOtherCodeType10.md) |  |  [optional]
**loanInterestTierBand** | [**List&lt;OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand&gt;**](OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.md) |  | 
**loanInterestFeesCharges** | [**List&lt;OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges&gt;**](OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges.md) |  |  [optional]



## Enum: TierBandMethodEnum

Name | Value
---- | -----
INBA | &quot;INBA&quot;
INTI | &quot;INTI&quot;
INWH | &quot;INWH&quot;



