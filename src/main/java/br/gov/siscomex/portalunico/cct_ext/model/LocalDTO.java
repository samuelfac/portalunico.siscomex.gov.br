package br.gov.siscomex.portalunico.cct_ext.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "LocalDTO", propOrder =
    { "codigoURF", "codigoRecinto", "cpfCnpjResponsavel", "latitude", "longitude", "codigoMunicipio", "paisISO2"
})

@XmlRootElement(name="LocalDTO")
public class LocalDTO  {
  
  @XmlElement(name="codigoURF")
  @ApiModelProperty(value = "")
  private String codigoURF = null;

  @XmlElement(name="codigoRecinto")
  @ApiModelProperty(value = "")
  private String codigoRecinto = null;

  @XmlElement(name="cpfCnpjResponsavel")
  @ApiModelProperty(value = "")
  private String cpfCnpjResponsavel = null;

  @XmlElement(name="latitude")
  @ApiModelProperty(value = "")
  private String latitude = null;

  @XmlElement(name="longitude")
  @ApiModelProperty(value = "")
  private String longitude = null;

  @XmlElement(name="codigoMunicipio")
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal codigoMunicipio = null;

  @XmlElement(name="paisISO2")
  @ApiModelProperty(value = "")
  private String paisISO2 = null;
 /**
   * Get codigoURF
   * @return codigoURF
  **/
  @JsonProperty("codigoURF")
  public String getCodigoURF() {
    return codigoURF;
  }

  public void setCodigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
  }

  public LocalDTO codigoURF(String codigoURF) {
    this.codigoURF = codigoURF;
    return this;
  }

 /**
   * Get codigoRecinto
   * @return codigoRecinto
  **/
  @JsonProperty("codigoRecinto")
  public String getCodigoRecinto() {
    return codigoRecinto;
  }

  public void setCodigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
  }

  public LocalDTO codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Get cpfCnpjResponsavel
   * @return cpfCnpjResponsavel
  **/
  @JsonProperty("cpfCnpjResponsavel")
  public String getCpfCnpjResponsavel() {
    return cpfCnpjResponsavel;
  }

  public void setCpfCnpjResponsavel(String cpfCnpjResponsavel) {
    this.cpfCnpjResponsavel = cpfCnpjResponsavel;
  }

  public LocalDTO cpfCnpjResponsavel(String cpfCnpjResponsavel) {
    this.cpfCnpjResponsavel = cpfCnpjResponsavel;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public LocalDTO latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public LocalDTO longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get codigoMunicipio
   * @return codigoMunicipio
  **/
  @JsonProperty("codigoMunicipio")
  public BigDecimal getCodigoMunicipio() {
    return codigoMunicipio;
  }

  public void setCodigoMunicipio(BigDecimal codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }

  public LocalDTO codigoMunicipio(BigDecimal codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
    return this;
  }

 /**
   * Get paisISO2
   * @return paisISO2
  **/
  @JsonProperty("paisISO2")
  public String getPaisISO2() {
    return paisISO2;
  }

  public void setPaisISO2(String paisISO2) {
    this.paisISO2 = paisISO2;
  }

  public LocalDTO paisISO2(String paisISO2) {
    this.paisISO2 = paisISO2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalDTO {\n");
    
    sb.append("    codigoURF: ").append(toIndentedString(codigoURF)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    cpfCnpjResponsavel: ").append(toIndentedString(cpfCnpjResponsavel)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    codigoMunicipio: ").append(toIndentedString(codigoMunicipio)).append("\n");
    sb.append("    paisISO2: ").append(toIndentedString(paisISO2)).append("\n");
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

