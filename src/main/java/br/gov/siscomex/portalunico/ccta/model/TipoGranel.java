package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoGranel", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoGranel")
public class TipoGranel {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "01", value = "Código do tipo de granel</br>para \"tipoItemCRT\" = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2")
    /**
     * Código do tipo de granel</br>para \"tipoItemCRT\" = 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)<br/>Tamanho Máximo: 2
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição do código do tipo de granel")
    /**
     * Descrição do código do tipo de granel
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
     * Código do tipo de granel&lt;/br&gt;para \&quot;tipoItemCRT\&quot; &#x3D; 3 preenchimento obrigatório conforme Tabela de tipos de granel(TabX)&lt;br/&gt;Tamanho Máximo: 2
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

    public TipoGranel codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do código do tipo de granel
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

    public TipoGranel descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TipoGranel {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
