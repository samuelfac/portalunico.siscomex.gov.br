package br.gov.siscomex.portalunico.talpco.model;

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
@XmlType(name = "SituacaoProrrogacaoLpco", propOrder =
        {"id", "descricao"
        })

@XmlRootElement(name = "SituacaoProrrogacaoLpco")
/**
 * Situações possíveis em que se encontra um pedido de prorrogação do LPCO
 **/
@ApiModel(description = "Situações possíveis em que se encontra um pedido de prorrogação do LPCO")
public class SituacaoProrrogacaoLpco {


    @XmlType(name = "IdEnum")
    @XmlEnum(String.class)
    public enum IdEnum {

        @XmlEnumValue("PARA_ANALISE")
        @JsonProperty("PARA_ANALISE")
        PARA_ANALISE("PARA_ANALISE"),

        @XmlEnumValue("ACEITA")
        @JsonProperty("ACEITA")
        ACEITA("ACEITA"),

        @XmlEnumValue("NEGADA")
        @JsonProperty("NEGADA")
        NEGADA("NEGADA"),

        @XmlEnumValue("CANCELADA")
        @JsonProperty("CANCELADA")
        CANCELADA("CANCELADA"),

        @XmlEnumValue("AUTOMATICA")
        @JsonProperty("AUTOMATICA")
        AUTOMATICA("AUTOMATICA"),

        @XmlEnumValue("AGUARDANDO_PAGAMENTO")
        @JsonProperty("AGUARDANDO_PAGAMENTO")
        AGUARDANDO_PAGAMENTO("AGUARDANDO_PAGAMENTO");


        private final String value;

        IdEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static IdEnum fromValue(String v) {
            for (IdEnum b : IdEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IdEnum");
        }
    }

    @XmlElement(name = "id", required = true)
    @ApiModelProperty(example = "PARA_ANALISE", required = true, value = "Código da situação")
    /**
     * Código da situação
     **/
    private IdEnum id = null;


    @XmlType(name = "DescricaoEnum")
    @XmlEnum(String.class)
    public enum DescricaoEnum {

        @XmlEnumValue("Para análise")
        @JsonProperty("Para análise")
        PARA_AN_LISE("Para análise"),

        @XmlEnumValue("Aceita")
        @JsonProperty("Aceita")
        ACEITA("Aceita"),

        @XmlEnumValue("Negada")
        @JsonProperty("Negada")
        NEGADA("Negada"),

        @XmlEnumValue("Cancelada")
        @JsonProperty("Cancelada")
        CANCELADA("Cancelada"),

        @XmlEnumValue("Aceita automaticamente")
        @JsonProperty("Aceita automaticamente")
        ACEITA_AUTOMATICAMENTE("Aceita automaticamente"),

        @XmlEnumValue("Aguardando pagamento")
        @JsonProperty("Aguardando pagamento")
        AGUARDANDO_PAGAMENTO("Aguardando pagamento");


        private final String value;

        DescricaoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DescricaoEnum fromValue(String v) {
            for (DescricaoEnum b : DescricaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to DescricaoEnum");
        }
    }

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Para análise", value = "Descrição textual situação")
    /**
     * Descrição textual situação
     **/
    private DescricaoEnum descricao = null;

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

    public SituacaoProrrogacaoLpco id(IdEnum id) {
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

    public SituacaoProrrogacaoLpco descricao(DescricaoEnum descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SituacaoProrrogacaoLpco {\n" +
                "    id: " + toIndentedString(id) + "\n" +
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

