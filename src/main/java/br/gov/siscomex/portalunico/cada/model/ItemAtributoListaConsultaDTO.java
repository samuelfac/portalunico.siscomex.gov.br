package br.gov.siscomex.portalunico.cada.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAtributoListaConsultaDTO", propOrder =
        {"filtro", "codigo", "descricao"
        })

@XmlRootElement(name = "ItemAtributoListaConsultaDTO")
public class ItemAtributoListaConsultaDTO {

    @XmlElement(name = "filtro")
    @ApiModelProperty(value = "")
    private String filtro = null;

    @XmlElement(name = "codigo")
    @ApiModelProperty(value = "")
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "")
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
     * Get filtro
     *
     * @return filtro
     **/
    @JsonProperty("filtro")
    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public ItemAtributoListaConsultaDTO filtro(String filtro) {
        this.filtro = filtro;
        return this;
    }

    /**
     * Get codigo
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

    public ItemAtributoListaConsultaDTO codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Get descricao
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

    public ItemAtributoListaConsultaDTO descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ItemAtributoListaConsultaDTO {\n" +
                "    filtro: " + toIndentedString(filtro) + "\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
