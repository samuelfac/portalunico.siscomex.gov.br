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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CompatibilizacaoLpcoResponse", propOrder =
    { "numero", "situacao", "dataRegistro", "justificativa", "listaAlteracoes", "situacaoPagamentoTaxa"
})

@XmlRootElement(name="CompatibilizacaoLpcoResponse")
/**
  * Dados de pedido de compatibilidação de versão de produto no LPCO
 **/
@ApiModel(description="Dados de pedido de compatibilidação de versão de produto no LPCO")
public class CompatibilizacaoLpcoResponse  {
  
  @XmlElement(name="numero", required = true)
  @ApiModelProperty(example = "002", required = true, value = "Número do pedido de compatibilização")
 /**
   * Número do pedido de compatibilização
  **/
  private String numero = null;

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private SituacaoCompatibilizacaoLpco situacao = null;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "2019-09-02T12:10Z", required = true, value = "Data e hora em que o pedido de compatibilização foi registrado<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data e hora em que o pedido de compatibilização foi registrado<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa utilizada para solicitação de compatibilização<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa utilizada para solicitação de compatibilização<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="listaAlteracoes", required = true)
  @ApiModelProperty(required = true, value = "Lista de alterações realizadas na compatibilização")
  @Valid
 /**
   * Lista de alterações realizadas na compatibilização
  **/
  private List<DadosAlteracoesLpco> listaAlteracoes = new ArrayList<>();

  @XmlElement(name="situacaoPagamentoTaxa")
  @ApiModelProperty(value = "")
  @Valid
  private SituacaoPagamentoTaxa situacaoPagamentoTaxa = null;
 /**
   * Número do pedido de compatibilização
   * @return numero
  **/
  @JsonProperty("numero")
  @NotNull
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public CompatibilizacaoLpcoResponse numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public SituacaoCompatibilizacaoLpco getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoCompatibilizacaoLpco situacao) {
    this.situacao = situacao;
  }

  public CompatibilizacaoLpcoResponse situacao(SituacaoCompatibilizacaoLpco situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Data e hora em que o pedido de compatibilização foi registrado&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
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

  public CompatibilizacaoLpcoResponse dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Justificativa utilizada para solicitação de compatibilização&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public CompatibilizacaoLpcoResponse justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Lista de alterações realizadas na compatibilização
   * @return listaAlteracoes
  **/
  @JsonProperty("listaAlteracoes")
  @NotNull
  public List<DadosAlteracoesLpco> getListaAlteracoes() {
    return listaAlteracoes;
  }

  public void setListaAlteracoes(List<DadosAlteracoesLpco> listaAlteracoes) {
    this.listaAlteracoes = listaAlteracoes;
  }

  public CompatibilizacaoLpcoResponse listaAlteracoes(List<DadosAlteracoesLpco> listaAlteracoes) {
    this.listaAlteracoes = listaAlteracoes;
    return this;
  }

  public CompatibilizacaoLpcoResponse addListaAlteracoesItem(DadosAlteracoesLpco listaAlteracoesItem) {
    this.listaAlteracoes.add(listaAlteracoesItem);
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

  public CompatibilizacaoLpcoResponse situacaoPagamentoTaxa(SituacaoPagamentoTaxa situacaoPagamentoTaxa) {
    this.situacaoPagamentoTaxa = situacaoPagamentoTaxa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilizacaoLpcoResponse {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    listaAlteracoes: ").append(toIndentedString(listaAlteracoes)).append("\n");
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

