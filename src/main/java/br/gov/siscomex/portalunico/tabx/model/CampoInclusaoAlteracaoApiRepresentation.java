package br.gov.siscomex.portalunico.tabx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CampoInclusaoAlteracaoApiRepresentation", propOrder =
    { "nome", "valor"
})

@XmlRootElement(name="CampoInclusaoAlteracaoApiRepresentation")
public class CampoInclusaoAlteracaoApiRepresentation  {
  
  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "NOME", required = true, value = "Nome do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 40")
 /**
   * Nome do campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: 40
  **/
  private String nome = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "Grupo de exigência para material nacionalizado", value = "Valor atribuído ao campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: definido nos metadados da tabela")
 /**
   * Valor atribuído ao campo.<br>Tamanho mínimo: 1<br>Tamanho máximo: definido nos metadados da tabela
  **/
  private String valor = null;
 /**
   * Nome do campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 40
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

  public CampoInclusaoAlteracaoApiRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Valor atribuído ao campo.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: definido nos metadados da tabela
   * @return valor
  **/
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public CampoInclusaoAlteracaoApiRepresentation valor(String valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoInclusaoAlteracaoApiRepresentation {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

