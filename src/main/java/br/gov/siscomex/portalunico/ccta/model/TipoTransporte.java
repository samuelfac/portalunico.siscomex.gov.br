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
@XmlType(name = "TipoTransporte", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoTransporte")
public class TipoTransporte {


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

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "REG", value = "Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)")
    /**
     * Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)
     **/
    private CodigoEnum codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Nome do tipo de transporte", value = "Nome do tipo de transporte")
    /**
     * Nome do tipo de transporte
     **/
    private String descricao = null;

    /**
     * Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)
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

    public TipoTransporte codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome do tipo de transporte
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

    public TipoTransporte descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoTransporte {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

        @XmlEnumValue("REG")
        @JsonProperty("REG")
        REG("REG"),

        @XmlEnumValue("OCA")
        @JsonProperty("OCA")
        OCA("OCA"),

        @XmlEnumValue("PRO")
        @JsonProperty("PRO")
        PRO("PRO");


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
