package br.gov.siscomex.portalunico.duimp_balanca_principal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaDuimpFreteConsultaCover", propOrder =
        {"codigoMoedaNegociada", "valorMoedaNegociada"
        })

@XmlRootElement(name = "CargaDuimpFreteConsultaCover")
/**
 * Dados do frete
 **/
@ApiModel(description = "Dados do frete")
public class CargaDuimpFreteConsultaCover {

    @XmlElement(name = "codigoMoedaNegociada")
    @ApiModelProperty(example = "USD", value = "Código da moeda negociada do frete (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA' Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
    /**
     * Código da moeda negociada do frete (ISO-4217).<br>Tamanho: 3<br>Formato: 'AAA' Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     **/
    private String codigoMoedaNegociada = null;

    @XmlElement(name = "valorMoedaNegociada")
    @ApiModelProperty(example = "30.22", value = "Valor do frete na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo")
    @Valid
    /**
     * Valor do frete na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.<br>Observação:<br>Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     **/
    private BigDecimal valorMoedaNegociada = null;

    /**
     * Código da moeda negociada do frete (ISO-4217).&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: &#39;AAA&#39; Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     *
     * @return codigoMoedaNegociada
     **/
    @JsonProperty("codigoMoedaNegociada")
    public String getCodigoMoedaNegociada() {
        return codigoMoedaNegociada;
    }

    public void setCodigoMoedaNegociada(String codigoMoedaNegociada) {
        this.codigoMoedaNegociada = codigoMoedaNegociada;
    }

    public CargaDuimpFreteConsultaCover codigoMoedaNegociada(String codigoMoedaNegociada) {
        this.codigoMoedaNegociada = codigoMoedaNegociada;
        return this;
    }

    /**
     * Valor do frete na moeda negociada.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.&lt;br&gt;Observação:&lt;br&gt;Para as Duimp registradas a partir de 08/06/2022, o valor do frete utilizado no cálculo do valor aduaneiro não inclui os gastos relativos à carga, à descarga e ao manuseio incorridos no território nacional e destacados do custo de transporte Para Duimp COM situação especial de despacho (atributo carga.motivoSituacaoEspecial.codigo preenchido), este atributo será retornado nulo
     *
     * @return valorMoedaNegociada
     **/
    @JsonProperty("valorMoedaNegociada")
    public BigDecimal getValorMoedaNegociada() {
        return valorMoedaNegociada;
    }

    public void setValorMoedaNegociada(BigDecimal valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
    }

    public CargaDuimpFreteConsultaCover valorMoedaNegociada(BigDecimal valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CargaDuimpFreteConsultaCover {\n" +
                "    codigoMoedaNegociada: " + toIndentedString(codigoMoedaNegociada) + "\n" +
                "    valorMoedaNegociada: " + toIndentedString(valorMoedaNegociada) + "\n" +
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

