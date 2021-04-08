package br.gov.siscomex.portalunico.pcce.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SefazCreditoIcmsDto", propOrder =
    { "dataConfirmacaoCredito", "numeroDeclaracao", "tipoDeclaracao", "tipoSolicitacao", "ufFavorecida", "valorTotalCredito", "versaoDeclaracao"
})

@XmlRootElement(name="SefazCreditoIcmsDto")
/**
  * Dados da confirmação de crédito de ICMS vinda da Sefaz
 **/
@ApiModel(description="Dados da confirmação de crédito de ICMS vinda da Sefaz")
public class SefazCreditoIcmsDto  {
  
  @XmlElement(name="dataConfirmacaoCredito", required = true)
  @ApiModelProperty(example = "2019-09-17T18:38:23.056Z", required = true, value = "Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataConfirmacaoCredito = null;

  @XmlElement(name="numeroDeclaracao", required = true)
  @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
 /**
   * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
  **/
  private String numeroDeclaracao = null;


@XmlType(name="TipoDeclaracaoEnum")
@XmlEnum(String.class)
public enum TipoDeclaracaoEnum {

	@XmlEnumValue("DUIMP")
	@JsonProperty("DUIMP")
	DUIMP(String.valueOf("DUIMP"));


    private String value;

    TipoDeclaracaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoDeclaracaoEnum fromValue(String v) {
        for (TipoDeclaracaoEnum b : TipoDeclaracaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeclaracaoEnum");
    }
}

  @XmlElement(name="tipoDeclaracao", required = true)
  @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo da declaração no Comércio Exterior")
 /**
   * Tipo da declaração no Comércio Exterior
  **/
  private TipoDeclaracaoEnum tipoDeclaracao = null;


@XmlType(name="TipoSolicitacaoEnum")
@XmlEnum(String.class)
public enum TipoSolicitacaoEnum {

	@XmlEnumValue("PAGAMENTO_INTEGRAL_DUIMP")
	@JsonProperty("PAGAMENTO_INTEGRAL_DUIMP")
	PAGAMENTO_INTEGRAL_DUIMP(String.valueOf("PAGAMENTO_INTEGRAL_DUIMP")),
	
	@XmlEnumValue("PAGAMENTO_PARCIAL_DUIMP")
	@JsonProperty("PAGAMENTO_PARCIAL_DUIMP")
	PAGAMENTO_PARCIAL_DUIMP(String.valueOf("PAGAMENTO_PARCIAL_DUIMP")),
	
	@XmlEnumValue("EXONERACAO_INTEGRAL_DUIMP")
	@JsonProperty("EXONERACAO_INTEGRAL_DUIMP")
	EXONERACAO_INTEGRAL_DUIMP(String.valueOf("EXONERACAO_INTEGRAL_DUIMP")),
	
	@XmlEnumValue("MANDADO_JUDICIAL_DUIMP")
	@JsonProperty("MANDADO_JUDICIAL_DUIMP")
	MANDADO_JUDICIAL_DUIMP(String.valueOf("MANDADO_JUDICIAL_DUIMP")),
	
	@XmlEnumValue("EXONERACAO_PAG_PARCIAL_DUIMP")
	@JsonProperty("EXONERACAO_PAG_PARCIAL_DUIMP")
	EXONERACAO_PAG_PARCIAL_DUIMP(String.valueOf("EXONERACAO_PAG_PARCIAL_DUIMP"));


    private String value;

    TipoSolicitacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoSolicitacaoEnum fromValue(String v) {
        for (TipoSolicitacaoEnum b : TipoSolicitacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoSolicitacaoEnum");
    }
}

  @XmlElement(name="tipoSolicitacao", required = true)
  @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de solicitação")
 /**
   * Tipo de solicitação
  **/
  private TipoSolicitacaoEnum tipoSolicitacao = null;


@XmlType(name="UfFavorecidaEnum")
@XmlEnum(String.class)
public enum UfFavorecidaEnum {

	@XmlEnumValue("AC")
	@JsonProperty("AC")
	AC(String.valueOf("AC")),
	
	@XmlEnumValue("AL")
	@JsonProperty("AL")
	AL(String.valueOf("AL")),
	
	@XmlEnumValue("AM")
	@JsonProperty("AM")
	AM(String.valueOf("AM")),
	
	@XmlEnumValue("AP")
	@JsonProperty("AP")
	AP(String.valueOf("AP")),
	
	@XmlEnumValue("BA")
	@JsonProperty("BA")
	BA(String.valueOf("BA")),
	
	@XmlEnumValue("CE")
	@JsonProperty("CE")
	CE(String.valueOf("CE")),
	
	@XmlEnumValue("DF")
	@JsonProperty("DF")
	DF(String.valueOf("DF")),
	
	@XmlEnumValue("ES")
	@JsonProperty("ES")
	ES(String.valueOf("ES")),
	
	@XmlEnumValue("GO")
	@JsonProperty("GO")
	GO(String.valueOf("GO")),
	
	@XmlEnumValue("MA")
	@JsonProperty("MA")
	MA(String.valueOf("MA")),
	
	@XmlEnumValue("MG")
	@JsonProperty("MG")
	MG(String.valueOf("MG")),
	
	@XmlEnumValue("MS")
	@JsonProperty("MS")
	MS(String.valueOf("MS")),
	
	@XmlEnumValue("MT")
	@JsonProperty("MT")
	MT(String.valueOf("MT")),
	
	@XmlEnumValue("PA")
	@JsonProperty("PA")
	PA(String.valueOf("PA")),
	
	@XmlEnumValue("PB")
	@JsonProperty("PB")
	PB(String.valueOf("PB")),
	
	@XmlEnumValue("PE")
	@JsonProperty("PE")
	PE(String.valueOf("PE")),
	
	@XmlEnumValue("PI")
	@JsonProperty("PI")
	PI(String.valueOf("PI")),
	
	@XmlEnumValue("PR")
	@JsonProperty("PR")
	PR(String.valueOf("PR")),
	
	@XmlEnumValue("RJ")
	@JsonProperty("RJ")
	RJ(String.valueOf("RJ")),
	
	@XmlEnumValue("RN")
	@JsonProperty("RN")
	RN(String.valueOf("RN")),
	
	@XmlEnumValue("RO")
	@JsonProperty("RO")
	RO(String.valueOf("RO")),
	
	@XmlEnumValue("RR")
	@JsonProperty("RR")
	RR(String.valueOf("RR")),
	
	@XmlEnumValue("RS")
	@JsonProperty("RS")
	RS(String.valueOf("RS")),
	
	@XmlEnumValue("SC")
	@JsonProperty("SC")
	SC(String.valueOf("SC")),
	
	@XmlEnumValue("SE")
	@JsonProperty("SE")
	SE(String.valueOf("SE")),
	
	@XmlEnumValue("SP")
	@JsonProperty("SP")
	SP(String.valueOf("SP")),
	
	@XmlEnumValue("TO")
	@JsonProperty("TO")
	TO(String.valueOf("TO"));


    private String value;

    UfFavorecidaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UfFavorecidaEnum fromValue(String v) {
        for (UfFavorecidaEnum b : UfFavorecidaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to UfFavorecidaEnum");
    }
}

  @XmlElement(name="ufFavorecida", required = true)
  @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
 /**
   * UF favorecida
  **/
  private UfFavorecidaEnum ufFavorecida = null;

  @XmlElement(name="valorTotalCredito", required = true)
  @ApiModelProperty(example = "103.2", required = true, value = "Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotalCredito = null;

  @XmlElement(name="versaoDeclaracao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracao = null;
 /**
   * Data e hora da confirmação do crédito de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataConfirmacaoCredito
  **/
  @JsonProperty("dataConfirmacaoCredito")
  @NotNull
  public OffsetDateTime getDataConfirmacaoCredito() {
    return dataConfirmacaoCredito;
  }

  public void setDataConfirmacaoCredito(OffsetDateTime dataConfirmacaoCredito) {
    this.dataConfirmacaoCredito = dataConfirmacaoCredito;
  }

  public SefazCreditoIcmsDto dataConfirmacaoCredito(OffsetDateTime dataConfirmacaoCredito) {
    this.dataConfirmacaoCredito = dataConfirmacaoCredito;
    return this;
  }

 /**
   * Número da declaração&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  @NotNull
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public SefazCreditoIcmsDto numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
    return this;
  }

 /**
   * Tipo da declaração no Comércio Exterior
   * @return tipoDeclaracao
  **/
  @JsonProperty("tipoDeclaracao")
  @NotNull
  public String getTipoDeclaracao() {
    if (tipoDeclaracao == null) {
      return null;
    }
    return tipoDeclaracao.value();
  }

  public void setTipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
  }

  public SefazCreditoIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
    this.tipoDeclaracao = tipoDeclaracao;
    return this;
  }

 /**
   * Tipo de solicitação
   * @return tipoSolicitacao
  **/
  @JsonProperty("tipoSolicitacao")
  @NotNull
  public String getTipoSolicitacao() {
    if (tipoSolicitacao == null) {
      return null;
    }
    return tipoSolicitacao.value();
  }

  public void setTipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
  }

  public SefazCreditoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
    return this;
  }

 /**
   * UF favorecida
   * @return ufFavorecida
  **/
  @JsonProperty("ufFavorecida")
  @NotNull
  public String getUfFavorecida() {
    if (ufFavorecida == null) {
      return null;
    }
    return ufFavorecida.value();
  }

  public void setUfFavorecida(UfFavorecidaEnum ufFavorecida) {
    this.ufFavorecida = ufFavorecida;
  }

  public SefazCreditoIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
    this.ufFavorecida = ufFavorecida;
    return this;
  }

 /**
   * Valor total do crédito de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorTotalCredito
  **/
  @JsonProperty("valorTotalCredito")
  @NotNull
  public BigDecimal getValorTotalCredito() {
    return valorTotalCredito;
  }

  public void setValorTotalCredito(BigDecimal valorTotalCredito) {
    this.valorTotalCredito = valorTotalCredito;
  }

  public SefazCreditoIcmsDto valorTotalCredito(BigDecimal valorTotalCredito) {
    this.valorTotalCredito = valorTotalCredito;
    return this;
  }

 /**
   * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracao
  **/
  @JsonProperty("versaoDeclaracao")
  @NotNull
  public String getVersaoDeclaracao() {
    return versaoDeclaracao;
  }

  public void setVersaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
  }

  public SefazCreditoIcmsDto versaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazCreditoIcmsDto {\n");
    
    sb.append("    dataConfirmacaoCredito: ").append(toIndentedString(dataConfirmacaoCredito)).append("\n");
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    tipoDeclaracao: ").append(toIndentedString(tipoDeclaracao)).append("\n");
    sb.append("    tipoSolicitacao: ").append(toIndentedString(tipoSolicitacao)).append("\n");
    sb.append("    ufFavorecida: ").append(toIndentedString(ufFavorecida)).append("\n");
    sb.append("    valorTotalCredito: ").append(toIndentedString(valorTotalCredito)).append("\n");
    sb.append("    versaoDeclaracao: ").append(toIndentedString(versaoDeclaracao)).append("\n");
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

