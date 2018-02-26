
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConteinerExtend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConteinerExtend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}TConteiner">
 *       &lt;choice>
 *         &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *         &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConteinerExtend", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "pesoAferido",
    "motivoNaoPesagem"
})
public class ConteinerExtend
    extends TConteiner
{

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal pesoAferido;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String motivoNaoPesagem;

    /**
     * Gets the value of the pesoAferido property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    /**
     * Sets the value of the pesoAferido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoAferido(BigDecimal value) {
        this.pesoAferido = value;
    }

    /**
     * Gets the value of the motivoNaoPesagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    /**
     * Sets the value of the motivoNaoPesagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoPesagem(String value) {
        this.motivoNaoPesagem = value;
    }

}
