package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosMotorista", propOrder =
    { "cpf", "nome", "protocoloCredenciamento"
})

@XmlRootElement(name="DadosMotorista")
public class DadosMotorista  {
  
  @XmlElement(name="cpf")
  @ApiModelProperty(example = "55555555555", value = "CPF do motorista.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do motorista.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(required = true, value = "Nome do motorista. Obrigatório em eventos \"operacao=C (Acesso)\". Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Nome do motorista. Obrigatório em eventos \"operacao=C (Acesso)\". Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String nome = null;

  @XmlElement(name="protocoloCredenciamento")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36")
 /**
   * Protocolo do credenciamento de pessoas (evento 5.1)<br/>Tamanho: 36
  **/
  private String protocoloCredenciamento = null;
 /**
   * CPF do motorista.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
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
   * Nome do motorista. Obrigatório em eventos \&quot;operacao&#x3D;C (Acesso)\&quot;. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosMotorista {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    protocoloCredenciamento: ").append(toIndentedString(protocoloCredenciamento)).append("\n");
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

