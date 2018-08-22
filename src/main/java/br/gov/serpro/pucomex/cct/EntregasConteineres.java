
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
     * Obtém o valor da propriedade entregaConteiner.
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
     * Define o valor da propriedade entregaConteiner.
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
