
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
 *         &lt;element name="entregaConteiner" type="{http://www.pucomex.serpro.gov.br/cct}EntregaConteiner"/>
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
    "entregaConteiner"
})
@XmlRootElement(name = "entregasConteineres", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class EntregasConteineres {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected EntregaConteiner entregaConteiner;

    /**
     * Gets the value of the entregaConteiner property.
     * 
     * @return
     *     possible object is
     *     {@link EntregaConteiner }
     *     
     */
    public EntregaConteiner getEntregaConteiner() {
        return entregaConteiner;
    }

    /**
     * Sets the value of the entregaConteiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntregaConteiner }
     *     
     */
    public void setEntregaConteiner(EntregaConteiner value) {
        this.entregaConteiner = value;
    }

}
