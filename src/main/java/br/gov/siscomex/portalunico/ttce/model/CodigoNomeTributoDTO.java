package br.gov.siscomex.portalunico.ttce.model;

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
 @XmlType(name = "CodigoNomeTributoDTO", propOrder =
    { "codigo", "nome"
})

@XmlRootElement(name="CodigoNomeTributoDTO")
/**
  * Código e nome de um Tributo.
 **/
@ApiModel(description="Código e nome de um Tributo.")
public class CodigoNomeTributoDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Código do Tributo.")
 /**
   * Código do Tributo.
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "IMPOSTO DE IMPORTAÇÃO", required = true, value = "Nome do Tributo.")
 /**
   * Nome do Tributo.
  **/
  private String nome = null;
 /**
   * Código do Tributo.
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

  public CodigoNomeTributoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do Tributo.
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CodigoNomeTributoDTO nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoNomeTributoDTO {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

