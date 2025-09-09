package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawbackConsultaItemCover", propOrder =
        {"itemAtoDuimpInsumo", "numeroAtoDuimpInsumo"
        })

@XmlRootElement(name = "DrawbackConsultaItemCover")
/**
 * Dados relativos a Ato Concessório.<br>Origem: Sistema Drawback Isenção - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description = "Dados relativos a Ato Concessório.<br>Origem: Sistema Drawback Isenção - https://api-docs.portalunico.siscomex.gov.br/")
public class DrawbackConsultaItemCover {

    @XmlElement(name = "itemAtoDuimpInsumo")
    @ApiModelProperty(value = "Número do Item do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.<br>Formato: Inteiro, com até 6 dígitos")
    /**
     * Número do Item do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.<br>Formato: Inteiro, com até 6 dígitos
     **/
    private Integer itemAtoDuimpInsumo = null;

    @XmlElement(name = "numeroAtoDuimpInsumo")
    @ApiModelProperty(value = "Número do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.<br>Tamanho: 9")
    /**
     * Número do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.<br>Tamanho: 9
     **/
    private String numeroAtoDuimpInsumo = null;

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
     * Número do Item do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.&lt;br&gt;Formato: Inteiro, com até 6 dígitos
     *
     * @return itemAtoDuimpInsumo
     **/
    @JsonProperty("itemAtoDuimpInsumo")
    public Integer getItemAtoDuimpInsumo() {
        return itemAtoDuimpInsumo;
    }

    public void setItemAtoDuimpInsumo(Integer itemAtoDuimpInsumo) {
        this.itemAtoDuimpInsumo = itemAtoDuimpInsumo;
    }

    public DrawbackConsultaItemCover itemAtoDuimpInsumo(Integer itemAtoDuimpInsumo) {
        this.itemAtoDuimpInsumo = itemAtoDuimpInsumo;
        return this;
    }

    /**
     * Número do Ato vinculado a Duimp de insumo (originária) solicitada pelo Drawback Isenção.&lt;br&gt;Tamanho: 9
     *
     * @return numeroAtoDuimpInsumo
     **/
    @JsonProperty("numeroAtoDuimpInsumo")
    public String getNumeroAtoDuimpInsumo() {
        return numeroAtoDuimpInsumo;
    }

    public void setNumeroAtoDuimpInsumo(String numeroAtoDuimpInsumo) {
        this.numeroAtoDuimpInsumo = numeroAtoDuimpInsumo;
    }

    public DrawbackConsultaItemCover numeroAtoDuimpInsumo(String numeroAtoDuimpInsumo) {
        this.numeroAtoDuimpInsumo = numeroAtoDuimpInsumo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DrawbackConsultaItemCover {\n" +
                "    itemAtoDuimpInsumo: " + toIndentedString(itemAtoDuimpInsumo) + "\n" +
                "    numeroAtoDuimpInsumo: " + toIndentedString(numeroAtoDuimpInsumo) + "\n" +
                "}";
        return sb;
    }
}
