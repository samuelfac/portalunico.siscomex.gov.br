package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.GovernmentAgencyGoodsItem;
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
 @XmlType(name = "GoodsShipment", propOrder =
    { "governmentAgencyGoodsItem"
})

@XmlRootElement(name="GoodsShipment")
public class GoodsShipment  {
  
  @XmlElement(name="governmentAgencyGoodsItem", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<GovernmentAgencyGoodsItem> governmentAgencyGoodsItem = new ArrayList<>();
 /**
   * Get governmentAgencyGoodsItem
   * @return governmentAgencyGoodsItem
  **/
  @JsonProperty("governmentAgencyGoodsItem")
  @NotNull
  public List<GovernmentAgencyGoodsItem> getGovernmentAgencyGoodsItem() {
    return governmentAgencyGoodsItem;
  }

  public void setGovernmentAgencyGoodsItem(List<GovernmentAgencyGoodsItem> governmentAgencyGoodsItem) {
    this.governmentAgencyGoodsItem = governmentAgencyGoodsItem;
  }

  public GoodsShipment governmentAgencyGoodsItem(List<GovernmentAgencyGoodsItem> governmentAgencyGoodsItem) {
    this.governmentAgencyGoodsItem = governmentAgencyGoodsItem;
    return this;
  }

  public GoodsShipment addGovernmentAgencyGoodsItemItem(GovernmentAgencyGoodsItem governmentAgencyGoodsItemItem) {
    this.governmentAgencyGoodsItem.add(governmentAgencyGoodsItemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsShipment {\n");
    
    sb.append("    governmentAgencyGoodsItem: ").append(toIndentedString(governmentAgencyGoodsItem)).append("\n");
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

