package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosErroValidaoAtributo", propOrder =
    { "codigo", "atributo", "detalhes"
})

@XmlRootElement(name="DadosErroValidaoAtributo")
public class DadosErroValidaoAtributo  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "")
  private Integer codigo = null;

  @XmlElement(name="atributo")
  @ApiModelProperty(value = "")
  private String atributo = null;

  @XmlElement(name="detalhes")
  @ApiModelProperty(value = "")
  private String detalhes = null;
 /**
   * Get codigo
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public DadosErroValidaoAtributo codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Get atributo
   * @return atributo
  **/
  @JsonProperty("atributo")
  public String getAtributo() {
    return atributo;
  }

  public void setAtributo(String atributo) {
    this.atributo = atributo;
  }

  public DadosErroValidaoAtributo atributo(String atributo) {
    this.atributo = atributo;
    return this;
  }

 /**
   * Get detalhes
   * @return detalhes
  **/
  @JsonProperty("detalhes")
  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }

  public DadosErroValidaoAtributo detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosErroValidaoAtributo {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    atributo: ").append(toIndentedString(atributo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

