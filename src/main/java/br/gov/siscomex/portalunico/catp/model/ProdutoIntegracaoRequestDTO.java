package br.gov.siscomex.portalunico.catp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoIntegracaoRequestDTO", propOrder =
        {"atributosCompostosMultivalorados", "codigosInterno", "denominacao", "ncm", "atributosMultivalorados", "atributos", "descricao", "modalidade", "atributosCompostos"
        })

@XmlRootElement(name = "ProdutoIntegracaoRequestDTO")
public class ProdutoIntegracaoRequestDTO {

    @XmlElement(name = "atributosCompostosMultivalorados")
    @ApiModelProperty(value = "Lista de atributos multivalorados compostos da NCM informada")
    @Valid
    /**
     * Lista de atributos multivalorados compostos da NCM informada
     **/
    private List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados = null;

    @XmlElement(name = "codigosInterno")
    @ApiModelProperty(value = "Lista de códigos internos do produto do Exportador/Importador<br>Tamanho: 60")
    /**
     * Lista de códigos internos do produto do Exportador/Importador<br>Tamanho: 60
     **/
    private List<String> codigosInterno = null;

    @XmlElement(name = "denominacao")
    @ApiModelProperty(example = "Denominação Produto Teste", value = "Denominação do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 120")
    /**
     * Denominação do produto<br>Tamanho mínimo: 1<br>Tamanho máximo: 120
     **/
    private String denominacao = null;

    @XmlElement(name = "ncm")
    @ApiModelProperty(example = "02011000", value = "NCM do produto<br>Tamanho: 8<br>Formato: 'NNNNNNNN'")
    /**
     * NCM do produto<br>Tamanho: 8<br>Formato: 'NNNNNNNN'
     **/
    private String ncm = null;

    @XmlElement(name = "atributosMultivalorados")
    @ApiModelProperty(value = "Lista de atributos multivalorados da NCM informada")
    @Valid
    /**
     * Lista de atributos multivalorados da NCM informada
     **/
    private List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados = null;

    @XmlElement(name = "atributos")
    @ApiModelProperty(value = "Lista de atributos da NCM informada")
    @Valid
    /**
     * Lista de atributos da NCM informada
     **/
    private List<ProdutoCampoSimplesIntegracaoDTO> atributos = null;

    @XmlElement(name = "descricao")
    @ApiModelProperty(example = "Produto Teste", value = "Detalhamento complementar do produto<br>Tamanho: 3700")
    /**
     * Detalhamento complementar do produto<br>Tamanho: 3700
     **/
    private String descricao = null;

    @XmlElement(name = "modalidade")
    @ApiModelProperty(example = "EXPORTACAO", value = "Modalidade de operacao <br>Domínio: (IMPORTACAO <br>EXPORTACAO)")
    /**
     * Modalidade de operacao <br>Domínio: (IMPORTACAO <br>EXPORTACAO)
     **/
    private String modalidade = null;

    @XmlElement(name = "atributosCompostos")
    @ApiModelProperty(value = "Lista de atributos compostos da NCM informada")
    @Valid
    /**
     * Lista de atributos compostos da NCM informada
     **/
    private List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos = null;

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
     * Lista de atributos multivalorados compostos da NCM informada
     *
     * @return atributosCompostosMultivalorados
     **/
    @JsonProperty("atributosCompostosMultivalorados")
    public List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> getAtributosCompostosMultivalorados() {
        return atributosCompostosMultivalorados;
    }

    public void setAtributosCompostosMultivalorados(List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados) {
        this.atributosCompostosMultivalorados = atributosCompostosMultivalorados;
    }

    public ProdutoIntegracaoRequestDTO atributosCompostosMultivalorados(List<ProdutoCampoCompostoMultivaloradoIntegracaoDTO> atributosCompostosMultivalorados) {
        this.atributosCompostosMultivalorados = atributosCompostosMultivalorados;
        return this;
    }

    public ProdutoIntegracaoRequestDTO addAtributosCompostosMultivaloradosItem(ProdutoCampoCompostoMultivaloradoIntegracaoDTO atributosCompostosMultivaloradosItem) {
        this.atributosCompostosMultivalorados.add(atributosCompostosMultivaloradosItem);
        return this;
    }

    /**
     * Lista de códigos internos do produto do Exportador/Importador&lt;br&gt;Tamanho: 60
     *
     * @return codigosInterno
     **/
    @JsonProperty("codigosInterno")
    public List<String> getCodigosInterno() {
        return codigosInterno;
    }

    public void setCodigosInterno(List<String> codigosInterno) {
        this.codigosInterno = codigosInterno;
    }

    public ProdutoIntegracaoRequestDTO codigosInterno(List<String> codigosInterno) {
        this.codigosInterno = codigosInterno;
        return this;
    }

    public ProdutoIntegracaoRequestDTO addCodigosInternoItem(String codigosInternoItem) {
        this.codigosInterno.add(codigosInternoItem);
        return this;
    }

    /**
     * Denominação do produto&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 120
     *
     * @return denominacao
     **/
    @JsonProperty("denominacao")
    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public ProdutoIntegracaoRequestDTO denominacao(String denominacao) {
        this.denominacao = denominacao;
        return this;
    }

    /**
     * NCM do produto&lt;br&gt;Tamanho: 8&lt;br&gt;Formato: &#39;NNNNNNNN&#39;
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

    public ProdutoIntegracaoRequestDTO ncm(String ncm) {
        this.ncm = ncm;
        return this;
    }

    /**
     * Lista de atributos multivalorados da NCM informada
     *
     * @return atributosMultivalorados
     **/
    @JsonProperty("atributosMultivalorados")
    public List<ProdutoCampoMultivaloradoIntegracaoDTO> getAtributosMultivalorados() {
        return atributosMultivalorados;
    }

    public void setAtributosMultivalorados(List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados) {
        this.atributosMultivalorados = atributosMultivalorados;
    }

    public ProdutoIntegracaoRequestDTO atributosMultivalorados(List<ProdutoCampoMultivaloradoIntegracaoDTO> atributosMultivalorados) {
        this.atributosMultivalorados = atributosMultivalorados;
        return this;
    }

    public ProdutoIntegracaoRequestDTO addAtributosMultivaloradosItem(ProdutoCampoMultivaloradoIntegracaoDTO atributosMultivaloradosItem) {
        this.atributosMultivalorados.add(atributosMultivaloradosItem);
        return this;
    }

    /**
     * Lista de atributos da NCM informada
     *
     * @return atributos
     **/
    @JsonProperty("atributos")
    public List<ProdutoCampoSimplesIntegracaoDTO> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<ProdutoCampoSimplesIntegracaoDTO> atributos) {
        this.atributos = atributos;
    }

    public ProdutoIntegracaoRequestDTO atributos(List<ProdutoCampoSimplesIntegracaoDTO> atributos) {
        this.atributos = atributos;
        return this;
    }

    public ProdutoIntegracaoRequestDTO addAtributosItem(ProdutoCampoSimplesIntegracaoDTO atributosItem) {
        this.atributos.add(atributosItem);
        return this;
    }

    /**
     * Detalhamento complementar do produto&lt;br&gt;Tamanho: 3700
     *
     * @return descricao
     **/
    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProdutoIntegracaoRequestDTO descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Modalidade de operacao &lt;br&gt;Domínio: (IMPORTACAO &lt;br&gt;EXPORTACAO)
     *
     * @return modalidade
     **/
    @JsonProperty("modalidade")
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public ProdutoIntegracaoRequestDTO modalidade(String modalidade) {
        this.modalidade = modalidade;
        return this;
    }

    /**
     * Lista de atributos compostos da NCM informada
     *
     * @return atributosCompostos
     **/
    @JsonProperty("atributosCompostos")
    public List<ProdutoCampoCompostoIntegracaoDTO> getAtributosCompostos() {
        return atributosCompostos;
    }

    public void setAtributosCompostos(List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos) {
        this.atributosCompostos = atributosCompostos;
    }

    public ProdutoIntegracaoRequestDTO atributosCompostos(List<ProdutoCampoCompostoIntegracaoDTO> atributosCompostos) {
        this.atributosCompostos = atributosCompostos;
        return this;
    }

    public ProdutoIntegracaoRequestDTO addAtributosCompostosItem(ProdutoCampoCompostoIntegracaoDTO atributosCompostosItem) {
        this.atributosCompostos.add(atributosCompostosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ProdutoIntegracaoRequestDTO {\n" +
                "    atributosCompostosMultivalorados: " + toIndentedString(atributosCompostosMultivalorados) + "\n" +
                "    codigosInterno: " + toIndentedString(codigosInterno) + "\n" +
                "    denominacao: " + toIndentedString(denominacao) + "\n" +
                "    ncm: " + toIndentedString(ncm) + "\n" +
                "    atributosMultivalorados: " + toIndentedString(atributosMultivalorados) + "\n" +
                "    atributos: " + toIndentedString(atributos) + "\n" +
                "    descricao: " + toIndentedString(descricao) + "\n" +
                "    modalidade: " + toIndentedString(modalidade) + "\n" +
                "    atributosCompostos: " + toIndentedString(atributosCompostos) + "\n" +
                "}";
        return sb;
    }
}
