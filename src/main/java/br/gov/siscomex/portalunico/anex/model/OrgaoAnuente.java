package br.gov.siscomex.portalunico.anex.model;

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
@XmlType(name = "OrgaoAnuente", propOrder =
        {"descricao", "sigla"
        })

@XmlRootElement(name = "OrgaoAnuente")
/**
 * Órgão anuente.
 **/
@ApiModel(description = "Órgão anuente.")
public class OrgaoAnuente {

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(example = "RFB - RECEITA FEDERAL DO BRASIL", required = true, value = "Descrição do órgão anuente.<br/>Tamanho máximo: 255")
    /**
     * Descrição do órgão anuente.<br/>Tamanho máximo: 255
     **/
    private String descricao = null;

    @XmlElement(name = "sigla", required = true)
    @ApiModelProperty(example = "RECEITA", required = true, value = "Sigla do órgão anuente.<br/>Tamanho máximo: 255")
    /**
     * Sigla do órgão anuente.<br/>Tamanho máximo: 255
     **/
    private String sigla = null;

    /**
     * Descrição do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public OrgaoAnuente descricao(String descricao) {
        this.descricao = descricao;
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
     * Sigla do órgão anuente.&lt;br/&gt;Tamanho máximo: 255
     *
     * @return sigla
     **/
    @JsonProperty("sigla")
    @NotNull
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public OrgaoAnuente sigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OrgaoAnuente {\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    sigla: " + toIndentedString(sigla) + "\n" +
                "}";
        return sb;
    }
}
