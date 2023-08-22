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
 @XmlType(name = "PagamentoJurosCover", propOrder =
    { "bancoJuros", "agenciaJuros", "contaJuros", "codigoReceita", "descricaoReceita", "valorJuros", "dataHoraPagamento"
})

@XmlRootElement(name="PagamentoJurosCover")
/**
  * Dados de um pagamento de juros
 **/
@ApiModel(description="Dados de um pagamento de juros")
public class PagamentoJurosCover  {
  
  @XmlElement(name="bancoJuros")
  @ApiModelProperty(example = "001", value = "Código do Banco<br>Valor mínimo: 1<br>Valor máximo: 999")
 /**
   * Código do Banco<br>Valor mínimo: 1<br>Valor máximo: 999
  **/
  private String bancoJuros = null;

  @XmlElement(name="agenciaJuros")
  @ApiModelProperty(example = "3521", value = "Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
 /**
   * Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4
  **/
  private String agenciaJuros = null;

  @XmlElement(name="contaJuros")
  @ApiModelProperty(example = "707070", value = "Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
 /**
   * Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
  **/
  private String contaJuros = null;

  @XmlElement(name="codigoReceita")
  @ApiModelProperty(example = "6542", value = "Código da receita<br>Tamanho: 4<br>Formato: 'NNNN'")
 /**
   * Código da receita<br>Tamanho: 4<br>Formato: 'NNNN'
  **/
  private String codigoReceita = null;

  @XmlElement(name="descricaoReceita")
  @ApiModelProperty(example = "Juros do imposto de importação", value = "Descrição da receita<br>Tamanho mínimo: 1<br>Tamanho máximo: 50")
 /**
   * Descrição da receita<br>Tamanho mínimo: 1<br>Tamanho máximo: 50
  **/
  private String descricaoReceita = null;

  @XmlElement(name="valorJuros")
  @ApiModelProperty(example = "10.0", value = "Valor pago<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
  @Valid
 /**
   * Valor pago<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private BigDecimal valorJuros = null;

  @XmlElement(name="dataHoraPagamento")
  @ApiModelProperty(value = "Data e hora do pagamento<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora do pagamento<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraPagamento = null;
 /**
   * Código do Banco&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
   * @return bancoJuros
  **/
  @JsonProperty("bancoJuros")
  public String getBancoJuros() {
    return bancoJuros;
  }

  public void setBancoJuros(String bancoJuros) {
    this.bancoJuros = bancoJuros;
  }

  public PagamentoJurosCover bancoJuros(String bancoJuros) {
    this.bancoJuros = bancoJuros;
    return this;
  }

 /**
   * Número da agência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
   * @return agenciaJuros
  **/
  @JsonProperty("agenciaJuros")
  public String getAgenciaJuros() {
    return agenciaJuros;
  }

  public void setAgenciaJuros(String agenciaJuros) {
    this.agenciaJuros = agenciaJuros;
  }

  public PagamentoJurosCover agenciaJuros(String agenciaJuros) {
    this.agenciaJuros = agenciaJuros;
    return this;
  }

 /**
   * Número da conta&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
   * @return contaJuros
  **/
  @JsonProperty("contaJuros")
  public String getContaJuros() {
    return contaJuros;
  }

  public void setContaJuros(String contaJuros) {
    this.contaJuros = contaJuros;
  }

  public PagamentoJurosCover contaJuros(String contaJuros) {
    this.contaJuros = contaJuros;
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

  public PagamentoJurosCover codigoReceita(String codigoReceita) {
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

  public PagamentoJurosCover descricaoReceita(String descricaoReceita) {
    this.descricaoReceita = descricaoReceita;
    return this;
  }

 /**
   * Valor pago&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorJuros
  **/
  @JsonProperty("valorJuros")
  public BigDecimal getValorJuros() {
    return valorJuros;
  }

  public void setValorJuros(BigDecimal valorJuros) {
    this.valorJuros = valorJuros;
  }

  public PagamentoJurosCover valorJuros(BigDecimal valorJuros) {
    this.valorJuros = valorJuros;
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

  public PagamentoJurosCover dataHoraPagamento(OffsetDateTime dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoJurosCover {\n");
    
    sb.append("    bancoJuros: ").append(toIndentedString(bancoJuros)).append("\n");
    sb.append("    agenciaJuros: ").append(toIndentedString(agenciaJuros)).append("\n");
    sb.append("    contaJuros: ").append(toIndentedString(contaJuros)).append("\n");
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    descricaoReceita: ").append(toIndentedString(descricaoReceita)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
    sb.append("    dataHoraPagamento: ").append(toIndentedString(dataHoraPagamento)).append("\n");
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

