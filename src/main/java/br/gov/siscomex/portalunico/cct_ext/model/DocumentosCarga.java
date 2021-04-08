package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentosCarga", propOrder =
    { "nivel", "documentos"
})

@XmlRootElement(name="DocumentosCarga")
/**
  * Documentos de carga
 **/
@ApiModel(description="Documentos de carga")
public class DocumentosCarga  {
  
  @XmlElement(name="nivel")
  @ApiModelProperty(value = "")
  private String nivel = null;

  @XmlElement(name="documentos")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoCarga> documentos = null;
 /**
   * Get nivel
   * @return nivel
  **/
  @JsonProperty("nivel")
  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public DocumentosCarga nivel(String nivel) {
    this.nivel = nivel;
    return this;
  }

 /**
   * Get documentos
   * @return documentos
  **/
  @JsonProperty("documentos")
  public List<DocumentoCarga> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentoCarga> documentos) {
    this.documentos = documentos;
  }

  public DocumentosCarga documentos(List<DocumentoCarga> documentos) {
    this.documentos = documentos;
    return this;
  }

  public DocumentosCarga addDocumentosItem(DocumentoCarga documentosItem) {
    this.documentos.add(documentosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentosCarga {\n");
    
    sb.append("    nivel: ").append(toIndentedString(nivel)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
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

