package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avaria", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "Avaria")
public class Avaria {


    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "A", value = "Código da avaria<br>Tamanho: 1")
    /**
     * Código da avaria<br>Tamanho: 1
     **/
    private CodigoEnum codigo = null;
    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Diferença de peso", value = "Descrição da avaria<br>Tamanho: 60")
    /**
     * Descrição da avaria<br>Tamanho: 60
     **/
    private String descricao = null;

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
     * Código da avaria&lt;br&gt;Tamanho: 1
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

    public Avaria codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da avaria&lt;br&gt;Tamanho: 60
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Avaria descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Avaria {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

        @XmlEnumValue("A")
        @JsonProperty("A")
        A("A"),

        @XmlEnumValue("B")
        @JsonProperty("B")
        B("B"),

        @XmlEnumValue("C")
        @JsonProperty("C")
        C("C"),

        @XmlEnumValue("D")
        @JsonProperty("D")
        D("D"),

        @XmlEnumValue("E")
        @JsonProperty("E")
        E("E"),

        @XmlEnumValue("F")
        @JsonProperty("F")
        F("F"),

        @XmlEnumValue("G")
        @JsonProperty("G")
        G("G"),

        @XmlEnumValue("H")
        @JsonProperty("H")
        H("H"),

        @XmlEnumValue("I")
        @JsonProperty("I")
        I("I"),

        @XmlEnumValue("J")
        @JsonProperty("J")
        J("J"),

        @XmlEnumValue("K")
        @JsonProperty("K")
        K("K"),

        @XmlEnumValue("L")
        @JsonProperty("L")
        L("L"),

        @XmlEnumValue("M")
        @JsonProperty("M")
        M("M"),

        @XmlEnumValue("N")
        @JsonProperty("N")
        N("N"),

        @XmlEnumValue("O")
        @JsonProperty("O")
        O("O"),

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("Q")
        @JsonProperty("Q")
        Q("Q"),

        @XmlEnumValue("R")
        @JsonProperty("R")
        R("R"),

        @XmlEnumValue("S")
        @JsonProperty("S")
        S("S");


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
