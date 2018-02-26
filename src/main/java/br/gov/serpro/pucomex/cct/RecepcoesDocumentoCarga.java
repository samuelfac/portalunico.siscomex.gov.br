
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="recepcaoDocumentoCarga" type="{http://www.pucomex.serpro.gov.br/cct}RecepcaoDocumentoCarga"/>
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
    "recepcaoDocumentoCarga"
})
@XmlRootElement(name = "recepcoesDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class RecepcoesDocumentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoDocumentoCarga recepcaoDocumentoCarga;

    /**
     * Gets the value of the recepcaoDocumentoCarga property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoDocumentoCarga }
     *     
     */
    public RecepcaoDocumentoCarga getRecepcaoDocumentoCarga() {
        return recepcaoDocumentoCarga;
    }

    /**
     * Sets the value of the recepcaoDocumentoCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoDocumentoCarga }
     *     
     */
    public void setRecepcaoDocumentoCarga(RecepcaoDocumentoCarga value) {
        this.recepcaoDocumentoCarga = value;
    }

}
