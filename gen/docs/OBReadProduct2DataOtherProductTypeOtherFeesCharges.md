

# OBReadProduct2DataOtherProductTypeOtherFeesCharges

Contains details of fees and charges which are not associated with either Overdraft or features/benefits
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tariffType** | [**TariffTypeEnum**](#TariffTypeEnum) | TariffType which defines the fee and charges. |  [optional]
**tariffName** | **String** | Name of the tariff |  [optional]
**otherTariffType** | [**OBReadProduct2DataOtherProductTypeOtherTariffType**](OBReadProduct2DataOtherProductTypeOtherTariffType.md) |  |  [optional]
**feeChargeDetail** | [**List&lt;OBReadProduct2DataOtherProductTypeFeeChargeDetail&gt;**](OBReadProduct2DataOtherProductTypeFeeChargeDetail.md) |  | 
**feeChargeCap** | [**List&lt;OBReadProduct2DataOtherProductTypeFeeChargeCap&gt;**](OBReadProduct2DataOtherProductTypeFeeChargeCap.md) |  |  [optional]



## Enum: TariffTypeEnum

Name | Value
---- | -----
TTEL | &quot;TTEL&quot;
TTMX | &quot;TTMX&quot;
TTOT | &quot;TTOT&quot;



