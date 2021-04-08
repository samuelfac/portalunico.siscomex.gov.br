package br.gov.siscomex.portalunico.due.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ItemDaNotaFiscalRemoteDTO", propOrder =
    { "apresentadaParaDespacho", "cfop", "codigoDoProduto", "descricao", "ncm", "notaFiscal", "numeroDoItem", "quantidadeConsumida", "quantidadeEstatistica", "unidadeComercial", "valorTotalBruto", "valorTotalCalculado"
})

@XmlRootElement(name="ItemDaNotaFiscalRemoteDTO")
public class ItemDaNotaFiscalRemoteDTO  {
  
  @XmlElement(name="apresentadaParaDespacho")
  @ApiModelProperty(value = "")
  private Boolean apresentadaParaDespacho = false;

  @XmlElement(name="cfop")
  @ApiModelProperty(value = "CFOP<br />Formato: Inteiro, com até 3 digitos")
 /**
   * CFOP<br />Formato: Inteiro, com até 3 digitos
  **/
  private Integer cfop = null;

  @XmlElement(name="codigoDoProduto")
  @ApiModelProperty(value = "Código do produto<br />Tamanho mínimo: 1<br />Tamanho máximo: 60")
 /**
   * Código do produto<br />Tamanho mínimo: 1<br />Tamanho máximo: 60
  **/
  private String codigoDoProduto = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 256")
 /**
   * Descrição<br />Tamanho mínimo: 1<br />Tamanho máximo: 256
  **/
  private String descricao = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(value = "")
  @Valid
  private NcmDto ncm = null;

  @XmlElement(name="notaFiscal")
  @ApiModelProperty(value = "")
  @Valid
  private NotaFiscalRemoteDTO notaFiscal = null;

  @XmlElement(name="numeroDoItem")
  @ApiModelProperty(value = "Número<br />Tamanho: 3,0<br />Formato: Decimal, com 0 casas decimais.")
  @Valid
 /**
   * Número<br />Tamanho: 3,0<br />Formato: Decimal, com 0 casas decimais.
  **/
  private BigDecimal numeroDoItem = null;

  @XmlElement(name="quantidadeConsumida")
  @ApiModelProperty(value = "Quantidade consumida<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade consumida<br />Tamanho: 14,5<br />Formato: Decimal, com até 5 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeConsumida = null;

  @XmlElement(name="quantidadeEstatistica")
  @ApiModelProperty(value = "Quantidade estatística<br />Tamanho: 11,4<br />Formato: Decimal, com até 4 casas decimais separadas por ponto.")
  @Valid
 /**
   * Quantidade estatística<br />Tamanho: 11,4<br />Formato: Decimal, com até 4 casas decimais separadas por ponto.
  **/
  private BigDecimal quantidadeEstatistica = null;

  @XmlElement(name="unidadeComercial")
  @ApiModelProperty(value = "Unidade comercial<br />Tamanho mínimo: 1<br />Tamanho máximo: 6")
 /**
   * Unidade comercial<br />Tamanho mínimo: 1<br />Tamanho máximo: 6
  **/
  private String unidadeComercial = null;

  @XmlElement(name="valorTotalBruto")
  @ApiModelProperty(value = "Valor total bruto<br />Tamanho: 13,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total bruto<br />Tamanho: 13,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalBruto = null;

  @XmlElement(name="valorTotalCalculado")
  @ApiModelProperty(value = "Valor total calculado<br />Tamanho: 13,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor total calculado<br />Tamanho: 13,2<br />Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTotalCalculado = null;
 /**
   * Get apresentadaParaDespacho
   * @return apresentadaParaDespacho
  **/
  @JsonProperty("apresentadaParaDespacho")
  public Boolean isApresentadaParaDespacho() {
    return apresentadaParaDespacho;
  }

  public void setApresentadaParaDespacho(Boolean apresentadaParaDespacho) {
    this.apresentadaParaDespacho = apresentadaParaDespacho;
  }

  public ItemDaNotaFiscalRemoteDTO apresentadaParaDespacho(Boolean apresentadaParaDespacho) {
    this.apresentadaParaDespacho = apresentadaParaDespacho;
    return this;
  }

 /**
   * CFOP&lt;br /&gt;Formato: Inteiro, com até 3 digitos
   * @return cfop
  **/
  @JsonProperty("cfop")
  public Integer getCfop() {
    return cfop;
  }

  public void setCfop(Integer cfop) {
    this.cfop = cfop;
  }

  public ItemDaNotaFiscalRemoteDTO cfop(Integer cfop) {
    this.cfop = cfop;
    return this;
  }

 /**
   * Código do produto&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 60
   * @return codigoDoProduto
  **/
  @JsonProperty("codigoDoProduto")
  public String getCodigoDoProduto() {
    return codigoDoProduto;
  }

  public void setCodigoDoProduto(String codigoDoProduto) {
    this.codigoDoProduto = codigoDoProduto;
  }

  public ItemDaNotaFiscalRemoteDTO codigoDoProduto(String codigoDoProduto) {
    this.codigoDoProduto = codigoDoProduto;
    return this;
  }

 /**
   * Descrição&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 256
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ItemDaNotaFiscalRemoteDTO descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

 /**
   * Get ncm
   * @return ncm
  **/
  @JsonProperty("ncm")
  public NcmDto getNcm() {
    return ncm;
  }

  public void setNcm(NcmDto ncm) {
    this.ncm = ncm;
  }

  public ItemDaNotaFiscalRemoteDTO ncm(NcmDto ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Get notaFiscal
   * @return notaFiscal
  **/
  @JsonProperty("notaFiscal")
  public NotaFiscalRemoteDTO getNotaFiscal() {
    return notaFiscal;
  }

  public void setNotaFiscal(NotaFiscalRemoteDTO notaFiscal) {
    this.notaFiscal = notaFiscal;
  }

  public ItemDaNotaFiscalRemoteDTO notaFiscal(NotaFiscalRemoteDTO notaFiscal) {
    this.notaFiscal = notaFiscal;
    return this;
  }

 /**
   * Número&lt;br /&gt;Tamanho: 3,0&lt;br /&gt;Formato: Decimal, com 0 casas decimais.
   * @return numeroDoItem
  **/
  @JsonProperty("numeroDoItem")
  public BigDecimal getNumeroDoItem() {
    return numeroDoItem;
  }

  public void setNumeroDoItem(BigDecimal numeroDoItem) {
    this.numeroDoItem = numeroDoItem;
  }

  public ItemDaNotaFiscalRemoteDTO numeroDoItem(BigDecimal numeroDoItem) {
    this.numeroDoItem = numeroDoItem;
    return this;
  }

 /**
   * Quantidade consumida&lt;br /&gt;Tamanho: 14,5&lt;br /&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
   * @return quantidadeConsumida
  **/
  @JsonProperty("quantidadeConsumida")
  public BigDecimal getQuantidadeConsumida() {
    return quantidadeConsumida;
  }

  public void setQuantidadeConsumida(BigDecimal quantidadeConsumida) {
    this.quantidadeConsumida = quantidadeConsumida;
  }

  public ItemDaNotaFiscalRemoteDTO quantidadeConsumida(BigDecimal quantidadeConsumida) {
    this.quantidadeConsumida = quantidadeConsumida;
    return this;
  }

 /**
   * Quantidade estatística&lt;br /&gt;Tamanho: 11,4&lt;br /&gt;Formato: Decimal, com até 4 casas decimais separadas por ponto.
   * @return quantidadeEstatistica
  **/
  @JsonProperty("quantidadeEstatistica")
  public BigDecimal getQuantidadeEstatistica() {
    return quantidadeEstatistica;
  }

  public void setQuantidadeEstatistica(BigDecimal quantidadeEstatistica) {
    this.quantidadeEstatistica = quantidadeEstatistica;
  }

  public ItemDaNotaFiscalRemoteDTO quantidadeEstatistica(BigDecimal quantidadeEstatistica) {
    this.quantidadeEstatistica = quantidadeEstatistica;
    return this;
  }

 /**
   * Unidade comercial&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 6
   * @return unidadeComercial
  **/
  @JsonProperty("unidadeComercial")
  public String getUnidadeComercial() {
    return unidadeComercial;
  }

  public void setUnidadeComercial(String unidadeComercial) {
    this.unidadeComercial = unidadeComercial;
  }

  public ItemDaNotaFiscalRemoteDTO unidadeComercial(String unidadeComercial) {
    this.unidadeComercial = unidadeComercial;
    return this;
  }

 /**
   * Valor total bruto&lt;br /&gt;Tamanho: 13,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorTotalBruto
  **/
  @JsonProperty("valorTotalBruto")
  public BigDecimal getValorTotalBruto() {
    return valorTotalBruto;
  }

  public void setValorTotalBruto(BigDecimal valorTotalBruto) {
    this.valorTotalBruto = valorTotalBruto;
  }

  public ItemDaNotaFiscalRemoteDTO valorTotalBruto(BigDecimal valorTotalBruto) {
    this.valorTotalBruto = valorTotalBruto;
    return this;
  }

 /**
   * Valor total calculado&lt;br /&gt;Tamanho: 13,2&lt;br /&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorTotalCalculado
  **/
  @JsonProperty("valorTotalCalculado")
  public BigDecimal getValorTotalCalculado() {
    return valorTotalCalculado;
  }

  public void setValorTotalCalculado(BigDecimal valorTotalCalculado) {
    this.valorTotalCalculado = valorTotalCalculado;
  }

  public ItemDaNotaFiscalRemoteDTO valorTotalCalculado(BigDecimal valorTotalCalculado) {
    this.valorTotalCalculado = valorTotalCalculado;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDaNotaFiscalRemoteDTO {\n");
    
    sb.append("    apresentadaParaDespacho: ").append(toIndentedString(apresentadaParaDespacho)).append("\n");
    sb.append("    cfop: ").append(toIndentedString(cfop)).append("\n");
    sb.append("    codigoDoProduto: ").append(toIndentedString(codigoDoProduto)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    notaFiscal: ").append(toIndentedString(notaFiscal)).append("\n");
    sb.append("    numeroDoItem: ").append(toIndentedString(numeroDoItem)).append("\n");
    sb.append("    quantidadeConsumida: ").append(toIndentedString(quantidadeConsumida)).append("\n");
    sb.append("    quantidadeEstatistica: ").append(toIndentedString(quantidadeEstatistica)).append("\n");
    sb.append("    unidadeComercial: ").append(toIndentedString(unidadeComercial)).append("\n");
    sb.append("    valorTotalBruto: ").append(toIndentedString(valorTotalBruto)).append("\n");
    sb.append("    valorTotalCalculado: ").append(toIndentedString(valorTotalCalculado)).append("\n");
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

