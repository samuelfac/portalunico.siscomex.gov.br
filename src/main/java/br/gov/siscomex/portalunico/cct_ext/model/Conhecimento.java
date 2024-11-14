package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conhecimento", propOrder =
        {"numeroConhecimento", "dataEmissaoConhecimento", "frete", "consignatario"
        })

@XmlRootElement(name = "Conhecimento")
/**
 * Dados do conhecimento de carga
 **/
@ApiModel(description = "Dados do conhecimento de carga")
public class Conhecimento {

    @XmlElement(name = "numeroConhecimento", required = true)
    @ApiModelProperty(example = "123456789", required = true, value = "Número do conhecimento de carga<br>Em uma mesma manifestação de embarque não podem ser inseridos conhecimentos de carga com o mesmo número.")
    /**
     * Número do conhecimento de carga<br>Em uma mesma manifestação de embarque não podem ser inseridos conhecimentos de carga com o mesmo número.
     **/
    private String numeroConhecimento = null;

    @XmlElement(name = "dataEmissaoConhecimento", required = true)
    @ApiModelProperty(example = "2016-12-19", required = true, value = "Data de emissão do conhecimento de carga")
    /**
     * Data de emissão do conhecimento de carga
     **/
    private String dataEmissaoConhecimento = null;

    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private Frete frete = null;

    @XmlElement(name = "consignatario", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Consignatario consignatario = null;

    /**
     * Número do conhecimento de carga&lt;br&gt;Em uma mesma manifestação de embarque não podem ser inseridos conhecimentos de carga com o mesmo número.
     *
     * @return numeroConhecimento
     **/
    @JsonProperty("numeroConhecimento")
    @NotNull
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public Conhecimento numeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
        return this;
    }

    /**
     * Data de emissão do conhecimento de carga
     *
     * @return dataEmissaoConhecimento
     **/
    @JsonProperty("dataEmissaoConhecimento")
    @NotNull
    public String getDataEmissaoConhecimento() {
        return dataEmissaoConhecimento;
    }

    public void setDataEmissaoConhecimento(String dataEmissaoConhecimento) {
        this.dataEmissaoConhecimento = dataEmissaoConhecimento;
    }

    public Conhecimento dataEmissaoConhecimento(String dataEmissaoConhecimento) {
        this.dataEmissaoConhecimento = dataEmissaoConhecimento;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Conhecimento frete(Frete frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Get consignatario
     *
     * @return consignatario
     **/
    @JsonProperty("consignatario")
    @NotNull
    public Consignatario getConsignatario() {
        return consignatario;
    }

    public void setConsignatario(Consignatario consignatario) {
        this.consignatario = consignatario;
    }

    public Conhecimento consignatario(Consignatario consignatario) {
        this.consignatario = consignatario;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Conhecimento {\n" +
                "    numeroConhecimento: " + toIndentedString(numeroConhecimento) + "\n" +
                "    dataEmissaoConhecimento: " + toIndentedString(dataEmissaoConhecimento) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    consignatario: " + toIndentedString(consignatario) + "\n" +
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

