package br.gov.siscomex.portalunico.rcnt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica", propOrder =
    { "idElemento", "cpf", "nome", "qualificacao"
})

@XmlRootElement(name="DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica")
public class DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica  {
  
  @XmlElement(name="idElemento")
  @ApiModelProperty(value = "Identificação de cada elemento da lista.<br/>Tamanho: 40")
 /**
   * Identificação de cada elemento da lista.<br/>Tamanho: 40
  **/
  private String idElemento = null;

  @XmlElement(name="cpf")
  @ApiModelProperty(value = "Informar o CPF da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * Informar o CPF da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="nome")
  @ApiModelProperty(value = "Informar o nome da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.<br/>Tamanho: 100")
 /**
   * Informar o nome da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.<br/>Tamanho: 100
  **/
  private String nome = null;

  @XmlElement(name="qualificacao")
  @ApiModelProperty(value = "Qualificação (Importador, Exportador, Despachante, Ajudante de Despachante, Transportador, Depositário ou seu preposto ...)<br/>Tamanho: 100")
 /**
   * Qualificação (Importador, Exportador, Despachante, Ajudante de Despachante, Transportador, Depositário ou seu preposto ...)<br/>Tamanho: 100
  **/
  private String qualificacao = null;
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

  public DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica idElemento(String idElemento) {
    this.idElemento = idElemento;
    return this;
  }

 /**
   * Informar o CPF da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Informar o nome da pessoa que acompanhou o posicionamento da carga e/ou a conferência física.&lt;br/&gt;Tamanho: 100
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Qualificação (Importador, Exportador, Despachante, Ajudante de Despachante, Transportador, Depositário ou seu preposto ...)&lt;br/&gt;Tamanho: 100
   * @return qualificacao
  **/
  @JsonProperty("qualificacao")
  public String getQualificacao() {
    return qualificacao;
  }

  public void setQualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
  }

  public DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica qualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica {\n");
    
    sb.append("    idElemento: ").append(toIndentedString(idElemento)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    qualificacao: ").append(toIndentedString(qualificacao)).append("\n");
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

