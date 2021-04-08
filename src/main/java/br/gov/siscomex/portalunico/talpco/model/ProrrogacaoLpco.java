package br.gov.siscomex.portalunico.talpco.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProrrogacaoLpco", propOrder =
    { "justificativa", "novaDataFimVigencia"
})

@XmlRootElement(name="ProrrogacaoLpco")
/**
  * Dados de uma solicitação de prorrogação de um LPCO
 **/
@ApiModel(description="Dados de uma solicitação de prorrogação de um LPCO")
public class ProrrogacaoLpco  {
  
  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre", value = "Justificativa para a solicitação de prorrogação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a solicitação de prorrogação<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;

  @XmlElement(name="novaDataFimVigencia")
  @ApiModelProperty(example = "2019-09-03", value = "Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação<br>Formato: yyyy-MM-dd")
 /**
   * Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação<br>Formato: yyyy-MM-dd
  **/
  private String novaDataFimVigencia = null;
 /**
   * Justificativa para a solicitação de prorrogação&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ProrrogacaoLpco justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Novo fim de vigência a ser solicitado para o LPCO se for uma solicitação de prorrogação&lt;br&gt;Formato: yyyy-MM-dd
   * @return novaDataFimVigencia
  **/
  @JsonProperty("novaDataFimVigencia")
  public String getNovaDataFimVigencia() {
    return novaDataFimVigencia;
  }

  public void setNovaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
  }

  public ProrrogacaoLpco novaDataFimVigencia(String novaDataFimVigencia) {
    this.novaDataFimVigencia = novaDataFimVigencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProrrogacaoLpco {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    novaDataFimVigencia: ").append(toIndentedString(novaDataFimVigencia)).append("\n");
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

