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
 @XmlType(name = "ValoresTributoDuimpConsultaCover", propOrder =
    { "calculado", "aReduzir", "devido", "suspenso", "aRecolher", "recolhido"
})

@XmlRootElement(name="ValoresTributoDuimpConsultaCover")
/**
  * Valores do cálculo do tributo.
 **/
@ApiModel(description="Valores do cálculo do tributo.")
public class ValoresTributoDuimpConsultaCover  {
  
  @XmlElement(name="calculado")
  @ApiModelProperty(example = "1598.73", value = "Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso,este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens")
 /**
   * Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso,este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens
  **/
  private Double calculado = null;

  @XmlElement(name="aReduzir")
  @ApiModelProperty(example = "135.7", value = "Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double aReduzir = null;

  @XmlElement(name="devido")
  @ApiModelProperty(example = "201.12", value = "Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores originalmente devidos dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens")
 /**
   * Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores originalmente devidos dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens
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

  @XmlElement(name="recolhido")
  @ApiModelProperty(example = "16.7", value = "Valores Recolhidos (pagos) do Tributo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valores Recolhidos (pagos) do Tributo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double recolhido = null;
 /**
   * Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso,este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens
   * @return calculado
  **/
  @JsonProperty("calculado")
  public Double getCalculado() {
    return calculado;
  }

  public void setCalculado(Double calculado) {
    this.calculado = calculado;
  }

  public ValoresTributoDuimpConsultaCover calculado(Double calculado) {
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

  public ValoresTributoDuimpConsultaCover aReduzir(Double aReduzir) {
    this.aReduzir = aReduzir;
    return this;
  }

 /**
   * Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores originalmente devidos dos itens.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto. Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor possuirá o somatório dos valores calculados do pagamento proporcional dos itens
   * @return devido
  **/
  @JsonProperty("devido")
  public Double getDevido() {
    return devido;
  }

  public void setDevido(Double devido) {
    this.devido = devido;
  }

  public ValoresTributoDuimpConsultaCover devido(Double devido) {
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

  public ValoresTributoDuimpConsultaCover suspenso(Double suspenso) {
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

  public ValoresTributoDuimpConsultaCover aRecolher(Double aRecolher) {
    this.aRecolher = aRecolher;
    return this;
  }

 /**
   * Valores Recolhidos (pagos) do Tributo.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return recolhido
  **/
  @JsonProperty("recolhido")
  public Double getRecolhido() {
    return recolhido;
  }

  public void setRecolhido(Double recolhido) {
    this.recolhido = recolhido;
  }

  public ValoresTributoDuimpConsultaCover recolhido(Double recolhido) {
    this.recolhido = recolhido;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValoresTributoDuimpConsultaCover {\n");
    
    sb.append("    calculado: ").append(toIndentedString(calculado)).append("\n");
    sb.append("    aReduzir: ").append(toIndentedString(aReduzir)).append("\n");
    sb.append("    devido: ").append(toIndentedString(devido)).append("\n");
    sb.append("    suspenso: ").append(toIndentedString(suspenso)).append("\n");
    sb.append("    aRecolher: ").append(toIndentedString(aRecolher)).append("\n");
    sb.append("    recolhido: ").append(toIndentedString(recolhido)).append("\n");
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

