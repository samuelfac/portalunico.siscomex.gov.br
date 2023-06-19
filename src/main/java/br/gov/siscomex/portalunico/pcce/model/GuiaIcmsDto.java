package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "GuiaIcmsDto", propOrder =
    { "codigoBarrasGuia", "codigoReceita", "dataCancelamento", "dataLimitePagamento", "dataPagamento", "dataVencimento", "descricaoCodigoReceita", "geradorGuia", "linhaDigitavel", "numeroControle", "valorAtualizacaoMonetaria", "valorCalculado", "valorDevido", "valorJuros", "valorMulta", "valorTotal"
})

@XmlRootElement(name="GuiaIcmsDto")
/**
  * Dados da guia de pagamento de ICMS
 **/
@ApiModel(description="Dados da guia de pagamento de ICMS")
public class GuiaIcmsDto  {
  
  @XmlElement(name="codigoBarrasGuia", required = true)
  @ApiModelProperty(example = "85810000000050100031017274301005611762694577", required = true, value = "Codigo de barras da guia (Portal GNRE ou do próprio Estado) <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Codigo de barras da guia (Portal GNRE ou do próprio Estado) <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String codigoBarrasGuia = null;

  @XmlElement(name="codigoReceita", required = true)
  @ApiModelProperty(example = "999999", required = true, value = "Código de Receita utilizado pelo Estado <br>Tamanho mínimo: 1<br>Tamanho máximo: 6")
 /**
   * Código de Receita utilizado pelo Estado <br>Tamanho mínimo: 1<br>Tamanho máximo: 6
  **/
  private String codigoReceita = null;

  @XmlElement(name="dataCancelamento")
  @ApiModelProperty(example = "2021-11-12T11:00:06-0300", value = "Data de cancelamento da Guia de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data de cancelamento da Guia de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataCancelamento = null;

  @XmlElement(name="dataLimitePagamento", required = true)
  @ApiModelProperty(example = "2021-11-10", required = true, value = "Data limite para pagamento da guia<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data limite para pagamento da guia<br>Formato: 'yyyy-MM-dd'
  **/
  private String dataLimitePagamento = null;

  @XmlElement(name="dataPagamento")
  @ApiModelProperty(example = "2021-08-31T09:11:06-0300", value = "Data de pagamento da Guia de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
 /**
   * Data de pagamento da Guia de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
  **/
  private String dataPagamento = null;

  @XmlElement(name="dataVencimento", required = true)
  @ApiModelProperty(example = "2021-11-10", required = true, value = "Data de vencimento da guia<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data de vencimento da guia<br>Formato: 'yyyy-MM-dd'
  **/
  private String dataVencimento = null;

  @XmlElement(name="descricaoCodigoReceita")
  @ApiModelProperty(example = "Id eu nisl nunc mi", value = "Descrição do código da Receita <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Descrição do código da Receita <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String descricaoCodigoReceita = null;


@XmlType(name="GeradorGuiaEnum")
@XmlEnum(String.class)
public enum GeradorGuiaEnum {

	@XmlEnumValue("ESTADO")
	@JsonProperty("ESTADO")
	ESTADO(String.valueOf("ESTADO")),
	
	@XmlEnumValue("GNRE")
	@JsonProperty("GNRE")
	GNRE(String.valueOf("GNRE"));


    private String value;

    GeradorGuiaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GeradorGuiaEnum fromValue(String v) {
        for (GeradorGuiaEnum b : GeradorGuiaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to GeradorGuiaEnum");
    }
}

  @XmlElement(name="geradorGuia", required = true)
  @ApiModelProperty(example = "ESTADO", required = true, value = "Responsável pela geração da guia")
 /**
   * Responsável pela geração da guia
  **/
  private GeradorGuiaEnum geradorGuia = null;

  @XmlElement(name="linhaDigitavel", required = true)
  @ApiModelProperty(example = "85811.01725 74301.005612 17626.945772 0 00000005010003", required = true, value = "Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String linhaDigitavel = null;

  @XmlElement(name="numeroControle")
  @ApiModelProperty(example = "99999999999999999999", value = "Número de Controle da Sefaz (Nosso Número)<br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
 /**
   * Número de Controle da Sefaz (Nosso Número)<br>Tamanho mínimo: 1<br>Tamanho máximo: 20
  **/
  private String numeroControle = null;

  @XmlElement(name="valorAtualizacaoMonetaria")
  @ApiModelProperty(example = "0.52", value = "Valor da atualização monetária <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor da atualização monetária <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorAtualizacaoMonetaria = null;

  @XmlElement(name="valorCalculado", required = true)
  @ApiModelProperty(example = "8.54", required = true, value = "Valor calculado sem benefícios/onerações para o código de receita <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor calculado sem benefícios/onerações para o código de receita <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorCalculado = null;

  @XmlElement(name="valorDevido", required = true)
  @ApiModelProperty(example = "8.0", required = true, value = "Valor devido efetivamente <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor devido efetivamente <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorDevido = null;

  @XmlElement(name="valorJuros")
  @ApiModelProperty(example = "1.28", value = "Valor dos juros <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor dos juros <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorJuros = null;

  @XmlElement(name="valorMulta")
  @ApiModelProperty(example = "1.0", value = "Valor da multa <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor da multa <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorMulta = null;

  @XmlElement(name="valorTotal", required = true)
  @ApiModelProperty(example = "10.8", required = true, value = "Somatório dos valores devidos + juros + multa + atualização monetária <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Somatório dos valores devidos + juros + multa + atualização monetária <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotal = null;
 /**
   * Codigo de barras da guia (Portal GNRE ou do próprio Estado) &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return codigoBarrasGuia
  **/
  @JsonProperty("codigoBarrasGuia")
  @NotNull
  public String getCodigoBarrasGuia() {
    return codigoBarrasGuia;
  }

  public void setCodigoBarrasGuia(String codigoBarrasGuia) {
    this.codigoBarrasGuia = codigoBarrasGuia;
  }

  public GuiaIcmsDto codigoBarrasGuia(String codigoBarrasGuia) {
    this.codigoBarrasGuia = codigoBarrasGuia;
    return this;
  }

 /**
   * Código de Receita utilizado pelo Estado &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 6
   * @return codigoReceita
  **/
  @JsonProperty("codigoReceita")
  @NotNull
  public String getCodigoReceita() {
    return codigoReceita;
  }

  public void setCodigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
  }

  public GuiaIcmsDto codigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
    return this;
  }

 /**
   * Data de cancelamento da Guia de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataCancelamento
  **/
  @JsonProperty("dataCancelamento")
  public String getDataCancelamento() {
    return dataCancelamento;
  }

  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  public GuiaIcmsDto dataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
    return this;
  }

 /**
   * Data limite para pagamento da guia&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataLimitePagamento
  **/
  @JsonProperty("dataLimitePagamento")
  @NotNull
  public String getDataLimitePagamento() {
    return dataLimitePagamento;
  }

  public void setDataLimitePagamento(String dataLimitePagamento) {
    this.dataLimitePagamento = dataLimitePagamento;
  }

  public GuiaIcmsDto dataLimitePagamento(String dataLimitePagamento) {
    this.dataLimitePagamento = dataLimitePagamento;
    return this;
  }

 /**
   * Data de pagamento da Guia de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
   * @return dataPagamento
  **/
  @JsonProperty("dataPagamento")
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public GuiaIcmsDto dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

 /**
   * Data de vencimento da guia&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataVencimento
  **/
  @JsonProperty("dataVencimento")
  @NotNull
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public GuiaIcmsDto dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

 /**
   * Descrição do código da Receita &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return descricaoCodigoReceita
  **/
  @JsonProperty("descricaoCodigoReceita")
  public String getDescricaoCodigoReceita() {
    return descricaoCodigoReceita;
  }

  public void setDescricaoCodigoReceita(String descricaoCodigoReceita) {
    this.descricaoCodigoReceita = descricaoCodigoReceita;
  }

  public GuiaIcmsDto descricaoCodigoReceita(String descricaoCodigoReceita) {
    this.descricaoCodigoReceita = descricaoCodigoReceita;
    return this;
  }

 /**
   * Responsável pela geração da guia
   * @return geradorGuia
  **/
  @JsonProperty("geradorGuia")
  @NotNull
  public String getGeradorGuia() {
    if (geradorGuia == null) {
      return null;
    }
    return geradorGuia.value();
  }

  public void setGeradorGuia(GeradorGuiaEnum geradorGuia) {
    this.geradorGuia = geradorGuia;
  }

  public GuiaIcmsDto geradorGuia(GeradorGuiaEnum geradorGuia) {
    this.geradorGuia = geradorGuia;
    return this;
  }

 /**
   * Linha digitável para pagamento &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return linhaDigitavel
  **/
  @JsonProperty("linhaDigitavel")
  @NotNull
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }

  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  public GuiaIcmsDto linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }

 /**
   * Número de Controle da Sefaz (Nosso Número)&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
   * @return numeroControle
  **/
  @JsonProperty("numeroControle")
  public String getNumeroControle() {
    return numeroControle;
  }

  public void setNumeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
  }

  public GuiaIcmsDto numeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
    return this;
  }

 /**
   * Valor da atualização monetária &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorAtualizacaoMonetaria
  **/
  @JsonProperty("valorAtualizacaoMonetaria")
  public BigDecimal getValorAtualizacaoMonetaria() {
    return valorAtualizacaoMonetaria;
  }

  public void setValorAtualizacaoMonetaria(BigDecimal valorAtualizacaoMonetaria) {
    this.valorAtualizacaoMonetaria = valorAtualizacaoMonetaria;
  }

  public GuiaIcmsDto valorAtualizacaoMonetaria(BigDecimal valorAtualizacaoMonetaria) {
    this.valorAtualizacaoMonetaria = valorAtualizacaoMonetaria;
    return this;
  }

 /**
   * Valor calculado sem benefícios/onerações para o código de receita &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorCalculado
  **/
  @JsonProperty("valorCalculado")
  @NotNull
  public BigDecimal getValorCalculado() {
    return valorCalculado;
  }

  public void setValorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
  }

  public GuiaIcmsDto valorCalculado(BigDecimal valorCalculado) {
    this.valorCalculado = valorCalculado;
    return this;
  }

 /**
   * Valor devido efetivamente &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorDevido
  **/
  @JsonProperty("valorDevido")
  @NotNull
  public BigDecimal getValorDevido() {
    return valorDevido;
  }

  public void setValorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
  }

  public GuiaIcmsDto valorDevido(BigDecimal valorDevido) {
    this.valorDevido = valorDevido;
    return this;
  }

 /**
   * Valor dos juros &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorJuros
  **/
  @JsonProperty("valorJuros")
  public BigDecimal getValorJuros() {
    return valorJuros;
  }

  public void setValorJuros(BigDecimal valorJuros) {
    this.valorJuros = valorJuros;
  }

  public GuiaIcmsDto valorJuros(BigDecimal valorJuros) {
    this.valorJuros = valorJuros;
    return this;
  }

 /**
   * Valor da multa &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
   * @return valorMulta
  **/
  @JsonProperty("valorMulta")
  public BigDecimal getValorMulta() {
    return valorMulta;
  }

  public void setValorMulta(BigDecimal valorMulta) {
    this.valorMulta = valorMulta;
  }

  public GuiaIcmsDto valorMulta(BigDecimal valorMulta) {
    this.valorMulta = valorMulta;
    return this;
  }

 /**
   * Somatório dos valores devidos + juros + multa + atualização monetária &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
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

  public GuiaIcmsDto valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuiaIcmsDto {\n");
    
    sb.append("    codigoBarrasGuia: ").append(toIndentedString(codigoBarrasGuia)).append("\n");
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    dataCancelamento: ").append(toIndentedString(dataCancelamento)).append("\n");
    sb.append("    dataLimitePagamento: ").append(toIndentedString(dataLimitePagamento)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    descricaoCodigoReceita: ").append(toIndentedString(descricaoCodigoReceita)).append("\n");
    sb.append("    geradorGuia: ").append(toIndentedString(geradorGuia)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
    sb.append("    numeroControle: ").append(toIndentedString(numeroControle)).append("\n");
    sb.append("    valorAtualizacaoMonetaria: ").append(toIndentedString(valorAtualizacaoMonetaria)).append("\n");
    sb.append("    valorCalculado: ").append(toIndentedString(valorCalculado)).append("\n");
    sb.append("    valorDevido: ").append(toIndentedString(valorDevido)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
    sb.append("    valorMulta: ").append(toIndentedString(valorMulta)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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

