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
@XmlType(name = "Documento", propOrder =
        {"tipo", "numero"
        })

@XmlRootElement(name = "Documento")
public class Documento {

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumento tipo = null;

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

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
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public Documento tipo(TipoDocumento tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get numero
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Documento numero(String numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Documento {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "}";
        return sb;
    }
}
