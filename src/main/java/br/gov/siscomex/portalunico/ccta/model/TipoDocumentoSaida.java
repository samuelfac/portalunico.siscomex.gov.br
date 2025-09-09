package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoSaida", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoDocumentoSaida")
public class TipoDocumentoSaida {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "99", value = "Código do Tipo do documento de saída")
    /**
     * Código do Tipo do documento de saída
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "DUIMP", value = "Nome  tipo do documento de saída")
    /**
     * Nome  tipo do documento de saída
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
     * Código do Tipo do documento de saída
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

    public TipoDocumentoSaida codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome  tipo do documento de saída
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

    public TipoDocumentoSaida descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoDocumentoSaida {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
