package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoItemCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="AtributoItemCover")
/**
  * Lista de atributos dinâmicos da mercadoria.<br>Origem: Sistema Cadastro de Atributos - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description="Lista de atributos dinâmicos da mercadoria.<br>Origem: Sistema Cadastro de Atributos - https://api-docs.portalunico.siscomex.gov.br/")
public class AtributoItemCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "ATT_0001", value = "Código do atributo no cadastro de atributos.<br>Tamanho mínimo: 1<br>Tamanho máximo: 14")
 /**
   * Código do atributo no cadastro de atributos.<br>Tamanho mínimo: 1<br>Tamanho máximo: 14
  **/
  private String codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "01011100", value = "Valor atribuído pelo importador ao atributo representado pelo código.<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000")
 /**
   * Valor atribuído pelo importador ao atributo representado pelo código.<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000
  **/
  private String valor = null;
 /**
   * Código do atributo no cadastro de atributos.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 14
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public AtributoItemCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor atribuído pelo importador ao atributo representado pelo código.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10000
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public AtributoItemCover valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoItemCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

