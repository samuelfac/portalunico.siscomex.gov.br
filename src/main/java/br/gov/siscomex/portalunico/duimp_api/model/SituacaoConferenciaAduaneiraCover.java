package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SituacaoConferenciaAduaneiraCover", propOrder =
    { "siglaOrgao", "situacao", "indicadorAutorizacaoEntrega", "indicadorDesembaracoDecisaoJudicial"
})

@XmlRootElement(name="SituacaoConferenciaAduaneiraCover")
/**
  * Conferência Aduaneira.
 **/
@ApiModel(description="Conferência Aduaneira.")
public class SituacaoConferenciaAduaneiraCover  {
  
  @XmlElement(name="siglaOrgao")
  @ApiModelProperty(example = "RECEITA", value = "Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
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
	
	@XmlEnumValue("EM_ANALISE_FISCAL")
	@JsonProperty("EM_ANALISE_FISCAL")
	EM_ANALISE_FISCAL(String.valueOf("EM_ANALISE_FISCAL")),
	
	@XmlEnumValue("DESEMBARACO_AUTORIZADO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")
	@JsonProperty("DESEMBARACO_AUTORIZADO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")
	DESEMBARACO_AUTORIZADO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE(String.valueOf("DESEMBARACO_AUTORIZADO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")),
	
	@XmlEnumValue("INTERROMPIDA")
	@JsonProperty("INTERROMPIDA")
	INTERROMPIDA(String.valueOf("INTERROMPIDA")),
	
	@XmlEnumValue("CONCLUIDA")
	@JsonProperty("CONCLUIDA")
	CONCLUIDA(String.valueOf("CONCLUIDA")),
	
	@XmlEnumValue("DESEMBARACO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")
	@JsonProperty("DESEMBARACO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")
	DESEMBARACO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE(String.valueOf("DESEMBARACO_CONDICIONADO_CONCLUSAO_CONFERENCIA_ANUENTE")),
	
	@XmlEnumValue("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")
	@JsonProperty("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")
	CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO(String.valueOf("CONCLUIDA_SEM_PROSSEGUIMENTO_DESPACHO")),
	
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
  @ApiModelProperty(example = "DESEMBARACO_AUTOMATICO", value = "Tipos de situações de conferência aduaneira.<br>Domínio:")
 /**
   * Tipos de situações de conferência aduaneira.<br>Domínio:
  **/
  private SituacaoEnum situacao = null;


@XmlType(name="IndicadorAutorizacaoEntregaEnum")
@XmlEnum(String.class)
public enum IndicadorAutorizacaoEntregaEnum {

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

    IndicadorAutorizacaoEntregaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorAutorizacaoEntregaEnum fromValue(String v) {
        for (IndicadorAutorizacaoEntregaEnum b : IndicadorAutorizacaoEntregaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorAutorizacaoEntregaEnum");
    }
}

  @XmlElement(name="indicadorAutorizacaoEntrega")
  @ApiModelProperty(example = "SIM", value = "Indicador de autorização de entrega.<br>Domínio:")
 /**
   * Indicador de autorização de entrega.<br>Domínio:
  **/
  private IndicadorAutorizacaoEntregaEnum indicadorAutorizacaoEntrega = null;


@XmlType(name="IndicadorDesembaracoDecisaoJudicialEnum")
@XmlEnum(String.class)
public enum IndicadorDesembaracoDecisaoJudicialEnum {

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

    IndicadorDesembaracoDecisaoJudicialEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndicadorDesembaracoDecisaoJudicialEnum fromValue(String v) {
        for (IndicadorDesembaracoDecisaoJudicialEnum b : IndicadorDesembaracoDecisaoJudicialEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorDesembaracoDecisaoJudicialEnum");
    }
}

  @XmlElement(name="indicadorDesembaracoDecisaoJudicial")
  @ApiModelProperty(example = "SIM", value = "Indicador de desembaraço por decisão judicial.<br>Domínio:")
 /**
   * Indicador de desembaraço por decisão judicial.<br>Domínio:
  **/
  private IndicadorDesembaracoDecisaoJudicialEnum indicadorDesembaracoDecisaoJudicial = null;
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

  public SituacaoConferenciaAduaneiraCover siglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
    return this;
  }

 /**
   * Tipos de situações de conferência aduaneira.&lt;br&gt;Domínio:
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

  public SituacaoConferenciaAduaneiraCover situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Indicador de autorização de entrega.&lt;br&gt;Domínio:
   * @return indicadorAutorizacaoEntrega
  **/
  @JsonProperty("indicadorAutorizacaoEntrega")
  public String getIndicadorAutorizacaoEntrega() {
    if (indicadorAutorizacaoEntrega == null) {
      return null;
    }
    return indicadorAutorizacaoEntrega.value();
  }

  public void setIndicadorAutorizacaoEntrega(IndicadorAutorizacaoEntregaEnum indicadorAutorizacaoEntrega) {
    this.indicadorAutorizacaoEntrega = indicadorAutorizacaoEntrega;
  }

  public SituacaoConferenciaAduaneiraCover indicadorAutorizacaoEntrega(IndicadorAutorizacaoEntregaEnum indicadorAutorizacaoEntrega) {
    this.indicadorAutorizacaoEntrega = indicadorAutorizacaoEntrega;
    return this;
  }

 /**
   * Indicador de desembaraço por decisão judicial.&lt;br&gt;Domínio:
   * @return indicadorDesembaracoDecisaoJudicial
  **/
  @JsonProperty("indicadorDesembaracoDecisaoJudicial")
  public String getIndicadorDesembaracoDecisaoJudicial() {
    if (indicadorDesembaracoDecisaoJudicial == null) {
      return null;
    }
    return indicadorDesembaracoDecisaoJudicial.value();
  }

  public void setIndicadorDesembaracoDecisaoJudicial(IndicadorDesembaracoDecisaoJudicialEnum indicadorDesembaracoDecisaoJudicial) {
    this.indicadorDesembaracoDecisaoJudicial = indicadorDesembaracoDecisaoJudicial;
  }

  public SituacaoConferenciaAduaneiraCover indicadorDesembaracoDecisaoJudicial(IndicadorDesembaracoDecisaoJudicialEnum indicadorDesembaracoDecisaoJudicial) {
    this.indicadorDesembaracoDecisaoJudicial = indicadorDesembaracoDecisaoJudicial;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoConferenciaAduaneiraCover {\n");
    
    sb.append("    siglaOrgao: ").append(toIndentedString(siglaOrgao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    indicadorAutorizacaoEntrega: ").append(toIndentedString(indicadorAutorizacaoEntrega)).append("\n");
    sb.append("    indicadorDesembaracoDecisaoJudicial: ").append(toIndentedString(indicadorDesembaracoDecisaoJudicial)).append("\n");
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

