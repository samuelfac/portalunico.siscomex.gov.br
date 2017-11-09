
package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RecepcaoNFF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RecepcaoNFF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="cnpjResp" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *         &lt;element name="local" type="{http://www.pucomex.serpro.gov.br/cct}Local"/>
 *         &lt;element name="referenciaLocalRecepcao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="notasFiscais">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="notaFiscalFormulario" type="{http://www.pucomex.serpro.gov.br/cct}NotaFiscalFormulario" maxOccurs="40"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transportador" type="{http://www.pucomex.serpro.gov.br/cct}Transportador"/>
 *         &lt;choice>
 *           &lt;element name="pesoAferido" type="{http://www.pucomex.serpro.gov.br/cct}Dec_9v3"/>
 *           &lt;element name="motivoNaoPesagem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250"/>
 *         &lt;/choice>
 *         &lt;element name="localArmazenamento" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica150" minOccurs="0"/>
 *         &lt;element name="codigoIdentCarga" type="{http://www.pucomex.serpro.gov.br/cct}NumeroRUC" minOccurs="0"/>
 *         &lt;element name="avariasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="divergenciasIdentificadas" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *         &lt;element name="observacoesGerais" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcaoNFF", propOrder = {
    "identificacaoRecepcao",
    "cnpjResp",
    "local",
    "referenciaLocalRecepcao",
    "notasFiscais",
    "transportador",
    "pesoAferido",
    "motivoNaoPesagem",
    "localArmazenamento",
    "codigoIdentCarga",
    "avariasIdentificadas",
    "divergenciasIdentificadas",
    "observacoesGerais"
})
public class RecepcaoNFF {

    @XmlElement(required = true)
    protected String identificacaoRecepcao;
    @XmlElement(required = true)
    protected String cnpjResp;
    @XmlElement(required = true)
    protected Local local;
    protected String referenciaLocalRecepcao;
    @XmlElement(required = true)
    protected RecepcaoNFF.NotasFiscais notasFiscais;
    @XmlElement(required = true)
    protected Transportador transportador;
    protected BigDecimal pesoAferido;
    protected String motivoNaoPesagem;
    protected String localArmazenamento;
    protected String codigoIdentCarga;
    protected String avariasIdentificadas;
    protected String divergenciasIdentificadas;
    protected String observacoesGerais;

    /**
     * Obtém o valor da propriedade identificacaoRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoRecepcao() {
        return identificacaoRecepcao;
    }

    /**
     * Define o valor da propriedade identificacaoRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoRecepcao(String value) {
        this.identificacaoRecepcao = value;
    }

    /**
     * Obtém o valor da propriedade cnpjResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjResp() {
        return cnpjResp;
    }

    /**
     * Define o valor da propriedade cnpjResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjResp(String value) {
        this.cnpjResp = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link Local }
     *     
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link Local }
     *     
     */
    public void setLocal(Local value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade referenciaLocalRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaLocalRecepcao() {
        return referenciaLocalRecepcao;
    }

    /**
     * Define o valor da propriedade referenciaLocalRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaLocalRecepcao(String value) {
        this.referenciaLocalRecepcao = value;
    }

    /**
     * Obtém o valor da propriedade notasFiscais.
     * 
     * @return
     *     possible object is
     *     {@link RecepcaoNFF.NotasFiscais }
     *     
     */
    public RecepcaoNFF.NotasFiscais getNotasFiscais() {
        return notasFiscais;
    }

    /**
     * Define o valor da propriedade notasFiscais.
     * 
     * @param value
     *     allowed object is
     *     {@link RecepcaoNFF.NotasFiscais }
     *     
     */
    public void setNotasFiscais(RecepcaoNFF.NotasFiscais value) {
        this.notasFiscais = value;
    }

    /**
     * Obtém o valor da propriedade transportador.
     * 
     * @return
     *     possible object is
     *     {@link Transportador }
     *     
     */
    public Transportador getTransportador() {
        return transportador;
    }

    /**
     * Define o valor da propriedade transportador.
     * 
     * @param value
     *     allowed object is
     *     {@link Transportador }
     *     
     */
    public void setTransportador(Transportador value) {
        this.transportador = value;
    }

    /**
     * Obtém o valor da propriedade pesoAferido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoAferido() {
        return pesoAferido;
    }

    /**
     * Define o valor da propriedade pesoAferido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoAferido(BigDecimal value) {
        this.pesoAferido = value;
    }

    /**
     * Obtém o valor da propriedade motivoNaoPesagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoNaoPesagem() {
        return motivoNaoPesagem;
    }

    /**
     * Define o valor da propriedade motivoNaoPesagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoNaoPesagem(String value) {
        this.motivoNaoPesagem = value;
    }

    /**
     * Obtém o valor da propriedade localArmazenamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    /**
     * Define o valor da propriedade localArmazenamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalArmazenamento(String value) {
        this.localArmazenamento = value;
    }

    /**
     * Obtém o valor da propriedade codigoIdentCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdentCarga() {
        return codigoIdentCarga;
    }

    /**
     * Define o valor da propriedade codigoIdentCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdentCarga(String value) {
        this.codigoIdentCarga = value;
    }

    /**
     * Obtém o valor da propriedade avariasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvariasIdentificadas() {
        return avariasIdentificadas;
    }

    /**
     * Define o valor da propriedade avariasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvariasIdentificadas(String value) {
        this.avariasIdentificadas = value;
    }

    /**
     * Obtém o valor da propriedade divergenciasIdentificadas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivergenciasIdentificadas() {
        return divergenciasIdentificadas;
    }

    /**
     * Define o valor da propriedade divergenciasIdentificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivergenciasIdentificadas(String value) {
        this.divergenciasIdentificadas = value;
    }

    /**
     * Obtém o valor da propriedade observacoesGerais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Define o valor da propriedade observacoesGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="notaFiscalFormulario" type="{http://www.pucomex.serpro.gov.br/cct}NotaFiscalFormulario" maxOccurs="40"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notaFiscalFormulario"
    })
    public static class NotasFiscais {

        @XmlElement(required = true)
        protected List<NotaFiscalFormulario> notaFiscalFormulario;

        /**
         * Gets the value of the notaFiscalFormulario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notaFiscalFormulario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotaFiscalFormulario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaFiscalFormulario }
         * 
         * 
         */
        public List<NotaFiscalFormulario> getNotaFiscalFormulario() {
            if (notaFiscalFormulario == null) {
                notaFiscalFormulario = new ArrayList<NotaFiscalFormulario>();
            }
            return this.notaFiscalFormulario;
        }

    }

}
