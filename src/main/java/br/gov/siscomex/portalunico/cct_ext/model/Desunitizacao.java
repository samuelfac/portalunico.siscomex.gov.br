package br.gov.siscomex.portalunico.cct_ext.model;

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
 @XmlType(name = "Desunitizacao", propOrder =
    { "identificacaoResponsavelDesunitizacao", "local", "numeroConteiner", "documentos"
})

@XmlRootElement(name="Desunitizacao")
/**
  * Dados das cargas desunitizadas
 **/
@ApiModel(description="Dados das cargas desunitizadas")
public class Desunitizacao  {
  
  @XmlElement(name="identificacaoResponsavelDesunitizacao", required = true)
  @ApiModelProperty(example = "27657485000147", required = true, value = "CNPJ do responsável pela Desunitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
 /**
   * CNPJ do responsável pela Desunitização<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
  **/
  private String identificacaoResponsavelDesunitizacao = null;

  @XmlElement(name="local", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Local local = null;

  @XmlElement(name="numeroConteiner", required = true)
  @ApiModelProperty(example = "CONT0001", required = true, value = "Número do contêiner que será desunitizado<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
 /**
   * Número do contêiner que será desunitizado<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
  **/
  private String numeroConteiner = null;

  @XmlElement(name="documentos")
  @ApiModelProperty(value = "Documentos de carga envolvidos na desunitização")
  @Valid
 /**
   * Documentos de carga envolvidos na desunitização
  **/
  private List<DocumentosUnitizacao> documentos = null;
 /**
   * CNPJ do responsável pela Desunitização&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
   * @return identificacaoResponsavelDesunitizacao
  **/
  @JsonProperty("identificacaoResponsavelDesunitizacao")
  @NotNull
  public String getIdentificacaoResponsavelDesunitizacao() {
    return identificacaoResponsavelDesunitizacao;
  }

  public void setIdentificacaoResponsavelDesunitizacao(String identificacaoResponsavelDesunitizacao) {
    this.identificacaoResponsavelDesunitizacao = identificacaoResponsavelDesunitizacao;
  }

  public Desunitizacao identificacaoResponsavelDesunitizacao(String identificacaoResponsavelDesunitizacao) {
    this.identificacaoResponsavelDesunitizacao = identificacaoResponsavelDesunitizacao;
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

  public Desunitizacao local(Local local) {
    this.local = local;
    return this;
  }

 /**
   * Número do contêiner que será desunitizado&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  @NotNull
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public Desunitizacao numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Documentos de carga envolvidos na desunitização
   * @return documentos
  **/
  @JsonProperty("documentos")
  public List<DocumentosUnitizacao> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentosUnitizacao> documentos) {
    this.documentos = documentos;
  }

  public Desunitizacao documentos(List<DocumentosUnitizacao> documentos) {
    this.documentos = documentos;
    return this;
  }

  public Desunitizacao addDocumentosItem(DocumentosUnitizacao documentosItem) {
    this.documentos.add(documentosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Desunitizacao {\n");
    
    sb.append("    identificacaoResponsavelDesunitizacao: ").append(toIndentedString(identificacaoResponsavelDesunitizacao)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
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

