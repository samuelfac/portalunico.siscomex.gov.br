package br.gov.siscomex.portalunico.cadatributos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ObjetivoAtributoConsultaDTO", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="ObjetivoAtributoConsultaDTO")
public class ObjetivoAtributoConsultaDTO  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "")
  private Long codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "")
  private String descricao = null;
 /**
   * Get codigo
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public ObjetivoAtributoConsultaDTO codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Get descricao
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ObjetivoAtributoConsultaDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetivoAtributoConsultaDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

