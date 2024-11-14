package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ListaDocumentosTransporte", propOrder =
    { "documentosTransporte", "mensagens"
})

@XmlRootElement(name="ListaDocumentosTransporte")
/**
  * Lista com resultado da consulta de documentos de transporte
 **/
@ApiModel(description="Lista com resultado da consulta de documentos de transporte")
public class ListaDocumentosTransporte  {
  
  @XmlElement(name="documentosTransporte")
  @ApiModelProperty(value = "Lista de Documentos de Transporte")
  @Valid
 /**
   * Lista de Documentos de Transporte
  **/
  private List<DocumentoTransporte> documentosTransporte = null;

  @XmlElement(name="mensagens")
  @ApiModelProperty(value = "Lista de mensagens")
  @Valid
 /**
   * Lista de mensagens
  **/
  private List<Mensagem> mensagens = null;
 /**
   * Lista de Documentos de Transporte
   * @return documentosTransporte
  **/
  @JsonProperty("documentosTransporte")
  public List<DocumentoTransporte> getDocumentosTransporte() {
    return documentosTransporte;
  }

  public void setDocumentosTransporte(List<DocumentoTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
  }

  public ListaDocumentosTransporte documentosTransporte(List<DocumentoTransporte> documentosTransporte) {
    this.documentosTransporte = documentosTransporte;
    return this;
  }

  public ListaDocumentosTransporte addDocumentosTransporteItem(DocumentoTransporte documentosTransporteItem) {
    this.documentosTransporte.add(documentosTransporteItem);
    return this;
  }

 /**
   * Lista de mensagens
   * @return mensagens
  **/
  @JsonProperty("mensagens")
  public List<Mensagem> getMensagens() {
    return mensagens;
  }

  public void setMensagens(List<Mensagem> mensagens) {
    this.mensagens = mensagens;
  }

  public ListaDocumentosTransporte mensagens(List<Mensagem> mensagens) {
    this.mensagens = mensagens;
    return this;
  }

  public ListaDocumentosTransporte addMensagensItem(Mensagem mensagensItem) {
    this.mensagens.add(mensagensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDocumentosTransporte {\n");
    
    sb.append("    documentosTransporte: ").append(toIndentedString(documentosTransporte)).append("\n");
    sb.append("    mensagens: ").append(toIndentedString(mensagens)).append("\n");
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

