package br.gov.siscomex.portalunico.talpco.model;

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
 @XmlType(name = "PresencaCarga", propOrder =
    { "dataHoraPresencaCarga"
})

@XmlRootElement(name="PresencaCarga")
/**
  * Dados referentes a presença de carga associado a um LPCO com LI vinculada
 **/
@ApiModel(description="Dados referentes a presença de carga associado a um LPCO com LI vinculada")
public class PresencaCarga  {
  
  @XmlElement(name="dataHoraPresencaCarga", required = true)
  @ApiModelProperty(example = "2023-03-02T15:31Z", required = true, value = "Data e hora da presença de carga<br>Formato: dd-MM-yyyy'T'HH:mmZ")
 /**
   * Data e hora da presença de carga<br>Formato: dd-MM-yyyy'T'HH:mmZ
  **/
  private String dataHoraPresencaCarga = null;
 /**
   * Data e hora da presença de carga&lt;br&gt;Formato: dd-MM-yyyy&#39;T&#39;HH:mmZ
   * @return dataHoraPresencaCarga
  **/
  @JsonProperty("dataHoraPresencaCarga")
  @NotNull
  public String getDataHoraPresencaCarga() {
    return dataHoraPresencaCarga;
  }

  public void setDataHoraPresencaCarga(String dataHoraPresencaCarga) {
    this.dataHoraPresencaCarga = dataHoraPresencaCarga;
  }

  public PresencaCarga dataHoraPresencaCarga(String dataHoraPresencaCarga) {
    this.dataHoraPresencaCarga = dataHoraPresencaCarga;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresencaCarga {\n");
    
    sb.append("    dataHoraPresencaCarga: ").append(toIndentedString(dataHoraPresencaCarga)).append("\n");
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

