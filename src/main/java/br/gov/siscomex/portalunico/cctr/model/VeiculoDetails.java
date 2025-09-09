package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoDetails", propOrder =
        {"situacao", "chassi"
        })

@XmlRootElement(name = "VeiculoDetails")
/**
 * Lista de veículos
 **/
@ApiModel(description = "Lista de veículos")
public class VeiculoDetails {

    @XmlElement(name = "situacao")
    @ApiModelProperty(example = "Disponível", value = "Descrição da situação")
    /**
     * Descrição da situação
     **/
    private String situacao = null;

    @XmlElement(name = "chassi")
    @ApiModelProperty(example = "CONT000001", value = "Número do chassi")
    /**
     * Número do chassi
     **/
    private String chassi = null;

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
     * Descrição da situação
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public VeiculoDetails situacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Número do chassi
     *
     * @return chassi
     **/
    @JsonProperty("chassi")
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public VeiculoDetails chassi(String chassi) {
        this.chassi = chassi;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoDetails {\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    chassi: " + toIndentedString(chassi) + "\n" +
                "}";
        return sb;
    }
}
