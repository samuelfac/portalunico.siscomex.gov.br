
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
 * <p>Java class for ReferencedInvoiceIssueDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "ReferencedInvoiceIssueDateTimeType", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1", propOrder = {
    "dateTimeString",
    "dateTime"
})
public class ReferencedInvoiceIssueDateTimeType {

    @XmlElement(name = "DateTimeString", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
    protected ReferencedInvoiceIssueDateTimeType.DateTimeString dateTimeString;
    @XmlElement(name = "DateTime", namespace = "urn:wco:datamodel:WCO:GoodsDeclaration_DS:1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the dateTimeString property.
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
     * Sets the value of the dateTimeString property.
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
     * Gets the value of the dateTime property.
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
     * Sets the value of the dateTime property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the value property.
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
         * Sets the value of the value property.
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
         * Gets the value of the formatCode property.
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
         * Sets the value of the formatCode property.
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
