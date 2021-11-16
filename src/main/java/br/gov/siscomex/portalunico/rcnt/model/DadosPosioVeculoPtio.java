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
 @XmlType(name = "DadosPosioVeculoPtio", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "listaManifestos", "placa", "listaChassi", "listaSemirreboque", "listaConteineresUld", "box", "conferenciaFisica", "orgaoSolicitante", "avaria", "areaVeiculos", "listaCameras"
})

@XmlRootElement(name="DadosPosioVeculoPtio")
public class DadosPosioVeculoPtio  {
  

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

  @XmlElement(name="listaManifestos")
  @ApiModelProperty(value = "Lista de manifestos.")
  @Valid
 /**
   * Lista de manifestos.
  **/
  private List<DadosDoManisfestoDaCarga> listaManifestos = null;

  @XmlElement(name="placa", required = true)
  @ApiModelProperty(required = true, value = "Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50")
 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="listaChassi")
  @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)<br/>Tamanho: 50")
  @Valid
 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)<br/>Tamanho: 50
  **/
  private List<DadosDoChassi> listaChassi = null;

  @XmlElement(name="listaSemirreboque")
  @ApiModelProperty(value = "Lista de semirreboques ou vagões")
  @Valid
 /**
   * Lista de semirreboques ou vagões
  **/
  private List<DadosSemirreboquePosioVeculoPtio> listaSemirreboque = null;

  @XmlElement(name="listaConteineresUld")
  @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
  @Valid
 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
  **/
  private List<DadosContinerUldPosioVeculoPtio> listaConteineresUld = null;

  @XmlElement(name="box", required = true)
  @ApiModelProperty(required = true, value = "Box indicativo da localização do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Box indicativo da localização do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String box = null;

  @XmlElement(name="conferenciaFisica")
  @ApiModelProperty(example = "false", value = "Indicar se o veículo encontra-se em conferência física<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indicar se o veículo encontra-se em conferência física<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean conferenciaFisica = null;


@XmlType(name="OrgaoSolicitanteEnum")
@XmlEnum(String.class)
public enum OrgaoSolicitanteEnum {

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

    OrgaoSolicitanteEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrgaoSolicitanteEnum fromValue(String v) {
        for (OrgaoSolicitanteEnum b : OrgaoSolicitanteEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to OrgaoSolicitanteEnum");
    }
}

  @XmlElement(name="orgaoSolicitante")
  @ApiModelProperty(example = "ANCINE", value = "Indicar qual o interveniente que solicitou a conferência. Pode ser um ente de outro país, especialmente nos casos de ACI.<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE")
 /**
   * Indicar qual o interveniente que solicitou a conferência. Pode ser um ente de outro país, especialmente nos casos de ACI.<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
  **/
  private OrgaoSolicitanteEnum orgaoSolicitante = null;

  @XmlElement(name="avaria")
  @ApiModelProperty(example = "false", value = "Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean avaria = null;

  @XmlElement(name="areaVeiculos")
  @ApiModelProperty(value = "Identificação da área de posicionamento dos veículos. Usar o protocolo do Evento de Georreferenciamento relativo ao ponto de acesso utilizado.<br/>Tamanho: 36")
 /**
   * Identificação da área de posicionamento dos veículos. Usar o protocolo do Evento de Georreferenciamento relativo ao ponto de acesso utilizado.<br/>Tamanho: 36
  **/
  private String areaVeiculos = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o veículo está posicionado.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o veículo está posicionado.
  **/
  private List<DadosDaCmera> listaCameras = null;
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

  public DadosPosioVeculoPtio tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosPosioVeculoPtio idEvento(String idEvento) {
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

  public DadosPosioVeculoPtio dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosPosioVeculoPtio dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosPosioVeculoPtio cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosPosioVeculoPtio cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosPosioVeculoPtio protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosPosioVeculoPtio contingencia(Boolean contingencia) {
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

  public DadosPosioVeculoPtio codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Lista de manifestos.
   * @return listaManifestos
  **/
  @JsonProperty("listaManifestos")
  public List<DadosDoManisfestoDaCarga> getListaManifestos() {
    return listaManifestos;
  }

  public void setListaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
  }

  public DadosPosioVeculoPtio listaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosPosioVeculoPtio addListaManifestosItem(DadosDoManisfestoDaCarga listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  @NotNull
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosPosioVeculoPtio placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...)&lt;br/&gt;Tamanho: 50
   * @return listaChassi
  **/
  @JsonProperty("listaChassi")
  public List<DadosDoChassi> getListaChassi() {
    return listaChassi;
  }

  public void setListaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
  }

  public DadosPosioVeculoPtio listaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
    return this;
  }

  public DadosPosioVeculoPtio addListaChassiItem(DadosDoChassi listaChassiItem) {
    this.listaChassi.add(listaChassiItem);
    return this;
  }

 /**
   * Lista de semirreboques ou vagões
   * @return listaSemirreboque
  **/
  @JsonProperty("listaSemirreboque")
  public List<DadosSemirreboquePosioVeculoPtio> getListaSemirreboque() {
    return listaSemirreboque;
  }

  public void setListaSemirreboque(List<DadosSemirreboquePosioVeculoPtio> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
  }

  public DadosPosioVeculoPtio listaSemirreboque(List<DadosSemirreboquePosioVeculoPtio> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
    return this;
  }

  public DadosPosioVeculoPtio addListaSemirreboqueItem(DadosSemirreboquePosioVeculoPtio listaSemirreboqueItem) {
    this.listaSemirreboque.add(listaSemirreboqueItem);
    return this;
  }

 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
   * @return listaConteineresUld
  **/
  @JsonProperty("listaConteineresUld")
  public List<DadosContinerUldPosioVeculoPtio> getListaConteineresUld() {
    return listaConteineresUld;
  }

  public void setListaConteineresUld(List<DadosContinerUldPosioVeculoPtio> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
  }

  public DadosPosioVeculoPtio listaConteineresUld(List<DadosContinerUldPosioVeculoPtio> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
    return this;
  }

  public DadosPosioVeculoPtio addListaConteineresUldItem(DadosContinerUldPosioVeculoPtio listaConteineresUldItem) {
    this.listaConteineresUld.add(listaConteineresUldItem);
    return this;
  }

 /**
   * Box indicativo da localização do veículo. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
   * @return box
  **/
  @JsonProperty("box")
  @NotNull
  public String getBox() {
    return box;
  }

  public void setBox(String box) {
    this.box = box;
  }

  public DadosPosioVeculoPtio box(String box) {
    this.box = box;
    return this;
  }

 /**
   * Indicar se o veículo encontra-se em conferência física&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return conferenciaFisica
  **/
  @JsonProperty("conferenciaFisica")
  public Boolean isConferenciaFisica() {
    return conferenciaFisica;
  }

  public void setConferenciaFisica(Boolean conferenciaFisica) {
    this.conferenciaFisica = conferenciaFisica;
  }

  public DadosPosioVeculoPtio conferenciaFisica(Boolean conferenciaFisica) {
    this.conferenciaFisica = conferenciaFisica;
    return this;
  }

 /**
   * Indicar qual o interveniente que solicitou a conferência. Pode ser um ente de outro país, especialmente nos casos de ACI.&lt;br/&gt;Domínio:&lt;br/&gt;ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BEFIEX - PROGRAMAS BEFIEX&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR&lt;br/&gt;DEPOSITARIO - DEPOSITÁRIO&lt;br/&gt;DESPACHANTE - DESPACHANTE&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;EXPORTADOR - EXPORTADOR&lt;br/&gt;GESTOR - MICT/DECEX/GESTOR&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;IMPORTADOR - IMPORTADOR&lt;br/&gt;JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MD - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RFB - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SDAVO - AUDIOVISUAL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SEPIN - MIN.DA CIENCIA E TECNOLOGIA&lt;br/&gt;SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS&lt;br/&gt;TRANSPORTADOR - TRANSPORTADOR&lt;br/&gt;OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
   * @return orgaoSolicitante
  **/
  @JsonProperty("orgaoSolicitante")
  public String getOrgaoSolicitante() {
    if (orgaoSolicitante == null) {
      return null;
    }
    return orgaoSolicitante.value();
  }

  public void setOrgaoSolicitante(OrgaoSolicitanteEnum orgaoSolicitante) {
    this.orgaoSolicitante = orgaoSolicitante;
  }

  public DadosPosioVeculoPtio orgaoSolicitante(OrgaoSolicitanteEnum orgaoSolicitante) {
    this.orgaoSolicitante = orgaoSolicitante;
    return this;
  }

 /**
   * Avaria.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return avaria
  **/
  @JsonProperty("avaria")
  public Boolean isAvaria() {
    return avaria;
  }

  public void setAvaria(Boolean avaria) {
    this.avaria = avaria;
  }

  public DadosPosioVeculoPtio avaria(Boolean avaria) {
    this.avaria = avaria;
    return this;
  }

 /**
   * Identificação da área de posicionamento dos veículos. Usar o protocolo do Evento de Georreferenciamento relativo ao ponto de acesso utilizado.&lt;br/&gt;Tamanho: 36
   * @return areaVeiculos
  **/
  @JsonProperty("areaVeiculos")
  public String getAreaVeiculos() {
    return areaVeiculos;
  }

  public void setAreaVeiculos(String areaVeiculos) {
    this.areaVeiculos = areaVeiculos;
  }

  public DadosPosioVeculoPtio areaVeiculos(String areaVeiculos) {
    this.areaVeiculos = areaVeiculos;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde o veículo está posicionado.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosPosioVeculoPtio listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosPosioVeculoPtio addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPosioVeculoPtio {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    listaManifestos: ").append(toIndentedString(listaManifestos)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    listaChassi: ").append(toIndentedString(listaChassi)).append("\n");
    sb.append("    listaSemirreboque: ").append(toIndentedString(listaSemirreboque)).append("\n");
    sb.append("    listaConteineresUld: ").append(toIndentedString(listaConteineresUld)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    conferenciaFisica: ").append(toIndentedString(conferenciaFisica)).append("\n");
    sb.append("    orgaoSolicitante: ").append(toIndentedString(orgaoSolicitante)).append("\n");
    sb.append("    avaria: ").append(toIndentedString(avaria)).append("\n");
    sb.append("    areaVeiculos: ").append(toIndentedString(areaVeiculos)).append("\n");
    sb.append("    listaCameras: ").append(toIndentedString(listaCameras)).append("\n");
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

