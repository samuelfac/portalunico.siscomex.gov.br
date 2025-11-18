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
@XmlType(name = "SefazOperadorExportadorCover", propOrder =
        {"codigoOperadorExportador", "versaoOperadorExportador", "paisOperadorExportador", "niOperadorExportador"
        })

@XmlRootElement(name = "SefazOperadorExportadorCover")
/**
 * Dados de Operador Exportador
 **/
@ApiModel(description = "Dados de Operador Exportador")
public class SefazOperadorExportadorCover {

    @XmlElement(name = "codigoOperadorExportador")
    @ApiModelProperty(example = "CN001", value = "Código do exportador estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 35")
    /**
     * Código do exportador estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 35
     **/
    private String codigoOperadorExportador = null;

    @XmlElement(name = "versaoOperadorExportador")
    @ApiModelProperty(example = "1.1", value = "Versão do cadastro do exportador estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 6")
    /**
     * Versão do cadastro do exportador estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 6
     **/
    private String versaoOperadorExportador = null;

    @XmlElement(name = "paisOperadorExportador")
    @ApiModelProperty(value = "")
    @Valid
    private PasDoExportadorObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador = null;

    @XmlElement(name = "niOperadorExportador")
    @ApiModelProperty(value = "Identificação de quem cadastrou o exportador no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * Identificação de quem cadastrou o exportador no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String niOperadorExportador = null;

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
     * Código do exportador estrangeiro no Sistema Catalogo de Produtos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35
     *
     * @return codigoOperadorExportador
     **/
    @JsonProperty("codigoOperadorExportador")
    public String getCodigoOperadorExportador() {
        return codigoOperadorExportador;
    }

    public void setCodigoOperadorExportador(String codigoOperadorExportador) {
        this.codigoOperadorExportador = codigoOperadorExportador;
    }

    /**
     * Versão do cadastro do exportador estrangeiro no Sistema Catalogo de Produtos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 6
     *
     * @return versaoOperadorExportador
     **/
    @JsonProperty("versaoOperadorExportador")
    public String getVersaoOperadorExportador() {
        return versaoOperadorExportador;
    }

    public void setVersaoOperadorExportador(String versaoOperadorExportador) {
        this.versaoOperadorExportador = versaoOperadorExportador;
    }

    public SefazOperadorExportadorCover versaoOperadorExportador(String versaoOperadorExportador) {
        this.versaoOperadorExportador = versaoOperadorExportador;
        return this;
    }

    /**
     * Get paisOperadorExportador
     *
     * @return paisOperadorExportador
     **/
    @JsonProperty("paisOperadorExportador")
    public PasDoExportadorObjetoCompostoPelosAtributosCdigoEDescrio getPaisOperadorExportador() {
        return paisOperadorExportador;
    }

    public void setPaisOperadorExportador(PasDoExportadorObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador) {
        this.paisOperadorExportador = paisOperadorExportador;
    }

    public SefazOperadorExportadorCover paisOperadorExportador(PasDoExportadorObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorExportador) {
        this.paisOperadorExportador = paisOperadorExportador;
        return this;
    }

    public SefazOperadorExportadorCover codigoOperadorExportador(String codigoOperadorExportador) {
        this.codigoOperadorExportador = codigoOperadorExportador;
        return this;
    }

    /**
     * Identificação de quem cadastrou o exportador no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)&lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return niOperadorExportador
     **/
    @JsonProperty("niOperadorExportador")
    public String getNiOperadorExportador() {
        return niOperadorExportador;
    }

    public void setNiOperadorExportador(String niOperadorExportador) {
        this.niOperadorExportador = niOperadorExportador;
    }

    public SefazOperadorExportadorCover niOperadorExportador(String niOperadorExportador) {
        this.niOperadorExportador = niOperadorExportador;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazOperadorExportadorCover {\n" +
                "    codigoOperadorExportador: " + toIndentedString(codigoOperadorExportador) + "\n" +
                "    versaoOperadorExportador: " + toIndentedString(versaoOperadorExportador) + "\n" +
                "    paisOperadorExportador: " + toIndentedString(paisOperadorExportador) + "\n" +
                "    niOperadorExportador: " + toIndentedString(niOperadorExportador) + "\n" +
                "}";
        return sb;
    }
}
