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
 @XmlType(name = "Declarant", propOrder =
    { "contact", "id"
})

@XmlRootElement(name="Declarant")
public class Declarant  {
  
  @XmlElement(name="contact")
  @ApiModelProperty(value = "")
  @Valid
  private Contact contact = null;

  @XmlElement(name="id", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DeclarantIdentificationIDType id = null;
 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Declarant contact(Contact contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public DeclarantIdentificationIDType getId() {
    return id;
  }

  public void setId(DeclarantIdentificationIDType id) {
    this.id = id;
  }

  public Declarant id(DeclarantIdentificationIDType id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Declarant {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

