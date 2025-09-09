package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDivergencia", propOrder =
        {"percDivergenciaPesoBrutoKg", "dataHoraDivergencia", "quantidadeVolumesViagem", "quantidadeVolumesDivergentes", "parcial", "pesoBrutoKgViagem", "quantidadeVolumesConhecimento", "percDivergenciaQuantidadeVolumes", "pesoBrutoKgConhecimento", "momento", "pesoBrutoKgDivergentes", "tipoDivergencia"
        })

@XmlRootElement(name = "CargaRodoviariaDivergencia")
public class CargaRodoviariaDivergencia {

    @XmlElement(name = "percDivergenciaPesoBrutoKg")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal percDivergenciaPesoBrutoKg = null;

    @XmlElement(name = "dataHoraDivergencia")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataHoraDivergencia = null;

    @XmlElement(name = "quantidadeVolumesViagem")
    @ApiModelProperty(value = "")
    private Integer quantidadeVolumesViagem = null;

    @XmlElement(name = "quantidadeVolumesDivergentes")
    @ApiModelProperty(value = "")
    private Integer quantidadeVolumesDivergentes = null;

    @XmlElement(name = "parcial")
    @ApiModelProperty(value = "")
    private Boolean parcial = null;

    @XmlElement(name = "pesoBrutoKgViagem")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal pesoBrutoKgViagem = null;

    @XmlElement(name = "quantidadeVolumesConhecimento")
    @ApiModelProperty(value = "")
    private Integer quantidadeVolumesConhecimento = null;

    @XmlElement(name = "percDivergenciaQuantidadeVolumes")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal percDivergenciaQuantidadeVolumes = null;

    @XmlElement(name = "pesoBrutoKgConhecimento")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal pesoBrutoKgConhecimento = null;

    @XmlElement(name = "momento")
    @ApiModelProperty(value = "")
    @Valid
    private Momento momento = null;

    @XmlElement(name = "pesoBrutoKgDivergentes")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal pesoBrutoKgDivergentes = null;

    @XmlElement(name = "tipoDivergencia")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDivergencia tipoDivergencia = null;

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
     * Get percDivergenciaPesoBrutoKg
     *
     * @return percDivergenciaPesoBrutoKg
     **/
    @JsonProperty("percDivergenciaPesoBrutoKg")
    public BigDecimal getPercDivergenciaPesoBrutoKg() {
        return percDivergenciaPesoBrutoKg;
    }

    public void setPercDivergenciaPesoBrutoKg(BigDecimal percDivergenciaPesoBrutoKg) {
        this.percDivergenciaPesoBrutoKg = percDivergenciaPesoBrutoKg;
    }

    public CargaRodoviariaDivergencia percDivergenciaPesoBrutoKg(BigDecimal percDivergenciaPesoBrutoKg) {
        this.percDivergenciaPesoBrutoKg = percDivergenciaPesoBrutoKg;
        return this;
    }

    /**
     * Get dataHoraDivergencia
     *
     * @return dataHoraDivergencia
     **/
    @JsonProperty("dataHoraDivergencia")
    public OffsetDateTime getDataHoraDivergencia() {
        return dataHoraDivergencia;
    }

    public void setDataHoraDivergencia(OffsetDateTime dataHoraDivergencia) {
        this.dataHoraDivergencia = dataHoraDivergencia;
    }

    public CargaRodoviariaDivergencia dataHoraDivergencia(OffsetDateTime dataHoraDivergencia) {
        this.dataHoraDivergencia = dataHoraDivergencia;
        return this;
    }

    /**
     * Get quantidadeVolumesViagem
     *
     * @return quantidadeVolumesViagem
     **/
    @JsonProperty("quantidadeVolumesViagem")
    public Integer getQuantidadeVolumesViagem() {
        return quantidadeVolumesViagem;
    }

    public void setQuantidadeVolumesViagem(Integer quantidadeVolumesViagem) {
        this.quantidadeVolumesViagem = quantidadeVolumesViagem;
    }

    public CargaRodoviariaDivergencia quantidadeVolumesViagem(Integer quantidadeVolumesViagem) {
        this.quantidadeVolumesViagem = quantidadeVolumesViagem;
        return this;
    }

    /**
     * Get quantidadeVolumesDivergentes
     *
     * @return quantidadeVolumesDivergentes
     **/
    @JsonProperty("quantidadeVolumesDivergentes")
    public Integer getQuantidadeVolumesDivergentes() {
        return quantidadeVolumesDivergentes;
    }

    public void setQuantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
        this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
    }

    public CargaRodoviariaDivergencia quantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
        this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
        return this;
    }

    /**
     * Get parcial
     *
     * @return parcial
     **/
    @JsonProperty("parcial")
    public Boolean isisParcial() {
        return parcial;
    }

    public void setParcial(Boolean parcial) {
        this.parcial = parcial;
    }

    public CargaRodoviariaDivergencia parcial(Boolean parcial) {
        this.parcial = parcial;
        return this;
    }

    /**
     * Get pesoBrutoKgViagem
     *
     * @return pesoBrutoKgViagem
     **/
    @JsonProperty("pesoBrutoKgViagem")
    public BigDecimal getPesoBrutoKgViagem() {
        return pesoBrutoKgViagem;
    }

    public void setPesoBrutoKgViagem(BigDecimal pesoBrutoKgViagem) {
        this.pesoBrutoKgViagem = pesoBrutoKgViagem;
    }

    public CargaRodoviariaDivergencia pesoBrutoKgViagem(BigDecimal pesoBrutoKgViagem) {
        this.pesoBrutoKgViagem = pesoBrutoKgViagem;
        return this;
    }

    /**
     * Get quantidadeVolumesConhecimento
     *
     * @return quantidadeVolumesConhecimento
     **/
    @JsonProperty("quantidadeVolumesConhecimento")
    public Integer getQuantidadeVolumesConhecimento() {
        return quantidadeVolumesConhecimento;
    }

    public void setQuantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
        this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
    }

    public CargaRodoviariaDivergencia quantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
        this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
        return this;
    }

    /**
     * Get percDivergenciaQuantidadeVolumes
     *
     * @return percDivergenciaQuantidadeVolumes
     **/
    @JsonProperty("percDivergenciaQuantidadeVolumes")
    public BigDecimal getPercDivergenciaQuantidadeVolumes() {
        return percDivergenciaQuantidadeVolumes;
    }

    public void setPercDivergenciaQuantidadeVolumes(BigDecimal percDivergenciaQuantidadeVolumes) {
        this.percDivergenciaQuantidadeVolumes = percDivergenciaQuantidadeVolumes;
    }

    public CargaRodoviariaDivergencia percDivergenciaQuantidadeVolumes(BigDecimal percDivergenciaQuantidadeVolumes) {
        this.percDivergenciaQuantidadeVolumes = percDivergenciaQuantidadeVolumes;
        return this;
    }

    /**
     * Get pesoBrutoKgConhecimento
     *
     * @return pesoBrutoKgConhecimento
     **/
    @JsonProperty("pesoBrutoKgConhecimento")
    public BigDecimal getPesoBrutoKgConhecimento() {
        return pesoBrutoKgConhecimento;
    }

    public void setPesoBrutoKgConhecimento(BigDecimal pesoBrutoKgConhecimento) {
        this.pesoBrutoKgConhecimento = pesoBrutoKgConhecimento;
    }

    public CargaRodoviariaDivergencia pesoBrutoKgConhecimento(BigDecimal pesoBrutoKgConhecimento) {
        this.pesoBrutoKgConhecimento = pesoBrutoKgConhecimento;
        return this;
    }

    /**
     * Get momento
     *
     * @return momento
     **/
    @JsonProperty("momento")
    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
    }

    public CargaRodoviariaDivergencia momento(Momento momento) {
        this.momento = momento;
        return this;
    }

    /**
     * Get pesoBrutoKgDivergentes
     *
     * @return pesoBrutoKgDivergentes
     **/
    @JsonProperty("pesoBrutoKgDivergentes")
    public BigDecimal getPesoBrutoKgDivergentes() {
        return pesoBrutoKgDivergentes;
    }

    public void setPesoBrutoKgDivergentes(BigDecimal pesoBrutoKgDivergentes) {
        this.pesoBrutoKgDivergentes = pesoBrutoKgDivergentes;
    }

    public CargaRodoviariaDivergencia pesoBrutoKgDivergentes(BigDecimal pesoBrutoKgDivergentes) {
        this.pesoBrutoKgDivergentes = pesoBrutoKgDivergentes;
        return this;
    }

    /**
     * Get tipoDivergencia
     *
     * @return tipoDivergencia
     **/
    @JsonProperty("tipoDivergencia")
    public TipoDivergencia getTipoDivergencia() {
        return tipoDivergencia;
    }

    public void setTipoDivergencia(TipoDivergencia tipoDivergencia) {
        this.tipoDivergencia = tipoDivergencia;
    }

    public CargaRodoviariaDivergencia tipoDivergencia(TipoDivergencia tipoDivergencia) {
        this.tipoDivergencia = tipoDivergencia;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDivergencia {\n" +
                "    percDivergenciaPesoBrutoKg: " + toIndentedString(percDivergenciaPesoBrutoKg) + "\n" +
                "    dataHoraDivergencia: " + toIndentedString(dataHoraDivergencia) + "\n" +
                "    quantidadeVolumesViagem: " + toIndentedString(quantidadeVolumesViagem) + "\n" +
                "    quantidadeVolumesDivergentes: " + toIndentedString(quantidadeVolumesDivergentes) + "\n" +
                "    parcial: " + toIndentedString(parcial) + "\n" +
                "    pesoBrutoKgViagem: " + toIndentedString(pesoBrutoKgViagem) + "\n" +
                "    quantidadeVolumesConhecimento: " + toIndentedString(quantidadeVolumesConhecimento) + "\n" +
                "    percDivergenciaQuantidadeVolumes: " + toIndentedString(percDivergenciaQuantidadeVolumes) + "\n" +
                "    pesoBrutoKgConhecimento: " + toIndentedString(pesoBrutoKgConhecimento) + "\n" +
                "    momento: " + toIndentedString(momento) + "\n" +
                "    pesoBrutoKgDivergentes: " + toIndentedString(pesoBrutoKgDivergentes) + "\n" +
                "    tipoDivergencia: " + toIndentedString(tipoDivergencia) + "\n" +
                "}";
        return sb;
    }
}
