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
@XmlType(name = "BalancaDuimpSumarioCover", propOrder =
        {"dataDesembaraco", "quantidadeTotalDuimp", "quantidadeTotaltensDuimp", "somatorioValorTotalCondicaoVenda", "somatorioValorTotalLocalEmbarque", "somatorioPesoItensDuimp"
        })

@XmlRootElement(name = "BalancaDuimpSumarioCover")
/**
 * Dados do Sumario das Duimps em uma data específica
 **/
@ApiModel(description = "Dados do Sumario das Duimps em uma data específica")
public class BalancaDuimpSumarioCover {

    @XmlElement(name = "dataDesembaraco")
    @ApiModelProperty(example = "2024-01-31", value = "Data de desembaraço das Duimps selecionadas na data.<br>Formato: 'AAAA-MM-DD'")
    /**
     * Data de desembaraço das Duimps selecionadas na data.<br>Formato: 'AAAA-MM-DD'
     **/
    private String dataDesembaraco = null;

    @XmlElement(name = "quantidadeTotalDuimp")
    @ApiModelProperty(example = "1000", value = "Quantidade de duimps desembaraçadas na data.<br>Valor mínimo: 1<br>Valor máximo: 9999999999")
    /**
     * Quantidade de duimps desembaraçadas na data.<br>Valor mínimo: 1<br>Valor máximo: 9999999999
     **/
    private Long quantidadeTotalDuimp = null;

    @XmlElement(name = "quantidadeTotaltensDuimp")
    @ApiModelProperty(example = "20000", value = "Soma da quantidade de itens das Duimps selecionadas desembaraçadas na data.<br>Valor mínimo: 1<br>Valor máximo: 9999999999")
    /**
     * Soma da quantidade de itens das Duimps selecionadas desembaraçadas na data.<br>Valor mínimo: 1<br>Valor máximo: 9999999999
     **/
    private Long quantidadeTotaltensDuimp = null;

    @XmlElement(name = "somatorioValorTotalCondicaoVenda")
    @ApiModelProperty(example = "1.1234567", value = "Soma do valor na condição de venda dos Itens das Duimps selecionadas na data. <br>Atributo de origem no item: item.condicaoVenda.valorMoedaNegociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Soma do valor na condição de venda dos Itens das Duimps selecionadas na data. <br>Atributo de origem no item: item.condicaoVenda.valorMoedaNegociada<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal somatorioValorTotalCondicaoVenda = null;

    @XmlElement(name = "somatorioValorTotalLocalEmbarque")
    @ApiModelProperty(example = "1.1234567", value = "Soma do valor da mercadoria no local de embarque das Duimp selecionadas na data.<br>Atributo de origem no item: item.tributos.mercadoria.valorLocalEmbarqueBRL<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Soma do valor da mercadoria no local de embarque das Duimp selecionadas na data.<br>Atributo de origem no item: item.tributos.mercadoria.valorLocalEmbarqueBRL<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal somatorioValorTotalLocalEmbarque = null;

    @XmlElement(name = "somatorioPesoItensDuimp")
    @ApiModelProperty(example = "1.12345", value = "Soma do peso líquido dos itens das Duimps selecionadas da data<br>Atributo de origem no item: item.mercadoria.pesoLiquido<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.")
    @Valid
    /**
     * Soma do peso líquido dos itens das Duimps selecionadas da data<br>Atributo de origem no item: item.mercadoria.pesoLiquido<br>Tamanho: 16,5<br>Formato: Decimal, com até 5 casas decimais separadas por ponto.
     **/
    private BigDecimal somatorioPesoItensDuimp = null;

    /**
     * Data de desembaraço das Duimps selecionadas na data.&lt;br&gt;Formato: &#39;AAAA-MM-DD&#39;
     *
     * @return dataDesembaraco
     **/
    @JsonProperty("dataDesembaraco")
    public String getDataDesembaraco() {
        return dataDesembaraco;
    }

    public void setDataDesembaraco(String dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
    }

    public BalancaDuimpSumarioCover dataDesembaraco(String dataDesembaraco) {
        this.dataDesembaraco = dataDesembaraco;
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
     * Quantidade de duimps desembaraçadas na data.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999999999
     *
     * @return quantidadeTotalDuimp
     **/
    @JsonProperty("quantidadeTotalDuimp")
    public Long getQuantidadeTotalDuimp() {
        return quantidadeTotalDuimp;
    }

    public void setQuantidadeTotalDuimp(Long quantidadeTotalDuimp) {
        this.quantidadeTotalDuimp = quantidadeTotalDuimp;
    }

    public BalancaDuimpSumarioCover quantidadeTotalDuimp(Long quantidadeTotalDuimp) {
        this.quantidadeTotalDuimp = quantidadeTotalDuimp;
        return this;
    }

    /**
     * Soma da quantidade de itens das Duimps selecionadas desembaraçadas na data.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999999999
     *
     * @return quantidadeTotaltensDuimp
     **/
    @JsonProperty("quantidadeTotaltensDuimp")
    public Long getQuantidadeTotaltensDuimp() {
        return quantidadeTotaltensDuimp;
    }

    public void setQuantidadeTotaltensDuimp(Long quantidadeTotaltensDuimp) {
        this.quantidadeTotaltensDuimp = quantidadeTotaltensDuimp;
    }

    /**
     * Soma do valor na condição de venda dos Itens das Duimps selecionadas na data. &lt;br&gt;Atributo de origem no item: item.condicaoVenda.valorMoedaNegociada&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return somatorioValorTotalCondicaoVenda
     **/
    @JsonProperty("somatorioValorTotalCondicaoVenda")
    public BigDecimal getSomatorioValorTotalCondicaoVenda() {
        return somatorioValorTotalCondicaoVenda;
    }

    public void setSomatorioValorTotalCondicaoVenda(BigDecimal somatorioValorTotalCondicaoVenda) {
        this.somatorioValorTotalCondicaoVenda = somatorioValorTotalCondicaoVenda;
    }

    public BalancaDuimpSumarioCover somatorioValorTotalCondicaoVenda(BigDecimal somatorioValorTotalCondicaoVenda) {
        this.somatorioValorTotalCondicaoVenda = somatorioValorTotalCondicaoVenda;
        return this;
    }

    /**
     * Soma do valor da mercadoria no local de embarque das Duimp selecionadas na data.&lt;br&gt;Atributo de origem no item: item.tributos.mercadoria.valorLocalEmbarqueBRL&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return somatorioValorTotalLocalEmbarque
     **/
    @JsonProperty("somatorioValorTotalLocalEmbarque")
    public BigDecimal getSomatorioValorTotalLocalEmbarque() {
        return somatorioValorTotalLocalEmbarque;
    }

    public void setSomatorioValorTotalLocalEmbarque(BigDecimal somatorioValorTotalLocalEmbarque) {
        this.somatorioValorTotalLocalEmbarque = somatorioValorTotalLocalEmbarque;
    }

    public BalancaDuimpSumarioCover somatorioValorTotalLocalEmbarque(BigDecimal somatorioValorTotalLocalEmbarque) {
        this.somatorioValorTotalLocalEmbarque = somatorioValorTotalLocalEmbarque;
        return this;
    }

    public BalancaDuimpSumarioCover quantidadeTotaltensDuimp(Long quantidadeTotaltensDuimp) {
        this.quantidadeTotaltensDuimp = quantidadeTotaltensDuimp;
        return this;
    }

    /**
     * Soma do peso líquido dos itens das Duimps selecionadas da data&lt;br&gt;Atributo de origem no item: item.mercadoria.pesoLiquido&lt;br&gt;Tamanho: 16,5&lt;br&gt;Formato: Decimal, com até 5 casas decimais separadas por ponto.
     *
     * @return somatorioPesoItensDuimp
     **/
    @JsonProperty("somatorioPesoItensDuimp")
    public BigDecimal getSomatorioPesoItensDuimp() {
        return somatorioPesoItensDuimp;
    }

    public void setSomatorioPesoItensDuimp(BigDecimal somatorioPesoItensDuimp) {
        this.somatorioPesoItensDuimp = somatorioPesoItensDuimp;
    }

    public BalancaDuimpSumarioCover somatorioPesoItensDuimp(BigDecimal somatorioPesoItensDuimp) {
        this.somatorioPesoItensDuimp = somatorioPesoItensDuimp;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class BalancaDuimpSumarioCover {\n" +
                "    dataDesembaraco: " + toIndentedString(dataDesembaraco) + "\n" +
                "    quantidadeTotalDuimp: " + toIndentedString(quantidadeTotalDuimp) + "\n" +
                "    quantidadeTotaltensDuimp: " + toIndentedString(quantidadeTotaltensDuimp) + "\n" +
                "    somatorioValorTotalCondicaoVenda: " + toIndentedString(somatorioValorTotalCondicaoVenda) + "\n" +
                "    somatorioValorTotalLocalEmbarque: " + toIndentedString(somatorioValorTotalLocalEmbarque) + "\n" +
                "    somatorioPesoItensDuimp: " + toIndentedString(somatorioPesoItensDuimp) + "\n" +
                "}";
        return sb;
    }
}
