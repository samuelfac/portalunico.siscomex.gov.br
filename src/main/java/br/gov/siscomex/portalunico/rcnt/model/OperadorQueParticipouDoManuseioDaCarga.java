package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OperadorQueParticipouDoManuseioDaCarga", propOrder =
    { "idElemento", "cpf", "nome"
})

@XmlRootElement(name="OperadorQueParticipouDoManuseioDaCarga")
public class OperadorQueParticipouDoManuseioDaCarga  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "55555555555", value = "Informar o CPF do operador que manuseou a carga<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * Informar o CPF do operador que manuseou a carga<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Informar o nome do operador que manuseou a carga<br/>Tamanho: 100")
 /**
   * Informar o nome do operador que manuseou a carga<br/>Tamanho: 100
  **/
  private String nome = null;
 /**
   * Identificação de cada elemento da lista.&lt;br/&gt;Tamanho: 40
   * @return idElemento
  **/
  @JsonProperty("idElemento")
  public String getIdElemento() {
    return idElemento;
  }

  public void setIdElemento(String idElemento) {
    this.idElemento = idElemento;
  }

  public OperadorQueParticipouDoManuseioDaCarga idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Informar o CPF do operador que manuseou a carga&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public OperadorQueParticipouDoManuseioDaCarga cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Informar o nome do operador que manuseou a carga&lt;br/&gt;Tamanho: 100
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public OperadorQueParticipouDoManuseioDaCarga nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperadorQueParticipouDoManuseioDaCarga {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

