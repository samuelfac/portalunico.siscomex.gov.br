package br.gov.siscomex.portalunico.ccta_ter_ext_xml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrtViagem", propOrder =
        {"alfandegaDestinoRA", "alfandegaDestinoUL", "codigoMoedaFrete", "codigoMoedaSeguro", "codigoMoedaValorFCA", "dataEmissao", "documentosAnexos", "indicadorParcialidade", "itensCarga", "mercadorias", "numeroCrt", "tipoCarga", "valorFCA", "valorFrete", "valorSeguro"
        })

@XmlRootElement(name = "CrtViagem")
public class CrtViagem {

    @XmlElement(name = "alfandegaDestinoRA")
    @ApiModelProperty(example = "8911101", value = "Recinto da Alfândega de destino final da carga<br/> Obrigatório caso campo País  de destino final da viagem seja Brasil<br/> Tamanho Máximo: 7")
    /**
     * Recinto da Alfândega de destino final da carga<br/> Obrigatório caso campo País  de destino final da viagem seja Brasil<br/> Tamanho Máximo: 7
     **/
    private String alfandegaDestinoRA = null;

    @XmlElement(name = "alfandegaDestinoUL")
    @ApiModelProperty(example = "0817600", value = "UL da Alfândega de destino final da carga<br/> Obrigatório caso campo País  de destino final da viagem seja Brasil<br/> Tamanho Máximo: 7")
    /**
     * UL da Alfândega de destino final da carga<br/> Obrigatório caso campo País  de destino final da viagem seja Brasil<br/> Tamanho Máximo: 7
     **/
    private String alfandegaDestinoUL = null;

    @XmlElement(name = "codigoMoedaFrete", required = true)
    @ApiModelProperty(example = "220", required = true, value = "Código da moeda do frete<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA")
    /**
     * Código da moeda do frete<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA
     **/
    private String codigoMoedaFrete = null;

    @XmlElement(name = "codigoMoedaSeguro", required = true)
    @ApiModelProperty(example = "220", required = true, value = "Código da moeda do seguro<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA")
    /**
     * Código da moeda do seguro<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA
     **/
    private String codigoMoedaSeguro = null;

    @XmlElement(name = "codigoMoedaValorFCA", required = true)
    @ApiModelProperty(example = "220", required = true, value = "Código da moeda do valor FCA.<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA")
    /**
     * Código da moeda do valor FCA.<br/> Deverá ser um código na tabela de moedas (TABX)<br/>Formato: AAA
     **/
    private String codigoMoedaValorFCA = null;

    @XmlElement(name = "dataEmissao", required = true)
    @ApiModelProperty(example = "2020-08-07", required = true, value = "Data de emissão do CRT<br/>Formato: yyyy-MM-dd")
    /**
     * Data de emissão do CRT<br/>Formato: yyyy-MM-dd
     **/
    private String dataEmissao = null;

    @XmlElement(name = "documentosAnexos")
    @ApiModelProperty(value = "")
    @Valid
    private List<DocumentoAnexo> documentosAnexos = null;

    @XmlElement(name = "indicadorParcialidade", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador se a viagem está transportando total ou parcialmente este CRT<br/> Tamanho: 1")
    /**
     * Indicador se a viagem está transportando total ou parcialmente este CRT<br/> Tamanho: 1
     **/
    private Boolean indicadorParcialidade = null;

    @XmlElement(name = "itensCarga")
    @ApiModelProperty(value = "")
    @Valid
    private List<ItemCargaViagem> itensCarga = null;

    @XmlElement(name = "mercadorias")
    @ApiModelProperty(value = "")
    @Valid
    private List<Mercadoria> mercadorias = null;

    @XmlElement(name = "numeroCrt", required = true)
    @ApiModelProperty(example = "UY172911152", required = true, value = "Número do CRT<br/> Tamanho Máximo: 15")
    /**
     * Número do CRT<br/> Tamanho Máximo: 15
     **/
    private String numeroCrt = null;


    @XmlType(name = "TipoCargaEnum")
    @XmlEnum(String.class)
    public enum TipoCargaEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2"),

        @XmlEnumValue("3")
        @JsonProperty("3")
        _3("3"),

        @XmlEnumValue("4")
        @JsonProperty("4")
        _4("4");


        private final String value;

        TipoCargaEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TipoCargaEnum fromValue(String v) {
            for (TipoCargaEnum b : TipoCargaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoCargaEnum");
        }
    }

    @XmlElement(name = "tipoCarga", required = true)
    @ApiModelProperty(example = "3", required = true, value = "Tipo da carga (Granel(3), Veículo(4), Carga Solta(2), Conteiner (1))")
    /**
     * Tipo da carga (Granel(3), Veículo(4), Carga Solta(2), Conteiner (1))
     **/
    private TipoCargaEnum tipoCarga = null;

    @XmlElement(name = "valorFCA", required = true)
    @ApiModelProperty(example = "3284.58", required = true, value = "Valor do frete FCA.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do frete FCA.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorFCA = null;

    @XmlElement(name = "valorFrete", required = true)
    @ApiModelProperty(example = "3284.58", required = true, value = "Valor do frete cobrado na parte da carga que está sendo transportada em uma viagem.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do frete cobrado na parte da carga que está sendo transportada em uma viagem.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorFrete = null;

    @XmlElement(name = "valorSeguro", required = true)
    @ApiModelProperty(example = "3284.58", required = true, value = "Valor do seguro cobrado na parte da carga que está sendo transportada em uma viagem.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do seguro cobrado na parte da carga que está sendo transportada em uma viagem.<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorSeguro = null;

    /**
     * Recinto da Alfândega de destino final da carga&lt;br/&gt; Obrigatório caso campo País  de destino final da viagem seja Brasil&lt;br/&gt; Tamanho Máximo: 7
     *
     * @return alfandegaDestinoRA
     **/
    @JsonProperty("alfandegaDestinoRA")
    public String getAlfandegaDestinoRA() {
        return alfandegaDestinoRA;
    }

    public void setAlfandegaDestinoRA(String alfandegaDestinoRA) {
        this.alfandegaDestinoRA = alfandegaDestinoRA;
    }

    public CrtViagem alfandegaDestinoRA(String alfandegaDestinoRA) {
        this.alfandegaDestinoRA = alfandegaDestinoRA;
        return this;
    }

    /**
     * UL da Alfândega de destino final da carga&lt;br/&gt; Obrigatório caso campo País  de destino final da viagem seja Brasil&lt;br/&gt; Tamanho Máximo: 7
     *
     * @return alfandegaDestinoUL
     **/
    @JsonProperty("alfandegaDestinoUL")
    public String getAlfandegaDestinoUL() {
        return alfandegaDestinoUL;
    }

    public void setAlfandegaDestinoUL(String alfandegaDestinoUL) {
        this.alfandegaDestinoUL = alfandegaDestinoUL;
    }

    public CrtViagem alfandegaDestinoUL(String alfandegaDestinoUL) {
        this.alfandegaDestinoUL = alfandegaDestinoUL;
        return this;
    }

    /**
     * Código da moeda do frete&lt;br/&gt; Deverá ser um código na tabela de moedas (TABX)&lt;br/&gt;Formato: AAA
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

    public CrtViagem codigoMoedaFrete(String codigoMoedaFrete) {
        this.codigoMoedaFrete = codigoMoedaFrete;
        return this;
    }

    /**
     * Código da moeda do seguro&lt;br/&gt; Deverá ser um código na tabela de moedas (TABX)&lt;br/&gt;Formato: AAA
     *
     * @return codigoMoedaSeguro
     **/
    @JsonProperty("codigoMoedaSeguro")
    @NotNull
    public String getCodigoMoedaSeguro() {
        return codigoMoedaSeguro;
    }

    public void setCodigoMoedaSeguro(String codigoMoedaSeguro) {
        this.codigoMoedaSeguro = codigoMoedaSeguro;
    }

    public CrtViagem codigoMoedaSeguro(String codigoMoedaSeguro) {
        this.codigoMoedaSeguro = codigoMoedaSeguro;
        return this;
    }

    /**
     * Código da moeda do valor FCA.&lt;br/&gt; Deverá ser um código na tabela de moedas (TABX)&lt;br/&gt;Formato: AAA
     *
     * @return codigoMoedaValorFCA
     **/
    @JsonProperty("codigoMoedaValorFCA")
    @NotNull
    public String getCodigoMoedaValorFCA() {
        return codigoMoedaValorFCA;
    }

    public void setCodigoMoedaValorFCA(String codigoMoedaValorFCA) {
        this.codigoMoedaValorFCA = codigoMoedaValorFCA;
    }

    public CrtViagem codigoMoedaValorFCA(String codigoMoedaValorFCA) {
        this.codigoMoedaValorFCA = codigoMoedaValorFCA;
        return this;
    }

    /**
     * Data de emissão do CRT&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    @NotNull
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public CrtViagem dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Get documentosAnexos
     *
     * @return documentosAnexos
     **/
    @JsonProperty("documentosAnexos")
    public List<DocumentoAnexo> getDocumentosAnexos() {
        return documentosAnexos;
    }

    public void setDocumentosAnexos(List<DocumentoAnexo> documentosAnexos) {
        this.documentosAnexos = documentosAnexos;
    }

    public CrtViagem documentosAnexos(List<DocumentoAnexo> documentosAnexos) {
        this.documentosAnexos = documentosAnexos;
        return this;
    }

    public CrtViagem addDocumentosAnexosItem(DocumentoAnexo documentosAnexosItem) {
        this.documentosAnexos.add(documentosAnexosItem);
        return this;
    }

    /**
     * Indicador se a viagem está transportando total ou parcialmente este CRT&lt;br/&gt; Tamanho: 1
     *
     * @return indicadorParcialidade
     **/
    @JsonProperty("indicadorParcialidade")
    @NotNull
    public Boolean isIndicadorParcialidade() {
        return indicadorParcialidade;
    }

    public void setIndicadorParcialidade(Boolean indicadorParcialidade) {
        this.indicadorParcialidade = indicadorParcialidade;
    }

    public CrtViagem indicadorParcialidade(Boolean indicadorParcialidade) {
        this.indicadorParcialidade = indicadorParcialidade;
        return this;
    }

    /**
     * Get itensCarga
     * @return itensCarga
     **/
    @JsonProperty("itensCarga")
    public List<ItemCargaViagem> getItensCarga() {
        return itensCarga;
    }

    public void setItensCarga(List<ItemCargaViagem> itensCarga) {
        this.itensCarga = itensCarga;
    }

    public CrtViagem itensCarga(List<ItemCargaViagem> itensCarga) {
        this.itensCarga = itensCarga;
        return this;
    }

    public CrtViagem addItensCargaItem(ItemCargaViagem itensCargaItem) {
        this.itensCarga.add(itensCargaItem);
        return this;
    }

    /**
     * Get mercadorias
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public CrtViagem mercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public CrtViagem addMercadoriasItem(Mercadoria mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    /**
     * Número do CRT&lt;br/&gt; Tamanho Máximo: 15
     * @return numeroCrt
     **/
    @JsonProperty("numeroCrt")
    @NotNull
    public String getNumeroCrt() {
        return numeroCrt;
    }

    public void setNumeroCrt(String numeroCrt) {
        this.numeroCrt = numeroCrt;
    }

    public CrtViagem numeroCrt(String numeroCrt) {
        this.numeroCrt = numeroCrt;
        return this;
    }

    /**
     * Tipo da carga (Granel(3), Veículo(4), Carga Solta(2), Conteiner (1))
     *
     * @return tipoCarga
     **/
    @JsonProperty("tipoCarga")
    @NotNull
    public String getTipoCarga() {
        if (tipoCarga == null) {
            return null;
        }
        return tipoCarga.value();
    }

    public void setTipoCarga(TipoCargaEnum tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public CrtViagem tipoCarga(TipoCargaEnum tipoCarga) {
        this.tipoCarga = tipoCarga;
        return this;
    }

    /**
     * Valor do frete FCA.&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     * @return valorFCA
     **/
    @JsonProperty("valorFCA")
    @NotNull
    public BigDecimal getValorFCA() {
        return valorFCA;
    }

    public void setValorFCA(BigDecimal valorFCA) {
        this.valorFCA = valorFCA;
    }

    public CrtViagem valorFCA(BigDecimal valorFCA) {
        this.valorFCA = valorFCA;
        return this;
    }

    /**
     * Valor do frete cobrado na parte da carga que está sendo transportada em uma viagem.&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
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

    public CrtViagem valorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
        return this;
    }

    /**
     * Valor do seguro cobrado na parte da carga que está sendo transportada em uma viagem.&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     * @return valorSeguro
     **/
    @JsonProperty("valorSeguro")
    @NotNull
    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public CrtViagem valorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CrtViagem {\n" +
                "    alfandegaDestinoRA: " + toIndentedString(alfandegaDestinoRA) + "\n" +
                "    alfandegaDestinoUL: " + toIndentedString(alfandegaDestinoUL) + "\n" +
                "    codigoMoedaFrete: " + toIndentedString(codigoMoedaFrete) + "\n" +
                "    codigoMoedaSeguro: " + toIndentedString(codigoMoedaSeguro) + "\n" +
                "    codigoMoedaValorFCA: " + toIndentedString(codigoMoedaValorFCA) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    documentosAnexos: " + toIndentedString(documentosAnexos) + "\n" +
                "    indicadorParcialidade: " + toIndentedString(indicadorParcialidade) + "\n" +
                "    itensCarga: " + toIndentedString(itensCarga) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    numeroCrt: " + toIndentedString(numeroCrt) + "\n" +
                "    tipoCarga: " + toIndentedString(tipoCarga) + "\n" +
                "    valorFCA: " + toIndentedString(valorFCA) + "\n" +
                "    valorFrete: " + toIndentedString(valorFrete) + "\n" +
                "    valorSeguro: " + toIndentedString(valorSeguro) + "\n" +
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

