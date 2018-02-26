
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConteinerPesoBrutoExtend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConteinerPesoBrutoExtend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pucomex.serpro.gov.br/cct}TConteiner">
 *       &lt;choice>
 *         &lt;element name="pesoBruto" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConteinerPesoBrutoExtend", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "pesoBruto"
})
public class ConteinerPesoBrutoExtend
    extends TConteiner
{

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected BigDecimal pesoBruto;

    /**
     * Gets the value of the pesoBruto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Sets the value of the pesoBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBruto(BigDecimal value) {
        this.pesoBruto = value;
    }

}
