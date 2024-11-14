package br.gov.siscomex.portalunico.cct_ext.model;

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
@XmlType(name = "VeiculoFerroviario", propOrder =
        {"prefixoTrem", "quantidadeVagoes"
        })

@XmlRootElement(name = "VeiculoFerroviario")
/**
 * Informações sobre o veículo Ferroviário
 **/
@ApiModel(description = "Informações sobre o veículo Ferroviário")
public class VeiculoFerroviario {

    @XmlElement(name = "prefixoTrem", required = true)
    @ApiModelProperty(example = "TR123", required = true, value = "Prefixo do Trem")
    /**
     * Prefixo do Trem
     **/
    private String prefixoTrem = null;

    @XmlElement(name = "quantidadeVagoes", required = true)
    @ApiModelProperty(example = "10", required = true, value = "Quantidade de Vagões")
    /**
     * Quantidade de Vagões
     **/
    private Integer quantidadeVagoes = null;

    /**
     * Prefixo do Trem
     *
     * @return prefixoTrem
     **/
    @JsonProperty("prefixoTrem")
    @NotNull
    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public void setPrefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
    }

    public VeiculoFerroviario prefixoTrem(String prefixoTrem) {
        this.prefixoTrem = prefixoTrem;
        return this;
    }

    /**
     * Quantidade de Vagões
     *
     * @return quantidadeVagoes
     **/
    @JsonProperty("quantidadeVagoes")
    @NotNull
    public Integer getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public VeiculoFerroviario quantidadeVagoes(Integer quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class VeiculoFerroviario {\n" +
                "    prefixoTrem: " + toIndentedString(prefixoTrem) + "\n" +
                "    quantidadeVagoes: " + toIndentedString(quantidadeVagoes) + "\n" +
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

