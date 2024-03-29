package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Mensagem", propOrder =
    { "mensagem", "codigo"
})

@XmlRootElement(name="Mensagem")
/**
  * Mensagem de retorno
 **/
@ApiModel(description="Mensagem de retorno")
public class Mensagem  {
  
  @XmlElement(name="mensagem")
  @ApiModelProperty(value = "")
  private String mensagem = null;

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "CCTR-ER0003", value = "Código da mensagem<br>Tamanho: 11")
 /**
   * Código da mensagem<br>Tamanho: 11
  **/
  private String codigo = null;
 /**
   * Get mensagem
   * @return mensagem
  **/
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public Mensagem mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

 /**
   * Código da mensagem&lt;br&gt;Tamanho: 11
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Mensagem codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mensagem {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

