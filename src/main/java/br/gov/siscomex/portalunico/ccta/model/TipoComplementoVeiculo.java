package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoComplementoVeiculo", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoComplementoVeiculo")
public class TipoComplementoVeiculo {

    @XmlElement(name = "codigo")
    @ApiModelProperty(value = "Tipo do complemento do veículo")
    /**
     * Tipo do complemento do veículo
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Nome tipo do complemento do veículo")
    /**
     * Nome tipo do complemento do veículo
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
     * Tipo do complemento do veículo
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

    public TipoComplementoVeiculo codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Nome tipo do complemento do veículo
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

    public TipoComplementoVeiculo descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoComplementoVeiculo {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
