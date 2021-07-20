package br.gov.siscomex.portalunico.rcnt.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosDaConfernciaFsica", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "tipo", "dataHoraAgenda", "conferenciaRemota", "listaTelefones", "solicitante", "setorSolicitante", "numeroManifesto", "tipoManifesto", "numeroConhecimentoMAWB", "numeroConhecimento", "tipoConhecimento", "declaracaoAduaneira", "listaPlacaSemirreboque", "listaNumeroConteiner", "listaIdentificacaoUld", "listaNumeroLote", "areaConferenciaFisica", "listaCameras", "dataHoraOperacao", "listaOperadoresPosicionamento", "listaPessoasAcompanhamento", "listaLacres", "retiradaAmostras", "listaTipoAvaria", "quantidadeVolumesAvariados", "observacaoAvaria", "divergenciaQuantidade", "divergenciaQualificacao", "quantidadeVolumesDivergentes", "observacaoDivergencia"
})

@XmlRootElement(name="DadosDaConfernciaFsica")
public class DadosDaConfernciaFsica  {
  

@XmlType(name="TipoOperacaoEnum")
@XmlEnum(String.class)
public enum TipoOperacaoEnum {

	@XmlEnumValue("'I'")
	@JsonProperty("'I'")
	I_(String.valueOf("'I'")),
	
	@XmlEnumValue("'R'")
	@JsonProperty("'R'")
	R_(String.valueOf("'R'")),
	
	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'"));


    private String value;

    TipoOperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoOperacaoEnum fromValue(String v) {
        for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
    }
}

  @XmlElement(name="tipoOperacao", required = true)
  @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
  **/
  private TipoOperacaoEnum tipoOperacao = null;

  @XmlElement(name="idEvento", required = true)
  @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100")
 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/>Tamanho: 100
  **/
  private String idEvento = null;

  @XmlElement(name="dataHoraOcorrencia", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraOcorrencia = null;

  @XmlElement(name="dataHoraRegistro", required = true)
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraRegistro = null;

  @XmlElement(name="cpfOperadorOcorrencia")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorOcorrencia = null;

  @XmlElement(name="cpfOperadorRegistro")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfOperadorRegistro = null;

  @XmlElement(name="protocoloEventoRetificadoOuExcluido")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36")
 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36
  **/
  private String protocoloEventoRetificadoOuExcluido = null;

  @XmlElement(name="contingencia", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean contingencia = null;

  @XmlElement(name="codigoRecinto", required = true)
  @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
  **/
  private String codigoRecinto = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

	@XmlEnumValue("'AGE'")
	@JsonProperty("'AGE'")
	AGE_(String.valueOf("'AGE'")),
	
	@XmlEnumValue("'CCF'")
	@JsonProperty("'CCF'")
	CCF_(String.valueOf("'CCF'"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "AGE", value = "Informar o tipo de evento a ser enviado.<br/>Domínio:<br/>AGE - Agendamento<br/>CCF - Conclusão de Conferência Física")
 /**
   * Informar o tipo de evento a ser enviado.<br/>Domínio:<br/>AGE - Agendamento<br/>CCF - Conclusão de Conferência Física
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="dataHoraAgenda")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraAgenda = null;

  @XmlElement(name="conferenciaRemota")
  @ApiModelProperty(example = "false", value = "Informar se a conferência física será remota. Por exemplo, utilizando a estrutura do CONFERE ou semelhante.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Informar se a conferência física será remota. Por exemplo, utilizando a estrutura do CONFERE ou semelhante.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean conferenciaRemota = null;

  @XmlElement(name="listaTelefones")
  @ApiModelProperty(value = "Em agendamento de conferência remota, informar telefones dos prepostos do depositário responsáveis pela verificação para fins de comunicação")
  @Valid
 /**
   * Em agendamento de conferência remota, informar telefones dos prepostos do depositário responsáveis pela verificação para fins de comunicação
  **/
  private List<DadosDoTelefone> listaTelefones = null;


@XmlType(name="SolicitanteEnum")
@XmlEnum(String.class)
public enum SolicitanteEnum {

	@XmlEnumValue("'ACI'")
	@JsonProperty("'ACI'")
	ACI_(String.valueOf("'ACI'")),
	
	@XmlEnumValue("'ANCINE'")
	@JsonProperty("'ANCINE'")
	ANCINE_(String.valueOf("'ANCINE'")),
	
	@XmlEnumValue("'ANEEL'")
	@JsonProperty("'ANEEL'")
	ANEEL_(String.valueOf("'ANEEL'")),
	
	@XmlEnumValue("'ANP'")
	@JsonProperty("'ANP'")
	ANP_(String.valueOf("'ANP'")),
	
	@XmlEnumValue("'ANVISA'")
	@JsonProperty("'ANVISA'")
	ANVISA_(String.valueOf("'ANVISA'")),
	
	@XmlEnumValue("'BB'")
	@JsonProperty("'BB'")
	BB_(String.valueOf("'BB'")),
	
	@XmlEnumValue("'BEFIEX'")
	@JsonProperty("'BEFIEX'")
	BEFIEX_(String.valueOf("'BEFIEX'")),
	
	@XmlEnumValue("'BNDES'")
	@JsonProperty("'BNDES'")
	BNDES_(String.valueOf("'BNDES'")),
	
	@XmlEnumValue("'CNEN'")
	@JsonProperty("'CNEN'")
	CNEN_(String.valueOf("'CNEN'")),
	
	@XmlEnumValue("'CNPQ'")
	@JsonProperty("'CNPQ'")
	CNPQ_(String.valueOf("'CNPQ'")),
	
	@XmlEnumValue("'CONFAZ'")
	@JsonProperty("'CONFAZ'")
	CONFAZ_(String.valueOf("'CONFAZ'")),
	
	@XmlEnumValue("'COTAC'")
	@JsonProperty("'COTAC'")
	COTAC_(String.valueOf("'COTAC'")),
	
	@XmlEnumValue("'DEAEX'")
	@JsonProperty("'DEAEX'")
	DEAEX_(String.valueOf("'DEAEX'")),
	
	@XmlEnumValue("'DECEX'")
	@JsonProperty("'DECEX'")
	DECEX_(String.valueOf("'DECEX'")),
	
	@XmlEnumValue("'DEPLA'")
	@JsonProperty("'DEPLA'")
	DEPLA_(String.valueOf("'DEPLA'")),
	
	@XmlEnumValue("'DEPOSITARIO'")
	@JsonProperty("'DEPOSITARIO'")
	DEPOSITARIO_(String.valueOf("'DEPOSITARIO'")),
	
	@XmlEnumValue("'DESPACHANTE'")
	@JsonProperty("'DESPACHANTE'")
	DESPACHANTE_(String.valueOf("'DESPACHANTE'")),
	
	@XmlEnumValue("'DFPC'")
	@JsonProperty("'DFPC'")
	DFPC_(String.valueOf("'DFPC'")),
	
	@XmlEnumValue("'DNPM'")
	@JsonProperty("'DNPM'")
	DNPM_(String.valueOf("'DNPM'")),
	
	@XmlEnumValue("'DPF'")
	@JsonProperty("'DPF'")
	DPF_(String.valueOf("'DPF'")),
	
	@XmlEnumValue("'ECT'")
	@JsonProperty("'ECT'")
	ECT_(String.valueOf("'ECT'")),
	
	@XmlEnumValue("'EXPORTADOR'")
	@JsonProperty("'EXPORTADOR'")
	EXPORTADOR_(String.valueOf("'EXPORTADOR'")),
	
	@XmlEnumValue("'GESTOR'")
	@JsonProperty("'GESTOR'")
	GESTOR_(String.valueOf("'GESTOR'")),
	
	@XmlEnumValue("'IBAMA'")
	@JsonProperty("'IBAMA'")
	IBAMA_(String.valueOf("'IBAMA'")),
	
	@XmlEnumValue("'INMETRO'")
	@JsonProperty("'INMETRO'")
	INMETRO_(String.valueOf("'INMETRO'")),
	
	@XmlEnumValue("'IPHAN'")
	@JsonProperty("'IPHAN'")
	IPHAN_(String.valueOf("'IPHAN'")),
	
	@XmlEnumValue("'IMPORTADOR'")
	@JsonProperty("'IMPORTADOR'")
	IMPORTADOR_(String.valueOf("'IMPORTADOR'")),
	
	@XmlEnumValue("'JUSTIÇA'")
	@JsonProperty("'JUSTIÇA'")
	JUSTI_A_(String.valueOf("'JUSTIÇA'")),
	
	@XmlEnumValue("'MAPA'")
	@JsonProperty("'MAPA'")
	MAPA_(String.valueOf("'MAPA'")),
	
	@XmlEnumValue("'MCTI'")
	@JsonProperty("'MCTI'")
	MCTI_(String.valueOf("'MCTI'")),
	
	@XmlEnumValue("'MD'")
	@JsonProperty("'MD'")
	MD_(String.valueOf("'MD'")),
	
	@XmlEnumValue("'MRE'")
	@JsonProperty("'MRE'")
	MRE_(String.valueOf("'MRE'")),
	
	@XmlEnumValue("'RFB'")
	@JsonProperty("'RFB'")
	RFB_(String.valueOf("'RFB'")),
	
	@XmlEnumValue("'SDAVO'")
	@JsonProperty("'SDAVO'")
	SDAVO_(String.valueOf("'SDAVO'")),
	
	@XmlEnumValue("'SECEX'")
	@JsonProperty("'SECEX'")
	SECEX_(String.valueOf("'SECEX'")),
	
	@XmlEnumValue("'SEPIN'")
	@JsonProperty("'SEPIN'")
	SEPIN_(String.valueOf("'SEPIN'")),
	
	@XmlEnumValue("'SPC-MA'")
	@JsonProperty("'SPC-MA'")
	SPC_MA_(String.valueOf("'SPC-MA'")),
	
	@XmlEnumValue("'SUFRAMA'")
	@JsonProperty("'SUFRAMA'")
	SUFRAMA_(String.valueOf("'SUFRAMA'")),
	
	@XmlEnumValue("'TRANSPORTADOR'")
	@JsonProperty("'TRANSPORTADOR'")
	TRANSPORTADOR_(String.valueOf("'TRANSPORTADOR'")),
	
	@XmlEnumValue("'OUTRO'")
	@JsonProperty("'OUTRO'")
	OUTRO_(String.valueOf("'OUTRO'"));


    private String value;

    SolicitanteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SolicitanteEnum fromValue(String v) {
        for (SolicitanteEnum b : SolicitanteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SolicitanteEnum");
    }
}

  @XmlElement(name="solicitante")
  @ApiModelProperty(example = "ANCINE", value = "Indicar qual o interveniente que solicitou a conferência física (RFB, tabela anuentes, importador, exportador)<br/>Tamanho: 10<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE")
 /**
   * Indicar qual o interveniente que solicitou a conferência física (RFB, tabela anuentes, importador, exportador)<br/>Tamanho: 10<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
  **/
  private SolicitanteEnum solicitante = null;

  @XmlElement(name="setorSolicitante")
  @ApiModelProperty(value = "Identificação do setor, seção e/ou serviço solicitante da conferência física.<br/>Tamanho: 100")
 /**
   * Identificação do setor, seção e/ou serviço solicitante da conferência física.<br/>Tamanho: 100
  **/
  private String setorSolicitante = null;

  @XmlElement(name="numeroManifesto")
  @ApiModelProperty(example = "1318500002175", value = "Número do Manifesto.<br/>Tamanho: 100")
 /**
   * Número do Manifesto.<br/>Tamanho: 100
  **/
  private String numeroManifesto = null;


@XmlType(name="TipoManifestoEnum")
@XmlEnum(String.class)
public enum TipoManifestoEnum {

	@XmlEnumValue("'MICDTA'")
	@JsonProperty("'MICDTA'")
	MICDTA_(String.valueOf("'MICDTA'")),
	
	@XmlEnumValue("'TIFDTA'")
	@JsonProperty("'TIFDTA'")
	TIFDTA_(String.valueOf("'TIFDTA'")),
	
	@XmlEnumValue("'MDFE'")
	@JsonProperty("'MDFE'")
	MDFE_(String.valueOf("'MDFE'")),
	
	@XmlEnumValue("'MELET'")
	@JsonProperty("'MELET'")
	MELET_(String.valueOf("'MELET'"));


    private String value;

    TipoManifestoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoManifestoEnum fromValue(String v) {
        for (TipoManifestoEnum b : TipoManifestoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoManifestoEnum");
    }
}

  @XmlElement(name="tipoManifesto")
  @ApiModelProperty(example = "MICDTA", value = "Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico")
 /**
   * Tipo do manifesto conforme tabela de domínio.<br/>Domínio:<br/>MICDTA - MicDTA<br/>TIFDTA - TifDTA<br/>MDFE - MDF-e<br/>MELET - Manifesto Eletrônico
  **/
  private TipoManifestoEnum tipoManifesto = null;

  @XmlElement(name="numeroConhecimentoMAWB")
  @ApiModelProperty(example = "0556548723", value = "Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. <br/>Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo 'Conhecimento de carga' deve ser deixado vazio. <br/>Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo 'Conhecimento de carga' <br/> deve ser preenchido com o HOUSE.<br/>Tamanho: 100
  **/
  private String numeroConhecimentoMAWB = null;

  @XmlElement(name="numeroConhecimento")
  @ApiModelProperty(example = "131805000071025", value = "Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100")
 /**
   * Identificação do conhecimento de carga ou do DSIC. <br/>No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. <br/>No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.<br/>Tamanho: 100
  **/
  private String numeroConhecimento = null;


@XmlType(name="TipoConhecimentoEnum")
@XmlEnum(String.class)
public enum TipoConhecimentoEnum {

	@XmlEnumValue("'CRT'")
	@JsonProperty("'CRT'")
	CRT_(String.valueOf("'CRT'")),
	
	@XmlEnumValue("'TIF'")
	@JsonProperty("'TIF'")
	TIF_(String.valueOf("'TIF'")),
	
	@XmlEnumValue("'RWB'")
	@JsonProperty("'RWB'")
	RWB_(String.valueOf("'RWB'")),
	
	@XmlEnumValue("'AWB'")
	@JsonProperty("'AWB'")
	AWB_(String.valueOf("'AWB'")),
	
	@XmlEnumValue("'DSIC'")
	@JsonProperty("'DSIC'")
	DSIC_(String.valueOf("'DSIC'")),
	
	@XmlEnumValue("'CTE'")
	@JsonProperty("'CTE'")
	CTE_(String.valueOf("'CTE'")),
	
	@XmlEnumValue("'CE_MERCANTE'")
	@JsonProperty("'CE_MERCANTE'")
	CE_MERCANTE_(String.valueOf("'CE_MERCANTE'")),
	
	@XmlEnumValue("'BL'")
	@JsonProperty("'BL'")
	BL_(String.valueOf("'BL'")),
	
	@XmlEnumValue("'POSTAL'")
	@JsonProperty("'POSTAL'")
	POSTAL_(String.valueOf("'POSTAL'"));


    private String value;

    TipoConhecimentoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoConhecimentoEnum fromValue(String v) {
        for (TipoConhecimentoEnum b : TipoConhecimentoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoConhecimentoEnum");
    }
}

  @XmlElement(name="tipoConhecimento")
  @ApiModelProperty(example = "AWB", value = "Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - Conhecimento Internacional de Transporte Rodoviário<br/>TIF - Conhecimento-Carta de Porte Internacional<br/>RWB - Rail WayBill<br/>AWB - Air WayBill<br/>DSIC - Documento Subsidiário de Identificação da Carga<br/>CTE - Conhecimento de Transporte Eletrônico<br/>CE_MERCANTE - Conhecimento Eletrônico Mercante<br/>BL - Bill of Lading<br/>POSTAL - Remessa Postal Internacional<br/>")
 /**
   * Tipo de conhecimento conforme tabela de domínio.<br/>Domínio:<br/>CRT - Conhecimento Internacional de Transporte Rodoviário<br/>TIF - Conhecimento-Carta de Porte Internacional<br/>RWB - Rail WayBill<br/>AWB - Air WayBill<br/>DSIC - Documento Subsidiário de Identificação da Carga<br/>CTE - Conhecimento de Transporte Eletrônico<br/>CE_MERCANTE - Conhecimento Eletrônico Mercante<br/>BL - Bill of Lading<br/>POSTAL - Remessa Postal Internacional<br/>
  **/
  private TipoConhecimentoEnum tipoConhecimento = null;

  @XmlElement(name="declaracaoAduaneira")
  @ApiModelProperty(value = "")
  @Valid
  private DeclaraoAduaneira declaracaoAduaneira = null;

  @XmlElement(name="listaPlacaSemirreboque")
  @ApiModelProperty(value = "Lista de Placas de semirreboques, vagões ou truck.")
  @Valid
 /**
   * Lista de Placas de semirreboques, vagões ou truck.
  **/
  private List<PlacaSemirreboque> listaPlacaSemirreboque = null;

  @XmlElement(name="listaNumeroConteiner")
  @ApiModelProperty(value = "Lista de número do contêiner")
  @Valid
 /**
   * Lista de número do contêiner
  **/
  private List<DadosDoConteiner> listaNumeroConteiner = null;

  @XmlElement(name="listaIdentificacaoUld")
  @ApiModelProperty(example = "AZEB123_AA, AKE21001NZ", value = "Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10")
  @Valid
 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \"_\") e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.<br/>Tamanho: 10
  **/
  private List<DadosDaIdentificaoULD> listaIdentificacaoUld = null;

  @XmlElement(name="listaNumeroLote")
  @ApiModelProperty(value = "Lista de Lotes. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.")
  @Valid
 /**
   * Lista de Lotes. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.
  **/
  private List<DadosDaIdentificaoDoLote> listaNumeroLote = null;

  @XmlElement(name="areaConferenciaFisica")
  @ApiModelProperty(value = "Identificação da área de conferência (georreferenciamento). Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 100")
 /**
   * Identificação da área de conferência (georreferenciamento). Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 100
  **/
  private String areaConferenciaFisica = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a conferência foi efetuada.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a conferência foi efetuada.
  **/
  private List<DadosDaCmera> listaCameras = null;

  @XmlElement(name="dataHoraOperacao")
  @ApiModelProperty(value = "")
  @Valid
  private DatasDeOperao dataHoraOperacao = null;

  @XmlElement(name="listaOperadoresPosicionamento")
  @ApiModelProperty(value = "Informar todos os operadores que participaram do manuseio da carga objetivando seu posicionamento para conferência física.")
  @Valid
 /**
   * Informar todos os operadores que participaram do manuseio da carga objetivando seu posicionamento para conferência física.
  **/
  private List<OperadorQueParticipouDoManuseioDaCarga> listaOperadoresPosicionamento = null;

  @XmlElement(name="listaPessoasAcompanhamento")
  @ApiModelProperty(value = "Informar todos as pessoas que acompanharam o posicionamento da carga e/ou a conferência física exceto os operadores informados na lista anterior.")
  @Valid
 /**
   * Informar todos as pessoas que acompanharam o posicionamento da carga e/ou a conferência física exceto os operadores informados na lista anterior.
  **/
  private List<DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica> listaPessoasAcompanhamento = null;

  @XmlElement(name="listaLacres")
  @ApiModelProperty(value = "Lista de lacres verificados")
  @Valid
 /**
   * Lista de lacres verificados
  **/
  private List<DadosDoLacre> listaLacres = null;

  @XmlElement(name="retiradaAmostras")
  @ApiModelProperty(example = "false", value = "Informar se houve retirada de amostras durante a conferência física<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Informar se houve retirada de amostras durante a conferência física<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean retiradaAmostras = null;

  @XmlElement(name="listaTipoAvaria")
  @ApiModelProperty(value = "Lista dos Tipos de Avarias.")
  @Valid
 /**
   * Lista dos Tipos de Avarias.
  **/
  private List<DadosDoTipoDeAvaria> listaTipoAvaria = null;

  @XmlElement(name="quantidadeVolumesAvariados")
  @ApiModelProperty(example = "28", value = "Informar o quantidade de volumes avariados")
 /**
   * Informar o quantidade de volumes avariados
  **/
  private Integer quantidadeVolumesAvariados = null;

  @XmlElement(name="observacaoAvaria")
  @ApiModelProperty(value = "Registrar as informações da avaria<br/>Tamanho: 200")
 /**
   * Registrar as informações da avaria<br/>Tamanho: 200
  **/
  private String observacaoAvaria = null;

  @XmlElement(name="divergenciaQuantidade")
  @ApiModelProperty(example = "false", value = "Caso constatado, informar se há divergências de quantidade de mercadorias/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Caso constatado, informar se há divergências de quantidade de mercadorias/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean divergenciaQuantidade = null;

  @XmlElement(name="divergenciaQualificacao")
  @ApiModelProperty(example = "false", value = "Caso constatado, informar se há divergências de qualificação de mercadorias/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Caso constatado, informar se há divergências de qualificação de mercadorias/volumes<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean divergenciaQualificacao = null;

  @XmlElement(name="quantidadeVolumesDivergentes")
  @ApiModelProperty(example = "17", value = "Caso constatado, informar a quantidade de volumes divergentes")
 /**
   * Caso constatado, informar a quantidade de volumes divergentes
  **/
  private Integer quantidadeVolumesDivergentes = null;

  @XmlElement(name="observacaoDivergencia")
  @ApiModelProperty(value = "Caso constatado, registrar as informações das divergências<br/>Tamanho: 200")
 /**
   * Caso constatado, registrar as informações das divergências<br/>Tamanho: 200
  **/
  private String observacaoDivergencia = null;
 /**
   * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.&lt;br/&gt;Domínio:&lt;br/&gt;I - Incluir&lt;br/&gt;R - Retificar&lt;br/&gt;E - Excluir
   * @return tipoOperacao
  **/
  @JsonProperty("tipoOperacao")
  @NotNull
  public String getTipoOperacao() {
    if (tipoOperacao == null) {
      return null;
    }
    return tipoOperacao.value();
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  public DadosDaConfernciaFsica tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt;Tamanho: 100
   * @return idEvento
  **/
  @JsonProperty("idEvento")
  @NotNull
  public String getIdEvento() {
    return idEvento;
  }

  public void setIdEvento(String idEvento) {
    this.idEvento = idEvento;
  }

  public DadosDaConfernciaFsica idEvento(String idEvento) {
    this.idEvento = idEvento;
    return this;
  }

 /**
   * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraOcorrencia
  **/
  @JsonProperty("dataHoraOcorrencia")
  @NotNull
  public String getDataHoraOcorrencia() {
    return dataHoraOcorrencia;
  }

  public void setDataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
  }

  public DadosDaConfernciaFsica dataHoraOcorrencia(String dataHoraOcorrencia) {
    this.dataHoraOcorrencia = dataHoraOcorrencia;
    return this;
  }

 /**
   * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraRegistro
  **/
  @JsonProperty("dataHoraRegistro")
  @NotNull
  public String getDataHoraRegistro() {
    return dataHoraRegistro;
  }

  public void setDataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
  }

  public DadosDaConfernciaFsica dataHoraRegistro(String dataHoraRegistro) {
    this.dataHoraRegistro = dataHoraRegistro;
    return this;
  }

 /**
   * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.&lt;br/&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorOcorrencia
  **/
  @JsonProperty("cpfOperadorOcorrencia")
  public String getCpfOperadorOcorrencia() {
    return cpfOperadorOcorrencia;
  }

  public void setCpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
  }

  public DadosDaConfernciaFsica cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
    this.cpfOperadorOcorrencia = cpfOperadorOcorrencia;
    return this;
  }

 /**
   * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.&lt;br&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfOperadorRegistro
  **/
  @JsonProperty("cpfOperadorRegistro")
  public String getCpfOperadorRegistro() {
    return cpfOperadorRegistro;
  }

  public void setCpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
  }

  public DadosDaConfernciaFsica cpfOperadorRegistro(String cpfOperadorRegistro) {
    this.cpfOperadorRegistro = cpfOperadorRegistro;
    return this;
  }

 /**
   * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.&lt;br/&gt;Tamanho: 36
   * @return protocoloEventoRetificadoOuExcluido
  **/
  @JsonProperty("protocoloEventoRetificadoOuExcluido")
  public String getProtocoloEventoRetificadoOuExcluido() {
    return protocoloEventoRetificadoOuExcluido;
  }

  public void setProtocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
  }

  public DadosDaConfernciaFsica protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
    this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
    return this;
  }

 /**
   * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return contingencia
  **/
  @JsonProperty("contingencia")
  @NotNull
  public Boolean isContingencia() {
    return contingencia;
  }

  public void setContingencia(Boolean contingencia) {
    this.contingencia = contingencia;
  }

  public DadosDaConfernciaFsica contingencia(Boolean contingencia) {
    this.contingencia = contingencia;
    return this;
  }

 /**
   * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.&lt;br/&gt;Tamanho: 15
   * @return codigoRecinto
  **/
  @JsonProperty("codigoRecinto")
  @NotNull
  public String getCodigoRecinto() {
    return codigoRecinto;
  }

  public void setCodigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
  }

  public DadosDaConfernciaFsica codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Informar o tipo de evento a ser enviado.&lt;br/&gt;Domínio:&lt;br/&gt;AGE - Agendamento&lt;br/&gt;CCF - Conclusão de Conferência Física
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

  public DadosDaConfernciaFsica tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Data e hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraAgenda
  **/
  @JsonProperty("dataHoraAgenda")
  public String getDataHoraAgenda() {
    return dataHoraAgenda;
  }

  public void setDataHoraAgenda(String dataHoraAgenda) {
    this.dataHoraAgenda = dataHoraAgenda;
  }

  public DadosDaConfernciaFsica dataHoraAgenda(String dataHoraAgenda) {
    this.dataHoraAgenda = dataHoraAgenda;
    return this;
  }

 /**
   * Informar se a conferência física será remota. Por exemplo, utilizando a estrutura do CONFERE ou semelhante.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return conferenciaRemota
  **/
  @JsonProperty("conferenciaRemota")
  public Boolean isConferenciaRemota() {
    return conferenciaRemota;
  }

  public void setConferenciaRemota(Boolean conferenciaRemota) {
    this.conferenciaRemota = conferenciaRemota;
  }

  public DadosDaConfernciaFsica conferenciaRemota(Boolean conferenciaRemota) {
    this.conferenciaRemota = conferenciaRemota;
    return this;
  }

 /**
   * Em agendamento de conferência remota, informar telefones dos prepostos do depositário responsáveis pela verificação para fins de comunicação
   * @return listaTelefones
  **/
  @JsonProperty("listaTelefones")
  public List<DadosDoTelefone> getListaTelefones() {
    return listaTelefones;
  }

  public void setListaTelefones(List<DadosDoTelefone> listaTelefones) {
    this.listaTelefones = listaTelefones;
  }

  public DadosDaConfernciaFsica listaTelefones(List<DadosDoTelefone> listaTelefones) {
    this.listaTelefones = listaTelefones;
    return this;
  }

  public DadosDaConfernciaFsica addListaTelefonesItem(DadosDoTelefone listaTelefonesItem) {
    this.listaTelefones.add(listaTelefonesItem);
    return this;
  }

 /**
   * Indicar qual o interveniente que solicitou a conferência física (RFB, tabela anuentes, importador, exportador)&lt;br/&gt;Tamanho: 10&lt;br/&gt;Domínio:&lt;br/&gt;ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BEFIEX - PROGRAMAS BEFIEX&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR&lt;br/&gt;DEPOSITARIO - DEPOSITÁRIO&lt;br/&gt;DESPACHANTE - DESPACHANTE&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;EXPORTADOR - EXPORTADOR&lt;br/&gt;GESTOR - MICT/DECEX/GESTOR&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;IMPORTADOR - IMPORTADOR&lt;br/&gt;JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MD - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RFB - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SDAVO - AUDIOVISUAL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SEPIN - MIN.DA CIENCIA E TECNOLOGIA&lt;br/&gt;SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS&lt;br/&gt;TRANSPORTADOR - TRANSPORTADOR&lt;br/&gt;OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
   * @return solicitante
  **/
  @JsonProperty("solicitante")
  public String getSolicitante() {
    if (solicitante == null) {
      return null;
    }
    return solicitante.value();
  }

  public void setSolicitante(SolicitanteEnum solicitante) {
    this.solicitante = solicitante;
  }

  public DadosDaConfernciaFsica solicitante(SolicitanteEnum solicitante) {
    this.solicitante = solicitante;
    return this;
  }

 /**
   * Identificação do setor, seção e/ou serviço solicitante da conferência física.&lt;br/&gt;Tamanho: 100
   * @return setorSolicitante
  **/
  @JsonProperty("setorSolicitante")
  public String getSetorSolicitante() {
    return setorSolicitante;
  }

  public void setSetorSolicitante(String setorSolicitante) {
    this.setorSolicitante = setorSolicitante;
  }

  public DadosDaConfernciaFsica setorSolicitante(String setorSolicitante) {
    this.setorSolicitante = setorSolicitante;
    return this;
  }

 /**
   * Número do Manifesto.&lt;br/&gt;Tamanho: 100
   * @return numeroManifesto
  **/
  @JsonProperty("numeroManifesto")
  public String getNumeroManifesto() {
    return numeroManifesto;
  }

  public void setNumeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
  }

  public DadosDaConfernciaFsica numeroManifesto(String numeroManifesto) {
    this.numeroManifesto = numeroManifesto;
    return this;
  }

 /**
   * Tipo do manifesto conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;MICDTA - MicDTA&lt;br/&gt;TIFDTA - TifDTA&lt;br/&gt;MDFE - MDF-e&lt;br/&gt;MELET - Manifesto Eletrônico
   * @return tipoManifesto
  **/
  @JsonProperty("tipoManifesto")
  public String getTipoManifesto() {
    if (tipoManifesto == null) {
      return null;
    }
    return tipoManifesto.value();
  }

  public void setTipoManifesto(TipoManifestoEnum tipoManifesto) {
    this.tipoManifesto = tipoManifesto;
  }

  public DadosDaConfernciaFsica tipoManifesto(TipoManifestoEnum tipoManifesto) {
    this.tipoManifesto = tipoManifesto;
    return this;
  }

 /**
   * Identificação do conhecimento MASTER (MAWB), a ser utilizado somente no modal aéreo. &lt;br/&gt;Quando se tratar de um MAWB, esse campo deve ser preenchido, e o campo &#39;Conhecimento de carga&#39; deve ser deixado vazio. &lt;br/&gt;Quando se tratar de um HAWB, este campo deve ser preenchido com o MASTER (inclusive nos casos de remessa) e o campo &#39;Conhecimento de carga&#39; &lt;br/&gt; deve ser preenchido com o HOUSE.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimentoMAWB
  **/
  @JsonProperty("numeroConhecimentoMAWB")
  public String getNumeroConhecimentoMAWB() {
    return numeroConhecimentoMAWB;
  }

  public void setNumeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
  }

  public DadosDaConfernciaFsica numeroConhecimentoMAWB(String numeroConhecimentoMAWB) {
    this.numeroConhecimentoMAWB = numeroConhecimentoMAWB;
    return this;
  }

 /**
   * Identificação do conhecimento de carga ou do DSIC. &lt;br/&gt;No modal aéreo, deve ser preenchido quando se tratar de AWB direto, ou HAWB, ou DSIC. &lt;br/&gt;No aquaviário deve ser preenchido com CE Mercante na importação e na exportação com o conhecimento internacional ou, quando ainda não emitido, com o CT-e que amparou a chegada da carga.&lt;br/&gt;Tamanho: 100
   * @return numeroConhecimento
  **/
  @JsonProperty("numeroConhecimento")
  public String getNumeroConhecimento() {
    return numeroConhecimento;
  }

  public void setNumeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
  }

  public DadosDaConfernciaFsica numeroConhecimento(String numeroConhecimento) {
    this.numeroConhecimento = numeroConhecimento;
    return this;
  }

 /**
   * Tipo de conhecimento conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;CRT - Conhecimento Internacional de Transporte Rodoviário&lt;br/&gt;TIF - Conhecimento-Carta de Porte Internacional&lt;br/&gt;RWB - Rail WayBill&lt;br/&gt;AWB - Air WayBill&lt;br/&gt;DSIC - Documento Subsidiário de Identificação da Carga&lt;br/&gt;CTE - Conhecimento de Transporte Eletrônico&lt;br/&gt;CE_MERCANTE - Conhecimento Eletrônico Mercante&lt;br/&gt;BL - Bill of Lading&lt;br/&gt;POSTAL - Remessa Postal Internacional&lt;br/&gt;
   * @return tipoConhecimento
  **/
  @JsonProperty("tipoConhecimento")
  public String getTipoConhecimento() {
    if (tipoConhecimento == null) {
      return null;
    }
    return tipoConhecimento.value();
  }

  public void setTipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
  }

  public DadosDaConfernciaFsica tipoConhecimento(TipoConhecimentoEnum tipoConhecimento) {
    this.tipoConhecimento = tipoConhecimento;
    return this;
  }

 /**
   * Get declaracaoAduaneira
   * @return declaracaoAduaneira
  **/
  @JsonProperty("declaracaoAduaneira")
  public DeclaraoAduaneira getDeclaracaoAduaneira() {
    return declaracaoAduaneira;
  }

  public void setDeclaracaoAduaneira(DeclaraoAduaneira declaracaoAduaneira) {
    this.declaracaoAduaneira = declaracaoAduaneira;
  }

  public DadosDaConfernciaFsica declaracaoAduaneira(DeclaraoAduaneira declaracaoAduaneira) {
    this.declaracaoAduaneira = declaracaoAduaneira;
    return this;
  }

 /**
   * Lista de Placas de semirreboques, vagões ou truck.
   * @return listaPlacaSemirreboque
  **/
  @JsonProperty("listaPlacaSemirreboque")
  public List<PlacaSemirreboque> getListaPlacaSemirreboque() {
    return listaPlacaSemirreboque;
  }

  public void setListaPlacaSemirreboque(List<PlacaSemirreboque> listaPlacaSemirreboque) {
    this.listaPlacaSemirreboque = listaPlacaSemirreboque;
  }

  public DadosDaConfernciaFsica listaPlacaSemirreboque(List<PlacaSemirreboque> listaPlacaSemirreboque) {
    this.listaPlacaSemirreboque = listaPlacaSemirreboque;
    return this;
  }

  public DadosDaConfernciaFsica addListaPlacaSemirreboqueItem(PlacaSemirreboque listaPlacaSemirreboqueItem) {
    this.listaPlacaSemirreboque.add(listaPlacaSemirreboqueItem);
    return this;
  }

 /**
   * Lista de número do contêiner
   * @return listaNumeroConteiner
  **/
  @JsonProperty("listaNumeroConteiner")
  public List<DadosDoConteiner> getListaNumeroConteiner() {
    return listaNumeroConteiner;
  }

  public void setListaNumeroConteiner(List<DadosDoConteiner> listaNumeroConteiner) {
    this.listaNumeroConteiner = listaNumeroConteiner;
  }

  public DadosDaConfernciaFsica listaNumeroConteiner(List<DadosDoConteiner> listaNumeroConteiner) {
    this.listaNumeroConteiner = listaNumeroConteiner;
    return this;
  }

  public DadosDaConfernciaFsica addListaNumeroConteinerItem(DadosDoConteiner listaNumeroConteinerItem) {
    this.listaNumeroConteiner.add(listaNumeroConteinerItem);
    return this;
  }

 /**
   * Identificação da ULD, no formato (TTTNNNNNPP) composta pelos seguintes atributos: Tipo de ULD (3 caracteres - TTT), Número da ULD (5 caracteres - NNNNN - Caso o número tenha menos que 5 caracteres, preencher à direita com o caracter especial \&quot;_\&quot;) e  Código do proprietário da ULD (2 caracteres - PP). Ex: AZEB123_AA, AKE21001NZ.&lt;br/&gt;Tamanho: 10
   * @return listaIdentificacaoUld
  **/
  @JsonProperty("listaIdentificacaoUld")
  public List<DadosDaIdentificaoULD> getListaIdentificacaoUld() {
    return listaIdentificacaoUld;
  }

  public void setListaIdentificacaoUld(List<DadosDaIdentificaoULD> listaIdentificacaoUld) {
    this.listaIdentificacaoUld = listaIdentificacaoUld;
  }

  public DadosDaConfernciaFsica listaIdentificacaoUld(List<DadosDaIdentificaoULD> listaIdentificacaoUld) {
    this.listaIdentificacaoUld = listaIdentificacaoUld;
    return this;
  }

  public DadosDaConfernciaFsica addListaIdentificacaoUldItem(DadosDaIdentificaoULD listaIdentificacaoUldItem) {
    this.listaIdentificacaoUld.add(listaIdentificacaoUldItem);
    return this;
  }

 /**
   * Lista de Lotes. Usar o mesmo número gerado no evento GERAÇÃO DE LOTES.
   * @return listaNumeroLote
  **/
  @JsonProperty("listaNumeroLote")
  public List<DadosDaIdentificaoDoLote> getListaNumeroLote() {
    return listaNumeroLote;
  }

  public void setListaNumeroLote(List<DadosDaIdentificaoDoLote> listaNumeroLote) {
    this.listaNumeroLote = listaNumeroLote;
  }

  public DadosDaConfernciaFsica listaNumeroLote(List<DadosDaIdentificaoDoLote> listaNumeroLote) {
    this.listaNumeroLote = listaNumeroLote;
    return this;
  }

  public DadosDaConfernciaFsica addListaNumeroLoteItem(DadosDaIdentificaoDoLote listaNumeroLoteItem) {
    this.listaNumeroLote.add(listaNumeroLoteItem);
    return this;
  }

 /**
   * Identificação da área de conferência (georreferenciamento). Usar o protocolo do evento de georreferenciamento.&lt;br/&gt;Tamanho: 100
   * @return areaConferenciaFisica
  **/
  @JsonProperty("areaConferenciaFisica")
  public String getAreaConferenciaFisica() {
    return areaConferenciaFisica;
  }

  public void setAreaConferenciaFisica(String areaConferenciaFisica) {
    this.areaConferenciaFisica = areaConferenciaFisica;
  }

  public DadosDaConfernciaFsica areaConferenciaFisica(String areaConferenciaFisica) {
    this.areaConferenciaFisica = areaConferenciaFisica;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a conferência foi efetuada.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosDaConfernciaFsica listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosDaConfernciaFsica addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }

 /**
   * Get dataHoraOperacao
   * @return dataHoraOperacao
  **/
  @JsonProperty("dataHoraOperacao")
  public DatasDeOperao getDataHoraOperacao() {
    return dataHoraOperacao;
  }

  public void setDataHoraOperacao(DatasDeOperao dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
  }

  public DadosDaConfernciaFsica dataHoraOperacao(DatasDeOperao dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
    return this;
  }

 /**
   * Informar todos os operadores que participaram do manuseio da carga objetivando seu posicionamento para conferência física.
   * @return listaOperadoresPosicionamento
  **/
  @JsonProperty("listaOperadoresPosicionamento")
  public List<OperadorQueParticipouDoManuseioDaCarga> getListaOperadoresPosicionamento() {
    return listaOperadoresPosicionamento;
  }

  public void setListaOperadoresPosicionamento(List<OperadorQueParticipouDoManuseioDaCarga> listaOperadoresPosicionamento) {
    this.listaOperadoresPosicionamento = listaOperadoresPosicionamento;
  }

  public DadosDaConfernciaFsica listaOperadoresPosicionamento(List<OperadorQueParticipouDoManuseioDaCarga> listaOperadoresPosicionamento) {
    this.listaOperadoresPosicionamento = listaOperadoresPosicionamento;
    return this;
  }

  public DadosDaConfernciaFsica addListaOperadoresPosicionamentoItem(OperadorQueParticipouDoManuseioDaCarga listaOperadoresPosicionamentoItem) {
    this.listaOperadoresPosicionamento.add(listaOperadoresPosicionamentoItem);
    return this;
  }

 /**
   * Informar todos as pessoas que acompanharam o posicionamento da carga e/ou a conferência física exceto os operadores informados na lista anterior.
   * @return listaPessoasAcompanhamento
  **/
  @JsonProperty("listaPessoasAcompanhamento")
  public List<DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica> getListaPessoasAcompanhamento() {
    return listaPessoasAcompanhamento;
  }

  public void setListaPessoasAcompanhamento(List<DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica> listaPessoasAcompanhamento) {
    this.listaPessoasAcompanhamento = listaPessoasAcompanhamento;
  }

  public DadosDaConfernciaFsica listaPessoasAcompanhamento(List<DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica> listaPessoasAcompanhamento) {
    this.listaPessoasAcompanhamento = listaPessoasAcompanhamento;
    return this;
  }

  public DadosDaConfernciaFsica addListaPessoasAcompanhamentoItem(DadosDaPessoaQueAcompanhouOPosicionamentoEOuAConfernciaFsica listaPessoasAcompanhamentoItem) {
    this.listaPessoasAcompanhamento.add(listaPessoasAcompanhamentoItem);
    return this;
  }

 /**
   * Lista de lacres verificados
   * @return listaLacres
  **/
  @JsonProperty("listaLacres")
  public List<DadosDoLacre> getListaLacres() {
    return listaLacres;
  }

  public void setListaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
  }

  public DadosDaConfernciaFsica listaLacres(List<DadosDoLacre> listaLacres) {
    this.listaLacres = listaLacres;
    return this;
  }

  public DadosDaConfernciaFsica addListaLacresItem(DadosDoLacre listaLacresItem) {
    this.listaLacres.add(listaLacresItem);
    return this;
  }

 /**
   * Informar se houve retirada de amostras durante a conferência física&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return retiradaAmostras
  **/
  @JsonProperty("retiradaAmostras")
  public Boolean isRetiradaAmostras() {
    return retiradaAmostras;
  }

  public void setRetiradaAmostras(Boolean retiradaAmostras) {
    this.retiradaAmostras = retiradaAmostras;
  }

  public DadosDaConfernciaFsica retiradaAmostras(Boolean retiradaAmostras) {
    this.retiradaAmostras = retiradaAmostras;
    return this;
  }

 /**
   * Lista dos Tipos de Avarias.
   * @return listaTipoAvaria
  **/
  @JsonProperty("listaTipoAvaria")
  public List<DadosDoTipoDeAvaria> getListaTipoAvaria() {
    return listaTipoAvaria;
  }

  public void setListaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
    this.listaTipoAvaria = listaTipoAvaria;
  }

  public DadosDaConfernciaFsica listaTipoAvaria(List<DadosDoTipoDeAvaria> listaTipoAvaria) {
    this.listaTipoAvaria = listaTipoAvaria;
    return this;
  }

  public DadosDaConfernciaFsica addListaTipoAvariaItem(DadosDoTipoDeAvaria listaTipoAvariaItem) {
    this.listaTipoAvaria.add(listaTipoAvariaItem);
    return this;
  }

 /**
   * Informar o quantidade de volumes avariados
   * @return quantidadeVolumesAvariados
  **/
  @JsonProperty("quantidadeVolumesAvariados")
  public Integer getQuantidadeVolumesAvariados() {
    return quantidadeVolumesAvariados;
  }

  public void setQuantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
    this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
  }

  public DadosDaConfernciaFsica quantidadeVolumesAvariados(Integer quantidadeVolumesAvariados) {
    this.quantidadeVolumesAvariados = quantidadeVolumesAvariados;
    return this;
  }

 /**
   * Registrar as informações da avaria&lt;br/&gt;Tamanho: 200
   * @return observacaoAvaria
  **/
  @JsonProperty("observacaoAvaria")
  public String getObservacaoAvaria() {
    return observacaoAvaria;
  }

  public void setObservacaoAvaria(String observacaoAvaria) {
    this.observacaoAvaria = observacaoAvaria;
  }

  public DadosDaConfernciaFsica observacaoAvaria(String observacaoAvaria) {
    this.observacaoAvaria = observacaoAvaria;
    return this;
  }

 /**
   * Caso constatado, informar se há divergências de quantidade de mercadorias/volumes&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return divergenciaQuantidade
  **/
  @JsonProperty("divergenciaQuantidade")
  public Boolean isDivergenciaQuantidade() {
    return divergenciaQuantidade;
  }

  public void setDivergenciaQuantidade(Boolean divergenciaQuantidade) {
    this.divergenciaQuantidade = divergenciaQuantidade;
  }

  public DadosDaConfernciaFsica divergenciaQuantidade(Boolean divergenciaQuantidade) {
    this.divergenciaQuantidade = divergenciaQuantidade;
    return this;
  }

 /**
   * Caso constatado, informar se há divergências de qualificação de mercadorias/volumes&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return divergenciaQualificacao
  **/
  @JsonProperty("divergenciaQualificacao")
  public Boolean isDivergenciaQualificacao() {
    return divergenciaQualificacao;
  }

  public void setDivergenciaQualificacao(Boolean divergenciaQualificacao) {
    this.divergenciaQualificacao = divergenciaQualificacao;
  }

  public DadosDaConfernciaFsica divergenciaQualificacao(Boolean divergenciaQualificacao) {
    this.divergenciaQualificacao = divergenciaQualificacao;
    return this;
  }

 /**
   * Caso constatado, informar a quantidade de volumes divergentes
   * @return quantidadeVolumesDivergentes
  **/
  @JsonProperty("quantidadeVolumesDivergentes")
  public Integer getQuantidadeVolumesDivergentes() {
    return quantidadeVolumesDivergentes;
  }

  public void setQuantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
  }

  public DadosDaConfernciaFsica quantidadeVolumesDivergentes(Integer quantidadeVolumesDivergentes) {
    this.quantidadeVolumesDivergentes = quantidadeVolumesDivergentes;
    return this;
  }

 /**
   * Caso constatado, registrar as informações das divergências&lt;br/&gt;Tamanho: 200
   * @return observacaoDivergencia
  **/
  @JsonProperty("observacaoDivergencia")
  public String getObservacaoDivergencia() {
    return observacaoDivergencia;
  }

  public void setObservacaoDivergencia(String observacaoDivergencia) {
    this.observacaoDivergencia = observacaoDivergencia;
  }

  public DadosDaConfernciaFsica observacaoDivergencia(String observacaoDivergencia) {
    this.observacaoDivergencia = observacaoDivergencia;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosDaConfernciaFsica {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    dataHoraAgenda: ").append(toIndentedString(dataHoraAgenda)).append("\n");
    sb.append("    conferenciaRemota: ").append(toIndentedString(conferenciaRemota)).append("\n");
    sb.append("    listaTelefones: ").append(toIndentedString(listaTelefones)).append("\n");
    sb.append("    solicitante: ").append(toIndentedString(solicitante)).append("\n");
    sb.append("    setorSolicitante: ").append(toIndentedString(setorSolicitante)).append("\n");
    sb.append("    numeroManifesto: ").append(toIndentedString(numeroManifesto)).append("\n");
    sb.append("    tipoManifesto: ").append(toIndentedString(tipoManifesto)).append("\n");
    sb.append("    numeroConhecimentoMAWB: ").append(toIndentedString(numeroConhecimentoMAWB)).append("\n");
    sb.append("    numeroConhecimento: ").append(toIndentedString(numeroConhecimento)).append("\n");
    sb.append("    tipoConhecimento: ").append(toIndentedString(tipoConhecimento)).append("\n");
    sb.append("    declaracaoAduaneira: ").append(toIndentedString(declaracaoAduaneira)).append("\n");
    sb.append("    listaPlacaSemirreboque: ").append(toIndentedString(listaPlacaSemirreboque)).append("\n");
    sb.append("    listaNumeroConteiner: ").append(toIndentedString(listaNumeroConteiner)).append("\n");
    sb.append("    listaIdentificacaoUld: ").append(toIndentedString(listaIdentificacaoUld)).append("\n");
    sb.append("    listaNumeroLote: ").append(toIndentedString(listaNumeroLote)).append("\n");
    sb.append("    areaConferenciaFisica: ").append(toIndentedString(areaConferenciaFisica)).append("\n");
    sb.append("    listaCameras: ").append(toIndentedString(listaCameras)).append("\n");
    sb.append("    dataHoraOperacao: ").append(toIndentedString(dataHoraOperacao)).append("\n");
    sb.append("    listaOperadoresPosicionamento: ").append(toIndentedString(listaOperadoresPosicionamento)).append("\n");
    sb.append("    listaPessoasAcompanhamento: ").append(toIndentedString(listaPessoasAcompanhamento)).append("\n");
    sb.append("    listaLacres: ").append(toIndentedString(listaLacres)).append("\n");
    sb.append("    retiradaAmostras: ").append(toIndentedString(retiradaAmostras)).append("\n");
    sb.append("    listaTipoAvaria: ").append(toIndentedString(listaTipoAvaria)).append("\n");
    sb.append("    quantidadeVolumesAvariados: ").append(toIndentedString(quantidadeVolumesAvariados)).append("\n");
    sb.append("    observacaoAvaria: ").append(toIndentedString(observacaoAvaria)).append("\n");
    sb.append("    divergenciaQuantidade: ").append(toIndentedString(divergenciaQuantidade)).append("\n");
    sb.append("    divergenciaQualificacao: ").append(toIndentedString(divergenciaQualificacao)).append("\n");
    sb.append("    quantidadeVolumesDivergentes: ").append(toIndentedString(quantidadeVolumesDivergentes)).append("\n");
    sb.append("    observacaoDivergencia: ").append(toIndentedString(observacaoDivergencia)).append("\n");
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

