package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Pessoa", propOrder =
    { "id", "nome", "endereco"
})

@XmlRootElement(name="Pessoa")
/**
  * Dados de uma pessoa física / jurídica
 **/
@ApiModel(description="Dados de uma pessoa física / jurídica")
public class Pessoa  {
  
  @XmlElement(name="id", required = true)
  @ApiModelProperty(example = "12345678901", required = true, value = "Identificação (CPF/CNPJ) do interveniente<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)")
 /**
   * Identificação (CPF/CNPJ) do interveniente<br>Tamanho: 11 (CPF) ou 14 (CNPJ)<br>Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
  **/
  private String id = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Fulano da Silva", required = true, value = "Nome do interveniente")
 /**
   * Nome do interveniente
  **/
  private String nome = null;

  @XmlElement(name="endereco")
  @ApiModelProperty(value = "")
  @Valid
  private Endereco endereco = null;
 /**
   * Identificação (CPF/CNPJ) do interveniente&lt;br&gt;Tamanho: 11 (CPF) ou 14 (CNPJ)&lt;br&gt;Formato: NNNNNNNNNNN (CPF) ou NNNNNNNNNNNNNN (CNPJ)
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Pessoa id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Nome do interveniente
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

  public Pessoa nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Get endereco
   * @return endereco
  **/
  @JsonProperty("endereco")
  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Pessoa endereco(Endereco endereco) {
    this.endereco = endereco;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pessoa {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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

