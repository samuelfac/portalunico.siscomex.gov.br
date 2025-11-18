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
@XmlType(name = "ManifestoViagem", propOrder =
        {"acompanhantesCondutor", "alfandegaPartida", "anoFabricacaoVeiculo", "aplicacaoLacres", "apoliceSeguro", "bairroProprietarioVeiculoEstrangeiro", "bairroTransportadorEstrangeiro", "capacidadeTracaoVeiculo", "cavaloPropriaMercadoria", "chassiVeiculo", "cidadeDestinoFinal", "cidadePartida", "cidadeProprietarioVeiculoEstrangeiro", "cidadeTransportadorEstrangeiro", "codigoPostalProprietarioVeiculoEstrangeiro", "codigoPostalTransportadorEstrangeiro", "condutorBrasileiro", "conteineresVazios", "crts", "dataEmissao", "dataPrevistaDestinoFinal", "dataPrevistaEntrada", "dataVencimentoSeguro", "descricaoRotaInternacional", "estadoProprietarioVeiculoEstrangeiro", "estadoTransportadorEstrangeiro", "identificacaoProprietarioVeiculo", "identificacaoRepresentanteTransportadorEstrangeiro", "identificacaoTransportadorEstrangeiro", "identificacaoTransportadorNacional", "lacresVeiculo", "licencaComplementarProprietario", "licencaComplementarTransportador", "licencaOriginariaProprietario", "licencaOriginariaTransportador", "localAssinaturaTransportador", "marcaVeiculo", "nomeAssinaturaTransportador", "nomeCondutorVeiculoEstrangeiro", "nomeProprietarioVeiculoEstrangeiro", "nomeTransportadorEstrangeiro", "numeroDTAExterior", "numeroDocumentoCondutorVeiculo", "numeroDocumentoTransporte", "observacoesGerais", "observacoesVeiculo", "paisDestinoFinal", "paisPartida", "paisProprietarioVeiculoEstrangeiro", "paisTransportadorEstrangeiro", "placaCavalo", "possuiEmbalagemSuporteMadeiraBruta", "proprietarioVeiculoBrasileiro", "reboques", "recintoEntrada", "ruaProprietarioVeiculoEstrangeiro", "ruaTransportadorEstrangeiro", "taraCavalo", "tipoDocumentoCondutorVeiculo", "tipoDocumentoTransporte", "tipoNumeroDocumentoViagem", "tipoTransporte", "tipoTratamentoMadeiraBruta", "tipoVeiculo", "transitoInternacional", "transportadorImportador", "transportadorNacBrasileira", "transportadorProprietarioVeiculo", "ulEntrada", "visualizacaoDepositario"
        })

@XmlRootElement(name = "ManifestoViagem")
public class ManifestoViagem {

    @XmlElement(name = "acompanhantesCondutor")
    @ApiModelProperty(value = "")
    @Valid
    private List<AcompanhanteCondutor> acompanhantesCondutor = null;

    @XmlElement(name = "alfandegaPartida")
    @ApiModelProperty(example = "7911104", value = "Código da aduana de partida<br/> Tamanho Máximo: 7")
    /**
     * Código da aduana de partida<br/> Tamanho Máximo: 7
     **/
    private String alfandegaPartida = null;

    @XmlElement(name = "anoFabricacaoVeiculo", required = true)
    @ApiModelProperty(example = "2010", required = true, value = "Ano de fabricação do veículo da viagem<br/> Tamanho: 4<br/> Formato: inteiro de 4 dígitos")
    /**
     * Ano de fabricação do veículo da viagem<br/> Tamanho: 4<br/> Formato: inteiro de 4 dígitos
     **/
    private String anoFabricacaoVeiculo = null;
    @XmlElement(name = "apoliceSeguro", required = true)
    @ApiModelProperty(example = "APOLICE123", required = true, value = "Apólice de seguro<br/> Tamanho Máximo: 20")
    /**
     * Apólice de seguro<br/> Tamanho Máximo: 20
     **/
    private String apoliceSeguro = null;

    @XmlElement(name = "aplicacaoLacres", required = true)
    @ApiModelProperty(example = "VEIC", required = true, value = "Indica se o lacre será aplicado no container da carga (CONT), no próprio veículo (VEIC) ou dispensada (DISP)")
    /**
     * Indica se o lacre será aplicado no container da carga (CONT), no próprio veículo (VEIC) ou dispensada (DISP)
     **/
    private AplicacaoLacresEnum aplicacaoLacres = null;
    @XmlElement(name = "bairroProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "Nome do bairro", value = "Bairro do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Bairro do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50
     **/
    private String bairroProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "bairroTransportadorEstrangeiro")
    @ApiModelProperty(example = "Nome do bairro", value = "Bairro do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Bairro do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50
     **/
    private String bairroTransportadorEstrangeiro = null;
    @XmlElement(name = "capacidadeTracaoVeiculo", required = true)
    @ApiModelProperty(required = true, value = "Capacidade de tração do veículo em toneladas<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Capacidade de tração do veículo em toneladas<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal capacidadeTracaoVeiculo = null;
    @XmlElement(name = "chassiVeiculo", required = true)
    @ApiModelProperty(example = "2WXR0U5O8S8SRRB8P", required = true, value = "Chassi do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Chassi do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String chassiVeiculo = null;

    @XmlElement(name = "cavaloPropriaMercadoria", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indica se o cavalo é a própria mercadoria")
    /**
     * Indica se o cavalo é a própria mercadoria
     **/
    private Boolean cavaloPropriaMercadoria = null;
    @XmlElement(name = "cidadePartida", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "Cidade de partida da viagem<br/> Formato: AAAAA")
    /**
     * Cidade de partida da viagem<br/> Formato: AAAAA
     **/
    private String cidadePartida = null;

    @XmlElement(name = "cidadeDestinoFinal", required = true)
    @ApiModelProperty(example = "BRRIO", required = true, value = "Cidade de destino final da viagem<br/> Formato: AAAAA")
    /**
     * Cidade de destino final da viagem<br/> Formato: AAAAA
     **/
    private String cidadeDestinoFinal = null;
    @XmlElement(name = "cidadeTransportadorEstrangeiro")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Cidade do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50
     **/
    private String cidadeTransportadorEstrangeiro = null;

    @XmlElement(name = "cidadeProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "Rio de Janeiro", value = "Cidade do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Cidade do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50
     **/
    private String cidadeProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "codigoPostalProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "01001000", value = "Código postal do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 8")
    /**
     * Código postal do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "codigoPostalTransportadorEstrangeiro")
    @ApiModelProperty(example = "01001000", value = "Código postal do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 8")
    /**
     * Código postal do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 8
     **/
    private String codigoPostalTransportadorEstrangeiro = null;
    @XmlElement(name = "condutorBrasileiro", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o condutor do veículo da viagem é de nacionalidade brasileira")
    /**
     * Indicador que informa se o condutor do veículo da viagem é de nacionalidade brasileira
     **/
    private Boolean condutorBrasileiro = null;
    @XmlElement(name = "conteineresVazios")
    @ApiModelProperty(value = "")
    @Valid
    private List<ConteinerVazio> conteineresVazios = null;
    @XmlElement(name = "crts")
    @ApiModelProperty(value = "")
    @Valid
    private List<CrtViagem> crts = null;
    @XmlElement(name = "dataEmissao", required = true)
    @ApiModelProperty(example = "2020-08-07", required = true, value = "Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd")
    /**
     * Data de emissão do documento de transporte<br/>Formato: yyyy-MM-dd
     **/
    private String dataEmissao = null;
    @XmlElement(name = "dataPrevistaDestinoFinal")
    @ApiModelProperty(example = "2020-08-07", value = "Data prevista de chegada do veículo na cidade de destino final viagem<br/>Formato: yyyy-MM-dd")
    /**
     * Data prevista de chegada do veículo na cidade de destino final viagem<br/>Formato: yyyy-MM-dd
     **/
    private String dataPrevistaDestinoFinal = null;
    @XmlElement(name = "dataPrevistaEntrada")
    @ApiModelProperty(example = "2020-08-07", value = "Data prevista de chegada do veículo na Aduana de entrada no Brasil<br/>Formato: yyyy-MM-dd")
    /**
     * Data prevista de chegada do veículo na Aduana de entrada no Brasil<br/>Formato: yyyy-MM-dd
     **/
    private String dataPrevistaEntrada = null;
    @XmlElement(name = "dataVencimentoSeguro", required = true)
    @ApiModelProperty(example = "2020-08-07", required = true, value = "Data de vencimento do seguro<br/>Formato: yyyy-MM-dd")
    /**
     * Data de vencimento do seguro<br/>Formato: yyyy-MM-dd
     **/
    private String dataVencimentoSeguro = null;
    @XmlElement(name = "descricaoRotaInternacional", required = true)
    @ApiModelProperty(example = "Descrição da rota internacional", required = true, value = "Descrição da rota internacional desde local de partida até a cidade de destino final<br/> Tamanho Máximo: 500")
    /**
     * Descrição da rota internacional desde local de partida até a cidade de destino final<br/> Tamanho Máximo: 500
     **/
    private String descricaoRotaInternacional = null;
    @XmlElement(name = "estadoProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "RJ", value = "Estado ou província do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Estado ou província do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 50
     **/
    private String estadoProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "estadoTransportadorEstrangeiro")
    @ApiModelProperty(example = "RJ", value = "Estado ou província do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Estado ou província do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 50
     **/
    private String estadoTransportadorEstrangeiro = null;
    @XmlElement(name = "identificacaoProprietarioVeiculo", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Identificação fiscal do proprietário do veículo da viagem<br/>Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.<br/> Tamanho: 14")
    /**
     * Identificação fiscal do proprietário do veículo da viagem<br/>Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.<br/> Tamanho: 14
     **/
    private String identificacaoProprietarioVeiculo = null;
    @XmlElement(name = "identificacaoTransportadorEstrangeiro")
    @ApiModelProperty(example = "00000000000191", value = "Número de identificação do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho: 14")
    /**
     * Número de identificação do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho: 14
     **/
    private String identificacaoTransportadorEstrangeiro = null;

    @XmlElement(name = "identificacaoRepresentanteTransportadorEstrangeiro")
    @ApiModelProperty(value = "CPF/CNPJ do representante do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14")
    /**
     * CPF/CNPJ do representante do transportador estrangeiro<br/>Se campo transportadorNacBrasileira  igual a \"false\" ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. <br/>O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ<br/> Tamanho: 14
     **/
    private String identificacaoRepresentanteTransportadorEstrangeiro = null;
    @XmlElement(name = "identificacaoTransportadorNacional")
    @ApiModelProperty(example = "00000000000191", value = "CNPJ do transportador nacional<br/> Se transportadorNacBrasileira é true, este campo é de preenchimento obrigatório e válido no cadastro de CNPJ<br/> Tamanho: 14")
    /**
     * CNPJ do transportador nacional<br/> Se transportadorNacBrasileira é true, este campo é de preenchimento obrigatório e válido no cadastro de CNPJ<br/> Tamanho: 14
     **/
    private String identificacaoTransportadorNacional = null;
    @XmlElement(name = "lacresVeiculo")
    @ApiModelProperty(value = "")
    @Valid
    private List<Lacre> lacresVeiculo = null;
    @XmlElement(name = "licencaComplementarTransportador")
    @ApiModelProperty(example = "123424", value = "Licença complementar<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.<br/> Tamanho Máximo: 6")
    /**
     * Licença complementar<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.<br/> Tamanho Máximo: 6
     **/
    private String licencaComplementarTransportador = null;

    @XmlElement(name = "licencaComplementarProprietario")
    @ApiModelProperty(example = "123424", value = "Licença complementar do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6")
    /**
     * Licença complementar do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6
     **/
    private String licencaComplementarProprietario = null;
    @XmlElement(name = "licencaOriginariaTransportador")
    @ApiModelProperty(example = "123424", value = "Licença originária<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é true.<br/> Tamanho Máximo: 6")
    /**
     * Licença originária<br/>campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é true.<br/> Tamanho Máximo: 6
     **/
    private String licencaOriginariaTransportador = null;

    @XmlElement(name = "licencaOriginariaProprietario")
    @ApiModelProperty(example = "123424", value = "Licença originária do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6")
    /**
     * Licença originária do proprietário do veículo<br/>campo obrigatório se tipoTransporte é REG ou OCA.<br/> Tamanho Máximo: 6
     **/
    private String licencaOriginariaProprietario = null;
    @XmlElement(name = "localAssinaturaTransportador", required = true)
    @ApiModelProperty(required = true, value = "Local de assinatura do transportador<br/> Tamanho Máximo: 35")
    /**
     * Local de assinatura do transportador<br/> Tamanho Máximo: 35
     **/
    private String localAssinaturaTransportador = null;
    @XmlElement(name = "marcaVeiculo", required = true)
    @ApiModelProperty(example = "VW", required = true, value = "Marca do veículo da viagem<br/> Tamanho Máximo: 20")
    /**
     * Marca do veículo da viagem<br/> Tamanho Máximo: 20
     **/
    private String marcaVeiculo = null;
    @XmlElement(name = "nomeAssinaturaTransportador", required = true)
    @ApiModelProperty(required = true, value = "Nome do transportador que assinou o documento<br/> Tamanho Máximo: 35")
    /**
     * Nome do transportador que assinou o documento<br/> Tamanho Máximo: 35
     **/
    private String nomeAssinaturaTransportador = null;
    @XmlElement(name = "nomeCondutorVeiculoEstrangeiro")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do condutor estrangeiro do veículo</br>Obrigatorio se condutor do veículo for estrangeiro (\"condutorBrasileiro\" = false)<br/> Tamanho Máximo: 50")
    /**
     * Nome do condutor estrangeiro do veículo</br>Obrigatorio se condutor do veículo for estrangeiro (\"condutorBrasileiro\" = false)<br/> Tamanho Máximo: 50
     **/
    private String nomeCondutorVeiculoEstrangeiro = null;
    @XmlElement(name = "nomeProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do proprietário estrangeiro do veículo </br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 60")
    /**
     * Nome do proprietário estrangeiro do veículo </br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 60
     **/
    private String nomeProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "nomeTransportadorEstrangeiro")
    @ApiModelProperty(example = "Nome e Sobrenome", value = "Nome do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150")
    /**
     * Nome do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150
     **/
    private String nomeTransportadorEstrangeiro = null;
    @XmlElement(name = "numeroDTAExterior")
    @ApiModelProperty(example = "15656489854988", value = "Número da declaração de trânsito no exterior, quando ocorrer<br/> Tamanho Máximo: 20")
    /**
     * Número da declaração de trânsito no exterior, quando ocorrer<br/> Tamanho Máximo: 20
     **/
    private String numeroDTAExterior = null;
    @XmlElement(name = "numeroDocumentoCondutorVeiculo", required = true)
    @ApiModelProperty(example = "12345678901", required = true, value = "Número do documento do condutor do veículo (relacionado ao Tipo do documento informado no campo anterior)<br/> Tamanho Máximo: 20")
    /**
     * Número do documento do condutor do veículo (relacionado ao Tipo do documento informado no campo anterior)<br/> Tamanho Máximo: 20
     **/
    private String numeroDocumentoCondutorVeiculo = null;
    @XmlElement(name = "numeroDocumentoTransporte", required = true)
    @ApiModelProperty(example = "AR123040104", required = true, value = "Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15")
    /**
     * Número do documento de transporte.<br/>Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.<br/> Tamanho Máximo: 15
     **/
    private String numeroDocumentoTransporte = null;
    @XmlElement(name = "observacoesGerais")
    @ApiModelProperty(example = "Observações gerais.", value = "Observações gerais da viagem<br/> Tamanho Máximo: 500")
    /**
     * Observações gerais da viagem<br/> Tamanho Máximo: 500
     **/
    private String observacoesGerais = null;
    @XmlElement(name = "observacoesVeiculo")
    @ApiModelProperty(example = "Observações adicionais.", value = "Observações adicionais a serem reportadas sobre o veículo<br/> Tamanho Máximo: 200")
    /**
     * Observações adicionais a serem reportadas sobre o veículo<br/> Tamanho Máximo: 200
     **/
    private String observacoesVeiculo = null;
    @XmlElement(name = "paisPartida", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "País de partida da viagem<br/> Se tipoDocumentoTransporte é DTAI, o país preenchido deverá ser Venezuela.<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * País de partida da viagem<br/> Se tipoDocumentoTransporte é DTAI, o país preenchido deverá ser Venezuela.<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisPartida = null;

    @XmlElement(name = "paisDestinoFinal", required = true)
    @ApiModelProperty(example = "BR", required = true, value = "País de destino final da viagem<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * País de destino final da viagem<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisDestinoFinal = null;
    @XmlElement(name = "paisProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "BR", value = "País do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * País do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisProprietarioVeiculoEstrangeiro = null;
    @XmlElement(name = "placaCavalo", required = true)
    @ApiModelProperty(example = "CAV3456", required = true, value = "Placa do cavalo <br/>Obrigatória apenas se o cavalo não for a própria mercadoria.<br/> Tamanho Máximo: 20")
    /**
     * Placa do cavalo <br/>Obrigatória apenas se o cavalo não for a própria mercadoria.<br/> Tamanho Máximo: 20
     **/
    private String placaCavalo = null;

    @XmlElement(name = "paisTransportadorEstrangeiro")
    @ApiModelProperty(example = "BR", value = "Pais do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA")
    /**
     * Pais do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/>Pais informado deve existir na tabela de países ISO3166 - ALFA2<br/> Formato: AA
     **/
    private String paisTransportadorEstrangeiro = null;
    @XmlElement(name = "possuiEmbalagemSuporteMadeiraBruta", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indica se o veículo está transportando itens em embalagem/suporte de madeira ")
    /**
     * Indica se o veículo está transportando itens em embalagem/suporte de madeira
     **/
    private Boolean possuiEmbalagemSuporteMadeiraBruta = null;
    @XmlElement(name = "proprietarioVeiculoBrasileiro", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)")
    /**
     * Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)
     **/
    private Boolean proprietarioVeiculoBrasileiro = null;
    @XmlElement(name = "reboques")
    @ApiModelProperty(value = "")
    @Valid
    private List<Reboque> reboques = null;
    @XmlElement(name = "ruaProprietarioVeiculoEstrangeiro")
    @ApiModelProperty(example = "Nome da rua", value = "Rua do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 150")
    /**
     * Rua do endereço do proprietário estrangeiro do veículo</br>Obrigatorio se proprietário do veículo for estrangeiro (\"proprietárioVeiculoBrasileiro\" = false)<br/> Tamanho Máximo: 150
     **/
    private String ruaProprietarioVeiculoEstrangeiro = null;

    @XmlElement(name = "recintoEntrada", required = true)
    @ApiModelProperty(example = "8911101", required = true, value = "Local de entrada na fronteira (Recinto alfandegado)<br/> Tamanho Máximo: 7")
    /**
     * Local de entrada na fronteira (Recinto alfandegado)<br/> Tamanho Máximo: 7
     **/
    private String recintoEntrada = null;
    @XmlElement(name = "ruaTransportadorEstrangeiro")
    @ApiModelProperty(example = "Nome da rua", value = "Rua do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150")
    /**
     * Rua do endereço do transportador estrangeiro</br>Obrigatorio se transportador for estrangeiro (\"transportadorNacBrasileira\" = false)<br/> Tamanho Máximo: 150
     **/
    private String ruaTransportadorEstrangeiro = null;
    @XmlElement(name = "tipoDocumentoCondutorVeiculo", required = true)
    @ApiModelProperty(example = "F", required = true, value = "Tipo do documento do condutor do veículo.<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)<br/>Se condutorBrasileiro é true (condutor brasieliro), é obrigatório o preenchimento do valor \"F\" ou \"H\".<br/>Se condutorBrasileiro é false (condutor estrangeiro), o tipo pode ser 'P' ou 'O'")
    /**
     * Tipo do documento do condutor do veículo.<br/> \"F\" (CPF), \"J\" (CNPJ),\"P\" (passaporte), \"O\" (outros)<br/>Se condutorBrasileiro é true (condutor brasieliro), é obrigatório o preenchimento do valor \"F\" ou \"H\".<br/>Se condutorBrasileiro é false (condutor estrangeiro), o tipo pode ser 'P' ou 'O'
     **/
    private TipoDocumentoCondutorVeiculoEnum tipoDocumentoCondutorVeiculo = null;

    @XmlElement(name = "taraCavalo")
    @ApiModelProperty(example = "105.478", value = "Tara do cavalo<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais")
    @Valid
    /**
     * Tara do cavalo<br/>Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     **/
    private BigDecimal taraCavalo = null;
    @XmlElement(name = "tipoDocumentoTransporte", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo de documento de transporte<br/>Deve ser MIC/DTA(1) se paisPartida for ATIT, DTAI(3) se paisPartida for Venezuela <br/>ou \"Outros\"(4) se paisPartida for qualquer outro país.")
    /**
     * Tipo de documento de transporte<br/>Deve ser MIC/DTA(1) se paisPartida for ATIT, DTAI(3) se paisPartida for Venezuela <br/>ou \"Outros\"(4) se paisPartida for qualquer outro país.
     **/
    private TipoDocumentoTransporteEnum tipoDocumentoTransporte = null;
    @XmlElement(name = "tipoNumeroDocumentoViagem", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Tipo de numero de documento de viagem<br/>Deve ser ATIT(1) ou RUT(2).")
    /**
     * Tipo de numero de documento de viagem<br/>Deve ser ATIT(1) ou RUT(2).
     **/
    private TipoNumeroDocumentoViagemEnum tipoNumeroDocumentoViagem = null;
    @XmlElement(name = "tipoTransporte", required = true)
    @ApiModelProperty(example = "REG", required = true, value = "Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)")
    /**
     * Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)
     **/
    private TipoTransporteEnum tipoTransporte = null;
    @XmlElement(name = "tipoTratamentoMadeiraBruta")
    @ApiModelProperty(example = "2", value = "Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;")
    /**
     * Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;
     **/
    private TipoTratamentoMadeiraBrutaEnum tipoTratamentoMadeiraBruta = null;
    @XmlElement(name = "tipoVeiculo", required = true)
    @ApiModelProperty(example = "TRU", required = true, value = "Tipo do veículo, ou seja, se é Truck (TRU)  ou Cavalo com 1 (C1R), 2 (C2R) ou 3 (C3R) reboques.")
    /**
     * Tipo do veículo, ou seja, se é Truck (TRU)  ou Cavalo com 1 (C1R), 2 (C2R) ou 3 (C3R) reboques.
     **/
    private TipoVeiculoEnum tipoVeiculo = null;
    @XmlElement(name = "transportadorImportador", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o transportador é o importador")
    /**
     * Indicador que informa se o transportador é o importador
     **/
    private Boolean transportadorImportador = null;
    @XmlElement(name = "transportadorNacBrasileira", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)")
    /**
     * Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)
     **/
    private Boolean transportadorNacBrasileira = null;
    @XmlElement(name = "transportadorProprietarioVeiculo", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o transportador é o proprietário do veículo")
    /**
     * Indicador que informa se o transportador é o proprietário do veículo
     **/
    private Boolean transportadorProprietarioVeiculo = null;
    @XmlElement(name = "ulEntrada", required = true)
    @ApiModelProperty(example = "0817600", required = true, value = "Local de entrada na fronteira (Unidade da Receita Federal)<br/> Tamanho Máximo: 7")
    /**
     * Local de entrada na fronteira (Unidade da Receita Federal)<br/> Tamanho Máximo: 7
     **/
    private String ulEntrada = null;
    @XmlElement(name = "visualizacaoDepositario", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.")
    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     **/
    private Boolean visualizacaoDepositario = null;

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
    @XmlElement(name = "transitoInternacional", required = true)
    @ApiModelProperty(example = "true", required = true, value = "Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)")
    /**
     * Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)
     **/
    private Boolean transitoInternacional = null;

    /**
     * Get acompanhantesCondutor
     *
     * @return acompanhantesCondutor
     **/
    @JsonProperty("acompanhantesCondutor")
    public List<AcompanhanteCondutor> getAcompanhantesCondutor() {
        return acompanhantesCondutor;
    }

    public void setAcompanhantesCondutor(List<AcompanhanteCondutor> acompanhantesCondutor) {
        this.acompanhantesCondutor = acompanhantesCondutor;
    }

    public ManifestoViagem acompanhantesCondutor(List<AcompanhanteCondutor> acompanhantesCondutor) {
        this.acompanhantesCondutor = acompanhantesCondutor;
        return this;
    }

    public ManifestoViagem addAcompanhantesCondutorItem(AcompanhanteCondutor acompanhantesCondutorItem) {
        this.acompanhantesCondutor.add(acompanhantesCondutorItem);
        return this;
    }

    /**
     * Código da aduana de partida&lt;br/&gt; Tamanho Máximo: 7
     *
     * @return alfandegaPartida
     **/
    @JsonProperty("alfandegaPartida")
    public String getAlfandegaPartida() {
        return alfandegaPartida;
    }

    public void setAlfandegaPartida(String alfandegaPartida) {
        this.alfandegaPartida = alfandegaPartida;
    }

    public ManifestoViagem alfandegaPartida(String alfandegaPartida) {
        this.alfandegaPartida = alfandegaPartida;
        return this;
    }

    /**
     * Ano de fabricação do veículo da viagem&lt;br/&gt; Tamanho: 4&lt;br/&gt; Formato: inteiro de 4 dígitos
     *
     * @return anoFabricacaoVeiculo
     **/
    @JsonProperty("anoFabricacaoVeiculo")
    @NotNull
    public String getAnoFabricacaoVeiculo() {
        return anoFabricacaoVeiculo;
    }

    public void setAnoFabricacaoVeiculo(String anoFabricacaoVeiculo) {
        this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
    }

    public ManifestoViagem anoFabricacaoVeiculo(String anoFabricacaoVeiculo) {
        this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
        return this;
    }

    /**
     * Apólice de seguro&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return apoliceSeguro
     **/
    @JsonProperty("apoliceSeguro")
    @NotNull
    public String getApoliceSeguro() {
        return apoliceSeguro;
    }

    public void setApoliceSeguro(String apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
    }

    public ManifestoViagem apoliceSeguro(String apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
        return this;
    }

    /**
     * Bairro do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("bairroProprietarioVeiculoEstrangeiro")
    public String getBairroProprietarioVeiculoEstrangeiro() {
        return bairroProprietarioVeiculoEstrangeiro;
    }

    public void setBairroProprietarioVeiculoEstrangeiro(String bairroProprietarioVeiculoEstrangeiro) {
        this.bairroProprietarioVeiculoEstrangeiro = bairroProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem bairroProprietarioVeiculoEstrangeiro(String bairroProprietarioVeiculoEstrangeiro) {
        this.bairroProprietarioVeiculoEstrangeiro = bairroProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Indica se o lacre será aplicado no container da carga (CONT), no próprio veículo (VEIC) ou dispensada (DISP)
     *
     * @return aplicacaoLacres
     **/
    @JsonProperty("aplicacaoLacres")
    @NotNull
    public String getAplicacaoLacres() {
        if (aplicacaoLacres == null) {
            return null;
        }
        return aplicacaoLacres.value();
    }

    public void setAplicacaoLacres(AplicacaoLacresEnum aplicacaoLacres) {
        this.aplicacaoLacres = aplicacaoLacres;
    }

    public ManifestoViagem aplicacaoLacres(AplicacaoLacresEnum aplicacaoLacres) {
        this.aplicacaoLacres = aplicacaoLacres;
        return this;
    }

    /**
     * Bairro do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return bairroTransportadorEstrangeiro
     **/
    @JsonProperty("bairroTransportadorEstrangeiro")
    public String getBairroTransportadorEstrangeiro() {
        return bairroTransportadorEstrangeiro;
    }

    public void setBairroTransportadorEstrangeiro(String bairroTransportadorEstrangeiro) {
        this.bairroTransportadorEstrangeiro = bairroTransportadorEstrangeiro;
    }

    public ManifestoViagem bairroTransportadorEstrangeiro(String bairroTransportadorEstrangeiro) {
        this.bairroTransportadorEstrangeiro = bairroTransportadorEstrangeiro;
        return this;
    }

    /**
     * Capacidade de tração do veículo em toneladas&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return capacidadeTracaoVeiculo
     **/
    @JsonProperty("capacidadeTracaoVeiculo")
    @NotNull
    public BigDecimal getCapacidadeTracaoVeiculo() {
        return capacidadeTracaoVeiculo;
    }

    public void setCapacidadeTracaoVeiculo(BigDecimal capacidadeTracaoVeiculo) {
        this.capacidadeTracaoVeiculo = capacidadeTracaoVeiculo;
    }

    public ManifestoViagem capacidadeTracaoVeiculo(BigDecimal capacidadeTracaoVeiculo) {
        this.capacidadeTracaoVeiculo = capacidadeTracaoVeiculo;
        return this;
    }

    /**
     * Chassi do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return chassiVeiculo
     **/
    @JsonProperty("chassiVeiculo")
    @NotNull
    public String getChassiVeiculo() {
        return chassiVeiculo;
    }

    public void setChassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
    }

    public ManifestoViagem chassiVeiculo(String chassiVeiculo) {
        this.chassiVeiculo = chassiVeiculo;
        return this;
    }

    /**
     * Cidade de partida da viagem&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadePartida
     **/
    @JsonProperty("cidadePartida")
    @NotNull
    public String getCidadePartida() {
        return cidadePartida;
    }

    public void setCidadePartida(String cidadePartida) {
        this.cidadePartida = cidadePartida;
    }

    public ManifestoViagem cidadePartida(String cidadePartida) {
        this.cidadePartida = cidadePartida;
        return this;
    }

    /**
     * Indica se o cavalo é a própria mercadoria
     *
     * @return cavaloPropriaMercadoria
     **/
    @JsonProperty("cavaloPropriaMercadoria")
    @NotNull
    public Boolean isisCavaloPropriaMercadoria() {
        return cavaloPropriaMercadoria;
    }

    public void setCavaloPropriaMercadoria(Boolean cavaloPropriaMercadoria) {
        this.cavaloPropriaMercadoria = cavaloPropriaMercadoria;
    }

    public ManifestoViagem cavaloPropriaMercadoria(Boolean cavaloPropriaMercadoria) {
        this.cavaloPropriaMercadoria = cavaloPropriaMercadoria;
        return this;
    }

    /**
     * Cidade do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return cidadeTransportadorEstrangeiro
     **/
    @JsonProperty("cidadeTransportadorEstrangeiro")
    public String getCidadeTransportadorEstrangeiro() {
        return cidadeTransportadorEstrangeiro;
    }

    public void setCidadeTransportadorEstrangeiro(String cidadeTransportadorEstrangeiro) {
        this.cidadeTransportadorEstrangeiro = cidadeTransportadorEstrangeiro;
    }

    public ManifestoViagem cidadeTransportadorEstrangeiro(String cidadeTransportadorEstrangeiro) {
        this.cidadeTransportadorEstrangeiro = cidadeTransportadorEstrangeiro;
        return this;
    }

    /**
     * Cidade de destino final da viagem&lt;br/&gt; Formato: AAAAA
     *
     * @return cidadeDestinoFinal
     **/
    @JsonProperty("cidadeDestinoFinal")
    @NotNull
    public String getCidadeDestinoFinal() {
        return cidadeDestinoFinal;
    }

    public void setCidadeDestinoFinal(String cidadeDestinoFinal) {
        this.cidadeDestinoFinal = cidadeDestinoFinal;
    }

    public ManifestoViagem cidadeDestinoFinal(String cidadeDestinoFinal) {
        this.cidadeDestinoFinal = cidadeDestinoFinal;
        return this;
    }

    /**
     * Código postal do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 8
     *
     * @return codigoPostalProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("codigoPostalProprietarioVeiculoEstrangeiro")
    public String getCodigoPostalProprietarioVeiculoEstrangeiro() {
        return codigoPostalProprietarioVeiculoEstrangeiro;
    }

    public void setCodigoPostalProprietarioVeiculoEstrangeiro(String codigoPostalProprietarioVeiculoEstrangeiro) {
        this.codigoPostalProprietarioVeiculoEstrangeiro = codigoPostalProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem codigoPostalProprietarioVeiculoEstrangeiro(String codigoPostalProprietarioVeiculoEstrangeiro) {
        this.codigoPostalProprietarioVeiculoEstrangeiro = codigoPostalProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Cidade do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return cidadeProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("cidadeProprietarioVeiculoEstrangeiro")
    public String getCidadeProprietarioVeiculoEstrangeiro() {
        return cidadeProprietarioVeiculoEstrangeiro;
    }

    public void setCidadeProprietarioVeiculoEstrangeiro(String cidadeProprietarioVeiculoEstrangeiro) {
        this.cidadeProprietarioVeiculoEstrangeiro = cidadeProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem cidadeProprietarioVeiculoEstrangeiro(String cidadeProprietarioVeiculoEstrangeiro) {
        this.cidadeProprietarioVeiculoEstrangeiro = cidadeProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Código postal do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 8
     *
     * @return codigoPostalTransportadorEstrangeiro
     **/
    @JsonProperty("codigoPostalTransportadorEstrangeiro")
    public String getCodigoPostalTransportadorEstrangeiro() {
        return codigoPostalTransportadorEstrangeiro;
    }

    public void setCodigoPostalTransportadorEstrangeiro(String codigoPostalTransportadorEstrangeiro) {
        this.codigoPostalTransportadorEstrangeiro = codigoPostalTransportadorEstrangeiro;
    }

    public ManifestoViagem codigoPostalTransportadorEstrangeiro(String codigoPostalTransportadorEstrangeiro) {
        this.codigoPostalTransportadorEstrangeiro = codigoPostalTransportadorEstrangeiro;
        return this;
    }

    /**
     * Indicador que informa se o condutor do veículo da viagem é de nacionalidade brasileira
     *
     * @return condutorBrasileiro
     **/
    @JsonProperty("condutorBrasileiro")
    @NotNull
    public Boolean isisCondutorBrasileiro() {
        return condutorBrasileiro;
    }

    public void setCondutorBrasileiro(Boolean condutorBrasileiro) {
        this.condutorBrasileiro = condutorBrasileiro;
    }

    public ManifestoViagem condutorBrasileiro(Boolean condutorBrasileiro) {
        this.condutorBrasileiro = condutorBrasileiro;
        return this;
    }

    /**
     * Get conteineresVazios
     *
     * @return conteineresVazios
     **/
    @JsonProperty("conteineresVazios")
    public List<ConteinerVazio> getConteineresVazios() {
        return conteineresVazios;
    }

    public void setConteineresVazios(List<ConteinerVazio> conteineresVazios) {
        this.conteineresVazios = conteineresVazios;
    }

    public ManifestoViagem conteineresVazios(List<ConteinerVazio> conteineresVazios) {
        this.conteineresVazios = conteineresVazios;
        return this;
    }

    public ManifestoViagem addConteineresVaziosItem(ConteinerVazio conteineresVaziosItem) {
        this.conteineresVazios.add(conteineresVaziosItem);
        return this;
    }

    /**
     * Get crts
     *
     * @return crts
     **/
    @JsonProperty("crts")
    public List<CrtViagem> getCrts() {
        return crts;
    }

    public void setCrts(List<CrtViagem> crts) {
        this.crts = crts;
    }

    public ManifestoViagem crts(List<CrtViagem> crts) {
        this.crts = crts;
        return this;
    }

    public ManifestoViagem addCrtsItem(CrtViagem crtsItem) {
        this.crts.add(crtsItem);
        return this;
    }

    /**
     * Data de emissão do documento de transporte&lt;br/&gt;Formato: yyyy-MM-dd
     *
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

    public ManifestoViagem dataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    /**
     * Data prevista de chegada do veículo na cidade de destino final viagem&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataPrevistaDestinoFinal
     **/
    @JsonProperty("dataPrevistaDestinoFinal")
    public String getDataPrevistaDestinoFinal() {
        return dataPrevistaDestinoFinal;
    }

    public void setDataPrevistaDestinoFinal(String dataPrevistaDestinoFinal) {
        this.dataPrevistaDestinoFinal = dataPrevistaDestinoFinal;
    }

    public ManifestoViagem dataPrevistaDestinoFinal(String dataPrevistaDestinoFinal) {
        this.dataPrevistaDestinoFinal = dataPrevistaDestinoFinal;
        return this;
    }

    /**
     * Data prevista de chegada do veículo na Aduana de entrada no Brasil&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataPrevistaEntrada
     **/
    @JsonProperty("dataPrevistaEntrada")
    public String getDataPrevistaEntrada() {
        return dataPrevistaEntrada;
    }

    public void setDataPrevistaEntrada(String dataPrevistaEntrada) {
        this.dataPrevistaEntrada = dataPrevistaEntrada;
    }

    public ManifestoViagem dataPrevistaEntrada(String dataPrevistaEntrada) {
        this.dataPrevistaEntrada = dataPrevistaEntrada;
        return this;
    }

    /**
     * Data de vencimento do seguro&lt;br/&gt;Formato: yyyy-MM-dd
     *
     * @return dataVencimentoSeguro
     **/
    @JsonProperty("dataVencimentoSeguro")
    @NotNull
    public String getDataVencimentoSeguro() {
        return dataVencimentoSeguro;
    }

    public void setDataVencimentoSeguro(String dataVencimentoSeguro) {
        this.dataVencimentoSeguro = dataVencimentoSeguro;
    }

    public ManifestoViagem dataVencimentoSeguro(String dataVencimentoSeguro) {
        this.dataVencimentoSeguro = dataVencimentoSeguro;
        return this;
    }

    /**
     * Descrição da rota internacional desde local de partida até a cidade de destino final&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return descricaoRotaInternacional
     **/
    @JsonProperty("descricaoRotaInternacional")
    @NotNull
    public String getDescricaoRotaInternacional() {
        return descricaoRotaInternacional;
    }

    public void setDescricaoRotaInternacional(String descricaoRotaInternacional) {
        this.descricaoRotaInternacional = descricaoRotaInternacional;
    }

    public ManifestoViagem descricaoRotaInternacional(String descricaoRotaInternacional) {
        this.descricaoRotaInternacional = descricaoRotaInternacional;
        return this;
    }

    /**
     * Estado ou província do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("estadoProprietarioVeiculoEstrangeiro")
    public String getEstadoProprietarioVeiculoEstrangeiro() {
        return estadoProprietarioVeiculoEstrangeiro;
    }

    public void setEstadoProprietarioVeiculoEstrangeiro(String estadoProprietarioVeiculoEstrangeiro) {
        this.estadoProprietarioVeiculoEstrangeiro = estadoProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem estadoProprietarioVeiculoEstrangeiro(String estadoProprietarioVeiculoEstrangeiro) {
        this.estadoProprietarioVeiculoEstrangeiro = estadoProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Estado ou província do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return estadoTransportadorEstrangeiro
     **/
    @JsonProperty("estadoTransportadorEstrangeiro")
    public String getEstadoTransportadorEstrangeiro() {
        return estadoTransportadorEstrangeiro;
    }

    public void setEstadoTransportadorEstrangeiro(String estadoTransportadorEstrangeiro) {
        this.estadoTransportadorEstrangeiro = estadoTransportadorEstrangeiro;
    }

    public ManifestoViagem estadoTransportadorEstrangeiro(String estadoTransportadorEstrangeiro) {
        this.estadoTransportadorEstrangeiro = estadoTransportadorEstrangeiro;
        return this;
    }

    /**
     * Identificação fiscal do proprietário do veículo da viagem&lt;br/&gt;Se proprietarioVeiculoBrasileiro é S, o CPF ou CNPJ preenchido neste campo será validado na tabela de CPF ou CNPJ.&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoProprietarioVeiculo
     **/
    @JsonProperty("identificacaoProprietarioVeiculo")
    @NotNull
    public String getIdentificacaoProprietarioVeiculo() {
        return identificacaoProprietarioVeiculo;
    }

    public void setIdentificacaoProprietarioVeiculo(String identificacaoProprietarioVeiculo) {
        this.identificacaoProprietarioVeiculo = identificacaoProprietarioVeiculo;
    }

    public ManifestoViagem identificacaoProprietarioVeiculo(String identificacaoProprietarioVeiculo) {
        this.identificacaoProprietarioVeiculo = identificacaoProprietarioVeiculo;
        return this;
    }

    /**
     * Número de identificação do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho: 14
     *
     * @return identificacaoTransportadorEstrangeiro
     **/
    @JsonProperty("identificacaoTransportadorEstrangeiro")
    public String getIdentificacaoTransportadorEstrangeiro() {
        return identificacaoTransportadorEstrangeiro;
    }

    public void setIdentificacaoTransportadorEstrangeiro(String identificacaoTransportadorEstrangeiro) {
        this.identificacaoTransportadorEstrangeiro = identificacaoTransportadorEstrangeiro;
    }

    public ManifestoViagem identificacaoTransportadorEstrangeiro(String identificacaoTransportadorEstrangeiro) {
        this.identificacaoTransportadorEstrangeiro = identificacaoTransportadorEstrangeiro;
        return this;
    }

    /**
     * CNPJ do transportador nacional&lt;br/&gt; Se transportadorNacBrasileira é true, este campo é de preenchimento obrigatório e válido no cadastro de CNPJ&lt;br/&gt; Tamanho: 14
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

    public ManifestoViagem identificacaoTransportadorNacional(String identificacaoTransportadorNacional) {
        this.identificacaoTransportadorNacional = identificacaoTransportadorNacional;
        return this;
    }

    /**
     * CPF/CNPJ do representante do transportador estrangeiro&lt;br/&gt;Se campo transportadorNacBrasileira  igual a \&quot;false\&quot; ( Transportador estrangeiro) é obrigatório o preenchimento desse campo. &lt;br/&gt;O CPF/CNPJ deve estar ativo no cadastro de CPF/CNPJ&lt;br/&gt; Tamanho: 14
     * @return identificacaoRepresentanteTransportadorEstrangeiro
     **/
    @JsonProperty("identificacaoRepresentanteTransportadorEstrangeiro")
    public String getIdentificacaoRepresentanteTransportadorEstrangeiro() {
        return identificacaoRepresentanteTransportadorEstrangeiro;
    }

    public void setIdentificacaoRepresentanteTransportadorEstrangeiro(String identificacaoRepresentanteTransportadorEstrangeiro) {
        this.identificacaoRepresentanteTransportadorEstrangeiro = identificacaoRepresentanteTransportadorEstrangeiro;
    }

    public ManifestoViagem identificacaoRepresentanteTransportadorEstrangeiro(String identificacaoRepresentanteTransportadorEstrangeiro) {
        this.identificacaoRepresentanteTransportadorEstrangeiro = identificacaoRepresentanteTransportadorEstrangeiro;
        return this;
    }

    /**
     * Get lacresVeiculo
     *
     * @return lacresVeiculo
     **/
    @JsonProperty("lacresVeiculo")
    public List<Lacre> getLacresVeiculo() {
        return lacresVeiculo;
    }

    public void setLacresVeiculo(List<Lacre> lacresVeiculo) {
        this.lacresVeiculo = lacresVeiculo;
    }

    public ManifestoViagem lacresVeiculo(List<Lacre> lacresVeiculo) {
        this.lacresVeiculo = lacresVeiculo;
        return this;
    }

    public ManifestoViagem addLacresVeiculoItem(Lacre lacresVeiculoItem) {
        this.lacresVeiculo.add(lacresVeiculoItem);
        return this;
    }

    /**
     * Licença complementar&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é false.&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return licencaComplementarTransportador
     **/
    @JsonProperty("licencaComplementarTransportador")
    public String getLicencaComplementarTransportador() {
        return licencaComplementarTransportador;
    }

    public void setLicencaComplementarTransportador(String licencaComplementarTransportador) {
        this.licencaComplementarTransportador = licencaComplementarTransportador;
    }

    public ManifestoViagem licencaComplementarTransportador(String licencaComplementarTransportador) {
        this.licencaComplementarTransportador = licencaComplementarTransportador;
        return this;
    }

    /**
     * Licença originária&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA e transportadorNacBrasileira é true.&lt;br/&gt; Tamanho Máximo: 6
     *
     * @return licencaOriginariaTransportador
     **/
    @JsonProperty("licencaOriginariaTransportador")
    public String getLicencaOriginariaTransportador() {
        return licencaOriginariaTransportador;
    }

    public void setLicencaOriginariaTransportador(String licencaOriginariaTransportador) {
        this.licencaOriginariaTransportador = licencaOriginariaTransportador;
    }

    public ManifestoViagem licencaOriginariaTransportador(String licencaOriginariaTransportador) {
        this.licencaOriginariaTransportador = licencaOriginariaTransportador;
        return this;
    }

    /**
     * Licença complementar do proprietário do veículo&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA.&lt;br/&gt; Tamanho Máximo: 6
     * @return licencaComplementarProprietario
     **/
    @JsonProperty("licencaComplementarProprietario")
    public String getLicencaComplementarProprietario() {
        return licencaComplementarProprietario;
    }

    public void setLicencaComplementarProprietario(String licencaComplementarProprietario) {
        this.licencaComplementarProprietario = licencaComplementarProprietario;
    }

    public ManifestoViagem licencaComplementarProprietario(String licencaComplementarProprietario) {
        this.licencaComplementarProprietario = licencaComplementarProprietario;
        return this;
    }

    /**
     * Local de assinatura do transportador&lt;br/&gt; Tamanho Máximo: 35
     * @return localAssinaturaTransportador
     **/
    @JsonProperty("localAssinaturaTransportador")
    @NotNull
    public String getLocalAssinaturaTransportador() {
        return localAssinaturaTransportador;
    }

    public void setLocalAssinaturaTransportador(String localAssinaturaTransportador) {
        this.localAssinaturaTransportador = localAssinaturaTransportador;
    }

    public ManifestoViagem localAssinaturaTransportador(String localAssinaturaTransportador) {
        this.localAssinaturaTransportador = localAssinaturaTransportador;
        return this;
    }

    /**
     * Licença originária do proprietário do veículo&lt;br/&gt;campo obrigatório se tipoTransporte é REG ou OCA.&lt;br/&gt; Tamanho Máximo: 6
     * @return licencaOriginariaProprietario
     **/
    @JsonProperty("licencaOriginariaProprietario")
    public String getLicencaOriginariaProprietario() {
        return licencaOriginariaProprietario;
    }

    public void setLicencaOriginariaProprietario(String licencaOriginariaProprietario) {
        this.licencaOriginariaProprietario = licencaOriginariaProprietario;
    }

    public ManifestoViagem licencaOriginariaProprietario(String licencaOriginariaProprietario) {
        this.licencaOriginariaProprietario = licencaOriginariaProprietario;
        return this;
    }

    /**
     * Marca do veículo da viagem&lt;br/&gt; Tamanho Máximo: 20
     * @return marcaVeiculo
     **/
    @JsonProperty("marcaVeiculo")
    @NotNull
    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public ManifestoViagem marcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
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

    public ManifestoViagem nomeAssinaturaTransportador(String nomeAssinaturaTransportador) {
        this.nomeAssinaturaTransportador = nomeAssinaturaTransportador;
        return this;
    }

    /**
     * Nome do condutor estrangeiro do veículo&lt;/br&gt;Obrigatorio se condutor do veículo for estrangeiro (\&quot;condutorBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 50
     *
     * @return nomeCondutorVeiculoEstrangeiro
     **/
    @JsonProperty("nomeCondutorVeiculoEstrangeiro")
    public String getNomeCondutorVeiculoEstrangeiro() {
        return nomeCondutorVeiculoEstrangeiro;
    }

    public void setNomeCondutorVeiculoEstrangeiro(String nomeCondutorVeiculoEstrangeiro) {
        this.nomeCondutorVeiculoEstrangeiro = nomeCondutorVeiculoEstrangeiro;
    }

    public ManifestoViagem nomeCondutorVeiculoEstrangeiro(String nomeCondutorVeiculoEstrangeiro) {
        this.nomeCondutorVeiculoEstrangeiro = nomeCondutorVeiculoEstrangeiro;
        return this;
    }

    /**
     * Nome do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 150
     *
     * @return nomeTransportadorEstrangeiro
     **/
    @JsonProperty("nomeTransportadorEstrangeiro")
    public String getNomeTransportadorEstrangeiro() {
        return nomeTransportadorEstrangeiro;
    }

    public void setNomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
    }

    public ManifestoViagem nomeTransportadorEstrangeiro(String nomeTransportadorEstrangeiro) {
        this.nomeTransportadorEstrangeiro = nomeTransportadorEstrangeiro;
        return this;
    }

    /**
     * Número da declaração de trânsito no exterior, quando ocorrer&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return numeroDTAExterior
     **/
    @JsonProperty("numeroDTAExterior")
    public String getNumeroDTAExterior() {
        return numeroDTAExterior;
    }

    public void setNumeroDTAExterior(String numeroDTAExterior) {
        this.numeroDTAExterior = numeroDTAExterior;
    }

    public ManifestoViagem numeroDTAExterior(String numeroDTAExterior) {
        this.numeroDTAExterior = numeroDTAExterior;
        return this;
    }

    /**
     * Nome do proprietário estrangeiro do veículo &lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 60
     * @return nomeProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("nomeProprietarioVeiculoEstrangeiro")
    public String getNomeProprietarioVeiculoEstrangeiro() {
        return nomeProprietarioVeiculoEstrangeiro;
    }

    public void setNomeProprietarioVeiculoEstrangeiro(String nomeProprietarioVeiculoEstrangeiro) {
        this.nomeProprietarioVeiculoEstrangeiro = nomeProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem nomeProprietarioVeiculoEstrangeiro(String nomeProprietarioVeiculoEstrangeiro) {
        this.nomeProprietarioVeiculoEstrangeiro = nomeProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Número do documento do condutor do veículo (relacionado ao Tipo do documento informado no campo anterior)&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return numeroDocumentoCondutorVeiculo
     **/
    @JsonProperty("numeroDocumentoCondutorVeiculo")
    @NotNull
    public String getNumeroDocumentoCondutorVeiculo() {
        return numeroDocumentoCondutorVeiculo;
    }

    public void setNumeroDocumentoCondutorVeiculo(String numeroDocumentoCondutorVeiculo) {
        this.numeroDocumentoCondutorVeiculo = numeroDocumentoCondutorVeiculo;
    }

    public ManifestoViagem numeroDocumentoCondutorVeiculo(String numeroDocumentoCondutorVeiculo) {
        this.numeroDocumentoCondutorVeiculo = numeroDocumentoCondutorVeiculo;
        return this;
    }

    /**
     * Observações gerais da viagem&lt;br/&gt; Tamanho Máximo: 500
     *
     * @return observacoesGerais
     **/
    @JsonProperty("observacoesGerais")
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    public void setObservacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
    }

    public ManifestoViagem observacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
        return this;
    }

    /**
     * Observações adicionais a serem reportadas sobre o veículo&lt;br/&gt; Tamanho Máximo: 200
     *
     * @return observacoesVeiculo
     **/
    @JsonProperty("observacoesVeiculo")
    public String getObservacoesVeiculo() {
        return observacoesVeiculo;
    }

    public void setObservacoesVeiculo(String observacoesVeiculo) {
        this.observacoesVeiculo = observacoesVeiculo;
    }

    public ManifestoViagem observacoesVeiculo(String observacoesVeiculo) {
        this.observacoesVeiculo = observacoesVeiculo;
        return this;
    }

    /**
     * Número do documento de transporte.&lt;br/&gt;Não pode haver outro documento de transporte com a mesma chave tipoDocumentoTransporte, numeroDocumentoTransporte e dataEmissao.&lt;br/&gt; Tamanho Máximo: 15
     * @return numeroDocumentoTransporte
     **/
    @JsonProperty("numeroDocumentoTransporte")
    @NotNull
    public String getNumeroDocumentoTransporte() {
        return numeroDocumentoTransporte;
    }

    public void setNumeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
    }

    public ManifestoViagem numeroDocumentoTransporte(String numeroDocumentoTransporte) {
        this.numeroDocumentoTransporte = numeroDocumentoTransporte;
        return this;
    }

    /**
     * País de destino final da viagem&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisDestinoFinal
     **/
    @JsonProperty("paisDestinoFinal")
    @NotNull
    public String getPaisDestinoFinal() {
        return paisDestinoFinal;
    }

    public void setPaisDestinoFinal(String paisDestinoFinal) {
        this.paisDestinoFinal = paisDestinoFinal;
    }

    public ManifestoViagem paisDestinoFinal(String paisDestinoFinal) {
        this.paisDestinoFinal = paisDestinoFinal;
        return this;
    }

    /**
     * País de partida da viagem&lt;br/&gt; Se tipoDocumentoTransporte é DTAI, o país preenchido deverá ser Venezuela.&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisPartida
     **/
    @JsonProperty("paisPartida")
    @NotNull
    public String getPaisPartida() {
        return paisPartida;
    }

    public void setPaisPartida(String paisPartida) {
        this.paisPartida = paisPartida;
    }

    public ManifestoViagem paisPartida(String paisPartida) {
        this.paisPartida = paisPartida;
        return this;
    }

    /**
     * País do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     *
     * @return paisProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("paisProprietarioVeiculoEstrangeiro")
    public String getPaisProprietarioVeiculoEstrangeiro() {
        return paisProprietarioVeiculoEstrangeiro;
    }

    public void setPaisProprietarioVeiculoEstrangeiro(String paisProprietarioVeiculoEstrangeiro) {
        this.paisProprietarioVeiculoEstrangeiro = paisProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem paisProprietarioVeiculoEstrangeiro(String paisProprietarioVeiculoEstrangeiro) {
        this.paisProprietarioVeiculoEstrangeiro = paisProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Pais do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt;Pais informado deve existir na tabela de países ISO3166 - ALFA2&lt;br/&gt; Formato: AA
     * @return paisTransportadorEstrangeiro
     **/
    @JsonProperty("paisTransportadorEstrangeiro")
    public String getPaisTransportadorEstrangeiro() {
        return paisTransportadorEstrangeiro;
    }

    public void setPaisTransportadorEstrangeiro(String paisTransportadorEstrangeiro) {
        this.paisTransportadorEstrangeiro = paisTransportadorEstrangeiro;
    }

    public ManifestoViagem paisTransportadorEstrangeiro(String paisTransportadorEstrangeiro) {
        this.paisTransportadorEstrangeiro = paisTransportadorEstrangeiro;
        return this;
    }

    /**
     * Placa do cavalo &lt;br/&gt;Obrigatória apenas se o cavalo não for a própria mercadoria.&lt;br/&gt; Tamanho Máximo: 20
     *
     * @return placaCavalo
     **/
    @JsonProperty("placaCavalo")
    @NotNull
    public String getPlacaCavalo() {
        return placaCavalo;
    }

    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public ManifestoViagem placaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
        return this;
    }

    /**
     * Indica se o veículo está transportando itens em embalagem/suporte de madeira
     *
     * @return possuiEmbalagemSuporteMadeiraBruta
     **/
    @JsonProperty("possuiEmbalagemSuporteMadeiraBruta")
    @NotNull
    public Boolean isisPossuiEmbalagemSuporteMadeiraBruta() {
        return possuiEmbalagemSuporteMadeiraBruta;
    }

    public void setPossuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
    }

    public ManifestoViagem possuiEmbalagemSuporteMadeiraBruta(Boolean possuiEmbalagemSuporteMadeiraBruta) {
        this.possuiEmbalagemSuporteMadeiraBruta = possuiEmbalagemSuporteMadeiraBruta;
        return this;
    }

    /**
     * Indicador que informa se o proprietário do veículo da viagem é de nacionalidade brasileira (true/false)
     *
     * @return proprietarioVeiculoBrasileiro
     **/
    @JsonProperty("proprietarioVeiculoBrasileiro")
    @NotNull
    public Boolean isisProprietarioVeiculoBrasileiro() {
        return proprietarioVeiculoBrasileiro;
    }

    public void setProprietarioVeiculoBrasileiro(Boolean proprietarioVeiculoBrasileiro) {
        this.proprietarioVeiculoBrasileiro = proprietarioVeiculoBrasileiro;
    }

    public ManifestoViagem proprietarioVeiculoBrasileiro(Boolean proprietarioVeiculoBrasileiro) {
        this.proprietarioVeiculoBrasileiro = proprietarioVeiculoBrasileiro;
        return this;
    }

    /**
     * Get reboques
     *
     * @return reboques
     **/
    @JsonProperty("reboques")
    public List<Reboque> getReboques() {
        return reboques;
    }

    public void setReboques(List<Reboque> reboques) {
        this.reboques = reboques;
    }

    public ManifestoViagem reboques(List<Reboque> reboques) {
        this.reboques = reboques;
        return this;
    }

    public ManifestoViagem addReboquesItem(Reboque reboquesItem) {
        this.reboques.add(reboquesItem);
        return this;
    }

    /**
     * Rua do endereço do proprietário estrangeiro do veículo&lt;/br&gt;Obrigatorio se proprietário do veículo for estrangeiro (\&quot;proprietárioVeiculoBrasileiro\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 150
     * @return ruaProprietarioVeiculoEstrangeiro
     **/
    @JsonProperty("ruaProprietarioVeiculoEstrangeiro")
    public String getRuaProprietarioVeiculoEstrangeiro() {
        return ruaProprietarioVeiculoEstrangeiro;
    }

    public void setRuaProprietarioVeiculoEstrangeiro(String ruaProprietarioVeiculoEstrangeiro) {
        this.ruaProprietarioVeiculoEstrangeiro = ruaProprietarioVeiculoEstrangeiro;
    }

    public ManifestoViagem ruaProprietarioVeiculoEstrangeiro(String ruaProprietarioVeiculoEstrangeiro) {
        this.ruaProprietarioVeiculoEstrangeiro = ruaProprietarioVeiculoEstrangeiro;
        return this;
    }

    /**
     * Rua do endereço do transportador estrangeiro&lt;/br&gt;Obrigatorio se transportador for estrangeiro (\&quot;transportadorNacBrasileira\&quot; &#x3D; false)&lt;br/&gt; Tamanho Máximo: 150
     * @return ruaTransportadorEstrangeiro
     **/
    @JsonProperty("ruaTransportadorEstrangeiro")
    public String getRuaTransportadorEstrangeiro() {
        return ruaTransportadorEstrangeiro;
    }

    public void setRuaTransportadorEstrangeiro(String ruaTransportadorEstrangeiro) {
        this.ruaTransportadorEstrangeiro = ruaTransportadorEstrangeiro;
    }

    public ManifestoViagem ruaTransportadorEstrangeiro(String ruaTransportadorEstrangeiro) {
        this.ruaTransportadorEstrangeiro = ruaTransportadorEstrangeiro;
        return this;
    }

    /**
     * Local de entrada na fronteira (Recinto alfandegado)&lt;br/&gt; Tamanho Máximo: 7
     *
     * @return recintoEntrada
     **/
    @JsonProperty("recintoEntrada")
    @NotNull
    public String getRecintoEntrada() {
        return recintoEntrada;
    }

    public void setRecintoEntrada(String recintoEntrada) {
        this.recintoEntrada = recintoEntrada;
    }

    public ManifestoViagem recintoEntrada(String recintoEntrada) {
        this.recintoEntrada = recintoEntrada;
        return this;
    }

    /**
     * Tipo do documento do condutor do veículo.&lt;br/&gt; \&quot;F\&quot; (CPF), \&quot;J\&quot; (CNPJ),\&quot;P\&quot; (passaporte), \&quot;O\&quot; (outros)&lt;br/&gt;Se condutorBrasileiro é true (condutor brasieliro), é obrigatório o preenchimento do valor \&quot;F\&quot; ou \&quot;H\&quot;.&lt;br/&gt;Se condutorBrasileiro é false (condutor estrangeiro), o tipo pode ser &#39;P&#39; ou &#39;O&#39;
     *
     * @return tipoDocumentoCondutorVeiculo
     **/
    @JsonProperty("tipoDocumentoCondutorVeiculo")
    @NotNull
    public String getTipoDocumentoCondutorVeiculo() {
        if (tipoDocumentoCondutorVeiculo == null) {
            return null;
        }
        return tipoDocumentoCondutorVeiculo.value();
    }

    public void setTipoDocumentoCondutorVeiculo(TipoDocumentoCondutorVeiculoEnum tipoDocumentoCondutorVeiculo) {
        this.tipoDocumentoCondutorVeiculo = tipoDocumentoCondutorVeiculo;
    }

    public ManifestoViagem tipoDocumentoCondutorVeiculo(TipoDocumentoCondutorVeiculoEnum tipoDocumentoCondutorVeiculo) {
        this.tipoDocumentoCondutorVeiculo = tipoDocumentoCondutorVeiculo;
        return this;
    }

    /**
     * Tipo de documento de transporte&lt;br/&gt;Deve ser MIC/DTA(1) se paisPartida for ATIT, DTAI(3) se paisPartida for Venezuela &lt;br/&gt;ou \&quot;Outros\&quot;(4) se paisPartida for qualquer outro país.
     * @return tipoDocumentoTransporte
     **/
    @JsonProperty("tipoDocumentoTransporte")
    @NotNull
    public String getTipoDocumentoTransporte() {
        if (tipoDocumentoTransporte == null) {
            return null;
        }
        return tipoDocumentoTransporte.value();
    }

    public void setTipoDocumentoTransporte(TipoDocumentoTransporteEnum tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
    }

    public ManifestoViagem tipoDocumentoTransporte(TipoDocumentoTransporteEnum tipoDocumentoTransporte) {
        this.tipoDocumentoTransporte = tipoDocumentoTransporte;
        return this;
    }

    /**
     * Tara do cavalo&lt;br/&gt;Formato: Número Racional com 9 casas inteiras e 3 casas decimais
     *
     * @return taraCavalo
     **/
    @JsonProperty("taraCavalo")
    public BigDecimal getTaraCavalo() {
        return taraCavalo;
    }

    public void setTaraCavalo(BigDecimal taraCavalo) {
        this.taraCavalo = taraCavalo;
    }

    public ManifestoViagem taraCavalo(BigDecimal taraCavalo) {
        this.taraCavalo = taraCavalo;
        return this;
    }

    /**
     * Tipo de numero de documento de viagem&lt;br/&gt;Deve ser ATIT(1) ou RUT(2).
     * @return tipoNumeroDocumentoViagem
     **/
    @JsonProperty("tipoNumeroDocumentoViagem")
    @NotNull
    public String getTipoNumeroDocumentoViagem() {
        if (tipoNumeroDocumentoViagem == null) {
            return null;
        }
        return tipoNumeroDocumentoViagem.value();
    }

    public void setTipoNumeroDocumentoViagem(TipoNumeroDocumentoViagemEnum tipoNumeroDocumentoViagem) {
        this.tipoNumeroDocumentoViagem = tipoNumeroDocumentoViagem;
    }

    public ManifestoViagem tipoNumeroDocumentoViagem(TipoNumeroDocumentoViagemEnum tipoNumeroDocumentoViagem) {
        this.tipoNumeroDocumentoViagem = tipoNumeroDocumentoViagem;
        return this;
    }

    /**
     * Indicador do tipo de transporte que pode ser regular(REG), próprio(PRO) ou ocasional(OCA)
     *
     * @return tipoTransporte
     **/
    @JsonProperty("tipoTransporte")
    @NotNull
    public String getTipoTransporte() {
        if (tipoTransporte == null) {
            return null;
        }
        return tipoTransporte.value();
    }

    public void setTipoTransporte(TipoTransporteEnum tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public ManifestoViagem tipoTransporte(TipoTransporteEnum tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        return this;
    }

    /**
     * Tipo de tratamento para madeira bruta (Obrigatório quando houver indicação de embalagem/suporte de madeira bruta). 1: Madeira processada; 2: Madeira tratada e certificada; e 3: Não tratada e não certificada;
     * @return tipoTratamentoMadeiraBruta
     **/
    @JsonProperty("tipoTratamentoMadeiraBruta")
    public String getTipoTratamentoMadeiraBruta() {
        if (tipoTratamentoMadeiraBruta == null) {
            return null;
        }
        return tipoTratamentoMadeiraBruta.value();
    }

    public void setTipoTratamentoMadeiraBruta(TipoTratamentoMadeiraBrutaEnum tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
    }

    public ManifestoViagem tipoTratamentoMadeiraBruta(TipoTratamentoMadeiraBrutaEnum tipoTratamentoMadeiraBruta) {
        this.tipoTratamentoMadeiraBruta = tipoTratamentoMadeiraBruta;
        return this;
    }

    /**
     * Tipo do veículo, ou seja, se é Truck (TRU)  ou Cavalo com 1 (C1R), 2 (C2R) ou 3 (C3R) reboques.
     *
     * @return tipoVeiculo
     **/
    @JsonProperty("tipoVeiculo")
    @NotNull
    public String getTipoVeiculo() {
        if (tipoVeiculo == null) {
            return null;
        }
        return tipoVeiculo.value();
    }

    public void setTipoVeiculo(TipoVeiculoEnum tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public ManifestoViagem tipoVeiculo(TipoVeiculoEnum tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
        return this;
    }

    /**
     * Indicador que informa se o transportador é o importador
     *
     * @return transportadorImportador
     **/
    @JsonProperty("transportadorImportador")
    @NotNull
    public Boolean isisTransportadorImportador() {
        return transportadorImportador;
    }

    public void setTransportadorImportador(Boolean transportadorImportador) {
        this.transportadorImportador = transportadorImportador;
    }

    public ManifestoViagem transportadorImportador(Boolean transportadorImportador) {
        this.transportadorImportador = transportadorImportador;
        return this;
    }

    /**
     * Indicador que informa se o transportador é nacional (true) ou estrangeiro (false)
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

    public ManifestoViagem transportadorNacBrasileira(Boolean transportadorNacBrasileira) {
        this.transportadorNacBrasileira = transportadorNacBrasileira;
        return this;
    }

    /**
     * Indicador que informa se é trânsito aduaneiro internacional, ou seja, se haverá desembaraço na fronteira (false) ou seguirá por trânsito (true)
     *
     * @return transitoInternacional
     **/
    @JsonProperty("transitoInternacional")
    @NotNull
    public Boolean isisTransitoInternacional() {
        return transitoInternacional;
    }

    public void setTransitoInternacional(Boolean transitoInternacional) {
        this.transitoInternacional = transitoInternacional;
    }

    public ManifestoViagem transitoInternacional(Boolean transitoInternacional) {
        this.transitoInternacional = transitoInternacional;
        return this;
    }

    /**
     * Indicador que informa se o transportador é o proprietário do veículo
     * @return transportadorProprietarioVeiculo
     **/
    @JsonProperty("transportadorProprietarioVeiculo")
    @NotNull
    public Boolean isisTransportadorProprietarioVeiculo() {
        return transportadorProprietarioVeiculo;
    }

    public void setTransportadorProprietarioVeiculo(Boolean transportadorProprietarioVeiculo) {
        this.transportadorProprietarioVeiculo = transportadorProprietarioVeiculo;
    }

    public ManifestoViagem transportadorProprietarioVeiculo(Boolean transportadorProprietarioVeiculo) {
        this.transportadorProprietarioVeiculo = transportadorProprietarioVeiculo;
        return this;
    }

    /**
     * Local de entrada na fronteira (Unidade da Receita Federal)&lt;br/&gt; Tamanho Máximo: 7
     * @return ulEntrada
     **/
    @JsonProperty("ulEntrada")
    @NotNull
    public String getUlEntrada() {
        return ulEntrada;
    }

    public void setUlEntrada(String ulEntrada) {
        this.ulEntrada = ulEntrada;
    }

    public ManifestoViagem ulEntrada(String ulEntrada) {
        this.ulEntrada = ulEntrada;
        return this;
    }

    /**
     * Indicador que informa se o depositário pode visualizar os dados de valor do frete, valor FCA e seguro informados nos CRTs da viagem.
     *
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

    public ManifestoViagem visualizacaoDepositario(Boolean visualizacaoDepositario) {
        this.visualizacaoDepositario = visualizacaoDepositario;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ManifestoViagem {\n" +
                "    acompanhantesCondutor: " + toIndentedString(acompanhantesCondutor) + "\n" +
                "    alfandegaPartida: " + toIndentedString(alfandegaPartida) + "\n" +
                "    anoFabricacaoVeiculo: " + toIndentedString(anoFabricacaoVeiculo) + "\n" +
                "    aplicacaoLacres: " + toIndentedString(aplicacaoLacres) + "\n" +
                "    apoliceSeguro: " + toIndentedString(apoliceSeguro) + "\n" +
                "    bairroProprietarioVeiculoEstrangeiro: " + toIndentedString(bairroProprietarioVeiculoEstrangeiro) + "\n" +
                "    bairroTransportadorEstrangeiro: " + toIndentedString(bairroTransportadorEstrangeiro) + "\n" +
                "    capacidadeTracaoVeiculo: " + toIndentedString(capacidadeTracaoVeiculo) + "\n" +
                "    cavaloPropriaMercadoria: " + toIndentedString(cavaloPropriaMercadoria) + "\n" +
                "    chassiVeiculo: " + toIndentedString(chassiVeiculo) + "\n" +
                "    cidadeDestinoFinal: " + toIndentedString(cidadeDestinoFinal) + "\n" +
                "    cidadePartida: " + toIndentedString(cidadePartida) + "\n" +
                "    cidadeProprietarioVeiculoEstrangeiro: " + toIndentedString(cidadeProprietarioVeiculoEstrangeiro) + "\n" +
                "    cidadeTransportadorEstrangeiro: " + toIndentedString(cidadeTransportadorEstrangeiro) + "\n" +
                "    codigoPostalProprietarioVeiculoEstrangeiro: " + toIndentedString(codigoPostalProprietarioVeiculoEstrangeiro) + "\n" +
                "    codigoPostalTransportadorEstrangeiro: " + toIndentedString(codigoPostalTransportadorEstrangeiro) + "\n" +
                "    condutorBrasileiro: " + toIndentedString(condutorBrasileiro) + "\n" +
                "    conteineresVazios: " + toIndentedString(conteineresVazios) + "\n" +
                "    crts: " + toIndentedString(crts) + "\n" +
                "    dataEmissao: " + toIndentedString(dataEmissao) + "\n" +
                "    dataPrevistaDestinoFinal: " + toIndentedString(dataPrevistaDestinoFinal) + "\n" +
                "    dataPrevistaEntrada: " + toIndentedString(dataPrevistaEntrada) + "\n" +
                "    dataVencimentoSeguro: " + toIndentedString(dataVencimentoSeguro) + "\n" +
                "    descricaoRotaInternacional: " + toIndentedString(descricaoRotaInternacional) + "\n" +
                "    estadoProprietarioVeiculoEstrangeiro: " + toIndentedString(estadoProprietarioVeiculoEstrangeiro) + "\n" +
                "    estadoTransportadorEstrangeiro: " + toIndentedString(estadoTransportadorEstrangeiro) + "\n" +
                "    identificacaoProprietarioVeiculo: " + toIndentedString(identificacaoProprietarioVeiculo) + "\n" +
                "    identificacaoRepresentanteTransportadorEstrangeiro: " + toIndentedString(identificacaoRepresentanteTransportadorEstrangeiro) + "\n" +
                "    identificacaoTransportadorEstrangeiro: " + toIndentedString(identificacaoTransportadorEstrangeiro) + "\n" +
                "    identificacaoTransportadorNacional: " + toIndentedString(identificacaoTransportadorNacional) + "\n" +
                "    lacresVeiculo: " + toIndentedString(lacresVeiculo) + "\n" +
                "    licencaComplementarProprietario: " + toIndentedString(licencaComplementarProprietario) + "\n" +
                "    licencaComplementarTransportador: " + toIndentedString(licencaComplementarTransportador) + "\n" +
                "    licencaOriginariaProprietario: " + toIndentedString(licencaOriginariaProprietario) + "\n" +
                "    licencaOriginariaTransportador: " + toIndentedString(licencaOriginariaTransportador) + "\n" +
                "    localAssinaturaTransportador: " + toIndentedString(localAssinaturaTransportador) + "\n" +
                "    marcaVeiculo: " + toIndentedString(marcaVeiculo) + "\n" +
                "    nomeAssinaturaTransportador: " + toIndentedString(nomeAssinaturaTransportador) + "\n" +
                "    nomeCondutorVeiculoEstrangeiro: " + toIndentedString(nomeCondutorVeiculoEstrangeiro) + "\n" +
                "    nomeProprietarioVeiculoEstrangeiro: " + toIndentedString(nomeProprietarioVeiculoEstrangeiro) + "\n" +
                "    nomeTransportadorEstrangeiro: " + toIndentedString(nomeTransportadorEstrangeiro) + "\n" +
                "    numeroDTAExterior: " + toIndentedString(numeroDTAExterior) + "\n" +
                "    numeroDocumentoCondutorVeiculo: " + toIndentedString(numeroDocumentoCondutorVeiculo) + "\n" +
                "    numeroDocumentoTransporte: " + toIndentedString(numeroDocumentoTransporte) + "\n" +
                "    observacoesGerais: " + toIndentedString(observacoesGerais) + "\n" +
                "    observacoesVeiculo: " + toIndentedString(observacoesVeiculo) + "\n" +
                "    paisDestinoFinal: " + toIndentedString(paisDestinoFinal) + "\n" +
                "    paisPartida: " + toIndentedString(paisPartida) + "\n" +
                "    paisProprietarioVeiculoEstrangeiro: " + toIndentedString(paisProprietarioVeiculoEstrangeiro) + "\n" +
                "    paisTransportadorEstrangeiro: " + toIndentedString(paisTransportadorEstrangeiro) + "\n" +
                "    placaCavalo: " + toIndentedString(placaCavalo) + "\n" +
                "    possuiEmbalagemSuporteMadeiraBruta: " + toIndentedString(possuiEmbalagemSuporteMadeiraBruta) + "\n" +
                "    proprietarioVeiculoBrasileiro: " + toIndentedString(proprietarioVeiculoBrasileiro) + "\n" +
                "    reboques: " + toIndentedString(reboques) + "\n" +
                "    recintoEntrada: " + toIndentedString(recintoEntrada) + "\n" +
                "    ruaProprietarioVeiculoEstrangeiro: " + toIndentedString(ruaProprietarioVeiculoEstrangeiro) + "\n" +
                "    ruaTransportadorEstrangeiro: " + toIndentedString(ruaTransportadorEstrangeiro) + "\n" +
                "    taraCavalo: " + toIndentedString(taraCavalo) + "\n" +
                "    tipoDocumentoCondutorVeiculo: " + toIndentedString(tipoDocumentoCondutorVeiculo) + "\n" +
                "    tipoDocumentoTransporte: " + toIndentedString(tipoDocumentoTransporte) + "\n" +
                "    tipoNumeroDocumentoViagem: " + toIndentedString(tipoNumeroDocumentoViagem) + "\n" +
                "    tipoTransporte: " + toIndentedString(tipoTransporte) + "\n" +
                "    tipoTratamentoMadeiraBruta: " + toIndentedString(tipoTratamentoMadeiraBruta) + "\n" +
                "    tipoVeiculo: " + toIndentedString(tipoVeiculo) + "\n" +
                "    transitoInternacional: " + toIndentedString(transitoInternacional) + "\n" +
                "    transportadorImportador: " + toIndentedString(transportadorImportador) + "\n" +
                "    transportadorNacBrasileira: " + toIndentedString(transportadorNacBrasileira) + "\n" +
                "    transportadorProprietarioVeiculo: " + toIndentedString(transportadorProprietarioVeiculo) + "\n" +
                "    ulEntrada: " + toIndentedString(ulEntrada) + "\n" +
                "    visualizacaoDepositario: " + toIndentedString(visualizacaoDepositario) + "\n" +
                "}";
    return sb;
  }

    @XmlType(name = "AplicacaoLacresEnum")
    @XmlEnum(String.class)
    public enum AplicacaoLacresEnum {

        @XmlEnumValue("VEIC")
        @JsonProperty("VEIC")
        VEIC("VEIC"),

        @XmlEnumValue("CONT")
        @JsonProperty("CONT")
        CONT("CONT"),

        @XmlEnumValue("DISP")
        @JsonProperty("DISP")
        DISP("DISP");


        private final String value;

        AplicacaoLacresEnum(String v) {
            value = v;
        }

        public static AplicacaoLacresEnum fromValue(String v) {
            for (AplicacaoLacresEnum b : AplicacaoLacresEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to AplicacaoLacresEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDocumentoCondutorVeiculoEnum")
    @XmlEnum(String.class)
    public enum TipoDocumentoCondutorVeiculoEnum {

        @XmlEnumValue("H")
        @JsonProperty("H")
        H("H"),

        @XmlEnumValue("F")
        @JsonProperty("F")
        F("F"),

        @XmlEnumValue("P")
        @JsonProperty("P")
        P("P"),

        @XmlEnumValue("O")
        @JsonProperty("O")
        O("O");


        private final String value;

        TipoDocumentoCondutorVeiculoEnum(String v) {
            value = v;
        }

        public static TipoDocumentoCondutorVeiculoEnum fromValue(String v) {
            for (TipoDocumentoCondutorVeiculoEnum b : TipoDocumentoCondutorVeiculoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoCondutorVeiculoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoDocumentoTransporteEnum")
    @XmlEnum(String.class)
    public enum TipoDocumentoTransporteEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("3")
        @JsonProperty("3")
        _3("3"),

        @XmlEnumValue("4")
        @JsonProperty("4")
        _4("4");


        private final String value;

        TipoDocumentoTransporteEnum(String v) {
            value = v;
        }

        public static TipoDocumentoTransporteEnum fromValue(String v) {
            for (TipoDocumentoTransporteEnum b : TipoDocumentoTransporteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoDocumentoTransporteEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoNumeroDocumentoViagemEnum")
    @XmlEnum(String.class)
    public enum TipoNumeroDocumentoViagemEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2");


        private final String value;

        TipoNumeroDocumentoViagemEnum(String v) {
            value = v;
        }

        public static TipoNumeroDocumentoViagemEnum fromValue(String v) {
            for (TipoNumeroDocumentoViagemEnum b : TipoNumeroDocumentoViagemEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoNumeroDocumentoViagemEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoTransporteEnum")
    @XmlEnum(String.class)
    public enum TipoTransporteEnum {

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

        TipoTransporteEnum(String v) {
            value = v;
        }

        public static TipoTransporteEnum fromValue(String v) {
            for (TipoTransporteEnum b : TipoTransporteEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTransporteEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    @XmlType(name = "TipoTratamentoMadeiraBrutaEnum")
    @XmlEnum(String.class)
    public enum TipoTratamentoMadeiraBrutaEnum {

        @XmlEnumValue("1")
        @JsonProperty("1")
        _1("1"),

        @XmlEnumValue("2")
        @JsonProperty("2")
        _2("2"),

        @XmlEnumValue("3")
        @JsonProperty("3")
        _3("3");


        private final String value;

        TipoTratamentoMadeiraBrutaEnum(String v) {
            value = v;
        }

        public static TipoTratamentoMadeiraBrutaEnum fromValue(String v) {
            for (TipoTratamentoMadeiraBrutaEnum b : TipoTratamentoMadeiraBrutaEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoTratamentoMadeiraBrutaEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoVeiculoEnum")
    @XmlEnum(String.class)
    public enum TipoVeiculoEnum {

        @XmlEnumValue("TRU")
        @JsonProperty("TRU")
        TRU("TRU"),

        @XmlEnumValue("C1R")
        @JsonProperty("C1R")
        C1R("C1R"),

        @XmlEnumValue("C2R")
        @JsonProperty("C2R")
        C2R("C2R"),

        @XmlEnumValue("C3R")
        @JsonProperty("C3R")
        C3R("C3R");


        private final String value;

        TipoVeiculoEnum(String v) {
            value = v;
        }

        public static TipoVeiculoEnum fromValue(String v) {
            for (TipoVeiculoEnum b : TipoVeiculoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoVeiculoEnum");
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
