package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoConsultaProtocoloVO", propOrder =
        {"protocolo", "situacao", "tipoRecepcao", "extrato", "situacoes", "dataCriacao", "responsavel", "nomeResponsavel"
        })

@XmlRootElement(name = "RetornoConsultaProtocoloVO")
/**
 * Resultado da consulta de um Protocolo
 **/
@ApiModel(description = "Resultado da consulta de um Protocolo")
public class RetornoConsultaProtocoloVO {

    @XmlElement(name = "protocolo")
    @ApiModelProperty(example = "RCAR-20230904-7654321-0001", value = "Identificador do protocolo da recepção")
    /**
     * Identificador do protocolo da recepção
     **/
    private String protocolo = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    @Valid
    private SituacaoVO situacao = null;

    @XmlElement(name = "tipoRecepcao")
    @ApiModelProperty(example = "NF-e | MIC/DTA", value = "Tipo de Recepção Assíncrona")
    /**
     * Tipo de Recepção Assíncrona
     **/
    private String tipoRecepcao = null;

    @XmlElement(name = "extrato")
    @ApiModelProperty(value = "Lista com as falhas encontradas durante o processamento")
    @Valid
    /**
     * Lista com as falhas encontradas durante o processamento
     **/
    private List<ExtratoVO> extrato = null;

    @XmlElement(name = "situacoes")
    @ApiModelProperty(value = "Lista das situações (status) pelas quais o protocolo já passou")
    @Valid
    /**
     * Lista das situações (status) pelas quais o protocolo já passou
     **/
    private List<SituacaoVO> situacoes = null;

    @XmlElement(name = "dataCriacao")
    @ApiModelProperty(example = "2024-04-15T12:46:54-03:00", value = "Data de criação do protocolo")
    /**
     * Data de criação do protocolo
     **/
    private OffsetDateTime dataCriacao = null;

    @XmlElement(name = "responsavel")
    @ApiModelProperty(example = "99999999999 | 99999999999999", value = "Identificação do Responsável pelo registro do protocolo")
    /**
     * Identificação do Responsável pelo registro do protocolo
     **/
    private String responsavel = null;

    @XmlElement(name = "nomeResponsavel")
    @ApiModelProperty(example = "NOME DO RESPONSÁVEL", value = "Nome do responsável pelo registro do protocolo")
    /**
     * Nome do responsável pelo registro do protocolo
     **/
    private String nomeResponsavel = null;

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Identificador do protocolo da recepção
     *
     * @return protocolo
     **/
    @JsonProperty("protocolo")
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public RetornoConsultaProtocoloVO protocolo(String protocolo) {
        this.protocolo = protocolo;
        return this;
    }

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public SituacaoVO getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoVO situacao) {
        this.situacao = situacao;
    }

    public RetornoConsultaProtocoloVO situacao(SituacaoVO situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Tipo de Recepção Assíncrona
     *
     * @return tipoRecepcao
     **/
    @JsonProperty("tipoRecepcao")
    public String getTipoRecepcao() {
        return tipoRecepcao;
    }

    public void setTipoRecepcao(String tipoRecepcao) {
        this.tipoRecepcao = tipoRecepcao;
    }

    public RetornoConsultaProtocoloVO tipoRecepcao(String tipoRecepcao) {
        this.tipoRecepcao = tipoRecepcao;
        return this;
    }

    /**
     * Lista com as falhas encontradas durante o processamento
     *
     * @return extrato
     **/
    @JsonProperty("extrato")
    public List<ExtratoVO> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<ExtratoVO> extrato) {
        this.extrato = extrato;
    }

    public RetornoConsultaProtocoloVO extrato(List<ExtratoVO> extrato) {
        this.extrato = extrato;
        return this;
    }

    public RetornoConsultaProtocoloVO addExtratoItem(ExtratoVO extratoItem) {
        this.extrato.add(extratoItem);
        return this;
    }

    /**
     * Lista das situações (status) pelas quais o protocolo já passou
     *
     * @return situacoes
     **/
    @JsonProperty("situacoes")
    public List<SituacaoVO> getSituacoes() {
        return situacoes;
    }

    public void setSituacoes(List<SituacaoVO> situacoes) {
        this.situacoes = situacoes;
    }

    public RetornoConsultaProtocoloVO situacoes(List<SituacaoVO> situacoes) {
        this.situacoes = situacoes;
        return this;
    }

    public RetornoConsultaProtocoloVO addSituacoesItem(SituacaoVO situacoesItem) {
        this.situacoes.add(situacoesItem);
        return this;
    }

    /**
     * Data de criação do protocolo
     *
     * @return dataCriacao
     **/
    @JsonProperty("dataCriacao")
    public OffsetDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(OffsetDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public RetornoConsultaProtocoloVO dataCriacao(OffsetDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }

    /**
     * Identificação do Responsável pelo registro do protocolo
     *
     * @return responsavel
     **/
    @JsonProperty("responsavel")
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public RetornoConsultaProtocoloVO responsavel(String responsavel) {
        this.responsavel = responsavel;
        return this;
    }

    /**
     * Nome do responsável pelo registro do protocolo
     *
     * @return nomeResponsavel
     **/
    @JsonProperty("nomeResponsavel")
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public RetornoConsultaProtocoloVO nomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RetornoConsultaProtocoloVO {\n" +
                "    protocolo: " + toIndentedString(protocolo) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    tipoRecepcao: " + toIndentedString(tipoRecepcao) + "\n" +
                "    extrato: " + toIndentedString(extrato) + "\n" +
                "    situacoes: " + toIndentedString(situacoes) + "\n" +
                "    dataCriacao: " + toIndentedString(dataCriacao) + "\n" +
                "    responsavel: " + toIndentedString(responsavel) + "\n" +
                "    nomeResponsavel: " + toIndentedString(nomeResponsavel) + "\n" +
                "}";
        return sb;
    }
}
