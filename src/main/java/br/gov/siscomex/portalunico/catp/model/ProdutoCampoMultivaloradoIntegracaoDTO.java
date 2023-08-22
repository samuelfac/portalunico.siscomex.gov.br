package br.gov.siscomex.portalunico.catp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProdutoCampoMultivaloradoIntegracaoDTO", propOrder =
    { "valores", "atributo"
})

@XmlRootElement(name="ProdutoCampoMultivaloradoIntegracaoDTO")
public class ProdutoCampoMultivaloradoIntegracaoDTO  {
  
  @XmlElement(name="valores")
  @ApiModelProperty(value = "Lista de valores de atributos da NCM informada")
 /**
   * Lista de valores de atributos da NCM informada
  **/
  private List<String> valores = null;

  @XmlElement(name="atributo", required = true)
  @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private String atributo = null;
 /**
   * Lista de valores de atributos da NCM informada
   * @return valores
  **/
  @JsonProperty("valores")
  public List<String> getValores() {
    return valores;
  }

  public void setValores(List<String> valores) {
    this.valores = valores;
  }

  public ProdutoCampoMultivaloradoIntegracaoDTO valores(List<String> valores) {
    this.valores = valores;
    return this;
  }

  public ProdutoCampoMultivaloradoIntegracaoDTO addValoresItem(String valoresItem) {
    this.valores.add(valoresItem);
    return this;
  }

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

  public ProdutoCampoMultivaloradoIntegracaoDTO atributo(String atributo) {
    this.atributo = atributo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoCampoMultivaloradoIntegracaoDTO {\n");
    
    sb.append("    valores: ").append(toIndentedString(valores)).append("\n");
    sb.append("    atributo: ").append(toIndentedString(atributo)).append("\n");
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

