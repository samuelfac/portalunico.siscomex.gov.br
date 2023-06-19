package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetificacaoLpcoAceitarRequest", propOrder =
    { "justificativa", "decisaoJudicial"
})

@XmlRootElement(name="RetificacaoLpcoAceitarRequest")
/**
  * Dados para aceitar uma solicitação de retificação de um LPCO
 **/
@ApiModel(description="Dados para aceitar uma solicitação de retificação de um LPCO")
public class RetificacaoLpcoAceitarRequest  {
  
  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a operação. Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="decisaoJudicial")
  @ApiModelProperty(example = "false", value = "Indicador de decisão judicial")
 /**
   * Indicador de decisão judicial
  **/
  private Boolean decisaoJudicial = false;
 /**
   * Justificativa para a operação. Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public RetificacaoLpcoAceitarRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Indicador de decisão judicial
   * @return decisaoJudicial
  **/
  @JsonProperty("decisaoJudicial")
  public Boolean isDecisaoJudicial() {
    return decisaoJudicial;
  }

  public void setDecisaoJudicial(Boolean decisaoJudicial) {
    this.decisaoJudicial = decisaoJudicial;
  }

  public RetificacaoLpcoAceitarRequest decisaoJudicial(Boolean decisaoJudicial) {
    this.decisaoJudicial = decisaoJudicial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetificacaoLpcoAceitarRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    decisaoJudicial: ").append(toIndentedString(decisaoJudicial)).append("\n");
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
