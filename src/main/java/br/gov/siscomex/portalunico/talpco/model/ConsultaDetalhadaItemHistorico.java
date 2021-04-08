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
 @XmlType(name = "ConsultaDetalhadaItemHistorico", propOrder =
    { "cpfCnpj", "dataAlteracao", "exibeParaInterveniente", "idVersao", "justificativa", "nomeUsuario", "situacao"
})

@XmlRootElement(name="ConsultaDetalhadaItemHistorico")
/**
  * Dados de um item do histórico de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de um item do histórico de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaItemHistorico  {
  
  @XmlElement(name="cpfCnpj")
  @ApiModelProperty(example = "03141554900", value = "CPF/CNPJ do usuário que efetuou a operação registrada no histórico<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")
 /**
   * CPF/CNPJ do usuário que efetuou a operação registrada no histórico<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
  **/
  private String cpfCnpj = null;

  @XmlElement(name="dataAlteracao", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data em que a entrada do histórico aconteceu.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que a entrada do histórico aconteceu.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataAlteracao = null;

  @XmlElement(name="exibeParaInterveniente", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica se o CPF/nome do usuário que efetuou a operação registrada no histórico pode ser exibida para os importadores / exportadores")
 /**
   * Indica se o CPF/nome do usuário que efetuou a operação registrada no histórico pode ser exibida para os importadores / exportadores
  **/
  private Boolean exibeParaInterveniente = false;

  @XmlElement(name="idVersao")
  @ApiModelProperty(value = "")
  private Long idVersao = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "<texto livre>", value = "Justificativa da operação registrada no histórico.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000")
 /**
   * Justificativa da operação registrada no histórico.<br>Tamanho mínimo: 0<br>Tamanho máximo: 4000
  **/
  private String justificativa = null;

  @XmlElement(name="nomeUsuario")
  @ApiModelProperty(example = "João da Silva", value = "Nome do usuário que efetuou a operação registrada no histórico")
 /**
   * Nome do usuário que efetuou a operação registrada no histórico
  **/
  private String nomeUsuario = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "Deferido", required = true, value = "Situação do LPCO no momento da entrada do histórico.<br>Tamanho máximo: 50")
 /**
   * Situação do LPCO no momento da entrada do histórico.<br>Tamanho máximo: 50
  **/
  private String situacao = null;
 /**
   * CPF/CNPJ do usuário que efetuou a operação registrada no histórico&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)&lt;br&gt;Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
   * @return cpfCnpj
  **/
  @JsonProperty("cpfCnpj")
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public ConsultaDetalhadaItemHistorico cpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

 /**
   * Data em que a entrada do histórico aconteceu.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataAlteracao
  **/
  @JsonProperty("dataAlteracao")
  @NotNull
  public String getDataAlteracao() {
    return dataAlteracao;
  }

  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  public ConsultaDetalhadaItemHistorico dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }

 /**
   * Indica se o CPF/nome do usuário que efetuou a operação registrada no histórico pode ser exibida para os importadores / exportadores
   * @return exibeParaInterveniente
  **/
  @JsonProperty("exibeParaInterveniente")
  @NotNull
  public Boolean isExibeParaInterveniente() {
    return exibeParaInterveniente;
  }

  public void setExibeParaInterveniente(Boolean exibeParaInterveniente) {
    this.exibeParaInterveniente = exibeParaInterveniente;
  }

  public ConsultaDetalhadaItemHistorico exibeParaInterveniente(Boolean exibeParaInterveniente) {
    this.exibeParaInterveniente = exibeParaInterveniente;
    return this;
  }

 /**
   * Get idVersao
   * @return idVersao
  **/
  @JsonProperty("idVersao")
  public Long getIdVersao() {
    return idVersao;
  }

  public void setIdVersao(Long idVersao) {
    this.idVersao = idVersao;
  }

  public ConsultaDetalhadaItemHistorico idVersao(Long idVersao) {
    this.idVersao = idVersao;
    return this;
  }

 /**
   * Justificativa da operação registrada no histórico.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 4000
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ConsultaDetalhadaItemHistorico justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Nome do usuário que efetuou a operação registrada no histórico
   * @return nomeUsuario
  **/
  @JsonProperty("nomeUsuario")
  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public ConsultaDetalhadaItemHistorico nomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
    return this;
  }

 /**
   * Situação do LPCO no momento da entrada do histórico.&lt;br&gt;Tamanho máximo: 50
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

  public ConsultaDetalhadaItemHistorico situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaItemHistorico {\n");
    
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
    sb.append("    exibeParaInterveniente: ").append(toIndentedString(exibeParaInterveniente)).append("\n");
    sb.append("    idVersao: ").append(toIndentedString(idVersao)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    nomeUsuario: ").append(toIndentedString(nomeUsuario)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
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

