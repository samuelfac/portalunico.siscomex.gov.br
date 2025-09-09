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
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazCreditoIcmsDto", propOrder =
        {"dataConfirmacaoCredito", "valorTotalCredito", "tipoSolicitacao", "numeroDeclaracao", "ufFavorecida", "versaoDeclaracao", "guias", "tipoDeclaracao"
        })

@XmlRootElement(name = "SefazCreditoIcmsDto")
/**
 * Dados da confirmação de crédito de ICMS vinda da Sefaz
 **/
@ApiModel(description = "Dados da confirmação de crédito de ICMS vinda da Sefaz")
public class SefazCreditoIcmsDto {

    @XmlElement(name = "dataConfirmacaoCredito", required = true)
    @ApiModelProperty(example = "2021-08-31T09:11:06-0300", required = true, value = "Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private String dataConfirmacaoCredito = null;

    @XmlElement(name = "valorTotalCredito", required = true)
    @ApiModelProperty(example = "103.2", required = true, value = "Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorTotalCredito = null;
    @XmlElement(name = "tipoSolicitacao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de solicitação")
    /**
     * Tipo de solicitação
     **/
    private TipoSolicitacaoEnum tipoSolicitacao = null;
    @XmlElement(name = "numeroDeclaracao", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDeclaracao = null;
    @XmlElement(name = "ufFavorecida", required = true)
    @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
    /**
     * UF favorecida
     **/
    private UfFavorecidaEnum ufFavorecida = null;
    @XmlElement(name = "versaoDeclaracao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDeclaracao = null;
    @XmlElement(name = "guias")
    @ApiModelProperty(value = "Lista de guias de ICMS já pagas.")
    @Valid
    /**
     * Lista de guias de ICMS já pagas.
     **/
    private List<GuiaIcmsCreditoDto> guias = null;
    @XmlElement(name = "tipoDeclaracao", required = true)
    @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo da declaração no Comércio Exterior")
    /**
     * Tipo da declaração no Comércio Exterior
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
     * Data e hora da confirmação do crédito de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataConfirmacaoCredito
     **/
    @JsonProperty("dataConfirmacaoCredito")
    @NotNull
    public String getDataConfirmacaoCredito() {
        return dataConfirmacaoCredito;
    }

    public void setDataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
    }

    public SefazCreditoIcmsDto dataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
        return this;
    }

    /**
     * Valor total do crédito de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     *
     * @return valorTotalCredito
     **/
    @JsonProperty("valorTotalCredito")
    @NotNull
    public BigDecimal getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public SefazCreditoIcmsDto valorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
        return this;
    }

    /**
     * Tipo de solicitação
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

    public SefazCreditoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
        return this;
    }

    /**
     * Número da declaração&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
     *
     * @return numeroDeclaracao
     **/
    @JsonProperty("numeroDeclaracao")
    @NotNull
    public String getNumeroDeclaracao() {
        return numeroDeclaracao;
    }

    public void setNumeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
    }

    public SefazCreditoIcmsDto numeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
        return this;
    }

    /**
     * UF favorecida
     *
     * @return ufFavorecida
     **/
    @JsonProperty("ufFavorecida")
    @NotNull
    public String getUfFavorecida() {
        if (ufFavorecida == null) {
            return null;
        }
        return ufFavorecida.value();
    }

    public void setUfFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
    }

    public SefazCreditoIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
        return this;
    }

    /**
     * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
     *
     * @return versaoDeclaracao
     **/
    @JsonProperty("versaoDeclaracao")
    @NotNull
    public String getVersaoDeclaracao() {
        return versaoDeclaracao;
    }

    public void setVersaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
    }

    public SefazCreditoIcmsDto versaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
        return this;
    }

    /**
     * Lista de guias de ICMS já pagas.
     *
     * @return guias
     **/
    @JsonProperty("guias")
    public List<GuiaIcmsCreditoDto> getGuias() {
        return guias;
    }

    public void setGuias(List<GuiaIcmsCreditoDto> guias) {
        this.guias = guias;
    }

    public SefazCreditoIcmsDto guias(List<GuiaIcmsCreditoDto> guias) {
        this.guias = guias;
        return this;
    }

    public SefazCreditoIcmsDto addGuiasItem(GuiaIcmsCreditoDto guiasItem) {
        this.guias.add(guiasItem);
        return this;
    }

    /**
     * Tipo da declaração no Comércio Exterior
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

    public SefazCreditoIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazCreditoIcmsDto {\n" +
                "    dataConfirmacaoCredito: " + toIndentedString(dataConfirmacaoCredito) + "\n" +
                "    valorTotalCredito: " + toIndentedString(valorTotalCredito) + "\n" +
                "    tipoSolicitacao: " + toIndentedString(tipoSolicitacao) + "\n" +
                "    numeroDeclaracao: " + toIndentedString(numeroDeclaracao) + "\n" +
                "    ufFavorecida: " + toIndentedString(ufFavorecida) + "\n" +
                "    versaoDeclaracao: " + toIndentedString(versaoDeclaracao) + "\n" +
                "    guias: " + toIndentedString(guias) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
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


    @XmlType(name = "UfFavorecidaEnum")
    @XmlEnum(String.class)
    public enum UfFavorecidaEnum {

        @XmlEnumValue("AC")
        @JsonProperty("AC")
        AC("AC"),

        @XmlEnumValue("AL")
        @JsonProperty("AL")
        AL("AL"),

        @XmlEnumValue("AM")
        @JsonProperty("AM")
        AM("AM"),

        @XmlEnumValue("AP")
        @JsonProperty("AP")
        AP("AP"),

        @XmlEnumValue("BA")
        @JsonProperty("BA")
        BA("BA"),

        @XmlEnumValue("CE")
        @JsonProperty("CE")
        CE("CE"),

        @XmlEnumValue("DF")
        @JsonProperty("DF")
        DF("DF"),

        @XmlEnumValue("ES")
        @JsonProperty("ES")
        ES("ES"),

        @XmlEnumValue("GO")
        @JsonProperty("GO")
        GO("GO"),

        @XmlEnumValue("MA")
        @JsonProperty("MA")
        MA("MA"),

        @XmlEnumValue("MG")
        @JsonProperty("MG")
        MG("MG"),

        @XmlEnumValue("MS")
        @JsonProperty("MS")
        MS("MS"),

        @XmlEnumValue("MT")
        @JsonProperty("MT")
        MT("MT"),

        @XmlEnumValue("PA")
        @JsonProperty("PA")
        PA("PA"),

        @XmlEnumValue("PB")
        @JsonProperty("PB")
        PB("PB"),

        @XmlEnumValue("PE")
        @JsonProperty("PE")
        PE("PE"),

        @XmlEnumValue("PI")
        @JsonProperty("PI")
        PI("PI"),

        @XmlEnumValue("PR")
        @JsonProperty("PR")
        PR("PR"),

        @XmlEnumValue("RJ")
        @JsonProperty("RJ")
        RJ("RJ"),

        @XmlEnumValue("RN")
        @JsonProperty("RN")
        RN("RN"),

        @XmlEnumValue("RO")
        @JsonProperty("RO")
        RO("RO"),

        @XmlEnumValue("RR")
        @JsonProperty("RR")
        RR("RR"),

        @XmlEnumValue("RS")
        @JsonProperty("RS")
        RS("RS"),

        @XmlEnumValue("SC")
        @JsonProperty("SC")
        SC("SC"),

        @XmlEnumValue("SE")
        @JsonProperty("SE")
        SE("SE"),

        @XmlEnumValue("SP")
        @JsonProperty("SP")
        SP("SP"),

        @XmlEnumValue("TO")
        @JsonProperty("TO")
        TO("TO");


        private final String value;

        UfFavorecidaEnum(String v) {
            value = v;
        }

        public static UfFavorecidaEnum fromValue(String v) {
            for (UfFavorecidaEnum b : UfFavorecidaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UfFavorecidaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDeclaracaoEnum")
    @XmlEnum(String.class)
    public enum TipoDeclaracaoEnum {

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP");


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
