package br.gov.siscomex.portalunico.ccta.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ClassificacaoMercadoriaConsultaDetalhadaRepresentation", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="ClassificacaoMercadoriaConsultaDetalhadaRepresentation")
public class ClassificacaoMercadoriaConsultaDetalhadaRepresentation  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "877887", value = "Código de classificação da mercadoria<br/>Tamanho: 18")
 /**
   * Código de classificação da mercadoria<br/>Tamanho: 18
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "descrição da mercadoria de acordo com a classificação", value = "Descrição relacionada  a classificação da mercadoria<br/>Tamanho: 35")
 /**
   * Descrição relacionada  a classificação da mercadoria<br/>Tamanho: 35
  **/
  private String descricao = null;
 /**
   * Código de classificação da mercadoria&lt;br/&gt;Tamanho: 18
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ClassificacaoMercadoriaConsultaDetalhadaRepresentation codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição relacionada  a classificação da mercadoria&lt;br/&gt;Tamanho: 35
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ClassificacaoMercadoriaConsultaDetalhadaRepresentation descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificacaoMercadoriaConsultaDetalhadaRepresentation {\n");
    
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

