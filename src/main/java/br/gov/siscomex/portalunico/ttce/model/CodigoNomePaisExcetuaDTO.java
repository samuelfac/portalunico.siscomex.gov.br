package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CodigoNomePaisExcetuaDTO", propOrder =
    { "codigo", "nome"
})

@XmlRootElement(name="CodigoNomePaisExcetuaDTO")
/**
  * Código e nome de um País.
 **/
@ApiModel(description="Código e nome de um País.")
public class CodigoNomePaisExcetuaDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "63", required = true, value = "Código do País.")
 /**
   * Código do País.
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "ARGENTINA", required = true, value = "Nome do País.")
 /**
   * Nome do País.
  **/
  private String nome = null;
 /**
   * Código do País.
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

  public CodigoNomePaisExcetuaDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do País.
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

  public CodigoNomePaisExcetuaDTO nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoNomePaisExcetuaDTO {\n");
    
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

