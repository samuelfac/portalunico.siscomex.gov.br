package br.gov.siscomex.portalunico.pcce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPagamentoTributosDTO", propOrder =
        {"nrOperacaoOrigem", "tpOperacaoOrigem", "linhaDigitavel", "tpGuiaPagamento", "dtPagamento"
        })

@XmlRootElement(name = "DadosPagamentoTributosDTO")
/**
 * Dados de pagamento da guia de pagamento de tributos
 **/
@ApiModel(description = "Dados de pagamento da guia de pagamento de tributos")
public class DadosPagamentoTributosDTO {

    @XmlElement(name = "nrOperacaoOrigem", required = true)
    @ApiModelProperty(example = "I2100001234", required = true, value = "Número da operação que deu origem à guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 20")
    /**
     * Número da operação que deu origem à guia <br>Tamanho mínimo: 1<br>Tamanho máximo: 20
     **/
    private String nrOperacaoOrigem = null;
    @XmlElement(name = "tpOperacaoOrigem", required = true)
    @ApiModelProperty(required = true, value = "Tipo da operação que deu origem à guia")
    /**
     * Tipo da operação que deu origem à guia
     **/
    private TpOperacaoOrigemEnum tpOperacaoOrigem = null;
    @XmlElement(name = "linhaDigitavel")
    @ApiModelProperty(example = "85811.01725 74301.005612 17626.945772 0 00000005010003", value = "Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório se tpGuiaPagamento = GRU")
    /**
     * Linha digitável para pagamento <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório se tpGuiaPagamento = GRU
     **/
    private String linhaDigitavel = null;
    @XmlElement(name = "tpGuiaPagamento", required = true)
    @ApiModelProperty(required = true, value = "Tipo de guia de pagamento")
    /**
     * Tipo de guia de pagamento
     **/
    private TpGuiaPagamentoEnum tpGuiaPagamento = null;
    @XmlElement(name = "dtPagamento", required = true)
    @ApiModelProperty(example = "2021-09-10", required = true, value = "Data de pagamento da guia<br>Formato: 'yyyy-MM-dd'")
    /**
     * Data de pagamento da guia<br>Formato: 'yyyy-MM-dd'
     **/
    private String dtPagamento = null;

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

    /**
     * Número da operação que deu origem à guia &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 20
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

    public DadosPagamentoTributosDTO nrOperacaoOrigem(String nrOperacaoOrigem) {
        this.nrOperacaoOrigem = nrOperacaoOrigem;
        return this;
    }

    /**
     * Tipo da operação que deu origem à guia
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

    public DadosPagamentoTributosDTO tpOperacaoOrigem(TpOperacaoOrigemEnum tpOperacaoOrigem) {
        this.tpOperacaoOrigem = tpOperacaoOrigem;
        return this;
    }

    /**
     * Linha digitável para pagamento &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100&lt;br/&gt;(*) Obrigatório se tpGuiaPagamento &#x3D; GRU
     *
     * @return linhaDigitavel
     **/
    @JsonProperty("linhaDigitavel")
    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public DadosPagamentoTributosDTO linhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
        return this;
    }

    /**
     * Tipo de guia de pagamento
     *
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

    public DadosPagamentoTributosDTO tpGuiaPagamento(TpGuiaPagamentoEnum tpGuiaPagamento) {
        this.tpGuiaPagamento = tpGuiaPagamento;
        return this;
    }

    /**
     * Data de pagamento da guia&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;
     *
     * @return dtPagamento
     **/
    @JsonProperty("dtPagamento")
    @NotNull
    public String getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public DadosPagamentoTributosDTO dtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosPagamentoTributosDTO {\n" +
                "    nrOperacaoOrigem: " + toIndentedString(nrOperacaoOrigem) + "\n" +
                "    tpOperacaoOrigem: " + toIndentedString(tpOperacaoOrigem) + "\n" +
                "    linhaDigitavel: " + toIndentedString(linhaDigitavel) + "\n" +
                "    tpGuiaPagamento: " + toIndentedString(tpGuiaPagamento) + "\n" +
                "    dtPagamento: " + toIndentedString(dtPagamento) + "\n" +
                "}";
        return sb;
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

    @XmlType(name = "TpGuiaPagamentoEnum")
    @XmlEnum(String.class)
    public enum TpGuiaPagamentoEnum {

        @XmlEnumValue("GRU")
        @JsonProperty("GRU")
        GRU("GRU"),

        @XmlEnumValue("DARF")
        @JsonProperty("DARF")
        DARF("DARF");


        private final String value;

        TpGuiaPagamentoEnum(String v) {
            value = v;
        }

        public static TpGuiaPagamentoEnum fromValue(String v) {
            for (TpGuiaPagamentoEnum b : TpGuiaPagamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TpGuiaPagamentoEnum");
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
