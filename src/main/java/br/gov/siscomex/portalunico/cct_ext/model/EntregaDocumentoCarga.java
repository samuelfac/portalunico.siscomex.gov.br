package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "EntregaDocumentoCarga", propOrder =
    { "identificacaoEntrega", "identificacaoPessoaJuridica", "local", "documentos", "recebedor", "pesoAferido", "motivoNaoPesagem"
})

@XmlRootElement(name="EntregaDocumentoCarga")
/**
  * Entrega por Documento de Carga
 **/
@ApiModel(description="Entrega por Documento de Carga")
public class EntregaDocumentoCarga  {
  
  @XmlElement(name="identificacaoEntrega", required = true)
  @ApiModelProperty(example = "ENT001", required = true, value = "Identificação da Entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da Entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoEntrega = null;

  @XmlElement(name="identificacaoPessoaJuridica", required = true)
  @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do responsável pela Entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela Entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoPessoaJuridica = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="documentos", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Documentos documentos = null;

  @XmlElement(name="recebedor")
  @ApiModelProperty(value = "")
  @Valid
  private Recebedor recebedor = null;

  @XmlElement(name="pesoAferido")
  @ApiModelProperty(example = "10.0", value = "Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto<br>Deve ser informado somente quando há informação de pesagem.")
  @Valid
 /**
   * Peso aferido na balança do recinto em Kg<br>Tamanho: 12.3<br>Formato: Decimal, com três casas decimais separadas por ponto<br>Deve ser informado somente quando há informação de pesagem.
  **/
  private BigDecimal pesoAferido = null;

  @XmlElement(name="motivoNaoPesagem")
  @ApiModelProperty(example = "balança quebrada", value = "Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. ")
 /**
   * Motivo da não realização da pesagem<br>Tamanho: 250<br>Deve ser informado somente quando não há informação de pesagem. 
  **/
  private String motivoNaoPesagem = null;
 /**
   * Identificação da Entrega&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
   * @return identificacaoEntrega
  **/
  @JsonProperty("identificacaoEntrega")
  @NotNull
  public String getIdentificacaoEntrega() {
    return identificacaoEntrega;
  }

  public void setIdentificacaoEntrega(String identificacaoEntrega) {
    this.identificacaoEntrega = identificacaoEntrega;
  }

  public EntregaDocumentoCarga identificacaoEntrega(String identificacaoEntrega) {
    this.identificacaoEntrega = identificacaoEntrega;
    return this;
  }

 /**
   * CNPJ do responsável pela Entrega&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoPessoaJuridica
  **/
  @JsonProperty("identificacaoPessoaJuridica")
  @NotNull
  public String getIdentificacaoPessoaJuridica() {
    return identificacaoPessoaJuridica;
  }

  public void setIdentificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
  }

  public EntregaDocumentoCarga identificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
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

  public EntregaDocumentoCarga local(Local local) {
    this.local = local;
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

  public EntregaDocumentoCarga documentos(Documentos documentos) {
    this.documentos = documentos;
    return this;
  }

 /**
   * Get recebedor
   * @return recebedor
  **/
  @JsonProperty("recebedor")
  public Recebedor getRecebedor() {
    return recebedor;
  }

  public void setRecebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
  }

  public EntregaDocumentoCarga recebedor(Recebedor recebedor) {
    this.recebedor = recebedor;
    return this;
  }

 /**
   * Peso aferido na balança do recinto em Kg&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: Decimal, com três casas decimais separadas por ponto&lt;br&gt;Deve ser informado somente quando há informação de pesagem.
   * @return pesoAferido
  **/
  @JsonProperty("pesoAferido")
  public BigDecimal getPesoAferido() {
    return pesoAferido;
  }

  public void setPesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
  }

  public EntregaDocumentoCarga pesoAferido(BigDecimal pesoAferido) {
    this.pesoAferido = pesoAferido;
    return this;
  }

 /**
   * Motivo da não realização da pesagem&lt;br&gt;Tamanho: 250&lt;br&gt;Deve ser informado somente quando não há informação de pesagem. 
   * @return motivoNaoPesagem
  **/
  @JsonProperty("motivoNaoPesagem")
  public String getMotivoNaoPesagem() {
    return motivoNaoPesagem;
  }

  public void setMotivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
  }

  public EntregaDocumentoCarga motivoNaoPesagem(String motivoNaoPesagem) {
    this.motivoNaoPesagem = motivoNaoPesagem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregaDocumentoCarga {\n");
    
    sb.append("    identificacaoEntrega: ").append(toIndentedString(identificacaoEntrega)).append("\n");
    sb.append("    identificacaoPessoaJuridica: ").append(toIndentedString(identificacaoPessoaJuridica)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    recebedor: ").append(toIndentedString(recebedor)).append("\n");
    sb.append("    pesoAferido: ").append(toIndentedString(pesoAferido)).append("\n");
    sb.append("    motivoNaoPesagem: ").append(toIndentedString(motivoNaoPesagem)).append("\n");
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

