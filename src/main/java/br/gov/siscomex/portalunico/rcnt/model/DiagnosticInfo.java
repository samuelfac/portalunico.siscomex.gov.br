package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DiagnosticInfo", propOrder =
    { "ambiente", "fluxo", "mnemonico", "sistema", "trackerId", "url", "usuario", "visao"
})

@XmlRootElement(name="DiagnosticInfo")
public class DiagnosticInfo  {
  
  @XmlElement(name="ambiente")
  @ApiModelProperty(value = "")
  private String ambiente = null;

  @XmlElement(name="fluxo")
  @ApiModelProperty(value = "")
  private String fluxo = null;

  @XmlElement(name="mnemonico")
  @ApiModelProperty(value = "")
  private String mnemonico = null;

  @XmlElement(name="sistema")
  @ApiModelProperty(value = "")
  private String sistema = null;

  @XmlElement(name="trackerId")
  @ApiModelProperty(value = "")
  private String trackerId = null;

  @XmlElement(name="url")
  @ApiModelProperty(value = "")
  private String url = null;

  @XmlElement(name="usuario")
  @ApiModelProperty(value = "")
  private String usuario = null;

  @XmlElement(name="visao")
  @ApiModelProperty(value = "")
  private String visao = null;
 /**
   * Get ambiente
   * @return ambiente
  **/
  @JsonProperty("ambiente")
  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public DiagnosticInfo ambiente(String ambiente) {
    this.ambiente = ambiente;
    return this;
  }

 /**
   * Get fluxo
   * @return fluxo
  **/
  @JsonProperty("fluxo")
  public String getFluxo() {
    return fluxo;
  }

  public void setFluxo(String fluxo) {
    this.fluxo = fluxo;
  }

  public DiagnosticInfo fluxo(String fluxo) {
    this.fluxo = fluxo;
    return this;
  }

 /**
   * Get mnemonico
   * @return mnemonico
  **/
  @JsonProperty("mnemonico")
  public String getMnemonico() {
    return mnemonico;
  }

  public void setMnemonico(String mnemonico) {
    this.mnemonico = mnemonico;
  }

  public DiagnosticInfo mnemonico(String mnemonico) {
    this.mnemonico = mnemonico;
    return this;
  }

 /**
   * Get sistema
   * @return sistema
  **/
  @JsonProperty("sistema")
  public String getSistema() {
    return sistema;
  }

  public void setSistema(String sistema) {
    this.sistema = sistema;
  }

  public DiagnosticInfo sistema(String sistema) {
    this.sistema = sistema;
    return this;
  }

 /**
   * Get trackerId
   * @return trackerId
  **/
  @JsonProperty("trackerId")
  public String getTrackerId() {
    return trackerId;
  }

  public void setTrackerId(String trackerId) {
    this.trackerId = trackerId;
  }

  public DiagnosticInfo trackerId(String trackerId) {
    this.trackerId = trackerId;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DiagnosticInfo url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get usuario
   * @return usuario
  **/
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public DiagnosticInfo usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

 /**
   * Get visao
   * @return visao
  **/
  @JsonProperty("visao")
  public String getVisao() {
    return visao;
  }

  public void setVisao(String visao) {
    this.visao = visao;
  }

  public DiagnosticInfo visao(String visao) {
    this.visao = visao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticInfo {\n");
    
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    fluxo: ").append(toIndentedString(fluxo)).append("\n");
    sb.append("    mnemonico: ").append(toIndentedString(mnemonico)).append("\n");
    sb.append("    sistema: ").append(toIndentedString(sistema)).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    visao: ").append(toIndentedString(visao)).append("\n");
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

