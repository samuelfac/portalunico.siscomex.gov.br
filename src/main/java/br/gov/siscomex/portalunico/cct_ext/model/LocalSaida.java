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
@XmlType(name = "LocalSaida", propOrder =
        {"codigoURF", "codigoRA", "cnpjResponsavel", "coordenadas"
        })

@XmlRootElement(name = "LocalSaida")
/**
 * Local de saída
 **/
@ApiModel(description = "Local de saída")
public class LocalSaida {

    @XmlElement(name = "codigoURF", required = true)
    @ApiModelProperty(example = "0717700", required = true, value = "Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN")
    /**
     * Código da Unidade de Região Fiscal<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private String codigoURF = null;

    @XmlElement(name = "codigoRA", required = true)
    @ApiModelProperty(example = "7911101", required = true, value = "Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN")
    /**
     * Código do Recinto Aduaneiro<br>Tamanho: 7<br>Formato: NNNNNNN
     **/
    private String codigoRA = null;

    @XmlElement(name = "cnpjResponsavel", required = true)
    @ApiModelProperty(example = "15573459000106", required = true, value = "CNPJ do responsável pelo local<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do responsável pelo local<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String cnpjResponsavel = null;

    @XmlElement(name = "coordenadas", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Coordenadas coordenadas = null;

    /**
     * Código da Unidade de Região Fiscal&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return codigoURF
     **/
    @JsonProperty("codigoURF")
    @NotNull
    public String getCodigoURF() {
        return codigoURF;
    }

    public void setCodigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
    }

    public LocalSaida codigoURF(String codigoURF) {
        this.codigoURF = codigoURF;
        return this;
    }

    /**
     * Código do Recinto Aduaneiro&lt;br&gt;Tamanho: 7&lt;br&gt;Formato: NNNNNNN
     *
     * @return codigoRA
     **/
    @JsonProperty("codigoRA")
    @NotNull
    public String getCodigoRA() {
        return codigoRA;
    }

    public void setCodigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
    }

    public LocalSaida codigoRA(String codigoRA) {
        this.codigoRA = codigoRA;
        return this;
    }

    /**
     * CNPJ do responsável pelo local&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
     *
     * @return cnpjResponsavel
     **/
    @JsonProperty("cnpjResponsavel")
    @NotNull
    public String getCnpjResponsavel() {
        return cnpjResponsavel;
    }

    public void setCnpjResponsavel(String cnpjResponsavel) {
        this.cnpjResponsavel = cnpjResponsavel;
    }

    public LocalSaida cnpjResponsavel(String cnpjResponsavel) {
        this.cnpjResponsavel = cnpjResponsavel;
        return this;
    }

    /**
     * Get coordenadas
     *
     * @return coordenadas
     **/
    @JsonProperty("coordenadas")
    @NotNull
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public LocalSaida coordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class LocalSaida {\n" +
                "    codigoURF: " + toIndentedString(codigoURF) + "\n" +
                "    codigoRA: " + toIndentedString(codigoRA) + "\n" +
                "    cnpjResponsavel: " + toIndentedString(cnpjResponsavel) + "\n" +
                "    coordenadas: " + toIndentedString(coordenadas) + "\n" +
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

