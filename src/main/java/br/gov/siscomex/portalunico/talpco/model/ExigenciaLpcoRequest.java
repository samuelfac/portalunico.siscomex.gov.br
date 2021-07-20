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
 @XmlType(name = "ExigenciaLpcoRequest", propOrder =
    { "justificativa"
})

@XmlRootElement(name="ExigenciaLpcoRequest")
/**
  * Requisição para cadastrar uma nova exigência em um LPCO
 **/
@ApiModel(description="Requisição para cadastrar uma nova exigência em um LPCO")
public class ExigenciaLpcoRequest  {
  
  @XmlElement(name="justificativa", required = true)
  @ApiModelProperty(example = "Texto livre", required = true, value = "Justificativa para a operação sobre a exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900")
 /**
   * Justificativa para a operação sobre a exigência<br>Tamanho mínimo: 1<br>Tamanho máximo: 3900
  **/
  private String justificativa = null;
 /**
   * Justificativa para a operação sobre a exigência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 3900
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  @NotNull
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public ExigenciaLpcoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExigenciaLpcoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
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
