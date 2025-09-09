package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdentificacaoFiscal", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoIdentificacaoFiscal")
public class TipoIdentificacaoFiscal {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "J", value = "Código de tipo de identificacao fiscal")
    /**
     * Código de tipo de identificacao fiscal
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "CNPJ", value = "Descrição de tipo de identificacao fiscal")
    /**
     * Descrição de tipo de identificacao fiscal
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
     * Código de tipo de identificacao fiscal
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

    public TipoIdentificacaoFiscal codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição de tipo de identificacao fiscal
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

    public TipoIdentificacaoFiscal descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoIdentificacaoFiscal {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
