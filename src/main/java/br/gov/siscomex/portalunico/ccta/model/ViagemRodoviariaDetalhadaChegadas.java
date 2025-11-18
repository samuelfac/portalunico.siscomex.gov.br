package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViagemRodoviariaDetalhadaChegadas", propOrder =
        {"locais"
        })

@XmlRootElement(name = "ViagemRodoviariaDetalhadaChegadas")
public class ViagemRodoviariaDetalhadaChegadas {

    @XmlElement(name = "locais")
    @ApiModelProperty(value = "")
    @Valid
    private List<ViagemRodoviariaDetalhadaLocalChegada> locais = null;

    /**
     * Get locais
     *
     * @return locais
     **/
    @JsonProperty("locais")
    public List<ViagemRodoviariaDetalhadaLocalChegada> getLocais() {
        return locais;
    }

    public void setLocais(List<ViagemRodoviariaDetalhadaLocalChegada> locais) {
        this.locais = locais;
    }

    public ViagemRodoviariaDetalhadaChegadas locais(List<ViagemRodoviariaDetalhadaLocalChegada> locais) {
        this.locais = locais;
        return this;
    }

    public ViagemRodoviariaDetalhadaChegadas addLocaisItem(ViagemRodoviariaDetalhadaLocalChegada locaisItem) {
        this.locais.add(locaisItem);
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

        String sb = "class ViagemRodoviariaDetalhadaChegadas {\n" +
                "    locais: " + toIndentedString(locais) + "\n" +
                "}";
        return sb;
    }
}
