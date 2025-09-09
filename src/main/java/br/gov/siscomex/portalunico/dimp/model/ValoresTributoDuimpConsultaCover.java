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
@XmlType(name = "ValoresTributoDuimpConsultaCover", propOrder =
        {"suspenso", "devido", "aRecolher", "aReduzir", "recolhido", "calculado"
        })

@XmlRootElement(name = "ValoresTributoDuimpConsultaCover")
/**
 * Valores do cálculo do tributo.
 **/
@ApiModel(description = "Valores do cálculo do tributo.")
public class ValoresTributoDuimpConsultaCover {

    @XmlElement(name = "suspenso")
    @ApiModelProperty(example = "16.7", value = "Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor Suspenso do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal suspenso = null;

    @XmlElement(name = "devido")
    @ApiModelProperty(example = "201.12", value = "Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \"a recolher\" dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \"a recolher\" dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal devido = null;

    @XmlElement(name = "aRecolher")
    @ApiModelProperty(example = "16.7", value = "Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a Recolher do Imposto de Importação em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal aRecolher = null;

    @XmlElement(name = "aReduzir")
    @ApiModelProperty(example = "135.7", value = "Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a Reduzir do Tributo em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal aReduzir = null;

    @XmlElement(name = "recolhido")
    @ApiModelProperty(example = "16.7", value = "Valores Recolhidos (pagos) do Tributo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valores Recolhidos (pagos) do Tributo.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal recolhido = null;

    @XmlElement(name = "calculado")
    @ApiModelProperty(example = "1598.73", value = "Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \"originalmente devidos\" dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \"originalmente devidos\" dos itens.<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal calculado = null;

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

    public ValoresTributoDuimpConsultaCover suspenso(BigDecimal suspenso) {
        this.suspenso = suspenso;
        return this;
    }

    /**
     * Valor do tributo devido em R$ (Reais). Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \&quot;a recolher\&quot; dos itens.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public ValoresTributoDuimpConsultaCover devido(BigDecimal devido) {
        this.devido = devido;
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

    public ValoresTributoDuimpConsultaCover aRecolher(BigDecimal aRecolher) {
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

    public ValoresTributoDuimpConsultaCover aReduzir(BigDecimal aReduzir) {
        this.aReduzir = aReduzir;
        return this;
    }

    /**
     * Valores Recolhidos (pagos) do Tributo.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return recolhido
     **/
    @JsonProperty("recolhido")
    public BigDecimal getRecolhido() {
        return recolhido;
    }

    public void setRecolhido(BigDecimal recolhido) {
        this.recolhido = recolhido;
    }

    public ValoresTributoDuimpConsultaCover recolhido(BigDecimal recolhido) {
        this.recolhido = recolhido;
        return this;
    }

    /**
     * Valor do tributo calculado em R$ (Reais).Para Duimp COM situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, este valor corresponde ao somatório dos valores \&quot;originalmente devidos\&quot; dos itens.&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public ValoresTributoDuimpConsultaCover calculado(BigDecimal calculado) {
        this.calculado = calculado;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ValoresTributoDuimpConsultaCover {\n" +
                "    suspenso: " + toIndentedString(suspenso) + "\n" +
                "    devido: " + toIndentedString(devido) + "\n" +
                "    aRecolher: " + toIndentedString(aRecolher) + "\n" +
                "    aReduzir: " + toIndentedString(aReduzir) + "\n" +
                "    recolhido: " + toIndentedString(recolhido) + "\n" +
                "    calculado: " + toIndentedString(calculado) + "\n" +
                "}";
        return sb;
    }
}
