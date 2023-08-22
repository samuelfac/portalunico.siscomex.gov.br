package br.gov.siscomex.portalunico.edocex.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
  @ApiModelProperty(example = "1.000,00", required = true, value = "Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy ou yyyy-MM-dd<br/>&emsp;&emsp;Exemplos: 15/02/2021 ou 2021-02-15<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd'T'HH:mm:ss.SSSz<br/>&emsp;&emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT<br/>Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)<br/>&emsp;&emsp;Exemplos: 1234 ou 1.234<br/>Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:<br/>&emsp;&emsp;1) com ponto como separador de milhar e vírgula como separador decimal;<br/>&emsp;&emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou<br/>&emsp;&emsp;3) apenas ponto como separador decimal, sem separador de milhar)<br/>&emsp;&emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65<br/>")
 /**
   * Conteúdo informado para a palavra-chave.<br/>Tamanho máximo: 255<br/>Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):<br/>Formato TEXTO: conforme máscara definida para a palavra-chave<br/>Formato DATA: dd/MM/yyyy ou yyyy-MM-dd<br/>&emsp;&emsp;Exemplos: 15/02/2021 ou 2021-02-15<br/>Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd'T'HH:mm:ss.SSSz<br/>&emsp;&emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT<br/>Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)<br/>&emsp;&emsp;Exemplos: 1234 ou 1.234<br/>Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:<br/>&emsp;&emsp;1) com ponto como separador de milhar e vírgula como separador decimal;<br/>&emsp;&emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou<br/>&emsp;&emsp;3) apenas ponto como separador decimal, sem separador de milhar)<br/>&emsp;&emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65<br/>
  **/
  private String conteudo = null;

  @XmlElement(name="idPalavraChave", required = true)
  @ApiModelProperty(example = "597", required = true, value = "Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647")
 /**
   * Id da palavra-chave.<br/>Valor mínimo: 1<br/>Valor máximo: 2147483647
  **/
  private Integer idPalavraChave = null;
 /**
   * Conteúdo informado para a palavra-chave.&lt;br/&gt;Tamanho máximo: 255&lt;br/&gt;Formato conforme tipoDado (DATA, DATA_HORA, NUMERO_INTEIRO, NUMERO_REAL, LISTA, TEXTO):&lt;br/&gt;Formato TEXTO: conforme máscara definida para a palavra-chave&lt;br/&gt;Formato DATA: dd/MM/yyyy ou yyyy-MM-dd&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 15/02/2021 ou 2021-02-15&lt;br/&gt;Formato DATA_HORA: dd/MM/yyyy HH:mm:ss ou formato ISO 8601 yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSz&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 15/02/2021 15:48:25, 2021-02-15T15:48:25 ou 2019-05-03T15:38:11.855BRT&lt;br/&gt;Formato NUMERO_INTEIRO: 99.999 (com ou sem ponto como separador de milhar)&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 1234 ou 1.234&lt;br/&gt;Formato NUMERO_REAL: 99.999,99 (pode ser enviado em três formatos diferentes:&lt;br/&gt;&amp;emsp;&amp;emsp;1) com ponto como separador de milhar e vírgula como separador decimal;&lt;br/&gt;&amp;emsp;&amp;emsp;2) apenas vírgula como separador decimal, sem separador de milhar; ou&lt;br/&gt;&amp;emsp;&amp;emsp;3) apenas ponto como separador decimal, sem separador de milhar)&lt;br/&gt;&amp;emsp;&amp;emsp;Exemplos: 1.234.478,65 ou 1234478.65 ou 1234478,65&lt;br/&gt;
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

