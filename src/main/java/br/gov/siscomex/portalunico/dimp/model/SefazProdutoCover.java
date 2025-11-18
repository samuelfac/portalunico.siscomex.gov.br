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
@XmlType(name = "SefazProdutoCover", propOrder =
        {"codigoProduto", "versaoProduto", "niResponsavelProduto", "codigoNCM", "paisOrigem"
        })

@XmlRootElement(name = "SefazProdutoCover")
/**
 * Dados do produto
 **/
@ApiModel(description = "Dados do produto")
public class SefazProdutoCover {

    @XmlElement(name = "codigoProduto")
    @ApiModelProperty(example = "10", value = "Código do produto<br>Formato: Inteiro, com até 10 digitos")
    /**
     * Código do produto<br>Formato: Inteiro, com até 10 digitos
     **/
    private String codigoProduto = null;

    @XmlElement(name = "versaoProduto")
    @ApiModelProperty(example = "1", value = "Versão do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
    /**
     * Versão do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
     **/
    private String versaoProduto = null;

    @XmlElement(name = "niResponsavelProduto")
    @ApiModelProperty(example = "00000000", value = "Número de Identificação  do operador estrangeiro<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * Número de Identificação  do operador estrangeiro<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String niResponsavelProduto = null;

    @XmlElement(name = "codigoNCM")
    @ApiModelProperty(example = "49019100", value = "Código NCM<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
    /**
     * Código NCM<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
     **/
    private String codigoNCM = null;

    @XmlElement(name = "paisOrigem")
    @ApiModelProperty(value = "")
    @Valid
    private PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem = null;

    /**
     * Código do produto&lt;br&gt;Formato: Inteiro, com até 10 digitos
     *
     * @return codigoProduto
     **/
    @JsonProperty("codigoProduto")
    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public SefazProdutoCover codigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
        return this;
    }

    /**
     * Versão do produto&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
     *
     * @return versaoProduto
     **/
    @JsonProperty("versaoProduto")
    public String getVersaoProduto() {
        return versaoProduto;
    }

    public void setVersaoProduto(String versaoProduto) {
        this.versaoProduto = versaoProduto;
    }

    public SefazProdutoCover versaoProduto(String versaoProduto) {
        this.versaoProduto = versaoProduto;
        return this;
    }

    /**
     * Número de Identificação  do operador estrangeiro&lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return niResponsavelProduto
     **/
    @JsonProperty("niResponsavelProduto")
    public String getNiResponsavelProduto() {
        return niResponsavelProduto;
    }

    public void setNiResponsavelProduto(String niResponsavelProduto) {
        this.niResponsavelProduto = niResponsavelProduto;
    }

    public SefazProdutoCover niResponsavelProduto(String niResponsavelProduto) {
        this.niResponsavelProduto = niResponsavelProduto;
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
     * Código NCM&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
     *
     * @return codigoNCM
     **/
    @JsonProperty("codigoNCM")
    public String getCodigoNCM() {
        return codigoNCM;
    }

    public void setCodigoNCM(String codigoNCM) {
        this.codigoNCM = codigoNCM;
    }

    public SefazProdutoCover codigoNCM(String codigoNCM) {
        this.codigoNCM = codigoNCM;
        return this;
    }

    /**
     * Get paisOrigem
     *
     * @return paisOrigem
     **/
    @JsonProperty("paisOrigem")
    public PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public SefazProdutoCover paisOrigem(PasDeOrigemDoProdutoObjetoCompostoPelosAtributosCdigoEDescrio paisOrigem) {
        this.paisOrigem = paisOrigem;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazProdutoCover {\n" +
                "    codigoProduto: " + toIndentedString(codigoProduto) + "\n" +
                "    versaoProduto: " + toIndentedString(versaoProduto) + "\n" +
                "    niResponsavelProduto: " + toIndentedString(niResponsavelProduto) + "\n" +
                "    codigoNCM: " + toIndentedString(codigoNCM) + "\n" +
                "    paisOrigem: " + toIndentedString(paisOrigem) + "\n" +
                "}";
        return sb;
    }
}
