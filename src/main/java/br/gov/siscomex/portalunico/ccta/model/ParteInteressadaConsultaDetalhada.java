package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ParteInteressadaConsultaDetalhada", propOrder =
    { "caixaPostal", "cidade", "contatos", "endereco", "nome", "pais", "tipo"
})

@XmlRootElement(name="ParteInteressadaConsultaDetalhada")
public class ParteInteressadaConsultaDetalhada  {
  
  @XmlElement(name="caixaPostal")
  @ApiModelProperty(example = "29292-929", value = "Endereço postal da parte interessada<br/>Tamanho máximo: 70")
 /**
   * Endereço postal da parte interessada<br/>Tamanho máximo: 70
  **/
  private String caixaPostal = null;

  @XmlElement(name="cidade")
  @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade da parte interessada<br/>Tamanho máximo: 70")
 /**
   * Cidade da parte interessada<br/>Tamanho máximo: 70
  **/
  private String cidade = null;

  @XmlElement(name="contatos")
  @ApiModelProperty(value = "Lista de contatos da parte interessada.")
  @Valid
 /**
   * Lista de contatos da parte interessada.
  **/
  private List<ContatoConsultaDetalhada> contatos = null;

  @XmlElement(name="endereco")
  @ApiModelProperty(example = "CZIFFLAF, 3394", value = "Endereco da parte interessada<br/>Tamanho máximo: 70")
 /**
   * Endereco da parte interessada<br/>Tamanho máximo: 70
  **/
  private String endereco = null;

  @XmlElement(name="nome")
  @ApiModelProperty(example = "Banco do Brasil", value = "Nome da parte interessada<br/> Tamanho: 70<br/>")
 /**
   * Nome da parte interessada<br/> Tamanho: 70<br/>
  **/
  private String nome = null;

  @XmlElement(name="pais")
  @ApiModelProperty(example = "BR", value = "País da parte interessada<br/>Tamanho máximo: 2<br/>Formato: AA")
 /**
   * País da parte interessada<br/>Tamanho máximo: 2<br/>Formato: AA
  **/
  private String pais = null;

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "2", value = "Tipo da parte interessada<br/> Tamanho: 1<br/>1 - Consignatário<br/>2 - Embarcador<br/>3 - Agente de carga<br/>4 - Outras partes interessadas<br/>")
 /**
   * Tipo da parte interessada<br/> Tamanho: 1<br/>1 - Consignatário<br/>2 - Embarcador<br/>3 - Agente de carga<br/>4 - Outras partes interessadas<br/>
  **/
  private String tipo = null;
 /**
   * Endereço postal da parte interessada&lt;br/&gt;Tamanho máximo: 70
   * @return caixaPostal
  **/
  @JsonProperty("caixaPostal")
  public String getCaixaPostal() {
    return caixaPostal;
  }

  public void setCaixaPostal(String caixaPostal) {
    this.caixaPostal = caixaPostal;
  }

  public ParteInteressadaConsultaDetalhada caixaPostal(String caixaPostal) {
    this.caixaPostal = caixaPostal;
    return this;
  }

 /**
   * Cidade da parte interessada&lt;br/&gt;Tamanho máximo: 70
   * @return cidade
  **/
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public ParteInteressadaConsultaDetalhada cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

 /**
   * Lista de contatos da parte interessada.
   * @return contatos
  **/
  @JsonProperty("contatos")
  public List<ContatoConsultaDetalhada> getContatos() {
    return contatos;
  }

  public void setContatos(List<ContatoConsultaDetalhada> contatos) {
    this.contatos = contatos;
  }

  public ParteInteressadaConsultaDetalhada contatos(List<ContatoConsultaDetalhada> contatos) {
    this.contatos = contatos;
    return this;
  }

  public ParteInteressadaConsultaDetalhada addContatosItem(ContatoConsultaDetalhada contatosItem) {
    this.contatos.add(contatosItem);
    return this;
  }

 /**
   * Endereco da parte interessada&lt;br/&gt;Tamanho máximo: 70
   * @return endereco
  **/
  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public ParteInteressadaConsultaDetalhada endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

 /**
   * Nome da parte interessada&lt;br/&gt; Tamanho: 70&lt;br/&gt;
   * @return nome
  **/
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ParteInteressadaConsultaDetalhada nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * País da parte interessada&lt;br/&gt;Tamanho máximo: 2&lt;br/&gt;Formato: AA
   * @return pais
  **/
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public ParteInteressadaConsultaDetalhada pais(String pais) {
    this.pais = pais;
    return this;
  }

 /**
   * Tipo da parte interessada&lt;br/&gt; Tamanho: 1&lt;br/&gt;1 - Consignatário&lt;br/&gt;2 - Embarcador&lt;br/&gt;3 - Agente de carga&lt;br/&gt;4 - Outras partes interessadas&lt;br/&gt;
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public ParteInteressadaConsultaDetalhada tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParteInteressadaConsultaDetalhada {\n");
    
    sb.append("    caixaPostal: ").append(toIndentedString(caixaPostal)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    contatos: ").append(toIndentedString(contatos)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

