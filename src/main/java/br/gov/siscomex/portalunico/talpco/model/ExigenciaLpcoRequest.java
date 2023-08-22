package br.gov.siscomex.portalunico.talpco.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "ExigenciaLpcoRequest", propOrder =
    { "justificativa", "motivoAnalise"
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

  @XmlElement(name="motivoAnalise")
  @ApiModelProperty(example = "A01", value = "Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>")
 /**
   * Código do motivo de análise. Pode ser informado somente se existirem motivos de análise cadastrados no Tabelas Comex. Caso contrário, deve ser nulo.<br>
  **/
  private String motivoAnalise = null;
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

  public ExigenciaLpcoRequest motivoAnalise(String motivoAnalise) {
    this.motivoAnalise = motivoAnalise;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExigenciaLpcoRequest {\n");
    
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
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

