
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
 *         &lt;element name="recepcaoNFE" type="{http://www.pucomex.serpro.gov.br/cct}recepcaoNFE"/>
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
    "recepcaoNFE"
})
@XmlRootElement(name = "recepcoesNFE", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class RecepcoesNFE {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoNFE recepcaoNFE;

    /**
     * Gets the value of the recepcaoNFE property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoNFE }
     *     
     */
    public RecepcaoNFE getRecepcaoNFE() {
        return recepcaoNFE;
    }

    /**
     * Sets the value of the recepcaoNFE property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoNFE }
     *     
     */
    public void setRecepcaoNFE(RecepcaoNFE value) {
        this.recepcaoNFE = value;
    }

}
