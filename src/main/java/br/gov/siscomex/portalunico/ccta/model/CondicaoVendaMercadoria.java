package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoVendaMercadoria", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "CondicaoVendaMercadoria")
public class CondicaoVendaMercadoria {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "FCA", value = "Código da condicao de venda da mercadoria no local de embarque")
    /**
     * Código da condicao de venda da mercadoria no local de embarque
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "FREE CARRIER", value = "Descrição da condicao de venda da mercadoria no local de embarque")
    /**
     * Descrição da condicao de venda da mercadoria no local de embarque
     **/
    private String descricao = null;

    /**
     * Código da condicao de venda da mercadoria no local de embarque
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

    public CondicaoVendaMercadoria codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da condicao de venda da mercadoria no local de embarque
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

    public CondicaoVendaMercadoria descricao(String descricao) {
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

        String sb = "class CondicaoVendaMercadoria {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
