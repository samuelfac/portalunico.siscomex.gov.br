package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcoesNFE", propOrder =
        {"recepcaoNFe"
        })

@XmlRootElement(name = "RecepcoesNFE")
/**
 * Recepções de Nota Fiscal Eletrônica<br>Máximo de ocorrências: 1
 **/
@ApiModel(description = "Recepções de Nota Fiscal Eletrônica<br>Máximo de ocorrências: 1")
public class RecepcoesNFE {

    @XmlElement(name = "recepcaoNFe")
    @ApiModelProperty(value = "")
    @Valid
    private List<RecepcaoNFE> recepcaoNFe = null;

    /**
     * Get recepcaoNFe
     *
     * @return recepcaoNFe
     **/
    @JsonProperty("recepcaoNFe")
    public List<RecepcaoNFE> getRecepcaoNFe() {
        return recepcaoNFe;
    }

    public void setRecepcaoNFe(List<RecepcaoNFE> recepcaoNFe) {
        this.recepcaoNFe = recepcaoNFe;
    }

    public RecepcoesNFE recepcaoNFe(List<RecepcaoNFE> recepcaoNFe) {
        this.recepcaoNFe = recepcaoNFe;
        return this;
    }

    public RecepcoesNFE addRecepcaoNFeItem(RecepcaoNFE recepcaoNFeItem) {
        this.recepcaoNFe.add(recepcaoNFeItem);
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

        String sb = "class RecepcoesNFE {\n" +
                "    recepcaoNFe: " + toIndentedString(recepcaoNFe) + "\n" +
                "}";
        return sb;
    }
}
