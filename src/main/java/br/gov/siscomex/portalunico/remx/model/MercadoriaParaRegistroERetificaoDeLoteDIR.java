package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercadoriaParaRegistroERetificaoDeLoteDIR", propOrder =
        {"codElementoNcm", "descricao", "moeda", "peso", "quantidade", "regimeTributacao", "sequencia", "tratamentoAdm", "unidade", "valor"
        })

@XmlRootElement(name = "MercadoriaParaRegistroERetificaoDeLoteDIR")
public class MercadoriaParaRegistroERetificaoDeLoteDIR {

    @XmlElement(name = "codElementoNcm")
    @ApiModelProperty(value = "Classificação da mercadoria segundo a NCM. Caracteres numéricos com 6 ou 8 dígitos.")
    /**
     * Classificação da mercadoria segundo a NCM. Caracteres numéricos com 6 ou 8 dígitos.
     **/
    private String codElementoNcm = null;

    @XmlElement(name = "descricao", required = true)
    @ApiModelProperty(required = true, value = "Especifica a descrição da mercadoria. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Especifica a descrição da mercadoria. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String descricao = null;

    @XmlElement(name = "moeda", required = true)
    @ApiModelProperty(required = true, value = "Código da moeda referente ao valor da mercadoria. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.")
    /**
     * Código da moeda referente ao valor da mercadoria. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.
     **/
    private String moeda = null;

    @XmlElement(name = "peso")
    @ApiModelProperty(value = "Peso em quilogramas da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Peso em quilogramas da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal peso = null;

    @XmlElement(name = "quantidade", required = true)
    @ApiModelProperty(required = true, value = "Define o número de itens presentes da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 6 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Define o número de itens presentes da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 6 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal quantidade = null;

    @XmlElement(name = "regimeTributacao", required = true)
    @ApiModelProperty(required = true, value = "Especifica o regime de tributação ao qual a mercadoria está suscetível, como: imune, isento ou Tributação Simplificada. Valores de acordo com a tabela de domínio “Tabela de Tipos de Regime de Tributação”.")
    /**
     * Especifica o regime de tributação ao qual a mercadoria está suscetível, como: imune, isento ou Tributação Simplificada. Valores de acordo com a tabela de domínio “Tabela de Tipos de Regime de Tributação”.
     **/
    private Integer regimeTributacao = null;

    @XmlElement(name = "sequencia", required = true)
    @ApiModelProperty(required = true, value = "Número sequencial de mercadoria enviado para uma determinada remessa. Este número é importante, pois será utilizado quando do envio da retificação do Lote de Declarações, para determinar qual mercadoria está sendo retificada. Valor sequencial, diário, com 5 dígitos numéricos.")
    /**
     * Número sequencial de mercadoria enviado para uma determinada remessa. Este número é importante, pois será utilizado quando do envio da retificação do Lote de Declarações, para determinar qual mercadoria está sendo retificada. Valor sequencial, diário, com 5 dígitos numéricos.
     **/
    private String sequencia = null;

    @XmlElement(name = "tratamentoAdm")
    @ApiModelProperty(value = "Indica o órgão fiscalizador da mercadoria.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB")
    /**
     * Indica o órgão fiscalizador da mercadoria.<br/>1- Fiscalização ANVISA<br/>2 - Fiscalização VIGIAGRO/MAPA<br/>3 - Fiscalização RFB<br/>4 - Fiscalização VIGIAGRO/MAPA e Anvisa<br/>5 - Fiscalização VIGIAGRO/MAPA e RFB<br/>6 - Fiscalização Anvisa e RFB<br/>7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB<br/>8 - Fiscalização IBAMA<br/>9 - Fiscalização IBAMA e ANVISA<br/>10 - Fiscalização IBAMA e VIGIAGRO/MAPA<br/>11 - Fiscalização IBAMA e RFB<br/>12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA<br/>13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB<br/>14 - Fiscalização IBAMA, ANVISA e RFB<br/>15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
     **/
    private Integer tratamentoAdm = null;

    @XmlElement(name = "unidade", required = true)
    @ApiModelProperty(required = true, value = "Define a unidade de medida em que a mercadoria é mensurada. Valores de acordo com a tabela de domínio Unidade de Medida do Mercosul do sistema Siscomex Tabelas.")
    /**
     * Define a unidade de medida em que a mercadoria é mensurada. Valores de acordo com a tabela de domínio Unidade de Medida do Mercosul do sistema Siscomex Tabelas.
     **/
    private Integer unidade = null;

    @XmlElement(name = "valor", required = true)
    @ApiModelProperty(required = true, value = "Valor total da mercadoria. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total da mercadoria. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valor = null;

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
     * Classificação da mercadoria segundo a NCM. Caracteres numéricos com 6 ou 8 dígitos.
     *
     * @return codElementoNcm
     **/
    @JsonProperty("codElementoNcm")
    public String getCodElementoNcm() {
        return codElementoNcm;
    }

    public void setCodElementoNcm(String codElementoNcm) {
        this.codElementoNcm = codElementoNcm;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR codElementoNcm(String codElementoNcm) {
        this.codElementoNcm = codElementoNcm;
        return this;
    }

    /**
     * Especifica a descrição da mercadoria. Máximo de 4000 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    @NotNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Código da moeda referente ao valor da mercadoria. Valores de acordo com a tabela de domínio. O código de moeda contido no arquivo deve ter exatamente 3 dígitos.
     *
     * @return moeda
     **/
    @JsonProperty("moeda")
    @NotNull
    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR moeda(String moeda) {
        this.moeda = moeda;
        return this;
    }

    /**
     * Peso em quilogramas da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return peso
     **/
    @JsonProperty("peso")
    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR peso(BigDecimal peso) {
        this.peso = peso;
        return this;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Define o número de itens presentes da mercadoria. Número fracionário, maior que zero, aceitando no máximo até 6 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return quantidade
     **/
    @JsonProperty("quantidade")
    @NotNull
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Especifica o regime de tributação ao qual a mercadoria está suscetível, como: imune, isento ou Tributação Simplificada. Valores de acordo com a tabela de domínio “Tabela de Tipos de Regime de Tributação”.
     *
     * @return regimeTributacao
     **/
    @JsonProperty("regimeTributacao")
    @NotNull
    public Integer getRegimeTributacao() {
        return regimeTributacao;
    }

    public void setRegimeTributacao(Integer regimeTributacao) {
        this.regimeTributacao = regimeTributacao;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR regimeTributacao(Integer regimeTributacao) {
        this.regimeTributacao = regimeTributacao;
        return this;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR quantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    /**
     * Número sequencial de mercadoria enviado para uma determinada remessa. Este número é importante, pois será utilizado quando do envio da retificação do Lote de Declarações, para determinar qual mercadoria está sendo retificada. Valor sequencial, diário, com 5 dígitos numéricos.
     *
     * @return sequencia
     **/
    @JsonProperty("sequencia")
    @NotNull
    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR sequencia(String sequencia) {
        this.sequencia = sequencia;
        return this;
    }

    /**
     * Indica o órgão fiscalizador da mercadoria.&lt;br/&gt;1- Fiscalização ANVISA&lt;br/&gt;2 - Fiscalização VIGIAGRO/MAPA&lt;br/&gt;3 - Fiscalização RFB&lt;br/&gt;4 - Fiscalização VIGIAGRO/MAPA e Anvisa&lt;br/&gt;5 - Fiscalização VIGIAGRO/MAPA e RFB&lt;br/&gt;6 - Fiscalização Anvisa e RFB&lt;br/&gt;7 - Fiscalização VIGIAGRO/MAPA, Anvisa e RFB&lt;br/&gt;8 - Fiscalização IBAMA&lt;br/&gt;9 - Fiscalização IBAMA e ANVISA&lt;br/&gt;10 - Fiscalização IBAMA e VIGIAGRO/MAPA&lt;br/&gt;11 - Fiscalização IBAMA e RFB&lt;br/&gt;12 - Fiscalização IBAMA, VIGIAGRO/MAPA e ANVISA&lt;br/&gt;13 - Fiscalização IBAMA, VIGIAGRO/MAPA e RFB&lt;br/&gt;14 - Fiscalização IBAMA, ANVISA e RFB&lt;br/&gt;15 - Fiscalização IBAMA, ANVISA, VIGIAGRO/MAPA e RFB
     * minimum: 1
     * maximum: 15
     *
     * @return tratamentoAdm
     **/
    @JsonProperty("tratamentoAdm")
    @Min(1)
    @Max(15)
    public Integer getTratamentoAdm() {
        return tratamentoAdm;
    }

    public void setTratamentoAdm(Integer tratamentoAdm) {
        this.tratamentoAdm = tratamentoAdm;
    }

    /**
     * Define a unidade de medida em que a mercadoria é mensurada. Valores de acordo com a tabela de domínio Unidade de Medida do Mercosul do sistema Siscomex Tabelas.
     * @return unidade
     **/
    @JsonProperty("unidade")
    @NotNull
    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR unidade(Integer unidade) {
        this.unidade = unidade;
        return this;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR tratamentoAdm(Integer tratamentoAdm) {
        this.tratamentoAdm = tratamentoAdm;
        return this;
    }

    /**
     * Valor total da mercadoria. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * minimum: 0
     * @return valor
     **/
    @JsonProperty("valor")
    @NotNull
    @DecimalMin("0")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public MercadoriaParaRegistroERetificaoDeLoteDIR valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class MercadoriaParaRegistroERetificaoDeLoteDIR {\n" +
                "    codElementoNcm: " + toIndentedString(codElementoNcm) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    moeda: " + toIndentedString(moeda) + "\n" +
                "    peso: " + toIndentedString(peso) + "\n" +
                "    quantidade: " + toIndentedString(quantidade) + "\n" +
                "    regimeTributacao: " + toIndentedString(regimeTributacao) + "\n" +
                "    sequencia: " + toIndentedString(sequencia) + "\n" +
                "    tratamentoAdm: " + toIndentedString(tratamentoAdm) + "\n" +
                "    unidade: " + toIndentedString(unidade) + "\n" +
                "    valor: " + toIndentedString(valor) + "\n" +
                "}";
        return sb;
    }
}
