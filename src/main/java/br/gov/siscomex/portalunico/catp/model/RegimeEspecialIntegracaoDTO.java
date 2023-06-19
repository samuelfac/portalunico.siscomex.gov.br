package br.gov.siscomex.portalunico.catp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "RegimeEspecialIntegracaoDTO", propOrder =
    { "seq", "codigoProduto", "cpfCnpjRaiz", "numeroAto", "numeroItem"
})

@XmlRootElement(name="RegimeEspecialIntegracaoDTO")
/**
  * Inclusão de atos concessórios em um produto já cadastrado
 **/
@ApiModel(description="Inclusão de atos concessórios em um produto já cadastrado")
public class RegimeEspecialIntegracaoDTO  {
  
  @XmlElement(name="seq", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Número sequencial utilizado para identificar o ato concessório na lista, o retorno da validação se dará através deste sequencial  <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos")
 /**
   * Número sequencial utilizado para identificar o ato concessório na lista, o retorno da validação se dará através deste sequencial  <br>Tamanho máximo: 3<br>Formato: Inteiro, com até 3 digitos
  **/
  private Integer seq = null;

  @XmlElement(name="codigoProduto")
  @ApiModelProperty(example = "1", value = "Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'")
 /**
   * Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'
  **/
  private Long codigoProduto = null;

  @XmlElement(name="cpfCnpjRaiz", required = true)
  @ApiModelProperty(example = "00000000", required = true, value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfCnpjRaiz = null;

  @XmlElement(name="numeroAto", required = true)
  @ApiModelProperty(example = "12345678912345", required = true, value = "Número do ato concessório<br>Tamanho: 14")
 /**
   * Número do ato concessório<br>Tamanho: 14
  **/
  private String numeroAto = null;

  @XmlElement(name="numeroItem", required = true)
  @ApiModelProperty(required = true, value = "Número do item do ato concessório <br>Tamanho: 6")
 /**
   * Número do item do ato concessório <br>Tamanho: 6
  **/
  private String numeroItem = null;
 /**
   * Número sequencial utilizado para identificar o ato concessório na lista, o retorno da validação se dará através deste sequencial  &lt;br&gt;Tamanho máximo: 3&lt;br&gt;Formato: Inteiro, com até 3 digitos
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

  public RegimeEspecialIntegracaoDTO seq(Integer seq) {
    this.seq = seq;
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

  public RegimeEspecialIntegracaoDTO codigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
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

  public RegimeEspecialIntegracaoDTO cpfCnpjRaiz(String cpfCnpjRaiz) {
    this.cpfCnpjRaiz = cpfCnpjRaiz;
    return this;
  }

 /**
   * Número do ato concessório&lt;br&gt;Tamanho: 14
   * @return numeroAto
  **/
  @JsonProperty("numeroAto")
  @NotNull
  public String getNumeroAto() {
    return numeroAto;
  }

  public void setNumeroAto(String numeroAto) {
    this.numeroAto = numeroAto;
  }

  public RegimeEspecialIntegracaoDTO numeroAto(String numeroAto) {
    this.numeroAto = numeroAto;
    return this;
  }

 /**
   * Número do item do ato concessório &lt;br&gt;Tamanho: 6
   * @return numeroItem
  **/
  @JsonProperty("numeroItem")
  @NotNull
  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public RegimeEspecialIntegracaoDTO numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegimeEspecialIntegracaoDTO {\n");
    
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    cpfCnpjRaiz: ").append(toIndentedString(cpfCnpjRaiz)).append("\n");
    sb.append("    numeroAto: ").append(toIndentedString(numeroAto)).append("\n");
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
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

