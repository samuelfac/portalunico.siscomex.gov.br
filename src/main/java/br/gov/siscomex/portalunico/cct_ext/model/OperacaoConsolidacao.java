package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OperacaoConsolidacao", propOrder =
    { "tipoDeCarga", "identificacaoConsolidacao", "numeroMRUC", "cnpjConsolidador", "acondicionamento", "documentosConsolidacao"
})

@XmlRootElement(name="OperacaoConsolidacao")
/**
  * Dados da consolidação
 **/
@ApiModel(description="Dados da consolidação")
public class OperacaoConsolidacao  {
  
  @XmlElement(name="tipoDeCarga")
  @ApiModelProperty(value = "")
  private Integer tipoDeCarga = null;

  @XmlElement(name="identificacaoConsolidacao", required = true)
  @ApiModelProperty(example = "ABC9999999999999999", required = true, value = "Identificação da operação de consolidação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada consolidação no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da operação de consolidação<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada consolidação no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoConsolidacao = null;

  @XmlElement(name="numeroMRUC")
  @ApiModelProperty(example = "7BR276574827551833214353477473070", value = "Número da RUC Master que identificará esta consolidação<br>Mesmo formato de uma RUC.<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Número da RUC Master que identificará esta consolidação<br>Mesmo formato de uma RUC.<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroMRUC = null;

  @XmlElement(name="cnpjConsolidador", required = true)
  @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do responsável pela consolidação<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela consolidação<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjConsolidador = null;

  @XmlElement(name="acondicionamento", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Acondicionamento acondicionamento = null;

  @XmlElement(name="documentosConsolidacao", required = true)
  @ApiModelProperty(required = true, value = "Lista de documentos envolvidos na consolidação<br>OBS: uma DU-E/RUC não pode repetir na lista de documentos. Devem ser incluídos ao menos dois documentos na lista.")
  @Valid
 /**
   * Lista de documentos envolvidos na consolidação<br>OBS: uma DU-E/RUC não pode repetir na lista de documentos. Devem ser incluídos ao menos dois documentos na lista.
  **/
  private List<Documento> documentosConsolidacao = new ArrayList<>();
 /**
   * Get tipoDeCarga
   * @return tipoDeCarga
  **/
  @JsonProperty("tipoDeCarga")
  public Integer getTipoDeCarga() {
    return tipoDeCarga;
  }

  public void setTipoDeCarga(Integer tipoDeCarga) {
    this.tipoDeCarga = tipoDeCarga;
  }

  public OperacaoConsolidacao tipoDeCarga(Integer tipoDeCarga) {
    this.tipoDeCarga = tipoDeCarga;
    return this;
  }

 /**
   * Identificação da operação de consolidação&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada consolidação no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
   * @return identificacaoConsolidacao
  **/
  @JsonProperty("identificacaoConsolidacao")
  @NotNull
  public String getIdentificacaoConsolidacao() {
    return identificacaoConsolidacao;
  }

  public void setIdentificacaoConsolidacao(String identificacaoConsolidacao) {
    this.identificacaoConsolidacao = identificacaoConsolidacao;
  }

  public OperacaoConsolidacao identificacaoConsolidacao(String identificacaoConsolidacao) {
    this.identificacaoConsolidacao = identificacaoConsolidacao;
    return this;
  }

 /**
   * Número da RUC Master que identificará esta consolidação&lt;br&gt;Mesmo formato de uma RUC.&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroMRUC
  **/
  @JsonProperty("numeroMRUC")
  public String getNumeroMRUC() {
    return numeroMRUC;
  }

  public void setNumeroMRUC(String numeroMRUC) {
    this.numeroMRUC = numeroMRUC;
  }

  public OperacaoConsolidacao numeroMRUC(String numeroMRUC) {
    this.numeroMRUC = numeroMRUC;
    return this;
  }

 /**
   * CNPJ do responsável pela consolidação&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjConsolidador
  **/
  @JsonProperty("cnpjConsolidador")
  @NotNull
  public String getCnpjConsolidador() {
    return cnpjConsolidador;
  }

  public void setCnpjConsolidador(String cnpjConsolidador) {
    this.cnpjConsolidador = cnpjConsolidador;
  }

  public OperacaoConsolidacao cnpjConsolidador(String cnpjConsolidador) {
    this.cnpjConsolidador = cnpjConsolidador;
    return this;
  }

 /**
   * Get acondicionamento
   * @return acondicionamento
  **/
  @JsonProperty("acondicionamento")
  @NotNull
  public Acondicionamento getAcondicionamento() {
    return acondicionamento;
  }

  public void setAcondicionamento(Acondicionamento acondicionamento) {
    this.acondicionamento = acondicionamento;
  }

  public OperacaoConsolidacao acondicionamento(Acondicionamento acondicionamento) {
    this.acondicionamento = acondicionamento;
    return this;
  }

 /**
   * Lista de documentos envolvidos na consolidação&lt;br&gt;OBS: uma DU-E/RUC não pode repetir na lista de documentos. Devem ser incluídos ao menos dois documentos na lista.
   * @return documentosConsolidacao
  **/
  @JsonProperty("documentosConsolidacao")
  @NotNull
  public List<Documento> getDocumentosConsolidacao() {
    return documentosConsolidacao;
  }

  public void setDocumentosConsolidacao(List<Documento> documentosConsolidacao) {
    this.documentosConsolidacao = documentosConsolidacao;
  }

  public OperacaoConsolidacao documentosConsolidacao(List<Documento> documentosConsolidacao) {
    this.documentosConsolidacao = documentosConsolidacao;
    return this;
  }

  public OperacaoConsolidacao addDocumentosConsolidacaoItem(Documento documentosConsolidacaoItem) {
    this.documentosConsolidacao.add(documentosConsolidacaoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoConsolidacao {\n");
    
    sb.append("    tipoDeCarga: ").append(toIndentedString(tipoDeCarga)).append("\n");
    sb.append("    identificacaoConsolidacao: ").append(toIndentedString(identificacaoConsolidacao)).append("\n");
    sb.append("    numeroMRUC: ").append(toIndentedString(numeroMRUC)).append("\n");
    sb.append("    cnpjConsolidador: ").append(toIndentedString(cnpjConsolidador)).append("\n");
    sb.append("    acondicionamento: ").append(toIndentedString(acondicionamento)).append("\n");
    sb.append("    documentosConsolidacao: ").append(toIndentedString(documentosConsolidacao)).append("\n");
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

