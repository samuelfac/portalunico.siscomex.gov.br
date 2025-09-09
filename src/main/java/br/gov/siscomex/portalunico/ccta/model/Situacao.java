package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Situacao", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "Situacao")
public class Situacao {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "1", value = "Código da situação")
    /**
     * Código da situação
     **/
    private Integer codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Manifestada", value = "Descrição da situação")
    /**
     * Descrição da situação
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
     * Código da situação
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Situacao codigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da situação
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

    public Situacao descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Situacao {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
