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
@XmlType(name = "ViagemRodoviariaDetalhadaInfoGerais", propOrder =
        {"dadosViagem", "enLastre", "rota"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaInfoGerais")
public class ViagemRodoviariaDetalhadaInfoGerais {

    @XmlElement(name = "dadosViagem")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaInfoGeraisDadosViagem dadosViagem = null;

    @XmlElement(name = "enLastre")
    @ApiModelProperty(value = "Indicador se a viagem é \"En Lastre\"")
    /**
     * Indicador se a viagem é \"En Lastre\"
     **/
    private Boolean enLastre = null;

    @XmlElement(name = "rota")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaInfoGeraisRota rota = null;

    /**
     * Get dadosViagem
     *
     * @return dadosViagem
     **/
    @JsonProperty("dadosViagem")
    public ViagemRodoviariaDetalhadaInfoGeraisDadosViagem getDadosViagem() {
        return dadosViagem;
    }

    public void setDadosViagem(ViagemRodoviariaDetalhadaInfoGeraisDadosViagem dadosViagem) {
        this.dadosViagem = dadosViagem;
    }

    public ViagemRodoviariaDetalhadaInfoGerais dadosViagem(ViagemRodoviariaDetalhadaInfoGeraisDadosViagem dadosViagem) {
        this.dadosViagem = dadosViagem;
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
     * Indicador se a viagem é \&quot;En Lastre\&quot;
     *
     * @return enLastre
     **/
    @JsonProperty("enLastre")
    public Boolean isisEnLastre() {
        return enLastre;
    }

    public void setEnLastre(Boolean enLastre) {
        this.enLastre = enLastre;
    }

    /**
     * Get rota
     *
     * @return rota
     **/
    @JsonProperty("rota")
    public ViagemRodoviariaDetalhadaInfoGeraisRota getRota() {
        return rota;
    }

    public void setRota(ViagemRodoviariaDetalhadaInfoGeraisRota rota) {
        this.rota = rota;
    }

    public ViagemRodoviariaDetalhadaInfoGerais rota(ViagemRodoviariaDetalhadaInfoGeraisRota rota) {
        this.rota = rota;
        return this;
    }

    public ViagemRodoviariaDetalhadaInfoGerais enLastre(Boolean enLastre) {
        this.enLastre = enLastre;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaInfoGerais {\n" +
                "    dadosViagem: " + toIndentedString(dadosViagem) + "\n" +
                "    enLastre: " + toIndentedString(enLastre) + "\n" +
                "    rota: " + toIndentedString(rota) + "\n" +
                "}";
        return sb;
    }
}
