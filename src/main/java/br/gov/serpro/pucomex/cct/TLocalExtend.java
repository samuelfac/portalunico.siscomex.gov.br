
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLocalExtend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLocalExtend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *           &lt;element name="coordenadas" type="{http://www.pucomex.serpro.gov.br/cct}Coordenadas"/>
 *           &lt;element name="cnpjRespEstoqueCarga" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLocalExtend", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoURF",
    "coordenadas",
    "cnpjRespEstoqueCarga",
    "codigoRA"
})
public class TLocalExtend {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoURF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Coordenadas coordenadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjRespEstoqueCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRA;

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
     * Gets the value of the coordenadas property.
     * 
     * @return
     *     possible object is
     *     {@link Coordenadas }
     *     
     */
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * Sets the value of the coordenadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordenadas }
     *     
     */
    public void setCoordenadas(Coordenadas value) {
        this.coordenadas = value;
    }

    /**
     * Gets the value of the cnpjRespEstoqueCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjRespEstoqueCarga() {
        return cnpjRespEstoqueCarga;
    }

    /**
     * Sets the value of the cnpjRespEstoqueCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjRespEstoqueCarga(String value) {
        this.cnpjRespEstoqueCarga = value;
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

}
