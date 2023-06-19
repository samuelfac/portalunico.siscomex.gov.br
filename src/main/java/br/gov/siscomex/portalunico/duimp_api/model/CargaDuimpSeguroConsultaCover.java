package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CargaDuimpSeguroConsultaCover", propOrder =
    { "codigoMoedaNegociada", "valorMoedaNegociada"
})

@XmlRootElement(name="CargaDuimpSeguroConsultaCover")
/**
  * Dados do seguro.
 **/
@ApiModel(description="Dados do seguro.")
public class CargaDuimpSeguroConsultaCover  {
  
  @XmlElement(name="codigoMoedaNegociada")
  @ApiModelProperty(example = "USD", value = "Código da moeda negociada do seguro (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'")
 /**
   * Código da moeda negociada do seguro (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'
  **/
  private String codigoMoedaNegociada = null;

  @XmlElement(name="valorMoedaNegociada")
  @ApiModelProperty(example = "30.22", value = "Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valorMoedaNegociada = null;
 /**
   * Código da moeda negociada do seguro (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;
   * @return codigoMoedaNegociada
  **/
  @JsonProperty("codigoMoedaNegociada")
  public String getCodigoMoedaNegociada() {
    return codigoMoedaNegociada;
  }

  public void setCodigoMoedaNegociada(String codigoMoedaNegociada) {
    this.codigoMoedaNegociada = codigoMoedaNegociada;
  }

  public CargaDuimpSeguroConsultaCover codigoMoedaNegociada(String codigoMoedaNegociada) {
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

  public CargaDuimpSeguroConsultaCover valorMoedaNegociada(Double valorMoedaNegociada) {
    this.valorMoedaNegociada = valorMoedaNegociada;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDuimpSeguroConsultaCover {\n");
    
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

