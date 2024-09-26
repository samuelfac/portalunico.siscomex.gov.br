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
@XmlType(name = "SefazDadosIcmsDto", propOrder =
        {"autenticidadeGlme", "cpfSolicitante", "dataConfirmacaoCredito", "dataLimiteGeracaoGuiaGnre", "geradorGuia", "guias", "iniciativaSefaz", "justificativaIndeferimento", "numeroDeclaracao", "numeroGlme", "numeroMandadoJudicial", "periodoReferencia", "tipoDeclaracao", "tipoRetorno", "tipoSolicitacao", "ufFavorecida", "valorAfrmm", "valorCIFExonerado", "valorCalculado", "valorCifPagamento", "valorTotalCredito", "valorTotalDevido", "valorTotalaRecolher", "versaoDeclaracao"
        })

@XmlRootElement(name = "SefazDadosIcmsDto")
/**
 * Dados da declaração de ICMS vinda da Sefaz
 **/
@ApiModel(description = "Dados da declaração de ICMS vinda da Sefaz")
public class SefazDadosIcmsDto {

    @XmlElement(name = "autenticidadeGlme")
    @ApiModelProperty(example = "11111111111111111111111", value = "Código de autorização de exoneração Sefaz <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO")
    /**
     * Código de autorização de exoneração Sefaz <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO
     **/
    private String autenticidadeGlme = null;

    @XmlElement(name = "cpfSolicitante")
    @ApiModelProperty(example = "11111111111", value = "CPF do responsável pela declaração de ICMS<br/>(*) Obrigatório se iniciativaSefaz = true.<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11")
    /**
     * CPF do responsável pela declaração de ICMS<br/>(*) Obrigatório se iniciativaSefaz = true.<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11
     **/
    private String cpfSolicitante = null;

    @XmlElement(name = "dataConfirmacaoCredito")
    @ApiModelProperty(example = "2024-04-22T09:11:06-0300", value = "Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR e tipoSolicitacao != EXONERACAO_INTEGRAL_DUIMP")
    /**
     * Data e hora da confirmação do crédito de ICMS<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR e tipoSolicitacao != EXONERACAO_INTEGRAL_DUIMP
     **/
    private String dataConfirmacaoCredito = null;

    @XmlElement(name = "dataLimiteGeracaoGuiaGnre")
    @ApiModelProperty(example = "2024-04-25", value = "Data limite para geração da guia de pagamento no Portal GNRE<br>Formato: 'yyyy-MM-dd'<br/> (*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR e geradorGuia = GNRE")
    /**
     * Data limite para geração da guia de pagamento no Portal GNRE<br>Formato: 'yyyy-MM-dd'<br/> (*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR e geradorGuia = GNRE
     **/
    private String dataLimiteGeracaoGuiaGnre = null;


    @XmlType(name = "GeradorGuiaEnum")
    @XmlEnum(String.class)
    public enum GeradorGuiaEnum {

        @XmlEnumValue("ESTADO")
        @JsonProperty("ESTADO")
        ESTADO("ESTADO"),

        @XmlEnumValue("GNRE")
        @JsonProperty("GNRE")
        GNRE("GNRE");


        private final String value;

        GeradorGuiaEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static GeradorGuiaEnum fromValue(String v) {
            for (GeradorGuiaEnum b : GeradorGuiaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to GeradorGuiaEnum");
        }
    }

    @XmlElement(name = "geradorGuia")
    @ApiModelProperty(value = "Orgão gerador da guia de pagamento de ICMS <br/> (*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR")
    /**
     * Orgão gerador da guia de pagamento de ICMS <br/> (*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR
     **/
    private GeradorGuiaEnum geradorGuia = null;

    @XmlElement(name = "guias")
    @ApiModelProperty(value = "Lista de guias de pagamento de ICMS<br/>(*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR e geradorGuia = ESTADO.")
    @Valid
    /**
     * Lista de guias de pagamento de ICMS<br/>(*) Obrigatório se tipoRetorno = CALCULADO_A_PAGAR e geradorGuia = ESTADO.
     **/
    private List<GuiaIcmsCreditoDto> guias = null;

    @XmlElement(name = "iniciativaSefaz", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador de que a solicitação foi originada na Sefaz<br>Dominio:<br>true - Sim, <br>false - Não")
    /**
     * Indicador de que a solicitação foi originada na Sefaz<br>Dominio:<br>true - Sim, <br>false - Não
     **/
    private Boolean iniciativaSefaz = null;

    @XmlElement(name = "justificativaIndeferimento")
    @ApiModelProperty(example = "Lorem ipsum dolor sit amet.", value = "Justificativa para o indeferimento da solicitação de declaração de ICMS <br>Tamanho mínimo: 1<br>Tamanho máximo: 300<br/>(*) Obrigatório se tipoRetorno = INDEFERIDO")
    /**
     * Justificativa para o indeferimento da solicitação de declaração de ICMS <br>Tamanho mínimo: 1<br>Tamanho máximo: 300<br/>(*) Obrigatório se tipoRetorno = INDEFERIDO
     **/
    private String justificativaIndeferimento = null;

    @XmlElement(name = "numeroDeclaracao", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDeclaracao = null;

    @XmlElement(name = "numeroGlme")
    @ApiModelProperty(example = "11111111111111111111111", value = "Número da GLME <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO")
    /**
     * Número da GLME <br>Tamanho mínimo: 1<br>Tamanho máximo: 100<br/>(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO
     **/
    private String numeroGlme = null;

    @XmlElement(name = "numeroMandadoJudicial")
    @ApiModelProperty(example = "11111111111111111111", value = "Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = MANDADO_JUDICIAL_DUIMP e tipoRetorno != INDEFERIDO")
    /**
     * Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = MANDADO_JUDICIAL_DUIMP e tipoRetorno != INDEFERIDO
     **/
    private String numeroMandadoJudicial = null;

    @XmlElement(name = "periodoReferencia")
    @ApiModelProperty(example = "2024-04", value = "Período de referência <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: 'yyyy-MM'")
    /**
     * Período de referência <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: 'yyyy-MM'
     **/
    private String periodoReferencia = null;


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

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoDeclaracaoEnum fromValue(String v) {
            for (TipoDeclaracaoEnum b : TipoDeclaracaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDeclaracaoEnum");
        }
    }

    @XmlElement(name = "tipoDeclaracao", required = true)
    @ApiModelProperty(example = "DUIMP", required = true, value = "Tipo da declaração no Comércio Exterior")
    /**
     * Tipo da declaração no Comércio Exterior
     **/
    private TipoDeclaracaoEnum tipoDeclaracao = null;


    @XmlType(name = "TipoRetornoEnum")
    @XmlEnum(String.class)
    public enum TipoRetornoEnum {

        @XmlEnumValue("CALCULADO_A_PAGAR")
        @JsonProperty("CALCULADO_A_PAGAR")
        CALCULADO_A_PAGAR("CALCULADO_A_PAGAR"),

        @XmlEnumValue("SEM_VALOR_A_PAGAR")
        @JsonProperty("SEM_VALOR_A_PAGAR")
        SEM_VALOR_A_PAGAR("SEM_VALOR_A_PAGAR"),

        @XmlEnumValue("INDEFERIDO")
        @JsonProperty("INDEFERIDO")
        INDEFERIDO("INDEFERIDO");


        private final String value;

        TipoRetornoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoRetornoEnum fromValue(String v) {
            for (TipoRetornoEnum b : TipoRetornoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoRetornoEnum");
        }
    }

    @XmlElement(name = "tipoRetorno", required = true)
    @ApiModelProperty(example = "CALCULADO_A_PAGAR", required = true, value = "Tipo de retorno")
    /**
     * Tipo de retorno
     **/
    private TipoRetornoEnum tipoRetorno = null;


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

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoSolicitacaoEnum fromValue(String v) {
            for (TipoSolicitacaoEnum b : TipoSolicitacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoSolicitacaoEnum");
        }
    }

    @XmlElement(name = "tipoSolicitacao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de solicitação")
    /**
     * Tipo de solicitação
     **/
    private TipoSolicitacaoEnum tipoSolicitacao = null;


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

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UfFavorecidaEnum fromValue(String v) {
            for (UfFavorecidaEnum b : UfFavorecidaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UfFavorecidaEnum");
        }
    }

    @XmlElement(name = "ufFavorecida", required = true)
    @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
    /**
     * UF favorecida
     **/
    private UfFavorecidaEnum ufFavorecida = null;

    @XmlElement(name = "valorAfrmm")
    @ApiModelProperty(example = "95.8", value = "Valor do AFRMM<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo e tipoRetorno != INDEFERIDO.")
    @Valid
    /**
     * Valor do AFRMM<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo e tipoRetorno != INDEFERIDO.
     **/
    private BigDecimal valorAfrmm = null;

    @XmlElement(name = "valorCIFExonerado")
    @ApiModelProperty(example = "60.33", value = "Valor CIF Exonerado (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO.")
    @Valid
    /**
     * Valor CIF Exonerado (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO.
     **/
    private BigDecimal valorCIFExonerado = null;

    @XmlElement(name = "valorCalculado")
    @ApiModelProperty(example = "100.12", value = "Valor calculado sem benefícios <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor calculado sem benefícios <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorCalculado = null;

    @XmlElement(name = "valorCifPagamento")
    @ApiModelProperty(example = "162.57", value = "Valor considerado para a base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP e tipoRetorno != INDEFERIDO.")
    @Valid
    /**
     * Valor considerado para a base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP e tipoRetorno != INDEFERIDO.
     **/
    private BigDecimal valorCifPagamento = null;

    @XmlElement(name = "valorTotalCredito")
    @ApiModelProperty(example = "103.2", value = "Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR e tipoSolicitacao != EXONERACAO_INTEGRAL_DUIMP")
    @Valid
    /**
     * Valor total do crédito de ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/> (*) Obrigatório se tipoRetorno = SEM_VALOR_A_PAGAR e tipoSolicitacao != EXONERACAO_INTEGRAL_DUIMP
     **/
    private BigDecimal valorTotalCredito = null;

    @XmlElement(name = "valorTotalDevido")
    @ApiModelProperty(example = "90.45", value = "Valor total devido (a pagar ou pago) <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor total devido (a pagar ou pago) <br/>(*) Obrigatório se tipoRetorno != INDEFERIDO.<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorTotalDevido = null;

    @XmlElement(name = "valorTotalaRecolher")
    @ApiModelProperty(example = "42.87", value = "Somatório dos valores devidos + juros + multa + atualização monetária<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP ou PAGAMENTO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO.")
    @Valid
    /**
     * Somatório dos valores devidos + juros + multa + atualização monetária<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP ou PAGAMENTO_INTEGRAL_DUIMP e tipoRetorno != INDEFERIDO.
     **/
    private BigDecimal valorTotalaRecolher = null;

    @XmlElement(name = "versaoDeclaracao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDeclaracao = null;

    /**
     * Código de autorização de exoneração Sefaz &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100&lt;br/&gt;(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao &#x3D; EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO
     *
     * @return autenticidadeGlme
     **/
    @JsonProperty("autenticidadeGlme")
    public String getAutenticidadeGlme() {
        return autenticidadeGlme;
    }

    public void setAutenticidadeGlme(String autenticidadeGlme) {
        this.autenticidadeGlme = autenticidadeGlme;
    }

    public SefazDadosIcmsDto autenticidadeGlme(String autenticidadeGlme) {
        this.autenticidadeGlme = autenticidadeGlme;
        return this;
    }

    /**
     * CPF do responsável pela declaração de ICMS&lt;br/&gt;(*) Obrigatório se iniciativaSefaz &#x3D; true.&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11
     *
     * @return cpfSolicitante
     **/
    @JsonProperty("cpfSolicitante")
    public String getCpfSolicitante() {
        return cpfSolicitante;
    }

    public void setCpfSolicitante(String cpfSolicitante) {
        this.cpfSolicitante = cpfSolicitante;
    }

    public SefazDadosIcmsDto cpfSolicitante(String cpfSolicitante) {
        this.cpfSolicitante = cpfSolicitante;
        return this;
    }

    /**
     * Data e hora da confirmação do crédito de ICMS&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;&lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; SEM_VALOR_A_PAGAR e tipoSolicitacao !&#x3D; EXONERACAO_INTEGRAL_DUIMP
     *
     * @return dataConfirmacaoCredito
     **/
    @JsonProperty("dataConfirmacaoCredito")
    public String getDataConfirmacaoCredito() {
        return dataConfirmacaoCredito;
    }

    public void setDataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
    }

    public SefazDadosIcmsDto dataConfirmacaoCredito(String dataConfirmacaoCredito) {
        this.dataConfirmacaoCredito = dataConfirmacaoCredito;
        return this;
    }

    /**
     * Data limite para geração da guia de pagamento no Portal GNRE&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;&lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; CALCULADO_A_PAGAR e geradorGuia &#x3D; GNRE
     *
     * @return dataLimiteGeracaoGuiaGnre
     **/
    @JsonProperty("dataLimiteGeracaoGuiaGnre")
    public String getDataLimiteGeracaoGuiaGnre() {
        return dataLimiteGeracaoGuiaGnre;
    }

    public void setDataLimiteGeracaoGuiaGnre(String dataLimiteGeracaoGuiaGnre) {
        this.dataLimiteGeracaoGuiaGnre = dataLimiteGeracaoGuiaGnre;
    }

    public SefazDadosIcmsDto dataLimiteGeracaoGuiaGnre(String dataLimiteGeracaoGuiaGnre) {
        this.dataLimiteGeracaoGuiaGnre = dataLimiteGeracaoGuiaGnre;
        return this;
    }

    /**
     * Orgão gerador da guia de pagamento de ICMS &lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; CALCULADO_A_PAGAR
     *
     * @return geradorGuia
     **/
    @JsonProperty("geradorGuia")
    public String getGeradorGuia() {
        if (geradorGuia == null) {
            return null;
        }
        return geradorGuia.value();
    }

    public void setGeradorGuia(GeradorGuiaEnum geradorGuia) {
        this.geradorGuia = geradorGuia;
    }

    public SefazDadosIcmsDto geradorGuia(GeradorGuiaEnum geradorGuia) {
        this.geradorGuia = geradorGuia;
        return this;
    }

    /**
     * Lista de guias de pagamento de ICMS&lt;br/&gt;(*) Obrigatório se tipoRetorno &#x3D; CALCULADO_A_PAGAR e geradorGuia &#x3D; ESTADO.
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

    public SefazDadosIcmsDto guias(List<GuiaIcmsCreditoDto> guias) {
        this.guias = guias;
        return this;
    }

    public SefazDadosIcmsDto addGuiasItem(GuiaIcmsCreditoDto guiasItem) {
        this.guias.add(guiasItem);
        return this;
    }

    /**
     * Indicador de que a solicitação foi originada na Sefaz&lt;br&gt;Dominio:&lt;br&gt;true - Sim, &lt;br&gt;false - Não
     *
     * @return iniciativaSefaz
     **/
    @JsonProperty("iniciativaSefaz")
    @NotNull
    public Boolean isIniciativaSefaz() {
        return iniciativaSefaz;
    }

    public void setIniciativaSefaz(Boolean iniciativaSefaz) {
        this.iniciativaSefaz = iniciativaSefaz;
    }

    public SefazDadosIcmsDto iniciativaSefaz(Boolean iniciativaSefaz) {
        this.iniciativaSefaz = iniciativaSefaz;
        return this;
    }

    /**
     * Justificativa para o indeferimento da solicitação de declaração de ICMS &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 300&lt;br/&gt;(*) Obrigatório se tipoRetorno &#x3D; INDEFERIDO
     *
     * @return justificativaIndeferimento
     **/
    @JsonProperty("justificativaIndeferimento")
    public String getJustificativaIndeferimento() {
        return justificativaIndeferimento;
    }

    public void setJustificativaIndeferimento(String justificativaIndeferimento) {
        this.justificativaIndeferimento = justificativaIndeferimento;
    }

    public SefazDadosIcmsDto justificativaIndeferimento(String justificativaIndeferimento) {
        this.justificativaIndeferimento = justificativaIndeferimento;
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

    public SefazDadosIcmsDto numeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
        return this;
    }

    /**
     * Número da GLME &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100&lt;br/&gt;(*) Obrigatório numeroGlme ou autenticidadeGlme se tipoSolicitacao &#x3D; EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO
     * @return numeroGlme
     **/
    @JsonProperty("numeroGlme")
    public String getNumeroGlme() {
        return numeroGlme;
    }

    public void setNumeroGlme(String numeroGlme) {
        this.numeroGlme = numeroGlme;
    }

    public SefazDadosIcmsDto numeroGlme(String numeroGlme) {
        this.numeroGlme = numeroGlme;
        return this;
    }

    /**
     * Número do Mandado Judicial &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; MANDADO_JUDICIAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO
     * @return numeroMandadoJudicial
     **/
    @JsonProperty("numeroMandadoJudicial")
    public String getNumeroMandadoJudicial() {
        return numeroMandadoJudicial;
    }

    public void setNumeroMandadoJudicial(String numeroMandadoJudicial) {
        this.numeroMandadoJudicial = numeroMandadoJudicial;
    }

    public SefazDadosIcmsDto numeroMandadoJudicial(String numeroMandadoJudicial) {
        this.numeroMandadoJudicial = numeroMandadoJudicial;
        return this;
    }

    /**
     * Período de referência &lt;br/&gt;(*) Obrigatório se tipoRetorno !&#x3D; INDEFERIDO.&lt;br&gt;Formato: &#39;yyyy-MM&#39;
     * @return periodoReferencia
     **/
    @JsonProperty("periodoReferencia")
    public String getPeriodoReferencia() {
        return periodoReferencia;
    }

    public void setPeriodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
    }

    public SefazDadosIcmsDto periodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
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

    public SefazDadosIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
        return this;
    }

    /**
     * Tipo de retorno
     *
     * @return tipoRetorno
     **/
    @JsonProperty("tipoRetorno")
    @NotNull
    public String getTipoRetorno() {
        if (tipoRetorno == null) {
            return null;
        }
        return tipoRetorno.value();
    }

    public void setTipoRetorno(TipoRetornoEnum tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public SefazDadosIcmsDto tipoRetorno(TipoRetornoEnum tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
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

    public SefazDadosIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
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

    public SefazDadosIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
        return this;
    }

    /**
     * Valor do AFRMM&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório para Duimp de modal marítmo e tipoRetorno !&#x3D; INDEFERIDO.
     * @return valorAfrmm
     **/
    @JsonProperty("valorAfrmm")
    public BigDecimal getValorAfrmm() {
        return valorAfrmm;
    }

    public void setValorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
    }

    public SefazDadosIcmsDto valorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
        return this;
    }

    /**
     * Valor CIF Exonerado (abatido da base de cálculo de ICMS)&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; EXONERACAO_PAG_PARCIAL_DUIMP ou EXONERACAO_INTEGRAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO.
     * @return valorCIFExonerado
     **/
    @JsonProperty("valorCIFExonerado")
    public BigDecimal getValorCIFExonerado() {
        return valorCIFExonerado;
    }

    public void setValorCIFExonerado(BigDecimal valorCIFExonerado) {
        this.valorCIFExonerado = valorCIFExonerado;
    }

    public SefazDadosIcmsDto valorCIFExonerado(BigDecimal valorCIFExonerado) {
        this.valorCIFExonerado = valorCIFExonerado;
        return this;
    }

    /**
     * Valor calculado sem benefícios &lt;br/&gt;(*) Obrigatório se tipoRetorno !&#x3D; INDEFERIDO.&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     * @return valorCalculado
     **/
    @JsonProperty("valorCalculado")
    public BigDecimal getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(BigDecimal valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    public SefazDadosIcmsDto valorCalculado(BigDecimal valorCalculado) {
        this.valorCalculado = valorCalculado;
        return this;
    }

    /**
     * Valor considerado para a base de cálculo do ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO.
     * @return valorCifPagamento
     **/
    @JsonProperty("valorCifPagamento")
    public BigDecimal getValorCifPagamento() {
        return valorCifPagamento;
    }

    public void setValorCifPagamento(BigDecimal valorCifPagamento) {
        this.valorCifPagamento = valorCifPagamento;
    }

    public SefazDadosIcmsDto valorCifPagamento(BigDecimal valorCifPagamento) {
        this.valorCifPagamento = valorCifPagamento;
        return this;
    }

    /**
     * Valor total do crédito de ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt; (*) Obrigatório se tipoRetorno &#x3D; SEM_VALOR_A_PAGAR e tipoSolicitacao !&#x3D; EXONERACAO_INTEGRAL_DUIMP
     * @return valorTotalCredito
     **/
    @JsonProperty("valorTotalCredito")
    public BigDecimal getValorTotalCredito() {
        return valorTotalCredito;
    }

    public void setValorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
    }

    public SefazDadosIcmsDto valorTotalCredito(BigDecimal valorTotalCredito) {
        this.valorTotalCredito = valorTotalCredito;
        return this;
    }

    /**
     * Valor total devido (a pagar ou pago) &lt;br/&gt;(*) Obrigatório se tipoRetorno !&#x3D; INDEFERIDO.&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     * @return valorTotalDevido
     **/
    @JsonProperty("valorTotalDevido")
    public BigDecimal getValorTotalDevido() {
        return valorTotalDevido;
    }

    public void setValorTotalDevido(BigDecimal valorTotalDevido) {
        this.valorTotalDevido = valorTotalDevido;
    }

    public SefazDadosIcmsDto valorTotalDevido(BigDecimal valorTotalDevido) {
        this.valorTotalDevido = valorTotalDevido;
        return this;
    }

    /**
     * Somatório dos valores devidos + juros + multa + atualização monetária&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; PAGAMENTO_PARCIAL_DUIMP ou EXONERACAO_PAG_PARCIAL_DUIMP ou PAGAMENTO_INTEGRAL_DUIMP e tipoRetorno !&#x3D; INDEFERIDO.
     * @return valorTotalaRecolher
     **/
    @JsonProperty("valorTotalaRecolher")
    public BigDecimal getValorTotalaRecolher() {
        return valorTotalaRecolher;
    }

    public void setValorTotalaRecolher(BigDecimal valorTotalaRecolher) {
        this.valorTotalaRecolher = valorTotalaRecolher;
    }

    public SefazDadosIcmsDto valorTotalaRecolher(BigDecimal valorTotalaRecolher) {
        this.valorTotalaRecolher = valorTotalaRecolher;
        return this;
    }

    /**
     * Versão da declaração&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
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

    public SefazDadosIcmsDto versaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazDadosIcmsDto {\n" +
                "    autenticidadeGlme: " + toIndentedString(autenticidadeGlme) + "\n" +
                "    cpfSolicitante: " + toIndentedString(cpfSolicitante) + "\n" +
                "    dataConfirmacaoCredito: " + toIndentedString(dataConfirmacaoCredito) + "\n" +
                "    dataLimiteGeracaoGuiaGnre: " + toIndentedString(dataLimiteGeracaoGuiaGnre) + "\n" +
                "    geradorGuia: " + toIndentedString(geradorGuia) + "\n" +
                "    guias: " + toIndentedString(guias) + "\n" +
                "    iniciativaSefaz: " + toIndentedString(iniciativaSefaz) + "\n" +
                "    justificativaIndeferimento: " + toIndentedString(justificativaIndeferimento) + "\n" +
                "    numeroDeclaracao: " + toIndentedString(numeroDeclaracao) + "\n" +
                "    numeroGlme: " + toIndentedString(numeroGlme) + "\n" +
                "    numeroMandadoJudicial: " + toIndentedString(numeroMandadoJudicial) + "\n" +
                "    periodoReferencia: " + toIndentedString(periodoReferencia) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "    tipoRetorno: " + toIndentedString(tipoRetorno) + "\n" +
                "    tipoSolicitacao: " + toIndentedString(tipoSolicitacao) + "\n" +
                "    ufFavorecida: " + toIndentedString(ufFavorecida) + "\n" +
                "    valorAfrmm: " + toIndentedString(valorAfrmm) + "\n" +
                "    valorCIFExonerado: " + toIndentedString(valorCIFExonerado) + "\n" +
                "    valorCalculado: " + toIndentedString(valorCalculado) + "\n" +
                "    valorCifPagamento: " + toIndentedString(valorCifPagamento) + "\n" +
                "    valorTotalCredito: " + toIndentedString(valorTotalCredito) + "\n" +
                "    valorTotalDevido: " + toIndentedString(valorTotalDevido) + "\n" +
                "    valorTotalaRecolher: " + toIndentedString(valorTotalaRecolher) + "\n" +
                "    versaoDeclaracao: " + toIndentedString(versaoDeclaracao) + "\n" +
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

