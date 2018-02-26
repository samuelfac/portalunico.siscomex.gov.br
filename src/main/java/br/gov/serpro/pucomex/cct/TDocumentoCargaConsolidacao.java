
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDocumentoCargaConsolidacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDocumentoCargaConsolidacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="numeroDUE" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDUE"/>
 *           &lt;element name="numeroRUC" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC"/>
 *         &lt;/choice>
 *         &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}TConhecimentoCarga"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentoCargaConsolidacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroDUE",
    "numeroRUC",
    "conhecimento"
})
public class TDocumentoCargaConsolidacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroDUE;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String numeroRUC;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TConhecimentoCarga conhecimento;

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
     * Gets the value of the conhecimento property.
     * 
     * @return
     *     possible object is
     *     {@link TConhecimentoCarga }
     *     
     */
    public TConhecimentoCarga getConhecimento() {
        return conhecimento;
    }

    /**
     * Sets the value of the conhecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TConhecimentoCarga }
     *     
     */
    public void setConhecimento(TConhecimentoCarga value) {
        this.conhecimento = value;
    }

}
