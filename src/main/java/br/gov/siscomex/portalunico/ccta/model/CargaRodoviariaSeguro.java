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
@XmlType(name = "CargaRodoviariaSeguro", propOrder =
        {"valorDestinatario", "valorRemetente"
        })

@XmlRootElement(name = "CargaRodoviariaSeguro")
public class CargaRodoviariaSeguro {

    @XmlElement(name = "valorDestinatario")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorDestinatario = null;

    @XmlElement(name = "valorRemetente")
    @ApiModelProperty(value = "")
    @Valid
    private ValorMonetario valorRemetente = null;

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

    public CargaRodoviariaSeguro valorDestinatario(ValorMonetario valorDestinatario) {
        this.valorDestinatario = valorDestinatario;
        return this;
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

    public CargaRodoviariaSeguro valorRemetente(ValorMonetario valorRemetente) {
        this.valorRemetente = valorRemetente;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaSeguro {\n" +
                "    valorDestinatario: " + toIndentedString(valorDestinatario) + "\n" +
                "    valorRemetente: " + toIndentedString(valorRemetente) + "\n" +
                "}";
        return sb;
    }
}
