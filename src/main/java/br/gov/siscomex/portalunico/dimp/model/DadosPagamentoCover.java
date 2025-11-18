package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosPagamentoCover", propOrder =
        {"dataPagamento", "codigoReceita", "banco", "agencia", "conta", "tributo", "valor", "juros"
        })

@XmlRootElement(name = "DadosPagamentoCover")
/**
 * Dados principais de um pagamento.
 **/
@ApiModel(description = "Dados principais de um pagamento.")
public class DadosPagamentoCover {

    @XmlElement(name = "dataPagamento")
    @ApiModelProperty(example = "2021-05-25T15:53:18-0300", value = "Data e hora do pagamento.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'")
    /**
     * Data e hora do pagamento.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ssZ'
     **/
    private String dataPagamento = null;

    @XmlElement(name = "codigoReceita")
    @ApiModelProperty(example = "5602", value = "Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'")
    /**
     * Código da receita.<br>Tamanho: 4<br>Formato: 'NNNN'
     **/
    private String codigoReceita = null;

    @XmlElement(name = "banco")
    @ApiModelProperty(example = "001", value = "Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999")
    /**
     * Código do banco.<br>Valor mínimo: 1<br>Valor máximo: 999
     **/
    private String banco = null;

    @XmlElement(name = "agencia")
    @ApiModelProperty(example = "3521", value = "Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4")
    /**
     * Número da agência<br>Tamanho mínimo: 1<br>Tamanho máximo: 4
     **/
    private String agencia = null;

    @XmlElement(name = "conta")
    @ApiModelProperty(example = "707070", value = "Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10")
    /**
     * Número da conta<br>Tamanho mínimo: 1<br>Tamanho máximo: 10
     **/
    private String conta = null;

    @XmlElement(name = "tributo")
    @ApiModelProperty(value = "")
    @Valid
    private TributoDuimpConsultaCover tributo = null;

    @XmlElement(name = "valor")
    @ApiModelProperty(example = "17.2", value = "Valor pago.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
    /**
     * Valor pago.<br>Tamanho: 17,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
     **/
    private Double valor = null;

    @XmlElement(name = "juros")
    @ApiModelProperty(value = "")
    @Valid
    private JurosPagamentoCover juros = null;

    /**
     * Data e hora do pagamento.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#39;
     *
     * @return dataPagamento
     **/
    @JsonProperty("dataPagamento")
    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public DadosPagamentoCover dataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
        return this;
    }

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

    public DadosPagamentoCover codigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
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
     * Código do banco.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 999
     *
     * @return banco
     **/
    @JsonProperty("banco")
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public DadosPagamentoCover banco(String banco) {
        this.banco = banco;
        return this;
    }

    /**
     * Número da agência&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 4
     *
     * @return agencia
     **/
    @JsonProperty("agencia")
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Número da conta&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 10
     *
     * @return conta
     **/
    @JsonProperty("conta")
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public DadosPagamentoCover conta(String conta) {
        this.conta = conta;
        return this;
    }

    /**
     * Get tributo
     *
     * @return tributo
     **/
    @JsonProperty("tributo")
    public TributoDuimpConsultaCover getTributo() {
        return tributo;
    }

    public void setTributo(TributoDuimpConsultaCover tributo) {
        this.tributo = tributo;
    }

    public DadosPagamentoCover tributo(TributoDuimpConsultaCover tributo) {
        this.tributo = tributo;
        return this;
    }

    /**
     * Valor pago.&lt;br&gt;Tamanho: 17,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
     * @return valor
     **/
    @JsonProperty("valor")
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public DadosPagamentoCover valor(Double valor) {
        this.valor = valor;
        return this;
    }

    public DadosPagamentoCover agencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    /**
     * Get juros
     *
     * @return juros
     **/
    @JsonProperty("juros")
    public JurosPagamentoCover getJuros() {
        return juros;
    }

    public void setJuros(JurosPagamentoCover juros) {
        this.juros = juros;
    }

    public DadosPagamentoCover juros(JurosPagamentoCover juros) {
        this.juros = juros;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosPagamentoCover {\n" +
                "    dataPagamento: " + toIndentedString(dataPagamento) + "\n" +
                "    codigoReceita: " + toIndentedString(codigoReceita) + "\n" +
                "    banco: " + toIndentedString(banco) + "\n" +
                "    agencia: " + toIndentedString(agencia) + "\n" +
                "    conta: " + toIndentedString(conta) + "\n" +
                "    tributo: " + toIndentedString(tributo) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "    juros: " + toIndentedString(juros) + "\n" +
                "}";
        return sb;
    }
}
