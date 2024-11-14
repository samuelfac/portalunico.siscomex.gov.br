package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstituicaoFinanciadoraCover", propOrder =
        {"codigo"
        })

@XmlRootElement(name = "InstituicaoFinanciadoraCover")
/**
 * Instituição financiadora.<br>Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias.
 **/
@ApiModel(description = "Instituição financiadora.<br>Observação: Deve ser preenchido quando a cobertura cambial estiver acima de 360 dias.")
public class InstituicaoFinanciadoraCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "99", value = "Código da instituição financiadora.<br>Origem : Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Valor mínimo: 1<br>Valor máximo: 99")
    /**
     * Código da instituição financiadora.<br>Origem : Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Valor mínimo: 1<br>Valor máximo: 99
     **/
    private String codigo = null;

    /**
     * Código da instituição financiadora.&lt;br&gt;Origem : Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99
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

    public InstituicaoFinanciadoraCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class InstituicaoFinanciadoraCover {\n" +
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

