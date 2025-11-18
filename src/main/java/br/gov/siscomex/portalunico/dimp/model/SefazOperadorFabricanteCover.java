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
@XmlType(name = "SefazOperadorFabricanteCover", propOrder =
        {"codigoOperadorFabricante", "versaoOperadorFabricante", "paisOperadorFabricante", "niOperadorFabricante"
        })

@XmlRootElement(name = "SefazOperadorFabricanteCover")
/**
 * Dados de Operador Fabricante
 **/
@ApiModel(description = "Dados de Operador Fabricante")
public class SefazOperadorFabricanteCover {

    @XmlElement(name = "codigoOperadorFabricante")
    @ApiModelProperty(example = "CN001", value = "Código do fabricante estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO")
    /**
     * Código do fabricante estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 35<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO
     **/
    private String codigoOperadorFabricante = null;

    @XmlElement(name = "versaoOperadorFabricante")
    @ApiModelProperty(example = "1.1", value = "Versão do cadastro do fabricante estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 6<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO")
    /**
     * Versão do cadastro do fabricante estrangeiro no Sistema Catalogo de Produtos<br>Tamanho mínimo: 1<br>Tamanho máximo: 6<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO
     **/
    private String versaoOperadorFabricante = null;

    @XmlElement(name = "paisOperadorFabricante")
    @ApiModelProperty(value = "")
    @Valid
    private PasDoFabricanteObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorFabricante = null;

    @XmlElement(name = "niOperadorFabricante")
    @ApiModelProperty(value = "Identificação de quem cadastrou o fabricante no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO")
    /**
     * Identificação de quem cadastrou o fabricante no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)<br>Caso seja CNPJ (Raiz): <br>Tamanho: 8<br>Formato: 'NNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'<br>Observação:<br>Quando o fabricante for desconhecido, este atributo será NULO
     **/
    private String niOperadorFabricante = null;

    /**
     * Código do fabricante estrangeiro no Sistema Catalogo de Produtos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Observação:&lt;br&gt;Quando o fabricante for desconhecido, este atributo será NULO
     *
     * @return codigoOperadorFabricante
     **/
    @JsonProperty("codigoOperadorFabricante")
    public String getCodigoOperadorFabricante() {
        return codigoOperadorFabricante;
    }

    public void setCodigoOperadorFabricante(String codigoOperadorFabricante) {
        this.codigoOperadorFabricante = codigoOperadorFabricante;
    }

    public SefazOperadorFabricanteCover codigoOperadorFabricante(String codigoOperadorFabricante) {
        this.codigoOperadorFabricante = codigoOperadorFabricante;
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
     * Versão do cadastro do fabricante estrangeiro no Sistema Catalogo de Produtos&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 6&lt;br&gt;Observação:&lt;br&gt;Quando o fabricante for desconhecido, este atributo será NULO
     *
     * @return versaoOperadorFabricante
     **/
    @JsonProperty("versaoOperadorFabricante")
    public String getVersaoOperadorFabricante() {
        return versaoOperadorFabricante;
    }

    public void setVersaoOperadorFabricante(String versaoOperadorFabricante) {
        this.versaoOperadorFabricante = versaoOperadorFabricante;
    }

    /**
     * Get paisOperadorFabricante
     *
     * @return paisOperadorFabricante
     **/
    @JsonProperty("paisOperadorFabricante")
    public PasDoFabricanteObjetoCompostoPelosAtributosCdigoEDescrio getPaisOperadorFabricante() {
        return paisOperadorFabricante;
    }

    public void setPaisOperadorFabricante(PasDoFabricanteObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorFabricante) {
        this.paisOperadorFabricante = paisOperadorFabricante;
    }

    public SefazOperadorFabricanteCover paisOperadorFabricante(PasDoFabricanteObjetoCompostoPelosAtributosCdigoEDescrio paisOperadorFabricante) {
        this.paisOperadorFabricante = paisOperadorFabricante;
        return this;
    }

    public SefazOperadorFabricanteCover versaoOperadorFabricante(String versaoOperadorFabricante) {
        this.versaoOperadorFabricante = versaoOperadorFabricante;
        return this;
    }

    /**
     * Identificação de quem cadastrou o fabricante no sistema Catalogo de Produtos (CPF ou CNPJ Raiz)&lt;br&gt;Caso seja CNPJ (Raiz): &lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;br&gt;Observação:&lt;br&gt;Quando o fabricante for desconhecido, este atributo será NULO
     *
     * @return niOperadorFabricante
     **/
    @JsonProperty("niOperadorFabricante")
    public String getNiOperadorFabricante() {
        return niOperadorFabricante;
    }

    public void setNiOperadorFabricante(String niOperadorFabricante) {
        this.niOperadorFabricante = niOperadorFabricante;
    }

    public SefazOperadorFabricanteCover niOperadorFabricante(String niOperadorFabricante) {
        this.niOperadorFabricante = niOperadorFabricante;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazOperadorFabricanteCover {\n" +
                "    codigoOperadorFabricante: " + toIndentedString(codigoOperadorFabricante) + "\n" +
                "    versaoOperadorFabricante: " + toIndentedString(versaoOperadorFabricante) + "\n" +
                "    paisOperadorFabricante: " + toIndentedString(paisOperadorFabricante) + "\n" +
                "    niOperadorFabricante: " + toIndentedString(niOperadorFabricante) + "\n" +
                "}";
        return sb;
    }
}
