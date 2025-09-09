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
@XmlType(name = "DispensaPagamentoLpcoRequest", propOrder =
        {"momentoTaxa", "justificativa"
        })

@XmlRootElement(name = "DispensaPagamentoLpcoRequest")
/**
 * Dados de uma operação de dispensa de pagamento de taxa de um LPCO
 **/
@ApiModel(description = "Dados de uma operação de dispensa de pagamento de taxa de um LPCO")
public class DispensaPagamentoLpcoRequest {


    @XmlElement(name = "momentoTaxa", required = true)
    @ApiModelProperty(example = "REGISTRO_LPCO", required = true, value = "Momento do LPCO que ocasionou a geração da taxa<br>Tamanho mínimo: 0 <br>Tamanho máximo: 20")
    /**
     * Momento do LPCO que ocasionou a geração da taxa<br>Tamanho mínimo: 0 <br>Tamanho máximo: 20
     **/
    private MomentoTaxaEnum momentoTaxa = null;
    @XmlElement(name = "justificativa")
    @ApiModelProperty(example = "Texto livre.", value = "Justificativa para a dispensa do pagamento de taxa do LPCO <br> Tamanho mínimo: 1<br>Tamanho máximo: 4000")
    /**
     * Justificativa para a dispensa do pagamento de taxa do LPCO <br> Tamanho mínimo: 1<br>Tamanho máximo: 4000
     **/
    private String justificativa = null;

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
     * Momento do LPCO que ocasionou a geração da taxa&lt;br&gt;Tamanho mínimo: 0 &lt;br&gt;Tamanho máximo: 20
     *
     * @return momentoTaxa
     **/
    @JsonProperty("momentoTaxa")
    @NotNull
    public String getMomentoTaxa() {
        if (momentoTaxa == null) {
            return null;
        }
        return momentoTaxa.value();
    }

    public void setMomentoTaxa(MomentoTaxaEnum momentoTaxa) {
        this.momentoTaxa = momentoTaxa;
    }

    public DispensaPagamentoLpcoRequest momentoTaxa(MomentoTaxaEnum momentoTaxa) {
        this.momentoTaxa = momentoTaxa;
        return this;
    }

    /**
     * Justificativa para a dispensa do pagamento de taxa do LPCO &lt;br&gt; Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4000
     *
     * @return justificativa
     **/
    @JsonProperty("justificativa")
    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public DispensaPagamentoLpcoRequest justificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DispensaPagamentoLpcoRequest {\n" +
                "    momentoTaxa: " + toIndentedString(momentoTaxa) + "\n" +
                "    justificativa: " + toIndentedString(justificativa) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "MomentoTaxaEnum")
    @XmlEnum(String.class)
    public enum MomentoTaxaEnum {

        @XmlEnumValue("REGISTRO_LPCO<br>RETIFICACAO<br>PRORROGACAO<br>COMPATIBILIZACAO<br>RESPOSTA_EXIGENCIA")
        @JsonProperty("REGISTRO_LPCO<br>RETIFICACAO<br>PRORROGACAO<br>COMPATIBILIZACAO<br>RESPOSTA_EXIGENCIA")
        REGISTRO_LPCO_BR_RETIFICACAO_BR_PRORROGACAO_BR_COMPATIBILIZACAO_BR_RESPOSTA_EXIGENCIA("REGISTRO_LPCO<br>RETIFICACAO<br>PRORROGACAO<br>COMPATIBILIZACAO<br>RESPOSTA_EXIGENCIA");


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
}
