package br.gov.siscomex.portalunico.duimp.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ValoresDaMercadoriaNosLocais", propOrder =
    { "valorTotalMercadoriaLocalEmbarqueDolar", "valorTotalMercadoriaLocalEmbarqueReal", "valorTotalMercadoriaLocalDescargaReal"
})

@XmlRootElement(name="ValoresDaMercadoriaNosLocais")
public class ValoresDaMercadoriaNosLocais  {
  
  @XmlElement(name="valorTotalMercadoriaLocalEmbarqueDolar")
  @ApiModelProperty(example = "10.12", value = "Valor total da mercadoria no local de embarque em dolar<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total da mercadoria no local de embarque em dolar<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalMercadoriaLocalEmbarqueDolar = null;

  @XmlElement(name="valorTotalMercadoriaLocalEmbarqueReal")
  @ApiModelProperty(example = "20.1234", value = "Valor total da mercadoria no local de embarque em reais<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total da mercadoria no local de embarque em reais<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalMercadoriaLocalEmbarqueReal = null;

  @XmlElement(name="valorTotalMercadoriaLocalDescargaReal")
  @ApiModelProperty(example = "30.1234567", value = "Valor total da mercadoria no local de descarga em reais<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total da mercadoria no local de descarga em reais<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalMercadoriaLocalDescargaReal = null;
 /**
   * Valor total da mercadoria no local de embarque em dolar&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalMercadoriaLocalEmbarqueDolar
  **/
  @JsonProperty("valorTotalMercadoriaLocalEmbarqueDolar")
  public BigDecimal getValorTotalMercadoriaLocalEmbarqueDolar() {
    return valorTotalMercadoriaLocalEmbarqueDolar;
  }

  public void setValorTotalMercadoriaLocalEmbarqueDolar(BigDecimal valorTotalMercadoriaLocalEmbarqueDolar) {
    this.valorTotalMercadoriaLocalEmbarqueDolar = valorTotalMercadoriaLocalEmbarqueDolar;
  }

  public ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarqueDolar(BigDecimal valorTotalMercadoriaLocalEmbarqueDolar) {
    this.valorTotalMercadoriaLocalEmbarqueDolar = valorTotalMercadoriaLocalEmbarqueDolar;
    return this;
  }

 /**
   * Valor total da mercadoria no local de embarque em reais&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalMercadoriaLocalEmbarqueReal
  **/
  @JsonProperty("valorTotalMercadoriaLocalEmbarqueReal")
  public BigDecimal getValorTotalMercadoriaLocalEmbarqueReal() {
    return valorTotalMercadoriaLocalEmbarqueReal;
  }

  public void setValorTotalMercadoriaLocalEmbarqueReal(BigDecimal valorTotalMercadoriaLocalEmbarqueReal) {
    this.valorTotalMercadoriaLocalEmbarqueReal = valorTotalMercadoriaLocalEmbarqueReal;
  }

  public ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalEmbarqueReal(BigDecimal valorTotalMercadoriaLocalEmbarqueReal) {
    this.valorTotalMercadoriaLocalEmbarqueReal = valorTotalMercadoriaLocalEmbarqueReal;
    return this;
  }

 /**
   * Valor total da mercadoria no local de descarga em reais&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalMercadoriaLocalDescargaReal
  **/
  @JsonProperty("valorTotalMercadoriaLocalDescargaReal")
  public BigDecimal getValorTotalMercadoriaLocalDescargaReal() {
    return valorTotalMercadoriaLocalDescargaReal;
  }

  public void setValorTotalMercadoriaLocalDescargaReal(BigDecimal valorTotalMercadoriaLocalDescargaReal) {
    this.valorTotalMercadoriaLocalDescargaReal = valorTotalMercadoriaLocalDescargaReal;
  }

  public ValoresDaMercadoriaNosLocais valorTotalMercadoriaLocalDescargaReal(BigDecimal valorTotalMercadoriaLocalDescargaReal) {
    this.valorTotalMercadoriaLocalDescargaReal = valorTotalMercadoriaLocalDescargaReal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoresDaMercadoriaNosLocais {\n");
    
    sb.append("    valorTotalMercadoriaLocalEmbarqueDolar: ").append(toIndentedString(valorTotalMercadoriaLocalEmbarqueDolar)).append("\n");
    sb.append("    valorTotalMercadoriaLocalEmbarqueReal: ").append(toIndentedString(valorTotalMercadoriaLocalEmbarqueReal)).append("\n");
    sb.append("    valorTotalMercadoriaLocalDescargaReal: ").append(toIndentedString(valorTotalMercadoriaLocalDescargaReal)).append("\n");
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

