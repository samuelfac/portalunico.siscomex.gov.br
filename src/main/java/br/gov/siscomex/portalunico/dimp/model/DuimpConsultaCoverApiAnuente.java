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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuimpConsultaCoverApiAnuente", propOrder =
        {"identificacao", "situacao", "equipesTrabalho", "resultadoAnaliseRisco", "carga", "documentos", "adicoes", "tributos", "pagamentos", "tratamentoAdministrativo", "quantidadeItens", "itens"
        })

@XmlRootElement(name = "DuimpConsultaCoverApiAnuente")
/**
 * Dados gerais de uma Duimp
 **/
@ApiModel(description = "Dados gerais de uma Duimp")
public class DuimpConsultaCoverApiAnuente {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "")
    @Valid
    private IdentificacaoDuimpConsultaCover identificacao = null;

    @XmlElement(name = "situacao")
    @ApiModelProperty(value = "")
    @Valid
    private SituacaoDuimpConsultaCover situacao = null;

    @XmlElement(name = "equipesTrabalho")
    @ApiModelProperty(value = "")
    @Valid
    private List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho = null;

    @XmlElement(name = "resultadoAnaliseRisco")
    @ApiModelProperty(value = "")
    @Valid
    private ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco = null;

    @XmlElement(name = "carga")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDuimpConsultaCover carga = null;

    @XmlElement(name = "documentos")
    @ApiModelProperty(value = "")
    @Valid
    private DocumentosDuimpConsultaCover documentos = null;

    @XmlElement(name = "adicoes")
    @ApiModelProperty(value = "Dados das adições.<br>Estes dados fazem parte da aba 'Resumo' da Duimp.<br>Eles são retornados apenas para o Gestor (SECEX)")
    @Valid
    /**
     * Dados das adições.<br>Estes dados fazem parte da aba 'Resumo' da Duimp.<br>Eles são retornados apenas para o Gestor (SECEX)
     **/
    private List<AdicaoValoresCalculadosDuimpCover> adicoes = null;

    @XmlElement(name = "tributos")
    @ApiModelProperty(value = "")
    @Valid
    private TributoConsultaDuimpCoverApiAnuente tributos = null;

    @XmlElement(name = "pagamentos")
    @ApiModelProperty(value = "Dados dos Pagamentos.<br>Estes dados fazem parte da aba 'Resumo' da Duimp.<br>Eles são retornados apenas para o Gestor (SECEX)")
    @Valid
    /**
     * Dados dos Pagamentos.<br>Estes dados fazem parte da aba 'Resumo' da Duimp.<br>Eles são retornados apenas para o Gestor (SECEX)
     **/
    private List<PagamentoDuimpConsultaCover> pagamentos = null;

    @XmlElement(name = "tratamentoAdministrativo")
    @ApiModelProperty(value = "")
    @Valid
    private TratamentoAdministrativoCover tratamentoAdministrativo = null;

    @XmlElement(name = "quantidadeItens")
    @ApiModelProperty(example = "100", value = "Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5")
    /**
     * Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5
     **/
    private Integer quantidadeItens = null;

    @XmlElement(name = "itens")
    @ApiModelProperty(value = "Lista contendo os links para os itens da Duimp")
    @Valid
    /**
     * Lista contendo os links para os itens da Duimp
     **/
    private List<ItemConsultaDuimpCover> itens = null;

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
     * Get identificacao
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public IdentificacaoDuimpConsultaCover getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(IdentificacaoDuimpConsultaCover identificacao) {
        this.identificacao = identificacao;
    }

    /**
     * Get situacao
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public SituacaoDuimpConsultaCover getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDuimpConsultaCover situacao) {
        this.situacao = situacao;
    }

    public DuimpConsultaCoverApiAnuente situacao(SituacaoDuimpConsultaCover situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Get equipesTrabalho
     *
     * @return equipesTrabalho
     **/
    @JsonProperty("equipesTrabalho")
    public List<EquipeTrabalhoDuimpConsultaCover> getEquipesTrabalho() {
        return equipesTrabalho;
    }

    public void setEquipesTrabalho(List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho) {
        this.equipesTrabalho = equipesTrabalho;
    }

    public DuimpConsultaCoverApiAnuente equipesTrabalho(List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho) {
        this.equipesTrabalho = equipesTrabalho;
        return this;
    }

    public DuimpConsultaCoverApiAnuente addEquipesTrabalhoItem(EquipeTrabalhoDuimpConsultaCover equipesTrabalhoItem) {
        this.equipesTrabalho.add(equipesTrabalhoItem);
        return this;
    }

    public DuimpConsultaCoverApiAnuente identificacao(IdentificacaoDuimpConsultaCover identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Get resultadoAnaliseRisco
     *
     * @return resultadoAnaliseRisco
     **/
    @JsonProperty("resultadoAnaliseRisco")
    public ResultadoAnaliseRiscoDuimpCover getResultadoAnaliseRisco() {
        return resultadoAnaliseRisco;
    }

    public void setResultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
        this.resultadoAnaliseRisco = resultadoAnaliseRisco;
    }

    public DuimpConsultaCoverApiAnuente resultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
        this.resultadoAnaliseRisco = resultadoAnaliseRisco;
        return this;
    }

    /**
     * Get carga
     *
     * @return carga
     **/
    @JsonProperty("carga")
    public CargaDuimpConsultaCover getCarga() {
        return carga;
    }

    public void setCarga(CargaDuimpConsultaCover carga) {
        this.carga = carga;
    }

    /**
     * Get documentos
     *
     * @return documentos
     **/
    @JsonProperty("documentos")
    public DocumentosDuimpConsultaCover getDocumentos() {
        return documentos;
    }

    public void setDocumentos(DocumentosDuimpConsultaCover documentos) {
        this.documentos = documentos;
    }

    public DuimpConsultaCoverApiAnuente documentos(DocumentosDuimpConsultaCover documentos) {
        this.documentos = documentos;
        return this;
    }

    public DuimpConsultaCoverApiAnuente carga(CargaDuimpConsultaCover carga) {
        this.carga = carga;
        return this;
    }

    /**
     * Dados das adições.&lt;br&gt;Estes dados fazem parte da aba &#39;Resumo&#39; da Duimp.&lt;br&gt;Eles são retornados apenas para o Gestor (SECEX)
     *
     * @return adicoes
     **/
    @JsonProperty("adicoes")
    public List<AdicaoValoresCalculadosDuimpCover> getAdicoes() {
        return adicoes;
    }

    public void setAdicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
        this.adicoes = adicoes;
    }

    public DuimpConsultaCoverApiAnuente adicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
        this.adicoes = adicoes;
        return this;
    }

    public DuimpConsultaCoverApiAnuente addAdicoesItem(AdicaoValoresCalculadosDuimpCover adicoesItem) {
        this.adicoes.add(adicoesItem);
        return this;
    }

    /**
     * Get tributos
     *
     * @return tributos
     **/
    @JsonProperty("tributos")
    public TributoConsultaDuimpCoverApiAnuente getTributos() {
        return tributos;
    }

    public void setTributos(TributoConsultaDuimpCoverApiAnuente tributos) {
        this.tributos = tributos;
    }

    /**
     * Dados dos Pagamentos.&lt;br&gt;Estes dados fazem parte da aba &#39;Resumo&#39; da Duimp.&lt;br&gt;Eles são retornados apenas para o Gestor (SECEX)
     *
     * @return pagamentos
     **/
    @JsonProperty("pagamentos")
    public List<PagamentoDuimpConsultaCover> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PagamentoDuimpConsultaCover> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public DuimpConsultaCoverApiAnuente pagamentos(List<PagamentoDuimpConsultaCover> pagamentos) {
        this.pagamentos = pagamentos;
        return this;
    }

    public DuimpConsultaCoverApiAnuente addPagamentosItem(PagamentoDuimpConsultaCover pagamentosItem) {
        this.pagamentos.add(pagamentosItem);
        return this;
    }

    public DuimpConsultaCoverApiAnuente tributos(TributoConsultaDuimpCoverApiAnuente tributos) {
        this.tributos = tributos;
        return this;
    }

    /**
     * Get tratamentoAdministrativo
     *
     * @return tratamentoAdministrativo
     **/
    @JsonProperty("tratamentoAdministrativo")
    public TratamentoAdministrativoCover getTratamentoAdministrativo() {
        return tratamentoAdministrativo;
    }

    public void setTratamentoAdministrativo(TratamentoAdministrativoCover tratamentoAdministrativo) {
        this.tratamentoAdministrativo = tratamentoAdministrativo;
    }

    /**
     * Quantidade total de Itens da Duimp.&lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 5
     * @return quantidadeItens
     **/
    @JsonProperty("quantidadeItens")
    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public DuimpConsultaCoverApiAnuente quantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        return this;
    }

    public DuimpConsultaCoverApiAnuente tratamentoAdministrativo(TratamentoAdministrativoCover tratamentoAdministrativo) {
        this.tratamentoAdministrativo = tratamentoAdministrativo;
        return this;
    }

    /**
     * Lista contendo os links para os itens da Duimp
     * @return itens
     **/
    @JsonProperty("itens")
    public List<ItemConsultaDuimpCover> getItens() {
        return itens;
    }

    public void setItens(List<ItemConsultaDuimpCover> itens) {
        this.itens = itens;
    }

    public DuimpConsultaCoverApiAnuente itens(List<ItemConsultaDuimpCover> itens) {
        this.itens = itens;
        return this;
    }

    public DuimpConsultaCoverApiAnuente addItensItem(ItemConsultaDuimpCover itensItem) {
        this.itens.add(itensItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DuimpConsultaCoverApiAnuente {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    equipesTrabalho: " + toIndentedString(equipesTrabalho) + "\n" +
                "    resultadoAnaliseRisco: " + toIndentedString(resultadoAnaliseRisco) + "\n" +
                "    carga: " + toIndentedString(carga) + "\n" +
                "    documentos: " + toIndentedString(documentos) + "\n" +
                "    adicoes: " + toIndentedString(adicoes) + "\n" +
                "    tributos: " + toIndentedString(tributos) + "\n" +
                "    pagamentos: " + toIndentedString(pagamentos) + "\n" +
                "    tratamentoAdministrativo: " + toIndentedString(tratamentoAdministrativo) + "\n" +
                "    quantidadeItens: " + toIndentedString(quantidadeItens) + "\n" +
                "    itens: " + toIndentedString(itens) + "\n" +
                "}";
        return sb;
    }
}
