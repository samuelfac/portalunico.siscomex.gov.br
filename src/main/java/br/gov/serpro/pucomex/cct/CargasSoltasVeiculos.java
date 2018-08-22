
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
 *         &lt;element name="cargaSoltaVeiculo" type="{http://www.pucomex.serpro.gov.br/cct}TCargaSoltaVeiculoConsolidacao"/>
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
    "cargaSoltaVeiculo"
})
@XmlRootElement(name = "cargasSoltasVeiculos", namespace = "http://www.pucomex.serpro.gov.br/cct")
public class CargasSoltasVeiculos {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected TCargaSoltaVeiculoConsolidacao cargaSoltaVeiculo;

    /**
     * Obtém o valor da propriedade cargaSoltaVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link TCargaSoltaVeiculoConsolidacao }
     *     
     */
    public TCargaSoltaVeiculoConsolidacao getCargaSoltaVeiculo() {
        return cargaSoltaVeiculo;
    }

    /**
     * Define o valor da propriedade cargaSoltaVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link TCargaSoltaVeiculoConsolidacao }
     *     
     */
    public void setCargaSoltaVeiculo(TCargaSoltaVeiculoConsolidacao value) {
        this.cargaSoltaVeiculo = value;
    }

}
