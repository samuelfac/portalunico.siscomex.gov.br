package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SefazInclusaoGuiaIcmsDto", propOrder =
    { "codigoBarrasGuia", "codigoReceita", "dataLimitePagamento", "dataVencimento", "descricaoCodigoReceita", "geradorGuia", "linhaDigitavel", "numeroControle", "numeroDeclaracao", "valorAtualizacaoMonetaria", "valorCalculado", "valorDevido", "valorJuros", "valorMulta", "valorTotal", "versaoDeclaracao"
})

@XmlRootElement(name="SefazInclusaoGuiaIcmsDto")
/**
  * Dados da guia de pagamento de ICMS
 **/
@ApiModel(description="Dados da guia de pagamento de ICMS")
public class SefazInclusaoGuiaIcmsDto  {
  
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

  @XmlElement(name="dataLimitePagamento", required = true)
  @ApiModelProperty(example = "2021-11-10", required = true, value = "Data limite para pagamento da guia<br>Formato: 'yyyy-MM-dd'")
 /**
   * Data limite para pagamento da guia<br>Formato: 'yyyy-MM-dd'
  **/
  private String dataLimitePagamento = null;

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

  @XmlElement(name="numeroDeclaracao", required = true)
  @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
 /**
   * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
  **/
  private String numeroDeclaracao = null;

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

  @XmlElement(name="versaoDeclaracao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracao = null;
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

  public SefazInclusaoGuiaIcmsDto codigoBarrasGuia(String codigoBarrasGuia) {
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

  public SefazInclusaoGuiaIcmsDto codigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
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

  public SefazInclusaoGuiaIcmsDto dataLimitePagamento(String dataLimitePagamento) {
    this.dataLimitePagamento = dataLimitePagamento;
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

  public SefazInclusaoGuiaIcmsDto dataVencimento(String dataVencimento) {
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

  public SefazInclusaoGuiaIcmsDto descricaoCodigoReceita(String descricaoCodigoReceita) {
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

  public SefazInclusaoGuiaIcmsDto geradorGuia(GeradorGuiaEnum geradorGuia) {
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

  public SefazInclusaoGuiaIcmsDto linhaDigitavel(String linhaDigitavel) {
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

  public SefazInclusaoGuiaIcmsDto numeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
    return this;
  }

 /**
   * Número da declaração&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
   * @return numeroDeclaracao
  **/
  @JsonProperty("numeroDeclaracao")
  @NotNull
  public String getNumeroDeclaracao() {
    return numeroDeclaracao;
  }

  public void setNumeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
  }

  public SefazInclusaoGuiaIcmsDto numeroDeclaracao(String numeroDeclaracao) {
    this.numeroDeclaracao = numeroDeclaracao;
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

  public SefazInclusaoGuiaIcmsDto valorAtualizacaoMonetaria(BigDecimal valorAtualizacaoMonetaria) {
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

  public SefazInclusaoGuiaIcmsDto valorCalculado(BigDecimal valorCalculado) {
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

  public SefazInclusaoGuiaIcmsDto valorDevido(BigDecimal valorDevido) {
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

  public SefazInclusaoGuiaIcmsDto valorJuros(BigDecimal valorJuros) {
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

  public SefazInclusaoGuiaIcmsDto valorMulta(BigDecimal valorMulta) {
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

  public SefazInclusaoGuiaIcmsDto valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

 /**
   * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracao
  **/
  @JsonProperty("versaoDeclaracao")
  @NotNull
  public String getVersaoDeclaracao() {
    return versaoDeclaracao;
  }

  public void setVersaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
  }

  public SefazInclusaoGuiaIcmsDto versaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazInclusaoGuiaIcmsDto {\n");
    
    sb.append("    codigoBarrasGuia: ").append(toIndentedString(codigoBarrasGuia)).append("\n");
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    dataLimitePagamento: ").append(toIndentedString(dataLimitePagamento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    descricaoCodigoReceita: ").append(toIndentedString(descricaoCodigoReceita)).append("\n");
    sb.append("    geradorGuia: ").append(toIndentedString(geradorGuia)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
    sb.append("    numeroControle: ").append(toIndentedString(numeroControle)).append("\n");
    sb.append("    numeroDeclaracao: ").append(toIndentedString(numeroDeclaracao)).append("\n");
    sb.append("    valorAtualizacaoMonetaria: ").append(toIndentedString(valorAtualizacaoMonetaria)).append("\n");
    sb.append("    valorCalculado: ").append(toIndentedString(valorCalculado)).append("\n");
    sb.append("    valorDevido: ").append(toIndentedString(valorDevido)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
    sb.append("    valorMulta: ").append(toIndentedString(valorMulta)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    versaoDeclaracao: ").append(toIndentedString(versaoDeclaracao)).append("\n");
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

