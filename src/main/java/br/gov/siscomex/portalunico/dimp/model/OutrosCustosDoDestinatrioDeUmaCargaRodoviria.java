package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutrosCustosDoDestinatrioDeUmaCargaRodoviria", propOrder =
        {"moedaCodigoISO", "valor"
        })

@XmlRootElement(name = "OutrosCustosDoDestinatrioDeUmaCargaRodoviria")
public class OutrosCustosDoDestinatrioDeUmaCargaRodoviria {

    @XmlElement(name = "moedaCodigoISO")
    @ApiModelProperty(example = "USD", value = "Código da Moeda utilizada para o valor associado a outros custos de uma carga rodoviária (ISO-4217) <br>Tamanho: 3<br>Formato: 'AAA'")
    /**
     * Código da Moeda utilizada para o valor associado a outros custos de uma carga rodoviária (ISO-4217) <br>Tamanho: 3<br>Formato: 'AAA'
     **/
    private String moedaCodigoISO = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "10.0", value = "Valor associado a outros custos de uma carga rodoviária. <br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor associado a outros custos de uma carga rodoviária. <br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valor = null;

    /**
     * Código da Moeda utilizada para o valor associado a outros custos de uma carga rodoviária (ISO-4217) &lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;
     *
     * @return moedaCodigoISO
     **/
    @JsonProperty("moedaCodigoISO")
    public String getMoedaCodigoISO() {
        return moedaCodigoISO;
    }

    public void setMoedaCodigoISO(String moedaCodigoISO) {
        this.moedaCodigoISO = moedaCodigoISO;
    }

    public OutrosCustosDoDestinatrioDeUmaCargaRodoviria moedaCodigoISO(String moedaCodigoISO) {
        this.moedaCodigoISO = moedaCodigoISO;
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

    /**
     * Valor associado a outros custos de uma carga rodoviária. &lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
     *
     * @return valor
     **/
    @JsonProperty("valor")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public OutrosCustosDoDestinatrioDeUmaCargaRodoviria valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class OutrosCustosDoDestinatrioDeUmaCargaRodoviria {\n" +
                "    moedaCodigoISO: " + toIndentedString(moedaCodigoISO) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "}";
        return sb;
    }
}
