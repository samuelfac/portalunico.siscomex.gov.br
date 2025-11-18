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
@XmlType(name = "Veiculos", propOrder =
        {"carga"
        })

@XmlRootElement(name = "Veiculos")
/**
 * Veículos envolvidos na operação
 **/
@ApiModel(description = "Veículos envolvidos na operação")
public class Veiculos {

    @XmlElement(name = "carga", required = true)
    @ApiModelProperty(required = true, value = "Dados de veículo")
    @Valid
    /**
     * Dados de veículo
     **/
    private List<TVeiculo> carga = new ArrayList<>();

    /**
     * Dados de veículo
     *
     * @return carga
     **/
    @JsonProperty("carga")
    @NotNull
    public List<TVeiculo> getCarga() {
        return carga;
    }

    public void setCarga(List<TVeiculo> carga) {
        this.carga = carga;
    }

    public Veiculos carga(List<TVeiculo> carga) {
        this.carga = carga;
        return this;
    }

    public Veiculos addCargaItem(TVeiculo cargaItem) {
        this.carga.add(cargaItem);
        return this;
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

    @Override
    public String toString() {

        String sb = "class Veiculos {\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
                "}";
        return sb;
    }
}
