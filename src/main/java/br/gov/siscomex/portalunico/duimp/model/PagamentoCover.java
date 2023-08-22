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
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PagamentoCover", propOrder =
    { "versaoDuimpPagamento", "banco", "agencia", "conta", "codigoReceita", "descricaoReceita", "valorTributo", "dataHoraPagamento", "pagamentoJuros"
})

@XmlRootElement(name="PagamentoCover")
/**
  * Dados de um pagamento
 **/
@ApiModel(description="Dados de um pagamento")
public class PagamentoCover  {
  
  @XmlElement(name="versaoDuimpPagamento")
  @ApiModelProperty(example = "1", value = "Versão da Duimp em que este pagamento foi realizado.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999")
 /**
   * Versão da Duimp em que este pagamento foi realizado.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999
  **/
  private String versaoDuimpPagamento = null;

  @XmlElement(name="banco")
  @ApiModelProperty(example = "001", value = "Código do Banco<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código do Banco<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private String banco = null;

  @XmlElement(name="agencia")
  @ApiModelProperty(example = "3521", value = "Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
 /**
   * Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4
  **/
  private String agencia = null;

  @XmlElement(name="conta")
  @ApiModelProperty(example = "707070", value = "Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
 /**
   * Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
  **/
  private String conta = null;

  @XmlElement(name="codigoReceita")
  @ApiModelProperty(example = "5602", value = "Código da receita<br>Tamanho: 4<br>Formato: 'NNNN'")
 /**
   * Código da receita<br>Tamanho: 4<br>Formato: 'NNNN'
  **/
  private String codigoReceita = null;

  @XmlElement(name="descricaoReceita")
  @ApiModelProperty(example = "Taxa de Utilização", value = "Descrição da receita<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Descrição da receita<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String descricaoReceita = null;

  @XmlElement(name="valorTributo")
  @ApiModelProperty(example = "1000.0", value = "Valor pago<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor pago<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorTributo = null;

  @XmlElement(name="dataHoraPagamento")
  @ApiModelProperty(value = "Data e hora do pagamento<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora do pagamento<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraPagamento = null;

  @XmlElement(name="pagamentoJuros")
  @ApiModelProperty(value = "")
  @Valid
  private PagamentoJurosCover pagamentoJuros = null;
 /**
   * Versão da Duimp em que este pagamento foi realizado.&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999
   * @return versaoDuimpPagamento
  **/
  @JsonProperty("versaoDuimpPagamento")
  public String getVersaoDuimpPagamento() {
    return versaoDuimpPagamento;
  }

  public void setVersaoDuimpPagamento(String versaoDuimpPagamento) {
    this.versaoDuimpPagamento = versaoDuimpPagamento;
  }

  public PagamentoCover versaoDuimpPagamento(String versaoDuimpPagamento) {
    this.versaoDuimpPagamento = versaoDuimpPagamento;
    return this;
  }

 /**
   * Código do Banco&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return banco
  **/
  @JsonProperty("banco")
  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public PagamentoCover banco(String banco) {
    this.banco = banco;
    return this;
  }

 /**
   * Número da agência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
   * @return agencia
  **/
  @JsonProperty("agencia")
  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public PagamentoCover agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }

 /**
   * Número da conta&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
   * @return conta
  **/
  @JsonProperty("conta")
  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public PagamentoCover conta(String conta) {
    this.conta = conta;
    return this;
  }

 /**
   * Código da receita&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: &#39;NNNN&#39;
   * @return codigoReceita
  **/
  @JsonProperty("codigoReceita")
  public String getCodigoReceita() {
    return codigoReceita;
  }

  public void setCodigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
  }

  public PagamentoCover codigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
    return this;
  }

 /**
   * Descrição da receita&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 50
   * @return descricaoReceita
  **/
  @JsonProperty("descricaoReceita")
  public String getDescricaoReceita() {
    return descricaoReceita;
  }

  public void setDescricaoReceita(String descricaoReceita) {
    this.descricaoReceita = descricaoReceita;
  }

  public PagamentoCover descricaoReceita(String descricaoReceita) {
    this.descricaoReceita = descricaoReceita;
    return this;
  }

 /**
   * Valor pago&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorTributo
  **/
  @JsonProperty("valorTributo")
  public BigDecimal getValorTributo() {
    return valorTributo;
  }

  public void setValorTributo(BigDecimal valorTributo) {
    this.valorTributo = valorTributo;
  }

  public PagamentoCover valorTributo(BigDecimal valorTributo) {
    this.valorTributo = valorTributo;
    return this;
  }

 /**
   * Data e hora do pagamento&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHoraPagamento
  **/
  @JsonProperty("dataHoraPagamento")
  public OffsetDateTime getDataHoraPagamento() {
    return dataHoraPagamento;
  }

  public void setDataHoraPagamento(OffsetDateTime dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  public PagamentoCover dataHoraPagamento(OffsetDateTime dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
    return this;
  }

 /**
   * Get pagamentoJuros
   * @return pagamentoJuros
  **/
  @JsonProperty("pagamentoJuros")
  public PagamentoJurosCover getPagamentoJuros() {
    return pagamentoJuros;
  }

  public void setPagamentoJuros(PagamentoJurosCover pagamentoJuros) {
    this.pagamentoJuros = pagamentoJuros;
  }

  public PagamentoCover pagamentoJuros(PagamentoJurosCover pagamentoJuros) {
    this.pagamentoJuros = pagamentoJuros;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoCover {\n");
    
    sb.append("    versaoDuimpPagamento: ").append(toIndentedString(versaoDuimpPagamento)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    descricaoReceita: ").append(toIndentedString(descricaoReceita)).append("\n");
    sb.append("    valorTributo: ").append(toIndentedString(valorTributo)).append("\n");
    sb.append("    dataHoraPagamento: ").append(toIndentedString(dataHoraPagamento)).append("\n");
    sb.append("    pagamentoJuros: ").append(toIndentedString(pagamentoJuros)).append("\n");
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

