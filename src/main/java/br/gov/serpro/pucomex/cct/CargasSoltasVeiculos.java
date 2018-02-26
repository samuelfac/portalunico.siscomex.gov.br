
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
     * Gets the value of the cargaSoltaVeiculo property.
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
     * Sets the value of the cargaSoltaVeiculo property.
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
