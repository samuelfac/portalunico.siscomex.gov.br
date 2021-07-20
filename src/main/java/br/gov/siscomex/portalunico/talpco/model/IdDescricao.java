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
 @XmlType(name = "IdDescricao", propOrder =
    { "id", "descricao"
})

@XmlRootElement(name="IdDescricao")
/**
  * Estrutura genérica que representa um par id e descrição
 **/
@ApiModel(description="Estrutura genérica que representa um par id e descrição")
public class IdDescricao  {
  
  @XmlElement(name="id", required = true)
  @ApiModelProperty(example = "99", required = true, value = "Identificador do item")
 /**
   * Identificador do item
  **/
  private String id = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Para outros usos", value = "Descrição textual do item")
 /**
   * Descrição textual do item
  **/
  private String descricao = null;
 /**
   * Identificador do item
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdDescricao id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Descrição textual do item
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public IdDescricao descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdDescricao {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

