package br.gov.siscomex.portalunico.duimp_balanca_principal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalancaDuimpTotaisCover", propOrder =
        {"quantidadeTotalDuimp", "quantidadeTotaltensDuimp"
        })

@XmlRootElement(name = "BalancaDuimpTotaisCover")
public class BalancaDuimpTotaisCover {

    @XmlElement(name = "quantidadeTotalDuimp")
    @ApiModelProperty(value = "Quantidade de Duimps selecionadas no período pesquisado.<br>Valor mínimo: 1<br>Valor máximo: 9999999999")
    /**
     * Quantidade de Duimps selecionadas no período pesquisado.<br>Valor mínimo: 1<br>Valor máximo: 9999999999
     **/
    private Long quantidadeTotalDuimp = null;

    @XmlElement(name = "quantidadeTotaltensDuimp")
    @ApiModelProperty(value = "Soma da quantidade de itens das Duimps selecionadas no período pesquisado.<br>Valor mínimo: 1<br>Valor máximo: 9999999999")
    /**
     * Soma da quantidade de itens das Duimps selecionadas no período pesquisado.<br>Valor mínimo: 1<br>Valor máximo: 9999999999
     **/
    private Long quantidadeTotaltensDuimp = null;

    /**
     * Quantidade de Duimps selecionadas no período pesquisado.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999999999
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

    public BalancaDuimpTotaisCover quantidadeTotalDuimp(Long quantidadeTotalDuimp) {
        this.quantidadeTotalDuimp = quantidadeTotalDuimp;
        return this;
    }

    /**
     * Soma da quantidade de itens das Duimps selecionadas no período pesquisado.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999999999
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

    public BalancaDuimpTotaisCover quantidadeTotaltensDuimp(Long quantidadeTotaltensDuimp) {
        this.quantidadeTotaltensDuimp = quantidadeTotaltensDuimp;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class BalancaDuimpTotaisCover {\n" +
                "    quantidadeTotalDuimp: " + toIndentedString(quantidadeTotalDuimp) + "\n" +
                "    quantidadeTotaltensDuimp: " + toIndentedString(quantidadeTotaltensDuimp) + "\n" +
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

