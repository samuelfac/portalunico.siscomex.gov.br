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
@XmlType(name = "DadosDocumentoTransporte", propOrder =
        {"localSaida"
        })

@XmlRootElement(name = "DadosDocumentoTransporte")
/**
 * Dados do documento de transporte
 **/
@ApiModel(description = "Dados do documento de transporte")
public class DadosDocumentoTransporte {

    @XmlElement(name = "localSaida", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private LocalSaida localSaida = null;

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
     * Get localSaida
     *
     * @return localSaida
     **/
    @JsonProperty("localSaida")
    @NotNull
    public LocalSaida getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(LocalSaida localSaida) {
        this.localSaida = localSaida;
    }

    public DadosDocumentoTransporte localSaida(LocalSaida localSaida) {
        this.localSaida = localSaida;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosDocumentoTransporte {\n" +
                "    localSaida: " + toIndentedString(localSaida) + "\n" +
                "}";
        return sb;
    }
}
