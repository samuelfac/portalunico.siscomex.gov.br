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
@XmlType(name = "ViagemRodoviariaDetalhadaTransportador", propOrder =
        {"estrangeiro", "brasileiro", "nacionalidadeBrasileira"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaTransportador")
public class ViagemRodoviariaDetalhadaTransportador {

    @XmlElement(name = "estrangeiro")
    @ApiModelProperty(value = "")
    @Valid
    private TransportadorRodoviarioNacEstrangeira estrangeiro = null;

    @XmlElement(name = "brasileiro")
    @ApiModelProperty(value = "")
    @Valid
    private TransportadorRodoviarioNacBrasileira brasileiro = null;

    @XmlElement(name = "nacionalidadeBrasileira")
    @ApiModelProperty(value = "Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)")
    /**
     * Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)
     **/
    private Boolean nacionalidadeBrasileira = null;

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
     * Get estrangeiro
     *
     * @return estrangeiro
     **/
    @JsonProperty("estrangeiro")
    public TransportadorRodoviarioNacEstrangeira getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(TransportadorRodoviarioNacEstrangeira estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public ViagemRodoviariaDetalhadaTransportador estrangeiro(TransportadorRodoviarioNacEstrangeira estrangeiro) {
        this.estrangeiro = estrangeiro;
        return this;
    }

    /**
     * Get brasileiro
     *
     * @return brasileiro
     **/
    @JsonProperty("brasileiro")
    public TransportadorRodoviarioNacBrasileira getBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(TransportadorRodoviarioNacBrasileira brasileiro) {
        this.brasileiro = brasileiro;
    }

    public ViagemRodoviariaDetalhadaTransportador brasileiro(TransportadorRodoviarioNacBrasileira brasileiro) {
        this.brasileiro = brasileiro;
        return this;
    }

    /**
     * Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)
     *
     * @return nacionalidadeBrasileira
     **/
    @JsonProperty("nacionalidadeBrasileira")
    public Boolean isisNacionalidadeBrasileira() {
        return nacionalidadeBrasileira;
    }

    public void setNacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
    }

    public ViagemRodoviariaDetalhadaTransportador nacionalidadeBrasileira(Boolean nacionalidadeBrasileira) {
        this.nacionalidadeBrasileira = nacionalidadeBrasileira;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaTransportador {\n" +
                "    estrangeiro: " + toIndentedString(estrangeiro) + "\n" +
                "    brasileiro: " + toIndentedString(brasileiro) + "\n" +
                "    nacionalidadeBrasileira: " + toIndentedString(nacionalidadeBrasileira) + "\n" +
                "}";
        return sb;
    }
}
