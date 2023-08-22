package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Coordenadas", propOrder =
    { "latitude", "longitude"
})

@XmlRootElement(name="Coordenadas")
/**
  * Dados das coordenadas geográficas<br>Deve ser informado somente quando codigoRA não for informado. 
 **/
@ApiModel(description="Dados das coordenadas geográficas<br>Deve ser informado somente quando codigoRA não for informado. ")
public class Coordenadas  {
  
  @XmlElement(name="latitude", required = true)
  @ApiModelProperty(example = "-22.812222", required = true, value = "Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
 /**
   * Latitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
  **/
  private String latitude = null;

  @XmlElement(name="longitude", required = true)
  @ApiModelProperty(example = "-43.248333", required = true, value = "Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN")
 /**
   * Longitude do local<br>Coordenadas geográficas em graus decimais<br>Formato: NN.NNNNNNN ou -NN.NNNNNNN
  **/
  private String longitude = null;
 /**
   * Latitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
   * @return latitude
  **/
  @JsonProperty("latitude")
  @NotNull
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Coordenadas latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude do local&lt;br&gt;Coordenadas geográficas em graus decimais&lt;br&gt;Formato: NN.NNNNNNN ou -NN.NNNNNNN
   * @return longitude
  **/
  @JsonProperty("longitude")
  @NotNull
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Coordenadas longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordenadas {\n");
    
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

