package br.gov.siscomex.portalunico.ccta.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoConsultaProtocolo", propOrder =
    { "dataRecebimento", "tipoEvento", "tipoAcao", "situacao", "cpfResponsavelEvento", "cnpjResponsavelEvento", "detalhes"
})

@XmlRootElement(name="RetornoConsultaProtocolo")
/**
  * Retorno da consulta por número de protocolo.
 **/
@ApiModel(description="Retorno da consulta por número de protocolo.")
public class RetornoConsultaProtocolo  {
  
  @XmlElement(name="dataRecebimento")
  @ApiModelProperty(example = "2020-05-05T10:00:00-03:00", value = "Data do recebimento do protocolo.<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ")
 /**
   * Data do recebimento do protocolo.<br/>Formato: yyyy-MM-dd'T'HH:mm:ssZ
  **/
  private String dataRecebimento = null;

  @XmlElement(name="tipoEvento")
  @ApiModelProperty(example = "Recepção", value = "Descrição do tipo de evento da origem do protocolo.")
 /**
   * Descrição do tipo de evento da origem do protocolo.
  **/
  private String tipoEvento = null;

  @XmlElement(name="tipoAcao")
  @ApiModelProperty(example = "Retificação", value = "Descrição do tipo de ação da origem do protocolo.")
 /**
   * Descrição do tipo de ação da origem do protocolo.
  **/
  private String tipoAcao = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "Rejeitado", value = "Consultar a situação do processamento do protocolo.")
 /**
   * Consultar a situação do processamento do protocolo.
  **/
  private String situacao = null;

  @XmlElement(name="cpfResponsavelEvento")
  @ApiModelProperty(example = "12345678901", value = "CPF que originou o evento<br/>Tamanho: 11<br/>Formato: NNNNNNNNNNN")
 /**
   * CPF que originou o evento<br/>Tamanho: 11<br/>Formato: NNNNNNNNNNN
  **/
  private String cpfResponsavelEvento = null;

  @XmlElement(name="cnpjResponsavelEvento")
  @ApiModelProperty(example = "00000000000191", value = "CNPJ que originou o evento<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ que originou o evento<br/>Tamanho: 14<br/>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResponsavelEvento = null;

  @XmlElement(name="detalhes")
  @ApiModelProperty(value = "Lista de detalhes encontrados no processamento.")
  @Valid
 /**
   * Lista de detalhes encontrados no processamento.
  **/
  private List<Detalhe> detalhes = null;
 /**
   * Data do recebimento do protocolo.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
   * @return dataRecebimento
  **/
  @JsonProperty("dataRecebimento")
  public String getDataRecebimento() {
    return dataRecebimento;
  }

  public void setDataRecebimento(String dataRecebimento) {
    this.dataRecebimento = dataRecebimento;
  }

  public RetornoConsultaProtocolo dataRecebimento(String dataRecebimento) {
    this.dataRecebimento = dataRecebimento;
    return this;
  }

 /**
   * Descrição do tipo de evento da origem do protocolo.
   * @return tipoEvento
  **/
  @JsonProperty("tipoEvento")
  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  public RetornoConsultaProtocolo tipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }

 /**
   * Descrição do tipo de ação da origem do protocolo.
   * @return tipoAcao
  **/
  @JsonProperty("tipoAcao")
  public String getTipoAcao() {
    return tipoAcao;
  }

  public void setTipoAcao(String tipoAcao) {
    this.tipoAcao = tipoAcao;
  }

  public RetornoConsultaProtocolo tipoAcao(String tipoAcao) {
    this.tipoAcao = tipoAcao;
    return this;
  }

 /**
   * Consultar a situação do processamento do protocolo.
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public RetornoConsultaProtocolo situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * CPF que originou o evento&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: NNNNNNNNNNN
   * @return cpfResponsavelEvento
  **/
  @JsonProperty("cpfResponsavelEvento")
  public String getCpfResponsavelEvento() {
    return cpfResponsavelEvento;
  }

  public void setCpfResponsavelEvento(String cpfResponsavelEvento) {
    this.cpfResponsavelEvento = cpfResponsavelEvento;
  }

  public RetornoConsultaProtocolo cpfResponsavelEvento(String cpfResponsavelEvento) {
    this.cpfResponsavelEvento = cpfResponsavelEvento;
    return this;
  }

 /**
   * CNPJ que originou o evento&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResponsavelEvento
  **/
  @JsonProperty("cnpjResponsavelEvento")
  public String getCnpjResponsavelEvento() {
    return cnpjResponsavelEvento;
  }

  public void setCnpjResponsavelEvento(String cnpjResponsavelEvento) {
    this.cnpjResponsavelEvento = cnpjResponsavelEvento;
  }

  public RetornoConsultaProtocolo cnpjResponsavelEvento(String cnpjResponsavelEvento) {
    this.cnpjResponsavelEvento = cnpjResponsavelEvento;
    return this;
  }

 /**
   * Lista de detalhes encontrados no processamento.
   * @return detalhes
  **/
  @JsonProperty("detalhes")
  public List<Detalhe> getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(List<Detalhe> detalhes) {
    this.detalhes = detalhes;
  }

  public RetornoConsultaProtocolo detalhes(List<Detalhe> detalhes) {
    this.detalhes = detalhes;
    return this;
  }

  public RetornoConsultaProtocolo addDetalhesItem(Detalhe detalhesItem) {
    this.detalhes.add(detalhesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultaProtocolo {\n");
    
    sb.append("    dataRecebimento: ").append(toIndentedString(dataRecebimento)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    tipoAcao: ").append(toIndentedString(tipoAcao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    cpfResponsavelEvento: ").append(toIndentedString(cpfResponsavelEvento)).append("\n");
    sb.append("    cnpjResponsavelEvento: ").append(toIndentedString(cnpjResponsavelEvento)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

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
}

