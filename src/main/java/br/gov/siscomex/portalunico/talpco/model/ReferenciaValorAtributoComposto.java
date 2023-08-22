package br.gov.siscomex.portalunico.talpco.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "ReferenciaValorAtributoComposto", propOrder =
    { "atributo", "valor"
})

@XmlRootElement(name="ReferenciaValorAtributoComposto")
/**
  * Valor de um campo composto do tipo Atributo Composto
 **/
@ApiModel(description="Valor de um campo composto do tipo Atributo Composto")
public class ReferenciaValorAtributoComposto  {
  
  @XmlElement(name="atributo", required = true)
  @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<BR>Tamanho máximo: 40<br>Formato: Código de atributo no formato ATT_NNNNNNNNN<br>")
 /**
   * Código do atributo<BR>Tamanho máximo: 40<br>Formato: Código de atributo no formato ATT_NNNNNNNNN<br>
  **/
  private String atributo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "12345678901", value = "Valor declarado para o atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000")
 /**
   * Valor declarado para o atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 10000
  **/
  private String valor = null;
 /**
   * Código do atributo&lt;BR&gt;Tamanho máximo: 40&lt;br&gt;Formato: Código de atributo no formato ATT_NNNNNNNNN&lt;br&gt;
   * @return atributo
  **/
  @JsonProperty("atributo")
  @NotNull
  public String getAtributo() {
    return atributo;
  }

  public void setAtributo(String atributo) {
    this.atributo = atributo;
  }

  public ReferenciaValorAtributoComposto atributo(String atributo) {
    this.atributo = atributo;
    return this;
  }

 /**
   * Valor declarado para o atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10000
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public ReferenciaValorAtributoComposto valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaValorAtributoComposto {\n");
    
    sb.append("    atributo: ").append(toIndentedString(atributo)).append("\n");
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

