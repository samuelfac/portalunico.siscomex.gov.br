package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetificacaoLpcoResponse", propOrder =
    { "situacao", "dataRegistro", "justificativa", "listaAlteracoes"
})

@XmlRootElement(name="RetificacaoLpcoResponse")
/**
  * Dados de uma retificação de um LPCO
 **/
@ApiModel(description="Dados de uma retificação de um LPCO")
public class RetificacaoLpcoResponse  {
  
  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private SituacaoRetificacaoLpco situacao = null;

  @XmlElement(name="dataRegistro", required = true)
  @ApiModelProperty(example = "2019-09-02T12:10Z", required = true, value = "Data e hora em que o pedido de retificação foi registrado<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data e hora em que o pedido de retificação foi registrado<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataRegistro = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa utilizada para solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa utilizada para solicitação de retificação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="listaAlteracoes", required = true)
  @ApiModelProperty(required = true, value = "Lista de alterações realizadas na retificação")
  @Valid
 /**
   * Lista de alterações realizadas na retificação
  **/
  private List<DadosAlteracoesLpco> listaAlteracoes = new ArrayList<>();
 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public SituacaoRetificacaoLpco getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoRetificacaoLpco situacao) {
    this.situacao = situacao;
  }

  public RetificacaoLpcoResponse situacao(SituacaoRetificacaoLpco situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Data e hora em que o pedido de retificação foi registrado&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
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

  public RetificacaoLpcoResponse dataRegistro(String dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Justificativa utilizada para solicitação de retificação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public RetificacaoLpcoResponse justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Lista de alterações realizadas na retificação
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

  public RetificacaoLpcoResponse listaAlteracoes(List<DadosAlteracoesLpco> listaAlteracoes) {
    this.listaAlteracoes = listaAlteracoes;
    return this;
  }

  public RetificacaoLpcoResponse addListaAlteracoesItem(DadosAlteracoesLpco listaAlteracoesItem) {
    this.listaAlteracoes.add(listaAlteracoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetificacaoLpcoResponse {\n");
    
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    listaAlteracoes: ").append(toIndentedString(listaAlteracoes)).append("\n");
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

