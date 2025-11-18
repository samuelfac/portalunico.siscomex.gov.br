package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeguroCover", propOrder =
        {"codigoMoedaNegociada", "valorMoedaNegociada"
        })

@XmlRootElement(name = "SeguroCover")
/**
 * Dados do seguro.
 **/
@ApiModel(description = "Dados do seguro.")
public class SeguroCover {

    @XmlElement(name = "codigoMoedaNegociada", required = true)
    @ApiModelProperty(example = "USD", required = true, value = "Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
    /**
     * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     **/
    private String codigoMoedaNegociada = null;

    @XmlElement(name = "valorMoedaNegociada", required = true)
    @ApiModelProperty(example = "30.12", required = true, value = "Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    /**
     * Valor do seguro na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private Double valorMoedaNegociada = null;

    /**
     * Código da Moeda utilizada para a negociação da mercadoria e usada na expedição da fatura comercial (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     *
     * @return codigoMoedaNegociada
     **/
    @JsonProperty("codigoMoedaNegociada")
    @NotNull
    public String getCodigoMoedaNegociada() {
        return codigoMoedaNegociada;
    }

    public void setCodigoMoedaNegociada(String codigoMoedaNegociada) {
        this.codigoMoedaNegociada = codigoMoedaNegociada;
    }

    public SeguroCover codigoMoedaNegociada(String codigoMoedaNegociada) {
        this.codigoMoedaNegociada = codigoMoedaNegociada;
        return this;
    }

    /**
     * Valor do seguro na moeda negociada.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     *
     * @return valorMoedaNegociada
     **/
    @JsonProperty("valorMoedaNegociada")
    @NotNull
    public Double getValorMoedaNegociada() {
        return valorMoedaNegociada;
    }

    public void setValorMoedaNegociada(Double valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
    }

    public SeguroCover valorMoedaNegociada(Double valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
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

        String sb = "class SeguroCover {\n" +
                "    codigoMoedaNegociada: " + toIndentedString(codigoMoedaNegociada) + "\n" +
                "    valorMoedaNegociada: " + toIndentedString(valorMoedaNegociada) + "\n" +
                "}";
        return sb;
    }
}
