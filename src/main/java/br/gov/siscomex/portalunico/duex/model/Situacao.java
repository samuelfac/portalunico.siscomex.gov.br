package br.gov.siscomex.portalunico.duex.model;

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
@XmlType(name = "Situacao", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "Situacao")
public class Situacao {


    @XmlElement(name = "codigo")
    @ApiModelProperty(value = "Código<br />Formato: Inteiro, com 1 digito")
    /**
     * Código<br />Formato: Inteiro, com 1 digito
     **/
    private CodigoEnum codigo = null;
    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50")
    /**
     * Descrição<br />Tamanho mínimo: 0<br />Tamanho máximo: 50
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
     * Código&lt;br /&gt;Formato: Inteiro, com 1 digito
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

    public Situacao codigo(CodigoEnum codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição&lt;br /&gt;Tamanho mínimo: 0&lt;br /&gt;Tamanho máximo: 50
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

    public Situacao descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Situacao {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CodigoEnum")
    @XmlEnum(String.class)
    public enum CodigoEnum {

        @XmlEnumValue("AGUARDANDO_VINCULO")
        @JsonProperty("AGUARDANDO_VINCULO")
        AGUARDANDO_VINCULO("AGUARDANDO_VINCULO"),

        @XmlEnumValue("VINCULADO")
        @JsonProperty("VINCULADO")
        VINCULADO("VINCULADO"),

        @XmlEnumValue("NAO_VINCULADO")
        @JsonProperty("NAO_VINCULADO")
        NAO_VINCULADO("NAO_VINCULADO");


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
