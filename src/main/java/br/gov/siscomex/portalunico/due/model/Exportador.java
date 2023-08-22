package br.gov.siscomex.portalunico.due.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Exportador", propOrder =
    { "numero", "tipo"
})

@XmlRootElement(name="Exportador")
public class Exportador  {
  
  @XmlElement(name="numero")
  @ApiModelProperty(value = "Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20")
 /**
   * Número do documento<br />Tamanho mínimo: 1<br />Tamanho máximo: 20
  **/
  private String numero = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "Tipo<br />Domínio: <br />'PF' = Pessoa Física<br />'PJ' = Pessoa Jurídica<br />'ES' = Estrangeiro ")
 /**
   * Tipo<br />Domínio: <br />'PF' = Pessoa Física<br />'PJ' = Pessoa Jurídica<br />'ES' = Estrangeiro 
  **/
  private String tipo = null;
 /**
   * Número do documento&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 20
   * @return numero
  **/
  @JsonProperty("numero")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public Exportador numero(String numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Tipo&lt;br /&gt;Domínio: &lt;br /&gt;&#39;PF&#39; &#x3D; Pessoa Física&lt;br /&gt;&#39;PJ&#39; &#x3D; Pessoa Jurídica&lt;br /&gt;&#39;ES&#39; &#x3D; Estrangeiro 
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Exportador tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exportador {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

