package br.gov.siscomex.portalunico.talpco.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaDetalhadaExigencia", propOrder =
    { "idLpco", "numero", "dataRegistro", "descricao", "dataCumprimento", "textoCumprimento", "situacao", "textoJustificativa", "cpfRegistro", "nomeUsuarioRegistro", "cpfCancelamento", "nomeUsuarioCancelamento"
})

@XmlRootElement(name="ConsultaDetalhadaExigencia")
/**
  * Dados de uma exigência de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de uma exigência de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaExigencia  {
  
  @XmlElement(name="idLpco")
  @ApiModelProperty(value = "")
  private Long idLpco = null;

  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "2", required = true, value = "Número sequencial da exigência")
 /**
   * Número sequencial da exigência
  **/
  private Long numero = null;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data em que a exigência foi realizada<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que a exigência foi realizada<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="descricao", required = true)
  @ApiModelProperty(example = "Enviar documentos XYZ", required = true, value = "Descrição da exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
 /**
   * Descrição da exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
  **/
  private String descricao = null;

  @XmlElement(name="dataCumprimento")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data em que a resposta foi dada<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que a resposta foi dada<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataCumprimento = null;

  @XmlElement(name="textoCumprimento")
  @ApiModelProperty(example = "Documentos XYZ anexados ao LPCO", value = "Resposta dada à exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
 /**
   * Resposta dada à exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
  **/
  private String textoCumprimento = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "Cumprida", required = true, value = "Situação da exigência (Pendente, Cumprida, Cancelada)")
 /**
   * Situação da exigência (Pendente, Cumprida, Cancelada)
  **/
  private String situacao = null;

  @XmlElement(name="textoJustificativa")
  @ApiModelProperty(value = "")
  private String textoJustificativa = null;

  @XmlElement(name="cpfRegistro", required = true)
  @ApiModelProperty(example = "03141554900", required = true, value = "CPF do usuário responsável pelo cadastro da exigência<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")
 /**
   * CPF do usuário responsável pelo cadastro da exigência<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
  **/
  private String cpfRegistro = null;

  @XmlElement(name="nomeUsuarioRegistro", required = true)
  @ApiModelProperty(example = "Fulano da Silva", required = true, value = "Nome do usuário responsável pelo cadastro da exigência<br>")
 /**
   * Nome do usuário responsável pelo cadastro da exigência<br>
  **/
  private String nomeUsuarioRegistro = null;

  @XmlElement(name="cpfCancelamento")
  @ApiModelProperty(example = "03141554900", value = "CPF do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")
 /**
   * CPF do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
  **/
  private String cpfCancelamento = null;

  @XmlElement(name="nomeUsuarioCancelamento")
  @ApiModelProperty(example = "Fulano da Silva", value = "Nome do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.<br>")
 /**
   * Nome do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.<br>
  **/
  private String nomeUsuarioCancelamento = null;
 /**
   * Get idLpco
   * @return idLpco
  **/
  @JsonProperty("idLpco")
  public Long getIdLpco() {
    return idLpco;
  }

  public void setIdLpco(Long idLpco) {
    this.idLpco = idLpco;
  }

  public ConsultaDetalhadaExigencia idLpco(Long idLpco) {
    this.idLpco = idLpco;
    return this;
  }

 /**
   * Número sequencial da exigência
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public ConsultaDetalhadaExigencia numero(Long numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Data em que a exigência foi realizada&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  @NotNull
  public String getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public ConsultaDetalhadaExigencia dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Descrição da exigência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
   * @return descricao
  **/
  @JsonProperty("descricao")
  @NotNull
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ConsultaDetalhadaExigencia descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Data em que a resposta foi dada&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataCumprimento
  **/
  @JsonProperty("dataCumprimento")
  public String getDataCumprimento() {
    return dataCumprimento;
  }

  public void setDataCumprimento(String dataCumprimento) {
    this.dataCumprimento = dataCumprimento;
  }

  public ConsultaDetalhadaExigencia dataCumprimento(String dataCumprimento) {
    this.dataCumprimento = dataCumprimento;
    return this;
  }

 /**
   * Resposta dada à exigência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
   * @return textoCumprimento
  **/
  @JsonProperty("textoCumprimento")
  public String getTextoCumprimento() {
    return textoCumprimento;
  }

  public void setTextoCumprimento(String textoCumprimento) {
    this.textoCumprimento = textoCumprimento;
  }

  public ConsultaDetalhadaExigencia textoCumprimento(String textoCumprimento) {
    this.textoCumprimento = textoCumprimento;
    return this;
  }

 /**
   * Situação da exigência (Pendente, Cumprida, Cancelada)
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public ConsultaDetalhadaExigencia situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Get textoJustificativa
   * @return textoJustificativa
  **/
  @JsonProperty("textoJustificativa")
  public String getTextoJustificativa() {
    return textoJustificativa;
  }

  public void setTextoJustificativa(String textoJustificativa) {
    this.textoJustificativa = textoJustificativa;
  }

  public ConsultaDetalhadaExigencia textoJustificativa(String textoJustificativa) {
    this.textoJustificativa = textoJustificativa;
    return this;
  }

 /**
   * CPF do usuário responsável pelo cadastro da exigência&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)&lt;br&gt;Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
   * @return cpfRegistro
  **/
  @JsonProperty("cpfRegistro")
  @NotNull
  public String getCpfRegistro() {
    return cpfRegistro;
  }

  public void setCpfRegistro(String cpfRegistro) {
    this.cpfRegistro = cpfRegistro;
  }

  public ConsultaDetalhadaExigencia cpfRegistro(String cpfRegistro) {
    this.cpfRegistro = cpfRegistro;
    return this;
  }

 /**
   * Nome do usuário responsável pelo cadastro da exigência&lt;br&gt;
   * @return nomeUsuarioRegistro
  **/
  @JsonProperty("nomeUsuarioRegistro")
  @NotNull
  public String getNomeUsuarioRegistro() {
    return nomeUsuarioRegistro;
  }

  public void setNomeUsuarioRegistro(String nomeUsuarioRegistro) {
    this.nomeUsuarioRegistro = nomeUsuarioRegistro;
  }

  public ConsultaDetalhadaExigencia nomeUsuarioRegistro(String nomeUsuarioRegistro) {
    this.nomeUsuarioRegistro = nomeUsuarioRegistro;
    return this;
  }

 /**
   * CPF do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)&lt;br&gt;Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
   * @return cpfCancelamento
  **/
  @JsonProperty("cpfCancelamento")
  public String getCpfCancelamento() {
    return cpfCancelamento;
  }

  public void setCpfCancelamento(String cpfCancelamento) {
    this.cpfCancelamento = cpfCancelamento;
  }

  public ConsultaDetalhadaExigencia cpfCancelamento(String cpfCancelamento) {
    this.cpfCancelamento = cpfCancelamento;
    return this;
  }

 /**
   * Nome do usuário responsável pelo cancelamento da exigência, caso tenha sido cancelada.&lt;br&gt;
   * @return nomeUsuarioCancelamento
  **/
  @JsonProperty("nomeUsuarioCancelamento")
  public String getNomeUsuarioCancelamento() {
    return nomeUsuarioCancelamento;
  }

  public void setNomeUsuarioCancelamento(String nomeUsuarioCancelamento) {
    this.nomeUsuarioCancelamento = nomeUsuarioCancelamento;
  }

  public ConsultaDetalhadaExigencia nomeUsuarioCancelamento(String nomeUsuarioCancelamento) {
    this.nomeUsuarioCancelamento = nomeUsuarioCancelamento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaExigencia {\n");
    
    sb.append("    idLpco: ").append(toIndentedString(idLpco)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dataCumprimento: ").append(toIndentedString(dataCumprimento)).append("\n");
    sb.append("    textoCumprimento: ").append(toIndentedString(textoCumprimento)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    textoJustificativa: ").append(toIndentedString(textoJustificativa)).append("\n");
    sb.append("    cpfRegistro: ").append(toIndentedString(cpfRegistro)).append("\n");
    sb.append("    nomeUsuarioRegistro: ").append(toIndentedString(nomeUsuarioRegistro)).append("\n");
    sb.append("    cpfCancelamento: ").append(toIndentedString(cpfCancelamento)).append("\n");
    sb.append("    nomeUsuarioCancelamento: ").append(toIndentedString(nomeUsuarioCancelamento)).append("\n");
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

