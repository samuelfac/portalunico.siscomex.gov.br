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
@XmlType(name = "ViagemRodoviariaDetalhada", propOrder =
        {"veiculo", "transportador", "chegadas", "informacoesGerais"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhada")
public class ViagemRodoviariaDetalhada {

    @XmlElement(name = "veiculo")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaVeiculo veiculo = null;

    @XmlElement(name = "transportador")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaTransportador transportador = null;

    @XmlElement(name = "chegadas")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaChegadas chegadas = null;

    @XmlElement(name = "informacoesGerais")
    @ApiModelProperty(value = "")
    @Valid
    private ViagemRodoviariaDetalhadaInfoGerais informacoesGerais = null;

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
     * Get veiculo
     *
     * @return veiculo
     **/
    @JsonProperty("veiculo")
    public ViagemRodoviariaDetalhadaVeiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(ViagemRodoviariaDetalhadaVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ViagemRodoviariaDetalhada veiculo(ViagemRodoviariaDetalhadaVeiculo veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    /**
     * Get transportador
     *
     * @return transportador
     **/
    @JsonProperty("transportador")
    public ViagemRodoviariaDetalhadaTransportador getTransportador() {
        return transportador;
    }

    public void setTransportador(ViagemRodoviariaDetalhadaTransportador transportador) {
        this.transportador = transportador;
    }

    public ViagemRodoviariaDetalhada transportador(ViagemRodoviariaDetalhadaTransportador transportador) {
        this.transportador = transportador;
        return this;
    }

    /**
     * Get chegadas
     *
     * @return chegadas
     **/
    @JsonProperty("chegadas")
    public ViagemRodoviariaDetalhadaChegadas getChegadas() {
        return chegadas;
    }

    public void setChegadas(ViagemRodoviariaDetalhadaChegadas chegadas) {
        this.chegadas = chegadas;
    }

    public ViagemRodoviariaDetalhada chegadas(ViagemRodoviariaDetalhadaChegadas chegadas) {
        this.chegadas = chegadas;
        return this;
    }

    /**
     * Get informacoesGerais
     *
     * @return informacoesGerais
     **/
    @JsonProperty("informacoesGerais")
    public ViagemRodoviariaDetalhadaInfoGerais getInformacoesGerais() {
        return informacoesGerais;
    }

    public void setInformacoesGerais(ViagemRodoviariaDetalhadaInfoGerais informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
    }

    public ViagemRodoviariaDetalhada informacoesGerais(ViagemRodoviariaDetalhadaInfoGerais informacoesGerais) {
        this.informacoesGerais = informacoesGerais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhada {\n" +
                "    veiculo: " + toIndentedString(veiculo) + "\n" +
                "    transportador: " + toIndentedString(transportador) + "\n" +
                "    chegadas: " + toIndentedString(chegadas) + "\n" +
                "    informacoesGerais: " + toIndentedString(informacoesGerais) + "\n" +
                "}";
        return sb;
    }
}
