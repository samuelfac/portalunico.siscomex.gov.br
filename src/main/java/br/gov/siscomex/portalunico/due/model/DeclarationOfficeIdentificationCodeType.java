package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclarationOfficeIdentificationCodeType", propOrder =
    { "listID", "value"
})

@XmlRootElement(name="DeclarationOfficeIdentificationCodeType")
public class DeclarationOfficeIdentificationCodeType  {
  
  @XmlElement(name="listID")
  @ApiModelProperty(value = "")
  private String listID = null;

  @XmlElement(name="value")
  @ApiModelProperty(value = "")
  private String value = null;
 /**
   * Get listID
   * @return listID
  **/
  @JsonProperty("listID")
  public String getListID() {
    return listID;
  }

  public void setListID(String listID) {
    this.listID = listID;
  }

  public DeclarationOfficeIdentificationCodeType listID(String listID) {
    this.listID = listID;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DeclarationOfficeIdentificationCodeType value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclarationOfficeIdentificationCodeType {\n");
    
    sb.append("    listID: ").append(toIndentedString(listID)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

