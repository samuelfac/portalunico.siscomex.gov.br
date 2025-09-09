package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDetalhadaViagem", propOrder =
        {"dataEmissaoDocumentoTransporte", "tipoDocumentoTransporte", "numeroDocumentoTransporte"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhadaViagem")
public class CargaRodoviariaDetalhadaViagem {

    @XmlElement(name = "dataEmissaoDocumentoTransporte")
    @ApiModelProperty(value = "")
    private LocalDate dataEmissaoDocumentoTransporte = null;

    @XmlElement(name = "tipoDocumentoTransporte")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDocumentoTransporte tipoDocumentoTransporte = null;

    @XmlElement(name = "numeroDocumentoTransporte")
    @ApiModelProperty(value = "")
    private String numeroDocumentoTransporte = null;

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
     * Get dataEmissaoDocumentoTransporte
     *
     * @return dataEmissaoDocumentoTransporte
     **/
    @JsonProperty("dataEmissaoDocumentoTransporte")
    public LocalDate getDataEmissaoDocumentoTransporte() {
        return dataEmissaoDocumentoTransporte;
    }

    public void setDataEmissaoDocumentoTransporte(LocalDate dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
    }

    public CargaRodoviariaDetalhadaViagem dataEmissaoDocumentoTransporte(LocalDate dataEmissaoDocumentoTransporte) {
        this.dataEmissaoDocumentoTransporte = dataEmissaoDocumentoTransporte;
        return this;
    }

    /**
     * Get tipoDocumentoTransporte
     *
     * @return tipoDocumentoTransporte
     **/
    @JsonProperty("tipoDocumentoTransporte")
    public TipoDocumentoTransporte getTipoDocumentoTransporte() {
        return tipoDocumentoTransporte;
    }

    public void setTipoDocumentoTransporte(TipoDocumentoTransporte tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public CargaRodoviariaDetalhadaViagem tipoDocumentoTransporte(TipoDocumentoTransporte tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
        return this;
    }

    /**
     * Get numeroDocumentoTransporte
     *
     * @return numeroDocumentoTransporte
     **/
    @JsonProperty("numeroDocumentoTransporte")
    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public CargaRodoviariaDetalhadaViagem numeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhadaViagem {\n" +
                "    dataEmissaoDocumentoTransporte: " + toIndentedString(dataEmissaoDocumentoTransporte) + "\n" +
                "    tipoDocumentoTransporte: " + toIndentedString(tipoDocumentoTransporte) + "\n" +
                "    numeroDocumentoTransporte: " + toIndentedString(numeroDocumentoTransporte) + "\n" +
                "}";
        return sb;
    }
}
