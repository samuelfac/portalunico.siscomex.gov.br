package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestoCrt", propOrder =
        {"bairroConsignatario", "bairroDestinatario", "bairroParteNotificarEstrangeiro", "bairroRemetente", "cidadeConsignatario", "cidadeDestinatario", "cidadeEmissao", "cidadeEntrega", "cidadeParteNotificarEstrangeiro", "cidadeRemetente", "cidadeTranspResponsMercadoria", "codigoPostalConsignatario", "codigoPostalDestinatario", "codigoPostalParteNotificarEstrangeiro", "codigoPostalRemetente", "dataEmissao", "dataHoraAssinaturaDestinatario", "dataHoraAssinaturaRemetente", "dataHoraTranspResponsMercadoria", "declaracaoObservacao", "destinatarioNacBrasileira", "documentosApresentados", "emailParteNotificar", "estadoConsignatario", "estadoDestinatario", "estadoParteNotificarEstrangeiro", "estadoRemetente", "idFiscalConsignatario", "idFiscalDestinatario", "idFiscalParteNotificar", "idFiscalRemetente", "identificacaoCrt", "identificacaoRepresentanteTransportadorEstrangeiro", "identificacaoTransportadorEstrangeiro", "identificacaoTransportadorNacional", "inConsignatarioNacBrasileira", "inParteNotificarNacBrasileira", "incotermLocalEmbarque", "instrucaoFormalidadeAlfandega", "itensCRT", "licencaComplementarTransportador", "licencaOriginariaTransportador", "localAssinaturaDestinatario", "localAssinaturaRemetente", "manuseiosEspeciaisCarga", "mercadorias", "moedaFreteDestinatario", "moedaFreteExterno", "moedaFreteRemetente", "moedaMercadoriaDeclaradoRemetente", "moedaMercadoriaLocalEmbarque", "moedaOutrosCustosDestinatario", "moedaOutrosCustosRemetente", "moedaReembolso", "moedaSeguroDestinatario", "moedaSeguroRemetente", "nomeAssinaturaDestinatario", "nomeAssinaturaRemetente", "nomeAssinaturaTransportador", "nomeConsignatario", "nomeDestinatario", "nomeParteNotificarEstrangeiro", "nomeRemetente", "nomeTransportadorEstrangeiro", "paisConsignatario", "paisDestinatario", "paisEmissao", "paisEntrega", "paisOrigemMercadoria", "paisParteNotificarEstrangeiro", "paisRemetente", "paisTranspResponsMercadoria", "pesoBrutoKg", "prazoEntrega", "ruaConsignatario", "ruaDestinatario", "ruaParteNotificarEstrangeiro", "ruaRemetente", "ruc", "telefoneParteNotificar", "tipoDocIdFiscalConsignatario", "tipoDocIdFiscalParteNotificar", "tipoItemCRT", "tipoTransporteTransportador", "transportadorNacBrasileira", "transportadoresSucessivos", "valorFreteDestinatario", "valorFreteExterno", "valorFreteRemetente", "valorMercadoriaDeclaradoRemetente", "valorMercadoriaLocalEmbarque", "valorOutrosCustosDestinatario", "valorOutrosCustosRemetente", "valorReembolso", "valorSeguroDestinatario", "valorSeguroRemetente", "visualizacaoDepositario", "volumeM3"
        })

@XmlRootElement(name = "ManifestoCrt")
public class ManifestoCrt {

    @XmlElement(name = "bairroConsignatario")
    @ApiModelProperty(value = "Nome do bairro do consignatário  estrangeiro<br/> Tamanho Máximo: 50")
    /**
     * Nome do bairro do consignatário  estrangeiro<br/> Tamanho Máximo: 50
     **/
    private String bairroConsignatario = null;

    @XmlElement(name = "bairroDestinatario")
    @ApiModelProperty(value = "Nome do bairro do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Nome do bairro do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 50
     **/
    private String bairroDestinatario = null;

    @XmlElement(name = "bairroParteNotificarEstrangeiro")
    @ApiModelProperty(value = "Bairro da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 50")
    /**
     * Bairro da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 50
     **/
    private String bairroParteNotificarEstrangeiro = null;

    @XmlElement(name = "bairroRemetente", required = true)
    @ApiModelProperty(required = true, value = "Nome do bairro do remetente da carga<br/> Tamanho Máximo: 50")
    /**
     * Nome do bairro do remetente da carga<br/> Tamanho Máximo: 50
     **/
    private String bairroRemetente = null;

    @XmlElement(name = "cidadeConsignatario")
    @ApiModelProperty(example = "BRRIO", value = "Código LOCODE da cidade do consignatário  estrangeiro<br/> Tamanho Máximo: 5")
    /**
     * Código LOCODE da cidade do consignatário  estrangeiro<br/> Tamanho Máximo: 5
     **/
    private String cidadeConsignatario = null;

    @XmlElement(name = "cidadeDestinatario")
    @ApiModelProperty(example = "BRRIO", value = "Código Locode  da cidade do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Formato: AAAAA")
    /**
     * Código Locode  da cidade do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Formato: AAAAA
     **/
    private String cidadeDestinatario = null;

    @XmlElement(name = "cidadeEmissao", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "Código locode da cidade de emissão do CRT<br/> Formato: AAAAA")
    /**
     * Código locode da cidade de emissão do CRT<br/> Formato: AAAAA
     **/
    private String cidadeEmissao = null;

    @XmlElement(name = "cidadeEntrega", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "código locode da cidade de entrega da carga<br/> Formato: AAAAA")
    /**
     * código locode da cidade de entrega da carga<br/> Formato: AAAAA
     **/
    private String cidadeEntrega = null;

    @XmlElement(name = "cidadeParteNotificarEstrangeiro")
    @ApiModelProperty(example = "BRRIO", value = "Código locode da Cidade da parte a notificar , quando estrangeiro<br/> Formato: AAAAA")
    /**
     * Código locode da Cidade da parte a notificar , quando estrangeiro<br/> Formato: AAAAA
     **/
    private String cidadeParteNotificarEstrangeiro = null;

    @XmlElement(name = "cidadeRemetente", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "Código Locode  da cidade do remetente da carga<br/> Formato: AAAAA")
    /**
     * Código Locode  da cidade do remetente da carga<br/> Formato: AAAAA
     **/
    private String cidadeRemetente = null;

    @XmlElement(name = "cidadeTranspResponsMercadoria", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "Código locode da cidade em que o transportador se responsabiliza pela mercadoria<br/> Formato: AAAAA")
    /**
     * Código locode da cidade em que o transportador se responsabiliza pela mercadoria<br/> Formato: AAAAA
     **/
    private String cidadeTranspResponsMercadoria = null;

    @XmlElement(name = "codigoPostalConsignatario")
    @ApiModelProperty(example = "01001000", value = "Código postal do endereço do consignatário  estrangeiro<br/> Tamanho Máximo: 8")
    /**
     * Código postal do endereço do consignatário  estrangeiro<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalConsignatario = null;

    @XmlElement(name = "codigoPostalDestinatario")
    @ApiModelProperty(example = "01001000", value = "Código postal do endereço do destinatário da cargaObrigatorio para destinatário brasileiro (\"destinatarioNacBrasileira\" = true)<br/> Tamanho Máximo: 8")
    /**
     * Código postal do endereço do destinatário da cargaObrigatorio para destinatário brasileiro (\"destinatarioNacBrasileira\" = true)<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalDestinatario = null;

    @XmlElement(name = "codigoPostalParteNotificarEstrangeiro")
    @ApiModelProperty(example = "01001000", value = "Código postal da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 8")
    /**
     * Código postal da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalParteNotificarEstrangeiro = null;

    @XmlElement(name = "codigoPostalRemetente", required = true)
    @ApiModelProperty(example = "01001000", required = true, value = "Código postal do endereço do remetente da carga<br/> Tamanho Máximo: 8")
    /**
     * Código postal do endereço do remetente da carga<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalRemetente = null;

    @XmlElement(name = "dataEmissao", required = true)
    @ApiModelProperty(example = "20240524153452-03", required = true, value = "Data de emissão do conhecimento<br/>A data de emissão não pode ser anterior à Data de Implantação do sistema CCT rodoviário menos um mês.  <br/>A data de emissão não pode ser posterior à data atual<br/>(utilizar como chave junto com numero do CRT apenas a a data AAAAMMDD<br/>Formato: yyyyMMddHHmmssZ")
    /**
     * Data de emissão do conhecimento<br/>A data de emissão não pode ser anterior à Data de Implantação do sistema CCT rodoviário menos um mês.  <br/>A data de emissão não pode ser posterior à data atual<br/>(utilizar como chave junto com numero do CRT apenas a a data AAAAMMDD<br/>Formato: yyyyMMddHHmmssZ
     **/
    private String dataEmissao = null;

    @XmlElement(name = "dataHoraAssinaturaDestinatario")
    @ApiModelProperty(value = "Data/Hora que o destinatário assinou o documento<br/>Formato: yyyyMMddHHmmssZ")
    /**
     * Data/Hora que o destinatário assinou o documento<br/>Formato: yyyyMMddHHmmssZ
     **/
    private String dataHoraAssinaturaDestinatario = null;

    @XmlElement(name = "dataHoraAssinaturaRemetente")
    @ApiModelProperty(value = "Data/Hora que o remetente assinou o documento<br/>Formato: yyyyMMddHHmmssZ")
    /**
     * Data/Hora que o remetente assinou o documento<br/>Formato: yyyyMMddHHmmssZ
     **/
    private String dataHoraAssinaturaRemetente = null;

    @XmlElement(name = "dataHoraTranspResponsMercadoria", required = true)
    @ApiModelProperty(example = "20240524153452-03", required = true, value = "Data/Hora em que o transportador se responsabiliza pela mercadoria<br/>Formato: yyyyMMddHHmmssZ")
    /**
     * Data/Hora em que o transportador se responsabiliza pela mercadoria<br/>Formato: yyyyMMddHHmmssZ
     **/
    private String dataHoraTranspResponsMercadoria = null;

    @XmlElement(name = "declaracaoObservacao", required = true)
    @ApiModelProperty(required = true, value = "Qualquer declaração, observação ou instrução relativo ao transporte<br/> Tamanho Máximo: 500")
    /**
     * Qualquer declaração, observação ou instrução relativo ao transporte<br/> Tamanho Máximo: 500
     **/
    private String declaracaoObservacao = null;

    @XmlElement(name = "destinatarioNacBrasileira", required = true)
    @ApiModelProperty(required = true, value = "Indicador se o destinatário da carga é brasileiro")
    /**
     * Indicador se o destinatário da carga é brasileiro
     **/
    private Boolean destinatarioNacBrasileira = null;

    @XmlElement(name = "documentosApresentados")
    @ApiModelProperty(value = "")
    @Valid
    private List<DocumentoApresentado> documentosApresentados = null;

    @XmlElement(name = "emailParteNotificar")
    @ApiModelProperty(example = "nome.do.parte.a.notificar@cbaidiomas.com", value = "E-mail da parte a notificar<br/>Precisar ter formato de email valido<br/> Tamanho Máximo: 100")
    /**
     * E-mail da parte a notificar<br/>Precisar ter formato de email valido<br/> Tamanho Máximo: 100
     **/
    private String emailParteNotificar = null;

    @XmlElement(name = "estadoConsignatario")
    @ApiModelProperty(value = "Nome do estado do endereço do consignatário  estrangeiro<br/> Tamanho Máximo: 50")
    /**
     * Nome do estado do endereço do consignatário  estrangeiro<br/> Tamanho Máximo: 50
     **/
    private String estadoConsignatario = null;

    @XmlElement(name = "estadoDestinatario")
    @ApiModelProperty(value = "Nome do estado do endereço do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Nome do estado do endereço do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 50
     **/
    private String estadoDestinatario = null;

    @XmlElement(name = "estadoParteNotificarEstrangeiro")
    @ApiModelProperty(value = "Estado da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 50")
    /**
     * Estado da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 50
     **/
    private String estadoParteNotificarEstrangeiro = null;

    @XmlElement(name = "estadoRemetente", required = true)
    @ApiModelProperty(required = true, value = "Nome do estado ou província do remetente<br/> Tamanho Máximo: 50")
    /**
     * Nome do estado ou província do remetente<br/> Tamanho Máximo: 50
     **/
    private String estadoRemetente = null;

    @XmlElement(name = "idFiscalConsignatario", required = true)
    @ApiModelProperty(example = "00000000000191", required = true, value = "Identificação fiscal do consignatário da carga<br/>quando \"idTipoDocumentoConsignatario\"  for \"F\" ou \"J\" deverá estar ativo no cadastro de CPF/CNPJ<br/> Tamanho Máximo: 35")
    /**
     * Identificação fiscal do consignatário da carga<br/>quando \"idTipoDocumentoConsignatario\"  for \"F\" ou \"J\" deverá estar ativo no cadastro de CPF/CNPJ<br/> Tamanho Máximo: 35
     **/
    private String idFiscalConsignatario = null;

    @XmlElement(name = "idFiscalDestinatario", required = true)
    @ApiModelProperty(example = "00000000000191", required = true, value = "Identificação do destinatário da carga<br/> Tamanho Máximo: 20")
    /**
     * Identificação do destinatário da carga<br/> Tamanho Máximo: 20
     **/
    private String idFiscalDestinatario = null;

    @XmlElement(name = "idFiscalParteNotificar")
    @ApiModelProperty(example = "00000000000191", value = "Identificação fiscal da parte a notificar<br/> Tamanho Máximo: 20")
    /**
     * Identificação fiscal da parte a notificar<br/> Tamanho Máximo: 20
     **/
    private String idFiscalParteNotificar = null;

    @XmlElement(name = "idFiscalRemetente", required = true)
    @ApiModelProperty(example = "00000000000191", required = true, value = "Identificação fiscal do remetente da carga<br/> Tamanho Máximo: 20")
    /**
     * Identificação fiscal do remetente da carga<br/> Tamanho Máximo: 20
     **/
    private String idFiscalRemetente = null;

    @XmlElement(name = "identificacaoCrt", required = true)
    @ApiModelProperty(example = "UY172911152", required = true, value = "Identificação da carga<br/>Se \"paisRemetente\"  for ATIT (*1) , o formato é AAXXXXXXXXX, em que AA = \"paisRemetente\"<br/>Se \"paisRemetente\"  não for ATIT, campo de texto livre.<br/>Não pode haver outra carga com a mesma chave \"identificacaoCrt\"+\"dataEmissao\"<br/> Tamanho Máximo: 15")
    /**
     * Identificação da carga<br/>Se \"paisRemetente\"  for ATIT (*1) , o formato é AAXXXXXXXXX, em que AA = \"paisRemetente\"<br/>Se \"paisRemetente\"  não for ATIT, campo de texto livre.<br/>Não pode haver outra carga com a mesma chave \"identificacaoCrt\"+\"dataEmissao\"<br/> Tamanho Máximo: 15
     **/
    private String identificacaoCrt = null;

    @XmlElement(name = "identificacaoRepresentanteTransportadorEstrangeiro")
    @ApiModelProperty(example = "00000000000191", value = "CPF/CNPJ do representante do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14")
    /**
     * CPF/CNPJ do representante do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14
     **/
    private String identificacaoRepresentanteTransportadorEstrangeiro = null;

    @XmlElement(name = "identificacaoTransportadorEstrangeiro")
    @ApiModelProperty(value = "Identificacao do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento.<br/> Tamanho Máximo: 20")
    /**
     * Identificacao do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento.<br/> Tamanho Máximo: 20
     **/
    private String identificacaoTransportadorEstrangeiro = null;

    @XmlElement(name = "identificacaoTransportadorNacional")
    @ApiModelProperty(example = "00000000000191", value = "Identificação do transportador Nacional<br/>Se campo transportadorNacBrasileira  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.<br/> Tamanho: 14")
    /**
     * Identificação do transportador Nacional<br/>Se campo transportadorNacBrasileira  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.<br/> Tamanho: 14
     **/
    private String identificacaoTransportadorNacional = null;

    @XmlElement(name = "inConsignatarioNacBrasileira")
    @ApiModelProperty(value = "Indicador do consignatário é brasileiro")
    /**
     * Indicador do consignatário é brasileiro
     **/
    private Boolean inConsignatarioNacBrasileira = null;

    @XmlElement(name = "inParteNotificarNacBrasileira")
    @ApiModelProperty(value = "Indicador se a parte a notificar da carga é brasileiro")
    /**
     * Indicador se a parte a notificar da carga é brasileiro
     **/
    private Boolean inParteNotificarNacBrasileira = null;
    @XmlElement(name = "incotermLocalEmbarque", required = true)
    @ApiModelProperty(example = "FCA", required = true, value = "Incoterms do valor: tipos FCA ou EX<br/> Tamanho: 3")
    /**
     * Incoterms do valor: tipos FCA ou EX<br/> Tamanho: 3
     **/
    private IncotermLocalEmbarqueEnum incotermLocalEmbarque = null;
    @XmlElement(name = "instrucaoFormalidadeAlfandega", required = true)
    @ApiModelProperty(required = true, value = "Instruções sobre formalidades de alfândega<br/> Tamanho Máximo: 500")
    /**
     * Instruções sobre formalidades de alfândega<br/> Tamanho Máximo: 500
     **/
    private String instrucaoFormalidadeAlfandega = null;
    @XmlElement(name = "itensCRT")
    @ApiModelProperty(value = "")
    @Valid
    private List<ItemCrt> itensCRT = null;
    @XmlElement(name = "licencaComplementarTransportador")
    @ApiModelProperty(example = "123424.0", value = "Licença Complementar do Transportador Estrangeiro<br/>Se tipoTransporteTransportador = \"REG\" e campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/> Tamanho Máximo: 6")
    @Valid
    /**
     * Licença Complementar do Transportador Estrangeiro<br/>Se tipoTransporteTransportador = \"REG\" e campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/> Tamanho Máximo: 6
     **/
    private BigDecimal licencaComplementarTransportador = null;
    @XmlElement(name = "licencaOriginariaTransportador")
    @ApiModelProperty(example = "123424.0", value = "Licença Originária do Transportador Nacional<br/>Se tipoTransporteTransportador = \"REG\" e campo transportadorNacBrasileira  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento desse campo<br/> Tamanho Máximo: 6")
    @Valid
    /**
     * Licença Originária do Transportador Nacional<br/>Se tipoTransporteTransportador = \"REG\" e campo transportadorNacBrasileira  igual a \"true\" ( Transportador Nacional) é obrigatório o preenchimento desse campo<br/> Tamanho Máximo: 6
     **/
    private BigDecimal licencaOriginariaTransportador = null;
    @XmlElement(name = "localAssinaturaDestinatario")
    @ApiModelProperty(value = "Local de assinatura do destinatário<br/> Tamanho Máximo: 35")
    /**
     * Local de assinatura do destinatário<br/> Tamanho Máximo: 35
     **/
    private String localAssinaturaDestinatario = null;
    @XmlElement(name = "manuseiosEspeciaisCarga")
    @ApiModelProperty(value = "")
    @Valid
    private List<ManuseioEspecialCarga> manuseiosEspeciaisCarga = null;

    @XmlElement(name = "localAssinaturaRemetente")
    @ApiModelProperty(value = "Local de assinatura do remetente<br/> Tamanho Máximo: 35")
    /**
     * Local de assinatura do remetente<br/> Tamanho Máximo: 35
     **/
    private String localAssinaturaRemetente = null;
    @XmlElement(name = "mercadorias")
    @ApiModelProperty(value = "")
    @Valid
    private List<Mercadoria> mercadorias = null;
    @XmlElement(name = "moedaFreteDestinatario")
    @ApiModelProperty(example = "220", value = "Código da moeda do frete da mercadoria do destinatário<br/>Formato: AAA")
    /**
     * Código da moeda do frete da mercadoria do destinatário<br/>Formato: AAA
     **/
    private String moedaFreteDestinatario = null;
    @XmlElement(name = "moedaFreteRemetente")
    @ApiModelProperty(example = "220", value = "Código da moeda do frete da mercadoria do remetente<br/>Formato: AAA")
    /**
     * Código da moeda do frete da mercadoria do remetente<br/>Formato: AAA
     **/
    private String moedaFreteRemetente = null;

    @XmlElement(name = "moedaFreteExterno", required = true)
    @ApiModelProperty(example = "220", required = true, value = "Código da moeda do frete externo da mercadoria<br/>Formato: AAA")
    /**
     * Código da moeda do frete externo da mercadoria<br/>Formato: AAA
     **/
    private String moedaFreteExterno = null;
    @XmlElement(name = "moedaMercadoriaLocalEmbarque", required = true)
    @ApiModelProperty(example = "220", required = true, value = "Código da moeda do valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga<br/>Formato: AAA")
    /**
     * Código da moeda do valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga<br/>Formato: AAA
     **/
    private String moedaMercadoriaLocalEmbarque = null;

    @XmlElement(name = "moedaMercadoriaDeclaradoRemetente")
    @ApiModelProperty(example = "220", value = "Código da moeda do valor das mercadorias declarado pelo remetente<br/>Formato: AAA")
    /**
     * Código da moeda do valor das mercadorias declarado pelo remetente<br/>Formato: AAA
     **/
    private String moedaMercadoriaDeclaradoRemetente = null;
    @XmlElement(name = "moedaOutrosCustosDestinatario")
    @ApiModelProperty(example = "220", value = "Código da moeda de outros custos do destinatario<br/>Formato: AAA")
    /**
     * Código da moeda de outros custos do destinatario<br/>Formato: AAA
     **/
    private String moedaOutrosCustosDestinatario = null;
    @XmlElement(name = "moedaOutrosCustosRemetente")
    @ApiModelProperty(example = "220", value = "Código da moeda de outros custos do remetente<br/>Formato: AAA")
    /**
     * Código da moeda de outros custos do remetente<br/>Formato: AAA
     **/
    private String moedaOutrosCustosRemetente = null;
    @XmlElement(name = "moedaReembolso")
    @ApiModelProperty(example = "220", value = "Código da moeda do reembolso da mercadoria - contra entrega<br/>Formato: AAA")
    /**
     * Código da moeda do reembolso da mercadoria - contra entrega<br/>Formato: AAA
     **/
    private String moedaReembolso = null;
    @XmlElement(name = "moedaSeguroDestinatario")
    @ApiModelProperty(example = "220", value = "Código da moeda do seguro da mercadoria do destinatário<br/>Formato: AAA")
    /**
     * Código da moeda do seguro da mercadoria do destinatário<br/>Formato: AAA
     **/
    private String moedaSeguroDestinatario = null;
    @XmlElement(name = "nomeAssinaturaDestinatario")
    @ApiModelProperty(value = "Nome do destinatário que assinou o documento<br/> Tamanho Máximo: 35")
    /**
     * Nome do destinatário que assinou o documento<br/> Tamanho Máximo: 35
     **/
    private String nomeAssinaturaDestinatario = null;

    @XmlElement(name = "moedaSeguroRemetente")
    @ApiModelProperty(example = "220", value = "Código da moeda do seguro da mercadoria do remetente<br/>Formato: AAA")
    /**
     * Código da moeda do seguro da mercadoria do remetente<br/>Formato: AAA
     **/
    private String moedaSeguroRemetente = null;
    @XmlElement(name = "nomeAssinaturaRemetente")
    @ApiModelProperty(value = "Nome do remetente que assinou o documento<br/> Tamanho Máximo: 35")
    /**
     * Nome do remetente que assinou o documento<br/> Tamanho Máximo: 35
     **/
    private String nomeAssinaturaRemetente = null;
    @XmlElement(name = "nomeAssinaturaTransportador", required = true)
    @ApiModelProperty(required = true, value = "Nome do transportador que assinou o documento<br/> Tamanho Máximo: 35")
    /**
     * Nome do transportador que assinou o documento<br/> Tamanho Máximo: 35
     **/
    private String nomeAssinaturaTransportador = null;
    @XmlElement(name = "nomeConsignatario")
    @ApiModelProperty(value = "Nome do consignatário estrangeiro <br/> Tamanho Máximo: 60")
    /**
     * Nome do consignatário estrangeiro <br/> Tamanho Máximo: 60
     **/
    private String nomeConsignatario = null;
    @XmlElement(name = "paisConsignatario")
    @ApiModelProperty(example = "BR", value = "Sigla do país do consignatário  estrangeiro<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Sigla do país do consignatário  estrangeiro<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisConsignatario = null;

    @XmlElement(name = "nomeDestinatario")
    @ApiModelProperty(value = "Nome do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 60")
    /**
     * Nome do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 60
     **/
    private String nomeDestinatario = null;

    @XmlElement(name = "nomeParteNotificarEstrangeiro")
    @ApiModelProperty(value = "Nome da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 60")
    /**
     * Nome da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 60
     **/
    private String nomeParteNotificarEstrangeiro = null;

    @XmlElement(name = "nomeRemetente", required = true)
    @ApiModelProperty(required = true, value = "Nome do remetente da carga<br/> Tamanho Máximo: 60")
    /**
     * Nome do remetente da carga<br/> Tamanho Máximo: 60
     **/
    private String nomeRemetente = null;

    @XmlElement(name = "nomeTransportadorEstrangeiro")
    @ApiModelProperty(value = "Nome do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento.<br/> Tamanho Máximo: 60")
    /**
     * Nome do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento.<br/> Tamanho Máximo: 60
     **/
    private String nomeTransportadorEstrangeiro = null;
    @XmlElement(name = "paisDestinatario")
    @ApiModelProperty(example = "BR", value = "Sigla do país do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Sigla do país do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisDestinatario = null;
    @XmlElement(name = "paisEmissao", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "Código do país de emissão do CRT<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Código do país de emissão do CRT<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisEmissao = null;
    @XmlElement(name = "paisEntrega", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "sigla do país de entrega da carga<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * sigla do país de entrega da carga<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisEntrega = null;
    @XmlElement(name = "paisParteNotificarEstrangeiro")
    @ApiModelProperty(example = "BR", value = "País da parte a notificar, quando estrangeiro<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * País da parte a notificar, quando estrangeiro<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisParteNotificarEstrangeiro = null;

    @XmlElement(name = "paisOrigemMercadoria", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "País onde a mercadoria foi fabricada<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * País onde a mercadoria foi fabricada<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisOrigemMercadoria = null;
    @XmlElement(name = "paisRemetente", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "Sigla do país do remetente da carga<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Sigla do país do remetente da carga<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisRemetente = null;
    @XmlElement(name = "paisTranspResponsMercadoria", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "Código do país em que o transportador se responsabiliza pela mercadoria<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Código do país em que o transportador se responsabiliza pela mercadoria<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisTranspResponsMercadoria = null;
    @XmlElement(name = "prazoEntrega")
    @ApiModelProperty(example = "20240524", value = "Data em que o transportador se compromete com a  entrega da carga<br/>Formato: yyyyMMddHHmmss")
    /**
     * Data em que o transportador se compromete com a  entrega da carga<br/>Formato: yyyyMMddHHmmss
     **/
    private String prazoEntrega = null;

    @XmlElement(name = "pesoBrutoKg", required = true)
    @ApiModelProperty(example = "105.478", required = true, value = "Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Peso bruto da carga em KG<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal pesoBrutoKg = null;
    @XmlElement(name = "ruaConsignatario")
    @ApiModelProperty(value = "Rua do endereço do consignatário estrangeiro <br/> Tamanho Máximo: 150")
    /**
     * Rua do endereço do consignatário estrangeiro <br/> Tamanho Máximo: 150
     **/
    private String ruaConsignatario = null;
    @XmlElement(name = "ruaDestinatario")
    @ApiModelProperty(value = "Rua do endereço do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 150")
    /**
     * Rua do endereço do destinatário da carga</br>Obrigatorio para destinatário estrangeiro (\"destinatarioNacBrasileira\" = false)<br/> Tamanho Máximo: 150
     **/
    private String ruaDestinatario = null;
    @XmlElement(name = "ruaParteNotificarEstrangeiro")
    @ApiModelProperty(value = "rua da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 150")
    /**
     * rua da parte a notificar, quando estrangeiro<br/> Tamanho Máximo: 150
     **/
    private String ruaParteNotificarEstrangeiro = null;
    @XmlElement(name = "ruaRemetente", required = true)
    @ApiModelProperty(required = true, value = "Nome da Rua do remetente da carga<br/> Tamanho Máximo: 150")
    /**
     * Nome da Rua do remetente da carga<br/> Tamanho Máximo: 150
     **/
    private String ruaRemetente = null;
    @XmlElement(name = "ruc")
    @ApiModelProperty(example = "0BRIMP000555552000100DGXKKI9LMCG", value = "ruc<br/>Não pode existir outro RUC na tabela de conhecimento com o mesmo número (levando em consideração conhecimentos ativos , ou seja, não excluídos logicamente ).<br/>Quando não informado, será gerado pelo sistema.<br/>Caso transportador seja estrangeiro e a licença complementar não for informado o campo RUC é obrigatório<br/> Tamanho Máximo: 35")
    /**
     * ruc<br/>Não pode existir outro RUC na tabela de conhecimento com o mesmo número (levando em consideração conhecimentos ativos , ou seja, não excluídos logicamente ).<br/>Quando não informado, será gerado pelo sistema.<br/>Caso transportador seja estrangeiro e a licença complementar não for informado o campo RUC é obrigatório<br/> Tamanho Máximo: 35
     **/
    private String ruc = null;
    @XmlElement(name = "telefoneParteNotificar")
    @ApiModelProperty(example = "+552199999999", value = "Telefone da parte a notificar<br/>Precisar ter no mínimo 12 números, podendo começar com +<br/> Tamanho Máximo: 16")
    /**
     * Telefone da parte a notificar<br/>Precisar ter no mínimo 12 números, podendo começar com +<br/> Tamanho Máximo: 16
     **/
    private String telefoneParteNotificar = null;
    @XmlElement(name = "tipoDocIdFiscalConsignatario", required = true)
    @ApiModelProperty(example = "J", required = true, value = "Tipo da identificação do Consignatário da carga<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)")
    /**
     * Tipo da identificação do Consignatário da carga<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)
     **/
    private TipoDocIdFiscalConsignatarioEnum tipoDocIdFiscalConsignatario = null;
    @XmlElement(name = "tipoDocIdFiscalParteNotificar")
    @ApiModelProperty(value = "Tipo do documento de identificação da parte a notificfar<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)")
    /**
     * Tipo do documento de identificação da parte a notificfar<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)
     **/
    private TipoDocIdFiscalParteNotificarEnum tipoDocIdFiscalParteNotificar = null;
    @XmlElement(name = "tipoItemCRT", required = true)
    @ApiModelProperty(example = "3", required = true, value = "Identifica qual o tipo de Carga<br/> (3), Veículo (4), Carga Solta (2), Conteiner (1)")
    /**
     * Identifica qual o tipo de Carga<br/> (3), Veículo (4), Carga Solta (2), Conteiner (1)
     **/
    private TipoItemCRTEnum tipoItemCRT = null;
    @XmlElement(name = "transportadorNacBrasileira", required = true)
    @ApiModelProperty(required = true, value = "Indica que o transportador da carga é brasileiro")
    /**
     * Indica que o transportador da carga é brasileiro
     **/
    private Boolean transportadorNacBrasileira = null;
    @XmlElement(name = "transportadoresSucessivos")
    @ApiModelProperty(value = "")
    @Valid
    private List<TransportadorSucessivo> transportadoresSucessivos = null;
    @XmlElement(name = "valorFreteExterno", required = true)
    @ApiModelProperty(example = "3284.58", required = true, value = "Valor do frete externo da mercadoria<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do frete externo da mercadoria<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorFreteExterno = null;
    @XmlElement(name = "valorFreteRemetente")
    @ApiModelProperty(example = "3284.58", value = "Valor do frete da mercadoria do remetente<br/>Deverá ser preenchido e diferente de zero caso o frete do destinatário for informado zerado<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do frete da mercadoria do remetente<br/>Deverá ser preenchido e diferente de zero caso o frete do destinatário for informado zerado<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorFreteRemetente = null;
    @XmlElement(name = "valorMercadoriaDeclaradoRemetente")
    @ApiModelProperty(example = "3284.58", value = "Valor das mercadorias declarado pelo remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor das mercadorias declarado pelo remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorMercadoriaDeclaradoRemetente = null;

    @XmlElement(name = "tipoTransporteTransportador", required = true)
    @ApiModelProperty(example = "REG", required = true, value = "Tipo de transporte do transportador<br/>REG = Regular PRO=próprio OCA=Ocasional<br/> Tamanho Máximo: 3")
    /**
     * Tipo de transporte do transportador<br/>REG = Regular PRO=próprio OCA=Ocasional<br/> Tamanho Máximo: 3
     **/
    private TipoTransporteTransportadorEnum tipoTransporteTransportador = null;
    @XmlElement(name = "valorMercadoriaLocalEmbarque", required = true)
    @ApiModelProperty(example = "3284.58", required = true, value = "Valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorMercadoriaLocalEmbarque = null;
    @XmlElement(name = "valorOutrosCustosRemetente")
    @ApiModelProperty(example = "3284.58", value = "Valor de outros custos do remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor de outros custos do remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorOutrosCustosRemetente = null;

    @XmlElement(name = "valorFreteDestinatario")
    @ApiModelProperty(example = "3284.58", value = "Valor do frete da mercadoria do destinatário<br/>Deverá ser preenchido e diferente de zero caso o valor do frete do remetente for informado zerado<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do frete da mercadoria do destinatário<br/>Deverá ser preenchido e diferente de zero caso o valor do frete do remetente for informado zerado<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorFreteDestinatario = null;
    @XmlElement(name = "valorReembolso")
    @ApiModelProperty(example = "3284.58", value = "Valor do reembolso da mercadoria - contra entrega<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do reembolso da mercadoria - contra entrega<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorReembolso = null;
    @XmlElement(name = "valorSeguroDestinatario")
    @ApiModelProperty(example = "3284.58", value = "Valor do seguro da mercadoria do destinatário<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do seguro da mercadoria do destinatário<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorSeguroDestinatario = null;
    @XmlElement(name = "valorSeguroRemetente")
    @ApiModelProperty(example = "3284.58", value = "Valor do seguro da mercadoria do remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor do seguro da mercadoria do remetente<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorSeguroRemetente = null;
    @XmlElement(name = "visualizacaoDepositario", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador de que o depositário pode ver dados monetários no conhecimento.")
    /**
     * Indicador de que o depositário pode ver dados monetários no conhecimento.
     **/
    private Boolean visualizacaoDepositario = null;

    @XmlElement(name = "valorOutrosCustosDestinatario")
    @ApiModelProperty(example = "3284.58", value = "Valor de outros custos do destinatario<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais")
    @Valid
    /**
     * Valor de outros custos do destinatario<br/>Moeda informada deverá ser um código  na tabela de moedas (TABX)<br/>Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     **/
    private BigDecimal valorOutrosCustosDestinatario = null;
    @XmlElement(name = "volumeM3")
    @ApiModelProperty(example = "435.498", value = "Volume da carga em metros cúbicos<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Volume da carga em metros cúbicos<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal volumeM3 = null;

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
     * Nome do bairro do consignatário  estrangeiro&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroConsignatario
     **/
    @JsonProperty("bairroConsignatario")
    public String getBairroConsignatario() {
        return bairroConsignatario;
    }

    public void setBairroConsignatario(String bairroConsignatario) {
        this.bairroConsignatario = bairroConsignatario;
    }

    public ManifestoCrt bairroConsignatario(String bairroConsignatario) {
        this.bairroConsignatario = bairroConsignatario;
        return this;
    }

    /**
     * Nome do bairro do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroDestinatario
     **/
    @JsonProperty("bairroDestinatario")
    public String getBairroDestinatario() {
        return bairroDestinatario;
    }

    public void setBairroDestinatario(String bairroDestinatario) {
        this.bairroDestinatario = bairroDestinatario;
    }

    public ManifestoCrt bairroDestinatario(String bairroDestinatario) {
        this.bairroDestinatario = bairroDestinatario;
        return this;
    }

    /**
     * Bairro da parte a notificar, quando estrangeiro&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroParteNotificarEstrangeiro
     **/
    @JsonProperty("bairroParteNotificarEstrangeiro")
    public String getBairroParteNotificarEstrangeiro() {
        return bairroParteNotificarEstrangeiro;
    }

    public void setBairroParteNotificarEstrangeiro(String bairroParteNotificarEstrangeiro) {
        this.bairroParteNotificarEstrangeiro = bairroParteNotificarEstrangeiro;
    }

    public ManifestoCrt bairroParteNotificarEstrangeiro(String bairroParteNotificarEstrangeiro) {
        this.bairroParteNotificarEstrangeiro = bairroParteNotificarEstrangeiro;
        return this;
    }

    /**
     * Nome do bairro do remetente da carga&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroRemetente
     **/
    @JsonProperty("bairroRemetente")
    @NotNull
    public String getBairroRemetente() {
        return bairroRemetente;
    }

    public void setBairroRemetente(String bairroRemetente) {
        this.bairroRemetente = bairroRemetente;
    }

    public ManifestoCrt bairroRemetente(String bairroRemetente) {
        this.bairroRemetente = bairroRemetente;
        return this;
    }

    /**
     * Código LOCODE da cidade do consignatário  estrangeiro&lt;br/&gt; Tamanho Máximo: 5
     *
     * @return cidadeConsignatario
     **/
    @JsonProperty("cidadeConsignatario")
    public String getCidadeConsignatario() {
        return cidadeConsignatario;
    }

    public void setCidadeConsignatario(String cidadeConsignatario) {
        this.cidadeConsignatario = cidadeConsignatario;
    }

    public ManifestoCrt cidadeConsignatario(String cidadeConsignatario) {
        this.cidadeConsignatario = cidadeConsignatario;
        return this;
    }

    /**
     * Código Locode  da cidade do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeDestinatario
     **/
    @JsonProperty("cidadeDestinatario")
    public String getCidadeDestinatario() {
        return cidadeDestinatario;
    }

    public void setCidadeDestinatario(String cidadeDestinatario) {
        this.cidadeDestinatario = cidadeDestinatario;
    }

    public ManifestoCrt cidadeDestinatario(String cidadeDestinatario) {
        this.cidadeDestinatario = cidadeDestinatario;
        return this;
    }

    /**
     * Código locode da cidade de emissão do CRT&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeEmissao
     **/
    @JsonProperty("cidadeEmissao")
    @NotNull
    public String getCidadeEmissao() {
        return cidadeEmissao;
    }

    public void setCidadeEmissao(String cidadeEmissao) {
        this.cidadeEmissao = cidadeEmissao;
    }

    public ManifestoCrt cidadeEmissao(String cidadeEmissao) {
        this.cidadeEmissao = cidadeEmissao;
        return this;
    }

    /**
     * código locode da cidade de entrega da carga&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeEntrega
     **/
    @JsonProperty("cidadeEntrega")
    @NotNull
    public String getCidadeEntrega() {
        return cidadeEntrega;
    }

    public void setCidadeEntrega(String cidadeEntrega) {
        this.cidadeEntrega = cidadeEntrega;
    }

    public ManifestoCrt cidadeEntrega(String cidadeEntrega) {
        this.cidadeEntrega = cidadeEntrega;
        return this;
    }

    /**
     * Código locode da Cidade da parte a notificar , quando estrangeiro&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeParteNotificarEstrangeiro
     **/
    @JsonProperty("cidadeParteNotificarEstrangeiro")
    public String getCidadeParteNotificarEstrangeiro() {
        return cidadeParteNotificarEstrangeiro;
    }

    public void setCidadeParteNotificarEstrangeiro(String cidadeParteNotificarEstrangeiro) {
        this.cidadeParteNotificarEstrangeiro = cidadeParteNotificarEstrangeiro;
    }

    public ManifestoCrt cidadeParteNotificarEstrangeiro(String cidadeParteNotificarEstrangeiro) {
        this.cidadeParteNotificarEstrangeiro = cidadeParteNotificarEstrangeiro;
        return this;
    }

    /**
     * Código postal do endereço do consignatário  estrangeiro&lt;br/&gt; Tamanho Máximo: 8
     *
     * @return codigoPostalConsignatario
     **/
    @JsonProperty("codigoPostalConsignatario")
    public String getCodigoPostalConsignatario() {
        return codigoPostalConsignatario;
    }

    public void setCodigoPostalConsignatario(String codigoPostalConsignatario) {
        this.codigoPostalConsignatario = codigoPostalConsignatario;
    }

    public ManifestoCrt codigoPostalConsignatario(String codigoPostalConsignatario) {
        this.codigoPostalConsignatario = codigoPostalConsignatario;
        return this;
    }

    /**
     * Código postal do endereço do destinatário da cargaObrigatorio para destinatário brasileiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; true)&lt;br/&gt; Tamanho Máximo: 8
     *
     * @return codigoPostalDestinatario
     **/
    @JsonProperty("codigoPostalDestinatario")
    public String getCodigoPostalDestinatario() {
        return codigoPostalDestinatario;
    }

    /**
     * Código Locode  da cidade do remetente da carga&lt;br/&gt; Formato: AAAAA
     * @return cidadeRemetente
     **/
    @JsonProperty("cidadeRemetente")
    @NotNull
    public String getCidadeRemetente() {
        return cidadeRemetente;
    }

    public void setCidadeRemetente(String cidadeRemetente) {
        this.cidadeRemetente = cidadeRemetente;
    }

    public ManifestoCrt cidadeRemetente(String cidadeRemetente) {
        this.cidadeRemetente = cidadeRemetente;
        return this;
    }

    /**
     * Código locode da cidade em que o transportador se responsabiliza pela mercadoria&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeTranspResponsMercadoria
     **/
    @JsonProperty("cidadeTranspResponsMercadoria")
    @NotNull
    public String getCidadeTranspResponsMercadoria() {
        return cidadeTranspResponsMercadoria;
    }

    public void setCidadeTranspResponsMercadoria(String cidadeTranspResponsMercadoria) {
        this.cidadeTranspResponsMercadoria = cidadeTranspResponsMercadoria;
    }

    public ManifestoCrt cidadeTranspResponsMercadoria(String cidadeTranspResponsMercadoria) {
        this.cidadeTranspResponsMercadoria = cidadeTranspResponsMercadoria;
        return this;
    }

    public void setCodigoPostalDestinatario(String codigoPostalDestinatario) {
        this.codigoPostalDestinatario = codigoPostalDestinatario;
    }

    public ManifestoCrt codigoPostalDestinatario(String codigoPostalDestinatario) {
        this.codigoPostalDestinatario = codigoPostalDestinatario;
        return this;
    }

    /**
     * Código postal do endereço do remetente da carga&lt;br/&gt; Tamanho Máximo: 8
     * @return codigoPostalRemetente
     **/
    @JsonProperty("codigoPostalRemetente")
    @NotNull
    public String getCodigoPostalRemetente() {
        return codigoPostalRemetente;
    }

    public void setCodigoPostalRemetente(String codigoPostalRemetente) {
        this.codigoPostalRemetente = codigoPostalRemetente;
    }

    public ManifestoCrt codigoPostalRemetente(String codigoPostalRemetente) {
        this.codigoPostalRemetente = codigoPostalRemetente;
        return this;
    }

    /**
     * Data/Hora que o destinatário assinou o documento&lt;br/&gt;Formato: yyyyMMddHHmmssZ
     * @return dataHoraAssinaturaDestinatario
     **/
    @JsonProperty("dataHoraAssinaturaDestinatario")
    public String getDataHoraAssinaturaDestinatario() {
        return dataHoraAssinaturaDestinatario;
    }

    /**
     * Código postal da parte a notificar, quando estrangeiro&lt;br/&gt; Tamanho Máximo: 8
     *
     * @return codigoPostalParteNotificarEstrangeiro
     **/
    @JsonProperty("codigoPostalParteNotificarEstrangeiro")
    public String getCodigoPostalParteNotificarEstrangeiro() {
        return codigoPostalParteNotificarEstrangeiro;
    }

    public void setCodigoPostalParteNotificarEstrangeiro(String codigoPostalParteNotificarEstrangeiro) {
        this.codigoPostalParteNotificarEstrangeiro = codigoPostalParteNotificarEstrangeiro;
    }

    public ManifestoCrt codigoPostalParteNotificarEstrangeiro(String codigoPostalParteNotificarEstrangeiro) {
        this.codigoPostalParteNotificarEstrangeiro = codigoPostalParteNotificarEstrangeiro;
        return this;
    }

    public void setDataHoraAssinaturaDestinatario(String dataHoraAssinaturaDestinatario) {
        this.dataHoraAssinaturaDestinatario = dataHoraAssinaturaDestinatario;
    }

    public ManifestoCrt dataHoraAssinaturaDestinatario(String dataHoraAssinaturaDestinatario) {
        this.dataHoraAssinaturaDestinatario = dataHoraAssinaturaDestinatario;
        return this;
    }

    /**
     * Data/Hora em que o transportador se responsabiliza pela mercadoria&lt;br/&gt;Formato: yyyyMMddHHmmssZ
     *
     * @return dataHoraTranspResponsMercadoria
     **/
    @JsonProperty("dataHoraTranspResponsMercadoria")
    @NotNull
    public String getDataHoraTranspResponsMercadoria() {
        return dataHoraTranspResponsMercadoria;
    }

    /**
     * Data de emissão do conhecimento&lt;br/&gt;A data de emissão não pode ser anterior à Data de Implantação do sistema CCT rodoviário menos um mês.  &lt;br/&gt;A data de emissão não pode ser posterior à data atual&lt;br/&gt;(utilizar como chave junto com numero do CRT apenas a a data AAAAMMDD&lt;br/&gt;Formato: yyyyMMddHHmmssZ
     * @return dataEmissao
     **/
    @JsonProperty("dataEmissao")
    @NotNull
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ManifestoCrt dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public void setDataHoraTranspResponsMercadoria(String dataHoraTranspResponsMercadoria) {
        this.dataHoraTranspResponsMercadoria = dataHoraTranspResponsMercadoria;
    }

    public ManifestoCrt dataHoraTranspResponsMercadoria(String dataHoraTranspResponsMercadoria) {
        this.dataHoraTranspResponsMercadoria = dataHoraTranspResponsMercadoria;
        return this;
    }

    /**
     * Qualquer declaração, observação ou instrução relativo ao transporte&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return declaracaoObservacao
     **/
    @JsonProperty("declaracaoObservacao")
    @NotNull
    public String getDeclaracaoObservacao() {
        return declaracaoObservacao;
    }

    /**
     * Data/Hora que o remetente assinou o documento&lt;br/&gt;Formato: yyyyMMddHHmmssZ
     * @return dataHoraAssinaturaRemetente
     **/
    @JsonProperty("dataHoraAssinaturaRemetente")
    public String getDataHoraAssinaturaRemetente() {
        return dataHoraAssinaturaRemetente;
    }

    public void setDataHoraAssinaturaRemetente(String dataHoraAssinaturaRemetente) {
        this.dataHoraAssinaturaRemetente = dataHoraAssinaturaRemetente;
    }

    public ManifestoCrt dataHoraAssinaturaRemetente(String dataHoraAssinaturaRemetente) {
        this.dataHoraAssinaturaRemetente = dataHoraAssinaturaRemetente;
        return this;
    }

    public void setDeclaracaoObservacao(String declaracaoObservacao) {
        this.declaracaoObservacao = declaracaoObservacao;
    }

    public ManifestoCrt declaracaoObservacao(String declaracaoObservacao) {
        this.declaracaoObservacao = declaracaoObservacao;
        return this;
    }

    /**
     * Indicador se o destinatário da carga é brasileiro
     *
     * @return destinatarioNacBrasileira
     **/
    @JsonProperty("destinatarioNacBrasileira")
    @NotNull
    public Boolean isisDestinatarioNacBrasileira() {
        return destinatarioNacBrasileira;
    }

    public void setDestinatarioNacBrasileira(Boolean destinatarioNacBrasileira) {
        this.destinatarioNacBrasileira = destinatarioNacBrasileira;
    }

    public ManifestoCrt destinatarioNacBrasileira(Boolean destinatarioNacBrasileira) {
        this.destinatarioNacBrasileira = destinatarioNacBrasileira;
        return this;
    }

    /**
     * Get documentosApresentados
     *
     * @return documentosApresentados
     **/
    @JsonProperty("documentosApresentados")
    public List<DocumentoApresentado> getDocumentosApresentados() {
        return documentosApresentados;
    }

    public void setDocumentosApresentados(List<DocumentoApresentado> documentosApresentados) {
        this.documentosApresentados = documentosApresentados;
    }

    public ManifestoCrt documentosApresentados(List<DocumentoApresentado> documentosApresentados) {
        this.documentosApresentados = documentosApresentados;
        return this;
    }

    public ManifestoCrt addDocumentosApresentadosItem(DocumentoApresentado documentosApresentadosItem) {
        this.documentosApresentados.add(documentosApresentadosItem);
        return this;
    }

    /**
     * E-mail da parte a notificar&lt;br/&gt;Precisar ter formato de email valido&lt;br/&gt; Tamanho Máximo: 100
     *
     * @return emailParteNotificar
     **/
    @JsonProperty("emailParteNotificar")
    public String getEmailParteNotificar() {
        return emailParteNotificar;
    }

    public void setEmailParteNotificar(String emailParteNotificar) {
        this.emailParteNotificar = emailParteNotificar;
    }

    public ManifestoCrt emailParteNotificar(String emailParteNotificar) {
        this.emailParteNotificar = emailParteNotificar;
        return this;
    }

    /**
     * Nome do estado do endereço do consignatário  estrangeiro&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoConsignatario
     **/
    @JsonProperty("estadoConsignatario")
    public String getEstadoConsignatario() {
        return estadoConsignatario;
    }

    public void setEstadoConsignatario(String estadoConsignatario) {
        this.estadoConsignatario = estadoConsignatario;
    }

    public ManifestoCrt estadoConsignatario(String estadoConsignatario) {
        this.estadoConsignatario = estadoConsignatario;
        return this;
    }

    /**
     * Nome do estado do endereço do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoDestinatario
     **/
    @JsonProperty("estadoDestinatario")
    public String getEstadoDestinatario() {
        return estadoDestinatario;
    }

    public void setEstadoDestinatario(String estadoDestinatario) {
        this.estadoDestinatario = estadoDestinatario;
    }

    public ManifestoCrt estadoDestinatario(String estadoDestinatario) {
        this.estadoDestinatario = estadoDestinatario;
        return this;
    }

    /**
     * Estado da parte a notificar, quando estrangeiro&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoParteNotificarEstrangeiro
     **/
    @JsonProperty("estadoParteNotificarEstrangeiro")
    public String getEstadoParteNotificarEstrangeiro() {
        return estadoParteNotificarEstrangeiro;
    }

    public void setEstadoParteNotificarEstrangeiro(String estadoParteNotificarEstrangeiro) {
        this.estadoParteNotificarEstrangeiro = estadoParteNotificarEstrangeiro;
    }

    public ManifestoCrt estadoParteNotificarEstrangeiro(String estadoParteNotificarEstrangeiro) {
        this.estadoParteNotificarEstrangeiro = estadoParteNotificarEstrangeiro;
        return this;
    }

    /**
     * Nome do estado ou província do remetente&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoRemetente
     **/
    @JsonProperty("estadoRemetente")
    @NotNull
    public String getEstadoRemetente() {
        return estadoRemetente;
    }

    public void setEstadoRemetente(String estadoRemetente) {
        this.estadoRemetente = estadoRemetente;
    }

    public ManifestoCrt estadoRemetente(String estadoRemetente) {
        this.estadoRemetente = estadoRemetente;
        return this;
    }

    /**
     * Identificação fiscal do consignatário da carga&lt;br/&gt;quando \&quot;idTipoDocumentoConsignatario\&quot;  for \&quot;F\&quot; ou \&quot;J\&quot; deverá estar ativo no cadastro de CPF/CNPJ&lt;br/&gt; Tamanho Máximo: 35
     *
     * @return idFiscalConsignatario
     **/
    @JsonProperty("idFiscalConsignatario")
    @NotNull
    public String getIdFiscalConsignatario() {
        return idFiscalConsignatario;
    }

    public void setIdFiscalConsignatario(String idFiscalConsignatario) {
        this.idFiscalConsignatario = idFiscalConsignatario;
    }

    public ManifestoCrt idFiscalConsignatario(String idFiscalConsignatario) {
        this.idFiscalConsignatario = idFiscalConsignatario;
        return this;
    }

    /**
     * Identificação do destinatário da carga&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return idFiscalDestinatario
     **/
    @JsonProperty("idFiscalDestinatario")
    @NotNull
    public String getIdFiscalDestinatario() {
        return idFiscalDestinatario;
    }

    public void setIdFiscalDestinatario(String idFiscalDestinatario) {
        this.idFiscalDestinatario = idFiscalDestinatario;
    }

    public ManifestoCrt idFiscalDestinatario(String idFiscalDestinatario) {
        this.idFiscalDestinatario = idFiscalDestinatario;
        return this;
    }

    /**
     * Identificação fiscal da parte a notificar&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return idFiscalParteNotificar
     **/
    @JsonProperty("idFiscalParteNotificar")
    public String getIdFiscalParteNotificar() {
        return idFiscalParteNotificar;
    }

    public void setIdFiscalParteNotificar(String idFiscalParteNotificar) {
        this.idFiscalParteNotificar = idFiscalParteNotificar;
    }

    public ManifestoCrt idFiscalParteNotificar(String idFiscalParteNotificar) {
        this.idFiscalParteNotificar = idFiscalParteNotificar;
        return this;
    }

    /**
     * Identificação fiscal do remetente da carga&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return idFiscalRemetente
     **/
    @JsonProperty("idFiscalRemetente")
    @NotNull
    public String getIdFiscalRemetente() {
        return idFiscalRemetente;
    }

    public void setIdFiscalRemetente(String idFiscalRemetente) {
        this.idFiscalRemetente = idFiscalRemetente;
    }

    public ManifestoCrt idFiscalRemetente(String idFiscalRemetente) {
        this.idFiscalRemetente = idFiscalRemetente;
        return this;
    }

    /**
     * Identificação da carga&lt;br/&gt;Se \&quot;paisRemetente\&quot;  for ATIT (*1) , o formato é AAXXXXXXXXX, em que AA &#x3D; \&quot;paisRemetente\&quot;&lt;br/&gt;Se \&quot;paisRemetente\&quot;  não for ATIT, campo de texto livre.&lt;br/&gt;Não pode haver outra carga com a mesma chave \&quot;identificacaoCrt\&quot;+\&quot;dataEmissao\&quot;&lt;br/&gt; Tamanho Máximo: 15
     *
     * @return identificacaoCrt
     **/
    @JsonProperty("identificacaoCrt")
    @NotNull
    public String getIdentificacaoCrt() {
        return identificacaoCrt;
    }

    public void setIdentificacaoCrt(String identificacaoCrt) {
        this.identificacaoCrt = identificacaoCrt;
    }

    public ManifestoCrt identificacaoCrt(String identificacaoCrt) {
        this.identificacaoCrt = identificacaoCrt;
        return this;
    }

    /**
     * CPF/CNPJ do representante do transportador estrangeiro&lt;br/&gt;Se campo transportadorNacBrasileira  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. &lt;br/&gt;O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoRepresentanteTransportadorEstrangeiro
     **/
    @JsonProperty("identificacaoRepresentanteTransportadorEstrangeiro")
    public String getIdentificacaoRepresentanteTransportadorEstrangeiro() {
        return identificacaoRepresentanteTransportadorEstrangeiro;
    }

    public void setIdentificacaoRepresentanteTransportadorEstrangeiro(String identificacaoRepresentanteTransportadorEstrangeiro) {
        this.identificacaoRepresentanteTransportadorEstrangeiro = identificacaoRepresentanteTransportadorEstrangeiro;
    }

    public ManifestoCrt identificacaoRepresentanteTransportadorEstrangeiro(String identificacaoRepresentanteTransportadorEstrangeiro) {
        this.identificacaoRepresentanteTransportadorEstrangeiro = identificacaoRepresentanteTransportadorEstrangeiro;
        return this;
    }

    /**
     * Identificação do transportador Nacional&lt;br/&gt;Se campo transportadorNacBrasileira  igual a \&quot;true\&quot; ( Transportador Nacional) é obrigatório o preenchimento do CNPJ. Este CNPJ deve estar ativo no cadastro de CNPJ e ser validado no Cadastro de Transportadores.&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoTransportadorNacional
     **/
    @JsonProperty("identificacaoTransportadorNacional")
    public String getIdentificacaoTransportadorNacional() {
        return identificacaoTransportadorNacional;
    }

    public void setIdentificacaoTransportadorNacional(String identificacaoTransportadorNacional) {
        this.identificacaoTransportadorNacional = identificacaoTransportadorNacional;
    }

    public ManifestoCrt identificacaoTransportadorNacional(String identificacaoTransportadorNacional) {
        this.identificacaoTransportadorNacional = identificacaoTransportadorNacional;
        return this;
    }

    /**
     * Indicador do consignatário é brasileiro
     *
     * @return inConsignatarioNacBrasileira
     **/
    @JsonProperty("inConsignatarioNacBrasileira")
    public Boolean isisInConsignatarioNacBrasileira() {
        return inConsignatarioNacBrasileira;
    }

    /**
     * Identificacao do transportador estrangeiro&lt;br/&gt;Se campo transportadorNacBrasileira  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento.&lt;br/&gt; Tamanho Máximo: 20
     * @return identificacaoTransportadorEstrangeiro
     **/
    @JsonProperty("identificacaoTransportadorEstrangeiro")
    public String getIdentificacaoTransportadorEstrangeiro() {
        return identificacaoTransportadorEstrangeiro;
    }

    public void setIdentificacaoTransportadorEstrangeiro(String identificacaoTransportadorEstrangeiro) {
        this.identificacaoTransportadorEstrangeiro = identificacaoTransportadorEstrangeiro;
    }

    public ManifestoCrt identificacaoTransportadorEstrangeiro(String identificacaoTransportadorEstrangeiro) {
        this.identificacaoTransportadorEstrangeiro = identificacaoTransportadorEstrangeiro;
        return this;
    }

    public void setInConsignatarioNacBrasileira(Boolean inConsignatarioNacBrasileira) {
        this.inConsignatarioNacBrasileira = inConsignatarioNacBrasileira;
    }

    public ManifestoCrt inConsignatarioNacBrasileira(Boolean inConsignatarioNacBrasileira) {
        this.inConsignatarioNacBrasileira = inConsignatarioNacBrasileira;
        return this;
    }

    /**
     * Indicador se a parte a notificar da carga é brasileiro
     *
     * @return inParteNotificarNacBrasileira
     **/
    @JsonProperty("inParteNotificarNacBrasileira")
    public Boolean isisInParteNotificarNacBrasileira() {
        return inParteNotificarNacBrasileira;
    }

    public void setInParteNotificarNacBrasileira(Boolean inParteNotificarNacBrasileira) {
        this.inParteNotificarNacBrasileira = inParteNotificarNacBrasileira;
    }

    public ManifestoCrt inParteNotificarNacBrasileira(Boolean inParteNotificarNacBrasileira) {
        this.inParteNotificarNacBrasileira = inParteNotificarNacBrasileira;
        return this;
    }

    /**
     * Instruções sobre formalidades de alfândega&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return instrucaoFormalidadeAlfandega
     **/
    @JsonProperty("instrucaoFormalidadeAlfandega")
    @NotNull
    public String getInstrucaoFormalidadeAlfandega() {
        return instrucaoFormalidadeAlfandega;
    }

    public void setInstrucaoFormalidadeAlfandega(String instrucaoFormalidadeAlfandega) {
        this.instrucaoFormalidadeAlfandega = instrucaoFormalidadeAlfandega;
    }

    public ManifestoCrt instrucaoFormalidadeAlfandega(String instrucaoFormalidadeAlfandega) {
        this.instrucaoFormalidadeAlfandega = instrucaoFormalidadeAlfandega;
        return this;
    }

    /**
     * Get itensCRT
     *
     * @return itensCRT
     **/
    @JsonProperty("itensCRT")
    public List<ItemCrt> getItensCRT() {
        return itensCRT;
    }

    /**
     * Incoterms do valor: tipos FCA ou EX&lt;br/&gt; Tamanho: 3
     * @return incotermLocalEmbarque
     **/
    @JsonProperty("incotermLocalEmbarque")
    @NotNull
    public String getIncotermLocalEmbarque() {
        if (incotermLocalEmbarque == null) {
            return null;
        }
        return incotermLocalEmbarque.value();
    }

    public void setIncotermLocalEmbarque(IncotermLocalEmbarqueEnum incotermLocalEmbarque) {
        this.incotermLocalEmbarque = incotermLocalEmbarque;
    }

    public ManifestoCrt incotermLocalEmbarque(IncotermLocalEmbarqueEnum incotermLocalEmbarque) {
        this.incotermLocalEmbarque = incotermLocalEmbarque;
        return this;
    }

    public void setItensCRT(List<ItemCrt> itensCRT) {
        this.itensCRT = itensCRT;
    }

    public ManifestoCrt itensCRT(List<ItemCrt> itensCRT) {
        this.itensCRT = itensCRT;
        return this;
    }

    public ManifestoCrt addItensCRTItem(ItemCrt itensCRTItem) {
        this.itensCRT.add(itensCRTItem);
        return this;
    }

    /**
     * Licença Complementar do Transportador Estrangeiro&lt;br/&gt;Se tipoTransporteTransportador &#x3D; \&quot;REG\&quot; e campo transportadorNacBrasileira  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. &lt;br/&gt; Tamanho Máximo: 6
     * @return licencaComplementarTransportador
     **/
    @JsonProperty("licencaComplementarTransportador")
    public BigDecimal getLicencaComplementarTransportador() {
        return licencaComplementarTransportador;
    }

    public void setLicencaComplementarTransportador(BigDecimal licencaComplementarTransportador) {
        this.licencaComplementarTransportador = licencaComplementarTransportador;
    }

    public ManifestoCrt licencaComplementarTransportador(BigDecimal licencaComplementarTransportador) {
        this.licencaComplementarTransportador = licencaComplementarTransportador;
        return this;
    }

    /**
     * Licença Originária do Transportador Nacional&lt;br/&gt;Se tipoTransporteTransportador &#x3D; \&quot;REG\&quot; e campo transportadorNacBrasileira  igual a \&quot;true\&quot; ( Transportador Nacional) é obrigatório o preenchimento desse campo&lt;br/&gt; Tamanho Máximo: 6
     * @return licencaOriginariaTransportador
     **/
    @JsonProperty("licencaOriginariaTransportador")
    public BigDecimal getLicencaOriginariaTransportador() {
        return licencaOriginariaTransportador;
    }

    public void setLicencaOriginariaTransportador(BigDecimal licencaOriginariaTransportador) {
        this.licencaOriginariaTransportador = licencaOriginariaTransportador;
    }

    public ManifestoCrt licencaOriginariaTransportador(BigDecimal licencaOriginariaTransportador) {
        this.licencaOriginariaTransportador = licencaOriginariaTransportador;
        return this;
    }

    /**
     * Local de assinatura do destinatário&lt;br/&gt; Tamanho Máximo: 35
     * @return localAssinaturaDestinatario
     **/
    @JsonProperty("localAssinaturaDestinatario")
    public String getLocalAssinaturaDestinatario() {
        return localAssinaturaDestinatario;
    }

    public void setLocalAssinaturaDestinatario(String localAssinaturaDestinatario) {
        this.localAssinaturaDestinatario = localAssinaturaDestinatario;
    }

    public ManifestoCrt localAssinaturaDestinatario(String localAssinaturaDestinatario) {
        this.localAssinaturaDestinatario = localAssinaturaDestinatario;
        return this;
    }

    /**
     * Local de assinatura do remetente&lt;br/&gt; Tamanho Máximo: 35
     * @return localAssinaturaRemetente
     **/
    @JsonProperty("localAssinaturaRemetente")
    public String getLocalAssinaturaRemetente() {
        return localAssinaturaRemetente;
    }

    public void setLocalAssinaturaRemetente(String localAssinaturaRemetente) {
        this.localAssinaturaRemetente = localAssinaturaRemetente;
    }

    public ManifestoCrt localAssinaturaRemetente(String localAssinaturaRemetente) {
        this.localAssinaturaRemetente = localAssinaturaRemetente;
        return this;
    }

    /**
     * Get manuseiosEspeciaisCarga
     * @return manuseiosEspeciaisCarga
     **/
    @JsonProperty("manuseiosEspeciaisCarga")
    public List<ManuseioEspecialCarga> getManuseiosEspeciaisCarga() {
        return manuseiosEspeciaisCarga;
    }

    public void setManuseiosEspeciaisCarga(List<ManuseioEspecialCarga> manuseiosEspeciaisCarga) {
        this.manuseiosEspeciaisCarga = manuseiosEspeciaisCarga;
    }

    public ManifestoCrt manuseiosEspeciaisCarga(List<ManuseioEspecialCarga> manuseiosEspeciaisCarga) {
        this.manuseiosEspeciaisCarga = manuseiosEspeciaisCarga;
        return this;
    }

    public ManifestoCrt addManuseiosEspeciaisCargaItem(ManuseioEspecialCarga manuseiosEspeciaisCargaItem) {
        this.manuseiosEspeciaisCarga.add(manuseiosEspeciaisCargaItem);
        return this;
    }

    /**
     * Código da moeda do frete da mercadoria do destinatário&lt;br/&gt;Formato: AAA
     *
     * @return moedaFreteDestinatario
     **/
    @JsonProperty("moedaFreteDestinatario")
    public String getMoedaFreteDestinatario() {
        return moedaFreteDestinatario;
    }

    public void setMoedaFreteDestinatario(String moedaFreteDestinatario) {
        this.moedaFreteDestinatario = moedaFreteDestinatario;
    }

    public ManifestoCrt moedaFreteDestinatario(String moedaFreteDestinatario) {
        this.moedaFreteDestinatario = moedaFreteDestinatario;
        return this;
    }

    /**
     * Código da moeda do frete externo da mercadoria&lt;br/&gt;Formato: AAA
     *
     * @return moedaFreteExterno
     **/
    @JsonProperty("moedaFreteExterno")
    @NotNull
    public String getMoedaFreteExterno() {
        return moedaFreteExterno;
    }

    /**
     * Get mercadorias
     *
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public ManifestoCrt mercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public ManifestoCrt addMercadoriasItem(Mercadoria mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    public void setMoedaFreteExterno(String moedaFreteExterno) {
        this.moedaFreteExterno = moedaFreteExterno;
    }

    public ManifestoCrt moedaFreteExterno(String moedaFreteExterno) {
        this.moedaFreteExterno = moedaFreteExterno;
        return this;
    }

    /**
     * Código da moeda do valor das mercadorias declarado pelo remetente&lt;br/&gt;Formato: AAA
     * @return moedaMercadoriaDeclaradoRemetente
     **/
    @JsonProperty("moedaMercadoriaDeclaradoRemetente")
    public String getMoedaMercadoriaDeclaradoRemetente() {
        return moedaMercadoriaDeclaradoRemetente;
    }

    public void setMoedaMercadoriaDeclaradoRemetente(String moedaMercadoriaDeclaradoRemetente) {
        this.moedaMercadoriaDeclaradoRemetente = moedaMercadoriaDeclaradoRemetente;
    }

    public ManifestoCrt moedaMercadoriaDeclaradoRemetente(String moedaMercadoriaDeclaradoRemetente) {
        this.moedaMercadoriaDeclaradoRemetente = moedaMercadoriaDeclaradoRemetente;
        return this;
    }

    /**
     * Código da moeda do valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga&lt;br/&gt;Formato: AAA
     * @return moedaMercadoriaLocalEmbarque
     **/
    @JsonProperty("moedaMercadoriaLocalEmbarque")
    @NotNull
    public String getMoedaMercadoriaLocalEmbarque() {
        return moedaMercadoriaLocalEmbarque;
    }

    /**
     * Código da moeda do frete da mercadoria do remetente&lt;br/&gt;Formato: AAA
     * @return moedaFreteRemetente
     **/
    @JsonProperty("moedaFreteRemetente")
    public String getMoedaFreteRemetente() {
        return moedaFreteRemetente;
    }

    public void setMoedaFreteRemetente(String moedaFreteRemetente) {
        this.moedaFreteRemetente = moedaFreteRemetente;
    }

    public ManifestoCrt moedaFreteRemetente(String moedaFreteRemetente) {
        this.moedaFreteRemetente = moedaFreteRemetente;
        return this;
    }

    public void setMoedaMercadoriaLocalEmbarque(String moedaMercadoriaLocalEmbarque) {
        this.moedaMercadoriaLocalEmbarque = moedaMercadoriaLocalEmbarque;
    }

    public ManifestoCrt moedaMercadoriaLocalEmbarque(String moedaMercadoriaLocalEmbarque) {
        this.moedaMercadoriaLocalEmbarque = moedaMercadoriaLocalEmbarque;
        return this;
    }

    /**
     * Código da moeda de outros custos do destinatario&lt;br/&gt;Formato: AAA
     * @return moedaOutrosCustosDestinatario
     **/
    @JsonProperty("moedaOutrosCustosDestinatario")
    public String getMoedaOutrosCustosDestinatario() {
        return moedaOutrosCustosDestinatario;
    }

    public void setMoedaOutrosCustosDestinatario(String moedaOutrosCustosDestinatario) {
        this.moedaOutrosCustosDestinatario = moedaOutrosCustosDestinatario;
    }

    public ManifestoCrt moedaOutrosCustosDestinatario(String moedaOutrosCustosDestinatario) {
        this.moedaOutrosCustosDestinatario = moedaOutrosCustosDestinatario;
        return this;
    }

    /**
     * Código da moeda de outros custos do remetente&lt;br/&gt;Formato: AAA
     *
     * @return moedaOutrosCustosRemetente
     **/
    @JsonProperty("moedaOutrosCustosRemetente")
    public String getMoedaOutrosCustosRemetente() {
        return moedaOutrosCustosRemetente;
    }

    public void setMoedaOutrosCustosRemetente(String moedaOutrosCustosRemetente) {
        this.moedaOutrosCustosRemetente = moedaOutrosCustosRemetente;
    }

    public ManifestoCrt moedaOutrosCustosRemetente(String moedaOutrosCustosRemetente) {
        this.moedaOutrosCustosRemetente = moedaOutrosCustosRemetente;
        return this;
    }

    /**
     * Código da moeda do reembolso da mercadoria - contra entrega&lt;br/&gt;Formato: AAA
     * @return moedaReembolso
     **/
    @JsonProperty("moedaReembolso")
    public String getMoedaReembolso() {
        return moedaReembolso;
    }

    public void setMoedaReembolso(String moedaReembolso) {
        this.moedaReembolso = moedaReembolso;
    }

    public ManifestoCrt moedaReembolso(String moedaReembolso) {
        this.moedaReembolso = moedaReembolso;
        return this;
    }

    /**
     * Código da moeda do seguro da mercadoria do destinatário&lt;br/&gt;Formato: AAA
     * @return moedaSeguroDestinatario
     **/
    @JsonProperty("moedaSeguroDestinatario")
    public String getMoedaSeguroDestinatario() {
        return moedaSeguroDestinatario;
    }

    public void setMoedaSeguroDestinatario(String moedaSeguroDestinatario) {
        this.moedaSeguroDestinatario = moedaSeguroDestinatario;
    }

    public ManifestoCrt moedaSeguroDestinatario(String moedaSeguroDestinatario) {
        this.moedaSeguroDestinatario = moedaSeguroDestinatario;
        return this;
    }

    /**
     * Código da moeda do seguro da mercadoria do remetente&lt;br/&gt;Formato: AAA
     * @return moedaSeguroRemetente
     **/
    @JsonProperty("moedaSeguroRemetente")
    public String getMoedaSeguroRemetente() {
        return moedaSeguroRemetente;
    }

    public void setMoedaSeguroRemetente(String moedaSeguroRemetente) {
        this.moedaSeguroRemetente = moedaSeguroRemetente;
    }

    public ManifestoCrt moedaSeguroRemetente(String moedaSeguroRemetente) {
        this.moedaSeguroRemetente = moedaSeguroRemetente;
        return this;
    }

    /**
     * Nome do destinatário que assinou o documento&lt;br/&gt; Tamanho Máximo: 35
     *
     * @return nomeAssinaturaDestinatario
     **/
    @JsonProperty("nomeAssinaturaDestinatario")
    public String getNomeAssinaturaDestinatario() {
        return nomeAssinaturaDestinatario;
    }

    public void setNomeAssinaturaDestinatario(String nomeAssinaturaDestinatario) {
        this.nomeAssinaturaDestinatario = nomeAssinaturaDestinatario;
    }

    public ManifestoCrt nomeAssinaturaDestinatario(String nomeAssinaturaDestinatario) {
        this.nomeAssinaturaDestinatario = nomeAssinaturaDestinatario;
        return this;
    }

    /**
     * Nome do transportador que assinou o documento&lt;br/&gt; Tamanho Máximo: 35
     *
     * @return nomeAssinaturaTransportador
     **/
    @JsonProperty("nomeAssinaturaTransportador")
    @NotNull
    public String getNomeAssinaturaTransportador() {
        return nomeAssinaturaTransportador;
    }

    public void setNomeAssinaturaTransportador(String nomeAssinaturaTransportador) {
        this.nomeAssinaturaTransportador = nomeAssinaturaTransportador;
    }

    public ManifestoCrt nomeAssinaturaTransportador(String nomeAssinaturaTransportador) {
        this.nomeAssinaturaTransportador = nomeAssinaturaTransportador;
        return this;
    }

    /**
     * Nome do consignatário estrangeiro &lt;br/&gt; Tamanho Máximo: 60
     *
     * @return nomeConsignatario
     **/
    @JsonProperty("nomeConsignatario")
    public String getNomeConsignatario() {
        return nomeConsignatario;
    }

    /**
     * Nome do remetente que assinou o documento&lt;br/&gt; Tamanho Máximo: 35
     * @return nomeAssinaturaRemetente
     **/
    @JsonProperty("nomeAssinaturaRemetente")
    public String getNomeAssinaturaRemetente() {
        return nomeAssinaturaRemetente;
    }

    public void setNomeAssinaturaRemetente(String nomeAssinaturaRemetente) {
        this.nomeAssinaturaRemetente = nomeAssinaturaRemetente;
    }

    public ManifestoCrt nomeAssinaturaRemetente(String nomeAssinaturaRemetente) {
        this.nomeAssinaturaRemetente = nomeAssinaturaRemetente;
        return this;
    }

    public void setNomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
    }

    public ManifestoCrt nomeConsignatario(String nomeConsignatario) {
        this.nomeConsignatario = nomeConsignatario;
        return this;
    }

    /**
     * Nome do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 60
     * @return nomeDestinatario
     **/
    @JsonProperty("nomeDestinatario")
    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public ManifestoCrt nomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
        return this;
    }

    /**
     * Nome da parte a notificar, quando estrangeiro&lt;br/&gt; Tamanho Máximo: 60
     *
     * @return nomeParteNotificarEstrangeiro
     **/
    @JsonProperty("nomeParteNotificarEstrangeiro")
    public String getNomeParteNotificarEstrangeiro() {
        return nomeParteNotificarEstrangeiro;
    }

    public void setNomeParteNotificarEstrangeiro(String nomeParteNotificarEstrangeiro) {
        this.nomeParteNotificarEstrangeiro = nomeParteNotificarEstrangeiro;
    }

    public ManifestoCrt nomeParteNotificarEstrangeiro(String nomeParteNotificarEstrangeiro) {
        this.nomeParteNotificarEstrangeiro = nomeParteNotificarEstrangeiro;
        return this;
    }

    /**
     * Nome do remetente da carga&lt;br/&gt; Tamanho Máximo: 60
     *
     * @return nomeRemetente
     **/
    @JsonProperty("nomeRemetente")
    @NotNull
    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public ManifestoCrt nomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
        return this;
    }

    /**
     * Nome do transportador estrangeiro&lt;br/&gt;Se campo transportadorNacBrasileira  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento.&lt;br/&gt; Tamanho Máximo: 60
     * @return nomeTransportadorEstrangeiro
     **/
    @JsonProperty("nomeTransportadorEstrangeiro")
    public String getNomeTransportadorEstrangeiro() {
        return nomeTransportadorEstrangeiro;
    }

    public void setNomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
    }

    public ManifestoCrt nomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
        return this;
    }

    /**
     * Código do país de emissão do CRT&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisEmissao
     **/
    @JsonProperty("paisEmissao")
    @NotNull
    public String getPaisEmissao() {
        return paisEmissao;
    }

    public void setPaisEmissao(String paisEmissao) {
        this.paisEmissao = paisEmissao;
    }

    public ManifestoCrt paisEmissao(String paisEmissao) {
        this.paisEmissao = paisEmissao;
        return this;
    }

    /**
     * sigla do país de entrega da carga&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisEntrega
     **/
    @JsonProperty("paisEntrega")
    @NotNull
    public String getPaisEntrega() {
        return paisEntrega;
    }

    /**
     * Sigla do país do consignatário  estrangeiro&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisConsignatario
     **/
    @JsonProperty("paisConsignatario")
    public String getPaisConsignatario() {
        return paisConsignatario;
    }

    public void setPaisConsignatario(String paisConsignatario) {
        this.paisConsignatario = paisConsignatario;
    }

    public ManifestoCrt paisConsignatario(String paisConsignatario) {
        this.paisConsignatario = paisConsignatario;
        return this;
    }

    /**
     * Sigla do país do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisDestinatario
     **/
    @JsonProperty("paisDestinatario")
    public String getPaisDestinatario() {
        return paisDestinatario;
    }

    public void setPaisDestinatario(String paisDestinatario) {
        this.paisDestinatario = paisDestinatario;
    }

    public ManifestoCrt paisDestinatario(String paisDestinatario) {
        this.paisDestinatario = paisDestinatario;
        return this;
    }

    public void setPaisEntrega(String paisEntrega) {
        this.paisEntrega = paisEntrega;
    }

    public ManifestoCrt paisEntrega(String paisEntrega) {
        this.paisEntrega = paisEntrega;
        return this;
    }

    /**
     * País onde a mercadoria foi fabricada&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisOrigemMercadoria
     **/
    @JsonProperty("paisOrigemMercadoria")
    @NotNull
    public String getPaisOrigemMercadoria() {
        return paisOrigemMercadoria;
    }

    public void setPaisOrigemMercadoria(String paisOrigemMercadoria) {
        this.paisOrigemMercadoria = paisOrigemMercadoria;
    }

    public ManifestoCrt paisOrigemMercadoria(String paisOrigemMercadoria) {
        this.paisOrigemMercadoria = paisOrigemMercadoria;
        return this;
    }

    /**
     * Sigla do país do remetente da carga&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisRemetente
     **/
    @JsonProperty("paisRemetente")
    @NotNull
    public String getPaisRemetente() {
        return paisRemetente;
    }

    public void setPaisRemetente(String paisRemetente) {
        this.paisRemetente = paisRemetente;
    }

    public ManifestoCrt paisRemetente(String paisRemetente) {
        this.paisRemetente = paisRemetente;
        return this;
    }

    /**
     * Código do país em que o transportador se responsabiliza pela mercadoria&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisTranspResponsMercadoria
     **/
    @JsonProperty("paisTranspResponsMercadoria")
    @NotNull
    public String getPaisTranspResponsMercadoria() {
        return paisTranspResponsMercadoria;
    }

    /**
     * País da parte a notificar, quando estrangeiro&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisParteNotificarEstrangeiro
     **/
    @JsonProperty("paisParteNotificarEstrangeiro")
    public String getPaisParteNotificarEstrangeiro() {
        return paisParteNotificarEstrangeiro;
    }

    public void setPaisParteNotificarEstrangeiro(String paisParteNotificarEstrangeiro) {
        this.paisParteNotificarEstrangeiro = paisParteNotificarEstrangeiro;
    }

    public ManifestoCrt paisParteNotificarEstrangeiro(String paisParteNotificarEstrangeiro) {
        this.paisParteNotificarEstrangeiro = paisParteNotificarEstrangeiro;
        return this;
    }

    public void setPaisTranspResponsMercadoria(String paisTranspResponsMercadoria) {
        this.paisTranspResponsMercadoria = paisTranspResponsMercadoria;
    }

    public ManifestoCrt paisTranspResponsMercadoria(String paisTranspResponsMercadoria) {
        this.paisTranspResponsMercadoria = paisTranspResponsMercadoria;
        return this;
    }

    /**
     * Peso bruto da carga em KG&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return pesoBrutoKg
     **/
    @JsonProperty("pesoBrutoKg")
    @NotNull
    public BigDecimal getPesoBrutoKg() {
        return pesoBrutoKg;
    }

    public void setPesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
    }

    public ManifestoCrt pesoBrutoKg(BigDecimal pesoBrutoKg) {
        this.pesoBrutoKg = pesoBrutoKg;
        return this;
    }

    /**
     * Data em que o transportador se compromete com a  entrega da carga&lt;br/&gt;Formato: yyyyMMddHHmmss
     * @return prazoEntrega
     **/
    @JsonProperty("prazoEntrega")
    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public ManifestoCrt prazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
        return this;
    }

    /**
     * Rua do endereço do consignatário estrangeiro &lt;br/&gt; Tamanho Máximo: 150
     *
     * @return ruaConsignatario
     **/
    @JsonProperty("ruaConsignatario")
    public String getRuaConsignatario() {
        return ruaConsignatario;
    }

    public void setRuaConsignatario(String ruaConsignatario) {
        this.ruaConsignatario = ruaConsignatario;
    }

    public ManifestoCrt ruaConsignatario(String ruaConsignatario) {
        this.ruaConsignatario = ruaConsignatario;
        return this;
    }

    /**
     * rua da parte a notificar, quando estrangeiro&lt;br/&gt; Tamanho Máximo: 150
     * @return ruaParteNotificarEstrangeiro
     **/
    @JsonProperty("ruaParteNotificarEstrangeiro")
    public String getRuaParteNotificarEstrangeiro() {
        return ruaParteNotificarEstrangeiro;
    }

    public void setRuaParteNotificarEstrangeiro(String ruaParteNotificarEstrangeiro) {
        this.ruaParteNotificarEstrangeiro = ruaParteNotificarEstrangeiro;
    }

    public ManifestoCrt ruaParteNotificarEstrangeiro(String ruaParteNotificarEstrangeiro) {
        this.ruaParteNotificarEstrangeiro = ruaParteNotificarEstrangeiro;
        return this;
    }

    /**
     * Nome da Rua do remetente da carga&lt;br/&gt; Tamanho Máximo: 150
     *
     * @return ruaRemetente
     **/
    @JsonProperty("ruaRemetente")
    @NotNull
    public String getRuaRemetente() {
        return ruaRemetente;
    }

    /**
     * Rua do endereço do destinatário da carga&lt;/br&gt;Obrigatorio para destinatário estrangeiro (\&quot;destinatarioNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 150
     * @return ruaDestinatario
     **/
    @JsonProperty("ruaDestinatario")
    public String getRuaDestinatario() {
        return ruaDestinatario;
    }

    public void setRuaDestinatario(String ruaDestinatario) {
        this.ruaDestinatario = ruaDestinatario;
    }

    public ManifestoCrt ruaDestinatario(String ruaDestinatario) {
        this.ruaDestinatario = ruaDestinatario;
        return this;
    }

    public void setRuaRemetente(String ruaRemetente) {
        this.ruaRemetente = ruaRemetente;
    }

    public ManifestoCrt ruaRemetente(String ruaRemetente) {
        this.ruaRemetente = ruaRemetente;
        return this;
    }

    /**
     * ruc&lt;br/&gt;Não pode existir outro RUC na tabela de conhecimento com o mesmo número (levando em consideração conhecimentos ativos , ou seja, não excluídos logicamente ).&lt;br/&gt;Quando não informado, será gerado pelo sistema.&lt;br/&gt;Caso transportador seja estrangeiro e a licença complementar não for informado o campo RUC é obrigatório&lt;br/&gt; Tamanho Máximo: 35
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

    public ManifestoCrt ruc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    /**
     * Telefone da parte a notificar&lt;br/&gt;Precisar ter no mínimo 12 números, podendo começar com +&lt;br/&gt; Tamanho Máximo: 16
     *
     * @return telefoneParteNotificar
     **/
    @JsonProperty("telefoneParteNotificar")
    public String getTelefoneParteNotificar() {
        return telefoneParteNotificar;
    }

    public void setTelefoneParteNotificar(String telefoneParteNotificar) {
        this.telefoneParteNotificar = telefoneParteNotificar;
    }

    public ManifestoCrt telefoneParteNotificar(String telefoneParteNotificar) {
        this.telefoneParteNotificar = telefoneParteNotificar;
        return this;
    }

    /**
     * Tipo da identificação do Consignatário da carga&lt;br/&gt; \&quot;F\&quot; (CPF), \&quot;J\&quot; (CNPJ),\&quot;P\&quot; (passaporte), \&quot;O\&quot; (outros)
     * @return tipoDocIdFiscalConsignatario
     **/
    @JsonProperty("tipoDocIdFiscalConsignatario")
    @NotNull
    public String getTipoDocIdFiscalConsignatario() {
        if (tipoDocIdFiscalConsignatario == null) {
            return null;
        }
        return tipoDocIdFiscalConsignatario.value();
    }

    public void setTipoDocIdFiscalConsignatario(TipoDocIdFiscalConsignatarioEnum tipoDocIdFiscalConsignatario) {
        this.tipoDocIdFiscalConsignatario = tipoDocIdFiscalConsignatario;
    }

    public ManifestoCrt tipoDocIdFiscalConsignatario(TipoDocIdFiscalConsignatarioEnum tipoDocIdFiscalConsignatario) {
        this.tipoDocIdFiscalConsignatario = tipoDocIdFiscalConsignatario;
        return this;
    }

    /**
     * Tipo do documento de identificação da parte a notificfar&lt;br/&gt; \&quot;F\&quot; (CPF), \&quot;J\&quot; (CNPJ),\&quot;P\&quot; (passaporte), \&quot;O\&quot; (outros)
     *
     * @return tipoDocIdFiscalParteNotificar
     **/
    @JsonProperty("tipoDocIdFiscalParteNotificar")
    public String getTipoDocIdFiscalParteNotificar() {
        if (tipoDocIdFiscalParteNotificar == null) {
            return null;
        }
        return tipoDocIdFiscalParteNotificar.value();
    }

    public void setTipoDocIdFiscalParteNotificar(TipoDocIdFiscalParteNotificarEnum tipoDocIdFiscalParteNotificar) {
        this.tipoDocIdFiscalParteNotificar = tipoDocIdFiscalParteNotificar;
    }

    public ManifestoCrt tipoDocIdFiscalParteNotificar(TipoDocIdFiscalParteNotificarEnum tipoDocIdFiscalParteNotificar) {
        this.tipoDocIdFiscalParteNotificar = tipoDocIdFiscalParteNotificar;
        return this;
    }

    /**
     * Identifica qual o tipo de Carga&lt;br/&gt; (3), Veículo (4), Carga Solta (2), Conteiner (1)
     *
     * @return tipoItemCRT
     **/
    @JsonProperty("tipoItemCRT")
    @NotNull
    public String getTipoItemCRT() {
        if (tipoItemCRT == null) {
            return null;
        }
        return tipoItemCRT.value();
    }

    public void setTipoItemCRT(TipoItemCRTEnum tipoItemCRT) {
        this.tipoItemCRT = tipoItemCRT;
    }

    public ManifestoCrt tipoItemCRT(TipoItemCRTEnum tipoItemCRT) {
        this.tipoItemCRT = tipoItemCRT;
        return this;
    }

    /**
     * Tipo de transporte do transportador&lt;br/&gt;REG &#x3D; Regular PRO&#x3D;próprio OCA&#x3D;Ocasional&lt;br/&gt; Tamanho Máximo: 3
     *
     * @return tipoTransporteTransportador
     **/
    @JsonProperty("tipoTransporteTransportador")
    @NotNull
    public String getTipoTransporteTransportador() {
        if (tipoTransporteTransportador == null) {
            return null;
        }
        return tipoTransporteTransportador.value();
    }

    public void setTipoTransporteTransportador(TipoTransporteTransportadorEnum tipoTransporteTransportador) {
        this.tipoTransporteTransportador = tipoTransporteTransportador;
    }

    public ManifestoCrt tipoTransporteTransportador(TipoTransporteTransportadorEnum tipoTransporteTransportador) {
        this.tipoTransporteTransportador = tipoTransporteTransportador;
        return this;
    }

    /**
     * Indica que o transportador da carga é brasileiro
     *
     * @return transportadorNacBrasileira
     **/
    @JsonProperty("transportadorNacBrasileira")
    @NotNull
    public Boolean isisTransportadorNacBrasileira() {
        return transportadorNacBrasileira;
    }

    public void setTransportadorNacBrasileira(Boolean transportadorNacBrasileira) {
        this.transportadorNacBrasileira = transportadorNacBrasileira;
    }

    public ManifestoCrt transportadorNacBrasileira(Boolean transportadorNacBrasileira) {
        this.transportadorNacBrasileira = transportadorNacBrasileira;
        return this;
    }

    /**
     * Get transportadoresSucessivos
     *
     * @return transportadoresSucessivos
     **/
    @JsonProperty("transportadoresSucessivos")
    public List<TransportadorSucessivo> getTransportadoresSucessivos() {
        return transportadoresSucessivos;
    }

    public void setTransportadoresSucessivos(List<TransportadorSucessivo> transportadoresSucessivos) {
        this.transportadoresSucessivos = transportadoresSucessivos;
    }

    public ManifestoCrt transportadoresSucessivos(List<TransportadorSucessivo> transportadoresSucessivos) {
        this.transportadoresSucessivos = transportadoresSucessivos;
        return this;
    }

    public ManifestoCrt addTransportadoresSucessivosItem(TransportadorSucessivo transportadoresSucessivosItem) {
        this.transportadoresSucessivos.add(transportadoresSucessivosItem);
        return this;
    }

    /**
     * Valor do frete da mercadoria do destinatário&lt;br/&gt;Deverá ser preenchido e diferente de zero caso o valor do frete do remetente for informado zerado&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorFreteDestinatario
     **/
    @JsonProperty("valorFreteDestinatario")
    public BigDecimal getValorFreteDestinatario() {
        return valorFreteDestinatario;
    }

    public void setValorFreteDestinatario(BigDecimal valorFreteDestinatario) {
        this.valorFreteDestinatario = valorFreteDestinatario;
    }

    public ManifestoCrt valorFreteDestinatario(BigDecimal valorFreteDestinatario) {
        this.valorFreteDestinatario = valorFreteDestinatario;
        return this;
    }

    /**
     * Valor do frete externo da mercadoria&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorFreteExterno
     **/
    @JsonProperty("valorFreteExterno")
    @NotNull
    public BigDecimal getValorFreteExterno() {
        return valorFreteExterno;
    }

    public void setValorFreteExterno(BigDecimal valorFreteExterno) {
        this.valorFreteExterno = valorFreteExterno;
    }

    public ManifestoCrt valorFreteExterno(BigDecimal valorFreteExterno) {
        this.valorFreteExterno = valorFreteExterno;
        return this;
    }

    /**
     * Valor do frete da mercadoria do remetente&lt;br/&gt;Deverá ser preenchido e diferente de zero caso o frete do destinatário for informado zerado&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorFreteRemetente
     **/
    @JsonProperty("valorFreteRemetente")
    public BigDecimal getValorFreteRemetente() {
        return valorFreteRemetente;
    }

    public void setValorFreteRemetente(BigDecimal valorFreteRemetente) {
        this.valorFreteRemetente = valorFreteRemetente;
    }

    public ManifestoCrt valorFreteRemetente(BigDecimal valorFreteRemetente) {
        this.valorFreteRemetente = valorFreteRemetente;
        return this;
    }

    /**
     * Valor das mercadorias declarado pelo remetente&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorMercadoriaDeclaradoRemetente
     **/
    @JsonProperty("valorMercadoriaDeclaradoRemetente")
    public BigDecimal getValorMercadoriaDeclaradoRemetente() {
        return valorMercadoriaDeclaradoRemetente;
    }

    public void setValorMercadoriaDeclaradoRemetente(BigDecimal valorMercadoriaDeclaradoRemetente) {
        this.valorMercadoriaDeclaradoRemetente = valorMercadoriaDeclaradoRemetente;
    }

    public ManifestoCrt valorMercadoriaDeclaradoRemetente(BigDecimal valorMercadoriaDeclaradoRemetente) {
        this.valorMercadoriaDeclaradoRemetente = valorMercadoriaDeclaradoRemetente;
        return this;
    }

    /**
     * Valor da mercadoria no local de embarque no momento em que o transportador se responsabiliza pela carga&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorMercadoriaLocalEmbarque
     **/
    @JsonProperty("valorMercadoriaLocalEmbarque")
    @NotNull
    public BigDecimal getValorMercadoriaLocalEmbarque() {
        return valorMercadoriaLocalEmbarque;
    }

    public void setValorMercadoriaLocalEmbarque(BigDecimal valorMercadoriaLocalEmbarque) {
        this.valorMercadoriaLocalEmbarque = valorMercadoriaLocalEmbarque;
    }

    public ManifestoCrt valorMercadoriaLocalEmbarque(BigDecimal valorMercadoriaLocalEmbarque) {
        this.valorMercadoriaLocalEmbarque = valorMercadoriaLocalEmbarque;
        return this;
    }

    /**
     * Valor de outros custos do destinatario&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorOutrosCustosDestinatario
     **/
    @JsonProperty("valorOutrosCustosDestinatario")
    public BigDecimal getValorOutrosCustosDestinatario() {
        return valorOutrosCustosDestinatario;
    }

    public void setValorOutrosCustosDestinatario(BigDecimal valorOutrosCustosDestinatario) {
        this.valorOutrosCustosDestinatario = valorOutrosCustosDestinatario;
    }

    public ManifestoCrt valorOutrosCustosDestinatario(BigDecimal valorOutrosCustosDestinatario) {
        this.valorOutrosCustosDestinatario = valorOutrosCustosDestinatario;
        return this;
    }

    /**
     * Valor de outros custos do remetente&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorOutrosCustosRemetente
     **/
    @JsonProperty("valorOutrosCustosRemetente")
    public BigDecimal getValorOutrosCustosRemetente() {
        return valorOutrosCustosRemetente;
    }

    public void setValorOutrosCustosRemetente(BigDecimal valorOutrosCustosRemetente) {
        this.valorOutrosCustosRemetente = valorOutrosCustosRemetente;
    }

    public ManifestoCrt valorOutrosCustosRemetente(BigDecimal valorOutrosCustosRemetente) {
        this.valorOutrosCustosRemetente = valorOutrosCustosRemetente;
        return this;
    }

    /**
     * Valor do reembolso da mercadoria - contra entrega&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorReembolso
     **/
    @JsonProperty("valorReembolso")
    public BigDecimal getValorReembolso() {
        return valorReembolso;
    }

    public void setValorReembolso(BigDecimal valorReembolso) {
        this.valorReembolso = valorReembolso;
    }

    public ManifestoCrt valorReembolso(BigDecimal valorReembolso) {
        this.valorReembolso = valorReembolso;
        return this;
    }

    /**
     * Valor do seguro da mercadoria do destinatário&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorSeguroDestinatario
     **/
    @JsonProperty("valorSeguroDestinatario")
    public BigDecimal getValorSeguroDestinatario() {
        return valorSeguroDestinatario;
    }

    public void setValorSeguroDestinatario(BigDecimal valorSeguroDestinatario) {
        this.valorSeguroDestinatario = valorSeguroDestinatario;
    }

    public ManifestoCrt valorSeguroDestinatario(BigDecimal valorSeguroDestinatario) {
        this.valorSeguroDestinatario = valorSeguroDestinatario;
        return this;
    }

    /**
     * Valor do seguro da mercadoria do remetente&lt;br/&gt;Moeda informada deverá ser um código  na tabela de moedas (TABX)&lt;br/&gt;Formato: Número Racional com 12 casas inteiras e 2 casas decimais
     *
     * @return valorSeguroRemetente
     **/
    @JsonProperty("valorSeguroRemetente")
    public BigDecimal getValorSeguroRemetente() {
        return valorSeguroRemetente;
    }

    public void setValorSeguroRemetente(BigDecimal valorSeguroRemetente) {
        this.valorSeguroRemetente = valorSeguroRemetente;
    }

    public ManifestoCrt valorSeguroRemetente(BigDecimal valorSeguroRemetente) {
        this.valorSeguroRemetente = valorSeguroRemetente;
        return this;
    }

    /**
     * Indicador de que o depositário pode ver dados monetários no conhecimento.
     * @return visualizacaoDepositario
     **/
    @JsonProperty("visualizacaoDepositario")
    @NotNull
    public Boolean isisVisualizacaoDepositario() {
        return visualizacaoDepositario;
    }

    public void setVisualizacaoDepositario(Boolean visualizacaoDepositario) {
        this.visualizacaoDepositario = visualizacaoDepositario;
    }

    public ManifestoCrt visualizacaoDepositario(Boolean visualizacaoDepositario) {
        this.visualizacaoDepositario = visualizacaoDepositario;
        return this;
    }

    /**
     * Volume da carga em metros cúbicos&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return volumeM3
     **/
    @JsonProperty("volumeM3")
    public BigDecimal getVolumeM3() {
        return volumeM3;
    }

    public void setVolumeM3(BigDecimal volumeM3) {
        this.volumeM3 = volumeM3;
    }

    public ManifestoCrt volumeM3(BigDecimal volumeM3) {
        this.volumeM3 = volumeM3;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ManifestoCrt {\n" +
                "    bairroConsignatario: " + toIndentedString(bairroConsignatario) + "\n" +
                "    bairroDestinatario: " + toIndentedString(bairroDestinatario) + "\n" +
                "    bairroParteNotificarEstrangeiro: " + toIndentedString(bairroParteNotificarEstrangeiro) + "\n" +
                "    bairroRemetente: " + toIndentedString(bairroRemetente) + "\n" +
                "    cidadeConsignatario: " + toIndentedString(cidadeConsignatario) + "\n" +
                "    cidadeDestinatario: " + toIndentedString(cidadeDestinatario) + "\n" +
                "    cidadeEmissao: " + toIndentedString(cidadeEmissao) + "\n" +
                "    cidadeEntrega: " + toIndentedString(cidadeEntrega) + "\n" +
                "    cidadeParteNotificarEstrangeiro: " + toIndentedString(cidadeParteNotificarEstrangeiro) + "\n" +
                "    cidadeRemetente: " + toIndentedString(cidadeRemetente) + "\n" +
                "    cidadeTranspResponsMercadoria: " + toIndentedString(cidadeTranspResponsMercadoria) + "\n" +
                "    codigoPostalConsignatario: " + toIndentedString(codigoPostalConsignatario) + "\n" +
                "    codigoPostalDestinatario: " + toIndentedString(codigoPostalDestinatario) + "\n" +
                "    codigoPostalParteNotificarEstrangeiro: " + toIndentedString(codigoPostalParteNotificarEstrangeiro) + "\n" +
                "    codigoPostalRemetente: " + toIndentedString(codigoPostalRemetente) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    dataHoraAssinaturaDestinatario: " + toIndentedString(dataHoraAssinaturaDestinatario) + "\n" +
                "    dataHoraAssinaturaRemetente: " + toIndentedString(dataHoraAssinaturaRemetente) + "\n" +
                "    dataHoraTranspResponsMercadoria: " + toIndentedString(dataHoraTranspResponsMercadoria) + "\n" +
                "    declaracaoObservacao: " + toIndentedString(declaracaoObservacao) + "\n" +
                "    destinatarioNacBrasileira: " + toIndentedString(destinatarioNacBrasileira) + "\n" +
                "    documentosApresentados: " + toIndentedString(documentosApresentados) + "\n" +
                "    emailParteNotificar: " + toIndentedString(emailParteNotificar) + "\n" +
                "    estadoConsignatario: " + toIndentedString(estadoConsignatario) + "\n" +
                "    estadoDestinatario: " + toIndentedString(estadoDestinatario) + "\n" +
                "    estadoParteNotificarEstrangeiro: " + toIndentedString(estadoParteNotificarEstrangeiro) + "\n" +
                "    estadoRemetente: " + toIndentedString(estadoRemetente) + "\n" +
                "    idFiscalConsignatario: " + toIndentedString(idFiscalConsignatario) + "\n" +
                "    idFiscalDestinatario: " + toIndentedString(idFiscalDestinatario) + "\n" +
                "    idFiscalParteNotificar: " + toIndentedString(idFiscalParteNotificar) + "\n" +
                "    idFiscalRemetente: " + toIndentedString(idFiscalRemetente) + "\n" +
                "    identificacaoCrt: " + toIndentedString(identificacaoCrt) + "\n" +
                "    identificacaoRepresentanteTransportadorEstrangeiro: " + toIndentedString(identificacaoRepresentanteTransportadorEstrangeiro) + "\n" +
                "    identificacaoTransportadorEstrangeiro: " + toIndentedString(identificacaoTransportadorEstrangeiro) + "\n" +
                "    identificacaoTransportadorNacional: " + toIndentedString(identificacaoTransportadorNacional) + "\n" +
                "    inConsignatarioNacBrasileira: " + toIndentedString(inConsignatarioNacBrasileira) + "\n" +
                "    inParteNotificarNacBrasileira: " + toIndentedString(inParteNotificarNacBrasileira) + "\n" +
                "    incotermLocalEmbarque: " + toIndentedString(incotermLocalEmbarque) + "\n" +
                "    instrucaoFormalidadeAlfandega: " + toIndentedString(instrucaoFormalidadeAlfandega) + "\n" +
                "    itensCRT: " + toIndentedString(itensCRT) + "\n" +
                "    licencaComplementarTransportador: " + toIndentedString(licencaComplementarTransportador) + "\n" +
                "    licencaOriginariaTransportador: " + toIndentedString(licencaOriginariaTransportador) + "\n" +
                "    localAssinaturaDestinatario: " + toIndentedString(localAssinaturaDestinatario) + "\n" +
                "    localAssinaturaRemetente: " + toIndentedString(localAssinaturaRemetente) + "\n" +
                "    manuseiosEspeciaisCarga: " + toIndentedString(manuseiosEspeciaisCarga) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "    moedaFreteDestinatario: " + toIndentedString(moedaFreteDestinatario) + "\n" +
                "    moedaFreteExterno: " + toIndentedString(moedaFreteExterno) + "\n" +
                "    moedaFreteRemetente: " + toIndentedString(moedaFreteRemetente) + "\n" +
                "    moedaMercadoriaDeclaradoRemetente: " + toIndentedString(moedaMercadoriaDeclaradoRemetente) + "\n" +
                "    moedaMercadoriaLocalEmbarque: " + toIndentedString(moedaMercadoriaLocalEmbarque) + "\n" +
                "    moedaOutrosCustosDestinatario: " + toIndentedString(moedaOutrosCustosDestinatario) + "\n" +
                "    moedaOutrosCustosRemetente: " + toIndentedString(moedaOutrosCustosRemetente) + "\n" +
                "    moedaReembolso: " + toIndentedString(moedaReembolso) + "\n" +
                "    moedaSeguroDestinatario: " + toIndentedString(moedaSeguroDestinatario) + "\n" +
                "    moedaSeguroRemetente: " + toIndentedString(moedaSeguroRemetente) + "\n" +
                "    nomeAssinaturaDestinatario: " + toIndentedString(nomeAssinaturaDestinatario) + "\n" +
                "    nomeAssinaturaRemetente: " + toIndentedString(nomeAssinaturaRemetente) + "\n" +
                "    nomeAssinaturaTransportador: " + toIndentedString(nomeAssinaturaTransportador) + "\n" +
                "    nomeConsignatario: " + toIndentedString(nomeConsignatario) + "\n" +
                "    nomeDestinatario: " + toIndentedString(nomeDestinatario) + "\n" +
                "    nomeParteNotificarEstrangeiro: " + toIndentedString(nomeParteNotificarEstrangeiro) + "\n" +
                "    nomeRemetente: " + toIndentedString(nomeRemetente) + "\n" +
                "    nomeTransportadorEstrangeiro: " + toIndentedString(nomeTransportadorEstrangeiro) + "\n" +
                "    paisConsignatario: " + toIndentedString(paisConsignatario) + "\n" +
                "    paisDestinatario: " + toIndentedString(paisDestinatario) + "\n" +
                "    paisEmissao: " + toIndentedString(paisEmissao) + "\n" +
                "    paisEntrega: " + toIndentedString(paisEntrega) + "\n" +
                "    paisOrigemMercadoria: " + toIndentedString(paisOrigemMercadoria) + "\n" +
                "    paisParteNotificarEstrangeiro: " + toIndentedString(paisParteNotificarEstrangeiro) + "\n" +
                "    paisRemetente: " + toIndentedString(paisRemetente) + "\n" +
                "    paisTranspResponsMercadoria: " + toIndentedString(paisTranspResponsMercadoria) + "\n" +
                "    pesoBrutoKg: " + toIndentedString(pesoBrutoKg) + "\n" +
                "    prazoEntrega: " + toIndentedString(prazoEntrega) + "\n" +
                "    ruaConsignatario: " + toIndentedString(ruaConsignatario) + "\n" +
                "    ruaDestinatario: " + toIndentedString(ruaDestinatario) + "\n" +
                "    ruaParteNotificarEstrangeiro: " + toIndentedString(ruaParteNotificarEstrangeiro) + "\n" +
                "    ruaRemetente: " + toIndentedString(ruaRemetente) + "\n" +
                "    ruc: " + toIndentedString(ruc) + "\n" +
                "    telefoneParteNotificar: " + toIndentedString(telefoneParteNotificar) + "\n" +
                "    tipoDocIdFiscalConsignatario: " + toIndentedString(tipoDocIdFiscalConsignatario) + "\n" +
                "    tipoDocIdFiscalParteNotificar: " + toIndentedString(tipoDocIdFiscalParteNotificar) + "\n" +
                "    tipoItemCRT: " + toIndentedString(tipoItemCRT) + "\n" +
                "    tipoTransporteTransportador: " + toIndentedString(tipoTransporteTransportador) + "\n" +
                "    transportadorNacBrasileira: " + toIndentedString(transportadorNacBrasileira) + "\n" +
                "    transportadoresSucessivos: " + toIndentedString(transportadoresSucessivos) + "\n" +
                "    valorFreteDestinatario: " + toIndentedString(valorFreteDestinatario) + "\n" +
                "    valorFreteExterno: " + toIndentedString(valorFreteExterno) + "\n" +
                "    valorFreteRemetente: " + toIndentedString(valorFreteRemetente) + "\n" +
                "    valorMercadoriaDeclaradoRemetente: " + toIndentedString(valorMercadoriaDeclaradoRemetente) + "\n" +
                "    valorMercadoriaLocalEmbarque: " + toIndentedString(valorMercadoriaLocalEmbarque) + "\n" +
                "    valorOutrosCustosDestinatario: " + toIndentedString(valorOutrosCustosDestinatario) + "\n" +
                "    valorOutrosCustosRemetente: " + toIndentedString(valorOutrosCustosRemetente) + "\n" +
                "    valorReembolso: " + toIndentedString(valorReembolso) + "\n" +
                "    valorSeguroDestinatario: " + toIndentedString(valorSeguroDestinatario) + "\n" +
                "    valorSeguroRemetente: " + toIndentedString(valorSeguroRemetente) + "\n" +
                "    visualizacaoDepositario: " + toIndentedString(visualizacaoDepositario) + "\n" +
                "    volumeM3: " + toIndentedString(volumeM3) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "IncotermLocalEmbarqueEnum")
    @XmlEnum(String.class)
    public enum IncotermLocalEmbarqueEnum {

        @XmlEnumValue("FCA")
        @JsonProperty("FCA")
        FCA("FCA"),

        @XmlEnumValue("EXW")
        @JsonProperty("EXW")
        EXW("EXW");


        private final String value;

        IncotermLocalEmbarqueEnum(String v) {
            value = v;
        }

        public static IncotermLocalEmbarqueEnum fromValue(String v) {
            for (IncotermLocalEmbarqueEnum b : IncotermLocalEmbarqueEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IncotermLocalEmbarqueEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDocIdFiscalConsignatarioEnum")
    @XmlEnum(String.class)
    public enum TipoDocIdFiscalConsignatarioEnum {

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("J")
        @JsonProperty("J")
        J("J"),

        @XmlEnumValue("F")
        @JsonProperty("F")
        F("F"),

        @XmlEnumValue("O")
        @JsonProperty("O")
        O("O");


        private final String value;

        TipoDocIdFiscalConsignatarioEnum(String v) {
            value = v;
        }

        public static TipoDocIdFiscalConsignatarioEnum fromValue(String v) {
            for (TipoDocIdFiscalConsignatarioEnum b : TipoDocIdFiscalConsignatarioEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocIdFiscalConsignatarioEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDocIdFiscalParteNotificarEnum")
    @XmlEnum(String.class)
    public enum TipoDocIdFiscalParteNotificarEnum {

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("J")
        @JsonProperty("J")
        J("J"),

        @XmlEnumValue("F")
        @JsonProperty("F")
        F("F"),

        @XmlEnumValue("O")
        @JsonProperty("O")
        O("O");


        private final String value;

        TipoDocIdFiscalParteNotificarEnum(String v) {
            value = v;
        }

        public static TipoDocIdFiscalParteNotificarEnum fromValue(String v) {
            for (TipoDocIdFiscalParteNotificarEnum b : TipoDocIdFiscalParteNotificarEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocIdFiscalParteNotificarEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    @XmlType(name = "TipoItemCRTEnum")
    @XmlEnum(String.class)
    public enum TipoItemCRTEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2"),

        @XmlEnumValue("3")
        @JsonProperty("3")
        _3("3"),

        @XmlEnumValue("4")
        @JsonProperty("4")
        _4("4");


        private final String value;

        TipoItemCRTEnum(String v) {
            value = v;
        }

        public static TipoItemCRTEnum fromValue(String v) {
            for (TipoItemCRTEnum b : TipoItemCRTEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoItemCRTEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoTransporteTransportadorEnum")
    @XmlEnum(String.class)
    public enum TipoTransporteTransportadorEnum {

        @XmlEnumValue("REG")
        @JsonProperty("REG")
        REG("REG"),

        @XmlEnumValue("OCA")
        @JsonProperty("OCA")
        OCA("OCA"),

        @XmlEnumValue("PRO")
        @JsonProperty("PRO")
        PRO("PRO");


        private final String value;

        TipoTransporteTransportadorEnum(String v) {
            value = v;
        }

        public static TipoTransporteTransportadorEnum fromValue(String v) {
            for (TipoTransporteTransportadorEnum b : TipoTransporteTransportadorEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTransporteTransportadorEnum");
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
