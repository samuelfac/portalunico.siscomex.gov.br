package br.gov.siscomex.portalunico.cct_ext.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frete", propOrder =
        {"codigoMoedaFrete", "formaPagamentoFrete", "valorFrete"
        })

@XmlRootElement(name = "Frete")
/**
 * Dados do frete
 **/
@ApiModel(description = "Dados do frete")
public class Frete {

    @XmlElement(name = "codigoMoedaFrete", required = true)
    @ApiModelProperty(example = "USD", required = true, value = "Código da moeda do Frete<br>Tamanho: 3<br>Formato: AAA<br>Domínio: Tabela Tipo de Moeda")
    /**
     * Código da moeda do Frete<br>Tamanho: 3<br>Formato: AAA<br>Domínio: Tabela Tipo de Moeda
     **/
    private String codigoMoedaFrete = null;

    @XmlElement(name = "formaPagamentoFrete", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Forma de pagamento do frete<br>Domínio: 1 (prepaid), 2 (collect).")
    /**
     * Forma de pagamento do frete<br>Domínio: 1 (prepaid), 2 (collect).
     **/
    private String formaPagamentoFrete = null;

    @XmlElement(name = "valorFrete", required = true)
    @ApiModelProperty(example = "15632.87", required = true, value = "Valor do frete<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto")
    @Valid
    /**
     * Valor do frete<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto
     **/
    private BigDecimal valorFrete = null;

    /**
     * Código da moeda do Frete&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: AAA&lt;br&gt;Domínio: Tabela Tipo de Moeda
     *
     * @return codigoMoedaFrete
     **/
    @JsonProperty("codigoMoedaFrete")
    @NotNull
    public String getCodigoMoedaFrete() {
        return codigoMoedaFrete;
    }

    public void setCodigoMoedaFrete(String codigoMoedaFrete) {
        this.codigoMoedaFrete = codigoMoedaFrete;
    }

    public Frete codigoMoedaFrete(String codigoMoedaFrete) {
        this.codigoMoedaFrete = codigoMoedaFrete;
        return this;
    }

    /**
     * Forma de pagamento do frete&lt;br&gt;Domínio: 1 (prepaid), 2 (collect).
     *
     * @return formaPagamentoFrete
     **/
    @JsonProperty("formaPagamentoFrete")
    @NotNull
    public String getFormaPagamentoFrete() {
        return formaPagamentoFrete;
    }

    public void setFormaPagamentoFrete(String formaPagamentoFrete) {
        this.formaPagamentoFrete = formaPagamentoFrete;
    }

    public Frete formaPagamentoFrete(String formaPagamentoFrete) {
        this.formaPagamentoFrete = formaPagamentoFrete;
        return this;
    }

    /**
     * Valor do frete&lt;br&gt;Tamanho: 15.2&lt;br&gt;Formato: Decimal, com duas casas decimais separadas por ponto
     *
     * @return valorFrete
     **/
    @JsonProperty("valorFrete")
    @NotNull
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Frete valorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Frete {\n" +
                "    codigoMoedaFrete: " + toIndentedString(codigoMoedaFrete) + "\n" +
                "    formaPagamentoFrete: " + toIndentedString(formaPagamentoFrete) + "\n" +
                "    valorFrete: " + toIndentedString(valorFrete) + "\n" +
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

