package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosCoordenadasGeorreferenciamento", propOrder =
    { "idElemento", "latitude", "longitude"
})

@XmlRootElement(name="DadosCoordenadasGeorreferenciamento")
public class DadosCoordenadasGeorreferenciamento  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="latitude")
  @ApiModelProperty(example = "15.123456", value = "Latitude, 6 casas decimais")
  @Valid
 /**
   * Latitude, 6 casas decimais
  **/
  private BigDecimal latitude = null;

  @XmlElement(name="longitude")
  @ApiModelProperty(example = "-29.123456", value = "Longitude, 6 casas decimais")
  @Valid
 /**
   * Longitude, 6 casas decimais
  **/
  private BigDecimal longitude = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosCoordenadasGeorreferenciamento idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Latitude, 6 casas decimais
   * @return latitude
  **/
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public DadosCoordenadasGeorreferenciamento latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude, 6 casas decimais
   * @return longitude
  **/
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public DadosCoordenadasGeorreferenciamento longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCoordenadasGeorreferenciamento {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

