package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "VeiculoFerroviario", propOrder =
    { "prefixoTrem", "quantidadeVagoes"
})

@XmlRootElement(name="VeiculoFerroviario")
/**
  * Dados do veículo ferroviário
 **/
@ApiModel(description="Dados do veículo ferroviário")
public class VeiculoFerroviario  {
  
  @XmlElement(name="prefixoTrem", required = true)
  @ApiModelProperty(example = "trem001", required = true, value = "Identificação do trem<br>Tamanho: 15")
 /**
   * Identificação do trem<br>Tamanho: 15
  **/
  private String prefixoTrem = null;

  @XmlElement(name="quantidadeVagoes", required = true)
  @ApiModelProperty(example = "10", required = true, value = "Número de vagões envolvidos no transporte<br>Tamanho: 3")
 /**
   * Número de vagões envolvidos no transporte<br>Tamanho: 3
  **/
  private Integer quantidadeVagoes = null;
 /**
   * Identificação do trem&lt;br&gt;Tamanho: 15
   * @return prefixoTrem
  **/
  @JsonProperty("prefixoTrem")
  @NotNull
  public String getPrefixoTrem() {
    return prefixoTrem;
  }

  public void setPrefixoTrem(String prefixoTrem) {
    this.prefixoTrem = prefixoTrem;
  }

  public VeiculoFerroviario prefixoTrem(String prefixoTrem) {
    this.prefixoTrem = prefixoTrem;
    return this;
  }

 /**
   * Número de vagões envolvidos no transporte&lt;br&gt;Tamanho: 3
   * @return quantidadeVagoes
  **/
  @JsonProperty("quantidadeVagoes")
  @NotNull
  public Integer getQuantidadeVagoes() {
    return quantidadeVagoes;
  }

  public void setQuantidadeVagoes(Integer quantidadeVagoes) {
    this.quantidadeVagoes = quantidadeVagoes;
  }

  public VeiculoFerroviario quantidadeVagoes(Integer quantidadeVagoes) {
    this.quantidadeVagoes = quantidadeVagoes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeiculoFerroviario {\n");
    
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

