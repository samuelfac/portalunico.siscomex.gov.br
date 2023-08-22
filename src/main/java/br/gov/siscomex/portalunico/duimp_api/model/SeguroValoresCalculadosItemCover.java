package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "SeguroValoresCalculadosItemCover", propOrder =
    { "valorBRL"
})

@XmlRootElement(name="SeguroValoresCalculadosItemCover")
/**
  * Valor do seguro.
 **/
@ApiModel(description="Valor do seguro.")
public class SeguroValoresCalculadosItemCover  {
  
  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "120.48", value = "Valor do seguro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor do seguro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorBRL = null;
 /**
   * Valor do seguro em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public Double getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
  }

  public SeguroValoresCalculadosItemCover valorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeguroValoresCalculadosItemCover {\n");
    
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
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

