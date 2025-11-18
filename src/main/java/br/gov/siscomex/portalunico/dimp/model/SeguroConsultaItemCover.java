package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeguroConsultaItemCover", propOrder =
        {"valorBRL"
        })

@XmlRootElement(name = "SeguroConsultaItemCover")
/**
 * Valor do seguro.
 **/
@ApiModel(description = "Valor do seguro.")
public class SeguroConsultaItemCover {

    @XmlElement(name = "valorBRL")
    @ApiModelProperty(example = "12.4", value = "Valor do seguro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    /**
     * Valor do seguro em R$ (Reais).<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private String valorBRL = null;

    /**
     * Valor do seguro em R$ (Reais).&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public SeguroConsultaItemCover valorBRL(String valorBRL) {
        this.valorBRL = valorBRL;
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

        String sb = "class SeguroConsultaItemCover {\n" +
                "    valorBRL: " + toIndentedString(valorBRL) + "\n" +
                "}";
        return sb;
    }
}
