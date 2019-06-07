
package br.gov.serpro.pucomex.cct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transportador de nacionalidade estrangeira e tipo de transporte ocasional
 * 
 * <p>Classe Java de TransportadorMicEstrangeiroOcasionalDTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportadorMicEstrangeiroOcasionalDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFiscal" type="{http://www.pucomex.serpro.gov.br/cct}IdFiscalEstrangeiro"/>
 *         &lt;element name="pais" type="{http://www.pucomex.serpro.gov.br/cct}Pais"/>
 *         &lt;element name="licencaOriginaria" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica20" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica120"/>
 *         &lt;element name="nome" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;element name="autorizacaoOcasional" type="{http://www.pucomex.serpro.gov.br/cct}AutorizacaoOcasional"/>
 *         &lt;element name="dataVencimentoAutorizacao" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportadorMicEstrangeiroOcasionalDTO", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "idFiscal",
    "pais",
    "licencaOriginaria",
    "endereco",
    "nome",
    "autorizacaoOcasional",
    "dataVencimentoAutorizacao"
})
public class TransportadorMicEstrangeiroOcasionalDTO {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String idFiscal;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String pais;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String licencaOriginaria;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String endereco;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String nome;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String autorizacaoOcasional;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String dataVencimentoAutorizacao;

    /**
     * Obtém o valor da propriedade idFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscal() {
        return idFiscal;
    }

    /**
     * Define o valor da propriedade idFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscal(String value) {
        this.idFiscal = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade licencaOriginaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencaOriginaria() {
        return licencaOriginaria;
    }

    /**
     * Define o valor da propriedade licencaOriginaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencaOriginaria(String value) {
        this.licencaOriginaria = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade autorizacaoOcasional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacaoOcasional() {
        return autorizacaoOcasional;
    }

    /**
     * Define o valor da propriedade autorizacaoOcasional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacaoOcasional(String value) {
        this.autorizacaoOcasional = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVencimentoAutorizacao() {
        return dataVencimentoAutorizacao;
    }

    /**
     * Define o valor da propriedade dataVencimentoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVencimentoAutorizacao(String value) {
        this.dataVencimentoAutorizacao = value;
    }

}
