package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformaoComplementar", propOrder =
        {"infoCompl"
        })

@XmlRootElement(name = "InformaoComplementar")
public class InformaoComplementar {

    @XmlElement(name = "infoCompl")
    @ApiModelProperty(value = "Descrição da informação complementar.")
    /**
     * Descrição da informação complementar.
     **/
    private String infoCompl = null;

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
     * Descrição da informação complementar.
     *
     * @return infoCompl
     **/
    @JsonProperty("infoCompl")
    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public InformaoComplementar infoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class InformaoComplementar {\n" +
                "    infoCompl: " + toIndentedString(infoCompl) + "\n" +
                "}";
        return sb;
    }
}
