package br.gov.siscomex.portalunico.duimp_api_receita.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegimeCover", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "RegimeCover")
/**
 * Regime tributário.
 **/
@ApiModel(description = "Regime tributário.")
public class RegimeCover {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código do regime tributário.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário.")
    /**
     * Código do regime tributário.<br>Dominio: Regimes tributários existentes no sistema Tratamento Tributário.
     **/
    private Integer codigo = null;

    /**
     * Código do regime tributário.&lt;br&gt;Dominio: Regimes tributários existentes no sistema Tratamento Tributário.
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public RegimeCover codigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class RegimeCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
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

