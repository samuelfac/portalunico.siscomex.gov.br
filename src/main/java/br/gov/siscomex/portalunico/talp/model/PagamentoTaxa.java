package br.gov.siscomex.portalunico.talp.model;

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
@XmlType(name = "PagamentoTaxa", propOrder =
        {"observacao", "tipoTaxa", "tipoPagamento"
        })

@XmlRootElement(name = "PagamentoTaxa")
/**
 * Indica se o pagamento de taxa já foli realizado para um LPCO
 **/
@ApiModel(description = "Indica se o pagamento de taxa já foli realizado para um LPCO")
public class PagamentoTaxa {

    @XmlElement(name = "observacao")
    @ApiModelProperty(example = "Pagamento realizado", value = "Observação associada ao pagamento. Obrigatório quando para tipoPagamento=PAGAMENTO_REALIZADO ou  tipoPagamento=DISPENSA_PAGAMENTO, dispensado nos demais casos.")
    /**
     * Observação associada ao pagamento. Obrigatório quando para tipoPagamento=PAGAMENTO_REALIZADO ou  tipoPagamento=DISPENSA_PAGAMENTO, dispensado nos demais casos.
     **/
    private String observacao = null;
    @XmlElement(name = "tipoTaxa", required = true)
    @ApiModelProperty(example = "REGISTRO_LPCO", required = true, value = "Tipo de taxa que foi paga.")
    /**
     * Tipo de taxa que foi paga.
     **/
    private TipoTaxaEnum tipoTaxa = null;
    @XmlElement(name = "tipoPagamento", required = true)
    @ApiModelProperty(example = "PAGAMENTO", required = true, value = "Indica se foi pagamento ou dispensa/isenção de pagamento.")
    /**
     * Indica se foi pagamento ou dispensa/isenção de pagamento.
     **/
    private TipoPagamentoEnum tipoPagamento = null;

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
     * Observação associada ao pagamento. Obrigatório quando para tipoPagamento&#x3D;PAGAMENTO_REALIZADO ou  tipoPagamento&#x3D;DISPENSA_PAGAMENTO, dispensado nos demais casos.
     *
     * @return observacao
     **/
    @JsonProperty("observacao")
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public PagamentoTaxa observacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    /**
     * Tipo de taxa que foi paga.
     *
     * @return tipoTaxa
     **/
    @JsonProperty("tipoTaxa")
    @NotNull
    public String getTipoTaxa() {
        if (tipoTaxa == null) {
            return null;
        }
        return tipoTaxa.value();
    }

    public void setTipoTaxa(TipoTaxaEnum tipoTaxa) {
        this.tipoTaxa = tipoTaxa;
    }

    public PagamentoTaxa tipoTaxa(TipoTaxaEnum tipoTaxa) {
        this.tipoTaxa = tipoTaxa;
        return this;
    }

    /**
     * Indica se foi pagamento ou dispensa/isenção de pagamento.
     *
     * @return tipoPagamento
     **/
    @JsonProperty("tipoPagamento")
    @NotNull
    public String getTipoPagamento() {
        if (tipoPagamento == null) {
            return null;
        }
        return tipoPagamento.value();
    }

    public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public PagamentoTaxa tipoPagamento(TipoPagamentoEnum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class PagamentoTaxa {\n" +
                "    observacao: " + toIndentedString(observacao) + "\n" +
                "    tipoTaxa: " + toIndentedString(tipoTaxa) + "\n" +
                "    tipoPagamento: " + toIndentedString(tipoPagamento) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "TipoTaxaEnum")
    @XmlEnum(String.class)
    public enum TipoTaxaEnum {

        @XmlEnumValue("REGISTRO_LPCO")
        @JsonProperty("REGISTRO_LPCO")
        REGISTRO_LPCO("REGISTRO_LPCO"),

        @XmlEnumValue("RETIFICACAO")
        @JsonProperty("RETIFICACAO")
        RETIFICACAO("RETIFICACAO"),

        @XmlEnumValue("PRORROGACAO")
        @JsonProperty("PRORROGACAO")
        PRORROGACAO("PRORROGACAO"),

        @XmlEnumValue("COMPATIBILIZACAO")
        @JsonProperty("COMPATIBILIZACAO")
        COMPATIBILIZACAO("COMPATIBILIZACAO"),

        @XmlEnumValue("RESPOSTA_EXIGENCIA")
        @JsonProperty("RESPOSTA_EXIGENCIA")
        RESPOSTA_EXIGENCIA("RESPOSTA_EXIGENCIA");


        private final String value;

        TipoTaxaEnum(String v) {
            value = v;
        }

        public static TipoTaxaEnum fromValue(String v) {
            for (TipoTaxaEnum b : TipoTaxaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTaxaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoPagamentoEnum")
    @XmlEnum(String.class)
    public enum TipoPagamentoEnum {

        @XmlEnumValue("PAGAMENTO")
        @JsonProperty("PAGAMENTO")
        PAGAMENTO("PAGAMENTO"),

        @XmlEnumValue("DISPENSA")
        @JsonProperty("DISPENSA")
        DISPENSA("DISPENSA");


        private final String value;

        TipoPagamentoEnum(String v) {
            value = v;
        }

        public static TipoPagamentoEnum fromValue(String v) {
            for (TipoPagamentoEnum b : TipoPagamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoPagamentoEnum");
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
