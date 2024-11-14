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
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurosPagamentoCover", propOrder =
        {"codigoReceita", "valor", "dataPagamentoJuros", "bancoJuros", "agenciaJuros", "contaJuros"
        })

@XmlRootElement(name = "JurosPagamentoCover")
/**
 * Informações sobre os Juros.
 **/
@ApiModel(description = "Informações sobre os Juros.")
public class JurosPagamentoCover {

    @XmlElement(name = "codigoReceita")
    @ApiModelProperty(example = "5602", value = "Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'")
    /**
     * Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'
     **/
    private String codigoReceita = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "100.1", value = "Valor de juros.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    @Valid
    /**
     * Valor de juros.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private BigDecimal valor = null;

    @XmlElement(name = "dataPagamentoJuros")
    @ApiModelProperty(value = "Data de pagamento de juros.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data de pagamento de juros.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private OffsetDateTime dataPagamentoJuros = null;

    @XmlElement(name = "bancoJuros")
    @ApiModelProperty(example = "001", value = "Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999")
    /**
     * Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999
     **/
    private String bancoJuros = null;

    @XmlElement(name = "agenciaJuros")
    @ApiModelProperty(example = "3521", value = "Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
    /**
     * Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4
     **/
    private String agenciaJuros = null;

    @XmlElement(name = "contaJuros")
    @ApiModelProperty(example = "707070", value = "Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
    /**
     * Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
     **/
    private String contaJuros = null;

    /**
     * Código da receita.&lt;br&gt;Tamanho: 4&lt;br&gt;Formato: &#39;NNNN&#39;
     *
     * @return codigoReceita
     **/
    @JsonProperty("codigoReceita")
    public String getCodigoReceita() {
        return codigoReceita;
    }

    public void setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
    }

    public JurosPagamentoCover codigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
        return this;
    }

    /**
     * Valor de juros.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
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

    public JurosPagamentoCover valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Data de pagamento de juros.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataPagamentoJuros
     **/
    @JsonProperty("dataPagamentoJuros")
    public OffsetDateTime getDataPagamentoJuros() {
        return dataPagamentoJuros;
    }

    public void setDataPagamentoJuros(OffsetDateTime dataPagamentoJuros) {
        this.dataPagamentoJuros = dataPagamentoJuros;
    }

    public JurosPagamentoCover dataPagamentoJuros(OffsetDateTime dataPagamentoJuros) {
        this.dataPagamentoJuros = dataPagamentoJuros;
        return this;
    }

    /**
     * Código do banco.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
     *
     * @return bancoJuros
     **/
    @JsonProperty("bancoJuros")
    public String getBancoJuros() {
        return bancoJuros;
    }

    public void setBancoJuros(String bancoJuros) {
        this.bancoJuros = bancoJuros;
    }

    public JurosPagamentoCover bancoJuros(String bancoJuros) {
        this.bancoJuros = bancoJuros;
        return this;
    }

    /**
     * Número da agência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
     *
     * @return agenciaJuros
     **/
    @JsonProperty("agenciaJuros")
    public String getAgenciaJuros() {
        return agenciaJuros;
    }

    public void setAgenciaJuros(String agenciaJuros) {
        this.agenciaJuros = agenciaJuros;
    }

    public JurosPagamentoCover agenciaJuros(String agenciaJuros) {
        this.agenciaJuros = agenciaJuros;
        return this;
    }

    /**
     * Número da conta&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
     *
     * @return contaJuros
     **/
    @JsonProperty("contaJuros")
    public String getContaJuros() {
        return contaJuros;
    }

    public void setContaJuros(String contaJuros) {
        this.contaJuros = contaJuros;
    }

    public JurosPagamentoCover contaJuros(String contaJuros) {
        this.contaJuros = contaJuros;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class JurosPagamentoCover {\n" +
                "    codigoReceita: " + toIndentedString(codigoReceita) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    dataPagamentoJuros: " + toIndentedString(dataPagamentoJuros) + "\n" +
                "    bancoJuros: " + toIndentedString(bancoJuros) + "\n" +
                "    agenciaJuros: " + toIndentedString(agenciaJuros) + "\n" +
                "    contaJuros: " + toIndentedString(contaJuros) + "\n" +
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

