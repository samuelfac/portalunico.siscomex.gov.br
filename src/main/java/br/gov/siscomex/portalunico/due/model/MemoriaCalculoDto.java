package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MemoriaCalculoDto", propOrder =
    { "percentualDeReducaoDaAliquota", "percentualDeReducaoDaBaseCalculado", "tipoDeAliquota", "valorBaseDeCalculo", "valorBaseDeCalculoEspecifico", "valorBaseDeCalculoReduzido", "valorDaAliquota", "valorDaAliquotaEspecifica", "valorDaAliquotaReduzida"
})

@XmlRootElement(name="MemoriaCalculoDto")
public class MemoriaCalculoDto  {
  
  @XmlElement(name="percentualDeReducaoDaAliquota")
  @ApiModelProperty(value = "Percentual de redução da alíquota<br />Tamanho: 16,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Percentual de redução da alíquota<br />Tamanho: 16,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal percentualDeReducaoDaAliquota = null;

  @XmlElement(name="percentualDeReducaoDaBaseCalculado")
  @ApiModelProperty(value = "Percentual da redução da base de cálculo<br />Tamanho: 16,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Percentual da redução da base de cálculo<br />Tamanho: 16,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal percentualDeReducaoDaBaseCalculado = null;


@XmlType(name="TipoDeAliquotaEnum")
@XmlEnum(String.class)
public enum TipoDeAliquotaEnum {

	@XmlEnumValue("AD_VALOREM")
	@JsonProperty("AD_VALOREM")
	AD_VALOREM(String.valueOf("AD_VALOREM")),
	
	@XmlEnumValue("ESPECIFICA")
	@JsonProperty("ESPECIFICA")
	ESPECIFICA(String.valueOf("ESPECIFICA"));


    private String value;

    TipoDeAliquotaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDeAliquotaEnum fromValue(String v) {
        for (TipoDeAliquotaEnum b : TipoDeAliquotaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeAliquotaEnum");
    }
}

  @XmlElement(name="tipoDeAliquota")
  @ApiModelProperty(value = "")
  private TipoDeAliquotaEnum tipoDeAliquota = null;

  @XmlElement(name="valorBaseDeCalculo")
  @ApiModelProperty(value = "Valor da base de cálculo<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da base de cálculo<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorBaseDeCalculo = null;

  @XmlElement(name="valorBaseDeCalculoEspecifico")
  @ApiModelProperty(value = "Valor da base de cálculo específica<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da base de cálculo específica<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorBaseDeCalculoEspecifico = null;

  @XmlElement(name="valorBaseDeCalculoReduzido")
  @ApiModelProperty(value = "Valor da base de cálculo reduzido<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da base de cálculo reduzido<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorBaseDeCalculoReduzido = null;

  @XmlElement(name="valorDaAliquota")
  @ApiModelProperty(value = "Valor da alíquota<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da alíquota<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaAliquota = null;

  @XmlElement(name="valorDaAliquotaEspecifica")
  @ApiModelProperty(value = "Valor da alíquota específica<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da alíquota específica<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaAliquotaEspecifica = null;

  @XmlElement(name="valorDaAliquotaReduzida")
  @ApiModelProperty(value = "Valor da aliquota reduzida<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor da aliquota reduzida<br />Tamanho: 16,7<br />Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorDaAliquotaReduzida = null;
 /**
   * Percentual de redução da alíquota&lt;br /&gt;Tamanho: 16,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return percentualDeReducaoDaAliquota
  **/
  @JsonProperty("percentualDeReducaoDaAliquota")
  public BigDecimal getPercentualDeReducaoDaAliquota() {
    return percentualDeReducaoDaAliquota;
  }

  public void setPercentualDeReducaoDaAliquota(BigDecimal percentualDeReducaoDaAliquota) {
    this.percentualDeReducaoDaAliquota = percentualDeReducaoDaAliquota;
  }

  public MemoriaCalculoDto percentualDeReducaoDaAliquota(BigDecimal percentualDeReducaoDaAliquota) {
    this.percentualDeReducaoDaAliquota = percentualDeReducaoDaAliquota;
    return this;
  }

 /**
   * Percentual da redução da base de cálculo&lt;br /&gt;Tamanho: 16,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return percentualDeReducaoDaBaseCalculado
  **/
  @JsonProperty("percentualDeReducaoDaBaseCalculado")
  public BigDecimal getPercentualDeReducaoDaBaseCalculado() {
    return percentualDeReducaoDaBaseCalculado;
  }

  public void setPercentualDeReducaoDaBaseCalculado(BigDecimal percentualDeReducaoDaBaseCalculado) {
    this.percentualDeReducaoDaBaseCalculado = percentualDeReducaoDaBaseCalculado;
  }

  public MemoriaCalculoDto percentualDeReducaoDaBaseCalculado(BigDecimal percentualDeReducaoDaBaseCalculado) {
    this.percentualDeReducaoDaBaseCalculado = percentualDeReducaoDaBaseCalculado;
    return this;
  }

 /**
   * Get tipoDeAliquota
   * @return tipoDeAliquota
  **/
  @JsonProperty("tipoDeAliquota")
  public String getTipoDeAliquota() {
    if (tipoDeAliquota == null) {
      return null;
    }
    return tipoDeAliquota.value();
  }

  public void setTipoDeAliquota(TipoDeAliquotaEnum tipoDeAliquota) {
    this.tipoDeAliquota = tipoDeAliquota;
  }

  public MemoriaCalculoDto tipoDeAliquota(TipoDeAliquotaEnum tipoDeAliquota) {
    this.tipoDeAliquota = tipoDeAliquota;
    return this;
  }

 /**
   * Valor da base de cálculo&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBaseDeCalculo
  **/
  @JsonProperty("valorBaseDeCalculo")
  public BigDecimal getValorBaseDeCalculo() {
    return valorBaseDeCalculo;
  }

  public void setValorBaseDeCalculo(BigDecimal valorBaseDeCalculo) {
    this.valorBaseDeCalculo = valorBaseDeCalculo;
  }

  public MemoriaCalculoDto valorBaseDeCalculo(BigDecimal valorBaseDeCalculo) {
    this.valorBaseDeCalculo = valorBaseDeCalculo;
    return this;
  }

 /**
   * Valor da base de cálculo específica&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBaseDeCalculoEspecifico
  **/
  @JsonProperty("valorBaseDeCalculoEspecifico")
  public BigDecimal getValorBaseDeCalculoEspecifico() {
    return valorBaseDeCalculoEspecifico;
  }

  public void setValorBaseDeCalculoEspecifico(BigDecimal valorBaseDeCalculoEspecifico) {
    this.valorBaseDeCalculoEspecifico = valorBaseDeCalculoEspecifico;
  }

  public MemoriaCalculoDto valorBaseDeCalculoEspecifico(BigDecimal valorBaseDeCalculoEspecifico) {
    this.valorBaseDeCalculoEspecifico = valorBaseDeCalculoEspecifico;
    return this;
  }

 /**
   * Valor da base de cálculo reduzido&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBaseDeCalculoReduzido
  **/
  @JsonProperty("valorBaseDeCalculoReduzido")
  public BigDecimal getValorBaseDeCalculoReduzido() {
    return valorBaseDeCalculoReduzido;
  }

  public void setValorBaseDeCalculoReduzido(BigDecimal valorBaseDeCalculoReduzido) {
    this.valorBaseDeCalculoReduzido = valorBaseDeCalculoReduzido;
  }

  public MemoriaCalculoDto valorBaseDeCalculoReduzido(BigDecimal valorBaseDeCalculoReduzido) {
    this.valorBaseDeCalculoReduzido = valorBaseDeCalculoReduzido;
    return this;
  }

 /**
   * Valor da alíquota&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorDaAliquota
  **/
  @JsonProperty("valorDaAliquota")
  public BigDecimal getValorDaAliquota() {
    return valorDaAliquota;
  }

  public void setValorDaAliquota(BigDecimal valorDaAliquota) {
    this.valorDaAliquota = valorDaAliquota;
  }

  public MemoriaCalculoDto valorDaAliquota(BigDecimal valorDaAliquota) {
    this.valorDaAliquota = valorDaAliquota;
    return this;
  }

 /**
   * Valor da alíquota específica&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorDaAliquotaEspecifica
  **/
  @JsonProperty("valorDaAliquotaEspecifica")
  public BigDecimal getValorDaAliquotaEspecifica() {
    return valorDaAliquotaEspecifica;
  }

  public void setValorDaAliquotaEspecifica(BigDecimal valorDaAliquotaEspecifica) {
    this.valorDaAliquotaEspecifica = valorDaAliquotaEspecifica;
  }

  public MemoriaCalculoDto valorDaAliquotaEspecifica(BigDecimal valorDaAliquotaEspecifica) {
    this.valorDaAliquotaEspecifica = valorDaAliquotaEspecifica;
    return this;
  }

 /**
   * Valor da aliquota reduzida&lt;br /&gt;Tamanho: 16,7&lt;br /&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorDaAliquotaReduzida
  **/
  @JsonProperty("valorDaAliquotaReduzida")
  public BigDecimal getValorDaAliquotaReduzida() {
    return valorDaAliquotaReduzida;
  }

  public void setValorDaAliquotaReduzida(BigDecimal valorDaAliquotaReduzida) {
    this.valorDaAliquotaReduzida = valorDaAliquotaReduzida;
  }

  public MemoriaCalculoDto valorDaAliquotaReduzida(BigDecimal valorDaAliquotaReduzida) {
    this.valorDaAliquotaReduzida = valorDaAliquotaReduzida;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoriaCalculoDto {\n");
    
    sb.append("    percentualDeReducaoDaAliquota: ").append(toIndentedString(percentualDeReducaoDaAliquota)).append("\n");
    sb.append("    percentualDeReducaoDaBaseCalculado: ").append(toIndentedString(percentualDeReducaoDaBaseCalculado)).append("\n");
    sb.append("    tipoDeAliquota: ").append(toIndentedString(tipoDeAliquota)).append("\n");
    sb.append("    valorBaseDeCalculo: ").append(toIndentedString(valorBaseDeCalculo)).append("\n");
    sb.append("    valorBaseDeCalculoEspecifico: ").append(toIndentedString(valorBaseDeCalculoEspecifico)).append("\n");
    sb.append("    valorBaseDeCalculoReduzido: ").append(toIndentedString(valorBaseDeCalculoReduzido)).append("\n");
    sb.append("    valorDaAliquota: ").append(toIndentedString(valorDaAliquota)).append("\n");
    sb.append("    valorDaAliquotaEspecifica: ").append(toIndentedString(valorDaAliquotaEspecifica)).append("\n");
    sb.append("    valorDaAliquotaReduzida: ").append(toIndentedString(valorDaAliquotaReduzida)).append("\n");
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

