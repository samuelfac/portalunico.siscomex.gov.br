package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoItemCargaCrt", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoItemCargaCrt")
public class TipoItemCargaCrt {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "3", value = "Identifica qual o tipo de Carga<br/> (3), Veículo (4), Carga Solta (2), Conteiner (1)")
    /**
     * Identifica qual o tipo de Carga<br/> (3), Veículo (4), Carga Solta (2), Conteiner (1)
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Granel", value = "Descrição do tipo de item de carga do CRT")
    /**
     * Descrição do tipo de item de carga do CRT
     **/
    private String descricao = null;

    /**
     * Identifica qual o tipo de Carga&lt;br/&gt; (3), Veículo (4), Carga Solta (2), Conteiner (1)
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

    public TipoItemCargaCrt codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do tipo de item de carga do CRT
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

    public TipoItemCargaCrt descricao(String descricao) {
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

        String sb = "class TipoItemCargaCrt {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
