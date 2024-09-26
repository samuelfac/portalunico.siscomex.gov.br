package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecintoDTO", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "RecintoDTO")
/**
 * Dados que descrevem um Recinto Aduaneiro
 **/
@ApiModel(description = "Dados que descrevem um Recinto Aduaneiro")
public class RecintoDTO {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "7921301", value = "Código do Recinto Aduaneiro")
    /**
     * Código do Recinto Aduaneiro
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "EXEMPLO DE DESCRICAO DE RECINTO ADUANEIRO", value = "Descrição do Recinto Aduaneiro")
    /**
     * Descrição do Recinto Aduaneiro
     **/
    private String descricao = null;

    /**
     * Código do Recinto Aduaneiro
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

    public RecintoDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do Recinto Aduaneiro
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

    public RecintoDTO descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class RecintoDTO {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
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
}

