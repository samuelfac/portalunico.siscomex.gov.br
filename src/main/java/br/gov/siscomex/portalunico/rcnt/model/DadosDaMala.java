package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaMala", propOrder =
    { "idElemento", "numeroMala"
})

@XmlRootElement(name="DadosDaMala")
public class DadosDaMala  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="numeroMala")
  @ApiModelProperty(example = "mala1", value = "Número da mala.<br/>Tamanho: 100")
 /**
   * Número da mala.<br/>Tamanho: 100
  **/
  private String numeroMala = null;
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

  public DadosDaMala idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Número da mala.&lt;br/&gt;Tamanho: 100
   * @return numeroMala
  **/
  @JsonProperty("numeroMala")
  public String getNumeroMala() {
    return numeroMala;
  }

  public void setNumeroMala(String numeroMala) {
    this.numeroMala = numeroMala;
  }

  public DadosDaMala numeroMala(String numeroMala) {
    this.numeroMala = numeroMala;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaMala {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    numeroMala: ").append(toIndentedString(numeroMala)).append("\n");
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

