package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PalavraChaveDocumentoInstrucaoCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="PalavraChaveDocumentoInstrucaoCover")
/**
  * Lista de palavras-chave associadas ao documento instrutivo.<br>A palavra-chave obrigatória deve ser o primeiro item da lista.
 **/
@ApiModel(description="Lista de palavras-chave associadas ao documento instrutivo.<br>A palavra-chave obrigatória deve ser o primeiro item da lista.")
public class PalavraChaveDocumentoInstrucaoCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "33", value = "Código da palavra-chave no sistema Anexação.<br>Domínio: Palavras-Chave existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código da palavra-chave no sistema Anexação.<br>Domínio: Palavras-Chave existentes no sistema Anexação (E-Docex).<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private Integer codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "9999.99.99", value = "Valor informado pelo importador para a palavra-chave.")
 /**
   * Valor informado pelo importador para a palavra-chave.
  **/
  private String valor = null;
 /**
   * Código da palavra-chave no sistema Anexação.&lt;br&gt;Domínio: Palavras-Chave existentes no sistema Anexação (E-Docex).&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public PalavraChaveDocumentoInstrucaoCover codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor informado pelo importador para a palavra-chave.
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public PalavraChaveDocumentoInstrucaoCover valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalavraChaveDocumentoInstrucaoCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

