package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaDetalhadaLocalChegada", propOrder =
        {"horaChegada", "recintoAduaneiro", "unidadeRFB", "dataChegada"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaLocalChegada")
public class ViagemRodoviariaDetalhadaLocalChegada {

    @XmlElement(name = "horaChegada")
    @ApiModelProperty(example = "08:54:00", value = "Hora em que aconteceu a chegada")
    /**
     * Hora em que aconteceu a chegada
     **/
    private String horaChegada = null;

    @XmlElement(name = "recintoAduaneiro")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto recintoAduaneiro = null;

    @XmlElement(name = "unidadeRFB")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeRfb unidadeRFB = null;

    @XmlElement(name = "dataChegada")
    @ApiModelProperty(example = "Fri Aug 07 02:00:00 CEST 2020", value = "Data em que ocorreu a chegada")
    /**
     * Data em que ocorreu a chegada
     **/
    private LocalDate dataChegada = null;

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
     * Hora em que aconteceu a chegada
     *
     * @return horaChegada
     **/
    @JsonProperty("horaChegada")
    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public ViagemRodoviariaDetalhadaLocalChegada horaChegada(String horaChegada) {
        this.horaChegada = horaChegada;
        return this;
    }

    /**
     * Get recintoAduaneiro
     *
     * @return recintoAduaneiro
     **/
    @JsonProperty("recintoAduaneiro")
    public Recinto getRecintoAduaneiro() {
        return recintoAduaneiro;
    }

    public void setRecintoAduaneiro(Recinto recintoAduaneiro) {
        this.recintoAduaneiro = recintoAduaneiro;
    }

    public ViagemRodoviariaDetalhadaLocalChegada recintoAduaneiro(Recinto recintoAduaneiro) {
        this.recintoAduaneiro = recintoAduaneiro;
        return this;
    }

    /**
     * Get unidadeRFB
     *
     * @return unidadeRFB
     **/
    @JsonProperty("unidadeRFB")
    public UnidadeRfb getUnidadeRFB() {
        return unidadeRFB;
    }

    public void setUnidadeRFB(UnidadeRfb unidadeRFB) {
        this.unidadeRFB = unidadeRFB;
    }

    public ViagemRodoviariaDetalhadaLocalChegada unidadeRFB(UnidadeRfb unidadeRFB) {
        this.unidadeRFB = unidadeRFB;
        return this;
    }

    /**
     * Data em que ocorreu a chegada
     *
     * @return dataChegada
     **/
    @JsonProperty("dataChegada")
    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public ViagemRodoviariaDetalhadaLocalChegada dataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ViagemRodoviariaDetalhadaLocalChegada {\n" +
                "    horaChegada: " + toIndentedString(horaChegada) + "\n" +
                "    recintoAduaneiro: " + toIndentedString(recintoAduaneiro) + "\n" +
                "    unidadeRFB: " + toIndentedString(unidadeRFB) + "\n" +
                "    dataChegada: " + toIndentedString(dataChegada) + "\n" +
                "}";
        return sb;
    }
}
