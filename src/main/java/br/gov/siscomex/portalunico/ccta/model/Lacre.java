package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lacre", propOrder =
        {"numeroLacre"
        })

@XmlRootElement(name = "Lacre")
public class Lacre {

    @XmlElement(name = "numeroLacre", required = true)
    @ApiModelProperty(example = "LACRE1", required = true, value = "Número do lacre<br/> Tamanho Máximo: 25")
    /**
     * Número do lacre<br/> Tamanho Máximo: 25
     **/
    private String numeroLacre = null;

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
     * Número do lacre&lt;br/&gt; Tamanho Máximo: 25
     *
     * @return numeroLacre
     **/
    @JsonProperty("numeroLacre")
    @NotNull
    public String getNumeroLacre() {
        return numeroLacre;
    }

    public void setNumeroLacre(String numeroLacre) {
        this.numeroLacre = numeroLacre;
    }

    public Lacre numeroLacre(String numeroLacre) {
        this.numeroLacre = numeroLacre;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Lacre {\n" +
                "    numeroLacre: " + toIndentedString(numeroLacre) + "\n" +
                "}";
        return sb;
    }
}
