package br.gov.siscomex.portalunico.duimp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "ValorMercadoriaCover", propOrder =
    { "valorMercadoria", "valorFreteRateado", "valorSeguroRateado", "valorAduaneiro"
})

@XmlRootElement(name="ValorMercadoriaCover")
/**
  * Valores da mercadoria
 **/
@ApiModel(description="Valores da mercadoria")
public class ValorMercadoriaCover  {
  
  @XmlElement(name="valorMercadoria")
  @ApiModelProperty(example = "3806.5", value = "Valor da mercadoria no local de embarque.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da mercadoria no local de embarque.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorMercadoria = null;

  @XmlElement(name="valorFreteRateado")
  @ApiModelProperty(example = "380.65", value = "Valor do frete em reais (rateado).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do frete em reais (rateado).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorFreteRateado = null;

  @XmlElement(name="valorSeguroRateado")
  @ApiModelProperty(example = "380.65", value = "Valor do seguro em reais (rateado).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do seguro em reais (rateado).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSeguroRateado = null;

  @XmlElement(name="valorAduaneiro")
  @ApiModelProperty(example = "4567.8", value = "Valor aduaneiro em reais (VMDL).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor aduaneiro em reais (VMDL).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorAduaneiro = null;
 /**
   * Valor da mercadoria no local de embarque.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorMercadoria
  **/
  @JsonProperty("valorMercadoria")
  public BigDecimal getValorMercadoria() {
    return valorMercadoria;
  }

  public void setValorMercadoria(BigDecimal valorMercadoria) {
    this.valorMercadoria = valorMercadoria;
  }

  public ValorMercadoriaCover valorMercadoria(BigDecimal valorMercadoria) {
    this.valorMercadoria = valorMercadoria;
    return this;
  }

 /**
   * Valor do frete em reais (rateado).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorFreteRateado
  **/
  @JsonProperty("valorFreteRateado")
  public BigDecimal getValorFreteRateado() {
    return valorFreteRateado;
  }

  public void setValorFreteRateado(BigDecimal valorFreteRateado) {
    this.valorFreteRateado = valorFreteRateado;
  }

  public ValorMercadoriaCover valorFreteRateado(BigDecimal valorFreteRateado) {
    this.valorFreteRateado = valorFreteRateado;
    return this;
  }

 /**
   * Valor do seguro em reais (rateado).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorSeguroRateado
  **/
  @JsonProperty("valorSeguroRateado")
  public BigDecimal getValorSeguroRateado() {
    return valorSeguroRateado;
  }

  public void setValorSeguroRateado(BigDecimal valorSeguroRateado) {
    this.valorSeguroRateado = valorSeguroRateado;
  }

  public ValorMercadoriaCover valorSeguroRateado(BigDecimal valorSeguroRateado) {
    this.valorSeguroRateado = valorSeguroRateado;
    return this;
  }

 /**
   * Valor aduaneiro em reais (VMDL).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorAduaneiro
  **/
  @JsonProperty("valorAduaneiro")
  public BigDecimal getValorAduaneiro() {
    return valorAduaneiro;
  }

  public void setValorAduaneiro(BigDecimal valorAduaneiro) {
    this.valorAduaneiro = valorAduaneiro;
  }

  public ValorMercadoriaCover valorAduaneiro(BigDecimal valorAduaneiro) {
    this.valorAduaneiro = valorAduaneiro;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValorMercadoriaCover {\n");
    
    sb.append("    valorMercadoria: ").append(toIndentedString(valorMercadoria)).append("\n");
    sb.append("    valorFreteRateado: ").append(toIndentedString(valorFreteRateado)).append("\n");
    sb.append("    valorSeguroRateado: ").append(toIndentedString(valorSeguroRateado)).append("\n");
    sb.append("    valorAduaneiro: ").append(toIndentedString(valorAduaneiro)).append("\n");
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

