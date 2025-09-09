package br.gov.siscomex.portalunico.pcce.model;

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
@XmlType(name = "OpcaoIcmsDto", propOrder =
        {"descricaoOpcao", "tipoSolicitacao", "codigoOpcao"
        })

@XmlRootElement(name = "OpcaoIcmsDto")
/**
 * Opção de ICMS a ser cadastrada pela Sefaz
 **/
@ApiModel(description = "Opção de ICMS a ser cadastrada pela Sefaz")
public class OpcaoIcmsDto {

    @XmlElement(name = "descricaoOpcao", required = true)
    @ApiModelProperty(example = "Id eu nisl nunc mi", required = true, value = "Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30")
    /**
     * Descrição da opção que será exibida para o importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 30
     **/
    private String descricaoOpcao = null;
    @XmlElement(name = "tipoSolicitacao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de declaração de ICMS à qual a opção está vinculada")
    /**
     * Tipo de declaração de ICMS à qual a opção está vinculada
     **/
    private TipoSolicitacaoEnum tipoSolicitacao = null;
    @XmlElement(name = "codigoOpcao", required = true)
    @ApiModelProperty(example = "9999", required = true, value = "Codigo identificador da opção<br>Tamanho: 4")
    /**
     * Codigo identificador da opção<br>Tamanho: 4
     **/
    private String codigoOpcao = null;

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
     * Descrição da opção que será exibida para o importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30
     *
     * @return descricaoOpcao
     **/
    @JsonProperty("descricaoOpcao")
    @NotNull
    public String getDescricaoOpcao() {
        return descricaoOpcao;
    }

    public void setDescricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
    }

    public OpcaoIcmsDto descricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
        return this;
    }

    /**
     * Tipo de declaração de ICMS à qual a opção está vinculada
     *
     * @return tipoSolicitacao
     **/
    @JsonProperty("tipoSolicitacao")
    @NotNull
    public String getTipoSolicitacao() {
        if (tipoSolicitacao == null) {
            return null;
        }
        return tipoSolicitacao.value();
    }

    public void setTipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }

    public OpcaoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
        return this;
    }

    /**
     * Codigo identificador da opção&lt;br&gt;Tamanho: 4
     *
     * @return codigoOpcao
     **/
    @JsonProperty("codigoOpcao")
    @NotNull
    public String getCodigoOpcao() {
        return codigoOpcao;
    }

    public void setCodigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
    }

    public OpcaoIcmsDto codigoOpcao(String codigoOpcao) {
        this.codigoOpcao = codigoOpcao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class OpcaoIcmsDto {\n" +
                "    descricaoOpcao: " + toIndentedString(descricaoOpcao) + "\n" +
                "    tipoSolicitacao: " + toIndentedString(tipoSolicitacao) + "\n" +
                "    codigoOpcao: " + toIndentedString(codigoOpcao) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoSolicitacaoEnum")
    @XmlEnum(String.class)
    public enum TipoSolicitacaoEnum {

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

        TipoSolicitacaoEnum(String v) {
            value = v;
        }

        public static TipoSolicitacaoEnum fromValue(String v) {
            for (TipoSolicitacaoEnum b : TipoSolicitacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoSolicitacaoEnum");
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
