package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ncm", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "Ncm")
public class Ncm {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "01", value = "Classificação NCM mercadoria")
    /**
     * Classificação NCM mercadoria
     **/
    private String codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(value = "Descrição classificação NMC mercadoria")
    /**
     * Descrição classificação NMC mercadoria
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
     * Classificação NCM mercadoria
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

    public Ncm codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição classificação NMC mercadoria
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

    public Ncm descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Ncm {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
