
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TItemDUE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TItemDUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroDUE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numeroItem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ncm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unidadeEstatistica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantidadeExportada" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TItemDUE", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroDUE",
    "numeroItem",
    "ncm",
    "unidadeEstatistica",
    "quantidadeExportada"
})
public class TItemDUE {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger numeroDUE;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger numeroItem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String ncm;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String unidadeEstatistica;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigInteger quantidadeExportada;

    /**
     * Obtém o valor da propriedade numeroDUE.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDUE() {
        return numeroDUE;
    }

    /**
     * Define o valor da propriedade numeroDUE.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDUE(BigInteger value) {
        this.numeroDUE = value;
    }

    /**
     * Obtém o valor da propriedade numeroItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroItem() {
        return numeroItem;
    }

    /**
     * Define o valor da propriedade numeroItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroItem(BigInteger value) {
        this.numeroItem = value;
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
     * Obtém o valor da propriedade unidadeEstatistica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeEstatistica() {
        return unidadeEstatistica;
    }

    /**
     * Define o valor da propriedade unidadeEstatistica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeEstatistica(String value) {
        this.unidadeEstatistica = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeExportada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeExportada() {
        return quantidadeExportada;
    }

    /**
     * Define o valor da propriedade quantidadeExportada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeExportada(BigInteger value) {
        this.quantidadeExportada = value;
    }

}
