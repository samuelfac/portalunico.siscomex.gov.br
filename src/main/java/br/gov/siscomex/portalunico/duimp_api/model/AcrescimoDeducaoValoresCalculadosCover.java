package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AcrescimoDeducaoValoresCalculadosCover", propOrder =
    { "tipo", "denominacao", "valorBRL"
})

@XmlRootElement(name="AcrescimoDeducaoValoresCalculadosCover")
public class AcrescimoDeducaoValoresCalculadosCover  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("ACRESCIMO")
	@JsonProperty("ACRESCIMO")
	ACRESCIMO(String.valueOf("ACRESCIMO")),
	
	@XmlEnumValue("DEDUCAO")
	@JsonProperty("DEDUCAO")
	DEDUCAO(String.valueOf("DEDUCAO"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(example = "ACRESCIMO", required = true, value = "Tipo de Operação (acreścimo ou dedução).<br>Domínio:")
 /**
   * Tipo de Operação (acreścimo ou dedução).<br>Domínio:
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="denominacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DenominacaoAcrescimoDeducaoCover denominacao = null;

  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "400.48", value = "Valor do acréscimo/dedução em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor do acréscimo/dedução em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorBRL = null;
 /**
   * Tipo de Operação (acreścimo ou dedução).&lt;br&gt;Domínio:
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public AcrescimoDeducaoValoresCalculadosCover tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get denominacao
   * @return denominacao
  **/
  @JsonProperty("denominacao")
  @NotNull
  public DenominacaoAcrescimoDeducaoCover getDenominacao() {
    return denominacao;
  }

  public void setDenominacao(DenominacaoAcrescimoDeducaoCover denominacao) {
    this.denominacao = denominacao;
  }

  public AcrescimoDeducaoValoresCalculadosCover denominacao(DenominacaoAcrescimoDeducaoCover denominacao) {
    this.denominacao = denominacao;
    return this;
  }

 /**
   * Valor do acréscimo/dedução em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public Double getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
  }

  public AcrescimoDeducaoValoresCalculadosCover valorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrescimoDeducaoValoresCalculadosCover {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    denominacao: ").append(toIndentedString(denominacao)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
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

