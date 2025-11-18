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
@XmlType(name = "RotasPassagem", propOrder =
        {"rotaPassagem"
        })

@XmlRootElement(name = "RotasPassagem")
/**
 * Rotas de Passagem
 **/
@ApiModel(description = "Rotas de Passagem")
public class RotasPassagem {

    @XmlElement(name = "rotaPassagem")
    @ApiModelProperty(value = "Rotas de Passagem")
    @Valid
    /**
     * Rotas de Passagem
     **/
    private List<RotaPassagem> rotaPassagem = null;

    /**
     * Rotas de Passagem
     *
     * @return rotaPassagem
     **/
    @JsonProperty("rotaPassagem")
    public List<RotaPassagem> getRotaPassagem() {
        return rotaPassagem;
    }

    public void setRotaPassagem(List<RotaPassagem> rotaPassagem) {
        this.rotaPassagem = rotaPassagem;
    }

    public RotasPassagem rotaPassagem(List<RotaPassagem> rotaPassagem) {
        this.rotaPassagem = rotaPassagem;
        return this;
    }

    public RotasPassagem addRotaPassagemItem(RotaPassagem rotaPassagemItem) {
        this.rotaPassagem.add(rotaPassagemItem);
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

        String sb = "class RotasPassagem {\n" +
                "    rotaPassagem: " + toIndentedString(rotaPassagem) + "\n" +
                "}";
        return sb;
    }
}
