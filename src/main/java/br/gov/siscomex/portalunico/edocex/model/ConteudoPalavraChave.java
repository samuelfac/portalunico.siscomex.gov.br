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
 @XmlType(name = "ConteudoPalavraChave", propOrder =
    { "conteudo", "idPalavraChave"
})

@XmlRootElement(name="ConteudoPalavraChave")
/**
  * Conteúdo da palavra-chave.
 **/
@ApiModel(description="Conteúdo da palavra-chave.")
public class ConteudoPalavraChave  {
  
  @XmlElement(name="conteudo", required = true)
  @ApiModelProperty(example = "1.000,00", required = true, value = "Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss<br/>Formato NUMERO_INTEIRO: 99.999 (com ponto como separador de milhares)<br/>Formato NUMERO_REAL: 99.999,99 (com ponto como separador de milhares e vírgula como separador decimal)")
 /**
   * Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss<br/>Formato NUMERO_INTEIRO: 99.999 (com ponto como separador de milhares)<br/>Formato NUMERO_REAL: 99.999,99 (com ponto como separador de milhares e vírgula como separador decimal)
  **/
  private String conteudo = null;

  @XmlElement(name="idPalavraChave", required = true)
  @ApiModelProperty(example = "597", required = true, value = "Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idPalavraChave = null;
 /**
   * Conteúdo informado para a palavra-chave.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):&lt;br/&gt;Formato TEXTO: conforme máscara definida para a palavra-chave&lt;br/&gt;Formato DATA: dd/MM/yyyy&lt;br/&gt;Formato DATA_HORA: dd/MM/yyyy HH:mm:ss&lt;br/&gt;Formato NUMERO_INTEIRO: 99.999 (com ponto como separador de milhares)&lt;br/&gt;Formato NUMERO_REAL: 99.999,99 (com ponto como separador de milhares e vírgula como separador decimal)
   * @return conteudo
  **/
  @JsonProperty("conteudo")
  @NotNull
  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public ConteudoPalavraChave conteudo(String conteudo) {
    this.conteudo = conteudo;
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

  public ConteudoPalavraChave idPalavraChave(Integer idPalavraChave) {
    this.idPalavraChave = idPalavraChave;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConteudoPalavraChave {\n");
    
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    idPalavraChave: ").append(toIndentedString(idPalavraChave)).append("\n");
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

