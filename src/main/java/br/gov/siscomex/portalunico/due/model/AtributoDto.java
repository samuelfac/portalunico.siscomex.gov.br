package br.gov.siscomex.portalunico.due.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoDto", propOrder =
    { "codigo", "conteudo", "descricao"
})

@XmlRootElement(name="AtributoDto")
public class AtributoDto  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Tamanho mínimo: 0<br />Tamanho máximo: 19")
 /**
   * Código<br />Tamanho mínimo: 0<br />Tamanho máximo: 19
  **/
  private String codigo = null;

  @XmlElement(name="conteudo")
  @ApiModelProperty(value = "Conteúdo<br />Tamanho mínimo: 0<br />Tamanho máximo: 512")
 /**
   * Conteúdo<br />Tamanho mínimo: 0<br />Tamanho máximo: 512
  **/
  private String conteudo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 100")
 /**
   * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 100
  **/
  private String descricao = null;
 /**
   * Código&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 19
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AtributoDto codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Conteúdo&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 512
   * @return conteudo
  **/
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public AtributoDto conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 100
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public AtributoDto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoDto {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
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

