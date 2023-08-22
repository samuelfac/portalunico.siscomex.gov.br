package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "Veiculo", propOrder =
    { "chassi"
})

@XmlRootElement(name="Veiculo")
/**
  * Dados informados para carga do tipo veículos
 **/
@ApiModel(description="Dados informados para carga do tipo veículos")
public class Veiculo  {
  
  @XmlElement(name="chassi", required = true)
  @ApiModelProperty(example = "9BWZZZ377VT004251 ", required = true, value = "Chassi do veículo<br>Tamanho: 20")
 /**
   * Chassi do veículo<br>Tamanho: 20
  **/
  private String chassi = null;
 /**
   * Chassi do veículo&lt;br&gt;Tamanho: 20
   * @return chassi
  **/
  @JsonProperty("chassi")
  @NotNull
  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public Veiculo chassi(String chassi) {
    this.chassi = chassi;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Veiculo {\n");
    
    sb.append("    chassi: ").append(toIndentedString(chassi)).append("\n");
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

