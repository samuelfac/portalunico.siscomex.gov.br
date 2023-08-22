package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DuimpCover", propOrder =
    { "identificacao", "carga", "documentos"
})

@XmlRootElement(name="DuimpCover")
/**
  * Dados da capa da Duimp.
 **/
@ApiModel(description="Dados da capa da Duimp.")
public class DuimpCover  {
  
  @XmlElement(name="identificacao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private IdentificacaoCapaCover identificacao = null;

  @XmlElement(name="carga", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CargaCover carga = null;

  @XmlElement(name="documentos", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DocumentosCover documentos = null;
 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  @NotNull
  public IdentificacaoCapaCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificacaoCapaCover identificacao) {
    this.identificacao = identificacao;
  }

  public DuimpCover identificacao(IdentificacaoCapaCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get carga
   * @return carga
  **/
  @JsonProperty("carga")
  @NotNull
  public CargaCover getCarga() {
    return carga;
  }

  public void setCarga(CargaCover carga) {
    this.carga = carga;
  }

  public DuimpCover carga(CargaCover carga) {
    this.carga = carga;
    return this;
  }

 /**
   * Get documentos
   * @return documentos
  **/
  @JsonProperty("documentos")
  @NotNull
  public DocumentosCover getDocumentos() {
    return documentos;
  }

  public void setDocumentos(DocumentosCover documentos) {
    this.documentos = documentos;
  }

  public DuimpCover documentos(DocumentosCover documentos) {
    this.documentos = documentos;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    carga: ").append(toIndentedString(carga)).append("\n");
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

