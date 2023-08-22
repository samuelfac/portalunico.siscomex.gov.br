package br.gov.siscomex.portalunico.edocex.model;

import br.gov.siscomex.portalunico.edocex.model.OrgaoAnuente;
import br.gov.siscomex.portalunico.edocex.model.TipoDocumento;
import br.gov.siscomex.portalunico.edocex.model.TipoDossie;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "RetornoConsultarTiposDocumento", propOrder =
    { "orgaosAnuentes", "tiposDocumento", "tiposDossie"
})

@XmlRootElement(name="RetornoConsultarTiposDocumento")
/**
  * Retorno da consulta de tipos de documentos e de órgãos anuentes.
 **/
@ApiModel(description="Retorno da consulta de tipos de documentos e de órgãos anuentes.")
public class RetornoConsultarTiposDocumento  {
  
  @XmlElement(name="orgaosAnuentes", required = true)
  @ApiModelProperty(required = true, value = "Órgãos anuentes.")
  @Valid
 /**
   * Órgãos anuentes.
  **/
  private List<OrgaoAnuente> orgaosAnuentes = new ArrayList<>();

  @XmlElement(name="tiposDocumento", required = true)
  @ApiModelProperty(required = true, value = "Tipos de documentos.")
  @Valid
 /**
   * Tipos de documentos.
  **/
  private List<TipoDocumento> tiposDocumento = new ArrayList<>();

  @XmlElement(name="tiposDossie")
  @ApiModelProperty(value = "Tipos de dossiê.<br/><br/>Somente será retornado na consulta por tipo de operação quando, na operação solicitada, existir mais de um tipo de dossiê possível de ser utilizado. As operações que permitem mais de um tipo de dossiê são: DI, LI, RE e DT.")
  @Valid
 /**
   * Tipos de dossiê.<br/><br/>Somente será retornado na consulta por tipo de operação quando, na operação solicitada, existir mais de um tipo de dossiê possível de ser utilizado. As operações que permitem mais de um tipo de dossiê são: DI, LI, RE e DT.
  **/
  private List<TipoDossie> tiposDossie = null;
 /**
   * Órgãos anuentes.
   * @return orgaosAnuentes
  **/
  @JsonProperty("orgaosAnuentes")
  @NotNull
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
  @NotNull
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
   * Tipos de dossiê.&lt;br/&gt;&lt;br/&gt;Somente será retornado na consulta por tipo de operação quando, na operação solicitada, existir mais de um tipo de dossiê possível de ser utilizado. As operações que permitem mais de um tipo de dossiê são: DI, LI, RE e DT.
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

