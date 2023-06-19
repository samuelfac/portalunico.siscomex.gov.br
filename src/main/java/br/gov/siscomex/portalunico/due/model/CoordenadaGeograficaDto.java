package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CoordenadaGeograficaDto", propOrder =
    { "coordenadaArrayLatitudeLongitude", "latitude", "longitude"
})

@XmlRootElement(name="CoordenadaGeograficaDto")
public class CoordenadaGeograficaDto  {
  
  @XmlElement(name="coordenadaArrayLatitudeLongitude")
  @ApiModelProperty(value = "")
  private List<String> coordenadaArrayLatitudeLongitude = null;

  @XmlElement(name="latitude")
  @ApiModelProperty(value = "Latitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String latitude = null;

  @XmlElement(name="longitude")
  @ApiModelProperty(value = "Longitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Longitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String longitude = null;
 /**
   * Get coordenadaArrayLatitudeLongitude
   * @return coordenadaArrayLatitudeLongitude
  **/
  @JsonProperty("coordenadaArrayLatitudeLongitude")
  public List<String> getCoordenadaArrayLatitudeLongitude() {
    return coordenadaArrayLatitudeLongitude;
  }

  public void setCoordenadaArrayLatitudeLongitude(List<String> coordenadaArrayLatitudeLongitude) {
    this.coordenadaArrayLatitudeLongitude = coordenadaArrayLatitudeLongitude;
  }

  public CoordenadaGeograficaDto coordenadaArrayLatitudeLongitude(List<String> coordenadaArrayLatitudeLongitude) {
    this.coordenadaArrayLatitudeLongitude = coordenadaArrayLatitudeLongitude;
    return this;
  }

  public CoordenadaGeograficaDto addCoordenadaArrayLatitudeLongitudeItem(String coordenadaArrayLatitudeLongitudeItem) {
    this.coordenadaArrayLatitudeLongitude.add(coordenadaArrayLatitudeLongitudeItem);
    return this;
  }

 /**
   * Latitude&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public CoordenadaGeograficaDto latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public CoordenadaGeograficaDto longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoordenadaGeograficaDto {\n");
    
    sb.append("    coordenadaArrayLatitudeLongitude: ").append(toIndentedString(coordenadaArrayLatitudeLongitude)).append("\n");
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

