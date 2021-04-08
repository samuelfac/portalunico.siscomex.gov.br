package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosSemirreboqueDaInspeoNoInvasiva", propOrder =
    { "idElemento", "placa", "ocrPlaca"
})

@XmlRootElement(name="DadosSemirreboqueDaInspeoNoInvasiva")
public class DadosSemirreboqueDaInspeoNoInvasiva  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa (semirreboque, vagão, truck)<br/>Tamanho: 50")
 /**
   * Placa (semirreboque, vagão, truck)<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="ocrPlaca")
  @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean ocrPlaca = null;
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

  public DadosSemirreboqueDaInspeoNoInvasiva idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Placa (semirreboque, vagão, truck)&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosSemirreboqueDaInspeoNoInvasiva placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return ocrPlaca
  **/
  @JsonProperty("ocrPlaca")
  public Boolean isOcrPlaca() {
    return ocrPlaca;
  }

  public void setOcrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
  }

  public DadosSemirreboqueDaInspeoNoInvasiva ocrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosSemirreboqueDaInspeoNoInvasiva {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    ocrPlaca: ").append(toIndentedString(ocrPlaca)).append("\n");
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

