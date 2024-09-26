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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitacaoCalculoIcmsDto", propOrder =
        {"cnaeAdquirente", "cnaeImportador", "codMunicipioDesembaracoPretendido", "cpfSolicitante", "descricaoDespesasAduaneiras", "informacoesComplementares", "numeroDeclaracao", "opcaoIcms", "tipoDeclaracao", "tipoSolicitacao", "tipoTratamento", "ufAdquirente", "ufFavorecida", "ufImportador", "valorAfrmm", "valorDespesasAduaneiras", "versaoDeclaracao"
        })

@XmlRootElement(name = "SolicitacaoCalculoIcmsDto")
/**
 * Dados de declaração ICMS criada no PCCE
 **/
@ApiModel(description = "Dados de declaração ICMS criada no PCCE")
public class SolicitacaoCalculoIcmsDto {

    @XmlElement(name = "cnaeAdquirente")
    @ApiModelProperty(example = "6422100", value = "Código CNAE do Adquirente")
    /**
     * Código CNAE do Adquirente
     **/
    private String cnaeAdquirente = null;

    @XmlElement(name = "cnaeImportador", required = true)
    @ApiModelProperty(example = "6422100", required = true, value = "Código CNAE do Importador")
    /**
     * Código CNAE do Importador
     **/
    private String cnaeImportador = null;

    @XmlElement(name = "codMunicipioDesembaracoPretendido")
    @ApiModelProperty(example = "00000", value = "Código TOM do município de despacho (antes chamado de Município de desembaraço pretendido)")
    /**
     * Código TOM do município de despacho (antes chamado de Município de desembaraço pretendido)
     **/
    private String codMunicipioDesembaracoPretendido = null;

    @XmlElement(name = "cpfSolicitante", required = true)
    @ApiModelProperty(example = "11111111111", required = true, value = "CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11")
    /**
     * CPF do responsável pela declaração de ICMS<br>Formato: 'NNNNNNNNNNN'<br>Tamanho: 11
     **/
    private String cpfSolicitante = null;

    @XmlElement(name = "descricaoDespesasAduaneiras")
    @ApiModelProperty(value = "Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400")
    /**
     * Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400
     **/
    private String descricaoDespesasAduaneiras = null;

    @XmlElement(name = "informacoesComplementares")
    @ApiModelProperty(value = "Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400")
    /**
     * Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400
     **/
    private String informacoesComplementares = null;

    @XmlElement(name = "numeroDeclaracao", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da declaração<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDeclaracao = null;

    @XmlElement(name = "opcaoIcms")
    @ApiModelProperty(value = "")
    @Valid
    private OpcaoIcmsConsultaDto opcaoIcms = null;


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


    @XmlType(name = "TipoTratamentoEnum")
    @XmlEnum(String.class)
    public enum TipoTratamentoEnum {

        @XmlEnumValue("MANUAL")
        @JsonProperty("MANUAL")
        MANUAL("MANUAL"),

        @XmlEnumValue("DECLARATORIO")
        @JsonProperty("DECLARATORIO")
        DECLARATORIO("DECLARATORIO"),

        @XmlEnumValue("AUTOMATICO")
        @JsonProperty("AUTOMATICO")
        AUTOMATICO("AUTOMATICO"),

        @XmlEnumValue("CALCULO_SEFAZ")
        @JsonProperty("CALCULO_SEFAZ")
        CALCULO_SEFAZ("CALCULO_SEFAZ");


        private final String value;

        TipoTratamentoEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoTratamentoEnum fromValue(String v) {
            for (TipoTratamentoEnum b : TipoTratamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoEnum");
        }
    }

    @XmlElement(name = "tipoTratamento", required = true)
    @ApiModelProperty(example = "MANUAL", required = true, value = "Tipo de solicitação")
    /**
     * Tipo de solicitação
     **/
    private TipoTratamentoEnum tipoTratamento = null;


    @XmlType(name = "UfAdquirenteEnum")
    @XmlEnum(String.class)
    public enum UfAdquirenteEnum {

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

        UfAdquirenteEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UfAdquirenteEnum fromValue(String v) {
            for (UfAdquirenteEnum b : UfAdquirenteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UfAdquirenteEnum");
        }
    }

    @XmlElement(name = "ufAdquirente")
    @ApiModelProperty(example = "SC", value = "UF favorecida")
    /**
     * UF favorecida
     **/
    private UfAdquirenteEnum ufAdquirente = null;


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


    @XmlType(name = "UfImportadorEnum")
    @XmlEnum(String.class)
    public enum UfImportadorEnum {

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

        UfImportadorEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UfImportadorEnum fromValue(String v) {
            for (UfImportadorEnum b : UfImportadorEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to UfImportadorEnum");
        }
    }

    @XmlElement(name = "ufImportador", required = true)
    @ApiModelProperty(example = "BA", required = true, value = "UF importador")
    /**
     * UF importador
     **/
    private UfImportadorEnum ufImportador = null;

    @XmlElement(name = "valorAfrmm", required = true)
    @ApiModelProperty(example = "103.2", required = true, value = "Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor do AFRMM no momento da criação da solicitação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorAfrmm = null;

    @XmlElement(name = "valorDespesasAduaneiras")
    @ApiModelProperty(example = "162.57", value = "Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorDespesasAduaneiras = null;

    @XmlElement(name = "versaoDeclaracao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da declaração<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDeclaracao = null;

    /**
     * Código CNAE do Adquirente
     *
     * @return cnaeAdquirente
     **/
    @JsonProperty("cnaeAdquirente")
    public String getCnaeAdquirente() {
        return cnaeAdquirente;
    }

    public void setCnaeAdquirente(String cnaeAdquirente) {
        this.cnaeAdquirente = cnaeAdquirente;
    }

    public SolicitacaoCalculoIcmsDto cnaeAdquirente(String cnaeAdquirente) {
        this.cnaeAdquirente = cnaeAdquirente;
        return this;
    }

    /**
     * Código CNAE do Importador
     *
     * @return cnaeImportador
     **/
    @JsonProperty("cnaeImportador")
    @NotNull
    public String getCnaeImportador() {
        return cnaeImportador;
    }

    public void setCnaeImportador(String cnaeImportador) {
        this.cnaeImportador = cnaeImportador;
    }

    public SolicitacaoCalculoIcmsDto cnaeImportador(String cnaeImportador) {
        this.cnaeImportador = cnaeImportador;
        return this;
    }

    /**
     * Código TOM do município de despacho (antes chamado de Município de desembaraço pretendido)
     *
     * @return codMunicipioDesembaracoPretendido
     **/
    @JsonProperty("codMunicipioDesembaracoPretendido")
    public String getCodMunicipioDesembaracoPretendido() {
        return codMunicipioDesembaracoPretendido;
    }

    public void setCodMunicipioDesembaracoPretendido(String codMunicipioDesembaracoPretendido) {
        this.codMunicipioDesembaracoPretendido = codMunicipioDesembaracoPretendido;
    }

    public SolicitacaoCalculoIcmsDto codMunicipioDesembaracoPretendido(String codMunicipioDesembaracoPretendido) {
        this.codMunicipioDesembaracoPretendido = codMunicipioDesembaracoPretendido;
        return this;
    }

    /**
     * CPF do responsável pela declaração de ICMS&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11
     *
     * @return cpfSolicitante
     **/
    @JsonProperty("cpfSolicitante")
    @NotNull
    public String getCpfSolicitante() {
        return cpfSolicitante;
    }

    public void setCpfSolicitante(String cpfSolicitante) {
        this.cpfSolicitante = cpfSolicitante;
    }

    public SolicitacaoCalculoIcmsDto cpfSolicitante(String cpfSolicitante) {
        this.cpfSolicitante = cpfSolicitante;
        return this;
    }

    /**
     * Descrição das demais despesas aduaneiras &lt;br&gt;Tamanho máximo: 400
     *
     * @return descricaoDespesasAduaneiras
     **/
    @JsonProperty("descricaoDespesasAduaneiras")
    public String getDescricaoDespesasAduaneiras() {
        return descricaoDespesasAduaneiras;
    }

    public void setDescricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
        this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
    }

    public SolicitacaoCalculoIcmsDto descricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
        this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
        return this;
    }

    /**
     * Texto livre com informações complementares pertinentes &lt;br&gt;Tamanho máximo: 400
     *
     * @return informacoesComplementares
     **/
    @JsonProperty("informacoesComplementares")
    public String getInformacoesComplementares() {
        return informacoesComplementares;
    }

    public void setInformacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
    }

    public SolicitacaoCalculoIcmsDto informacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
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

    public SolicitacaoCalculoIcmsDto numeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
        return this;
    }

    /**
     * Get opcaoIcms
     *
     * @return opcaoIcms
     **/
    @JsonProperty("opcaoIcms")
    public OpcaoIcmsConsultaDto getOpcaoIcms() {
        return opcaoIcms;
    }

    public void setOpcaoIcms(OpcaoIcmsConsultaDto opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
    }

    public SolicitacaoCalculoIcmsDto opcaoIcms(OpcaoIcmsConsultaDto opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
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

    public SolicitacaoCalculoIcmsDto tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
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

    public SolicitacaoCalculoIcmsDto tipoSolicitacao(TipoSolicitacaoEnum tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
        return this;
    }

    /**
     * Tipo de solicitação
     *
     * @return tipoTratamento
     **/
    @JsonProperty("tipoTratamento")
    @NotNull
    public String getTipoTratamento() {
        if (tipoTratamento == null) {
            return null;
        }
        return tipoTratamento.value();
    }

    public void setTipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
    }

    public SolicitacaoCalculoIcmsDto tipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
        return this;
    }

    /**
     * UF favorecida
     *
     * @return ufAdquirente
     **/
    @JsonProperty("ufAdquirente")
    public String getUfAdquirente() {
        if (ufAdquirente == null) {
            return null;
        }
        return ufAdquirente.value();
    }

    public void setUfAdquirente(UfAdquirenteEnum ufAdquirente) {
        this.ufAdquirente = ufAdquirente;
    }

    public SolicitacaoCalculoIcmsDto ufAdquirente(UfAdquirenteEnum ufAdquirente) {
        this.ufAdquirente = ufAdquirente;
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

    public SolicitacaoCalculoIcmsDto ufFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
        return this;
    }

    /**
     * UF importador
     * @return ufImportador
     **/
    @JsonProperty("ufImportador")
    @NotNull
    public String getUfImportador() {
        if (ufImportador == null) {
            return null;
        }
        return ufImportador.value();
    }

    public void setUfImportador(UfImportadorEnum ufImportador) {
        this.ufImportador = ufImportador;
    }

    public SolicitacaoCalculoIcmsDto ufImportador(UfImportadorEnum ufImportador) {
        this.ufImportador = ufImportador;
        return this;
    }

    /**
     * Valor do AFRMM no momento da criação da solicitação&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     * @return valorAfrmm
     **/
    @JsonProperty("valorAfrmm")
    @NotNull
    public BigDecimal getValorAfrmm() {
        return valorAfrmm;
    }

    public void setValorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
    }

    public SolicitacaoCalculoIcmsDto valorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
        return this;
    }

    /**
     * Valor das demais despesas aduaneiras&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     * @return valorDespesasAduaneiras
     **/
    @JsonProperty("valorDespesasAduaneiras")
    public BigDecimal getValorDespesasAduaneiras() {
        return valorDespesasAduaneiras;
    }

    public void setValorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    }

    public SolicitacaoCalculoIcmsDto valorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
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

    public SolicitacaoCalculoIcmsDto versaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SolicitacaoCalculoIcmsDto {\n" +
                "    cnaeAdquirente: " + toIndentedString(cnaeAdquirente) + "\n" +
                "    cnaeImportador: " + toIndentedString(cnaeImportador) + "\n" +
                "    codMunicipioDesembaracoPretendido: " + toIndentedString(codMunicipioDesembaracoPretendido) + "\n" +
                "    cpfSolicitante: " + toIndentedString(cpfSolicitante) + "\n" +
                "    descricaoDespesasAduaneiras: " + toIndentedString(descricaoDespesasAduaneiras) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    numeroDeclaracao: " + toIndentedString(numeroDeclaracao) + "\n" +
                "    opcaoIcms: " + toIndentedString(opcaoIcms) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "    tipoSolicitacao: " + toIndentedString(tipoSolicitacao) + "\n" +
                "    tipoTratamento: " + toIndentedString(tipoTratamento) + "\n" +
                "    ufAdquirente: " + toIndentedString(ufAdquirente) + "\n" +
                "    ufFavorecida: " + toIndentedString(ufFavorecida) + "\n" +
                "    ufImportador: " + toIndentedString(ufImportador) + "\n" +
                "    valorAfrmm: " + toIndentedString(valorAfrmm) + "\n" +
                "    valorDespesasAduaneiras: " + toIndentedString(valorDespesasAduaneiras) + "\n" +
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

