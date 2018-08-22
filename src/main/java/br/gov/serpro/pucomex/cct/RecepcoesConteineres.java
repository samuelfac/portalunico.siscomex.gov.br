
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
     * Obtém o valor da propriedade recepcaoConteiner.
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
     * Define o valor da propriedade recepcaoConteiner.
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
