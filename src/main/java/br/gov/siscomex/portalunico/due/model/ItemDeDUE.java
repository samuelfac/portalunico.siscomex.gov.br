package br.gov.siscomex.portalunico.due.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemDeDUE", propOrder =
    { "numero"
})

@XmlRootElement(name="ItemDeDUE")
public class ItemDeDUE  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número<br />Formato: Inteiro, com até 5 digitos")
 /**
   * Número<br />Formato: Inteiro, com até 5 digitos
  **/
  private String numero = null;
 /**
   * Número&lt;br /&gt;Formato: Inteiro, com até 5 digitos
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ItemDeDUE numero(String numero) {
    this.numero = numero;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDeDUE {\n");
    
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

