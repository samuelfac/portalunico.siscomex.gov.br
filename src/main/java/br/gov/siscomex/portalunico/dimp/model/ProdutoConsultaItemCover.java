package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoConsultaItemCover", propOrder =
        {"codigo", "versao", "niResponsavel", "ncm"
        })

@XmlRootElement(name = "ProdutoConsultaItemCover")
/**
 * Dados do Produto.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description = "Dados do Produto.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/")
public class ProdutoConsultaItemCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "10", value = "Código do produto.<br>Formato: Inteiro, com até 10 dígitos")
    /**
     * Código do produto.<br>Formato: Inteiro, com até 10 dígitos
     **/
    private String codigo = null;

    @XmlElement(name = "versao")
    @ApiModelProperty(example = "1", value = "Versão do produto.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7")
    /**
     * Versão do produto.<br>Tamanho mínimo: 1<br>Tamanho máximo: 7
     **/
    private String versao = null;

    @XmlElement(name = "niResponsavel")
    @ApiModelProperty(example = "00000000", value = "<br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'AAAAAAAA'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * <br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'AAAAAAAA'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String niResponsavel = null;

    @XmlElement(name = "ncm")
    @ApiModelProperty(example = "02013000", value = "Código da NCM associada ao produto.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
    /**
     * Código da NCM associada ao produto.<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
     **/
    private String ncm = null;

    /**
     * Código do produto.&lt;br&gt;Formato: Inteiro, com até 10 dígitos
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ProdutoConsultaItemCover codigo(String codigo) {
        this.codigo = codigo;
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
     * Versão do produto.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 7
     *
     * @return versao
     **/
    @JsonProperty("versao")
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * &lt;br&gt;Número de Identificação: &lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;AAAAAAAA&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return niResponsavel
     **/
    @JsonProperty("niResponsavel")
    public String getNiResponsavel() {
        return niResponsavel;
    }

    public void setNiResponsavel(String niResponsavel) {
        this.niResponsavel = niResponsavel;
    }

    public ProdutoConsultaItemCover niResponsavel(String niResponsavel) {
        this.niResponsavel = niResponsavel;
        return this;
    }

    /**
     * Código da NCM associada ao produto.&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
     *
     * @return ncm
     **/
    @JsonProperty("ncm")
    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public ProdutoConsultaItemCover ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    public ProdutoConsultaItemCover versao(String versao) {
        this.versao = versao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProdutoConsultaItemCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    niResponsavel: " + toIndentedString(niResponsavel) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "}";
        return sb;
    }
}
