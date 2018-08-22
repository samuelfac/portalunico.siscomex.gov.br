
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ManifestacaoExportacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ManifestacaoExportacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoManifestacao" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica50"/>
 *         &lt;element name="tipoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}TipoDocumentoTransporte"/>
 *         &lt;element name="indCargaEnviadaDespacho" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;element name="cargaJaEmbarcada" type="{http://www.pucomex.serpro.gov.br/cct}SimNao"/>
 *         &lt;choice>
 *           &lt;element name="cnpjTransportador" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;element name="cpfTransportador" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="codigoURF" type="{http://www.pucomex.serpro.gov.br/cct}CodigoURF"/>
 *             &lt;element name="coordenadas" type="{http://www.pucomex.serpro.gov.br/cct}Coordenadas" minOccurs="0"/>
 *             &lt;element name="cnpjRespEstoqueCarga" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="codigoRA" type="{http://www.pucomex.serpro.gov.br/cct}CodigoRA"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="veiculoAereo">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAereo"/>
 *                     &lt;element name="prefixoAeronave" type="{http://www.pucomex.serpro.gov.br/cct}PrefixoAeronave"/>
 *                     &lt;element name="numeroVoo" type="{http://www.pucomex.serpro.gov.br/cct}NumeroVoo"/>
 *                     &lt;element name="dataPartidaProcedencia" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="veiculoAquaviario">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAquaViario"/>
 *                     &lt;element name="codigoIMO" type="{http://www.pucomex.serpro.gov.br/cct}CodigoIMO"/>
 *                     &lt;element name="numeroEscala" type="{http://www.pucomex.serpro.gov.br/cct}NumeroEscala"/>
 *                     &lt;element name="dataEncerramentoManifesto" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="outroModal">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioOutroVeiculo"/>
 *                     &lt;element name="identificacaoVeiculo" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoVeiculo"/>
 *                     &lt;element name="numeroDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDocumentoTransporte"/>
 *                     &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="conhecimentosCarga">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}Conhecimento" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="transporteProprio">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="consignatario" type="{http://www.pucomex.serpro.gov.br/cct}Consignatario"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="observacoes" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestacaoExportacao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "identificacaoManifestacao",
    "tipoDocumentoTransporte",
    "indCargaEnviadaDespacho",
    "cargaJaEmbarcada",
    "cnpjTransportador",
    "cpfTransportador",
    "codigoURF",
    "coordenadas",
    "cnpjRespEstoqueCarga",
    "codigoRA",
    "veiculoAereo",
    "veiculoAquaviario",
    "outroModal",
    "conhecimentosCarga",
    "transporteProprio",
    "observacoes"
})
public class ManifestacaoExportacao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String identificacaoManifestacao;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String tipoDocumentoTransporte;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String indCargaEnviadaDespacho;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String cargaJaEmbarcada;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjTransportador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cpfTransportador;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoURF;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected Coordenadas coordenadas;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String cnpjRespEstoqueCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String codigoRA;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacao.VeiculoAereo veiculoAereo;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacao.VeiculoAquaviario veiculoAquaviario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacao.OutroModal outroModal;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacao.ConhecimentosCarga conhecimentosCarga;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected ManifestacaoExportacao.TransporteProprio transporteProprio;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected String observacoes;

    /**
     * Obtém o valor da propriedade identificacaoManifestacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoManifestacao() {
        return identificacaoManifestacao;
    }

    /**
     * Define o valor da propriedade identificacaoManifestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoManifestacao(String value) {
        this.identificacaoManifestacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumentoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    /**
     * Define o valor da propriedade tipoDocumentoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoTransporte(String value) {
        this.tipoDocumentoTransporte = value;
    }

    /**
     * Obtém o valor da propriedade indCargaEnviadaDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCargaEnviadaDespacho() {
        return indCargaEnviadaDespacho;
    }

    /**
     * Define o valor da propriedade indCargaEnviadaDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCargaEnviadaDespacho(String value) {
        this.indCargaEnviadaDespacho = value;
    }

    /**
     * Obtém o valor da propriedade cargaJaEmbarcada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargaJaEmbarcada() {
        return cargaJaEmbarcada;
    }

    /**
     * Define o valor da propriedade cargaJaEmbarcada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargaJaEmbarcada(String value) {
        this.cargaJaEmbarcada = value;
    }

    /**
     * Obtém o valor da propriedade cnpjTransportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjTransportador() {
        return cnpjTransportador;
    }

    /**
     * Define o valor da propriedade cnpjTransportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjTransportador(String value) {
        this.cnpjTransportador = value;
    }

    /**
     * Obtém o valor da propriedade cpfTransportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfTransportador() {
        return cpfTransportador;
    }

    /**
     * Define o valor da propriedade cpfTransportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfTransportador(String value) {
        this.cpfTransportador = value;
    }

    /**
     * Obtém o valor da propriedade codigoURF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoURF() {
        return codigoURF;
    }

    /**
     * Define o valor da propriedade codigoURF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoURF(String value) {
        this.codigoURF = value;
    }

    /**
     * Obtém o valor da propriedade coordenadas.
     * 
     * @return
     *     possible object is
     *     {@link Coordenadas }
     *     
     */
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * Define o valor da propriedade coordenadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordenadas }
     *     
     */
    public void setCoordenadas(Coordenadas value) {
        this.coordenadas = value;
    }

    /**
     * Obtém o valor da propriedade cnpjRespEstoqueCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjRespEstoqueCarga() {
        return cnpjRespEstoqueCarga;
    }

    /**
     * Define o valor da propriedade cnpjRespEstoqueCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjRespEstoqueCarga(String value) {
        this.cnpjRespEstoqueCarga = value;
    }

    /**
     * Obtém o valor da propriedade codigoRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRA() {
        return codigoRA;
    }

    /**
     * Define o valor da propriedade codigoRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRA(String value) {
        this.codigoRA = value;
    }

    /**
     * Obtém o valor da propriedade veiculoAereo.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao.VeiculoAereo }
     *     
     */
    public ManifestacaoExportacao.VeiculoAereo getVeiculoAereo() {
        return veiculoAereo;
    }

    /**
     * Define o valor da propriedade veiculoAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao.VeiculoAereo }
     *     
     */
    public void setVeiculoAereo(ManifestacaoExportacao.VeiculoAereo value) {
        this.veiculoAereo = value;
    }

    /**
     * Obtém o valor da propriedade veiculoAquaviario.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao.VeiculoAquaviario }
     *     
     */
    public ManifestacaoExportacao.VeiculoAquaviario getVeiculoAquaviario() {
        return veiculoAquaviario;
    }

    /**
     * Define o valor da propriedade veiculoAquaviario.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao.VeiculoAquaviario }
     *     
     */
    public void setVeiculoAquaviario(ManifestacaoExportacao.VeiculoAquaviario value) {
        this.veiculoAquaviario = value;
    }

    /**
     * Obtém o valor da propriedade outroModal.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao.OutroModal }
     *     
     */
    public ManifestacaoExportacao.OutroModal getOutroModal() {
        return outroModal;
    }

    /**
     * Define o valor da propriedade outroModal.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao.OutroModal }
     *     
     */
    public void setOutroModal(ManifestacaoExportacao.OutroModal value) {
        this.outroModal = value;
    }

    /**
     * Obtém o valor da propriedade conhecimentosCarga.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao.ConhecimentosCarga }
     *     
     */
    public ManifestacaoExportacao.ConhecimentosCarga getConhecimentosCarga() {
        return conhecimentosCarga;
    }

    /**
     * Define o valor da propriedade conhecimentosCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao.ConhecimentosCarga }
     *     
     */
    public void setConhecimentosCarga(ManifestacaoExportacao.ConhecimentosCarga value) {
        this.conhecimentosCarga = value;
    }

    /**
     * Obtém o valor da propriedade transporteProprio.
     * 
     * @return
     *     possible object is
     *     {@link ManifestacaoExportacao.TransporteProprio }
     *     
     */
    public ManifestacaoExportacao.TransporteProprio getTransporteProprio() {
        return transporteProprio;
    }

    /**
     * Define o valor da propriedade transporteProprio.
     * 
     * @param value
     *     allowed object is
     *     {@link ManifestacaoExportacao.TransporteProprio }
     *     
     */
    public void setTransporteProprio(ManifestacaoExportacao.TransporteProprio value) {
        this.transporteProprio = value;
    }

    /**
     * Obtém o valor da propriedade observacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define o valor da propriedade observacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoes(String value) {
        this.observacoes = value;
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
     *         &lt;element name="conhecimento" type="{http://www.pucomex.serpro.gov.br/cct}Conhecimento" maxOccurs="unbounded"/>
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
        "conhecimento"
    })
    public static class ConhecimentosCarga {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<Conhecimento> conhecimento;

        /**
         * Gets the value of the conhecimento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conhecimento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConhecimento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Conhecimento }
         * 
         * 
         */
        public List<Conhecimento> getConhecimento() {
            if (conhecimento == null) {
                conhecimento = new ArrayList<Conhecimento>();
            }
            return this.conhecimento;
        }

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
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioOutroVeiculo"/>
     *         &lt;element name="identificacaoVeiculo" type="{http://www.pucomex.serpro.gov.br/cct}IdentificacaoVeiculo"/>
     *         &lt;element name="numeroDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}NumeroDocumentoTransporte"/>
     *         &lt;element name="dataEmissaoDocumentoTransporte" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
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
        "codigoTipoModal",
        "identificacaoVeiculo",
        "numeroDocumentoTransporte",
        "dataEmissaoDocumentoTransporte"
    })
    public static class OutroModal {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String codigoTipoModal;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String identificacaoVeiculo;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String numeroDocumentoTransporte;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String dataEmissaoDocumentoTransporte;

        /**
         * Obtém o valor da propriedade codigoTipoModal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTipoModal() {
            return codigoTipoModal;
        }

        /**
         * Define o valor da propriedade codigoTipoModal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTipoModal(String value) {
            this.codigoTipoModal = value;
        }

        /**
         * Obtém o valor da propriedade identificacaoVeiculo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentificacaoVeiculo() {
            return identificacaoVeiculo;
        }

        /**
         * Define o valor da propriedade identificacaoVeiculo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentificacaoVeiculo(String value) {
            this.identificacaoVeiculo = value;
        }

        /**
         * Obtém o valor da propriedade numeroDocumentoTransporte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDocumentoTransporte() {
            return numeroDocumentoTransporte;
        }

        /**
         * Define o valor da propriedade numeroDocumentoTransporte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDocumentoTransporte(String value) {
            this.numeroDocumentoTransporte = value;
        }

        /**
         * Obtém o valor da propriedade dataEmissaoDocumentoTransporte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataEmissaoDocumentoTransporte() {
            return dataEmissaoDocumentoTransporte;
        }

        /**
         * Define o valor da propriedade dataEmissaoDocumentoTransporte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataEmissaoDocumentoTransporte(String value) {
            this.dataEmissaoDocumentoTransporte = value;
        }

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
     *         &lt;element name="consignatario" type="{http://www.pucomex.serpro.gov.br/cct}Consignatario"/>
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
        "consignatario"
    })
    public static class TransporteProprio {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected Consignatario consignatario;

        /**
         * Obtém o valor da propriedade consignatario.
         * 
         * @return
         *     possible object is
         *     {@link Consignatario }
         *     
         */
        public Consignatario getConsignatario() {
            return consignatario;
        }

        /**
         * Define o valor da propriedade consignatario.
         * 
         * @param value
         *     allowed object is
         *     {@link Consignatario }
         *     
         */
        public void setConsignatario(Consignatario value) {
            this.consignatario = value;
        }

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
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAereo"/>
     *         &lt;element name="prefixoAeronave" type="{http://www.pucomex.serpro.gov.br/cct}PrefixoAeronave"/>
     *         &lt;element name="numeroVoo" type="{http://www.pucomex.serpro.gov.br/cct}NumeroVoo"/>
     *         &lt;element name="dataPartidaProcedencia" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
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
        "codigoTipoModal",
        "prefixoAeronave",
        "numeroVoo",
        "dataPartidaProcedencia"
    })
    public static class VeiculoAereo {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String codigoTipoModal;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String prefixoAeronave;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected BigInteger numeroVoo;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String dataPartidaProcedencia;

        /**
         * Obtém o valor da propriedade codigoTipoModal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTipoModal() {
            return codigoTipoModal;
        }

        /**
         * Define o valor da propriedade codigoTipoModal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTipoModal(String value) {
            this.codigoTipoModal = value;
        }

        /**
         * Obtém o valor da propriedade prefixoAeronave.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrefixoAeronave() {
            return prefixoAeronave;
        }

        /**
         * Define o valor da propriedade prefixoAeronave.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrefixoAeronave(String value) {
            this.prefixoAeronave = value;
        }

        /**
         * Obtém o valor da propriedade numeroVoo.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroVoo() {
            return numeroVoo;
        }

        /**
         * Define o valor da propriedade numeroVoo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroVoo(BigInteger value) {
            this.numeroVoo = value;
        }

        /**
         * Obtém o valor da propriedade dataPartidaProcedencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataPartidaProcedencia() {
            return dataPartidaProcedencia;
        }

        /**
         * Define o valor da propriedade dataPartidaProcedencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataPartidaProcedencia(String value) {
            this.dataPartidaProcedencia = value;
        }

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
     *         &lt;element name="codigoTipoModal" type="{http://www.pucomex.serpro.gov.br/cct}CodigoDominioAquaViario"/>
     *         &lt;element name="codigoIMO" type="{http://www.pucomex.serpro.gov.br/cct}CodigoIMO"/>
     *         &lt;element name="numeroEscala" type="{http://www.pucomex.serpro.gov.br/cct}NumeroEscala"/>
     *         &lt;element name="dataEncerramentoManifesto" type="{http://www.pucomex.serpro.gov.br/cct}DataPadraoServico"/>
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
        "codigoTipoModal",
        "codigoIMO",
        "numeroEscala",
        "dataEncerramentoManifesto"
    })
    public static class VeiculoAquaviario {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String codigoTipoModal;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String codigoIMO;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String numeroEscala;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String dataEncerramentoManifesto;

        /**
         * Obtém o valor da propriedade codigoTipoModal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTipoModal() {
            return codigoTipoModal;
        }

        /**
         * Define o valor da propriedade codigoTipoModal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTipoModal(String value) {
            this.codigoTipoModal = value;
        }

        /**
         * Obtém o valor da propriedade codigoIMO.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoIMO() {
            return codigoIMO;
        }

        /**
         * Define o valor da propriedade codigoIMO.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoIMO(String value) {
            this.codigoIMO = value;
        }

        /**
         * Obtém o valor da propriedade numeroEscala.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroEscala() {
            return numeroEscala;
        }

        /**
         * Define o valor da propriedade numeroEscala.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroEscala(String value) {
            this.numeroEscala = value;
        }

        /**
         * Obtém o valor da propriedade dataEncerramentoManifesto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataEncerramentoManifesto() {
            return dataEncerramentoManifesto;
        }

        /**
         * Define o valor da propriedade dataEncerramentoManifesto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataEncerramentoManifesto(String value) {
            this.dataEncerramentoManifesto = value;
        }

    }

}
