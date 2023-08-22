package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosDaCmera", propOrder =
    { "idElemento", "protocoloCamera"
})

@XmlRootElement(name="DadosDaCmera")
public class DadosDaCmera  {
  
  @XmlElement(name="idElemento", required = true)
  @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="protocoloCamera")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 36")
 /**
   * Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 36
  **/
  private String protocoloCamera = null;
 /**
   * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  @NotNull
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public DadosDaCmera idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Usar o protocolo do evento de georreferenciamento.&lt;br/&gt;Tamanho: 36
   * @return protocoloCamera
  **/
  @JsonProperty("protocoloCamera")
  public String getProtocoloCamera() {
    return protocoloCamera;
  }

  public void setProtocoloCamera(String protocoloCamera) {
    this.protocoloCamera = protocoloCamera;
  }

  public DadosDaCmera protocoloCamera(String protocoloCamera) {
    this.protocoloCamera = protocoloCamera;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaCmera {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    protocoloCamera: ").append(toIndentedString(protocoloCamera)).append("\n");
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

