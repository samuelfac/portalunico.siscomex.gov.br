package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "GovernmentProcedure", propOrder =
    { "currentCode"
})

@XmlRootElement(name="GovernmentProcedure")
public class GovernmentProcedure  {
  
  @XmlElement(name="currentCode", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private GovernmentProcedureCurrentCodeType currentCode = null;
 /**
   * Get currentCode
   * @return currentCode
  **/
  @JsonProperty("currentCode")
  @NotNull
  public GovernmentProcedureCurrentCodeType getCurrentCode() {
    return currentCode;
  }

  public void setCurrentCode(GovernmentProcedureCurrentCodeType currentCode) {
    this.currentCode = currentCode;
  }

  public GovernmentProcedure currentCode(GovernmentProcedureCurrentCodeType currentCode) {
    this.currentCode = currentCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernmentProcedure {\n");
    
    sb.append("    currentCode: ").append(toIndentedString(currentCode)).append("\n");
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

