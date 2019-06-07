
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CavaloMicDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CavaloMicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placa" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
 *         &lt;element name="tara" type="{http://www.pucomex.serpro.gov.br/cct}Tara"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CavaloMicDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "placa",
    "tara"
})
public class CavaloMicDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String placa;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal tara;

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade tara.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTara() {
        return tara;
    }

    /**
     * Define o valor da propriedade tara.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTara(BigDecimal value) {
        this.tara = value;
    }

}
