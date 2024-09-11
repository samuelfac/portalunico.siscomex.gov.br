package br.gov.siscomex.portalunico.cadatributos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiffArquivoDiarioNcmDTO", propOrder =
        {"codigoNcm", "atributos"
        })

@XmlRootElement(name = "DiffArquivoDiarioNcmDTO")
public class DiffArquivoDiarioNcmDTO {

    @XmlElement(name = "codigoNcm")
    @ApiModelProperty(value = "Código NCM")
    /**
     * Código NCM
     **/
    private String codigoNcm = null;

    @XmlElement(name = "atributos")
    @ApiModelProperty(value = "")
    @Valid
    private VersaoArquivoDiarioAtributoDTO atributos = null;

    /**
     * Código NCM
     *
     * @return codigoNcm
     **/
    @JsonProperty("codigoNcm")
    public String getCodigoNcm() {
        return codigoNcm;
    }

    public void setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
    }

    public DiffArquivoDiarioNcmDTO codigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
        return this;
    }

    /**
     * Get atributos
     *
     * @return atributos
     **/
    @JsonProperty("atributos")
    public VersaoArquivoDiarioAtributoDTO getAtributos() {
        return atributos;
    }

    public void setAtributos(VersaoArquivoDiarioAtributoDTO atributos) {
        this.atributos = atributos;
    }

    public DiffArquivoDiarioNcmDTO atributos(VersaoArquivoDiarioAtributoDTO atributos) {
        this.atributos = atributos;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DiffArquivoDiarioNcmDTO {\n" +
                "    codigoNcm: " + toIndentedString(codigoNcm) + "\n" +
                "    atributos: " + toIndentedString(atributos) + "\n" +
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

