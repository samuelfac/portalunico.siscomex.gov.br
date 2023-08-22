package br.gov.siscomex.portalunico.catp.model;

import java.time.OffsetDateTime;
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
 @XmlType(name = "FabricanteIntegracaoDTO", propOrder =
    { "seq", "cpfCnpjRaiz", "codigoOperadorEstrangeiro", "cpfCnpjFabricante", "conhecido", "codigoProduto", "vincular", "dataReferencia", "codigoPais"
})

@XmlRootElement(name="FabricanteIntegracaoDTO")
public class FabricanteIntegracaoDTO  {
  
  @XmlElement(name="seq", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial utilizado para identificar o fabricante/produtor na lista, o retorno da validação se dará através deste sequencial  <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos")
 /**
   * Número sequencial utilizado para identificar o fabricante/produtor na lista, o retorno da validação se dará através deste sequencial  <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos
  **/
  private Integer seq = null;

  @XmlElement(name="cpfCnpjRaiz", required = true)
  @ApiModelProperty(example = "00000000", required = true, value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfCnpjRaiz = null;

  @XmlElement(name="codigoOperadorEstrangeiro")
  @ApiModelProperty(example = "123", value = "TTIN - Trade Identification Number (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35")
 /**
   * TTIN - Trade Identification Number (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35
  **/
  private String codigoOperadorEstrangeiro = null;

  @XmlElement(name="cpfCnpjFabricante")
  @ApiModelProperty(example = "00000000000000", value = "CPF/CNPJ do fabricante nacional<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF/CNPJ do fabricante nacional<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfCnpjFabricante = null;

  @XmlElement(name="conhecido")
  @ApiModelProperty(example = "false", value = "True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido <br>Formato: True/False")
 /**
   * True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido <br>Formato: True/False
  **/
  private Boolean conhecido = false;

  @XmlElement(name="codigoProduto")
  @ApiModelProperty(example = "1", value = "Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'")
 /**
   * Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'
  **/
  private Long codigoProduto = null;

  @XmlElement(name="vincular")
  @ApiModelProperty(example = "true", value = "True para novo vínculo e False para desvincular fabricante/produtor existente <br>Formato: True/False")
 /**
   * True para novo vínculo e False para desvincular fabricante/produtor existente <br>Formato: True/False
  **/
  private Boolean vincular = false;

  @XmlElement(name="dataReferencia")
  @ApiModelProperty(value = " Data de referência, informar somente quando for vincular fabricante/produtor com data retroativa. Não é possível desvincular fabricante/produtor retroativamente. Caso o campo \"Data de referência\" não tenha sido informado, o sistema assume como sendo a data atual.<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'")
 /**
   *  Data de referência, informar somente quando for vincular fabricante/produtor com data retroativa. Não é possível desvincular fabricante/produtor retroativamente. Caso o campo \"Data de referência\" não tenha sido informado, o sistema assume como sendo a data atual.<br>Tamanho: 10<br>Formato: 'yyyy-MM-dd'
  **/
  private OffsetDateTime dataReferencia = null;

  @XmlElement(name="codigoPais", required = true)
  @ApiModelProperty(example = "DE", required = true, value = "Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'")
 /**
   * Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'
  **/
  private String codigoPais = null;
 /**
   * Número sequencial utilizado para identificar o fabricante/produtor na lista, o retorno da validação se dará através deste sequencial  &lt;br&gt;Tamanho máximo: 3&lt;br&gt;Formato: Inteiro, com até 3 digitos
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

  public FabricanteIntegracaoDTO seq(Integer seq) {
    this.seq = seq;
    return this;
  }

 /**
   * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
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

  public FabricanteIntegracaoDTO cpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
    return this;
  }

 /**
   * TTIN - Trade Identification Number (Número de Identificação do Operador Estrangeiro)&lt;br&gt;Tamanho: 35
   * @return codigoOperadorEstrangeiro
  **/
  @JsonProperty("codigoOperadorEstrangeiro")
  public String getCodigoOperadorEstrangeiro() {
    return codigoOperadorEstrangeiro;
  }

  public void setCodigoOperadorEstrangeiro(String codigoOperadorEstrangeiro) {
    this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
  }

  public FabricanteIntegracaoDTO codigoOperadorEstrangeiro(String codigoOperadorEstrangeiro) {
    this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
    return this;
  }

 /**
   * CPF/CNPJ do fabricante nacional&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfCnpjFabricante
  **/
  @JsonProperty("cpfCnpjFabricante")
  public String getCpfCnpjFabricante() {
    return cpfCnpjFabricante;
  }

  public void setCpfCnpjFabricante(String cpfCnpjFabricante) {
    this.cpfCnpjFabricante = cpfCnpjFabricante;
  }

  public FabricanteIntegracaoDTO cpfCnpjFabricante(String cpfCnpjFabricante) {
    this.cpfCnpjFabricante = cpfCnpjFabricante;
    return this;
  }

 /**
   * True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido &lt;br&gt;Formato: True/False
   * @return conhecido
  **/
  @JsonProperty("conhecido")
  public Boolean isConhecido() {
    return conhecido;
  }

  public void setConhecido(Boolean conhecido) {
    this.conhecido = conhecido;
  }

  public FabricanteIntegracaoDTO conhecido(Boolean conhecido) {
    this.conhecido = conhecido;
    return this;
  }

 /**
   * Código do produto&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;NNNNNNNNNN&#39;
   * @return codigoProduto
  **/
  @JsonProperty("codigoProduto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public FabricanteIntegracaoDTO codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }

 /**
   * True para novo vínculo e False para desvincular fabricante/produtor existente &lt;br&gt;Formato: True/False
   * @return vincular
  **/
  @JsonProperty("vincular")
  public Boolean isVincular() {
    return vincular;
  }

  public void setVincular(Boolean vincular) {
    this.vincular = vincular;
  }

  public FabricanteIntegracaoDTO vincular(Boolean vincular) {
    this.vincular = vincular;
    return this;
  }

 /**
   *  Data de referência, informar somente quando for vincular fabricante/produtor com data retroativa. Não é possível desvincular fabricante/produtor retroativamente. Caso o campo \&quot;Data de referência\&quot; não tenha sido informado, o sistema assume como sendo a data atual.&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataReferencia
  **/
  @JsonProperty("dataReferencia")
  public OffsetDateTime getDataReferencia() {
    return dataReferencia;
  }

  public void setDataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
  }

  public FabricanteIntegracaoDTO dataReferencia(OffsetDateTime dataReferencia) {
    this.dataReferencia = dataReferencia;
    return this;
  }

 /**
   * Código do país de origem no formato ISO 3166&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: &#39;AA&#39;
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

  public FabricanteIntegracaoDTO codigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricanteIntegracaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    cpfCnpjRaiz: ").append(toIndentedString(cpfCnpjRaiz)).append("\n");
    sb.append("    codigoOperadorEstrangeiro: ").append(toIndentedString(codigoOperadorEstrangeiro)).append("\n");
    sb.append("    cpfCnpjFabricante: ").append(toIndentedString(cpfCnpjFabricante)).append("\n");
    sb.append("    conhecido: ").append(toIndentedString(conhecido)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    vincular: ").append(toIndentedString(vincular)).append("\n");
    sb.append("    dataReferencia: ").append(toIndentedString(dataReferencia)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
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

