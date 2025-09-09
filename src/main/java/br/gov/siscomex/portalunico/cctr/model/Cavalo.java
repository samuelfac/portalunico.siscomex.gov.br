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
@XmlType(name = "Cavalo", propOrder =
        {"tara", "placa"
        })

@XmlRootElement(name = "Cavalo")
/**
 * Dados do cavalo
 **/
@ApiModel(description = "Dados do cavalo")
public class Cavalo {

    @XmlElement(name = "tara", required = true)
    @ApiModelProperty(example = "500.0", required = true, value = "Tara do cavalo em kg")
    @Valid
    /**
     * Tara do cavalo em kg
     **/
    private BigDecimal tara = null;

    @XmlElement(name = "placa", required = true)
    @ApiModelProperty(example = "7eZJQWu", required = true, value = "Placa do cavalo")
    /**
     * Placa do cavalo
     **/
    private String placa = null;

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
     * Tara do cavalo em kg
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

    public Cavalo tara(BigDecimal tara) {
        this.tara = tara;
        return this;
    }

    /**
     * Placa do cavalo
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

    public Cavalo placa(String placa) {
        this.placa = placa;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Cavalo {\n" +
                "    tara: " + toIndentedString(tara) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "}";
        return sb;
    }
}
