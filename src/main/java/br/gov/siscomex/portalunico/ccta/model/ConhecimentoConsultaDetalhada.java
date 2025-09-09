package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConhecimentoConsultaDetalhada", propOrder =
        {"cidadeAgenteDeCargaConsolidadorEstrang", "ruc", "situacao", "tipo", "contatosEmbarcadorEstrangeiro", "itensCarga", "mawbAwbAssociados", "enderecoAgenteDeCargaConsolidadorEstrang", "cnpjResponsavelArquivo", "paisConsignatarioConhecimento", "indicadorPartesMadeira", "frete", "viagensAssociadas", "partesEstoque", "pesoBrutoConhecimento", "nomeEmbarcadorEstrangeiro", "nomeConsignatarioConhecimento", "divergencias", "dataHoraAssinaturaTransportador", "outrasInfosServico", "tipoDocumentoConsignatario", "caixaPostalConsignatarioConhecimento", "dsicsApropriados", "paisAgenteDeCargaConsolidadorEstrang", "recintoAduaneiroDestino", "chegadasTerrestres", "contatosConsignatarioConhecimento", "quantidadeVolumesConhecimento", "dataEmissao", "paisEmbarcadorEstrangeiro", "categoriaCarga", "documentosSaida", "bloqueiosBaixados", "manuseiosEspeciais", "solicitacoesServicosEspeciais", "recepcoesComAvarias", "cidadeConsignatarioConhecimento", "bloqueiosAtivos", "codigoAeroportoOrigemConhecimento", "outrasPartesInteressadas", "contatosAgenteDeCargaConsolidadorEstrang", "cidadeEmbarcadorEstrangeiro", "indicadorNaoRecepcaoHawbAssociados", "razaoSocialDocumentoConsignatario", "caixaPostalAgenteDeCargaConsolidadorEstrang", "identificacao", "enderecoConsignatarioConhecimento", "enderecoEmbarcadorEstrangeiro", "caixaPostalEmbarcadorEstrangeiro", "descricaoResumida", "localAssinaturaTransportador", "nomeDocumentoConsignatario", "codigoAeroportoDestinoConhecimento", "nomeAgenteDeCargaConsolidadorEstrang", "nomeAssinaturaEmbarcadorEstrangeiro", "nomeAssinaturaTransportador", "hawbAssociados", "identificacaoDocumentoConsignatario"
        })

@XmlRootElement(name = "ConhecimentoConsultaDetalhada")
public class ConhecimentoConsultaDetalhada {

    @XmlElement(name = "cidadeAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Cidade do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String cidadeAgenteDeCargaConsolidadorEstrang = null;

    @XmlElement(name = "ruc")
    @ApiModelProperty(example = "0BRIMP000555552000100DGXKKI9LMCG", value = "Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 35")
    /**
     * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga<br>Tamanho: 35
     **/
    private String ruc = null;
    @XmlElement(name = "situacao")
    @ApiModelProperty(example = "A, E", value = "Código da situação do Conhecimento<br>Tamanho: 1<br/>A - Ativo <br/>E - Excluído<br/>")
    /**
     * Código da situação do Conhecimento<br>Tamanho: 1<br/>A - Ativo <br/>E - Excluído<br/>
     **/
    private SituacaoEnum situacao = null;
    @XmlElement(name = "tipo")
    @ApiModelProperty(example = "HAWB", value = "Tipo de carga.")
    /**
     * Tipo de carga.
     **/
    private TipoEnum tipo = null;
    @XmlElement(name = "contatosEmbarcadorEstrangeiro")
    @ApiModelProperty(value = "Lista de contatos do embarcador estrangeiro.")
    @Valid
    /**
     * Lista de contatos do embarcador estrangeiro.
     **/
    private List<ContatoConsultaDetalhada> contatosEmbarcadorEstrangeiro = null;
    @XmlElement(name = "itensCarga")
    @ApiModelProperty(value = "Lista contendo os itens de carga contidos na carga / Dsic<br/>")
    @Valid
    /**
     * Lista contendo os itens de carga contidos na carga / Dsic<br/>
     **/
    private List<ItemCargaConhecimentoConsultaDetalhada> itensCarga = null;
    @XmlElement(name = "mawbAwbAssociados")
    @ApiModelProperty(value = "Lista contendo as cargas MAWB<br/>")
    @Valid
    /**
     * Lista contendo as cargas MAWB<br/>
     **/
    private List<MawbAssociadoConsultaDetalhada> mawbAwbAssociados = null;
    @XmlElement(name = "enderecoAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(example = "CZIFFLAF, 3394", value = "Endereco do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereco do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String enderecoAgenteDeCargaConsolidadorEstrang = null;
    @XmlElement(name = "cnpjResponsavelArquivo")
    @ApiModelProperty(example = "00000000000191", value = "CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
     **/
    private String cnpjResponsavelArquivo = null;
    @XmlElement(name = "paisConsignatarioConhecimento")
    @ApiModelProperty(example = "BR", value = "País do consignatário no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA")
    /**
     * País do consignatário no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA
     **/
    private String paisConsignatarioConhecimento = null;
    @XmlElement(name = "indicadorPartesMadeira")
    @ApiModelProperty(example = "S", value = "Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira<br/> S - Sim <br/>N - Não<br/>")
    /**
     * Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira<br/> S - Sim <br/>N - Não<br/>
     **/
    private IndicadorPartesMadeiraEnum indicadorPartesMadeira = null;
    @XmlElement(name = "frete")
    @ApiModelProperty(value = "")
    @Valid
    private CargaDetalheFrete frete = null;
    @XmlElement(name = "viagensAssociadas")
    @ApiModelProperty(value = "Lista contendo as viagens as quais a carga / Dsic está associada<br/>")
    @Valid
    /**
     * Lista contendo as viagens as quais a carga / Dsic está associada<br/>
     **/
    private List<ChaveViagem> viagensAssociadas = null;
    @XmlElement(name = "partesEstoque")
    @ApiModelProperty(value = "Lista contendo as partes da carga<br/>")
    @Valid
    /**
     * Lista contendo as partes da carga<br/>
     **/
    private List<EstoqueConsultaDetalhada> partesEstoque = null;
    @XmlElement(name = "pesoBrutoConhecimento")
    @ApiModelProperty(example = "105.478", value = "Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.")
    @Valid
    /**
     * Peso em Kg<br/>Tamanho: 7,3<br/>Formato: Decimal, com até 3 casas decimais separadas por ponto.
     **/
    private BigDecimal pesoBrutoConhecimento = null;
    @XmlElement(name = "nomeEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "EMBARCADOR ESTRANGEIRO EXEMPLO", value = "Nome do embarcador estrangeiro<br>Tamanho: 70<br/>")
    /**
     * Nome do embarcador estrangeiro<br>Tamanho: 70<br/>
     **/
    private String nomeEmbarcadorEstrangeiro = null;
    @XmlElement(name = "nomeConsignatarioConhecimento")
    @ApiModelProperty(example = "Banco do Brasil", value = "Nome do consignatário no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Nome do consignatário no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String nomeConsignatarioConhecimento = null;
    @XmlElement(name = "divergencias")
    @ApiModelProperty(value = "Lista as divergências ativos da carga<br/>")
    @Valid
    /**
     * Lista as divergências ativos da carga<br/>
     **/
    private List<DivergenciaConsultaDetalhada> divergencias = null;
    @XmlElement(name = "dataHoraAssinaturaTransportador")
    @ApiModelProperty(value = "Data/Hora de emissao do XFWB pelo transportador.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
    /**
     * Data/Hora de emissao do XFWB pelo transportador.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
     **/
    private String dataHoraAssinaturaTransportador = null;
    @XmlElement(name = "outrasInfosServico")
    @ApiModelProperty(value = "Lista contendo as outras informações de serviço para a carga / Dsic<br/>")
    @Valid
    /**
     * Lista contendo as outras informações de serviço para a carga / Dsic<br/>
     **/
    private List<InfoManuseioConsultaDetalhada> outrasInfosServico = null;
    @XmlElement(name = "tipoDocumentoConsignatario")
    @ApiModelProperty(example = "PASSAPORTE", value = "Tipo de documento do consignatário da carga<br/>Tamanho: 10")
    /**
     * Tipo de documento do consignatário da carga<br/>Tamanho: 10
     **/
    private TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario = null;
    @XmlElement(name = "caixaPostalConsignatarioConhecimento")
    @ApiModelProperty(example = "29292-929", value = "Endereço postal do consignatário no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereço postal do consignatário no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String caixaPostalConsignatarioConhecimento = null;
    @XmlElement(name = "dsicsApropriados")
    @ApiModelProperty(value = "Lista contendo os Dsics apropriados a carga<br/>")
    @Valid
    /**
     * Lista contendo os Dsics apropriados a carga<br/>
     **/
    private List<ChaveDsic> dsicsApropriados = null;
    @XmlElement(name = "paisAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(example = "BR", value = "País do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA")
    /**
     * País do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA
     **/
    private String paisAgenteDeCargaConsolidadorEstrang = null;
    @XmlElement(name = "recintoAduaneiroDestino")
    @ApiModelProperty(example = "8911101", value = "Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos")
    /**
     * Código do Recinto Aduaneiro.<br/>Tamanho: 7<br/> Formato: inteiro com até 7 dígitos
     **/
    private String recintoAduaneiroDestino = null;
    @XmlElement(name = "chegadasTerrestres")
    @ApiModelProperty(value = "Lista as chegadas de viagens terrestres associadas ao conhecimento<br/>")
    @Valid
    /**
     * Lista as chegadas de viagens terrestres associadas ao conhecimento<br/>
     **/
    private List<CargaDetalheChegadaTerrestre> chegadasTerrestres = null;
    @XmlElement(name = "contatosConsignatarioConhecimento")
    @ApiModelProperty(value = "Lista de contatos do consignatário.")
    @Valid
    /**
     * Lista de contatos do consignatário.
     **/
    private List<ContatoConsultaDetalhada> contatosConsignatarioConhecimento = null;
    @XmlElement(name = "quantidadeVolumesConhecimento")
    @ApiModelProperty(example = "5", value = "Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos")
    /**
     * Quantidade de volumes<br/>Tamanho: 4<br/>Formato: Inteiro, com até 4 digitos
     **/
    private Integer quantidadeVolumesConhecimento = null;
    @XmlElement(name = "dataEmissao")
    @ApiModelProperty(example = "2020-05-07T17:43:18-03:00", value = "Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ")
    /**
     * Data/Hora de emissão.<br/> Formato: yyyy-MM-dd'T'HH:mm:ssZ
     **/
    private String dataEmissao = null;
    @XmlElement(name = "paisEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "BR", value = "País do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA")
    /**
     * País do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 2<br/>Formato: AA
     **/
    private String paisEmbarcadorEstrangeiro = null;
    @XmlElement(name = "categoriaCarga")
    @ApiModelProperty(example = "I", value = "Código da categoria da carga<br>Tamanho: 1<br/>E - Exportada <br/>I - Importada<br/>N - Nacional<br/>P - Passagem<br/>")
    /**
     * Código da categoria da carga<br>Tamanho: 1<br/>E - Exportada <br/>I - Importada<br/>N - Nacional<br/>P - Passagem<br/>
     **/
    private CategoriaCargaEnum categoriaCarga = null;
    @XmlElement(name = "documentosSaida")
    @ApiModelProperty(value = "Lista contendo os documentos de saída associados a carga / Dsic<br/>")
    @Valid
    /**
     * Lista contendo os documentos de saída associados a carga / Dsic<br/>
     **/
    private List<DocumentoSaidaConsultaDetalhada> documentosSaida = null;
    @XmlElement(name = "bloqueiosBaixados")
    @ApiModelProperty(value = "Lista os bloqueios baixados da carga / Dsic<br/>")
    @Valid
    /**
     * Lista os bloqueios baixados da carga / Dsic<br/>
     **/
    private List<DesbloqueioConsultaDetalhada> bloqueiosBaixados = null;
    @XmlElement(name = "manuseiosEspeciais")
    @ApiModelProperty(value = "Lista contendo os manuseios especiais para a carga / Dsic<br/>")
    @Valid
    /**
     * Lista contendo os manuseios especiais para a carga / Dsic<br/>
     **/
    private List<InfoManuseioConsultaDetalhada> manuseiosEspeciais = null;
    @XmlElement(name = "solicitacoesServicosEspeciais")
    @ApiModelProperty(value = "Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>")
    @Valid
    /**
     * Lista contendo as solicitações de serviços especiaos para a carga / Dsic<br/>
     **/
    private List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais = null;
    @XmlElement(name = "recepcoesComAvarias")
    @ApiModelProperty(value = "Lista de recepções com avarias agrupadas por recinto aduaneiro<br/>")
    @Valid
    /**
     * Lista de recepções com avarias agrupadas por recinto aduaneiro<br/>
     **/
    private List<RecepcaoComAvaria> recepcoesComAvarias = null;
    @XmlElement(name = "cidadeConsignatarioConhecimento")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade do consignatário no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Cidade do consignatário no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String cidadeConsignatarioConhecimento = null;
    @XmlElement(name = "bloqueiosAtivos")
    @ApiModelProperty(value = "Lista os bloqueios ativos da carga / Dsic<br/>")
    @Valid
    /**
     * Lista os bloqueios ativos da carga / Dsic<br/>
     **/
    private List<BloqueioConsultaDetalhada> bloqueiosAtivos = null;
    @XmlElement(name = "codigoAeroportoOrigemConhecimento")
    @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto<br/>Tamanho: 3")
    /**
     * Código IATA do aeroporto<br/>Tamanho: 3
     **/
    private String codigoAeroportoOrigemConhecimento = null;
    @XmlElement(name = "outrasPartesInteressadas")
    @ApiModelProperty(value = "Lista das partes interessadas.")
    @Valid
    /**
     * Lista das partes interessadas.
     **/
    private List<ParteInteressadaConsultaDetalhada> outrasPartesInteressadas = null;
    @XmlElement(name = "contatosAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(value = "Lista de contatos do agente de carga consolidador estrangeiro.")
    @Valid
    /**
     * Lista de contatos do agente de carga consolidador estrangeiro.
     **/
    private List<ContatoConsultaDetalhada> contatosAgenteDeCargaConsolidadorEstrang = null;
    @XmlElement(name = "cidadeEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Cidade do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String cidadeEmbarcadorEstrangeiro = null;
    @XmlElement(name = "indicadorNaoRecepcaoHawbAssociados")
    @ApiModelProperty(example = "S", value = "Informação prestada pelo transportador responsável pelo conhecimento.<br>S - Sim<br>N - Não<br><br>Quando for \"S\", a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada pelo MAWB, e não por seus HAWB associados.<br><br>Quando for \"N\", a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada diretamente pelos HAWB.<br><br>Este indicador não deve ser levado em consideração nas recepções realizadas em unidades que não sejam o aeroporto de destino do conhecimento. Nestes casos, indica-se como padrão a recepção pelo MAWB.")
    /**
     * Informação prestada pelo transportador responsável pelo conhecimento.<br>S - Sim<br>N - Não<br><br>Quando for \"S\", a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada pelo MAWB, e não por seus HAWB associados.<br><br>Quando for \"N\", a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada diretamente pelos HAWB.<br><br>Este indicador não deve ser levado em consideração nas recepções realizadas em unidades que não sejam o aeroporto de destino do conhecimento. Nestes casos, indica-se como padrão a recepção pelo MAWB.
     **/
    private IndicadorNaoRecepcaoHawbAssociadosEnum indicadorNaoRecepcaoHawbAssociados = null;
    @XmlElement(name = "razaoSocialDocumentoConsignatario")
    @ApiModelProperty(example = "Banco do Brasil", value = "Razão social do consignatário<br/>Tamanho máximo: 70")
    /**
     * Razão social do consignatário<br/>Tamanho máximo: 70
     **/
    private String razaoSocialDocumentoConsignatario = null;
    @XmlElement(name = "caixaPostalAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(example = "29292-929", value = "Endereço postal do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereço postal do agente de carga consolidador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String caixaPostalAgenteDeCargaConsolidadorEstrang = null;
    @XmlElement(name = "identificacao")
    @ApiModelProperty(example = "43NQKMM8KNT", value = "Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35")
    /**
     * Número do conhecimento<br/>Tamanho mínimo: 1<br/>Tamanho máximo: 35
     **/
    private String identificacao = null;
    @XmlElement(name = "enderecoConsignatarioConhecimento")
    @ApiModelProperty(example = "CZIFFLAF, 3394", value = "Endereco do consignatário no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereco do consignatário no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String enderecoConsignatarioConhecimento = null;
    @XmlElement(name = "enderecoEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "CZIFFLAF, 3394", value = "Endereco do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereco do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String enderecoEmbarcadorEstrangeiro = null;
    @XmlElement(name = "caixaPostalEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "29292-929", value = "Endereço postal do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70")
    /**
     * Endereço postal do embarcador estrangeiro no conhecimento de carga<br/>Tamanho máximo: 70
     **/
    private String caixaPostalEmbarcadorEstrangeiro = null;
    @XmlElement(name = "descricaoResumida")
    @ApiModelProperty(example = "Descrição resumida das mercadorias", value = "Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>")
    /**
     * Descrição resumida das mercadorias que estão sendo transportadas<br>Tamanho: 600<br/>
     **/
    private String descricaoResumida = null;
    @XmlElement(name = "localAssinaturaTransportador")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Local de emissao do XFWB pelo transportador<br/>Tamanho: 35<br/>")
    /**
     * Local de emissao do XFWB pelo transportador<br/>Tamanho: 35<br/>
     **/
    private String localAssinaturaTransportador = null;
    @XmlElement(name = "nomeDocumentoConsignatario")
    @ApiModelProperty(example = "Banco do Brasil", value = "Nome do consignatário no documento<br/>Tamanho máximo: 70")
    /**
     * Nome do consignatário no documento<br/>Tamanho máximo: 70
     **/
    private String nomeDocumentoConsignatario = null;
    @XmlElement(name = "codigoAeroportoDestinoConhecimento")
    @ApiModelProperty(example = "GIG", value = "Código IATA do aeroporto<br/>Tamanho: 3")
    /**
     * Código IATA do aeroporto<br/>Tamanho: 3
     **/
    private String codigoAeroportoDestinoConhecimento = null;
    @XmlElement(name = "nomeAgenteDeCargaConsolidadorEstrang")
    @ApiModelProperty(example = "EMBARCADOR ESTRANGEIRO EXEMPLO", value = "Nome do agente de carga consolidador estrangeiro<br>Tamanho: 70<br/>")
    /**
     * Nome do agente de carga consolidador estrangeiro<br>Tamanho: 70<br/>
     **/
    private String nomeAgenteDeCargaConsolidadorEstrang = null;
    @XmlElement(name = "nomeAssinaturaEmbarcadorEstrangeiro")
    @ApiModelProperty(example = "EMBARCADOR ESTRANGEIRO EXEMPLO", value = "Nome do responsável pelo embarque<br>Tamanho: 70<br/>")
    /**
     * Nome do responsável pelo embarque<br>Tamanho: 70<br/>
     **/
    private String nomeAssinaturaEmbarcadorEstrangeiro = null;
    @XmlElement(name = "nomeAssinaturaTransportador")
    @ApiModelProperty(example = "Transportation Transport LTD.", value = "Assinatura transportador<br/>Tamanho: 35<br/>")
    /**
     * Assinatura transportador<br/>Tamanho: 35<br/>
     **/
    private String nomeAssinaturaTransportador = null;
    @XmlElement(name = "hawbAssociados")
    @ApiModelProperty(value = "Lista contendo as cargas HAWB<br/>")
    @Valid
    /**
     * Lista contendo as cargas HAWB<br/>
     **/
    private List<HawbMawbAssociadoConsultaDetalhada> hawbAssociados = null;
    @XmlElement(name = "identificacaoDocumentoConsignatario")
    @ApiModelProperty(example = "00000000000191", value = "CNPJ do consignatário<br/>Tamanho: 14<br/>")
    /**
     * CNPJ do consignatário<br/>Tamanho: 14<br/>
     **/
    private String identificacaoDocumentoConsignatario = null;

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
     * Cidade do agente de carga consolidador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return cidadeAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("cidadeAgenteDeCargaConsolidadorEstrang")
    public String getCidadeAgenteDeCargaConsolidadorEstrang() {
        return cidadeAgenteDeCargaConsolidadorEstrang;
    }

    public void setCidadeAgenteDeCargaConsolidadorEstrang(String cidadeAgenteDeCargaConsolidadorEstrang) {
        this.cidadeAgenteDeCargaConsolidadorEstrang = cidadeAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada cidadeAgenteDeCargaConsolidadorEstrang(String cidadeAgenteDeCargaConsolidadorEstrang) {
        this.cidadeAgenteDeCargaConsolidadorEstrang = cidadeAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    /**
     * Número único de referencia da carga que atende à recomendação da Organização Mundial de Aduanas (OMA) para a Unique Consignment Reference (UCR). Utilizado para o rastreamento de uma carga, servindo para o controle da armazenagem e movimentação da carga&lt;br&gt;Tamanho: 35
     *
     * @return ruc
     **/
    @JsonProperty("ruc")
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public ConhecimentoConsultaDetalhada ruc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    /**
     * Código da situação do Conhecimento&lt;br&gt;Tamanho: 1&lt;br/&gt;A - Ativo &lt;br/&gt;E - Excluído&lt;br/&gt;
     *
     * @return situacao
     **/
    @JsonProperty("situacao")
    public String getSituacao() {
        if (situacao == null) {
            return null;
        }
        return situacao.value();
    }

    public void setSituacao(SituacaoEnum situacao) {
        this.situacao = situacao;
    }

    public ConhecimentoConsultaDetalhada situacao(SituacaoEnum situacao) {
        this.situacao = situacao;
        return this;
    }

    /**
     * Tipo de carga.
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public String getTipo() {
        if (tipo == null) {
            return null;
        }
        return tipo.value();
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public ConhecimentoConsultaDetalhada tipo(TipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Lista de contatos do embarcador estrangeiro.
     *
     * @return contatosEmbarcadorEstrangeiro
     **/
    @JsonProperty("contatosEmbarcadorEstrangeiro")
    public List<ContatoConsultaDetalhada> getContatosEmbarcadorEstrangeiro() {
        return contatosEmbarcadorEstrangeiro;
    }

    public void setContatosEmbarcadorEstrangeiro(List<ContatoConsultaDetalhada> contatosEmbarcadorEstrangeiro) {
        this.contatosEmbarcadorEstrangeiro = contatosEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada contatosEmbarcadorEstrangeiro(List<ContatoConsultaDetalhada> contatosEmbarcadorEstrangeiro) {
        this.contatosEmbarcadorEstrangeiro = contatosEmbarcadorEstrangeiro;
        return this;
    }

    public ConhecimentoConsultaDetalhada addContatosEmbarcadorEstrangeiroItem(ContatoConsultaDetalhada contatosEmbarcadorEstrangeiroItem) {
        this.contatosEmbarcadorEstrangeiro.add(contatosEmbarcadorEstrangeiroItem);
        return this;
    }

    /**
     * Lista contendo os itens de carga contidos na carga / Dsic&lt;br/&gt;
     *
     * @return itensCarga
     **/
    @JsonProperty("itensCarga")
    public List<ItemCargaConhecimentoConsultaDetalhada> getItensCarga() {
        return itensCarga;
    }

    public void setItensCarga(List<ItemCargaConhecimentoConsultaDetalhada> itensCarga) {
        this.itensCarga = itensCarga;
    }

    public ConhecimentoConsultaDetalhada itensCarga(List<ItemCargaConhecimentoConsultaDetalhada> itensCarga) {
        this.itensCarga = itensCarga;
        return this;
    }

    public ConhecimentoConsultaDetalhada addItensCargaItem(ItemCargaConhecimentoConsultaDetalhada itensCargaItem) {
        this.itensCarga.add(itensCargaItem);
        return this;
    }

    /**
     * Lista contendo as cargas MAWB&lt;br/&gt;
     *
     * @return mawbAwbAssociados
     **/
    @JsonProperty("mawbAwbAssociados")
    public List<MawbAssociadoConsultaDetalhada> getMawbAwbAssociados() {
        return mawbAwbAssociados;
    }

    public void setMawbAwbAssociados(List<MawbAssociadoConsultaDetalhada> mawbAwbAssociados) {
        this.mawbAwbAssociados = mawbAwbAssociados;
    }

    public ConhecimentoConsultaDetalhada mawbAwbAssociados(List<MawbAssociadoConsultaDetalhada> mawbAwbAssociados) {
        this.mawbAwbAssociados = mawbAwbAssociados;
        return this;
    }

    public ConhecimentoConsultaDetalhada addMawbAwbAssociadosItem(MawbAssociadoConsultaDetalhada mawbAwbAssociadosItem) {
        this.mawbAwbAssociados.add(mawbAwbAssociadosItem);
        return this;
    }

    /**
     * Endereco do agente de carga consolidador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return enderecoAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("enderecoAgenteDeCargaConsolidadorEstrang")
    public String getEnderecoAgenteDeCargaConsolidadorEstrang() {
        return enderecoAgenteDeCargaConsolidadorEstrang;
    }

    public void setEnderecoAgenteDeCargaConsolidadorEstrang(String enderecoAgenteDeCargaConsolidadorEstrang) {
        this.enderecoAgenteDeCargaConsolidadorEstrang = enderecoAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada enderecoAgenteDeCargaConsolidadorEstrang(String enderecoAgenteDeCargaConsolidadorEstrang) {
        this.enderecoAgenteDeCargaConsolidadorEstrang = enderecoAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    /**
     * CNPJ do Transportador (Cia Aérea) ou do Agente de Carga responsável pelo envio do arquivo  Tamanho mínimo: 8  Tamanho máximo: 14  Formato: NNNNNNNNNNNNNN
     *
     * @return cnpjResponsavelArquivo
     **/
    @JsonProperty("cnpjResponsavelArquivo")
    public String getCnpjResponsavelArquivo() {
        return cnpjResponsavelArquivo;
    }

    public void setCnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
        this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
    }

    public ConhecimentoConsultaDetalhada cnpjResponsavelArquivo(String cnpjResponsavelArquivo) {
        this.cnpjResponsavelArquivo = cnpjResponsavelArquivo;
        return this;
    }

    /**
     * País do consignatário no conhecimento de carga&lt;br/&gt;Tamanho máximo: 2&lt;br/&gt;Formato: AA
     *
     * @return paisConsignatarioConhecimento
     **/
    @JsonProperty("paisConsignatarioConhecimento")
    public String getPaisConsignatarioConhecimento() {
        return paisConsignatarioConhecimento;
    }

    public void setPaisConsignatarioConhecimento(String paisConsignatarioConhecimento) {
        this.paisConsignatarioConhecimento = paisConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada paisConsignatarioConhecimento(String paisConsignatarioConhecimento) {
        this.paisConsignatarioConhecimento = paisConsignatarioConhecimento;
        return this;
    }

    /**
     * Indica se algum dos itens da carga está sendo transportado em embalagem/suporte de madeira&lt;br/&gt; S - Sim &lt;br/&gt;N - Não&lt;br/&gt;
     *
     * @return indicadorPartesMadeira
     **/
    @JsonProperty("indicadorPartesMadeira")
    public String getIndicadorPartesMadeira() {
        if (indicadorPartesMadeira == null) {
            return null;
        }
        return indicadorPartesMadeira.value();
    }

    public void setIndicadorPartesMadeira(IndicadorPartesMadeiraEnum indicadorPartesMadeira) {
        this.indicadorPartesMadeira = indicadorPartesMadeira;
    }

    public ConhecimentoConsultaDetalhada indicadorPartesMadeira(IndicadorPartesMadeiraEnum indicadorPartesMadeira) {
        this.indicadorPartesMadeira = indicadorPartesMadeira;
        return this;
    }

    /**
     * Get frete
     *
     * @return frete
     **/
    @JsonProperty("frete")
    public CargaDetalheFrete getFrete() {
        return frete;
    }

    public void setFrete(CargaDetalheFrete frete) {
        this.frete = frete;
    }

    public ConhecimentoConsultaDetalhada frete(CargaDetalheFrete frete) {
        this.frete = frete;
        return this;
    }

    /**
     * Lista contendo as viagens as quais a carga / Dsic está associada&lt;br/&gt;
     *
     * @return viagensAssociadas
     **/
    @JsonProperty("viagensAssociadas")
    public List<ChaveViagem> getViagensAssociadas() {
        return viagensAssociadas;
    }

    public void setViagensAssociadas(List<ChaveViagem> viagensAssociadas) {
        this.viagensAssociadas = viagensAssociadas;
    }

    public ConhecimentoConsultaDetalhada viagensAssociadas(List<ChaveViagem> viagensAssociadas) {
        this.viagensAssociadas = viagensAssociadas;
        return this;
    }

    public ConhecimentoConsultaDetalhada addViagensAssociadasItem(ChaveViagem viagensAssociadasItem) {
        this.viagensAssociadas.add(viagensAssociadasItem);
        return this;
    }

    /**
     * Lista contendo as partes da carga&lt;br/&gt;
     *
     * @return partesEstoque
     **/
    @JsonProperty("partesEstoque")
    public List<EstoqueConsultaDetalhada> getPartesEstoque() {
        return partesEstoque;
    }

    public void setPartesEstoque(List<EstoqueConsultaDetalhada> partesEstoque) {
        this.partesEstoque = partesEstoque;
    }

    public ConhecimentoConsultaDetalhada partesEstoque(List<EstoqueConsultaDetalhada> partesEstoque) {
        this.partesEstoque = partesEstoque;
        return this;
    }

    public ConhecimentoConsultaDetalhada addPartesEstoqueItem(EstoqueConsultaDetalhada partesEstoqueItem) {
        this.partesEstoque.add(partesEstoqueItem);
        return this;
    }

    /**
     * Peso em Kg&lt;br/&gt;Tamanho: 7,3&lt;br/&gt;Formato: Decimal, com até 3 casas decimais separadas por ponto.
     *
     * @return pesoBrutoConhecimento
     **/
    @JsonProperty("pesoBrutoConhecimento")
    public BigDecimal getPesoBrutoConhecimento() {
        return pesoBrutoConhecimento;
    }

    public void setPesoBrutoConhecimento(BigDecimal pesoBrutoConhecimento) {
        this.pesoBrutoConhecimento = pesoBrutoConhecimento;
    }

    public ConhecimentoConsultaDetalhada pesoBrutoConhecimento(BigDecimal pesoBrutoConhecimento) {
        this.pesoBrutoConhecimento = pesoBrutoConhecimento;
        return this;
    }

    /**
     * Nome do embarcador estrangeiro&lt;br&gt;Tamanho: 70&lt;br/&gt;
     *
     * @return nomeEmbarcadorEstrangeiro
     **/
    @JsonProperty("nomeEmbarcadorEstrangeiro")
    public String getNomeEmbarcadorEstrangeiro() {
        return nomeEmbarcadorEstrangeiro;
    }

    public void setNomeEmbarcadorEstrangeiro(String nomeEmbarcadorEstrangeiro) {
        this.nomeEmbarcadorEstrangeiro = nomeEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada nomeEmbarcadorEstrangeiro(String nomeEmbarcadorEstrangeiro) {
        this.nomeEmbarcadorEstrangeiro = nomeEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Nome do consignatário no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return nomeConsignatarioConhecimento
     **/
    @JsonProperty("nomeConsignatarioConhecimento")
    public String getNomeConsignatarioConhecimento() {
        return nomeConsignatarioConhecimento;
    }

    public void setNomeConsignatarioConhecimento(String nomeConsignatarioConhecimento) {
        this.nomeConsignatarioConhecimento = nomeConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada nomeConsignatarioConhecimento(String nomeConsignatarioConhecimento) {
        this.nomeConsignatarioConhecimento = nomeConsignatarioConhecimento;
        return this;
    }

    /**
     * Lista as divergências ativos da carga&lt;br/&gt;
     *
     * @return divergencias
     **/
    @JsonProperty("divergencias")
    public List<DivergenciaConsultaDetalhada> getDivergencias() {
        return divergencias;
    }

    public void setDivergencias(List<DivergenciaConsultaDetalhada> divergencias) {
        this.divergencias = divergencias;
    }

    public ConhecimentoConsultaDetalhada divergencias(List<DivergenciaConsultaDetalhada> divergencias) {
        this.divergencias = divergencias;
        return this;
    }

    public ConhecimentoConsultaDetalhada addDivergenciasItem(DivergenciaConsultaDetalhada divergenciasItem) {
        this.divergencias.add(divergenciasItem);
        return this;
    }

    /**
     * Data/Hora de emissao do XFWB pelo transportador.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return dataHoraAssinaturaTransportador
     **/
    @JsonProperty("dataHoraAssinaturaTransportador")
    public String getDataHoraAssinaturaTransportador() {
        return dataHoraAssinaturaTransportador;
    }

    public void setDataHoraAssinaturaTransportador(String dataHoraAssinaturaTransportador) {
        this.dataHoraAssinaturaTransportador = dataHoraAssinaturaTransportador;
    }

    public ConhecimentoConsultaDetalhada dataHoraAssinaturaTransportador(String dataHoraAssinaturaTransportador) {
        this.dataHoraAssinaturaTransportador = dataHoraAssinaturaTransportador;
        return this;
    }

    /**
     * Lista contendo as outras informações de serviço para a carga / Dsic&lt;br/&gt;
     *
     * @return outrasInfosServico
     **/
    @JsonProperty("outrasInfosServico")
    public List<InfoManuseioConsultaDetalhada> getOutrasInfosServico() {
        return outrasInfosServico;
    }

    public void setOutrasInfosServico(List<InfoManuseioConsultaDetalhada> outrasInfosServico) {
        this.outrasInfosServico = outrasInfosServico;
    }

    public ConhecimentoConsultaDetalhada outrasInfosServico(List<InfoManuseioConsultaDetalhada> outrasInfosServico) {
        this.outrasInfosServico = outrasInfosServico;
        return this;
    }

    public ConhecimentoConsultaDetalhada addOutrasInfosServicoItem(InfoManuseioConsultaDetalhada outrasInfosServicoItem) {
        this.outrasInfosServico.add(outrasInfosServicoItem);
        return this;
    }

    /**
     * Tipo de documento do consignatário da carga&lt;br/&gt;Tamanho: 10
     *
     * @return tipoDocumentoConsignatario
     **/
    @JsonProperty("tipoDocumentoConsignatario")
    public String getTipoDocumentoConsignatario() {
        if (tipoDocumentoConsignatario == null) {
            return null;
        }
        return tipoDocumentoConsignatario.value();
    }

    public void setTipoDocumentoConsignatario(TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario) {
        this.tipoDocumentoConsignatario = tipoDocumentoConsignatario;
    }

    public ConhecimentoConsultaDetalhada tipoDocumentoConsignatario(TipoDocumentoConsignatarioEnum tipoDocumentoConsignatario) {
        this.tipoDocumentoConsignatario = tipoDocumentoConsignatario;
        return this;
    }

    /**
     * Endereço postal do consignatário no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return caixaPostalConsignatarioConhecimento
     **/
    @JsonProperty("caixaPostalConsignatarioConhecimento")
    public String getCaixaPostalConsignatarioConhecimento() {
        return caixaPostalConsignatarioConhecimento;
    }

    public void setCaixaPostalConsignatarioConhecimento(String caixaPostalConsignatarioConhecimento) {
        this.caixaPostalConsignatarioConhecimento = caixaPostalConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada caixaPostalConsignatarioConhecimento(String caixaPostalConsignatarioConhecimento) {
        this.caixaPostalConsignatarioConhecimento = caixaPostalConsignatarioConhecimento;
        return this;
    }

    /**
     * Lista contendo os Dsics apropriados a carga&lt;br/&gt;
     *
     * @return dsicsApropriados
     **/
    @JsonProperty("dsicsApropriados")
    public List<ChaveDsic> getDsicsApropriados() {
        return dsicsApropriados;
    }

    public void setDsicsApropriados(List<ChaveDsic> dsicsApropriados) {
        this.dsicsApropriados = dsicsApropriados;
    }

    public ConhecimentoConsultaDetalhada dsicsApropriados(List<ChaveDsic> dsicsApropriados) {
        this.dsicsApropriados = dsicsApropriados;
        return this;
    }

    public ConhecimentoConsultaDetalhada addDsicsApropriadosItem(ChaveDsic dsicsApropriadosItem) {
        this.dsicsApropriados.add(dsicsApropriadosItem);
        return this;
    }

    /**
     * País do agente de carga consolidador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 2&lt;br/&gt;Formato: AA
     *
     * @return paisAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("paisAgenteDeCargaConsolidadorEstrang")
    public String getPaisAgenteDeCargaConsolidadorEstrang() {
        return paisAgenteDeCargaConsolidadorEstrang;
    }

    public void setPaisAgenteDeCargaConsolidadorEstrang(String paisAgenteDeCargaConsolidadorEstrang) {
        this.paisAgenteDeCargaConsolidadorEstrang = paisAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada paisAgenteDeCargaConsolidadorEstrang(String paisAgenteDeCargaConsolidadorEstrang) {
        this.paisAgenteDeCargaConsolidadorEstrang = paisAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    /**
     * Código do Recinto Aduaneiro.&lt;br/&gt;Tamanho: 7&lt;br/&gt; Formato: inteiro com até 7 dígitos
     *
     * @return recintoAduaneiroDestino
     **/
    @JsonProperty("recintoAduaneiroDestino")
    public String getRecintoAduaneiroDestino() {
        return recintoAduaneiroDestino;
    }

    public void setRecintoAduaneiroDestino(String recintoAduaneiroDestino) {
        this.recintoAduaneiroDestino = recintoAduaneiroDestino;
    }

    public ConhecimentoConsultaDetalhada recintoAduaneiroDestino(String recintoAduaneiroDestino) {
        this.recintoAduaneiroDestino = recintoAduaneiroDestino;
        return this;
    }

    /**
     * Lista as chegadas de viagens terrestres associadas ao conhecimento&lt;br/&gt;
     *
     * @return chegadasTerrestres
     **/
    @JsonProperty("chegadasTerrestres")
    public List<CargaDetalheChegadaTerrestre> getChegadasTerrestres() {
        return chegadasTerrestres;
    }

    public void setChegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
        this.chegadasTerrestres = chegadasTerrestres;
    }

    public ConhecimentoConsultaDetalhada chegadasTerrestres(List<CargaDetalheChegadaTerrestre> chegadasTerrestres) {
        this.chegadasTerrestres = chegadasTerrestres;
        return this;
    }

    public ConhecimentoConsultaDetalhada addChegadasTerrestresItem(CargaDetalheChegadaTerrestre chegadasTerrestresItem) {
        this.chegadasTerrestres.add(chegadasTerrestresItem);
        return this;
    }

    /**
     * Lista de contatos do consignatário.
     *
     * @return contatosConsignatarioConhecimento
     **/
    @JsonProperty("contatosConsignatarioConhecimento")
    public List<ContatoConsultaDetalhada> getContatosConsignatarioConhecimento() {
        return contatosConsignatarioConhecimento;
    }

    public void setContatosConsignatarioConhecimento(List<ContatoConsultaDetalhada> contatosConsignatarioConhecimento) {
        this.contatosConsignatarioConhecimento = contatosConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada contatosConsignatarioConhecimento(List<ContatoConsultaDetalhada> contatosConsignatarioConhecimento) {
        this.contatosConsignatarioConhecimento = contatosConsignatarioConhecimento;
        return this;
    }

    public ConhecimentoConsultaDetalhada addContatosConsignatarioConhecimentoItem(ContatoConsultaDetalhada contatosConsignatarioConhecimentoItem) {
        this.contatosConsignatarioConhecimento.add(contatosConsignatarioConhecimentoItem);
        return this;
    }

    /**
     * Quantidade de volumes&lt;br/&gt;Tamanho: 4&lt;br/&gt;Formato: Inteiro, com até 4 digitos
     *
     * @return quantidadeVolumesConhecimento
     **/
    @JsonProperty("quantidadeVolumesConhecimento")
    public Integer getQuantidadeVolumesConhecimento() {
        return quantidadeVolumesConhecimento;
    }

    public void setQuantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
        this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
    }

    public ConhecimentoConsultaDetalhada quantidadeVolumesConhecimento(Integer quantidadeVolumesConhecimento) {
        this.quantidadeVolumesConhecimento = quantidadeVolumesConhecimento;
        return this;
    }

    /**
     * Data/Hora de emissão.&lt;br/&gt; Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ConhecimentoConsultaDetalhada dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * País do embarcador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 2&lt;br/&gt;Formato: AA
     *
     * @return paisEmbarcadorEstrangeiro
     **/
    @JsonProperty("paisEmbarcadorEstrangeiro")
    public String getPaisEmbarcadorEstrangeiro() {
        return paisEmbarcadorEstrangeiro;
    }

    public void setPaisEmbarcadorEstrangeiro(String paisEmbarcadorEstrangeiro) {
        this.paisEmbarcadorEstrangeiro = paisEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada paisEmbarcadorEstrangeiro(String paisEmbarcadorEstrangeiro) {
        this.paisEmbarcadorEstrangeiro = paisEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Código da categoria da carga&lt;br&gt;Tamanho: 1&lt;br/&gt;E - Exportada &lt;br/&gt;I - Importada&lt;br/&gt;N - Nacional&lt;br/&gt;P - Passagem&lt;br/&gt;
     *
     * @return categoriaCarga
     **/
    @JsonProperty("categoriaCarga")
    public String getCategoriaCarga() {
        if (categoriaCarga == null) {
            return null;
        }
        return categoriaCarga.value();
    }

    public void setCategoriaCarga(CategoriaCargaEnum categoriaCarga) {
        this.categoriaCarga = categoriaCarga;
    }

    public ConhecimentoConsultaDetalhada categoriaCarga(CategoriaCargaEnum categoriaCarga) {
        this.categoriaCarga = categoriaCarga;
        return this;
    }

    /**
     * Lista contendo os documentos de saída associados a carga / Dsic&lt;br/&gt;
     *
     * @return documentosSaida
     **/
    @JsonProperty("documentosSaida")
    public List<DocumentoSaidaConsultaDetalhada> getDocumentosSaida() {
        return documentosSaida;
    }

    public void setDocumentosSaida(List<DocumentoSaidaConsultaDetalhada> documentosSaida) {
        this.documentosSaida = documentosSaida;
    }

    public ConhecimentoConsultaDetalhada documentosSaida(List<DocumentoSaidaConsultaDetalhada> documentosSaida) {
        this.documentosSaida = documentosSaida;
        return this;
    }

    public ConhecimentoConsultaDetalhada addDocumentosSaidaItem(DocumentoSaidaConsultaDetalhada documentosSaidaItem) {
        this.documentosSaida.add(documentosSaidaItem);
        return this;
    }

    /**
     * Lista os bloqueios baixados da carga / Dsic&lt;br/&gt;
     *
     * @return bloqueiosBaixados
     **/
    @JsonProperty("bloqueiosBaixados")
    public List<DesbloqueioConsultaDetalhada> getBloqueiosBaixados() {
        return bloqueiosBaixados;
    }

    public void setBloqueiosBaixados(List<DesbloqueioConsultaDetalhada> bloqueiosBaixados) {
        this.bloqueiosBaixados = bloqueiosBaixados;
    }

    public ConhecimentoConsultaDetalhada bloqueiosBaixados(List<DesbloqueioConsultaDetalhada> bloqueiosBaixados) {
        this.bloqueiosBaixados = bloqueiosBaixados;
        return this;
    }

    public ConhecimentoConsultaDetalhada addBloqueiosBaixadosItem(DesbloqueioConsultaDetalhada bloqueiosBaixadosItem) {
        this.bloqueiosBaixados.add(bloqueiosBaixadosItem);
        return this;
    }

    /**
     * Lista contendo os manuseios especiais para a carga / Dsic&lt;br/&gt;
     *
     * @return manuseiosEspeciais
     **/
    @JsonProperty("manuseiosEspeciais")
    public List<InfoManuseioConsultaDetalhada> getManuseiosEspeciais() {
        return manuseiosEspeciais;
    }

    public void setManuseiosEspeciais(List<InfoManuseioConsultaDetalhada> manuseiosEspeciais) {
        this.manuseiosEspeciais = manuseiosEspeciais;
    }

    public ConhecimentoConsultaDetalhada manuseiosEspeciais(List<InfoManuseioConsultaDetalhada> manuseiosEspeciais) {
        this.manuseiosEspeciais = manuseiosEspeciais;
        return this;
    }

    public ConhecimentoConsultaDetalhada addManuseiosEspeciaisItem(InfoManuseioConsultaDetalhada manuseiosEspeciaisItem) {
        this.manuseiosEspeciais.add(manuseiosEspeciaisItem);
        return this;
    }

    /**
     * Lista contendo as solicitações de serviços especiaos para a carga / Dsic&lt;br/&gt;
     *
     * @return solicitacoesServicosEspeciais
     **/
    @JsonProperty("solicitacoesServicosEspeciais")
    public List<InfoManuseioConsultaDetalhada> getSolicitacoesServicosEspeciais() {
        return solicitacoesServicosEspeciais;
    }

    public void setSolicitacoesServicosEspeciais(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais) {
        this.solicitacoesServicosEspeciais = solicitacoesServicosEspeciais;
    }

    public ConhecimentoConsultaDetalhada solicitacoesServicosEspeciais(List<InfoManuseioConsultaDetalhada> solicitacoesServicosEspeciais) {
        this.solicitacoesServicosEspeciais = solicitacoesServicosEspeciais;
        return this;
    }

    public ConhecimentoConsultaDetalhada addSolicitacoesServicosEspeciaisItem(InfoManuseioConsultaDetalhada solicitacoesServicosEspeciaisItem) {
        this.solicitacoesServicosEspeciais.add(solicitacoesServicosEspeciaisItem);
        return this;
    }

    /**
     * Lista de recepções com avarias agrupadas por recinto aduaneiro&lt;br/&gt;
     *
     * @return recepcoesComAvarias
     **/
    @JsonProperty("recepcoesComAvarias")
    public List<RecepcaoComAvaria> getRecepcoesComAvarias() {
        return recepcoesComAvarias;
    }

    public void setRecepcoesComAvarias(List<RecepcaoComAvaria> recepcoesComAvarias) {
        this.recepcoesComAvarias = recepcoesComAvarias;
    }

    public ConhecimentoConsultaDetalhada recepcoesComAvarias(List<RecepcaoComAvaria> recepcoesComAvarias) {
        this.recepcoesComAvarias = recepcoesComAvarias;
        return this;
    }

    public ConhecimentoConsultaDetalhada addRecepcoesComAvariasItem(RecepcaoComAvaria recepcoesComAvariasItem) {
        this.recepcoesComAvarias.add(recepcoesComAvariasItem);
        return this;
    }

    /**
     * Cidade do consignatário no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return cidadeConsignatarioConhecimento
     **/
    @JsonProperty("cidadeConsignatarioConhecimento")
    public String getCidadeConsignatarioConhecimento() {
        return cidadeConsignatarioConhecimento;
    }

    public void setCidadeConsignatarioConhecimento(String cidadeConsignatarioConhecimento) {
        this.cidadeConsignatarioConhecimento = cidadeConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada cidadeConsignatarioConhecimento(String cidadeConsignatarioConhecimento) {
        this.cidadeConsignatarioConhecimento = cidadeConsignatarioConhecimento;
        return this;
    }

    /**
     * Lista os bloqueios ativos da carga / Dsic&lt;br/&gt;
     *
     * @return bloqueiosAtivos
     **/
    @JsonProperty("bloqueiosAtivos")
    public List<BloqueioConsultaDetalhada> getBloqueiosAtivos() {
        return bloqueiosAtivos;
    }

    public void setBloqueiosAtivos(List<BloqueioConsultaDetalhada> bloqueiosAtivos) {
        this.bloqueiosAtivos = bloqueiosAtivos;
    }

    public ConhecimentoConsultaDetalhada bloqueiosAtivos(List<BloqueioConsultaDetalhada> bloqueiosAtivos) {
        this.bloqueiosAtivos = bloqueiosAtivos;
        return this;
    }

    public ConhecimentoConsultaDetalhada addBloqueiosAtivosItem(BloqueioConsultaDetalhada bloqueiosAtivosItem) {
        this.bloqueiosAtivos.add(bloqueiosAtivosItem);
        return this;
    }

    /**
     * Código IATA do aeroporto&lt;br/&gt;Tamanho: 3
     *
     * @return codigoAeroportoOrigemConhecimento
     **/
    @JsonProperty("codigoAeroportoOrigemConhecimento")
    public String getCodigoAeroportoOrigemConhecimento() {
        return codigoAeroportoOrigemConhecimento;
    }

    public void setCodigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
        this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
    }

    public ConhecimentoConsultaDetalhada codigoAeroportoOrigemConhecimento(String codigoAeroportoOrigemConhecimento) {
        this.codigoAeroportoOrigemConhecimento = codigoAeroportoOrigemConhecimento;
        return this;
    }

    /**
     * Lista das partes interessadas.
     *
     * @return outrasPartesInteressadas
     **/
    @JsonProperty("outrasPartesInteressadas")
    public List<ParteInteressadaConsultaDetalhada> getOutrasPartesInteressadas() {
        return outrasPartesInteressadas;
    }

    public void setOutrasPartesInteressadas(List<ParteInteressadaConsultaDetalhada> outrasPartesInteressadas) {
        this.outrasPartesInteressadas = outrasPartesInteressadas;
    }

    public ConhecimentoConsultaDetalhada outrasPartesInteressadas(List<ParteInteressadaConsultaDetalhada> outrasPartesInteressadas) {
        this.outrasPartesInteressadas = outrasPartesInteressadas;
        return this;
    }

    public ConhecimentoConsultaDetalhada addOutrasPartesInteressadasItem(ParteInteressadaConsultaDetalhada outrasPartesInteressadasItem) {
        this.outrasPartesInteressadas.add(outrasPartesInteressadasItem);
        return this;
    }

    /**
     * Lista de contatos do agente de carga consolidador estrangeiro.
     *
     * @return contatosAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("contatosAgenteDeCargaConsolidadorEstrang")
    public List<ContatoConsultaDetalhada> getContatosAgenteDeCargaConsolidadorEstrang() {
        return contatosAgenteDeCargaConsolidadorEstrang;
    }

    public void setContatosAgenteDeCargaConsolidadorEstrang(List<ContatoConsultaDetalhada> contatosAgenteDeCargaConsolidadorEstrang) {
        this.contatosAgenteDeCargaConsolidadorEstrang = contatosAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada contatosAgenteDeCargaConsolidadorEstrang(List<ContatoConsultaDetalhada> contatosAgenteDeCargaConsolidadorEstrang) {
        this.contatosAgenteDeCargaConsolidadorEstrang = contatosAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    public ConhecimentoConsultaDetalhada addContatosAgenteDeCargaConsolidadorEstrangItem(ContatoConsultaDetalhada contatosAgenteDeCargaConsolidadorEstrangItem) {
        this.contatosAgenteDeCargaConsolidadorEstrang.add(contatosAgenteDeCargaConsolidadorEstrangItem);
        return this;
    }

    /**
     * Cidade do embarcador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return cidadeEmbarcadorEstrangeiro
     **/
    @JsonProperty("cidadeEmbarcadorEstrangeiro")
    public String getCidadeEmbarcadorEstrangeiro() {
        return cidadeEmbarcadorEstrangeiro;
    }

    public void setCidadeEmbarcadorEstrangeiro(String cidadeEmbarcadorEstrangeiro) {
        this.cidadeEmbarcadorEstrangeiro = cidadeEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada cidadeEmbarcadorEstrangeiro(String cidadeEmbarcadorEstrangeiro) {
        this.cidadeEmbarcadorEstrangeiro = cidadeEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Informação prestada pelo transportador responsável pelo conhecimento.&lt;br&gt;S - Sim&lt;br&gt;N - Não&lt;br&gt;&lt;br&gt;Quando for \&quot;S\&quot;, a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada pelo MAWB, e não por seus HAWB associados.&lt;br&gt;&lt;br&gt;Quando for \&quot;N\&quot;, a orientação é de que a recepção no aeroporto de destino do conhecimento seja realizada diretamente pelos HAWB.&lt;br&gt;&lt;br&gt;Este indicador não deve ser levado em consideração nas recepções realizadas em unidades que não sejam o aeroporto de destino do conhecimento. Nestes casos, indica-se como padrão a recepção pelo MAWB.
     *
     * @return indicadorNaoRecepcaoHawbAssociados
     **/
    @JsonProperty("indicadorNaoRecepcaoHawbAssociados")
    public String getIndicadorNaoRecepcaoHawbAssociados() {
        if (indicadorNaoRecepcaoHawbAssociados == null) {
            return null;
        }
        return indicadorNaoRecepcaoHawbAssociados.value();
    }

    public void setIndicadorNaoRecepcaoHawbAssociados(IndicadorNaoRecepcaoHawbAssociadosEnum indicadorNaoRecepcaoHawbAssociados) {
        this.indicadorNaoRecepcaoHawbAssociados = indicadorNaoRecepcaoHawbAssociados;
    }

    public ConhecimentoConsultaDetalhada indicadorNaoRecepcaoHawbAssociados(IndicadorNaoRecepcaoHawbAssociadosEnum indicadorNaoRecepcaoHawbAssociados) {
        this.indicadorNaoRecepcaoHawbAssociados = indicadorNaoRecepcaoHawbAssociados;
        return this;
    }

    /**
     * Razão social do consignatário&lt;br/&gt;Tamanho máximo: 70
     *
     * @return razaoSocialDocumentoConsignatario
     **/
    @JsonProperty("razaoSocialDocumentoConsignatario")
    public String getRazaoSocialDocumentoConsignatario() {
        return razaoSocialDocumentoConsignatario;
    }

    public void setRazaoSocialDocumentoConsignatario(String razaoSocialDocumentoConsignatario) {
        this.razaoSocialDocumentoConsignatario = razaoSocialDocumentoConsignatario;
    }

    public ConhecimentoConsultaDetalhada razaoSocialDocumentoConsignatario(String razaoSocialDocumentoConsignatario) {
        this.razaoSocialDocumentoConsignatario = razaoSocialDocumentoConsignatario;
        return this;
    }

    /**
     * Endereço postal do agente de carga consolidador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return caixaPostalAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("caixaPostalAgenteDeCargaConsolidadorEstrang")
    public String getCaixaPostalAgenteDeCargaConsolidadorEstrang() {
        return caixaPostalAgenteDeCargaConsolidadorEstrang;
    }

    public void setCaixaPostalAgenteDeCargaConsolidadorEstrang(String caixaPostalAgenteDeCargaConsolidadorEstrang) {
        this.caixaPostalAgenteDeCargaConsolidadorEstrang = caixaPostalAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada caixaPostalAgenteDeCargaConsolidadorEstrang(String caixaPostalAgenteDeCargaConsolidadorEstrang) {
        this.caixaPostalAgenteDeCargaConsolidadorEstrang = caixaPostalAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    /**
     * Número do conhecimento&lt;br/&gt;Tamanho mínimo: 1&lt;br/&gt;Tamanho máximo: 35
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public ConhecimentoConsultaDetalhada identificacao(String identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Endereco do consignatário no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return enderecoConsignatarioConhecimento
     **/
    @JsonProperty("enderecoConsignatarioConhecimento")
    public String getEnderecoConsignatarioConhecimento() {
        return enderecoConsignatarioConhecimento;
    }

    public void setEnderecoConsignatarioConhecimento(String enderecoConsignatarioConhecimento) {
        this.enderecoConsignatarioConhecimento = enderecoConsignatarioConhecimento;
    }

    public ConhecimentoConsultaDetalhada enderecoConsignatarioConhecimento(String enderecoConsignatarioConhecimento) {
        this.enderecoConsignatarioConhecimento = enderecoConsignatarioConhecimento;
        return this;
    }

    /**
     * Endereco do embarcador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return enderecoEmbarcadorEstrangeiro
     **/
    @JsonProperty("enderecoEmbarcadorEstrangeiro")
    public String getEnderecoEmbarcadorEstrangeiro() {
        return enderecoEmbarcadorEstrangeiro;
    }

    public void setEnderecoEmbarcadorEstrangeiro(String enderecoEmbarcadorEstrangeiro) {
        this.enderecoEmbarcadorEstrangeiro = enderecoEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada enderecoEmbarcadorEstrangeiro(String enderecoEmbarcadorEstrangeiro) {
        this.enderecoEmbarcadorEstrangeiro = enderecoEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Endereço postal do embarcador estrangeiro no conhecimento de carga&lt;br/&gt;Tamanho máximo: 70
     *
     * @return caixaPostalEmbarcadorEstrangeiro
     **/
    @JsonProperty("caixaPostalEmbarcadorEstrangeiro")
    public String getCaixaPostalEmbarcadorEstrangeiro() {
        return caixaPostalEmbarcadorEstrangeiro;
    }

    public void setCaixaPostalEmbarcadorEstrangeiro(String caixaPostalEmbarcadorEstrangeiro) {
        this.caixaPostalEmbarcadorEstrangeiro = caixaPostalEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada caixaPostalEmbarcadorEstrangeiro(String caixaPostalEmbarcadorEstrangeiro) {
        this.caixaPostalEmbarcadorEstrangeiro = caixaPostalEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Descrição resumida das mercadorias que estão sendo transportadas&lt;br&gt;Tamanho: 600&lt;br/&gt;
     *
     * @return descricaoResumida
     **/
    @JsonProperty("descricaoResumida")
    public String getDescricaoResumida() {
        return descricaoResumida;
    }

    public void setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
    }

    public ConhecimentoConsultaDetalhada descricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
        return this;
    }

    /**
     * Local de emissao do XFWB pelo transportador&lt;br/&gt;Tamanho: 35&lt;br/&gt;
     *
     * @return localAssinaturaTransportador
     **/
    @JsonProperty("localAssinaturaTransportador")
    public String getLocalAssinaturaTransportador() {
        return localAssinaturaTransportador;
    }

    public void setLocalAssinaturaTransportador(String localAssinaturaTransportador) {
        this.localAssinaturaTransportador = localAssinaturaTransportador;
    }

    public ConhecimentoConsultaDetalhada localAssinaturaTransportador(String localAssinaturaTransportador) {
        this.localAssinaturaTransportador = localAssinaturaTransportador;
        return this;
    }

    /**
     * Nome do consignatário no documento&lt;br/&gt;Tamanho máximo: 70
     *
     * @return nomeDocumentoConsignatario
     **/
    @JsonProperty("nomeDocumentoConsignatario")
    public String getNomeDocumentoConsignatario() {
        return nomeDocumentoConsignatario;
    }

    public void setNomeDocumentoConsignatario(String nomeDocumentoConsignatario) {
        this.nomeDocumentoConsignatario = nomeDocumentoConsignatario;
    }

    public ConhecimentoConsultaDetalhada nomeDocumentoConsignatario(String nomeDocumentoConsignatario) {
        this.nomeDocumentoConsignatario = nomeDocumentoConsignatario;
        return this;
    }

    /**
     * Código IATA do aeroporto&lt;br/&gt;Tamanho: 3
     *
     * @return codigoAeroportoDestinoConhecimento
     **/
    @JsonProperty("codigoAeroportoDestinoConhecimento")
    public String getCodigoAeroportoDestinoConhecimento() {
        return codigoAeroportoDestinoConhecimento;
    }

    public void setCodigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
        this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
    }

    public ConhecimentoConsultaDetalhada codigoAeroportoDestinoConhecimento(String codigoAeroportoDestinoConhecimento) {
        this.codigoAeroportoDestinoConhecimento = codigoAeroportoDestinoConhecimento;
        return this;
    }

    /**
     * Nome do agente de carga consolidador estrangeiro&lt;br&gt;Tamanho: 70&lt;br/&gt;
     *
     * @return nomeAgenteDeCargaConsolidadorEstrang
     **/
    @JsonProperty("nomeAgenteDeCargaConsolidadorEstrang")
    public String getNomeAgenteDeCargaConsolidadorEstrang() {
        return nomeAgenteDeCargaConsolidadorEstrang;
    }

    public void setNomeAgenteDeCargaConsolidadorEstrang(String nomeAgenteDeCargaConsolidadorEstrang) {
        this.nomeAgenteDeCargaConsolidadorEstrang = nomeAgenteDeCargaConsolidadorEstrang;
    }

    public ConhecimentoConsultaDetalhada nomeAgenteDeCargaConsolidadorEstrang(String nomeAgenteDeCargaConsolidadorEstrang) {
        this.nomeAgenteDeCargaConsolidadorEstrang = nomeAgenteDeCargaConsolidadorEstrang;
        return this;
    }

    /**
     * Nome do responsável pelo embarque&lt;br&gt;Tamanho: 70&lt;br/&gt;
     *
     * @return nomeAssinaturaEmbarcadorEstrangeiro
     **/
    @JsonProperty("nomeAssinaturaEmbarcadorEstrangeiro")
    public String getNomeAssinaturaEmbarcadorEstrangeiro() {
        return nomeAssinaturaEmbarcadorEstrangeiro;
    }

    public void setNomeAssinaturaEmbarcadorEstrangeiro(String nomeAssinaturaEmbarcadorEstrangeiro) {
        this.nomeAssinaturaEmbarcadorEstrangeiro = nomeAssinaturaEmbarcadorEstrangeiro;
    }

    public ConhecimentoConsultaDetalhada nomeAssinaturaEmbarcadorEstrangeiro(String nomeAssinaturaEmbarcadorEstrangeiro) {
        this.nomeAssinaturaEmbarcadorEstrangeiro = nomeAssinaturaEmbarcadorEstrangeiro;
        return this;
    }

    /**
     * Assinatura transportador&lt;br/&gt;Tamanho: 35&lt;br/&gt;
     *
     * @return nomeAssinaturaTransportador
     **/
    @JsonProperty("nomeAssinaturaTransportador")
    public String getNomeAssinaturaTransportador() {
        return nomeAssinaturaTransportador;
    }

    public void setNomeAssinaturaTransportador(String nomeAssinaturaTransportador) {
        this.nomeAssinaturaTransportador = nomeAssinaturaTransportador;
    }

    public ConhecimentoConsultaDetalhada nomeAssinaturaTransportador(String nomeAssinaturaTransportador) {
        this.nomeAssinaturaTransportador = nomeAssinaturaTransportador;
        return this;
    }

    /**
     * Lista contendo as cargas HAWB&lt;br/&gt;
     *
     * @return hawbAssociados
     **/
    @JsonProperty("hawbAssociados")
    public List<HawbMawbAssociadoConsultaDetalhada> getHawbAssociados() {
        return hawbAssociados;
    }

    public void setHawbAssociados(List<HawbMawbAssociadoConsultaDetalhada> hawbAssociados) {
        this.hawbAssociados = hawbAssociados;
    }

    public ConhecimentoConsultaDetalhada hawbAssociados(List<HawbMawbAssociadoConsultaDetalhada> hawbAssociados) {
        this.hawbAssociados = hawbAssociados;
        return this;
    }

    public ConhecimentoConsultaDetalhada addHawbAssociadosItem(HawbMawbAssociadoConsultaDetalhada hawbAssociadosItem) {
        this.hawbAssociados.add(hawbAssociadosItem);
        return this;
    }

    /**
     * CNPJ do consignatário&lt;br/&gt;Tamanho: 14&lt;br/&gt;
     *
     * @return identificacaoDocumentoConsignatario
     **/
    @JsonProperty("identificacaoDocumentoConsignatario")
    public String getIdentificacaoDocumentoConsignatario() {
        return identificacaoDocumentoConsignatario;
    }

    public void setIdentificacaoDocumentoConsignatario(String identificacaoDocumentoConsignatario) {
        this.identificacaoDocumentoConsignatario = identificacaoDocumentoConsignatario;
    }

    public ConhecimentoConsultaDetalhada identificacaoDocumentoConsignatario(String identificacaoDocumentoConsignatario) {
        this.identificacaoDocumentoConsignatario = identificacaoDocumentoConsignatario;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConhecimentoConsultaDetalhada {\n" +
                "    cidadeAgenteDeCargaConsolidadorEstrang: " + toIndentedString(cidadeAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    ruc: " + toIndentedString(ruc) + "\n" +
                "    situacao: " + toIndentedString(situacao) + "\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    contatosEmbarcadorEstrangeiro: " + toIndentedString(contatosEmbarcadorEstrangeiro) + "\n" +
                "    itensCarga: " + toIndentedString(itensCarga) + "\n" +
                "    mawbAwbAssociados: " + toIndentedString(mawbAwbAssociados) + "\n" +
                "    enderecoAgenteDeCargaConsolidadorEstrang: " + toIndentedString(enderecoAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    cnpjResponsavelArquivo: " + toIndentedString(cnpjResponsavelArquivo) + "\n" +
                "    paisConsignatarioConhecimento: " + toIndentedString(paisConsignatarioConhecimento) + "\n" +
                "    indicadorPartesMadeira: " + toIndentedString(indicadorPartesMadeira) + "\n" +
                "    frete: " + toIndentedString(frete) + "\n" +
                "    viagensAssociadas: " + toIndentedString(viagensAssociadas) + "\n" +
                "    partesEstoque: " + toIndentedString(partesEstoque) + "\n" +
                "    pesoBrutoConhecimento: " + toIndentedString(pesoBrutoConhecimento) + "\n" +
                "    nomeEmbarcadorEstrangeiro: " + toIndentedString(nomeEmbarcadorEstrangeiro) + "\n" +
                "    nomeConsignatarioConhecimento: " + toIndentedString(nomeConsignatarioConhecimento) + "\n" +
                "    divergencias: " + toIndentedString(divergencias) + "\n" +
                "    dataHoraAssinaturaTransportador: " + toIndentedString(dataHoraAssinaturaTransportador) + "\n" +
                "    outrasInfosServico: " + toIndentedString(outrasInfosServico) + "\n" +
                "    tipoDocumentoConsignatario: " + toIndentedString(tipoDocumentoConsignatario) + "\n" +
                "    caixaPostalConsignatarioConhecimento: " + toIndentedString(caixaPostalConsignatarioConhecimento) + "\n" +
                "    dsicsApropriados: " + toIndentedString(dsicsApropriados) + "\n" +
                "    paisAgenteDeCargaConsolidadorEstrang: " + toIndentedString(paisAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    recintoAduaneiroDestino: " + toIndentedString(recintoAduaneiroDestino) + "\n" +
                "    chegadasTerrestres: " + toIndentedString(chegadasTerrestres) + "\n" +
                "    contatosConsignatarioConhecimento: " + toIndentedString(contatosConsignatarioConhecimento) + "\n" +
                "    quantidadeVolumesConhecimento: " + toIndentedString(quantidadeVolumesConhecimento) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    paisEmbarcadorEstrangeiro: " + toIndentedString(paisEmbarcadorEstrangeiro) + "\n" +
                "    categoriaCarga: " + toIndentedString(categoriaCarga) + "\n" +
                "    documentosSaida: " + toIndentedString(documentosSaida) + "\n" +
                "    bloqueiosBaixados: " + toIndentedString(bloqueiosBaixados) + "\n" +
                "    manuseiosEspeciais: " + toIndentedString(manuseiosEspeciais) + "\n" +
                "    solicitacoesServicosEspeciais: " + toIndentedString(solicitacoesServicosEspeciais) + "\n" +
                "    recepcoesComAvarias: " + toIndentedString(recepcoesComAvarias) + "\n" +
                "    cidadeConsignatarioConhecimento: " + toIndentedString(cidadeConsignatarioConhecimento) + "\n" +
                "    bloqueiosAtivos: " + toIndentedString(bloqueiosAtivos) + "\n" +
                "    codigoAeroportoOrigemConhecimento: " + toIndentedString(codigoAeroportoOrigemConhecimento) + "\n" +
                "    outrasPartesInteressadas: " + toIndentedString(outrasPartesInteressadas) + "\n" +
                "    contatosAgenteDeCargaConsolidadorEstrang: " + toIndentedString(contatosAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    cidadeEmbarcadorEstrangeiro: " + toIndentedString(cidadeEmbarcadorEstrangeiro) + "\n" +
                "    indicadorNaoRecepcaoHawbAssociados: " + toIndentedString(indicadorNaoRecepcaoHawbAssociados) + "\n" +
                "    razaoSocialDocumentoConsignatario: " + toIndentedString(razaoSocialDocumentoConsignatario) + "\n" +
                "    caixaPostalAgenteDeCargaConsolidadorEstrang: " + toIndentedString(caixaPostalAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    enderecoConsignatarioConhecimento: " + toIndentedString(enderecoConsignatarioConhecimento) + "\n" +
                "    enderecoEmbarcadorEstrangeiro: " + toIndentedString(enderecoEmbarcadorEstrangeiro) + "\n" +
                "    caixaPostalEmbarcadorEstrangeiro: " + toIndentedString(caixaPostalEmbarcadorEstrangeiro) + "\n" +
                "    descricaoResumida: " + toIndentedString(descricaoResumida) + "\n" +
                "    localAssinaturaTransportador: " + toIndentedString(localAssinaturaTransportador) + "\n" +
                "    nomeDocumentoConsignatario: " + toIndentedString(nomeDocumentoConsignatario) + "\n" +
                "    codigoAeroportoDestinoConhecimento: " + toIndentedString(codigoAeroportoDestinoConhecimento) + "\n" +
                "    nomeAgenteDeCargaConsolidadorEstrang: " + toIndentedString(nomeAgenteDeCargaConsolidadorEstrang) + "\n" +
                "    nomeAssinaturaEmbarcadorEstrangeiro: " + toIndentedString(nomeAssinaturaEmbarcadorEstrangeiro) + "\n" +
                "    nomeAssinaturaTransportador: " + toIndentedString(nomeAssinaturaTransportador) + "\n" +
                "    hawbAssociados: " + toIndentedString(hawbAssociados) + "\n" +
                "    identificacaoDocumentoConsignatario: " + toIndentedString(identificacaoDocumentoConsignatario) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "SituacaoEnum")
    @XmlEnum(String.class)
    public enum SituacaoEnum {

        @XmlEnumValue("A")
        @JsonProperty("A")
        A("A"),

        @XmlEnumValue("E")
        @JsonProperty("E")
        E("E");


        private final String value;

        SituacaoEnum(String v) {
            value = v;
        }

        public static SituacaoEnum fromValue(String v) {
            for (SituacaoEnum b : SituacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SituacaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoEnum")
    @XmlEnum(String.class)
    public enum TipoEnum {

        @XmlEnumValue("AWB")
        @JsonProperty("AWB")
        AWB("AWB"),

        @XmlEnumValue("DSIC")
        @JsonProperty("DSIC")
        DSIC("DSIC"),

        @XmlEnumValue("HAWB ou MAWB")
        @JsonProperty("HAWB ou MAWB")
        HAWB_OU_MAWB("HAWB ou MAWB");


        private final String value;

        TipoEnum(String v) {
            value = v;
        }

        public static TipoEnum fromValue(String v) {
            for (TipoEnum b : TipoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "IndicadorPartesMadeiraEnum")
    @XmlEnum(String.class)
    public enum IndicadorPartesMadeiraEnum {

        @XmlEnumValue("S")
        @JsonProperty("S")
        S("S"),

        @XmlEnumValue("N")
        @JsonProperty("N")
        N("N");


        private final String value;

        IndicadorPartesMadeiraEnum(String v) {
            value = v;
        }

        public static IndicadorPartesMadeiraEnum fromValue(String v) {
            for (IndicadorPartesMadeiraEnum b : IndicadorPartesMadeiraEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorPartesMadeiraEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDocumentoConsignatarioEnum")
    @XmlEnum(String.class)
    public enum TipoDocumentoConsignatarioEnum {

        @XmlEnumValue("CPF")
        @JsonProperty("CPF")
        CPF("CPF"),

        @XmlEnumValue("CNPJ")
        @JsonProperty("CNPJ")
        CNPJ("CNPJ"),

        @XmlEnumValue("PASSAPORTE")
        @JsonProperty("PASSAPORTE")
        PASSAPORTE("PASSAPORTE");


        private final String value;

        TipoDocumentoConsignatarioEnum(String v) {
            value = v;
        }

        public static TipoDocumentoConsignatarioEnum fromValue(String v) {
            for (TipoDocumentoConsignatarioEnum b : TipoDocumentoConsignatarioEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoConsignatarioEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    @XmlType(name = "CategoriaCargaEnum")
    @XmlEnum(String.class)
    public enum CategoriaCargaEnum {

        @XmlEnumValue("I")
        @JsonProperty("I")
        I("I"),

        @XmlEnumValue("E")
        @JsonProperty("E")
        E("E"),

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("N")
        @JsonProperty("N")
        N("N");


        private final String value;

        CategoriaCargaEnum(String v) {
            value = v;
        }

        public static CategoriaCargaEnum fromValue(String v) {
            for (CategoriaCargaEnum b : CategoriaCargaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CategoriaCargaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "IndicadorNaoRecepcaoHawbAssociadosEnum")
    @XmlEnum(String.class)
    public enum IndicadorNaoRecepcaoHawbAssociadosEnum {

        @XmlEnumValue("S")
        @JsonProperty("S")
        S("S"),

        @XmlEnumValue("N")
        @JsonProperty("N")
        N("N");


        private final String value;

        IndicadorNaoRecepcaoHawbAssociadosEnum(String v) {
            value = v;
        }

        public static IndicadorNaoRecepcaoHawbAssociadosEnum fromValue(String v) {
            for (IndicadorNaoRecepcaoHawbAssociadosEnum b : IndicadorNaoRecepcaoHawbAssociadosEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IndicadorNaoRecepcaoHawbAssociadosEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
