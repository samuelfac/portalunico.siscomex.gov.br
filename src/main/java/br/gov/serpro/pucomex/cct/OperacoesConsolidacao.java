
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
 *         &lt;element name="operacaoConsolidacao" type="{http://www.pucomex.serpro.gov.br/cct}OperacaoConsolidacao"/>
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
    "operacaoConsolidacao"
})
@XmlRootElement(name = "operacoesConsolidacao", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class OperacoesConsolidacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected OperacaoConsolidacao operacaoConsolidacao;

    /**
     * Gets the value of the operacaoConsolidacao property.
     * 
     * @return
     *     possible object is
     *     {@link OperacaoConsolidacao }
     *     
     */
    public OperacaoConsolidacao getOperacaoConsolidacao() {
        return operacaoConsolidacao;
    }

    /**
     * Sets the value of the operacaoConsolidacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacaoConsolidacao }
     *     
     */
    public void setOperacaoConsolidacao(OperacaoConsolidacao value) {
        this.operacaoConsolidacao = value;
    }

}
