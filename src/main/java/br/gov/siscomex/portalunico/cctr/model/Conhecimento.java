package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conhecimento", propOrder =
        {"numeroConhecimento", "dataEmissao", "codigoMoedaSwift", "formaPagamentoFrete", "valorFrete", "paisDestinoSiglaIso2", "toOrder", "nomeConsignatario", "enderecoConsignatario"
        })

@XmlRootElement(name = "Conhecimento")
/**
 * Dados do conhecimento de carga
 **/
@ApiModel(description = "Dados do conhecimento de carga")
public class Conhecimento {

    @XmlElement(name = "numeroConhecimento", required = true)
    @ApiModelProperty(example = "2017071814", required = true, value = "Número do conhecimento de carga<br>Tamanho: 20")
    /**
     * Número do conhecimento de carga<br>Tamanho: 20
     **/
    private String numeroConhecimento = null;

    @XmlElement(name = "dataEmissao", required = true)
    @ApiModelProperty(required = true, value = "Data Emissão Conhecimento<br>Formato: AAAA-MM-DD.")
    /**
     * Data Emissão Conhecimento<br>Formato: AAAA-MM-DD.
     **/
    private OffsetDateTime dataEmissao = null;

    @XmlElement(name = "codigoMoedaSwift", required = true)
    @ApiModelProperty(example = "USD", required = true, value = "Código da moeda do Frete<br>Tamanho: 3<br>Formato: AAA<br>Domínio: Tabela Tipo de Moeda.")
    /**
     * Código da moeda do Frete<br>Tamanho: 3<br>Formato: AAA<br>Domínio: Tabela Tipo de Moeda.
     **/
    private String codigoMoedaSwift = null;

    @XmlElement(name = "formaPagamentoFrete", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Forma de pagamento do Frete<br>Domínio: 1 (prepaid), 2 (collect).")
    /**
     * Forma de pagamento do Frete<br>Domínio: 1 (prepaid), 2 (collect).
     **/
    private Integer formaPagamentoFrete = null;

    @XmlElement(name = "valorFrete", required = true)
    @ApiModelProperty(example = "123.45", required = true, value = "Valor do frete<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto")
    /**
     * Valor do frete<br>Tamanho: 15.2<br>Formato: Decimal, com duas casas decimais separadas por ponto
     **/
    private Double valorFrete = null;

    @XmlElement(name = "paisDestinoSiglaIso2", required = true)
    @ApiModelProperty(example = "US", required = true, value = "Código do país de destino da carga<br>Tamanho: 2<br>Formato: AA<br>Domínio: Tabela de Países - código ISO/ALFA2.")
    /**
     * Código do país de destino da carga<br>Tamanho: 2<br>Formato: AA<br>Domínio: Tabela de Países - código ISO/ALFA2.
     **/
    private String paisDestinoSiglaIso2 = null;

    @XmlElement(name = "toOrder", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Indicador de consignação à ordem<br>Domínio: Domínio: S (Sim), N(Não).")
    /**
     * Indicador de consignação à ordem<br>Domínio: Domínio: S (Sim), N(Não).
     **/
    private Boolean toOrder = null;

    @XmlElement(name = "nomeConsignatario")
    @ApiModelProperty(example = "Consignatario1", value = "Nome do consignatário<br>Tamanho: 60<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.")
    /**
     * Nome do consignatário<br>Tamanho: 60<br>Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     **/
    private String nomeConsignatario = null;

    @XmlElement(name = "enderecoConsignatario")
    @ApiModelProperty(example = "Endereco1", value = "Endereço do consignatário<br>Tamanho: 260<br>Informado apenas se indicador de consignação à ordem igual a Não.")
    /**
     * Endereço do consignatário<br>Tamanho: 260<br>Informado apenas se indicador de consignação à ordem igual a Não.
     **/
    private String enderecoConsignatario = null;

    /**
     * Número do conhecimento de carga&lt;br&gt;Tamanho: 20
     *
     * @return numeroConhecimento
     **/
    @JsonProperty("numeroConhecimento")
    @NotNull
    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public Conhecimento numeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
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
     * Data Emissão Conhecimento&lt;br&gt;Formato: AAAA-MM-DD.
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    @NotNull
    public OffsetDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(OffsetDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * Código da moeda do Frete&lt;br&gt;Tamanho: 3&lt;br&gt;Formato: AAA&lt;br&gt;Domínio: Tabela Tipo de Moeda.
     *
     * @return codigoMoedaSwift
     **/
    @JsonProperty("codigoMoedaSwift")
    @NotNull
    public String getCodigoMoedaSwift() {
        return codigoMoedaSwift;
    }

    public void setCodigoMoedaSwift(String codigoMoedaSwift) {
        this.codigoMoedaSwift = codigoMoedaSwift;
    }

    public Conhecimento codigoMoedaSwift(String codigoMoedaSwift) {
        this.codigoMoedaSwift = codigoMoedaSwift;
        return this;
    }

    public Conhecimento dataEmissao(OffsetDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Forma de pagamento do Frete&lt;br&gt;Domínio: 1 (prepaid), 2 (collect).
     *
     * @return formaPagamentoFrete
     **/
    @JsonProperty("formaPagamentoFrete")
    @NotNull
    public Integer getFormaPagamentoFrete() {
        return formaPagamentoFrete;
    }

    public void setFormaPagamentoFrete(Integer formaPagamentoFrete) {
        this.formaPagamentoFrete = formaPagamentoFrete;
    }

    public Conhecimento formaPagamentoFrete(Integer formaPagamentoFrete) {
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
    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    /**
     * Código do país de destino da carga&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: AA&lt;br&gt;Domínio: Tabela de Países - código ISO/ALFA2.
     *
     * @return paisDestinoSiglaIso2
     **/
    @JsonProperty("paisDestinoSiglaIso2")
    @NotNull
    public String getPaisDestinoSiglaIso2() {
        return paisDestinoSiglaIso2;
    }

    public void setPaisDestinoSiglaIso2(String paisDestinoSiglaIso2) {
        this.paisDestinoSiglaIso2 = paisDestinoSiglaIso2;
    }

    public Conhecimento paisDestinoSiglaIso2(String paisDestinoSiglaIso2) {
        this.paisDestinoSiglaIso2 = paisDestinoSiglaIso2;
        return this;
    }

    public Conhecimento valorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }

    /**
     * Indicador de consignação à ordem&lt;br&gt;Domínio: Domínio: S (Sim), N(Não).
     *
     * @return toOrder
     **/
    @JsonProperty("toOrder")
    @NotNull
    public Boolean isisToOrder() {
        return toOrder;
    }

    public void setToOrder(Boolean toOrder) {
        this.toOrder = toOrder;
    }

    /**
     * Nome do consignatário&lt;br&gt;Tamanho: 60&lt;br&gt;Informado e obrigatório apenas se indicador de consignação à ordem igual a Não.
     *
     * @return nomeConsignatario
     **/
    @JsonProperty("nomeConsignatario")
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    public void setNomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
    }

    public Conhecimento nomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
        return this;
    }

    public Conhecimento toOrder(Boolean toOrder) {
        this.toOrder = toOrder;
        return this;
    }

    /**
     * Endereço do consignatário&lt;br&gt;Tamanho: 260&lt;br&gt;Informado apenas se indicador de consignação à ordem igual a Não.
     *
     * @return enderecoConsignatario
     **/
    @JsonProperty("enderecoConsignatario")
    public String getEnderecoConsignatario() {
        return enderecoConsignatario;
    }

    public void setEnderecoConsignatario(String enderecoConsignatario) {
        this.enderecoConsignatario = enderecoConsignatario;
    }

    public Conhecimento enderecoConsignatario(String enderecoConsignatario) {
        this.enderecoConsignatario = enderecoConsignatario;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Conhecimento {\n" +
                "    numeroConhecimento: " + toIndentedString(numeroConhecimento) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    codigoMoedaSwift: " + toIndentedString(codigoMoedaSwift) + "\n" +
                "    formaPagamentoFrete: " + toIndentedString(formaPagamentoFrete) + "\n" +
                "    valorFrete: " + toIndentedString(valorFrete) + "\n" +
                "    paisDestinoSiglaIso2: " + toIndentedString(paisDestinoSiglaIso2) + "\n" +
                "    toOrder: " + toIndentedString(toOrder) + "\n" +
                "    nomeConsignatario: " + toIndentedString(nomeConsignatario) + "\n" +
                "    enderecoConsignatario: " + toIndentedString(enderecoConsignatario) + "\n" +
                "}";
        return sb;
    }
}
