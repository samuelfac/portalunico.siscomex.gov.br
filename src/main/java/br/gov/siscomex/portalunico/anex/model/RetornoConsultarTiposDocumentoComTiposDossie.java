package br.gov.siscomex.portalunico.anex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoConsultarTiposDocumentoComTiposDossie", propOrder =
        {"retornoConsultarTiposDocumentoComTiposDossieTiposDocumento", "retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes", "tiposDossie"
        })


/**
 * Retorno da consulta de tipos de documentos, tipos de dossiê e de órgãos anuentes.
 **/
@ApiModel(description = "Retorno da consulta de tipos de documentos, tipos de dossiê e de órgãos anuentes.")
public class RetornoConsultarTiposDocumentoComTiposDossie extends RetornoConsultarTiposDocumento {

    @XmlElement(name = "tiposDocumento")
    @ApiModelProperty(value = "Lista de tipos de documento.<br/>Esta lista somente será retornada quando a operação consultada possuir um único tipo de dossiê associado.<br/>Caso contrário, os tipos de documento virão aninhados dentro da propriedade 'tiposDossie'.")
    @Valid
    /**
     * Lista de tipos de documento.<br/>Esta lista somente será retornada quando a operação consultada possuir um único tipo de dossiê associado.<br/>Caso contrário, os tipos de documento virão aninhados dentro da propriedade 'tiposDossie'.
     **/
    private List<TipoDocumento> retornoConsultarTiposDocumentoComTiposDossieTiposDocumento = null;

    @XmlElement(name = "orgaosAnuentes", required = true)
    @ApiModelProperty(required = true, value = "Lista de órgãos anuentes.")
    @Valid
    /**
     * Lista de órgãos anuentes.
     **/
    private List<OrgaoAnuente> retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes = new ArrayList<>();

    @XmlElement(name = "tiposDossie")
    @ApiModelProperty(value = "Lista de tipos de dossiê.<br/>Esta lista somente será retornada quando a operação consultada possuir mais de um tipo de dossiê associado.<br/>As operações que permitem mais de um tipo de dossiê associado são: DI, LI, RE e DT.")
    @Valid
    /**
     * Lista de tipos de dossiê.<br/>Esta lista somente será retornada quando a operação consultada possuir mais de um tipo de dossiê associado.<br/>As operações que permitem mais de um tipo de dossiê associado são: DI, LI, RE e DT.
     **/
    private List<TipoDossie> tiposDossie = null;

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
     * Lista de tipos de documento.&lt;br/&gt;Esta lista somente será retornada quando a operação consultada possuir um único tipo de dossiê associado.&lt;br/&gt;Caso contrário, os tipos de documento virão aninhados dentro da propriedade &#39;tiposDossie&#39;.
     *
     * @return retornoConsultarTiposDocumentoComTiposDossieTiposDocumento
     **/
    @JsonProperty("tiposDocumento")
    public List<TipoDocumento> getRetornoConsultarTiposDocumentoComTiposDossieTiposDocumento() {
        return retornoConsultarTiposDocumentoComTiposDossieTiposDocumento;
    }

    public void setRetornoConsultarTiposDocumentoComTiposDossieTiposDocumento(List<TipoDocumento> retornoConsultarTiposDocumentoComTiposDossieTiposDocumento) {
        this.retornoConsultarTiposDocumentoComTiposDossieTiposDocumento = retornoConsultarTiposDocumentoComTiposDossieTiposDocumento;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie retornoConsultarTiposDocumentoComTiposDossieTiposDocumento(List<TipoDocumento> retornoConsultarTiposDocumentoComTiposDossieTiposDocumento) {
        this.retornoConsultarTiposDocumentoComTiposDossieTiposDocumento = retornoConsultarTiposDocumentoComTiposDossieTiposDocumento;
        return this;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie addRetornoConsultarTiposDocumentoComTiposDossieTiposDocumentoItem(TipoDocumento retornoConsultarTiposDocumentoComTiposDossieTiposDocumentoItem) {
        this.retornoConsultarTiposDocumentoComTiposDossieTiposDocumento.add(retornoConsultarTiposDocumentoComTiposDossieTiposDocumentoItem);
        return this;
    }

    /**
     * Lista de órgãos anuentes.
     *
     * @return retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes
     **/
    @JsonProperty("orgaosAnuentes")
    @NotNull
    public List<OrgaoAnuente> getRetornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes() {
        return retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes;
    }

    public void setRetornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes(List<OrgaoAnuente> retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes) {
        this.retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes = retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes(List<OrgaoAnuente> retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes) {
        this.retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes = retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes;
        return this;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie addRetornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentesItem(OrgaoAnuente retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentesItem) {
        this.retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes.add(retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentesItem);
        return this;
    }

    /**
     * Lista de tipos de dossiê.&lt;br/&gt;Esta lista somente será retornada quando a operação consultada possuir mais de um tipo de dossiê associado.&lt;br/&gt;As operações que permitem mais de um tipo de dossiê associado são: DI, LI, RE e DT.
     *
     * @return tiposDossie
     **/
    @JsonProperty("tiposDossie")
    public List<TipoDossie> getTiposDossie() {
        return tiposDossie;
    }

    public void setTiposDossie(List<TipoDossie> tiposDossie) {
        this.tiposDossie = tiposDossie;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie tiposDossie(List<TipoDossie> tiposDossie) {
        this.tiposDossie = tiposDossie;
        return this;
    }

    public RetornoConsultarTiposDocumentoComTiposDossie addTiposDossieItem(TipoDossie tiposDossieItem) {
        this.tiposDossie.add(tiposDossieItem);
        return this;
    }

    @Override
    public String toString() {
        String sb = "class RetornoConsultarTiposDocumentoComTiposDossie {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    retornoConsultarTiposDocumentoComTiposDossieTiposDocumento: " + toIndentedString(retornoConsultarTiposDocumentoComTiposDossieTiposDocumento) + "\n" +
                "    retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes: " + toIndentedString(retornoConsultarTiposDocumentoComTiposDossieOrgaosAnuentes) + "\n" +
                "    tiposDossie: " + toIndentedString(tiposDossie) + "\n" +
                "}";
        return sb;
    }
}
