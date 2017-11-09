
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
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentItemIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentQuantityQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationLimitDateTimeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalInformationStatementTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressCountryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressCountrySubDivisionCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AddressLineTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ClassificationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ClassificationIdentificationTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityCommercialDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CommodityValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.CurrencyExchangeCurrencyTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarantIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DeclarationOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.DestinationCountryCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExitOfficeIdentificationCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExporterIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ExporterNameTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureTariffQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GoodsMeasureUnitDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentAgencyGoodsItemCustomsValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ImporterNameTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.PreviousDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCharacteristicsTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceDescriptionTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductCriteriaConformanceTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.ProductIdentifierTypeCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.TradeTermsConditionCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.UCRTraderAssignedReferenceIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLatitudeMeasureType;
import wco.datamodel.wco.goodsdeclaration_ds._1.WarehouseLongitudeMeasureType;


/**
 * <p>Classe Java de DeclarationNoNF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationNoNF">
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
 *                   &lt;element name="Exporter">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/>
 *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/>
 *                             &lt;element name="Address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
 *                                       &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
 *                                       &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/>
 *                                       &lt;element name="Classification">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/>
 *                                                 &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/>
 *                                                 &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Product" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/>
 *                                                 &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/>
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
 *                   &lt;element name="Importer">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/>
 *                             &lt;element name="Address">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
 *                                       &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
 *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/>
 *                             &lt;element name="AdditionalInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
 *                                       &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
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
@XmlType(name = "DeclarationNoNF", propOrder = {
    "id",
    "declarationOffice",
    "additionalInformation",
    "currencyExchange",
    "declarant",
    "exitOffice",
    "goodsShipment",
    "ucr"
})
public class DeclarationNoNF {

    @XmlElement(name = "ID")
    protected DeclarationIdentificationIDType id;
    @XmlElement(name = "DeclarationOffice", required = true)
    protected DeclarationNoNF.DeclarationOffice declarationOffice;
    @XmlElement(name = "AdditionalInformation")
    protected List<DeclarationNoNF.AdditionalInformation> additionalInformation;
    @XmlElement(name = "CurrencyExchange", required = true)
    protected DeclarationNoNF.CurrencyExchange currencyExchange;
    @XmlElement(name = "Declarant", required = true)
    protected DeclarationNoNF.Declarant declarant;
    @XmlElement(name = "ExitOffice", required = true)
    protected DeclarationNoNF.ExitOffice exitOffice;
    @XmlElement(name = "GoodsShipment", required = true)
    protected List<DeclarationNoNF.GoodsShipment> goodsShipment;
    @XmlElement(name = "UCR")
    protected DeclarationNoNF.UCR ucr;

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
     *     {@link DeclarationNoNF.DeclarationOffice }
     *     
     */
    public DeclarationNoNF.DeclarationOffice getDeclarationOffice() {
        return declarationOffice;
    }

    /**
     * Define o valor da propriedade declarationOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF.DeclarationOffice }
     *     
     */
    public void setDeclarationOffice(DeclarationNoNF.DeclarationOffice value) {
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
     * {@link DeclarationNoNF.AdditionalInformation }
     * 
     * 
     */
    public List<DeclarationNoNF.AdditionalInformation> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<DeclarationNoNF.AdditionalInformation>();
        }
        return this.additionalInformation;
    }

    /**
     * Obtém o valor da propriedade currencyExchange.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNoNF.CurrencyExchange }
     *     
     */
    public DeclarationNoNF.CurrencyExchange getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * Define o valor da propriedade currencyExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF.CurrencyExchange }
     *     
     */
    public void setCurrencyExchange(DeclarationNoNF.CurrencyExchange value) {
        this.currencyExchange = value;
    }

    /**
     * Obtém o valor da propriedade declarant.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNoNF.Declarant }
     *     
     */
    public DeclarationNoNF.Declarant getDeclarant() {
        return declarant;
    }

    /**
     * Define o valor da propriedade declarant.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF.Declarant }
     *     
     */
    public void setDeclarant(DeclarationNoNF.Declarant value) {
        this.declarant = value;
    }

    /**
     * Obtém o valor da propriedade exitOffice.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNoNF.ExitOffice }
     *     
     */
    public DeclarationNoNF.ExitOffice getExitOffice() {
        return exitOffice;
    }

    /**
     * Define o valor da propriedade exitOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF.ExitOffice }
     *     
     */
    public void setExitOffice(DeclarationNoNF.ExitOffice value) {
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
     * {@link DeclarationNoNF.GoodsShipment }
     * 
     * 
     */
    public List<DeclarationNoNF.GoodsShipment> getGoodsShipment() {
        if (goodsShipment == null) {
            goodsShipment = new ArrayList<DeclarationNoNF.GoodsShipment>();
        }
        return this.goodsShipment;
    }

    /**
     * Obtém o valor da propriedade ucr.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationNoNF.UCR }
     *     
     */
    public DeclarationNoNF.UCR getUCR() {
        return ucr;
    }

    /**
     * Define o valor da propriedade ucr.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationNoNF.UCR }
     *     
     */
    public void setUCR(DeclarationNoNF.UCR value) {
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
        protected DeclarationNoNF.DeclarationOffice.Warehouse warehouse;

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
         *     {@link DeclarationNoNF.DeclarationOffice.Warehouse }
         *     
         */
        public DeclarationNoNF.DeclarationOffice.Warehouse getWarehouse() {
            return warehouse;
        }

        /**
         * Define o valor da propriedade warehouse.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.DeclarationOffice.Warehouse }
         *     
         */
        public void setWarehouse(DeclarationNoNF.DeclarationOffice.Warehouse value) {
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
            protected DeclarationNoNF.DeclarationOffice.Warehouse.Address address;

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
             *     {@link DeclarationNoNF.DeclarationOffice.Warehouse.Address }
             *     
             */
            public DeclarationNoNF.DeclarationOffice.Warehouse.Address getAddress() {
                return address;
            }

            /**
             * Define o valor da propriedade address.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.DeclarationOffice.Warehouse.Address }
             *     
             */
            public void setAddress(DeclarationNoNF.DeclarationOffice.Warehouse.Address value) {
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
        protected DeclarationNoNF.ExitOffice.Warehouse warehouse;

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
         *     {@link DeclarationNoNF.ExitOffice.Warehouse }
         *     
         */
        public DeclarationNoNF.ExitOffice.Warehouse getWarehouse() {
            return warehouse;
        }

        /**
         * Define o valor da propriedade warehouse.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.ExitOffice.Warehouse }
         *     
         */
        public void setWarehouse(DeclarationNoNF.ExitOffice.Warehouse value) {
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
     *         &lt;element name="Exporter">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/>
     *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/>
     *                   &lt;element name="Address">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
     *                             &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
     *                             &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/>
     *                             &lt;element name="Classification">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/>
     *                                       &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/>
     *                                       &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Product" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/>
     *                                       &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/>
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
     *         &lt;element name="Importer">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/>
     *                   &lt;element name="Address">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
     *                             &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
     *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/>
     *                   &lt;element name="AdditionalInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
     *                             &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
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
        "exporter",
        "governmentAgencyGoodsItem",
        "importer",
        "invoice",
        "tradeTerms"
    })
    public static class GoodsShipment {

        @XmlElement(name = "Exporter", required = true)
        protected DeclarationNoNF.GoodsShipment.Exporter exporter;
        @XmlElement(name = "GovernmentAgencyGoodsItem", required = true)
        protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;
        @XmlElement(name = "Importer", required = true)
        protected DeclarationNoNF.GoodsShipment.Importer importer;
        @XmlElement(name = "Invoice", required = true)
        protected DeclarationNoNF.GoodsShipment.Invoice invoice;
        @XmlElement(name = "TradeTerms", required = true)
        protected DeclarationNoNF.GoodsShipment.TradeTerms tradeTerms;

        /**
         * Obtém o valor da propriedade exporter.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNoNF.GoodsShipment.Exporter }
         *     
         */
        public DeclarationNoNF.GoodsShipment.Exporter getExporter() {
            return exporter;
        }

        /**
         * Define o valor da propriedade exporter.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.GoodsShipment.Exporter }
         *     
         */
        public void setExporter(DeclarationNoNF.GoodsShipment.Exporter value) {
            this.exporter = value;
        }

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
         * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem }
         * 
         * 
         */
        public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
            if (governmentAgencyGoodsItem == null) {
                governmentAgencyGoodsItem = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem>();
            }
            return this.governmentAgencyGoodsItem;
        }

        /**
         * Obtém o valor da propriedade importer.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNoNF.GoodsShipment.Importer }
         *     
         */
        public DeclarationNoNF.GoodsShipment.Importer getImporter() {
            return importer;
        }

        /**
         * Define o valor da propriedade importer.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.GoodsShipment.Importer }
         *     
         */
        public void setImporter(DeclarationNoNF.GoodsShipment.Importer value) {
            this.importer = value;
        }

        /**
         * Obtém o valor da propriedade invoice.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNoNF.GoodsShipment.Invoice }
         *     
         */
        public DeclarationNoNF.GoodsShipment.Invoice getInvoice() {
            return invoice;
        }

        /**
         * Define o valor da propriedade invoice.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.GoodsShipment.Invoice }
         *     
         */
        public void setInvoice(DeclarationNoNF.GoodsShipment.Invoice value) {
            this.invoice = value;
        }

        /**
         * Obtém o valor da propriedade tradeTerms.
         * 
         * @return
         *     possible object is
         *     {@link DeclarationNoNF.GoodsShipment.TradeTerms }
         *     
         */
        public DeclarationNoNF.GoodsShipment.TradeTerms getTradeTerms() {
            return tradeTerms;
        }

        /**
         * Define o valor da propriedade tradeTerms.
         * 
         * @param value
         *     allowed object is
         *     {@link DeclarationNoNF.GoodsShipment.TradeTerms }
         *     
         */
        public void setTradeTerms(DeclarationNoNF.GoodsShipment.TradeTerms value) {
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterNameTextType"/>
         *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ExporterIdentificationIDType"/>
         *         &lt;element name="Address">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
         *                   &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
            "name",
            "id",
            "address"
        })
        public static class Exporter {

            @XmlElement(name = "Name", required = true)
            protected ExporterNameTextType name;
            @XmlElement(name = "ID", required = true)
            protected ExporterIdentificationIDType id;
            @XmlElement(name = "Address", required = true)
            protected DeclarationNoNF.GoodsShipment.Exporter.Address address;

            /**
             * Obtém o valor da propriedade name.
             * 
             * @return
             *     possible object is
             *     {@link ExporterNameTextType }
             *     
             */
            public ExporterNameTextType getName() {
                return name;
            }

            /**
             * Define o valor da propriedade name.
             * 
             * @param value
             *     allowed object is
             *     {@link ExporterNameTextType }
             *     
             */
            public void setName(ExporterNameTextType value) {
                this.name = value;
            }

            /**
             * Obtém o valor da propriedade id.
             * 
             * @return
             *     possible object is
             *     {@link ExporterIdentificationIDType }
             *     
             */
            public ExporterIdentificationIDType getID() {
                return id;
            }

            /**
             * Define o valor da propriedade id.
             * 
             * @param value
             *     allowed object is
             *     {@link ExporterIdentificationIDType }
             *     
             */
            public void setID(ExporterIdentificationIDType value) {
                this.id = value;
            }

            /**
             * Obtém o valor da propriedade address.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.Exporter.Address }
             *     
             */
            public DeclarationNoNF.GoodsShipment.Exporter.Address getAddress() {
                return address;
            }

            /**
             * Define o valor da propriedade address.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.Exporter.Address }
             *     
             */
            public void setAddress(DeclarationNoNF.GoodsShipment.Exporter.Address value) {
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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
             *         &lt;element name="CountrySubDivisionCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountrySubDivisionCodeType"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
                "countrySubDivisionCode",
                "line"
            })
            public static class Address {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "CountrySubDivisionCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountrySubDivisionCodeType countrySubDivisionCode;
                @XmlElement(name = "Line", required = true)
                protected AddressLineTextType line;

                /**
                 * Obtém o valor da propriedade countryCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Define o valor da propriedade countryCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

                /**
                 * Obtém o valor da propriedade countrySubDivisionCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public AddressCountrySubDivisionCodeType getCountrySubDivisionCode() {
                    return countrySubDivisionCode;
                }

                /**
                 * Define o valor da propriedade countrySubDivisionCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountrySubDivisionCodeType }
                 *     
                 */
                public void setCountrySubDivisionCode(AddressCountrySubDivisionCodeType value) {
                    this.countrySubDivisionCode = value;
                }

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
         *                   &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/>
         *                   &lt;element name="Classification">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/>
         *                             &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/>
         *                             &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Product" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/>
         *                             &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/>
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
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination> destination;
            @XmlElement(name = "AdditionalDocument")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> additionalDocument;
            @XmlElement(name = "AdditionalInformation")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> additionalInformation;
            @XmlElement(name = "Commodity", required = true)
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity commodity;
            @XmlElement(name = "GoodsMeasure", required = true)
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure goodsMeasure;
            @XmlElement(name = "GovernmentProcedure", required = true)
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> governmentProcedure;
            @XmlElement(name = "PreviousDocument")
            protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> previousDocument;
            @XmlElement(name = "ValuationAdjustment")
            protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment valuationAdjustment;

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
             * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination }
             * 
             * 
             */
            public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination> getDestination() {
                if (destination == null) {
                    destination = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination>();
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
             * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
             * 
             * 
             */
            public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> getAdditionalDocument() {
                if (additionalDocument == null) {
                    additionalDocument = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument>();
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
             * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation }
             * 
             * 
             */
            public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation> getAdditionalInformation() {
                if (additionalInformation == null) {
                    additionalInformation = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalInformation>();
                }
                return this.additionalInformation;
            }

            /**
             * Obtém o valor da propriedade commodity.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity getCommodity() {
                return commodity;
            }

            /**
             * Define o valor da propriedade commodity.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity }
             *     
             */
            public void setCommodity(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity value) {
                this.commodity = value;
            }

            /**
             * Obtém o valor da propriedade goodsMeasure.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure }
             *     
             */
            public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure getGoodsMeasure() {
                return goodsMeasure;
            }

            /**
             * Define o valor da propriedade goodsMeasure.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure }
             *     
             */
            public void setGoodsMeasure(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GoodsMeasure value) {
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
             * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
             * 
             * 
             */
            public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> getGovernmentProcedure() {
                if (governmentProcedure == null) {
                    governmentProcedure = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure>();
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
             * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument }
             * 
             * 
             */
            public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument> getPreviousDocument() {
                if (previousDocument == null) {
                    previousDocument = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.PreviousDocument>();
                }
                return this.previousDocument;
            }

            /**
             * Obtém o valor da propriedade valuationAdjustment.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment getValuationAdjustment() {
                return valuationAdjustment;
            }

            /**
             * Define o valor da propriedade valuationAdjustment.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment }
             *     
             */
            public void setValuationAdjustment(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.ValuationAdjustment value) {
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
                "quantityQuantity"
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
             *         &lt;element name="CommercialDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}CommodityCommercialDescriptionTextType" minOccurs="0"/>
             *         &lt;element name="Classification">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/>
             *                   &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="GoodsMeasure" maxOccurs="2" minOccurs="2">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/>
             *                   &lt;element name="TariffQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTariffQuantityType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Product" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/>
             *                   &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/>
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
                "commercialDescription",
                "classification",
                "goodsMeasure",
                "product",
                "productCharacteristics",
                "productCriteriaConformance"
            })
            public static class Commodity {

                @XmlElement(name = "Description")
                protected CommodityDescriptionTextType description;
                @XmlElement(name = "ValueAmount", required = true)
                protected CommodityValueAmountType valueAmount;
                @XmlElement(name = "CommercialDescription")
                protected CommodityCommercialDescriptionTextType commercialDescription;
                @XmlElement(name = "Classification", required = true)
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification classification;
                @XmlElement(name = "GoodsMeasure", required = true)
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure> goodsMeasure;
                @XmlElement(name = "Product")
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product product;
                @XmlElement(name = "ProductCharacteristics")
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics> productCharacteristics;
                @XmlElement(name = "ProductCriteriaConformance")
                protected List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance> productCriteriaConformance;

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
                 * Obtém o valor da propriedade commercialDescription.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommodityCommercialDescriptionTextType }
                 *     
                 */
                public CommodityCommercialDescriptionTextType getCommercialDescription() {
                    return commercialDescription;
                }

                /**
                 * Define o valor da propriedade commercialDescription.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommodityCommercialDescriptionTextType }
                 *     
                 */
                public void setCommercialDescription(CommodityCommercialDescriptionTextType value) {
                    this.commercialDescription = value;
                }

                /**
                 * Obtém o valor da propriedade classification.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification }
                 *     
                 */
                public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification getClassification() {
                    return classification;
                }

                /**
                 * Define o valor da propriedade classification.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification }
                 *     
                 */
                public void setClassification(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Classification value) {
                    this.classification = value;
                }

                /**
                 * Gets the value of the goodsMeasure property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the goodsMeasure property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGoodsMeasure().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure }
                 * 
                 * 
                 */
                public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure> getGoodsMeasure() {
                    if (goodsMeasure == null) {
                        goodsMeasure = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.GoodsMeasure>();
                    }
                    return this.goodsMeasure;
                }

                /**
                 * Obtém o valor da propriedade product.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product }
                 *     
                 */
                public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product getProduct() {
                    return product;
                }

                /**
                 * Define o valor da propriedade product.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product }
                 *     
                 */
                public void setProduct(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.Product value) {
                    this.product = value;
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
                 * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics }
                 * 
                 * 
                 */
                public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics> getProductCharacteristics() {
                    if (productCharacteristics == null) {
                        productCharacteristics = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCharacteristics>();
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
                 * {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance }
                 * 
                 * 
                 */
                public List<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance> getProductCriteriaConformance() {
                    if (productCriteriaConformance == null) {
                        productCriteriaConformance = new ArrayList<DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Commodity.ProductCriteriaConformance>();
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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationIDType" minOccurs="0"/>
                 *         &lt;element name="IdentificationTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ClassificationIdentificationTypeCodeType"/>
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
                    "identificationTypeCode"
                })
                public static class Classification {

                    @XmlElement(name = "ID")
                    protected ClassificationIdentificationIDType id;
                    @XmlElement(name = "IdentificationTypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected ClassificationIdentificationTypeCodeType identificationTypeCode;

                    /**
                     * Obtém o valor da propriedade id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ClassificationIdentificationIDType }
                     *     
                     */
                    public ClassificationIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Define o valor da propriedade id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ClassificationIdentificationIDType }
                     *     
                     */
                    public void setID(ClassificationIdentificationIDType value) {
                        this.id = value;
                    }

                    /**
                     * Obtém o valor da propriedade identificationTypeCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ClassificationIdentificationTypeCodeType }
                     *     
                     */
                    public ClassificationIdentificationTypeCodeType getIdentificationTypeCode() {
                        return identificationTypeCode;
                    }

                    /**
                     * Define o valor da propriedade identificationTypeCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ClassificationIdentificationTypeCodeType }
                     *     
                     */
                    public void setIdentificationTypeCode(ClassificationIdentificationTypeCodeType value) {
                        this.identificationTypeCode = value;
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
                 *         &lt;element name="UnitDescription" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureUnitDescriptionTextType" minOccurs="0"/>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GoodsMeasureTypeCodeType"/>
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
                    "unitDescription",
                    "typeCode",
                    "tariffQuantity"
                })
                public static class GoodsMeasure {

                    @XmlElement(name = "UnitDescription")
                    protected GoodsMeasureUnitDescriptionTextType unitDescription;
                    @XmlElement(name = "TypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected GoodsMeasureTypeCodeType typeCode;
                    @XmlElement(name = "TariffQuantity", required = true)
                    protected GoodsMeasureTariffQuantityType tariffQuantity;

                    /**
                     * Obtém o valor da propriedade unitDescription.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureUnitDescriptionTextType }
                     *     
                     */
                    public GoodsMeasureUnitDescriptionTextType getUnitDescription() {
                        return unitDescription;
                    }

                    /**
                     * Define o valor da propriedade unitDescription.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureUnitDescriptionTextType }
                     *     
                     */
                    public void setUnitDescription(GoodsMeasureUnitDescriptionTextType value) {
                        this.unitDescription = value;
                    }

                    /**
                     * Obtém o valor da propriedade typeCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodsMeasureTypeCodeType }
                     *     
                     */
                    public GoodsMeasureTypeCodeType getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * Define o valor da propriedade typeCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodsMeasureTypeCodeType }
                     *     
                     */
                    public void setTypeCode(GoodsMeasureTypeCodeType value) {
                        this.typeCode = value;
                    }

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
                 *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentificationIDType"/>
                 *         &lt;element name="IdentifierTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ProductIdentifierTypeCodeType"/>
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
                    "identifierTypeCode"
                })
                public static class Product {

                    @XmlElement(name = "ID", required = true)
                    protected ProductIdentificationIDType id;
                    @XmlElement(name = "IdentifierTypeCode", required = true)
                    @XmlSchemaType(name = "token")
                    protected ProductIdentifierTypeCodeType identifierTypeCode;

                    /**
                     * Obtém o valor da propriedade id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductIdentificationIDType }
                     *     
                     */
                    public ProductIdentificationIDType getID() {
                        return id;
                    }

                    /**
                     * Define o valor da propriedade id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductIdentificationIDType }
                     *     
                     */
                    public void setID(ProductIdentificationIDType value) {
                        this.id = value;
                    }

                    /**
                     * Obtém o valor da propriedade identifierTypeCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProductIdentifierTypeCodeType }
                     *     
                     */
                    public ProductIdentifierTypeCodeType getIdentifierTypeCode() {
                        return identifierTypeCode;
                    }

                    /**
                     * Define o valor da propriedade identifierTypeCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProductIdentifierTypeCodeType }
                     *     
                     */
                    public void setIdentifierTypeCode(ProductIdentifierTypeCodeType value) {
                        this.identifierTypeCode = value;
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
                protected DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure goodsMeasure;

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
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure }
                 *     
                 */
                public DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure getGoodsMeasure() {
                    return goodsMeasure;
                }

                /**
                 * Define o valor da propriedade goodsMeasure.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure }
                 *     
                 */
                public void setGoodsMeasure(DeclarationNoNF.GoodsShipment.GovernmentAgencyGoodsItem.Destination.GoodsMeasure value) {
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
         *         &lt;element name="Name" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}ImporterNameTextType"/>
         *         &lt;element name="Address">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
         *                   &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
            "name",
            "address"
        })
        public static class Importer {

            @XmlElement(name = "Name", required = true)
            protected ImporterNameTextType name;
            @XmlElement(name = "Address", required = true)
            protected DeclarationNoNF.GoodsShipment.Importer.Address address;

            /**
             * Obtém o valor da propriedade name.
             * 
             * @return
             *     possible object is
             *     {@link ImporterNameTextType }
             *     
             */
            public ImporterNameTextType getName() {
                return name;
            }

            /**
             * Define o valor da propriedade name.
             * 
             * @param value
             *     allowed object is
             *     {@link ImporterNameTextType }
             *     
             */
            public void setName(ImporterNameTextType value) {
                this.name = value;
            }

            /**
             * Obtém o valor da propriedade address.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.Importer.Address }
             *     
             */
            public DeclarationNoNF.GoodsShipment.Importer.Address getAddress() {
                return address;
            }

            /**
             * Define o valor da propriedade address.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.Importer.Address }
             *     
             */
            public void setAddress(DeclarationNoNF.GoodsShipment.Importer.Address value) {
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
             *         &lt;element name="CountryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressCountryCodeType"/>
             *         &lt;element name="Line" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AddressLineTextType"/>
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
                "line"
            })
            public static class Address {

                @XmlElement(name = "CountryCode", required = true)
                @XmlSchemaType(name = "token")
                protected AddressCountryCodeType countryCode;
                @XmlElement(name = "Line", required = true)
                protected AddressLineTextType line;

                /**
                 * Obtém o valor da propriedade countryCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public AddressCountryCodeType getCountryCode() {
                    return countryCode;
                }

                /**
                 * Define o valor da propriedade countryCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressCountryCodeType }
                 *     
                 */
                public void setCountryCode(AddressCountryCodeType value) {
                    this.countryCode = value;
                }

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
         *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType" minOccurs="0"/>
         *         &lt;element name="AdditionalInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="StatementCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementCodeType" minOccurs="0"/>
         *                   &lt;element name="StatementTypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalInformationStatementTypeCodeType" minOccurs="0"/>
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
            "typeCode",
            "additionalInformation"
        })
        public static class Invoice {

            @XmlElement(name = "TypeCode")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String typeCode;
            @XmlElement(name = "AdditionalInformation")
            protected DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation additionalInformation;

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
             * Obtém o valor da propriedade additionalInformation.
             * 
             * @return
             *     possible object is
             *     {@link DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation }
             *     
             */
            public DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation getAdditionalInformation() {
                return additionalInformation;
            }

            /**
             * Define o valor da propriedade additionalInformation.
             * 
             * @param value
             *     allowed object is
             *     {@link DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation }
             *     
             */
            public void setAdditionalInformation(DeclarationNoNF.GoodsShipment.Invoice.AdditionalInformation value) {
                this.additionalInformation = value;
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
                "statementTypeCode"
            })
            public static class AdditionalInformation {

                @XmlElement(name = "StatementCode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String statementCode;
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
