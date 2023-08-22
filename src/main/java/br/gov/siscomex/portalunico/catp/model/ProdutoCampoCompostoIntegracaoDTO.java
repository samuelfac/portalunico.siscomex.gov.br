package br.gov.siscomex.portalunico.catp.model;

import br.gov.siscomex.portalunico.catp.model.ProdutoCampoSimplesIntegracaoDTO;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "ProdutoCampoCompostoIntegracaoDTO", propOrder =
    { "valores", "atributo"
})

@XmlRootElement(name="ProdutoCampoCompostoIntegracaoDTO")
public class ProdutoCampoCompostoIntegracaoDTO  {
  
  @XmlElement(name="valores")
  @ApiModelProperty(value = "Lista de atributos compostos limitado a quantide 5")
  @Valid
 /**
   * Lista de atributos compostos limitado a quantide 5
  **/
  private List<ProdutoCampoSimplesIntegracaoDTO> valores = null;

  @XmlElement(name="atributo", required = true)
  @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
 /**
   * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
  **/
  private String atributo = null;
 /**
   * Lista de atributos compostos limitado a quantide 5
   * @return valores
  **/
  @JsonProperty("valores")
  public List<ProdutoCampoSimplesIntegracaoDTO> getValores() {
    return valores;
  }

  public void setValores(List<ProdutoCampoSimplesIntegracaoDTO> valores) {
    this.valores = valores;
  }

  public ProdutoCampoCompostoIntegracaoDTO valores(List<ProdutoCampoSimplesIntegracaoDTO> valores) {
    this.valores = valores;
    return this;
  }

  public ProdutoCampoCompostoIntegracaoDTO addValoresItem(ProdutoCampoSimplesIntegracaoDTO valoresItem) {
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

  public ProdutoCampoCompostoIntegracaoDTO atributo(String atributo) {
    this.atributo = atributo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoCampoCompostoIntegracaoDTO {\n");
    
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

