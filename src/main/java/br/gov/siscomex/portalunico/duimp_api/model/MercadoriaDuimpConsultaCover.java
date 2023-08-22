package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MercadoriaDuimpConsultaCover", propOrder =
    { "valorTotalLocalEmbarqueBRL", "valorTotalLocalEmbarqueUSD"
})

@XmlRootElement(name="MercadoriaDuimpConsultaCover")
public class MercadoriaDuimpConsultaCover  {
  
  @XmlElement(name="valorTotalLocalEmbarqueBRL")
  @ApiModelProperty(example = "20.366", value = "Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorTotalLocalEmbarqueBRL = null;

  @XmlElement(name="valorTotalLocalEmbarqueUSD")
  @ApiModelProperty(example = "20.366", value = "Valor total da mercadoria no local de embarque em US$ (Dólares). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor total da mercadoria no local de embarque em US$ (Dólares). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorTotalLocalEmbarqueUSD = null;
 /**
   * Valor total da mercadoria no local de embarque em R$ (Reais). &lt;br&gt; Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalLocalEmbarqueBRL
  **/
  @JsonProperty("valorTotalLocalEmbarqueBRL")
  public Double getValorTotalLocalEmbarqueBRL() {
    return valorTotalLocalEmbarqueBRL;
  }

  public void setValorTotalLocalEmbarqueBRL(Double valorTotalLocalEmbarqueBRL) {
    this.valorTotalLocalEmbarqueBRL = valorTotalLocalEmbarqueBRL;
  }

  public MercadoriaDuimpConsultaCover valorTotalLocalEmbarqueBRL(Double valorTotalLocalEmbarqueBRL) {
    this.valorTotalLocalEmbarqueBRL = valorTotalLocalEmbarqueBRL;
    return this;
  }

 /**
   * Valor total da mercadoria no local de embarque em US$ (Dólares). &lt;br&gt; Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorTotalLocalEmbarqueUSD
  **/
  @JsonProperty("valorTotalLocalEmbarqueUSD")
  public Double getValorTotalLocalEmbarqueUSD() {
    return valorTotalLocalEmbarqueUSD;
  }

  public void setValorTotalLocalEmbarqueUSD(Double valorTotalLocalEmbarqueUSD) {
    this.valorTotalLocalEmbarqueUSD = valorTotalLocalEmbarqueUSD;
  }

  public MercadoriaDuimpConsultaCover valorTotalLocalEmbarqueUSD(Double valorTotalLocalEmbarqueUSD) {
    this.valorTotalLocalEmbarqueUSD = valorTotalLocalEmbarqueUSD;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MercadoriaDuimpConsultaCover {\n");
    
    sb.append("    valorTotalLocalEmbarqueBRL: ").append(toIndentedString(valorTotalLocalEmbarqueBRL)).append("\n");
    sb.append("    valorTotalLocalEmbarqueUSD: ").append(toIndentedString(valorTotalLocalEmbarqueUSD)).append("\n");
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

