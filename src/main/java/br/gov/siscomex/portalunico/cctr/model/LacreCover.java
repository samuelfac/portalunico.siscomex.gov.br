package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LacreCover", propOrder =
        {"lacre"
        })

@XmlRootElement(name = "LacreCover")
/**
 * Código do lacre
 **/
@ApiModel(description = "Código do lacre")
public class LacreCover {

    @XmlElement(name = "lacre", required = true)
    @ApiModelProperty(example = "ABC123", required = true, value = "Código do lacre aplicado ao contêiner<br>Tamanho mínimo: 1<br>Tamanho máximo: 15")
    /**
     * Código do lacre aplicado ao contêiner<br>Tamanho mínimo: 1<br>Tamanho máximo: 15
     **/
    private String lacre = null;

    /**
     * Código do lacre aplicado ao contêiner&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 15
     *
     * @return lacre
     **/
    @JsonProperty("lacre")
    @NotNull
    @Pattern(regexp = "[0-9a-zA-Z]{1,15}")
    public String getLacre() {
        return lacre;
    }

    public void setLacre(String lacre) {
        this.lacre = lacre;
    }

    public LacreCover lacre(String lacre) {
        this.lacre = lacre;
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

        String sb = "class LacreCover {\n" +
                "    lacre: " + toIndentedString(lacre) + "\n" +
                "}";
        return sb;
    }
}
