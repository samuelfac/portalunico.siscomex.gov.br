package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "QuadroCalculoDto", propOrder =
    { "dataDoRegistro", "memoriaDeCalculo", "tipo", "tributado", "tributo", "valorARecolher", "valorAReduzir", "valorCalculado", "valorDevido", "valorNormal", "valorSuspenso"
})

@XmlRootElement(name="QuadroCalculoDto")
public class QuadroCalculoDto  {
  
  @XmlElement(name="dataDoRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data do registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data do registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDoRegistro = null;

  @XmlElement(name="memoriaDeCalculo")
  @ApiModelProperty(value = "")
  @Valid
  private MemoriaCalculoDto memoriaDeCalculo = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoTributoDto tipo = null;

  @XmlElement(name="tributado")
  @ApiModelProperty(value = "")
  private Boolean tributado = false;

  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TributoDto tributo = null;

  @XmlElement(name="valorARecolher")
  @ApiModelProperty(value = "Valor a recolher<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor a recolher<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorARecolher = null;

  @XmlElement(name="valorAReduzir")
  @ApiModelProperty(value = "Valor a reduzir<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor a reduzir<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorAReduzir = null;

  @XmlElement(name="valorCalculado")
  @ApiModelProperty(value = "Valor total da mercadoria<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total da mercadoria<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorCalculado = null;

  @XmlElement(name="valorDevido")
  @ApiModelProperty(value = "Valor devido<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor devido<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDevido = null;

  @XmlElement(name="valorNormal")
  @ApiModelProperty(value = "Valor normal<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor normal<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorNormal = null;

  @XmlElement(name="valorSuspenso")
  @ApiModelProperty(value = "Valor suspenso<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor suspenso<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorSuspenso = null;
 /**
   * Data do registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDoRegistro
  **/
  @JsonProperty("dataDoRegistro")
  public OffsetDateTime getDataDoRegistro() {
    return dataDoRegistro;
  }

  public void setDataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
  }

  public QuadroCalculoDto dataDoRegistro(OffsetDateTime dataDoRegistro) {
    this.dataDoRegistro = dataDoRegistro;
    return this;
  }

 /**
   * Get memoriaDeCalculo
   * @return memoriaDeCalculo
  **/
  @JsonProperty("memoriaDeCalculo")
  public MemoriaCalculoDto getMemoriaDeCalculo() {
    return memoriaDeCalculo;
  }

  public void setMemoriaDeCalculo(MemoriaCalculoDto memoriaDeCalculo) {
    this.memoriaDeCalculo = memoriaDeCalculo;
  }

  public QuadroCalculoDto memoriaDeCalculo(MemoriaCalculoDto memoriaDeCalculo) {
    this.memoriaDeCalculo = memoriaDeCalculo;
    return this;
  }

 /**
   * Get tipo
   * @return tipo
  **/
  @JsonProperty("tipo")
  public TipoTributoDto getTipo() {
    return tipo;
  }

  public void setTipo(TipoTributoDto tipo) {
    this.tipo = tipo;
  }

  public QuadroCalculoDto tipo(TipoTributoDto tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get tributado
   * @return tributado
  **/
  @JsonProperty("tributado")
  public Boolean isTributado() {
    return tributado;
  }

  public void setTributado(Boolean tributado) {
    this.tributado = tributado;
  }

  public QuadroCalculoDto tributado(Boolean tributado) {
    this.tributado = tributado;
    return this;
  }

 /**
   * Get tributo
   * @return tributo
  **/
  @JsonProperty("tributo")
  public TributoDto getTributo() {
    return tributo;
  }

  public void setTributo(TributoDto tributo) {
    this.tributo = tributo;
  }

  public QuadroCalculoDto tributo(TributoDto tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Valor a recolher&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorARecolher
  **/
  @JsonProperty("valorARecolher")
  public BigDecimal getValorARecolher() {
    return valorARecolher;
  }

  public void setValorARecolher(BigDecimal valorARecolher) {
    this.valorARecolher = valorARecolher;
  }

  public QuadroCalculoDto valorARecolher(BigDecimal valorARecolher) {
    this.valorARecolher = valorARecolher;
    return this;
  }

 /**
   * Valor a reduzir&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAReduzir
  **/
  @JsonProperty("valorAReduzir")
  public BigDecimal getValorAReduzir() {
    return valorAReduzir;
  }

  public void setValorAReduzir(BigDecimal valorAReduzir) {
    this.valorAReduzir = valorAReduzir;
  }

  public QuadroCalculoDto valorAReduzir(BigDecimal valorAReduzir) {
    this.valorAReduzir = valorAReduzir;
    return this;
  }

 /**
   * Valor total da mercadoria&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorCalculado
  **/
  @JsonProperty("valorCalculado")
  public BigDecimal getValorCalculado() {
    return valorCalculado;
  }

  public void setValorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
  }

  public QuadroCalculoDto valorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
    return this;
  }

 /**
   * Valor devido&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorDevido
  **/
  @JsonProperty("valorDevido")
  public BigDecimal getValorDevido() {
    return valorDevido;
  }

  public void setValorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
  }

  public QuadroCalculoDto valorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
    return this;
  }

 /**
   * Valor normal&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorNormal
  **/
  @JsonProperty("valorNormal")
  public BigDecimal getValorNormal() {
    return valorNormal;
  }

  public void setValorNormal(BigDecimal valorNormal) {
    this.valorNormal = valorNormal;
  }

  public QuadroCalculoDto valorNormal(BigDecimal valorNormal) {
    this.valorNormal = valorNormal;
    return this;
  }

 /**
   * Valor suspenso&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorSuspenso
  **/
  @JsonProperty("valorSuspenso")
  public BigDecimal getValorSuspenso() {
    return valorSuspenso;
  }

  public void setValorSuspenso(BigDecimal valorSuspenso) {
    this.valorSuspenso = valorSuspenso;
  }

  public QuadroCalculoDto valorSuspenso(BigDecimal valorSuspenso) {
    this.valorSuspenso = valorSuspenso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuadroCalculoDto {\n");
    
    sb.append("    dataDoRegistro: ").append(toIndentedString(dataDoRegistro)).append("\n");
    sb.append("    memoriaDeCalculo: ").append(toIndentedString(memoriaDeCalculo)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    tributado: ").append(toIndentedString(tributado)).append("\n");
    sb.append("    tributo: ").append(toIndentedString(tributo)).append("\n");
    sb.append("    valorARecolher: ").append(toIndentedString(valorARecolher)).append("\n");
    sb.append("    valorAReduzir: ").append(toIndentedString(valorAReduzir)).append("\n");
    sb.append("    valorCalculado: ").append(toIndentedString(valorCalculado)).append("\n");
    sb.append("    valorDevido: ").append(toIndentedString(valorDevido)).append("\n");
    sb.append("    valorNormal: ").append(toIndentedString(valorNormal)).append("\n");
    sb.append("    valorSuspenso: ").append(toIndentedString(valorSuspenso)).append("\n");
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

