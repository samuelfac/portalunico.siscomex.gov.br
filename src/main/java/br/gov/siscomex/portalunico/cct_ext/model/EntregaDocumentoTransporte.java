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
 @XmlType(name = "EntregaDocumentoTransporte", propOrder =
    { "identificacaoEntrega", "identificacaoPessoaJuridica", "identificacaoPessoaFisica", "local", "documentosTransporte", "transitoSimplificado"
})

@XmlRootElement(name="EntregaDocumentoTransporte")
/**
  * Entrega por Documento de Transporte
 **/
@ApiModel(description="Entrega por Documento de Transporte")
public class EntregaDocumentoTransporte  {
  
  @XmlElement(name="identificacaoEntrega", required = true)
  @ApiModelProperty(example = "ENT001", required = true, value = "Identificação da entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.")
 /**
   * Identificação da entrega<br>Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
  **/
  private String identificacaoEntrega = null;

  @XmlElement(name="identificacaoPessoaJuridica")
  @ApiModelProperty(example = "99999999999999", value = "CNPJ do responsável pela entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela entrega<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoPessoaJuridica = null;

  @XmlElement(name="identificacaoPessoaFisica")
  @ApiModelProperty(example = "99999999999", value = "CPF do responsável pela entrega<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
 /**
   * CPF do responsável pela entrega<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
  **/
  private String identificacaoPessoaFisica = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="documentosTransporte", required = true)
  @ApiModelProperty(required = true, value = "Dados dos documentos de transporte")
  @Valid
 /**
   * Dados dos documentos de transporte
  **/
  private List<DocumentosTransporte> documentosTransporte = new ArrayList<>();

  @XmlElement(name="transitoSimplificado")
  @ApiModelProperty(value = "")
  @Valid
  private TransitoSimplificadoDocumentoTransporte transitoSimplificado = null;
 /**
   * Identificação da entrega&lt;br&gt;Esta informação não será armazenada pelo sistema, servindo apenas como uma identificação de cada entrega no momento da exibição de eventuais mensagens de erro. Este campo não admite duplicatas.
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

  public EntregaDocumentoTransporte identificacaoEntrega(String identificacaoEntrega) {
    this.identificacaoEntrega = identificacaoEntrega;
    return this;
  }

 /**
   * CNPJ do responsável pela entrega&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoPessoaJuridica
  **/
  @JsonProperty("identificacaoPessoaJuridica")
  public String getIdentificacaoPessoaJuridica() {
    return identificacaoPessoaJuridica;
  }

  public void setIdentificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
  }

  public EntregaDocumentoTransporte identificacaoPessoaJuridica(String identificacaoPessoaJuridica) {
    this.identificacaoPessoaJuridica = identificacaoPessoaJuridica;
    return this;
  }

 /**
   * CPF do responsável pela entrega&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
   * @return identificacaoPessoaFisica
  **/
  @JsonProperty("identificacaoPessoaFisica")
  public String getIdentificacaoPessoaFisica() {
    return identificacaoPessoaFisica;
  }

  public void setIdentificacaoPessoaFisica(String identificacaoPessoaFisica) {
    this.identificacaoPessoaFisica = identificacaoPessoaFisica;
  }

  public EntregaDocumentoTransporte identificacaoPessoaFisica(String identificacaoPessoaFisica) {
    this.identificacaoPessoaFisica = identificacaoPessoaFisica;
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

  public EntregaDocumentoTransporte local(Local local) {
    this.local = local;
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

  public EntregaDocumentoTransporte documentosTransporte(List<DocumentosTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
    return this;
  }

  public EntregaDocumentoTransporte addDocumentosTransporteItem(DocumentosTransporte documentosTransporteItem) {
    this.documentosTransporte.add(documentosTransporteItem);
    return this;
  }

 /**
   * Get transitoSimplificado
   * @return transitoSimplificado
  **/
  @JsonProperty("transitoSimplificado")
  public TransitoSimplificadoDocumentoTransporte getTransitoSimplificado() {
    return transitoSimplificado;
  }

  public void setTransitoSimplificado(TransitoSimplificadoDocumentoTransporte transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
  }

  public EntregaDocumentoTransporte transitoSimplificado(TransitoSimplificadoDocumentoTransporte transitoSimplificado) {
    this.transitoSimplificado = transitoSimplificado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregaDocumentoTransporte {\n");
    
    sb.append("    identificacaoEntrega: ").append(toIndentedString(identificacaoEntrega)).append("\n");
    sb.append("    identificacaoPessoaJuridica: ").append(toIndentedString(identificacaoPessoaJuridica)).append("\n");
    sb.append("    identificacaoPessoaFisica: ").append(toIndentedString(identificacaoPessoaFisica)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    documentosTransporte: ").append(toIndentedString(documentosTransporte)).append("\n");
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

