package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

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
@XmlType(name = "MemoriaCalculoItemCover", propOrder =
        {"codigoFundamentoLegalNormal", "baseCalculoBRL", "baseCalculoEspecificaBRL", "baseCalculoReduzidaBRL", "percentualReducaoBaseCalculo", "tipoAliquota", "percentualReducaoAliquotaReduzida", "valorAliquota", "valorAliquotaEspecifica", "valorAliquotaReduzida", "normal", "tributado", "percentualPagamento"
        })

@XmlRootElement(name = "MemoriaCalculoItemCover")
/**
 * Memória de cálculo por tipo de imposto.
 **/
@ApiModel(description = "Memória de cálculo por tipo de imposto.")
public class MemoriaCalculoItemCover {

    @XmlElement(name = "codigoFundamentoLegalNormal")
    @ApiModelProperty(example = "1001", value = "Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.")
    /**
     * Código do fundamento legal do regime tributário de importação utilizado na declaração.<br>Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.
     **/
    private Long codigoFundamentoLegalNormal = null;

    @XmlElement(name = "baseCalculoBRL")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal baseCalculoBRL = null;

    @XmlElement(name = "baseCalculoEspecificaBRL")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo específica em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo específica em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal baseCalculoEspecificaBRL = null;

    @XmlElement(name = "baseCalculoReduzidaBRL")
    @ApiModelProperty(example = "4567.8", value = "Valor da base de cálculo reduzida em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da base de cálculo reduzida em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal baseCalculoReduzidaBRL = null;

    @XmlElement(name = "percentualReducaoBaseCalculo")
    @ApiModelProperty(example = "4567.8", value = "Percentual de redução da base de cálculo.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Percentual de redução da base de cálculo.<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal percentualReducaoBaseCalculo = null;


    @XmlType(name = "TipoAliquotaEnum")
    @XmlEnum(String.class)
    public enum TipoAliquotaEnum {

        @XmlEnumValue("AD_VALOREM")
        @JsonProperty("AD_VALOREM")
        AD_VALOREM("AD_VALOREM"),

        @XmlEnumValue("ESPECIFICA")
        @JsonProperty("ESPECIFICA")
        ESPECIFICA("ESPECIFICA");


        private final String value;

        TipoAliquotaEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoAliquotaEnum fromValue(String v) {
            for (TipoAliquotaEnum b : TipoAliquotaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoAliquotaEnum");
        }
    }

    @XmlElement(name = "tipoAliquota")
    @ApiModelProperty(example = "AD_VALOREM", value = "Tipo de alíquota do tributo.<br>Domínio:")
    /**
     * Tipo de alíquota do tributo.<br>Domínio:
     **/
    private TipoAliquotaEnum tipoAliquota = null;

    @XmlElement(name = "percentualReducaoAliquotaReduzida")
    @ApiModelProperty(example = "4227.8", value = "Percentual de redução da alíquota reduzida (%).<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Percentual de redução da alíquota reduzida (%).<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal percentualReducaoAliquotaReduzida = null;

    @XmlElement(name = "valorAliquota")
    @ApiModelProperty(example = "4227.8", value = "Valor da alíquota (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquota = null;

    @XmlElement(name = "valorAliquotaEspecifica")
    @ApiModelProperty(example = "4227.8", value = "Valor da alíquota específica (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota específica (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquotaEspecifica = null;

    @XmlElement(name = "valorAliquotaReduzida")
    @ApiModelProperty(example = "4227.8", value = "Valor da alíquota reduzida (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor da alíquota reduzida (%).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAliquotaReduzida = null;

    @XmlElement(name = "normal")
    @ApiModelProperty(example = "4227.8", value = "Valor normal em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor normal em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal normal = null;

    @XmlElement(name = "tributado")
    @ApiModelProperty(example = "true", value = "Indicador de tributação.")
    /**
     * Indicador de tributação.
     **/
    private Boolean tributado = null;

    @XmlElement(name = "percentualPagamento")
    @ApiModelProperty(example = "4227.8", value = "Percentual de pagamento, preenchido no caso de item com fundamento legal correspondente à admissão temporária com pagamento proporcional (ATUE). Para as demais Duimp será retornado nulo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Percentual de pagamento, preenchido no caso de item com fundamento legal correspondente à admissão temporária com pagamento proporcional (ATUE). Para as demais Duimp será retornado nulo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal percentualPagamento = null;

    /**
     * Código do fundamento legal do regime tributário de importação utilizado na declaração.&lt;br&gt;Domínio: Fundamentos legais existentes no sistema Tratamento Tributário.
     *
     * @return codigoFundamentoLegalNormal
     **/
    @JsonProperty("codigoFundamentoLegalNormal")
    public Long getCodigoFundamentoLegalNormal() {
        return codigoFundamentoLegalNormal;
    }

    public void setCodigoFundamentoLegalNormal(Long codigoFundamentoLegalNormal) {
        this.codigoFundamentoLegalNormal = codigoFundamentoLegalNormal;
    }

    public MemoriaCalculoItemCover codigoFundamentoLegalNormal(Long codigoFundamentoLegalNormal) {
        this.codigoFundamentoLegalNormal = codigoFundamentoLegalNormal;
        return this;
    }

    /**
     * Valor da base de cálculo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return baseCalculoBRL
     **/
    @JsonProperty("baseCalculoBRL")
    public BigDecimal getBaseCalculoBRL() {
        return baseCalculoBRL;
    }

    public void setBaseCalculoBRL(BigDecimal baseCalculoBRL) {
        this.baseCalculoBRL = baseCalculoBRL;
    }

    public MemoriaCalculoItemCover baseCalculoBRL(BigDecimal baseCalculoBRL) {
        this.baseCalculoBRL = baseCalculoBRL;
        return this;
    }

    /**
     * Valor da base de cálculo específica em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return baseCalculoEspecificaBRL
     **/
    @JsonProperty("baseCalculoEspecificaBRL")
    public BigDecimal getBaseCalculoEspecificaBRL() {
        return baseCalculoEspecificaBRL;
    }

    public void setBaseCalculoEspecificaBRL(BigDecimal baseCalculoEspecificaBRL) {
        this.baseCalculoEspecificaBRL = baseCalculoEspecificaBRL;
    }

    public MemoriaCalculoItemCover baseCalculoEspecificaBRL(BigDecimal baseCalculoEspecificaBRL) {
        this.baseCalculoEspecificaBRL = baseCalculoEspecificaBRL;
        return this;
    }

    /**
     * Valor da base de cálculo reduzida em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return baseCalculoReduzidaBRL
     **/
    @JsonProperty("baseCalculoReduzidaBRL")
    public BigDecimal getBaseCalculoReduzidaBRL() {
        return baseCalculoReduzidaBRL;
    }

    public void setBaseCalculoReduzidaBRL(BigDecimal baseCalculoReduzidaBRL) {
        this.baseCalculoReduzidaBRL = baseCalculoReduzidaBRL;
    }

    public MemoriaCalculoItemCover baseCalculoReduzidaBRL(BigDecimal baseCalculoReduzidaBRL) {
        this.baseCalculoReduzidaBRL = baseCalculoReduzidaBRL;
        return this;
    }

    /**
     * Percentual de redução da base de cálculo.&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return percentualReducaoBaseCalculo
     **/
    @JsonProperty("percentualReducaoBaseCalculo")
    public BigDecimal getPercentualReducaoBaseCalculo() {
        return percentualReducaoBaseCalculo;
    }

    public void setPercentualReducaoBaseCalculo(BigDecimal percentualReducaoBaseCalculo) {
        this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
    }

    public MemoriaCalculoItemCover percentualReducaoBaseCalculo(BigDecimal percentualReducaoBaseCalculo) {
        this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
        return this;
    }

    /**
     * Tipo de alíquota do tributo.&lt;br&gt;Domínio:
     *
     * @return tipoAliquota
     **/
    @JsonProperty("tipoAliquota")
    public String getTipoAliquota() {
        if (tipoAliquota == null) {
            return null;
        }
        return tipoAliquota.value();
    }

    public void setTipoAliquota(TipoAliquotaEnum tipoAliquota) {
        this.tipoAliquota = tipoAliquota;
    }

    public MemoriaCalculoItemCover tipoAliquota(TipoAliquotaEnum tipoAliquota) {
        this.tipoAliquota = tipoAliquota;
        return this;
    }

    /**
     * Percentual de redução da alíquota reduzida (%).&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return percentualReducaoAliquotaReduzida
     **/
    @JsonProperty("percentualReducaoAliquotaReduzida")
    public BigDecimal getPercentualReducaoAliquotaReduzida() {
        return percentualReducaoAliquotaReduzida;
    }

    public void setPercentualReducaoAliquotaReduzida(BigDecimal percentualReducaoAliquotaReduzida) {
        this.percentualReducaoAliquotaReduzida = percentualReducaoAliquotaReduzida;
    }

    public MemoriaCalculoItemCover percentualReducaoAliquotaReduzida(BigDecimal percentualReducaoAliquotaReduzida) {
        this.percentualReducaoAliquotaReduzida = percentualReducaoAliquotaReduzida;
        return this;
    }

    /**
     * Valor da alíquota (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public MemoriaCalculoItemCover valorAliquota(BigDecimal valorAliquota) {
        this.valorAliquota = valorAliquota;
        return this;
    }

    /**
     * Valor da alíquota específica (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public MemoriaCalculoItemCover valorAliquotaEspecifica(BigDecimal valorAliquotaEspecifica) {
        this.valorAliquotaEspecifica = valorAliquotaEspecifica;
        return this;
    }

    /**
     * Valor da alíquota reduzida (%).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public MemoriaCalculoItemCover valorAliquotaReduzida(BigDecimal valorAliquotaReduzida) {
        this.valorAliquotaReduzida = valorAliquotaReduzida;
        return this;
    }

    /**
     * Valor normal em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return normal
     **/
    @JsonProperty("normal")
    public BigDecimal getNormal() {
        return normal;
    }

    public void setNormal(BigDecimal normal) {
        this.normal = normal;
    }

    public MemoriaCalculoItemCover normal(BigDecimal normal) {
        this.normal = normal;
        return this;
    }

    /**
     * Indicador de tributação.
     *
     * @return tributado
     **/
    @JsonProperty("tributado")
    public Boolean isTributado() {
        return tributado;
    }

    public void setTributado(Boolean tributado) {
        this.tributado = tributado;
    }

    public MemoriaCalculoItemCover tributado(Boolean tributado) {
        this.tributado = tributado;
        return this;
    }

    /**
     * Percentual de pagamento, preenchido no caso de item com fundamento legal correspondente à admissão temporária com pagamento proporcional (ATUE). Para as demais Duimp será retornado nulo.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return percentualPagamento
     **/
    @JsonProperty("percentualPagamento")
    public BigDecimal getPercentualPagamento() {
        return percentualPagamento;
    }

    public void setPercentualPagamento(BigDecimal percentualPagamento) {
        this.percentualPagamento = percentualPagamento;
    }

    public MemoriaCalculoItemCover percentualPagamento(BigDecimal percentualPagamento) {
        this.percentualPagamento = percentualPagamento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class MemoriaCalculoItemCover {\n" +
                "    codigoFundamentoLegalNormal: " + toIndentedString(codigoFundamentoLegalNormal) + "\n" +
                "    baseCalculoBRL: " + toIndentedString(baseCalculoBRL) + "\n" +
                "    baseCalculoEspecificaBRL: " + toIndentedString(baseCalculoEspecificaBRL) + "\n" +
                "    baseCalculoReduzidaBRL: " + toIndentedString(baseCalculoReduzidaBRL) + "\n" +
                "    percentualReducaoBaseCalculo: " + toIndentedString(percentualReducaoBaseCalculo) + "\n" +
                "    tipoAliquota: " + toIndentedString(tipoAliquota) + "\n" +
                "    percentualReducaoAliquotaReduzida: " + toIndentedString(percentualReducaoAliquotaReduzida) + "\n" +
                "    valorAliquota: " + toIndentedString(valorAliquota) + "\n" +
                "    valorAliquotaEspecifica: " + toIndentedString(valorAliquotaEspecifica) + "\n" +
                "    valorAliquotaReduzida: " + toIndentedString(valorAliquotaReduzida) + "\n" +
                "    normal: " + toIndentedString(normal) + "\n" +
                "    tributado: " + toIndentedString(tributado) + "\n" +
                "    percentualPagamento: " + toIndentedString(percentualPagamento) + "\n" +
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

