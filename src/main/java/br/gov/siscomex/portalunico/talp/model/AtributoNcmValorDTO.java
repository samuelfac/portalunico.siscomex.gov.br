package br.gov.siscomex.portalunico.talp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtributoNcmValorDTO", propOrder =
        {"listaValores", "codigoAtributoNCM"
        })

@XmlRootElement(name = "AtributoNcmValorDTO")
public class AtributoNcmValorDTO {

    @XmlElement(name = "listaValores")
    @ApiModelProperty(value = "")
    private List<String> listaValores = null;

    @XmlElement(name = "codigoAtributoNCM")
    @ApiModelProperty(value = "")
    private String codigoAtributoNCM = null;

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
     * Get listaValores
     *
     * @return listaValores
     **/
    @JsonProperty("listaValores")
    public List<String> getListaValores() {
        return listaValores;
    }

    public void setListaValores(List<String> listaValores) {
        this.listaValores = listaValores;
    }

    public AtributoNcmValorDTO listaValores(List<String> listaValores) {
        this.listaValores = listaValores;
        return this;
    }

    public AtributoNcmValorDTO addListaValoresItem(String listaValoresItem) {
        this.listaValores.add(listaValoresItem);
        return this;
    }

    /**
     * Get codigoAtributoNCM
     *
     * @return codigoAtributoNCM
     **/
    @JsonProperty("codigoAtributoNCM")
    public String getCodigoAtributoNCM() {
        return codigoAtributoNCM;
    }

    public void setCodigoAtributoNCM(String codigoAtributoNCM) {
        this.codigoAtributoNCM = codigoAtributoNCM;
    }

    public AtributoNcmValorDTO codigoAtributoNCM(String codigoAtributoNCM) {
        this.codigoAtributoNCM = codigoAtributoNCM;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class AtributoNcmValorDTO {\n" +
                "    listaValores: " + toIndentedString(listaValores) + "\n" +
                "    codigoAtributoNCM: " + toIndentedString(codigoAtributoNCM) + "\n" +
                "}";
        return sb;
    }
}
