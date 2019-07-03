
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TDUIMP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDUIMP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroDUIMP" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numeroRUC" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDUIMP", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroDUIMP",
    "numeroRUC"
})
public class TDUIMP {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger numeroDUIMP;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger numeroRUC;

    /**
     * Obtém o valor da propriedade numeroDUIMP.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDUIMP() {
        return numeroDUIMP;
    }

    /**
     * Define o valor da propriedade numeroDUIMP.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDUIMP(BigInteger value) {
        this.numeroDUIMP = value;
    }

    /**
     * Obtém o valor da propriedade numeroRUC.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroRUC() {
        return numeroRUC;
    }

    /**
     * Define o valor da propriedade numeroRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroRUC(BigInteger value) {
        this.numeroRUC = value;
    }

}
