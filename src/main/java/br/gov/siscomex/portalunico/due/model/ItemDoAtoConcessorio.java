package br.gov.siscomex.portalunico.due.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemDoAtoConcessorio", propOrder =
    { "ncm", "numero"
})

@XmlRootElement(name="ItemDoAtoConcessorio")
public class ItemDoAtoConcessorio  {
  
  @XmlElement(name="ncm")
  @ApiModelProperty(example = "01013000", value = "NCM<br />Tamanho: 8<br />Formato: 'NNNNNNNN'")
 /**
   * NCM<br />Tamanho: 8<br />Formato: 'NNNNNNNN'
  **/
  private String ncm = null;

  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número<br />Formato: Inteiro, com até 5 digitos")
 /**
   * Número<br />Formato: Inteiro, com até 5 digitos
  **/
  private String numero = null;
 /**
   * NCM&lt;br /&gt;Tamanho: 8&lt;br /&gt;Formato: &#39;NNNNNNNN&#39;
   * @return ncm
  **/
  @JsonProperty("ncm")
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ItemDoAtoConcessorio ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

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

  public ItemDoAtoConcessorio numero(String numero) {
    this.numero = numero;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDoAtoConcessorio {\n");
    
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
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

