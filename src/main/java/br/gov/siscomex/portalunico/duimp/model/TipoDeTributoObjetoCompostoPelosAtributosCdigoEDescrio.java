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
 @XmlType(name = "TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio")
public class TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "II", value = "Tipo de Tributo.<br>Dominio: Tipos de Tributo existentes no sistema Tratamento Tributário")
 /**
   * Tipo de Tributo.<br>Dominio: Tipos de Tributo existentes no sistema Tratamento Tributário
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Imposto de Importação", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 150
  **/
  private String descricao = null;
 /**
   * Tipo de Tributo.&lt;br&gt;Dominio: Tipos de Tributo existentes no sistema Tratamento Tributário
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio codigo(String codigo) {
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

  public TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
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

