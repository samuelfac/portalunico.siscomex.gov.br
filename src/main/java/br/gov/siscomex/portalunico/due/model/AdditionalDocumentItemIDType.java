package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "AdditionalDocumentItemIDType", propOrder =
    { "schemeID", "value"
})

@XmlRootElement(name="AdditionalDocumentItemIDType")
public class AdditionalDocumentItemIDType  {
  
  @XmlElement(name="schemeID")
  @ApiModelProperty(value = "")
  private String schemeID = null;

  @XmlElement(name="value")
  @ApiModelProperty(value = "")
  private String value = null;
 /**
   * Get schemeID
   * @return schemeID
  **/
  @JsonProperty("schemeID")
  public String getSchemeID() {
    return schemeID;
  }

  public void setSchemeID(String schemeID) {
    this.schemeID = schemeID;
  }

  public AdditionalDocumentItemIDType schemeID(String schemeID) {
    this.schemeID = schemeID;
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

  public AdditionalDocumentItemIDType value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDocumentItemIDType {\n");
    
    sb.append("    schemeID: ").append(toIndentedString(schemeID)).append("\n");
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

