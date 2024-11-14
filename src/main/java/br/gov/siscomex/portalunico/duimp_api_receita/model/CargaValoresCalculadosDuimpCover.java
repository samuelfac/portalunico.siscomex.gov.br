package br.gov.siscomex.portalunico.duimp_api_receita.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaValoresCalculadosDuimpCover", propOrder =
        {"frete", "seguro"
        })

@XmlRootElement(name = "CargaValoresCalculadosDuimpCover")
/**
 * Dados da carga.
 **/
@ApiModel(description = "Dados da carga.")
public class CargaValoresCalculadosDuimpCover {

    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private FreteValoresCalculadosDuimpCover frete = null;

    @XmlElement(name = "seguro")
    @ApiModelProperty(value = "")
    @Valid
    private SeguroValoresCalculadosDuimpCover seguro = null;

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public FreteValoresCalculadosDuimpCover getFrete() {
        return frete;
    }

    public void setFrete(FreteValoresCalculadosDuimpCover frete) {
        this.frete = frete;
    }

    public CargaValoresCalculadosDuimpCover frete(FreteValoresCalculadosDuimpCover frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get seguro
     *
     * @return seguro
     **/
    @JsonProperty("seguro")
    public SeguroValoresCalculadosDuimpCover getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroValoresCalculadosDuimpCover seguro) {
        this.seguro = seguro;
    }

    public CargaValoresCalculadosDuimpCover seguro(SeguroValoresCalculadosDuimpCover seguro) {
        this.seguro = seguro;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CargaValoresCalculadosDuimpCover {\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    seguro: " + toIndentedString(seguro) + "\n" +
                "}";
        return sb;
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
}

