package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Error", propOrder =
    { "timestamp", "message", "path"
})

@XmlRootElement(name="Error")
/**
  * Representação de Erros
 **/
@ApiModel(description="Representação de Erros")
public class Error  {
  
  @XmlElement(name="timestamp")
  @ApiModelProperty(value = "Data e hora em que ocorreu o problema (<em>no formato ISO 8601</em>)")
 /**
   * Data e hora em que ocorreu o problema (<em>no formato ISO 8601</em>)
  **/
  private OffsetDateTime timestamp = null;

  @XmlElement(name="message")
  @ApiModelProperty(example = "mensagen de erro", value = "Mensagem de erro")
 /**
   * Mensagem de erro
  **/
  private String message = null;

  @XmlElement(name="path")
  @ApiModelProperty(example = "caminho do erro", value = "Caminho do recurso com erro")
 /**
   * Caminho do recurso com erro
  **/
  private String path = null;
 /**
   * Data e hora em que ocorreu o problema (&lt;em&gt;no formato ISO 8601&lt;/em&gt;)
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Error timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Mensagem de erro
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Caminho do recurso com erro
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Error path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

