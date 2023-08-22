package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituacaoConferenciaAnuenteCover", propOrder =
    { "siglaOrgao", "situacao", "indicadorAutorizacaoProsseguimentoConferenciaAnuente", "indicadorConclusaoDecisaoJudicial"
})

@XmlRootElement(name="SituacaoConferenciaAnuenteCover")
/**
  * Conferência do Anuente.
 **/
@ApiModel(description="Conferência do Anuente.")
public class SituacaoConferenciaAnuenteCover  {
  
  @XmlElement(name="siglaOrgao")
  @ApiModelProperty(example = "ANVISA", value = "Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String siglaOrgao = null;


@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("AGUARDANDO_ANALISE_RISCO")
	@JsonProperty("AGUARDANDO_ANALISE_RISCO")
	AGUARDANDO_ANALISE_RISCO(String.valueOf("AGUARDANDO_ANALISE_RISCO")),
	
	@XmlEnumValue("CONCLUIDA_AUTOMATICAMENTE")
	@JsonProperty("CONCLUIDA_AUTOMATICAMENTE")
	CONCLUIDA_AUTOMATICAMENTE(String.valueOf("CONCLUIDA_AUTOMATICAMENTE")),
	
	@XmlEnumValue("AGUARDANDO_DOC")
	@JsonProperty("AGUARDANDO_DOC")
	AGUARDANDO_DOC(String.valueOf("AGUARDANDO_DOC")),
	
	@XmlEnumValue("AGUARDANDO_DISTRIBUICAO")
	@JsonProperty("AGUARDANDO_DISTRIBUICAO")
	AGUARDANDO_DISTRIBUICAO(String.valueOf("AGUARDANDO_DISTRIBUICAO")),
	
	@XmlEnumValue("EM_CONFERENCIA")
	@JsonProperty("EM_CONFERENCIA")
	EM_CONFERENCIA(String.valueOf("EM_CONFERENCIA")),
	
	@XmlEnumValue("EM_EXIGENCIA")
	@JsonProperty("EM_EXIGENCIA")
	EM_EXIGENCIA(String.valueOf("EM_EXIGENCIA")),
	
	@XmlEnumValue("DESEMBARACO_AUTORIZADO_DECISAO_JUDICIAL")
	@JsonProperty("DESEMBARACO_AUTORIZADO_DECISAO_JUDICIAL")
	DESEMBARACO_AUTORIZADO_DECISAO_JUDICIAL(String.valueOf("DESEMBARACO_AUTORIZADO_DECISAO_JUDICIAL")),
	
	@XmlEnumValue("CONCLUIDA")
	@JsonProperty("CONCLUIDA")
	CONCLUIDA(String.valueOf("CONCLUIDA")),
	
	@XmlEnumValue("CONCLUIDA_AUTOMATICAMENTE_PERDA_OBJETO")
	@JsonProperty("CONCLUIDA_AUTOMATICAMENTE_PERDA_OBJETO")
	CONCLUIDA_AUTOMATICAMENTE_PERDA_OBJETO(String.valueOf("CONCLUIDA_AUTOMATICAMENTE_PERDA_OBJETO")),
	
	@XmlEnumValue("CANCELADA")
	@JsonProperty("CANCELADA")
	CANCELADA(String.valueOf("CANCELADA"));


    private String value;

    SituacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoEnum fromValue(String v) {
        for (SituacaoEnum b : SituacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEnum");
    }
}

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "DESEMBARACO_AUTOMATICO", value = "Tipos de situações de conferência do anuente.<br>Domínio:")
 /**
   * Tipos de situações de conferência do anuente.<br>Domínio:
  **/
  private SituacaoEnum situacao = null;


@XmlType(name="IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum")
@XmlEnum(String.class)
public enum IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum {

	@XmlEnumValue("SIM")
	@JsonProperty("SIM")
	SIM(String.valueOf("SIM")),
	
	@XmlEnumValue("NAO")
	@JsonProperty("NAO")
	NAO(String.valueOf("NAO")),
	
	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA"));


    private String value;

    IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum fromValue(String v) {
        for (IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum b : IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum");
    }
}

  @XmlElement(name="indicadorAutorizacaoProsseguimentoConferenciaAnuente")
  @ApiModelProperty(example = "SIM", value = "Indicador de autorização do prosseguimento da conferência do anuente.<br>Domínio:")
 /**
   * Indicador de autorização do prosseguimento da conferência do anuente.<br>Domínio:
  **/
  private IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum indicadorAutorizacaoProsseguimentoConferenciaAnuente = null;


@XmlType(name="IndicadorConclusaoDecisaoJudicialEnum")
@XmlEnum(String.class)
public enum IndicadorConclusaoDecisaoJudicialEnum {

	@XmlEnumValue("SIM")
	@JsonProperty("SIM")
	SIM(String.valueOf("SIM")),
	
	@XmlEnumValue("NAO")
	@JsonProperty("NAO")
	NAO(String.valueOf("NAO")),
	
	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA"));


    private String value;

    IndicadorConclusaoDecisaoJudicialEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorConclusaoDecisaoJudicialEnum fromValue(String v) {
        for (IndicadorConclusaoDecisaoJudicialEnum b : IndicadorConclusaoDecisaoJudicialEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorConclusaoDecisaoJudicialEnum");
    }
}

  @XmlElement(name="indicadorConclusaoDecisaoJudicial")
  @ApiModelProperty(example = "SIM", value = "Indicador de conclusão por decisão judicial.<br>Domínio:")
 /**
   * Indicador de conclusão por decisão judicial.<br>Domínio:
  **/
  private IndicadorConclusaoDecisaoJudicialEnum indicadorConclusaoDecisaoJudicial = null;
 /**
   * Sigla do órgão da administração pública.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return siglaOrgao
  **/
  @JsonProperty("siglaOrgao")
  public String getSiglaOrgao() {
    return siglaOrgao;
  }

  public void setSiglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
  }

  public SituacaoConferenciaAnuenteCover siglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
    return this;
  }

 /**
   * Tipos de situações de conferência do anuente.&lt;br&gt;Domínio:
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    if (situacao == null) {
      return null;
    }
    return situacao.value();
  }

  public void setSituacao(SituacaoEnum situacao) {
    this.situacao = situacao;
  }

  public SituacaoConferenciaAnuenteCover situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Indicador de autorização do prosseguimento da conferência do anuente.&lt;br&gt;Domínio:
   * @return indicadorAutorizacaoProsseguimentoConferenciaAnuente
  **/
  @JsonProperty("indicadorAutorizacaoProsseguimentoConferenciaAnuente")
  public String getIndicadorAutorizacaoProsseguimentoConferenciaAnuente() {
    if (indicadorAutorizacaoProsseguimentoConferenciaAnuente == null) {
      return null;
    }
    return indicadorAutorizacaoProsseguimentoConferenciaAnuente.value();
  }

  public void setIndicadorAutorizacaoProsseguimentoConferenciaAnuente(IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum indicadorAutorizacaoProsseguimentoConferenciaAnuente) {
    this.indicadorAutorizacaoProsseguimentoConferenciaAnuente = indicadorAutorizacaoProsseguimentoConferenciaAnuente;
  }

  public SituacaoConferenciaAnuenteCover indicadorAutorizacaoProsseguimentoConferenciaAnuente(IndicadorAutorizacaoProsseguimentoConferenciaAnuenteEnum indicadorAutorizacaoProsseguimentoConferenciaAnuente) {
    this.indicadorAutorizacaoProsseguimentoConferenciaAnuente = indicadorAutorizacaoProsseguimentoConferenciaAnuente;
    return this;
  }

 /**
   * Indicador de conclusão por decisão judicial.&lt;br&gt;Domínio:
   * @return indicadorConclusaoDecisaoJudicial
  **/
  @JsonProperty("indicadorConclusaoDecisaoJudicial")
  public String getIndicadorConclusaoDecisaoJudicial() {
    if (indicadorConclusaoDecisaoJudicial == null) {
      return null;
    }
    return indicadorConclusaoDecisaoJudicial.value();
  }

  public void setIndicadorConclusaoDecisaoJudicial(IndicadorConclusaoDecisaoJudicialEnum indicadorConclusaoDecisaoJudicial) {
    this.indicadorConclusaoDecisaoJudicial = indicadorConclusaoDecisaoJudicial;
  }

  public SituacaoConferenciaAnuenteCover indicadorConclusaoDecisaoJudicial(IndicadorConclusaoDecisaoJudicialEnum indicadorConclusaoDecisaoJudicial) {
    this.indicadorConclusaoDecisaoJudicial = indicadorConclusaoDecisaoJudicial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoConferenciaAnuenteCover {\n");
    
    sb.append("    siglaOrgao: ").append(toIndentedString(siglaOrgao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    indicadorAutorizacaoProsseguimentoConferenciaAnuente: ").append(toIndentedString(indicadorAutorizacaoProsseguimentoConferenciaAnuente)).append("\n");
    sb.append("    indicadorConclusaoDecisaoJudicial: ").append(toIndentedString(indicadorConclusaoDecisaoJudicial)).append("\n");
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

