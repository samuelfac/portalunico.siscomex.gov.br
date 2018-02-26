
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEmbalagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEmbalagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoEmbalagem" type="{http://www.pucomex.serpro.gov.br/cct}TipoEmbalagem"/>
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
@XmlType(name = "TEmbalagem", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "tipoEmbalagem",
    "quantidade"
})
public class TEmbalagem {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String tipoEmbalagem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger quantidade;

    /**
     * Gets the value of the tipoEmbalagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    /**
     * Sets the value of the tipoEmbalagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalagem(String value) {
        this.tipoEmbalagem = value;
    }

    /**
     * Gets the value of the quantidade property.
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
     * Sets the value of the quantidade property.
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
