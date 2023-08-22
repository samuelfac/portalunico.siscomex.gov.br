package br.gov.siscomex.portalunico.duimp.model;

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
 @XmlType(name = "TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio")
public class TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "99", value = "Código do Tipo de Documento no sistema Anexação (E-Docex).<br> Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código do Tipo de Documento no sistema Anexação (E-Docex).<br> Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Atestado de inexistência de produção nacional", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Código do Tipo de Documento no sistema Anexação (E-Docex).&lt;br&gt; Domínio: Tipos de Documento existentes no sistema Anexação (E-Docex).&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição correspondente ao valor informado no atributo &#39;codigo&#39;. &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 150
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
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

