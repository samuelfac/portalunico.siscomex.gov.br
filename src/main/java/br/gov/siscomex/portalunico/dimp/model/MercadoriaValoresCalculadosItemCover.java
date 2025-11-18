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
@XmlType(name = "MercadoriaValoresCalculadosItemCover", propOrder =
        {"valorLocalEmbarqueBRL", "valorAduaneiroBRL"
        })

@XmlRootElement(name = "MercadoriaValoresCalculadosItemCover")
/**
 * Valores da Mercadoria.
 **/
@ApiModel(description = "Valores da Mercadoria.")
public class MercadoriaValoresCalculadosItemCover {

    @XmlElement(name = "valorLocalEmbarqueBRL")
    @ApiModelProperty(example = "20.666", value = "Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor total da mercadoria no local de embarque em R$ (Reais). <br> Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorLocalEmbarqueBRL = null;

    @XmlElement(name = "valorAduaneiroBRL")
    @ApiModelProperty(example = "20.666", value = "Valor total aduaneiro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor total aduaneiro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valorAduaneiroBRL = null;

    /**
     * Valor total da mercadoria no local de embarque em R$ (Reais). &lt;br&gt; Para Duimps com situação especial de despacho, cujo motivo (da situação especial de despacho) indique cobrança de tributo suspenso, será retornado o valor nulo (**null**)&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorLocalEmbarqueBRL
     **/
    @JsonProperty("valorLocalEmbarqueBRL")
    public BigDecimal getValorLocalEmbarqueBRL() {
        return valorLocalEmbarqueBRL;
    }

    public void setValorLocalEmbarqueBRL(BigDecimal valorLocalEmbarqueBRL) {
        this.valorLocalEmbarqueBRL = valorLocalEmbarqueBRL;
    }

    public MercadoriaValoresCalculadosItemCover valorLocalEmbarqueBRL(BigDecimal valorLocalEmbarqueBRL) {
        this.valorLocalEmbarqueBRL = valorLocalEmbarqueBRL;
        return this;
    }

    /**
     * Valor total aduaneiro em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorAduaneiroBRL
     **/
    @JsonProperty("valorAduaneiroBRL")
    public BigDecimal getValorAduaneiroBRL() {
        return valorAduaneiroBRL;
    }

    public void setValorAduaneiroBRL(BigDecimal valorAduaneiroBRL) {
        this.valorAduaneiroBRL = valorAduaneiroBRL;
    }

    public MercadoriaValoresCalculadosItemCover valorAduaneiroBRL(BigDecimal valorAduaneiroBRL) {
        this.valorAduaneiroBRL = valorAduaneiroBRL;
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

    @Override
    public String toString() {

        String sb = "class MercadoriaValoresCalculadosItemCover {\n" +
                "    valorLocalEmbarqueBRL: " + toIndentedString(valorLocalEmbarqueBRL) + "\n" +
                "    valorAduaneiroBRL: " + toIndentedString(valorAduaneiroBRL) + "\n" +
                "}";
        return sb;
    }
}
