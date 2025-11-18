package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGranel", propOrder =
        {"tipoGranel", "unidademedida", "quantidade"
        })

@XmlRootElement(name = "TGranel")
/**
 * Dados informados para carga do tipo granel
 **/
@ApiModel(description = "Dados informados para carga do tipo granel")
public class TGranel {

    @XmlElement(name = "tipoGranel", required = true)
    @ApiModelProperty(example = "19", required = true, value = "Tipo de granel conforme a tabela Tipo de Granel<br>Tamanho: 2<br>Formato: NN")
    /**
     * Tipo de granel conforme a tabela Tipo de Granel<br>Tamanho: 2<br>Formato: NN
     **/
    private Integer tipoGranel = null;

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

    @XmlElement(name = "unidademedida", required = true)
    @ApiModelProperty(example = "kg", required = true, value = "Unidade de medida estatística<br>Tamanho: 4<br>Formato: AAAA<br>Domínio: kg = quilo e m3 = metro cúbico.")
    /**
     * Unidade de medida estatística<br>Tamanho: 4<br>Formato: AAAA<br>Domínio: kg = quilo e m3 = metro cúbico.
     **/
    private UnidademedidaEnum unidademedida = null;

    @XmlElement(name = "quantidade", required = true)
    @ApiModelProperty(example = "123.456", required = true, value = "Peso bruto<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN")
    @Valid
    /**
     * Peso bruto<br>Tamanho: 12.3<br>Formato: NNNNNNNNNNNN.NNN
     **/
    private BigDecimal quantidade = null;

    /**
     * Tipo de granel conforme a tabela Tipo de Granel&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return tipoGranel
     **/
    @JsonProperty("tipoGranel")
    @NotNull
    public Integer getTipoGranel() {
        return tipoGranel;
    }

    public void setTipoGranel(Integer tipoGranel) {
        this.tipoGranel = tipoGranel;
    }

    public TGranel tipoGranel(Integer tipoGranel) {
        this.tipoGranel = tipoGranel;
        return this;
    }

    /**
     * Unidade de medida estatística&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: AAAA&lt;br&gt;Domínio: kg &#x3D; quilo e m3 &#x3D; metro cúbico.
     *
     * @return unidademedida
     **/
    @JsonProperty("unidademedida")
    @NotNull
    public String getUnidademedida() {
        if (unidademedida == null) {
            return null;
        }
        return unidademedida.value();
    }

    public void setUnidademedida(UnidademedidaEnum unidademedida) {
        this.unidademedida = unidademedida;
    }

    public TGranel unidademedida(UnidademedidaEnum unidademedida) {
        this.unidademedida = unidademedida;
        return this;
    }

    /**
     * Peso bruto&lt;br&gt;Tamanho: 12.3&lt;br&gt;Formato: NNNNNNNNNNNN.NNN
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    @NotNull
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public TGranel quantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TGranel {\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "    unidademedida: " + toIndentedString(unidademedida) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "UnidademedidaEnum")
    @XmlEnum(String.class)
    public enum UnidademedidaEnum {

        @XmlEnumValue("KG")
        @JsonProperty("KG")
        KG("KG"),

        @XmlEnumValue("M_3")
        @JsonProperty("M_3")
        M_3("M_3");


        private final String value;

        UnidademedidaEnum(String v) {
            value = v;
        }

        public static UnidademedidaEnum fromValue(String v) {
            for (UnidademedidaEnum b : UnidademedidaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UnidademedidaEnum");
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
