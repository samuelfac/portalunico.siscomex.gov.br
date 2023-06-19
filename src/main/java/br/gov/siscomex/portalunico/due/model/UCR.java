package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

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

