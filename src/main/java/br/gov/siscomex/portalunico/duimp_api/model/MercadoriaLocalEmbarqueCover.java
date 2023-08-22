package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MercadoriaLocalEmbarqueCover", propOrder =
    { "valorTotalBRL"
})

@XmlRootElement(name="MercadoriaLocalEmbarqueCover")
/**
  * Valor da mercadoria no local de embarque.
 **/
@ApiModel(description="Valor da mercadoria no local de embarque.")
public class MercadoriaLocalEmbarqueCover  {
  
  @XmlElement(name="valorTotalBRL")
  @ApiModelProperty(example = "3806.5", value = "Valor total da mercadoria no local de embarque.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor total da mercadoria no local de embarque.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorTotalBRL = null;
 /**
   * Valor total da mercadoria no local de embarque.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalBRL
  **/
  @JsonProperty("valorTotalBRL")
  public Double getValorTotalBRL() {
    return valorTotalBRL;
  }

  public void setValorTotalBRL(Double valorTotalBRL) {
    this.valorTotalBRL = valorTotalBRL;
  }

  public MercadoriaLocalEmbarqueCover valorTotalBRL(Double valorTotalBRL) {
    this.valorTotalBRL = valorTotalBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MercadoriaLocalEmbarqueCover {\n");
    
    sb.append("    valorTotalBRL: ").append(toIndentedString(valorTotalBRL)).append("\n");
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

