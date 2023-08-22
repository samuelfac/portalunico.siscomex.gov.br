package br.gov.siscomex.portalunico.catp.model;

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
 @XmlType(name = "ProdutoCampoSimplesIntegracaoDTO", propOrder =
    { "atributo", "valor"
})

@XmlRootElement(name="ProdutoCampoSimplesIntegracaoDTO")
public class ProdutoCampoSimplesIntegracaoDTO  {
  
  @XmlElement(name="atributo", required = true)
  @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private String atributo = null;

  @XmlElement(name="valor", required = true)
  @ApiModelProperty(example = "01", required = true, value = "Valor do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Valor do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String valor = null;
 /**
   * Código do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
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

  public ProdutoCampoSimplesIntegracaoDTO atributo(String atributo) {
    this.atributo = atributo;
    return this;
  }

 /**
   * Valor do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
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

  public ProdutoCampoSimplesIntegracaoDTO valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoCampoSimplesIntegracaoDTO {\n");
    
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

