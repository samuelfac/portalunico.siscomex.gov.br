package br.gov.siscomex.portalunico.rcnt.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DadosAcessoVeculo", propOrder =
    { "tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "operacao", "direcao", "protocoloAgenda", "dataHoraAgenda", "listaManifestos", "listaDeclaracaoAduaneira", "listaNfe", "listaMalas", "tipoGranel", "listaChassi", "placa", "ufEmplacamento", "ocrPlaca", "oogDimensao", "oogPeso", "listaSemirreboque", "listaConteineresUld", "cnpjTransportador", "nomeTransportador", "motorista", "codigoRecintoDestino", "codigoRecintoOrigem", "dataHoraPartidaOrigem", "modal", "gate", "listaCameras"
})

@XmlRootElement(name="DadosAcessoVeculo")
public class DadosAcessoVeculo  {
  

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
  @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100")
 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100
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


@XmlType(name="OperacaoEnum")
@XmlEnum(String.class)
public enum OperacaoEnum {

	@XmlEnumValue("G")
	@JsonProperty("G")
	G(String.valueOf("G")),
	
	@XmlEnumValue("C")
	@JsonProperty("C")
	C(String.valueOf("C"));


    private String value;

    OperacaoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperacaoEnum fromValue(String v) {
        for (OperacaoEnum b : OperacaoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to OperacaoEnum");
    }
}

  @XmlElement(name="operacao", required = true)
  @ApiModelProperty(example = "G", required = true, value = "Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>G - Agendamento<br/>C - Acesso")
 /**
   * Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>G - Agendamento<br/>C - Acesso
  **/
  private OperacaoEnum operacao = null;


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
  @ApiModelProperty(example = "E", required = true, value = "Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída")
 /**
   * Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída
  **/
  private DirecaoEnum direcao = null;

  @XmlElement(name="protocoloAgenda")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.<br/>Tamanho: 36")
 /**
   * Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.<br/>Tamanho: 36
  **/
  private String protocoloAgenda = null;

  @XmlElement(name="dataHoraAgenda")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada. <br/>É obrigatório informar o atributo 'dataHoraAgenda' quando o atributo 'operacao' for informado com valor 'G'.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada. <br/>É obrigatório informar o atributo 'dataHoraAgenda' quando o atributo 'operacao' for informado com valor 'G'.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraAgenda = null;

  @XmlElement(name="listaManifestos")
  @ApiModelProperty(value = "Lista de manifestos.")
  @Valid
 /**
   * Lista de manifestos.
  **/
  private List<DadosDoManisfestoDaCarga> listaManifestos = null;

  @XmlElement(name="listaDeclaracaoAduaneira")
  @ApiModelProperty(value = "Lista de declarações aduaneiras associadas à carga.")
  @Valid
 /**
   * Lista de declarações aduaneiras associadas à carga.
  **/
  private List<DocumentoAduaneiro> listaDeclaracaoAduaneira = null;

  @XmlElement(name="listaNfe")
  @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
  @Valid
 /**
   * Lista de chaves das NFE que amparam o transporte.
  **/
  private List<DadosDaNotaFiscal> listaNfe = null;

  @XmlElement(name="listaMalas")
  @ApiModelProperty(value = "Lista com as malas postais. Utilizar apenas para remessa postal internacional.")
  @Valid
 /**
   * Lista com as malas postais. Utilizar apenas para remessa postal internacional.
  **/
  private List<DadosDaMala> listaMalas = null;


@XmlType(name="TipoGranelEnum")
@XmlEnum(String.class)
public enum TipoGranelEnum {

	@XmlEnumValue("'01'")
	@JsonProperty("'01'")
	_01_(String.valueOf("'01'")),
	
	@XmlEnumValue("'02'")
	@JsonProperty("'02'")
	_02_(String.valueOf("'02'")),
	
	@XmlEnumValue("'03'")
	@JsonProperty("'03'")
	_03_(String.valueOf("'03'")),
	
	@XmlEnumValue("'04'")
	@JsonProperty("'04'")
	_04_(String.valueOf("'04'")),
	
	@XmlEnumValue("'05'")
	@JsonProperty("'05'")
	_05_(String.valueOf("'05'")),
	
	@XmlEnumValue("'06'")
	@JsonProperty("'06'")
	_06_(String.valueOf("'06'")),
	
	@XmlEnumValue("'07'")
	@JsonProperty("'07'")
	_07_(String.valueOf("'07'")),
	
	@XmlEnumValue("'99'")
	@JsonProperty("'99'")
	_99_(String.valueOf("'99'"));


    private String value;

    TipoGranelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoGranelEnum fromValue(String v) {
        for (TipoGranelEnum b : TipoGranelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoGranelEnum");
    }
}

  @XmlElement(name="tipoGranel")
  @ApiModelProperty(example = "01", value = "Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS<br/>")
 /**
   * Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS<br/>
  **/
  private TipoGranelEnum tipoGranel = null;

  @XmlElement(name="listaChassi")
  @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...). <br/>É obrigatório informar o atributo 'listaChassi.chassi' quando o atributo 'placa' não for informado.<br/>Tamanho: 50")
  @Valid
 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...). <br/>É obrigatório informar o atributo 'listaChassi.chassi' quando o atributo 'placa' não for informado.<br/>Tamanho: 50
  **/
  private List<DadosDoChassi> listaChassi = null;

  @XmlElement(name="placa")
  @ApiModelProperty(value = "Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). <br/>É obrigatório informar o atributo 'placa' quando o atributo 'lista.Chassi.chassi' não for informado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50")
 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). <br/>É obrigatório informar o atributo 'placa' quando o atributo 'lista.Chassi.chassi' não for informado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50
  **/
  private String placa = null;

  @XmlElement(name="ufEmplacamento")
  @ApiModelProperty(example = "SP", value = "UF Emplacamento.<br/>Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto<br/>Tamanho: 2")
 /**
   * UF Emplacamento.<br/>Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto<br/>Tamanho: 2
  **/
  private String ufEmplacamento = null;

  @XmlElement(name="ocrPlaca")
  @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition). <br/>É obrigatório informar o atributo 'ocrPlaca' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition). <br/>É obrigatório informar o atributo 'ocrPlaca' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean ocrPlaca = null;

  @XmlElement(name="oogDimensao")
  @ApiModelProperty(example = "false", value = "Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner. <br/>É obrigatório informar o atributo 'oogDimensao' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner. <br/>É obrigatório informar o atributo 'oogDimensao' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean oogDimensao = null;

  @XmlElement(name="oogPeso")
  @ApiModelProperty(example = "false", value = "Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. <br/>É obrigatório informar o atributo 'oogPeso' quando o atributo 'operacao' for informado com  valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
 /**
   * Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. <br/>É obrigatório informar o atributo 'oogPeso' quando o atributo 'operacao' for informado com  valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
  **/
  private Boolean oogPeso = null;

  @XmlElement(name="listaSemirreboque")
  @ApiModelProperty(value = "Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.")
  @Valid
 /**
   * Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.
  **/
  private List<DadosSemirreboque> listaSemirreboque = null;

  @XmlElement(name="listaConteineresUld")
  @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
  @Valid
 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
  **/
  private List<DadosContinerUldAcessoVeculo> listaConteineresUld = null;

  @XmlElement(name="cnpjTransportador")
  @ApiModelProperty(example = "44444444444444", value = "CNPJ da empresa transportadora.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
 /**
   * CNPJ da empresa transportadora.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
  **/
  private String cnpjTransportador = null;

  @XmlElement(name="nomeTransportador")
  @ApiModelProperty(value = "Nome da empresa transportadora.<br/>Tamanho: 100")
 /**
   * Nome da empresa transportadora.<br/>Tamanho: 100
  **/
  private String nomeTransportador = null;

  @XmlElement(name="motorista")
  @ApiModelProperty(value = "")
  @Valid
  private DadosMotorista motorista = null;

  @XmlElement(name="codigoRecintoDestino")
  @ApiModelProperty(value = "Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.<br/>Tamanho: 15
  **/
  private String codigoRecintoDestino = null;

  @XmlElement(name="codigoRecintoOrigem")
  @ApiModelProperty(value = "Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.<br/>Tamanho: 15")
 /**
   * Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.<br/>Tamanho: 15
  **/
  private String codigoRecintoOrigem = null;

  @XmlElement(name="dataHoraPartidaOrigem")
  @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora de partida do veículo da origem sob regime de trânsito.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
 /**
   * Informar data e hora de partida do veículo da origem sob regime de trânsito.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
  **/
  private String dataHoraPartidaOrigem = null;


@XmlType(name="ModalEnum")
@XmlEnum(String.class)
public enum ModalEnum {

	@XmlEnumValue("'R'")
	@JsonProperty("'R'")
	R_(String.valueOf("'R'")),
	
	@XmlEnumValue("'F'")
	@JsonProperty("'F'")
	F_(String.valueOf("'F'")),
	
	@XmlEnumValue("'L'")
	@JsonProperty("'L'")
	L_(String.valueOf("'L'"));


    private String value;

    ModalEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModalEnum fromValue(String v) {
        for (ModalEnum b : ModalEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to ModalEnum");
    }
}

  @XmlElement(name="modal")
  @ApiModelProperty(example = "R", value = "Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.<br/> É obrigatório informar o atributo 'modal' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>R - Rodoviário<br/>F - Ferroviário<br/>L - Fluvial")
 /**
   * Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.<br/> É obrigatório informar o atributo 'modal' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>R - Rodoviário<br/>F - Ferroviário<br/>L - Fluvial
  **/
  private ModalEnum modal = null;

  @XmlElement(name="gate")
  @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Identificação do Gate.<br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.<br/> É obrigatório informar o atributo 'gate' quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 36")
 /**
   * Identificação do Gate.<br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.<br/> É obrigatório informar o atributo 'gate' quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 36
  **/
  private String gate = null;

  @XmlElement(name="listaCameras")
  @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.")
  @Valid
 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.
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

  public DadosAcessoVeculo tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

 /**
   * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt; O idEvento informado em cada evento não pode ser repetido quando \&quot;tipoOperacao\&quot;&#x3D;\&quot;I-Incluir\&quot;, ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.&lt;br/&gt;Tamanho: 100
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

  public DadosAcessoVeculo idEvento(String idEvento) {
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

  public DadosAcessoVeculo dataHoraOcorrencia(String dataHoraOcorrencia) {
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

  public DadosAcessoVeculo dataHoraRegistro(String dataHoraRegistro) {
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

  public DadosAcessoVeculo cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

  public DadosAcessoVeculo cpfOperadorRegistro(String cpfOperadorRegistro) {
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

  public DadosAcessoVeculo protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
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

  public DadosAcessoVeculo contingencia(Boolean contingencia) {
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

  public DadosAcessoVeculo codigoRecinto(String codigoRecinto) {
    this.codigoRecinto = codigoRecinto;
    return this;
  }

 /**
   * Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;G - Agendamento&lt;br/&gt;C - Acesso
   * @return operacao
  **/
  @JsonProperty("operacao")
  @NotNull
  public String getOperacao() {
    if (operacao == null) {
      return null;
    }
    return operacao.value();
  }

  public void setOperacao(OperacaoEnum operacao) {
    this.operacao = operacao;
  }

  public DadosAcessoVeculo operacao(OperacaoEnum operacao) {
    this.operacao = operacao;
    return this;
  }

 /**
   * Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada&lt;br/&gt;S - Saída
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

  public DadosAcessoVeculo direcao(DirecaoEnum direcao) {
    this.direcao = direcao;
    return this;
  }

 /**
   * Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.&lt;br/&gt;Tamanho: 36
   * @return protocoloAgenda
  **/
  @JsonProperty("protocoloAgenda")
  public String getProtocoloAgenda() {
    return protocoloAgenda;
  }

  public void setProtocoloAgenda(String protocoloAgenda) {
    this.protocoloAgenda = protocoloAgenda;
  }

  public DadosAcessoVeculo protocoloAgenda(String protocoloAgenda) {
    this.protocoloAgenda = protocoloAgenda;
    return this;
  }

 /**
   * Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada. &lt;br/&gt;É obrigatório informar o atributo &#39;dataHoraAgenda&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;G&#39;.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraAgenda
  **/
  @JsonProperty("dataHoraAgenda")
  public String getDataHoraAgenda() {
    return dataHoraAgenda;
  }

  public void setDataHoraAgenda(String dataHoraAgenda) {
    this.dataHoraAgenda = dataHoraAgenda;
  }

  public DadosAcessoVeculo dataHoraAgenda(String dataHoraAgenda) {
    this.dataHoraAgenda = dataHoraAgenda;
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

  public DadosAcessoVeculo listaManifestos(List<DadosDoManisfestoDaCarga> listaManifestos) {
    this.listaManifestos = listaManifestos;
    return this;
  }

  public DadosAcessoVeculo addListaManifestosItem(DadosDoManisfestoDaCarga listaManifestosItem) {
    this.listaManifestos.add(listaManifestosItem);
    return this;
  }

 /**
   * Lista de declarações aduaneiras associadas à carga.
   * @return listaDeclaracaoAduaneira
  **/
  @JsonProperty("listaDeclaracaoAduaneira")
  public List<DocumentoAduaneiro> getListaDeclaracaoAduaneira() {
    return listaDeclaracaoAduaneira;
  }

  public void setListaDeclaracaoAduaneira(List<DocumentoAduaneiro> listaDeclaracaoAduaneira) {
    this.listaDeclaracaoAduaneira = listaDeclaracaoAduaneira;
  }

  public DadosAcessoVeculo listaDeclaracaoAduaneira(List<DocumentoAduaneiro> listaDeclaracaoAduaneira) {
    this.listaDeclaracaoAduaneira = listaDeclaracaoAduaneira;
    return this;
  }

  public DadosAcessoVeculo addListaDeclaracaoAduaneiraItem(DocumentoAduaneiro listaDeclaracaoAduaneiraItem) {
    this.listaDeclaracaoAduaneira.add(listaDeclaracaoAduaneiraItem);
    return this;
  }

 /**
   * Lista de chaves das NFE que amparam o transporte.
   * @return listaNfe
  **/
  @JsonProperty("listaNfe")
  public List<DadosDaNotaFiscal> getListaNfe() {
    return listaNfe;
  }

  public void setListaNfe(List<DadosDaNotaFiscal> listaNfe) {
    this.listaNfe = listaNfe;
  }

  public DadosAcessoVeculo listaNfe(List<DadosDaNotaFiscal> listaNfe) {
    this.listaNfe = listaNfe;
    return this;
  }

  public DadosAcessoVeculo addListaNfeItem(DadosDaNotaFiscal listaNfeItem) {
    this.listaNfe.add(listaNfeItem);
    return this;
  }

 /**
   * Lista com as malas postais. Utilizar apenas para remessa postal internacional.
   * @return listaMalas
  **/
  @JsonProperty("listaMalas")
  public List<DadosDaMala> getListaMalas() {
    return listaMalas;
  }

  public void setListaMalas(List<DadosDaMala> listaMalas) {
    this.listaMalas = listaMalas;
  }

  public DadosAcessoVeculo listaMalas(List<DadosDaMala> listaMalas) {
    this.listaMalas = listaMalas;
    return this;
  }

  public DadosAcessoVeculo addListaMalasItem(DadosDaMala listaMalasItem) {
    this.listaMalas.add(listaMalasItem);
    return this;
  }

 /**
   * Tipo de granel conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;01 - SÓLIDOS - MINÉRIOS&lt;br/&gt;02 - SÓLIDOS - GRÃOS&lt;br/&gt;03 - SÓLIDOS - FARELOS&lt;br/&gt;04 - SÓLIDOS - OUTROS&lt;br/&gt;05 - LÍQUIDOS - COMBUSTÍVEIS&lt;br/&gt;06 - LÍQUIDOS - OUTROS&lt;br/&gt;07 - GASOSOS&lt;br/&gt;99 - OUTROS&lt;br/&gt;
   * @return tipoGranel
  **/
  @JsonProperty("tipoGranel")
  public String getTipoGranel() {
    if (tipoGranel == null) {
      return null;
    }
    return tipoGranel.value();
  }

  public void setTipoGranel(TipoGranelEnum tipoGranel) {
    this.tipoGranel = tipoGranel;
  }

  public DadosAcessoVeculo tipoGranel(TipoGranelEnum tipoGranel) {
    this.tipoGranel = tipoGranel;
    return this;
  }

 /**
   * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...). &lt;br/&gt;É obrigatório informar o atributo &#39;listaChassi.chassi&#39; quando o atributo &#39;placa&#39; não for informado.&lt;br/&gt;Tamanho: 50
   * @return listaChassi
  **/
  @JsonProperty("listaChassi")
  public List<DadosDoChassi> getListaChassi() {
    return listaChassi;
  }

  public void setListaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
  }

  public DadosAcessoVeculo listaChassi(List<DadosDoChassi> listaChassi) {
    this.listaChassi = listaChassi;
    return this;
  }

  public DadosAcessoVeculo addListaChassiItem(DadosDoChassi listaChassiItem) {
    this.listaChassi.add(listaChassiItem);
    return this;
  }

 /**
   * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva). &lt;br/&gt;É obrigatório informar o atributo &#39;placa&#39; quando o atributo &#39;lista.Chassi.chassi&#39; não for informado. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 50
   * @return placa
  **/
  @JsonProperty("placa")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public DadosAcessoVeculo placa(String placa) {
    this.placa = placa;
    return this;
  }

 /**
   * UF Emplacamento.&lt;br/&gt;Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto&lt;br/&gt;Tamanho: 2
   * @return ufEmplacamento
  **/
  @JsonProperty("ufEmplacamento")
  public String getUfEmplacamento() {
    return ufEmplacamento;
  }

  public void setUfEmplacamento(String ufEmplacamento) {
    this.ufEmplacamento = ufEmplacamento;
  }

  public DadosAcessoVeculo ufEmplacamento(String ufEmplacamento) {
    this.ufEmplacamento = ufEmplacamento;
    return this;
  }

 /**
   * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition). &lt;br/&gt;É obrigatório informar o atributo &#39;ocrPlaca&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return ocrPlaca
  **/
  @JsonProperty("ocrPlaca")
  public Boolean isOcrPlaca() {
    return ocrPlaca;
  }

  public void setOcrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
  }

  public DadosAcessoVeculo ocrPlaca(Boolean ocrPlaca) {
    this.ocrPlaca = ocrPlaca;
    return this;
  }

 /**
   * Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner. &lt;br/&gt;É obrigatório informar o atributo &#39;oogDimensao&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return oogDimensao
  **/
  @JsonProperty("oogDimensao")
  public Boolean isOogDimensao() {
    return oogDimensao;
  }

  public void setOogDimensao(Boolean oogDimensao) {
    this.oogDimensao = oogDimensao;
  }

  public DadosAcessoVeculo oogDimensao(Boolean oogDimensao) {
    this.oogDimensao = oogDimensao;
    return this;
  }

 /**
   * Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. &lt;br/&gt;É obrigatório informar o atributo &#39;oogPeso&#39; quando o atributo &#39;operacao&#39; for informado com  valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
   * @return oogPeso
  **/
  @JsonProperty("oogPeso")
  public Boolean isOogPeso() {
    return oogPeso;
  }

  public void setOogPeso(Boolean oogPeso) {
    this.oogPeso = oogPeso;
  }

  public DadosAcessoVeculo oogPeso(Boolean oogPeso) {
    this.oogPeso = oogPeso;
    return this;
  }

 /**
   * Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.
   * @return listaSemirreboque
  **/
  @JsonProperty("listaSemirreboque")
  public List<DadosSemirreboque> getListaSemirreboque() {
    return listaSemirreboque;
  }

  public void setListaSemirreboque(List<DadosSemirreboque> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
  }

  public DadosAcessoVeculo listaSemirreboque(List<DadosSemirreboque> listaSemirreboque) {
    this.listaSemirreboque = listaSemirreboque;
    return this;
  }

  public DadosAcessoVeculo addListaSemirreboqueItem(DadosSemirreboque listaSemirreboqueItem) {
    this.listaSemirreboque.add(listaSemirreboqueItem);
    return this;
  }

 /**
   * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
   * @return listaConteineresUld
  **/
  @JsonProperty("listaConteineresUld")
  public List<DadosContinerUldAcessoVeculo> getListaConteineresUld() {
    return listaConteineresUld;
  }

  public void setListaConteineresUld(List<DadosContinerUldAcessoVeculo> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
  }

  public DadosAcessoVeculo listaConteineresUld(List<DadosContinerUldAcessoVeculo> listaConteineresUld) {
    this.listaConteineresUld = listaConteineresUld;
    return this;
  }

  public DadosAcessoVeculo addListaConteineresUldItem(DadosContinerUldAcessoVeculo listaConteineresUldItem) {
    this.listaConteineresUld.add(listaConteineresUldItem);
    return this;
  }

 /**
   * CNPJ da empresa transportadora.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
   * @return cnpjTransportador
  **/
  @JsonProperty("cnpjTransportador")
  public String getCnpjTransportador() {
    return cnpjTransportador;
  }

  public void setCnpjTransportador(String cnpjTransportador) {
    this.cnpjTransportador = cnpjTransportador;
  }

  public DadosAcessoVeculo cnpjTransportador(String cnpjTransportador) {
    this.cnpjTransportador = cnpjTransportador;
    return this;
  }

 /**
   * Nome da empresa transportadora.&lt;br/&gt;Tamanho: 100
   * @return nomeTransportador
  **/
  @JsonProperty("nomeTransportador")
  public String getNomeTransportador() {
    return nomeTransportador;
  }

  public void setNomeTransportador(String nomeTransportador) {
    this.nomeTransportador = nomeTransportador;
  }

  public DadosAcessoVeculo nomeTransportador(String nomeTransportador) {
    this.nomeTransportador = nomeTransportador;
    return this;
  }

 /**
   * Get motorista
   * @return motorista
  **/
  @JsonProperty("motorista")
  public DadosMotorista getMotorista() {
    return motorista;
  }

  public void setMotorista(DadosMotorista motorista) {
    this.motorista = motorista;
  }

  public DadosAcessoVeculo motorista(DadosMotorista motorista) {
    this.motorista = motorista;
    return this;
  }

 /**
   * Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.&lt;br/&gt;Tamanho: 15
   * @return codigoRecintoDestino
  **/
  @JsonProperty("codigoRecintoDestino")
  public String getCodigoRecintoDestino() {
    return codigoRecintoDestino;
  }

  public void setCodigoRecintoDestino(String codigoRecintoDestino) {
    this.codigoRecintoDestino = codigoRecintoDestino;
  }

  public DadosAcessoVeculo codigoRecintoDestino(String codigoRecintoDestino) {
    this.codigoRecintoDestino = codigoRecintoDestino;
    return this;
  }

 /**
   * Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.&lt;br/&gt;Tamanho: 15
   * @return codigoRecintoOrigem
  **/
  @JsonProperty("codigoRecintoOrigem")
  public String getCodigoRecintoOrigem() {
    return codigoRecintoOrigem;
  }

  public void setCodigoRecintoOrigem(String codigoRecintoOrigem) {
    this.codigoRecintoOrigem = codigoRecintoOrigem;
  }

  public DadosAcessoVeculo codigoRecintoOrigem(String codigoRecintoOrigem) {
    this.codigoRecintoOrigem = codigoRecintoOrigem;
    return this;
  }

 /**
   * Informar data e hora de partida do veículo da origem sob regime de trânsito.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
   * @return dataHoraPartidaOrigem
  **/
  @JsonProperty("dataHoraPartidaOrigem")
  public String getDataHoraPartidaOrigem() {
    return dataHoraPartidaOrigem;
  }

  public void setDataHoraPartidaOrigem(String dataHoraPartidaOrigem) {
    this.dataHoraPartidaOrigem = dataHoraPartidaOrigem;
  }

  public DadosAcessoVeculo dataHoraPartidaOrigem(String dataHoraPartidaOrigem) {
    this.dataHoraPartidaOrigem = dataHoraPartidaOrigem;
    return this;
  }

 /**
   * Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.&lt;br/&gt; É obrigatório informar o atributo &#39;modal&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;R - Rodoviário&lt;br/&gt;F - Ferroviário&lt;br/&gt;L - Fluvial
   * @return modal
  **/
  @JsonProperty("modal")
  public String getModal() {
    if (modal == null) {
      return null;
    }
    return modal.value();
  }

  public void setModal(ModalEnum modal) {
    this.modal = modal;
  }

  public DadosAcessoVeculo modal(ModalEnum modal) {
    this.modal = modal;
    return this;
  }

 /**
   * Identificação do Gate.&lt;br/&gt;Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.&lt;br/&gt; É obrigatório informar o atributo &#39;gate&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Tamanho: 36
   * @return gate
  **/
  @JsonProperty("gate")
  public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public DadosAcessoVeculo gate(String gate) {
    this.gate = gate;
    return this;
  }

 /**
   * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.
   * @return listaCameras
  **/
  @JsonProperty("listaCameras")
  public List<DadosDaCmera> getListaCameras() {
    return listaCameras;
  }

  public void setListaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
  }

  public DadosAcessoVeculo listaCameras(List<DadosDaCmera> listaCameras) {
    this.listaCameras = listaCameras;
    return this;
  }

  public DadosAcessoVeculo addListaCamerasItem(DadosDaCmera listaCamerasItem) {
    this.listaCameras.add(listaCamerasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosAcessoVeculo {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    dataHoraOcorrencia: ").append(toIndentedString(dataHoraOcorrencia)).append("\n");
    sb.append("    dataHoraRegistro: ").append(toIndentedString(dataHoraRegistro)).append("\n");
    sb.append("    cpfOperadorOcorrencia: ").append(toIndentedString(cpfOperadorOcorrencia)).append("\n");
    sb.append("    cpfOperadorRegistro: ").append(toIndentedString(cpfOperadorRegistro)).append("\n");
    sb.append("    protocoloEventoRetificadoOuExcluido: ").append(toIndentedString(protocoloEventoRetificadoOuExcluido)).append("\n");
    sb.append("    contingencia: ").append(toIndentedString(contingencia)).append("\n");
    sb.append("    codigoRecinto: ").append(toIndentedString(codigoRecinto)).append("\n");
    sb.append("    operacao: ").append(toIndentedString(operacao)).append("\n");
    sb.append("    direcao: ").append(toIndentedString(direcao)).append("\n");
    sb.append("    protocoloAgenda: ").append(toIndentedString(protocoloAgenda)).append("\n");
    sb.append("    dataHoraAgenda: ").append(toIndentedString(dataHoraAgenda)).append("\n");
    sb.append("    listaManifestos: ").append(toIndentedString(listaManifestos)).append("\n");
    sb.append("    listaDeclaracaoAduaneira: ").append(toIndentedString(listaDeclaracaoAduaneira)).append("\n");
    sb.append("    listaNfe: ").append(toIndentedString(listaNfe)).append("\n");
    sb.append("    listaMalas: ").append(toIndentedString(listaMalas)).append("\n");
    sb.append("    tipoGranel: ").append(toIndentedString(tipoGranel)).append("\n");
    sb.append("    listaChassi: ").append(toIndentedString(listaChassi)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    ufEmplacamento: ").append(toIndentedString(ufEmplacamento)).append("\n");
    sb.append("    ocrPlaca: ").append(toIndentedString(ocrPlaca)).append("\n");
    sb.append("    oogDimensao: ").append(toIndentedString(oogDimensao)).append("\n");
    sb.append("    oogPeso: ").append(toIndentedString(oogPeso)).append("\n");
    sb.append("    listaSemirreboque: ").append(toIndentedString(listaSemirreboque)).append("\n");
    sb.append("    listaConteineresUld: ").append(toIndentedString(listaConteineresUld)).append("\n");
    sb.append("    cnpjTransportador: ").append(toIndentedString(cnpjTransportador)).append("\n");
    sb.append("    nomeTransportador: ").append(toIndentedString(nomeTransportador)).append("\n");
    sb.append("    motorista: ").append(toIndentedString(motorista)).append("\n");
    sb.append("    codigoRecintoDestino: ").append(toIndentedString(codigoRecintoDestino)).append("\n");
    sb.append("    codigoRecintoOrigem: ").append(toIndentedString(codigoRecintoOrigem)).append("\n");
    sb.append("    dataHoraPartidaOrigem: ").append(toIndentedString(dataHoraPartidaOrigem)).append("\n");
    sb.append("    modal: ").append(toIndentedString(modal)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
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

