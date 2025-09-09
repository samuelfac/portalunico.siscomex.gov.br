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
@XmlType(name = "CargaSolta", propOrder =
        {"carga"
        })

@XmlRootElement(name = "CargaSolta")
/**
 * Lista de cargas soltas
 **/
@ApiModel(description = "Lista de cargas soltas")
public class CargaSolta {

    @XmlElement(name = "carga", required = true)
    @ApiModelProperty(required = true, value = "Dados da carga solta")
    @Valid
    /**
     * Dados da carga solta
     **/
    private List<TCargaSolta> carga = new ArrayList<>();

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
     * Dados da carga solta
     *
     * @return carga
     **/
    @JsonProperty("carga")
    @NotNull
    public List<TCargaSolta> getCarga() {
        return carga;
    }

    public void setCarga(List<TCargaSolta> carga) {
        this.carga = carga;
    }

    public CargaSolta carga(List<TCargaSolta> carga) {
        this.carga = carga;
        return this;
    }

    public CargaSolta addCargaItem(TCargaSolta cargaItem) {
        this.carga.add(cargaItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaSolta {\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
                "}";
        return sb;
    }
}
