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
 @XmlType(name = "TabelaApiRepresentation", propOrder =
    { "nome", "rotulo", "descricao"
})

@XmlRootElement(name="TabelaApiRepresentation")
public class TabelaApiRepresentation  {
  
  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "GRUPO_EXIGENCIA", required = true, value = "Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Nome da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String nome = null;

  @XmlElement(name="rotulo")
  @ApiModelProperty(example = "Grupo de Exigência", value = "Rótulo da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Rótulo da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String rotulo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Tabela de Grupo de Exigência", value = "Descrição da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 1000")
 /**
   * Descrição da tabela.<br>Tamanho mínimo: 1<br>Tamanho máximo: 1000
  **/
  private String descricao = null;
 /**
   * Nome da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
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

  public TabelaApiRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Rótulo da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return rotulo
  **/
  @JsonProperty("rotulo")
  public String getRotulo() {
    return rotulo;
  }

  public void setRotulo(String rotulo) {
    this.rotulo = rotulo;
  }

  public TabelaApiRepresentation rotulo(String rotulo) {
    this.rotulo = rotulo;
    return this;
  }

 /**
   * Descrição da tabela.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 1000
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TabelaApiRepresentation descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabelaApiRepresentation {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    rotulo: ").append(toIndentedString(rotulo)).append("\n");
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

