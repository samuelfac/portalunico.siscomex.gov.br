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
 @XmlType(name = "AddressLineTextType", propOrder =
    { "languageID", "value"
})

@XmlRootElement(name="AddressLineTextType")
public class AddressLineTextType  {
  
  @XmlElement(name="languageID")
  @ApiModelProperty(value = "")
  private String languageID = null;

  @XmlElement(name="value")
  @ApiModelProperty(value = "")
  private String value = null;
 /**
   * Get languageID
   * @return languageID
  **/
  @JsonProperty("languageID")
  public String getLanguageID() {
    return languageID;
  }

  public void setLanguageID(String languageID) {
    this.languageID = languageID;
  }

  public AddressLineTextType languageID(String languageID) {
    this.languageID = languageID;
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

  public AddressLineTextType value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressLineTextType {\n");
    
    sb.append("    languageID: ").append(toIndentedString(languageID)).append("\n");
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

