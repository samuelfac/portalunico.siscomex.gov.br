
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Frete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMoedaFrete" type="{http://www.pucomex.serpro.gov.br/cct}MoedaSwift"/>
 *         &lt;element name="formaPagamentoFrete" type="{http://www.pucomex.serpro.gov.br/cct}TipoFrete"/>
 *         &lt;element name="valorFrete" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frete", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "codigoMoedaFrete",
    "formaPagamentoFrete",
    "valorFrete"
})
public class Frete {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String codigoMoedaFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String formaPagamentoFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal valorFrete;

    /**
     * Gets the value of the codigoMoedaFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoedaFrete() {
        return codigoMoedaFrete;
    }

    /**
     * Sets the value of the codigoMoedaFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoedaFrete(String value) {
        this.codigoMoedaFrete = value;
    }

    /**
     * Gets the value of the formaPagamentoFrete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagamentoFrete() {
        return formaPagamentoFrete;
    }

    /**
     * Sets the value of the formaPagamentoFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagamentoFrete(String value) {
        this.formaPagamentoFrete = value;
    }

    /**
     * Gets the value of the valorFrete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    /**
     * Sets the value of the valorFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFrete(BigDecimal value) {
        this.valorFrete = value;
    }

}
