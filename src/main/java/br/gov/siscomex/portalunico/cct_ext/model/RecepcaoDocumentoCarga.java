package br.gov.siscomex.portalunico.cct_ext.model;

import java.math.BigDecimal;

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
 @XmlType(name = "RecepcaoDocumentoCarga", propOrder =
    { "identificacaoRecepcao", "cnpjResp", "local", "referenciaLocalRecepcao", "entregador", "documentos", "pesoAferido", "motivoNaoPesagem", "localArmazenamento", "codigoIdentCarga", "avariasIdentificadas", "divergenciasIdentificadas", "observacoesGerais", "transitoSimplificado"
})

@XmlRootElement(name="RecepcaoDocumentoCarga")
/**
  * Recepção por Documento de Carga 
 **/
@ApiModel(description="Recepção por Documento de Carga ")
public class RecepcaoDocumentoCarga  {
  
  @XmlElement(name="identificacaoRecepcao", required = true)
  @ApiModelProperty(example = "REC001", required = true, value = "Identificação da Recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da Recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoRecepcao = null;

  @XmlElement(name="cnpjResp", required = true)
  @ApiModelProperty(example = "07396865000168", required = true, value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResp = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="referenciaLocalRecepcao")
  @ApiModelProperty(example = "Referência do local de recepção", value = "Referência do local de recepção<br>Tamanho: 150")
 /**
   * Referência do local de recepção<br>Tamanho: 150
  **/
  private String referenciaLocalRecepcao = null;

  @XmlElement(name="entregador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Entregador entregador = null;

  @XmlElement(name="documentos", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Documentos documentos = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(value = "Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório")
  @Valid
 /**
   * Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "Motivo da não realização da pesagem", value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.")
 /**
   * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
  **/
  private String motivoNaoPesagem = null;

  @XmlElement(name="localArmazenamento")
  @ApiModelProperty(value = "Local de armazenamento da carga<br>Tamanho: 150")
 /**
   * Local de armazenamento da carga<br>Tamanho: 150
  **/
  private String localArmazenamento = null;

  @XmlElement(name="codigoIdentCarga")
  @ApiModelProperty(example = "id1235468", value = "Código de identificação da carga")
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
  @ApiModelProperty(example = "Observações gerais", value = "Observações gerais<br>Tamanho: 250")
 /**
   * Observações gerais<br>Tamanho: 250
  **/
  private String observacoesGerais = null;

  @XmlElement(name="transitoSimplificado")
  @ApiModelProperty(value = "")
  @Valid
  private TransitoSimplificado transitoSimplificado = null;
 /**
   * Identificação da Recepção&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
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

  public RecepcaoDocumentoCarga identificacaoRecepcao(String identificacaoRecepcao) {
    this.identificacaoRecepcao = identificacaoRecepcao;
    return this;
  }

 /**
   * CNPJ do responsável pela recepção&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return cnpjResp
  **/
  @JsonProperty("cnpjResp")
  @NotNull
  public String getCnpjResp() {
    return cnpjResp;
  }

  public void setCnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
  }

  public RecepcaoDocumentoCarga cnpjResp(String cnpjResp) {
    this.cnpjResp = cnpjResp;
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

  public RecepcaoDocumentoCarga local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Referência do local de recepção&lt;br&gt;Tamanho: 150
   * @return referenciaLocalRecepcao
  **/
  @JsonProperty("referenciaLocalRecepcao")
  public String getReferenciaLocalRecepcao() {
    return referenciaLocalRecepcao;
  }

  public void setReferenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
  }

  public RecepcaoDocumentoCarga referenciaLocalRecepcao(String referenciaLocalRecepcao) {
    this.referenciaLocalRecepcao = referenciaLocalRecepcao;
    return this;
  }

 /**
   * Get entregador
   * @return entregador
  **/
  @JsonProperty("entregador")
  @NotNull
  public Entregador getEntregador() {
    return entregador;
  }

  public void setEntregador(Entregador entregador) {
    this.entregador = entregador;
  }

  public RecepcaoDocumentoCarga entregador(Entregador entregador) {
    this.entregador = entregador;
    return this;
  }

 /**
   * Get documentos
   * @return documentos
  **/
  @JsonProperty("documentos")
  @NotNull
  public Documentos getDocumentos() {
    return documentos;
  }

  public void setDocumentos(Documentos documentos) {
    this.documentos = documentos;
  }

  public RecepcaoDocumentoCarga documentos(Documentos documentos) {
    this.documentos = documentos;
    return this;
  }

 /**
   * Peso aferido na balança do recinto em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN&lt;br&gt;Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public RecepcaoDocumentoCarga pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório.
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public RecepcaoDocumentoCarga motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
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

  public RecepcaoDocumentoCarga localArmazenamento(String localArmazenamento) {
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

  public RecepcaoDocumentoCarga codigoIdentCarga(String codigoIdentCarga) {
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

  public RecepcaoDocumentoCarga avariasIdentificadas(String avariasIdentificadas) {
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

  public RecepcaoDocumentoCarga divergenciasIdentificadas(String divergenciasIdentificadas) {
    this.divergenciasIdentificadas = divergenciasIdentificadas;
    return this;
  }

 /**
   * Observações gerais&lt;br&gt;Tamanho: 250
   * @return observacoesGerais
  **/
  @JsonProperty("observacoesGerais")
  public String getObservacoesGerais() {
    return observacoesGerais;
  }

  public void setObservacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
  }

  public RecepcaoDocumentoCarga observacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
    return this;
  }

 /**
   * Get transitoSimplificado
   * @return transitoSimplificado
  **/
  @JsonProperty("transitoSimplificado")
  public TransitoSimplificado getTransitoSimplificado() {
    return transitoSimplificado;
  }

  public void setTransitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
  }

  public RecepcaoDocumentoCarga transitoSimplificado(TransitoSimplificado transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcaoDocumentoCarga {\n");
    
    sb.append("    identificacaoRecepcao: ").append(toIndentedString(identificacaoRecepcao)).append("\n");
    sb.append("    cnpjResp: ").append(toIndentedString(cnpjResp)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    referenciaLocalRecepcao: ").append(toIndentedString(referenciaLocalRecepcao)).append("\n");
    sb.append("    entregador: ").append(toIndentedString(entregador)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
    sb.append("    localArmazenamento: ").append(toIndentedString(localArmazenamento)).append("\n");
    sb.append("    codigoIdentCarga: ").append(toIndentedString(codigoIdentCarga)).append("\n");
    sb.append("    avariasIdentificadas: ").append(toIndentedString(avariasIdentificadas)).append("\n");
    sb.append("    divergenciasIdentificadas: ").append(toIndentedString(divergenciasIdentificadas)).append("\n");
    sb.append("    observacoesGerais: ").append(toIndentedString(observacoesGerais)).append("\n");
    sb.append("    transitoSimplificado: ").append(toIndentedString(transitoSimplificado)).append("\n");
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

