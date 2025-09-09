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
@XmlType(name = "DeclaracaoIcmsDTO", propOrder =
        {"valorPagoIcms", "cpfSolicitante", "descricaoDespesasAduaneiras", "periodoReferencia", "numMandadoJudicial", "valorDespesasAduaneiras", "numeroDuimp", "situacaoSolicitacao", "ufFavorecida", "opcaoIcms", "valorCIFExonerado", "valorAfrmm", "tipoDeclaracao", "valorCIFPagamento", "valorIcms", "informacoesComplementares", "valorPagarIcms", "versaoDuimp", "tipoTratamento", "status"
        })

@XmlRootElement(name = "DeclaracaoIcmsDTO")
/**
 * Dados da declaração ICMS da Duimp
 **/
@ApiModel(description = "Dados da declaração ICMS da Duimp")
public class DeclaracaoIcmsDTO {

    @XmlElement(name = "valorPagoIcms", required = true)
    @ApiModelProperty(example = "103.2", required = true, value = "Valor total já pago do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor total já pago do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorPagoIcms = null;

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
    @XmlElement(name = "situacaoSolicitacao", required = true)
    @ApiModelProperty(example = "DUIMP_AGUARDANDO_EXIGENCIA", required = true, value = "Descrição da situação da solicitação")
    /**
     * Descrição da situação da solicitação
     **/
    private SituacaoSolicitacaoEnum situacaoSolicitacao = null;
    @XmlElement(name = "ufFavorecida", required = true)
    @ApiModelProperty(example = "RS", required = true, value = "UF favorecida")
    /**
     * UF favorecida
     **/
    private UfFavorecidaEnum ufFavorecida = null;
    @XmlElement(name = "opcaoIcms")
    @ApiModelProperty(value = "")
    @Valid
    private OpcaoCalculoIcmsDTO opcaoIcms = null;
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
    @ApiModelProperty(value = "Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400")
    /**
     * Texto livre com informações complementares pertinentes <br>Tamanho máximo: 400
     **/
    private String informacoesComplementares = null;
    @XmlElement(name = "valorPagarIcms", required = true)
    @ApiModelProperty(example = "103.2", required = true, value = "Valor a pagar do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2")
    @Valid
    /**
     * Valor a pagar do ICMS<br>Formato: Decimal, com 2 casas decimais separadas por ponto.<br>Tamanho: 15,2
     **/
    private BigDecimal valorPagarIcms = null;
    @XmlElement(name = "versaoDuimp", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999")
    /**
     * Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999
     **/
    private String versaoDuimp = null;
    @XmlElement(name = "tipoTratamento", required = true)
    @ApiModelProperty(example = "MANUAL", required = true, value = "Tipo de tratamento usado na declaração")
    /**
     * Tipo de tratamento usado na declaração
     **/
    private TipoTratamentoEnum tipoTratamento = null;
    @XmlElement(name = "status")
    @ApiModelProperty(example = "Entrega da carga não permitida. ICMS não declarado ou não foi solicitado pagamento/exoneração do ICMS no Portal Único Siscomex.", value = "Observação, conforme o tipo de tratamento")
    /**
     * Observação, conforme o tipo de tratamento
     **/
    private String status = null;

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
     * Valor total já pago do ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     *
     * @return valorPagoIcms
     **/
    @JsonProperty("valorPagoIcms")
    @NotNull
    public BigDecimal getValorPagoIcms() {
        return valorPagoIcms;
    }

    public void setValorPagoIcms(BigDecimal valorPagoIcms) {
        this.valorPagoIcms = valorPagoIcms;
    }

    public DeclaracaoIcmsDTO valorPagoIcms(BigDecimal valorPagoIcms) {
        this.valorPagoIcms = valorPagoIcms;
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

    public DeclaracaoIcmsDTO cpfSolicitante(String cpfSolicitante) {
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

    public DeclaracaoIcmsDTO descricaoDespesasAduaneiras(String descricaoDespesasAduaneiras) {
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

    public DeclaracaoIcmsDTO periodoReferencia(String periodoReferencia) {
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

    public DeclaracaoIcmsDTO numMandadoJudicial(String numMandadoJudicial) {
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

    public DeclaracaoIcmsDTO valorDespesasAduaneiras(BigDecimal valorDespesasAduaneiras) {
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

    public DeclaracaoIcmsDTO numeroDuimp(String numeroDuimp) {
        this.numeroDuimp = numeroDuimp;
        return this;
    }

    /**
     * Descrição da situação da solicitação
     *
     * @return situacaoSolicitacao
     **/
    @JsonProperty("situacaoSolicitacao")
    @NotNull
    public String getSituacaoSolicitacao() {
        if (situacaoSolicitacao == null) {
            return null;
        }
        return situacaoSolicitacao.value();
    }

    public void setSituacaoSolicitacao(SituacaoSolicitacaoEnum situacaoSolicitacao) {
        this.situacaoSolicitacao = situacaoSolicitacao;
    }

    public DeclaracaoIcmsDTO situacaoSolicitacao(SituacaoSolicitacaoEnum situacaoSolicitacao) {
        this.situacaoSolicitacao = situacaoSolicitacao;
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

    public DeclaracaoIcmsDTO ufFavorecida(UfFavorecidaEnum ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
        return this;
    }

    /**
     * Get opcaoIcms
     *
     * @return opcaoIcms
     **/
    @JsonProperty("opcaoIcms")
    public OpcaoCalculoIcmsDTO getOpcaoIcms() {
        return opcaoIcms;
    }

    public void setOpcaoIcms(OpcaoCalculoIcmsDTO opcaoIcms) {
        this.opcaoIcms = opcaoIcms;
    }

    public DeclaracaoIcmsDTO opcaoIcms(OpcaoCalculoIcmsDTO opcaoIcms) {
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

    public DeclaracaoIcmsDTO valorCIFExonerado(BigDecimal valorCIFExonerado) {
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

    public DeclaracaoIcmsDTO valorAfrmm(BigDecimal valorAfrmm) {
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

    public DeclaracaoIcmsDTO tipoDeclaracao(TipoDeclaracaoEnum tipoDeclaracao) {
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

    public DeclaracaoIcmsDTO valorCIFPagamento(BigDecimal valorCIFPagamento) {
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

    public DeclaracaoIcmsDTO valorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
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

    public DeclaracaoIcmsDTO informacoesComplementares(String informacoesComplementares) {
        this.informacoesComplementares = informacoesComplementares;
        return this;
    }

    /**
     * Valor a pagar do ICMS&lt;br&gt;Formato: Decimal, com 2 casas decimais separadas por ponto.&lt;br&gt;Tamanho: 15,2
     *
     * @return valorPagarIcms
     **/
    @JsonProperty("valorPagarIcms")
    @NotNull
    public BigDecimal getValorPagarIcms() {
        return valorPagarIcms;
    }

    public void setValorPagarIcms(BigDecimal valorPagarIcms) {
        this.valorPagarIcms = valorPagarIcms;
    }

    public DeclaracaoIcmsDTO valorPagarIcms(BigDecimal valorPagarIcms) {
        this.valorPagarIcms = valorPagarIcms;
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

    public DeclaracaoIcmsDTO versaoDuimp(String versaoDuimp) {
        this.versaoDuimp = versaoDuimp;
        return this;
    }

    /**
     * Tipo de tratamento usado na declaração
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

    public DeclaracaoIcmsDTO tipoTratamento(TipoTratamentoEnum tipoTratamento) {
        this.tipoTratamento = tipoTratamento;
        return this;
    }

    /**
     * Observação, conforme o tipo de tratamento
     *
     * @return status
     **/
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeclaracaoIcmsDTO status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DeclaracaoIcmsDTO {\n" +
                "    valorPagoIcms: " + toIndentedString(valorPagoIcms) + "\n" +
                "    cpfSolicitante: " + toIndentedString(cpfSolicitante) + "\n" +
                "    descricaoDespesasAduaneiras: " + toIndentedString(descricaoDespesasAduaneiras) + "\n" +
                "    periodoReferencia: " + toIndentedString(periodoReferencia) + "\n" +
                "    numMandadoJudicial: " + toIndentedString(numMandadoJudicial) + "\n" +
                "    valorDespesasAduaneiras: " + toIndentedString(valorDespesasAduaneiras) + "\n" +
                "    numeroDuimp: " + toIndentedString(numeroDuimp) + "\n" +
                "    situacaoSolicitacao: " + toIndentedString(situacaoSolicitacao) + "\n" +
                "    ufFavorecida: " + toIndentedString(ufFavorecida) + "\n" +
                "    opcaoIcms: " + toIndentedString(opcaoIcms) + "\n" +
                "    valorCIFExonerado: " + toIndentedString(valorCIFExonerado) + "\n" +
                "    valorAfrmm: " + toIndentedString(valorAfrmm) + "\n" +
                "    tipoDeclaracao: " + toIndentedString(tipoDeclaracao) + "\n" +
                "    valorCIFPagamento: " + toIndentedString(valorCIFPagamento) + "\n" +
                "    valorIcms: " + toIndentedString(valorIcms) + "\n" +
                "    informacoesComplementares: " + toIndentedString(informacoesComplementares) + "\n" +
                "    valorPagarIcms: " + toIndentedString(valorPagarIcms) + "\n" +
                "    versaoDuimp: " + toIndentedString(versaoDuimp) + "\n" +
                "    tipoTratamento: " + toIndentedString(tipoTratamento) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "SituacaoSolicitacaoEnum")
    @XmlEnum(String.class)
    public enum SituacaoSolicitacaoEnum {

        @XmlEnumValue("DUIMP_DECLARADA")
        @JsonProperty("DUIMP_DECLARADA")
        DECLARADA("DUIMP_DECLARADA"),

        @XmlEnumValue("DUIMP_CANCELADA_IMPORTADOR")
        @JsonProperty("DUIMP_CANCELADA_IMPORTADOR")
        CANCELADA_IMPORTADOR("DUIMP_CANCELADA_IMPORTADOR"),

        @XmlEnumValue("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
        @JsonProperty("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO")
        PENDENTE_PAGAMENTO_EXONERACAO("DUIMP_PENDENTE_PAGAMENTO_EXONERACAO"),

        @XmlEnumValue("DUIMP_PAGA_EXONERADA")
        @JsonProperty("DUIMP_PAGA_EXONERADA")
        PAGA_EXONERADA("DUIMP_PAGA_EXONERADA"),

        @XmlEnumValue("DUIMP_CANCELADA_AUTOMATICAMENTE")
        @JsonProperty("DUIMP_CANCELADA_AUTOMATICAMENTE")
        CANCELADA_AUTOMATICAMENTE("DUIMP_CANCELADA_AUTOMATICAMENTE"),

        @XmlEnumValue("DUIMP_AGUARDANDO_DOCUMENTACAO")
        @JsonProperty("DUIMP_AGUARDANDO_DOCUMENTACAO")
        AGUARDANDO_DOCUMENTACAO("DUIMP_AGUARDANDO_DOCUMENTACAO"),

        @XmlEnumValue("DUIMP_AGUARDANDO_EXIGENCIA")
        @JsonProperty("DUIMP_AGUARDANDO_EXIGENCIA")
        AGUARDANDO_EXIGENCIA("DUIMP_AGUARDANDO_EXIGENCIA"),

        @XmlEnumValue("DUIMP_A_DISTRIBUIR")
        @JsonProperty("DUIMP_A_DISTRIBUIR")
        A_DISTRIBUIR("DUIMP_A_DISTRIBUIR"),

        @XmlEnumValue("DUIMP_A_DISTRIBUIR_RETORNO")
        @JsonProperty("DUIMP_A_DISTRIBUIR_RETORNO")
        A_DISTRIBUIR_RETORNO("DUIMP_A_DISTRIBUIR_RETORNO"),

        @XmlEnumValue("DUIMP_DISTRIBUIDA")
        @JsonProperty("DUIMP_DISTRIBUIDA")
        DISTRIBUIDA("DUIMP_DISTRIBUIDA"),

        @XmlEnumValue("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
        @JsonProperty("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ")
        SOLICITACAO_AUTORIZADA_SEFAZ("DUIMP_SOLICITACAO_AUTORIZADA_SEFAZ"),

        @XmlEnumValue("DUIMP_SOLICITACAO_INDEFERIDA")
        @JsonProperty("DUIMP_SOLICITACAO_INDEFERIDA")
        SOLICITACAO_INDEFERIDA("DUIMP_SOLICITACAO_INDEFERIDA"),

        @XmlEnumValue("DUIMP_DECLARADA_PAGA")
        @JsonProperty("DUIMP_DECLARADA_PAGA")
        DECLARADA_PAGA("DUIMP_DECLARADA_PAGA"),

        @XmlEnumValue("DUIMP_CALCULO_SOLICITADO")
        @JsonProperty("DUIMP_CALCULO_SOLICITADO")
        CALCULO_SOLICITADO("DUIMP_CALCULO_SOLICITADO"),

        @XmlEnumValue("DUIMP_CALCULO_INDEFERIDO")
        @JsonProperty("DUIMP_CALCULO_INDEFERIDO")
        CALCULO_INDEFERIDO("DUIMP_CALCULO_INDEFERIDO");


        private final String value;

        SituacaoSolicitacaoEnum(String v) {
            value = v;
        }

        public static SituacaoSolicitacaoEnum fromValue(String v) {
            for (SituacaoSolicitacaoEnum b : SituacaoSolicitacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoSolicitacaoEnum");
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
