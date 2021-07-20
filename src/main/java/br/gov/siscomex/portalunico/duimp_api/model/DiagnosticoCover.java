package br.gov.siscomex.portalunico.duimp_api.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DiagnosticoCover", propOrder =
    { "totalItem"
})

@XmlRootElement(name="DiagnosticoCover")
public class DiagnosticoCover  {
  
  @XmlElement(name="totalItem", required = true)
  @ApiModelProperty(example = "3", required = true, value = "Número total de itens já enviados e salvos.<br>Formato: Inteiro, com até 5 dígitos<br>Valor mínimo: 0<br>Valor máximo: 99999")
 /**
   * Número total de itens já enviados e salvos.<br>Formato: Inteiro, com até 5 dígitos<br>Valor mínimo: 0<br>Valor máximo: 99999
  **/
  private Integer totalItem = null;
 /**
   * Número total de itens já enviados e salvos.&lt;br&gt;Formato: Inteiro, com até 5 dígitos&lt;br&gt;Valor mínimo: 0&lt;br&gt;Valor máximo: 99999
   * @return totalItem
  **/
  @JsonProperty("totalItem")
  @NotNull
  public Integer getTotalItem() {
    return totalItem;
  }

  public void setTotalItem(Integer totalItem) {
    this.totalItem = totalItem;
  }

  public DiagnosticoCover totalItem(Integer totalItem) {
    this.totalItem = totalItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticoCover {\n");
    
    sb.append("    totalItem: ").append(toIndentedString(totalItem)).append("\n");
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

