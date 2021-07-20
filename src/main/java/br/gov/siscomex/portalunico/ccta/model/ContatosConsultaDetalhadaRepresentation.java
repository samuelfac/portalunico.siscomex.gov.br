package br.gov.siscomex.portalunico.ccta.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ContatosConsultaDetalhadaRepresentation", propOrder =
    { "nome", "telefone", "email"
})

@XmlRootElement(name="ContatosConsultaDetalhadaRepresentation")
public class ContatosConsultaDetalhadaRepresentation  {
  
  @XmlElement(name="nome")
  @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do contato<br/> Tamanho: 70<br/>")
 /**
   * Nome do contato<br/> Tamanho: 70<br/>
  **/
  private String nome = null;

  @XmlElement(name="telefone")
  @ApiModelProperty(example = "+55 21 9999 99 99", value = "Telefone do contato<br/> Tamanho: 35<br/>")
 /**
   * Telefone do contato<br/> Tamanho: 35<br/>
  **/
  private String telefone = null;

  @XmlElement(name="email")
  @ApiModelProperty(example = "email@provedor.com.br", value = "E-mail do contato<br/> Tamanho: 35<br/>")
 /**
   * E-mail do contato<br/> Tamanho: 35<br/>
  **/
  private String email = null;
 /**
   * Nome do contato&lt;br/&gt; Tamanho: 70&lt;br/&gt;
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ContatosConsultaDetalhadaRepresentation nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Telefone do contato&lt;br/&gt; Tamanho: 35&lt;br/&gt;
   * @return telefone
  **/
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public ContatosConsultaDetalhadaRepresentation telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

 /**
   * E-mail do contato&lt;br/&gt; Tamanho: 35&lt;br/&gt;
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContatosConsultaDetalhadaRepresentation email(String email) {
    this.email = email;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContatosConsultaDetalhadaRepresentation {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

