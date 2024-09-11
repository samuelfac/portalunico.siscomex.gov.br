package br.gov.siscomex.portalunico.talpco.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Justificativa", propOrder =
        {"justificativa"
        })

@XmlRootElement(name = "Justificativa")
/**
 * Justificativa para operação em um LPCO
 **/
@ApiModel(description = "Justificativa para operação em um LPCO")
public class Justificativa {

    @XmlElement(name = "justificativa")
    @ApiModelProperty(example = "Texto livre", value = "Justificativa para a operação. Tamanho mínimo: 0<br>Tamanho máximo: 3800")
    /**
     * Justificativa para a operação. Tamanho mínimo: 0<br>Tamanho máximo: 3800
     **/
    private String justificativa = null;

    /**
     * Justificativa para a operação. Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 3800
     *
     * @return justificativa
     **/
    @JsonProperty("justificativa")
    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Justificativa justificativa(String justificativa) {
        this.justificativa = justificativa;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Justificativa {\n" +
                "    justificativa: " + toIndentedString(justificativa) + "\n" +
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

