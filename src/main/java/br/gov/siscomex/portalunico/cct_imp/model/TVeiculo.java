package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVeiculo", propOrder =
        {"chassi"
        })

@XmlRootElement(name = "TVeiculo")
/**
 * Dados informados para carga do tipo veículo
 **/
@ApiModel(description = "Dados informados para carga do tipo veículo")
public class TVeiculo {

    @XmlElement(name = "chassi", required = true)
    @ApiModelProperty(example = "9BWZZZ377VT004251", required = true, value = "Chassi do veículo<br>Tamanho: 20")
    /**
     * Chassi do veículo<br>Tamanho: 20
     **/
    private String chassi = null;

    /**
     * Chassi do veículo&lt;br&gt;Tamanho: 20
     *
     * @return chassi
     **/
    @JsonProperty("chassi")
    @NotNull
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public TVeiculo chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class TVeiculo {\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
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

