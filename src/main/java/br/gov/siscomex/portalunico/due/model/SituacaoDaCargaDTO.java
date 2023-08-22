package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "SituacaoDaCargaDTO", propOrder =
    { "cargaOperada", "codigo", "cpfOuCnpjDoResponsavel", "descricao", "latitude", "longitude", "recintoAduaneiro", "urfDeDespacho"
})

@XmlRootElement(name="SituacaoDaCargaDTO")
public class SituacaoDaCargaDTO  {
  
  @XmlElement(name="cargaOperada")
  @ApiModelProperty(value = "")
  private Boolean cargaOperada = false;

  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código da situação da Carga<br />Formato: Inteiro, com 1 digito")
 /**
   * Código da situação da Carga<br />Formato: Inteiro, com 1 digito
  **/
  private Integer codigo = null;

  @XmlElement(name="cpfOuCnpjDoResponsavel")
  @ApiModelProperty(example = "27015886006", value = "CPF ou CNPJ do responsável<br />Tamanho mínimo: 11<br />Tamanho máximo: 14")
 /**
   * CPF ou CNPJ do responsável<br />Tamanho mínimo: 11<br />Tamanho máximo: 14
  **/
  private String cpfOuCnpjDoResponsavel = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Estocada", value = "Descrição da situação da Carga<br />Tamanho mínimo: 1<br />Tamanho máximo: 50")
 /**
   * Descrição da situação da Carga<br />Tamanho mínimo: 1<br />Tamanho máximo: 50
  **/
  private String descricao = null;

  @XmlElement(name="latitude")
  @ApiModelProperty(value = "Latitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Latitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String latitude = null;

  @XmlElement(name="longitude")
  @ApiModelProperty(value = "Longitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"")
 /**
   * Longitude<br />Regex: \"^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\"
  **/
  private String longitude = null;

  @XmlElement(name="recintoAduaneiro")
  @ApiModelProperty(example = "8911101", value = "Recinto Aduaneiro<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Recinto Aduaneiro<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String recintoAduaneiro = null;

  @XmlElement(name="urfDeDespacho")
  @ApiModelProperty(example = "0817600", value = "Unidade da Receita Federal de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'")
 /**
   * Unidade da Receita Federal de despacho<br />Tamanho: 7<br />Formato: 'NNNNNNN'
  **/
  private String urfDeDespacho = null;
 /**
   * Get cargaOperada
   * @return cargaOperada
  **/
  @JsonProperty("cargaOperada")
  public Boolean isCargaOperada() {
    return cargaOperada;
  }

  public void setCargaOperada(Boolean cargaOperada) {
    this.cargaOperada = cargaOperada;
  }

  public SituacaoDaCargaDTO cargaOperada(Boolean cargaOperada) {
    this.cargaOperada = cargaOperada;
    return this;
  }

 /**
   * Código da situação da Carga&lt;br /&gt;Formato: Inteiro, com 1 digito
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public SituacaoDaCargaDTO codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * CPF ou CNPJ do responsável&lt;br /&gt;Tamanho mínimo: 11&lt;br /&gt;Tamanho máximo: 14
   * @return cpfOuCnpjDoResponsavel
  **/
  @JsonProperty("cpfOuCnpjDoResponsavel")
  public String getCpfOuCnpjDoResponsavel() {
    return cpfOuCnpjDoResponsavel;
  }

  public void setCpfOuCnpjDoResponsavel(String cpfOuCnpjDoResponsavel) {
    this.cpfOuCnpjDoResponsavel = cpfOuCnpjDoResponsavel;
  }

  public SituacaoDaCargaDTO cpfOuCnpjDoResponsavel(String cpfOuCnpjDoResponsavel) {
    this.cpfOuCnpjDoResponsavel = cpfOuCnpjDoResponsavel;
    return this;
  }

 /**
   * Descrição da situação da Carga&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public SituacaoDaCargaDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Latitude&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public SituacaoDaCargaDTO latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude&lt;br /&gt;Regex: \&quot;^((-)?90(\\\\.[0]{6}))|((-)?([0-9]|[1-8][0-9])(\\\\.[0-9]{6}))$\&quot;
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public SituacaoDaCargaDTO longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Recinto Aduaneiro&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return recintoAduaneiro
  **/
  @JsonProperty("recintoAduaneiro")
  public String getRecintoAduaneiro() {
    return recintoAduaneiro;
  }

  public void setRecintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
  }

  public SituacaoDaCargaDTO recintoAduaneiro(String recintoAduaneiro) {
    this.recintoAduaneiro = recintoAduaneiro;
    return this;
  }

 /**
   * Unidade da Receita Federal de despacho&lt;br /&gt;Tamanho: 7&lt;br /&gt;Formato: &#39;NNNNNNN&#39;
   * @return urfDeDespacho
  **/
  @JsonProperty("urfDeDespacho")
  public String getUrfDeDespacho() {
    return urfDeDespacho;
  }

  public void setUrfDeDespacho(String urfDeDespacho) {
    this.urfDeDespacho = urfDeDespacho;
  }

  public SituacaoDaCargaDTO urfDeDespacho(String urfDeDespacho) {
    this.urfDeDespacho = urfDeDespacho;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituacaoDaCargaDTO {\n");
    
    sb.append("    cargaOperada: ").append(toIndentedString(cargaOperada)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    cpfOuCnpjDoResponsavel: ").append(toIndentedString(cpfOuCnpjDoResponsavel)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    recintoAduaneiro: ").append(toIndentedString(recintoAduaneiro)).append("\n");
    sb.append("    urfDeDespacho: ").append(toIndentedString(urfDeDespacho)).append("\n");
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

