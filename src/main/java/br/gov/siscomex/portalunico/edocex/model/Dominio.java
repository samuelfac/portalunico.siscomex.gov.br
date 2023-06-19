package br.gov.siscomex.portalunico.edocex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Dominio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="Dominio")
/**
  * Código e descrição de palavra-chave do tipo LISTA.
 **/
@ApiModel(description="Código e descrição de palavra-chave do tipo LISTA.")
public class Dominio  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "9410", required = true, value = "Código do domínimo da palavra-chave para o tipo de dado LISTA.<br/>Tamanho máximo: 30")
 /**
   * Código do domínimo da palavra-chave para o tipo de dado LISTA.<br/>Tamanho máximo: 30
  **/
  private String codigo = null;

  @XmlElement(name="descricao", required = true)
  @ApiModelProperty(example = "Fiscalização Sanitária de até 10 itens de medicamentos e substâncias sujeitas a controle especial, integrantes do procedimento 1, por pessoa jurídica para fins industriais ou comerciais", required = true, value = "Descrição do domínimo da palavra-chave para o tipo de dado LISTA.<br/>Tamanho máximo: 255")
 /**
   * Descrição do domínimo da palavra-chave para o tipo de dado LISTA.<br/>Tamanho máximo: 255
  **/
  private String descricao = null;
 /**
   * Código do domínimo da palavra-chave para o tipo de dado LISTA.&lt;br/&gt;Tamanho máximo: 30
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Dominio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do domínimo da palavra-chave para o tipo de dado LISTA.&lt;br/&gt;Tamanho máximo: 255
   * @return descricao
  **/
  @JsonProperty("descricao")
  @NotNull
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Dominio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dominio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

