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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reboques", propOrder =
        {"reboque"
        })

@XmlRootElement(name = "Reboques")
/**
 * Lista de reboques
 **/
@ApiModel(description = "Lista de reboques")
public class Reboques {

    @XmlElement(name = "reboque", required = true)
    @ApiModelProperty(required = true, value = "Lista de reboques")
    @Valid
    /**
     * Lista de reboques
     **/
    private List<Reboque> reboque = new ArrayList<>();

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
     * Lista de reboques
     *
     * @return reboque
     **/
    @JsonProperty("reboque")
    @NotNull
    public List<Reboque> getReboque() {
        return reboque;
    }

    public void setReboque(List<Reboque> reboque) {
        this.reboque = reboque;
    }

    public Reboques reboque(List<Reboque> reboque) {
        this.reboque = reboque;
        return this;
    }

    public Reboques addReboqueItem(Reboque reboqueItem) {
        this.reboque.add(reboqueItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Reboques {\n" +
                "    reboque: " + toIndentedString(reboque) + "\n" +
                "}";
        return sb;
    }
}
