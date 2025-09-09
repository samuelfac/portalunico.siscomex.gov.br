package br.gov.siscomex.portalunico.catp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoCampoSimplesIntegracaoDTO", propOrder =
        {"valor", "atributo"
        })

@XmlRootElement(name = "ProdutoCampoSimplesIntegracaoDTO")
public class ProdutoCampoSimplesIntegracaoDTO {

    @XmlElement(name = "valor", required = true)
    @ApiModelProperty(example = "01", required = true, value = "Valor do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
    /**
     * Valor do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 100
     **/
    private String valor = null;

    @XmlElement(name = "atributo", required = true)
    @ApiModelProperty(example = "ATT_1", required = true, value = "Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25")
    /**
     * Código do atributo<br>Tamanho mínimo: 1<br>Tamanho máximo: 25
     **/
    private String atributo = null;

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
     * Valor do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
     *
     * @return valor
     **/
    @JsonProperty("valor")
    @NotNull
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ProdutoCampoSimplesIntegracaoDTO valor(String valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Código do atributo&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 25
     *
     * @return atributo
     **/
    @JsonProperty("atributo")
    @NotNull
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public ProdutoCampoSimplesIntegracaoDTO atributo(String atributo) {
        this.atributo = atributo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProdutoCampoSimplesIntegracaoDTO {\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    atributo: " + toIndentedString(atributo) + "\n" +
                "}";
        return sb;
    }
}
