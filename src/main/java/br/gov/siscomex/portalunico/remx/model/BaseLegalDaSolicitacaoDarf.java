package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLegalDaSolicitacaoDarf", propOrder =
        {"baseLegalMulta"
        })

@XmlRootElement(name = "BaseLegalDaSolicitacaoDarf")
public class BaseLegalDaSolicitacaoDarf {

    @XmlElement(name = "baseLegalMulta")
    @ApiModelProperty(value = "Base legal da multa a ser paga para a remessa a ser incluída no DARF.")
    /**
     * Base legal da multa a ser paga para a remessa a ser incluída no DARF.
     **/
    private String baseLegalMulta = null;

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
     * Base legal da multa a ser paga para a remessa a ser incluída no DARF.
     *
     * @return baseLegalMulta
     **/
    @JsonProperty("baseLegalMulta")
    @Size(min = 1, max = 18)
    public String getBaseLegalMulta() {
        return baseLegalMulta;
    }

    public void setBaseLegalMulta(String baseLegalMulta) {
        this.baseLegalMulta = baseLegalMulta;
    }

    public BaseLegalDaSolicitacaoDarf baseLegalMulta(String baseLegalMulta) {
        this.baseLegalMulta = baseLegalMulta;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class BaseLegalDaSolicitacaoDarf {\n" +
                "    baseLegalMulta: " + toIndentedString(baseLegalMulta) + "\n" +
                "}";
        return sb;
    }
}
