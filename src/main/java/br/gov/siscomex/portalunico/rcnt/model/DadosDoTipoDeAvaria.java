package br.gov.siscomex.portalunico.rcnt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@XmlType(name = "DadosDoTipoDeAvaria", propOrder =
        {"tipoAvaria", "idElemento"
        })

@XmlRootElement(name = "DadosDoTipoDeAvaria")
public class DadosDoTipoDeAvaria {


    @XmlElement(name = "tipoAvaria")
    @ApiModelProperty(example = "E", value = "Tipo de Avaria.<br/>Domínio:<br/>A - Diferença de peso<br/>B - Lacre violado<br/>C - Amassado<br/>D - Vazamento<br/>E - Quebrado<br/>F - Rasgado<br/>G - Refitado<br/>H - Furado<br/>I - Aberto<br/>J - Molhado<br/>K - Despregado<br/>L - Repregado<br/>M - Indícios de violação<br/>N - Riscado<br/>O - Sensor de Impacto Ativado<br/>P - Sensor de Inclinação Ativado<br/>Q - Carga Recebida com Alteração de Informação<br/>R - Indícios de Deterioração<br/>S - Carga Lacrada Pelo Fiel Depositário")
    /**
     * Tipo de Avaria.<br/>Domínio:<br/>A - Diferença de peso<br/>B - Lacre violado<br/>C - Amassado<br/>D - Vazamento<br/>E - Quebrado<br/>F - Rasgado<br/>G - Refitado<br/>H - Furado<br/>I - Aberto<br/>J - Molhado<br/>K - Despregado<br/>L - Repregado<br/>M - Indícios de violação<br/>N - Riscado<br/>O - Sensor de Impacto Ativado<br/>P - Sensor de Inclinação Ativado<br/>Q - Carga Recebida com Alteração de Informação<br/>R - Indícios de Deterioração<br/>S - Carga Lacrada Pelo Fiel Depositário
     **/
    private TipoAvariaEnum tipoAvaria = null;
    @XmlElement(name = "idElemento", required = true)
    @ApiModelProperty(required = true, value = "Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40")
    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.<br/>Tamanho: 40
     **/
    private String idElemento = null;

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
     * Tipo de Avaria.&lt;br/&gt;Domínio:&lt;br/&gt;A - Diferença de peso&lt;br/&gt;B - Lacre violado&lt;br/&gt;C - Amassado&lt;br/&gt;D - Vazamento&lt;br/&gt;E - Quebrado&lt;br/&gt;F - Rasgado&lt;br/&gt;G - Refitado&lt;br/&gt;H - Furado&lt;br/&gt;I - Aberto&lt;br/&gt;J - Molhado&lt;br/&gt;K - Despregado&lt;br/&gt;L - Repregado&lt;br/&gt;M - Indícios de violação&lt;br/&gt;N - Riscado&lt;br/&gt;O - Sensor de Impacto Ativado&lt;br/&gt;P - Sensor de Inclinação Ativado&lt;br/&gt;Q - Carga Recebida com Alteração de Informação&lt;br/&gt;R - Indícios de Deterioração&lt;br/&gt;S - Carga Lacrada Pelo Fiel Depositário
     *
     * @return tipoAvaria
     **/
    @JsonProperty("tipoAvaria")
    public String getTipoAvaria() {
        if (tipoAvaria == null) {
            return null;
        }
        return tipoAvaria.value();
    }

    public void setTipoAvaria(TipoAvariaEnum tipoAvaria) {
        this.tipoAvaria = tipoAvaria;
    }

    public DadosDoTipoDeAvaria tipoAvaria(TipoAvariaEnum tipoAvaria) {
        this.tipoAvaria = tipoAvaria;
        return this;
    }

    /**
     * Identificação de cada elemento da lista. Este atributo é obrigatório e deve ser único dentro da lista correspondente.&lt;br/&gt;Tamanho: 40
     *
     * @return idElemento
     **/
    @JsonProperty("idElemento")
    @NotNull
    public String getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
    }

    public DadosDoTipoDeAvaria idElemento(String idElemento) {
        this.idElemento = idElemento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDoTipoDeAvaria {\n" +
                "    tipoAvaria: " + toIndentedString(tipoAvaria) + "\n" +
                "    idElemento: " + toIndentedString(idElemento) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoAvariaEnum")
    @XmlEnum(String.class)
    public enum TipoAvariaEnum {

        @XmlEnumValue("'A'")
        @JsonProperty("'A'")
        A_("'A'"),

        @XmlEnumValue("'B'")
        @JsonProperty("'B'")
        B_("'B'"),

        @XmlEnumValue("'C'")
        @JsonProperty("'C'")
        C_("'C'"),

        @XmlEnumValue("'D'")
        @JsonProperty("'D'")
        D_("'D'"),

        @XmlEnumValue("'E'")
        @JsonProperty("'E'")
        E_("'E'"),

        @XmlEnumValue("'F'")
        @JsonProperty("'F'")
        F_("'F'"),

        @XmlEnumValue("'G'")
        @JsonProperty("'G'")
        G_("'G'"),

        @XmlEnumValue("'H'")
        @JsonProperty("'H'")
        H_("'H'"),

        @XmlEnumValue("'I'")
        @JsonProperty("'I'")
        I_("'I'"),

        @XmlEnumValue("'J'")
        @JsonProperty("'J'")
        J_("'J'"),

        @XmlEnumValue("'K'")
        @JsonProperty("'K'")
        K_("'K'"),

        @XmlEnumValue("'L'")
        @JsonProperty("'L'")
        L_("'L'"),

        @XmlEnumValue("'M'")
        @JsonProperty("'M'")
        M_("'M'"),

        @XmlEnumValue("'N'")
        @JsonProperty("'N'")
        N_("'N'"),

        @XmlEnumValue("'O'")
        @JsonProperty("'O'")
        O_("'O'"),

        @XmlEnumValue("'P'")
        @JsonProperty("'P'")
        P_("'P'"),

        @XmlEnumValue("'Q'")
        @JsonProperty("'Q'")
        Q_("'Q'"),

        @XmlEnumValue("'R'")
        @JsonProperty("'R'")
        R_("'R'"),

        @XmlEnumValue("'S'")
        @JsonProperty("'S'")
        S_("'S'");


        private final String value;

        TipoAvariaEnum(String v) {
            value = v;
        }

        public static TipoAvariaEnum fromValue(String v) {
            for (TipoAvariaEnum b : TipoAvariaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAvariaEnum");
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
