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
 @XmlType(name = "SeguroCargaDuimpConsultaCover", propOrder =
    { "codigoMoedaNegociada", "valorMoedaNegociada"
})

@XmlRootElement(name="SeguroCargaDuimpConsultaCover")
/**
  * Dados do seguro.
 **/
@ApiModel(description="Dados do seguro.")
public class SeguroCargaDuimpConsultaCover  {
  
  @XmlElement(name="codigoMoedaNegociada")
  @ApiModelProperty(example = "220", value = "Código da moeda negociada do seguro.<br>Tamanho: 3<br>Formato: 'NNN'")
 /**
   * Código da moeda negociada do seguro.<br>Tamanho: 3<br>Formato: 'NNN'
  **/
  private String codigoMoedaNegociada = null;

  @XmlElement(name="valorMoedaNegociada")
  @ApiModelProperty(example = "30.22", value = "Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valorMoedaNegociada = null;
 /**
   * Código da moeda negociada do seguro.&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;NNN&#39;
   * @return codigoMoedaNegociada
  **/
  @JsonProperty("codigoMoedaNegociada")
  public String getCodigoMoedaNegociada() {
    return codigoMoedaNegociada;
  }

  public void setCodigoMoedaNegociada(String codigoMoedaNegociada) {
    this.codigoMoedaNegociada = codigoMoedaNegociada;
  }

  public SeguroCargaDuimpConsultaCover codigoMoedaNegociada(String codigoMoedaNegociada) {
    this.codigoMoedaNegociada = codigoMoedaNegociada;
    return this;
  }

 /**
   * Valor do seguro na moeda negociada.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorMoedaNegociada
  **/
  @JsonProperty("valorMoedaNegociada")
  public Double getValorMoedaNegociada() {
    return valorMoedaNegociada;
  }

  public void setValorMoedaNegociada(Double valorMoedaNegociada) {
    this.valorMoedaNegociada = valorMoedaNegociada;
  }

  public SeguroCargaDuimpConsultaCover valorMoedaNegociada(Double valorMoedaNegociada) {
    this.valorMoedaNegociada = valorMoedaNegociada;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeguroCargaDuimpConsultaCover {\n");
    
    sb.append("    codigoMoedaNegociada: ").append(toIndentedString(codigoMoedaNegociada)).append("\n");
    sb.append("    valorMoedaNegociada: ").append(toIndentedString(valorMoedaNegociada)).append("\n");
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

