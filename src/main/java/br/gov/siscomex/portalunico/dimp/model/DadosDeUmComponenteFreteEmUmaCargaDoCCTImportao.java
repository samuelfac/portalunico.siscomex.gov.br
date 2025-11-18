package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao", propOrder =
        {"tipoTotalMoeda", "collect", "prepaid"
        })

@XmlRootElement(name = "DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao")
public class DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao {


    @XmlElement(name = "tipoTotalMoeda")
    @ApiModelProperty(value = "Tipo de totalizador do componente do frete ")
    /**
     * Tipo de totalizador do componente do frete
     **/
    private TipoTotalMoedaEnum tipoTotalMoeda = null;
    @XmlElement(name = "collect")
    @ApiModelProperty(value = "")
    @Valid
    private DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao collect = null;
    @XmlElement(name = "prepaid")
    @ApiModelProperty(value = "")
    @Valid
    private DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao prepaid = null;

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
     * Tipo de totalizador do componente do frete
     *
     * @return tipoTotalMoeda
     **/
    @JsonProperty("tipoTotalMoeda")
    public String getTipoTotalMoeda() {
        if (tipoTotalMoeda == null) {
            return null;
        }
        return tipoTotalMoeda.value();
    }

    public void setTipoTotalMoeda(TipoTotalMoedaEnum tipoTotalMoeda) {
        this.tipoTotalMoeda = tipoTotalMoeda;
    }

    public DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao tipoTotalMoeda(TipoTotalMoedaEnum tipoTotalMoeda) {
        this.tipoTotalMoeda = tipoTotalMoeda;
        return this;
    }

    /**
     * Get collect
     *
     * @return collect
     **/
    @JsonProperty("collect")
    public DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao getCollect() {
        return collect;
    }

    public void setCollect(DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao collect) {
        this.collect = collect;
    }

    public DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao collect(DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao collect) {
        this.collect = collect;
        return this;
    }

    /**
     * Get prepaid
     *
     * @return prepaid
     **/
    @JsonProperty("prepaid")
    public DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao getPrepaid() {
        return prepaid;
    }

    public void setPrepaid(DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao prepaid) {
        this.prepaid = prepaid;
    }

    public DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao prepaid(DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaDoCCTImportao prepaid) {
        this.prepaid = prepaid;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDeUmComponenteFreteEmUmaCargaDoCCTImportao {\n" +
                "    tipoTotalMoeda: " + toIndentedString(tipoTotalMoeda) + "\n" +
                "    collect: " + toIndentedString(collect) + "\n" +
                "    prepaid: " + toIndentedString(prepaid) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoTotalMoedaEnum")
    @XmlEnum(String.class)
    public enum TipoTotalMoedaEnum {

        @XmlEnumValue("POR_PESO")
        @JsonProperty("POR_PESO")
        POR_PESO("POR_PESO"),

        @XmlEnumValue("POR_VALOR")
        @JsonProperty("POR_VALOR")
        POR_VALOR("POR_VALOR"),

        @XmlEnumValue("IMPOSTOS")
        @JsonProperty("IMPOSTOS")
        IMPOSTOS("IMPOSTOS"),

        @XmlEnumValue("OUTROS_SERVICOS_AGENTE_CARGA")
        @JsonProperty("OUTROS_SERVICOS_AGENTE_CARGA")
        OUTROS_SERVICOS_AGENTE_CARGA("OUTROS_SERVICOS_AGENTE_CARGA"),

        @XmlEnumValue("OUTROS_SERVICOS_TRANSPORTADOR")
        @JsonProperty("OUTROS_SERVICOS_TRANSPORTADOR")
        OUTROS_SERVICOS_TRANSPORTADOR("OUTROS_SERVICOS_TRANSPORTADOR"),

        @XmlEnumValue("TOTAL_MOEDA_ORIGEM")
        @JsonProperty("TOTAL_MOEDA_ORIGEM")
        TOTAL_MOEDA_ORIGEM("TOTAL_MOEDA_ORIGEM"),

        @XmlEnumValue("TOTAL_MOEDA_DESTINO")
        @JsonProperty("TOTAL_MOEDA_DESTINO")
        TOTAL_MOEDA_DESTINO("TOTAL_MOEDA_DESTINO"),

        @XmlEnumValue("ENCARGOS")
        @JsonProperty("ENCARGOS")
        ENCARGOS("ENCARGOS"),

        @XmlEnumValue("TOTAL_COLLECT")
        @JsonProperty("TOTAL_COLLECT")
        TOTAL_COLLECT("TOTAL_COLLECT"),

        @XmlEnumValue("INVALIDO")
        @JsonProperty("INVALIDO")
        INVALIDO("INVALIDO");


        private final String value;

        TipoTotalMoedaEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoTotalMoedaEnum fromValue(String v) {
            for (TipoTotalMoedaEnum b : TipoTotalMoedaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTotalMoedaEnum");
        }
    }
}
