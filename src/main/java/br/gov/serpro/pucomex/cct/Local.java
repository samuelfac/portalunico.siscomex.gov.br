
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Local complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Local">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *         &lt;choice>
 *           &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *           &lt;element name="coordenadas">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="latitude" type="{http://www.pucomex.serpro.gov.br/cct}Latitude"/>
 *                     &lt;element name="longitude" type="{http://www.pucomex.serpro.gov.br/cct}Longitude"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Local", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoURF",
    "codigoRA",
    "coordenadas"
})
public class Local {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String codigoURF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRA;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Local.Coordenadas coordenadas;

    /**
     * Gets the value of the codigoURF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoURF() {
        return codigoURF;
    }

    /**
     * Sets the value of the codigoURF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoURF(String value) {
        this.codigoURF = value;
    }

    /**
     * Gets the value of the codigoRA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRA() {
        return codigoRA;
    }

    /**
     * Sets the value of the codigoRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRA(String value) {
        this.codigoRA = value;
    }

    /**
     * Gets the value of the coordenadas property.
     * 
     * @return
     *     possible object is
     *     {@link Local.Coordenadas }
     *     
     */
    public Local.Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * Sets the value of the coordenadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Local.Coordenadas }
     *     
     */
    public void setCoordenadas(Local.Coordenadas value) {
        this.coordenadas = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="latitude" type="{http://www.pucomex.serpro.gov.br/cct}Latitude"/>
     *         &lt;element name="longitude" type="{http://www.pucomex.serpro.gov.br/cct}Longitude"/>
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
        "latitude",
        "longitude"
    })
    public static class Coordenadas {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String latitude;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String longitude;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

    }

}
