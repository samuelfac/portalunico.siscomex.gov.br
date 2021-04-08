package br.gov.siscomex.portalunico.edocex.model;

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
 @XmlType(name = "DocumentoDisponivelParaOrgao", propOrder =
    { "dataHoraDisponibilizacao", "descricaoOrgao", "siglaOrgao"
})

@XmlRootElement(name="DocumentoDisponivelParaOrgao")
/**
  * Disponibilização do documento para o órgão anuente.
 **/
@ApiModel(description="Disponibilização do documento para o órgão anuente.")
public class DocumentoDisponivelParaOrgao  {
  
  @XmlElement(name="dataHoraDisponibilizacao", required = true)
  @ApiModelProperty(required = true, value = "Data/hora em que o documento foi disponibilizado para o órgão.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz")
 /**
   * Data/hora em que o documento foi disponibilizado para o órgão.<br/>Formato ISO 8601: yyyy-MM-dd'T'HH:mm:ss.SSSz
  **/
  private OffsetDateTime dataHoraDisponibilizacao = null;

  @XmlElement(name="descricaoOrgao", required = true)
  @ApiModelProperty(example = "RFB - RECEITA FEDERAL DO BRASIL", required = true, value = "Descrição do órgão anuente.<br/>Tamanho máximo: 255")
 /**
   * Descrição do órgão anuente.<br/>Tamanho máximo: 255
  **/
  private String descricaoOrgao = null;


@XmlType(name="SiglaOrgaoEnum")
@XmlEnum(String.class)
public enum SiglaOrgaoEnum {

	@XmlEnumValue("ANCINE")
	@JsonProperty("ANCINE")
	ANCINE(String.valueOf("ANCINE")),
	
	@XmlEnumValue("ANEEL")
	@JsonProperty("ANEEL")
	ANEEL(String.valueOf("ANEEL")),
	
	@XmlEnumValue("ANP")
	@JsonProperty("ANP")
	ANP(String.valueOf("ANP")),
	
	@XmlEnumValue("ANVISA")
	@JsonProperty("ANVISA")
	ANVISA(String.valueOf("ANVISA")),
	
	@XmlEnumValue("BB")
	@JsonProperty("BB")
	BB(String.valueOf("BB")),
	
	@XmlEnumValue("BNDES")
	@JsonProperty("BNDES")
	BNDES(String.valueOf("BNDES")),
	
	@XmlEnumValue("CNEN")
	@JsonProperty("CNEN")
	CNEN(String.valueOf("CNEN")),
	
	@XmlEnumValue("CNPQ")
	@JsonProperty("CNPQ")
	CNPQ(String.valueOf("CNPQ")),
	
	@XmlEnumValue("CONFAZ")
	@JsonProperty("CONFAZ")
	CONFAZ(String.valueOf("CONFAZ")),
	
	@XmlEnumValue("DEAEX")
	@JsonProperty("DEAEX")
	DEAEX(String.valueOf("DEAEX")),
	
	@XmlEnumValue("DECEX")
	@JsonProperty("DECEX")
	DECEX(String.valueOf("DECEX")),
	
	@XmlEnumValue("DFPC")
	@JsonProperty("DFPC")
	DFPC(String.valueOf("DFPC")),
	
	@XmlEnumValue("DNPM")
	@JsonProperty("DNPM")
	DNPM(String.valueOf("DNPM")),
	
	@XmlEnumValue("DPF")
	@JsonProperty("DPF")
	DPF(String.valueOf("DPF")),
	
	@XmlEnumValue("ECT")
	@JsonProperty("ECT")
	ECT(String.valueOf("ECT")),
	
	@XmlEnumValue("IBAMA")
	@JsonProperty("IBAMA")
	IBAMA(String.valueOf("IBAMA")),
	
	@XmlEnumValue("INMETRO")
	@JsonProperty("INMETRO")
	INMETRO(String.valueOf("INMETRO")),
	
	@XmlEnumValue("IPHAN")
	@JsonProperty("IPHAN")
	IPHAN(String.valueOf("IPHAN")),
	
	@XmlEnumValue("MAPA")
	@JsonProperty("MAPA")
	MAPA(String.valueOf("MAPA")),
	
	@XmlEnumValue("MCT")
	@JsonProperty("MCT")
	MCT(String.valueOf("MCT")),
	
	@XmlEnumValue("MIN.DEFESA")
	@JsonProperty("MIN.DEFESA")
	MIN_DEFESA(String.valueOf("MIN.DEFESA")),
	
	@XmlEnumValue("MRE")
	@JsonProperty("MRE")
	MRE(String.valueOf("MRE")),
	
	@XmlEnumValue("RECEITA")
	@JsonProperty("RECEITA")
	RECEITA(String.valueOf("RECEITA")),
	
	@XmlEnumValue("SECEX")
	@JsonProperty("SECEX")
	SECEX(String.valueOf("SECEX")),
	
	@XmlEnumValue("SUFRAMA")
	@JsonProperty("SUFRAMA")
	SUFRAMA(String.valueOf("SUFRAMA"));


    private String value;

    SiglaOrgaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SiglaOrgaoEnum fromValue(String v) {
        for (SiglaOrgaoEnum b : SiglaOrgaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SiglaOrgaoEnum");
    }
}

  @XmlElement(name="siglaOrgao", required = true)
  @ApiModelProperty(example = "RECEITA", required = true, value = "Sigla do órgão anuente.<br/>Tamanho máximo: 255")
 /**
   * Sigla do órgão anuente.<br/>Tamanho máximo: 255
  **/
  private SiglaOrgaoEnum siglaOrgao = null;
 /**
   * Data/hora em que o documento foi disponibilizado para o órgão.&lt;br/&gt;Formato ISO 8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz
   * @return dataHoraDisponibilizacao
  **/
  @JsonProperty("dataHoraDisponibilizacao")
  @NotNull
  public OffsetDateTime getDataHoraDisponibilizacao() {
    return dataHoraDisponibilizacao;
  }

  public void setDataHoraDisponibilizacao(OffsetDateTime dataHoraDisponibilizacao) {
    this.dataHoraDisponibilizacao = dataHoraDisponibilizacao;
  }

  public DocumentoDisponivelParaOrgao dataHoraDisponibilizacao(OffsetDateTime dataHoraDisponibilizacao) {
    this.dataHoraDisponibilizacao = dataHoraDisponibilizacao;
    return this;
  }

 /**
   * Descrição do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
   * @return descricaoOrgao
  **/
  @JsonProperty("descricaoOrgao")
  @NotNull
  public String getDescricaoOrgao() {
    return descricaoOrgao;
  }

  public void setDescricaoOrgao(String descricaoOrgao) {
    this.descricaoOrgao = descricaoOrgao;
  }

  public DocumentoDisponivelParaOrgao descricaoOrgao(String descricaoOrgao) {
    this.descricaoOrgao = descricaoOrgao;
    return this;
  }

 /**
   * Sigla do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
   * @return siglaOrgao
  **/
  @JsonProperty("siglaOrgao")
  @NotNull
  public String getSiglaOrgao() {
    if (siglaOrgao == null) {
      return null;
    }
    return siglaOrgao.value();
  }

  public void setSiglaOrgao(SiglaOrgaoEnum siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
  }

  public DocumentoDisponivelParaOrgao siglaOrgao(SiglaOrgaoEnum siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDisponivelParaOrgao {\n");
    
    sb.append("    dataHoraDisponibilizacao: ").append(toIndentedString(dataHoraDisponibilizacao)).append("\n");
    sb.append("    descricaoOrgao: ").append(toIndentedString(descricaoOrgao)).append("\n");
    sb.append("    siglaOrgao: ").append(toIndentedString(siglaOrgao)).append("\n");
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

