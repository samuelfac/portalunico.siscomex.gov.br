package br.gov.siscomex.portalunico.talpco.model;

import java.util.List;

import javax.validation.Valid;
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
 @XmlType(name = "ConsultaDetalhadaVersao", propOrder =
    { "atual", "dataAnalise", "dataCadastroSolicitacaoProrrogacao", "dataFimVigencia", "dataInicioVigencia", "dataRegistro", "dataUltimaAlteracao", "grupos", "id", "idLpco", "informacoesAdicionais", "itensHistorico", "justificativaSolicitacaoProrrogacao", "novaDataFimVigenciaSolicitada", "numero", "situacao", "vinculos"
})

@XmlRootElement(name="ConsultaDetalhadaVersao")
/**
  * Dados de uma versão de um LPCO, exibido na consulta detalhada de LPCOs
 **/
@ApiModel(description="Dados de uma versão de um LPCO, exibido na consulta detalhada de LPCOs")
public class ConsultaDetalhadaVersao  {
  
  @XmlElement(name="atual", required = true)
  @ApiModelProperty(example = "true", required = true, value = "Indica se esta é a versão mais atual do LPCO")
 /**
   * Indica se esta é a versão mais atual do LPCO
  **/
  private Boolean atual = false;

  @XmlElement(name="dataAnalise")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data em que a análise desta versão foi realizada.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data em que a análise desta versão foi realizada.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataAnalise = null;

  @XmlElement(name="dataCadastroSolicitacaoProrrogacao")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de cadastro da solicitação de prorrogação atual, caso exista uma.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de cadastro da solicitação de prorrogação atual, caso exista uma.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataCadastroSolicitacaoProrrogacao = null;

  @XmlElement(name="dataFimVigencia")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data de fim de vigência desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de fim de vigência desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataFimVigencia = null;

  @XmlElement(name="dataInicioVigencia", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data de início de vigência desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de início de vigência desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", required = true, value = "Data de registro desta versão do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data de registro desta versão do LPCO.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="dataUltimaAlteracao")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Data da ultima alteração desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Data da ultima alteração desta versão.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String dataUltimaAlteracao = null;

  @XmlElement(name="grupos")
  @ApiModelProperty(value = "Lista de grupos de campos desta versão do LPCO")
  @Valid
 /**
   * Lista de grupos de campos desta versão do LPCO
  **/
  private List<ConsultaDetalhadaItemLpco> grupos = null;

  @XmlElement(name="id")
  @ApiModelProperty(value = "")
  private Long id = null;

  @XmlElement(name="idLpco")
  @ApiModelProperty(value = "")
  private Long idLpco = null;

  @XmlElement(name="informacoesAdicionais")
  @ApiModelProperty(value = "Informações adicionais cadastradas pelo usuário nesta versão.<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000")
 /**
   * Informações adicionais cadastradas pelo usuário nesta versão.<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000
  **/
  private String informacoesAdicionais = null;

  @XmlElement(name="itensHistorico")
  @ApiModelProperty(value = "Lista de entradas que fazem parte do histórico do LPCO")
  @Valid
 /**
   * Lista de entradas que fazem parte do histórico do LPCO
  **/
  private List<ConsultaDetalhadaItemHistorico> itensHistorico = null;

  @XmlElement(name="justificativaSolicitacaoProrrogacao")
  @ApiModelProperty(example = "<texto livre>", value = "Justificativa da solicitação de prorrogação atual, caso exista uma.<br>Tamanho mínimo: 0<br>Tamanho máximo: 400")
 /**
   * Justificativa da solicitação de prorrogação atual, caso exista uma.<br>Tamanho mínimo: 0<br>Tamanho máximo: 400
  **/
  private String justificativaSolicitacaoProrrogacao = null;

  @XmlElement(name="novaDataFimVigenciaSolicitada")
  @ApiModelProperty(example = "2019-09-02T10:04:38.123Z", value = "Nova data de fim de vigência desta versão, caso haja uma solicitação de prorrogação.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ")
 /**
   * Nova data de fim de vigência desta versão, caso haja uma solicitação de prorrogação.<br>Formato: dd-MM-yyyy'T'HH:mm:ss:SSSZ
  **/
  private String novaDataFimVigenciaSolicitada = null;

  @XmlElement(name="numero", required = true)
  @ApiModelProperty(required = true, value = "Número da versão do LPCO")
 /**
   * Número da versão do LPCO
  **/
  private Integer numero = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(required = true, value = "Situação desta versão")
 /**
   * Situação desta versão
  **/
  private String situacao = null;

  @XmlElement(name="vinculos")
  @ApiModelProperty(value = "Lista de DUEs / DUIMPs vinculadas ao LPCO")
  @Valid
 /**
   * Lista de DUEs / DUIMPs vinculadas ao LPCO
  **/
  private List<ConsultaDetalhadaVinculo> vinculos = null;
 /**
   * Indica se esta é a versão mais atual do LPCO
   * @return atual
  **/
  @JsonProperty("atual")
  @NotNull
  public Boolean isAtual() {
    return atual;
  }

  public void setAtual(Boolean atual) {
    this.atual = atual;
  }

  public ConsultaDetalhadaVersao atual(Boolean atual) {
    this.atual = atual;
    return this;
  }

 /**
   * Data em que a análise desta versão foi realizada.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataAnalise
  **/
  @JsonProperty("dataAnalise")
  public String getDataAnalise() {
    return dataAnalise;
  }

  public void setDataAnalise(String dataAnalise) {
    this.dataAnalise = dataAnalise;
  }

  public ConsultaDetalhadaVersao dataAnalise(String dataAnalise) {
    this.dataAnalise = dataAnalise;
    return this;
  }

 /**
   * Data de cadastro da solicitação de prorrogação atual, caso exista uma.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataCadastroSolicitacaoProrrogacao
  **/
  @JsonProperty("dataCadastroSolicitacaoProrrogacao")
  public String getDataCadastroSolicitacaoProrrogacao() {
    return dataCadastroSolicitacaoProrrogacao;
  }

  public void setDataCadastroSolicitacaoProrrogacao(String dataCadastroSolicitacaoProrrogacao) {
    this.dataCadastroSolicitacaoProrrogacao = dataCadastroSolicitacaoProrrogacao;
  }

  public ConsultaDetalhadaVersao dataCadastroSolicitacaoProrrogacao(String dataCadastroSolicitacaoProrrogacao) {
    this.dataCadastroSolicitacaoProrrogacao = dataCadastroSolicitacaoProrrogacao;
    return this;
  }

 /**
   * Data de fim de vigência desta versão.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataFimVigencia
  **/
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public ConsultaDetalhadaVersao dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

 /**
   * Data de início de vigência desta versão.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
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

  public ConsultaDetalhadaVersao dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Data de registro desta versão do LPCO.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
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

  public ConsultaDetalhadaVersao dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Data da ultima alteração desta versão.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return dataUltimaAlteracao
  **/
  @JsonProperty("dataUltimaAlteracao")
  public String getDataUltimaAlteracao() {
    return dataUltimaAlteracao;
  }

  public void setDataUltimaAlteracao(String dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
  }

  public ConsultaDetalhadaVersao dataUltimaAlteracao(String dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

 /**
   * Lista de grupos de campos desta versão do LPCO
   * @return grupos
  **/
  @JsonProperty("grupos")
  public List<ConsultaDetalhadaItemLpco> getGrupos() {
    return grupos;
  }

  public void setGrupos(List<ConsultaDetalhadaItemLpco> grupos) {
    this.grupos = grupos;
  }

  public ConsultaDetalhadaVersao grupos(List<ConsultaDetalhadaItemLpco> grupos) {
    this.grupos = grupos;
    return this;
  }

  public ConsultaDetalhadaVersao addGruposItem(ConsultaDetalhadaItemLpco gruposItem) {
    this.grupos.add(gruposItem);
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ConsultaDetalhadaVersao id(Long id) {
    this.id = id;
    return this;
  }

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

  public ConsultaDetalhadaVersao idLpco(Long idLpco) {
    this.idLpco = idLpco;
    return this;
  }

 /**
   * Informações adicionais cadastradas pelo usuário nesta versão.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10000
   * @return informacoesAdicionais
  **/
  @JsonProperty("informacoesAdicionais")
  public String getInformacoesAdicionais() {
    return informacoesAdicionais;
  }

  public void setInformacoesAdicionais(String informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
  }

  public ConsultaDetalhadaVersao informacoesAdicionais(String informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
    return this;
  }

 /**
   * Lista de entradas que fazem parte do histórico do LPCO
   * @return itensHistorico
  **/
  @JsonProperty("itensHistorico")
  public List<ConsultaDetalhadaItemHistorico> getItensHistorico() {
    return itensHistorico;
  }

  public void setItensHistorico(List<ConsultaDetalhadaItemHistorico> itensHistorico) {
    this.itensHistorico = itensHistorico;
  }

  public ConsultaDetalhadaVersao itensHistorico(List<ConsultaDetalhadaItemHistorico> itensHistorico) {
    this.itensHistorico = itensHistorico;
    return this;
  }

  public ConsultaDetalhadaVersao addItensHistoricoItem(ConsultaDetalhadaItemHistorico itensHistoricoItem) {
    this.itensHistorico.add(itensHistoricoItem);
    return this;
  }

 /**
   * Justificativa da solicitação de prorrogação atual, caso exista uma.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 400
   * @return justificativaSolicitacaoProrrogacao
  **/
  @JsonProperty("justificativaSolicitacaoProrrogacao")
  public String getJustificativaSolicitacaoProrrogacao() {
    return justificativaSolicitacaoProrrogacao;
  }

  public void setJustificativaSolicitacaoProrrogacao(String justificativaSolicitacaoProrrogacao) {
    this.justificativaSolicitacaoProrrogacao = justificativaSolicitacaoProrrogacao;
  }

  public ConsultaDetalhadaVersao justificativaSolicitacaoProrrogacao(String justificativaSolicitacaoProrrogacao) {
    this.justificativaSolicitacaoProrrogacao = justificativaSolicitacaoProrrogacao;
    return this;
  }

 /**
   * Nova data de fim de vigência desta versão, caso haja uma solicitação de prorrogação.&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mm:ss:SSSZ
   * @return novaDataFimVigenciaSolicitada
  **/
  @JsonProperty("novaDataFimVigenciaSolicitada")
  public String getNovaDataFimVigenciaSolicitada() {
    return novaDataFimVigenciaSolicitada;
  }

  public void setNovaDataFimVigenciaSolicitada(String novaDataFimVigenciaSolicitada) {
    this.novaDataFimVigenciaSolicitada = novaDataFimVigenciaSolicitada;
  }

  public ConsultaDetalhadaVersao novaDataFimVigenciaSolicitada(String novaDataFimVigenciaSolicitada) {
    this.novaDataFimVigenciaSolicitada = novaDataFimVigenciaSolicitada;
    return this;
  }

 /**
   * Número da versão do LPCO
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public ConsultaDetalhadaVersao numero(Integer numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Situação desta versão
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

  public ConsultaDetalhadaVersao situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Lista de DUEs / DUIMPs vinculadas ao LPCO
   * @return vinculos
  **/
  @JsonProperty("vinculos")
  public List<ConsultaDetalhadaVinculo> getVinculos() {
    return vinculos;
  }

  public void setVinculos(List<ConsultaDetalhadaVinculo> vinculos) {
    this.vinculos = vinculos;
  }

  public ConsultaDetalhadaVersao vinculos(List<ConsultaDetalhadaVinculo> vinculos) {
    this.vinculos = vinculos;
    return this;
  }

  public ConsultaDetalhadaVersao addVinculosItem(ConsultaDetalhadaVinculo vinculosItem) {
    this.vinculos.add(vinculosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalhadaVersao {\n");
    
    sb.append("    atual: ").append(toIndentedString(atual)).append("\n");
    sb.append("    dataAnalise: ").append(toIndentedString(dataAnalise)).append("\n");
    sb.append("    dataCadastroSolicitacaoProrrogacao: ").append(toIndentedString(dataCadastroSolicitacaoProrrogacao)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    dataUltimaAlteracao: ").append(toIndentedString(dataUltimaAlteracao)).append("\n");
    sb.append("    grupos: ").append(toIndentedString(grupos)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idLpco: ").append(toIndentedString(idLpco)).append("\n");
    sb.append("    informacoesAdicionais: ").append(toIndentedString(informacoesAdicionais)).append("\n");
    sb.append("    itensHistorico: ").append(toIndentedString(itensHistorico)).append("\n");
    sb.append("    justificativaSolicitacaoProrrogacao: ").append(toIndentedString(justificativaSolicitacaoProrrogacao)).append("\n");
    sb.append("    novaDataFimVigenciaSolicitada: ").append(toIndentedString(novaDataFimVigenciaSolicitada)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    vinculos: ").append(toIndentedString(vinculos)).append("\n");
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

