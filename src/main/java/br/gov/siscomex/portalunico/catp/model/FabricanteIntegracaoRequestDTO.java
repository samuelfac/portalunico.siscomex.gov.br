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
@XmlType(name = "FabricanteIntegracaoRequestDTO", propOrder =
        {"codigoOperadorEstrangeiro", "codigoProduto", "cpfCnpjFabricante", "conhecido", "codigoPais"
        })

@XmlRootElement(name = "FabricanteIntegracaoRequestDTO")
public class FabricanteIntegracaoRequestDTO {

    @XmlElement(name = "codigoOperadorEstrangeiro")
    @ApiModelProperty(example = "123", value = "Código do operador estrangeiro (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35")
    /**
     * Código do operador estrangeiro (Número de Identificação do Operador Estrangeiro)<br>Tamanho: 35
     **/
    private String codigoOperadorEstrangeiro = null;

    @XmlElement(name = "codigoProduto")
    @ApiModelProperty(example = "1", value = "Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'")
    /**
     * Código do produto<br>Tamanho: 10<br>Formato: 'NNNNNNNNNN'
     **/
    private Long codigoProduto = null;

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

    @XmlElement(name = "codigoPais", required = true)
    @ApiModelProperty(example = "DE", required = true, value = "Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'")
    /**
     * Código do país de origem no formato ISO 3166<br>Tamanho: 2<br>Formato: 'AA'
     **/
    private String codigoPais = null;

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

    public FabricanteIntegracaoRequestDTO codigoOperadorEstrangeiro(String codigoOperadorEstrangeiro) {
        this.codigoOperadorEstrangeiro = codigoOperadorEstrangeiro;
        return this;
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

    public FabricanteIntegracaoRequestDTO codigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
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

    public FabricanteIntegracaoRequestDTO cpfCnpjFabricante(String cpfCnpjFabricante) {
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

    public FabricanteIntegracaoRequestDTO conhecido(Boolean conhecido) {
        this.conhecido = conhecido;
        return this;
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

    public FabricanteIntegracaoRequestDTO codigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class FabricanteIntegracaoRequestDTO {\n" +
                "    codigoOperadorEstrangeiro: " + toIndentedString(codigoOperadorEstrangeiro) + "\n" +
                "    codigoProduto: " + toIndentedString(codigoProduto) + "\n" +
                "    cpfCnpjFabricante: " + toIndentedString(cpfCnpjFabricante) + "\n" +
                "    conhecido: " + toIndentedString(conhecido) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "}";
        return sb;
    }
}
