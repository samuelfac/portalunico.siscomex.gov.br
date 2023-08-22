package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "ItemConsultaDuimpCover", propOrder =
    { "indice", "link"
})

@XmlRootElement(name="ItemConsultaDuimpCover")
public class ItemConsultaDuimpCover  {
  
  @XmlElement(name="indice")
  @ApiModelProperty(example = "1", value = "")
  private Integer indice = null;

  @XmlElement(name="link")
  @ApiModelProperty(example = "ext/duimp/19BR00000004677/0/itens/1", value = "")
  private String link = null;
 /**
   * Get indice
   * @return indice
  **/
  @JsonProperty("indice")
  public Integer getIndice() {
    return indice;
  }

  public void setIndice(Integer indice) {
    this.indice = indice;
  }

  public ItemConsultaDuimpCover indice(Integer indice) {
    this.indice = indice;
    return this;
  }

 /**
   * Get link
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemConsultaDuimpCover link(String link) {
    this.link = link;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemConsultaDuimpCover {\n");
    
    sb.append("    indice: ").append(toIndentedString(indice)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

