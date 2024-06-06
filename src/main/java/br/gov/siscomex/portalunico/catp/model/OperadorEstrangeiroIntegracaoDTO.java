package br.gov.siscomex.portalunico.catp.model;

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
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "OperadorEstrangeiroIntegracaoDTO", propOrder =
    { "seq", "cpfCnpjRaiz", "codigo", "versao", "tin", "nome", "situacao", "logradouro", "nomeCidade", "codigoSubdivisaoPais", "codigoPais", "cep", "codigoInterno", "email", "dataReferencia", "identificacoesAdicionais"
})

@XmlRootElement(name="OperadorEstrangeiroIntegracaoDTO")
/**
  * Retorna os dados de uma versão do operador estrangeiro.
 **/
@ApiModel(description="Retorna os dados de uma versão do operador estrangeiro.")
public class OperadorEstrangeiroIntegracaoDTO  {
  
  @XmlElement(name="seq", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial utilizado para identificar o item na lista. O retorno da validação se dará através desse número. <br>Tamanho máximo: 3. <br> Importante: A lista enviada deve conter, no máximo, 100 elementos.")
 /**
  * Número sequencial utilizado para identificar o item na lista. O retorno da validação se dará através desse número. <br>Tamanho máximo: 3. <br> Importante: A lista enviada deve conter, no máximo, 100 elementos.
  **/
  private Integer seq = null;

  @XmlElement(name="cpfCnpjRaiz", required = true)
  @ApiModelProperty(example = "00000000", required = true, value = "CPF ou CNPJ raiz do importador/exportador. Informar os 8 primeiros digitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF ou CNPJ raiz do importador/exportador. Informar os 8 primeiros digitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfCnpjRaiz = null;

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "OPE_1", required = true, value = "Código do Operador Estrangeiro (utilizado somente para retorno de valor)<br>Tamanho: 35")
 /**
   * Código do Operador Estrangeiro (utilizado somente para retorno de valor)<br>Tamanho: 35
  **/
  private String codigo = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão do Operador Estrangeiro (utilizado somente para retorno de valor)<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * Versão do Operador Estrangeiro (utilizado somente para retorno de valor)<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String versao = null;

  @XmlElement(name="tin")
  @ApiModelProperty(example = "123", value = "TIN - Trade Identification Number (Número de Identificação do Operador)<br>Tamanho: 35")
 /**
   * TIN - Trade Identification Number (Número de Identificação do Operador)<br>Tamanho: 35
  **/
  private String tin = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(example = "Fornecedor 123", required = true, value = "Nome/Razão Social do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
 /**
   * Nome/Razão Social do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
  **/
  private String nome = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "ATIVADO", value = "Situação do Operador Estrangeiro<br>ATIVADO, DESATIVADO")
 /**
   * Situação do Operador Estrangeiro<br>ATIVADO, DESATIVADO
  **/
  private String situacao = null;

  @XmlElement(name="logradouro", required = true)
  @ApiModelProperty(example = "Rua teste, 155, Bairro teste", required = true, value = "Logradouro do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70")
 /**
   * Logradouro do Operador Estrangeiro<br>Tamanho mínimo: 1<br>Tamanho máximo: 70
  **/
  private String logradouro = null;

  @XmlElement(name="nomeCidade", required = true)
  @ApiModelProperty(example = "Buenos Aires", required = true, value = "Nome da Cidade<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
 /**
   * Nome da Cidade<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
  **/
  private String nomeCidade = null;

  @XmlElement(name="codigoSubdivisaoPais")
  @ApiModelProperty(example = "AR-B", value = "Código da subdivisao do país. Usar tabela ISO 3166<br>Tamanho máximo: 6<br>Formato: 'AA-AAA'")
 /**
   * Código da subdivisao do país. Usar tabela ISO 3166<br>Tamanho máximo: 6<br>Formato: 'AA-AAA'
  **/
  private String codigoSubdivisaoPais = null;

  @XmlElement(name="codigoPais", required = true)
  @ApiModelProperty(example = "AR", required = true, value = "Código do país. Usar tabela ISO 3166<br>Tamanho: 2<br>Formato: 'AA'")
 /**
   * Código do país. Usar tabela ISO 3166<br>Tamanho: 2<br>Formato: 'AA'
  **/
  private String codigoPais = null;

  @XmlElement(name="cep")
  @ApiModelProperty(example = "12345", value = "Código postal<br>Tamanho: 9")
 /**
   * Código postal<br>Tamanho: 9
  **/
  private String cep = null;

  @XmlElement(name="codigoInterno")
  @ApiModelProperty(example = "12345", value = "Código interno para uso em outros sitemas<br>Tamanho: 35")
 /**
   * Código interno para uso em outros sitemas<br>Tamanho: 35
  **/
  private String codigoInterno = null;

  @XmlElement(name="email")
  @ApiModelProperty(example = "email@email.com", value = "E-mail do Operador Estrangeiro<br>Tamanho: 70")
 /**
   * E-mail do Operador Estrangeiro<br>Tamanho: 70
  **/
  private String email = null;

  @XmlElement(name="dataReferencia")
  @ApiModelProperty(value = "Data de referência, informar somente quando for criar Operador Estrangeiro com data retroativa<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de referência, informar somente quando for criar Operador Estrangeiro com data retroativa<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'
  **/
  private OffsetDateTime dataReferencia = null;

  @XmlElement(name="identificacoesAdicionais")
  @ApiModelProperty(value = "Lista de identificações adicionais do operador estrangeiro em agências internacionais.")
  @Valid
 /**
   * Lista de identificações adicionais do operador estrangeiro em agências internacionais.
  **/
  private List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais = null;
 /**
  * Número sequencial utilizado para identificar o item na lista. O retorno da validação se dará através desse número. &lt;br&gt;Tamanho máximo: 3. &lt;br&gt; Importante: A lista enviada deve conter, no máximo, 100 elementos.
   * @return seq
  **/
  @JsonProperty("seq")
  @NotNull
  public Integer getSeq() {
    return seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public OperadorEstrangeiroIntegracaoDTO seq(Integer seq) {
    this.seq = seq;
    return this;
  }

 /**
   * CPF ou CNPJ raiz do importador/exportador. Informar os 8 primeiros digitos do CNPJ, suprimindo os pontos&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfCnpjRaiz
  **/
  @JsonProperty("cpfCnpjRaiz")
  @NotNull
  public String getCpfCnpjRaiz() {
    return cpfCnpjRaiz;
  }

  public void setCpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
  }

  public OperadorEstrangeiroIntegracaoDTO cpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
    return this;
  }

 /**
   * Código do Operador Estrangeiro (utilizado somente para retorno de valor)&lt;br&gt;Tamanho: 35
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public OperadorEstrangeiroIntegracaoDTO codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Versão do Operador Estrangeiro (utilizado somente para retorno de valor)&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public OperadorEstrangeiroIntegracaoDTO versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * TIN - Trade Identification Number (Número de Identificação do Operador)&lt;br&gt;Tamanho: 35
   * @return tin
  **/
  @JsonProperty("tin")
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }

  public OperadorEstrangeiroIntegracaoDTO tin(String tin) {
    this.tin = tin;
    return this;
  }

 /**
   * Nome/Razão Social do Operador Estrangeiro&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
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

  public OperadorEstrangeiroIntegracaoDTO nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Situação do Operador Estrangeiro&lt;br&gt;ATIVADO, DESATIVADO
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public OperadorEstrangeiroIntegracaoDTO situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Logradouro do Operador Estrangeiro&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 70
   * @return logradouro
  **/
  @JsonProperty("logradouro")
  @NotNull
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public OperadorEstrangeiroIntegracaoDTO logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

 /**
   * Nome da Cidade&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
   * @return nomeCidade
  **/
  @JsonProperty("nomeCidade")
  @NotNull
  public String getNomeCidade() {
    return nomeCidade;
  }

  public void setNomeCidade(String nomeCidade) {
    this.nomeCidade = nomeCidade;
  }

  public OperadorEstrangeiroIntegracaoDTO nomeCidade(String nomeCidade) {
    this.nomeCidade = nomeCidade;
    return this;
  }

 /**
   * Código da subdivisao do país. Usar tabela ISO 3166&lt;br&gt;Tamanho máximo: 6&lt;br&gt;Formato: &#39;AA-AAA&#39;
   * @return codigoSubdivisaoPais
  **/
  @JsonProperty("codigoSubdivisaoPais")
  public String getCodigoSubdivisaoPais() {
    return codigoSubdivisaoPais;
  }

  public void setCodigoSubdivisaoPais(String codigoSubdivisaoPais) {
    this.codigoSubdivisaoPais = codigoSubdivisaoPais;
  }

  public OperadorEstrangeiroIntegracaoDTO codigoSubdivisaoPais(String codigoSubdivisaoPais) {
    this.codigoSubdivisaoPais = codigoSubdivisaoPais;
    return this;
  }

 /**
   * Código do país. Usar tabela ISO 3166&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: &#39;AA&#39;
   * @return codigoPais
  **/
  @JsonProperty("codigoPais")
  @NotNull
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public OperadorEstrangeiroIntegracaoDTO codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

 /**
   * Código postal&lt;br&gt;Tamanho: 9
   * @return cep
  **/
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public OperadorEstrangeiroIntegracaoDTO cep(String cep) {
    this.cep = cep;
    return this;
  }

 /**
   * Código interno para uso em outros sitemas&lt;br&gt;Tamanho: 35
   * @return codigoInterno
  **/
  @JsonProperty("codigoInterno")
  public String getCodigoInterno() {
    return codigoInterno;
  }

  public void setCodigoInterno(String codigoInterno) {
    this.codigoInterno = codigoInterno;
  }

  public OperadorEstrangeiroIntegracaoDTO codigoInterno(String codigoInterno) {
    this.codigoInterno = codigoInterno;
    return this;
  }

 /**
   * E-mail do Operador Estrangeiro&lt;br&gt;Tamanho: 70
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OperadorEstrangeiroIntegracaoDTO email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Data de referência, informar somente quando for criar Operador Estrangeiro com data retroativa&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataReferencia
  **/
  @JsonProperty("dataReferencia")
  public OffsetDateTime getDataReferencia() {
    return dataReferencia;
  }

  public void setDataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
  }

  public OperadorEstrangeiroIntegracaoDTO dataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
    return this;
  }

 /**
   * Lista de identificações adicionais do operador estrangeiro em agências internacionais.
   * @return identificacoesAdicionais
  **/
  @JsonProperty("identificacoesAdicionais")
  public List<IdentificacaoAdicionalIntegracaoDTO> getIdentificacoesAdicionais() {
    return identificacoesAdicionais;
  }

  public void setIdentificacoesAdicionais(List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais) {
    this.identificacoesAdicionais = identificacoesAdicionais;
  }

  public OperadorEstrangeiroIntegracaoDTO identificacoesAdicionais(List<IdentificacaoAdicionalIntegracaoDTO> identificacoesAdicionais) {
    this.identificacoesAdicionais = identificacoesAdicionais;
    return this;
  }

  public OperadorEstrangeiroIntegracaoDTO addIdentificacoesAdicionaisItem(IdentificacaoAdicionalIntegracaoDTO identificacoesAdicionaisItem) {
    this.identificacoesAdicionais.add(identificacoesAdicionaisItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperadorEstrangeiroIntegracaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    cpfCnpjRaiz: ").append(toIndentedString(cpfCnpjRaiz)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    nomeCidade: ").append(toIndentedString(nomeCidade)).append("\n");
    sb.append("    codigoSubdivisaoPais: ").append(toIndentedString(codigoSubdivisaoPais)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    codigoInterno: ").append(toIndentedString(codigoInterno)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
    sb.append("    identificacoesAdicionais: ").append(toIndentedString(identificacoesAdicionais)).append("\n");
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

