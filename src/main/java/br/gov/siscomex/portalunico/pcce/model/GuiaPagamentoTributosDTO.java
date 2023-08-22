package br.gov.siscomex.portalunico.pcce.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
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
 @XmlType(name = "GuiaPagamentoTributosDTO", propOrder =
    { "codigoBarrasGuia", "codigoReceita", "dtVencimento", "infoAdicionais", "linhaDigitavel", "linkPdf", "nrOperacaoOrigem", "tpGuiaPagamento", "tpOperacaoOrigem", "valorTotal"
})

@XmlRootElement(name="GuiaPagamentoTributosDTO")
/**
  * Dados da guia de pagamento de tributos
 **/
@ApiModel(description="Dados da guia de pagamento de tributos")
public class GuiaPagamentoTributosDTO  {
  
  @XmlElement(name="codigoBarrasGuia")
  @ApiModelProperty(example = "85810000000050100031017274301005611762694577", value = "Codigo de barras da guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Codigo de barras da guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String codigoBarrasGuia = null;

  @XmlElement(name="codigoReceita")
  @ApiModelProperty(example = "999999", value = "Codigo de receita do tributo <br>Tamanho mínimo: 1<br>Tamanho máximo: 6<br/>(*) Obrigatório se tpGuiaPagamento = DARF")
 /**
   * Codigo de receita do tributo <br>Tamanho mínimo: 1<br>Tamanho máximo: 6<br/>(*) Obrigatório se tpGuiaPagamento = DARF
  **/
  private String codigoReceita = null;

  @XmlElement(name="dtVencimento")
  @ApiModelProperty(example = "2021-09-10", value = "Data de vencimento da guia<br>Formato: 'yyyy-MM-dd'<br/>(*) Obrigatório se tpGuiaPagamento = DARF")
 /**
   * Data de vencimento da guia<br>Formato: 'yyyy-MM-dd'<br/>(*) Obrigatório se tpGuiaPagamento = DARF
  **/
  private String dtVencimento = null;

  @XmlElement(name="infoAdicionais")
  @ApiModelProperty(example = "REGISTRO", value = "Informações adicionais de interesse da operação de origem <br>Tamanho máximo: 200<br/>(*) Obrigatório se tpDocumentoOrigem=LPCO. Valores válidos: LPCO: [REGISTRO, RETIFICACAO, PRORROGACAO, COMPATIBILIZACAO]")
 /**
   * Informações adicionais de interesse da operação de origem <br>Tamanho máximo: 200<br/>(*) Obrigatório se tpDocumentoOrigem=LPCO. Valores válidos: LPCO: [REGISTRO, RETIFICACAO, PRORROGACAO, COMPATIBILIZACAO]
  **/
  private String infoAdicionais = null;

  @XmlElement(name="linhaDigitavel")
  @ApiModelProperty(example = "85811.01725 74301.005612 17626.945772 0 00000005010003", value = "Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório se tpGuiaPagamento = GRU")
 /**
   * Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório se tpGuiaPagamento = GRU
  **/
  private String linhaDigitavel = null;

  @XmlElement(name="linkPdf")
  @ApiModelProperty(example = "http://xxxxxxxx.xx/I2100001234-guia.pdf", value = "Link para o PDF da guia <br>Tamanho máximo: 400<br/>(*) Obrigatório se tpDocumentoOrigem = LPCO e tpGuiaPagamento = GRU")
 /**
   * Link para o PDF da guia <br>Tamanho máximo: 400<br/>(*) Obrigatório se tpDocumentoOrigem = LPCO e tpGuiaPagamento = GRU
  **/
  private String linkPdf = null;

  @XmlElement(name="nrOperacaoOrigem", required = true)
  @ApiModelProperty(example = "I2100001234", required = true, value = "Número da operação que deu origem à guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
 /**
   * Número da operação que deu origem à guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 20
  **/
  private String nrOperacaoOrigem = null;


@XmlType(name="TpGuiaPagamentoEnum")
@XmlEnum(String.class)
public enum TpGuiaPagamentoEnum {

	@XmlEnumValue("GRU")
	@JsonProperty("GRU")
	GRU(String.valueOf("GRU")),
	
	@XmlEnumValue("DARF")
	@JsonProperty("DARF")
	DARF(String.valueOf("DARF"));


    private String value;

    TpGuiaPagamentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TpGuiaPagamentoEnum fromValue(String v) {
        for (TpGuiaPagamentoEnum b : TpGuiaPagamentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TpGuiaPagamentoEnum");
    }
}

  @XmlElement(name="tpGuiaPagamento", required = true)
  @ApiModelProperty(required = true, value = "Tipo de guia de pagamento")
 /**
   * Tipo de guia de pagamento
  **/
  private TpGuiaPagamentoEnum tpGuiaPagamento = null;


@XmlType(name="TpOperacaoOrigemEnum")
@XmlEnum(String.class)
public enum TpOperacaoOrigemEnum {

	@XmlEnumValue("LPCO")
	@JsonProperty("LPCO")
	LPCO(String.valueOf("LPCO"));


    private String value;

    TpOperacaoOrigemEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TpOperacaoOrigemEnum fromValue(String v) {
        for (TpOperacaoOrigemEnum b : TpOperacaoOrigemEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TpOperacaoOrigemEnum");
    }
}

  @XmlElement(name="tpOperacaoOrigem", required = true)
  @ApiModelProperty(required = true, value = "Tipo da operação que deu origem à guia")
 /**
   * Tipo da operação que deu origem à guia
  **/
  private TpOperacaoOrigemEnum tpOperacaoOrigem = null;

  @XmlElement(name="valorTotal", required = true)
  @ApiModelProperty(example = "126.54", required = true, value = "Valor total da guia <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
  @Valid
 /**
   * Valor total da guia <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
  **/
  private BigDecimal valorTotal = null;
 /**
   * Codigo de barras da guia &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return codigoBarrasGuia
  **/
  @JsonProperty("codigoBarrasGuia")
  public String getCodigoBarrasGuia() {
    return codigoBarrasGuia;
  }

  public void setCodigoBarrasGuia(String codigoBarrasGuia) {
    this.codigoBarrasGuia = codigoBarrasGuia;
  }

  public GuiaPagamentoTributosDTO codigoBarrasGuia(String codigoBarrasGuia) {
    this.codigoBarrasGuia = codigoBarrasGuia;
    return this;
  }

 /**
   * Codigo de receita do tributo &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 6&lt;br/&gt;(*) Obrigatório se tpGuiaPagamento &#x3D; DARF
   * @return codigoReceita
  **/
  @JsonProperty("codigoReceita")
  public String getCodigoReceita() {
    return codigoReceita;
  }

  public void setCodigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
  }

  public GuiaPagamentoTributosDTO codigoReceita(String codigoReceita) {
    this.codigoReceita = codigoReceita;
    return this;
  }

 /**
   * Data de vencimento da guia&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;&lt;br/&gt;(*) Obrigatório se tpGuiaPagamento &#x3D; DARF
   * @return dtVencimento
  **/
  @JsonProperty("dtVencimento")
  public String getDtVencimento() {
    return dtVencimento;
  }

  public void setDtVencimento(String dtVencimento) {
    this.dtVencimento = dtVencimento;
  }

  public GuiaPagamentoTributosDTO dtVencimento(String dtVencimento) {
    this.dtVencimento = dtVencimento;
    return this;
  }

 /**
   * Informações adicionais de interesse da operação de origem &lt;br&gt;Tamanho máximo: 200&lt;br/&gt;(*) Obrigatório se tpDocumentoOrigem&#x3D;LPCO. Valores válidos: LPCO: [REGISTRO, RETIFICACAO, PRORROGACAO, COMPATIBILIZACAO]
   * @return infoAdicionais
  **/
  @JsonProperty("infoAdicionais")
  public String getInfoAdicionais() {
    return infoAdicionais;
  }

  public void setInfoAdicionais(String infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
  }

  public GuiaPagamentoTributosDTO infoAdicionais(String infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
    return this;
  }

 /**
   * Linha digitável para pagamento &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100&lt;br/&gt;(*) Obrigatório se tpGuiaPagamento &#x3D; GRU
   * @return linhaDigitavel
  **/
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }

  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  public GuiaPagamentoTributosDTO linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }

 /**
   * Link para o PDF da guia &lt;br&gt;Tamanho máximo: 400&lt;br/&gt;(*) Obrigatório se tpDocumentoOrigem &#x3D; LPCO e tpGuiaPagamento &#x3D; GRU
   * @return linkPdf
  **/
  @JsonProperty("linkPdf")
  public String getLinkPdf() {
    return linkPdf;
  }

  public void setLinkPdf(String linkPdf) {
    this.linkPdf = linkPdf;
  }

  public GuiaPagamentoTributosDTO linkPdf(String linkPdf) {
    this.linkPdf = linkPdf;
    return this;
  }

 /**
   * Número da operação que deu origem à guia &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
   * @return nrOperacaoOrigem
  **/
  @JsonProperty("nrOperacaoOrigem")
  @NotNull
  public String getNrOperacaoOrigem() {
    return nrOperacaoOrigem;
  }

  public void setNrOperacaoOrigem(String nrOperacaoOrigem) {
    this.nrOperacaoOrigem = nrOperacaoOrigem;
  }

  public GuiaPagamentoTributosDTO nrOperacaoOrigem(String nrOperacaoOrigem) {
    this.nrOperacaoOrigem = nrOperacaoOrigem;
    return this;
  }

 /**
   * Tipo de guia de pagamento
   * @return tpGuiaPagamento
  **/
  @JsonProperty("tpGuiaPagamento")
  @NotNull
  public String getTpGuiaPagamento() {
    if (tpGuiaPagamento == null) {
      return null;
    }
    return tpGuiaPagamento.value();
  }

  public void setTpGuiaPagamento(TpGuiaPagamentoEnum tpGuiaPagamento) {
    this.tpGuiaPagamento = tpGuiaPagamento;
  }

  public GuiaPagamentoTributosDTO tpGuiaPagamento(TpGuiaPagamentoEnum tpGuiaPagamento) {
    this.tpGuiaPagamento = tpGuiaPagamento;
    return this;
  }

 /**
   * Tipo da operação que deu origem à guia
   * @return tpOperacaoOrigem
  **/
  @JsonProperty("tpOperacaoOrigem")
  @NotNull
  public String getTpOperacaoOrigem() {
    if (tpOperacaoOrigem == null) {
      return null;
    }
    return tpOperacaoOrigem.value();
  }

  public void setTpOperacaoOrigem(TpOperacaoOrigemEnum tpOperacaoOrigem) {
    this.tpOperacaoOrigem = tpOperacaoOrigem;
  }

  public GuiaPagamentoTributosDTO tpOperacaoOrigem(TpOperacaoOrigemEnum tpOperacaoOrigem) {
    this.tpOperacaoOrigem = tpOperacaoOrigem;
    return this;
  }

 /**
   * Valor total da guia &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
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

  public GuiaPagamentoTributosDTO valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuiaPagamentoTributosDTO {\n");
    
    sb.append("    codigoBarrasGuia: ").append(toIndentedString(codigoBarrasGuia)).append("\n");
    sb.append("    codigoReceita: ").append(toIndentedString(codigoReceita)).append("\n");
    sb.append("    dtVencimento: ").append(toIndentedString(dtVencimento)).append("\n");
    sb.append("    infoAdicionais: ").append(toIndentedString(infoAdicionais)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
    sb.append("    linkPdf: ").append(toIndentedString(linkPdf)).append("\n");
    sb.append("    nrOperacaoOrigem: ").append(toIndentedString(nrOperacaoOrigem)).append("\n");
    sb.append("    tpGuiaPagamento: ").append(toIndentedString(tpGuiaPagamento)).append("\n");
    sb.append("    tpOperacaoOrigem: ").append(toIndentedString(tpOperacaoOrigem)).append("\n");
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

