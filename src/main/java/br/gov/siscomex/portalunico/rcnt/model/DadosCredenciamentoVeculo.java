package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "DadosCredenciamentoVeculo", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "placa", "marca", "modelo", "ano", "capacidadeTanqueCombustivel", "satelite", "cnpjResponsavel", "cpfResponsavel", "dataInicioValidade", "dataFimValidade", "horaPrevistaEntrada", "horaPrevistaSaida", "areas", "credenciamentoAtivo"
})

@XmlRootElement(name="DadosCredenciamentoVeculo")
public class DadosCredenciamentoVeculo  {
  

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

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa de veículos (Cavalo-trator/truck/automóvel/Semirreboque/locomotiva/vagão)<br/>Tamanho: 50")
 /**
   * Placa de veículos (Cavalo-trator/truck/automóvel/Semirreboque/locomotiva/vagão)<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="marca")
  @ApiModelProperty(value = "Marca<br/>Tamanho: 20")
 /**
   * Marca<br/>Tamanho: 20
  **/
  private String marca = null;

  @XmlElement(name="modelo")
  @ApiModelProperty(value = "Modelo<br/>Tamanho: 20")
 /**
   * Modelo<br/>Tamanho: 20
  **/
  private String modelo = null;

  @XmlElement(name="ano")
  @ApiModelProperty(example = "2019", value = "Ano")
 /**
   * Ano
  **/
  private Integer ano = null;

  @XmlElement(name="capacidadeTanqueCombustivel")
  @ApiModelProperty(example = "52", value = "Informar a capacidade total do(s) tanque(s) de combustível (em Litros)")
 /**
   * Informar a capacidade total do(s) tanque(s) de combustível (em Litros)
  **/
  private Integer capacidadeTanqueCombustivel = null;

  @XmlElement(name="satelite")
  @ApiModelProperty(example = "false", value = "Monitoramento via satélite.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Monitoramento via satélite.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean satelite = null;

  @XmlElement(name="cnpjResponsavel")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ do responsável pelo veículo<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ do responsável pelo veículo<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjResponsavel = null;

  @XmlElement(name="cpfResponsavel")
  @ApiModelProperty(example = "55555555555", value = "CPF do responsável pelo veículo<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
 /**
   * CPF do responsável pelo veículo<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
  **/
  private String cpfResponsavel = null;

  @XmlElement(name="dataInicioValidade")
  @ApiModelProperty(example = "2020-04-01", value = "Data do início da validade do credenciamento<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Data do início da validade do credenciamento<br/>Formato: 'yyyy-MM-dd'
  **/
  private String dataInicioValidade = null;

  @XmlElement(name="dataFimValidade")
  @ApiModelProperty(example = "2020-04-01", value = "Data do final da validade do credenciamento. Informar data fim da validade do credenciamento quando for o caso.<br/>Formato: 'yyyy-MM-dd'")
 /**
   * Data do final da validade do credenciamento. Informar data fim da validade do credenciamento quando for o caso.<br/>Formato: 'yyyy-MM-dd'
  **/
  private String dataFimValidade = null;

  @XmlElement(name="horaPrevistaEntrada")
  @ApiModelProperty(example = "12:30:15-0300", value = "Hora prevista para entrada. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.<br/>Formato: 'HH:mm:ssZ'")
 /**
   * Hora prevista para entrada. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.<br/>Formato: 'HH:mm:ssZ'
  **/
  private String horaPrevistaEntrada = null;

  @XmlElement(name="horaPrevistaSaida")
  @ApiModelProperty(example = "12:30:15-0300", value = "Hora prevista para saída. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.<br/>Formato: 'HH:mm:ssZ'")
 /**
   * Hora prevista para saída. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.<br/>Formato: 'HH:mm:ssZ'
  **/
  private String horaPrevistaSaida = null;

  @XmlElement(name="areas")
  @ApiModelProperty(value = "Somente para os casos em que o veículo foi credenciado para acessar apenas algumas áreas.<br/>Tamanho: 100")
 /**
   * Somente para os casos em que o veículo foi credenciado para acessar apenas algumas áreas.<br/>Tamanho: 100
  **/
  private String areas = null;

  @XmlElement(name="credenciamentoAtivo")
  @ApiModelProperty(example = "false", value = "Credenciamento Ativo. [S/N]?<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Credenciamento Ativo. [S/N]?<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean credenciamentoAtivo = null;
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

  public DadosCredenciamentoVeculo tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosCredenciamentoVeculo idEvento(String idEvento) {
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

  public DadosCredenciamentoVeculo dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosCredenciamentoVeculo dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosCredenciamentoVeculo cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosCredenciamentoVeculo cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosCredenciamentoVeculo protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosCredenciamentoVeculo contingencia(Boolean contingencia) {
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

  public DadosCredenciamentoVeculo codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Placa de veículos (Cavalo-trator/truck/automóvel/Semirreboque/locomotiva/vagão)&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosCredenciamentoVeculo placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Marca&lt;br/&gt;Tamanho: 20
   * @return marca
  **/
  @JsonProperty("marca")
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public DadosCredenciamentoVeculo marca(String marca) {
    this.marca = marca;
    return this;
  }

 /**
   * Modelo&lt;br/&gt;Tamanho: 20
   * @return modelo
  **/
  @JsonProperty("modelo")
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public DadosCredenciamentoVeculo modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }

 /**
   * Ano
   * @return ano
  **/
  @JsonProperty("ano")
  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public DadosCredenciamentoVeculo ano(Integer ano) {
    this.ano = ano;
    return this;
  }

 /**
   * Informar a capacidade total do(s) tanque(s) de combustível (em Litros)
   * @return capacidadeTanqueCombustivel
  **/
  @JsonProperty("capacidadeTanqueCombustivel")
  public Integer getCapacidadeTanqueCombustivel() {
    return capacidadeTanqueCombustivel;
  }

  public void setCapacidadeTanqueCombustivel(Integer capacidadeTanqueCombustivel) {
    this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
  }

  public DadosCredenciamentoVeculo capacidadeTanqueCombustivel(Integer capacidadeTanqueCombustivel) {
    this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    return this;
  }

 /**
   * Monitoramento via satélite.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return satelite
  **/
  @JsonProperty("satelite")
  public Boolean isSatelite() {
    return satelite;
  }

  public void setSatelite(Boolean satelite) {
    this.satelite = satelite;
  }

  public DadosCredenciamentoVeculo satelite(Boolean satelite) {
    this.satelite = satelite;
    return this;
  }

 /**
   * CNPJ do responsável pelo veículo&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjResponsavel
  **/
  @JsonProperty("cnpjResponsavel")
  public String getCnpjResponsavel() {
    return cnpjResponsavel;
  }

  public void setCnpjResponsavel(String cnpjResponsavel) {
    this.cnpjResponsavel = cnpjResponsavel;
  }

  public DadosCredenciamentoVeculo cnpjResponsavel(String cnpjResponsavel) {
    this.cnpjResponsavel = cnpjResponsavel;
    return this;
  }

 /**
   * CPF do responsável pelo veículo&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
   * @return cpfResponsavel
  **/
  @JsonProperty("cpfResponsavel")
  public String getCpfResponsavel() {
    return cpfResponsavel;
  }

  public void setCpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
  }

  public DadosCredenciamentoVeculo cpfResponsavel(String cpfResponsavel) {
    this.cpfResponsavel = cpfResponsavel;
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

  public DadosCredenciamentoVeculo dataInicioValidade(String dataInicioValidade) {
    this.dataInicioValidade = dataInicioValidade;
    return this;
  }

 /**
   * Data do final da validade do credenciamento. Informar data fim da validade do credenciamento quando for o caso.&lt;br/&gt;Formato: &#39;yyyy-MM-dd&#39;
   * @return dataFimValidade
  **/
  @JsonProperty("dataFimValidade")
  public String getDataFimValidade() {
    return dataFimValidade;
  }

  public void setDataFimValidade(String dataFimValidade) {
    this.dataFimValidade = dataFimValidade;
  }

  public DadosCredenciamentoVeculo dataFimValidade(String dataFimValidade) {
    this.dataFimValidade = dataFimValidade;
    return this;
  }

 /**
   * Hora prevista para entrada. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.&lt;br/&gt;Formato: &#39;HH:mm:ssZ&#39;
   * @return horaPrevistaEntrada
  **/
  @JsonProperty("horaPrevistaEntrada")
  public String getHoraPrevistaEntrada() {
    return horaPrevistaEntrada;
  }

  public void setHoraPrevistaEntrada(String horaPrevistaEntrada) {
    this.horaPrevistaEntrada = horaPrevistaEntrada;
  }

  public DadosCredenciamentoVeculo horaPrevistaEntrada(String horaPrevistaEntrada) {
    this.horaPrevistaEntrada = horaPrevistaEntrada;
    return this;
  }

 /**
   * Hora prevista para saída. Para os casos em que o veículo foi autorizado a entrar / sair apenas em determinados horários.&lt;br/&gt;Formato: &#39;HH:mm:ssZ&#39;
   * @return horaPrevistaSaida
  **/
  @JsonProperty("horaPrevistaSaida")
  public String getHoraPrevistaSaida() {
    return horaPrevistaSaida;
  }

  public void setHoraPrevistaSaida(String horaPrevistaSaida) {
    this.horaPrevistaSaida = horaPrevistaSaida;
  }

  public DadosCredenciamentoVeculo horaPrevistaSaida(String horaPrevistaSaida) {
    this.horaPrevistaSaida = horaPrevistaSaida;
    return this;
  }

 /**
   * Somente para os casos em que o veículo foi credenciado para acessar apenas algumas áreas.&lt;br/&gt;Tamanho: 100
   * @return areas
  **/
  @JsonProperty("areas")
  public String getAreas() {
    return areas;
  }

  public void setAreas(String areas) {
    this.areas = areas;
  }

  public DadosCredenciamentoVeculo areas(String areas) {
    this.areas = areas;
    return this;
  }

 /**
   * Credenciamento Ativo. [S/N]?&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return credenciamentoAtivo
  **/
  @JsonProperty("credenciamentoAtivo")
  public Boolean isCredenciamentoAtivo() {
    return credenciamentoAtivo;
  }

  public void setCredenciamentoAtivo(Boolean credenciamentoAtivo) {
    this.credenciamentoAtivo = credenciamentoAtivo;
  }

  public DadosCredenciamentoVeculo credenciamentoAtivo(Boolean credenciamentoAtivo) {
    this.credenciamentoAtivo = credenciamentoAtivo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCredenciamentoVeculo {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    ano: ").append(toIndentedString(ano)).append("\n");
    sb.append("    capacidadeTanqueCombustivel: ").append(toIndentedString(capacidadeTanqueCombustivel)).append("\n");
    sb.append("    satelite: ").append(toIndentedString(satelite)).append("\n");
    sb.append("    cnpjResponsavel: ").append(toIndentedString(cnpjResponsavel)).append("\n");
    sb.append("    cpfResponsavel: ").append(toIndentedString(cpfResponsavel)).append("\n");
    sb.append("    dataInicioValidade: ").append(toIndentedString(dataInicioValidade)).append("\n");
    sb.append("    dataFimValidade: ").append(toIndentedString(dataFimValidade)).append("\n");
    sb.append("    horaPrevistaEntrada: ").append(toIndentedString(horaPrevistaEntrada)).append("\n");
    sb.append("    horaPrevistaSaida: ").append(toIndentedString(horaPrevistaSaida)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    credenciamentoAtivo: ").append(toIndentedString(credenciamentoAtivo)).append("\n");
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

