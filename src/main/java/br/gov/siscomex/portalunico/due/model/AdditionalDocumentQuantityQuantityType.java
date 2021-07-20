package br.gov.siscomex.portalunico.due.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AdditionalDocumentQuantityQuantityType", propOrder =
    { "unitCode", "value"
})

@XmlRootElement(name="AdditionalDocumentQuantityQuantityType")
public class AdditionalDocumentQuantityQuantityType  {
  
  @XmlElement(name="unitCode")
  @ApiModelProperty(value = "")
  private String unitCode = null;

  @XmlElement(name="value")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal value = null;
 /**
   * Get unitCode
   * @return unitCode
  **/
  @JsonProperty("unitCode")
  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  public AdditionalDocumentQuantityQuantityType unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AdditionalDocumentQuantityQuantityType value(BigDecimal value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDocumentQuantityQuantityType {\n");
    
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
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
