package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoBloqueio", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "TipoBloqueio")
public class TipoBloqueio {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "6", value = "Código do tipo de bloqueio")
    /**
     * Código do tipo de bloqueio
     **/
    private Long codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Total (exceto retificação do conhecimento de carga/DSIC)", value = "Descrição do tipo de bloqueio")
    /**
     * Descrição do tipo de bloqueio
     **/
    private String descricao = null;

    /**
     * Código do tipo de bloqueio
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public TipoBloqueio codigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do tipo de bloqueio
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

    public TipoBloqueio descricao(String descricao) {
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

        String sb = "class TipoBloqueio {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
