package br.gov.siscomex.portalunico.rcnt.model;

import java.math.BigDecimal;
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
 @XmlType(name = "DadosPesagemVeculo", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "listaManifestos", "listaNfe", "pesoBrutoManifesto", "placa", "tara", "listaSemirreboque", "taraConjunto", "listaConteineresUld", "pesoBrutoBalanca", "vazio", "capturaAutoPeso", "dutos", "correiasTransportadoras", "ncm", "volume", "balanca", "listaCameras"
})

@XmlRootElement(name="DadosPesagemVeculo")
public class DadosPesagemVeculo  {
  

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

  @XmlElement(name="listaNfe")
  @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
  @Valid
 /**
   * Lista de chaves das NFE que amparam o transporte.
  **/
  private List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe = null;

  @XmlElement(name="pesoBrutoManifesto")
  @ApiModelProperty(value = "Peso bruto no manifesto (Kg). Informar o peso bruto manifestado para a carga ou unidade de carga pesada<br/><br/>pesoBrutoManifesto, até 4 casas decimais.")
  @Valid
 /**
   * Peso bruto no manifesto (Kg). Informar o peso bruto manifestado para a carga ou unidade de carga pesada<br/><br/>pesoBrutoManifesto, até 4 casas decimais.
  **/
  private BigDecimal pesoBrutoManifesto = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).<br/>Tamanho: 50")
 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="tara")
  @ApiModelProperty(value = "Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<br/><br/>tara, até 4 casas decimais.")
  @Valid
 /**
   * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.<br/><br/>tara, até 4 casas decimais.
  **/
  private BigDecimal tara = null;

  @XmlElement(name="listaSemirreboque")
  @ApiModelProperty(value = "Lista de semirreboques ou vagões. Caso a pesagem seja por semirreboque ou por vagão, enviar um evento por pesagem.")
  @Valid
 /**
   * Lista de semirreboques ou vagões. Caso a pesagem seja por semirreboque ou por vagão, enviar um evento por pesagem.
  **/
  private List<DadosSemirreboquePesagem> listaSemirreboque = null;

  @XmlElement(name="taraConjunto")
  @ApiModelProperty(value = "Tara do conjunto. Para os casos em que a tara NÃO é aferida separadamente (cavalo/semirreboque). Comum no modal aquaviário e aéreo.<br/><br/>taraConjunto, até 4 casas decimais.")
  @Valid
 /**
   * Tara do conjunto. Para os casos em que a tara NÃO é aferida separadamente (cavalo/semirreboque). Comum no modal aquaviário e aéreo.<br/><br/>taraConjunto, até 4 casas decimais.
  **/
  private BigDecimal taraConjunto = null;

  @XmlElement(name="listaConteineresUld")
  @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
  @Valid
 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
  **/
  private List<DadosContinerUldPesagemVeculo> listaConteineresUld = null;

  @XmlElement(name="pesoBrutoBalanca")
  @ApiModelProperty(value = "Peso bruto da pesagem na balança (Kg).<br/>Especificamente no caso de dutos, transmitir o atributo com a soma das bateladas da balança de fluxo ao final da operação.<br/><br/>pesoBrutoBalanca, até 4 casas decimais.")
  @Valid
 /**
   * Peso bruto da pesagem na balança (Kg).<br/>Especificamente no caso de dutos, transmitir o atributo com a soma das bateladas da balança de fluxo ao final da operação.<br/><br/>pesoBrutoBalanca, até 4 casas decimais.
  **/
  private BigDecimal pesoBrutoBalanca = null;

  @XmlElement(name="vazio")
  @ApiModelProperty(example = "false", value = "Indicar se é uma pesagem de veículo vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Indicar se é uma pesagem de veículo vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean vazio = null;

  @XmlElement(name="capturaAutoPeso")
  @ApiModelProperty(example = "false", value = "Captura automática de peso. Indica se o peso foi obtido automaticamente, sem intervenção humana.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Captura automática de peso. Indica se o peso foi obtido automaticamente, sem intervenção humana.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean capturaAutoPeso = null;


@XmlType(name="DutosEnum")
@XmlEnum(String.class)
public enum DutosEnum {

	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'S'")
	@JsonProperty("'S'")
	S_(String.valueOf("'S'"));


    private String value;

    DutosEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DutosEnum fromValue(String v) {
        for (DutosEnum b : DutosEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to DutosEnum");
    }
}

  @XmlElement(name="dutos")
  @ApiModelProperty(example = "E", value = "Dutos. Informar tal atributo para toda a chegada e a saída do recinto de mercadoria via dutos.<br/>Domínio:<br/>E - Entrada via dutos<br/>S - Saída via dutos")
 /**
   * Dutos. Informar tal atributo para toda a chegada e a saída do recinto de mercadoria via dutos.<br/>Domínio:<br/>E - Entrada via dutos<br/>S - Saída via dutos
  **/
  private DutosEnum dutos = null;


@XmlType(name="CorreiasTransportadorasEnum")
@XmlEnum(String.class)
public enum CorreiasTransportadorasEnum {

	@XmlEnumValue("'E'")
	@JsonProperty("'E'")
	E_(String.valueOf("'E'")),
	
	@XmlEnumValue("'S'")
	@JsonProperty("'S'")
	S_(String.valueOf("'S'"));


    private String value;

    CorreiasTransportadorasEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CorreiasTransportadorasEnum fromValue(String v) {
        for (CorreiasTransportadorasEnum b : CorreiasTransportadorasEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CorreiasTransportadorasEnum");
    }
}

  @XmlElement(name="correiasTransportadoras")
  @ApiModelProperty(example = "E", value = "Informar esse atributo quando, de forma similar a dutos, o granel ingressar no recinto, oriundo de usina, pátio de estocagem ou silo, por meio de correias transportadoras. Não aplicável nos descarregamentos de veículos ou embarcações com correias transportadoras, neste caso enviar Embarque/Desembarque Navio. <br/>Domínio:<br/>E - Entrada<br/>S - Saída")
 /**
   * Informar esse atributo quando, de forma similar a dutos, o granel ingressar no recinto, oriundo de usina, pátio de estocagem ou silo, por meio de correias transportadoras. Não aplicável nos descarregamentos de veículos ou embarcações com correias transportadoras, neste caso enviar Embarque/Desembarque Navio. <br/>Domínio:<br/>E - Entrada<br/>S - Saída
  **/
  private CorreiasTransportadorasEnum correiasTransportadoras = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(value = "Dutos. Informar a NCM da mercadoria que chegou ou saiu via dutos.<br/>Esta informação será prestada no caso de dutos pois há situações em que inexiste NFe ou conhecimento de carga ao final da operação de pesagem.<br/>Tamanho: 8")
 /**
   * Dutos. Informar a NCM da mercadoria que chegou ou saiu via dutos.<br/>Esta informação será prestada no caso de dutos pois há situações em que inexiste NFe ou conhecimento de carga ao final da operação de pesagem.<br/>Tamanho: 8
  **/
  private String ncm = null;

  @XmlElement(name="volume")
  @ApiModelProperty(value = "Volume (metros cúbicos). Informar nos casos de granel líquido ou gasoso em que haja essa medição. Especificamente no caso de dutos transmitir o atributo com volume do fluxo ao final da operação.<br/><br/>volume, até 4 casas decimais.")
  @Valid
 /**
   * Volume (metros cúbicos). Informar nos casos de granel líquido ou gasoso em que haja essa medição. Especificamente no caso de dutos transmitir o atributo com volume do fluxo ao final da operação.<br/><br/>volume, até 4 casas decimais.
  **/
  private BigDecimal volume = null;

  @XmlElement(name="balanca")
  @ApiModelProperty(value = "Identificação balança. Usar o protocolo do evento de georreferenciamento relativo à localização da balança.<br/>Tamanho: 36")
 /**
   * Identificação balança. Usar o protocolo do evento de georreferenciamento relativo à localização da balança.<br/>Tamanho: 36
  **/
  private String balanca = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a pesagem. Transmitir este atributo em caso de dutos.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a pesagem. Transmitir este atributo em caso de dutos.
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

  public DadosPesagemVeculo tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

  public DadosPesagemVeculo idEvento(String idEvento) {
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

  public DadosPesagemVeculo dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosPesagemVeculo dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosPesagemVeculo cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosPesagemVeculo cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosPesagemVeculo protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosPesagemVeculo contingencia(Boolean contingencia) {
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

  public DadosPesagemVeculo codigoRecinto(String codigoRecinto) {
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

  public DadosPesagemVeculo listaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosPesagemVeculo addListaManifestosItem(DadosDoManisfestoDaCarga listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Lista de chaves das NFE que amparam o transporte.
   * @return listaNfe
  **/
  @JsonProperty("listaNfe")
  public List<DadosDaNotaFiscalEmbarqueDesembarque> getListaNfe() {
    return listaNfe;
  }

  public void setListaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
  }

  public DadosPesagemVeculo listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosPesagemVeculo addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * Peso bruto no manifesto (Kg). Informar o peso bruto manifestado para a carga ou unidade de carga pesada&lt;br/&gt;&lt;br/&gt;pesoBrutoManifesto, até 4 casas decimais.
   * @return pesoBrutoManifesto
  **/
  @JsonProperty("pesoBrutoManifesto")
  public BigDecimal getPesoBrutoManifesto() {
    return pesoBrutoManifesto;
  }

  public void setPesoBrutoManifesto(BigDecimal pesoBrutoManifesto) {
    this.pesoBrutoManifesto = pesoBrutoManifesto;
  }

  public DadosPesagemVeculo pesoBrutoManifesto(BigDecimal pesoBrutoManifesto) {
    this.pesoBrutoManifesto = pesoBrutoManifesto;
    return this;
  }

 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosPesagemVeculo placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * Tara do veículo. Para os casos em que a tara é aferida separadamente (cavalo/semireboque). Cadastro de taras comum no modal rodoviário.&lt;br/&gt;&lt;br/&gt;tara, até 4 casas decimais.
   * @return tara
  **/
  @JsonProperty("tara")
  public BigDecimal getTara() {
    return tara;
  }

  public void setTara(BigDecimal tara) {
    this.tara = tara;
  }

  public DadosPesagemVeculo tara(BigDecimal tara) {
    this.tara = tara;
    return this;
  }

 /**
   * Lista de semirreboques ou vagões. Caso a pesagem seja por semirreboque ou por vagão, enviar um evento por pesagem.
   * @return listaSemirreboque
  **/
  @JsonProperty("listaSemirreboque")
  public List<DadosSemirreboquePesagem> getListaSemirreboque() {
    return listaSemirreboque;
  }

  public void setListaSemirreboque(List<DadosSemirreboquePesagem> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
  }

  public DadosPesagemVeculo listaSemirreboque(List<DadosSemirreboquePesagem> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
    return this;
  }

  public DadosPesagemVeculo addListaSemirreboqueItem(DadosSemirreboquePesagem listaSemirreboqueItem) {
    this.listaSemirreboque.add(listaSemirreboqueItem);
    return this;
  }

 /**
   * Tara do conjunto. Para os casos em que a tara NÃO é aferida separadamente (cavalo/semirreboque). Comum no modal aquaviário e aéreo.&lt;br/&gt;&lt;br/&gt;taraConjunto, até 4 casas decimais.
   * @return taraConjunto
  **/
  @JsonProperty("taraConjunto")
  public BigDecimal getTaraConjunto() {
    return taraConjunto;
  }

  public void setTaraConjunto(BigDecimal taraConjunto) {
    this.taraConjunto = taraConjunto;
  }

  public DadosPesagemVeculo taraConjunto(BigDecimal taraConjunto) {
    this.taraConjunto = taraConjunto;
    return this;
  }

 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
   * @return listaConteineresUld
  **/
  @JsonProperty("listaConteineresUld")
  public List<DadosContinerUldPesagemVeculo> getListaConteineresUld() {
    return listaConteineresUld;
  }

  public void setListaConteineresUld(List<DadosContinerUldPesagemVeculo> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
  }

  public DadosPesagemVeculo listaConteineresUld(List<DadosContinerUldPesagemVeculo> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
    return this;
  }

  public DadosPesagemVeculo addListaConteineresUldItem(DadosContinerUldPesagemVeculo listaConteineresUldItem) {
    this.listaConteineresUld.add(listaConteineresUldItem);
    return this;
  }

 /**
   * Peso bruto da pesagem na balança (Kg).&lt;br/&gt;Especificamente no caso de dutos, transmitir o atributo com a soma das bateladas da balança de fluxo ao final da operação.&lt;br/&gt;&lt;br/&gt;pesoBrutoBalanca, até 4 casas decimais.
   * @return pesoBrutoBalanca
  **/
  @JsonProperty("pesoBrutoBalanca")
  public BigDecimal getPesoBrutoBalanca() {
    return pesoBrutoBalanca;
  }

  public void setPesoBrutoBalanca(BigDecimal pesoBrutoBalanca) {
    this.pesoBrutoBalanca = pesoBrutoBalanca;
  }

  public DadosPesagemVeculo pesoBrutoBalanca(BigDecimal pesoBrutoBalanca) {
    this.pesoBrutoBalanca = pesoBrutoBalanca;
    return this;
  }

 /**
   * Indicar se é uma pesagem de veículo vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return vazio
  **/
  @JsonProperty("vazio")
  public Boolean isVazio() {
    return vazio;
  }

  public void setVazio(Boolean vazio) {
    this.vazio = vazio;
  }

  public DadosPesagemVeculo vazio(Boolean vazio) {
    this.vazio = vazio;
    return this;
  }

 /**
   * Captura automática de peso. Indica se o peso foi obtido automaticamente, sem intervenção humana.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return capturaAutoPeso
  **/
  @JsonProperty("capturaAutoPeso")
  public Boolean isCapturaAutoPeso() {
    return capturaAutoPeso;
  }

  public void setCapturaAutoPeso(Boolean capturaAutoPeso) {
    this.capturaAutoPeso = capturaAutoPeso;
  }

  public DadosPesagemVeculo capturaAutoPeso(Boolean capturaAutoPeso) {
    this.capturaAutoPeso = capturaAutoPeso;
    return this;
  }

 /**
   * Dutos. Informar tal atributo para toda a chegada e a saída do recinto de mercadoria via dutos.&lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada via dutos&lt;br/&gt;S - Saída via dutos
   * @return dutos
  **/
  @JsonProperty("dutos")
  public String getDutos() {
    if (dutos == null) {
      return null;
    }
    return dutos.value();
  }

  public void setDutos(DutosEnum dutos) {
    this.dutos = dutos;
  }

  public DadosPesagemVeculo dutos(DutosEnum dutos) {
    this.dutos = dutos;
    return this;
  }

 /**
   * Informar esse atributo quando, de forma similar a dutos, o granel ingressar no recinto, oriundo de usina, pátio de estocagem ou silo, por meio de correias transportadoras. Não aplicável nos descarregamentos de veículos ou embarcações com correias transportadoras, neste caso enviar Embarque/Desembarque Navio. &lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada&lt;br/&gt;S - Saída
   * @return correiasTransportadoras
  **/
  @JsonProperty("correiasTransportadoras")
  public String getCorreiasTransportadoras() {
    if (correiasTransportadoras == null) {
      return null;
    }
    return correiasTransportadoras.value();
  }

  public void setCorreiasTransportadoras(CorreiasTransportadorasEnum correiasTransportadoras) {
    this.correiasTransportadoras = correiasTransportadoras;
  }

  public DadosPesagemVeculo correiasTransportadoras(CorreiasTransportadorasEnum correiasTransportadoras) {
    this.correiasTransportadoras = correiasTransportadoras;
    return this;
  }

 /**
   * Dutos. Informar a NCM da mercadoria que chegou ou saiu via dutos.&lt;br/&gt;Esta informação será prestada no caso de dutos pois há situações em que inexiste NFe ou conhecimento de carga ao final da operação de pesagem.&lt;br/&gt;Tamanho: 8
   * @return ncm
  **/
  @JsonProperty("ncm")
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public DadosPesagemVeculo ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }

 /**
   * Volume (metros cúbicos). Informar nos casos de granel líquido ou gasoso em que haja essa medição. Especificamente no caso de dutos transmitir o atributo com volume do fluxo ao final da operação.&lt;br/&gt;&lt;br/&gt;volume, até 4 casas decimais.
   * @return volume
  **/
  @JsonProperty("volume")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public DadosPesagemVeculo volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

 /**
   * Identificação balança. Usar o protocolo do evento de georreferenciamento relativo à localização da balança.&lt;br/&gt;Tamanho: 36
   * @return balanca
  **/
  @JsonProperty("balanca")
  public String getBalanca() {
    return balanca;
  }

  public void setBalanca(String balanca) {
    this.balanca = balanca;
  }

  public DadosPesagemVeculo balanca(String balanca) {
    this.balanca = balanca;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde ocorreu a pesagem. Transmitir este atributo em caso de dutos.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosPesagemVeculo listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosPesagemVeculo addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPesagemVeculo {\n");
    
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
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    pesoBrutoManifesto: ").append(toIndentedString(pesoBrutoManifesto)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    listaSemirreboque: ").append(toIndentedString(listaSemirreboque)).append("\n");
    sb.append("    taraConjunto: ").append(toIndentedString(taraConjunto)).append("\n");
    sb.append("    listaConteineresUld: ").append(toIndentedString(listaConteineresUld)).append("\n");
    sb.append("    pesoBrutoBalanca: ").append(toIndentedString(pesoBrutoBalanca)).append("\n");
    sb.append("    vazio: ").append(toIndentedString(vazio)).append("\n");
    sb.append("    capturaAutoPeso: ").append(toIndentedString(capturaAutoPeso)).append("\n");
    sb.append("    dutos: ").append(toIndentedString(dutos)).append("\n");
    sb.append("    correiasTransportadoras: ").append(toIndentedString(correiasTransportadoras)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    balanca: ").append(toIndentedString(balanca)).append("\n");
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

