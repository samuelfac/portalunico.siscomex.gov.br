package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DuimpCover", propOrder =
    { "versaoDeclaracao", "situacaoDeclaracao", "versaoDeclaracaoVigente", "dataHoraCriacao", "dataHoraRegistro", "dataHoraRegistroVersaoVigente", "cpfResponsavel", "tipoImportador", "niImportador", "nomeImportador", "ufImportador", "canalSelecao", "equipesTrabalho", "dadosCarga", "documentosInstrutivoDespacho", "processosVinculados", "docDeclaracoesExportacaoEstrangeira", "dadosResumo", "itensHistorico", "itens"
})

@XmlRootElement(name="DuimpCover")
/**
  * Dados da Duimp destinados às SEFAZ
 **/
@ApiModel(description="Dados da Duimp destinados às SEFAZ")
public class DuimpCover  {
  
  @XmlElement(name="versaoDeclaracao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da Duimp<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracao = null;

  @XmlElement(name="situacaoDeclaracao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio situacaoDeclaracao = null;

  @XmlElement(name="versaoDeclaracaoVigente", required = true)
  @ApiModelProperty(example = "001", required = true, value = "Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoDeclaracaoVigente = null;

  @XmlElement(name="dataHoraCriacao", required = true)
  @ApiModelProperty(required = true, value = "Data e hora da criação da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora da criação da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraCriacao = null;

  @XmlElement(name="dataHoraRegistro", required = true)
  @ApiModelProperty(required = true, value = "Data e hora do registro da versão original da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora do registro da versão original da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraRegistro = null;

  @XmlElement(name="dataHoraRegistroVersaoVigente", required = true)
  @ApiModelProperty(required = true, value = "Data e hora do registro da versão vigente da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
 /**
   * Data e hora do registro da versão vigente da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
  **/
  private OffsetDateTime dataHoraRegistroVersaoVigente = null;

  @XmlElement(name="cpfResponsavel", required = true)
  @ApiModelProperty(example = "11111111111", required = true, value = "CPF do responsável pela declaração.<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do responsável pela declaração.<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfResponsavel = null;


@XmlType(name="TipoImportadorEnum")
@XmlEnum(String.class)
public enum TipoImportadorEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2"));


    private String value;

    TipoImportadorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoImportadorEnum fromValue(String v) {
        for (TipoImportadorEnum b : TipoImportadorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoImportadorEnum");
    }
}

  @XmlElement(name="tipoImportador", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Tipo de importador.<br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país")
 /**
   * Tipo de importador.<br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país
  **/
  private TipoImportadorEnum tipoImportador = null;

  @XmlElement(name="niImportador", required = true)
  @ApiModelProperty(example = "191", required = true, value = "Número do importador.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * Número do importador.<br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'
  **/
  private Long niImportador = null;

  @XmlElement(name="nomeImportador", required = true)
  @ApiModelProperty(example = "Importador Exemplo XYZ", required = true, value = "Nome do importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
 /**
   * Nome do importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
  **/
  private String nomeImportador = null;

  @XmlElement(name="ufImportador", required = true)
  @ApiModelProperty(example = "RJ", required = true, value = "UF do importador<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO")
 /**
   * UF do importador<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO
  **/
  private String ufImportador = null;


@XmlType(name="CanalSelecaoEnum")
@XmlEnum(Integer.class)
public enum CanalSelecaoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	NUMBER_1(Integer.valueOf(1)),
	
	@XmlEnumValue("12")
	@JsonProperty("12")
	NUMBER_12(Integer.valueOf(12)),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	NUMBER_3(Integer.valueOf(3));


    private Integer value;

    CanalSelecaoEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CanalSelecaoEnum fromValue(String v) {
        for (CanalSelecaoEnum b : CanalSelecaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CanalSelecaoEnum");
    }
}

  @XmlElement(name="canalSelecao", required = true)
  @ApiModelProperty(example = "1", required = true, value = "Canal da declaração. <br>Dominio: <br>1 - verde, <br>12 - amarelo, <br>3 - vermelho")
 /**
   * Canal da declaração. <br>Dominio: <br>1 - verde, <br>12 - amarelo, <br>3 - vermelho
  **/
  private CanalSelecaoEnum canalSelecao = null;

  @XmlElement(name="equipesTrabalho", required = true)
  @ApiModelProperty(required = true, value = "Lista de equipes de trabalho")
  @Valid
 /**
   * Lista de equipes de trabalho
  **/
  private List<DadosDeEquipeDeTrabalho> equipesTrabalho = new ArrayList<>();

  @XmlElement(name="dadosCarga", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DadosDaCarga dadosCarga = null;

  @XmlElement(name="documentosInstrutivoDespacho", required = true)
  @ApiModelProperty(required = true, value = "Lista de documentos instrutivos do despacho")
  @Valid
 /**
   * Lista de documentos instrutivos do despacho
  **/
  private List<DocumentoInstrutivoDoDespacho> documentosInstrutivoDespacho = new ArrayList<>();

  @XmlElement(name="processosVinculados")
  @ApiModelProperty(value = "Lista de processos vinculados")
  @Valid
 /**
   * Lista de processos vinculados
  **/
  private List<DadosDoProcesso> processosVinculados = null;

  @XmlElement(name="docDeclaracoesExportacaoEstrangeira")
  @ApiModelProperty(value = "Lista de declarações estrangeiras")
  @Valid
 /**
   * Lista de declarações estrangeiras
  **/
  private List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira = null;

  @XmlElement(name="dadosResumo", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DadosResumo dadosResumo = null;

  @XmlElement(name="itensHistorico")
  @ApiModelProperty(value = "Lista de eventos no histórico de operações")
  @Valid
 /**
   * Lista de eventos no histórico de operações
  **/
  private List<DuimpHistEventoCover> itensHistorico = null;

  @XmlElement(name="itens", required = true)
  @ApiModelProperty(required = true, value = "Lista de itens de Duimp")
  @Valid
 /**
   * Lista de itens de Duimp
  **/
  private List<ItemCover> itens = new ArrayList<>();
 /**
   * Versão da Duimp&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracao
  **/
  @JsonProperty("versaoDeclaracao")
  @NotNull
  public String getVersaoDeclaracao() {
    return versaoDeclaracao;
  }

  public void setVersaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
  }

  public DuimpCover versaoDeclaracao(String versaoDeclaracao) {
    this.versaoDeclaracao = versaoDeclaracao;
    return this;
  }

 /**
   * Get situacaoDeclaracao
   * @return situacaoDeclaracao
  **/
  @JsonProperty("situacaoDeclaracao")
  @NotNull
  public SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio getSituacaoDeclaracao() {
    return situacaoDeclaracao;
  }

  public void setSituacaoDeclaracao(SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio situacaoDeclaracao) {
    this.situacaoDeclaracao = situacaoDeclaracao;
  }

  public DuimpCover situacaoDeclaracao(SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio situacaoDeclaracao) {
    this.situacaoDeclaracao = situacaoDeclaracao;
    return this;
  }

 /**
   * Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoDeclaracaoVigente
  **/
  @JsonProperty("versaoDeclaracaoVigente")
  @NotNull
  public String getVersaoDeclaracaoVigente() {
    return versaoDeclaracaoVigente;
  }

  public void setVersaoDeclaracaoVigente(String versaoDeclaracaoVigente) {
    this.versaoDeclaracaoVigente = versaoDeclaracaoVigente;
  }

  public DuimpCover versaoDeclaracaoVigente(String versaoDeclaracaoVigente) {
    this.versaoDeclaracaoVigente = versaoDeclaracaoVigente;
    return this;
  }

 /**
   * Data e hora da criação da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHoraCriacao
  **/
  @JsonProperty("dataHoraCriacao")
  @NotNull
  public OffsetDateTime getDataHoraCriacao() {
    return dataHoraCriacao;
  }

  public void setDataHoraCriacao(OffsetDateTime dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
  }

  public DuimpCover dataHoraCriacao(OffsetDateTime dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
    return this;
  }

 /**
   * Data e hora do registro da versão original da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  @NotNull
  public OffsetDateTime getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DuimpCover dataHoraRegistro(OffsetDateTime dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * Data e hora do registro da versão vigente da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistroVersaoVigente
  **/
  @JsonProperty("dataHoraRegistroVersaoVigente")
  @NotNull
  public OffsetDateTime getDataHoraRegistroVersaoVigente() {
    return dataHoraRegistroVersaoVigente;
  }

  public void setDataHoraRegistroVersaoVigente(OffsetDateTime dataHoraRegistroVersaoVigente) {
    this.dataHoraRegistroVersaoVigente = dataHoraRegistroVersaoVigente;
  }

  public DuimpCover dataHoraRegistroVersaoVigente(OffsetDateTime dataHoraRegistroVersaoVigente) {
    this.dataHoraRegistroVersaoVigente = dataHoraRegistroVersaoVigente;
    return this;
  }

 /**
   * CPF do responsável pela declaração.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfResponsavel
  **/
  @JsonProperty("cpfResponsavel")
  @NotNull
  public String getCpfResponsavel() {
    return cpfResponsavel;
  }

  public void setCpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
  }

  public DuimpCover cpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
    return this;
  }

 /**
   * Tipo de importador.&lt;br&gt;Dominio: &lt;br&gt;1 - Pessoa Jurídica, &lt;br&gt;2 - Pessoa Física residente no país
   * @return tipoImportador
  **/
  @JsonProperty("tipoImportador")
  @NotNull
  public String getTipoImportador() {
    if (tipoImportador == null) {
      return null;
    }
    return tipoImportador.value();
  }

  public void setTipoImportador(TipoImportadorEnum tipoImportador) {
    this.tipoImportador = tipoImportador;
  }

  public DuimpCover tipoImportador(TipoImportadorEnum tipoImportador) {
    this.tipoImportador = tipoImportador;
    return this;
  }

 /**
   * Número do importador.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return niImportador
  **/
  @JsonProperty("niImportador")
  @NotNull
  public Long getNiImportador() {
    return niImportador;
  }

  public void setNiImportador(Long niImportador) {
    this.niImportador = niImportador;
  }

  public DuimpCover niImportador(Long niImportador) {
    this.niImportador = niImportador;
    return this;
  }

 /**
   * Nome do importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
   * @return nomeImportador
  **/
  @JsonProperty("nomeImportador")
  @NotNull
  public String getNomeImportador() {
    return nomeImportador;
  }

  public void setNomeImportador(String nomeImportador) {
    this.nomeImportador = nomeImportador;
  }

  public DuimpCover nomeImportador(String nomeImportador) {
    this.nomeImportador = nomeImportador;
    return this;
  }

 /**
   * UF do importador&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO
   * @return ufImportador
  **/
  @JsonProperty("ufImportador")
  @NotNull
  public String getUfImportador() {
    return ufImportador;
  }

  public void setUfImportador(String ufImportador) {
    this.ufImportador = ufImportador;
  }

  public DuimpCover ufImportador(String ufImportador) {
    this.ufImportador = ufImportador;
    return this;
  }

 /**
   * Canal da declaração. &lt;br&gt;Dominio: &lt;br&gt;1 - verde, &lt;br&gt;12 - amarelo, &lt;br&gt;3 - vermelho
   * @return canalSelecao
  **/
  @JsonProperty("canalSelecao")
  @NotNull
  public Integer getCanalSelecao() {
    if (canalSelecao == null) {
      return null;
    }
    return canalSelecao.value();
  }

  public void setCanalSelecao(CanalSelecaoEnum canalSelecao) {
    this.canalSelecao = canalSelecao;
  }

  public DuimpCover canalSelecao(CanalSelecaoEnum canalSelecao) {
    this.canalSelecao = canalSelecao;
    return this;
  }

 /**
   * Lista de equipes de trabalho
   * @return equipesTrabalho
  **/
  @JsonProperty("equipesTrabalho")
  @NotNull
  public List<DadosDeEquipeDeTrabalho> getEquipesTrabalho() {
    return equipesTrabalho;
  }

  public void setEquipesTrabalho(List<DadosDeEquipeDeTrabalho> equipesTrabalho) {
    this.equipesTrabalho = equipesTrabalho;
  }

  public DuimpCover equipesTrabalho(List<DadosDeEquipeDeTrabalho> equipesTrabalho) {
    this.equipesTrabalho = equipesTrabalho;
    return this;
  }

  public DuimpCover addEquipesTrabalhoItem(DadosDeEquipeDeTrabalho equipesTrabalhoItem) {
    this.equipesTrabalho.add(equipesTrabalhoItem);
    return this;
  }

 /**
   * Get dadosCarga
   * @return dadosCarga
  **/
  @JsonProperty("dadosCarga")
  @NotNull
  public DadosDaCarga getDadosCarga() {
    return dadosCarga;
  }

  public void setDadosCarga(DadosDaCarga dadosCarga) {
    this.dadosCarga = dadosCarga;
  }

  public DuimpCover dadosCarga(DadosDaCarga dadosCarga) {
    this.dadosCarga = dadosCarga;
    return this;
  }

 /**
   * Lista de documentos instrutivos do despacho
   * @return documentosInstrutivoDespacho
  **/
  @JsonProperty("documentosInstrutivoDespacho")
  @NotNull
  public List<DocumentoInstrutivoDoDespacho> getDocumentosInstrutivoDespacho() {
    return documentosInstrutivoDespacho;
  }

  public void setDocumentosInstrutivoDespacho(List<DocumentoInstrutivoDoDespacho> documentosInstrutivoDespacho) {
    this.documentosInstrutivoDespacho = documentosInstrutivoDespacho;
  }

  public DuimpCover documentosInstrutivoDespacho(List<DocumentoInstrutivoDoDespacho> documentosInstrutivoDespacho) {
    this.documentosInstrutivoDespacho = documentosInstrutivoDespacho;
    return this;
  }

  public DuimpCover addDocumentosInstrutivoDespachoItem(DocumentoInstrutivoDoDespacho documentosInstrutivoDespachoItem) {
    this.documentosInstrutivoDespacho.add(documentosInstrutivoDespachoItem);
    return this;
  }

 /**
   * Lista de processos vinculados
   * @return processosVinculados
  **/
  @JsonProperty("processosVinculados")
  public List<DadosDoProcesso> getProcessosVinculados() {
    return processosVinculados;
  }

  public void setProcessosVinculados(List<DadosDoProcesso> processosVinculados) {
    this.processosVinculados = processosVinculados;
  }

  public DuimpCover processosVinculados(List<DadosDoProcesso> processosVinculados) {
    this.processosVinculados = processosVinculados;
    return this;
  }

  public DuimpCover addProcessosVinculadosItem(DadosDoProcesso processosVinculadosItem) {
    this.processosVinculados.add(processosVinculadosItem);
    return this;
  }

 /**
   * Lista de declarações estrangeiras
   * @return docDeclaracoesExportacaoEstrangeira
  **/
  @JsonProperty("docDeclaracoesExportacaoEstrangeira")
  public List<DadosDaDeclaraoEstrangeira> getDocDeclaracoesExportacaoEstrangeira() {
    return docDeclaracoesExportacaoEstrangeira;
  }

  public void setDocDeclaracoesExportacaoEstrangeira(List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira) {
    this.docDeclaracoesExportacaoEstrangeira = docDeclaracoesExportacaoEstrangeira;
  }

  public DuimpCover docDeclaracoesExportacaoEstrangeira(List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira) {
    this.docDeclaracoesExportacaoEstrangeira = docDeclaracoesExportacaoEstrangeira;
    return this;
  }

  public DuimpCover addDocDeclaracoesExportacaoEstrangeiraItem(DadosDaDeclaraoEstrangeira docDeclaracoesExportacaoEstrangeiraItem) {
    this.docDeclaracoesExportacaoEstrangeira.add(docDeclaracoesExportacaoEstrangeiraItem);
    return this;
  }

 /**
   * Get dadosResumo
   * @return dadosResumo
  **/
  @JsonProperty("dadosResumo")
  @NotNull
  public DadosResumo getDadosResumo() {
    return dadosResumo;
  }

  public void setDadosResumo(DadosResumo dadosResumo) {
    this.dadosResumo = dadosResumo;
  }

  public DuimpCover dadosResumo(DadosResumo dadosResumo) {
    this.dadosResumo = dadosResumo;
    return this;
  }

 /**
   * Lista de eventos no histórico de operações
   * @return itensHistorico
  **/
  @JsonProperty("itensHistorico")
  public List<DuimpHistEventoCover> getItensHistorico() {
    return itensHistorico;
  }

  public void setItensHistorico(List<DuimpHistEventoCover> itensHistorico) {
    this.itensHistorico = itensHistorico;
  }

  public DuimpCover itensHistorico(List<DuimpHistEventoCover> itensHistorico) {
    this.itensHistorico = itensHistorico;
    return this;
  }

  public DuimpCover addItensHistoricoItem(DuimpHistEventoCover itensHistoricoItem) {
    this.itensHistorico.add(itensHistoricoItem);
    return this;
  }

 /**
   * Lista de itens de Duimp
   * @return itens
  **/
  @JsonProperty("itens")
  @NotNull
  public List<ItemCover> getItens() {
    return itens;
  }

  public void setItens(List<ItemCover> itens) {
    this.itens = itens;
  }

  public DuimpCover itens(List<ItemCover> itens) {
    this.itens = itens;
    return this;
  }

  public DuimpCover addItensItem(ItemCover itensItem) {
    this.itens.add(itensItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuimpCover {\n");
    
    sb.append("    versaoDeclaracao: ").append(toIndentedString(versaoDeclaracao)).append("\n");
    sb.append("    situacaoDeclaracao: ").append(toIndentedString(situacaoDeclaracao)).append("\n");
    sb.append("    versaoDeclaracaoVigente: ").append(toIndentedString(versaoDeclaracaoVigente)).append("\n");
    sb.append("    dataHoraCriacao: ").append(toIndentedString(dataHoraCriacao)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    dataHoraRegistroVersaoVigente: ").append(toIndentedString(dataHoraRegistroVersaoVigente)).append("\n");
    sb.append("    cpfResponsavel: ").append(toIndentedString(cpfResponsavel)).append("\n");
    sb.append("    tipoImportador: ").append(toIndentedString(tipoImportador)).append("\n");
    sb.append("    niImportador: ").append(toIndentedString(niImportador)).append("\n");
    sb.append("    nomeImportador: ").append(toIndentedString(nomeImportador)).append("\n");
    sb.append("    ufImportador: ").append(toIndentedString(ufImportador)).append("\n");
    sb.append("    canalSelecao: ").append(toIndentedString(canalSelecao)).append("\n");
    sb.append("    equipesTrabalho: ").append(toIndentedString(equipesTrabalho)).append("\n");
    sb.append("    dadosCarga: ").append(toIndentedString(dadosCarga)).append("\n");
    sb.append("    documentosInstrutivoDespacho: ").append(toIndentedString(documentosInstrutivoDespacho)).append("\n");
    sb.append("    processosVinculados: ").append(toIndentedString(processosVinculados)).append("\n");
    sb.append("    docDeclaracoesExportacaoEstrangeira: ").append(toIndentedString(docDeclaracoesExportacaoEstrangeira)).append("\n");
    sb.append("    dadosResumo: ").append(toIndentedString(dadosResumo)).append("\n");
    sb.append("    itensHistorico: ").append(toIndentedString(itensHistorico)).append("\n");
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

