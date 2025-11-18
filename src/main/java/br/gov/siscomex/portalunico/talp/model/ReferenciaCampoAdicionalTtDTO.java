package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenciaCampoAdicionalTtDTO", propOrder =
        {"codigoAtributo", "valor"
        })

@XmlRootElement(name = "ReferenciaCampoAdicionalTtDTO")
public class ReferenciaCampoAdicionalTtDTO {

    @XmlElement(name = "codigoAtributo")
    @ApiModelProperty(value = "")
    private String codigoAtributo = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(value = "")
    private String valor = null;

    /**
     * Get codigoAtributo
     *
     * @return codigoAtributo
     **/
    @JsonProperty("codigoAtributo")
    public String getCodigoAtributo() {
        return codigoAtributo;
    }

    public void setCodigoAtributo(String codigoAtributo) {
        this.codigoAtributo = codigoAtributo;
    }

    public ReferenciaCampoAdicionalTtDTO codigoAtributo(String codigoAtributo) {
        this.codigoAtributo = codigoAtributo;
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
     * Get valor
     *
     * @return valor
     **/
    @JsonProperty("valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ReferenciaCampoAdicionalTtDTO valor(String valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ReferenciaCampoAdicionalTtDTO {\n" +
                "    codigoAtributo: " + toIndentedString(codigoAtributo) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "}";
        return sb;
    }
}
