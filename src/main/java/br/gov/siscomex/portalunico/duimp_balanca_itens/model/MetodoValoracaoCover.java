package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetodoValoracaoCover", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "MetodoValoracaoCover")
/**
 * Método de valoração.
 **/
@ApiModel(description = "Método de valoração.")
public class MetodoValoracaoCover {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código do método de valoração.<br>Domínio: Tabela de Métodos de Valoração Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99999<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/")
    /**
     * Código do método de valoração.<br>Domínio: Tabela de Métodos de Valoração Siscomex<br>Valor mínimo: 1<br>Valor máximo: 99999<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     **/
    private String codigo = null;

    /**
     * Código do método de valoração.&lt;br&gt;Domínio: Tabela de Métodos de Valoração Siscomex&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999&lt;br&gt;Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public MetodoValoracaoCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class MetodoValoracaoCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "}";
        return sb;
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
}

