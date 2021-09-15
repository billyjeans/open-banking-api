

# OBReadProduct2DataOtherProductTypeFeeChargeDetail

Other fees/charges details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeCategory** | [**OBFeeCategory1Code**](OBFeeCategory1Code.md) |  | 
**feeType** | [**OBFeeType1Code**](OBFeeType1Code.md) |  | 
**negotiableIndicator** | **Boolean** | Fee/charge which is usually negotiable rather than a fixed amount |  [optional]
**feeAmount** | **String** | Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeRate** | **String** | Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount) |  [optional]
**feeRateType** | [**OBInterestRateType1Code1**](OBInterestRateType1Code1.md) |  |  [optional]
**applicationFrequency** | [**OBFeeFrequency1Code2**](OBFeeFrequency1Code2.md) |  | 
**calculationFrequency** | [**OBFeeFrequency1Code3**](OBFeeFrequency1Code3.md) |  |  [optional]
**notes** | **List&lt;String&gt;** |  |  [optional]
**feeChargeCap** | [**List&lt;OBReadProduct2DataOtherProductTypeFeeChargeCap&gt;**](OBReadProduct2DataOtherProductTypeFeeChargeCap.md) |  |  [optional]
**otherFeeCategoryType** | [**OBOtherCodeType10**](OBOtherCodeType10.md) |  |  [optional]
**otherFeeType** | [**OBOtherFeeChargeDetailType**](OBOtherFeeChargeDetailType.md) |  |  [optional]
**otherFeeRateType** | [**OBOtherCodeType18**](OBOtherCodeType18.md) |  |  [optional]
**otherApplicationFrequency** | [**OBOtherCodeType16**](OBOtherCodeType16.md) |  |  [optional]
**otherCalculationFrequency** | [**OBOtherCodeType17**](OBOtherCodeType17.md) |  |  [optional]
**feeApplicableRange** | [**OBReadProduct2DataOtherProductTypeFeeApplicableRange**](OBReadProduct2DataOtherProductTypeFeeApplicableRange.md) |  |  [optional]


