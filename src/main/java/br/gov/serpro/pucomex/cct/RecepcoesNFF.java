
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
 *         &lt;element name="recepcaoNFF" type="{http://www.pucomex.serpro.gov.br/cct}RecepcaoNFF"/>
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
    "recepcaoNFF"
})
@XmlRootElement(name = "recepcoesNFF", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class RecepcoesNFF {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoNFF recepcaoNFF;

    /**
     * Gets the value of the recepcaoNFF property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoNFF }
     *     
     */
    public RecepcaoNFF getRecepcaoNFF() {
        return recepcaoNFF;
    }

    /**
     * Sets the value of the recepcaoNFF property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoNFF }
     *     
     */
    public void setRecepcaoNFF(RecepcaoNFF value) {
        this.recepcaoNFF = value;
    }

}
