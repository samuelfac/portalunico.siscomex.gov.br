package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValoresTributoItemCover", propOrder =
        {"suspenso", "devido", "calculadoPagProporcional", "aRecolher", "aReduzir", "calculado", "originalDevido"
        })

@XmlRootElement(name = "ValoresTributoItemCover")
/**
 * Valores do cálculo do tributo.
 **/
@ApiModel(description = "Valores do cálculo do tributo.")
public class ValoresTributoItemCover {

    @XmlElement(name = "suspenso")
    @ApiModelProperty(example = "16.7", value = "Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal suspenso = null;

    @XmlElement(name = "devido")
    @ApiModelProperty(example = "16.7", value = "Valor Devido do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Devido do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal devido = null;

    @XmlElement(name = "calculadoPagProporcional")
    @ApiModelProperty(example = "16.7", value = "Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal calculadoPagProporcional = null;

    @XmlElement(name = "aRecolher")
    @ApiModelProperty(example = "16.7", value = "Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal aRecolher = null;

    @XmlElement(name = "aReduzir")
    @ApiModelProperty(example = "165.7", value = "Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal aReduzir = null;

    @XmlElement(name = "calculado")
    @ApiModelProperty(example = "1598.73", value = "Valor Calculado do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Calculado do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal calculado = null;

    @XmlElement(name = "originalDevido")
    @ApiModelProperty(example = "16.7", value = "Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal originalDevido = null;

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
     * Valor Suspenso do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return suspenso
     **/
    @JsonProperty("suspenso")
    public BigDecimal getSuspenso() {
        return suspenso;
    }

    public void setSuspenso(BigDecimal suspenso) {
        this.suspenso = suspenso;
    }

    public ValoresTributoItemCover suspenso(BigDecimal suspenso) {
        this.suspenso = suspenso;
        return this;
    }

    /**
     * Valor Devido do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return devido
     **/
    @JsonProperty("devido")
    public BigDecimal getDevido() {
        return devido;
    }

    public void setDevido(BigDecimal devido) {
        this.devido = devido;
    }

    public ValoresTributoItemCover devido(BigDecimal devido) {
        this.devido = devido;
        return this;
    }

    /**
     * Valor do Tributo Calculado do Pagamento Proporcional em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return calculadoPagProporcional
     **/
    @JsonProperty("calculadoPagProporcional")
    public BigDecimal getCalculadoPagProporcional() {
        return calculadoPagProporcional;
    }

    public void setCalculadoPagProporcional(BigDecimal calculadoPagProporcional) {
        this.calculadoPagProporcional = calculadoPagProporcional;
    }

    public ValoresTributoItemCover calculadoPagProporcional(BigDecimal calculadoPagProporcional) {
        this.calculadoPagProporcional = calculadoPagProporcional;
        return this;
    }

    /**
     * Valor a Recolher do Imposto de Importação em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return aRecolher
     **/
    @JsonProperty("aRecolher")
    public BigDecimal getARecolher() {
        return aRecolher;
    }

    public void setARecolher(BigDecimal aRecolher) {
        this.aRecolher = aRecolher;
    }

    public ValoresTributoItemCover aRecolher(BigDecimal aRecolher) {
        this.aRecolher = aRecolher;
        return this;
    }

    /**
     * Valor a Reduzir do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return aReduzir
     **/
    @JsonProperty("aReduzir")
    public BigDecimal getAReduzir() {
        return aReduzir;
    }

    public void setAReduzir(BigDecimal aReduzir) {
        this.aReduzir = aReduzir;
    }

    public ValoresTributoItemCover aReduzir(BigDecimal aReduzir) {
        this.aReduzir = aReduzir;
        return this;
    }

    /**
     * Valor Calculado do Tributo em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return calculado
     **/
    @JsonProperty("calculado")
    public BigDecimal getCalculado() {
        return calculado;
    }

    public void setCalculado(BigDecimal calculado) {
        this.calculado = calculado;
    }

    public ValoresTributoItemCover calculado(BigDecimal calculado) {
        this.calculado = calculado;
        return this;
    }

    /**
     * Valor do Tributo Originalmente Devido em R$ (Reais), para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return originalDevido
     **/
    @JsonProperty("originalDevido")
    public BigDecimal getOriginalDevido() {
        return originalDevido;
    }

    public void setOriginalDevido(BigDecimal originalDevido) {
        this.originalDevido = originalDevido;
    }

    public ValoresTributoItemCover originalDevido(BigDecimal originalDevido) {
        this.originalDevido = originalDevido;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ValoresTributoItemCover {\n" +
                "    suspenso: " + toIndentedString(suspenso) + "\n" +
                "    devido: " + toIndentedString(devido) + "\n" +
                "    calculadoPagProporcional: " + toIndentedString(calculadoPagProporcional) + "\n" +
                "    aRecolher: " + toIndentedString(aRecolher) + "\n" +
                "    aReduzir: " + toIndentedString(aReduzir) + "\n" +
                "    calculado: " + toIndentedString(calculado) + "\n" +
                "    originalDevido: " + toIndentedString(originalDevido) + "\n" +
                "}";
        return sb;
    }
}
