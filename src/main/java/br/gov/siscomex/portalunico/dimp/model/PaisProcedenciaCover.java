package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaisProcedenciaCover", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "PaisProcedenciaCover")
/**
 * País de Procedência.<br>Para Duimp sem situação especial de despacho
 **/
@ApiModel(description = "País de Procedência.<br>Para Duimp sem situação especial de despacho")
public class PaisProcedenciaCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "CN", value = "Código do país de procedência no formato ISO (3166-1 alfa-2).<br>Tamanho: 2<br>Formato: 'AA'")
    /**
     * Código do país de procedência no formato ISO (3166-1 alfa-2).<br>Tamanho: 2<br>Formato: 'AA'
     **/
    private String codigo = null;

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
     * Código do país de procedência no formato ISO (3166-1 alfa-2).&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: &#39;AA&#39;
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

    public PaisProcedenciaCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class PaisProcedenciaCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "}";
        return sb;
    }
}
