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
@XmlType(name = "DadosSolicitacaoIcmsDTO", propOrder =
        {"descricaoDespesasAduaneiras", "periodoReferencia", "numMandadoJudicial", "valorDespesasAduaneiras", "numeroDuimp", "ufFavorecida", "opcaoIcms", "valorCIFExonerado", "valorAfrmm", "tipoDeclaracao", "valorCIFPagamento", "valorIcms", "informacoesComplementares", "versaoDuimp", "tipoTratamento"
        })

@XmlRootElement(name = "DadosSolicitacaoIcmsDTO")
/**
 * Dados para criação da solicitação de pagamento/exoneração de ICMS
 **/
@ApiModel(description = "Dados para criação da solicitação de pagamento/exoneração de ICMS")
public class DadosSolicitacaoIcmsDTO {

    @XmlElement(name = "descricaoDespesasAduaneiras")
    @ApiModelProperty(value = "Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400<br/>(*) Obrigatório se for informado valor para o campo 'valorDespesasAduaneiras'.")
    /**
     * Descrição das demais despesas aduaneiras <br>Tamanho máximo: 400<br/>(*) Obrigatório se for informado valor para o campo 'valorDespesasAduaneiras'.
     **/
    private String descricaoDespesasAduaneiras = null;

    @XmlElement(name = "periodoReferencia", required = true)
    @ApiModelProperty(example = "2024-01", required = true, value = "Período de referência<br>Formato: 'yyyy-MM'")
    /**
     * Período de referência<br>Formato: 'yyyy-MM'
     **/
    private String periodoReferencia = null;

    @XmlElement(name = "numMandadoJudicial")
    @ApiModelProperty(example = "11111111111111111111", value = "Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = 'MANDADO_JUDICIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.")
    /**
     * Número do Mandado Judicial <br>Tamanho mínimo: 1<br>Tamanho máximo: 30<br/>(*) Obrigatório se tipoSolicitacao = 'MANDADO_JUDICIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.
     **/
    private String numMandadoJudicial = null;

    @XmlElement(name = "valorDespesasAduaneiras")
    @ApiModelProperty(example = "162.57", value = "Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor das demais despesas aduaneiras<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorDespesasAduaneiras = null;

    @XmlElement(name = "numeroDuimp", required = true)
    @ApiModelProperty(example = "19BR00000004677", required = true, value = "Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15")
    /**
     * Número da Duimp<br>Formato: 'NNAANNNNNNNNNNN'<br>Tamanho: 15
     **/
    private String numeroDuimp = null;
    @XmlElement(name = "ufFavorecida", required = true)
    @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
    /**
     * UF favorecida
     **/
    private UfFavorecidaEnum ufFavorecida = null;
    @XmlElement(name = "opcaoIcms")
    @ApiModelProperty(example = "5", value = "Identificador único da opção para solicitação de cálculo<br/>(*) Pode ser informado somente para tipo de tratamento = 'CALCULO_SEFAZ'. As opções disponíveis para a UF devem ser consultadas através do serviço 'Consultar opções de UFs favorecidas'.")
    /**
     * Identificador único da opção para solicitação de cálculo<br/>(*) Pode ser informado somente para tipo de tratamento = 'CALCULO_SEFAZ'. As opções disponíveis para a UF devem ser consultadas através do serviço 'Consultar opções de UFs favorecidas'.
     **/
    private Long opcaoIcms = null;
    @XmlElement(name = "valorCIFExonerado")
    @ApiModelProperty(example = "60.33", value = "Valor CIF considerado para exoneração (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'EXONERACAO_PAG_PARCIAL_DUIMP' ou 'EXONERACAO_INTEGRAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.")
    @Valid
    /**
     * Valor CIF considerado para exoneração (abatido da base de cálculo de ICMS)<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'EXONERACAO_PAG_PARCIAL_DUIMP' ou 'EXONERACAO_INTEGRAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.
     **/
    private BigDecimal valorCIFExonerado = null;
    @XmlElement(name = "valorAfrmm")
    @ApiModelProperty(example = "95.8", value = "Equivale ao somatório dos valores do AFRMM e da TUM que foram efetivamente considerados na base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo.")
    @Valid
    /**
     * Equivale ao somatório dos valores do AFRMM e da TUM que foram efetivamente considerados na base de cálculo do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório para Duimp de modal marítmo.
     **/
    private BigDecimal valorAfrmm = null;
    @XmlElement(name = "tipoDeclaracao", required = true)
    @ApiModelProperty(example = "PAGAMENTO_INTEGRAL_DUIMP", required = true, value = "Tipo de declaração de Pagamento/Exoneração de ICMS")
    /**
     * Tipo de declaração de Pagamento/Exoneração de ICMS
     **/
    private TipoDeclaracaoEnum tipoDeclaracao = null;
    @XmlElement(name = "valorCIFPagamento")
    @ApiModelProperty(example = "162.57", value = "Valor considerado para a base de cálculo do ICMS quando a declaração for um pagamento parcial<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'PAGAMENTO_PARCIAL_DUIMP' ou 'EXONERACAO_PAG_PARCIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.")
    @Valid
    /**
     * Valor considerado para a base de cálculo do ICMS quando a declaração for um pagamento parcial<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'PAGAMENTO_PARCIAL_DUIMP' ou 'EXONERACAO_PAG_PARCIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.
     **/
    private BigDecimal valorCIFPagamento = null;
    @XmlElement(name = "valorIcms")
    @ApiModelProperty(example = "103.2", value = "Valor do ICMS importação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'PAGAMENTO_INTEGRAL_DUIMP' ou 'PAGAMENTO_PARCIAL_DUIMP' ou 'EXONERACAO_PAG_PARCIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.")
    @Valid
    /**
     * Valor do ICMS importação<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2<br/>(*) Obrigatório se tipoSolicitacao = 'PAGAMENTO_INTEGRAL_DUIMP' ou 'PAGAMENTO_PARCIAL_DUIMP' ou 'EXONERACAO_PAG_PARCIAL_DUIMP' e tipo de tratamento != 'CALCULO_SEFAZ'.
     **/
    private BigDecimal valorIcms = null;
    @XmlElement(name = "informacoesComplementares")
    @ApiModelProperty(value = "Informações complementares da declaração <br>Tamanho máximo: 400")
    /**
     * Informações complementares da declaração <br>Tamanho máximo: 400
     **/
    private String informacoesComplementares = null;
    @XmlElement(name = "versaoDuimp", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDuimp = null;
    @XmlElement(name = "tipoTratamento", required = true)
    @ApiModelProperty(example = "MANUAL", required = true, value = "Tipo de tratamento que será usado na declaração")
    /**
     * Tipo de tratamento que será usado na declaração
     **/
    private TipoTratamentoEnum tipoTratamento = null;

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
     * Descrição das demais despesas aduaneiras &lt;br&gt;Tamanho máximo: 400&lt;br/&gt;(*) Obrigatório se for informado valor para o campo &#39;valorDespesasAduaneiras&#39;.
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

    public DadosSolicitacaoIcmsDTO descricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
        this.descricaoDespesasAduaneiras = descricaoDespesasAduaneiras;
        return this;
    }

    /**
     * Período de referência&lt;br&gt;Formato: &#39;yyyy-MM&#39;
     *
     * @return periodoReferencia
     **/
    @JsonProperty("periodoReferencia")
    @NotNull
    public String getPeriodoReferencia() {
        return periodoReferencia;
    }

    public void setPeriodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
    }

    public DadosSolicitacaoIcmsDTO periodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
        return this;
    }

    /**
     * Número do Mandado Judicial &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 30&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; &#39;MANDADO_JUDICIAL_DUIMP&#39; e tipo de tratamento !&#x3D; &#39;CALCULO_SEFAZ&#39;.
     *
     * @return numMandadoJudicial
     **/
    @JsonProperty("numMandadoJudicial")
    public String getNumMandadoJudicial() {
        return numMandadoJudicial;
    }

    public void setNumMandadoJudicial(String numMandadoJudicial) {
        this.numMandadoJudicial = numMandadoJudicial;
    }

    public DadosSolicitacaoIcmsDTO numMandadoJudicial(String numMandadoJudicial) {
        this.numMandadoJudicial = numMandadoJudicial;
        return this;
    }

    /**
     * Valor das demais despesas aduaneiras&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     *
     * @return valorDespesasAduaneiras
     **/
    @JsonProperty("valorDespesasAduaneiras")
    public BigDecimal getValorDespesasAduaneiras() {
        return valorDespesasAduaneiras;
    }

    public void setValorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
    }

    public DadosSolicitacaoIcmsDTO valorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
        this.valorDespesasAduaneiras = valorDespesasAduaneiras;
        return this;
    }

    /**
     * Número da Duimp&lt;br&gt;Formato: &#39;NNAANNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 15
     *
     * @return numeroDuimp
     **/
    @JsonProperty("numeroDuimp")
    @NotNull
    public String getNumeroDuimp() {
        return numeroDuimp;
    }

    public void setNumeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
    }

    public DadosSolicitacaoIcmsDTO numeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
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

    public DadosSolicitacaoIcmsDTO ufFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
        return this;
    }

    /**
     * Identificador único da opção para solicitação de cálculo&lt;br/&gt;(*) Pode ser informado somente para tipo de tratamento &#x3D; &#39;CALCULO_SEFAZ&#39;. As opções disponíveis para a UF devem ser consultadas através do serviço &#39;Consultar opções de UFs favorecidas&#39;.
     *
     * @return opcaoIcms
     **/
    @JsonProperty("opcaoIcms")
    public Long getOpcaoIcms() {
        return opcaoIcms;
    }

    public void setOpcaoIcms(Long opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
    }

    public DadosSolicitacaoIcmsDTO opcaoIcms(Long opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
        return this;
    }

    /**
     * Valor CIF considerado para exoneração (abatido da base de cálculo de ICMS)&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; &#39;EXONERACAO_PAG_PARCIAL_DUIMP&#39; ou &#39;EXONERACAO_INTEGRAL_DUIMP&#39; e tipo de tratamento !&#x3D; &#39;CALCULO_SEFAZ&#39;.
     *
     * @return valorCIFExonerado
     **/
    @JsonProperty("valorCIFExonerado")
    public BigDecimal getValorCIFExonerado() {
        return valorCIFExonerado;
    }

    public void setValorCIFExonerado(BigDecimal valorCIFExonerado) {
        this.valorCIFExonerado = valorCIFExonerado;
    }

    public DadosSolicitacaoIcmsDTO valorCIFExonerado(BigDecimal valorCIFExonerado) {
        this.valorCIFExonerado = valorCIFExonerado;
        return this;
    }

    /**
     * Equivale ao somatório dos valores do AFRMM e da TUM que foram efetivamente considerados na base de cálculo do ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório para Duimp de modal marítmo.
     *
     * @return valorAfrmm
     **/
    @JsonProperty("valorAfrmm")
    public BigDecimal getValorAfrmm() {
        return valorAfrmm;
    }

    public void setValorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
    }

    public DadosSolicitacaoIcmsDTO valorAfrmm(BigDecimal valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
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

    public DadosSolicitacaoIcmsDTO tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
        this.tipoDeclaracao = tipoDeclaracao;
        return this;
    }

    /**
     * Valor considerado para a base de cálculo do ICMS quando a declaração for um pagamento parcial&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; &#39;PAGAMENTO_PARCIAL_DUIMP&#39; ou &#39;EXONERACAO_PAG_PARCIAL_DUIMP&#39; e tipo de tratamento !&#x3D; &#39;CALCULO_SEFAZ&#39;.
     *
     * @return valorCIFPagamento
     **/
    @JsonProperty("valorCIFPagamento")
    public BigDecimal getValorCIFPagamento() {
        return valorCIFPagamento;
    }

    public void setValorCIFPagamento(BigDecimal valorCIFPagamento) {
        this.valorCIFPagamento = valorCIFPagamento;
    }

    public DadosSolicitacaoIcmsDTO valorCIFPagamento(BigDecimal valorCIFPagamento) {
        this.valorCIFPagamento = valorCIFPagamento;
        return this;
    }

    /**
     * Valor do ICMS importação&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2&lt;br/&gt;(*) Obrigatório se tipoSolicitacao &#x3D; &#39;PAGAMENTO_INTEGRAL_DUIMP&#39; ou &#39;PAGAMENTO_PARCIAL_DUIMP&#39; ou &#39;EXONERACAO_PAG_PARCIAL_DUIMP&#39; e tipo de tratamento !&#x3D; &#39;CALCULO_SEFAZ&#39;.
     *
     * @return valorIcms
     **/
    @JsonProperty("valorIcms")
    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public DadosSolicitacaoIcmsDTO valorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
        return this;
    }

    /**
     * Informações complementares da declaração &lt;br&gt;Tamanho máximo: 400
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

    public DadosSolicitacaoIcmsDTO informacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
        return this;
    }

    /**
     * Versão da Duimp&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
     *
     * @return versaoDuimp
     **/
    @JsonProperty("versaoDuimp")
    @NotNull
    public String getVersaoDuimp() {
        return versaoDuimp;
    }

    public void setVersaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
    }

    public DadosSolicitacaoIcmsDTO versaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }

    /**
     * Tipo de tratamento que será usado na declaração
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

    public DadosSolicitacaoIcmsDTO tipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosSolicitacaoIcmsDTO {\n" +
                "    descricaoDespesasAduaneiras: " + toIndentedString(descricaoDespesasAduaneiras) + "\n" +
                "    periodoReferencia: " + toIndentedString(periodoReferencia) + "\n" +
                "    numMandadoJudicial: " + toIndentedString(numMandadoJudicial) + "\n" +
                "    valorDespesasAduaneiras: " + toIndentedString(valorDespesasAduaneiras) + "\n" +
                "    numeroDuimp: " + toIndentedString(numeroDuimp) + "\n" +
                "    ufFavorecida: " + toIndentedString(ufFavorecida) + "\n" +
                "    opcaoIcms: " + toIndentedString(opcaoIcms) + "\n" +
                "    valorCIFExonerado: " + toIndentedString(valorCIFExonerado) + "\n" +
                "    valorAfrmm: " + toIndentedString(valorAfrmm) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "    valorCIFPagamento: " + toIndentedString(valorCIFPagamento) + "\n" +
                "    valorIcms: " + toIndentedString(valorIcms) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "    tipoTratamento: " + toIndentedString(tipoTratamento) + "\n" +
                "}";
        return sb;
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

    @XmlType(name = "TipoTratamentoEnum")
    @XmlEnum(String.class)
    public enum TipoTratamentoEnum {

        @XmlEnumValue("MANUAL")
        @JsonProperty("MANUAL")
        MANUAL("MANUAL"),

        @XmlEnumValue("DECLARATORIO")
        @JsonProperty("DECLARATORIO")
        DECLARATORIO("DECLARATORIO"),

        @XmlEnumValue("CALCULO_SEFAZ")
        @JsonProperty("CALCULO_SEFAZ")
        CALCULO_SEFAZ("CALCULO_SEFAZ");


        private final String value;

        TipoTratamentoEnum(String v) {
            value = v;
        }

        public static TipoTratamentoEnum fromValue(String v) {
            for (TipoTratamentoEnum b : TipoTratamentoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoEnum");
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
