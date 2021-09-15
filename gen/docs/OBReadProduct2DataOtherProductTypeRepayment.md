

# OBReadProduct2DataOtherProductTypeRepayment

Repayment details of the Loan product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repaymentType** | [**RepaymentTypeEnum**](#RepaymentTypeEnum) | Repayment type |  [optional]
**repaymentFrequency** | [**RepaymentFrequencyEnum**](#RepaymentFrequencyEnum) | Repayment frequency |  [optional]
**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherRepaymentType** | [**OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType**](OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType.md) |  |  [optional]
**otherRepaymentFrequency** | [**OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency**](OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency.md) |  |  [optional]
**otherAmountType** | [**OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType**](OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType.md) |  |  [optional]
**repaymentFeeCharges** | [**OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges**](OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.md) |  |  [optional]
**repaymentHoliday** | [**List&lt;OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday&gt;**](OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.md) |  |  [optional]



## Enum: RepaymentTypeEnum

Name | Value
---- | -----
USBA | &quot;USBA&quot;
USBU | &quot;USBU&quot;
USCI | &quot;USCI&quot;
USCS | &quot;USCS&quot;
USER | &quot;USER&quot;
USFA | &quot;USFA&quot;
USFB | &quot;USFB&quot;
USFI | &quot;USFI&quot;
USIO | &quot;USIO&quot;
USOT | &quot;USOT&quot;
USPF | &quot;USPF&quot;
USRW | &quot;USRW&quot;
USSL | &quot;USSL&quot;



## Enum: RepaymentFrequencyEnum

Name | Value
---- | -----
SMDA | &quot;SMDA&quot;
SMFL | &quot;SMFL&quot;
SMFO | &quot;SMFO&quot;
SMHY | &quot;SMHY&quot;
SMMO | &quot;SMMO&quot;
SMOT | &quot;SMOT&quot;
SMQU | &quot;SMQU&quot;
SMWE | &quot;SMWE&quot;
SMYE | &quot;SMYE&quot;



## Enum: AmountTypeEnum

Name | Value
---- | -----
RABD | &quot;RABD&quot;
RABL | &quot;RABL&quot;
RACI | &quot;RACI&quot;
RAFC | &quot;RAFC&quot;
RAIO | &quot;RAIO&quot;
RALT | &quot;RALT&quot;
USOT | &quot;USOT&quot;


