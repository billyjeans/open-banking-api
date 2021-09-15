

# OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap

RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) |  | 
**minMaxType** | [**OBMinMaxType1Code**](OBMinMaxType1Code.md) |  | 
**feeCapOccurrence** | **Integer** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional]
**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**cappingPeriod** | [**OBPeriod1Code**](OBPeriod1Code.md) |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**otherFeeType** | [**List&lt;OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType&gt;**](OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType.md) |  |  [optional]



## Enum: List&lt;FeeTypeEnum&gt;

Name | Value
---- | -----
FEPF | &quot;FEPF&quot;
FTOT | &quot;FTOT&quot;
FYAF | &quot;FYAF&quot;
FYAM | &quot;FYAM&quot;
FYAQ | &quot;FYAQ&quot;
FYCP | &quot;FYCP&quot;
FYDB | &quot;FYDB&quot;
FYMI | &quot;FYMI&quot;
FYXX | &quot;FYXX&quot;



