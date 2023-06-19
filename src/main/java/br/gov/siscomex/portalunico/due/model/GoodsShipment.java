package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

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

