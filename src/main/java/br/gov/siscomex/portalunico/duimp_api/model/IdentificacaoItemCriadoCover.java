package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "IdentificacaoItemCriadoCover", propOrder =
    { "numeroItem"
})

@XmlRootElement(name="IdentificacaoItemCriadoCover")
/**
  * Identificação do item criado ou atualizado. Devolvido apenas na resposta aos métodos POST e PUT.
 **/
@ApiModel(description="Identificação do item criado ou atualizado. Devolvido apenas na resposta aos métodos POST e PUT.")
public class IdentificacaoItemCriadoCover  {
  
  @XmlElement(name="numeroItem")
  @ApiModelProperty(example = "1", value = "Número do item da Duimp.")
 /**
   * Número do item da Duimp.
  **/
  private String numeroItem = null;
 /**
   * Número do item da Duimp.
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public IdentificacaoItemCriadoCover numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoItemCriadoCover {\n");
    
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

