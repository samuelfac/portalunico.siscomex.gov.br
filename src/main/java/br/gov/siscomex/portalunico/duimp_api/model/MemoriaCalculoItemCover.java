package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "MemoriaCalculoItemCover", propOrder =
    { "codigoFundamentoLegalNormal", "baseCalculoBRL", "baseCalculoEspecificaBRL", "baseCalculoReduzidaBRL", "percentualReducaoBaseCalculo", "tipoAliquota", "percentualReducaoAliquotaReduzida", "valorAliquota", "valorAliquotaEspecifica", "valorAliquotaReduzida", "normal", "tributado"
})

@XmlRootElement(name="MemoriaCalculoItemCover")
/**
  * Memória de cálculo por tipo de imposto.
 **/
@ApiModel(description="Memória de cálculo por tipo de imposto.")
public class MemoriaCalculoItemCover  {
  
  @XmlElement(name="codigoFundamentoLegalNormal")
  @ApiModelProperty(example = "1001", value = "Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Integer codigoFundamentoLegalNormal = null;

  @XmlElement(name="baseCalculoBRL")
  @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da base de cálculo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double baseCalculoBRL = null;

  @XmlElement(name="baseCalculoEspecificaBRL")
  @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo específica em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da base de cálculo específica em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double baseCalculoEspecificaBRL = null;

  @XmlElement(name="baseCalculoReduzidaBRL")
  @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo reduzida em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da base de cálculo reduzida em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double baseCalculoReduzidaBRL = null;

  @XmlElement(name="percentualReducaoBaseCalculo")
  @ApiModelProperty(example = "4567.8", value = "Percentual de redução da base de cálculo.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
 /**
   * Percentual de redução da base de cálculo.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private Double percentualReducaoBaseCalculo = null;


@XmlType(name="TipoAliquotaEnum")
@XmlEnum(String.class)
public enum TipoAliquotaEnum {

	@XmlEnumValue("AD_VALOREM")
	@JsonProperty("AD_VALOREM")
	AD_VALOREM(String.valueOf("AD_VALOREM")),
	
	@XmlEnumValue("ESPECIFICA")
	@JsonProperty("ESPECIFICA")
	ESPECIFICA(String.valueOf("ESPECIFICA"));


    private String value;

    TipoAliquotaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoAliquotaEnum fromValue(String v) {
        for (TipoAliquotaEnum b : TipoAliquotaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAliquotaEnum");
    }
}

  @XmlElement(name="tipoAliquota")
  @ApiModelProperty(example = "AD_VALOREM", value = "Tipo de alíquota do tributo.<br>Domínio:")
 /**
   * Tipo de alíquota do tributo.<br>Domínio:
  **/
  private TipoAliquotaEnum tipoAliquota = null;

  @XmlElement(name="percentualReducaoAliquotaReduzida")
  @ApiModelProperty(example = "4227.8", value = "Percentual de redução da alíquota reduzida (%).<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
 /**
   * Percentual de redução da alíquota reduzida (%).<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private Double percentualReducaoAliquotaReduzida = null;

  @XmlElement(name="valorAliquota")
  @ApiModelProperty(example = "4227.8", value = "Valor da alíquota (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da alíquota (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAliquota = null;

  @XmlElement(name="valorAliquotaEspecifica")
  @ApiModelProperty(example = "4227.8", value = "Valor da alíquota específica (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da alíquota específica (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAliquotaEspecifica = null;

  @XmlElement(name="valorAliquotaReduzida")
  @ApiModelProperty(example = "4227.8", value = "Valor da alíquota reduzida (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor da alíquota reduzida (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorAliquotaReduzida = null;

  @XmlElement(name="normal")
  @ApiModelProperty(example = "4227.8", value = "Valor normal em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor normal em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double normal = null;

  @XmlElement(name="tributado")
  @ApiModelProperty(example = "true", value = "Indicador de tributação.")
 /**
   * Indicador de tributação.
  **/
  private Boolean tributado = null;
 /**
   * Código do fundamento legal do regime tributário de importação utilizado na declaração.&lt;br&gt;Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return codigoFundamentoLegalNormal
  **/
  @JsonProperty("codigoFundamentoLegalNormal")
  public Integer getCodigoFundamentoLegalNormal() {
    return codigoFundamentoLegalNormal;
  }

  public void setCodigoFundamentoLegalNormal(Integer codigoFundamentoLegalNormal) {
    this.codigoFundamentoLegalNormal = codigoFundamentoLegalNormal;
  }

  public MemoriaCalculoItemCover codigoFundamentoLegalNormal(Integer codigoFundamentoLegalNormal) {
    this.codigoFundamentoLegalNormal = codigoFundamentoLegalNormal;
    return this;
  }

 /**
   * Valor da base de cálculo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return baseCalculoBRL
  **/
  @JsonProperty("baseCalculoBRL")
  public Double getBaseCalculoBRL() {
    return baseCalculoBRL;
  }

  public void setBaseCalculoBRL(Double baseCalculoBRL) {
    this.baseCalculoBRL = baseCalculoBRL;
  }

  public MemoriaCalculoItemCover baseCalculoBRL(Double baseCalculoBRL) {
    this.baseCalculoBRL = baseCalculoBRL;
    return this;
  }

 /**
   * Valor da base de cálculo específica em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return baseCalculoEspecificaBRL
  **/
  @JsonProperty("baseCalculoEspecificaBRL")
  public Double getBaseCalculoEspecificaBRL() {
    return baseCalculoEspecificaBRL;
  }

  public void setBaseCalculoEspecificaBRL(Double baseCalculoEspecificaBRL) {
    this.baseCalculoEspecificaBRL = baseCalculoEspecificaBRL;
  }

  public MemoriaCalculoItemCover baseCalculoEspecificaBRL(Double baseCalculoEspecificaBRL) {
    this.baseCalculoEspecificaBRL = baseCalculoEspecificaBRL;
    return this;
  }

 /**
   * Valor da base de cálculo reduzida em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return baseCalculoReduzidaBRL
  **/
  @JsonProperty("baseCalculoReduzidaBRL")
  public Double getBaseCalculoReduzidaBRL() {
    return baseCalculoReduzidaBRL;
  }

  public void setBaseCalculoReduzidaBRL(Double baseCalculoReduzidaBRL) {
    this.baseCalculoReduzidaBRL = baseCalculoReduzidaBRL;
  }

  public MemoriaCalculoItemCover baseCalculoReduzidaBRL(Double baseCalculoReduzidaBRL) {
    this.baseCalculoReduzidaBRL = baseCalculoReduzidaBRL;
    return this;
  }

 /**
   * Percentual de redução da base de cálculo.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return percentualReducaoBaseCalculo
  **/
  @JsonProperty("percentualReducaoBaseCalculo")
  public Double getPercentualReducaoBaseCalculo() {
    return percentualReducaoBaseCalculo;
  }

  public void setPercentualReducaoBaseCalculo(Double percentualReducaoBaseCalculo) {
    this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
  }

  public MemoriaCalculoItemCover percentualReducaoBaseCalculo(Double percentualReducaoBaseCalculo) {
    this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
    return this;
  }

 /**
   * Tipo de alíquota do tributo.&lt;br&gt;Domínio:
   * @return tipoAliquota
  **/
  @JsonProperty("tipoAliquota")
  public String getTipoAliquota() {
    if (tipoAliquota == null) {
      return null;
    }
    return tipoAliquota.value();
  }

  public void setTipoAliquota(TipoAliquotaEnum tipoAliquota) {
    this.tipoAliquota = tipoAliquota;
  }

  public MemoriaCalculoItemCover tipoAliquota(TipoAliquotaEnum tipoAliquota) {
    this.tipoAliquota = tipoAliquota;
    return this;
  }

 /**
   * Percentual de redução da alíquota reduzida (%).&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return percentualReducaoAliquotaReduzida
  **/
  @JsonProperty("percentualReducaoAliquotaReduzida")
  public Double getPercentualReducaoAliquotaReduzida() {
    return percentualReducaoAliquotaReduzida;
  }

  public void setPercentualReducaoAliquotaReduzida(Double percentualReducaoAliquotaReduzida) {
    this.percentualReducaoAliquotaReduzida = percentualReducaoAliquotaReduzida;
  }

  public MemoriaCalculoItemCover percentualReducaoAliquotaReduzida(Double percentualReducaoAliquotaReduzida) {
    this.percentualReducaoAliquotaReduzida = percentualReducaoAliquotaReduzida;
    return this;
  }

 /**
   * Valor da alíquota (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAliquota
  **/
  @JsonProperty("valorAliquota")
  public Double getValorAliquota() {
    return valorAliquota;
  }

  public void setValorAliquota(Double valorAliquota) {
    this.valorAliquota = valorAliquota;
  }

  public MemoriaCalculoItemCover valorAliquota(Double valorAliquota) {
    this.valorAliquota = valorAliquota;
    return this;
  }

 /**
   * Valor da alíquota específica (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAliquotaEspecifica
  **/
  @JsonProperty("valorAliquotaEspecifica")
  public Double getValorAliquotaEspecifica() {
    return valorAliquotaEspecifica;
  }

  public void setValorAliquotaEspecifica(Double valorAliquotaEspecifica) {
    this.valorAliquotaEspecifica = valorAliquotaEspecifica;
  }

  public MemoriaCalculoItemCover valorAliquotaEspecifica(Double valorAliquotaEspecifica) {
    this.valorAliquotaEspecifica = valorAliquotaEspecifica;
    return this;
  }

 /**
   * Valor da alíquota reduzida (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorAliquotaReduzida
  **/
  @JsonProperty("valorAliquotaReduzida")
  public Double getValorAliquotaReduzida() {
    return valorAliquotaReduzida;
  }

  public void setValorAliquotaReduzida(Double valorAliquotaReduzida) {
    this.valorAliquotaReduzida = valorAliquotaReduzida;
  }

  public MemoriaCalculoItemCover valorAliquotaReduzida(Double valorAliquotaReduzida) {
    this.valorAliquotaReduzida = valorAliquotaReduzida;
    return this;
  }

 /**
   * Valor normal em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return normal
  **/
  @JsonProperty("normal")
  public Double getNormal() {
    return normal;
  }

  public void setNormal(Double normal) {
    this.normal = normal;
  }

  public MemoriaCalculoItemCover normal(Double normal) {
    this.normal = normal;
    return this;
  }

 /**
   * Indicador de tributação.
   * @return tributado
  **/
  @JsonProperty("tributado")
  public Boolean isTributado() {
    return tributado;
  }

  public void setTributado(Boolean tributado) {
    this.tributado = tributado;
  }

  public MemoriaCalculoItemCover tributado(Boolean tributado) {
    this.tributado = tributado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoriaCalculoItemCover {\n");
    
    sb.append("    codigoFundamentoLegalNormal: ").append(toIndentedString(codigoFundamentoLegalNormal)).append("\n");
    sb.append("    baseCalculoBRL: ").append(toIndentedString(baseCalculoBRL)).append("\n");
    sb.append("    baseCalculoEspecificaBRL: ").append(toIndentedString(baseCalculoEspecificaBRL)).append("\n");
    sb.append("    baseCalculoReduzidaBRL: ").append(toIndentedString(baseCalculoReduzidaBRL)).append("\n");
    sb.append("    percentualReducaoBaseCalculo: ").append(toIndentedString(percentualReducaoBaseCalculo)).append("\n");
    sb.append("    tipoAliquota: ").append(toIndentedString(tipoAliquota)).append("\n");
    sb.append("    percentualReducaoAliquotaReduzida: ").append(toIndentedString(percentualReducaoAliquotaReduzida)).append("\n");
    sb.append("    valorAliquota: ").append(toIndentedString(valorAliquota)).append("\n");
    sb.append("    valorAliquotaEspecifica: ").append(toIndentedString(valorAliquotaEspecifica)).append("\n");
    sb.append("    valorAliquotaReduzida: ").append(toIndentedString(valorAliquotaReduzida)).append("\n");
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    tributado: ").append(toIndentedString(tributado)).append("\n");
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

