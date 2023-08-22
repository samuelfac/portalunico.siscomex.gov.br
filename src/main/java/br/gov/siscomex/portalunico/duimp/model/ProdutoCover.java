package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ProdutoCover", propOrder =
    { "codigoProduto", "versaoProduto", "cnpjProduto", "codigoNCM", "paisOrigem"
})

@XmlRootElement(name="ProdutoCover")
/**
  * Dados do produto
 **/
@ApiModel(description="Dados do produto")
public class ProdutoCover  {
  
  @XmlElement(name="codigoProduto")
  @ApiModelProperty(example = "10", value = "Código do produto<br>Formato: Inteiro, com até 10 digitos")
 /**
   * Código do produto<br>Formato: Inteiro, com até 10 digitos
  **/
  private String codigoProduto = null;

  @XmlElement(name="versaoProduto")
  @ApiModelProperty(example = "1", value = "Versão do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
 /**
   * Versão do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
  **/
  private String versaoProduto = null;

  @XmlElement(name="cnpjProduto")
  @ApiModelProperty(example = "00000000", value = "Cnpj do operador estrangeiro (raiz)<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * Cnpj do operador estrangeiro (raiz)<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String cnpjProduto = null;

  @XmlElement(name="codigoNCM")
  @ApiModelProperty(example = "49019100", value = "Código NCM<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
 /**
   * Código NCM<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
  **/
  private String codigoNCM = null;

  @XmlElement(name="paisOrigem")
  @ApiModelProperty(value = "")
  @Valid
  private PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem = null;
 /**
   * Código do produto&lt;br&gt;Formato: Inteiro, com até 10 digitos
   * @return codigoProduto
  **/
  @JsonProperty("codigoProduto")
  public String getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public ProdutoCover codigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }

 /**
   * Versão do produto&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
   * @return versaoProduto
  **/
  @JsonProperty("versaoProduto")
  public String getVersaoProduto() {
    return versaoProduto;
  }

  public void setVersaoProduto(String versaoProduto) {
    this.versaoProduto = versaoProduto;
  }

  public ProdutoCover versaoProduto(String versaoProduto) {
    this.versaoProduto = versaoProduto;
    return this;
  }

 /**
   * Cnpj do operador estrangeiro (raiz)&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return cnpjProduto
  **/
  @JsonProperty("cnpjProduto")
  public String getCnpjProduto() {
    return cnpjProduto;
  }

  public void setCnpjProduto(String cnpjProduto) {
    this.cnpjProduto = cnpjProduto;
  }

  public ProdutoCover cnpjProduto(String cnpjProduto) {
    this.cnpjProduto = cnpjProduto;
    return this;
  }

 /**
   * Código NCM&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
   * @return codigoNCM
  **/
  @JsonProperty("codigoNCM")
  public String getCodigoNCM() {
    return codigoNCM;
  }

  public void setCodigoNCM(String codigoNCM) {
    this.codigoNCM = codigoNCM;
  }

  public ProdutoCover codigoNCM(String codigoNCM) {
    this.codigoNCM = codigoNCM;
    return this;
  }

 /**
   * Get paisOrigem
   * @return paisOrigem
  **/
  @JsonProperty("paisOrigem")
  public PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio getPaisOrigem() {
    return paisOrigem;
  }

  public void setPaisOrigem(PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem) {
    this.paisOrigem = paisOrigem;
  }

  public ProdutoCover paisOrigem(PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem) {
    this.paisOrigem = paisOrigem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoCover {\n");
    
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    versaoProduto: ").append(toIndentedString(versaoProduto)).append("\n");
    sb.append("    cnpjProduto: ").append(toIndentedString(cnpjProduto)).append("\n");
    sb.append("    codigoNCM: ").append(toIndentedString(codigoNCM)).append("\n");
    sb.append("    paisOrigem: ").append(toIndentedString(paisOrigem)).append("\n");
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

