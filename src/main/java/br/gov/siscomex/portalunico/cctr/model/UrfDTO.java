package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrfDTO", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "UrfDTO")
public class UrfDTO {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "0717600", value = "Código da Unidade da Receita Federal")
    /**
     * Código da Unidade da Receita Federal
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "PORTO DO RIO DE JANEIRO", value = "Descrição da Unidade da Receita Federal")
    /**
     * Descrição da Unidade da Receita Federal
     **/
    private String descricao = null;

    /**
     * Código da Unidade da Receita Federal
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

    public UrfDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da Unidade da Receita Federal
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

    public UrfDTO descricao(String descricao) {
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

        String sb = "class UrfDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
