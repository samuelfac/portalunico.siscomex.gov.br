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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CavaloComReboque", propOrder =
        {"cavalo", "reboques"
        })

@XmlRootElement(name = "CavaloComReboque")
/**
 * Dados do cavalo com reboque
 **/
@ApiModel(description = "Dados do cavalo com reboque")
public class CavaloComReboque {

    @XmlElement(name = "cavalo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Cavalo cavalo = null;

    @XmlElement(name = "reboques", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Reboques reboques = null;

    /**
     * Get cavalo
     *
     * @return cavalo
     **/
    @JsonProperty("cavalo")
    @NotNull
    public Cavalo getCavalo() {
        return cavalo;
    }

    public void setCavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
    }

    public CavaloComReboque cavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
        return this;
    }

    /**
     * Get reboques
     *
     * @return reboques
     **/
    @JsonProperty("reboques")
    @NotNull
    public Reboques getReboques() {
        return reboques;
    }

    public void setReboques(Reboques reboques) {
        this.reboques = reboques;
    }

    public CavaloComReboque reboques(Reboques reboques) {
        this.reboques = reboques;
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

        String sb = "class CavaloComReboque {\n" +
                "    cavalo: " + toIndentedString(cavalo) + "\n" +
                "    reboques: " + toIndentedString(reboques) + "\n" +
                "}";
        return sb;
    }
}
