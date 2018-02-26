
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TConhecimentoCarga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TConhecimentoCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}NumeroConhecimento"/>
 *         &lt;element name="dataEmissaoConhecimento" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *         &lt;element name="codigoMoedaSwift" type="{http://www.pucomex.serpro.gov.br/cct}MoedaSwift" minOccurs="0"/>
 *         &lt;element name="formaPagamentoFrete" type="{http://www.pucomex.serpro.gov.br/cct}TipoFrete" minOccurs="0"/>
 *         &lt;element name="valorFrete" type="{http://www.pucomex.serpro.gov.br/cct}Dec_1202"/>
 *         &lt;element name="paisDestino" type="{http://www.pucomex.serpro.gov.br/cct}Pais" minOccurs="0"/>
 *         &lt;element name="consignadoAOrdem" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="nomeConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60" minOccurs="0"/>
 *         &lt;element name="enderecoConsignatario" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConhecimentoCarga", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "numeroConhecimento",
    "dataEmissaoConhecimento",
    "codigoMoedaSwift",
    "formaPagamentoFrete",
    "valorFrete",
    "paisDestino",
    "consignadoAOrdem",
    "nomeConsignatario",
    "enderecoConsignatario"
})
public class TConhecimentoCarga {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String numeroConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String dataEmissaoConhecimento;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoMoedaSwift;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String formaPagamentoFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected BigDecimal valorFrete;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String paisDestino;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String consignadoAOrdem;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String nomeConsignatario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String enderecoConsignatario;

    /**
     * Gets the value of the numeroConhecimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    /**
     * Sets the value of the numeroConhecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConhecimento(String value) {
        this.numeroConhecimento = value;
    }

    /**
     * Gets the value of the dataEmissaoConhecimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoConhecimento() {
        return dataEmissaoConhecimento;
    }

    /**
     * Sets the value of the dataEmissaoConhecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoConhecimento(String value) {
        this.dataEmissaoConhecimento = value;
    }

    /**
     * Gets the value of the codigoMoedaSwift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoedaSwift() {
        return codigoMoedaSwift;
    }

    /**
     * Sets the value of the codigoMoedaSwift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoedaSwift(String value) {
        this.codigoMoedaSwift = value;
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

    /**
     * Gets the value of the paisDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Sets the value of the paisDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Gets the value of the consignadoAOrdem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignadoAOrdem() {
        return consignadoAOrdem;
    }

    /**
     * Sets the value of the consignadoAOrdem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignadoAOrdem(String value) {
        this.consignadoAOrdem = value;
    }

    /**
     * Gets the value of the nomeConsignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    /**
     * Sets the value of the nomeConsignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsignatario(String value) {
        this.nomeConsignatario = value;
    }

    /**
     * Gets the value of the enderecoConsignatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoConsignatario() {
        return enderecoConsignatario;
    }

    /**
     * Sets the value of the enderecoConsignatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoConsignatario(String value) {
        this.enderecoConsignatario = value;
    }

}
