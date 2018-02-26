
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDocumentoCargaUnitizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaUnitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}cargaSoltaVeiculo" minOccurs="0"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}granel" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentoCargaUnitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroDUE",
    "numeroRUC",
    "cargaSoltaVeiculo",
    "granel"
})
public class TDocumentoCargaUnitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroDUE;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroRUC;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected CargaSoltaVeiculo cargaSoltaVeiculo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Granel granel;

    /**
     * Gets the value of the numeroDUE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDUE() {
        return numeroDUE;
    }

    /**
     * Sets the value of the numeroDUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDUE(String value) {
        this.numeroDUE = value;
    }

    /**
     * Gets the value of the numeroRUC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRUC() {
        return numeroRUC;
    }

    /**
     * Sets the value of the numeroRUC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRUC(String value) {
        this.numeroRUC = value;
    }

    /**
     * Gets the value of the cargaSoltaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link CargaSoltaVeiculo }
     *     
     */
    public CargaSoltaVeiculo getCargaSoltaVeiculo() {
        return cargaSoltaVeiculo;
    }

    /**
     * Sets the value of the cargaSoltaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargaSoltaVeiculo }
     *     
     */
    public void setCargaSoltaVeiculo(CargaSoltaVeiculo value) {
        this.cargaSoltaVeiculo = value;
    }

    /**
     * Gets the value of the granel property.
     * 
     * @return
     *     possible object is
     *     {@link Granel }
     *     
     */
    public Granel getGranel() {
        return granel;
    }

    /**
     * Sets the value of the granel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Granel }
     *     
     */
    public void setGranel(Granel value) {
        this.granel = value;
    }

}
