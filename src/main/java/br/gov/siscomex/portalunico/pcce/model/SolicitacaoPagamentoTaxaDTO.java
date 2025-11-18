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
@XmlType(name = "SolicitacaoPagamentoTaxaDTO", propOrder =
        {"codigoReceita", "identificadorTaxa", "momentoTaxa", "nrOperacaoOrigem", "numeroReferencia", "tpOperacaoOrigem", "valorTotal"
        })

@XmlRootElement(name = "SolicitacaoPagamentoTaxaDTO")
/**
 * Dados da solicitação de pagamento de taxa de órgãos anuentes
 **/
@ApiModel(description = "Dados da solicitação de pagamento de taxa de órgãos anuentes")
public class SolicitacaoPagamentoTaxaDTO {

    @XmlElement(name = "codigoReceita", required = true)
    @ApiModelProperty(example = "9999", required = true, value = "Codigo de receita da taxa <br>Tamanho: 4")
    /**
     * Codigo de receita da taxa <br>Tamanho: 4
     **/
    private String codigoReceita = null;

    @XmlElement(name = "identificadorTaxa", required = true)
    @ApiModelProperty(example = "000001234567890", required = true, value = "Código único que identifica a taxa no órgão anuente (transação) <br>Tamanho: 15")
    /**
     * Código único que identifica a taxa no órgão anuente (transação) <br>Tamanho: 15
     **/
    private String identificadorTaxa = null;
    @XmlElement(name = "tpOperacaoOrigem", required = true)
    @ApiModelProperty(required = true, value = "Tipo da operação que deu origem à taxa")
    /**
     * Tipo da operação que deu origem à taxa
     **/
    private TpOperacaoOrigemEnum tpOperacaoOrigem = null;

    @XmlElement(name = "momentoTaxa")
    @ApiModelProperty(example = "EXIGENCIA", value = "Momento da taxa <br/>(*) Obrigatório se tpOperacaoOrigem=LPCO.")
    /**
     * Momento da taxa <br/>(*) Obrigatório se tpOperacaoOrigem=LPCO.
     **/
    private MomentoTaxaEnum momentoTaxa = null;

    @XmlElement(name = "nrOperacaoOrigem", required = true)
    @ApiModelProperty(example = "I2100001234", required = true, value = "Número da operação que deu origem à taxa <br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
    /**
     * Número da operação que deu origem à taxa <br>Tamanho mínimo: 1<br>Tamanho máximo: 20
     **/
    private String nrOperacaoOrigem = null;

    @XmlElement(name = "numeroReferencia")
    @ApiModelProperty(example = "1", value = "Número de referência do evento <br/>Para LPCO referencia o número sequencial de identificação do evento (ex.: número da exigência, número da retificação etc).<br/>(*) Obrigatório para alguns momentos da taxa, de acordo com a regra do LPCO")
    /**
     * Número de referência do evento <br/>Para LPCO referencia o número sequencial de identificação do evento (ex.: número da exigência, número da retificação etc).<br/>(*) Obrigatório para alguns momentos da taxa, de acordo com a regra do LPCO
     **/
    private Integer numeroReferencia = null;

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
    @XmlElement(name = "valorTotal", required = true)
    @ApiModelProperty(example = "126.54", required = true, value = "Valor total a pagar <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor total a pagar <br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorTotal = null;

    /**
     * Codigo de receita da taxa &lt;br&gt;Tamanho: 4
     *
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

    public SolicitacaoPagamentoTaxaDTO codigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
        return this;
    }

    /**
     * Código único que identifica a taxa no órgão anuente (transação) &lt;br&gt;Tamanho: 15
     *
     * @return identificadorTaxa
     **/
    @JsonProperty("identificadorTaxa")
    @NotNull
    public String getIdentificadorTaxa() {
        return identificadorTaxa;
    }

    public void setIdentificadorTaxa(String identificadorTaxa) {
        this.identificadorTaxa = identificadorTaxa;
    }

    public SolicitacaoPagamentoTaxaDTO identificadorTaxa(String identificadorTaxa) {
        this.identificadorTaxa = identificadorTaxa;
        return this;
    }

    /**
     * Número de referência do evento &lt;br/&gt;Para LPCO referencia o número sequencial de identificação do evento (ex.: número da exigência, número da retificação etc).&lt;br/&gt;(*) Obrigatório para alguns momentos da taxa, de acordo com a regra do LPCO
     *
     * @return numeroReferencia
     **/
    @JsonProperty("numeroReferencia")
    public Integer getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Momento da taxa &lt;br/&gt;(*) Obrigatório se tpOperacaoOrigem&#x3D;LPCO.
     *
     * @return momentoTaxa
     **/
    @JsonProperty("momentoTaxa")
    public String getMomentoTaxa() {
        if (momentoTaxa == null) {
            return null;
        }
        return momentoTaxa.value();
    }

    public void setMomentoTaxa(MomentoTaxaEnum momentoTaxa) {
        this.momentoTaxa = momentoTaxa;
    }

    public SolicitacaoPagamentoTaxaDTO momentoTaxa(MomentoTaxaEnum momentoTaxa) {
        this.momentoTaxa = momentoTaxa;
        return this;
    }

    /**
     * Número da operação que deu origem à taxa &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
     *
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

    public SolicitacaoPagamentoTaxaDTO nrOperacaoOrigem(String nrOperacaoOrigem) {
        this.nrOperacaoOrigem = nrOperacaoOrigem;
        return this;
    }

    public void setNumeroReferencia(Integer numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public SolicitacaoPagamentoTaxaDTO numeroReferencia(Integer numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SolicitacaoPagamentoTaxaDTO {\n" +
                "    codigoReceita: " + toIndentedString(codigoReceita) + "\n" +
                "    identificadorTaxa: " + toIndentedString(identificadorTaxa) + "\n" +
                "    momentoTaxa: " + toIndentedString(momentoTaxa) + "\n" +
                "    nrOperacaoOrigem: " + toIndentedString(nrOperacaoOrigem) + "\n" +
                "    numeroReferencia: " + toIndentedString(numeroReferencia) + "\n" +
                "    tpOperacaoOrigem: " + toIndentedString(tpOperacaoOrigem) + "\n" +
                "    valorTotal: " + toIndentedString(valorTotal) + "\n" +
                "}";
        return sb;
    }

    /**
     * Tipo da operação que deu origem à taxa
     *
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

    public SolicitacaoPagamentoTaxaDTO tpOperacaoOrigem(TpOperacaoOrigemEnum tpOperacaoOrigem) {
        this.tpOperacaoOrigem = tpOperacaoOrigem;
        return this;
    }

    /**
     * Valor total a pagar &lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     *
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

    public SolicitacaoPagamentoTaxaDTO valorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }


    @XmlType(name = "MomentoTaxaEnum")
    @XmlEnum(String.class)
    public enum MomentoTaxaEnum {

        @XmlEnumValue("REGISTRO")
        @JsonProperty("REGISTRO")
        REGISTRO("REGISTRO"),

        @XmlEnumValue("RETIFICACAO")
        @JsonProperty("RETIFICACAO")
        RETIFICACAO("RETIFICACAO"),

        @XmlEnumValue("PRORROGACAO")
        @JsonProperty("PRORROGACAO")
        PRORROGACAO("PRORROGACAO"),

        @XmlEnumValue("COMPATIBILIZACAO")
        @JsonProperty("COMPATIBILIZACAO")
        COMPATIBILIZACAO("COMPATIBILIZACAO"),

        @XmlEnumValue("EXIGENCIA")
        @JsonProperty("EXIGENCIA")
        EXIGENCIA("EXIGENCIA");


        private final String value;

        MomentoTaxaEnum(String v) {
            value = v;
        }

        public static MomentoTaxaEnum fromValue(String v) {
            for (MomentoTaxaEnum b : MomentoTaxaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to MomentoTaxaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TpOperacaoOrigemEnum")
    @XmlEnum(String.class)
    public enum TpOperacaoOrigemEnum {

        @XmlEnumValue("LPCO")
        @JsonProperty("LPCO")
        LPCO("LPCO"),

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP");


        private final String value;

        TpOperacaoOrigemEnum(String v) {
            value = v;
        }

        public static TpOperacaoOrigemEnum fromValue(String v) {
            for (TpOperacaoOrigemEnum b : TpOperacaoOrigemEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TpOperacaoOrigemEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
