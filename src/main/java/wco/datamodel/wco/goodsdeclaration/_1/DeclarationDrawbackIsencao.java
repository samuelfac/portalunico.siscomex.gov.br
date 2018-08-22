
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
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackHsClassificationTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentDrawbackRecipientIdTextType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentItemIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentQuantityQuantityType;
import wco.datamodel.wco.goodsdeclaration_ds._1.AdditionalDocumentValueWithExchangeCoverAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.GovernmentProcedureCurrentCodeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceCustomsValueAmountType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceIdentificationIDType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceIssueDateTimeType;
import wco.datamodel.wco.goodsdeclaration_ds._1.InvoiceQuantityQuantityType;


/**
 * <p>Classe Java de DeclarationDrawbackIsencao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationDrawbackIsencao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *                             &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
 *                             &lt;element name="AdditionalDocument" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType"/>
 *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType"/>
 *                                       &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType"/>
 *                                       &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType"/>
 *                                       &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType"/>
 *                                       &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
 *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType"/>
 *                                       &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
 *                                                 &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType"/>
 *                                                 &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
 *                                                 &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceCustomsValueAmountType"/>
 *                                                 &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType"/>
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
@XmlType(name = "DeclarationDrawbackIsencao", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", propOrder = {
    "goodsShipment"
})
public class DeclarationDrawbackIsencao {

    @XmlElement(name = "GoodsShipment", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
    protected List<DeclarationDrawbackIsencao.GoodsShipment> goodsShipment;

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
     * {@link DeclarationDrawbackIsencao.GoodsShipment }
     * 
     * 
     */
    public List<DeclarationDrawbackIsencao.GoodsShipment> getGoodsShipment() {
        if (goodsShipment == null) {
            goodsShipment = new ArrayList<DeclarationDrawbackIsencao.GoodsShipment>();
        }
        return this.goodsShipment;
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
     *                   &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
     *                   &lt;element name="AdditionalDocument" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType"/>
     *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType"/>
     *                             &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType"/>
     *                             &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType"/>
     *                             &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType"/>
     *                             &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
     *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType"/>
     *                             &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
     *                                       &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType"/>
     *                                       &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
     *                                       &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceCustomsValueAmountType"/>
     *                                       &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType"/>
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
        "governmentAgencyGoodsItem"
    })
    public static class GoodsShipment {

        @XmlElement(name = "GovernmentAgencyGoodsItem", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
        protected List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem> governmentAgencyGoodsItem;

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
         * {@link DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem }
         * 
         * 
         */
        public List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
            if (governmentAgencyGoodsItem == null) {
                governmentAgencyGoodsItem = new ArrayList<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem>();
            }
            return this.governmentAgencyGoodsItem;
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
         *         &lt;element name="SequenceNumeric" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}GovernmentAgencyGoodsItemSequenceNumericType"/>
         *         &lt;element name="AdditionalDocument" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType"/>
         *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType"/>
         *                   &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType"/>
         *                   &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType"/>
         *                   &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType"/>
         *                   &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
         *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType"/>
         *                   &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
         *                             &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType"/>
         *                             &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
         *                             &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceCustomsValueAmountType"/>
         *                             &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType"/>
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
            "additionalDocument",
            "governmentProcedure"
        })
        public static class GovernmentAgencyGoodsItem {

            @XmlElement(name = "SequenceNumeric", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
            protected BigDecimal sequenceNumeric;
            @XmlElement(name = "AdditionalDocument", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
            protected List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> additionalDocument;
            @XmlElement(name = "GovernmentProcedure", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
            protected List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> governmentProcedure;

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
             * {@link DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument }
             * 
             * 
             */
            public List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument> getAdditionalDocument() {
                if (additionalDocument == null) {
                    additionalDocument = new ArrayList<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument>();
                }
                return this.additionalDocument;
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
             * {@link DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure }
             * 
             * 
             */
            public List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure> getGovernmentProcedure() {
                if (governmentProcedure == null) {
                    governmentProcedure = new ArrayList<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.GovernmentProcedure>();
                }
                return this.governmentProcedure;
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
             *         &lt;element name="CategoryCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentCategoryCodeType"/>
             *         &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentIdentificationIDType"/>
             *         &lt;element name="DrawbackHsClassification" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackHsClassificationTextType"/>
             *         &lt;element name="DrawbackRecipientId" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentDrawbackRecipientIdTextType"/>
             *         &lt;element name="ValueWithExchangeCoverAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentValueWithExchangeCoverAmountType"/>
             *         &lt;element name="ItemID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentItemIDType" minOccurs="0"/>
             *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}AdditionalDocumentQuantityQuantityType"/>
             *         &lt;element name="Invoice" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ID" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIdentificationIDType"/>
             *                   &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType"/>
             *                   &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
             *                   &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceCustomsValueAmountType"/>
             *                   &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType"/>
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
                "categoryCode",
                "id",
                "drawbackHsClassification",
                "drawbackRecipientId",
                "valueWithExchangeCoverAmount",
                "itemID",
                "quantityQuantity",
                "invoice"
            })
            public static class AdditionalDocument {

                @XmlElement(name = "CategoryCode", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                @XmlSchemaType(name = "token")
                protected AdditionalDocumentCategoryCodeType categoryCode;
                @XmlElement(name = "ID", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                protected AdditionalDocumentIdentificationIDType id;
                @XmlElement(name = "DrawbackHsClassification", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                protected AdditionalDocumentDrawbackHsClassificationTextType drawbackHsClassification;
                @XmlElement(name = "DrawbackRecipientId", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                protected AdditionalDocumentDrawbackRecipientIdTextType drawbackRecipientId;
                @XmlElement(name = "ValueWithExchangeCoverAmount", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                protected AdditionalDocumentValueWithExchangeCoverAmountType valueWithExchangeCoverAmount;
                @XmlElement(name = "ItemID", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
                protected AdditionalDocumentItemIDType itemID;
                @XmlElement(name = "QuantityQuantity", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                protected AdditionalDocumentQuantityQuantityType quantityQuantity;
                @XmlElement(name = "Invoice", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1")
                protected List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Invoice> invoice;

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
                 * Obtém o valor da propriedade drawbackHsClassification.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentDrawbackHsClassificationTextType }
                 *     
                 */
                public AdditionalDocumentDrawbackHsClassificationTextType getDrawbackHsClassification() {
                    return drawbackHsClassification;
                }

                /**
                 * Define o valor da propriedade drawbackHsClassification.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentDrawbackHsClassificationTextType }
                 *     
                 */
                public void setDrawbackHsClassification(AdditionalDocumentDrawbackHsClassificationTextType value) {
                    this.drawbackHsClassification = value;
                }

                /**
                 * Obtém o valor da propriedade drawbackRecipientId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentDrawbackRecipientIdTextType }
                 *     
                 */
                public AdditionalDocumentDrawbackRecipientIdTextType getDrawbackRecipientId() {
                    return drawbackRecipientId;
                }

                /**
                 * Define o valor da propriedade drawbackRecipientId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentDrawbackRecipientIdTextType }
                 *     
                 */
                public void setDrawbackRecipientId(AdditionalDocumentDrawbackRecipientIdTextType value) {
                    this.drawbackRecipientId = value;
                }

                /**
                 * Obtém o valor da propriedade valueWithExchangeCoverAmount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalDocumentValueWithExchangeCoverAmountType }
                 *     
                 */
                public AdditionalDocumentValueWithExchangeCoverAmountType getValueWithExchangeCoverAmount() {
                    return valueWithExchangeCoverAmount;
                }

                /**
                 * Define o valor da propriedade valueWithExchangeCoverAmount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalDocumentValueWithExchangeCoverAmountType }
                 *     
                 */
                public void setValueWithExchangeCoverAmount(AdditionalDocumentValueWithExchangeCoverAmountType value) {
                    this.valueWithExchangeCoverAmount = value;
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
                 * Gets the value of the invoice property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the invoice property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInvoice().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Invoice }
                 * 
                 * 
                 */
                public List<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Invoice> getInvoice() {
                    if (invoice == null) {
                        invoice = new ArrayList<DeclarationDrawbackIsencao.GoodsShipment.GovernmentAgencyGoodsItem.AdditionalDocument.Invoice>();
                    }
                    return this.invoice;
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
                 *         &lt;element name="IssueDateTime" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceIssueDateTimeType"/>
                 *         &lt;element name="TypeCode" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceTypeCodeType"/>
                 *         &lt;element name="CustomsValueAmount" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceCustomsValueAmountType"/>
                 *         &lt;element name="QuantityQuantity" type="{urn:wco:datamodel:WCO:GoodsDeclaration_DS:1}InvoiceQuantityQuantityType"/>
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
                    "issueDateTime",
                    "typeCode",
                    "customsValueAmount",
                    "quantityQuantity"
                })
                public static class Invoice {

                    @XmlElement(name = "ID", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                    protected InvoiceIdentificationIDType id;
                    @XmlElement(name = "IssueDateTime", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                    protected InvoiceIssueDateTimeType issueDateTime;
                    @XmlElement(name = "TypeCode", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String typeCode;
                    @XmlElement(name = "CustomsValueAmount", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                    protected InvoiceCustomsValueAmountType customsValueAmount;
                    @XmlElement(name = "QuantityQuantity", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
                    protected InvoiceQuantityQuantityType quantityQuantity;

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
                     * Obtém o valor da propriedade issueDateTime.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InvoiceIssueDateTimeType }
                     *     
                     */
                    public InvoiceIssueDateTimeType getIssueDateTime() {
                        return issueDateTime;
                    }

                    /**
                     * Define o valor da propriedade issueDateTime.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InvoiceIssueDateTimeType }
                     *     
                     */
                    public void setIssueDateTime(InvoiceIssueDateTimeType value) {
                        this.issueDateTime = value;
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
                     * Obtém o valor da propriedade customsValueAmount.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InvoiceCustomsValueAmountType }
                     *     
                     */
                    public InvoiceCustomsValueAmountType getCustomsValueAmount() {
                        return customsValueAmount;
                    }

                    /**
                     * Define o valor da propriedade customsValueAmount.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InvoiceCustomsValueAmountType }
                     *     
                     */
                    public void setCustomsValueAmount(InvoiceCustomsValueAmountType value) {
                        this.customsValueAmount = value;
                    }

                    /**
                     * Obtém o valor da propriedade quantityQuantity.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InvoiceQuantityQuantityType }
                     *     
                     */
                    public InvoiceQuantityQuantityType getQuantityQuantity() {
                        return quantityQuantity;
                    }

                    /**
                     * Define o valor da propriedade quantityQuantity.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InvoiceQuantityQuantityType }
                     *     
                     */
                    public void setQuantityQuantity(InvoiceQuantityQuantityType value) {
                        this.quantityQuantity = value;
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

                @XmlElement(name = "CurrentCode", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration:1", required = true)
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

        }

    }

}
