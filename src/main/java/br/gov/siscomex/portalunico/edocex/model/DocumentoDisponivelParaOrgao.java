package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;

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

  @XmlElement(name="siglaOrgao", required = true)
  @ApiModelProperty(example = "RECEITA", required = true, value = "Sigla do órgão anuente.<br/>Tamanho máximo: 255")
 /**
   * Sigla do órgão anuente.<br/>Tamanho máximo: 255
  **/
  private String siglaOrgao = null;
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
    return siglaOrgao;
  }

  public void setSiglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
  }

  public DocumentoDisponivelParaOrgao siglaOrgao(String siglaOrgao) {
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

