package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TransporteProprio", propOrder =
    { "consignatario"
})

@XmlRootElement(name="TransporteProprio")
/**
  * Dados do transporte próprio
 **/
@ApiModel(description="Dados do transporte próprio")
public class TransporteProprio  {
  
  @XmlElement(name="consignatario", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Consignatario consignatario = null;
 /**
   * Get consignatario
   * @return consignatario
  **/
  @JsonProperty("consignatario")
  @NotNull
  public Consignatario getConsignatario() {
    return consignatario;
  }

  public void setConsignatario(Consignatario consignatario) {
    this.consignatario = consignatario;
  }

  public TransporteProprio consignatario(Consignatario consignatario) {
    this.consignatario = consignatario;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransporteProprio {\n");
    
    sb.append("    consignatario: ").append(toIndentedString(consignatario)).append("\n");
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

