
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
 *         &lt;element name="recepcaoConteiner" type="{http://www.pucomex.serpro.gov.br/cct}RecepcaoConteiner"/>
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
    "recepcaoConteiner"
})
@XmlRootElement(name = "recepcoesConteineres", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class RecepcoesConteineres {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected RecepcaoConteiner recepcaoConteiner;

    /**
     * Gets the value of the recepcaoConteiner property.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoConteiner }
     *     
     */
    public RecepcaoConteiner getRecepcaoConteiner() {
        return recepcaoConteiner;
    }

    /**
     * Sets the value of the recepcaoConteiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoConteiner }
     *     
     */
    public void setRecepcaoConteiner(RecepcaoConteiner value) {
        this.recepcaoConteiner = value;
    }

}
