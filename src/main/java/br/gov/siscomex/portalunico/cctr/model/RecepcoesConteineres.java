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
@XmlType(name = "RecepcoesConteineres", propOrder =
        {"recepcaoConteiner"
        })

@XmlRootElement(name = "RecepcoesConteineres")
/**
 * Recepções por Contêineres<br>Máximo de ocorrências: 1
 **/
@ApiModel(description = "Recepções por Contêineres<br>Máximo de ocorrências: 1")
public class RecepcoesConteineres {

    @XmlElement(name = "recepcaoConteiner", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private RecepcaoConteiner recepcaoConteiner = null;

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
     * Get recepcaoConteiner
     *
     * @return recepcaoConteiner
     **/
    @JsonProperty("recepcaoConteiner")
    @NotNull
    public RecepcaoConteiner getRecepcaoConteiner() {
        return recepcaoConteiner;
    }

    public void setRecepcaoConteiner(RecepcaoConteiner recepcaoConteiner) {
        this.recepcaoConteiner = recepcaoConteiner;
    }

    public RecepcoesConteineres recepcaoConteiner(RecepcaoConteiner recepcaoConteiner) {
        this.recepcaoConteiner = recepcaoConteiner;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RecepcoesConteineres {\n" +
                "    recepcaoConteiner: " + toIndentedString(recepcaoConteiner) + "\n" +
                "}";
        return sb;
    }
}
