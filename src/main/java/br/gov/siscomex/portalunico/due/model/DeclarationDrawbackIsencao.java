package br.gov.siscomex.portalunico.due.model;

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

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclarationDrawbackIsencao", propOrder =
    { "goodsShipment"
})

@XmlRootElement(name="DeclarationDrawbackIsencao")
public class DeclarationDrawbackIsencao  {
  
  @XmlElement(name="goodsShipment", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<GoodsShipment> goodsShipment = new ArrayList<>();
 /**
   * Get goodsShipment
   * @return goodsShipment
  **/
  @JsonProperty("goodsShipment")
  @NotNull
  public List<GoodsShipment> getGoodsShipment() {
    return goodsShipment;
  }

  public void setGoodsShipment(List<GoodsShipment> goodsShipment) {
    this.goodsShipment = goodsShipment;
  }

  public DeclarationDrawbackIsencao goodsShipment(List<GoodsShipment> goodsShipment) {
    this.goodsShipment = goodsShipment;
    return this;
  }

  public DeclarationDrawbackIsencao addGoodsShipmentItem(GoodsShipment goodsShipmentItem) {
    this.goodsShipment.add(goodsShipmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclarationDrawbackIsencao {\n");
    
    sb.append("    goodsShipment: ").append(toIndentedString(goodsShipment)).append("\n");
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

