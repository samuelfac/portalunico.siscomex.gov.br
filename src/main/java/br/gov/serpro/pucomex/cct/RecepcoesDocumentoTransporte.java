
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
 *         &lt;element name="recepcaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}RecepcaoDocumentoTransporte"/>
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
    "recepcaoDocumentoTransporte"
})
@XmlRootElement(name = "recepcoesDocumentoTransporte", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class RecepcoesDocumentoTransporte {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoDocumentoTransporte recepcaoDocumentoTransporte;

    /**
     * Gets the value of the recepcaoDocumentoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoDocumentoTransporte }
     *     
     */
    public RecepcaoDocumentoTransporte getRecepcaoDocumentoTransporte() {
        return recepcaoDocumentoTransporte;
    }

    /**
     * Sets the value of the recepcaoDocumentoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoDocumentoTransporte }
     *     
     */
    public void setRecepcaoDocumentoTransporte(RecepcaoDocumentoTransporte value) {
        this.recepcaoDocumentoTransporte = value;
    }

}
