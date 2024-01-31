package br.gov.siscomex.portalunico.remx_consulta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ErroNoProcessamentoDeManifestoDePresenaDeCarga", propOrder =
    { "codigoMensagem", "mensagem", "numeroLote", "numeroManifesto", "numeroRemessa"
})

@XmlRootElement(name="ErroNoProcessamentoDeManifestoDePresenaDeCarga")
public class ErroNoProcessamentoDeManifestoDePresenaDeCarga  {
  
  @XmlElement(name="codigoMensagem")
  @ApiModelProperty(value = "Contém o código da mensagem de erro. Cinco caracteres, sendo dois caracteres referentes ao tipo da mensagem e três referentes à mensagem de erro. ")
 /**
   * Contém o código da mensagem de erro. Cinco caracteres, sendo dois caracteres referentes ao tipo da mensagem e três referentes à mensagem de erro. 
  **/
  private String codigoMensagem = null;

  @XmlElement(name="mensagem")
  @ApiModelProperty(value = "Contém a mensagem de erro. Até 300 caracteres alfanuméricos, incluindo ‘.’,’-‘ e ‘/’. ")
 /**
   * Contém a mensagem de erro. Até 300 caracteres alfanuméricos, incluindo ‘.’,’-‘ e ‘/’. 
  **/
  private String mensagem = null;

  @XmlElement(name="numeroLote")
  @ApiModelProperty(value = "Contém o numero do lote. Regra relacionada está no sistema Remessa.")
 /**
   * Contém o numero do lote. Regra relacionada está no sistema Remessa.
  **/
  private String numeroLote = null;

  @XmlElement(name="numeroManifesto")
  @ApiModelProperty(value = "Contém o numero do manifesto. O número do manifesto é composto por 15 caracteres alfanuméricos, conforme regra do sistema Remessa.")
 /**
   * Contém o numero do manifesto. O número do manifesto é composto por 15 caracteres alfanuméricos, conforme regra do sistema Remessa.
  **/
  private String numeroManifesto = null;

  @XmlElement(name="numeroRemessa")
  @ApiModelProperty(value = "Contém o número da remessa.  Máximo de dezoito caracteres alfanuméricos.")
 /**
   * Contém o número da remessa.  Máximo de dezoito caracteres alfanuméricos.
  **/
  private String numeroRemessa = null;
 /**
   * Contém o código da mensagem de erro. Cinco caracteres, sendo dois caracteres referentes ao tipo da mensagem e três referentes à mensagem de erro. 
   * @return codigoMensagem
  **/
  @JsonProperty("codigoMensagem")
  public String getCodigoMensagem() {
    return codigoMensagem;
  }

  public void setCodigoMensagem(String codigoMensagem) {
    this.codigoMensagem = codigoMensagem;
  }

  public ErroNoProcessamentoDeManifestoDePresenaDeCarga codigoMensagem(String codigoMensagem) {
    this.codigoMensagem = codigoMensagem;
    return this;
  }

 /**
   * Contém a mensagem de erro. Até 300 caracteres alfanuméricos, incluindo ‘.’,’-‘ e ‘/’. 
   * @return mensagem
  **/
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public ErroNoProcessamentoDeManifestoDePresenaDeCarga mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

 /**
   * Contém o numero do lote. Regra relacionada está no sistema Remessa.
   * @return numeroLote
  **/
  @JsonProperty("numeroLote")
  public String getNumeroLote() {
    return numeroLote;
  }

  public void setNumeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
  }

  public ErroNoProcessamentoDeManifestoDePresenaDeCarga numeroLote(String numeroLote) {
    this.numeroLote = numeroLote;
    return this;
  }

 /**
   * Contém o numero do manifesto. O número do manifesto é composto por 15 caracteres alfanuméricos, conforme regra do sistema Remessa.
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public ErroNoProcessamentoDeManifestoDePresenaDeCarga numeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
    return this;
  }

 /**
   * Contém o número da remessa.  Máximo de dezoito caracteres alfanuméricos.
   * @return numeroRemessa
  **/
  @JsonProperty("numeroRemessa")
  public String getNumeroRemessa() {
    return numeroRemessa;
  }

  public void setNumeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
  }

  public ErroNoProcessamentoDeManifestoDePresenaDeCarga numeroRemessa(String numeroRemessa) {
    this.numeroRemessa = numeroRemessa;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErroNoProcessamentoDeManifestoDePresenaDeCarga {\n");
    
    sb.append("    codigoMensagem: ").append(toIndentedString(codigoMensagem)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    numeroLote: ").append(toIndentedString(numeroLote)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    numeroRemessa: ").append(toIndentedString(numeroRemessa)).append("\n");
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

