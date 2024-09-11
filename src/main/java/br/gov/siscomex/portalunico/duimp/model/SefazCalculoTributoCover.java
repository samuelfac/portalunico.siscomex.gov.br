package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazCalculoTributoCover", propOrder =
        {"imposto", "fundamentoLegalNormal", "valorBaseCalculo", "valorBaseCalculoEspecifica", "valorBaseCalculoReduzida", "percReducaoBaseCalculo", "tipoAliquota", "valorAliquota", "valorAliquotaEspecifica", "valorAliquotaReduzida", "percReducaoAliquotaReduzida", "valorCalculado", "valorAReduzir", "valorDevido", "valorSuspenso", "impostoARecolher", "valorNormal", "valorOriginalmenteDevido", "percentualPagamentoProporcional", "valorCalculadoPagamentoProporcional", "indicadorTributado"
        })

@XmlRootElement(name = "SefazCalculoTributoCover")
/**
 * Memória de cálculo por tipo de imposto.
 **/
@ApiModel(description = "Memória de cálculo por tipo de imposto.")
public class SefazCalculoTributoCover {

    @XmlElement(name = "imposto")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio imposto = null;

    @XmlElement(name = "fundamentoLegalNormal")
    @ApiModelProperty(value = "")
    @Valid
    private FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegalNormal = null;

    @XmlElement(name = "valorBaseCalculo")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorBaseCalculo = null;

    @XmlElement(name = "valorBaseCalculoEspecifica")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo específica em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo específica em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorBaseCalculoEspecifica = null;

    @XmlElement(name = "valorBaseCalculoReduzida")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo reduzida em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo reduzida em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorBaseCalculoReduzida = null;

    @XmlElement(name = "percReducaoBaseCalculo")
    @ApiModelProperty(example = "10.0", value = "Percentual de redução da base de cálculo.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Percentual de redução da base de cálculo.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal percReducaoBaseCalculo = null;

    @XmlElement(name = "tipoAliquota")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio tipoAliquota = null;

    @XmlElement(name = "valorAliquota")
    @ApiModelProperty(example = "35.0", value = "Valor da alíquota (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquota = null;

    @XmlElement(name = "valorAliquotaEspecifica")
    @ApiModelProperty(example = "35.0", value = "Valor da alíquota específica (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota específica (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquotaEspecifica = null;

    @XmlElement(name = "valorAliquotaReduzida")
    @ApiModelProperty(example = "35.0", value = "Valor da alíquota reduzida (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota reduzida (%).<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquotaReduzida = null;

    @XmlElement(name = "percReducaoAliquotaReduzida")
    @ApiModelProperty(example = "0.0", value = "percentual de redução a alíquota reduzida.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * percentual de redução a alíquota reduzida.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal percReducaoAliquotaReduzida = null;

    @XmlElement(name = "valorCalculado")
    @ApiModelProperty(example = "1598.73", value = "Valor calculado em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor calculado em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorCalculado = null;

    @XmlElement(name = "valorAReduzir")
    @ApiModelProperty(example = "0.0", value = "Valor a reduzir em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a reduzir em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAReduzir = null;

    @XmlElement(name = "valorDevido")
    @ApiModelProperty(example = "0.0", value = "Valor devido em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor devido em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorDevido = null;

    @XmlElement(name = "valorSuspenso")
    @ApiModelProperty(example = "0.0", value = "Valor suspenso em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor suspenso em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorSuspenso = null;

    @XmlElement(name = "impostoARecolher")
    @ApiModelProperty(example = "0.0", value = "Valor do imposto a recolher em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do imposto a recolher em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal impostoARecolher = null;

    @XmlElement(name = "valorNormal")
    @ApiModelProperty(example = "456.78", value = "Valor normal em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor normal em reais.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorNormal = null;

    @XmlElement(name = "valorOriginalmenteDevido")
    @ApiModelProperty(example = "456.78", value = "Valor originalmente devido em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o 'Indicador de cobrança do tributo suspenso' = Sim<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor originalmente devido em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o 'Indicador de cobrança do tributo suspenso' = Sim<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorOriginalmenteDevido = null;

    @XmlElement(name = "percentualPagamentoProporcional")
    @ApiModelProperty(example = "50.0", value = "Percentual de pagamento (para a admissão temporária com pagamento proporcional)<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Percentual de pagamento (para a admissão temporária com pagamento proporcional)<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal percentualPagamentoProporcional = null;

    @XmlElement(name = "valorCalculadoPagamentoProporcional")
    @ApiModelProperty(example = "456.78", value = "Valor calculado do pagamento proporcional em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o 'Indicador de cobrança do tributo suspenso' = Sim.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor calculado do pagamento proporcional em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o 'Indicador de cobrança do tributo suspenso' = Sim.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorCalculadoPagamentoProporcional = null;


    @XmlType(name = "IndicadorTributadoEnum")
    @XmlEnum(Integer.class)
    public enum IndicadorTributadoEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        NUMBER_1(Integer.valueOf(1)),

        @XmlEnumValue("2")
        @JsonProperty("2")
        NUMBER_2(Integer.valueOf(2));


        private final Integer value;

        IndicadorTributadoEnum(Integer v) {
            value = v;
        }

        public Integer value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static IndicadorTributadoEnum fromValue(String v) {
            for (IndicadorTributadoEnum b : IndicadorTributadoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorTributadoEnum");
        }
    }

    @XmlElement(name = "indicadorTributado")
    @ApiModelProperty(example = "1", value = "Indicador de tributação<br>Dominio: <br>1 - Sim, <br>2 - Não<br>Tamanho: 1")
    /**
     * Indicador de tributação<br>Dominio: <br>1 - Sim, <br>2 - Não<br>Tamanho: 1
     **/
    private IndicadorTributadoEnum indicadorTributado = null;

    /**
     * Get imposto
     *
     * @return imposto
     **/
    @JsonProperty("imposto")
    public TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio getImposto() {
        return imposto;
    }

    public void setImposto(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio imposto) {
        this.imposto = imposto;
    }

    public SefazCalculoTributoCover imposto(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio imposto) {
        this.imposto = imposto;
        return this;
    }

    /**
     * Get fundamentoLegalNormal
     *
     * @return fundamentoLegalNormal
     **/
    @JsonProperty("fundamentoLegalNormal")
    public FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio getFundamentoLegalNormal() {
        return fundamentoLegalNormal;
    }

    public void setFundamentoLegalNormal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegalNormal) {
        this.fundamentoLegalNormal = fundamentoLegalNormal;
    }

    public SefazCalculoTributoCover fundamentoLegalNormal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegalNormal) {
        this.fundamentoLegalNormal = fundamentoLegalNormal;
        return this;
    }

    /**
     * Valor da base de cálculo em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorBaseCalculo
     **/
    @JsonProperty("valorBaseCalculo")
    public BigDecimal getValorBaseCalculo() {
        return valorBaseCalculo;
    }

    public void setValorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
    }

    public SefazCalculoTributoCover valorBaseCalculo(BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
        return this;
    }

    /**
     * Valor da base de cálculo específica em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorBaseCalculoEspecifica
     **/
    @JsonProperty("valorBaseCalculoEspecifica")
    public BigDecimal getValorBaseCalculoEspecifica() {
        return valorBaseCalculoEspecifica;
    }

    public void setValorBaseCalculoEspecifica(BigDecimal valorBaseCalculoEspecifica) {
        this.valorBaseCalculoEspecifica = valorBaseCalculoEspecifica;
    }

    public SefazCalculoTributoCover valorBaseCalculoEspecifica(BigDecimal valorBaseCalculoEspecifica) {
        this.valorBaseCalculoEspecifica = valorBaseCalculoEspecifica;
        return this;
    }

    /**
     * Valor da base de cálculo reduzida em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorBaseCalculoReduzida
     **/
    @JsonProperty("valorBaseCalculoReduzida")
    public BigDecimal getValorBaseCalculoReduzida() {
        return valorBaseCalculoReduzida;
    }

    public void setValorBaseCalculoReduzida(BigDecimal valorBaseCalculoReduzida) {
        this.valorBaseCalculoReduzida = valorBaseCalculoReduzida;
    }

    public SefazCalculoTributoCover valorBaseCalculoReduzida(BigDecimal valorBaseCalculoReduzida) {
        this.valorBaseCalculoReduzida = valorBaseCalculoReduzida;
        return this;
    }

    /**
     * Percentual de redução da base de cálculo.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return percReducaoBaseCalculo
     **/
    @JsonProperty("percReducaoBaseCalculo")
    public BigDecimal getPercReducaoBaseCalculo() {
        return percReducaoBaseCalculo;
    }

    public void setPercReducaoBaseCalculo(BigDecimal percReducaoBaseCalculo) {
        this.percReducaoBaseCalculo = percReducaoBaseCalculo;
    }

    public SefazCalculoTributoCover percReducaoBaseCalculo(BigDecimal percReducaoBaseCalculo) {
        this.percReducaoBaseCalculo = percReducaoBaseCalculo;
        return this;
    }

    /**
     * Get tipoAliquota
     *
     * @return tipoAliquota
     **/
    @JsonProperty("tipoAliquota")
    public TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio getTipoAliquota() {
        return tipoAliquota;
    }

    public void setTipoAliquota(TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio tipoAliquota) {
        this.tipoAliquota = tipoAliquota;
    }

    public SefazCalculoTributoCover tipoAliquota(TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio tipoAliquota) {
        this.tipoAliquota = tipoAliquota;
        return this;
    }

    /**
     * Valor da alíquota (%).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorAliquota
     **/
    @JsonProperty("valorAliquota")
    public BigDecimal getValorAliquota() {
        return valorAliquota;
    }

    public void setValorAliquota(BigDecimal valorAliquota) {
        this.valorAliquota = valorAliquota;
    }

    public SefazCalculoTributoCover valorAliquota(BigDecimal valorAliquota) {
        this.valorAliquota = valorAliquota;
        return this;
    }

    /**
     * Valor da alíquota específica (%).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorAliquotaEspecifica
     **/
    @JsonProperty("valorAliquotaEspecifica")
    public BigDecimal getValorAliquotaEspecifica() {
        return valorAliquotaEspecifica;
    }

    public void setValorAliquotaEspecifica(BigDecimal valorAliquotaEspecifica) {
        this.valorAliquotaEspecifica = valorAliquotaEspecifica;
    }

    public SefazCalculoTributoCover valorAliquotaEspecifica(BigDecimal valorAliquotaEspecifica) {
        this.valorAliquotaEspecifica = valorAliquotaEspecifica;
        return this;
    }

    /**
     * Valor da alíquota reduzida (%).&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorAliquotaReduzida
     **/
    @JsonProperty("valorAliquotaReduzida")
    public BigDecimal getValorAliquotaReduzida() {
        return valorAliquotaReduzida;
    }

    public void setValorAliquotaReduzida(BigDecimal valorAliquotaReduzida) {
        this.valorAliquotaReduzida = valorAliquotaReduzida;
    }

    public SefazCalculoTributoCover valorAliquotaReduzida(BigDecimal valorAliquotaReduzida) {
        this.valorAliquotaReduzida = valorAliquotaReduzida;
        return this;
    }

    /**
     * percentual de redução a alíquota reduzida.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return percReducaoAliquotaReduzida
     **/
    @JsonProperty("percReducaoAliquotaReduzida")
    public BigDecimal getPercReducaoAliquotaReduzida() {
        return percReducaoAliquotaReduzida;
    }

    public void setPercReducaoAliquotaReduzida(BigDecimal percReducaoAliquotaReduzida) {
        this.percReducaoAliquotaReduzida = percReducaoAliquotaReduzida;
    }

    public SefazCalculoTributoCover percReducaoAliquotaReduzida(BigDecimal percReducaoAliquotaReduzida) {
        this.percReducaoAliquotaReduzida = percReducaoAliquotaReduzida;
        return this;
    }

    /**
     * Valor calculado em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorCalculado
     **/
    @JsonProperty("valorCalculado")
    public BigDecimal getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(BigDecimal valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    public SefazCalculoTributoCover valorCalculado(BigDecimal valorCalculado) {
        this.valorCalculado = valorCalculado;
        return this;
    }

    /**
     * Valor a reduzir em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorAReduzir
     **/
    @JsonProperty("valorAReduzir")
    public BigDecimal getValorAReduzir() {
        return valorAReduzir;
    }

    public void setValorAReduzir(BigDecimal valorAReduzir) {
        this.valorAReduzir = valorAReduzir;
    }

    public SefazCalculoTributoCover valorAReduzir(BigDecimal valorAReduzir) {
        this.valorAReduzir = valorAReduzir;
        return this;
    }

    /**
     * Valor devido em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorDevido
     **/
    @JsonProperty("valorDevido")
    public BigDecimal getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
    }

    public SefazCalculoTributoCover valorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
        return this;
    }

    /**
     * Valor suspenso em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorSuspenso
     **/
    @JsonProperty("valorSuspenso")
    public BigDecimal getValorSuspenso() {
        return valorSuspenso;
    }

    public void setValorSuspenso(BigDecimal valorSuspenso) {
        this.valorSuspenso = valorSuspenso;
    }

    public SefazCalculoTributoCover valorSuspenso(BigDecimal valorSuspenso) {
        this.valorSuspenso = valorSuspenso;
        return this;
    }

    /**
     * Valor do imposto a recolher em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return impostoARecolher
     **/
    @JsonProperty("impostoARecolher")
    public BigDecimal getImpostoARecolher() {
        return impostoARecolher;
    }

    public void setImpostoARecolher(BigDecimal impostoARecolher) {
        this.impostoARecolher = impostoARecolher;
    }

    public SefazCalculoTributoCover impostoARecolher(BigDecimal impostoARecolher) {
        this.impostoARecolher = impostoARecolher;
        return this;
    }

    /**
     * Valor normal em reais.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorNormal
     **/
    @JsonProperty("valorNormal")
    public BigDecimal getValorNormal() {
        return valorNormal;
    }

    public void setValorNormal(BigDecimal valorNormal) {
        this.valorNormal = valorNormal;
    }

    public SefazCalculoTributoCover valorNormal(BigDecimal valorNormal) {
        this.valorNormal = valorNormal;
        return this;
    }

    /**
     * Valor originalmente devido em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o &#39;Indicador de cobrança do tributo suspenso&#39; &#x3D; Sim&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorOriginalmenteDevido
     **/
    @JsonProperty("valorOriginalmenteDevido")
    public BigDecimal getValorOriginalmenteDevido() {
        return valorOriginalmenteDevido;
    }

    public void setValorOriginalmenteDevido(BigDecimal valorOriginalmenteDevido) {
        this.valorOriginalmenteDevido = valorOriginalmenteDevido;
    }

    public SefazCalculoTributoCover valorOriginalmenteDevido(BigDecimal valorOriginalmenteDevido) {
        this.valorOriginalmenteDevido = valorOriginalmenteDevido;
        return this;
    }

    /**
     * Percentual de pagamento (para a admissão temporária com pagamento proporcional)&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return percentualPagamentoProporcional
     **/
    @JsonProperty("percentualPagamentoProporcional")
    public BigDecimal getPercentualPagamentoProporcional() {
        return percentualPagamentoProporcional;
    }

    public void setPercentualPagamentoProporcional(BigDecimal percentualPagamentoProporcional) {
        this.percentualPagamentoProporcional = percentualPagamentoProporcional;
    }

    public SefazCalculoTributoCover percentualPagamentoProporcional(BigDecimal percentualPagamentoProporcional) {
        this.percentualPagamentoProporcional = percentualPagamentoProporcional;
        return this;
    }

    /**
     * Valor calculado do pagamento proporcional em Real. Valor aplicável para Duimp de situação especial de despacho cujo motivo de situação especial de despacho possua o &#39;Indicador de cobrança do tributo suspenso&#39; &#x3D; Sim.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorCalculadoPagamentoProporcional
     **/
    @JsonProperty("valorCalculadoPagamentoProporcional")
    public BigDecimal getValorCalculadoPagamentoProporcional() {
        return valorCalculadoPagamentoProporcional;
    }

    public void setValorCalculadoPagamentoProporcional(BigDecimal valorCalculadoPagamentoProporcional) {
        this.valorCalculadoPagamentoProporcional = valorCalculadoPagamentoProporcional;
    }

    public SefazCalculoTributoCover valorCalculadoPagamentoProporcional(BigDecimal valorCalculadoPagamentoProporcional) {
        this.valorCalculadoPagamentoProporcional = valorCalculadoPagamentoProporcional;
        return this;
    }

    /**
     * Indicador de tributação&lt;br&gt;Dominio: &lt;br&gt;1 - Sim, &lt;br&gt;2 - Não&lt;br&gt;Tamanho: 1
     *
     * @return indicadorTributado
     **/
    @JsonProperty("indicadorTributado")
    public Integer getIndicadorTributado() {
        if (indicadorTributado == null) {
            return null;
        }
        return indicadorTributado.value();
    }

    public void setIndicadorTributado(IndicadorTributadoEnum indicadorTributado) {
        this.indicadorTributado = indicadorTributado;
    }

    public SefazCalculoTributoCover indicadorTributado(IndicadorTributadoEnum indicadorTributado) {
        this.indicadorTributado = indicadorTributado;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazCalculoTributoCover {\n" +
                "    imposto: " + toIndentedString(imposto) + "\n" +
                "    fundamentoLegalNormal: " + toIndentedString(fundamentoLegalNormal) + "\n" +
                "    valorBaseCalculo: " + toIndentedString(valorBaseCalculo) + "\n" +
                "    valorBaseCalculoEspecifica: " + toIndentedString(valorBaseCalculoEspecifica) + "\n" +
                "    valorBaseCalculoReduzida: " + toIndentedString(valorBaseCalculoReduzida) + "\n" +
                "    percReducaoBaseCalculo: " + toIndentedString(percReducaoBaseCalculo) + "\n" +
                "    tipoAliquota: " + toIndentedString(tipoAliquota) + "\n" +
                "    valorAliquota: " + toIndentedString(valorAliquota) + "\n" +
                "    valorAliquotaEspecifica: " + toIndentedString(valorAliquotaEspecifica) + "\n" +
                "    valorAliquotaReduzida: " + toIndentedString(valorAliquotaReduzida) + "\n" +
                "    percReducaoAliquotaReduzida: " + toIndentedString(percReducaoAliquotaReduzida) + "\n" +
                "    valorCalculado: " + toIndentedString(valorCalculado) + "\n" +
                "    valorAReduzir: " + toIndentedString(valorAReduzir) + "\n" +
                "    valorDevido: " + toIndentedString(valorDevido) + "\n" +
                "    valorSuspenso: " + toIndentedString(valorSuspenso) + "\n" +
                "    impostoARecolher: " + toIndentedString(impostoARecolher) + "\n" +
                "    valorNormal: " + toIndentedString(valorNormal) + "\n" +
                "    valorOriginalmenteDevido: " + toIndentedString(valorOriginalmenteDevido) + "\n" +
                "    percentualPagamentoProporcional: " + toIndentedString(percentualPagamentoProporcional) + "\n" +
                "    valorCalculadoPagamentoProporcional: " + toIndentedString(valorCalculadoPagamentoProporcional) + "\n" +
                "    indicadorTributado: " + toIndentedString(indicadorTributado) + "\n" +
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

