package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCoordenadasGeorreferenciamento", propOrder =
    { "idElemento", "latitude", "longitude"
})

@XmlRootElement(name="DadosCoordenadasGeorreferenciamento")
public class DadosCoordenadasGeorreferenciamento  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="latitude", required = true)
  @ApiModelProperty(example = "9.123456", required = true, value = "Latitude (somente serão válidos valores entre: +10.000000 e -38.000000), 6 casas decimais")
  @Valid
 /**
   * Latitude (somente serão válidos valores entre: +10.000000 e -38.000000), 6 casas decimais
  **/
  private BigDecimal latitude = null;

  @XmlElement(name="longitude", required = true)
  @ApiModelProperty(example = "-31.123456", required = true, value = "Longitude (somente serão válidos valores entre: -30.000000 e -78.000000) , 6 casas decimais")
  @Valid
 /**
   * Longitude (somente serão válidos valores entre: -30.000000 e -78.000000) , 6 casas decimais
  **/
  private BigDecimal longitude = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
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
   * Latitude (somente serão válidos valores entre: +10.000000 e -38.000000), 6 casas decimais
   * @return latitude
  **/
  @JsonProperty("latitude")
  @NotNull
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
   * Longitude (somente serão válidos valores entre: -30.000000 e -78.000000) , 6 casas decimais
   * @return longitude
  **/
  @JsonProperty("longitude")
  @NotNull
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

