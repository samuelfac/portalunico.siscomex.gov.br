package br.gov.siscomex.portalunico.cct_imp.model;

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
@XmlType(name = "LocalDTO", propOrder =
        {"urf", "recinto", "latitude", "longitude", "responsavel"
        })

@XmlRootElement(name = "LocalDTO")
/**
 * Dados que descrevem o local da carga
 **/
@ApiModel(description = "Dados que descrevem o local da carga")
public class LocalDTO {

    @XmlElement(name = "urf")
    @ApiModelProperty(value = "")
    @Valid
    private UrfDTO urf = null;

    @XmlElement(name = "recinto")
    @ApiModelProperty(value = "")
    @Valid
    private RecintoDTO recinto = null;

    @XmlElement(name = "latitude")
    @ApiModelProperty(example = "-20.812222", value = "Latitude")
    /**
     * Latitude
     **/
    private String latitude = null;

    @XmlElement(name = "longitude")
    @ApiModelProperty(example = "-40.248333", value = "Longitude")
    /**
     * Longitude
     **/
    private String longitude = null;

    @XmlElement(name = "responsavel")
    @ApiModelProperty(value = "")
    @Valid
    private ResponsavelEstoqueDTO responsavel = null;

    /**
     * Get urf
     *
     * @return urf
     **/
    @JsonProperty("urf")
    public UrfDTO getUrf() {
        return urf;
    }

    public void setUrf(UrfDTO urf) {
        this.urf = urf;
    }

    public LocalDTO urf(UrfDTO urf) {
        this.urf = urf;
        return this;
    }

    /**
     * Get recinto
     *
     * @return recinto
     **/
    @JsonProperty("recinto")
    public RecintoDTO getRecinto() {
        return recinto;
    }

    public void setRecinto(RecintoDTO recinto) {
        this.recinto = recinto;
    }

    public LocalDTO recinto(RecintoDTO recinto) {
        this.recinto = recinto;
        return this;
    }

    /**
     * Latitude
     *
     * @return latitude
     **/
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocalDTO latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude
     *
     * @return longitude
     **/
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public LocalDTO longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get responsavel
     *
     * @return responsavel
     **/
    @JsonProperty("responsavel")
    public ResponsavelEstoqueDTO getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelEstoqueDTO responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDTO responsavel(ResponsavelEstoqueDTO responsavel) {
        this.responsavel = responsavel;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class LocalDTO {\n" +
                "    urf: " + toIndentedString(urf) + "\n" +
                "    recinto: " + toIndentedString(recinto) + "\n" +
                "    latitude: " + toIndentedString(latitude) + "\n" +
                "    longitude: " + toIndentedString(longitude) + "\n" +
                "    responsavel: " + toIndentedString(responsavel) + "\n" +
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

