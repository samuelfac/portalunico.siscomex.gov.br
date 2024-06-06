package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "QuadroDeCalculoDTO", propOrder =
    { "memoriaDeCalculo", "tipo", "tributado", "tributo", "valorARecolher", "valorAReduzir", "valorCalculado", "valorDevido", "valorNormal", "valorSuspenso"
})

@XmlRootElement(name="QuadroDeCalculoDTO")
public class QuadroDeCalculoDTO  {
  
  @XmlElement(name="memoriaDeCalculo")
  @ApiModelProperty(value = "")
  @Valid
  private MemoriaDeCalculoDTO memoriaDeCalculo = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "")
  @Valid
  private TipoTributoDto tipo = null;

  @XmlElement(name="tributado")
  @ApiModelProperty(value = "")
  private Boolean tributado = null;

  @XmlElement(name="tributo")
  @ApiModelProperty(value = "")
  @Valid
  private TributoDto tributo = null;

  @XmlElement(name="valorARecolher")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorARecolher = null;

  @XmlElement(name="valorAReduzir")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorAReduzir = null;

  @XmlElement(name="valorCalculado")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorCalculado = null;

  @XmlElement(name="valorDevido")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorDevido = null;

  @XmlElement(name="valorNormal")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorNormal = null;

  @XmlElement(name="valorSuspenso")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal valorSuspenso = null;
 /**
   * Get memoriaDeCalculo
   * @return memoriaDeCalculo
  **/
  @JsonProperty("memoriaDeCalculo")
  public MemoriaDeCalculoDTO getMemoriaDeCalculo() {
    return memoriaDeCalculo;
  }

  public void setMemoriaDeCalculo(MemoriaDeCalculoDTO memoriaDeCalculo) {
    this.memoriaDeCalculo = memoriaDeCalculo;
  }

  public QuadroDeCalculoDTO memoriaDeCalculo(MemoriaDeCalculoDTO memoriaDeCalculo) {
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

  public QuadroDeCalculoDTO tipo(TipoTributoDto tipo) {
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

  public QuadroDeCalculoDTO tributado(Boolean tributado) {
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

  public QuadroDeCalculoDTO tributo(TributoDto tributo) {
    this.tributo = tributo;
    return this;
  }

 /**
   * Get valorARecolher
   * @return valorARecolher
  **/
  @JsonProperty("valorARecolher")
  public BigDecimal getValorARecolher() {
    return valorARecolher;
  }

  public void setValorARecolher(BigDecimal valorARecolher) {
    this.valorARecolher = valorARecolher;
  }

  public QuadroDeCalculoDTO valorARecolher(BigDecimal valorARecolher) {
    this.valorARecolher = valorARecolher;
    return this;
  }

 /**
   * Get valorAReduzir
   * @return valorAReduzir
  **/
  @JsonProperty("valorAReduzir")
  public BigDecimal getValorAReduzir() {
    return valorAReduzir;
  }

  public void setValorAReduzir(BigDecimal valorAReduzir) {
    this.valorAReduzir = valorAReduzir;
  }

  public QuadroDeCalculoDTO valorAReduzir(BigDecimal valorAReduzir) {
    this.valorAReduzir = valorAReduzir;
    return this;
  }

 /**
   * Get valorCalculado
   * @return valorCalculado
  **/
  @JsonProperty("valorCalculado")
  public BigDecimal getValorCalculado() {
    return valorCalculado;
  }

  public void setValorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
  }

  public QuadroDeCalculoDTO valorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
    return this;
  }

 /**
   * Get valorDevido
   * @return valorDevido
  **/
  @JsonProperty("valorDevido")
  public BigDecimal getValorDevido() {
    return valorDevido;
  }

  public void setValorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
  }

  public QuadroDeCalculoDTO valorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
    return this;
  }

 /**
   * Get valorNormal
   * @return valorNormal
  **/
  @JsonProperty("valorNormal")
  public BigDecimal getValorNormal() {
    return valorNormal;
  }

  public void setValorNormal(BigDecimal valorNormal) {
    this.valorNormal = valorNormal;
  }

  public QuadroDeCalculoDTO valorNormal(BigDecimal valorNormal) {
    this.valorNormal = valorNormal;
    return this;
  }

 /**
   * Get valorSuspenso
   * @return valorSuspenso
  **/
  @JsonProperty("valorSuspenso")
  public BigDecimal getValorSuspenso() {
    return valorSuspenso;
  }

  public void setValorSuspenso(BigDecimal valorSuspenso) {
    this.valorSuspenso = valorSuspenso;
  }

  public QuadroDeCalculoDTO valorSuspenso(BigDecimal valorSuspenso) {
    this.valorSuspenso = valorSuspenso;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuadroDeCalculoDTO {\n");
    
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

