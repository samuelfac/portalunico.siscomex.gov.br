package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProrrogacaoLpcoResponse", propOrder =
    { "situacao", "novaDataFimVigencia", "dataInicioVigencia", "dataFimVigencia", "dataCadastroSolicitacao", "dataUltimaAlteracao", "justificativa", "situacaoPagamentoTaxa"
})

@XmlRootElement(name="ProrrogacaoLpcoResponse")
/**
  * Dados de uma solicitação de prorrogação
 **/
@ApiModel(description="Dados de uma solicitação de prorrogação")
public class ProrrogacaoLpcoResponse  {
  
  @XmlElement(name="situacao")
  @ApiModelProperty(value = "")
  @Valid
  private SituacaoProrrogacaoLpco situacao = null;

  @XmlElement(name="novaDataFimVigencia")
  @ApiModelProperty(example = "2019-10-01", value = "Nova data solicitada para fim de vigência<br>Formato: yyyy-MM-dd")
 /**
   * Nova data solicitada para fim de vigência<br>Formato: yyyy-MM-dd
  **/
  private String novaDataFimVigencia = null;

  @XmlElement(name="dataInicioVigencia", required = true)
  @ApiModelProperty(example = "2019-10-01", required = true, value = "Início de vigência do LPCO<br>Formato: yyyy-MM-dd")
 /**
   * Início de vigência do LPCO<br>Formato: yyyy-MM-dd
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataFimVigencia", required = true)
  @ApiModelProperty(example = "2019-10-01", required = true, value = "Data atual de fim de vigência do LPCO<br>Formato: yyyy-MM-dd")
 /**
   * Data atual de fim de vigência do LPCO<br>Formato: yyyy-MM-dd
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="dataCadastroSolicitacao", required = true)
  @ApiModelProperty(example = "2019-10-01", required = true, value = "Data em que a solicitação de prorrogação foi cadastrada<br>Formato: yyyy-MM-dd")
 /**
   * Data em que a solicitação de prorrogação foi cadastrada<br>Formato: yyyy-MM-dd
  **/
  private String dataCadastroSolicitacao = null;

  @XmlElement(name="dataUltimaAlteracao")
  @ApiModelProperty(example = "2019-10-01", value = "Data da última alteração da solicitação de prorrogação<br>Formato: yyyy-MM-dd")
 /**
   * Data da última alteração da solicitação de prorrogação<br>Formato: yyyy-MM-dd
  **/
  private String dataUltimaAlteracao = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "<texto livre>", value = "Justificativa da solicitação de prorrogação.<br>Tamanho mínimo: 0<br>Tamanho máximo: 400")
 /**
   * Justificativa da solicitação de prorrogação.<br>Tamanho mínimo: 0<br>Tamanho máximo: 400
  **/
  private String justificativa = null;

  @XmlElement(name="situacaoPagamentoTaxa")
  @ApiModelProperty(value = "")
  @Valid
  private SituacaoPagamentoTaxa situacaoPagamentoTaxa = null;
 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  public SituacaoProrrogacaoLpco getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoProrrogacaoLpco situacao) {
    this.situacao = situacao;
  }

  public ProrrogacaoLpcoResponse situacao(SituacaoProrrogacaoLpco situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Nova data solicitada para fim de vigência&lt;br&gt;Formato: yyyy-MM-dd
   * @return novaDataFimVigencia
  **/
  @JsonProperty("novaDataFimVigencia")
  public String getNovaDataFimVigencia() {
    return novaDataFimVigencia;
  }

  public void setNovaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
  }

  public ProrrogacaoLpcoResponse novaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
    return this;
  }

 /**
   * Início de vigência do LPCO&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataInicioVigencia
  **/
  @JsonProperty("dataInicioVigencia")
  @NotNull
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public ProrrogacaoLpcoResponse dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Data atual de fim de vigência do LPCO&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataFimVigencia
  **/
  @JsonProperty("dataFimVigencia")
  @NotNull
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public ProrrogacaoLpcoResponse dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

 /**
   * Data em que a solicitação de prorrogação foi cadastrada&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataCadastroSolicitacao
  **/
  @JsonProperty("dataCadastroSolicitacao")
  @NotNull
  public String getDataCadastroSolicitacao() {
    return dataCadastroSolicitacao;
  }

  public void setDataCadastroSolicitacao(String dataCadastroSolicitacao) {
    this.dataCadastroSolicitacao = dataCadastroSolicitacao;
  }

  public ProrrogacaoLpcoResponse dataCadastroSolicitacao(String dataCadastroSolicitacao) {
    this.dataCadastroSolicitacao = dataCadastroSolicitacao;
    return this;
  }

 /**
   * Data da última alteração da solicitação de prorrogação&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataUltimaAlteracao
  **/
  @JsonProperty("dataUltimaAlteracao")
  public String getDataUltimaAlteracao() {
    return dataUltimaAlteracao;
  }

  public void setDataUltimaAlteracao(String dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
  }

  public ProrrogacaoLpcoResponse dataUltimaAlteracao(String dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

 /**
   * Justificativa da solicitação de prorrogação.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 400
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ProrrogacaoLpcoResponse justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Get situacaoPagamentoTaxa
   * @return situacaoPagamentoTaxa
  **/
  @JsonProperty("situacaoPagamentoTaxa")
  public SituacaoPagamentoTaxa getSituacaoPagamentoTaxa() {
    return situacaoPagamentoTaxa;
  }

  public void setSituacaoPagamentoTaxa(SituacaoPagamentoTaxa situacaoPagamentoTaxa) {
    this.situacaoPagamentoTaxa = situacaoPagamentoTaxa;
  }

  public ProrrogacaoLpcoResponse situacaoPagamentoTaxa(SituacaoPagamentoTaxa situacaoPagamentoTaxa) {
    this.situacaoPagamentoTaxa = situacaoPagamentoTaxa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProrrogacaoLpcoResponse {\n");
    
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    novaDataFimVigencia: ").append(toIndentedString(novaDataFimVigencia)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    dataCadastroSolicitacao: ").append(toIndentedString(dataCadastroSolicitacao)).append("\n");
    sb.append("    dataUltimaAlteracao: ").append(toIndentedString(dataUltimaAlteracao)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    situacaoPagamentoTaxa: ").append(toIndentedString(situacaoPagamentoTaxa)).append("\n");
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

