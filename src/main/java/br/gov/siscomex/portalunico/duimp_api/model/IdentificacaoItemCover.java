package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "IdentificacaoItemCover", propOrder =
    { "numeroItem"
})

@XmlRootElement(name="IdentificacaoItemCover")
/**
  * Dados da identificação da declaração única de importação.
 **/
@ApiModel(description="Dados da identificação da declaração única de importação.")
public class IdentificacaoItemCover  {
  
  @XmlElement(name="numeroItem", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número do item da Duimp.<br>Formato: Inteiro, com até 5 dígitos")
 /**
   * Número do item da Duimp.<br>Formato: Inteiro, com até 5 dígitos
  **/
  private Integer numeroItem = null;
 /**
   * Número do item da Duimp.&lt;br&gt;Formato: Inteiro, com até 5 dígitos
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  @NotNull
  public Integer getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
  }

  public IdentificacaoItemCover numeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoItemCover {\n");
    
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
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

