package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ValoresTributoItemCover", propOrder =
    { "calculado", "aReduzir", "devido", "suspenso", "aRecolher"
})

@XmlRootElement(name="ValoresTributoItemCover")
/**
  * Valores do cálculo do tributo.
 **/
@ApiModel(description="Valores do cálculo do tributo.")
public class ValoresTributoItemCover  {
  
  @XmlElement(name="calculado")
  @ApiModelProperty(example = "1598.73", value = "Valor Calculado do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor Calculado do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double calculado = null;

  @XmlElement(name="aReduzir")
  @ApiModelProperty(example = "165.7", value = "Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double aReduzir = null;

  @XmlElement(name="devido")
  @ApiModelProperty(example = "16.7", value = "Valor Devido do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor Devido do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double devido = null;

  @XmlElement(name="suspenso")
  @ApiModelProperty(example = "16.7", value = "Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double suspenso = null;

  @XmlElement(name="aRecolher")
  @ApiModelProperty(example = "16.7", value = "Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double aRecolher = null;
 /**
   * Valor Calculado do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return calculado
  **/
  @JsonProperty("calculado")
  public Double getCalculado() {
    return calculado;
  }

  public void setCalculado(Double calculado) {
    this.calculado = calculado;
  }

  public ValoresTributoItemCover calculado(Double calculado) {
    this.calculado = calculado;
    return this;
  }

 /**
   * Valor a Reduzir do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return aReduzir
  **/
  @JsonProperty("aReduzir")
  public Double getAReduzir() {
    return aReduzir;
  }

  public void setAReduzir(Double aReduzir) {
    this.aReduzir = aReduzir;
  }

  public ValoresTributoItemCover aReduzir(Double aReduzir) {
    this.aReduzir = aReduzir;
    return this;
  }

 /**
   * Valor Devido do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return devido
  **/
  @JsonProperty("devido")
  public Double getDevido() {
    return devido;
  }

  public void setDevido(Double devido) {
    this.devido = devido;
  }

  public ValoresTributoItemCover devido(Double devido) {
    this.devido = devido;
    return this;
  }

 /**
   * Valor Suspenso do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return suspenso
  **/
  @JsonProperty("suspenso")
  public Double getSuspenso() {
    return suspenso;
  }

  public void setSuspenso(Double suspenso) {
    this.suspenso = suspenso;
  }

  public ValoresTributoItemCover suspenso(Double suspenso) {
    this.suspenso = suspenso;
    return this;
  }

 /**
   * Valor a Recolher do Imposto de Importação em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return aRecolher
  **/
  @JsonProperty("aRecolher")
  public Double getARecolher() {
    return aRecolher;
  }

  public void setARecolher(Double aRecolher) {
    this.aRecolher = aRecolher;
  }

  public ValoresTributoItemCover aRecolher(Double aRecolher) {
    this.aRecolher = aRecolher;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoresTributoItemCover {\n");
    
    sb.append("    calculado: ").append(toIndentedString(calculado)).append("\n");
    sb.append("    aReduzir: ").append(toIndentedString(aReduzir)).append("\n");
    sb.append("    devido: ").append(toIndentedString(devido)).append("\n");
    sb.append("    suspenso: ").append(toIndentedString(suspenso)).append("\n");
    sb.append("    aRecolher: ").append(toIndentedString(aRecolher)).append("\n");
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

