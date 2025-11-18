package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lacres", propOrder =
        {"lacre"
        })

@XmlRootElement(name = "Lacres")
public class Lacres {

    @XmlElement(name = "lacre", required = true)
    @ApiModelProperty(example = "ABC123", required = true, value = "Lacre")
    /**
     * Lacre
     **/
    private List<String> lacre = new ArrayList<>();

    /**
     * Lacre
     *
     * @return lacre
     **/
    @JsonProperty("lacre")
    @NotNull
    public List<String> getLacre() {
        return lacre;
    }

    public void setLacre(List<String> lacre) {
        this.lacre = lacre;
    }

    public Lacres lacre(List<String> lacre) {
        this.lacre = lacre;
        return this;
    }

    public Lacres addLacreItem(String lacreItem) {
        this.lacre.add(lacreItem);
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

        String sb = "class Lacres {\n" +
                "    lacre: " + toIndentedString(lacre) + "\n" +
                "}";
        return sb;
    }
}
