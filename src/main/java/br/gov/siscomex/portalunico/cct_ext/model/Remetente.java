package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Remetente", propOrder =
    { "numeroCpf", "numeroCnpj", "nome", "endereco", "registroFiscal"
})

@XmlRootElement(name="Remetente")
/**
  * Dados do remetente
 **/
@ApiModel(description="Dados do remetente")
public class Remetente  {
  
  @XmlElement(name="numeroCpf")
  @ApiModelProperty(example = "12345678901", value = "CPF do remetente<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro, e o CNPJ não foi informado.")
 /**
   * CPF do remetente<br>Tamanho: 11<br>Formato: NNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro, e o CNPJ não foi informado.
  **/
  private String numeroCpf = null;

  @XmlElement(name="numeroCnpj")
  @ApiModelProperty(example = "12345678901234", value = "CNPJ do remetente<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro, e o CPF não foi informado.")
 /**
   * CNPJ do remetente<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN<br>Informado e obrigatório para remetente brasileiro, e o CPF não foi informado.
  **/
  private String numeroCnpj = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Nome do remetente estrangeiro", value = "Nome do remetente estrangeiro<br>Tamanho: 60<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.")
 /**
   * Nome do remetente estrangeiro<br>Tamanho: 60<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.
  **/
  private String nome = null;

  @XmlElement(name="endereco")
  @ApiModelProperty(example = "Endereço do remetente estrangeiro", value = "Endereço do remetente estrangeiro<br> Tamanho: 120<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.")
 /**
   * Endereço do remetente estrangeiro<br> Tamanho: 120<br>Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.
  **/
  private String endereco = null;

  @XmlElement(name="registroFiscal")
  @ApiModelProperty(value = "Registro Fiscal do Remetente")
 /**
   * Registro Fiscal do Remetente
  **/
  private String registroFiscal = null;
 /**
   * CPF do remetente&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN&lt;br&gt;Informado e obrigatório para remetente brasileiro, e o CNPJ não foi informado.
   * @return numeroCpf
  **/
  @JsonProperty("numeroCpf")
  public String getNumeroCpf() {
    return numeroCpf;
  }

  public void setNumeroCpf(String numeroCpf) {
    this.numeroCpf = numeroCpf;
  }

  public Remetente numeroCpf(String numeroCpf) {
    this.numeroCpf = numeroCpf;
    return this;
  }

 /**
   * CNPJ do remetente&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN&lt;br&gt;Informado e obrigatório para remetente brasileiro, e o CPF não foi informado.
   * @return numeroCnpj
  **/
  @JsonProperty("numeroCnpj")
  public String getNumeroCnpj() {
    return numeroCnpj;
  }

  public void setNumeroCnpj(String numeroCnpj) {
    this.numeroCnpj = numeroCnpj;
  }

  public Remetente numeroCnpj(String numeroCnpj) {
    this.numeroCnpj = numeroCnpj;
    return this;
  }

 /**
   * Nome do remetente estrangeiro&lt;br&gt;Tamanho: 60&lt;br&gt;Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao nome do remetente estrangeiro.
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Remetente nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Endereço do remetente estrangeiro&lt;br&gt; Tamanho: 120&lt;br&gt;Informado e obrigatório para remetente estrangeiro. Este campo ser refere ao endereço do remetente estrangeiro.
   * @return endereco
  **/
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Remetente endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

 /**
   * Registro Fiscal do Remetente
   * @return registroFiscal
  **/
  @JsonProperty("registroFiscal")
  public String getRegistroFiscal() {
    return registroFiscal;
  }

  public void setRegistroFiscal(String registroFiscal) {
    this.registroFiscal = registroFiscal;
  }

  public Remetente registroFiscal(String registroFiscal) {
    this.registroFiscal = registroFiscal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remetente {\n");
    
    sb.append("    numeroCpf: ").append(toIndentedString(numeroCpf)).append("\n");
    sb.append("    numeroCnpj: ").append(toIndentedString(numeroCnpj)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    registroFiscal: ").append(toIndentedString(registroFiscal)).append("\n");
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

