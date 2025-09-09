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
@XmlType(name = "EnvioSolicitaoDeDevoluo", propOrder =
        {"cnpjDeclarante", "manifestos"
        })

@XmlRootElement(name = "EnvioSolicitaoDeDevoluo")
public class EnvioSolicitaoDeDevoluo {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "63198378000161", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "manifestos")
    @ApiModelProperty(value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<ManifestoDaSolicitaoDeDevoluo> manifestos = null;

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
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return cnpjDeclarante
     **/
    @JsonProperty("cnpjDeclarante")
    @NotNull
    public String getCnpjDeclarante() {
        return cnpjDeclarante;
    }

    public void setCnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
    }

    public EnvioSolicitaoDeDevoluo cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
        return this;
    }

    /**
     * Lista de manifestos.
     *
     * @return manifestos
     **/
    @JsonProperty("manifestos")
    public List<ManifestoDaSolicitaoDeDevoluo> getManifestos() {
        return manifestos;
    }

    public void setManifestos(List<ManifestoDaSolicitaoDeDevoluo> manifestos) {
        this.manifestos = manifestos;
    }

    public EnvioSolicitaoDeDevoluo manifestos(List<ManifestoDaSolicitaoDeDevoluo> manifestos) {
        this.manifestos = manifestos;
        return this;
    }

    public EnvioSolicitaoDeDevoluo addManifestosItem(ManifestoDaSolicitaoDeDevoluo manifestosItem) {
        this.manifestos.add(manifestosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EnvioSolicitaoDeDevoluo {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    manifestos: " + toIndentedString(manifestos) + "\n" +
                "}";
        return sb;
    }
}
