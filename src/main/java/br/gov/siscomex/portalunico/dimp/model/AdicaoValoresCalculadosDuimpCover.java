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
@XmlType(name = "AdicaoValoresCalculadosDuimpCover", propOrder =
        {"itens", "numero"
        })

@XmlRootElement(name = "AdicaoValoresCalculadosDuimpCover")
/**
 * Dados da adição.
 **/
@ApiModel(description = "Dados da adição.")
public class AdicaoValoresCalculadosDuimpCover {

    @XmlElement(name = "itens")
    @ApiModelProperty(example = "1.0", value = "Número de identificação de cada item que compõe a Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 9999")
    /**
     * Número de identificação de cada item que compõe a Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 9999
     **/
    private Double itens = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "1.0", value = "Número total de adições.<br>Tamanho mínimo: 1<br>Tamanho máximo: 99")
    /**
     * Número total de adições.<br>Tamanho mínimo: 1<br>Tamanho máximo: 99
     **/
    private Double numero = null;

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
     * Número de identificação de cada item que compõe a Duimp.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 9999
     *
     * @return itens
     **/
    @JsonProperty("itens")
    public Double getItens() {
        return itens;
    }

    public void setItens(Double itens) {
        this.itens = itens;
    }

    public AdicaoValoresCalculadosDuimpCover itens(Double itens) {
        this.itens = itens;
        return this;
    }

    /**
     * Número total de adições.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 99
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public AdicaoValoresCalculadosDuimpCover numero(Double numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class AdicaoValoresCalculadosDuimpCover {\n" +
                "    itens: " + toIndentedString(itens) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "}";
        return sb;
    }
}
