package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RetornoConsultarDocumentoPorDossie", propOrder =
    { "dossie"
})

@XmlRootElement(name="RetornoConsultarDocumentoPorDossie")
/**
  * Retorno da consulta de documentos por dossiê.
 **/
@ApiModel(description="Retorno da consulta de documentos por dossiê.")
public class RetornoConsultarDocumentoPorDossie  {
  
  @XmlElement(name="dossie", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Dossie dossie = null;
 /**
   * Get dossie
   * @return dossie
  **/
  @JsonProperty("dossie")
  @NotNull
  public Dossie getDossie() {
    return dossie;
  }

  public void setDossie(Dossie dossie) {
    this.dossie = dossie;
  }

  public RetornoConsultarDocumentoPorDossie dossie(Dossie dossie) {
    this.dossie = dossie;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsultarDocumentoPorDossie {\n");
    
    sb.append("    dossie: ").append(toIndentedString(dossie)).append("\n");
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

