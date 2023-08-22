package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RespostaApiBuscaChave", propOrder =
    { "message", "multiStatus"
})

@XmlRootElement(name="RespostaApiBuscaChave")
public class RespostaApiBuscaChave  {
  
  @XmlElement(name="message")
  @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação.")
 /**
   * Mensagem de resposta do resultado da operação.
  **/
  private String message = null;

  @XmlElement(name="multiStatus")
  @ApiModelProperty(value = "Lista que conterá o status para cada duimp.")
  @Valid
 /**
   * Lista que conterá o status para cada duimp.
  **/
  private List<RespostaApiBuscaChaveMultiStatus> multiStatus = null;
 /**
   * Mensagem de resposta do resultado da operação.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RespostaApiBuscaChave message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Lista que conterá o status para cada duimp.
   * @return multiStatus
  **/
  @JsonProperty("multiStatus")
  public List<RespostaApiBuscaChaveMultiStatus> getMultiStatus() {
    return multiStatus;
  }

  public void setMultiStatus(List<RespostaApiBuscaChaveMultiStatus> multiStatus) {
    this.multiStatus = multiStatus;
  }

  public RespostaApiBuscaChave multiStatus(List<RespostaApiBuscaChaveMultiStatus> multiStatus) {
    this.multiStatus = multiStatus;
    return this;
  }

  public RespostaApiBuscaChave addMultiStatusItem(RespostaApiBuscaChaveMultiStatus multiStatusItem) {
    this.multiStatus.add(multiStatusItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaApiBuscaChave {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    multiStatus: ").append(toIndentedString(multiStatus)).append("\n");
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

