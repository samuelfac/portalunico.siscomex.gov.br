package br.gov.siscomex.portalunico.cct_ext.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

