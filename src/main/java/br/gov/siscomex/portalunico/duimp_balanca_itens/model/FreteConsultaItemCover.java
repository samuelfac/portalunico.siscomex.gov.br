package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreteConsultaItemCover", propOrder =
        {"valorBRL"
        })

@XmlRootElement(name = "FreteConsultaItemCover")
/**
 * Valor do frete.
 **/
@ApiModel(description = "Valor do frete.")
public class FreteConsultaItemCover {

    @XmlElement(name = "valorBRL")
    @ApiModelProperty(example = "12.4", value = "Valor do frete total em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    /**
     * Valor do frete total em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private String valorBRL = null;

    /**
     * Valor do frete total em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valorBRL
     **/
    @JsonProperty("valorBRL")
    public String getValorBRL() {
        return valorBRL;
    }

    public void setValorBRL(String valorBRL) {
        this.valorBRL = valorBRL;
    }

    public FreteConsultaItemCover valorBRL(String valorBRL) {
        this.valorBRL = valorBRL;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class FreteConsultaItemCover {\n" +
                "    valorBRL: " + toIndentedString(valorBRL) + "\n" +
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

