package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DossieCover", propOrder =
    { "numero"
})

@XmlRootElement(name="DossieCover")
/**
  * Lista de dossiês.
 **/
@ApiModel(description="Lista de dossiês.")
public class DossieCover  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(example = "201950000000515", value = "Números de dossiê vinculados à Duimp.<br>Tamanho: 20")
 /**
   * Números de dossiê vinculados à Duimp.<br>Tamanho: 20
  **/
  private String numero = null;
 /**
   * Números de dossiê vinculados à Duimp.&lt;br&gt;Tamanho: 20
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DossieCover numero(String numero) {
    this.numero = numero;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DossieCover {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
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

