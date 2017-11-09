
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlRootElement(name = "recepcoesNFF")
public class RecepcoesNFF {

    @XmlElement(required = true)
    protected RecepcaoNFF recepcaoNFF;

    /**
     * Obtém o valor da propriedade recepcaoNFF.
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
     * Define o valor da propriedade recepcaoNFF.
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
