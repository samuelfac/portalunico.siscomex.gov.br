//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:25:53 AM BRT 
//


package wco.datamodel.wco.goodsdeclaration_ds._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ReferencedInvoiceIssueDateTimeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReferencedInvoiceIssueDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateTimeString">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="formatCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedInvoiceIssueDateTimeType", propOrder = {
    "dateTimeString",
    "dateTime"
})
public class ReferencedInvoiceIssueDateTimeType {

    @XmlElement(name = "DateTimeString")
    protected ReferencedInvoiceIssueDateTimeType.DateTimeString dateTimeString;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Obtém o valor da propriedade dateTimeString.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedInvoiceIssueDateTimeType.DateTimeString }
     *     
     */
    public ReferencedInvoiceIssueDateTimeType.DateTimeString getDateTimeString() {
        return dateTimeString;
    }

    /**
     * Define o valor da propriedade dateTimeString.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedInvoiceIssueDateTimeType.DateTimeString }
     *     
     */
    public void setDateTimeString(ReferencedInvoiceIssueDateTimeType.DateTimeString value) {
        this.dateTimeString = value;
    }

    /**
     * Obtém o valor da propriedade dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define o valor da propriedade dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="formatCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DateTimeString {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "formatCode", required = true)
        protected String formatCode;

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade formatCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormatCode() {
            return formatCode;
        }

        /**
         * Define o valor da propriedade formatCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormatCode(String value) {
            this.formatCode = value;
        }

    }

}
