package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazDuimpCover", propOrder =
        {"versaoDeclaracao", "situacaoDeclaracao", "versaoDeclaracaoVigente", "dataHoraCriacao", "dataHoraRegistro", "dataHoraRegistroVersaoVigente", "cpfResponsavel", "tipoImportador", "niImportador", "nomeImportador", "ufImportador", "canalSelecao", "equipesTrabalho", "informacoesSituacaoEspecialDespacho", "dadosCarga", "documentosInstrutivoDespacho", "processosVinculados", "docDeclaracoesExportacaoEstrangeira", "sefazDadosResumo", "itensHistorico", "itens"
        })

@XmlRootElement(name = "SefazDuimpCover")
/**
 * Dados da Duimp destinados às SEFAZ
 **/
@ApiModel(description = "Dados da Duimp destinados às SEFAZ")
public class SefazDuimpCover {

    @XmlElement(name = "versaoDeclaracao", required = true)
    @ApiModelProperty(example = "0001", required = true, value = "Versão da Duimp<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999")
    /**
     * Versão da Duimp<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999
     **/
    private String versaoDeclaracao = null;

    @XmlElement(name = "situacaoDeclaracao", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio situacaoDeclaracao = null;

    @XmlElement(name = "versaoDeclaracaoVigente", required = true)
    @ApiModelProperty(example = "0001", required = true, value = "Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999")
    /**
     * Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.<br>Tamanho: 4<br>Valor mínimo: 0001<br>Valor máximo: 9999
     **/
    private String versaoDeclaracaoVigente = null;

    @XmlElement(name = "dataHoraCriacao", required = true)
    @ApiModelProperty(required = true, value = "Data e hora da criação da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data e hora da criação da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataHoraCriacao = null;

    @XmlElement(name = "dataHoraRegistro", required = true)
    @ApiModelProperty(required = true, value = "Data e hora do registro da versão original da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data e hora do registro da versão original da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataHoraRegistro = null;

    @XmlElement(name = "dataHoraRegistroVersaoVigente", required = true)
    @ApiModelProperty(required = true, value = "Data e hora do registro da versão vigente da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'")
    /**
     * Data e hora do registro da versão vigente da declaração.<br>Formato: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ'
     **/
    private OffsetDateTime dataHoraRegistroVersaoVigente = null;

    @XmlElement(name = "cpfResponsavel", required = true)
    @ApiModelProperty(example = "11111111111", required = true, value = "CPF do responsável pela declaração.<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF do responsável pela declaração.<br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfResponsavel = null;


    @XmlType(name = "TipoImportadorEnum")
    @XmlEnum(String.class)
    public enum TipoImportadorEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        TipoImportadorEnum(String v) {
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

    @XmlElement(name = "tipoImportador", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo de importador. Descreve se o importador é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  <br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país")
    /**
     * Tipo de importador. Descreve se o importador é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  <br>Dominio: <br>1 - Pessoa Jurídica, <br>2 - Pessoa Física residente no país
     **/
    private TipoImportadorEnum tipoImportador = null;

    @XmlElement(name = "niImportador", required = true)
    @ApiModelProperty(example = "191", required = true, value = "<br>Número de indentificação do Importador: <br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'")
    /**
     * <br>Número de indentificação do Importador: <br>Caso seja CNPJ: <br>Tamanho: 14<br>Formato: 'NNNNNNNNNNNNNN'<br>Caso seja CPF: <br>Tamanho: 11<br>Formato: 'NNNNNNNNNNN'
     **/
    private Long niImportador = null;

    @XmlElement(name = "nomeImportador", required = true)
    @ApiModelProperty(example = "Importador Exemplo XYZ", required = true, value = "Nome do importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 100")
    /**
     * Nome do importador <br>Tamanho mínimo: 1<br>Tamanho máximo: 100
     **/
    private String nomeImportador = null;

    @XmlElement(name = "ufImportador", required = true)
    @ApiModelProperty(example = "RJ", required = true, value = "UF do importador<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO")
    /**
     * UF do importador<br>Dominio:<br>AC, AL, AP, AM, BA, CE, DF<br>ES, GO, MA, MT, MS, MG, PA<br>PB, PR, PE, PI, RJ, RN, RS<br>RO, RR, SC, SP, SE, TO
     **/
    private String ufImportador = null;


    @XmlType(name = "CanalSelecaoEnum")
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
        NUMBER_3(Integer.valueOf(3)),

        @XmlEnumValue("15")
        @JsonProperty("15")
        NUMBER_15(Integer.valueOf(15));


        private final Integer value;

        CanalSelecaoEnum(Integer v) {
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

    @XmlElement(name = "canalSelecao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Canal da declaração. <br>Dominio: <br>1 - verde, <br>12 - amarelo, <br>3 - vermelho, <br>15 - cinza")
    /**
     * Canal da declaração. <br>Dominio: <br>1 - verde, <br>12 - amarelo, <br>3 - vermelho, <br>15 - cinza
     **/
    private CanalSelecaoEnum canalSelecao = null;

    @XmlElement(name = "equipesTrabalho", required = true)
    @ApiModelProperty(required = true, value = "Lista de equipes de trabalho")
    @Valid
    /**
     * Lista de equipes de trabalho
     **/
    private List<DadosDeEquipeDeTrabalho> equipesTrabalho = new ArrayList<>();

    @XmlElement(name = "informacoesSituacaoEspecialDespacho", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private InformaesRelacionadasSituaoEspecialDeDespacho informacoesSituacaoEspecialDespacho = null;

    @XmlElement(name = "dadosCarga", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private DadosDaCarga dadosCarga = null;

    @XmlElement(name = "documentosInstrutivoDespacho", required = true)
    @ApiModelProperty(required = true, value = "Lista de documentos instrutivos do despacho")
    @Valid
    /**
     * Lista de documentos instrutivos do despacho
     **/
    private List<DocumentoInstrutivoDoDespacho> documentosInstrutivoDespacho = new ArrayList<>();

    @XmlElement(name = "processosVinculados")
    @ApiModelProperty(value = "Lista de processos vinculados")
    @Valid
    /**
     * Lista de processos vinculados
     **/
    private List<DadosDoProcesso> processosVinculados = null;

    @XmlElement(name = "docDeclaracoesExportacaoEstrangeira")
    @ApiModelProperty(value = "Lista de declarações estrangeiras")
    @Valid
    /**
     * Lista de declarações estrangeiras
     **/
    private List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira = null;

    @XmlElement(name = "sefazDadosResumo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private SefazDadosResumo sefazDadosResumo = null;

    @XmlElement(name = "itensHistorico")
    @ApiModelProperty(value = "Lista de eventos no histórico de operações")
    @Valid
    /**
     * Lista de eventos no histórico de operações
     **/
    private List<SefazDuimpHistEventoCover> itensHistorico = null;

    @XmlElement(name = "itens", required = true)
    @ApiModelProperty(required = true, value = "Lista de itens de Duimp")
    @Valid
    /**
     * Lista de itens de Duimp
     **/
    private List<SefazItemCover> itens = new ArrayList<>();

    /**
     * Versão da Duimp&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999
     *
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

    public SefazDuimpCover versaoDeclaracao(String versaoDeclaracao) {
        this.versaoDeclaracao = versaoDeclaracao;
        return this;
    }

    /**
     * Get situacaoDeclaracao
     *
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

    public SefazDuimpCover situacaoDeclaracao(SituaoDaDuimpObjetoCompostoPelosAtributosCdigoEDescrio situacaoDeclaracao) {
        this.situacaoDeclaracao = situacaoDeclaracao;
        return this;
    }

    /**
     * Versão da declaração que está atualmente vigente. Pode ser superior a versão solicitada.&lt;br&gt;Tamanho: 4&lt;br&gt;Valor mínimo: 0001&lt;br&gt;Valor máximo: 9999
     *
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

    public SefazDuimpCover versaoDeclaracaoVigente(String versaoDeclaracaoVigente) {
        this.versaoDeclaracaoVigente = versaoDeclaracaoVigente;
        return this;
    }

    /**
     * Data e hora da criação da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
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

    public SefazDuimpCover dataHoraCriacao(OffsetDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
        return this;
    }

    /**
     * Data e hora do registro da versão original da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
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

    public SefazDuimpCover dataHoraRegistro(OffsetDateTime dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    /**
     * Data e hora do registro da versão vigente da declaração.&lt;br&gt;Formato: &#39;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#39;
     *
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

    public SefazDuimpCover dataHoraRegistroVersaoVigente(OffsetDateTime dataHoraRegistroVersaoVigente) {
        this.dataHoraRegistroVersaoVigente = dataHoraRegistroVersaoVigente;
        return this;
    }

    /**
     * CPF do responsável pela declaração.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
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

    public SefazDuimpCover cpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
        return this;
    }

    /**
     * Tipo de importador. Descreve se o importador é uma pessoa jurídica (CNPJ)  ou uma pessoa física (CPF)  &lt;br&gt;Dominio: &lt;br&gt;1 - Pessoa Jurídica, &lt;br&gt;2 - Pessoa Física residente no país
     *
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

    public SefazDuimpCover tipoImportador(TipoImportadorEnum tipoImportador) {
        this.tipoImportador = tipoImportador;
        return this;
    }

    /**
     * &lt;br&gt;Número de indentificação do Importador: &lt;br&gt;Caso seja CNPJ: &lt;br&gt;Tamanho: 14&lt;br&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;br&gt;Caso seja CPF: &lt;br&gt;Tamanho: 11&lt;br&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
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

    public SefazDuimpCover niImportador(Long niImportador) {
        this.niImportador = niImportador;
        return this;
    }

    /**
     * Nome do importador &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 100
     *
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

    public SefazDuimpCover nomeImportador(String nomeImportador) {
        this.nomeImportador = nomeImportador;
        return this;
    }

    /**
     * UF do importador&lt;br&gt;Dominio:&lt;br&gt;AC, AL, AP, AM, BA, CE, DF&lt;br&gt;ES, GO, MA, MT, MS, MG, PA&lt;br&gt;PB, PR, PE, PI, RJ, RN, RS&lt;br&gt;RO, RR, SC, SP, SE, TO
     *
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

    public SefazDuimpCover ufImportador(String ufImportador) {
        this.ufImportador = ufImportador;
        return this;
    }

    /**
     * Canal da declaração. &lt;br&gt;Dominio: &lt;br&gt;1 - verde, &lt;br&gt;12 - amarelo, &lt;br&gt;3 - vermelho, &lt;br&gt;15 - cinza
     *
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

    public SefazDuimpCover canalSelecao(CanalSelecaoEnum canalSelecao) {
        this.canalSelecao = canalSelecao;
        return this;
    }

    /**
     * Lista de equipes de trabalho
     *
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

    public SefazDuimpCover equipesTrabalho(List<DadosDeEquipeDeTrabalho> equipesTrabalho) {
        this.equipesTrabalho = equipesTrabalho;
        return this;
    }

    public SefazDuimpCover addEquipesTrabalhoItem(DadosDeEquipeDeTrabalho equipesTrabalhoItem) {
        this.equipesTrabalho.add(equipesTrabalhoItem);
        return this;
    }

    /**
     * Get informacoesSituacaoEspecialDespacho
     *
     * @return informacoesSituacaoEspecialDespacho
     **/
    @JsonProperty("informacoesSituacaoEspecialDespacho")
    @NotNull
    public InformaesRelacionadasSituaoEspecialDeDespacho getInformacoesSituacaoEspecialDespacho() {
        return informacoesSituacaoEspecialDespacho;
    }

    public void setInformacoesSituacaoEspecialDespacho(InformaesRelacionadasSituaoEspecialDeDespacho informacoesSituacaoEspecialDespacho) {
        this.informacoesSituacaoEspecialDespacho = informacoesSituacaoEspecialDespacho;
    }

    public SefazDuimpCover informacoesSituacaoEspecialDespacho(InformaesRelacionadasSituaoEspecialDeDespacho informacoesSituacaoEspecialDespacho) {
        this.informacoesSituacaoEspecialDespacho = informacoesSituacaoEspecialDespacho;
        return this;
    }

    /**
     * Get dadosCarga
     *
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

    public SefazDuimpCover dadosCarga(DadosDaCarga dadosCarga) {
        this.dadosCarga = dadosCarga;
        return this;
    }

    /**
     * Lista de documentos instrutivos do despacho
     *
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

    public SefazDuimpCover documentosInstrutivoDespacho(List<DocumentoInstrutivoDoDespacho> documentosInstrutivoDespacho) {
        this.documentosInstrutivoDespacho = documentosInstrutivoDespacho;
        return this;
    }

    public SefazDuimpCover addDocumentosInstrutivoDespachoItem(DocumentoInstrutivoDoDespacho documentosInstrutivoDespachoItem) {
        this.documentosInstrutivoDespacho.add(documentosInstrutivoDespachoItem);
        return this;
    }

    /**
     * Lista de processos vinculados
     *
     * @return processosVinculados
     **/
    @JsonProperty("processosVinculados")
    public List<DadosDoProcesso> getProcessosVinculados() {
        return processosVinculados;
    }

    public void setProcessosVinculados(List<DadosDoProcesso> processosVinculados) {
        this.processosVinculados = processosVinculados;
    }

    public SefazDuimpCover processosVinculados(List<DadosDoProcesso> processosVinculados) {
        this.processosVinculados = processosVinculados;
        return this;
    }

    public SefazDuimpCover addProcessosVinculadosItem(DadosDoProcesso processosVinculadosItem) {
        this.processosVinculados.add(processosVinculadosItem);
        return this;
    }

    /**
     * Lista de declarações estrangeiras
     *
     * @return docDeclaracoesExportacaoEstrangeira
     **/
    @JsonProperty("docDeclaracoesExportacaoEstrangeira")
    public List<DadosDaDeclaraoEstrangeira> getDocDeclaracoesExportacaoEstrangeira() {
        return docDeclaracoesExportacaoEstrangeira;
    }

    public void setDocDeclaracoesExportacaoEstrangeira(List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira) {
        this.docDeclaracoesExportacaoEstrangeira = docDeclaracoesExportacaoEstrangeira;
    }

    public SefazDuimpCover docDeclaracoesExportacaoEstrangeira(List<DadosDaDeclaraoEstrangeira> docDeclaracoesExportacaoEstrangeira) {
        this.docDeclaracoesExportacaoEstrangeira = docDeclaracoesExportacaoEstrangeira;
        return this;
    }

    public SefazDuimpCover addDocDeclaracoesExportacaoEstrangeiraItem(DadosDaDeclaraoEstrangeira docDeclaracoesExportacaoEstrangeiraItem) {
        this.docDeclaracoesExportacaoEstrangeira.add(docDeclaracoesExportacaoEstrangeiraItem);
        return this;
    }

    /**
     * Get sefazDadosResumo
     *
     * @return sefazDadosResumo
     **/
    @JsonProperty("sefazDadosResumo")
    @NotNull
    public SefazDadosResumo getSefazDadosResumo() {
        return sefazDadosResumo;
    }

    public void setSefazDadosResumo(SefazDadosResumo sefazDadosResumo) {
        this.sefazDadosResumo = sefazDadosResumo;
    }

    public SefazDuimpCover sefazDadosResumo(SefazDadosResumo sefazDadosResumo) {
        this.sefazDadosResumo = sefazDadosResumo;
        return this;
    }

    /**
     * Lista de eventos no histórico de operações
     *
     * @return itensHistorico
     **/
    @JsonProperty("itensHistorico")
    public List<SefazDuimpHistEventoCover> getItensHistorico() {
        return itensHistorico;
    }

    public void setItensHistorico(List<SefazDuimpHistEventoCover> itensHistorico) {
        this.itensHistorico = itensHistorico;
    }

    public SefazDuimpCover itensHistorico(List<SefazDuimpHistEventoCover> itensHistorico) {
        this.itensHistorico = itensHistorico;
        return this;
    }

    public SefazDuimpCover addItensHistoricoItem(SefazDuimpHistEventoCover itensHistoricoItem) {
        this.itensHistorico.add(itensHistoricoItem);
        return this;
    }

    /**
     * Lista de itens de Duimp
     *
     * @return itens
     **/
    @JsonProperty("itens")
    @NotNull
    public List<SefazItemCover> getItens() {
        return itens;
    }

    public void setItens(List<SefazItemCover> itens) {
        this.itens = itens;
    }

    public SefazDuimpCover itens(List<SefazItemCover> itens) {
        this.itens = itens;
        return this;
    }

    public SefazDuimpCover addItensItem(SefazItemCover itensItem) {
        this.itens.add(itensItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class SefazDuimpCover {\n" +
                "    versaoDeclaracao: " + toIndentedString(versaoDeclaracao) + "\n" +
                "    situacaoDeclaracao: " + toIndentedString(situacaoDeclaracao) + "\n" +
                "    versaoDeclaracaoVigente: " + toIndentedString(versaoDeclaracaoVigente) + "\n" +
                "    dataHoraCriacao: " + toIndentedString(dataHoraCriacao) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    dataHoraRegistroVersaoVigente: " + toIndentedString(dataHoraRegistroVersaoVigente) + "\n" +
                "    cpfResponsavel: " + toIndentedString(cpfResponsavel) + "\n" +
                "    tipoImportador: " + toIndentedString(tipoImportador) + "\n" +
                "    niImportador: " + toIndentedString(niImportador) + "\n" +
                "    nomeImportador: " + toIndentedString(nomeImportador) + "\n" +
                "    ufImportador: " + toIndentedString(ufImportador) + "\n" +
                "    canalSelecao: " + toIndentedString(canalSelecao) + "\n" +
                "    equipesTrabalho: " + toIndentedString(equipesTrabalho) + "\n" +
                "    informacoesSituacaoEspecialDespacho: " + toIndentedString(informacoesSituacaoEspecialDespacho) + "\n" +
                "    dadosCarga: " + toIndentedString(dadosCarga) + "\n" +
                "    documentosInstrutivoDespacho: " + toIndentedString(documentosInstrutivoDespacho) + "\n" +
                "    processosVinculados: " + toIndentedString(processosVinculados) + "\n" +
                "    docDeclaracoesExportacaoEstrangeira: " + toIndentedString(docDeclaracoesExportacaoEstrangeira) + "\n" +
                "    sefazDadosResumo: " + toIndentedString(sefazDadosResumo) + "\n" +
                "    itensHistorico: " + toIndentedString(itensHistorico) + "\n" +
                "    itens: " + toIndentedString(itens) + "\n" +
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

