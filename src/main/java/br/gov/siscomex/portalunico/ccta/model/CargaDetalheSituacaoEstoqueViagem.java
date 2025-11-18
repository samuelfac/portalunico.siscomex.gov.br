package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaDetalheSituacaoEstoqueViagem", propOrder =
        {"ra", "ul"
        })

@XmlRootElement(name = "CargaDetalheSituacaoEstoqueViagem")
public class CargaDetalheSituacaoEstoqueViagem {

    @XmlElement(name = "ra")
    @ApiModelProperty(value = "")
    @Valid
    private Recinto ra = null;

    @XmlElement(name = "ul")
    @ApiModelProperty(value = "")
    @Valid
    private UnidadeRfb ul = null;

    /**
     * Get ra
     *
     * @return ra
     **/
    @JsonProperty("ra")
    public Recinto getRa() {
        return ra;
    }

    public void setRa(Recinto ra) {
        this.ra = ra;
    }

    public CargaDetalheSituacaoEstoqueViagem ra(Recinto ra) {
        this.ra = ra;
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

    /**
     * Get ul
     *
     * @return ul
     **/
    @JsonProperty("ul")
    public UnidadeRfb getUl() {
        return ul;
    }

    public void setUl(UnidadeRfb ul) {
        this.ul = ul;
    }

    public CargaDetalheSituacaoEstoqueViagem ul(UnidadeRfb ul) {
        this.ul = ul;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaDetalheSituacaoEstoqueViagem {\n" +
                "    ra: " + toIndentedString(ra) + "\n" +
                "    ul: " + toIndentedString(ul) + "\n" +
                "}";
        return sb;
    }
}
