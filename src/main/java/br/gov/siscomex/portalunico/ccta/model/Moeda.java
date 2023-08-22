package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "Moeda", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="Moeda")
public class Moeda  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "USD", value = "Código da moeda.<br/>Tamanho: 3<br/>Formato: AAA")
 /**
   * Código da moeda.<br/>Tamanho: 3<br/>Formato: AAA
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "DOLAR DOS EUA", value = "Descrição da moeda.")
 /**
   * Descrição da moeda.
  **/
  private String descricao = null;
 /**
   * Código da moeda.&lt;br/&gt;Tamanho: 3&lt;br/&gt;Formato: AAA
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Moeda codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da moeda.
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Moeda descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Moeda {\n");
    
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

