
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TUnitizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUnitizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}documentosUnitizacao"/>
 *           &lt;element ref="{http://www.pucomex.serpro.gov.br/cct}conteineres"/>
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
@XmlType(name = "TUnitizacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "documentosUnitizacao",
    "conteineres"
})
public class TUnitizacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected DocumentosUnitizacao documentosUnitizacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected Conteineres conteineres;

    /**
     * Gets the value of the documentosUnitizacao property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentosUnitizacao }
     *     
     */
    public DocumentosUnitizacao getDocumentosUnitizacao() {
        return documentosUnitizacao;
    }

    /**
     * Sets the value of the documentosUnitizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentosUnitizacao }
     *     
     */
    public void setDocumentosUnitizacao(DocumentosUnitizacao value) {
        this.documentosUnitizacao = value;
    }

    /**
     * Gets the value of the conteineres property.
     * 
     * @return
     *     possible object is
     *     {@link Conteineres }
     *     
     */
    public Conteineres getConteineres() {
        return conteineres;
    }

    /**
     * Sets the value of the conteineres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conteineres }
     *     
     */
    public void setConteineres(Conteineres value) {
        this.conteineres = value;
    }

}
