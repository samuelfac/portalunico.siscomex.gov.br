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
@XmlType(name = "TipoTotalMoedaDestino", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoTotalMoedaDestino")
public class TipoTotalMoedaDestino {


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
    @ApiModelProperty(example = "E", value = "Código do total na moeda de destino.<br/>Tamanho: 2<br/>M - Total na Moeda de Destino<br/>E - Encargos no Destino<br/>TC - Total Collect")
    /**
     * Código do total na moeda de destino.<br/>Tamanho: 2<br/>M - Total na Moeda de Destino<br/>E - Encargos no Destino<br/>TC - Total Collect
     **/
    private CodigoEnum codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Encargos no Destino", value = "Descrição do total na moeda de destino.<br/>Tamanho: 25")
    /**
     * Descrição do total na moeda de destino.<br/>Tamanho: 25
     **/
    private String descricao = null;

    /**
     * Código do total na moeda de destino.&lt;br/&gt;Tamanho: 2&lt;br/&gt;M - Total na Moeda de Destino&lt;br/&gt;E - Encargos no Destino&lt;br/&gt;TC - Total Collect
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

    public TipoTotalMoedaDestino codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do total na moeda de destino.&lt;br/&gt;Tamanho: 25
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

    public TipoTotalMoedaDestino descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoTotalMoedaDestino {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

        @XmlEnumValue("M")
        @JsonProperty("M")
        M("M"),

        @XmlEnumValue("E")
        @JsonProperty("E")
        E("E"),

        @XmlEnumValue("TC")
        @JsonProperty("TC")
        TC("TC");


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
