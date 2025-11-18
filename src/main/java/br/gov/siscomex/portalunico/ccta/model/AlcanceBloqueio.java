package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcanceBloqueio", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "AlcanceBloqueio")
public class AlcanceBloqueio {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "N", value = "Código do alcance")
    /**
     * Código do alcance
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Total", value = "Descrição do alcance")
    /**
     * Descrição do alcance
     **/
    private String descricao = null;

    /**
     * Código do alcance
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

    public AlcanceBloqueio codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do alcance
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

    public AlcanceBloqueio descricao(String descricao) {
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

    @Override
    public String toString() {

        String sb = "class AlcanceBloqueio {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
