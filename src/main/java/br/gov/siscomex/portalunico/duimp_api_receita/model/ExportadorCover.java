package br.gov.siscomex.portalunico.duimp_api_receita.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportadorCover", propOrder =
        {"codigo", "versao", "niOperador", "pais"
        })

@XmlRootElement(name = "ExportadorCover")
/**
 * Dados de Operador Estrangeiro.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Quando o atributo \"exportadorIndicadorFabricante\" for preenchido com o valor \"EXPORTADOR_IGUAL_FABRICANTE\", os valores informados neste grupo devem ser idênticos aos valores informados no grupo \"Fabricante\".
 **/
@ApiModel(description = "Dados de Operador Estrangeiro.<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Quando o atributo \"exportadorIndicadorFabricante\" for preenchido com o valor \"EXPORTADOR_IGUAL_FABRICANTE\", os valores informados neste grupo devem ser idênticos aos valores informados no grupo \"Fabricante\".")
public class ExportadorCover {

    @XmlElement(name = "codigo", required = true)
    @ApiModelProperty(example = "CN001", required = true, value = "Código do exportador estrangeiro.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
    /**
     * Código do exportador estrangeiro.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
     **/
    private String codigo = null;

    @XmlElement(name = "versao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Versão do exportador.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6")
    /**
     * Versão do exportador.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6
     **/
    private String versao = null;

    @XmlElement(name = "niOperador", required = true)
    @ApiModelProperty(example = "00000000", required = true, value = "<br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * <br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String niOperador = null;

    @XmlElement(name = "pais", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private PaisExportadorCover pais = null;

    /**
     * Código do exportador estrangeiro.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    @NotNull
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ExportadorCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Versão do exportador.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 6
     *
     * @return versao
     **/
    @JsonProperty("versao")
    @NotNull
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public ExportadorCover versao(String versao) {
        this.versao = versao;
        return this;
    }

    /**
     * &lt;br&gt;Número de Identificação: &lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return niOperador
     **/
    @JsonProperty("niOperador")
    @NotNull
    public String getNiOperador() {
        return niOperador;
    }

    public void setNiOperador(String niOperador) {
        this.niOperador = niOperador;
    }

    public ExportadorCover niOperador(String niOperador) {
        this.niOperador = niOperador;
        return this;
    }

    /**
     * Get pais
     *
     * @return pais
     **/
    @JsonProperty("pais")
    @NotNull
    public PaisExportadorCover getPais() {
        return pais;
    }

    public void setPais(PaisExportadorCover pais) {
        this.pais = pais;
    }

    public ExportadorCover pais(PaisExportadorCover pais) {
        this.pais = pais;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ExportadorCover {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    versao: " + toIndentedString(versao) + "\n" +
                "    niOperador: " + toIndentedString(niOperador) + "\n" +
                "    pais: " + toIndentedString(pais) + "\n" +
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

