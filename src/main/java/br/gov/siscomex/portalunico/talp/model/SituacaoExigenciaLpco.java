package br.gov.siscomex.portalunico.talp.model;

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
@XmlType(name = "SituacaoExigenciaLpco", propOrder =
        {"id", "descricao"
        })

@XmlRootElement(name = "SituacaoExigenciaLpco")
/**
 * Situações possíveis em que se encontra uma exigência para o pedido de LPCO
 **/
@ApiModel(description = "Situações possíveis em que se encontra uma exigência para o pedido de LPCO")
public class SituacaoExigenciaLpco {


    @XmlElement(name = "id", required = true)
    @ApiModelProperty(example = "0", required = true, value = "Código da situação")
    /**
     * Código da situação
     **/
    private IdEnum id = null;
    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Pendente", value = "Descrição textual situação")
    /**
     * Descrição textual situação
     **/
    private DescricaoEnum descricao = null;

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
     * Código da situação
     *
     * @return id
     **/
    @JsonProperty("id")
    @NotNull
    public String getId() {
        if (id == null) {
            return null;
        }
        return id.value();
    }

    public void setId(IdEnum id) {
        this.id = id;
    }

    public SituacaoExigenciaLpco id(IdEnum id) {
        this.id = id;
        return this;
    }

    /**
     * Descrição textual situação
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        if (descricao == null) {
            return null;
        }
        return descricao.value();
    }

    public void setDescricao(DescricaoEnum descricao) {
        this.descricao = descricao;
    }

    public SituacaoExigenciaLpco descricao(DescricaoEnum descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SituacaoExigenciaLpco {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }


    @XmlType(name = "IdEnum")
    @XmlEnum(String.class)
    public enum IdEnum {

        @XmlEnumValue("0")
        @JsonProperty("0")
        _0("0"),

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        IdEnum(String v) {
            value = v;
        }

        public static IdEnum fromValue(String v) {
            for (IdEnum b : IdEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IdEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "DescricaoEnum")
    @XmlEnum(String.class)
    public enum DescricaoEnum {

        @XmlEnumValue("Pendente")
        @JsonProperty("Pendente")
        PENDENTE("Pendente"),

        @XmlEnumValue("Cumprida")
        @JsonProperty("Cumprida")
        CUMPRIDA("Cumprida"),

        @XmlEnumValue("Cancelada")
        @JsonProperty("Cancelada")
        CANCELADA("Cancelada");


        private final String value;

        DescricaoEnum(String v) {
            value = v;
        }

        public static DescricaoEnum fromValue(String v) {
            for (DescricaoEnum b : DescricaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to DescricaoEnum");
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
