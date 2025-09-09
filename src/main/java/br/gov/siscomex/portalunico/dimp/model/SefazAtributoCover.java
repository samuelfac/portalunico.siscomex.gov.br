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
@XmlType(name = "SefazAtributoCover", propOrder =
        {"codigo", "valor"
        })

@XmlRootElement(name = "SefazAtributoCover")
/**
 * Dados de um atributo dinâmico
 **/
@ApiModel(description = "Dados de um atributo dinâmico")
public class SefazAtributoCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "ATT_0001", value = "Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12")
    /**
     * Código do atributo no cadastro de atributos<br>Tamanho mínimo: 1<br>Tamanho máximo: 12
     **/
    private String codigo = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "Valor atribuido pelo importador ao atributo representado pelo codigo 'ATT_0001'", value = "Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000")
    /**
     * Valor do atributo<br>Tamanho mínimo: 0<br>Tamanho máximo: 10000
     **/
    private String valor = null;

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
     * Código do atributo no cadastro de atributos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 12
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

    public SefazAtributoCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Valor do atributo&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 10000
     *
     * @return valor
     **/
    @JsonProperty("valor")
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public SefazAtributoCover valor(String valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazAtributoCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "}";
        return sb;
    }
}
