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
@XmlType(name = "TipoManifestoViagem", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoManifestoViagem")
public class TipoManifestoViagem {


    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "1", value = "Tipo de documento de viagem")
    /**
     * Tipo de documento de viagem
     **/
    private CodigoEnum codigo = null;
    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "MIC/DTA", value = "Descriçao Tipo de documento de viagem")
    /**
     * Descriçao Tipo de documento de viagem
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
     * Tipo de documento de viagem
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public Integer getCodigo() {
        if (codigo == null) {
            return null;
        }
        return codigo.value();
    }

    public void setCodigo(CodigoEnum codigo) {
        this.codigo = codigo;
    }

    public TipoManifestoViagem codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descriçao Tipo de documento de viagem
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

    public TipoManifestoViagem descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TipoManifestoViagem {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(Integer.class)
    public enum CodigoEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        NUMBER_1(Integer.valueOf(1)),

        @XmlEnumValue("3")
        @JsonProperty("3")
        NUMBER_3(Integer.valueOf(3)),

        @XmlEnumValue("4")
        @JsonProperty("4")
        NUMBER_4(Integer.valueOf(4));


        private final Integer value;

        CodigoEnum(Integer v) {
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

        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
