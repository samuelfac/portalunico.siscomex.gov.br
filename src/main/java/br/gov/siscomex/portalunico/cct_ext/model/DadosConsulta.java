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
 @XmlType(name = "DadosConsulta", propOrder =
    { "numeroMRUC", "documentosCarga", "permiteMovimentacao"
})

@XmlRootElement(name="DadosConsulta")
/**
  * Dados da consulta
 **/
@ApiModel(description="Dados da consulta")
public class DadosConsulta  {
  
  @XmlElement(name="numeroMRUC")
  @ApiModelProperty(example = "7BR276574896791206600205675746307", value = "Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
 /**
   * Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
  **/
  private String numeroMRUC = null;

  @XmlElement(name="documentosCarga")
  @ApiModelProperty(value = "")
  @Valid
  private List<Documentos> documentosCarga = null;

  @XmlElement(name="permiteMovimentacao")
  @ApiModelProperty(example = "false", value = "")
  private Boolean permiteMovimentacao = false;
 /**
   * Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
   * @return numeroMRUC
  **/
  @JsonProperty("numeroMRUC")
  public String getNumeroMRUC() {
    return numeroMRUC;
  }

  public void setNumeroMRUC(String numeroMRUC) {
    this.numeroMRUC = numeroMRUC;
  }

  public DadosConsulta numeroMRUC(String numeroMRUC) {
    this.numeroMRUC = numeroMRUC;
    return this;
  }

 /**
   * Get documentosCarga
   * @return documentosCarga
  **/
  @JsonProperty("documentosCarga")
  public List<Documentos> getDocumentosCarga() {
    return documentosCarga;
  }

  public void setDocumentosCarga(List<Documentos> documentosCarga) {
    this.documentosCarga = documentosCarga;
  }

  public DadosConsulta documentosCarga(List<Documentos> documentosCarga) {
    this.documentosCarga = documentosCarga;
    return this;
  }

  public DadosConsulta addDocumentosCargaItem(Documentos documentosCargaItem) {
    this.documentosCarga.add(documentosCargaItem);
    return this;
  }

 /**
   * Get permiteMovimentacao
   * @return permiteMovimentacao
  **/
  @JsonProperty("permiteMovimentacao")
  public Boolean isPermiteMovimentacao() {
    return permiteMovimentacao;
  }

  public void setPermiteMovimentacao(Boolean permiteMovimentacao) {
    this.permiteMovimentacao = permiteMovimentacao;
  }

  public DadosConsulta permiteMovimentacao(Boolean permiteMovimentacao) {
    this.permiteMovimentacao = permiteMovimentacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosConsulta {\n");
    
    sb.append("    numeroMRUC: ").append(toIndentedString(numeroMRUC)).append("\n");
    sb.append("    documentosCarga: ").append(toIndentedString(documentosCarga)).append("\n");
    sb.append("    permiteMovimentacao: ").append(toIndentedString(permiteMovimentacao)).append("\n");
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

