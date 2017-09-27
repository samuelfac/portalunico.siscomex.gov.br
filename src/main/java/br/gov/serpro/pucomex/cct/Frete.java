//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Frete complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
@XmlType(name = "Frete", propOrder = {
    "codigoMoedaFrete",
    "formaPagamentoFrete",
    "valorFrete"
})
public class Frete {

    @XmlElement(required = true)
    protected String codigoMoedaFrete;
    @XmlElement(required = true)
    protected String formaPagamentoFrete;
    @XmlElement(required = true)
    protected BigDecimal valorFrete;

    /**
     * Obtém o valor da propriedade codigoMoedaFrete.
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
     * Define o valor da propriedade codigoMoedaFrete.
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
     * Obtém o valor da propriedade formaPagamentoFrete.
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
     * Define o valor da propriedade formaPagamentoFrete.
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
     * Obtém o valor da propriedade valorFrete.
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
     * Define o valor da propriedade valorFrete.
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
