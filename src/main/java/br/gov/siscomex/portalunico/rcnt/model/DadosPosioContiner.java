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
 @XmlType(name = "DadosPosioContiner", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "numeroConteiner", "placaSemirreboque", "localizacao", "posicaoNavio", "conferenciaFisica", "solicitanteFisica", "avaria", "vazio", "areaConteiner", "listaCameras"
})

@XmlRootElement(name="DadosPosioContiner")
public class DadosPosioContiner  {
  

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

  @XmlElement(name="numeroConteiner", required = true)
  @ApiModelProperty(required = true, value = "Identificação do número do contêiner. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 200")
 /**
   * Identificação do número do contêiner. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 200
  **/
  private String numeroConteiner = null;

  @XmlElement(name="placaSemirreboque")
  @ApiModelProperty(value = "Placa semirreboque/vagão. Informar em caso de descarregamento. <br/>Tamanho: 50")
 /**
   * Placa semirreboque/vagão. Informar em caso de descarregamento. <br/>Tamanho: 50
  **/
  private String placaSemirreboque = null;

  @XmlElement(name="localizacao")
  @ApiModelProperty(value = "")
  @Valid
  private DadosLocalizaoLote localizacao = null;

  @XmlElement(name="posicaoNavio")
  @ApiModelProperty(value = "Posição que o contêiner tinha no navio no caso de descarregamento ou a posição prevista do contêiner no navio para fins de carregamento. <br/>Tamanho: 20")
 /**
   * Posição que o contêiner tinha no navio no caso de descarregamento ou a posição prevista do contêiner no navio para fins de carregamento. <br/>Tamanho: 20
  **/
  private String posicaoNavio = null;

  @XmlElement(name="conferenciaFisica")
  @ApiModelProperty(example = "false", value = "Informar se o contêiner está em conferência física. <br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Informar se o contêiner está em conferência física. <br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean conferenciaFisica = null;


@XmlType(name="SolicitanteFisicaEnum")
@XmlEnum(String.class)
public enum SolicitanteFisicaEnum {

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

    SolicitanteFisicaEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SolicitanteFisicaEnum fromValue(String v) {
        for (SolicitanteFisicaEnum b : SolicitanteFisicaEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to SolicitanteFisicaEnum");
    }
}

  @XmlElement(name="solicitanteFisica")
  @ApiModelProperty(example = "ANCINE", value = "Indicar qual o interveniente que solicitou a conferência física conforme tabela de domínio.<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE")
 /**
   * Indicar qual o interveniente que solicitou a conferência física conforme tabela de domínio.<br/>Domínio:<br/>ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO<br/>ANCINE - AGENCIA NACIONAL DO CINEMA<br/>ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA<br/>ANP - AGENCIA NACIONAL DO PETROLEO<br/>ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA<br/>BB - BANCO DO BRASIL<br/>BEFIEX - PROGRAMAS BEFIEX<br/>BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL<br/>CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR<br/>CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO<br/>CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS<br/>COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL<br/>DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO<br/>DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR<br/>DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR<br/>DEPOSITARIO - DEPOSITÁRIO<br/>DESPACHANTE - DESPACHANTE<br/>DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS<br/>DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL<br/>DPF - DEPARTAMENTO DE POLICIA FEDERAL<br/>ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS<br/>EXPORTADOR - EXPORTADOR<br/>GESTOR - MICT/DECEX/GESTOR<br/>IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS<br/>INMETRO - INSTITUTO NACIONAL DE METROLOGIA<br/>IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL<br/>IMPORTADOR - IMPORTADOR<br/>JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.<br/>MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO<br/>MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO<br/>MD - MINISTERIO DA DEFESA<br/>MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES<br/>RFB - RECEITA FEDERAL DO BRASIL<br/>SDAVO - AUDIOVISUAL<br/>SECEX - SECRETARIA DE COMERCIO EXTERIOR<br/>SEPIN - MIN.DA CIENCIA E TECNOLOGIA<br/>SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO<br/>SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS<br/>TRANSPORTADOR - TRANSPORTADOR<br/>OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
  **/
  private SolicitanteFisicaEnum solicitanteFisica = null;

  @XmlElement(name="avaria")
  @ApiModelProperty(example = "false", value = "Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Avaria.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean avaria = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;

  @XmlElement(name="areaConteiner")
  @ApiModelProperty(value = "Identificação da área de posicionamento do contêiner. Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 36")
 /**
   * Identificação da área de posicionamento do contêiner. Usar o protocolo do evento de georreferenciamento.<br/>Tamanho: 36
  **/
  private String areaConteiner = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a unidade foi posicionada.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a unidade foi posicionada.
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

  public DadosPosioContiner tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosPosioContiner idEvento(String idEvento) {
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

  public DadosPosioContiner dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosPosioContiner dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosPosioContiner cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosPosioContiner cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosPosioContiner protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosPosioContiner contingencia(Boolean contingencia) {
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

  public DadosPosioContiner codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Identificação do número do contêiner. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 200
   * @return numeroConteiner
  **/
  @JsonProperty("numeroConteiner")
  @NotNull
  public String getNumeroConteiner() {
    return numeroConteiner;
  }

  public void setNumeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
  }

  public DadosPosioContiner numeroConteiner(String numeroConteiner) {
    this.numeroConteiner = numeroConteiner;
    return this;
  }

 /**
   * Placa semirreboque/vagão. Informar em caso de descarregamento. &lt;br/&gt;Tamanho: 50
   * @return placaSemirreboque
  **/
  @JsonProperty("placaSemirreboque")
  public String getPlacaSemirreboque() {
    return placaSemirreboque;
  }

  public void setPlacaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
  }

  public DadosPosioContiner placaSemirreboque(String placaSemirreboque) {
    this.placaSemirreboque = placaSemirreboque;
    return this;
  }

 /**
   * Get localizacao
   * @return localizacao
  **/
  @JsonProperty("localizacao")
  public DadosLocalizaoLote getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(DadosLocalizaoLote localizacao) {
    this.localizacao = localizacao;
  }

  public DadosPosioContiner localizacao(DadosLocalizaoLote localizacao) {
    this.localizacao = localizacao;
    return this;
  }

 /**
   * Posição que o contêiner tinha no navio no caso de descarregamento ou a posição prevista do contêiner no navio para fins de carregamento. &lt;br/&gt;Tamanho: 20
   * @return posicaoNavio
  **/
  @JsonProperty("posicaoNavio")
  public String getPosicaoNavio() {
    return posicaoNavio;
  }

  public void setPosicaoNavio(String posicaoNavio) {
    this.posicaoNavio = posicaoNavio;
  }

  public DadosPosioContiner posicaoNavio(String posicaoNavio) {
    this.posicaoNavio = posicaoNavio;
    return this;
  }

 /**
   * Informar se o contêiner está em conferência física. &lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return conferenciaFisica
  **/
  @JsonProperty("conferenciaFisica")
  public Boolean isConferenciaFisica() {
    return conferenciaFisica;
  }

  public void setConferenciaFisica(Boolean conferenciaFisica) {
    this.conferenciaFisica = conferenciaFisica;
  }

  public DadosPosioContiner conferenciaFisica(Boolean conferenciaFisica) {
    this.conferenciaFisica = conferenciaFisica;
    return this;
  }

 /**
   * Indicar qual o interveniente que solicitou a conferência física conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;ACI - ÓRGÃO ESTRANGEIRO EM ÁREA DE CONTROLE INTEGRADO&lt;br/&gt;ANCINE - AGENCIA NACIONAL DO CINEMA&lt;br/&gt;ANEEL - AGENCIA NACIONAL DE ENERGIA ELETRICA&lt;br/&gt;ANP - AGENCIA NACIONAL DO PETROLEO&lt;br/&gt;ANVISA - AGENCIA NACIONAL DE VIGILANCIA SANITARIA&lt;br/&gt;BB - BANCO DO BRASIL&lt;br/&gt;BEFIEX - PROGRAMAS BEFIEX&lt;br/&gt;BNDES - BANCO NACIONAL DE DESENVOLVIMENTO ECONÔMICO E SOCIAL&lt;br/&gt;CNEN - COMISSAO NACIONAL DE ENERGIA NUCLEAR&lt;br/&gt;CNPQ - CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTIFICO E TECNOLOGICO&lt;br/&gt;CONFAZ - CONSELHO NACIONAL DE POLITICA FAZENDARIA/SECRETARIAS DE FAZENDA ESTADUAIS&lt;br/&gt;COTAC - MIN.AERON. COMISSAO COORDENADORA DO TRANSPORTE AEREO CIVIL&lt;br/&gt;DEAEX - DEPARTAMENTO DE ESTATISTICA E APOIO A EXPORTACAO&lt;br/&gt;DECEX - DEPARTAMENTO DE OPERACOES DE COMERCIO EXTERIOR&lt;br/&gt;DEPLA - DEPARTAMENTO DE PLANEJAMENTO E DESENVOLVIMENTO DO COMERCIO EXTERIOR&lt;br/&gt;DEPOSITARIO - DEPOSITÁRIO&lt;br/&gt;DESPACHANTE - DESPACHANTE&lt;br/&gt;DFPC - DIRETORIA DE FISCALIZACAO DE PRODUTOS CONTROLADOS&lt;br/&gt;DNPM - DEPARTAMENTO NACIONAL DE PRODUCAO MINERAL&lt;br/&gt;DPF - DEPARTAMENTO DE POLICIA FEDERAL&lt;br/&gt;ECT - EMPRESA BRASILEIRA DE CORREIOS E TELEGRAFOS&lt;br/&gt;EXPORTADOR - EXPORTADOR&lt;br/&gt;GESTOR - MICT/DECEX/GESTOR&lt;br/&gt;IBAMA - INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVAVEIS&lt;br/&gt;INMETRO - INSTITUTO NACIONAL DE METROLOGIA&lt;br/&gt;IPHAN - INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL&lt;br/&gt;IMPORTADOR - IMPORTADOR&lt;br/&gt;JUSTIÇA - JUSTIÇA FEDERAL OU ESTADUAL, TRIBUNAIS, E DEMAIS.&lt;br/&gt;MAPA - MINISTERIO DA AGRICULTURA,PECUARIA E ABASTECIMENTO&lt;br/&gt;MCTI - MINISTERIO DA CIENCIA, TECNOLOGIA E INOVACAO&lt;br/&gt;MD - MINISTERIO DA DEFESA&lt;br/&gt;MRE - MINISTÉRIO DAS RELAÇÕES EXTERIORES&lt;br/&gt;RFB - RECEITA FEDERAL DO BRASIL&lt;br/&gt;SDAVO - AUDIOVISUAL&lt;br/&gt;SECEX - SECRETARIA DE COMERCIO EXTERIOR&lt;br/&gt;SEPIN - MIN.DA CIENCIA E TECNOLOGIA&lt;br/&gt;SPC_MA - SECRETARIA DE PRODUCAO E COMERCIALIZACAO&lt;br/&gt;SUFRAMA - SUPERINTENDENCIA DA ZONA FRANCA DE MANAUS&lt;br/&gt;TRANSPORTADOR - TRANSPORTADOR&lt;br/&gt;OUTRO - OUTROS NÃO LISTADOS ANTERIORMENTE
   * @return solicitanteFisica
  **/
  @JsonProperty("solicitanteFisica")
  public String getSolicitanteFisica() {
    if (solicitanteFisica == null) {
      return null;
    }
    return solicitanteFisica.value();
  }

  public void setSolicitanteFisica(SolicitanteFisicaEnum solicitanteFisica) {
    this.solicitanteFisica = solicitanteFisica;
  }

  public DadosPosioContiner solicitanteFisica(SolicitanteFisicaEnum solicitanteFisica) {
    this.solicitanteFisica = solicitanteFisica;
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

  public DadosPosioContiner avaria(Boolean avaria) {
    this.avaria = avaria;
    return this;
  }

 /**
   * Vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosPosioContiner vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }

 /**
   * Identificação da área de posicionamento do contêiner. Usar o protocolo do evento de georreferenciamento.&lt;br/&gt;Tamanho: 36
   * @return areaConteiner
  **/
  @JsonProperty("areaConteiner")
  public String getAreaConteiner() {
    return areaConteiner;
  }

  public void setAreaConteiner(String areaConteiner) {
    this.areaConteiner = areaConteiner;
  }

  public DadosPosioContiner areaConteiner(String areaConteiner) {
    this.areaConteiner = areaConteiner;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde a unidade foi posicionada.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosPosioContiner listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosPosioContiner addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPosioContiner {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    numeroConteiner: ").append(toIndentedString(numeroConteiner)).append("\n");
    sb.append("    placaSemirreboque: ").append(toIndentedString(placaSemirreboque)).append("\n");
    sb.append("    localizacao: ").append(toIndentedString(localizacao)).append("\n");
    sb.append("    posicaoNavio: ").append(toIndentedString(posicaoNavio)).append("\n");
    sb.append("    conferenciaFisica: ").append(toIndentedString(conferenciaFisica)).append("\n");
    sb.append("    solicitanteFisica: ").append(toIndentedString(solicitanteFisica)).append("\n");
    sb.append("    avaria: ").append(toIndentedString(avaria)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
    sb.append("    areaConteiner: ").append(toIndentedString(areaConteiner)).append("\n");
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

