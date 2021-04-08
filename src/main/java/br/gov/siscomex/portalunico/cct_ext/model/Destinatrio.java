package br.gov.siscomex.portalunico.cct_ext.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Destinatrio", propOrder =
    { "numeroCnpj", "nome", "endereco"
})

@XmlRootElement(name="Destinatrio")
/**
  * Dados do destinatário
 **/
@ApiModel(description="Dados do destinatário")
public class Destinatrio  {
  
  @XmlElement(name="numeroCnpj")
  @ApiModelProperty(example = "12345678901234", value = "CNPJ do destinatário<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro.")
 /**
   * CNPJ do destinatário<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro.
  **/
  private String numeroCnpj = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Nome do destinatário estrangeiro", value = "Nome do destinatário estrangeiro<br>Tamanho: 60<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.")
 /**
   * Nome do destinatário estrangeiro<br>Tamanho: 60<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.
  **/
  private String nome = null;

  @XmlElement(name="endereco")
  @ApiModelProperty(example = "Endereço do destinatário estrangeiro", value = "Endereço do destinatário estrangeiro<br>Tamanho: 120<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.")
 /**
   * Endereço do destinatário estrangeiro<br>Tamanho: 120<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.
  **/
  private String endereco = null;
 /**
   * CNPJ do destinatário&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado e obrigatório para remetente brasileiro.
   * @return numeroCnpj
  **/
  @JsonProperty("numeroCnpj")
  public String getNumeroCnpj() {
    return numeroCnpj;
  }

  public void setNumeroCnpj(String numeroCnpj) {
    this.numeroCnpj = numeroCnpj;
  }

  public Destinatrio numeroCnpj(String numeroCnpj) {
    this.numeroCnpj = numeroCnpj;
    return this;
  }

 /**
   * Nome do destinatário estrangeiro&lt;br&gt;Tamanho: 60&lt;br&gt;Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Destinatrio nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Endereço do destinatário estrangeiro&lt;br&gt;Tamanho: 120&lt;br&gt;Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.
   * @return endereco
  **/
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Destinatrio endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destinatrio {\n");
    
    sb.append("    numeroCnpj: ").append(toIndentedString(numeroCnpj)).append("\n");
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

