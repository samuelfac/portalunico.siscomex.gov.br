package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "DuimpApiMessageCover", propOrder =
    { "code", "field", "message"
})

@XmlRootElement(name="DuimpApiMessageCover")
public class DuimpApiMessageCover  {
  
  @XmlElement(name="code")
  @ApiModelProperty(example = "DIMP-ER0004", value = "Código interno da mensagem de erro.")
 /**
   * Código interno da mensagem de erro.
  **/
  private String code = null;

  @XmlElement(name="field")
  @ApiModelProperty(example = "numero", value = "Nome do campo que contém o valor inválido.")
 /**
   * Nome do campo que contém o valor inválido.
  **/
  private String field = null;

  @XmlElement(name="message")
  @ApiModelProperty(example = "Número da Duimp inválido.", value = "Mensagem de erro.")
 /**
   * Mensagem de erro.
  **/
  private String message = null;
 /**
   * Código interno da mensagem de erro.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DuimpApiMessageCover code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Nome do campo que contém o valor inválido.
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public DuimpApiMessageCover field(String field) {
    this.field = field;
    return this;
  }

 /**
   * Mensagem de erro.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DuimpApiMessageCover message(String message) {
    this.message = message;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpApiMessageCover {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

