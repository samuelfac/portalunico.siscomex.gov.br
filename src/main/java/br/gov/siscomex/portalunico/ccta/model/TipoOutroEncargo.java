package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoOutroEncargo", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoOutroEncargo")
public class TipoOutroEncargo  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "UC", value = "Código do tipo do outro encargo.<br/>Tamanho: 2")
 /**
   * Código do tipo do outro encargo.<br/>Tamanho: 2
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Adjusting of improperly loaded ULD", value = "Descrição do tipo do outro encargo.<br/>Tamanho: 66")
 /**
   * Descrição do tipo do outro encargo.<br/>Tamanho: 66
  **/
  private String descricao = null;
 /**
   * Código do tipo do outro encargo.&lt;br/&gt;Tamanho: 2
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TipoOutroEncargo codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do tipo do outro encargo.&lt;br/&gt;Tamanho: 66
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoOutroEncargo descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOutroEncargo {\n");
    
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

