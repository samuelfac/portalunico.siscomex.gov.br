package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "FreteValoresCalculadosDuimpCover", propOrder =
    { "valorTotalBRL"
})

@XmlRootElement(name="FreteValoresCalculadosDuimpCover")
/**
  * Dados do frete.
 **/
@ApiModel(description="Dados do frete.")
public class FreteValoresCalculadosDuimpCover  {
  
  @XmlElement(name="valorTotalBRL")
  @ApiModelProperty(example = "40.48", value = "Valor do frete total em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte")
 /**
   * Valor do frete total em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
  **/
  private Double valorTotalBRL = null;
 /**
   * Valor do frete total em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte
   * @return valorTotalBRL
  **/
  @JsonProperty("valorTotalBRL")
  public Double getValorTotalBRL() {
    return valorTotalBRL;
  }

  public void setValorTotalBRL(Double valorTotalBRL) {
    this.valorTotalBRL = valorTotalBRL;
  }

  public FreteValoresCalculadosDuimpCover valorTotalBRL(Double valorTotalBRL) {
    this.valorTotalBRL = valorTotalBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreteValoresCalculadosDuimpCover {\n");
    
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

