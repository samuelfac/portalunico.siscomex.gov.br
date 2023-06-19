package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RespostaApiDiagnosticoRegistro", propOrder =
    { "message", "identificacao", "links", "situacao"
})

@XmlRootElement(name="RespostaApiDiagnosticoRegistro")
public class RespostaApiDiagnosticoRegistro  {
  
  @XmlElement(name="message")
  @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação.")
 /**
   * Mensagem de resposta do resultado da operação.
  **/
  private String message = null;

  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificacaoDuimpRespostaApi identificacao = null;

  @XmlElement(name="links")
  @ApiModelProperty(value = "Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.")
  @Valid
 /**
   * Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.
  **/
  private List<LinkCover> links = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "Diagnóstico em processamento", value = "Descrição da situação inicial da solicitação de diagnóstico ou registro.<br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Descrição da situação inicial da solicitação de diagnóstico ou registro.<br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String situacao = null;
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

  public RespostaApiDiagnosticoRegistro message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificacaoDuimpRespostaApi getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificacaoDuimpRespostaApi identificacao) {
    this.identificacao = identificacao;
  }

  public RespostaApiDiagnosticoRegistro identificacao(IdentificacaoDuimpRespostaApi identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Operações disponíveis sobre o recurso.&lt;br&gt;Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.
   * @return links
  **/
  @JsonProperty("links")
  public List<LinkCover> getLinks() {
    return links;
  }

  public void setLinks(List<LinkCover> links) {
    this.links = links;
  }

  public RespostaApiDiagnosticoRegistro links(List<LinkCover> links) {
    this.links = links;
    return this;
  }

  public RespostaApiDiagnosticoRegistro addLinksItem(LinkCover linksItem) {
    this.links.add(linksItem);
    return this;
  }

 /**
   * Descrição da situação inicial da solicitação de diagnóstico ou registro.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 80
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public RespostaApiDiagnosticoRegistro situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaApiDiagnosticoRegistro {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
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

