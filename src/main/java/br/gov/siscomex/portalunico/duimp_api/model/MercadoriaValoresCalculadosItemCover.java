package br.gov.siscomex.portalunico.duimp_api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MercadoriaValoresCalculadosItemCover", propOrder =
    { "valorLocalEmbarqueBRL", "valorAduaneiroBRL"
})

@XmlRootElement(name="MercadoriaValoresCalculadosItemCover")
/**
  * Valores da Mercadoria.
 **/
@ApiModel(description="Valores da Mercadoria.")
public class MercadoriaValoresCalculadosItemCover  {
  
  @XmlElement(name="valorLocalEmbarqueBRL")
  @ApiModelProperty(example = "20.666", value = "Valor total da mercadoria no local de embarque em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor total da mercadoria no local de embarque em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorLocalEmbarqueBRL = null;

  @XmlElement(name="valorAduaneiroBRL")
  @ApiModelProperty(example = "20.666", value = "Valor total aduaneiro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor total aduaneiro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAduaneiroBRL = null;
 /**
   * Valor total da mercadoria no local de embarque em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorLocalEmbarqueBRL
  **/
  @JsonProperty("valorLocalEmbarqueBRL")
  public Double getValorLocalEmbarqueBRL() {
    return valorLocalEmbarqueBRL;
  }

  public void setValorLocalEmbarqueBRL(Double valorLocalEmbarqueBRL) {
    this.valorLocalEmbarqueBRL = valorLocalEmbarqueBRL;
  }

  public MercadoriaValoresCalculadosItemCover valorLocalEmbarqueBRL(Double valorLocalEmbarqueBRL) {
    this.valorLocalEmbarqueBRL = valorLocalEmbarqueBRL;
    return this;
  }

 /**
   * Valor total aduaneiro em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAduaneiroBRL
  **/
  @JsonProperty("valorAduaneiroBRL")
  public Double getValorAduaneiroBRL() {
    return valorAduaneiroBRL;
  }

  public void setValorAduaneiroBRL(Double valorAduaneiroBRL) {
    this.valorAduaneiroBRL = valorAduaneiroBRL;
  }

  public MercadoriaValoresCalculadosItemCover valorAduaneiroBRL(Double valorAduaneiroBRL) {
    this.valorAduaneiroBRL = valorAduaneiroBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MercadoriaValoresCalculadosItemCover {\n");
    
    sb.append("    valorLocalEmbarqueBRL: ").append(toIndentedString(valorLocalEmbarqueBRL)).append("\n");
    sb.append("    valorAduaneiroBRL: ").append(toIndentedString(valorAduaneiroBRL)).append("\n");
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

