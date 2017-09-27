//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.09.27 às 10:27:17 AM BRT 
//


package br.gov.serpro.pucomex.cct;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.serpro.pucomex.cct package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OperacaoUnitizacao_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "operacaoUnitizacao");
    private final static QName _OperacaoDesunitizacao_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "operacaoDesunitizacao");
    private final static QName _TGranelTipoGranel_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "tipoGranel");
    private final static QName _TGranelQuantidade_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "quantidade");
    private final static QName _TGranelUnidademedida_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "unidademedida");
    private final static QName _TGranelTotal_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "total");
    private final static QName _TCargaSoltaVeiculoTipoEmbalagem_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "tipoEmbalagem");
    private final static QName _TDocumentoCargaManifestacaoNumeroRUC_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "numeroRUC");
    private final static QName _TDocumentoCargaManifestacaoGranel_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "granel");
    private final static QName _TDocumentoCargaManifestacaoCargaSoltaVeiculo_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "cargaSoltaVeiculo");
    private final static QName _TDocumentoCargaManifestacaoNumeroDUE_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "numeroDUE");
    private final static QName _DadosCargaNomeConsignatario_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "nomeConsignatario");
    private final static QName _DadosCargaPaisDestino_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "paisDestino");
    private final static QName _DadosCargaEnderecoConsignatario_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "enderecoConsignatario");
    private final static QName _DadosCargaDocumentos_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "documentos");
    private final static QName _DadosCargaConsignadoAOrdem_QNAME = new QName("http://www.pucomex.serpro.gov.br/cct", "consignadoAOrdem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.serpro.pucomex.cct
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotaFiscalEletronica }
     * 
     */
    public NotaFiscalEletronica createNotaFiscalEletronica() {
        return new NotaFiscalEletronica();
    }

    /**
     * Create an instance of {@link TConteiner }
     * 
     */
    public TConteiner createTConteiner() {
        return new TConteiner();
    }

    /**
     * Create an instance of {@link DadosCarga }
     * 
     */
    public DadosCarga createDadosCarga() {
        return new DadosCarga();
    }

    /**
     * Create an instance of {@link TDocumentoCargaManifestacao }
     * 
     */
    public TDocumentoCargaManifestacao createTDocumentoCargaManifestacao() {
        return new TDocumentoCargaManifestacao();
    }

    /**
     * Create an instance of {@link Conhecimento }
     * 
     */
    public Conhecimento createConhecimento() {
        return new Conhecimento();
    }

    /**
     * Create an instance of {@link Destinatario }
     * 
     */
    public Destinatario createDestinatario() {
        return new Destinatario();
    }

    /**
     * Create an instance of {@link Acondicionamento }
     * 
     */
    public Acondicionamento createAcondicionamento() {
        return new Acondicionamento();
    }

    /**
     * Create an instance of {@link Local }
     * 
     */
    public Local createLocal() {
        return new Local();
    }

    /**
     * Create an instance of {@link NotaFiscalFormulario }
     * 
     */
    public NotaFiscalFormulario createNotaFiscalFormulario() {
        return new NotaFiscalFormulario();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao }
     * 
     */
    public ManifestacaoExportacao createManifestacaoExportacao() {
        return new ManifestacaoExportacao();
    }

    /**
     * Create an instance of {@link EntregaDocumentoTransporte }
     * 
     */
    public EntregaDocumentoTransporte createEntregaDocumentoTransporte() {
        return new EntregaDocumentoTransporte();
    }

    /**
     * Create an instance of {@link OperacaoUnitizacao }
     * 
     */
    public OperacaoUnitizacao createOperacaoUnitizacao() {
        return new OperacaoUnitizacao();
    }

    /**
     * Create an instance of {@link EntregaConteiner }
     * 
     */
    public EntregaConteiner createEntregaConteiner() {
        return new EntregaConteiner();
    }

    /**
     * Create an instance of {@link RecepcaoNFE }
     * 
     */
    public RecepcaoNFE createRecepcaoNFE() {
        return new RecepcaoNFE();
    }

    /**
     * Create an instance of {@link OperacaoConsolidacao }
     * 
     */
    public OperacaoConsolidacao createOperacaoConsolidacao() {
        return new OperacaoConsolidacao();
    }

    /**
     * Create an instance of {@link RecepcaoConteiner }
     * 
     */
    public RecepcaoConteiner createRecepcaoConteiner() {
        return new RecepcaoConteiner();
    }

    /**
     * Create an instance of {@link RecepcaoNFF }
     * 
     */
    public RecepcaoNFF createRecepcaoNFF() {
        return new RecepcaoNFF();
    }

    /**
     * Create an instance of {@link RecepcaoDocumentoTransporte }
     * 
     */
    public RecepcaoDocumentoTransporte createRecepcaoDocumentoTransporte() {
        return new RecepcaoDocumentoTransporte();
    }

    /**
     * Create an instance of {@link OperacaoDesunitizacao }
     * 
     */
    public OperacaoDesunitizacao createOperacaoDesunitizacao() {
        return new OperacaoDesunitizacao();
    }

    /**
     * Create an instance of {@link Embalagens }
     * 
     */
    public Embalagens createEmbalagens() {
        return new Embalagens();
    }

    /**
     * Create an instance of {@link TEmbalagem }
     * 
     */
    public TEmbalagem createTEmbalagem() {
        return new TEmbalagem();
    }

    /**
     * Create an instance of {@link Graneis }
     * 
     */
    public Graneis createGraneis() {
        return new Graneis();
    }

    /**
     * Create an instance of {@link TGranel }
     * 
     */
    public TGranel createTGranel() {
        return new TGranel();
    }

    /**
     * Create an instance of {@link br.gov.serpro.pucomex.cct.CargaSoltaVeiculo }
     * 
     */
    public br.gov.serpro.pucomex.cct.CargaSoltaVeiculo createCargaSoltaVeiculo() {
        return new br.gov.serpro.pucomex.cct.CargaSoltaVeiculo();
    }

    /**
     * Create an instance of {@link TCargaSoltaVeiculo }
     * 
     */
    public TCargaSoltaVeiculo createTCargaSoltaVeiculo() {
        return new TCargaSoltaVeiculo();
    }

    /**
     * Create an instance of {@link RecepcoesDocumentoTransporte }
     * 
     */
    public RecepcoesDocumentoTransporte createRecepcoesDocumentoTransporte() {
        return new RecepcoesDocumentoTransporte();
    }

    /**
     * Create an instance of {@link Granel }
     * 
     */
    public Granel createGranel() {
        return new Granel();
    }

    /**
     * Create an instance of {@link CargasSoltasVeiculos }
     * 
     */
    public CargasSoltasVeiculos createCargasSoltasVeiculos() {
        return new CargasSoltasVeiculos();
    }

    /**
     * Create an instance of {@link TCargaSoltaVeiculoConsolidacao }
     * 
     */
    public TCargaSoltaVeiculoConsolidacao createTCargaSoltaVeiculoConsolidacao() {
        return new TCargaSoltaVeiculoConsolidacao();
    }

    /**
     * Create an instance of {@link Recebedor }
     * 
     */
    public Recebedor createRecebedor() {
        return new Recebedor();
    }

    /**
     * Create an instance of {@link RecepcoesDocumentoCarga }
     * 
     */
    public RecepcoesDocumentoCarga createRecepcoesDocumentoCarga() {
        return new RecepcoesDocumentoCarga();
    }

    /**
     * Create an instance of {@link RecepcaoDocumentoCarga }
     * 
     */
    public RecepcaoDocumentoCarga createRecepcaoDocumentoCarga() {
        return new RecepcaoDocumentoCarga();
    }

    /**
     * Create an instance of {@link br.gov.serpro.pucomex.cct.Conteineres }
     * 
     */
    public br.gov.serpro.pucomex.cct.Conteineres createConteineres() {
        return new br.gov.serpro.pucomex.cct.Conteineres();
    }

    /**
     * Create an instance of {@link Entregador }
     * 
     */
    public Entregador createEntregador() {
        return new Entregador();
    }

    /**
     * Create an instance of {@link RecepcoesNFF }
     * 
     */
    public RecepcoesNFF createRecepcoesNFF() {
        return new RecepcoesNFF();
    }

    /**
     * Create an instance of {@link RecepcoesConteineres }
     * 
     */
    public RecepcoesConteineres createRecepcoesConteineres() {
        return new RecepcoesConteineres();
    }

    /**
     * Create an instance of {@link DocumentosUnitizacao }
     * 
     */
    public DocumentosUnitizacao createDocumentosUnitizacao() {
        return new DocumentosUnitizacao();
    }

    /**
     * Create an instance of {@link TDocumentoCargaUnitizacao }
     * 
     */
    public TDocumentoCargaUnitizacao createTDocumentoCargaUnitizacao() {
        return new TDocumentoCargaUnitizacao();
    }

    /**
     * Create an instance of {@link OperacoesConsolidacao }
     * 
     */
    public OperacoesConsolidacao createOperacoesConsolidacao() {
        return new OperacoesConsolidacao();
    }

    /**
     * Create an instance of {@link RecepcoesNFE }
     * 
     */
    public RecepcoesNFE createRecepcoesNFE() {
        return new RecepcoesNFE();
    }

    /**
     * Create an instance of {@link EntregasConteineres }
     * 
     */
    public EntregasConteineres createEntregasConteineres() {
        return new EntregasConteineres();
    }

    /**
     * Create an instance of {@link br.gov.serpro.pucomex.cct.Documentos }
     * 
     */
    public br.gov.serpro.pucomex.cct.Documentos createDocumentos() {
        return new br.gov.serpro.pucomex.cct.Documentos();
    }

    /**
     * Create an instance of {@link TDocumentoCarga }
     * 
     */
    public TDocumentoCarga createTDocumentoCarga() {
        return new TDocumentoCarga();
    }

    /**
     * Create an instance of {@link EntregasDocumentoTransporte }
     * 
     */
    public EntregasDocumentoTransporte createEntregasDocumentoTransporte() {
        return new EntregasDocumentoTransporte();
    }

    /**
     * Create an instance of {@link ManifestacoesExportacao }
     * 
     */
    public ManifestacoesExportacao createManifestacoesExportacao() {
        return new ManifestacoesExportacao();
    }

    /**
     * Create an instance of {@link EntregasDocumentoCarga }
     * 
     */
    public EntregasDocumentoCarga createEntregasDocumentoCarga() {
        return new EntregasDocumentoCarga();
    }

    /**
     * Create an instance of {@link EntregaDocumentoCarga }
     * 
     */
    public EntregaDocumentoCarga createEntregaDocumentoCarga() {
        return new EntregaDocumentoCarga();
    }

    /**
     * Create an instance of {@link Conteiner }
     * 
     */
    public Conteiner createConteiner() {
        return new Conteiner();
    }

    /**
     * Create an instance of {@link ConteinerPesoBrutoExtend }
     * 
     */
    public ConteinerPesoBrutoExtend createConteinerPesoBrutoExtend() {
        return new ConteinerPesoBrutoExtend();
    }

    /**
     * Create an instance of {@link TConhecimentoCarga }
     * 
     */
    public TConhecimentoCarga createTConhecimentoCarga() {
        return new TConhecimentoCarga();
    }

    /**
     * Create an instance of {@link TDocumentoCargaConsolidacao }
     * 
     */
    public TDocumentoCargaConsolidacao createTDocumentoCargaConsolidacao() {
        return new TDocumentoCargaConsolidacao();
    }

    /**
     * Create an instance of {@link ItemNFF }
     * 
     */
    public ItemNFF createItemNFF() {
        return new ItemNFF();
    }

    /**
     * Create an instance of {@link Frete }
     * 
     */
    public Frete createFrete() {
        return new Frete();
    }

    /**
     * Create an instance of {@link DocumentoTransporte }
     * 
     */
    public DocumentoTransporte createDocumentoTransporte() {
        return new DocumentoTransporte();
    }

    /**
     * Create an instance of {@link TCargaSoltaVeiculoPesoBrutoExtend }
     * 
     */
    public TCargaSoltaVeiculoPesoBrutoExtend createTCargaSoltaVeiculoPesoBrutoExtend() {
        return new TCargaSoltaVeiculoPesoBrutoExtend();
    }

    /**
     * Create an instance of {@link TGranelPesoBrutoExtend }
     * 
     */
    public TGranelPesoBrutoExtend createTGranelPesoBrutoExtend() {
        return new TGranelPesoBrutoExtend();
    }

    /**
     * Create an instance of {@link Transportador }
     * 
     */
    public Transportador createTransportador() {
        return new Transportador();
    }

    /**
     * Create an instance of {@link IdentificacaoEmissor }
     * 
     */
    public IdentificacaoEmissor createIdentificacaoEmissor() {
        return new IdentificacaoEmissor();
    }

    /**
     * Create an instance of {@link TDesunitizacao }
     * 
     */
    public TDesunitizacao createTDesunitizacao() {
        return new TDesunitizacao();
    }

    /**
     * Create an instance of {@link TLocal }
     * 
     */
    public TLocal createTLocal() {
        return new TLocal();
    }

    /**
     * Create an instance of {@link ConteinerExtend }
     * 
     */
    public ConteinerExtend createConteinerExtend() {
        return new ConteinerExtend();
    }

    /**
     * Create an instance of {@link TUnitizacao }
     * 
     */
    public TUnitizacao createTUnitizacao() {
        return new TUnitizacao();
    }

    /**
     * Create an instance of {@link TLocalExtend }
     * 
     */
    public TLocalExtend createTLocalExtend() {
        return new TLocalExtend();
    }

    /**
     * Create an instance of {@link br.gov.serpro.pucomex.cct.Coordenadas }
     * 
     */
    public br.gov.serpro.pucomex.cct.Coordenadas createCoordenadas() {
        return new br.gov.serpro.pucomex.cct.Coordenadas();
    }

    /**
     * Create an instance of {@link TGranelManifestacao }
     * 
     */
    public TGranelManifestacao createTGranelManifestacao() {
        return new TGranelManifestacao();
    }

    /**
     * Create an instance of {@link NotaFiscalEletronica.Conteineres }
     * 
     */
    public NotaFiscalEletronica.Conteineres createNotaFiscalEletronicaConteineres() {
        return new NotaFiscalEletronica.Conteineres();
    }

    /**
     * Create an instance of {@link TConteiner.Lacres }
     * 
     */
    public TConteiner.Lacres createTConteinerLacres() {
        return new TConteiner.Lacres();
    }

    /**
     * Create an instance of {@link DadosCarga.Documentos }
     * 
     */
    public DadosCarga.Documentos createDadosCargaDocumentos() {
        return new DadosCarga.Documentos();
    }

    /**
     * Create an instance of {@link TDocumentoCargaManifestacao.CargaSoltaVeiculo }
     * 
     */
    public TDocumentoCargaManifestacao.CargaSoltaVeiculo createTDocumentoCargaManifestacaoCargaSoltaVeiculo() {
        return new TDocumentoCargaManifestacao.CargaSoltaVeiculo();
    }

    /**
     * Create an instance of {@link Conhecimento.Cargas }
     * 
     */
    public Conhecimento.Cargas createConhecimentoCargas() {
        return new Conhecimento.Cargas();
    }

    /**
     * Create an instance of {@link Destinatario.IdentificacaoEstrangeiro }
     * 
     */
    public Destinatario.IdentificacaoEstrangeiro createDestinatarioIdentificacaoEstrangeiro() {
        return new Destinatario.IdentificacaoEstrangeiro();
    }

    /**
     * Create an instance of {@link Acondicionamento.Conteineres }
     * 
     */
    public Acondicionamento.Conteineres createAcondicionamentoConteineres() {
        return new Acondicionamento.Conteineres();
    }

    /**
     * Create an instance of {@link Local.Coordenadas }
     * 
     */
    public Local.Coordenadas createLocalCoordenadas() {
        return new Local.Coordenadas();
    }

    /**
     * Create an instance of {@link NotaFiscalFormulario.Conteineres }
     * 
     */
    public NotaFiscalFormulario.Conteineres createNotaFiscalFormularioConteineres() {
        return new NotaFiscalFormulario.Conteineres();
    }

    /**
     * Create an instance of {@link NotaFiscalFormulario.ItensNFF }
     * 
     */
    public NotaFiscalFormulario.ItensNFF createNotaFiscalFormularioItensNFF() {
        return new NotaFiscalFormulario.ItensNFF();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao.VeiculoAereo }
     * 
     */
    public ManifestacaoExportacao.VeiculoAereo createManifestacaoExportacaoVeiculoAereo() {
        return new ManifestacaoExportacao.VeiculoAereo();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao.VeiculoAquaviario }
     * 
     */
    public ManifestacaoExportacao.VeiculoAquaviario createManifestacaoExportacaoVeiculoAquaviario() {
        return new ManifestacaoExportacao.VeiculoAquaviario();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao.OutroModal }
     * 
     */
    public ManifestacaoExportacao.OutroModal createManifestacaoExportacaoOutroModal() {
        return new ManifestacaoExportacao.OutroModal();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao.ConhecimentosCarga }
     * 
     */
    public ManifestacaoExportacao.ConhecimentosCarga createManifestacaoExportacaoConhecimentosCarga() {
        return new ManifestacaoExportacao.ConhecimentosCarga();
    }

    /**
     * Create an instance of {@link ManifestacaoExportacao.TransporteProprio }
     * 
     */
    public ManifestacaoExportacao.TransporteProprio createManifestacaoExportacaoTransporteProprio() {
        return new ManifestacaoExportacao.TransporteProprio();
    }

    /**
     * Create an instance of {@link EntregaDocumentoTransporte.DocumentosTransporte }
     * 
     */
    public EntregaDocumentoTransporte.DocumentosTransporte createEntregaDocumentoTransporteDocumentosTransporte() {
        return new EntregaDocumentoTransporte.DocumentosTransporte();
    }

    /**
     * Create an instance of {@link OperacaoUnitizacao.Unitizacoes }
     * 
     */
    public OperacaoUnitizacao.Unitizacoes createOperacaoUnitizacaoUnitizacoes() {
        return new OperacaoUnitizacao.Unitizacoes();
    }

    /**
     * Create an instance of {@link EntregaConteiner.Conteineres }
     * 
     */
    public EntregaConteiner.Conteineres createEntregaConteinerConteineres() {
        return new EntregaConteiner.Conteineres();
    }

    /**
     * Create an instance of {@link RecepcaoNFE.NotasFiscais }
     * 
     */
    public RecepcaoNFE.NotasFiscais createRecepcaoNFENotasFiscais() {
        return new RecepcaoNFE.NotasFiscais();
    }

    /**
     * Create an instance of {@link OperacaoConsolidacao.DocumentosConsolidacao }
     * 
     */
    public OperacaoConsolidacao.DocumentosConsolidacao createOperacaoConsolidacaoDocumentosConsolidacao() {
        return new OperacaoConsolidacao.DocumentosConsolidacao();
    }

    /**
     * Create an instance of {@link RecepcaoConteiner.Conteineres }
     * 
     */
    public RecepcaoConteiner.Conteineres createRecepcaoConteinerConteineres() {
        return new RecepcaoConteiner.Conteineres();
    }

    /**
     * Create an instance of {@link RecepcaoNFF.NotasFiscais }
     * 
     */
    public RecepcaoNFF.NotasFiscais createRecepcaoNFFNotasFiscais() {
        return new RecepcaoNFF.NotasFiscais();
    }

    /**
     * Create an instance of {@link RecepcaoDocumentoTransporte.DocumentosTransporte }
     * 
     */
    public RecepcaoDocumentoTransporte.DocumentosTransporte createRecepcaoDocumentoTransporteDocumentosTransporte() {
        return new RecepcaoDocumentoTransporte.DocumentosTransporte();
    }

    /**
     * Create an instance of {@link OperacaoDesunitizacao.Desunitizacoes }
     * 
     */
    public OperacaoDesunitizacao.Desunitizacoes createOperacaoDesunitizacaoDesunitizacoes() {
        return new OperacaoDesunitizacao.Desunitizacoes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoUnitizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "operacaoUnitizacao")
    public JAXBElement<OperacaoUnitizacao> createOperacaoUnitizacao(OperacaoUnitizacao value) {
        return new JAXBElement<OperacaoUnitizacao>(_OperacaoUnitizacao_QNAME, OperacaoUnitizacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacaoDesunitizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "operacaoDesunitizacao")
    public JAXBElement<OperacaoDesunitizacao> createOperacaoDesunitizacao(OperacaoDesunitizacao value) {
        return new JAXBElement<OperacaoDesunitizacao>(_OperacaoDesunitizacao_QNAME, OperacaoDesunitizacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "tipoGranel", scope = TGranel.class)
    public JAXBElement<String> createTGranelTipoGranel(String value) {
        return new JAXBElement<String>(_TGranelTipoGranel_QNAME, String.class, TGranel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "quantidade", scope = TGranel.class)
    public JAXBElement<BigDecimal> createTGranelQuantidade(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TGranelQuantidade_QNAME, BigDecimal.class, TGranel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadeMedida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "unidademedida", scope = TGranel.class)
    public JAXBElement<UnidadeMedida> createTGranelUnidademedida(UnidadeMedida value) {
        return new JAXBElement<UnidadeMedida>(_TGranelUnidademedida_QNAME, UnidadeMedida.class, TGranel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "total", scope = TGranel.class)
    public JAXBElement<BigDecimal> createTGranelTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TGranelTotal_QNAME, BigDecimal.class, TGranel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "quantidade", scope = TCargaSoltaVeiculo.class)
    public JAXBElement<BigInteger> createTCargaSoltaVeiculoQuantidade(BigInteger value) {
        return new JAXBElement<BigInteger>(_TGranelQuantidade_QNAME, BigInteger.class, TCargaSoltaVeiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "total", scope = TCargaSoltaVeiculo.class)
    public JAXBElement<BigInteger> createTCargaSoltaVeiculoTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_TGranelTotal_QNAME, BigInteger.class, TCargaSoltaVeiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "tipoEmbalagem", scope = TCargaSoltaVeiculo.class)
    public JAXBElement<String> createTCargaSoltaVeiculoTipoEmbalagem(String value) {
        return new JAXBElement<String>(_TCargaSoltaVeiculoTipoEmbalagem_QNAME, String.class, TCargaSoltaVeiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "numeroRUC", scope = TDocumentoCargaManifestacao.class)
    public JAXBElement<String> createTDocumentoCargaManifestacaoNumeroRUC(String value) {
        return new JAXBElement<String>(_TDocumentoCargaManifestacaoNumeroRUC_QNAME, String.class, TDocumentoCargaManifestacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGranelManifestacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "granel", scope = TDocumentoCargaManifestacao.class)
    public JAXBElement<TGranelManifestacao> createTDocumentoCargaManifestacaoGranel(TGranelManifestacao value) {
        return new JAXBElement<TGranelManifestacao>(_TDocumentoCargaManifestacaoGranel_QNAME, TGranelManifestacao.class, TDocumentoCargaManifestacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDocumentoCargaManifestacao.CargaSoltaVeiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "cargaSoltaVeiculo", scope = TDocumentoCargaManifestacao.class)
    public JAXBElement<TDocumentoCargaManifestacao.CargaSoltaVeiculo> createTDocumentoCargaManifestacaoCargaSoltaVeiculo(TDocumentoCargaManifestacao.CargaSoltaVeiculo value) {
        return new JAXBElement<TDocumentoCargaManifestacao.CargaSoltaVeiculo>(_TDocumentoCargaManifestacaoCargaSoltaVeiculo_QNAME, TDocumentoCargaManifestacao.CargaSoltaVeiculo.class, TDocumentoCargaManifestacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "numeroDUE", scope = TDocumentoCargaManifestacao.class)
    public JAXBElement<String> createTDocumentoCargaManifestacaoNumeroDUE(String value) {
        return new JAXBElement<String>(_TDocumentoCargaManifestacaoNumeroDUE_QNAME, String.class, TDocumentoCargaManifestacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "numeroRUC", scope = TDocumentoCarga.class)
    public JAXBElement<String> createTDocumentoCargaNumeroRUC(String value) {
        return new JAXBElement<String>(_TDocumentoCargaManifestacaoNumeroRUC_QNAME, String.class, TDocumentoCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "numeroDUE", scope = TDocumentoCarga.class)
    public JAXBElement<String> createTDocumentoCargaNumeroDUE(String value) {
        return new JAXBElement<String>(_TDocumentoCargaManifestacaoNumeroDUE_QNAME, String.class, TDocumentoCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "nomeConsignatario", scope = DadosCarga.class)
    public JAXBElement<String> createDadosCargaNomeConsignatario(String value) {
        return new JAXBElement<String>(_DadosCargaNomeConsignatario_QNAME, String.class, DadosCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "paisDestino", scope = DadosCarga.class)
    public JAXBElement<String> createDadosCargaPaisDestino(String value) {
        return new JAXBElement<String>(_DadosCargaPaisDestino_QNAME, String.class, DadosCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "enderecoConsignatario", scope = DadosCarga.class)
    public JAXBElement<String> createDadosCargaEnderecoConsignatario(String value) {
        return new JAXBElement<String>(_DadosCargaEnderecoConsignatario_QNAME, String.class, DadosCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosCarga.Documentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "documentos", scope = DadosCarga.class)
    public JAXBElement<DadosCarga.Documentos> createDadosCargaDocumentos(DadosCarga.Documentos value) {
        return new JAXBElement<DadosCarga.Documentos>(_DadosCargaDocumentos_QNAME, DadosCarga.Documentos.class, DadosCarga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pucomex.serpro.gov.br/cct", name = "consignadoAOrdem", scope = DadosCarga.class)
    public JAXBElement<String> createDadosCargaConsignadoAOrdem(String value) {
        return new JAXBElement<String>(_DadosCargaConsignadoAOrdem_QNAME, String.class, DadosCarga.class, value);
    }

}
