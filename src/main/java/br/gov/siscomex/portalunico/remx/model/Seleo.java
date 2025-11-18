package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seleo", propOrder =
        {"idOrgaoResponsavelSelecao", "nomeFiscalResp", "situacaoFiscalizacao"
        })

@XmlRootElement(name = "Seleo")
public class Seleo {

    @XmlElement(name = "idOrgaoResponsavelSelecao")
    @ApiModelProperty(value = "Identificação do órgão responsável pela seleção para fiscalização.")
    /**
     * Identificação do órgão responsável pela seleção para fiscalização.
     **/
    private String idOrgaoResponsavelSelecao = null;

    @XmlElement(name = "nomeFiscalResp")
    @ApiModelProperty(value = "Nome do fiscal responsável pela seleção manual da remessa para fiscalização.")
    /**
     * Nome do fiscal responsável pela seleção manual da remessa para fiscalização.
     **/
    private String nomeFiscalResp = null;

    @XmlElement(name = "situacaoFiscalizacao")
    @ApiModelProperty(value = "Código da situação da fiscalização. Composto por até 2 caracteres numéricos.")
    /**
     * Código da situação da fiscalização. Composto por até 2 caracteres numéricos.
     **/
    private String situacaoFiscalizacao = null;

    /**
     * Identificação do órgão responsável pela seleção para fiscalização.
     *
     * @return idOrgaoResponsavelSelecao
     **/
    @JsonProperty("idOrgaoResponsavelSelecao")
    public String getIdOrgaoResponsavelSelecao() {
        return idOrgaoResponsavelSelecao;
    }

    public void setIdOrgaoResponsavelSelecao(String idOrgaoResponsavelSelecao) {
        this.idOrgaoResponsavelSelecao = idOrgaoResponsavelSelecao;
    }

    public Seleo idOrgaoResponsavelSelecao(String idOrgaoResponsavelSelecao) {
        this.idOrgaoResponsavelSelecao = idOrgaoResponsavelSelecao;
        return this;
    }

    /**
     * Nome do fiscal responsável pela seleção manual da remessa para fiscalização.
     *
     * @return nomeFiscalResp
     **/
    @JsonProperty("nomeFiscalResp")
    public String getNomeFiscalResp() {
        return nomeFiscalResp;
    }

    public void setNomeFiscalResp(String nomeFiscalResp) {
        this.nomeFiscalResp = nomeFiscalResp;
    }

    public Seleo nomeFiscalResp(String nomeFiscalResp) {
        this.nomeFiscalResp = nomeFiscalResp;
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
     * Código da situação da fiscalização. Composto por até 2 caracteres numéricos.
     *
     * @return situacaoFiscalizacao
     **/
    @JsonProperty("situacaoFiscalizacao")
    public String getSituacaoFiscalizacao() {
        return situacaoFiscalizacao;
    }

    public void setSituacaoFiscalizacao(String situacaoFiscalizacao) {
        this.situacaoFiscalizacao = situacaoFiscalizacao;
    }

    public Seleo situacaoFiscalizacao(String situacaoFiscalizacao) {
        this.situacaoFiscalizacao = situacaoFiscalizacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Seleo {\n" +
                "    idOrgaoResponsavelSelecao: " + toIndentedString(idOrgaoResponsavelSelecao) + "\n" +
                "    nomeFiscalResp: " + toIndentedString(nomeFiscalResp) + "\n" +
                "    situacaoFiscalizacao: " + toIndentedString(situacaoFiscalizacao) + "\n" +
                "}";
        return sb;
    }
}
