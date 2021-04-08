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
 @XmlType(name = "ExitOffice", propOrder =
    { "id", "warehouse"
})

@XmlRootElement(name="ExitOffice")
public class ExitOffice  {
  
  @XmlElement(name="id", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ExitOfficeIdentificationCodeType id = null;

  @XmlElement(name="warehouse")
  @ApiModelProperty(value = "")
  @Valid
  private Warehouse warehouse = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public ExitOfficeIdentificationCodeType getId() {
    return id;
  }

  public void setId(ExitOfficeIdentificationCodeType id) {
    this.id = id;
  }

  public ExitOffice id(ExitOfficeIdentificationCodeType id) {
    this.id = id;
    return this;
  }

 /**
   * Get warehouse
   * @return warehouse
  **/
  @JsonProperty("warehouse")
  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  public ExitOffice warehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExitOffice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
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

