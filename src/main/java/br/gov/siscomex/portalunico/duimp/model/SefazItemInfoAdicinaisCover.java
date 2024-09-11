package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazItemInfoAdicinaisCover", propOrder =
        {"dataHoraFatoGerador"
        })

@XmlRootElement(name = "SefazItemInfoAdicinaisCover")
/**
 * Informações adicionais do item
 **/
@ApiModel(description = "Informações adicionais do item ")
public class SefazItemInfoAdicinaisCover {

    @XmlElement(name = "dataHoraFatoGerador", required = true)
    @ApiModelProperty(required = true, value = "Data do fato gerador associado à Duimp para efeito de conversão de valores.")
    /**
     * Data do fato gerador associado à Duimp para efeito de conversão de valores.
     **/
    private OffsetDateTime dataHoraFatoGerador = null;

    /**
     * Data do fato gerador associado à Duimp para efeito de conversão de valores.
     *
     * @return dataHoraFatoGerador
     **/
    @JsonProperty("dataHoraFatoGerador")
    @NotNull
    public OffsetDateTime getDataHoraFatoGerador() {
        return dataHoraFatoGerador;
    }

    public void setDataHoraFatoGerador(OffsetDateTime dataHoraFatoGerador) {
        this.dataHoraFatoGerador = dataHoraFatoGerador;
    }

    public SefazItemInfoAdicinaisCover dataHoraFatoGerador(OffsetDateTime dataHoraFatoGerador) {
        this.dataHoraFatoGerador = dataHoraFatoGerador;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazItemInfoAdicinaisCover {\n" +
                "    dataHoraFatoGerador: " + toIndentedString(dataHoraFatoGerador) + "\n" +
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

