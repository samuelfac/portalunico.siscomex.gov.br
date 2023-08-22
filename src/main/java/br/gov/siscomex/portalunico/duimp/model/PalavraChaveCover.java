package br.gov.siscomex.portalunico.duimp.model;

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
 @XmlType(name = "PalavraChaveCover", propOrder =
    { "codigo", "valor"
})

@XmlRootElement(name="PalavraChaveCover")
/**
  * Palavra chave no sistema Anexação (E-Docex). Objeto composto pelos atributos código e valor.
 **/
@ApiModel(description="Palavra chave no sistema Anexação (E-Docex). Objeto composto pelos atributos código e valor.")
public class PalavraChaveCover  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "22", value = "Código da palavra chave no sistema Anexação.<br>Domínio: Palavras Chave existentes no sistema Anexação (E-Docex)<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código da palavra chave no sistema Anexação.<br>Domínio: Palavras Chave existentes no sistema Anexação (E-Docex)<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private Long codigo = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "9999.99.99", value = "Valor informado pelo importador para a palavra chave")
 /**
   * Valor informado pelo importador para a palavra chave
  **/
  private String valor = null;
 /**
   * Código da palavra chave no sistema Anexação.&lt;br&gt;Domínio: Palavras Chave existentes no sistema Anexação (E-Docex)&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public PalavraChaveCover codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Valor informado pelo importador para a palavra chave
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public PalavraChaveCover valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalavraChaveCover {\n");
    
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

