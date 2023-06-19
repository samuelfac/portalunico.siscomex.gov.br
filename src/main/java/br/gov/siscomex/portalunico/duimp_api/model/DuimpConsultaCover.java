package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DuimpConsultaCover", propOrder =
    { "identificacao", "situacao", "equipesTrabalho", "resultadoAnaliseRisco", "carga", "documentos", "adicoes", "tributos", "pagamentos", "tratamentoAdministrativo", "quantidadeItens", "itens"
})

@XmlRootElement(name="DuimpConsultaCover")
public class DuimpConsultaCover  {
  
  @XmlElement(name="identificacao")
  @ApiModelProperty(value = "")
  @Valid
  private IdentificacaoDuimpConsultaCover identificacao = null;

  @XmlElement(name="situacao")
  @ApiModelProperty(value = "")
  @Valid
  private SituacaoDuimpConsultaCover situacao = null;

  @XmlElement(name="equipesTrabalho")
  @ApiModelProperty(value = "")
  @Valid
  private List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho = null;

  @XmlElement(name="resultadoAnaliseRisco")
  @ApiModelProperty(value = "")
  @Valid
  private ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco = null;

  @XmlElement(name="carga")
  @ApiModelProperty(value = "")
  @Valid
  private CargaDuimpConsultaCover carga = null;

  @XmlElement(name="documentos")
  @ApiModelProperty(value = "")
  @Valid
  private DocumentosDuimpConsultaCover documentos = null;

  @XmlElement(name="adicoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<AdicaoValoresCalculadosDuimpCover> adicoes = null;

  @XmlElement(name="tributos")
  @ApiModelProperty(value = "")
  @Valid
  private TributoConsultaDuimpCover tributos = null;

  @XmlElement(name="pagamentos")
  @ApiModelProperty(value = "")
  @Valid
  private List<PagamentoDuimpConsultaCover> pagamentos = null;

  @XmlElement(name="tratamentoAdministrativo")
  @ApiModelProperty(value = "")
  @Valid
  private TratamentoAdministrativoCover tratamentoAdministrativo = null;

  @XmlElement(name="quantidadeItens")
  @ApiModelProperty(example = "100", value = "Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5")
 /**
   * Quantidade total de Itens da Duimp.<br>Tamanho mínimo: 1<br>Tamanho máximo: 5
  **/
  private Integer quantidadeItens = null;

  @XmlElement(name="itens")
  @ApiModelProperty(value = "Lista contendo os links para os itens da Duimp")
  @Valid
 /**
   * Lista contendo os links para os itens da Duimp
  **/
  private List<ItemConsultaDuimpCover> itens = null;
 /**
   * Get identificacao
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public IdentificacaoDuimpConsultaCover getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(IdentificacaoDuimpConsultaCover identificacao) {
    this.identificacao = identificacao;
  }

  public DuimpConsultaCover identificacao(IdentificacaoDuimpConsultaCover identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Get situacao
   * @return situacao
  **/
  @JsonProperty("situacao")
  public SituacaoDuimpConsultaCover getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoDuimpConsultaCover situacao) {
    this.situacao = situacao;
  }

  public DuimpConsultaCover situacao(SituacaoDuimpConsultaCover situacao) {
    this.situacao = situacao;
    return this;
  }

 /**
   * Get equipesTrabalho
   * @return equipesTrabalho
  **/
  @JsonProperty("equipesTrabalho")
  public List<EquipeTrabalhoDuimpConsultaCover> getEquipesTrabalho() {
    return equipesTrabalho;
  }

  public void setEquipesTrabalho(List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho) {
    this.equipesTrabalho = equipesTrabalho;
  }

  public DuimpConsultaCover equipesTrabalho(List<EquipeTrabalhoDuimpConsultaCover> equipesTrabalho) {
    this.equipesTrabalho = equipesTrabalho;
    return this;
  }

  public DuimpConsultaCover addEquipesTrabalhoItem(EquipeTrabalhoDuimpConsultaCover equipesTrabalhoItem) {
    this.equipesTrabalho.add(equipesTrabalhoItem);
    return this;
  }

 /**
   * Get resultadoAnaliseRisco
   * @return resultadoAnaliseRisco
  **/
  @JsonProperty("resultadoAnaliseRisco")
  public ResultadoAnaliseRiscoDuimpCover getResultadoAnaliseRisco() {
    return resultadoAnaliseRisco;
  }

  public void setResultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
    this.resultadoAnaliseRisco = resultadoAnaliseRisco;
  }

  public DuimpConsultaCover resultadoAnaliseRisco(ResultadoAnaliseRiscoDuimpCover resultadoAnaliseRisco) {
    this.resultadoAnaliseRisco = resultadoAnaliseRisco;
    return this;
  }

 /**
   * Get carga
   * @return carga
  **/
  @JsonProperty("carga")
  public CargaDuimpConsultaCover getCarga() {
    return carga;
  }

  public void setCarga(CargaDuimpConsultaCover carga) {
    this.carga = carga;
  }

  public DuimpConsultaCover carga(CargaDuimpConsultaCover carga) {
    this.carga = carga;
    return this;
  }

 /**
   * Get documentos
   * @return documentos
  **/
  @JsonProperty("documentos")
  public DocumentosDuimpConsultaCover getDocumentos() {
    return documentos;
  }

  public void setDocumentos(DocumentosDuimpConsultaCover documentos) {
    this.documentos = documentos;
  }

  public DuimpConsultaCover documentos(DocumentosDuimpConsultaCover documentos) {
    this.documentos = documentos;
    return this;
  }

 /**
   * Get adicoes
   * @return adicoes
  **/
  @JsonProperty("adicoes")
  public List<AdicaoValoresCalculadosDuimpCover> getAdicoes() {
    return adicoes;
  }

  public void setAdicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
    this.adicoes = adicoes;
  }

  public DuimpConsultaCover adicoes(List<AdicaoValoresCalculadosDuimpCover> adicoes) {
    this.adicoes = adicoes;
    return this;
  }

  public DuimpConsultaCover addAdicoesItem(AdicaoValoresCalculadosDuimpCover adicoesItem) {
    this.adicoes.add(adicoesItem);
    return this;
  }

 /**
   * Get tributos
   * @return tributos
  **/
  @JsonProperty("tributos")
  public TributoConsultaDuimpCover getTributos() {
    return tributos;
  }

  public void setTributos(TributoConsultaDuimpCover tributos) {
    this.tributos = tributos;
  }

  public DuimpConsultaCover tributos(TributoConsultaDuimpCover tributos) {
    this.tributos = tributos;
    return this;
  }

 /**
   * Get pagamentos
   * @return pagamentos
  **/
  @JsonProperty("pagamentos")
  public List<PagamentoDuimpConsultaCover> getPagamentos() {
    return pagamentos;
  }

  public void setPagamentos(List<PagamentoDuimpConsultaCover> pagamentos) {
    this.pagamentos = pagamentos;
  }

  public DuimpConsultaCover pagamentos(List<PagamentoDuimpConsultaCover> pagamentos) {
    this.pagamentos = pagamentos;
    return this;
  }

  public DuimpConsultaCover addPagamentosItem(PagamentoDuimpConsultaCover pagamentosItem) {
    this.pagamentos.add(pagamentosItem);
    return this;
  }

 /**
   * Get tratamentoAdministrativo
   * @return tratamentoAdministrativo
  **/
  @JsonProperty("tratamentoAdministrativo")
  public TratamentoAdministrativoCover getTratamentoAdministrativo() {
    return tratamentoAdministrativo;
  }

  public void setTratamentoAdministrativo(TratamentoAdministrativoCover tratamentoAdministrativo) {
    this.tratamentoAdministrativo = tratamentoAdministrativo;
  }

  public DuimpConsultaCover tratamentoAdministrativo(TratamentoAdministrativoCover tratamentoAdministrativo) {
    this.tratamentoAdministrativo = tratamentoAdministrativo;
    return this;
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

  public DuimpConsultaCover quantidadeItens(Integer quantidadeItens) {
    this.quantidadeItens = quantidadeItens;
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

  public DuimpConsultaCover itens(List<ItemConsultaDuimpCover> itens) {
    this.itens = itens;
    return this;
  }

  public DuimpConsultaCover addItensItem(ItemConsultaDuimpCover itensItem) {
    this.itens.add(itensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpConsultaCover {\n");
    
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
    sb.append("    equipesTrabalho: ").append(toIndentedString(equipesTrabalho)).append("\n");
    sb.append("    resultadoAnaliseRisco: ").append(toIndentedString(resultadoAnaliseRisco)).append("\n");
    sb.append("    carga: ").append(toIndentedString(carga)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    adicoes: ").append(toIndentedString(adicoes)).append("\n");
    sb.append("    tributos: ").append(toIndentedString(tributos)).append("\n");
    sb.append("    pagamentos: ").append(toIndentedString(pagamentos)).append("\n");
    sb.append("    tratamentoAdministrativo: ").append(toIndentedString(tratamentoAdministrativo)).append("\n");
    sb.append("    quantidadeItens: ").append(toIndentedString(quantidadeItens)).append("\n");
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
    sb.append("}");
    return sb.toString();
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

