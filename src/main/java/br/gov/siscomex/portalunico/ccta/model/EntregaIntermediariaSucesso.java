package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "EntregaIntermediariaSucesso", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="EntregaIntermediariaSucesso")
/**
  * Entrega Intermediária realizada com sucesso
 **/
@ApiModel(description="Entrega Intermediária realizada com sucesso")
public class EntregaIntermediariaSucesso  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(example = "CCTA-IN0022", value = "Código da mensagem.<br/>Tamanho máximo: 11")
 /**
   * Código da mensagem.<br/>Tamanho máximo: 11
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Entrega Intermediária realizada com sucesso.", value = "Descrição da mensagem")
 /**
   * Descrição da mensagem
  **/
  private String descricao = null;
 /**
   * Código da mensagem.&lt;br/&gt;Tamanho máximo: 11
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public EntregaIntermediariaSucesso codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da mensagem
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public EntregaIntermediariaSucesso descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntregaIntermediariaSucesso {\n");
    
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

