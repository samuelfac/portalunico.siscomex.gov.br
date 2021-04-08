package br.gov.siscomex.portalunico.edocex.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DocumentoPalavraChave", propOrder =
    { "conteudoPalavraChave", "idPalavraChave", "nomePalavraChave"
})

@XmlRootElement(name="DocumentoPalavraChave")
/**
  * Palavra-chave do documento.
 **/
@ApiModel(description="Palavra-chave do documento.")
public class DocumentoPalavraChave  {
  
  @XmlElement(name="conteudoPalavraChave", required = true)
  @ApiModelProperty(example = "1.000,00", required = true, value = "Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato: conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO)")
 /**
   * Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato: conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO)
  **/
  private String conteudoPalavraChave = null;

  @XmlElement(name="idPalavraChave", required = true)
  @ApiModelProperty(example = "597", required = true, value = "Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idPalavraChave = null;

  @XmlElement(name="nomePalavraChave", required = true)
  @ApiModelProperty(example = "Valor R$", required = true, value = "Nome da palavra-chave.")
 /**
   * Nome da palavra-chave.
  **/
  private String nomePalavraChave = null;
 /**
   * Conteúdo informado para a palavra-chave.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato: conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO)
   * @return conteudoPalavraChave
  **/
  @JsonProperty("conteudoPalavraChave")
  @NotNull
  public String getConteudoPalavraChave() {
    return conteudoPalavraChave;
  }

  public void setConteudoPalavraChave(String conteudoPalavraChave) {
    this.conteudoPalavraChave = conteudoPalavraChave;
  }

  public DocumentoPalavraChave conteudoPalavraChave(String conteudoPalavraChave) {
    this.conteudoPalavraChave = conteudoPalavraChave;
    return this;
  }

 /**
   * Id da palavra-chave.&lt;br/&gt;Valor mínimo: 1&lt;br/&gt;Valor máximo: 2147483647
   * @return idPalavraChave
  **/
  @JsonProperty("idPalavraChave")
  @NotNull
  public Integer getIdPalavraChave() {
    return idPalavraChave;
  }

  public void setIdPalavraChave(Integer idPalavraChave) {
    this.idPalavraChave = idPalavraChave;
  }

  public DocumentoPalavraChave idPalavraChave(Integer idPalavraChave) {
    this.idPalavraChave = idPalavraChave;
    return this;
  }

 /**
   * Nome da palavra-chave.
   * @return nomePalavraChave
  **/
  @JsonProperty("nomePalavraChave")
  @NotNull
  public String getNomePalavraChave() {
    return nomePalavraChave;
  }

  public void setNomePalavraChave(String nomePalavraChave) {
    this.nomePalavraChave = nomePalavraChave;
  }

  public DocumentoPalavraChave nomePalavraChave(String nomePalavraChave) {
    this.nomePalavraChave = nomePalavraChave;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoPalavraChave {\n");
    
    sb.append("    conteudoPalavraChave: ").append(toIndentedString(conteudoPalavraChave)).append("\n");
    sb.append("    idPalavraChave: ").append(toIndentedString(idPalavraChave)).append("\n");
    sb.append("    nomePalavraChave: ").append(toIndentedString(nomePalavraChave)).append("\n");
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

