package br.gov.siscomex.portalunico.catp.model;

import br.gov.siscomex.portalunico.catp.model.ProdutoCampoCompostoIntegracaoDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoCampoCompostoMultivaloradoIntegracaoDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoCampoMultivaloradoIntegracaoDTO;
import br.gov.siscomex.portalunico.catp.model.ProdutoCampoSimplesIntegracaoDTO;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProdutoIntegracaoDTO", propOrder =
    { "seq", "codigo", "descricao", "denominacao", "cpfCnpjRaiz", "situacao", "modalidade", "ncm", "versao", "atributos", "atributosMultivalorados", "atributosCompostos", "atributosCompostosMultivalorados", "codigosInterno", "dataReferencia"
})

@XmlRootElement(name="ProdutoIntegracaoDTO")
public class ProdutoIntegracaoDTO  {
  
  @XmlElement(name="seq", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial utilizado para identificar o produto na lista, o retorno da validação se dará através deste sequencial <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos")
 /**
   * Número sequencial utilizado para identificar o produto na lista, o retorno da validação se dará através deste sequencial <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos
  **/
  private Integer seq = null;

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "123", value = "Código do produto. Informar somente quando for alterar/retificar um produto já cadastrado<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'")
 /**
   * Código do produto. Informar somente quando for alterar/retificar um produto já cadastrado<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'
  **/
  private Long codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Produto Teste", value = "Detalhamento complementar do produto<br>Tamanho: 3700")
 /**
   * Detalhamento complementar do produto<br>Tamanho: 3700
  **/
  private String descricao = null;

  @XmlElement(name="denominacao")
  @ApiModelProperty(example = "Denominação Produto Teste", value = "Denominação do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Denominação do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String denominacao = null;

  @XmlElement(name="cpfCnpjRaiz")
  @ApiModelProperty(example = "00000000", value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfCnpjRaiz = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(example = "ATIVADO", value = "Código e descrição da situação do produto <br>Domínio: <br>(ATIVADO <br>DESATIVADO <br>RASCUNHO)")
 /**
   * Código e descrição da situação do produto <br>Domínio: <br>(ATIVADO <br>DESATIVADO <br>RASCUNHO)
  **/
  private String situacao = null;

  @XmlElement(name="modalidade")
  @ApiModelProperty(example = "EXPORTACAO", value = "Modalidade de operacao <br>Domínio: (IMPORTACAO <br>EXPORTACAO)")
 /**
   * Modalidade de operacao <br>Domínio: (IMPORTACAO <br>EXPORTACAO)
  **/
  private String modalidade = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(example = "02011000", value = "NCM do produto<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * NCM do produto<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String ncm = null;

  @XmlElement(name="versao")
  @ApiModelProperty(example = "1", value = "Versão do produto (exemplo: '1') ou versão retificada do produto (exemplo: '1.1'). Informar somente quando estiver retificando uma versão do produto. <br>Tamanho máximo: 8")
 /**
   * Versão do produto (exemplo: '1') ou versão retificada do produto (exemplo: '1.1'). Informar somente quando estiver retificando uma versão do produto. <br>Tamanho máximo: 8
  **/
  private String versao = null;

  @XmlElement(name="atributos")
  @ApiModelProperty(value = "Lista de atributos da NCM informada")
  @Valid
 /**
   * Lista de atributos da NCM informada
  **/
  private List<ProdutoCampoSimplesIntegracaoDTO> atributos = null;

  @XmlElement(name="atributosMultivalorados")
  @ApiModelProperty(value = "Lista de atributos multivalorados da NCM informada")
  @Valid
 /**
   * Lista de atributos multivalorados da NCM informada
  **/
  private List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados = null;

  @XmlElement(name="atributosCompostos")
  @ApiModelProperty(value = "Lista de atributos compostos da NCM informada")
  @Valid
 /**
   * Lista de atributos compostos da NCM informada
  **/
  private List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos = null;

  @XmlElement(name="atributosCompostosMultivalorados")
  @ApiModelProperty(value = "Lista de atributos multivalorados compostos da NCM informada")
  @Valid
 /**
   * Lista de atributos multivalorados compostos da NCM informada
  **/
  private List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados = null;

  @XmlElement(name="codigosInterno")
  @ApiModelProperty(value = "Lista de códigos internos do produto do Exportador/Importador<br>Tamanho: 60")
 /**
   * Lista de códigos internos do produto do Exportador/Importador<br>Tamanho: 60
  **/
  private List<String> codigosInterno = null;

  @XmlElement(name="dataReferencia")
  @ApiModelProperty(value = "Data de referência, informar somente quando for criar produto com data retroativa<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de referência, informar somente quando for criar produto com data retroativa<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'
  **/
  private OffsetDateTime dataReferencia = null;
 /**
   * Número sequencial utilizado para identificar o produto na lista, o retorno da validação se dará através deste sequencial &lt;br&gt;Tamanho máximo: 3&lt;br&gt;Formato: Inteiro, com até 3 digitos
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

  public ProdutoIntegracaoDTO seq(Integer seq) {
    this.seq = seq;
    return this;
  }

 /**
   * Código do produto. Informar somente quando for alterar/retificar um produto já cadastrado&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;NNNNNNNNNN&#39;
   * @return codigo
  **/
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public ProdutoIntegracaoDTO codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Detalhamento complementar do produto&lt;br&gt;Tamanho: 3700
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ProdutoIntegracaoDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Denominação do produto&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return denominacao
  **/
  @JsonProperty("denominacao")
  public String getDenominacao() {
    return denominacao;
  }

  public void setDenominacao(String denominacao) {
    this.denominacao = denominacao;
  }

  public ProdutoIntegracaoDTO denominacao(String denominacao) {
    this.denominacao = denominacao;
    return this;
  }

 /**
   * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfCnpjRaiz
  **/
  @JsonProperty("cpfCnpjRaiz")
  public String getCpfCnpjRaiz() {
    return cpfCnpjRaiz;
  }

  public void setCpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
  }

  public ProdutoIntegracaoDTO cpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
    return this;
  }

 /**
   * Código e descrição da situação do produto &lt;br&gt;Domínio: &lt;br&gt;(ATIVADO &lt;br&gt;DESATIVADO &lt;br&gt;RASCUNHO)
   * @return situacao
  **/
  @JsonProperty("situacao")
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public ProdutoIntegracaoDTO situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Modalidade de operacao &lt;br&gt;Domínio: (IMPORTACAO &lt;br&gt;EXPORTACAO)
   * @return modalidade
  **/
  @JsonProperty("modalidade")
  public String getModalidade() {
    return modalidade;
  }

  public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
  }

  public ProdutoIntegracaoDTO modalidade(String modalidade) {
    this.modalidade = modalidade;
    return this;
  }

 /**
   * NCM do produto&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return ncm
  **/
  @JsonProperty("ncm")
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ProdutoIntegracaoDTO ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Versão do produto (exemplo: &#39;1&#39;) ou versão retificada do produto (exemplo: &#39;1.1&#39;). Informar somente quando estiver retificando uma versão do produto. &lt;br&gt;Tamanho máximo: 8
   * @return versao
  **/
  @JsonProperty("versao")
  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public ProdutoIntegracaoDTO versao(String versao) {
    this.versao = versao;
    return this;
  }

 /**
   * Lista de atributos da NCM informada
   * @return atributos
  **/
  @JsonProperty("atributos")
  public List<ProdutoCampoSimplesIntegracaoDTO> getAtributos() {
    return atributos;
  }

  public void setAtributos(List<ProdutoCampoSimplesIntegracaoDTO> atributos) {
    this.atributos = atributos;
  }

  public ProdutoIntegracaoDTO atributos(List<ProdutoCampoSimplesIntegracaoDTO> atributos) {
    this.atributos = atributos;
    return this;
  }

  public ProdutoIntegracaoDTO addAtributosItem(ProdutoCampoSimplesIntegracaoDTO atributosItem) {
    this.atributos.add(atributosItem);
    return this;
  }

 /**
   * Lista de atributos multivalorados da NCM informada
   * @return atributosMultivalorados
  **/
  @JsonProperty("atributosMultivalorados")
  public List<ProdutoCampoMultivaloradoIntegracaoDTO> getAtributosMultivalorados() {
    return atributosMultivalorados;
  }

  public void setAtributosMultivalorados(List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados) {
    this.atributosMultivalorados = atributosMultivalorados;
  }

  public ProdutoIntegracaoDTO atributosMultivalorados(List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados) {
    this.atributosMultivalorados = atributosMultivalorados;
    return this;
  }

  public ProdutoIntegracaoDTO addAtributosMultivaloradosItem(ProdutoCampoMultivaloradoIntegracaoDTO atributosMultivaloradosItem) {
    this.atributosMultivalorados.add(atributosMultivaloradosItem);
    return this;
  }

 /**
   * Lista de atributos compostos da NCM informada
   * @return atributosCompostos
  **/
  @JsonProperty("atributosCompostos")
  public List<ProdutoCampoCompostoIntegracaoDTO> getAtributosCompostos() {
    return atributosCompostos;
  }

  public void setAtributosCompostos(List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos) {
    this.atributosCompostos = atributosCompostos;
  }

  public ProdutoIntegracaoDTO atributosCompostos(List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos) {
    this.atributosCompostos = atributosCompostos;
    return this;
  }

  public ProdutoIntegracaoDTO addAtributosCompostosItem(ProdutoCampoCompostoIntegracaoDTO atributosCompostosItem) {
    this.atributosCompostos.add(atributosCompostosItem);
    return this;
  }

 /**
   * Lista de atributos multivalorados compostos da NCM informada
   * @return atributosCompostosMultivalorados
  **/
  @JsonProperty("atributosCompostosMultivalorados")
  public List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> getAtributosCompostosMultivalorados() {
    return atributosCompostosMultivalorados;
  }

  public void setAtributosCompostosMultivalorados(List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados) {
    this.atributosCompostosMultivalorados = atributosCompostosMultivalorados;
  }

  public ProdutoIntegracaoDTO atributosCompostosMultivalorados(List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados) {
    this.atributosCompostosMultivalorados = atributosCompostosMultivalorados;
    return this;
  }

  public ProdutoIntegracaoDTO addAtributosCompostosMultivaloradosItem(ProdutoCampoCompostoMultivaloradoIntegracaoDTO atributosCompostosMultivaloradosItem) {
    this.atributosCompostosMultivalorados.add(atributosCompostosMultivaloradosItem);
    return this;
  }

 /**
   * Lista de códigos internos do produto do Exportador/Importador&lt;br&gt;Tamanho: 60
   * @return codigosInterno
  **/
  @JsonProperty("codigosInterno")
  public List<String> getCodigosInterno() {
    return codigosInterno;
  }

  public void setCodigosInterno(List<String> codigosInterno) {
    this.codigosInterno = codigosInterno;
  }

  public ProdutoIntegracaoDTO codigosInterno(List<String> codigosInterno) {
    this.codigosInterno = codigosInterno;
    return this;
  }

  public ProdutoIntegracaoDTO addCodigosInternoItem(String codigosInternoItem) {
    this.codigosInterno.add(codigosInternoItem);
    return this;
  }

 /**
   * Data de referência, informar somente quando for criar produto com data retroativa&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataReferencia
  **/
  @JsonProperty("dataReferencia")
  public OffsetDateTime getDataReferencia() {
    return dataReferencia;
  }

  public void setDataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
  }

  public ProdutoIntegracaoDTO dataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoIntegracaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    denominacao: ").append(toIndentedString(denominacao)).append("\n");
    sb.append("    cpfCnpjRaiz: ").append(toIndentedString(cpfCnpjRaiz)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    modalidade: ").append(toIndentedString(modalidade)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    atributos: ").append(toIndentedString(atributos)).append("\n");
    sb.append("    atributosMultivalorados: ").append(toIndentedString(atributosMultivalorados)).append("\n");
    sb.append("    atributosCompostos: ").append(toIndentedString(atributosCompostos)).append("\n");
    sb.append("    atributosCompostosMultivalorados: ").append(toIndentedString(atributosCompostosMultivalorados)).append("\n");
    sb.append("    codigosInterno: ").append(toIndentedString(codigosInterno)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
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

