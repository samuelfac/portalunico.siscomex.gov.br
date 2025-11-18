package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "TributoPagamentoRegistroCover", propOrder =
        {"tipo"
        })

@XmlRootElement(name = "TributoPagamentoRegistroCover")
/**
 * Tipo de tributo.
 **/
@ApiModel(description = "Tipo de tributo.")
public class TributoPagamentoRegistroCover {


    @XmlElement(name = "tipo", required = true)
    @ApiModelProperty(example = "IPI", required = true, value = "Código do tipo de tributo.<br>Domínio:")
    /**
     * Código do tipo de tributo.<br>Domínio:
     **/
    private TipoEnum tipo = null;

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
     * Código do tipo de tributo.&lt;br&gt;Domínio:
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    @NotNull
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public TributoPagamentoRegistroCover tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TributoPagamentoRegistroCover {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("II")
        @JsonProperty("II")
        II("II"),

        @XmlEnumValue("SALVAGUARDA")
        @JsonProperty("SALVAGUARDA")
        SALVAGUARDA("SALVAGUARDA"),

        @XmlEnumValue("IPI")
        @JsonProperty("IPI")
        IPI("IPI"),

        @XmlEnumValue("PIS")
        @JsonProperty("PIS")
        PIS("PIS"),

        @XmlEnumValue("COFINS")
        @JsonProperty("COFINS")
        COFINS("COFINS"),

        @XmlEnumValue("CIDE")
        @JsonProperty("CIDE")
        CIDE("CIDE"),

        @XmlEnumValue("ANTIDUMPING")
        @JsonProperty("ANTIDUMPING")
        ANTIDUMPING("ANTIDUMPING"),

        @XmlEnumValue("MEDIDAS_COMPENSATORIAS")
        @JsonProperty("MEDIDAS_COMPENSATORIAS")
        MEDIDAS_COMPENSATORIAS("MEDIDAS_COMPENSATORIAS"),

        @XmlEnumValue("MULTA_COM_REDUCAO")
        @JsonProperty("MULTA_COM_REDUCAO")
        MULTA_COM_REDUCAO("MULTA_COM_REDUCAO"),

        @XmlEnumValue("MULTA_SEM_REDUCAO")
        @JsonProperty("MULTA_SEM_REDUCAO")
        MULTA_SEM_REDUCAO("MULTA_SEM_REDUCAO"),

        @XmlEnumValue("TAXA_UTILIZACAO")
        @JsonProperty("TAXA_UTILIZACAO")
        TAXA_UTILIZACAO("TAXA_UTILIZACAO");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
        }
    }
}
