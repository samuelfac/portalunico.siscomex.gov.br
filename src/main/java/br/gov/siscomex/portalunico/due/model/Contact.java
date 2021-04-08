package br.gov.siscomex.portalunico.due.model;

import java.util.ArrayList;
import java.util.List;

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
 @XmlType(name = "Contact", propOrder =
    { "communication", "name"
})

@XmlRootElement(name="Contact")
public class Contact  {
  
  @XmlElement(name="communication", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<Communication> communication = new ArrayList<>();

  @XmlElement(name="name", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ContactNameTextType name = null;
 /**
   * Get communication
   * @return communication
  **/
  @JsonProperty("communication")
  @NotNull
  public List<Communication> getCommunication() {
    return communication;
  }

  public void setCommunication(List<Communication> communication) {
    this.communication = communication;
  }

  public Contact communication(List<Communication> communication) {
    this.communication = communication;
    return this;
  }

  public Contact addCommunicationItem(Communication communicationItem) {
    this.communication.add(communicationItem);
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public ContactNameTextType getName() {
    return name;
  }

  public void setName(ContactNameTextType name) {
    this.name = name;
  }

  public Contact name(ContactNameTextType name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

