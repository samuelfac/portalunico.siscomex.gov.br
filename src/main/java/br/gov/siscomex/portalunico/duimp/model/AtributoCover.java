package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AtributoCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="AtributoCover")
/**
  * Dados de um atributo dinâmico
 **/
@ApiModel(description="Dados de um atributo dinâmico")
public class AtributoCover  {
  
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

  public AtributoCover codigo(String codigo) {
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

  public AtributoCover valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtributoCover {\n");
    
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

