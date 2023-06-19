package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SolicitacaoDTO", propOrder =
    { "dataDaSolicitacao", "dataDeApreciacao", "motivo", "motivoDoIndeferimento", "numeroDoComprot", "situacaoSolicitacaoDue", "tipoSolicitacao", "usuarioQueAnalisou", "usuarioResponsavel"
})

@XmlRootElement(name="SolicitacaoDTO")
public class SolicitacaoDTO  {
  
  @XmlElement(name="dataDaSolicitacao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data da solicitação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data da solicitação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDaSolicitacao = null;

  @XmlElement(name="dataDeApreciacao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de apreciação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de apreciação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeApreciacao = null;

  @XmlElement(name="motivo")
  @ApiModelProperty(value = "Motivo<br />Tamanho mínimo: 0<br />Tamanho máximo: 600")
 /**
   * Motivo<br />Tamanho mínimo: 0<br />Tamanho máximo: 600
  **/
  private String motivo = null;

  @XmlElement(name="motivoDoIndeferimento")
  @ApiModelProperty(value = "Motivo do indeferimento<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000")
 /**
   * Motivo do indeferimento<br />Tamanho mínimo: 0<br />Tamanho máximo: 4000
  **/
  private String motivoDoIndeferimento = null;

  @XmlElement(name="numeroDoComprot")
  @ApiModelProperty(value = "Número do comprot<br />Tamanho mínimo: 0<br />Tamanho máximo: 17")
 /**
   * Número do comprot<br />Tamanho mínimo: 0<br />Tamanho máximo: 17
  **/
  private String numeroDoComprot = null;


@XmlType(name="SituacaoSolicitacaoDueEnum")
@XmlEnum(String.class)
public enum SituacaoSolicitacaoDueEnum {

	@XmlEnumValue("PENDENTE")
	@JsonProperty("PENDENTE")
	PENDENTE(String.valueOf("PENDENTE")),
	
	@XmlEnumValue("EM_ANALISE")
	@JsonProperty("EM_ANALISE")
	EM_ANALISE(String.valueOf("EM_ANALISE")),
	
	@XmlEnumValue("DEFERIDA")
	@JsonProperty("DEFERIDA")
	DEFERIDA(String.valueOf("DEFERIDA")),
	
	@XmlEnumValue("EXIGENCIA")
	@JsonProperty("EXIGENCIA")
	EXIGENCIA(String.valueOf("EXIGENCIA")),
	
	@XmlEnumValue("DEFERIDA_COM_EXIGENCIA")
	@JsonProperty("DEFERIDA_COM_EXIGENCIA")
	DEFERIDA_COM_EXIGENCIA(String.valueOf("DEFERIDA_COM_EXIGENCIA")),
	
	@XmlEnumValue("INDEFERIDA")
	@JsonProperty("INDEFERIDA")
	INDEFERIDA(String.valueOf("INDEFERIDA")),
	
	@XmlEnumValue("CANCELADA")
	@JsonProperty("CANCELADA")
	CANCELADA(String.valueOf("CANCELADA"));


    private String value;

    SituacaoSolicitacaoDueEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SituacaoSolicitacaoDueEnum fromValue(String v) {
        for (SituacaoSolicitacaoDueEnum b : SituacaoSolicitacaoDueEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoSolicitacaoDueEnum");
    }
}

  @XmlElement(name="situacaoSolicitacaoDue")
  @ApiModelProperty(value = "")
  private SituacaoSolicitacaoDueEnum situacaoSolicitacaoDue = null;


@XmlType(name="TipoSolicitacaoEnum")
@XmlEnum(String.class)
public enum TipoSolicitacaoEnum {

	@XmlEnumValue("RETIFICACAO")
	@JsonProperty("RETIFICACAO")
	RETIFICACAO(String.valueOf("RETIFICACAO")),
	
	@XmlEnumValue("CANCELAMENTO")
	@JsonProperty("CANCELAMENTO")
	CANCELAMENTO(String.valueOf("CANCELAMENTO"));


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

  @XmlElement(name="tipoSolicitacao")
  @ApiModelProperty(value = "")
  private TipoSolicitacaoEnum tipoSolicitacao = null;

  @XmlElement(name="usuarioQueAnalisou")
  @ApiModelProperty(value = "Status da Solicitação<br />Tamanho mínimo: 0<br />Tamanho máximo: 8")
 /**
   * Status da Solicitação<br />Tamanho mínimo: 0<br />Tamanho máximo: 8
  **/
  private String usuarioQueAnalisou = null;

  @XmlElement(name="usuarioResponsavel")
  @ApiModelProperty(value = "Usuário responsável<br />Tamanho mínimo: 0<br />Tamanho máximo: 11")
 /**
   * Usuário responsável<br />Tamanho mínimo: 0<br />Tamanho máximo: 11
  **/
  private String usuarioResponsavel = null;
 /**
   * Data da solicitação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDaSolicitacao
  **/
  @JsonProperty("dataDaSolicitacao")
  public OffsetDateTime getDataDaSolicitacao() {
    return dataDaSolicitacao;
  }

  public void setDataDaSolicitacao(OffsetDateTime dataDaSolicitacao) {
    this.dataDaSolicitacao = dataDaSolicitacao;
  }

  public SolicitacaoDTO dataDaSolicitacao(OffsetDateTime dataDaSolicitacao) {
    this.dataDaSolicitacao = dataDaSolicitacao;
    return this;
  }

 /**
   * Data de apreciação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeApreciacao
  **/
  @JsonProperty("dataDeApreciacao")
  public OffsetDateTime getDataDeApreciacao() {
    return dataDeApreciacao;
  }

  public void setDataDeApreciacao(OffsetDateTime dataDeApreciacao) {
    this.dataDeApreciacao = dataDeApreciacao;
  }

  public SolicitacaoDTO dataDeApreciacao(OffsetDateTime dataDeApreciacao) {
    this.dataDeApreciacao = dataDeApreciacao;
    return this;
  }

 /**
   * Motivo&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 600
   * @return motivo
  **/
  @JsonProperty("motivo")
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public SolicitacaoDTO motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }

 /**
   * Motivo do indeferimento&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 4000
   * @return motivoDoIndeferimento
  **/
  @JsonProperty("motivoDoIndeferimento")
  public String getMotivoDoIndeferimento() {
    return motivoDoIndeferimento;
  }

  public void setMotivoDoIndeferimento(String motivoDoIndeferimento) {
    this.motivoDoIndeferimento = motivoDoIndeferimento;
  }

  public SolicitacaoDTO motivoDoIndeferimento(String motivoDoIndeferimento) {
    this.motivoDoIndeferimento = motivoDoIndeferimento;
    return this;
  }

 /**
   * Número do comprot&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 17
   * @return numeroDoComprot
  **/
  @JsonProperty("numeroDoComprot")
  public String getNumeroDoComprot() {
    return numeroDoComprot;
  }

  public void setNumeroDoComprot(String numeroDoComprot) {
    this.numeroDoComprot = numeroDoComprot;
  }

  public SolicitacaoDTO numeroDoComprot(String numeroDoComprot) {
    this.numeroDoComprot = numeroDoComprot;
    return this;
  }

 /**
   * Get situacaoSolicitacaoDue
   * @return situacaoSolicitacaoDue
  **/
  @JsonProperty("situacaoSolicitacaoDue")
  public String getSituacaoSolicitacaoDue() {
    if (situacaoSolicitacaoDue == null) {
      return null;
    }
    return situacaoSolicitacaoDue.value();
  }

  public void setSituacaoSolicitacaoDue(SituacaoSolicitacaoDueEnum situacaoSolicitacaoDue) {
    this.situacaoSolicitacaoDue = situacaoSolicitacaoDue;
  }

  public SolicitacaoDTO situacaoSolicitacaoDue(SituacaoSolicitacaoDueEnum situacaoSolicitacaoDue) {
    this.situacaoSolicitacaoDue = situacaoSolicitacaoDue;
    return this;
  }

 /**
   * Get tipoSolicitacao
   * @return tipoSolicitacao
  **/
  @JsonProperty("tipoSolicitacao")
  public String getTipoSolicitacao() {
    if (tipoSolicitacao == null) {
      return null;
    }
    return tipoSolicitacao.value();
  }

  public void setTipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
  }

  public SolicitacaoDTO tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
    this.tipoSolicitacao = tipoSolicitacao;
    return this;
  }

 /**
   * Status da Solicitação&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 8
   * @return usuarioQueAnalisou
  **/
  @JsonProperty("usuarioQueAnalisou")
  public String getUsuarioQueAnalisou() {
    return usuarioQueAnalisou;
  }

  public void setUsuarioQueAnalisou(String usuarioQueAnalisou) {
    this.usuarioQueAnalisou = usuarioQueAnalisou;
  }

  public SolicitacaoDTO usuarioQueAnalisou(String usuarioQueAnalisou) {
    this.usuarioQueAnalisou = usuarioQueAnalisou;
    return this;
  }

 /**
   * Usuário responsável&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 11
   * @return usuarioResponsavel
  **/
  @JsonProperty("usuarioResponsavel")
  public String getUsuarioResponsavel() {
    return usuarioResponsavel;
  }

  public void setUsuarioResponsavel(String usuarioResponsavel) {
    this.usuarioResponsavel = usuarioResponsavel;
  }

  public SolicitacaoDTO usuarioResponsavel(String usuarioResponsavel) {
    this.usuarioResponsavel = usuarioResponsavel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoDTO {\n");
    
    sb.append("    dataDaSolicitacao: ").append(toIndentedString(dataDaSolicitacao)).append("\n");
    sb.append("    dataDeApreciacao: ").append(toIndentedString(dataDeApreciacao)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("    motivoDoIndeferimento: ").append(toIndentedString(motivoDoIndeferimento)).append("\n");
    sb.append("    numeroDoComprot: ").append(toIndentedString(numeroDoComprot)).append("\n");
    sb.append("    situacaoSolicitacaoDue: ").append(toIndentedString(situacaoSolicitacaoDue)).append("\n");
    sb.append("    tipoSolicitacao: ").append(toIndentedString(tipoSolicitacao)).append("\n");
    sb.append("    usuarioQueAnalisou: ").append(toIndentedString(usuarioQueAnalisou)).append("\n");
    sb.append("    usuarioResponsavel: ").append(toIndentedString(usuarioResponsavel)).append("\n");
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

