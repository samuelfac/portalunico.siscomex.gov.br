package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiffValorDTO", propOrder =
        {"valorAtual", "valorAnterior"
        })

@XmlRootElement(name = "DiffValorDTO")
public class DiffValorDTO {

    @XmlElement(name = "valorAtual")
    @ApiModelProperty(value = "Valor da propriedade na versão atual")
    /**
     * Valor da propriedade na versão atual
     **/
    private String valorAtual = null;

    @XmlElement(name = "valorAnterior")
    @ApiModelProperty(value = "Valor da propriedade na versão anterior")
    /**
     * Valor da propriedade na versão anterior
     **/
    private String valorAnterior = null;

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
     * Valor da propriedade na versão atual
     *
     * @return valorAtual
     **/
    @JsonProperty("valorAtual")
    public String getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(String valorAtual) {
        this.valorAtual = valorAtual;
    }

    public DiffValorDTO valorAtual(String valorAtual) {
        this.valorAtual = valorAtual;
        return this;
    }

    /**
     * Valor da propriedade na versão anterior
     *
     * @return valorAnterior
     **/
    @JsonProperty("valorAnterior")
    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public DiffValorDTO valorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DiffValorDTO {\n" +
                "    valorAtual: " + toIndentedString(valorAtual) + "\n" +
                "    valorAnterior: " + toIndentedString(valorAnterior) + "\n" +
                "}";
        return sb;
    }
}
