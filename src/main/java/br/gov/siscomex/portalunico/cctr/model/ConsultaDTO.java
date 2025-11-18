package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDTO", propOrder =
        {"numero", "urlConsulta", "veiculoRodoviario"
        })

@XmlRootElement(name = "ConsultaDTO")
public class ConsultaDTO {

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

    @XmlElement(name = "urlConsulta")
    @ApiModelProperty(value = "")
    private String urlConsulta = null;

    @XmlElement(name = "veiculoRodoviario")
    @ApiModelProperty(value = "")
    @Valid
    private VeiculoRodoviarioDTO veiculoRodoviario = null;

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

    public ConsultaDTO numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get urlConsulta
     *
     * @return urlConsulta
     **/
    @JsonProperty("urlConsulta")
    public String getUrlConsulta() {
        return urlConsulta;
    }

    public void setUrlConsulta(String urlConsulta) {
        this.urlConsulta = urlConsulta;
    }

    public ConsultaDTO urlConsulta(String urlConsulta) {
        this.urlConsulta = urlConsulta;
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
     * Get veiculoRodoviario
     *
     * @return veiculoRodoviario
     **/
    @JsonProperty("veiculoRodoviario")
    public VeiculoRodoviarioDTO getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    public void setVeiculoRodoviario(VeiculoRodoviarioDTO veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
    }

    public ConsultaDTO veiculoRodoviario(VeiculoRodoviarioDTO veiculoRodoviario) {
        this.veiculoRodoviario = veiculoRodoviario;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaDTO {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    urlConsulta: " + toIndentedString(urlConsulta) + "\n" +
                "    veiculoRodoviario: " + toIndentedString(veiculoRodoviario) + "\n" +
                "}";
        return sb;
    }
}
