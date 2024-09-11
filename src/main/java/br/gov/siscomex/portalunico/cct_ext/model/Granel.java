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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Granel", propOrder =
        {"carga"
        })

@XmlRootElement(name = "Granel")
/**
 * Lista de granel
 **/
@ApiModel(description = "Lista de granel")
public class Granel {

    @XmlElement(name = "carga", required = true)
    @ApiModelProperty(required = true, value = "lista de granel")
    @Valid
    /**
     * lista de granel
     **/
    private List<Granel> carga = new ArrayList<>();

    /**
     * lista de granel
     *
     * @return carga
     **/
    @JsonProperty("carga")
    @NotNull
    public List<Granel> getCarga() {
        return carga;
    }

    public void setCarga(List<Granel> carga) {
        this.carga = carga;
    }

    public Granel carga(List<Granel> carga) {
        this.carga = carga;
        return this;
    }

    public Granel addCargaItem(Granel cargaItem) {
        this.carga.add(cargaItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Granel {\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
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

