package br.gov.siscomex.portalunico.pcce.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "GuiaIcmsDto", propOrder =
    { "codigoBarrasGuia", "codigoReceita", "descricaoCodigoReceita", "geradorGuia", "numeroControle", "valorAtualizacaoMonetaria", "valorCalculado", "valorDevido", "valorJuros", "valorMulta", "valorTotal"
})

@XmlRootElement(name="GuiaIcmsDto")
/**
  * Dados da guia de pagamento de ICMS vinda da Sefaz
 **/
@ApiModel(description="Dados da guia de pagamento de ICMS vinda da Sefaz")
public class GuiaIcmsDto  {
  
  @XmlElement(name="codigoBarrasGuia", required = true)
  @ApiModelProperty(example = "8581000000005010003101727430100561176269457719001", required = true, value = "Codigo de barras da guia (Portal GNRE ou do próprio Estado) <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Codigo de barras da guia (Portal GNRE ou do próprio Estado) <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String codigoBarrasGuia = null;

  @XmlElement(name="codigoReceita", required = true)
  @ApiModelProperty(example = "999999", required = true, value = "Codigo da Receita utilizado pelo Estado <br>Tamanho mínimo: 1<br>Tamanho máximo: 6")
 /**
   * Codigo da Receita utilizado pelo Estado <br>Tamanho mínimo: 1<br>Tamanho máximo: 6
  **/
  private String codigoReceita = null;

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

  @XmlElement(name="numeroControle")
  @ApiModelProperty(example = "99999999999999999999", value = "Número de Controle da Sefaz (NossoNúmero) <br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
 /**
   * Número de Controle da Sefaz (NossoNúmero) <br>Tamanho mínimo: 1<br>Tamanho máximo: 20
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
   * Codigo da Receita utilizado pelo Estado &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 6
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
   * Número de Controle da Sefaz (NossoNúmero) &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
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
    sb.append("    descricaoCodigoReceita: ").append(toIndentedString(descricaoCodigoReceita)).append("\n");
    sb.append("    geradorGuia: ").append(toIndentedString(geradorGuia)).append("\n");
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

