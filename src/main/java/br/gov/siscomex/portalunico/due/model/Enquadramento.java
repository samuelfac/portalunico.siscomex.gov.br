package br.gov.siscomex.portalunico.due.model;

import java.time.OffsetDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Enquadramento", propOrder =
    { "codigo", "dataRegistro", "descricao", "grupo", "tipo"
})

@XmlRootElement(name="Enquadramento")
public class Enquadramento  {
  
  @XmlElement(name="codigo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com até 5 digitos")
 /**
   * Código<br />Formato: Inteiro, com até 5 digitos
  **/
  private Integer codigo = null;

  @XmlElement(name="dataRegistro")
  @ApiModelProperty(example = "2019-09-20T14:13:46.966Z", value = "Data de Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data de Registro<br />Formato:'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataRegistro = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50")
 /**
   * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50
  **/
  private String descricao = null;

  @XmlElement(name="grupo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com 1 digito")
 /**
   * Código<br />Formato: Inteiro, com 1 digito
  **/
  private Integer grupo = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(value = "Código<br />Formato: Inteiro, com 1 digito")
 /**
   * Código<br />Formato: Inteiro, com 1 digito
  **/
  private Integer tipo = null;
 /**
   * Código&lt;br /&gt;Formato: Inteiro, com até 5 digitos
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public Enquadramento codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Data de Registro&lt;br /&gt;Formato:&#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataRegistro
  **/
  @JsonProperty("dataRegistro")
  public OffsetDateTime getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public Enquadramento dataRegistro(OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 50
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Enquadramento descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Código&lt;br /&gt;Formato: Inteiro, com 1 digito
   * @return grupo
  **/
  @JsonProperty("grupo")
  public Integer getGrupo() {
    return grupo;
  }

  public void setGrupo(Integer grupo) {
    this.grupo = grupo;
  }

  public Enquadramento grupo(Integer grupo) {
    this.grupo = grupo;
    return this;
  }

 /**
   * Código&lt;br /&gt;Formato: Inteiro, com 1 digito
   * @return tipo
  **/
  @JsonProperty("tipo")
  public Integer getTipo() {
    return tipo;
  }

  public void setTipo(Integer tipo) {
    this.tipo = tipo;
  }

  public Enquadramento tipo(Integer tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enquadramento {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    grupo: ").append(toIndentedString(grupo)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

