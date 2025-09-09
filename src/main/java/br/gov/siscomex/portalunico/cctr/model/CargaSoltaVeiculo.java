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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaSoltaVeiculo", propOrder =
        {"carga"
        })

@XmlRootElement(name = "CargaSoltaVeiculo")
/**
 * Lista de cargas soltas/veículos
 **/
@ApiModel(description = "Lista de cargas soltas/veículos")
public class CargaSoltaVeiculo {

    @XmlElement(name = "carga", required = true)
    @ApiModelProperty(required = true, value = "Dados da carga solta/veículo")
    @Valid
    /**
     * Dados da carga solta/veículo
     **/
    private List<CargaSoltaVeiculo> carga = new ArrayList<>();

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
     * Dados da carga solta/veículo
     *
     * @return carga
     **/
    @JsonProperty("carga")
    @NotNull
    public List<CargaSoltaVeiculo> getCarga() {
        return carga;
    }

    public void setCarga(List<CargaSoltaVeiculo> carga) {
        this.carga = carga;
    }

    public CargaSoltaVeiculo carga(List<CargaSoltaVeiculo> carga) {
        this.carga = carga;
        return this;
    }

    public CargaSoltaVeiculo addCargaItem(CargaSoltaVeiculo cargaItem) {
        this.carga.add(cargaItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaSoltaVeiculo {\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
                "}";
        return sb;
    }
}
