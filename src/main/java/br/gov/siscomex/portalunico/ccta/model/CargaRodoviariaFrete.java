package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaFrete", propOrder =
        {"valorDestinatario", "valorExterno", "valorRemetente"
        })

@XmlRootElement(name = "CargaRodoviariaFrete")
public class CargaRodoviariaFrete {

    @XmlElement(name = "valorDestinatario")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorDestinatario = null;

    @XmlElement(name = "valorExterno")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorExterno = null;

    @XmlElement(name = "valorRemetente")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorRemetente = null;

    /**
     * Get valorDestinatario
     *
     * @return valorDestinatario
     **/
    @JsonProperty("valorDestinatario")
    public ValorMonetario getValorDestinatario() {
        return valorDestinatario;
    }

    public void setValorDestinatario(ValorMonetario valorDestinatario) {
        this.valorDestinatario = valorDestinatario;
    }

    public CargaRodoviariaFrete valorDestinatario(ValorMonetario valorDestinatario) {
        this.valorDestinatario = valorDestinatario;
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
     * Get valorExterno
     *
     * @return valorExterno
     **/
    @JsonProperty("valorExterno")
    public ValorMonetario getValorExterno() {
        return valorExterno;
    }

    public void setValorExterno(ValorMonetario valorExterno) {
        this.valorExterno = valorExterno;
    }

    /**
     * Get valorRemetente
     *
     * @return valorRemetente
     **/
    @JsonProperty("valorRemetente")
    public ValorMonetario getValorRemetente() {
        return valorRemetente;
    }

    public void setValorRemetente(ValorMonetario valorRemetente) {
        this.valorRemetente = valorRemetente;
    }

    public CargaRodoviariaFrete valorRemetente(ValorMonetario valorRemetente) {
        this.valorRemetente = valorRemetente;
        return this;
    }

    public CargaRodoviariaFrete valorExterno(ValorMonetario valorExterno) {
        this.valorExterno = valorExterno;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaFrete {\n" +
                "    valorDestinatario: " + toIndentedString(valorDestinatario) + "\n" +
                "    valorExterno: " + toIndentedString(valorExterno) + "\n" +
                "    valorRemetente: " + toIndentedString(valorRemetente) + "\n" +
                "}";
        return sb;
    }
}
