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
@XmlType(name = "FabricanteIntegracaoResponseDTO", propOrder =
        {"cpfCnpjRaiz", "codigoOperadorEstrangeiro", "cpfCnpjFabricante", "conhecido", "codigoProduto", "codigoPais"
        })

@XmlRootElement(name = "FabricanteIntegracaoResponseDTO")
public class FabricanteIntegracaoResponseDTO {

    @XmlElement(name = "cpfCnpjRaiz", required = true)
    @ApiModelProperty(example = "00000000", required = true, value = "CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos<br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfCnpjRaiz = null;

    @XmlElement(name = "codigoOperadorEstrangeiro")
    @ApiModelProperty(example = "123", value = "Código do operador estrangeiro (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35")
    /**
     * Código do operador estrangeiro (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35
     **/
    private String codigoOperadorEstrangeiro = null;

    @XmlElement(name = "cpfCnpjFabricante")
    @ApiModelProperty(example = "00000000000000", value = "CPF/CNPJ do fabricante nacional<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF/CNPJ do fabricante nacional<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfCnpjFabricante = null;

    @XmlElement(name = "conhecido", required = true)
    @ApiModelProperty(example = "false", required = true, value = "True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido <br>Formato: True/False")
    /**
     * True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido <br>Formato: True/False
     **/
    private Boolean conhecido = false;

    @XmlElement(name = "codigoProduto")
    @ApiModelProperty(example = "1", value = "Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'")
    /**
     * Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'
     **/
    private Long codigoProduto = null;

    @XmlElement(name = "codigoPais", required = true)
    @ApiModelProperty(example = "DE", required = true, value = "Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'")
    /**
     * Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'
     **/
    private String codigoPais = null;

    /**
     * CPF ou CNPJ raiz da empresa responsável. Informar os 8 primeiros dígitos do CNPJ, suprimindo os pontos&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return cpfCnpjRaiz
     **/
    @JsonProperty("cpfCnpjRaiz")
    @NotNull
    public String getCpfCnpjRaiz() {
        return cpfCnpjRaiz;
    }

    public void setCpfCnpjRaiz(String cpfCnpjRaiz) {
        this.cpfCnpjRaiz = cpfCnpjRaiz;
    }

    public FabricanteIntegracaoResponseDTO cpfCnpjRaiz(String cpfCnpjRaiz) {
        this.cpfCnpjRaiz = cpfCnpjRaiz;
        return this;
    }

    /**
     * Código do operador estrangeiro (Número de Identificação do Operador Estrangeiro)&lt;br&gt;Tamanho: 35
     *
     * @return codigoOperadorEstrangeiro
     **/
    @JsonProperty("codigoOperadorEstrangeiro")
    public String getCodigoOperadorEstrangeiro() {
        return codigoOperadorEstrangeiro;
    }

    public void setCodigoOperadorEstrangeiro(String codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
    }

    public FabricanteIntegracaoResponseDTO codigoOperadorEstrangeiro(String codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
        return this;
    }

    /**
     * CPF/CNPJ do fabricante nacional&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return cpfCnpjFabricante
     **/
    @JsonProperty("cpfCnpjFabricante")
    public String getCpfCnpjFabricante() {
        return cpfCnpjFabricante;
    }

    public void setCpfCnpjFabricante(String cpfCnpjFabricante) {
        this.cpfCnpjFabricante = cpfCnpjFabricante;
    }

    public FabricanteIntegracaoResponseDTO cpfCnpjFabricante(String cpfCnpjFabricante) {
        this.cpfCnpjFabricante = cpfCnpjFabricante;
        return this;
    }

    /**
     * True para fabricante/produtor desconhecido e False para fabricante/produtor conhecido &lt;br&gt;Formato: True/False
     *
     * @return conhecido
     **/
    @JsonProperty("conhecido")
    @NotNull
    public Boolean isisConhecido() {
        return conhecido;
    }

    public void setConhecido(Boolean conhecido) {
        this.conhecido = conhecido;
    }

    public FabricanteIntegracaoResponseDTO conhecido(Boolean conhecido) {
        this.conhecido = conhecido;
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
     * Código do produto&lt;br&gt;Tamanho: 10&lt;br&gt;Formato: &#39;NNNNNNNNNN&#39;
     *
     * @return codigoProduto
     **/
    @JsonProperty("codigoProduto")
    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * Código do país de origem no formato ISO 3166&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: &#39;AA&#39;
     *
     * @return codigoPais
     **/
    @JsonProperty("codigoPais")
    @NotNull
    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public FabricanteIntegracaoResponseDTO codigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    public FabricanteIntegracaoResponseDTO codigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class FabricanteIntegracaoResponseDTO {\n" +
                "    cpfCnpjRaiz: " + toIndentedString(cpfCnpjRaiz) + "\n" +
                "    codigoOperadorEstrangeiro: " + toIndentedString(codigoOperadorEstrangeiro) + "\n" +
                "    cpfCnpjFabricante: " + toIndentedString(cpfCnpjFabricante) + "\n" +
                "    conhecido: " + toIndentedString(conhecido) + "\n" +
                "    codigoProduto: " + toIndentedString(codigoProduto) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "}";
        return sb;
    }
}
