package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PagamentoTaxa", propOrder =
    { "tipoPagamento", "tipoTaxa", "observacao"
})

@XmlRootElement(name="PagamentoTaxa")
/**
  * Indica se o pagamento de taxa já foli realizado para um LPCO
 **/
@ApiModel(description="Indica se o pagamento de taxa já foli realizado para um LPCO")
public class PagamentoTaxa  {
  

@XmlType(name="TipoPagamentoEnum")
@XmlEnum(String.class)
public enum TipoPagamentoEnum {

	@XmlEnumValue("PAGAMENTO")
	@JsonProperty("PAGAMENTO")
	PAGAMENTO(String.valueOf("PAGAMENTO")),
	
	@XmlEnumValue("DISPENSA")
	@JsonProperty("DISPENSA")
	DISPENSA(String.valueOf("DISPENSA"));


    private String value;

    TipoPagamentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoPagamentoEnum fromValue(String v) {
        for (TipoPagamentoEnum b : TipoPagamentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoPagamentoEnum");
    }
}

  @XmlElement(name="tipoPagamento", required = true)
  @ApiModelProperty(example = "PAGAMENTO", required = true, value = "Indica se foi pagamento ou dispensa/isenção de pagamento.")
 /**
   * Indica se foi pagamento ou dispensa/isenção de pagamento.
  **/
  private TipoPagamentoEnum tipoPagamento = null;


@XmlType(name="TipoTaxaEnum")
@XmlEnum(String.class)
public enum TipoTaxaEnum {

	@XmlEnumValue("REGISTRO_LPCO")
	@JsonProperty("REGISTRO_LPCO")
	REGISTRO_LPCO(String.valueOf("REGISTRO_LPCO")),
	
	@XmlEnumValue("RETIFICACAO")
	@JsonProperty("RETIFICACAO")
	RETIFICACAO(String.valueOf("RETIFICACAO")),
	
	@XmlEnumValue("PRORROGACAO")
	@JsonProperty("PRORROGACAO")
	PRORROGACAO(String.valueOf("PRORROGACAO")),
	
	@XmlEnumValue("COMPATIBILIZACAO")
	@JsonProperty("COMPATIBILIZACAO")
	COMPATIBILIZACAO(String.valueOf("COMPATIBILIZACAO")),
	
	@XmlEnumValue("RESPOSTA_EXIGENCIA")
	@JsonProperty("RESPOSTA_EXIGENCIA")
	RESPOSTA_EXIGENCIA(String.valueOf("RESPOSTA_EXIGENCIA"));


    private String value;

    TipoTaxaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoTaxaEnum fromValue(String v) {
        for (TipoTaxaEnum b : TipoTaxaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTaxaEnum");
    }
}

  @XmlElement(name="tipoTaxa", required = true)
  @ApiModelProperty(example = "REGISTRO_LPCO", required = true, value = "Tipo de taxa que foi paga.")
 /**
   * Tipo de taxa que foi paga.
  **/
  private TipoTaxaEnum tipoTaxa = null;

  @XmlElement(name="observacao")
  @ApiModelProperty(example = "Pagamento realizado", value = "Observação associada ao pagamento. Obrigatório quando para tipoPagamento=PAGAMENTO_REALIZADO ou  tipoPagamento=DISPENSA_PAGAMENTO, dispensado nos demais casos.")
 /**
   * Observação associada ao pagamento. Obrigatório quando para tipoPagamento=PAGAMENTO_REALIZADO ou  tipoPagamento=DISPENSA_PAGAMENTO, dispensado nos demais casos.
  **/
  private String observacao = null;
 /**
   * Indica se foi pagamento ou dispensa/isenção de pagamento.
   * @return tipoPagamento
  **/
  @JsonProperty("tipoPagamento")
  @NotNull
  public String getTipoPagamento() {
    if (tipoPagamento == null) {
      return null;
    }
    return tipoPagamento.value();
  }

  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public PagamentoTaxa tipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }

 /**
   * Tipo de taxa que foi paga.
   * @return tipoTaxa
  **/
  @JsonProperty("tipoTaxa")
  @NotNull
  public String getTipoTaxa() {
    if (tipoTaxa == null) {
      return null;
    }
    return tipoTaxa.value();
  }

  public void setTipoTaxa(TipoTaxaEnum tipoTaxa) {
    this.tipoTaxa = tipoTaxa;
  }

  public PagamentoTaxa tipoTaxa(TipoTaxaEnum tipoTaxa) {
    this.tipoTaxa = tipoTaxa;
    return this;
  }

 /**
   * Observação associada ao pagamento. Obrigatório quando para tipoPagamento&#x3D;PAGAMENTO_REALIZADO ou  tipoPagamento&#x3D;DISPENSA_PAGAMENTO, dispensado nos demais casos.
   * @return observacao
  **/
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public PagamentoTaxa observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoTaxa {\n");
    
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    tipoTaxa: ").append(toIndentedString(tipoTaxa)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
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

