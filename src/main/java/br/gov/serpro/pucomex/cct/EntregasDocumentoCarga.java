
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
 *         &lt;element name="entregaDocumentoCarga" type="{http://www.pucomex.serpro.gov.br/cct}EntregaDocumentoCarga"/>
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
    "entregaDocumentoCarga"
})
@XmlRootElement(name = "entregasDocumentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class EntregasDocumentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaDocumentoCarga entregaDocumentoCarga;

    /**
     * Gets the value of the entregaDocumentoCarga property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaDocumentoCarga }
     *     
     */
    public EntregaDocumentoCarga getEntregaDocumentoCarga() {
        return entregaDocumentoCarga;
    }

    /**
     * Sets the value of the entregaDocumentoCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaDocumentoCarga }
     *     
     */
    public void setEntregaDocumentoCarga(EntregaDocumentoCarga value) {
        this.entregaDocumentoCarga = value;
    }

}
