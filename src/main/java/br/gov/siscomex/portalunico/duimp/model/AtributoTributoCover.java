package br.gov.siscomex.portalunico.duimp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoTributoCover", propOrder =
    { "codigo", "valor", "descricao", "tipoAtributo", "tipoCampoAdicional"
})

@XmlRootElement(name="AtributoTributoCover")
/**
  * Dados de um atributo de tributo
 **/
@ApiModel(description="Dados de um atributo de tributo")
public class AtributoTributoCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "ATT_0001", value = "Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12")
 /**
   * Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12
  **/
  private String codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "Valor atribuido pelo importador ao atributo representado pelo codigo 'ATT_0001'", value = "Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000")
 /**
   * Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000
  **/
  private String valor = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Naladi", value = "Descrição do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Descrição do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String descricao = null;

  @XmlElement(name="tipoAtributo")
  @ApiModelProperty(example = "texto", value = "Tipo de Atributo.<br>Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.")
 /**
   * Tipo de Atributo.<br>Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.
  **/
  private String tipoAtributo = null;

  @XmlElement(name="tipoCampoAdicional")
  @ApiModelProperty(example = "OUTROS", value = "Tipo de campo adicional no sistema Tratamento Tributário<br>Dominio: EX<br>NALADI<br>NCM<br>OUTROS<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Tipo de campo adicional no sistema Tratamento Tributário<br>Dominio: EX<br>NALADI<br>NCM<br>OUTROS<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private String tipoCampoAdicional = null;
 /**
   * Código do atributo no cadastro de atributos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 12
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AtributoTributoCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor do atributo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10000
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public AtributoTributoCover valor(String valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Descrição do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 80
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public AtributoTributoCover descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Tipo de Atributo.&lt;br&gt;Dominio: Tipos de Atributo existentes no sistema Cadastro de Atributos.
   * @return tipoAtributo
  **/
  @JsonProperty("tipoAtributo")
  public String getTipoAtributo() {
    return tipoAtributo;
  }

  public void setTipoAtributo(String tipoAtributo) {
    this.tipoAtributo = tipoAtributo;
  }

  public AtributoTributoCover tipoAtributo(String tipoAtributo) {
    this.tipoAtributo = tipoAtributo;
    return this;
  }

 /**
   * Tipo de campo adicional no sistema Tratamento Tributário&lt;br&gt;Dominio: EX&lt;br&gt;NALADI&lt;br&gt;NCM&lt;br&gt;OUTROS&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
   * @return tipoCampoAdicional
  **/
  @JsonProperty("tipoCampoAdicional")
  public String getTipoCampoAdicional() {
    return tipoCampoAdicional;
  }

  public void setTipoCampoAdicional(String tipoCampoAdicional) {
    this.tipoCampoAdicional = tipoCampoAdicional;
  }

  public AtributoTributoCover tipoCampoAdicional(String tipoCampoAdicional) {
    this.tipoCampoAdicional = tipoCampoAdicional;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoTributoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    tipoAtributo: ").append(toIndentedString(tipoAtributo)).append("\n");
    sb.append("    tipoCampoAdicional: ").append(toIndentedString(tipoCampoAdicional)).append("\n");
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

