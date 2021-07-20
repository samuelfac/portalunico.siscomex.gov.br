package br.gov.siscomex.portalunico.pcce.model;

import java.time.OffsetDateTime;

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
 @XmlType(name = "SituacaoHistoricoDto", propOrder =
    { "comentario", "cpfResponsavel", "dataSituacao", "descricaoSituacao"
})

@XmlRootElement(name="SituacaoHistoricoDto")
/**
  * Dados do histórico de uma declaração ICMS criada no PCCE
 **/
@ApiModel(description="Dados do histórico de uma declaração ICMS criada no PCCE")
public class SituacaoHistoricoDto  {
  
  @XmlElement(name="comentario")
  @ApiModelProperty(value = "Justificativa do pedido ou resposta do importador/sefaz")
 /**
   * Justificativa do pedido ou resposta do importador/sefaz
  **/
  private String comentario = null;

  @XmlElement(name="cpfResponsavel", required = true)
  @ApiModelProperty(example = "11111111111", required = true, value = "CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11")
 /**
   * CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11
  **/
  private String cpfResponsavel = null;

  @XmlElement(name="dataSituacao", required = true)
  @ApiModelProperty(example = "2019-09-17T18:38:23.056Z", required = true, value = "Data da situação<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data da situação<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataSituacao = null;


@XmlType(name="DescricaoSituacaoEnum")
@XmlEnum(String.class)
public enum DescricaoSituacaoEnum {

	@XmlEnumValue("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")
	@JsonProperty("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")
	CONCLUIDA_SEFAZ_SEM_CARGA(String.valueOf("DUIMP_CONCLUIDA_SEFAZ_SEM_CARGA")),
	
	@XmlEnumValue("DUIMP_DECLARADA")
	@JsonProperty("DUIMP_DECLARADA")
	DECLARADA(String.valueOf("DUIMP_DECLARADA")),
	
	@XmlEnumValue("DUIMP_CANCELADA_IMPORTADOR")
	@JsonProperty("DUIMP_CANCELADA_IMPORTADOR")
	CANCELADA_IMPORTADOR(String.valueOf("DUIMP_CANCELADA_IMPORTADOR")),
	
	@XmlEnumValue("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
	@JsonProperty("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
	PENDENTE_PAGAMENTO_EXONERACAO(String.valueOf("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")),
	
	@XmlEnumValue("DUIMP_PAGA_EXONERADA")
	@JsonProperty("DUIMP_PAGA_EXONERADA")
	PAGA_EXONERADA(String.valueOf("DUIMP_PAGA_EXONERADA")),
	
	@XmlEnumValue("DUIMP_CANCELADA_AUTOMATICAMENTE")
	@JsonProperty("DUIMP_CANCELADA_AUTOMATICAMENTE")
	CANCELADA_AUTOMATICAMENTE(String.valueOf("DUIMP_CANCELADA_AUTOMATICAMENTE")),
	
	@XmlEnumValue("DUIMP_AGUARDANDO_DOCUMENTACAO")
	@JsonProperty("DUIMP_AGUARDANDO_DOCUMENTACAO")
	AGUARDANDO_DOCUMENTACAO(String.valueOf("DUIMP_AGUARDANDO_DOCUMENTACAO")),
	
	@XmlEnumValue("DUIMP_AGUARDANDO_EXIGENCIA")
	@JsonProperty("DUIMP_AGUARDANDO_EXIGENCIA")
	AGUARDANDO_EXIGENCIA(String.valueOf("DUIMP_AGUARDANDO_EXIGENCIA")),
	
	@XmlEnumValue("DUIMP_A_DISTRIBUIR")
	@JsonProperty("DUIMP_A_DISTRIBUIR")
	A_DISTRIBUIR(String.valueOf("DUIMP_A_DISTRIBUIR")),
	
	@XmlEnumValue("DUIMP_A_DISTRIBUIR_RETORNO")
	@JsonProperty("DUIMP_A_DISTRIBUIR_RETORNO")
	A_DISTRIBUIR_RETORNO(String.valueOf("DUIMP_A_DISTRIBUIR_RETORNO")),
	
	@XmlEnumValue("DUIMP_DISTRIBUIDA")
	@JsonProperty("DUIMP_DISTRIBUIDA")
	DISTRIBUIDA(String.valueOf("DUIMP_DISTRIBUIDA")),
	
	@XmlEnumValue("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
	@JsonProperty("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
	SOLICITACAO_AUTORIZADA_SEFAZ(String.valueOf("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")),
	
	@XmlEnumValue("DUIMP_SOLICITACAO_INDEFERIDA")
	@JsonProperty("DUIMP_SOLICITACAO_INDEFERIDA")
	SOLICITACAO_INDEFERIDA(String.valueOf("DUIMP_SOLICITACAO_INDEFERIDA")),
	
	@XmlEnumValue("DUIMP_DECLARADA_PAGA")
	@JsonProperty("DUIMP_DECLARADA_PAGA")
	DECLARADA_PAGA(String.valueOf("DUIMP_DECLARADA_PAGA")),
	
	@XmlEnumValue("DUIMP_CALCULO_SOLICITADO")
	@JsonProperty("DUIMP_CALCULO_SOLICITADO")
	CALCULO_SOLICITADO(String.valueOf("DUIMP_CALCULO_SOLICITADO")),
	
	@XmlEnumValue("DUIMP_CALCULO_INDEFERIDO")
	@JsonProperty("DUIMP_CALCULO_INDEFERIDO")
	CALCULO_INDEFERIDO(String.valueOf("DUIMP_CALCULO_INDEFERIDO"));


    private String value;

    DescricaoSituacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DescricaoSituacaoEnum fromValue(String v) {
        for (DescricaoSituacaoEnum b : DescricaoSituacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to DescricaoSituacaoEnum");
    }
}

  @XmlElement(name="descricaoSituacao", required = true)
  @ApiModelProperty(example = "DUIMP_AGUARDANDO_EXIGENCIA", required = true, value = "Descrição da situação da solicitação")
 /**
   * Descrição da situação da solicitação
  **/
  private DescricaoSituacaoEnum descricaoSituacao = null;
 /**
   * Justificativa do pedido ou resposta do importador/sefaz
   * @return comentario
  **/
  @JsonProperty("comentario")
  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public SituacaoHistoricoDto comentario(String comentario) {
    this.comentario = comentario;
    return this;
  }

 /**
   * CPF do responsável pela declaração de ICMS&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11
   * @return cpfResponsavel
  **/
  @JsonProperty("cpfResponsavel")
  @NotNull
  public String getCpfResponsavel() {
    return cpfResponsavel;
  }

  public void setCpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
  }

  public SituacaoHistoricoDto cpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
    return this;
  }

 /**
   * Data da situação&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataSituacao
  **/
  @JsonProperty("dataSituacao")
  @NotNull
  public OffsetDateTime getDataSituacao() {
    return dataSituacao;
  }

  public void setDataSituacao(OffsetDateTime dataSituacao) {
    this.dataSituacao = dataSituacao;
  }

  public SituacaoHistoricoDto dataSituacao(OffsetDateTime dataSituacao) {
    this.dataSituacao = dataSituacao;
    return this;
  }

 /**
   * Descrição da situação da solicitação
   * @return descricaoSituacao
  **/
  @JsonProperty("descricaoSituacao")
  @NotNull
  public String getDescricaoSituacao() {
    if (descricaoSituacao == null) {
      return null;
    }
    return descricaoSituacao.value();
  }

  public void setDescricaoSituacao(DescricaoSituacaoEnum descricaoSituacao) {
    this.descricaoSituacao = descricaoSituacao;
  }

  public SituacaoHistoricoDto descricaoSituacao(DescricaoSituacaoEnum descricaoSituacao) {
    this.descricaoSituacao = descricaoSituacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoHistoricoDto {\n");
    
    sb.append("    comentario: ").append(toIndentedString(comentario)).append("\n");
    sb.append("    cpfResponsavel: ").append(toIndentedString(cpfResponsavel)).append("\n");
    sb.append("    dataSituacao: ").append(toIndentedString(dataSituacao)).append("\n");
    sb.append("    descricaoSituacao: ").append(toIndentedString(descricaoSituacao)).append("\n");
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

