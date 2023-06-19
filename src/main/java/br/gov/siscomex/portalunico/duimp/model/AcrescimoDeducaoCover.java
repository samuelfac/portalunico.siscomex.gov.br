package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AcrescimoDeducaoCover", propOrder =
    { "moeda", "tipoOperacao", "codigo", "valor", "valorReal"
})

@XmlRootElement(name="AcrescimoDeducaoCover")
/**
  * Acréscimo ou Dedução
 **/
@ApiModel(description="Acréscimo ou Dedução")
public class AcrescimoDeducaoCover  {
  
  @XmlElement(name="moeda")
  @ApiModelProperty(value = "")
  private Integer moeda = null;


@XmlType(name="TipoOperacaoEnum")
@XmlEnum(Integer.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	NUMBER_2(Integer.valueOf(2));


    private Integer value;

    TipoOperacaoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao")
  @ApiModelProperty(example = "1", value = "Tipo de operação.<br>Dominio:<br>1 - acréscimo,<br>2 - dedução<br>Tamanho: 1")
 /**
   * Tipo de operação.<br>Dominio:<br>1 - acréscimo,<br>2 - dedução<br>Tamanho: 1
  **/
  private TipoOperacaoEnum tipoOperacao = null;

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "16", value = "Código do acréscimo ou da dedução.<br>Dominio: Tabela de Acréscimos / Deduções do Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99")
 /**
   * Código do acréscimo ou da dedução.<br>Dominio: Tabela de Acréscimos / Deduções do Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99
  **/
  private Integer codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "100.12", value = "Valor do acréscimo/dedução na moeda negociada ao valor na condição de venda.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do acréscimo/dedução na moeda negociada ao valor na condição de venda.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valor = null;

  @XmlElement(name="valorReal")
  @ApiModelProperty(example = "400.48", value = "Valor do acréscimo/dedução em Real.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor do acréscimo/dedução em Real.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private BigDecimal valorReal = null;
 /**
   * Get moeda
   * @return moeda
  **/
  @JsonProperty("moeda")
  public Integer getMoeda() {
    return moeda;
  }

  public void setMoeda(Integer moeda) {
    this.moeda = moeda;
  }

  public AcrescimoDeducaoCover moeda(Integer moeda) {
    this.moeda = moeda;
    return this;
  }

 /**
   * Tipo de operação.&lt;br&gt;Dominio:&lt;br&gt;1 - acréscimo,&lt;br&gt;2 - dedução&lt;br&gt;Tamanho: 1
   * @return tipoOperacao
  **/
  @JsonProperty("tipoOperacao")
  public Integer getTipoOperacao() {
    if (tipoOperacao == null) {
      return null;
    }
    return tipoOperacao.value();
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public AcrescimoDeducaoCover tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Código do acréscimo ou da dedução.&lt;br&gt;Dominio: Tabela de Acréscimos / Deduções do Siscomex&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public AcrescimoDeducaoCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor do acréscimo/dedução na moeda negociada ao valor na condição de venda.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valor
  **/
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public AcrescimoDeducaoCover valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Valor do acréscimo/dedução em Real.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorReal
  **/
  @JsonProperty("valorReal")
  public BigDecimal getValorReal() {
    return valorReal;
  }

  public void setValorReal(BigDecimal valorReal) {
    this.valorReal = valorReal;
  }

  public AcrescimoDeducaoCover valorReal(BigDecimal valorReal) {
    this.valorReal = valorReal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrescimoDeducaoCover {\n");
    
    sb.append("    moeda: ").append(toIndentedString(moeda)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorReal: ").append(toIndentedString(valorReal)).append("\n");
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

