package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaCargaCrt", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "CategoriaCargaCrt")
public class CategoriaCargaCrt {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "I", value = "Código da categoria da carga<br>Tamanho: 1<br/>E - Exportada <br/>I - Importada<br/>N - Nacional<br/>P - Passagem<br/>")
    /**
     * Código da categoria da carga<br>Tamanho: 1<br/>E - Exportada <br/>I - Importada<br/>N - Nacional<br/>P - Passagem<br/>
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Importada", value = "Descrição da categoria da carga")
    /**
     * Descrição da categoria da carga
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
     * Código da categoria da carga&lt;br&gt;Tamanho: 1&lt;br/&gt;E - Exportada &lt;br/&gt;I - Importada&lt;br/&gt;N - Nacional&lt;br/&gt;P - Passagem&lt;br/&gt;
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

    public CategoriaCargaCrt codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da categoria da carga
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

    public CategoriaCargaCrt descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CategoriaCargaCrt {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
