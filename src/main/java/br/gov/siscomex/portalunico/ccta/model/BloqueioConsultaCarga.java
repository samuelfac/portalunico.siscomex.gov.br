package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BloqueioConsultaCarga", propOrder =
        {"justificativaBloqueio", "responsavelBloqueio", "motivo", "tipo", "dataBloqueio", "desbloquear", "justificativaDesbloqueio", "visibilidade", "responsavelDesbloqueio", "dataDesbloqueio", "modo", "alcance"
        })

@XmlRootElement(name = "BloqueioConsultaCarga")
public class BloqueioConsultaCarga {

    @XmlElement(name = "justificativaBloqueio")
    @ApiModelProperty(example = "Bloqueio visível", value = "Justificativa do bloqueio")
    /**
     * Justificativa do bloqueio
     **/
    private String justificativaBloqueio = null;

    @XmlElement(name = "responsavelBloqueio")
    @ApiModelProperty(value = "")
    @Valid
    private ResponsavelRFBRepresentation responsavelBloqueio = null;

    @XmlElement(name = "motivo")
    @ApiModelProperty(value = "")
    @Valid
    private MotivoBloqueio motivo = null;

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoBloqueio tipo = null;

    @XmlElement(name = "dataBloqueio")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataBloqueio = null;

    @XmlElement(name = "desbloquear")
    @ApiModelProperty(value = "")
    private Boolean desbloquear = null;

    @XmlElement(name = "justificativaDesbloqueio")
    @ApiModelProperty(example = "Desbloqueio visível", value = "Justificativa do desbloqueio")
    /**
     * Justificativa do desbloqueio
     **/
    private String justificativaDesbloqueio = null;

    @XmlElement(name = "visibilidade")
    @ApiModelProperty(value = "")
    @Valid
    private VisibilidadeBloqueio visibilidade = null;

    @XmlElement(name = "responsavelDesbloqueio")
    @ApiModelProperty(value = "")
    @Valid
    private ResponsavelRFBRepresentation responsavelDesbloqueio = null;

    @XmlElement(name = "dataDesbloqueio")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataDesbloqueio = null;

    @XmlElement(name = "modo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDivergencia modo = null;

    @XmlElement(name = "alcance")
    @ApiModelProperty(value = "")
    @Valid
    private AlcanceBloqueio alcance = null;

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
     * Justificativa do bloqueio
     *
     * @return justificativaBloqueio
     **/
    @JsonProperty("justificativaBloqueio")
    public String getJustificativaBloqueio() {
        return justificativaBloqueio;
    }

    public void setJustificativaBloqueio(String justificativaBloqueio) {
        this.justificativaBloqueio = justificativaBloqueio;
    }

    public BloqueioConsultaCarga justificativaBloqueio(String justificativaBloqueio) {
        this.justificativaBloqueio = justificativaBloqueio;
        return this;
    }

    /**
     * Get responsavelBloqueio
     *
     * @return responsavelBloqueio
     **/
    @JsonProperty("responsavelBloqueio")
    public ResponsavelRFBRepresentation getResponsavelBloqueio() {
        return responsavelBloqueio;
    }

    public void setResponsavelBloqueio(ResponsavelRFBRepresentation responsavelBloqueio) {
        this.responsavelBloqueio = responsavelBloqueio;
    }

    public BloqueioConsultaCarga responsavelBloqueio(ResponsavelRFBRepresentation responsavelBloqueio) {
        this.responsavelBloqueio = responsavelBloqueio;
        return this;
    }

    /**
     * Get motivo
     *
     * @return motivo
     **/
    @JsonProperty("motivo")
    public MotivoBloqueio getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoBloqueio motivo) {
        this.motivo = motivo;
    }

    public BloqueioConsultaCarga motivo(MotivoBloqueio motivo) {
        this.motivo = motivo;
        return this;
    }

    /**
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoBloqueio getTipo() {
        return tipo;
    }

    public void setTipo(TipoBloqueio tipo) {
        this.tipo = tipo;
    }

    public BloqueioConsultaCarga tipo(TipoBloqueio tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Get dataBloqueio
     *
     * @return dataBloqueio
     **/
    @JsonProperty("dataBloqueio")
    public OffsetDateTime getDataBloqueio() {
        return dataBloqueio;
    }

    public void setDataBloqueio(OffsetDateTime dataBloqueio) {
        this.dataBloqueio = dataBloqueio;
    }

    public BloqueioConsultaCarga dataBloqueio(OffsetDateTime dataBloqueio) {
        this.dataBloqueio = dataBloqueio;
        return this;
    }

    /**
     * Get desbloquear
     *
     * @return desbloquear
     **/
    @JsonProperty("desbloquear")
    public Boolean isisDesbloquear() {
        return desbloquear;
    }

    public void setDesbloquear(Boolean desbloquear) {
        this.desbloquear = desbloquear;
    }

    public BloqueioConsultaCarga desbloquear(Boolean desbloquear) {
        this.desbloquear = desbloquear;
        return this;
    }

    /**
     * Justificativa do desbloqueio
     *
     * @return justificativaDesbloqueio
     **/
    @JsonProperty("justificativaDesbloqueio")
    public String getJustificativaDesbloqueio() {
        return justificativaDesbloqueio;
    }

    public void setJustificativaDesbloqueio(String justificativaDesbloqueio) {
        this.justificativaDesbloqueio = justificativaDesbloqueio;
    }

    public BloqueioConsultaCarga justificativaDesbloqueio(String justificativaDesbloqueio) {
        this.justificativaDesbloqueio = justificativaDesbloqueio;
        return this;
    }

    /**
     * Get visibilidade
     *
     * @return visibilidade
     **/
    @JsonProperty("visibilidade")
    public VisibilidadeBloqueio getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(VisibilidadeBloqueio visibilidade) {
        this.visibilidade = visibilidade;
    }

    public BloqueioConsultaCarga visibilidade(VisibilidadeBloqueio visibilidade) {
        this.visibilidade = visibilidade;
        return this;
    }

    /**
     * Get responsavelDesbloqueio
     *
     * @return responsavelDesbloqueio
     **/
    @JsonProperty("responsavelDesbloqueio")
    public ResponsavelRFBRepresentation getResponsavelDesbloqueio() {
        return responsavelDesbloqueio;
    }

    public void setResponsavelDesbloqueio(ResponsavelRFBRepresentation responsavelDesbloqueio) {
        this.responsavelDesbloqueio = responsavelDesbloqueio;
    }

    public BloqueioConsultaCarga responsavelDesbloqueio(ResponsavelRFBRepresentation responsavelDesbloqueio) {
        this.responsavelDesbloqueio = responsavelDesbloqueio;
        return this;
    }

    /**
     * Get dataDesbloqueio
     *
     * @return dataDesbloqueio
     **/
    @JsonProperty("dataDesbloqueio")
    public OffsetDateTime getDataDesbloqueio() {
        return dataDesbloqueio;
    }

    public void setDataDesbloqueio(OffsetDateTime dataDesbloqueio) {
        this.dataDesbloqueio = dataDesbloqueio;
    }

    public BloqueioConsultaCarga dataDesbloqueio(OffsetDateTime dataDesbloqueio) {
        this.dataDesbloqueio = dataDesbloqueio;
        return this;
    }

    /**
     * Get modo
     *
     * @return modo
     **/
    @JsonProperty("modo")
    public TipoDivergencia getModo() {
        return modo;
    }

    public void setModo(TipoDivergencia modo) {
        this.modo = modo;
    }

    public BloqueioConsultaCarga modo(TipoDivergencia modo) {
        this.modo = modo;
        return this;
    }

    /**
     * Get alcance
     *
     * @return alcance
     **/
    @JsonProperty("alcance")
    public AlcanceBloqueio getAlcance() {
        return alcance;
    }

    public void setAlcance(AlcanceBloqueio alcance) {
        this.alcance = alcance;
    }

    public BloqueioConsultaCarga alcance(AlcanceBloqueio alcance) {
        this.alcance = alcance;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class BloqueioConsultaCarga {\n" +
                "    justificativaBloqueio: " + toIndentedString(justificativaBloqueio) + "\n" +
                "    responsavelBloqueio: " + toIndentedString(responsavelBloqueio) + "\n" +
                "    motivo: " + toIndentedString(motivo) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    dataBloqueio: " + toIndentedString(dataBloqueio) + "\n" +
                "    desbloquear: " + toIndentedString(desbloquear) + "\n" +
                "    justificativaDesbloqueio: " + toIndentedString(justificativaDesbloqueio) + "\n" +
                "    visibilidade: " + toIndentedString(visibilidade) + "\n" +
                "    responsavelDesbloqueio: " + toIndentedString(responsavelDesbloqueio) + "\n" +
                "    dataDesbloqueio: " + toIndentedString(dataDesbloqueio) + "\n" +
                "    modo: " + toIndentedString(modo) + "\n" +
                "    alcance: " + toIndentedString(alcance) + "\n" +
                "}";
        return sb;
    }
}
