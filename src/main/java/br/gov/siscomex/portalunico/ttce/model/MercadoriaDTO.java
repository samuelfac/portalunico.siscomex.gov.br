package br.gov.siscomex.portalunico.ttce.model;

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
@XmlType(name = "MercadoriaDTO", propOrder =
        {"atributos"
        })

@XmlRootElement(name = "MercadoriaDTO")
/**
 * DTO que representa uma Mercadoria.
 **/
@ApiModel(description = "DTO que representa uma Mercadoria.")
public class MercadoriaDTO {

    @XmlElement(name = "atributos", required = true)
    @ApiModelProperty(required = true, value = "Combinação de características (Atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.")
    @Valid
    /**
     * Combinação de características (Atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.
     **/
    private List<AtributoMercadoriaDTO> atributos = new ArrayList<>();

    /**
     * Combinação de características (Atributos) que determinam o enquadramento de uma mercadoria neste Tratamento Tributário.
     *
     * @return atributos
     **/
    @JsonProperty("atributos")
    @NotNull
    public List<AtributoMercadoriaDTO> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<AtributoMercadoriaDTO> atributos) {
        this.atributos = atributos;
    }

    public MercadoriaDTO atributos(List<AtributoMercadoriaDTO> atributos) {
        this.atributos = atributos;
        return this;
    }

    public MercadoriaDTO addAtributosItem(AtributoMercadoriaDTO atributosItem) {
        this.atributos.add(atributosItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class MercadoriaDTO {\n" +
                "    atributos: " + toIndentedString(atributos) + "\n" +
                "}";
        return sb;
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
}

