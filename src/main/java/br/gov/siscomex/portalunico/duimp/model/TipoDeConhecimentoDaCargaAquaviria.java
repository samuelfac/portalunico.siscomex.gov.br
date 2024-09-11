package br.gov.siscomex.portalunico.duimp.model;

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
@XmlType(name = "TipoDeConhecimentoDaCargaAquaviria", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoDeConhecimentoDaCargaAquaviria")
public class TipoDeConhecimentoDaCargaAquaviria {


    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

        @XmlEnumValue("10")
        @JsonProperty("10")
        _10("10"),

        @XmlEnumValue("12")
        @JsonProperty("12")
        _12("12");


        private final String value;

        CodigoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CodigoEnum fromValue(String v) {
            for (CodigoEnum b : CodigoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CodigoEnum");
        }
    }

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "10", value = "Código do Tipo de conhecimento de transporte de carga.<br>Dominio: <br>10 - BL, <br>12 - HBL")
    /**
     * Código do Tipo de conhecimento de transporte de carga.<br>Dominio: <br>10 - BL, <br>12 - HBL
     **/
    private CodigoEnum codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "BL", value = "Descrição do Tipo de conhecimento de transporte de carga")
    /**
     * Descrição do Tipo de conhecimento de transporte de carga
     **/
    private String descricao = null;

    /**
     * Código do Tipo de conhecimento de transporte de carga.&lt;br&gt;Dominio: &lt;br&gt;10 - BL, &lt;br&gt;12 - HBL
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

    public TipoDeConhecimentoDaCargaAquaviria codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do Tipo de conhecimento de transporte de carga
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

    public TipoDeConhecimentoDaCargaAquaviria descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TipoDeConhecimentoDaCargaAquaviria {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
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

