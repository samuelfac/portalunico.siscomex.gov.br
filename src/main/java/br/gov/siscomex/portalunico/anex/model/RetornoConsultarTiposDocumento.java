package br.gov.siscomex.portalunico.anex.model;

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
@XmlType(name = "RetornoConsultarTiposDocumento", propOrder =
        {"tiposDocumento", "orgaosAnuentes"
        })

@XmlRootElement(name = "RetornoConsultarTiposDocumento")
/**
 * Retorno da consulta de tipos de documentos e de órgãos anuentes.
 **/
@ApiModel(description = "Retorno da consulta de tipos de documentos e de órgãos anuentes.")
public class RetornoConsultarTiposDocumento {

    @XmlElement(name = "tiposDocumento")
    @ApiModelProperty(value = "Lista de tipos de documento.")
    @Valid
    /**
     * Lista de tipos de documento.
     **/
    private List<TipoDocumento> tiposDocumento = null;

    @XmlElement(name = "orgaosAnuentes", required = true)
    @ApiModelProperty(required = true, value = "Lista de órgãos anuentes.")
    @Valid
    /**
     * Lista de órgãos anuentes.
     **/
    private List<OrgaoAnuente> orgaosAnuentes = new ArrayList<>();

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
     * Lista de tipos de documento.
     *
     * @return tiposDocumento
     **/
    @JsonProperty("tiposDocumento")
    public List<TipoDocumento> getTiposDocumento() {
        return tiposDocumento;
    }

    public void setTiposDocumento(List<TipoDocumento> tiposDocumento) {
        this.tiposDocumento = tiposDocumento;
    }

    public RetornoConsultarTiposDocumento tiposDocumento(List<TipoDocumento> tiposDocumento) {
        this.tiposDocumento = tiposDocumento;
        return this;
    }

    public RetornoConsultarTiposDocumento addTiposDocumentoItem(TipoDocumento tiposDocumentoItem) {
        this.tiposDocumento.add(tiposDocumentoItem);
        return this;
    }

    /**
     * Lista de órgãos anuentes.
     *
     * @return orgaosAnuentes
     **/
    @JsonProperty("orgaosAnuentes")
    @NotNull
    public List<OrgaoAnuente> getOrgaosAnuentes() {
        return orgaosAnuentes;
    }

    public void setOrgaosAnuentes(List<OrgaoAnuente> orgaosAnuentes) {
        this.orgaosAnuentes = orgaosAnuentes;
    }

    public RetornoConsultarTiposDocumento orgaosAnuentes(List<OrgaoAnuente> orgaosAnuentes) {
        this.orgaosAnuentes = orgaosAnuentes;
        return this;
    }

    public RetornoConsultarTiposDocumento addOrgaosAnuentesItem(OrgaoAnuente orgaosAnuentesItem) {
        this.orgaosAnuentes.add(orgaosAnuentesItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RetornoConsultarTiposDocumento {\n" +
                "    tiposDocumento: " + toIndentedString(tiposDocumento) + "\n" +
                "    orgaosAnuentes: " + toIndentedString(orgaosAnuentes) + "\n" +
                "}";
        return sb;
    }
}
