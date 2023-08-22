package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.IdentificacaoDuimpRespostaApi;
import br.gov.siscomex.portalunico.duimp_api.model.LinkCover;
import br.gov.siscomex.portalunico.duimp_api.model.RespostaApiMultiStatus;
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
 @XmlType(name = "RespostaApiItens", propOrder =
    { "message", "identificacao", "links", "multiStatus"
})

@XmlRootElement(name="RespostaApiItens")
public class RespostaApiItens  {
  
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

  @XmlElement(name="multiStatus")
  @ApiModelProperty(value = "Lista que conterá o status individual de cada item da Duimp submetido pelos métodos PUT e POST. <br>Cada elemento desta lista possuí um atributo 'code' informando o código da resposta para um item específico.<br>Este atributo poderá ter o valor 200 ou 201 em caso de sucesso (dependendo da operação) ou um código diferente em caso de erro")
  @Valid
 /**
   * Lista que conterá o status individual de cada item da Duimp submetido pelos métodos PUT e POST. <br>Cada elemento desta lista possuí um atributo 'code' informando o código da resposta para um item específico.<br>Este atributo poderá ter o valor 200 ou 201 em caso de sucesso (dependendo da operação) ou um código diferente em caso de erro
  **/
  private List<RespostaApiMultiStatus> multiStatus = null;
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

  public RespostaApiItens message(String message) {
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

  public RespostaApiItens identificacao(IdentificacaoDuimpRespostaApi identificacao) {
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

  public RespostaApiItens links(List<LinkCover> links) {
    this.links = links;
    return this;
  }

  public RespostaApiItens addLinksItem(LinkCover linksItem) {
    this.links.add(linksItem);
    return this;
  }

 /**
   * Lista que conterá o status individual de cada item da Duimp submetido pelos métodos PUT e POST. &lt;br&gt;Cada elemento desta lista possuí um atributo &#39;code&#39; informando o código da resposta para um item específico.&lt;br&gt;Este atributo poderá ter o valor 200 ou 201 em caso de sucesso (dependendo da operação) ou um código diferente em caso de erro
   * @return multiStatus
  **/
  @JsonProperty("multiStatus")
  public List<RespostaApiMultiStatus> getMultiStatus() {
    return multiStatus;
  }

  public void setMultiStatus(List<RespostaApiMultiStatus> multiStatus) {
    this.multiStatus = multiStatus;
  }

  public RespostaApiItens multiStatus(List<RespostaApiMultiStatus> multiStatus) {
    this.multiStatus = multiStatus;
    return this;
  }

  public RespostaApiItens addMultiStatusItem(RespostaApiMultiStatus multiStatusItem) {
    this.multiStatus.add(multiStatusItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespostaApiItens {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

