package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDetalhada", propOrder =
        {"intervenientes", "infoGerais", "transportadoresSucessivos"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhada")
public class CargaRodoviariaDetalhada {

    @XmlElement(name = "intervenientes")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDetalhadaInterveniente> intervenientes = null;

    @XmlElement(name = "infoGerais")
    @ApiModelProperty(value = "")
    @Valid
    private CargaRodoviariaDetalhadaInfoGerais infoGerais = null;

    @XmlElement(name = "transportadoresSucessivos")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaDetalhadaInterveniente> transportadoresSucessivos = null;

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
     * Get intervenientes
     *
     * @return intervenientes
     **/
    @JsonProperty("intervenientes")
    public List<CargaRodoviariaDetalhadaInterveniente> getIntervenientes() {
        return intervenientes;
    }

    public void setIntervenientes(List<CargaRodoviariaDetalhadaInterveniente> intervenientes) {
        this.intervenientes = intervenientes;
    }

    public CargaRodoviariaDetalhada intervenientes(List<CargaRodoviariaDetalhadaInterveniente> intervenientes) {
        this.intervenientes = intervenientes;
        return this;
    }

    public CargaRodoviariaDetalhada addIntervenientesItem(CargaRodoviariaDetalhadaInterveniente intervenientesItem) {
        this.intervenientes.add(intervenientesItem);
        return this;
    }

    /**
     * Get infoGerais
     *
     * @return infoGerais
     **/
    @JsonProperty("infoGerais")
    public CargaRodoviariaDetalhadaInfoGerais getInfoGerais() {
        return infoGerais;
    }

    public void setInfoGerais(CargaRodoviariaDetalhadaInfoGerais infoGerais) {
        this.infoGerais = infoGerais;
    }

    public CargaRodoviariaDetalhada infoGerais(CargaRodoviariaDetalhadaInfoGerais infoGerais) {
        this.infoGerais = infoGerais;
        return this;
    }

    /**
     * Get transportadoresSucessivos
     *
     * @return transportadoresSucessivos
     **/
    @JsonProperty("transportadoresSucessivos")
    public List<CargaRodoviariaDetalhadaInterveniente> getTransportadoresSucessivos() {
        return transportadoresSucessivos;
    }

    public void setTransportadoresSucessivos(List<CargaRodoviariaDetalhadaInterveniente> transportadoresSucessivos) {
        this.transportadoresSucessivos = transportadoresSucessivos;
    }

    public CargaRodoviariaDetalhada transportadoresSucessivos(List<CargaRodoviariaDetalhadaInterveniente> transportadoresSucessivos) {
        this.transportadoresSucessivos = transportadoresSucessivos;
        return this;
    }

    public CargaRodoviariaDetalhada addTransportadoresSucessivosItem(CargaRodoviariaDetalhadaInterveniente transportadoresSucessivosItem) {
        this.transportadoresSucessivos.add(transportadoresSucessivosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhada {\n" +
                "    intervenientes: " + toIndentedString(intervenientes) + "\n" +
                "    infoGerais: " + toIndentedString(infoGerais) + "\n" +
                "    transportadoresSucessivos: " + toIndentedString(transportadoresSucessivos) + "\n" +
                "}";
        return sb;
    }
}
