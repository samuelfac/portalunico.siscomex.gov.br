package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.EntregaConteiner;
import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "EntregasConteineres", propOrder =
    { "entregaConteiner"
})

@XmlRootElement(name="EntregasConteineres")
/**
  * Entregas por contêineres<br>Máximo de ocorrências: 1
 **/
@ApiModel(description="Entregas por contêineres<br>Máximo de ocorrências: 1")
public class EntregasConteineres  {
  
  @XmlElement(name="entregaConteiner", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private EntregaConteiner entregaConteiner = null;
 /**
   * Get entregaConteiner
   * @return entregaConteiner
  **/
  @JsonProperty("entregaConteiner")
  @NotNull
  public EntregaConteiner getEntregaConteiner() {
    return entregaConteiner;
  }

  public void setEntregaConteiner(EntregaConteiner entregaConteiner) {
    this.entregaConteiner = entregaConteiner;
  }

  public EntregasConteineres entregaConteiner(EntregaConteiner entregaConteiner) {
    this.entregaConteiner = entregaConteiner;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregasConteineres {\n");
    
    sb.append("    entregaConteiner: ").append(toIndentedString(entregaConteiner)).append("\n");
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

