package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ExportacaoTemporaria", propOrder =
    { "numeroDoProcesso", "prazo", "temporaria"
})

@XmlRootElement(name="ExportacaoTemporaria")
public class ExportacaoTemporaria  {
  
  @XmlElement(name="numeroDoProcesso")
  @ApiModelProperty(value = "Número do processo<br />Tamanho mínimo: 0<br />Tamanho máximo: 17")
 /**
   * Número do processo<br />Tamanho mínimo: 0<br />Tamanho máximo: 17
  **/
  private String numeroDoProcesso = null;

  @XmlElement(name="prazo")
  @ApiModelProperty(value = "Prazo<br />Formato: Inteiro, com até 4 digitos")
 /**
   * Prazo<br />Formato: Inteiro, com até 4 digitos
  **/
  private Integer prazo = null;

  @XmlElement(name="temporaria", required = true)
  @ApiModelProperty(required = true, value = "")
  private Boolean temporaria = false;
 /**
   * Número do processo&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 17
   * @return numeroDoProcesso
  **/
  @JsonProperty("numeroDoProcesso")
  public String getNumeroDoProcesso() {
    return numeroDoProcesso;
  }

  public void setNumeroDoProcesso(String numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
  }

  public ExportacaoTemporaria numeroDoProcesso(String numeroDoProcesso) {
    this.numeroDoProcesso = numeroDoProcesso;
    return this;
  }

 /**
   * Prazo&lt;br /&gt;Formato: Inteiro, com até 4 digitos
   * @return prazo
  **/
  @JsonProperty("prazo")
  public Integer getPrazo() {
    return prazo;
  }

  public void setPrazo(Integer prazo) {
    this.prazo = prazo;
  }

  public ExportacaoTemporaria prazo(Integer prazo) {
    this.prazo = prazo;
    return this;
  }

 /**
   * Get temporaria
   * @return temporaria
  **/
  @JsonProperty("temporaria")
  @NotNull
  public Boolean isTemporaria() {
    return temporaria;
  }

  public void setTemporaria(Boolean temporaria) {
    this.temporaria = temporaria;
  }

  public ExportacaoTemporaria temporaria(Boolean temporaria) {
    this.temporaria = temporaria;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportacaoTemporaria {\n");
    
    sb.append("    numeroDoProcesso: ").append(toIndentedString(numeroDoProcesso)).append("\n");
    sb.append("    prazo: ").append(toIndentedString(prazo)).append("\n");
    sb.append("    temporaria: ").append(toIndentedString(temporaria)).append("\n");
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

