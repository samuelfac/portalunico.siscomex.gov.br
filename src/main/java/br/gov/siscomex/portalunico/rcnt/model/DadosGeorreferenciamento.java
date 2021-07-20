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
 @XmlType(name = "DadosGeorreferenciamento", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "idAreaEquipamento", "nome", "areaEquipamentoAtivo", "azimuteCamera", "tipo", "listaCoordenadas"
})

@XmlRootElement(name="DadosGeorreferenciamento")
public class DadosGeorreferenciamento  {
  

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

  @XmlElement(name="idAreaEquipamento")
  @ApiModelProperty(value = "Chave interna do recinto para registrar uma área ou equipamento<br/>Tamanho: 50")
 /**
   * Chave interna do recinto para registrar uma área ou equipamento<br/>Tamanho: 50
  **/
  private String idAreaEquipamento = null;

  @XmlElement(name="nome", required = true)
  @ApiModelProperty(required = true, value = "Nome da área ou equipamento. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
 /**
   * Nome da área ou equipamento. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
  **/
  private String nome = null;

  @XmlElement(name="areaEquipamentoAtivo", required = true)
  @ApiModelProperty(example = "false", required = true, value = "Área ou equipamento ativo.<br/>Informar como inativo quando houver, por exemplo, desalfandegamento de área, desligamento definitivo de câmeras, gates, catracas e/ou outros equipamentos. Para a simples mudança de local basta enviar um evento retificador. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Área ou equipamento ativo.<br/>Informar como inativo quando houver, por exemplo, desalfandegamento de área, desligamento definitivo de câmeras, gates, catracas e/ou outros equipamentos. Para a simples mudança de local basta enviar um evento retificador. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean areaEquipamentoAtivo = null;

  @XmlElement(name="azimuteCamera")
  @ApiModelProperty(example = "180", value = "Azimute da câmera.<br/>Azimute em relação ao norte geográfico (número inteiro que representa o ângulo de 0 a 360 graus a partir do norte geográfico em sentido horário). Informar apenas para as câmeras fixas.<br/>Tamanho: 3")
 /**
   * Azimute da câmera.<br/>Azimute em relação ao norte geográfico (número inteiro que representa o ângulo de 0 a 360 graus a partir do norte geográfico em sentido horário). Informar apenas para as câmeras fixas.<br/>Tamanho: 3
  **/
  private Integer azimuteCamera = null;


@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

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
	_4_(String.valueOf("'4'")),
	
	@XmlEnumValue("'5'")
	@JsonProperty("'5'")
	_5_(String.valueOf("'5'")),
	
	@XmlEnumValue("'6'")
	@JsonProperty("'6'")
	_6_(String.valueOf("'6'")),
	
	@XmlEnumValue("'7'")
	@JsonProperty("'7'")
	_7_(String.valueOf("'7'")),
	
	@XmlEnumValue("'8'")
	@JsonProperty("'8'")
	_8_(String.valueOf("'8'")),
	
	@XmlEnumValue("'9'")
	@JsonProperty("'9'")
	_9_(String.valueOf("'9'")),
	
	@XmlEnumValue("'10'")
	@JsonProperty("'10'")
	_10_(String.valueOf("'10'")),
	
	@XmlEnumValue("'11'")
	@JsonProperty("'11'")
	_11_(String.valueOf("'11'")),
	
	@XmlEnumValue("'12'")
	@JsonProperty("'12'")
	_12_(String.valueOf("'12'")),
	
	@XmlEnumValue("'13'")
	@JsonProperty("'13'")
	_13_(String.valueOf("'13'"));


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

  @XmlElement(name="tipo", required = true)
  @ApiModelProperty(example = "6", required = true, value = "Tipo de área ou equipamento. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>1 - Recinto (polígono) <br/> 2 - Área posicionamento contêiner (polígono) <br/>3 - Área posicionamento veículos (polígono) <br/>4 - Área de conferência física (polígono) <br/>5 - Área armazenamento lotes (polígono) <br/>6 - Balança (ponto) <br/>7 - Scanner (ponto) <br/>8 - Gate (ponto) <br/>9 - Catraca e similares (ponto) <br/>10 - Câmeras (ponto) <br/>11 - Portêiner (ponto) <br/>12 - Silo (ponto) <br/>13 - Tanque de armazenamento (ponto)")
 /**
   * Tipo de área ou equipamento. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>1 - Recinto (polígono) <br/> 2 - Área posicionamento contêiner (polígono) <br/>3 - Área posicionamento veículos (polígono) <br/>4 - Área de conferência física (polígono) <br/>5 - Área armazenamento lotes (polígono) <br/>6 - Balança (ponto) <br/>7 - Scanner (ponto) <br/>8 - Gate (ponto) <br/>9 - Catraca e similares (ponto) <br/>10 - Câmeras (ponto) <br/>11 - Portêiner (ponto) <br/>12 - Silo (ponto) <br/>13 - Tanque de armazenamento (ponto)
  **/
  private TipoEnum tipo = null;

  @XmlElement(name="listaCoordenadas")
  @ApiModelProperty(value = "Lista de Coordenadas.<br/>Ponto (uma latitude e longitude) ou lista em sequência dos pontos para desenhar um polígono.<br/>No caso de câmeras mobile não transmitir esse atributo.")
  @Valid
 /**
   * Lista de Coordenadas.<br/>Ponto (uma latitude e longitude) ou lista em sequência dos pontos para desenhar um polígono.<br/>No caso de câmeras mobile não transmitir esse atributo.
  **/
  private List<DadosCoordenadasGeorreferenciamento> listaCoordenadas = null;
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

  public DadosGeorreferenciamento tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosGeorreferenciamento idEvento(String idEvento) {
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

  public DadosGeorreferenciamento dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosGeorreferenciamento dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosGeorreferenciamento cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosGeorreferenciamento cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosGeorreferenciamento protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosGeorreferenciamento contingencia(Boolean contingencia) {
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

  public DadosGeorreferenciamento codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Chave interna do recinto para registrar uma área ou equipamento&lt;br/&gt;Tamanho: 50
   * @return idAreaEquipamento
  **/
  @JsonProperty("idAreaEquipamento")
  public String getIdAreaEquipamento() {
    return idAreaEquipamento;
  }

  public void setIdAreaEquipamento(String idAreaEquipamento) {
    this.idAreaEquipamento = idAreaEquipamento;
  }

  public DadosGeorreferenciamento idAreaEquipamento(String idAreaEquipamento) {
    this.idAreaEquipamento = idAreaEquipamento;
    return this;
  }

 /**
   * Nome da área ou equipamento. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
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

  public DadosGeorreferenciamento nome(String nome) {
    this.nome = nome;
    return this;
  }

 /**
   * Área ou equipamento ativo.&lt;br/&gt;Informar como inativo quando houver, por exemplo, desalfandegamento de área, desligamento definitivo de câmeras, gates, catracas e/ou outros equipamentos. Para a simples mudança de local basta enviar um evento retificador. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return areaEquipamentoAtivo
  **/
  @JsonProperty("areaEquipamentoAtivo")
  @NotNull
  public Boolean isAreaEquipamentoAtivo() {
    return areaEquipamentoAtivo;
  }

  public void setAreaEquipamentoAtivo(Boolean areaEquipamentoAtivo) {
    this.areaEquipamentoAtivo = areaEquipamentoAtivo;
  }

  public DadosGeorreferenciamento areaEquipamentoAtivo(Boolean areaEquipamentoAtivo) {
    this.areaEquipamentoAtivo = areaEquipamentoAtivo;
    return this;
  }

 /**
   * Azimute da câmera.&lt;br/&gt;Azimute em relação ao norte geográfico (número inteiro que representa o ângulo de 0 a 360 graus a partir do norte geográfico em sentido horário). Informar apenas para as câmeras fixas.&lt;br/&gt;Tamanho: 3
   * @return azimuteCamera
  **/
  @JsonProperty("azimuteCamera")
  public Integer getAzimuteCamera() {
    return azimuteCamera;
  }

  public void setAzimuteCamera(Integer azimuteCamera) {
    this.azimuteCamera = azimuteCamera;
  }

  public DadosGeorreferenciamento azimuteCamera(Integer azimuteCamera) {
    this.azimuteCamera = azimuteCamera;
    return this;
  }

 /**
   * Tipo de área ou equipamento. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;1 - Recinto (polígono) &lt;br/&gt; 2 - Área posicionamento contêiner (polígono) &lt;br/&gt;3 - Área posicionamento veículos (polígono) &lt;br/&gt;4 - Área de conferência física (polígono) &lt;br/&gt;5 - Área armazenamento lotes (polígono) &lt;br/&gt;6 - Balança (ponto) &lt;br/&gt;7 - Scanner (ponto) &lt;br/&gt;8 - Gate (ponto) &lt;br/&gt;9 - Catraca e similares (ponto) &lt;br/&gt;10 - Câmeras (ponto) &lt;br/&gt;11 - Portêiner (ponto) &lt;br/&gt;12 - Silo (ponto) &lt;br/&gt;13 - Tanque de armazenamento (ponto)
   * @return tipo
  **/
  @JsonProperty("tipo")
  @NotNull
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public DadosGeorreferenciamento tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Lista de Coordenadas.&lt;br/&gt;Ponto (uma latitude e longitude) ou lista em sequência dos pontos para desenhar um polígono.&lt;br/&gt;No caso de câmeras mobile não transmitir esse atributo.
   * @return listaCoordenadas
  **/
  @JsonProperty("listaCoordenadas")
  public List<DadosCoordenadasGeorreferenciamento> getListaCoordenadas() {
    return listaCoordenadas;
  }

  public void setListaCoordenadas(List<DadosCoordenadasGeorreferenciamento> listaCoordenadas) {
    this.listaCoordenadas = listaCoordenadas;
  }

  public DadosGeorreferenciamento listaCoordenadas(List<DadosCoordenadasGeorreferenciamento> listaCoordenadas) {
    this.listaCoordenadas = listaCoordenadas;
    return this;
  }

  public DadosGeorreferenciamento addListaCoordenadasItem(DadosCoordenadasGeorreferenciamento listaCoordenadasItem) {
    this.listaCoordenadas.add(listaCoordenadasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosGeorreferenciamento {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    idAreaEquipamento: ").append(toIndentedString(idAreaEquipamento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    areaEquipamentoAtivo: ").append(toIndentedString(areaEquipamentoAtivo)).append("\n");
    sb.append("    azimuteCamera: ").append(toIndentedString(azimuteCamera)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    listaCoordenadas: ").append(toIndentedString(listaCoordenadas)).append("\n");
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

