package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "JustificativaAceitarCompatibilizacaoRequest", propOrder =
    { "justificativa", "decisaoJudicial", "motivoAnalise"
})

@XmlRootElement(name="JustificativaAceitarCompatibilizacaoRequest")
/**
  * Justificativa para a ação sobre solicitação de compatibilização de produtos em um LPCO
 **/
@ApiModel(description="Justificativa para a ação sobre solicitação de compatibilização de produtos em um LPCO")
public class JustificativaAceitarCompatibilizacaoRequest  {
  
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
  private Boolean decisaoJudicial = null;

  @XmlElement(name="motivoAnalise")
  @ApiModelProperty(example = "A01", value = "Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>")
 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>
  **/
  private String motivoAnalise = null;
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

  public JustificativaAceitarCompatibilizacaoRequest justificativa(String justificativa) {
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

  public JustificativaAceitarCompatibilizacaoRequest decisaoJudicial(Boolean decisaoJudicial) {
    this.decisaoJudicial = decisaoJudicial;
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

  public JustificativaAceitarCompatibilizacaoRequest motivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JustificativaAceitarCompatibilizacaoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    decisaoJudicial: ").append(toIndentedString(decisaoJudicial)).append("\n");
    sb.append("    motivoAnalise: ").append(toIndentedString(motivoAnalise)).append("\n");
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

