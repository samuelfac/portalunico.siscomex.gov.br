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
@XmlType(name = "EnvioSolicitaoDeDarf", propOrder =
        {"cnpjDeclarante", "contribuinte", "manifestos"
        })

@XmlRootElement(name = "EnvioSolicitaoDeDarf")
public class EnvioSolicitaoDeDarf {

    @XmlElement(name = "cnpjDeclarante", required = true)
    @ApiModelProperty(example = "63198378000161", required = true, value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String cnpjDeclarante = null;

    @XmlElement(name = "contribuinte")
    @ApiModelProperty(example = "63198378000161", value = "CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.")
    /**
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como '.', '-' e '/'.
     **/
    private String contribuinte = null;

    @XmlElement(name = "manifestos")
    @ApiModelProperty(value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<ManifestoDaSolicitaoDarf> manifestos = null;

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

    public EnvioSolicitaoDeDarf cnpjDeclarante(String cnpjDeclarante) {
        this.cnpjDeclarante = cnpjDeclarante;
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
     * CNPJ da empresa responsável composto por 14 caracteres numéricos. Não deve conter caracteres como &#39;.&#39;, &#39;-&#39; e &#39;/&#39;.
     *
     * @return contribuinte
     **/
    @JsonProperty("contribuinte")
    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    /**
     * Lista de manifestos.
     *
     * @return manifestos
     **/
    @JsonProperty("manifestos")
    public List<ManifestoDaSolicitaoDarf> getManifestos() {
        return manifestos;
    }

    public void setManifestos(List<ManifestoDaSolicitaoDarf> manifestos) {
        this.manifestos = manifestos;
    }

    public EnvioSolicitaoDeDarf manifestos(List<ManifestoDaSolicitaoDarf> manifestos) {
        this.manifestos = manifestos;
        return this;
    }

    public EnvioSolicitaoDeDarf addManifestosItem(ManifestoDaSolicitaoDarf manifestosItem) {
        this.manifestos.add(manifestosItem);
        return this;
    }

    public EnvioSolicitaoDeDarf contribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class EnvioSolicitaoDeDarf {\n" +
                "    cnpjDeclarante: " + toIndentedString(cnpjDeclarante) + "\n" +
                "    contribuinte: " + toIndentedString(contribuinte) + "\n" +
                "    manifestos: " + toIndentedString(manifestos) + "\n" +
                "}";
        return sb;
    }
}
