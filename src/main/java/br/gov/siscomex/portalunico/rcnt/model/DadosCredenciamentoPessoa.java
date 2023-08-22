package br.gov.siscomex.portalunico.rcnt.model;

import br.gov.siscomex.portalunico.rcnt.model.DadosDocumentoEstrangeiro;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosCredenciamentoPessoa", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "cpf", "documentoEstrangeiro", "paisNacionalidade", "genero", "cnh", "nome", "dataNascimento", "fone", "cnpjRepresentado", "cpfRepresentado", "nomeRepresentado", "qualificacao", "funcao", "dataInicioValidade", "dataFimValidade", "horaPrevistaEntrada", "horaPrevistaSaida", "areas", "materiaisFerramentas", "credenciamentoAtivo", "motivacao"
})

@XmlRootElement(name="DadosCredenciamentoPessoa")
public class DadosCredenciamentoPessoa  {
  

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
  @ApiModelProperty(example = "55555555555", value = "CPF<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpf = null;

  @XmlElement(name="documentoEstrangeiro")
  @ApiModelProperty(value = "")
  @Valid
  private DadosDocumentoEstrangeiro documentoEstrangeiro = null;

  @XmlElement(name="paisNacionalidade")
  @ApiModelProperty(example = "DE", value = "País Nacionalidade. Conforme tabela de domínio País disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>")
 /**
   * País Nacionalidade. Conforme tabela de domínio País disponível no <a href=https://portalunico.siscomex.gov.br/tabx/#/tabelas rel=\"noopener noreferrer\" target=\"_blank\">Portal Único Siscomex.</a>
  **/
  private String paisNacionalidade = null;


@XmlType(name="GeneroEnum")
@XmlEnum(String.class)
public enum GeneroEnum {

	@XmlEnumValue("'F'")
	@JsonProperty("'F'")
	F_(String.valueOf("'F'")),
	
	@XmlEnumValue("'M'")
	@JsonProperty("'M'")
	M_(String.valueOf("'M'"));


    private String value;

    GeneroEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GeneroEnum fromValue(String v) {
        for (GeneroEnum b : GeneroEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to GeneroEnum");
    }
}

  @XmlElement(name="genero")
  @ApiModelProperty(example = "F", value = "Gênero conforme tabela de domínio<br/>Domínio:<br/>F - Feminino<br/>M - Masculino<br/>Tamanho: 1")
 /**
   * Gênero conforme tabela de domínio<br/>Domínio:<br/>F - Feminino<br/>M - Masculino<br/>Tamanho: 1
  **/
  private GeneroEnum genero = null;

  @XmlElement(name="cnh")
  @ApiModelProperty(value = "CNH de motoristas. Obrigatório informar no caso de credenciamento de motoristas que acessam o recinto com veículos.<br/>Tamanho: 50")
 /**
   * CNH de motoristas. Obrigatório informar no caso de credenciamento de motoristas que acessam o recinto com veículos.<br/>Tamanho: 50
  **/
  private String cnh = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(required = true, value = "Nome. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Nome. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String nome = null;

  @XmlElement(name="dataNascimento")
  @ApiModelProperty(example = "2020-04-01", value = "Data de nascimento<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Data de nascimento<br/>Formato: 'yyyy-MM-dd'
  **/
  private String dataNascimento = null;

  @XmlElement(name="fone")
  @ApiModelProperty(value = "Telefone<br/>Tamanho: 20")
 /**
   * Telefone<br/>Tamanho: 20
  **/
  private String fone = null;

  @XmlElement(name="cnpjRepresentado")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjRepresentado = null;

  @XmlElement(name="cpfRepresentado")
  @ApiModelProperty(example = "55555555555", value = "CPF do representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfRepresentado = null;

  @XmlElement(name="nomeRepresentado")
  @ApiModelProperty(value = "Nome do representado<br/>Tamanho: 100")
 /**
   * Nome do representado<br/>Tamanho: 100
  **/
  private String nomeRepresentado = null;

  @XmlElement(name="qualificacao")
  @ApiModelProperty(value = "Qualificação (Funcionários, Ajudante despachante, Visitante, Prestador de Serviços, Autoridade Pública, etc)<br/>Tamanho: 50")
 /**
   * Qualificação (Funcionários, Ajudante despachante, Visitante, Prestador de Serviços, Autoridade Pública, etc)<br/>Tamanho: 50
  **/
  private String qualificacao = null;

  @XmlElement(name="funcao")
  @ApiModelProperty(value = "Função na empresa representada<br/>Tamanho: 50")
 /**
   * Função na empresa representada<br/>Tamanho: 50
  **/
  private String funcao = null;

  @XmlElement(name="dataInicioValidade")
  @ApiModelProperty(example = "2020-04-01", value = "Data do início da validade do credenciamento<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Data do início da validade do credenciamento<br/>Formato: 'yyyy-MM-dd'
  **/
  private String dataInicioValidade = null;

  @XmlElement(name="dataFimValidade")
  @ApiModelProperty(example = "2020-04-01", value = "Data do final da validade do credenciamento, se houver<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Data do final da validade do credenciamento, se houver<br/>Formato: 'yyyy-MM-dd'
  **/
  private String dataFimValidade = null;

  @XmlElement(name="horaPrevistaEntrada")
  @ApiModelProperty(example = "12:30:15-0300", value = "Hora prevista para entrada no recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.<br/>Formato: 'HH:mm:ssZ'")
 /**
   * Hora prevista para entrada no recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.<br/>Formato: 'HH:mm:ssZ'
  **/
  private String horaPrevistaEntrada = null;

  @XmlElement(name="horaPrevistaSaida")
  @ApiModelProperty(example = "12:30:15-0300", value = "Hora prevista para saída do recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.<br/>Formato: 'HH:mm:ssZ'")
 /**
   * Hora prevista para saída do recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.<br/>Formato: 'HH:mm:ssZ'
  **/
  private String horaPrevistaSaida = null;

  @XmlElement(name="areas")
  @ApiModelProperty(value = "Áreas permitidas de acesso. Somente para os casos em que o usuário foi credenciado para acessar apenas algumas áreas.<br/>Tamanho: 50")
 /**
   * Áreas permitidas de acesso. Somente para os casos em que o usuário foi credenciado para acessar apenas algumas áreas.<br/>Tamanho: 50
  **/
  private String areas = null;

  @XmlElement(name="materiaisFerramentas")
  @ApiModelProperty(value = "Materiais e ferramentas de trabalho. Comum para prestadores de serviço.<br/>Tamanho: 100")
 /**
   * Materiais e ferramentas de trabalho. Comum para prestadores de serviço.<br/>Tamanho: 100
  **/
  private String materiaisFerramentas = null;

  @XmlElement(name="credenciamentoAtivo")
  @ApiModelProperty(example = "false", value = "Credenciamento Ativo<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Credenciamento Ativo<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean credenciamentoAtivo = null;

  @XmlElement(name="motivacao")
  @ApiModelProperty(value = "Motivação do credenciamento.<br/>Tamanho: 100")
 /**
   * Motivação do credenciamento.<br/>Tamanho: 100
  **/
  private String motivacao = null;
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

  public DadosCredenciamentoPessoa tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosCredenciamentoPessoa idEvento(String idEvento) {
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

  public DadosCredenciamentoPessoa dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosCredenciamentoPessoa dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosCredenciamentoPessoa cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosCredenciamentoPessoa cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosCredenciamentoPessoa protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosCredenciamentoPessoa contingencia(Boolean contingencia) {
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

  public DadosCredenciamentoPessoa codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * CPF&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public DadosCredenciamentoPessoa cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Get documentoEstrangeiro
   * @return documentoEstrangeiro
  **/
  @JsonProperty("documentoEstrangeiro")
  public DadosDocumentoEstrangeiro getDocumentoEstrangeiro() {
    return documentoEstrangeiro;
  }

  public void setDocumentoEstrangeiro(DadosDocumentoEstrangeiro documentoEstrangeiro) {
    this.documentoEstrangeiro = documentoEstrangeiro;
  }

  public DadosCredenciamentoPessoa documentoEstrangeiro(DadosDocumentoEstrangeiro documentoEstrangeiro) {
    this.documentoEstrangeiro = documentoEstrangeiro;
    return this;
  }

 /**
   * País Nacionalidade. Conforme tabela de domínio País disponível no &lt;a href&#x3D;https://portalunico.siscomex.gov.br/tabx/#/tabelas rel&#x3D;\&quot;noopener noreferrer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Portal Único Siscomex.&lt;/a&gt;
   * @return paisNacionalidade
  **/
  @JsonProperty("paisNacionalidade")
  public String getPaisNacionalidade() {
    return paisNacionalidade;
  }

  public void setPaisNacionalidade(String paisNacionalidade) {
    this.paisNacionalidade = paisNacionalidade;
  }

  public DadosCredenciamentoPessoa paisNacionalidade(String paisNacionalidade) {
    this.paisNacionalidade = paisNacionalidade;
    return this;
  }

 /**
   * Gênero conforme tabela de domínio&lt;br/&gt;Domínio:&lt;br/&gt;F - Feminino&lt;br/&gt;M - Masculino&lt;br/&gt;Tamanho: 1
   * @return genero
  **/
  @JsonProperty("genero")
  public String getGenero() {
    if (genero == null) {
      return null;
    }
    return genero.value();
  }

  public void setGenero(GeneroEnum genero) {
    this.genero = genero;
  }

  public DadosCredenciamentoPessoa genero(GeneroEnum genero) {
    this.genero = genero;
    return this;
  }

 /**
   * CNH de motoristas. Obrigatório informar no caso de credenciamento de motoristas que acessam o recinto com veículos.&lt;br/&gt;Tamanho: 50
   * @return cnh
  **/
  @JsonProperty("cnh")
  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

  public DadosCredenciamentoPessoa cnh(String cnh) {
    this.cnh = cnh;
    return this;
  }

 /**
   * Nome. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
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

  public DadosCredenciamentoPessoa nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Data de nascimento&lt;br/&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataNascimento
  **/
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public DadosCredenciamentoPessoa dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

 /**
   * Telefone&lt;br/&gt;Tamanho: 20
   * @return fone
  **/
  @JsonProperty("fone")
  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public DadosCredenciamentoPessoa fone(String fone) {
    this.fone = fone;
    return this;
  }

 /**
   * CNPJ do representado&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjRepresentado
  **/
  @JsonProperty("cnpjRepresentado")
  public String getCnpjRepresentado() {
    return cnpjRepresentado;
  }

  public void setCnpjRepresentado(String cnpjRepresentado) {
    this.cnpjRepresentado = cnpjRepresentado;
  }

  public DadosCredenciamentoPessoa cnpjRepresentado(String cnpjRepresentado) {
    this.cnpjRepresentado = cnpjRepresentado;
    return this;
  }

 /**
   * CPF do representado&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfRepresentado
  **/
  @JsonProperty("cpfRepresentado")
  public String getCpfRepresentado() {
    return cpfRepresentado;
  }

  public void setCpfRepresentado(String cpfRepresentado) {
    this.cpfRepresentado = cpfRepresentado;
  }

  public DadosCredenciamentoPessoa cpfRepresentado(String cpfRepresentado) {
    this.cpfRepresentado = cpfRepresentado;
    return this;
  }

 /**
   * Nome do representado&lt;br/&gt;Tamanho: 100
   * @return nomeRepresentado
  **/
  @JsonProperty("nomeRepresentado")
  public String getNomeRepresentado() {
    return nomeRepresentado;
  }

  public void setNomeRepresentado(String nomeRepresentado) {
    this.nomeRepresentado = nomeRepresentado;
  }

  public DadosCredenciamentoPessoa nomeRepresentado(String nomeRepresentado) {
    this.nomeRepresentado = nomeRepresentado;
    return this;
  }

 /**
   * Qualificação (Funcionários, Ajudante despachante, Visitante, Prestador de Serviços, Autoridade Pública, etc)&lt;br/&gt;Tamanho: 50
   * @return qualificacao
  **/
  @JsonProperty("qualificacao")
  public String getQualificacao() {
    return qualificacao;
  }

  public void setQualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
  }

  public DadosCredenciamentoPessoa qualificacao(String qualificacao) {
    this.qualificacao = qualificacao;
    return this;
  }

 /**
   * Função na empresa representada&lt;br/&gt;Tamanho: 50
   * @return funcao
  **/
  @JsonProperty("funcao")
  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public DadosCredenciamentoPessoa funcao(String funcao) {
    this.funcao = funcao;
    return this;
  }

 /**
   * Data do início da validade do credenciamento&lt;br/&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataInicioValidade
  **/
  @JsonProperty("dataInicioValidade")
  public String getDataInicioValidade() {
    return dataInicioValidade;
  }

  public void setDataInicioValidade(String dataInicioValidade) {
    this.dataInicioValidade = dataInicioValidade;
  }

  public DadosCredenciamentoPessoa dataInicioValidade(String dataInicioValidade) {
    this.dataInicioValidade = dataInicioValidade;
    return this;
  }

 /**
   * Data do final da validade do credenciamento, se houver&lt;br/&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataFimValidade
  **/
  @JsonProperty("dataFimValidade")
  public String getDataFimValidade() {
    return dataFimValidade;
  }

  public void setDataFimValidade(String dataFimValidade) {
    this.dataFimValidade = dataFimValidade;
  }

  public DadosCredenciamentoPessoa dataFimValidade(String dataFimValidade) {
    this.dataFimValidade = dataFimValidade;
    return this;
  }

 /**
   * Hora prevista para entrada no recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.&lt;br/&gt;Formato: &#39;HH:mm:ssZ&#39;
   * @return horaPrevistaEntrada
  **/
  @JsonProperty("horaPrevistaEntrada")
  public String getHoraPrevistaEntrada() {
    return horaPrevistaEntrada;
  }

  public void setHoraPrevistaEntrada(String horaPrevistaEntrada) {
    this.horaPrevistaEntrada = horaPrevistaEntrada;
  }

  public DadosCredenciamentoPessoa horaPrevistaEntrada(String horaPrevistaEntrada) {
    this.horaPrevistaEntrada = horaPrevistaEntrada;
    return this;
  }

 /**
   * Hora prevista para saída do recinto. Somente para os casos em que a pessoa foi credenciada para entrar/sair em determinados períodos.&lt;br/&gt;Formato: &#39;HH:mm:ssZ&#39;
   * @return horaPrevistaSaida
  **/
  @JsonProperty("horaPrevistaSaida")
  public String getHoraPrevistaSaida() {
    return horaPrevistaSaida;
  }

  public void setHoraPrevistaSaida(String horaPrevistaSaida) {
    this.horaPrevistaSaida = horaPrevistaSaida;
  }

  public DadosCredenciamentoPessoa horaPrevistaSaida(String horaPrevistaSaida) {
    this.horaPrevistaSaida = horaPrevistaSaida;
    return this;
  }

 /**
   * Áreas permitidas de acesso. Somente para os casos em que o usuário foi credenciado para acessar apenas algumas áreas.&lt;br/&gt;Tamanho: 50
   * @return areas
  **/
  @JsonProperty("areas")
  public String getAreas() {
    return areas;
  }

  public void setAreas(String areas) {
    this.areas = areas;
  }

  public DadosCredenciamentoPessoa areas(String areas) {
    this.areas = areas;
    return this;
  }

 /**
   * Materiais e ferramentas de trabalho. Comum para prestadores de serviço.&lt;br/&gt;Tamanho: 100
   * @return materiaisFerramentas
  **/
  @JsonProperty("materiaisFerramentas")
  public String getMateriaisFerramentas() {
    return materiaisFerramentas;
  }

  public void setMateriaisFerramentas(String materiaisFerramentas) {
    this.materiaisFerramentas = materiaisFerramentas;
  }

  public DadosCredenciamentoPessoa materiaisFerramentas(String materiaisFerramentas) {
    this.materiaisFerramentas = materiaisFerramentas;
    return this;
  }

 /**
   * Credenciamento Ativo&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return credenciamentoAtivo
  **/
  @JsonProperty("credenciamentoAtivo")
  public Boolean isCredenciamentoAtivo() {
    return credenciamentoAtivo;
  }

  public void setCredenciamentoAtivo(Boolean credenciamentoAtivo) {
    this.credenciamentoAtivo = credenciamentoAtivo;
  }

  public DadosCredenciamentoPessoa credenciamentoAtivo(Boolean credenciamentoAtivo) {
    this.credenciamentoAtivo = credenciamentoAtivo;
    return this;
  }

 /**
   * Motivação do credenciamento.&lt;br/&gt;Tamanho: 100
   * @return motivacao
  **/
  @JsonProperty("motivacao")
  public String getMotivacao() {
    return motivacao;
  }

  public void setMotivacao(String motivacao) {
    this.motivacao = motivacao;
  }

  public DadosCredenciamentoPessoa motivacao(String motivacao) {
    this.motivacao = motivacao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCredenciamentoPessoa {\n");
    
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
    sb.append("    documentoEstrangeiro: ").append(toIndentedString(documentoEstrangeiro)).append("\n");
    sb.append("    paisNacionalidade: ").append(toIndentedString(paisNacionalidade)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    cnh: ").append(toIndentedString(cnh)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    fone: ").append(toIndentedString(fone)).append("\n");
    sb.append("    cnpjRepresentado: ").append(toIndentedString(cnpjRepresentado)).append("\n");
    sb.append("    cpfRepresentado: ").append(toIndentedString(cpfRepresentado)).append("\n");
    sb.append("    nomeRepresentado: ").append(toIndentedString(nomeRepresentado)).append("\n");
    sb.append("    qualificacao: ").append(toIndentedString(qualificacao)).append("\n");
    sb.append("    funcao: ").append(toIndentedString(funcao)).append("\n");
    sb.append("    dataInicioValidade: ").append(toIndentedString(dataInicioValidade)).append("\n");
    sb.append("    dataFimValidade: ").append(toIndentedString(dataFimValidade)).append("\n");
    sb.append("    horaPrevistaEntrada: ").append(toIndentedString(horaPrevistaEntrada)).append("\n");
    sb.append("    horaPrevistaSaida: ").append(toIndentedString(horaPrevistaSaida)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    materiaisFerramentas: ").append(toIndentedString(materiaisFerramentas)).append("\n");
    sb.append("    credenciamentoAtivo: ").append(toIndentedString(credenciamentoAtivo)).append("\n");
    sb.append("    motivacao: ").append(toIndentedString(motivacao)).append("\n");
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

