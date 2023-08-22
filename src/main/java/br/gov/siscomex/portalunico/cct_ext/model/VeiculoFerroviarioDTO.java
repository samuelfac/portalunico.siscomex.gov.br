package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "VeiculoFerroviarioDTO", propOrder =
    { "prefixoTrem", "quantidadeVagoes"
})

@XmlRootElement(name="VeiculoFerroviarioDTO")
public class VeiculoFerroviarioDTO  {
  
  @XmlElement(name="prefixoTrem")
  @ApiModelProperty(value = "")
  private String prefixoTrem = null;

  @XmlElement(name="quantidadeVagoes")
  @ApiModelProperty(value = "")
  private Integer quantidadeVagoes = null;
 /**
   * Get prefixoTrem
   * @return prefixoTrem
  **/
  @JsonProperty("prefixoTrem")
  public String getPrefixoTrem() {
    return prefixoTrem;
  }

  public void setPrefixoTrem(String prefixoTrem) {
    this.prefixoTrem = prefixoTrem;
  }

  public VeiculoFerroviarioDTO prefixoTrem(String prefixoTrem) {
    this.prefixoTrem = prefixoTrem;
    return this;
  }

 /**
   * Get quantidadeVagoes
   * @return quantidadeVagoes
  **/
  @JsonProperty("quantidadeVagoes")
  public Integer getQuantidadeVagoes() {
    return quantidadeVagoes;
  }

  public void setQuantidadeVagoes(Integer quantidadeVagoes) {
    this.quantidadeVagoes = quantidadeVagoes;
  }

  public VeiculoFerroviarioDTO quantidadeVagoes(Integer quantidadeVagoes) {
    this.quantidadeVagoes = quantidadeVagoes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeiculoFerroviarioDTO {\n");
    
    sb.append("    prefixoTrem: ").append(toIndentedString(prefixoTrem)).append("\n");
    sb.append("    quantidadeVagoes: ").append(toIndentedString(quantidadeVagoes)).append("\n");
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

