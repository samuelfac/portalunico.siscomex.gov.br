package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoApresentado", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoDocumentoApresentado")
public class TipoDocumentoApresentado {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "48", value = "Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.")
    /**
     * Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Estatística oficial", value = "Descrição código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.")
    /**
     * Descrição código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.
     **/
    private String descricao = null;

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
     * Código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoDocumentoApresentado codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição código do Tipo do documento que será apresentado na fronteira para esta carga nesta viagem.
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDocumentoApresentado descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoDocumentoApresentado {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
