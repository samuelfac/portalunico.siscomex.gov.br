package br.gov.siscomex.portalunico.cct_ext.model;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TransitoSimplificado", propOrder =
    { "veiculoFerroviario", "veiculoRodoviario"
})

@XmlRootElement(name="TransitoSimplificado")
/**
  * Conjunto de informações dos veículos envolvidos no Trânsito Simplificado
 **/
@ApiModel(description="Conjunto de informações dos veículos envolvidos no Trânsito Simplificado")
public class TransitoSimplificado  {
  
  @XmlElement(name="veiculoFerroviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoFerroviario veiculoFerroviario = null;

  @XmlElement(name="veiculoRodoviario")
  @ApiModelProperty(value = "")
  @Valid
  private VeiculoRodoviario veiculoRodoviario = null;
 /**
   * Get veiculoFerroviario
   * @return veiculoFerroviario
  **/
  @JsonProperty("veiculoFerroviario")
  public VeiculoFerroviario getVeiculoFerroviario() {
    return veiculoFerroviario;
  }

  public void setVeiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
  }

  public TransitoSimplificado veiculoFerroviario(VeiculoFerroviario veiculoFerroviario) {
    this.veiculoFerroviario = veiculoFerroviario;
    return this;
  }

 /**
   * Get veiculoRodoviario
   * @return veiculoRodoviario
  **/
  @JsonProperty("veiculoRodoviario")
  public VeiculoRodoviario getVeiculoRodoviario() {
    return veiculoRodoviario;
  }

  public void setVeiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
  }

  public TransitoSimplificado veiculoRodoviario(VeiculoRodoviario veiculoRodoviario) {
    this.veiculoRodoviario = veiculoRodoviario;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitoSimplificado {\n");
    
    sb.append("    veiculoFerroviario: ").append(toIndentedString(veiculoFerroviario)).append("\n");
    sb.append("    veiculoRodoviario: ").append(toIndentedString(veiculoRodoviario)).append("\n");
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

