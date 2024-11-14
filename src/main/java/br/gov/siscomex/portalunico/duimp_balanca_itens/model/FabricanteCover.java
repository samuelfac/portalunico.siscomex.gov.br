package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

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
@XmlType(name = "FabricanteCover", propOrder =
        {"codigo", "versao", "niOperador", "pais"
        })

@XmlRootElement(name = "FabricanteCover")
/**
 * Dados do Fabricante/Produtor<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/
 **/
@ApiModel(description = "Dados do Fabricante/Produtor<br>Origem: Sistema Catálogo de Produtos - https://api-docs.portalunico.siscomex.gov.br/")
public class FabricanteCover {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "2104", value = "Código do Fabricante.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação: Quando o país de origem for \"BR\", este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \"BR\", deverá ser utilizado o código do exportador estrangeiro.")
    /**
     * Código do Fabricante.<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação: Quando o país de origem for \"BR\", este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \"BR\", deverá ser utilizado o código do exportador estrangeiro.
     **/
    private String codigo = null;

    @XmlElement(name = "versao")
    @ApiModelProperty(example = "1", value = "Versão do fabricante.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6")
    /**
     * Versão do fabricante.<br>Tamanho mínimo: 0<br>Tamanho máximo: 6
     **/
    private String versao = null;

    @XmlElement(name = "niOperador")
    @ApiModelProperty(example = "00000000", value = "<br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * <br>Número de Identificação: <br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String niOperador = null;

    @XmlElement(name = "pais")
    @ApiModelProperty(value = "")
    @Valid
    private PaisFabricanteCover pais = null;

    /**
     * Código do Fabricante.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Observação: Quando o país de origem for \&quot;BR\&quot;, este atributo deverá ser preenchido com o CNPJ ou CPF do Fabricante. Quando o país de origem for diferente de \&quot;BR\&quot;, deverá ser utilizado o código do exportador estrangeiro.
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

    public FabricanteCover codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Versão do fabricante.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 6
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

    public FabricanteCover versao(String versao) {
        this.versao = versao;
        return this;
    }

    /**
     * &lt;br&gt;Número de Identificação: &lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return niOperador
     **/
    @JsonProperty("niOperador")
    public String getNiOperador() {
        return niOperador;
    }

    public void setNiOperador(String niOperador) {
        this.niOperador = niOperador;
    }

    public FabricanteCover niOperador(String niOperador) {
        this.niOperador = niOperador;
        return this;
    }

    /**
     * Get pais
     *
     * @return pais
     **/
    @JsonProperty("pais")
    public PaisFabricanteCover getPais() {
        return pais;
    }

    public void setPais(PaisFabricanteCover pais) {
        this.pais = pais;
    }

    public FabricanteCover pais(PaisFabricanteCover pais) {
        this.pais = pais;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class FabricanteCover {\n" +
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

