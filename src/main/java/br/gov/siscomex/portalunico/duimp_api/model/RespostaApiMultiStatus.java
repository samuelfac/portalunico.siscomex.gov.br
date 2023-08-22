package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.DuimpApiMessageCover;
import br.gov.siscomex.portalunico.duimp_api.model.IdentificacaoItemCriadoCover;
import br.gov.siscomex.portalunico.duimp_api.model.LinkCover;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "RespostaApiMultiStatus", propOrder =
    { "code", "message", "identificacao", "errors", "links"
})

@XmlRootElement(name="RespostaApiMultiStatus")
public class RespostaApiMultiStatus  {
  
  @XmlElement(name="code")
  @ApiModelProperty(example = "201", value = "Código da resposta individual para um dos itens que compõem a resposta.")
 /**
   * Código da resposta individual para um dos itens que compõem a resposta.
  **/
  private Integer code = null;

  @XmlElement(name="message")
  @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação individual para um dos itens da que compõem a resposta.")
 /**
   * Mensagem de resposta do resultado da operação individual para um dos itens da que compõem a resposta.
  **/
  private String message = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificacaoItemCriadoCover identificacao = null;

  @XmlElement(name="errors")
  @ApiModelProperty(value = "Conjunto de erros de validação dos campos. Esta lista é devolvida apenas quando o atributo 'code' deste item é igual a 422. <br> Isto ocorrerá apenas quando a resposta da requisição http for 207")
  @Valid
 /**
   * Conjunto de erros de validação dos campos. Esta lista é devolvida apenas quando o atributo 'code' deste item é igual a 422. <br> Isto ocorrerá apenas quando a resposta da requisição http for 207
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
   * Código da resposta individual para um dos itens que compõem a resposta.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RespostaApiMultiStatus code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Mensagem de resposta do resultado da operação individual para um dos itens da que compõem a resposta.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RespostaApiMultiStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificacaoItemCriadoCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificacaoItemCriadoCover identificacao) {
    this.identificacao = identificacao;
  }

  public RespostaApiMultiStatus identificacao(IdentificacaoItemCriadoCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Conjunto de erros de validação dos campos. Esta lista é devolvida apenas quando o atributo &#39;code&#39; deste item é igual a 422. &lt;br&gt; Isto ocorrerá apenas quando a resposta da requisição http for 207
   * @return errors
  **/
  @JsonProperty("errors")
  public List<DuimpApiMessageCover> getErrors() {
    return errors;
  }

  public void setErrors(List<DuimpApiMessageCover> errors) {
    this.errors = errors;
  }

  public RespostaApiMultiStatus errors(List<DuimpApiMessageCover> errors) {
    this.errors = errors;
    return this;
  }

  public RespostaApiMultiStatus addErrorsItem(DuimpApiMessageCover errorsItem) {
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

  public RespostaApiMultiStatus links(List<LinkCover> links) {
    this.links = links;
    return this;
  }

  public RespostaApiMultiStatus addLinksItem(LinkCover linksItem) {
    this.links.add(linksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaApiMultiStatus {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
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

