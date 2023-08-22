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
 @XmlType(name = "ValoresTributoItemCover", propOrder =
    { "calculado", "aReduzir", "devido", "suspenso", "aRecolher", "originalDevido", "calculadoPagProporcional"
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

  @XmlElement(name="originalDevido")
  @ApiModelProperty(example = "16.7", value = "Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double originalDevido = null;

  @XmlElement(name="calculadoPagProporcional")
  @ApiModelProperty(example = "16.7", value = "Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double calculadoPagProporcional = null;
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

 /**
   * Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return originalDevido
  **/
  @JsonProperty("originalDevido")
  public Double getOriginalDevido() {
    return originalDevido;
  }

  public void setOriginalDevido(Double originalDevido) {
    this.originalDevido = originalDevido;
  }

  public ValoresTributoItemCover originalDevido(Double originalDevido) {
    this.originalDevido = originalDevido;
    return this;
  }

 /**
   * Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return calculadoPagProporcional
  **/
  @JsonProperty("calculadoPagProporcional")
  public Double getCalculadoPagProporcional() {
    return calculadoPagProporcional;
  }

  public void setCalculadoPagProporcional(Double calculadoPagProporcional) {
    this.calculadoPagProporcional = calculadoPagProporcional;
  }

  public ValoresTributoItemCover calculadoPagProporcional(Double calculadoPagProporcional) {
    this.calculadoPagProporcional = calculadoPagProporcional;
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
    sb.append("    originalDevido: ").append(toIndentedString(originalDevido)).append("\n");
    sb.append("    calculadoPagProporcional: ").append(toIndentedString(calculadoPagProporcional)).append("\n");
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

