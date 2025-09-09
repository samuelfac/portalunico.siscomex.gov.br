package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotivoBloqueio", propOrder =
        {"codigo", "descricao"
        })

@XmlRootElement(name = "MotivoBloqueio")
public class MotivoBloqueio {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "5", value = "Código do motivo do bloqueio")
    /**
     * Código do motivo do bloqueio
     **/
    private Long codigo = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Sob análise da RFB", value = "Descrição do motivo do bloqueio")
    /**
     * Descrição do motivo do bloqueio
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
     * Código do motivo do bloqueio
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

    public MotivoBloqueio codigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição do motivo do bloqueio
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

    public MotivoBloqueio descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class MotivoBloqueio {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "}";
        return sb;
    }
}
