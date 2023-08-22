package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.UCRTraderAssignedReferenceIDType;
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
 @XmlType(name = "UCR", propOrder =
    { "traderAssignedReferenceID"
})

@XmlRootElement(name="UCR")
public class UCR  {
  
  @XmlElement(name="traderAssignedReferenceID", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private UCRTraderAssignedReferenceIDType traderAssignedReferenceID = null;
 /**
   * Get traderAssignedReferenceID
   * @return traderAssignedReferenceID
  **/
  @JsonProperty("traderAssignedReferenceID")
  @NotNull
  public UCRTraderAssignedReferenceIDType getTraderAssignedReferenceID() {
    return traderAssignedReferenceID;
  }

  public void setTraderAssignedReferenceID(UCRTraderAssignedReferenceIDType traderAssignedReferenceID) {
    this.traderAssignedReferenceID = traderAssignedReferenceID;
  }

  public UCR traderAssignedReferenceID(UCRTraderAssignedReferenceIDType traderAssignedReferenceID) {
    this.traderAssignedReferenceID = traderAssignedReferenceID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UCR {\n");
    
    sb.append("    traderAssignedReferenceID: ").append(toIndentedString(traderAssignedReferenceID)).append("\n");
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

