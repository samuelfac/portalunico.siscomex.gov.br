package br.gov.siscomex.portalunico.cct_ext.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "InfoCargaTransitoDTO", propOrder =
    { "cargas", "conteiners", "documentosTransporteNacional", "conhecimentos", "documentosTransporteInternacional", "viaDeTransporte"
})

@XmlRootElement(name="InfoCargaTransitoDTO")
public class InfoCargaTransitoDTO  {
  
  @XmlElement(name="cargas")
  @ApiModelProperty(value = "")
  @Valid
  private List<CargaDTO> cargas = null;

  @XmlElement(name="conteiners")
  @ApiModelProperty(value = "")
  @Valid
  private List<ConteinerDTO> conteiners = null;

  @XmlElement(name="documentosTransporteNacional")
  @ApiModelProperty(value = "")
  private List<String> documentosTransporteNacional = null;

  @XmlElement(name="conhecimentos")
  @ApiModelProperty(value = "")
  private List<String> conhecimentos = null;

  @XmlElement(name="documentosTransporteInternacional")
  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentoTransporteDTO> documentosTransporteInternacional = null;

  @XmlElement(name="viaDeTransporte")
  @ApiModelProperty(value = "")
  private List<String> viaDeTransporte = null;
 /**
   * Get cargas
   * @return cargas
  **/
  @JsonProperty("cargas")
  public List<CargaDTO> getCargas() {
    return cargas;
  }

  public void setCargas(List<CargaDTO> cargas) {
    this.cargas = cargas;
  }

  public InfoCargaTransitoDTO cargas(List<CargaDTO> cargas) {
    this.cargas = cargas;
    return this;
  }

  public InfoCargaTransitoDTO addCargasItem(CargaDTO cargasItem) {
    this.cargas.add(cargasItem);
    return this;
  }

 /**
   * Get conteiners
   * @return conteiners
  **/
  @JsonProperty("conteiners")
  public List<ConteinerDTO> getConteiners() {
    return conteiners;
  }

  public void setConteiners(List<ConteinerDTO> conteiners) {
    this.conteiners = conteiners;
  }

  public InfoCargaTransitoDTO conteiners(List<ConteinerDTO> conteiners) {
    this.conteiners = conteiners;
    return this;
  }

  public InfoCargaTransitoDTO addConteinersItem(ConteinerDTO conteinersItem) {
    this.conteiners.add(conteinersItem);
    return this;
  }

 /**
   * Get documentosTransporteNacional
   * @return documentosTransporteNacional
  **/
  @JsonProperty("documentosTransporteNacional")
  public List<String> getDocumentosTransporteNacional() {
    return documentosTransporteNacional;
  }

  public void setDocumentosTransporteNacional(List<String> documentosTransporteNacional) {
    this.documentosTransporteNacional = documentosTransporteNacional;
  }

  public InfoCargaTransitoDTO documentosTransporteNacional(List<String> documentosTransporteNacional) {
    this.documentosTransporteNacional = documentosTransporteNacional;
    return this;
  }

  public InfoCargaTransitoDTO addDocumentosTransporteNacionalItem(String documentosTransporteNacionalItem) {
    this.documentosTransporteNacional.add(documentosTransporteNacionalItem);
    return this;
  }

 /**
   * Get conhecimentos
   * @return conhecimentos
  **/
  @JsonProperty("conhecimentos")
  public List<String> getConhecimentos() {
    return conhecimentos;
  }

  public void setConhecimentos(List<String> conhecimentos) {
    this.conhecimentos = conhecimentos;
  }

  public InfoCargaTransitoDTO conhecimentos(List<String> conhecimentos) {
    this.conhecimentos = conhecimentos;
    return this;
  }

  public InfoCargaTransitoDTO addConhecimentosItem(String conhecimentosItem) {
    this.conhecimentos.add(conhecimentosItem);
    return this;
  }

 /**
   * Get documentosTransporteInternacional
   * @return documentosTransporteInternacional
  **/
  @JsonProperty("documentosTransporteInternacional")
  public List<DocumentoTransporteDTO> getDocumentosTransporteInternacional() {
    return documentosTransporteInternacional;
  }

  public void setDocumentosTransporteInternacional(List<DocumentoTransporteDTO> documentosTransporteInternacional) {
    this.documentosTransporteInternacional = documentosTransporteInternacional;
  }

  public InfoCargaTransitoDTO documentosTransporteInternacional(List<DocumentoTransporteDTO> documentosTransporteInternacional) {
    this.documentosTransporteInternacional = documentosTransporteInternacional;
    return this;
  }

  public InfoCargaTransitoDTO addDocumentosTransporteInternacionalItem(DocumentoTransporteDTO documentosTransporteInternacionalItem) {
    this.documentosTransporteInternacional.add(documentosTransporteInternacionalItem);
    return this;
  }

 /**
   * Get viaDeTransporte
   * @return viaDeTransporte
  **/
  @JsonProperty("viaDeTransporte")
  public List<String> getViaDeTransporte() {
    return viaDeTransporte;
  }

  public void setViaDeTransporte(List<String> viaDeTransporte) {
    this.viaDeTransporte = viaDeTransporte;
  }

  public InfoCargaTransitoDTO viaDeTransporte(List<String> viaDeTransporte) {
    this.viaDeTransporte = viaDeTransporte;
    return this;
  }

  public InfoCargaTransitoDTO addViaDeTransporteItem(String viaDeTransporteItem) {
    this.viaDeTransporte.add(viaDeTransporteItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoCargaTransitoDTO {\n");
    
    sb.append("    cargas: ").append(toIndentedString(cargas)).append("\n");
    sb.append("    conteiners: ").append(toIndentedString(conteiners)).append("\n");
    sb.append("    documentosTransporteNacional: ").append(toIndentedString(documentosTransporteNacional)).append("\n");
    sb.append("    conhecimentos: ").append(toIndentedString(conhecimentos)).append("\n");
    sb.append("    documentosTransporteInternacional: ").append(toIndentedString(documentosTransporteInternacional)).append("\n");
    sb.append("    viaDeTransporte: ").append(toIndentedString(viaDeTransporte)).append("\n");
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

