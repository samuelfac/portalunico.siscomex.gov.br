
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemNFF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "ItemNFF", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroItem",
    "codigoProduto",
    "ncm",
    "descricaoProduto",
    "cfop",
    "valorTotal",
    "quantidadeMedidaEstatistica"
})
public class ItemNFF {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroItem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String codigoProduto;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String ncm;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String descricaoProduto;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cfop;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal valorTotal;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String quantidadeMedidaEstatistica;

    /**
     * Gets the value of the numeroItem property.
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
     * Sets the value of the numeroItem property.
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
     * Gets the value of the codigoProduto property.
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
     * Sets the value of the codigoProduto property.
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
     * Gets the value of the ncm property.
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
     * Sets the value of the ncm property.
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
     * Gets the value of the descricaoProduto property.
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
     * Sets the value of the descricaoProduto property.
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
     * Gets the value of the cfop property.
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
     * Sets the value of the cfop property.
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
     * Gets the value of the valorTotal property.
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
     * Sets the value of the valorTotal property.
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
     * Gets the value of the quantidadeMedidaEstatistica property.
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
     * Sets the value of the quantidadeMedidaEstatistica property.
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
