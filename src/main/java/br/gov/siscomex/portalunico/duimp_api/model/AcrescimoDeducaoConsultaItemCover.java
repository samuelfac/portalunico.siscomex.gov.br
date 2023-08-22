package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.DenominacaoAcrescimoDeducaoCover;
import br.gov.siscomex.portalunico.duimp_api.model.MoedaAcrescimoDeducaoCover;
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
 @XmlType(name = "AcrescimoDeducaoConsultaItemCover", propOrder =
    { "tipo", "moeda", "valorBRL", "denominacao"
})

@XmlRootElement(name="AcrescimoDeducaoConsultaItemCover")
public class AcrescimoDeducaoConsultaItemCover  {
  

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

  @XmlElement(name="moeda", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoedaAcrescimoDeducaoCover moeda = null;

  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "33.45", value = "Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valorBRL = null;

  @XmlElement(name="denominacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DenominacaoAcrescimoDeducaoCover denominacao = null;
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

  public AcrescimoDeducaoConsultaItemCover tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get moeda
   * @return moeda
  **/
  @JsonProperty("moeda")
  @NotNull
  public MoedaAcrescimoDeducaoCover getMoeda() {
    return moeda;
  }

  public void setMoeda(MoedaAcrescimoDeducaoCover moeda) {
    this.moeda = moeda;
  }

  public AcrescimoDeducaoConsultaItemCover moeda(MoedaAcrescimoDeducaoCover moeda) {
    this.moeda = moeda;
    return this;
  }

 /**
   * Valor na moeda negociada convertido em R$ (Reais).&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public Double getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
  }

  public AcrescimoDeducaoConsultaItemCover valorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
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

  public AcrescimoDeducaoConsultaItemCover denominacao(DenominacaoAcrescimoDeducaoCover denominacao) {
    this.denominacao = denominacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrescimoDeducaoConsultaItemCover {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    moeda: ").append(toIndentedString(moeda)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    denominacao: ").append(toIndentedString(denominacao)).append("\n");
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

