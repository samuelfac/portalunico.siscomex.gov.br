package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Warehouse", propOrder =
    { "address", "id", "typeCode"
})

@XmlRootElement(name="Warehouse")
public class Warehouse  {
  
  @XmlElement(name="address")
  @ApiModelProperty(value = "")
  @Valid
  private Address address = null;

  @XmlElement(name="id")
  @ApiModelProperty(value = "")
  @Valid
  private WarehouseIdentificationIDType id = null;

  @XmlElement(name="typeCode", required = true)
  @ApiModelProperty(required = true, value = "")
  private String typeCode = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Warehouse address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public WarehouseIdentificationIDType getId() {
    return id;
  }

  public void setId(WarehouseIdentificationIDType id) {
    this.id = id;
  }

  public Warehouse id(WarehouseIdentificationIDType id) {
    this.id = id;
    return this;
  }

 /**
   * Get typeCode
   * @return typeCode
  **/
  @JsonProperty("typeCode")
  @NotNull
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public Warehouse typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warehouse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

