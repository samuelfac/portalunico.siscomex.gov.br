package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "AlterarSituacaoLpcoRequest", propOrder =
    { "situacao", "justificativa", "dataInicioVigencia", "dataFinalVigencia", "numeroOrgaoOrigem", "requerInspecao"
})

@XmlRootElement(name="AlterarSituacaoLpcoRequest")
/**
  * Dados a serem informados para realizar a alteração da situação de um LPCO
 **/
@ApiModel(description="Dados a serem informados para realizar a alteração da situação de um LPCO")
public class AlterarSituacaoLpcoRequest  {
  

@XmlType(name="SituacaoEnum")
@XmlEnum(String.class)
public enum SituacaoEnum {

	@XmlEnumValue("PARA_ANALISE")
	@JsonProperty("PARA_ANALISE")
	PARA_ANALISE(String.valueOf("PARA_ANALISE")),
	
	@XmlEnumValue("EM_ANALISE")
	@JsonProperty("EM_ANALISE")
	EM_ANALISE(String.valueOf("EM_ANALISE")),
	
	@XmlEnumValue("DEFERIDO")
	@JsonProperty("DEFERIDO")
	DEFERIDO(String.valueOf("DEFERIDO")),
	
	@XmlEnumValue("CANCELADO")
	@JsonProperty("CANCELADO")
	CANCELADO(String.valueOf("CANCELADO")),
	
	@XmlEnumValue("INDEFERIDO")
	@JsonProperty("INDEFERIDO")
	INDEFERIDO(String.valueOf("INDEFERIDO")),
	
	@XmlEnumValue("ANULADO_REVOGADO")
	@JsonProperty("ANULADO_REVOGADO")
	ANULADO_REVOGADO(String.valueOf("ANULADO_REVOGADO"));


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

  @XmlElement(name="situacao", required = true)
  @ApiModelProperty(example = "EM_ANALISE", required = true, value = "Código da nova situação do LPCO<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50")
 /**
   * Código da nova situação do LPCO<br>Tamanho mínimo: 0 <br>Tamanho máximo: 50
  **/
  private SituacaoEnum situacao = null;

  @XmlElement(name="justificativa")
  @ApiModelProperty(example = "Texto livre.", value = "Justificativa para a alteração da situação do LPCO <br> Tamanho mínimo: 1<br>Tamanho máximo: 4000")
 /**
   * Justificativa para a alteração da situação do LPCO <br> Tamanho mínimo: 1<br>Tamanho máximo: 4000
  **/
  private String justificativa = null;

  @XmlElement(name="dataInicioVigencia")
  @ApiModelProperty(example = "2019-09-02", value = "Data de início de vigência, só deve ser informada quando a nova situação do LPCO for DEFERIDO<br>Formato: yyyy-MM-dd")
 /**
   * Data de início de vigência, só deve ser informada quando a nova situação do LPCO for DEFERIDO<br>Formato: yyyy-MM-dd
  **/
  private String dataInicioVigencia = null;

  @XmlElement(name="dataFinalVigencia")
  @ApiModelProperty(example = "2021-09-02", value = "Data do final de vigência do LPCO, só deve ser informado quando a nova situação do LPCO for DEFERIDO<br>Formato: yyyy-MM-dd")
 /**
   * Data do final de vigência do LPCO, só deve ser informado quando a nova situação do LPCO for DEFERIDO<br>Formato: yyyy-MM-dd
  **/
  private String dataFinalVigencia = null;

  @XmlElement(name="numeroOrgaoOrigem")
  @ApiModelProperty(example = "EXA12345", value = "Número do LPCO no órgão anuente, se houver<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Número do LPCO no órgão anuente, se houver<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String numeroOrgaoOrigem = null;

  @XmlElement(name="requerInspecao")
  @ApiModelProperty(example = "false", value = "Indica se haverá necessidade de inspeção de carga")
 /**
   * Indica se haverá necessidade de inspeção de carga
  **/
  private Boolean requerInspecao = false;
 /**
   * Código da nova situação do LPCO&lt;br&gt;Tamanho mínimo: 0 &lt;br&gt;Tamanho máximo: 50
   * @return situacao
  **/
  @JsonProperty("situacao")
  @NotNull
  public String getSituacao() {
    if (situacao == null) {
      return null;
    }
    return situacao.value();
  }

  public void setSituacao(SituacaoEnum situacao) {
    this.situacao = situacao;
  }

  public AlterarSituacaoLpcoRequest situacao(SituacaoEnum situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Justificativa para a alteração da situação do LPCO &lt;br&gt; Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
   * @return justificativa
  **/
  @JsonProperty("justificativa")
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }

  public AlterarSituacaoLpcoRequest justificativa(String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

 /**
   * Data de início de vigência, só deve ser informada quando a nova situação do LPCO for DEFERIDO&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataInicioVigencia
  **/
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public AlterarSituacaoLpcoRequest dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

 /**
   * Data do final de vigência do LPCO, só deve ser informado quando a nova situação do LPCO for DEFERIDO&lt;br&gt;Formato: yyyy-MM-dd
   * @return dataFinalVigencia
  **/
  @JsonProperty("dataFinalVigencia")
  public String getDataFinalVigencia() {
    return dataFinalVigencia;
  }

  public void setDataFinalVigencia(String dataFinalVigencia) {
    this.dataFinalVigencia = dataFinalVigencia;
  }

  public AlterarSituacaoLpcoRequest dataFinalVigencia(String dataFinalVigencia) {
    this.dataFinalVigencia = dataFinalVigencia;
    return this;
  }

 /**
   * Número do LPCO no órgão anuente, se houver&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return numeroOrgaoOrigem
  **/
  @JsonProperty("numeroOrgaoOrigem")
  public String getNumeroOrgaoOrigem() {
    return numeroOrgaoOrigem;
  }

  public void setNumeroOrgaoOrigem(String numeroOrgaoOrigem) {
    this.numeroOrgaoOrigem = numeroOrgaoOrigem;
  }

  public AlterarSituacaoLpcoRequest numeroOrgaoOrigem(String numeroOrgaoOrigem) {
    this.numeroOrgaoOrigem = numeroOrgaoOrigem;
    return this;
  }

 /**
   * Indica se haverá necessidade de inspeção de carga
   * @return requerInspecao
  **/
  @JsonProperty("requerInspecao")
  public Boolean isRequerInspecao() {
    return requerInspecao;
  }

  public void setRequerInspecao(Boolean requerInspecao) {
    this.requerInspecao = requerInspecao;
  }

  public AlterarSituacaoLpcoRequest requerInspecao(Boolean requerInspecao) {
    this.requerInspecao = requerInspecao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarSituacaoLpcoRequest {\n");
    
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFinalVigencia: ").append(toIndentedString(dataFinalVigencia)).append("\n");
    sb.append("    numeroOrgaoOrigem: ").append(toIndentedString(numeroOrgaoOrigem)).append("\n");
    sb.append("    requerInspecao: ").append(toIndentedString(requerInspecao)).append("\n");
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

