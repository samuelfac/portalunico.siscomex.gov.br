package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

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

