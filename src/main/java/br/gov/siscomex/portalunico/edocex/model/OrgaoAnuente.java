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
 @XmlType(name = "OrgaoAnuente", propOrder =
    { "descricao", "sigla"
})

@XmlRootElement(name="OrgaoAnuente")
/**
  * Órgão anuente.
 **/
@ApiModel(description="Órgão anuente.")
public class OrgaoAnuente  {
  
  @XmlElement(name="descricao")
  @ApiModelProperty(example = "RFB - RECEITA FEDERAL DO BRASIL", value = "Descrição do órgão anuente.<br/>Tamanho máximo: 255")
 /**
   * Descrição do órgão anuente.<br/>Tamanho máximo: 255
  **/
  private String descricao = null;

  @XmlElement(name="sigla")
  @ApiModelProperty(example = "RECEITA", value = "Sigla do órgão anuente.<br/>Tamanho máximo: 255")
 /**
   * Sigla do órgão anuente.<br/>Tamanho máximo: 255
  **/
  private String sigla = null;
 /**
   * Descrição do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public OrgaoAnuente descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Sigla do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
   * @return sigla
  **/
  @JsonProperty("sigla")
  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  public OrgaoAnuente sigla(String sigla) {
    this.sigla = sigla;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgaoAnuente {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    sigla: ").append(toIndentedString(sigla)).append("\n");
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

