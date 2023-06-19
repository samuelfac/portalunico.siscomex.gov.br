package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ConsultaDTO", propOrder =
    { "numero", "urlConsulta"
})

@XmlRootElement(name="ConsultaDTO")
public class ConsultaDTO  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(value = "")
  private String numero = null;

  @XmlElement(name="urlConsulta")
  @ApiModelProperty(value = "")
  private String urlConsulta = null;
 /**
   * Get numero
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ConsultaDTO numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Get urlConsulta
   * @return urlConsulta
  **/
  @JsonProperty("urlConsulta")
  public String getUrlConsulta() {
    return urlConsulta;
  }

  public void setUrlConsulta(String urlConsulta) {
    this.urlConsulta = urlConsulta;
  }

  public ConsultaDTO urlConsulta(String urlConsulta) {
    this.urlConsulta = urlConsulta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDTO {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    urlConsulta: ").append(toIndentedString(urlConsulta)).append("\n");
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

