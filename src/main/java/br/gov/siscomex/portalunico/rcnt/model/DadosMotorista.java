package br.gov.siscomex.portalunico.rcnt.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosMotorista", propOrder =
    { "protocoloCredenciamento", "cpf", "nome"
})

@XmlRootElement(name="DadosMotorista")
public class DadosMotorista  {
  
  @XmlElement(name="protocoloCredenciamento")
  @ApiModelProperty(value = "Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36")
 /**
   * Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36
  **/
  private String protocoloCredenciamento = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "55555555555", value = "CPF Motorista<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF Motorista<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(required = true, value = "Nome Motorista. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Nome Motorista. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String nome = null;
 /**
   * Protocolo do credenciamento de pessoas (evento 5.1)&lt;br/&gt;Tamanho: 36
   * @return protocoloCredenciamento
  **/
  @JsonProperty("protocoloCredenciamento")
  public String getProtocoloCredenciamento() {
    return protocoloCredenciamento;
  }

  public void setProtocoloCredenciamento(String protocoloCredenciamento) {
    this.protocoloCredenciamento = protocoloCredenciamento;
  }

  public DadosMotorista protocoloCredenciamento(String protocoloCredenciamento) {
    this.protocoloCredenciamento = protocoloCredenciamento;
    return this;
  }

 /**
   * CPF Motorista&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public DadosMotorista cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Nome Motorista. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
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

  public DadosMotorista nome(String nome) {
    this.nome = nome;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosMotorista {\n");
    
    sb.append("    protocoloCredenciamento: ").append(toIndentedString(protocoloCredenciamento)).append("\n");
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

