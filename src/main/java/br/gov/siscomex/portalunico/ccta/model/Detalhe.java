package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Detalhe", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="Detalhe")
/**
  * Detalhe encontrado no processamento.
 **/
@ApiModel(description="Detalhe encontrado no processamento.")
public class Detalhe  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "34", value = "Código do detalhe.<br/>Tamanho: 11")
 /**
   * Código do detalhe.<br/>Tamanho: 11
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Carga bloqueada.", value = "Descrição do detalhe<br/>Tamanho máximo: 300")
 /**
   * Descrição do detalhe<br/>Tamanho máximo: 300
  **/
  private String descricao = null;
 /**
   * Código do detalhe.&lt;br/&gt;Tamanho: 11
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Detalhe codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do detalhe&lt;br/&gt;Tamanho máximo: 300
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Detalhe descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Detalhe {\n");
    
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

