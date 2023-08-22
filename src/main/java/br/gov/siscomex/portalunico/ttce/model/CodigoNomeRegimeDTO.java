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
 @XmlType(name = "CodigoNomeRegimeDTO", propOrder =
    { "codigo", "nome"
})

@XmlRootElement(name="CodigoNomeRegimeDTO")
/**
  * Código e nome de um Regime Tributário.
 **/
@ApiModel(description="Código e nome de um Regime Tributário.")
public class CodigoNomeRegimeDTO  {
  
  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Código do Regime Tributário.<br/><br>Formato: Inteiro, com até 3 digitos")
 /**
   * Código do Regime Tributário.<br/><br>Formato: Inteiro, com até 3 digitos
  **/
  private String codigo = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "RECOLHIMENTO INTEGRAL", required = true, value = "Nome do Regime Tributário.<br/><br>Tamanho mínimo: 1<br>Tamanho máximo: 130")
 /**
   * Nome do Regime Tributário.<br/><br>Tamanho mínimo: 1<br>Tamanho máximo: 130
  **/
  private String nome = null;
 /**
   * Código do Regime Tributário.&lt;br/&gt;&lt;br&gt;Formato: Inteiro, com até 3 digitos
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

  public CodigoNomeRegimeDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Nome do Regime Tributário.&lt;br/&gt;&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 130
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

  public CodigoNomeRegimeDTO nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoNomeRegimeDTO {\n");
    
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

