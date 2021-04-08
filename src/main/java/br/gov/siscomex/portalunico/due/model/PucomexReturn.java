package br.gov.siscomex.portalunico.due.model;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PucomexReturn", propOrder =
    { "chaveDeAcesso", "cpf", "date", "due", "message", "ruc", "warnings"
})

@XmlRootElement(name="PucomexReturn")
public class PucomexReturn  {
  
  @XmlElement(name="chaveDeAcesso")
  @ApiModelProperty(example = "17AAA101000", value = "Chave de acesso<br />Tamanho: 11<br />Formato: 'NNAAANNNNNN'")
 /**
   * Chave de acesso<br />Tamanho: 11<br />Formato: 'NNAAANNNNNN'
  **/
  private String chaveDeAcesso = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "23648359096", value = "CPF<br />Tamanho: 11<br />Formato: 'NNNNNNNNNNN'")
 /**
   * CPF<br />Tamanho: 11<br />Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="date")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private String date = null;

  @XmlElement(name="due")
  @ApiModelProperty(example = "19BR0000056196", value = "Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'")
 /**
   * Número da DUE<br />Tamanho: 14<br />Formato: 'NNAANNNNNNNNNN'
  **/
  private String due = null;

  @XmlElement(name="message")
  @ApiModelProperty(value = "Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 500")
 /**
   * Mensagem<br />Tamanho mínimo: 0<br />Tamanho máximo: 500
  **/
  private String message = null;

  @XmlElement(name="ruc")
  @ApiModelProperty(example = "9BR00000000100000000000000000023366", value = "RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'")
 /**
   * RUC - Número da referência única de carga<br />Tamanho: 35<br />Formato: 'NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN'
  **/
  private String ruc = null;

  @XmlElement(name="warnings")
  @ApiModelProperty(value = "")
  @Valid
  private Warnings warnings = null;
 /**
   * Chave de acesso&lt;br /&gt;Tamanho: 11&lt;br /&gt;Formato: &#39;NNAAANNNNNN&#39;
   * @return chaveDeAcesso
  **/
  @JsonProperty("chaveDeAcesso")
  public String getChaveDeAcesso() {
    return chaveDeAcesso;
  }

  public void setChaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
  }

  public PucomexReturn chaveDeAcesso(String chaveDeAcesso) {
    this.chaveDeAcesso = chaveDeAcesso;
    return this;
  }

 /**
   * CPF&lt;br /&gt;Tamanho: 11&lt;br /&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public PucomexReturn cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Data&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PucomexReturn date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Número da DUE&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNAANNNNNNNNNN&#39;
   * @return due
  **/
  @JsonProperty("due")
  public String getDue() {
    return due;
  }

  public void setDue(String due) {
    this.due = due;
  }

  public PucomexReturn due(String due) {
    this.due = due;
    return this;
  }

 /**
   * Mensagem&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 500
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PucomexReturn message(String message) {
    this.message = message;
    return this;
  }

 /**
   * RUC - Número da referência única de carga&lt;br /&gt;Tamanho: 35&lt;br /&gt;Formato: &#39;NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN&#39;
   * @return ruc
  **/
  @JsonProperty("ruc")
  public String getRuc() {
    return ruc;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public PucomexReturn ruc(String ruc) {
    this.ruc = ruc;
    return this;
  }

 /**
   * Get warnings
   * @return warnings
  **/
  @JsonProperty("warnings")
  public Warnings getWarnings() {
    return warnings;
  }

  public void setWarnings(Warnings warnings) {
    this.warnings = warnings;
  }

  public PucomexReturn warnings(Warnings warnings) {
    this.warnings = warnings;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PucomexReturn {\n");
    
    sb.append("    chaveDeAcesso: ").append(toIndentedString(chaveDeAcesso)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

