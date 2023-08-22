package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Conteiner;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "Conteineres", propOrder =
    { "conteiner"
})

@XmlRootElement(name="Conteineres")
public class Conteineres  {
  
  @XmlElement(name="conteiner", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<Conteiner> conteiner = new ArrayList<>();
 /**
   * Get conteiner
   * @return conteiner
  **/
  @JsonProperty("conteiner")
  @NotNull
  public List<Conteiner> getConteiner() {
    return conteiner;
  }

  public void setConteiner(List<Conteiner> conteiner) {
    this.conteiner = conteiner;
  }

  public Conteineres conteiner(List<Conteiner> conteiner) {
    this.conteiner = conteiner;
    return this;
  }

  public Conteineres addConteinerItem(Conteiner conteinerItem) {
    this.conteiner.add(conteinerItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conteineres {\n");
    
    sb.append("    conteiner: ").append(toIndentedString(conteiner)).append("\n");
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

