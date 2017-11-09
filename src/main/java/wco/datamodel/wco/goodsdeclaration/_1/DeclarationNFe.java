
package wco.datamodel.wco.goodsdeclaration._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentCategoryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackHsClassificationType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackRecipientIdType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentItemIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentQuantityQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationLimitDateTimeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressLineTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CurrencyExchangeCurrencyTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarantIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DestinationCountryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExitOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureTariffQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.PreviousDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ReferencedInvoiceIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ReferencedInvoiceLineInvoiceIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ReferencedInvoiceTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.SubmitterIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.TradeTermsConditionCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.UCRTraderAssignedReferenceIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLatitudeMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLongitudeMeasureType;


/**
 * <p>Classe Java de DeclarationNFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationIdentificationIDType" minOccurs="0"/>
 *         &lt;element name="DeclarationOffice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationOfficeIdentificationCodeType"/>
 *                   &lt;element name="Warehouse" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
 *                             &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/>
 *                             &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrencyExchange">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CurrencyExchangeCurrencyTypeCodeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Declarant">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarantIdentificationIDType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExitOffice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExitOfficeIdentificationCodeType"/>
 *                   &lt;element name="Warehouse" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GoodsShipment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/>
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
 *                             &lt;element name="Destination" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/>
 *                                       &lt;element name="GoodsMeasure">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
 *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/>
 *                                       &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType" minOccurs="0"/>
 *                                       &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType" minOccurs="0"/>
 *                                       &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationType" minOccurs="0"/>
 *                                       &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                                       &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
 *                                       &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Commodity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/>
 *                                       &lt;element name="InvoiceLine">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceLineSequenceNumericType"/>
 *                                                 &lt;element name="ReferencedInvoiceLine" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
 *                                                           &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
 *                                                           &lt;element name="GoodsMeasure" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/>
 *                                                 &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/>
 *                                                 &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GoodsMeasure">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GovernmentProcedure" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ValuationAdjustment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/>
 *                                       &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Invoice">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
 *                             &lt;element name="Submitter" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReferencedInvoice" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceIdentificationIDType"/>
 *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceTypeCodeType"/>
 *                                       &lt;element name="Submitter" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TradeTerms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UCR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}UCRTraderAssignedReferenceIDType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationNFe", propOrder = {
    "id",
    "declarationOffice",
    "additionalInformation",
    "currencyExchange",
    "declarant",
    "exitOffice",
    "goodsShipment",
    "ucr"
})
public class DeclarationNFe {

    @XmlElement(name = "ID")
    protected DeclarationIdentificationIDType id;
    @XmlElement(name = "DeclarationOffice", required = true)
    protected DeclarationNFe.DeclarationOffice declarationOffice;
    @XmlElement(name = "AdditionalInformation")
    protected List<DeclarationNFe.AdditionalInformation> additionalInformation;
    @XmlElement(name = "CurrencyExchange", required = true)
    protected DeclarationNFe.CurrencyExchange currencyExchange;
    @XmlElement(name = "Declarant", required = true)
    protected DeclarationNFe.Declarant declarant;
    @XmlElement(name = "ExitOffice", required = true)
    protected DeclarationNFe.ExitOffice exitOffice;
    @XmlElement(name = "GoodsShipment", required = true)
    protected List<DeclarationNFe.GoodsShipment> goodsShipment;
    @XmlElement(name = "UCR")
    protected DeclarationNFe.UCR ucr;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationIdentificationIDType }
     *     
     */
    public DeclarationIdentificationIDType getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationIdentificationIDType }
     *     
     */
    public void setID(DeclarationIdentificationIDType value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade declarationOffice.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe.DeclarationOffice }
     *     
     */
    public DeclarationNFe.DeclarationOffice getDeclarationOffice() {
        return declarationOffice;
    }

    /**
     * Define o valor da propriedade declarationOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe.DeclarationOffice }
     *     
     */
    public void setDeclarationOffice(DeclarationNFe.DeclarationOffice value) {
        this.declarationOffice = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationNFe.AdditionalInformation }
     * 
     * 
     */
    public List<DeclarationNFe.AdditionalInformation> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<DeclarationNFe.AdditionalInformation>();
        }
        return this.additionalInformation;
    }

    /**
     * Obtém o valor da propriedade currencyExchange.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe.CurrencyExchange }
     *     
     */
    public DeclarationNFe.CurrencyExchange getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * Define o valor da propriedade currencyExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe.CurrencyExchange }
     *     
     */
    public void setCurrencyExchange(DeclarationNFe.CurrencyExchange value) {
        this.currencyExchange = value;
    }

    /**
     * Obtém o valor da propriedade declarant.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe.Declarant }
     *     
     */
    public DeclarationNFe.Declarant getDeclarant() {
        return declarant;
    }

    /**
     * Define o valor da propriedade declarant.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe.Declarant }
     *     
     */
    public void setDeclarant(DeclarationNFe.Declarant value) {
        this.declarant = value;
    }

    /**
     * Obtém o valor da propriedade exitOffice.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe.ExitOffice }
     *     
     */
    public DeclarationNFe.ExitOffice getExitOffice() {
        return exitOffice;
    }

    /**
     * Define o valor da propriedade exitOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe.ExitOffice }
     *     
     */
    public void setExitOffice(DeclarationNFe.ExitOffice value) {
        this.exitOffice = value;
    }

    /**
     * Gets the value of the goodsShipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsShipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationNFe.GoodsShipment }
     * 
     * 
     */
    public List<DeclarationNFe.GoodsShipment> getGoodsShipment() {
        if (goodsShipment == null) {
            goodsShipment = new ArrayList<DeclarationNFe.GoodsShipment>();
        }
        return this.goodsShipment;
    }

    /**
     * Obtém o valor da propriedade ucr.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNFe.UCR }
     *     
     */
    public DeclarationNFe.UCR getUCR() {
        return ucr;
    }

    /**
     * Define o valor da propriedade ucr.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNFe.UCR }
     *     
     */
    public void setUCR(DeclarationNFe.UCR value) {
        this.ucr = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statementCode",
        "statementDescription",
        "statementTypeCode"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "StatementCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String statementCode;
        @XmlElement(name = "StatementDescription")
        protected AdditionalInformationStatementDescriptionTextType statementDescription;
        @XmlElement(name = "StatementTypeCode")
        @XmlSchemaType(name = "token")
        protected AdditionalInformationStatementTypeCodeType statementTypeCode;

        /**
         * Obtém o valor da propriedade statementCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatementCode() {
            return statementCode;
        }

        /**
         * Define o valor da propriedade statementCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatementCode(String value) {
            this.statementCode = value;
        }

        /**
         * Obtém o valor da propriedade statementDescription.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationStatementDescriptionTextType }
         *     
         */
        public AdditionalInformationStatementDescriptionTextType getStatementDescription() {
            return statementDescription;
        }

        /**
         * Define o valor da propriedade statementDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationStatementDescriptionTextType }
         *     
         */
        public void setStatementDescription(AdditionalInformationStatementDescriptionTextType value) {
            this.statementDescription = value;
        }

        /**
         * Obtém o valor da propriedade statementTypeCode.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalInformationStatementTypeCodeType }
         *     
         */
        public AdditionalInformationStatementTypeCodeType getStatementTypeCode() {
            return statementTypeCode;
        }

        /**
         * Define o valor da propriedade statementTypeCode.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalInformationStatementTypeCodeType }
         *     
         */
        public void setStatementTypeCode(AdditionalInformationStatementTypeCodeType value) {
            this.statementTypeCode = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CurrencyTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CurrencyExchangeCurrencyTypeCodeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currencyTypeCode"
    })
    public static class CurrencyExchange {

        @XmlElement(name = "CurrencyTypeCode", required = true)
        @XmlSchemaType(name = "token")
        protected CurrencyExchangeCurrencyTypeCodeType currencyTypeCode;

        /**
         * Obtém o valor da propriedade currencyTypeCode.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyExchangeCurrencyTypeCodeType }
         *     
         */
        public CurrencyExchangeCurrencyTypeCodeType getCurrencyTypeCode() {
            return currencyTypeCode;
        }

        /**
         * Define o valor da propriedade currencyTypeCode.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyExchangeCurrencyTypeCodeType }
         *     
         */
        public void setCurrencyTypeCode(CurrencyExchangeCurrencyTypeCodeType value) {
            this.currencyTypeCode = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarantIdentificationIDType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id"
    })
    public static class Declarant {

        @XmlElement(name = "ID", required = true)
        protected DeclarantIdentificationIDType id;

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link DeclarantIdentificationIDType }
         *     
         */
        public DeclarantIdentificationIDType getID() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarantIdentificationIDType }
         *     
         */
        public void setID(DeclarantIdentificationIDType value) {
            this.id = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DeclarationOfficeIdentificationCodeType"/>
     *         &lt;element name="Warehouse" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
     *                   &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/>
     *                   &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "warehouse"
    })
    public static class DeclarationOffice {

        @XmlElement(name = "ID", required = true)
        protected DeclarationOfficeIdentificationCodeType id;
        @XmlElement(name = "Warehouse")
        protected DeclarationNFe.DeclarationOffice.Warehouse warehouse;

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationOfficeIdentificationCodeType }
         *     
         */
        public DeclarationOfficeIdentificationCodeType getID() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationOfficeIdentificationCodeType }
         *     
         */
        public void setID(DeclarationOfficeIdentificationCodeType value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade warehouse.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNFe.DeclarationOffice.Warehouse }
         *     
         */
        public DeclarationNFe.DeclarationOffice.Warehouse getWarehouse() {
            return warehouse;
        }

        /**
         * Define o valor da propriedade warehouse.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNFe.DeclarationOffice.Warehouse }
         *     
         */
        public void setWarehouse(DeclarationNFe.DeclarationOffice.Warehouse value) {
            this.warehouse = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
         *         &lt;element name="LatitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLatitudeMeasureType" minOccurs="0"/>
         *         &lt;element name="LongitudeMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseLongitudeMeasureType" minOccurs="0"/>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "typeCode",
            "latitudeMeasure",
            "longitudeMeasure",
            "address"
        })
        public static class Warehouse {

            @XmlElement(name = "ID", required = true)
            protected WarehouseIdentificationIDType id;
            @XmlElement(name = "TypeCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;
            @XmlElement(name = "LatitudeMeasure")
            protected WarehouseLatitudeMeasureType latitudeMeasure;
            @XmlElement(name = "LongitudeMeasure")
            protected WarehouseLongitudeMeasureType longitudeMeasure;
            @XmlElement(name = "Address")
            protected DeclarationNFe.DeclarationOffice.Warehouse.Address address;

            /**
             * Obtém o valor da propriedade id.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public WarehouseIdentificationIDType getID() {
                return id;
            }

            /**
             * Define o valor da propriedade id.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public void setID(WarehouseIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Obtém o valor da propriedade typeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeCode() {
                return typeCode;
            }

            /**
             * Define o valor da propriedade typeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeCode(String value) {
                this.typeCode = value;
            }

            /**
             * Obtém o valor da propriedade latitudeMeasure.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseLatitudeMeasureType }
             *     
             */
            public WarehouseLatitudeMeasureType getLatitudeMeasure() {
                return latitudeMeasure;
            }

            /**
             * Define o valor da propriedade latitudeMeasure.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseLatitudeMeasureType }
             *     
             */
            public void setLatitudeMeasure(WarehouseLatitudeMeasureType value) {
                this.latitudeMeasure = value;
            }

            /**
             * Obtém o valor da propriedade longitudeMeasure.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseLongitudeMeasureType }
             *     
             */
            public WarehouseLongitudeMeasureType getLongitudeMeasure() {
                return longitudeMeasure;
            }

            /**
             * Define o valor da propriedade longitudeMeasure.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseLongitudeMeasureType }
             *     
             */
            public void setLongitudeMeasure(WarehouseLongitudeMeasureType value) {
                this.longitudeMeasure = value;
            }

            /**
             * Obtém o valor da propriedade address.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNFe.DeclarationOffice.Warehouse.Address }
             *     
             */
            public DeclarationNFe.DeclarationOffice.Warehouse.Address getAddress() {
                return address;
            }

            /**
             * Define o valor da propriedade address.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNFe.DeclarationOffice.Warehouse.Address }
             *     
             */
            public void setAddress(DeclarationNFe.DeclarationOffice.Warehouse.Address value) {
                this.address = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "line"
            })
            public static class Address {

                @XmlElement(name = "Line")
                protected AddressLineTextType line;

                /**
                 * Obtém o valor da propriedade line.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public AddressLineTextType getLine() {
                    return line;
                }

                /**
                 * Define o valor da propriedade line.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressLineTextType }
                 *     
                 */
                public void setLine(AddressLineTextType value) {
                    this.line = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExitOfficeIdentificationCodeType"/>
     *         &lt;element name="Warehouse" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "warehouse"
    })
    public static class ExitOffice {

        @XmlElement(name = "ID", required = true)
        protected ExitOfficeIdentificationCodeType id;
        @XmlElement(name = "Warehouse")
        protected DeclarationNFe.ExitOffice.Warehouse warehouse;

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link ExitOfficeIdentificationCodeType }
         *     
         */
        public ExitOfficeIdentificationCodeType getID() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link ExitOfficeIdentificationCodeType }
         *     
         */
        public void setID(ExitOfficeIdentificationCodeType value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade warehouse.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNFe.ExitOffice.Warehouse }
         *     
         */
        public DeclarationNFe.ExitOffice.Warehouse getWarehouse() {
            return warehouse;
        }

        /**
         * Define o valor da propriedade warehouse.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNFe.ExitOffice.Warehouse }
         *     
         */
        public void setWarehouse(DeclarationNFe.ExitOffice.Warehouse value) {
            this.warehouse = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseIdentificationIDType"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}WarehouseTypeCodeType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "typeCode"
        })
        public static class Warehouse {

            @XmlElement(name = "ID", required = true)
            protected WarehouseIdentificationIDType id;
            @XmlElement(name = "TypeCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;

            /**
             * Obtém o valor da propriedade id.
             * 
             * @return
             *     possible object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public WarehouseIdentificationIDType getID() {
                return id;
            }

            /**
             * Define o valor da propriedade id.
             * 
             * @param value
             *     allowed object is
             *     {@link WarehouseIdentificationIDType }
             *     
             */
            public void setID(WarehouseIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Obtém o valor da propriedade typeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeCode() {
                return typeCode;
            }

            /**
             * Define o valor da propriedade typeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeCode(String value) {
                this.typeCode = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GovernmentAgencyGoodsItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/>
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
     *                   &lt;element name="Destination" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/>
     *                             &lt;element name="GoodsMeasure">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
     *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/>
     *                             &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType" minOccurs="0"/>
     *                             &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType" minOccurs="0"/>
     *                             &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationType" minOccurs="0"/>
     *                             &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *                             &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
     *                             &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Commodity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/>
     *                             &lt;element name="InvoiceLine">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceLineSequenceNumericType"/>
     *                                       &lt;element name="ReferencedInvoiceLine" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
     *                                                 &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
     *                                                 &lt;element name="GoodsMeasure" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/>
     *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/>
     *                                       &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GoodsMeasure">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GovernmentProcedure" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ValuationAdjustment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/>
     *                             &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Invoice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
     *                   &lt;element name="Submitter" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReferencedInvoice" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceIdentificationIDType"/>
     *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceTypeCodeType"/>
     *                             &lt;element name="Submitter" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TradeTerms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "governmentAgencyGoodsItem",
        "invoice",
        "tradeTerms"
    })
    public static class GoodsShipment {

        @XmlElement(name = "GovernmentAgencyGoodsItem", required = true)
        protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;
        @XmlElement(name = "Invoice", required = true)
        protected DeclarationNFe.GoodsShipment.Invoice invoice;
        @XmlElement(name = "TradeTerms", required = true)
        protected DeclarationNFe.GoodsShipment.TradeTerms tradeTerms;

        /**
         * Gets the value of the governmentAgencyGoodsItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the governmentAgencyGoodsItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGovernmentAgencyGoodsItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem }
         * 
         * 
         */
        public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
            if (governmentAgencyGoodsItem == null) {
                governmentAgencyGoodsItem = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem>();
            }
            return this.governmentAgencyGoodsItem;
        }

        /**
         * Obtém o valor da propriedade invoice.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNFe.GoodsShipment.Invoice }
         *     
         */
        public DeclarationNFe.GoodsShipment.Invoice getInvoice() {
            return invoice;
        }

        /**
         * Define o valor da propriedade invoice.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNFe.GoodsShipment.Invoice }
         *     
         */
        public void setInvoice(DeclarationNFe.GoodsShipment.Invoice value) {
            this.invoice = value;
        }

        /**
         * Obtém o valor da propriedade tradeTerms.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNFe.GoodsShipment.TradeTerms }
         *     
         */
        public DeclarationNFe.GoodsShipment.TradeTerms getTradeTerms() {
            return tradeTerms;
        }

        /**
         * Define o valor da propriedade tradeTerms.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNFe.GoodsShipment.TradeTerms }
         *     
         */
        public void setTradeTerms(DeclarationNFe.GoodsShipment.TradeTerms value) {
            this.tradeTerms = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemCustomsValueAmountType"/>
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
         *         &lt;element name="Destination" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/>
         *                   &lt;element name="GoodsMeasure">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdditionalDocument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
         *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/>
         *                   &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType" minOccurs="0"/>
         *                   &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType" minOccurs="0"/>
         *                   &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationType" minOccurs="0"/>
         *                   &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdditionalInformation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
         *                   &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
         *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Commodity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/>
         *                   &lt;element name="InvoiceLine">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceLineSequenceNumericType"/>
         *                             &lt;element name="ReferencedInvoiceLine" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
         *                                       &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
         *                                       &lt;element name="GoodsMeasure" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/>
         *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/>
         *                             &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GoodsMeasure">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GovernmentProcedure" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PreviousDocument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ValuationAdjustment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/>
         *                   &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "customsValueAmount",
            "sequenceNumeric",
            "destination",
            "additionalDocument",
            "additionalInformation",
            "commodity",
            "goodsMeasure",
            "governmentProcedure",
            "previousDocument",
            "valuationAdjustment"
        })
        public static class GovernmentAgencyGoodsItem {

            @XmlElement(name = "CustomsValueAmount", required = true)
            protected GovernmentAgencyGoodsItemCustomsValueAmountType customsValueAmount;
            @XmlElement(name = "SequenceNumeric", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "Destination", required = true)
            protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination> destination;
            @XmlElement(name = "AdditionalDocument")
            protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> additionalDocument;
            @XmlElement(name = "AdditionalInformation")
            protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> additionalInformation;
            @XmlElement(name = "Commodity", required = true)
            protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;
            @XmlElement(name = "GoodsMeasure", required = true)
            protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure goodsMeasure;
            @XmlElement(name = "GovernmentProcedure", required = true)
            protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> governmentProcedure;
            @XmlElement(name = "PreviousDocument")
            protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> previousDocument;
            @XmlElement(name = "ValuationAdjustment")
            protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment valuationAdjustment;

            /**
             * Obtém o valor da propriedade customsValueAmount.
             * 
             * @return
             *     possible object is
             *     {@link GovernmentAgencyGoodsItemCustomsValueAmountType }
             *     
             */
            public GovernmentAgencyGoodsItemCustomsValueAmountType getCustomsValueAmount() {
                return customsValueAmount;
            }

            /**
             * Define o valor da propriedade customsValueAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link GovernmentAgencyGoodsItemCustomsValueAmountType }
             *     
             */
            public void setCustomsValueAmount(GovernmentAgencyGoodsItemCustomsValueAmountType value) {
                this.customsValueAmount = value;
            }

            /**
             * Obtém o valor da propriedade sequenceNumeric.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSequenceNumeric() {
                return sequenceNumeric;
            }

            /**
             * Define o valor da propriedade sequenceNumeric.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSequenceNumeric(BigDecimal value) {
                this.sequenceNumeric = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the destination property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDestination().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination> getDestination() {
                if (destination == null) {
                    destination = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination>();
                }
                return this.destination;
            }

            /**
             * Gets the value of the additionalDocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalDocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> getAdditionalDocument() {
                if (additionalDocument == null) {
                    additionalDocument = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument>();
                }
                return this.additionalDocument;
            }

            /**
             * Gets the value of the additionalInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> getAdditionalInformation() {
                if (additionalInformation == null) {
                    additionalInformation = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation>();
                }
                return this.additionalInformation;
            }

            /**
             * Obtém o valor da propriedade commodity.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity getCommodity() {
                return commodity;
            }

            /**
             * Define o valor da propriedade commodity.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public void setCommodity(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity value) {
                this.commodity = value;
            }

            /**
             * Obtém o valor da propriedade goodsMeasure.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure }
             *     
             */
            public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure getGoodsMeasure() {
                return goodsMeasure;
            }

            /**
             * Define o valor da propriedade goodsMeasure.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure }
             *     
             */
            public void setGoodsMeasure(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure value) {
                this.goodsMeasure = value;
            }

            /**
             * Gets the value of the governmentProcedure property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the governmentProcedure property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGovernmentProcedure().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> getGovernmentProcedure() {
                if (governmentProcedure == null) {
                    governmentProcedure = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure>();
                }
                return this.governmentProcedure;
            }

            /**
             * Gets the value of the previousDocument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the previousDocument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPreviousDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> getPreviousDocument() {
                if (previousDocument == null) {
                    previousDocument = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument>();
                }
                return this.previousDocument;
            }

            /**
             * Obtém o valor da propriedade valuationAdjustment.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment getValuationAdjustment() {
                return valuationAdjustment;
            }

            /**
             * Define o valor da propriedade valuationAdjustment.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public void setValuationAdjustment(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment value) {
                this.valuationAdjustment = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType" minOccurs="0"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
             *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType" minOccurs="0"/>
             *         &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType" minOccurs="0"/>
             *         &lt;element name="ValueWithoutExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType" minOccurs="0"/>
             *         &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationType" minOccurs="0"/>
             *         &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "categoryCode",
                "id",
                "itemID",
                "quantityQuantity",
                "valueWithExchangeCoverAmount",
                "valueWithoutExchangeCoverAmount",
                "drawbackHsClassification",
                "drawbackRecipientId"
            })
            public static class AdditionalDocument {

                @XmlElement(name = "CategoryCode")
                @XmlSchemaType(name = "token")
                protected AdditionalDocumentCategoryCodeType categoryCode;
                @XmlElement(name = "ID")
                protected AdditionalDocumentIdentificationIDType id;
                @XmlElement(name = "ItemID")
                protected AdditionalDocumentItemIDType itemID;
                @XmlElement(name = "QuantityQuantity")
                protected AdditionalDocumentQuantityQuantityType quantityQuantity;
                @XmlElement(name = "ValueWithExchangeCoverAmount")
                protected GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType valueWithExchangeCoverAmount;
                @XmlElement(name = "ValueWithoutExchangeCoverAmount")
                protected GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType valueWithoutExchangeCoverAmount;
                @XmlElement(name = "DrawbackHsClassification")
                protected AdditionalDocumentDrawbackHsClassificationType drawbackHsClassification;
                @XmlElement(name = "DrawbackRecipientId")
                protected AdditionalDocumentDrawbackRecipientIdType drawbackRecipientId;

                /**
                 * Obtém o valor da propriedade categoryCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentCategoryCodeType }
                 *     
                 */
                public AdditionalDocumentCategoryCodeType getCategoryCode() {
                    return categoryCode;
                }

                /**
                 * Define o valor da propriedade categoryCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentCategoryCodeType }
                 *     
                 */
                public void setCategoryCode(AdditionalDocumentCategoryCodeType value) {
                    this.categoryCode = value;
                }

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentIdentificationIDType }
                 *     
                 */
                public AdditionalDocumentIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentIdentificationIDType }
                 *     
                 */
                public void setID(AdditionalDocumentIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Obtém o valor da propriedade itemID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentItemIDType }
                 *     
                 */
                public AdditionalDocumentItemIDType getItemID() {
                    return itemID;
                }

                /**
                 * Define o valor da propriedade itemID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentItemIDType }
                 *     
                 */
                public void setItemID(AdditionalDocumentItemIDType value) {
                    this.itemID = value;
                }

                /**
                 * Obtém o valor da propriedade quantityQuantity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentQuantityQuantityType }
                 *     
                 */
                public AdditionalDocumentQuantityQuantityType getQuantityQuantity() {
                    return quantityQuantity;
                }

                /**
                 * Define o valor da propriedade quantityQuantity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentQuantityQuantityType }
                 *     
                 */
                public void setQuantityQuantity(AdditionalDocumentQuantityQuantityType value) {
                    this.quantityQuantity = value;
                }

                /**
                 * Obtém o valor da propriedade valueWithExchangeCoverAmount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType }
                 *     
                 */
                public GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType getValueWithExchangeCoverAmount() {
                    return valueWithExchangeCoverAmount;
                }

                /**
                 * Define o valor da propriedade valueWithExchangeCoverAmount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType }
                 *     
                 */
                public void setValueWithExchangeCoverAmount(GovernmentAgencyGoodsItemValueWithExchangeCoverAmountType value) {
                    this.valueWithExchangeCoverAmount = value;
                }

                /**
                 * Obtém o valor da propriedade valueWithoutExchangeCoverAmount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType }
                 *     
                 */
                public GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType getValueWithoutExchangeCoverAmount() {
                    return valueWithoutExchangeCoverAmount;
                }

                /**
                 * Define o valor da propriedade valueWithoutExchangeCoverAmount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType }
                 *     
                 */
                public void setValueWithoutExchangeCoverAmount(GovernmentAgencyGoodsItemValueWithoutExchangeCoverAmountType value) {
                    this.valueWithoutExchangeCoverAmount = value;
                }

                /**
                 * Obtém o valor da propriedade drawbackHsClassification.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentDrawbackHsClassificationType }
                 *     
                 */
                public AdditionalDocumentDrawbackHsClassificationType getDrawbackHsClassification() {
                    return drawbackHsClassification;
                }

                /**
                 * Define o valor da propriedade drawbackHsClassification.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentDrawbackHsClassificationType }
                 *     
                 */
                public void setDrawbackHsClassification(AdditionalDocumentDrawbackHsClassificationType value) {
                    this.drawbackHsClassification = value;
                }

                /**
                 * Obtém o valor da propriedade drawbackRecipientId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentDrawbackRecipientIdType }
                 *     
                 */
                public AdditionalDocumentDrawbackRecipientIdType getDrawbackRecipientId() {
                    return drawbackRecipientId;
                }

                /**
                 * Define o valor da propriedade drawbackRecipientId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentDrawbackRecipientIdType }
                 *     
                 */
                public void setDrawbackRecipientId(AdditionalDocumentDrawbackRecipientIdType value) {
                    this.drawbackRecipientId = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
             *         &lt;element name="StatementDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="LimitDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationLimitDateTimeType" minOccurs="0"/>
             *         &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "statementCode",
                "statementDescription",
                "limitDateTime",
                "statementTypeCode"
            })
            public static class AdditionalInformation {

                @XmlElement(name = "StatementCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String statementCode;
                @XmlElement(name = "StatementDescription")
                protected AdditionalInformationStatementDescriptionTextType statementDescription;
                @XmlElement(name = "LimitDateTime")
                protected AdditionalInformationLimitDateTimeType limitDateTime;
                @XmlElement(name = "StatementTypeCode")
                @XmlSchemaType(name = "token")
                protected AdditionalInformationStatementTypeCodeType statementTypeCode;

                /**
                 * Obtém o valor da propriedade statementCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatementCode() {
                    return statementCode;
                }

                /**
                 * Define o valor da propriedade statementCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatementCode(String value) {
                    this.statementCode = value;
                }

                /**
                 * Obtém o valor da propriedade statementDescription.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalInformationStatementDescriptionTextType }
                 *     
                 */
                public AdditionalInformationStatementDescriptionTextType getStatementDescription() {
                    return statementDescription;
                }

                /**
                 * Define o valor da propriedade statementDescription.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalInformationStatementDescriptionTextType }
                 *     
                 */
                public void setStatementDescription(AdditionalInformationStatementDescriptionTextType value) {
                    this.statementDescription = value;
                }

                /**
                 * Obtém o valor da propriedade limitDateTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalInformationLimitDateTimeType }
                 *     
                 */
                public AdditionalInformationLimitDateTimeType getLimitDateTime() {
                    return limitDateTime;
                }

                /**
                 * Define o valor da propriedade limitDateTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalInformationLimitDateTimeType }
                 *     
                 */
                public void setLimitDateTime(AdditionalInformationLimitDateTimeType value) {
                    this.limitDateTime = value;
                }

                /**
                 * Obtém o valor da propriedade statementTypeCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalInformationStatementTypeCodeType }
                 *     
                 */
                public AdditionalInformationStatementTypeCodeType getStatementTypeCode() {
                    return statementTypeCode;
                }

                /**
                 * Define o valor da propriedade statementTypeCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalInformationStatementTypeCodeType }
                 *     
                 */
                public void setStatementTypeCode(AdditionalInformationStatementTypeCodeType value) {
                    this.statementTypeCode = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="ValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityValueAmountType"/>
             *         &lt;element name="InvoiceLine">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceLineSequenceNumericType"/>
             *                   &lt;element name="ReferencedInvoiceLine" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
             *                             &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
             *                             &lt;element name="GoodsMeasure" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ProductCharacteristics" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/>
             *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ProductCriteriaConformance" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/>
             *                   &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "description",
                "valueAmount",
                "invoiceLine",
                "productCharacteristics",
                "productCriteriaConformance"
            })
            public static class Commodity {

                @XmlElement(name = "Description")
                protected CommodityDescriptionTextType description;
                @XmlElement(name = "ValueAmount", required = true)
                protected CommodityValueAmountType valueAmount;
                @XmlElement(name = "InvoiceLine", required = true)
                protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine invoiceLine;
                @XmlElement(name = "ProductCharacteristics")
                protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics> productCharacteristics;
                @XmlElement(name = "ProductCriteriaConformance")
                protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance> productCriteriaConformance;

                /**
                 * Obtém o valor da propriedade description.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommodityDescriptionTextType }
                 *     
                 */
                public CommodityDescriptionTextType getDescription() {
                    return description;
                }

                /**
                 * Define o valor da propriedade description.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommodityDescriptionTextType }
                 *     
                 */
                public void setDescription(CommodityDescriptionTextType value) {
                    this.description = value;
                }

                /**
                 * Obtém o valor da propriedade valueAmount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommodityValueAmountType }
                 *     
                 */
                public CommodityValueAmountType getValueAmount() {
                    return valueAmount;
                }

                /**
                 * Define o valor da propriedade valueAmount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommodityValueAmountType }
                 *     
                 */
                public void setValueAmount(CommodityValueAmountType value) {
                    this.valueAmount = value;
                }

                /**
                 * Obtém o valor da propriedade invoiceLine.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
                 *     
                 */
                public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine getInvoiceLine() {
                    return invoiceLine;
                }

                /**
                 * Define o valor da propriedade invoiceLine.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine }
                 *     
                 */
                public void setInvoiceLine(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine value) {
                    this.invoiceLine = value;
                }

                /**
                 * Gets the value of the productCharacteristics property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the productCharacteristics property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProductCharacteristics().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics }
                 * 
                 * 
                 */
                public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics> getProductCharacteristics() {
                    if (productCharacteristics == null) {
                        productCharacteristics = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics>();
                    }
                    return this.productCharacteristics;
                }

                /**
                 * Gets the value of the productCriteriaConformance property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the productCriteriaConformance property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProductCriteriaConformance().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance }
                 * 
                 * 
                 */
                public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance> getProductCriteriaConformance() {
                    if (productCriteriaConformance == null) {
                        productCriteriaConformance = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance>();
                    }
                    return this.productCriteriaConformance;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceLineSequenceNumericType"/>
                 *         &lt;element name="ReferencedInvoiceLine" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
                 *                   &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
                 *                   &lt;element name="GoodsMeasure" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "sequenceNumeric",
                    "referencedInvoiceLine"
                })
                public static class InvoiceLine {

                    @XmlElement(name = "SequenceNumeric", required = true)
                    protected BigDecimal sequenceNumeric;
                    @XmlElement(name = "ReferencedInvoiceLine")
                    protected List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine> referencedInvoiceLine;

                    /**
                     * Obtém o valor da propriedade sequenceNumeric.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSequenceNumeric() {
                        return sequenceNumeric;
                    }

                    /**
                     * Define o valor da propriedade sequenceNumeric.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSequenceNumeric(BigDecimal value) {
                        this.sequenceNumeric = value;
                    }

                    /**
                     * Gets the value of the referencedInvoiceLine property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the referencedInvoiceLine property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getReferencedInvoiceLine().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine }
                     * 
                     * 
                     */
                    public List<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine> getReferencedInvoiceLine() {
                        if (referencedInvoiceLine == null) {
                            referencedInvoiceLine = new ArrayList<DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine>();
                        }
                        return this.referencedInvoiceLine;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineSequenceNumericType"/>
                     *         &lt;element name="InvoiceIdentificationID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceLineInvoiceIdentificationIDType"/>
                     *         &lt;element name="GoodsMeasure" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sequenceNumeric",
                        "invoiceIdentificationID",
                        "goodsMeasure"
                    })
                    public static class ReferencedInvoiceLine {

                        @XmlElement(name = "SequenceNumeric", required = true)
                        protected BigDecimal sequenceNumeric;
                        @XmlElement(name = "InvoiceIdentificationID", required = true)
                        protected ReferencedInvoiceLineInvoiceIdentificationIDType invoiceIdentificationID;
                        @XmlElement(name = "GoodsMeasure")
                        protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine.GoodsMeasure goodsMeasure;

                        /**
                         * Obtém o valor da propriedade sequenceNumeric.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getSequenceNumeric() {
                            return sequenceNumeric;
                        }

                        /**
                         * Define o valor da propriedade sequenceNumeric.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setSequenceNumeric(BigDecimal value) {
                            this.sequenceNumeric = value;
                        }

                        /**
                         * Obtém o valor da propriedade invoiceIdentificationID.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ReferencedInvoiceLineInvoiceIdentificationIDType }
                         *     
                         */
                        public ReferencedInvoiceLineInvoiceIdentificationIDType getInvoiceIdentificationID() {
                            return invoiceIdentificationID;
                        }

                        /**
                         * Define o valor da propriedade invoiceIdentificationID.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ReferencedInvoiceLineInvoiceIdentificationIDType }
                         *     
                         */
                        public void setInvoiceIdentificationID(ReferencedInvoiceLineInvoiceIdentificationIDType value) {
                            this.invoiceIdentificationID = value;
                        }

                        /**
                         * Obtém o valor da propriedade goodsMeasure.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine.GoodsMeasure }
                         *     
                         */
                        public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine.GoodsMeasure getGoodsMeasure() {
                            return goodsMeasure;
                        }

                        /**
                         * Define o valor da propriedade goodsMeasure.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine.GoodsMeasure }
                         *     
                         */
                        public void setGoodsMeasure(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.InvoiceLine.ReferencedInvoiceLine.GoodsMeasure value) {
                            this.goodsMeasure = value;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "tariffQuantity"
                        })
                        public static class GoodsMeasure {

                            @XmlElement(name = "TariffQuantity", required = true)
                            protected GoodsMeasureTariffQuantityType tariffQuantity;

                            /**
                             * Obtém o valor da propriedade tariffQuantity.
                             * 
                             * @return
                             *     possible object is
                             *     {@link GoodsMeasureTariffQuantityType }
                             *     
                             */
                            public GoodsMeasureTariffQuantityType getTariffQuantity() {
                                return tariffQuantity;
                            }

                            /**
                             * Define o valor da propriedade tariffQuantity.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link GoodsMeasureTariffQuantityType }
                             *     
                             */
                            public void setTariffQuantity(GoodsMeasureTariffQuantityType value) {
                                this.tariffQuantity = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsTypeCodeType"/>
                 *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCharacteristicsDescriptionTextType"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "typeCode",
                    "description"
                })
                public static class ProductCharacteristics {

                    @XmlElement(name = "TypeCode", required = true)
                    protected ProductCharacteristicsTypeCodeType typeCode;
                    @XmlElement(name = "Description", required = true)
                    protected ProductCharacteristicsDescriptionTextType description;

                    /**
                     * Obtém o valor da propriedade typeCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductCharacteristicsTypeCodeType }
                     *     
                     */
                    public ProductCharacteristicsTypeCodeType getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * Define o valor da propriedade typeCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductCharacteristicsTypeCodeType }
                     *     
                     */
                    public void setTypeCode(ProductCharacteristicsTypeCodeType value) {
                        this.typeCode = value;
                    }

                    /**
                     * Obtém o valor da propriedade description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductCharacteristicsDescriptionTextType }
                     *     
                     */
                    public ProductCharacteristicsDescriptionTextType getDescription() {
                        return description;
                    }

                    /**
                     * Define o valor da propriedade description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductCharacteristicsDescriptionTextType }
                     *     
                     */
                    public void setDescription(ProductCharacteristicsDescriptionTextType value) {
                        this.description = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceTypeCodeType"/>
                 *         &lt;element name="Description" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductCriteriaConformanceDescriptionTextType"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "typeCode",
                    "description"
                })
                public static class ProductCriteriaConformance {

                    @XmlElement(name = "TypeCode", required = true)
                    protected ProductCriteriaConformanceTypeCodeType typeCode;
                    @XmlElement(name = "Description", required = true)
                    protected ProductCriteriaConformanceDescriptionTextType description;

                    /**
                     * Obtém o valor da propriedade typeCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductCriteriaConformanceTypeCodeType }
                     *     
                     */
                    public ProductCriteriaConformanceTypeCodeType getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * Define o valor da propriedade typeCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductCriteriaConformanceTypeCodeType }
                     *     
                     */
                    public void setTypeCode(ProductCriteriaConformanceTypeCodeType value) {
                        this.typeCode = value;
                    }

                    /**
                     * Obtém o valor da propriedade description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductCriteriaConformanceDescriptionTextType }
                     *     
                     */
                    public ProductCriteriaConformanceDescriptionTextType getDescription() {
                        return description;
                    }

                    /**
                     * Define o valor da propriedade description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductCriteriaConformanceDescriptionTextType }
                     *     
                     */
                    public void setDescription(ProductCriteriaConformanceDescriptionTextType value) {
                        this.description = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}DestinationCountryCodeType"/>
             *         &lt;element name="GoodsMeasure">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "countryCode",
                "goodsMeasure"
            })
            public static class Destination {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected DestinationCountryCodeType countryCode;
                @XmlElement(name = "GoodsMeasure", required = true)
                protected DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure goodsMeasure;

                /**
                 * Obtém o valor da propriedade countryCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DestinationCountryCodeType }
                 *     
                 */
                public DestinationCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Define o valor da propriedade countryCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DestinationCountryCodeType }
                 *     
                 */
                public void setCountryCode(DestinationCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Obtém o valor da propriedade goodsMeasure.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure }
                 *     
                 */
                public DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure getGoodsMeasure() {
                    return goodsMeasure;
                }

                /**
                 * Define o valor da propriedade goodsMeasure.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure }
                 *     
                 */
                public void setGoodsMeasure(DeclarationNFe.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure value) {
                    this.goodsMeasure = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tariffQuantity"
                })
                public static class GoodsMeasure {

                    @XmlElement(name = "TariffQuantity", required = true)
                    protected GoodsMeasureTariffQuantityType tariffQuantity;

                    /**
                     * Obtém o valor da propriedade tariffQuantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureTariffQuantityType }
                     *     
                     */
                    public GoodsMeasureTariffQuantityType getTariffQuantity() {
                        return tariffQuantity;
                    }

                    /**
                     * Define o valor da propriedade tariffQuantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureTariffQuantityType }
                     *     
                     */
                    public void setTariffQuantity(GoodsMeasureTariffQuantityType value) {
                        this.tariffQuantity = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NetNetWeightMeasure" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureNetNetWeightMeasureType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "netNetWeightMeasure"
            })
            public static class GoodsMeasure {

                @XmlElement(name = "NetNetWeightMeasure", required = true)
                protected GoodsMeasureNetNetWeightMeasureType netNetWeightMeasure;

                /**
                 * Obtém o valor da propriedade netNetWeightMeasure.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodsMeasureNetNetWeightMeasureType }
                 *     
                 */
                public GoodsMeasureNetNetWeightMeasureType getNetNetWeightMeasure() {
                    return netNetWeightMeasure;
                }

                /**
                 * Define o valor da propriedade netNetWeightMeasure.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodsMeasureNetNetWeightMeasureType }
                 *     
                 */
                public void setNetNetWeightMeasure(GoodsMeasureNetNetWeightMeasureType value) {
                    this.netNetWeightMeasure = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CurrentCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentProcedureCurrentCodeType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "currentCode"
            })
            public static class GovernmentProcedure {

                @XmlElement(name = "CurrentCode", required = true)
                protected GovernmentProcedureCurrentCodeType currentCode;

                /**
                 * Obtém o valor da propriedade currentCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GovernmentProcedureCurrentCodeType }
                 *     
                 */
                public GovernmentProcedureCurrentCodeType getCurrentCode() {
                    return currentCode;
                }

                /**
                 * Define o valor da propriedade currentCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GovernmentProcedureCurrentCodeType }
                 *     
                 */
                public void setCurrentCode(GovernmentProcedureCurrentCodeType value) {
                    this.currentCode = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentIdentificationIDType" minOccurs="0"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}PreviousDocumentTypeCodeType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "typeCode"
            })
            public static class PreviousDocument {

                @XmlElement(name = "ID")
                protected PreviousDocumentIdentificationIDType id;
                @XmlElement(name = "TypeCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String typeCode;

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PreviousDocumentIdentificationIDType }
                 *     
                 */
                public PreviousDocumentIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PreviousDocumentIdentificationIDType }
                 *     
                 */
                public void setID(PreviousDocumentIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Obtém o valor da propriedade typeCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeCode() {
                    return typeCode;
                }

                /**
                 * Define o valor da propriedade typeCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeCode(String value) {
                    this.typeCode = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AdditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentAdditionCodeType"/>
             *         &lt;element name="PercentageNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ValuationAdjustmentPercentageNumericType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "additionCode",
                "percentageNumeric"
            })
            public static class ValuationAdjustment {

                @XmlElement(name = "AdditionCode", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String additionCode;
                @XmlElement(name = "PercentageNumeric", required = true)
                protected BigDecimal percentageNumeric;

                /**
                 * Obtém o valor da propriedade additionCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionCode() {
                    return additionCode;
                }

                /**
                 * Define o valor da propriedade additionCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionCode(String value) {
                    this.additionCode = value;
                }

                /**
                 * Obtém o valor da propriedade percentageNumeric.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercentageNumeric() {
                    return percentageNumeric;
                }

                /**
                 * Define o valor da propriedade percentageNumeric.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercentageNumeric(BigDecimal value) {
                    this.percentageNumeric = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
         *         &lt;element name="Submitter" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReferencedInvoice" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceIdentificationIDType"/>
         *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceTypeCodeType"/>
         *                   &lt;element name="Submitter" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "typeCode",
            "submitter",
            "referencedInvoice"
        })
        public static class Invoice {

            @XmlElement(name = "ID", required = true)
            protected InvoiceIdentificationIDType id;
            @XmlElement(name = "TypeCode", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;
            @XmlElement(name = "Submitter")
            protected DeclarationNFe.GoodsShipment.Invoice.Submitter submitter;
            @XmlElement(name = "ReferencedInvoice")
            protected List<DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice> referencedInvoice;

            /**
             * Obtém o valor da propriedade id.
             * 
             * @return
             *     possible object is
             *     {@link InvoiceIdentificationIDType }
             *     
             */
            public InvoiceIdentificationIDType getID() {
                return id;
            }

            /**
             * Define o valor da propriedade id.
             * 
             * @param value
             *     allowed object is
             *     {@link InvoiceIdentificationIDType }
             *     
             */
            public void setID(InvoiceIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Obtém o valor da propriedade typeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeCode() {
                return typeCode;
            }

            /**
             * Define o valor da propriedade typeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeCode(String value) {
                this.typeCode = value;
            }

            /**
             * Obtém o valor da propriedade submitter.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNFe.GoodsShipment.Invoice.Submitter }
             *     
             */
            public DeclarationNFe.GoodsShipment.Invoice.Submitter getSubmitter() {
                return submitter;
            }

            /**
             * Define o valor da propriedade submitter.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNFe.GoodsShipment.Invoice.Submitter }
             *     
             */
            public void setSubmitter(DeclarationNFe.GoodsShipment.Invoice.Submitter value) {
                this.submitter = value;
            }

            /**
             * Gets the value of the referencedInvoice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the referencedInvoice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReferencedInvoice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice }
             * 
             * 
             */
            public List<DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice> getReferencedInvoice() {
                if (referencedInvoice == null) {
                    referencedInvoice = new ArrayList<DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice>();
                }
                return this.referencedInvoice;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceIdentificationIDType"/>
             *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ReferencedInvoiceTypeCodeType"/>
             *         &lt;element name="Submitter" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "typeCode",
                "submitter"
            })
            public static class ReferencedInvoice {

                @XmlElement(name = "ID", required = true)
                protected ReferencedInvoiceIdentificationIDType id;
                @XmlElement(name = "TypeCode", required = true)
                @XmlSchemaType(name = "token")
                protected ReferencedInvoiceTypeCodeType typeCode;
                @XmlElement(name = "Submitter")
                protected DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice.Submitter submitter;

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferencedInvoiceIdentificationIDType }
                 *     
                 */
                public ReferencedInvoiceIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferencedInvoiceIdentificationIDType }
                 *     
                 */
                public void setID(ReferencedInvoiceIdentificationIDType value) {
                    this.id = value;
                }

                /**
                 * Obtém o valor da propriedade typeCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferencedInvoiceTypeCodeType }
                 *     
                 */
                public ReferencedInvoiceTypeCodeType getTypeCode() {
                    return typeCode;
                }

                /**
                 * Define o valor da propriedade typeCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferencedInvoiceTypeCodeType }
                 *     
                 */
                public void setTypeCode(ReferencedInvoiceTypeCodeType value) {
                    this.typeCode = value;
                }

                /**
                 * Obtém o valor da propriedade submitter.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice.Submitter }
                 *     
                 */
                public DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice.Submitter getSubmitter() {
                    return submitter;
                }

                /**
                 * Define o valor da propriedade submitter.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice.Submitter }
                 *     
                 */
                public void setSubmitter(DeclarationNFe.GoodsShipment.Invoice.ReferencedInvoice.Submitter value) {
                    this.submitter = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id"
                })
                public static class Submitter {

                    @XmlElement(name = "ID", required = true)
                    protected SubmitterIdentificationIDType id;

                    /**
                     * Obtém o valor da propriedade id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SubmitterIdentificationIDType }
                     *     
                     */
                    public SubmitterIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Define o valor da propriedade id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SubmitterIdentificationIDType }
                     *     
                     */
                    public void setID(SubmitterIdentificationIDType value) {
                        this.id = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}SubmitterIdentificationIDType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id"
            })
            public static class Submitter {

                @XmlElement(name = "ID", required = true)
                protected SubmitterIdentificationIDType id;

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SubmitterIdentificationIDType }
                 *     
                 */
                public SubmitterIdentificationIDType getID() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SubmitterIdentificationIDType }
                 *     
                 */
                public void setID(SubmitterIdentificationIDType value) {
                    this.id = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ConditionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}TradeTermsConditionCodeType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "conditionCode"
        })
        public static class TradeTerms {

            @XmlElement(name = "ConditionCode", required = true)
            @XmlSchemaType(name = "token")
            protected TradeTermsConditionCodeType conditionCode;

            /**
             * Obtém o valor da propriedade conditionCode.
             * 
             * @return
             *     possible object is
             *     {@link TradeTermsConditionCodeType }
             *     
             */
            public TradeTermsConditionCodeType getConditionCode() {
                return conditionCode;
            }

            /**
             * Define o valor da propriedade conditionCode.
             * 
             * @param value
             *     allowed object is
             *     {@link TradeTermsConditionCodeType }
             *     
             */
            public void setConditionCode(TradeTermsConditionCodeType value) {
                this.conditionCode = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TraderAssignedReferenceID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}UCRTraderAssignedReferenceIDType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "traderAssignedReferenceID"
    })
    public static class UCR {

        @XmlElement(name = "TraderAssignedReferenceID", required = true)
        protected UCRTraderAssignedReferenceIDType traderAssignedReferenceID;

        /**
         * Obtém o valor da propriedade traderAssignedReferenceID.
         * 
         * @return
         *     possible object is
         *     {@link UCRTraderAssignedReferenceIDType }
         *     
         */
        public UCRTraderAssignedReferenceIDType getTraderAssignedReferenceID() {
            return traderAssignedReferenceID;
        }

        /**
         * Define o valor da propriedade traderAssignedReferenceID.
         * 
         * @param value
         *     allowed object is
         *     {@link UCRTraderAssignedReferenceIDType }
         *     
         */
        public void setTraderAssignedReferenceID(UCRTraderAssignedReferenceIDType value) {
            this.traderAssignedReferenceID = value;
        }

    }

}
