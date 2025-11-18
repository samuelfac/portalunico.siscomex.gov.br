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
@XmlType(name = "SefazTributoCalculadoCover", propOrder =
        {"imposto", "valorCalculado", "valorAReduzir", "valorSuspenso", "valorDevido", "impostoARecolher"
        })

@XmlRootElement(name = "SefazTributoCalculadoCover")
/**
 * Dados de um tributo
 **/
@ApiModel(description = "Dados de um tributo")
public class SefazTributoCalculadoCover {

    @XmlElement(name = "imposto")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio imposto = null;

    @XmlElement(name = "valorCalculado")
    @ApiModelProperty(example = "1000.0", value = "Valor calculado do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor calculado do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorCalculado = null;

    @XmlElement(name = "valorAReduzir")
    @ApiModelProperty(example = "0.0", value = "Valor a reduzir do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor a reduzir do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAReduzir = null;

    @XmlElement(name = "valorSuspenso")
    @ApiModelProperty(example = "0.0", value = "Valor suspenso do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor suspenso do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorSuspenso = null;

    @XmlElement(name = "valorDevido")
    @ApiModelProperty(example = "1000.0", value = "Valor devido do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor devido do tributo<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorDevido = null;

    @XmlElement(name = "impostoARecolher")
    @ApiModelProperty(example = "200.0", value = "Valor do tributo a recolher<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor do tributo a recolher<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal impostoARecolher = null;

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

    public SefazTributoCalculadoCover imposto(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio imposto) {
        this.imposto = imposto;
        return this;
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

    /**
     * Valor calculado do tributo&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    public SefazTributoCalculadoCover valorCalculado(BigDecimal valorCalculado) {
        this.valorCalculado = valorCalculado;
        return this;
    }

    /**
     * Valor a reduzir do tributo&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    /**
     * Valor suspenso do tributo&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    public SefazTributoCalculadoCover valorSuspenso(BigDecimal valorSuspenso) {
        this.valorSuspenso = valorSuspenso;
        return this;
    }

    public SefazTributoCalculadoCover valorAReduzir(BigDecimal valorAReduzir) {
        this.valorAReduzir = valorAReduzir;
        return this;
    }

    /**
     * Valor devido do tributo&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    /**
     * Valor do tributo a recolher&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    public SefazTributoCalculadoCover impostoARecolher(BigDecimal impostoARecolher) {
        this.impostoARecolher = impostoARecolher;
        return this;
    }

    public SefazTributoCalculadoCover valorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazTributoCalculadoCover {\n" +
                "    imposto: " + toIndentedString(imposto) + "\n" +
                "    valorCalculado: " + toIndentedString(valorCalculado) + "\n" +
                "    valorAReduzir: " + toIndentedString(valorAReduzir) + "\n" +
                "    valorSuspenso: " + toIndentedString(valorSuspenso) + "\n" +
                "    valorDevido: " + toIndentedString(valorDevido) + "\n" +
                "    impostoARecolher: " + toIndentedString(impostoARecolher) + "\n" +
                "}";
        return sb;
    }
}
