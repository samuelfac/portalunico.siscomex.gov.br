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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoVendaConsultaItemCover", propOrder =
        {"metodoValoracao", "incoterm", "valorBRL", "valorMoedaNegociada", "frete", "seguro", "acrescimosDeducoes"
        })

@XmlRootElement(name = "CondicaoVendaConsultaItemCover")
/**
 * <br>Condição de venda da mercadoria.<br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)
 **/
@ApiModel(description = "<br>Condição de venda da mercadoria.<br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)")
public class CondicaoVendaConsultaItemCover {

    @XmlElement(name = "metodoValoracao")
    @ApiModelProperty(value = "")
    @Valid
    private MetodoValoracaoCover metodoValoracao = null;

    @XmlElement(name = "incoterm")
    @ApiModelProperty(value = "")
    @Valid
    private IncotermCover incoterm = null;

    @XmlElement(name = "valorBRL")
    @ApiModelProperty(example = "1.0", value = "Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorBRL = null;

    @XmlElement(name = "valorMoedaNegociada")
    @ApiModelProperty(example = "1.0", value = "Valor na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valorMoedaNegociada = null;

    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private FreteConsultaItemCover frete = null;

    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private SeguroConsultaItemCover seguro = null;

    @XmlElement(name = "acrescimosDeducoes")
    @ApiModelProperty(value = "")
    @Valid
    private List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes = null;

    /**
     * Get metodoValoracao
     *
     * @return metodoValoracao
     **/
    @JsonProperty("metodoValoracao")
    public MetodoValoracaoCover getMetodoValoracao() {
        return metodoValoracao;
    }

    public void setMetodoValoracao(MetodoValoracaoCover metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
    }

    public CondicaoVendaConsultaItemCover metodoValoracao(MetodoValoracaoCover metodoValoracao) {
        this.metodoValoracao = metodoValoracao;
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
     * Get incoterm
     *
     * @return incoterm
     **/
    @JsonProperty("incoterm")
    public IncotermCover getIncoterm() {
        return incoterm;
    }

    public void setIncoterm(IncotermCover incoterm) {
        this.incoterm = incoterm;
    }

    /**
     * Valor na moeda negociada convertido em R$ (Reais).&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorBRL
     **/
    @JsonProperty("valorBRL")
    public BigDecimal getValorBRL() {
        return valorBRL;
    }

    public void setValorBRL(BigDecimal valorBRL) {
        this.valorBRL = valorBRL;
    }

    public CondicaoVendaConsultaItemCover valorBRL(BigDecimal valorBRL) {
        this.valorBRL = valorBRL;
        return this;
    }

    /**
     * Valor na moeda negociada.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorMoedaNegociada
     **/
    @JsonProperty("valorMoedaNegociada")
    public BigDecimal getValorMoedaNegociada() {
        return valorMoedaNegociada;
    }

    public void setValorMoedaNegociada(BigDecimal valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
    }

    public CondicaoVendaConsultaItemCover valorMoedaNegociada(BigDecimal valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
        return this;
    }

    public CondicaoVendaConsultaItemCover incoterm(IncotermCover incoterm) {
        this.incoterm = incoterm;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public FreteConsultaItemCover getFrete() {
        return frete;
    }

    public void setFrete(FreteConsultaItemCover frete) {
        this.frete = frete;
    }

    public CondicaoVendaConsultaItemCover frete(FreteConsultaItemCover frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public SeguroConsultaItemCover getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroConsultaItemCover seguro) {
        this.seguro = seguro;
    }

    /**
     * Get acrescimosDeducoes
     *
     * @return acrescimosDeducoes
     **/
    @JsonProperty("acrescimosDeducoes")
    public List<AcrescimoDeducaoConsultaItemCover> getAcrescimosDeducoes() {
        return acrescimosDeducoes;
    }

    public void setAcrescimosDeducoes(List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
    }

    public CondicaoVendaConsultaItemCover acrescimosDeducoes(List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes) {
        this.acrescimosDeducoes = acrescimosDeducoes;
        return this;
    }

    public CondicaoVendaConsultaItemCover addAcrescimosDeducoesItem(AcrescimoDeducaoConsultaItemCover acrescimosDeducoesItem) {
        this.acrescimosDeducoes.add(acrescimosDeducoesItem);
        return this;
    }

    public CondicaoVendaConsultaItemCover seguro(SeguroConsultaItemCover seguro) {
        this.seguro = seguro;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CondicaoVendaConsultaItemCover {\n" +
                "    metodoValoracao: " + toIndentedString(metodoValoracao) + "\n" +
                "    incoterm: " + toIndentedString(incoterm) + "\n" +
                "    valorBRL: " + toIndentedString(valorBRL) + "\n" +
                "    valorMoedaNegociada: " + toIndentedString(valorMoedaNegociada) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "    acrescimosDeducoes: " + toIndentedString(acrescimosDeducoes) + "\n" +
                "}";
        return sb;
    }
}
