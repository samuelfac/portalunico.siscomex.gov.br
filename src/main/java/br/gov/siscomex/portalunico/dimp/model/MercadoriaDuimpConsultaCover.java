package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercadoriaDuimpConsultaCover", propOrder =
        {"valorTotalLocalEmbarqueUSD", "valorTotalLocalEmbarqueBRL"
        })

@XmlRootElement(name = "MercadoriaDuimpConsultaCover")
public class MercadoriaDuimpConsultaCover {

    @XmlElement(name = "valorTotalLocalEmbarqueUSD")
    @ApiModelProperty(example = "20.366", value = "Valor total da mercadoria no local de embarque em US$ (Dólares). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor total da mercadoria no local de embarque em US$ (Dólares). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorTotalLocalEmbarqueUSD = null;

    @XmlElement(name = "valorTotalLocalEmbarqueBRL")
    @ApiModelProperty(example = "20.366", value = "Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorTotalLocalEmbarqueBRL = null;

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
     * Valor total da mercadoria no local de embarque em US$ (Dólares). &lt;br&gt; Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorTotalLocalEmbarqueUSD
     **/
    @JsonProperty("valorTotalLocalEmbarqueUSD")
    public BigDecimal getValorTotalLocalEmbarqueUSD() {
        return valorTotalLocalEmbarqueUSD;
    }

    public void setValorTotalLocalEmbarqueUSD(BigDecimal valorTotalLocalEmbarqueUSD) {
        this.valorTotalLocalEmbarqueUSD = valorTotalLocalEmbarqueUSD;
    }

    public MercadoriaDuimpConsultaCover valorTotalLocalEmbarqueUSD(BigDecimal valorTotalLocalEmbarqueUSD) {
        this.valorTotalLocalEmbarqueUSD = valorTotalLocalEmbarqueUSD;
        return this;
    }

    /**
     * Valor total da mercadoria no local de embarque em R$ (Reais). &lt;br&gt; Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorTotalLocalEmbarqueBRL
     **/
    @JsonProperty("valorTotalLocalEmbarqueBRL")
    public BigDecimal getValorTotalLocalEmbarqueBRL() {
        return valorTotalLocalEmbarqueBRL;
    }

    public void setValorTotalLocalEmbarqueBRL(BigDecimal valorTotalLocalEmbarqueBRL) {
        this.valorTotalLocalEmbarqueBRL = valorTotalLocalEmbarqueBRL;
    }

    public MercadoriaDuimpConsultaCover valorTotalLocalEmbarqueBRL(BigDecimal valorTotalLocalEmbarqueBRL) {
        this.valorTotalLocalEmbarqueBRL = valorTotalLocalEmbarqueBRL;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class MercadoriaDuimpConsultaCover {\n" +
                "    valorTotalLocalEmbarqueUSD: " + toIndentedString(valorTotalLocalEmbarqueUSD) + "\n" +
                "    valorTotalLocalEmbarqueBRL: " + toIndentedString(valorTotalLocalEmbarqueBRL) + "\n" +
                "}";
        return sb;
    }
}
