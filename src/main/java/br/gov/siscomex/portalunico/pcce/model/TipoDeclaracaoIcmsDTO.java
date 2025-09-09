package br.gov.siscomex.portalunico.pcce.model;

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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDeclaracaoIcmsDTO", propOrder =
        {"tiposTratamento", "descTipoDeclaracao", "tipoDeclaracao"
        })

@XmlRootElement(name = "TipoDeclaracaoIcmsDTO")
/**
 * Dados e configurações disponíveis para um tipo de declaração de ICMS de Duimp
 **/
@ApiModel(description = "Dados e configurações disponíveis para um tipo de declaração de ICMS de Duimp")
public class TipoDeclaracaoIcmsDTO {

    @XmlElement(name = "tiposTratamento", required = true)
    @ApiModelProperty(required = true, value = "Lista dos tipos de tratamento disponibilizados pela Sefaz para esse tipo de declaração")
    @Valid
    /**
     * Lista dos tipos de tratamento disponibilizados pela Sefaz para esse tipo de declaração
     **/
    private List<TipoTratamentoIcmsDTO> tiposTratamento = new ArrayList<>();

    @XmlElement(name = "descTipoDeclaracao", required = true)
    @ApiModelProperty(example = "Pagamento integral", required = true, value = "Descrição do tipo de declaração/solicitação de ICMS")
    /**
     * Descrição do tipo de declaração/solicitação de ICMS
     **/
    private String descTipoDeclaracao = null;
    @XmlElement(name = "tipoDeclaracao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de declaração de Pagamento/Exoneração de ICMS")
    /**
     * Tipo de declaração de Pagamento/Exoneração de ICMS
     **/
    private TipoDeclaracaoEnum tipoDeclaracao = null;

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
     * Lista dos tipos de tratamento disponibilizados pela Sefaz para esse tipo de declaração
     *
     * @return tiposTratamento
     **/
    @JsonProperty("tiposTratamento")
    @NotNull
    public List<TipoTratamentoIcmsDTO> getTiposTratamento() {
        return tiposTratamento;
    }

    public void setTiposTratamento(List<TipoTratamentoIcmsDTO> tiposTratamento) {
        this.tiposTratamento = tiposTratamento;
    }

    public TipoDeclaracaoIcmsDTO tiposTratamento(List<TipoTratamentoIcmsDTO> tiposTratamento) {
        this.tiposTratamento = tiposTratamento;
        return this;
    }

    public TipoDeclaracaoIcmsDTO addTiposTratamentoItem(TipoTratamentoIcmsDTO tiposTratamentoItem) {
        this.tiposTratamento.add(tiposTratamentoItem);
        return this;
    }

    /**
     * Descrição do tipo de declaração/solicitação de ICMS
     *
     * @return descTipoDeclaracao
     **/
    @JsonProperty("descTipoDeclaracao")
    @NotNull
    public String getDescTipoDeclaracao() {
        return descTipoDeclaracao;
    }

    public void setDescTipoDeclaracao(String descTipoDeclaracao) {
        this.descTipoDeclaracao = descTipoDeclaracao;
    }

    public TipoDeclaracaoIcmsDTO descTipoDeclaracao(String descTipoDeclaracao) {
        this.descTipoDeclaracao = descTipoDeclaracao;
        return this;
    }

    /**
     * Tipo de declaração de Pagamento/Exoneração de ICMS
     *
     * @return tipoDeclaracao
     **/
    @JsonProperty("tipoDeclaracao")
    @NotNull
    public String getTipoDeclaracao() {
        if (tipoDeclaracao == null) {
            return null;
        }
        return tipoDeclaracao.value();
    }

    public void setTipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
    }

    public TipoDeclaracaoIcmsDTO tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TipoDeclaracaoIcmsDTO {\n" +
                "    tiposTratamento: " + toIndentedString(tiposTratamento) + "\n" +
                "    descTipoDeclaracao: " + toIndentedString(descTipoDeclaracao) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoDeclaracaoEnum")
    @XmlEnum(String.class)
    public enum TipoDeclaracaoEnum {

        @XmlEnumValue("PAGAMENTO_INTEGRAL_DUIMP")
        @JsonProperty("PAGAMENTO_INTEGRAL_DUIMP")
        PAGAMENTO_INTEGRAL_DUIMP("PAGAMENTO_INTEGRAL_DUIMP"),

        @XmlEnumValue("PAGAMENTO_PARCIAL_DUIMP")
        @JsonProperty("PAGAMENTO_PARCIAL_DUIMP")
        PAGAMENTO_PARCIAL_DUIMP("PAGAMENTO_PARCIAL_DUIMP"),

        @XmlEnumValue("EXONERACAO_INTEGRAL_DUIMP")
        @JsonProperty("EXONERACAO_INTEGRAL_DUIMP")
        EXONERACAO_INTEGRAL_DUIMP("EXONERACAO_INTEGRAL_DUIMP"),

        @XmlEnumValue("MANDADO_JUDICIAL_DUIMP")
        @JsonProperty("MANDADO_JUDICIAL_DUIMP")
        MANDADO_JUDICIAL_DUIMP("MANDADO_JUDICIAL_DUIMP"),

        @XmlEnumValue("EXONERACAO_PAG_PARCIAL_DUIMP")
        @JsonProperty("EXONERACAO_PAG_PARCIAL_DUIMP")
        EXONERACAO_PAG_PARCIAL_DUIMP("EXONERACAO_PAG_PARCIAL_DUIMP");


        private final String value;

        TipoDeclaracaoEnum(String v) {
            value = v;
        }

        public static TipoDeclaracaoEnum fromValue(String v) {
            for (TipoDeclaracaoEnum b : TipoDeclaracaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeclaracaoEnum");
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
