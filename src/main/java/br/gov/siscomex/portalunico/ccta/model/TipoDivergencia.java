package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDivergencia", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoDivergencia")
public class TipoDivergencia {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "1", value = "Código do tipo de divergência")
    /**
     * Código do tipo de divergência
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Divergência de Peso", value = "Descrição do tipo de divergência")
    /**
     * Descrição do tipo de divergência
     **/
    private String descricao = null;

    /**
     * Código do tipo de divergência
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

    public TipoDivergencia codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do tipo de divergência
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

    public TipoDivergencia descricao(String descricao) {
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

        String sb = "class TipoDivergencia {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
