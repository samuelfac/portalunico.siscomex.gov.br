package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestoDaSolicitaoDeDevoluo", propOrder =
        {"numeroManifesto", "remessas"
        })

@XmlRootElement(name = "ManifestoDaSolicitaoDeDevoluo")
public class ManifestoDaSolicitaoDeDevoluo {

    @XmlElement(name = "numeroManifesto", required = true)
    @ApiModelProperty(example = "SRP201300000017", required = true, value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "remessas")
    @ApiModelProperty(value = "Lista de remessas.")
    @Valid
    /**
     * Lista de remessas.
     **/
    private List<RemessaDaSolicitaoDeDevoluo> remessas = null;

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    @NotNull
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public ManifestoDaSolicitaoDeDevoluo numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Lista de remessas.
     *
     * @return remessas
     **/
    @JsonProperty("remessas")
    public List<RemessaDaSolicitaoDeDevoluo> getRemessas() {
        return remessas;
    }

    public void setRemessas(List<RemessaDaSolicitaoDeDevoluo> remessas) {
        this.remessas = remessas;
    }

    public ManifestoDaSolicitaoDeDevoluo remessas(List<RemessaDaSolicitaoDeDevoluo> remessas) {
        this.remessas = remessas;
        return this;
    }

    public ManifestoDaSolicitaoDeDevoluo addRemessasItem(RemessaDaSolicitaoDeDevoluo remessasItem) {
        this.remessas.add(remessasItem);
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

        String sb = "class ManifestoDaSolicitaoDeDevoluo {\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    remessas: " + toIndentedString(remessas) + "\n" +
                "}";
        return sb;
    }
}
