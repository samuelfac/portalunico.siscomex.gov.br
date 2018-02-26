
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDesunitizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDesunitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="numeroConteiner" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConteiner"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentos"/>
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
@XmlType(name = "TDesunitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroConteiner",
    "documentos"
})
public class TDesunitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroConteiner;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Documentos documentos;

    /**
     * Gets the value of the numeroConteiner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    /**
     * Sets the value of the numeroConteiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConteiner(String value) {
        this.numeroConteiner = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link Documentos }
     *     
     */
    public Documentos getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentos }
     *     
     */
    public void setDocumentos(Documentos value) {
        this.documentos = value;
    }

}
