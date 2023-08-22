package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ExigenciaFiscalDTO", propOrder =
    { "auditorDaLiberacao", "auditorDoRegistro", "dataDaExigencia", "dataDeLiberacao", "numeroOrdem", "orgao", "situacao", "textoDaExigencia", "textoDaJustificativa"
})

@XmlRootElement(name="ExigenciaFiscalDTO")
public class ExigenciaFiscalDTO  {
  
  @XmlElement(name="auditorDaLiberacao")
  @ApiModelProperty(value = "Auditor da Liberação<br />Tamanho mínimo: 1<br />Tamanho máximo: 100")
 /**
   * Auditor da Liberação<br />Tamanho mínimo: 1<br />Tamanho máximo: 100
  **/
  private String auditorDaLiberacao = null;

  @XmlElement(name="auditorDoRegistro")
  @ApiModelProperty(value = "Auditor do Registro<br />Tamanho mínimo: 1<br />Tamanho máximo: 100")
 /**
   * Auditor do Registro<br />Tamanho mínimo: 1<br />Tamanho máximo: 100
  **/
  private String auditorDoRegistro = null;

  @XmlElement(name="dataDaExigencia")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data da exigência<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDaExigencia = null;

  @XmlElement(name="dataDeLiberacao")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de Liberação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de Liberação<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataDeLiberacao = null;

  @XmlElement(name="numeroOrdem")
  @ApiModelProperty(value = "Número da ordenação<br />Formato: Inteiro, com até 2 digitos")
 /**
   * Número da ordenação<br />Formato: Inteiro, com até 2 digitos
  **/
  private Integer numeroOrdem = null;

  @XmlElement(name="orgao")
  @ApiModelProperty(value = "Órgão<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Órgão<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String orgao = null;


@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("PENDENTE")
	@JsonProperty("PENDENTE")
	PENDENTE(String.valueOf("PENDENTE")),
	
	@XmlEnumValue("LIBERADA")
	@JsonProperty("LIBERADA")
	LIBERADA(String.valueOf("LIBERADA")),
	
	@XmlEnumValue("SUBSTITUIDA")
	@JsonProperty("SUBSTITUIDA")
	SUBSTITUIDA(String.valueOf("SUBSTITUIDA")),
	
	@XmlEnumValue("ENCERRADA")
	@JsonProperty("ENCERRADA")
	ENCERRADA(String.valueOf("ENCERRADA")),
	
	@XmlEnumValue("ENCERRADA_POR_OFICIO")
	@JsonProperty("ENCERRADA_POR_OFICIO")
	ENCERRADA_POR_OFICIO(String.valueOf("ENCERRADA_POR_OFICIO")),
	
	@XmlEnumValue("CANCELADA")
	@JsonProperty("CANCELADA")
	CANCELADA(String.valueOf("CANCELADA")),
	
	@XmlEnumValue("ATIVA")
	@JsonProperty("ATIVA")
	ATIVA(String.valueOf("ATIVA")),
	
	@XmlEnumValue("DISPENSADA")
	@JsonProperty("DISPENSADA")
	DISPENSADA(String.valueOf("DISPENSADA")),
	
	@XmlEnumValue("CANCELADA_DUIMP")
	@JsonProperty("CANCELADA_DUIMP")
	CANCELADA_DUIMP(String.valueOf("CANCELADA_DUIMP")),
	
	@XmlEnumValue("ATENDIDA")
	@JsonProperty("ATENDIDA")
	ATENDIDA(String.valueOf("ATENDIDA")),
	
	@XmlEnumValue("ENCERRADA_DUIMP")
	@JsonProperty("ENCERRADA_DUIMP")
	ENCERRADA_DUIMP(String.valueOf("ENCERRADA_DUIMP")),
	
	@XmlEnumValue("ENCERRADA_POR_OFICIO_DUIMP")
	@JsonProperty("ENCERRADA_POR_OFICIO_DUIMP")
	ENCERRADA_POR_OFICIO_DUIMP(String.valueOf("ENCERRADA_POR_OFICIO_DUIMP")),
	
	@XmlEnumValue("CANCELADA_CONFERENCIA_ANUENTE")
	@JsonProperty("CANCELADA_CONFERENCIA_ANUENTE")
	CANCELADA_CONFERENCIA_ANUENTE(String.valueOf("CANCELADA_CONFERENCIA_ANUENTE")),
	
	@XmlEnumValue("ENCERRADA_PERDA_OBJETO")
	@JsonProperty("ENCERRADA_PERDA_OBJETO")
	ENCERRADA_PERDA_OBJETO(String.valueOf("ENCERRADA_PERDA_OBJETO"));


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
  @ApiModelProperty(value = "")
  private SituacaoEnum situacao = null;

  @XmlElement(name="textoDaExigencia")
  @ApiModelProperty(value = "Texto da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 200")
 /**
   * Texto da exigência<br />Tamanho mínimo: 0<br />Tamanho máximo: 200
  **/
  private String textoDaExigencia = null;

  @XmlElement(name="textoDaJustificativa")
  @ApiModelProperty(value = "Texto da justificativa<br />Tamanho mínimo: 0<br />Tamanho máximo: 1000")
 /**
   * Texto da justificativa<br />Tamanho mínimo: 0<br />Tamanho máximo: 1000
  **/
  private String textoDaJustificativa = null;
 /**
   * Auditor da Liberação&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 100
   * @return auditorDaLiberacao
  **/
  @JsonProperty("auditorDaLiberacao")
  public String getAuditorDaLiberacao() {
    return auditorDaLiberacao;
  }

  public void setAuditorDaLiberacao(String auditorDaLiberacao) {
    this.auditorDaLiberacao = auditorDaLiberacao;
  }

  public ExigenciaFiscalDTO auditorDaLiberacao(String auditorDaLiberacao) {
    this.auditorDaLiberacao = auditorDaLiberacao;
    return this;
  }

 /**
   * Auditor do Registro&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 100
   * @return auditorDoRegistro
  **/
  @JsonProperty("auditorDoRegistro")
  public String getAuditorDoRegistro() {
    return auditorDoRegistro;
  }

  public void setAuditorDoRegistro(String auditorDoRegistro) {
    this.auditorDoRegistro = auditorDoRegistro;
  }

  public ExigenciaFiscalDTO auditorDoRegistro(String auditorDoRegistro) {
    this.auditorDoRegistro = auditorDoRegistro;
    return this;
  }

 /**
   * Data da exigência&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDaExigencia
  **/
  @JsonProperty("dataDaExigencia")
  public OffsetDateTime getDataDaExigencia() {
    return dataDaExigencia;
  }

  public void setDataDaExigencia(OffsetDateTime dataDaExigencia) {
    this.dataDaExigencia = dataDaExigencia;
  }

  public ExigenciaFiscalDTO dataDaExigencia(OffsetDateTime dataDaExigencia) {
    this.dataDaExigencia = dataDaExigencia;
    return this;
  }

 /**
   * Data de Liberação&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataDeLiberacao
  **/
  @JsonProperty("dataDeLiberacao")
  public OffsetDateTime getDataDeLiberacao() {
    return dataDeLiberacao;
  }

  public void setDataDeLiberacao(OffsetDateTime dataDeLiberacao) {
    this.dataDeLiberacao = dataDeLiberacao;
  }

  public ExigenciaFiscalDTO dataDeLiberacao(OffsetDateTime dataDeLiberacao) {
    this.dataDeLiberacao = dataDeLiberacao;
    return this;
  }

 /**
   * Número da ordenação&lt;br /&gt;Formato: Inteiro, com até 2 digitos
   * @return numeroOrdem
  **/
  @JsonProperty("numeroOrdem")
  public Integer getNumeroOrdem() {
    return numeroOrdem;
  }

  public void setNumeroOrdem(Integer numeroOrdem) {
    this.numeroOrdem = numeroOrdem;
  }

  public ExigenciaFiscalDTO numeroOrdem(Integer numeroOrdem) {
    this.numeroOrdem = numeroOrdem;
    return this;
  }

 /**
   * Órgão&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return orgao
  **/
  @JsonProperty("orgao")
  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public ExigenciaFiscalDTO orgao(String orgao) {
    this.orgao = orgao;
    return this;
  }

 /**
   * Get situacao
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

  public ExigenciaFiscalDTO situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Texto da exigência&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 200
   * @return textoDaExigencia
  **/
  @JsonProperty("textoDaExigencia")
  public String getTextoDaExigencia() {
    return textoDaExigencia;
  }

  public void setTextoDaExigencia(String textoDaExigencia) {
    this.textoDaExigencia = textoDaExigencia;
  }

  public ExigenciaFiscalDTO textoDaExigencia(String textoDaExigencia) {
    this.textoDaExigencia = textoDaExigencia;
    return this;
  }

 /**
   * Texto da justificativa&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 1000
   * @return textoDaJustificativa
  **/
  @JsonProperty("textoDaJustificativa")
  public String getTextoDaJustificativa() {
    return textoDaJustificativa;
  }

  public void setTextoDaJustificativa(String textoDaJustificativa) {
    this.textoDaJustificativa = textoDaJustificativa;
  }

  public ExigenciaFiscalDTO textoDaJustificativa(String textoDaJustificativa) {
    this.textoDaJustificativa = textoDaJustificativa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExigenciaFiscalDTO {\n");
    
    sb.append("    auditorDaLiberacao: ").append(toIndentedString(auditorDaLiberacao)).append("\n");
    sb.append("    auditorDoRegistro: ").append(toIndentedString(auditorDoRegistro)).append("\n");
    sb.append("    dataDaExigencia: ").append(toIndentedString(dataDaExigencia)).append("\n");
    sb.append("    dataDeLiberacao: ").append(toIndentedString(dataDeLiberacao)).append("\n");
    sb.append("    numeroOrdem: ").append(toIndentedString(numeroOrdem)).append("\n");
    sb.append("    orgao: ").append(toIndentedString(orgao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    textoDaExigencia: ").append(toIndentedString(textoDaExigencia)).append("\n");
    sb.append("    textoDaJustificativa: ").append(toIndentedString(textoDaJustificativa)).append("\n");
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

