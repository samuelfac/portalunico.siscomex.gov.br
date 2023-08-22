package br.gov.siscomex.portalunico.cct_ext.model;

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
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemNFF", propOrder =
    { "numeroItem", "codigoProduto", "ncm", "descricaoProduto", "cfop", "valorTotal", "quantidadeMedidaEstatistica"
})

@XmlRootElement(name="ItemNFF")
/**
  * Item da Nota Fiscal Formulário
 **/
@ApiModel(description="Item da Nota Fiscal Formulário")
public class ItemNFF  {
  
  @XmlElement(name="numeroItem", required = true)
  @ApiModelProperty(example = "001", required = true, value = "Número do item<br>Tamanho: 3<br>Formato: NNN<br>Não será permitida a inclusão de itens duplicados.")
 /**
   * Número do item<br>Tamanho: 3<br>Formato: NNN<br>Não será permitida a inclusão de itens duplicados.
  **/
  private String numeroItem = null;

  @XmlElement(name="codigoProduto", required = true)
  @ApiModelProperty(example = "24011010", required = true, value = "Código do produto<br>Tamanho: 60")
 /**
   * Código do produto<br>Tamanho: 60
  **/
  private String codigoProduto = null;

  @XmlElement(name="ncm", required = true)
  @ApiModelProperty(example = "01022190", required = true, value = "Código NCM do produto<br>Tamanho: 8")
 /**
   * Código NCM do produto<br>Tamanho: 8
  **/
  private String ncm = null;

  @XmlElement(name="descricaoProduto", required = true)
  @ApiModelProperty(example = "Descrição do produto", required = true, value = "Descrição do produto<br>Tamanho: 256")
 /**
   * Descrição do produto<br>Tamanho: 256
  **/
  private String descricaoProduto = null;

  @XmlElement(name="cfop", required = true)
  @ApiModelProperty(example = "5504", required = true, value = "Código Fiscal de Operações e Prestações<br>Tamanho: 4")
 /**
   * Código Fiscal de Operações e Prestações<br>Tamanho: 4
  **/
  private String cfop = null;

  @XmlElement(name="valorTotal", required = true)
  @ApiModelProperty(example = "100.0", required = true, value = "Valor total<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto")
  @Valid
 /**
   * Valor total<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto
  **/
  private BigDecimal valorTotal = null;

  @XmlElement(name="quantidadeMedidaEstatistica", required = true)
  @ApiModelProperty(example = "50", required = true, value = "Quantidade na medida estatística definida para a NCM<br>Tamanho: 16.5<br>Formato: Decimal, com cinco casas decimais separadas por ponto")
 /**
   * Quantidade na medida estatística definida para a NCM<br>Tamanho: 16.5<br>Formato: Decimal, com cinco casas decimais separadas por ponto
  **/
  private String quantidadeMedidaEstatistica = null;
 /**
   * Número do item&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: NNN&lt;br&gt;Não será permitida a inclusão de itens duplicados.
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

  public ItemNFF numeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
    return this;
  }

 /**
   * Código do produto&lt;br&gt;Tamanho: 60
   * @return codigoProduto
  **/
  @JsonProperty("codigoProduto")
  @NotNull
  public String getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public ItemNFF codigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }

 /**
   * Código NCM do produto&lt;br&gt;Tamanho: 8
   * @return ncm
  **/
  @JsonProperty("ncm")
  @NotNull
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ItemNFF ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Descrição do produto&lt;br&gt;Tamanho: 256
   * @return descricaoProduto
  **/
  @JsonProperty("descricaoProduto")
  @NotNull
  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public ItemNFF descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }

 /**
   * Código Fiscal de Operações e Prestações&lt;br&gt;Tamanho: 4
   * @return cfop
  **/
  @JsonProperty("cfop")
  @NotNull
  public String getCfop() {
    return cfop;
  }

  public void setCfop(String cfop) {
    this.cfop = cfop;
  }

  public ItemNFF cfop(String cfop) {
    this.cfop = cfop;
    return this;
  }

 /**
   * Valor total&lt;br&gt;Tamanho: 15.2&lt;br&gt;Formato: Decimal, com duas casas decimais separadas por ponto
   * @return valorTotal
  **/
  @JsonProperty("valorTotal")
  @NotNull
  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public ItemNFF valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

 /**
   * Quantidade na medida estatística definida para a NCM&lt;br&gt;Tamanho: 16.5&lt;br&gt;Formato: Decimal, com cinco casas decimais separadas por ponto
   * @return quantidadeMedidaEstatistica
  **/
  @JsonProperty("quantidadeMedidaEstatistica")
  @NotNull
  public String getQuantidadeMedidaEstatistica() {
    return quantidadeMedidaEstatistica;
  }

  public void setQuantidadeMedidaEstatistica(String quantidadeMedidaEstatistica) {
    this.quantidadeMedidaEstatistica = quantidadeMedidaEstatistica;
  }

  public ItemNFF quantidadeMedidaEstatistica(String quantidadeMedidaEstatistica) {
    this.quantidadeMedidaEstatistica = quantidadeMedidaEstatistica;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNFF {\n");
    
    sb.append("    numeroItem: ").append(toIndentedString(numeroItem)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    cfop: ").append(toIndentedString(cfop)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    quantidadeMedidaEstatistica: ").append(toIndentedString(quantidadeMedidaEstatistica)).append("\n");
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

