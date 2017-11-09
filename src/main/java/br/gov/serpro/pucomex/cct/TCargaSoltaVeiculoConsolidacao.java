
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCargaSoltaVeiculoConsolidacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCargaSoltaVeiculoConsolidacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantidade" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeSoltaVeiculo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCargaSoltaVeiculoConsolidacao", propOrder = {
    "quantidade"
})
public class TCargaSoltaVeiculoConsolidacao {

    @XmlElement(required = true)
    protected BigInteger quantidade;

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidade(BigInteger value) {
        this.quantidade = value;
    }

}
