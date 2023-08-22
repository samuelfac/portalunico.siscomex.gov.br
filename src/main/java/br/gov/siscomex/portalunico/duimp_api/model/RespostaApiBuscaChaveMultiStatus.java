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
 @XmlType(name = "RespostaApiBuscaChaveMultiStatus", propOrder =
    { "code", "message", "duimp", "errors", "links"
})

@XmlRootElement(name="RespostaApiBuscaChaveMultiStatus")
public class RespostaApiBuscaChaveMultiStatus  {
  
  @XmlElement(name="code")
  @ApiModelProperty(example = "200", value = "Código HTTP da resposta.")
 /**
   * Código HTTP da resposta.
  **/
  private Integer code = null;

  @XmlElement(name="message")
  @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação.")
 /**
   * Mensagem de resposta do resultado da operação.
  **/
  private String message = null;

  @XmlElement(name="duimp")
  @ApiModelProperty(value = "")
  @Valid
  private DuimpChaveCover duimp = null;

  @XmlElement(name="errors")
  @ApiModelProperty(value = "Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422.")
  @Valid
 /**
   * Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422.
  **/
  private List<DuimpApiMessageCover> errors = null;

  @XmlElement(name="links")
  @ApiModelProperty(value = "Operações disponíveis sobre o recurso.")
  @Valid
 /**
   * Operações disponíveis sobre o recurso.
  **/
  private List<LinkCover> links = null;
 /**
   * Código HTTP da resposta.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RespostaApiBuscaChaveMultiStatus code(Integer code) {
    this.code = code;
    return this;
  }

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

  public RespostaApiBuscaChaveMultiStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get duimp
   * @return duimp
  **/
  @JsonProperty("duimp")
  public DuimpChaveCover getDuimp() {
    return duimp;
  }

  public void setDuimp(DuimpChaveCover duimp) {
    this.duimp = duimp;
  }

  public RespostaApiBuscaChaveMultiStatus duimp(DuimpChaveCover duimp) {
    this.duimp = duimp;
    return this;
  }

 /**
   * Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<DuimpApiMessageCover> getErrors() {
    return errors;
  }

  public void setErrors(List<DuimpApiMessageCover> errors) {
    this.errors = errors;
  }

  public RespostaApiBuscaChaveMultiStatus errors(List<DuimpApiMessageCover> errors) {
    this.errors = errors;
    return this;
  }

  public RespostaApiBuscaChaveMultiStatus addErrorsItem(DuimpApiMessageCover errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * Operações disponíveis sobre o recurso.
   * @return links
  **/
  @JsonProperty("links")
  public List<LinkCover> getLinks() {
    return links;
  }

  public void setLinks(List<LinkCover> links) {
    this.links = links;
  }

  public RespostaApiBuscaChaveMultiStatus links(List<LinkCover> links) {
    this.links = links;
    return this;
  }

  public RespostaApiBuscaChaveMultiStatus addLinksItem(LinkCover linksItem) {
    this.links.add(linksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaApiBuscaChaveMultiStatus {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    duimp: ").append(toIndentedString(duimp)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

