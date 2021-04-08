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
 @XmlType(name = "RecepcaoDocumentoTransporte", propOrder =
    { "identificacaoRecepcao", "cnpjResp", "cpfResp", "local", "referenciaLocalRecepcao", "documentosTransporte", "transportador", "localArmazenamento", "codigoIdentCarga", "avariasIdentificadas", "divergenciasIdentificadas", "observacoesGerais"
})

@XmlRootElement(name="RecepcaoDocumentoTransporte")
/**
  * Recepção por Documento de Transporte
 **/
@ApiModel(description="Recepção por Documento de Transporte")
public class RecepcaoDocumentoTransporte  {
  
  @XmlElement(name="identificacaoRecepcao", required = true)
  @ApiModelProperty(example = "REC001", required = true, value = "Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoRecepcao = null;

  @XmlElement(name="cnpjResp")
  @ApiModelProperty(example = "99999999999999", value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResp = null;

  @XmlElement(name="cpfResp")
  @ApiModelProperty(example = "99999999999", value = "CNPJ do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
 /**
   * CNPJ do responsável pela recepção<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
  **/
  private String cpfResp = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="referenciaLocalRecepcao")
  @ApiModelProperty(example = "Referência do Local de recepção", value = "Referência do Local de recepção")
 /**
   * Referência do Local de recepção
  **/
  private String referenciaLocalRecepcao = null;

  @XmlElement(name="documentosTransporte", required = true)
  @ApiModelProperty(required = true, value = "Dados dos documentos de transporte")
  @Valid
 /**
   * Dados dos documentos de transporte
  **/
  private List<DocumentosTransporte> documentosTransporte = new ArrayList<>();

  @XmlElement(name="transportador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Transportador transportador = null;

  @XmlElement(name="localArmazenamento")
  @ApiModelProperty(example = "Local de armazenamento da carga", value = "Local de armazenamento da carga<br>Tamanho: 150")
 /**
   * Local de armazenamento da carga<br>Tamanho: 150
  **/
  private String localArmazenamento = null;

  @XmlElement(name="codigoIdentCarga")
  @ApiModelProperty(example = "id123456", value = "Código de identificação da carga")
 /**
   * Código de identificação da carga
  **/
  private String codigoIdentCarga = null;

  @XmlElement(name="avariasIdentificadas")
  @ApiModelProperty(example = "Avarias identificadas", value = "Avarias identificadas<br>Tamanho: 250")
 /**
   * Avarias identificadas<br>Tamanho: 250
  **/
  private String avariasIdentificadas = null;

  @XmlElement(name="divergenciasIdentificadas")
  @ApiModelProperty(example = "Divergências identificadas", value = "Divergências identificadas<br>Tamanho: 250")
 /**
   * Divergências identificadas<br>Tamanho: 250
  **/
  private String divergenciasIdentificadas = null;

  @XmlElement(name="observacoesGerais")
  @ApiModelProperty(example = "Observações adicionais", value = "Observações adicionais<br>Tamanho: 250")
 /**
   * Observações adicionais<br>Tamanho: 250
  **/
  private String observacoesGerais = null;
 /**
   * Identificação da recepção&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
   * @return identificacaoRecepcao
  **/
  @JsonProperty("identificacaoRecepcao")
  @NotNull
  public String getIdentificacaoRecepcao() {
    return identificacaoRecepcao;
  }

  public void setIdentificacaoRecepcao(String identificacaoRecepcao) {
    this.identificacaoRecepcao = identificacaoRecepcao;
  }

  public RecepcaoDocumentoTransporte identificacaoRecepcao(String identificacaoRecepcao) {
    this.identificacaoRecepcao = identificacaoRecepcao;
    return this;
  }

 /**
   * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResp
  **/
  @JsonProperty("cnpjResp")
  public String getCnpjResp() {
    return cnpjResp;
  }

  public void setCnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
  }

  public RecepcaoDocumentoTransporte cnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
    return this;
  }

 /**
   * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
   * @return cpfResp
  **/
  @JsonProperty("cpfResp")
  public String getCpfResp() {
    return cpfResp;
  }

  public void setCpfResp(String cpfResp) {
    this.cpfResp = cpfResp;
  }

  public RecepcaoDocumentoTransporte cpfResp(String cpfResp) {
    this.cpfResp = cpfResp;
    return this;
  }

 /**
   * Get local
   * @return local
  **/
  @JsonProperty("local")
  @NotNull
  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public RecepcaoDocumentoTransporte local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Referência do Local de recepção
   * @return referenciaLocalRecepcao
  **/
  @JsonProperty("referenciaLocalRecepcao")
  public String getReferenciaLocalRecepcao() {
    return referenciaLocalRecepcao;
  }

  public void setReferenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
  }

  public RecepcaoDocumentoTransporte referenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
    return this;
  }

 /**
   * Dados dos documentos de transporte
   * @return documentosTransporte
  **/
  @JsonProperty("documentosTransporte")
  @NotNull
  public List<DocumentosTransporte> getDocumentosTransporte() {
    return documentosTransporte;
  }

  public void setDocumentosTransporte(List<DocumentosTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
  }

  public RecepcaoDocumentoTransporte documentosTransporte(List<DocumentosTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
    return this;
  }

  public RecepcaoDocumentoTransporte addDocumentosTransporteItem(DocumentosTransporte documentosTransporteItem) {
    this.documentosTransporte.add(documentosTransporteItem);
    return this;
  }

 /**
   * Get transportador
   * @return transportador
  **/
  @JsonProperty("transportador")
  @NotNull
  public Transportador getTransportador() {
    return transportador;
  }

  public void setTransportador(Transportador transportador) {
    this.transportador = transportador;
  }

  public RecepcaoDocumentoTransporte transportador(Transportador transportador) {
    this.transportador = transportador;
    return this;
  }

 /**
   * Local de armazenamento da carga&lt;br&gt;Tamanho: 150
   * @return localArmazenamento
  **/
  @JsonProperty("localArmazenamento")
  public String getLocalArmazenamento() {
    return localArmazenamento;
  }

  public void setLocalArmazenamento(String localArmazenamento) {
    this.localArmazenamento = localArmazenamento;
  }

  public RecepcaoDocumentoTransporte localArmazenamento(String localArmazenamento) {
    this.localArmazenamento = localArmazenamento;
    return this;
  }

 /**
   * Código de identificação da carga
   * @return codigoIdentCarga
  **/
  @JsonProperty("codigoIdentCarga")
  public String getCodigoIdentCarga() {
    return codigoIdentCarga;
  }

  public void setCodigoIdentCarga(String codigoIdentCarga) {
    this.codigoIdentCarga = codigoIdentCarga;
  }

  public RecepcaoDocumentoTransporte codigoIdentCarga(String codigoIdentCarga) {
    this.codigoIdentCarga = codigoIdentCarga;
    return this;
  }

 /**
   * Avarias identificadas&lt;br&gt;Tamanho: 250
   * @return avariasIdentificadas
  **/
  @JsonProperty("avariasIdentificadas")
  public String getAvariasIdentificadas() {
    return avariasIdentificadas;
  }

  public void setAvariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
  }

  public RecepcaoDocumentoTransporte avariasIdentificadas(String avariasIdentificadas) {
    this.avariasIdentificadas = avariasIdentificadas;
    return this;
  }

 /**
   * Divergências identificadas&lt;br&gt;Tamanho: 250
   * @return divergenciasIdentificadas
  **/
  @JsonProperty("divergenciasIdentificadas")
  public String getDivergenciasIdentificadas() {
    return divergenciasIdentificadas;
  }

  public void setDivergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
  }

  public RecepcaoDocumentoTransporte divergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
    return this;
  }

 /**
   * Observações adicionais&lt;br&gt;Tamanho: 250
   * @return observacoesGerais
  **/
  @JsonProperty("observacoesGerais")
  public String getObservacoesGerais() {
    return observacoesGerais;
  }

  public void setObservacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
  }

  public RecepcaoDocumentoTransporte observacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcaoDocumentoTransporte {\n");
    
    sb.append("    identificacaoRecepcao: ").append(toIndentedString(identificacaoRecepcao)).append("\n");
    sb.append("    cnpjResp: ").append(toIndentedString(cnpjResp)).append("\n");
    sb.append("    cpfResp: ").append(toIndentedString(cpfResp)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    referenciaLocalRecepcao: ").append(toIndentedString(referenciaLocalRecepcao)).append("\n");
    sb.append("    documentosTransporte: ").append(toIndentedString(documentosTransporte)).append("\n");
    sb.append("    transportador: ").append(toIndentedString(transportador)).append("\n");
    sb.append("    localArmazenamento: ").append(toIndentedString(localArmazenamento)).append("\n");
    sb.append("    codigoIdentCarga: ").append(toIndentedString(codigoIdentCarga)).append("\n");
    sb.append("    avariasIdentificadas: ").append(toIndentedString(avariasIdentificadas)).append("\n");
    sb.append("    divergenciasIdentificadas: ").append(toIndentedString(divergenciasIdentificadas)).append("\n");
    sb.append("    observacoesGerais: ").append(toIndentedString(observacoesGerais)).append("\n");
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

