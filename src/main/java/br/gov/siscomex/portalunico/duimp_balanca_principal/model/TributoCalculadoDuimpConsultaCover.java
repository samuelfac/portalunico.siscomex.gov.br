package br.gov.siscomex.portalunico.duimp_balanca_principal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
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
@XmlType(name = "TributoCalculadoDuimpConsultaCover", propOrder =
        {"tipo", "valoresBRL"
        })

@XmlRootElement(name = "TributoCalculadoDuimpConsultaCover")
/**
 * Valores do cálculo do tributo e a memória de cálculo.
 **/
@ApiModel(description = "Valores do cálculo do tributo e a memória de cálculo.")
public class TributoCalculadoDuimpConsultaCover {


    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("II")
        @JsonProperty("II")
        II("II"),

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

    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "II", value = "Tipo de impostos (códigos de receita principal únicos).<br>Domínio:")
    /**
     * Tipo de impostos (códigos de receita principal únicos).<br>Domínio:
     **/
    private TipoEnum tipo = null;

    @XmlElement(name = "valoresBRL")
    @ApiModelProperty(value = "")
    @Valid
    private ValoresTributoDuimpConsultaCover valoresBRL = null;

    /**
     * Tipo de impostos (códigos de receita principal únicos).&lt;br&gt;Domínio:
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public TributoCalculadoDuimpConsultaCover tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get valoresBRL
     *
     * @return valoresBRL
     **/
    @JsonProperty("valoresBRL")
    public ValoresTributoDuimpConsultaCover getValoresBRL() {
        return valoresBRL;
    }

    public void setValoresBRL(ValoresTributoDuimpConsultaCover valoresBRL) {
        this.valoresBRL = valoresBRL;
    }

    public TributoCalculadoDuimpConsultaCover valoresBRL(ValoresTributoDuimpConsultaCover valoresBRL) {
        this.valoresBRL = valoresBRL;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TributoCalculadoDuimpConsultaCover {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    valoresBRL: " + toIndentedString(valoresBRL) + "\n" +
                "}";
        return sb;
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

