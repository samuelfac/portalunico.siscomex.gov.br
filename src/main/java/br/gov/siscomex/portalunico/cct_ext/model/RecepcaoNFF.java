package br.gov.siscomex.portalunico.cct_ext.model;

import br.gov.siscomex.portalunico.cct_ext.model.Local;
import br.gov.siscomex.portalunico.cct_ext.model.NotasFiscais;
import br.gov.siscomex.portalunico.cct_ext.model.Transportador;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RecepcaoNFF", propOrder =
    { "identificacaoRecepcao", "cnpjResp", "local", "refLocalRecepcao", "notasFiscais", "transportador", "pesoAferido", "motivoNaoPesagem", "localArmazenamento", "codigoIdentCarga", "avariasIdentificadas", "divergenciasIdentificadas", "observacoesGerais"
})

@XmlRootElement(name="RecepcaoNFF")
/**
  * Recepção de Nota Fiscal Formulário
 **/
@ApiModel(description="Recepção de Nota Fiscal Formulário")
public class RecepcaoNFF  {
  
  @XmlElement(name="identificacaoRecepcao", required = true)
  @ApiModelProperty(example = "REC0001", required = true, value = "Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da recepção<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada recepção no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoRecepcao = null;

  @XmlElement(name="cnpjResp", required = true)
  @ApiModelProperty(example = "99999999999999", required = true, value = "CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela recepção<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String cnpjResp = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="refLocalRecepcao")
  @ApiModelProperty(example = "Informação de referência do local da recepção", value = "Informação de referência do local da recepção")
 /**
   * Informação de referência do local da recepção
  **/
  private String refLocalRecepcao = null;

  @XmlElement(name="notasFiscais", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NotasFiscais notasFiscais = null;

  @XmlElement(name="transportador", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Transportador transportador = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(example = "99999.999", value = "Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.")
  @Valid
 /**
   * Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN<br>Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "Motivo da não realização da pesagem", value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório")
 /**
   * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório
  **/
  private String motivoNaoPesagem = null;

  @XmlElement(name="localArmazenamento")
  @ApiModelProperty(example = "Local de armazenamento da carga", value = "Local de armazenamento da carga<br>Tamanho: 150")
 /**
   * Local de armazenamento da carga<br>Tamanho: 150
  **/
  private String localArmazenamento = null;

  @XmlElement(name="codigoIdentCarga")
  @ApiModelProperty(example = "id1234568", value = "Código de identificação da carga")
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

  public RecepcaoNFF identificacaoRecepcao(String identificacaoRecepcao) {
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

  public RecepcaoNFF cnpjResp(String cnpjResp) {
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

  public RecepcaoNFF local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Informação de referência do local da recepção
   * @return refLocalRecepcao
  **/
  @JsonProperty("refLocalRecepcao")
  public String getRefLocalRecepcao() {
    return refLocalRecepcao;
  }

  public void setRefLocalRecepcao(String refLocalRecepcao) {
    this.refLocalRecepcao = refLocalRecepcao;
  }

  public RecepcaoNFF refLocalRecepcao(String refLocalRecepcao) {
    this.refLocalRecepcao = refLocalRecepcao;
    return this;
  }

 /**
   * Get notasFiscais
   * @return notasFiscais
  **/
  @JsonProperty("notasFiscais")
  @NotNull
  public NotasFiscais getNotasFiscais() {
    return notasFiscais;
  }

  public void setNotasFiscais(NotasFiscais notasFiscais) {
    this.notasFiscais = notasFiscais;
  }

  public RecepcaoNFF notasFiscais(NotasFiscais notasFiscais) {
    this.notasFiscais = notasFiscais;
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

  public RecepcaoNFF transportador(Transportador transportador) {
    this.transportador = transportador;
    return this;
  }

 /**
   * Peso aferido na balança do recinto em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN&lt;br&gt;Deve ser informado somente quando há informação de pesagem. Neste caso, é obrigatório.
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public RecepcaoNFF pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem. Neste caso, é obrigatório
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public RecepcaoNFF motivoNaoPesagem(String motivoNaoPesagem) {
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

  public RecepcaoNFF localArmazenamento(String localArmazenamento) {
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

  public RecepcaoNFF codigoIdentCarga(String codigoIdentCarga) {
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

  public RecepcaoNFF avariasIdentificadas(String avariasIdentificadas) {
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

  public RecepcaoNFF divergenciasIdentificadas(String divergenciasIdentificadas) {
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

  public RecepcaoNFF observacoesGerais(String observacoesGerais) {
    this.observacoesGerais = observacoesGerais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecepcaoNFF {\n");
    
    sb.append("    identificacaoRecepcao: ").append(toIndentedString(identificacaoRecepcao)).append("\n");
    sb.append("    cnpjResp: ").append(toIndentedString(cnpjResp)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    refLocalRecepcao: ").append(toIndentedString(refLocalRecepcao)).append("\n");
    sb.append("    notasFiscais: ").append(toIndentedString(notasFiscais)).append("\n");
    sb.append("    transportador: ").append(toIndentedString(transportador)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
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

