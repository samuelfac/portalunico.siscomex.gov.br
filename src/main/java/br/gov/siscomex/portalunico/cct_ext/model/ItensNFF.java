package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItensNFF", propOrder =
    { "itemNFF"
})

@XmlRootElement(name="ItensNFF")
/**
  * Lista de itens de nota fiscal
 **/
@ApiModel(description="Lista de itens de nota fiscal")
public class ItensNFF  {
  
  @XmlElement(name="itemNFF", required = true)
  @ApiModelProperty(required = true, value = "Lista de itens de nota fiscal")
  @Valid
 /**
   * Lista de itens de nota fiscal
  **/
  private List<ItemNFF> itemNFF = new ArrayList<>();
 /**
   * Lista de itens de nota fiscal
   * @return itemNFF
  **/
  @JsonProperty("itemNFF")
  @NotNull
  public List<ItemNFF> getItemNFF() {
    return itemNFF;
  }

  public void setItemNFF(List<ItemNFF> itemNFF) {
    this.itemNFF = itemNFF;
  }

  public ItensNFF itemNFF(List<ItemNFF> itemNFF) {
    this.itemNFF = itemNFF;
    return this;
  }

  public ItensNFF addItemNFFItem(ItemNFF itemNFFItem) {
    this.itemNFF.add(itemNFFItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItensNFF {\n");
    
    sb.append("    itemNFF: ").append(toIndentedString(itemNFF)).append("\n");
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

