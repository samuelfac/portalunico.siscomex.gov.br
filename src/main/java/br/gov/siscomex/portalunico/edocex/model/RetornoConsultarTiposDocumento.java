package br.gov.siscomex.portalunico.edocex.model;

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
 @XmlType(name = "RetornoConsultarTiposDocumento", propOrder =
    { "orgaosAnuentes", "tiposDocumento", "tiposDossie"
})

@XmlRootElement(name="RetornoConsultarTiposDocumento")
/**
  * Retorno da consulta de tipos de documentos e de órgãos anuentes.
 **/
@ApiModel(description="Retorno da consulta de tipos de documentos e de órgãos anuentes.")
public class RetornoConsultarTiposDocumento  {
  
  @XmlElement(name="orgaosAnuentes")
  @ApiModelProperty(value = "Órgãos anuentes.")
  @Valid
 /**
   * Órgãos anuentes.
  **/
  private List<OrgaoAnuente> orgaosAnuentes = null;

  @XmlElement(name="tiposDocumento")
  @ApiModelProperty(value = "Tipos de documentos.")
  @Valid
 /**
   * Tipos de documentos.
  **/
  private List<TipoDocumento> tiposDocumento = null;

  @XmlElement(name="tiposDossie")
  @ApiModelProperty(value = "Tipos de dossiê.")
  @Valid
 /**
   * Tipos de dossiê.
  **/
  private List<TipoDossie> tiposDossie = null;
 /**
   * Órgãos anuentes.
   * @return orgaosAnuentes
  **/
  @JsonProperty("orgaosAnuentes")
  public List<OrgaoAnuente> getOrgaosAnuentes() {
    return orgaosAnuentes;
  }

  public void setOrgaosAnuentes(List<OrgaoAnuente> orgaosAnuentes) {
    this.orgaosAnuentes = orgaosAnuentes;
  }

  public RetornoConsultarTiposDocumento orgaosAnuentes(List<OrgaoAnuente> orgaosAnuentes) {
    this.orgaosAnuentes = orgaosAnuentes;
    return this;
  }

  public RetornoConsultarTiposDocumento addOrgaosAnuentesItem(OrgaoAnuente orgaosAnuentesItem) {
    this.orgaosAnuentes.add(orgaosAnuentesItem);
    return this;
  }

 /**
   * Tipos de documentos.
   * @return tiposDocumento
  **/
  @JsonProperty("tiposDocumento")
  public List<TipoDocumento> getTiposDocumento() {
    return tiposDocumento;
  }

  public void setTiposDocumento(List<TipoDocumento> tiposDocumento) {
    this.tiposDocumento = tiposDocumento;
  }

  public RetornoConsultarTiposDocumento tiposDocumento(List<TipoDocumento> tiposDocumento) {
    this.tiposDocumento = tiposDocumento;
    return this;
  }

  public RetornoConsultarTiposDocumento addTiposDocumentoItem(TipoDocumento tiposDocumentoItem) {
    this.tiposDocumento.add(tiposDocumentoItem);
    return this;
  }

 /**
   * Tipos de dossiê.
   * @return tiposDossie
  **/
  @JsonProperty("tiposDossie")
  public List<TipoDossie> getTiposDossie() {
    return tiposDossie;
  }

  public void setTiposDossie(List<TipoDossie> tiposDossie) {
    this.tiposDossie = tiposDossie;
  }

  public RetornoConsultarTiposDocumento tiposDossie(List<TipoDossie> tiposDossie) {
    this.tiposDossie = tiposDossie;
    return this;
  }

  public RetornoConsultarTiposDocumento addTiposDossieItem(TipoDossie tiposDossieItem) {
    this.tiposDossie.add(tiposDossieItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultarTiposDocumento {\n");
    
    sb.append("    orgaosAnuentes: ").append(toIndentedString(orgaosAnuentes)).append("\n");
    sb.append("    tiposDocumento: ").append(toIndentedString(tiposDocumento)).append("\n");
    sb.append("    tiposDossie: ").append(toIndentedString(tiposDossie)).append("\n");
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

