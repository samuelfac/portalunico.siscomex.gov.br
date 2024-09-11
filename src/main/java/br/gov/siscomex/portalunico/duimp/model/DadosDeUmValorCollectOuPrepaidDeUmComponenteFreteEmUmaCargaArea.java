package br.gov.siscomex.portalunico.duimp.model;

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
@XmlType(name = "DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea", propOrder =
        {"moeda", "valor"
        })

@XmlRootElement(name = "DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea")
public class DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea {

    @XmlElement(name = "moeda")
    @ApiModelProperty(example = "USD", value = "Código da Moeda utilizada neste componente de frete  (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'")
    /**
     * Código da Moeda utilizada neste componente de frete  (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA'
     **/
    private String moeda = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "10.0", value = "Valor deste componente de frete .<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor deste componente de frete .<br>Tamanho: 16,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
     **/
    private BigDecimal valor = null;

    /**
     * Código da Moeda utilizada neste componente de frete  (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39;
     *
     * @return moeda
     **/
    @JsonProperty("moeda")
    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea moeda(String moeda) {
        this.moeda = moeda;
        return this;
    }

    /**
     * Valor deste componente de frete .&lt;br&gt;Tamanho: 16,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
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

    public DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDeUmValorCollectOuPrepaidDeUmComponenteFreteEmUmaCargaArea {\n" +
                "    moeda: " + toIndentedString(moeda) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
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

