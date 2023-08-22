package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaCoordenadaDeAlerta", propOrder =
    { "idElemento", "x", "y", "x2", "y2"
})

@XmlRootElement(name="DadosDaCoordenadaDeAlerta")
public class DadosDaCoordenadaDeAlerta  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="x")
  @ApiModelProperty(example = "12", value = "Coordenada para marcar o alerta na posição X")
 /**
   * Coordenada para marcar o alerta na posição X
  **/
  private Integer x = null;

  @XmlElement(name="y")
  @ApiModelProperty(example = "7", value = "Coordenada para marcar o alerta na posição Y")
 /**
   * Coordenada para marcar o alerta na posição Y
  **/
  private Integer y = null;

  @XmlElement(name="x2")
  @ApiModelProperty(example = "0", value = "Coordenada para marcar o alerta na posição X2")
 /**
   * Coordenada para marcar o alerta na posição X2
  **/
  private Integer x2 = null;

  @XmlElement(name="y2")
  @ApiModelProperty(example = "8", value = "Coordenada para marcar o alerta na posição Y2")
 /**
   * Coordenada para marcar o alerta na posição Y2
  **/
  private Integer y2 = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDaCoordenadaDeAlerta idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Coordenada para marcar o alerta na posição X
   * @return x
  **/
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public DadosDaCoordenadaDeAlerta x(Integer x) {
    this.x = x;
    return this;
  }

 /**
   * Coordenada para marcar o alerta na posição Y
   * @return y
  **/
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public DadosDaCoordenadaDeAlerta y(Integer y) {
    this.y = y;
    return this;
  }

 /**
   * Coordenada para marcar o alerta na posição X2
   * @return x2
  **/
  @JsonProperty("x2")
  public Integer getX2() {
    return x2;
  }

  public void setX2(Integer x2) {
    this.x2 = x2;
  }

  public DadosDaCoordenadaDeAlerta x2(Integer x2) {
    this.x2 = x2;
    return this;
  }

 /**
   * Coordenada para marcar o alerta na posição Y2
   * @return y2
  **/
  @JsonProperty("y2")
  public Integer getY2() {
    return y2;
  }

  public void setY2(Integer y2) {
    this.y2 = y2;
  }

  public DadosDaCoordenadaDeAlerta y2(Integer y2) {
    this.y2 = y2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaCoordenadaDeAlerta {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
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

