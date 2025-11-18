package br.gov.siscomex.portalunico.cctr.model;

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
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeculoTruck", propOrder =
        {"placa", "tara", "lacres"
        })

@XmlRootElement(name = "VeculoTruck")
/**
 * Dados do veículo
 **/
@ApiModel(description = "Dados do veículo")
public class VeculoTruck {

    @XmlElement(name = "placa", required = true)
    @ApiModelProperty(example = "7eZJQWu", required = true, value = "Placa do Truck")
    /**
     * Placa do Truck
     **/
    private String placa = null;

    @XmlElement(name = "tara", required = true)
    @ApiModelProperty(example = "500.0", required = true, value = "Tara do Truck em kg")
    @Valid
    /**
     * Tara do Truck em kg
     **/
    private BigDecimal tara = null;

    @XmlElement(name = "lacres")
    @ApiModelProperty(value = "")
    @Valid
    private Lacres lacres = null;

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
     * Placa do Truck
     *
     * @return placa
     **/
    @JsonProperty("placa")
    @NotNull
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Tara do Truck em kg
     *
     * @return tara
     **/
    @JsonProperty("tara")
    @NotNull
    public BigDecimal getTara() {
        return tara;
    }

    public void setTara(BigDecimal tara) {
        this.tara = tara;
    }

    public VeculoTruck tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    public VeculoTruck placa(String placa) {
        this.placa = placa;
        return this;
    }

    /**
     * Get lacres
     *
     * @return lacres
     **/
    @JsonProperty("lacres")
    public Lacres getLacres() {
        return lacres;
    }

    public void setLacres(Lacres lacres) {
        this.lacres = lacres;
    }

    public VeculoTruck lacres(Lacres lacres) {
        this.lacres = lacres;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeculoTruck {\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    lacres: " + toIndentedString(lacres) + "\n" +
                "}";
        return sb;
    }
}
