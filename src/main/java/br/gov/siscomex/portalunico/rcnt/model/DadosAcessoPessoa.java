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
 @XmlType(name = "DadosAcessoPessoa", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "cpf", "direcao", "identificacao", "identidadeEstrangeiro", "nome", "reserva", "voo", "catraca", "listaCameras"
})

@XmlRootElement(name="DadosAcessoPessoa")
public class DadosAcessoPessoa  {
  

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

  @XmlElement(name="cpf")
  @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que está acessando o recinto (entrada ou saída).<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF da pessoa que está acessando o recinto (entrada ou saída).<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;


@XmlType(name="DirecaoEnum")
@XmlEnum(String.class)
public enum DirecaoEnum {

	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'S'")
	@JsonProperty("'S'")
	S_(String.valueOf("'S'"));


    private String value;

    DirecaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DirecaoEnum fromValue(String v) {
        for (DirecaoEnum b : DirecaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to DirecaoEnum");
    }
}

  @XmlElement(name="direcao", required = true)
  @ApiModelProperty(example = "E", required = true, value = "Direção do acesso. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída")
 /**
   * Direção do acesso. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída
  **/
  private DirecaoEnum direcao = null;


@XmlType(name="IdentificacaoEnum")
@XmlEnum(String.class)
public enum IdentificacaoEnum {

	@XmlEnumValue("'1'")
	@JsonProperty("'1'")
	_1_(String.valueOf("'1'")),
	
	@XmlEnumValue("'2'")
	@JsonProperty("'2'")
	_2_(String.valueOf("'2'")),
	
	@XmlEnumValue("'3'")
	@JsonProperty("'3'")
	_3_(String.valueOf("'3'")),
	
	@XmlEnumValue("'4'")
	@JsonProperty("'4'")
	_4_(String.valueOf("'4'"));


    private String value;

    IdentificacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IdentificacaoEnum fromValue(String v) {
        for (IdentificacaoEnum b : IdentificacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to IdentificacaoEnum");
    }
}

  @XmlElement(name="identificacao")
  @ApiModelProperty(example = "1", value = "Forma de identificação conforme tabela de domínio.<br/>Domínio:<br/>1 - cartão<br/>2 - biométrico<br/>3 - cartão + biometria <br/>4 - manual")
 /**
   * Forma de identificação conforme tabela de domínio.<br/>Domínio:<br/>1 - cartão<br/>2 - biométrico<br/>3 - cartão + biometria <br/>4 - manual
  **/
  private IdentificacaoEnum identificacao = null;

  @XmlElement(name="identidadeEstrangeiro")
  @ApiModelProperty(example = "'FB000001'", value = "Número do documento de estrangeiro. <br/> Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<br/>Tamanho: 50")
 /**
   * Número do documento de estrangeiro. <br/> Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<br/>Tamanho: 50
  **/
  private String identidadeEstrangeiro = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(required = true, value = "Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String nome = null;

  @XmlElement(name="reserva")
  @ApiModelProperty(value = "Número da reserva do passageiro. <br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 50")
 /**
   * Número da reserva do passageiro. <br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 50
  **/
  private String reserva = null;

  @XmlElement(name="voo")
  @ApiModelProperty(value = "Número do voo do passageiro. <br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 20")
 /**
   * Número do voo do passageiro. <br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 20
  **/
  private String voo = null;

  @XmlElement(name="catraca")
  @ApiModelProperty(value = "Portão ou catraca de acesso. <br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado<br/>Tamanho: 36")
 /**
   * Portão ou catraca de acesso. <br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado<br/>Tamanho: 36
  **/
  private String catraca = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área de acesso.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área de acesso.
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

  public DadosAcessoPessoa tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosAcessoPessoa idEvento(String idEvento) {
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

  public DadosAcessoPessoa dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosAcessoPessoa dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosAcessoPessoa cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosAcessoPessoa cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosAcessoPessoa protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosAcessoPessoa contingencia(Boolean contingencia) {
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

  public DadosAcessoPessoa codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * CPF da pessoa que está acessando o recinto (entrada ou saída).&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public DadosAcessoPessoa cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Direção do acesso. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada&lt;br/&gt;S - Saída
   * @return direcao
  **/
  @JsonProperty("direcao")
  @NotNull
  public String getDirecao() {
    if (direcao == null) {
      return null;
    }
    return direcao.value();
  }

  public void setDirecao(DirecaoEnum direcao) {
    this.direcao = direcao;
  }

  public DadosAcessoPessoa direcao(DirecaoEnum direcao) {
    this.direcao = direcao;
    return this;
  }

 /**
   * Forma de identificação conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;1 - cartão&lt;br/&gt;2 - biométrico&lt;br/&gt;3 - cartão + biometria &lt;br/&gt;4 - manual
   * @return identificacao
  **/
  @JsonProperty("identificacao")
  public String getIdentificacao() {
    if (identificacao == null) {
      return null;
    }
    return identificacao.value();
  }

  public void setIdentificacao(IdentificacaoEnum identificacao) {
    this.identificacao = identificacao;
  }

  public DadosAcessoPessoa identificacao(IdentificacaoEnum identificacao) {
    this.identificacao = identificacao;
    return this;
  }

 /**
   * Número do documento de estrangeiro. &lt;br/&gt; Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.&lt;br/&gt;Tamanho: 50
   * @return identidadeEstrangeiro
  **/
  @JsonProperty("identidadeEstrangeiro")
  public String getIdentidadeEstrangeiro() {
    return identidadeEstrangeiro;
  }

  public void setIdentidadeEstrangeiro(String identidadeEstrangeiro) {
    this.identidadeEstrangeiro = identidadeEstrangeiro;
  }

  public DadosAcessoPessoa identidadeEstrangeiro(String identidadeEstrangeiro) {
    this.identidadeEstrangeiro = identidadeEstrangeiro;
    return this;
  }

 /**
   * Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
   * @return nome
  **/
  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public DadosAcessoPessoa nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Número da reserva do passageiro. &lt;br/&gt;Acesso de pessoas em áreas alfandegadas de aeroportos&lt;br/&gt;Tamanho: 50
   * @return reserva
  **/
  @JsonProperty("reserva")
  public String getReserva() {
    return reserva;
  }

  public void setReserva(String reserva) {
    this.reserva = reserva;
  }

  public DadosAcessoPessoa reserva(String reserva) {
    this.reserva = reserva;
    return this;
  }

 /**
   * Número do voo do passageiro. &lt;br/&gt;Acesso de pessoas em áreas alfandegadas de aeroportos&lt;br/&gt;Tamanho: 20
   * @return voo
  **/
  @JsonProperty("voo")
  public String getVoo() {
    return voo;
  }

  public void setVoo(String voo) {
    this.voo = voo;
  }

  public DadosAcessoPessoa voo(String voo) {
    this.voo = voo;
    return this;
  }

 /**
   * Portão ou catraca de acesso. &lt;br/&gt;Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado&lt;br/&gt;Tamanho: 36
   * @return catraca
  **/
  @JsonProperty("catraca")
  public String getCatraca() {
    return catraca;
  }

  public void setCatraca(String catraca) {
    this.catraca = catraca;
  }

  public DadosAcessoPessoa catraca(String catraca) {
    this.catraca = catraca;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área de acesso.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosAcessoPessoa listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosAcessoPessoa addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAcessoPessoa {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    direcao: ").append(toIndentedString(direcao)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
    sb.append("    identidadeEstrangeiro: ").append(toIndentedString(identidadeEstrangeiro)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    reserva: ").append(toIndentedString(reserva)).append("\n");
    sb.append("    voo: ").append(toIndentedString(voo)).append("\n");
    sb.append("    catraca: ").append(toIndentedString(catraca)).append("\n");
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

