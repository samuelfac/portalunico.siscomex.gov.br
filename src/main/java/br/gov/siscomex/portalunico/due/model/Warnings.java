package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Warnings", propOrder =
    { "empty", "warning"
})

@XmlRootElement(name="Warnings")
public class Warnings  {
  
  @XmlElement(name="empty")
  @ApiModelProperty(value = "")
  private Boolean empty = false;

  @XmlElement(name="warning")
  @ApiModelProperty(value = "")
  private List<String> warning = null;
 /**
   * Get empty
   * @return empty
  **/
  @JsonProperty("empty")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public Warnings empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

 /**
   * Get warning
   * @return warning
  **/
  @JsonProperty("warning")
  public List<String> getWarning() {
    return warning;
  }

  public void setWarning(List<String> warning) {
    this.warning = warning;
  }

  public Warnings warning(List<String> warning) {
    this.warning = warning;
    return this;
  }

  public Warnings addWarningItem(String warningItem) {
    this.warning.add(warningItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warnings {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

