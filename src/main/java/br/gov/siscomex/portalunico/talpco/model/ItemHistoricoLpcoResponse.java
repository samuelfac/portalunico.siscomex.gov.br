package br.gov.siscomex.portalunico.talpco.model;

import br.gov.siscomex.portalunico.talpco.model.DadosAlteracoesLpco;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemHistoricoLpcoResponse", propOrder =
    { "dataAlteracao", "situacao", "situacaoSolicitacao", "solicitacao", "usuario", "justificativa", "motivoAnalise", "alteracoes"
})

@XmlRootElement(name="ItemHistoricoLpcoResponse")
/**
  * Dados de um item do histórico do LPCO
 **/
@ApiModel(description="Dados de um item do histórico do LPCO")
public class ItemHistoricoLpcoResponse  {
  
  @XmlElement(name="dataAlteracao", required = true)
  @ApiModelProperty(example = "2019-08-29T14:03:52.123Z", required = true, value = "Momento em que ocorreu o evento sobre o LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Momento em que ocorreu o evento sobre o LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataAlteracao = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "Deferido", required = true, value = "Situação do LPCO no momento do evento.")
 /**
   * Situação do LPCO no momento do evento.
  **/
  private String situacao = null;

  @XmlElement(name="situacaoSolicitacao")
  @ApiModelProperty(example = "Para Análise", value = "Descrição da situação da solicitação realizada no LPCO.")
 /**
   * Descrição da situação da solicitação realizada no LPCO.
  **/
  private String situacaoSolicitacao = null;

  @XmlElement(name="solicitacao")
  @ApiModelProperty(example = "002", value = "Número da solicitação de retificação do LPCO.")
 /**
   * Número da solicitação de retificação do LPCO.
  **/
  private String solicitacao = null;

  @XmlElement(name="usuario")
  @ApiModelProperty(example = "00000000000", value = "Identificação do usuário que realizou o evento sobre o LPCO. Visível apenas para anuentes.")
 /**
   * Identificação do usuário que realizou o evento sobre o LPCO. Visível apenas para anuentes.
  **/
  private String usuario = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa utilizada para o evento no LPCO.<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa utilizada para o evento no LPCO.<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="motivoAnalise")
  @ApiModelProperty(example = "A01", value = "Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>")
 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>
  **/
  private String motivoAnalise = null;

  @XmlElement(name="alteracoes")
  @ApiModelProperty(value = "Lista de alterações realizadas no evento do LPCO.")
  @Valid
 /**
   * Lista de alterações realizadas no evento do LPCO.
  **/
  private List<DadosAlteracoesLpco> alteracoes = null;
 /**
   * Momento em que ocorreu o evento sobre o LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
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

  public ItemHistoricoLpcoResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }

 /**
   * Situação do LPCO no momento do evento.
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

  public ItemHistoricoLpcoResponse situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Descrição da situação da solicitação realizada no LPCO.
   * @return situacaoSolicitacao
  **/
  @JsonProperty("situacaoSolicitacao")
  public String getSituacaoSolicitacao() {
    return situacaoSolicitacao;
  }

  public void setSituacaoSolicitacao(String situacaoSolicitacao) {
    this.situacaoSolicitacao = situacaoSolicitacao;
  }

  public ItemHistoricoLpcoResponse situacaoSolicitacao(String situacaoSolicitacao) {
    this.situacaoSolicitacao = situacaoSolicitacao;
    return this;
  }

 /**
   * Número da solicitação de retificação do LPCO.
   * @return solicitacao
  **/
  @JsonProperty("solicitacao")
  public String getSolicitacao() {
    return solicitacao;
  }

  public void setSolicitacao(String solicitacao) {
    this.solicitacao = solicitacao;
  }

  public ItemHistoricoLpcoResponse solicitacao(String solicitacao) {
    this.solicitacao = solicitacao;
    return this;
  }

 /**
   * Identificação do usuário que realizou o evento sobre o LPCO. Visível apenas para anuentes.
   * @return usuario
  **/
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public ItemHistoricoLpcoResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

 /**
   * Justificativa utilizada para o evento no LPCO.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ItemHistoricoLpcoResponse justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.&lt;br&gt;
   * @return motivoAnalise
  **/
  @JsonProperty("motivoAnalise")
  public String getMotivoAnalise() {
    return motivoAnalise;
  }

  public void setMotivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
  }

  public ItemHistoricoLpcoResponse motivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
    return this;
  }

 /**
   * Lista de alterações realizadas no evento do LPCO.
   * @return alteracoes
  **/
  @JsonProperty("alteracoes")
  public List<DadosAlteracoesLpco> getAlteracoes() {
    return alteracoes;
  }

  public void setAlteracoes(List<DadosAlteracoesLpco> alteracoes) {
    this.alteracoes = alteracoes;
  }

  public ItemHistoricoLpcoResponse alteracoes(List<DadosAlteracoesLpco> alteracoes) {
    this.alteracoes = alteracoes;
    return this;
  }

  public ItemHistoricoLpcoResponse addAlteracoesItem(DadosAlteracoesLpco alteracoesItem) {
    this.alteracoes.add(alteracoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemHistoricoLpcoResponse {\n");
    
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    situacaoSolicitacao: ").append(toIndentedString(situacaoSolicitacao)).append("\n");
    sb.append("    solicitacao: ").append(toIndentedString(solicitacao)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    motivoAnalise: ").append(toIndentedString(motivoAnalise)).append("\n");
    sb.append("    alteracoes: ").append(toIndentedString(alteracoes)).append("\n");
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

