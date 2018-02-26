
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManifestacaoExportacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 *                     &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="unbounded"/>
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
     * Gets the value of the identificacaoManifestacao property.
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
     * Sets the value of the identificacaoManifestacao property.
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
     * Gets the value of the tipoDocumentoTransporte property.
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
     * Sets the value of the tipoDocumentoTransporte property.
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
     * Gets the value of the indCargaEnviadaDespacho property.
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
     * Sets the value of the indCargaEnviadaDespacho property.
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
     * Gets the value of the cargaJaEmbarcada property.
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
     * Sets the value of the cargaJaEmbarcada property.
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
     * Gets the value of the cnpjTransportador property.
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
     * Sets the value of the cnpjTransportador property.
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
     * Gets the value of the cpfTransportador property.
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
     * Sets the value of the cpfTransportador property.
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
     * Gets the value of the codigoURF property.
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
     * Sets the value of the codigoURF property.
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
     * Gets the value of the coordenadas property.
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
     * Sets the value of the coordenadas property.
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
     * Gets the value of the cnpjRespEstoqueCarga property.
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
     * Sets the value of the cnpjRespEstoqueCarga property.
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
     * Gets the value of the codigoRA property.
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
     * Sets the value of the codigoRA property.
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
     * Gets the value of the veiculoAereo property.
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
     * Sets the value of the veiculoAereo property.
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
     * Gets the value of the veiculoAquaviario property.
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
     * Sets the value of the veiculoAquaviario property.
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
     * Gets the value of the outroModal property.
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
     * Sets the value of the outroModal property.
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
     * Gets the value of the conhecimentosCarga property.
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
     * Sets the value of the conhecimentosCarga property.
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
     * Gets the value of the transporteProprio property.
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
     * Sets the value of the transporteProprio property.
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
     * Gets the value of the observacoes property.
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
     * Sets the value of the observacoes property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the codigoTipoModal property.
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
         * Sets the value of the codigoTipoModal property.
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
         * Gets the value of the identificacaoVeiculo property.
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
         * Sets the value of the identificacaoVeiculo property.
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
         * Gets the value of the numeroDocumentoTransporte property.
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
         * Sets the value of the numeroDocumentoTransporte property.
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
         * Gets the value of the dataEmissaoDocumentoTransporte property.
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
         * Sets the value of the dataEmissaoDocumentoTransporte property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dadosCarga" type="{http://www.pucomex.serpro.gov.br/cct}DadosCarga" maxOccurs="unbounded"/>
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
        "dadosCarga"
    })
    public static class TransporteProprio {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<DadosCarga> dadosCarga;

        /**
         * Gets the value of the dadosCarga property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosCarga property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosCarga().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DadosCarga }
         * 
         * 
         */
        public List<DadosCarga> getDadosCarga() {
            if (dadosCarga == null) {
                dadosCarga = new ArrayList<DadosCarga>();
            }
            return this.dadosCarga;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the codigoTipoModal property.
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
         * Sets the value of the codigoTipoModal property.
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
         * Gets the value of the prefixoAeronave property.
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
         * Sets the value of the prefixoAeronave property.
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
         * Gets the value of the numeroVoo property.
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
         * Sets the value of the numeroVoo property.
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
         * Gets the value of the dataPartidaProcedencia property.
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
         * Sets the value of the dataPartidaProcedencia property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the codigoTipoModal property.
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
         * Sets the value of the codigoTipoModal property.
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
         * Gets the value of the codigoIMO property.
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
         * Sets the value of the codigoIMO property.
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
         * Gets the value of the numeroEscala property.
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
         * Sets the value of the numeroEscala property.
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
         * Gets the value of the dataEncerramentoManifesto property.
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
         * Sets the value of the dataEncerramentoManifesto property.
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
