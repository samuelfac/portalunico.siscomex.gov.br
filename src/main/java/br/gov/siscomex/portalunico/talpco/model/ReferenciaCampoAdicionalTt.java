package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ReferenciaCampoAdicionalTt", propOrder =
    { "codigoAtributo", "valor"
})

@XmlRootElement(name="ReferenciaCampoAdicionalTt")
/**
  * Valor de um campo adicional de um fundamento legal
 **/
@ApiModel(description="Valor de um campo adicional de um fundamento legal")
public class ReferenciaCampoAdicionalTt  {
  
  @XmlElement(name="codigoAtributo", required = true)
  @ApiModelProperty(example = "ATT_2982", required = true, value = "Código do atributo relacionado ao campo adicional.<br>Tamanho mínimo: 5<br>Tamanho máximo: 40")
 /**
   * Código do atributo relacionado ao campo adicional.<br>Tamanho mínimo: 5<br>Tamanho máximo: 40
  **/
  private String codigoAtributo = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "32061100", required = true, value = "Valor do campo adicional.<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000")
 /**
   * Valor do campo adicional.<br>Tamanho mínimo: 1<br>Tamanho máximo: 4000
  **/
  private String valor = null;
 /**
   * Código do atributo relacionado ao campo adicional.&lt;br&gt;Tamanho mínimo: 5&lt;br&gt;Tamanho máximo: 40
   * @return codigoAtributo
  **/
  @JsonProperty("codigoAtributo")
  @NotNull
  public String getCodigoAtributo() {
    return codigoAtributo;
  }

  public void setCodigoAtributo(String codigoAtributo) {
    this.codigoAtributo = codigoAtributo;
  }

  public ReferenciaCampoAdicionalTt codigoAtributo(String codigoAtributo) {
    this.codigoAtributo = codigoAtributo;
    return this;
  }

 /**
   * Valor do campo adicional.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
   * @return valor
  **/
  @JsonProperty("valor")
  @NotNull
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public ReferenciaCampoAdicionalTt valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaCampoAdicionalTt {\n");
    
    sb.append("    codigoAtributo: ").append(toIndentedString(codigoAtributo)).append("\n");
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

