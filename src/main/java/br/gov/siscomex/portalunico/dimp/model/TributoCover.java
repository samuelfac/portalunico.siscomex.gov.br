package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TributoCover", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "TributoCover")
/**
 * Dados de um tributo.
 **/
@ApiModel(description = "Dados de um tributo.")
public class TributoCover {


    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "IPI", value = "Código do regime tributário.<br>Domínio:")
    /**
     * Código do regime tributário.<br>Domínio:
     **/
    private CodigoEnum codigo = null;

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
     * Código do regime tributário.&lt;br&gt;Domínio:
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        if (codigo == null) {
            return null;
        }
        return codigo.value();
    }

    public void setCodigo(CodigoEnum codigo) {
        this.codigo = codigo;
    }

    public TributoCover codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TributoCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

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

        @XmlEnumValue("MEDIDAS")
        @JsonProperty("MEDIDAS")
        MEDIDAS("MEDIDAS"),

        @XmlEnumValue("SALVAGUARDA")
        @JsonProperty("SALVAGUARDA")
        SALVAGUARDA("SALVAGUARDA"),

        @XmlEnumValue("MULTA")
        @JsonProperty("MULTA")
        MULTA("MULTA");


        private final String value;

        CodigoEnum(String v) {
            value = v;
        }

        public static CodigoEnum fromValue(String v) {
            for (CodigoEnum b : CodigoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CodigoEnum");
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
