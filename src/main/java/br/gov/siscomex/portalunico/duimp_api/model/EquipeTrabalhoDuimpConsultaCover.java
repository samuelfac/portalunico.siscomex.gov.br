package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "EquipeTrabalhoDuimpConsultaCover", propOrder =
    { "siglaOrgao", "codigo", "descricao"
})

@XmlRootElement(name="EquipeTrabalhoDuimpConsultaCover")
/**
  * Equipes de trabalho.
 **/
@ApiModel(description="Equipes de trabalho.")
public class EquipeTrabalhoDuimpConsultaCover  {
  
  @XmlElement(name="siglaOrgao")
  @ApiModelProperty(example = "ANVISA", value = "Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
 /**
   * Sigla do órgão da administração pública.<br>Tamanho mínimo: 1<br>Tamanho máximo: 30
  **/
  private String siglaOrgao = null;

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "07106001", value = "Código da equipe de trabalho associado ao órgão.<br>Tamanho: 10")
 /**
   * Código da equipe de trabalho associado ao órgão.<br>Tamanho: 10
  **/
  private String codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Conferência de importação do Porto do Rio", value = "Descrição da equipe de trabalho associado ao órgão.<br>Tamanho: 60")
 /**
   * Descrição da equipe de trabalho associado ao órgão.<br>Tamanho: 60
  **/
  private String descricao = null;
 /**
   * Sigla do órgão da administração pública.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
   * @return siglaOrgao
  **/
  @JsonProperty("siglaOrgao")
  public String getSiglaOrgao() {
    return siglaOrgao;
  }

  public void setSiglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
  }

  public EquipeTrabalhoDuimpConsultaCover siglaOrgao(String siglaOrgao) {
    this.siglaOrgao = siglaOrgao;
    return this;
  }

 /**
   * Código da equipe de trabalho associado ao órgão.&lt;br&gt;Tamanho: 10
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public EquipeTrabalhoDuimpConsultaCover codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da equipe de trabalho associado ao órgão.&lt;br&gt;Tamanho: 60
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public EquipeTrabalhoDuimpConsultaCover descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipeTrabalhoDuimpConsultaCover {\n");
    
    sb.append("    siglaOrgao: ").append(toIndentedString(siglaOrgao)).append("\n");
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

