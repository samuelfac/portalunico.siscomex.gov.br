package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AcrescimoDeducaoCover", propOrder =
    { "tipo", "moeda", "denominacao"
})

@XmlRootElement(name="AcrescimoDeducaoCover")
/**
  * Lista de Acréscimos e Deduções da condição de venda da mercadoria.
 **/
@ApiModel(description="Lista de Acréscimos e Deduções da condição de venda da mercadoria.")
public class AcrescimoDeducaoCover  {
  

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

  public AcrescimoDeducaoCover tipo(TipoEnum tipo) {
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

  public AcrescimoDeducaoCover moeda(MoedaAcrescimoDeducaoCover moeda) {
    this.moeda = moeda;
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

  public AcrescimoDeducaoCover denominacao(DenominacaoAcrescimoDeducaoCover denominacao) {
    this.denominacao = denominacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcrescimoDeducaoCover {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    moeda: ").append(toIndentedString(moeda)).append("\n");
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

