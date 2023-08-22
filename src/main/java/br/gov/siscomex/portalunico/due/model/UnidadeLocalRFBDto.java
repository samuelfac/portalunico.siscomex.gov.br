package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "UnidadeLocalRFBDto", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="UnidadeLocalRFBDto")
public class UnidadeLocalRFBDto  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "0817600", value = "Código<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Código<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50
  **/
  private String descricao = null;
 /**
   * Código&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public UnidadeLocalRFBDto codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public UnidadeLocalRFBDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnidadeLocalRFBDto {\n");
    
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

