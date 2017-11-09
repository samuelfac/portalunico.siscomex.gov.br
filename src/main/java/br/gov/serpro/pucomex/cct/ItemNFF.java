
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ItemNFF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemNFF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroItem">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{1,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoProduto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ncm" type="{http://www.pucomex.serpro.gov.br/cct}NCM"/>
 *         &lt;element name="descricaoProduto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cfop" type="{http://www.pucomex.serpro.gov.br/cct}CFOP"/>
 *         &lt;element name="valorTotal" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/>
 *         &lt;element name="quantidadeMedidaEstatistica" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1104v"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNFF", propOrder = {
    "numeroItem",
    "codigoProduto",
    "ncm",
    "descricaoProduto",
    "cfop",
    "valorTotal",
    "quantidadeMedidaEstatistica"
})
public class ItemNFF {

    @XmlElement(required = true)
    protected String numeroItem;
    @XmlElement(required = true)
    protected String codigoProduto;
    @XmlElement(required = true)
    protected String ncm;
    @XmlElement(required = true)
    protected String descricaoProduto;
    @XmlElement(required = true)
    protected String cfop;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    @XmlElement(required = true)
    protected String quantidadeMedidaEstatistica;

    /**
     * Obtém o valor da propriedade numeroItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroItem() {
        return numeroItem;
    }

    /**
     * Define o valor da propriedade numeroItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroItem(String value) {
        this.numeroItem = value;
    }

    /**
     * Obtém o valor da propriedade codigoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Define o valor da propriedade codigoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProduto(String value) {
        this.codigoProduto = value;
    }

    /**
     * Obtém o valor da propriedade ncm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcm() {
        return ncm;
    }

    /**
     * Define o valor da propriedade ncm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcm(String value) {
        this.ncm = value;
    }

    /**
     * Obtém o valor da propriedade descricaoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * Define o valor da propriedade descricaoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProduto(String value) {
        this.descricaoProduto = value;
    }

    /**
     * Obtém o valor da propriedade cfop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Define o valor da propriedade cfop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfop(String value) {
        this.cfop = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeMedidaEstatistica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeMedidaEstatistica() {
        return quantidadeMedidaEstatistica;
    }

    /**
     * Define o valor da propriedade quantidadeMedidaEstatistica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeMedidaEstatistica(String value) {
        this.quantidadeMedidaEstatistica = value;
    }

}
