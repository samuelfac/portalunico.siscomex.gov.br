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
        {"dataHoraPartidaOrigem", "direcao", "ocrPlaca", "dataHoraOcorrencia", "listaChassi", "cpfOperadorRegistro", "codigoRecintoOrigem", "listaNfe", "listaDeclaracaoAduaneira", "cpfTransportador", "codigoRecinto", "codigoRecintoDestino", "modal", "tipoGranel", "placa", "listaConteineresUld", "ufEmplacamento", "listaCameras", "protocoloAgenda", "listaManifestos", "idEvento", "dataHoraAgenda", "dataHoraRegistro", "tipoOperacao", "protocoloEventoRetificadoOuExcluido", "nomeTransportador", "transportadorEstrangeiro", "oogPeso", "motorista", "operacao", "cnpjTransportador", "gate", "oogDimensao", "listaSemirreboque", "cpfOperadorOcorrencia", "contingencia", "listaMalas"
        })

@XmlRootElement(name = "DadosAcessoVeculo")
public class DadosAcessoVeculo {

    @XmlElement(name = "dataHoraPartidaOrigem")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Informar data e hora de partida do veículo da origem sob regime de trânsito.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Informar data e hora de partida do veículo da origem sob regime de trânsito.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraPartidaOrigem = null;
    @XmlElement(name = "direcao", required = true)
    @ApiModelProperty(example = "E", required = true, value = "Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída")
    /**
     * Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída
     **/
    private DirecaoEnum direcao = null;
    @XmlElement(name = "ocrPlaca")
    @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'ocrPlaca' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'ocrPlaca' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean ocrPlaca = null;
    @XmlElement(name = "dataHoraOcorrencia", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraOcorrencia = null;
    @XmlElement(name = "listaChassi")
    @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaChassi.chassi' quando o atributo 'placa' não for informado.<br/>Tamanho: 50")
    @Valid
    /**
     * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'listaChassi.chassi' quando o atributo 'placa' não for informado.<br/>Tamanho: 50
     **/
    private List<DadosDoChassiEmbarque> listaChassi = null;
    @XmlElement(name = "cpfOperadorRegistro")
    @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfOperadorRegistro = null;
    @XmlElement(name = "codigoRecintoOrigem")
    @ApiModelProperty(value = "Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.<br/>Tamanho: 15
     **/
    private String codigoRecintoOrigem = null;
    @XmlElement(name = "listaNfe")
    @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
    @Valid
    /**
     * Lista de chaves das NFE que amparam o transporte.
     **/
    private List<DadosDaNotaFiscal> listaNfe = null;
    @XmlElement(name = "listaDeclaracaoAduaneira")
    @ApiModelProperty(value = "Lista de declarações aduaneiras associadas à carga.")
    @Valid
    /**
     * Lista de declarações aduaneiras associadas à carga.
     **/
    private List<DocumentoAduaneiro> listaDeclaracaoAduaneira = null;
    @XmlElement(name = "cpfTransportador")
    @ApiModelProperty(example = "55555555555", value = "CPF do transportador, aplicável quando for transportador autônomo sem empresa.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF do transportador, aplicável quando for transportador autônomo sem empresa.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfTransportador = null;
    @XmlElement(name = "codigoRecinto", required = true)
    @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
     **/
    private String codigoRecinto = null;
    @XmlElement(name = "codigoRecintoDestino")
    @ApiModelProperty(value = "Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.<br/>Tamanho: 15
     **/
    private String codigoRecintoDestino = null;
    @XmlElement(name = "modal")
    @ApiModelProperty(example = "R", value = "Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'modal' quando o atributo 'operacao' for informado com valor 'C'. <br/> <br/>Domínio:<br/>R - Rodoviário<br/>F - Ferroviário")
    /**
     * Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'modal' quando o atributo 'operacao' for informado com valor 'C'. <br/> <br/>Domínio:<br/>R - Rodoviário<br/>F - Ferroviário
     **/
    private ModalEnum modal = null;
    @XmlElement(name = "tipoGranel")
    @ApiModelProperty(example = "01", value = "Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS")
    /**
     * Tipo de granel conforme tabela de domínio.<br/>Domínio:<br/>01 - SÓLIDOS - MINÉRIOS<br/>02 - SÓLIDOS - GRÃOS<br/>03 - SÓLIDOS - FARELOS<br/>04 - SÓLIDOS - OUTROS<br/>05 - LÍQUIDOS - COMBUSTÍVEIS<br/>06 - LÍQUIDOS - OUTROS<br/>07 - GASOSOS<br/>99 - OUTROS
     **/
    private TipoGranelEnum tipoGranel = null;
    @XmlElement(name = "placa")
    @ApiModelProperty(value = "Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'placa' quando o atributo 'lista.Chassi.chassi' não for informado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50")
    /**
     * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'placa' quando o atributo 'lista.Chassi.chassi' não for informado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 50
     **/
    private String placa = null;
    @XmlElement(name = "listaConteineresUld")
    @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
    @Valid
    /**
     * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
     **/
    private List<DadosContinerUldAcessoVeculo> listaConteineresUld = null;
    @XmlElement(name = "ufEmplacamento")
    @ApiModelProperty(example = "SP", value = "UF Emplacamento.<br/>Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto<br/>Tamanho: 2")
    /**
     * UF Emplacamento.<br/>Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto<br/>Tamanho: 2
     **/
    private String ufEmplacamento = null;
    @XmlElement(name = "listaCameras")
    @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.")
    @Valid
    /**
     * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.
     **/
    private List<DadosDaCmera> listaCameras = null;
    @XmlElement(name = "protocoloAgenda")
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.<br/>Tamanho: 36")
    /**
     * Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.<br/>Tamanho: 36
     **/
    private String protocoloAgenda = null;
    @XmlElement(name = "listaManifestos")
    @ApiModelProperty(value = "Lista de manifestos.")
    @Valid
    /**
     * Lista de manifestos.
     **/
    private List<DadosDoManifestoDaCarga> listaManifestos = null;
    @XmlElement(name = "idEvento", required = true)
    @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100")
    /**
     * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100
     **/
    private String idEvento = null;
    @XmlElement(name = "dataHoraAgenda")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'dataHoraAgenda' quando o atributo 'operacao' for informado com valor 'G'.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'dataHoraAgenda' quando o atributo 'operacao' for informado com valor 'G'.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraAgenda = null;
    @XmlElement(name = "dataHoraRegistro", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraRegistro = null;
    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
    /**
     * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
     **/
    private TipoOperacaoEnum tipoOperacao = null;
    @XmlElement(name = "protocoloEventoRetificadoOuExcluido")
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36")
    /**
     * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36
     **/
    private String protocoloEventoRetificadoOuExcluido = null;
    @XmlElement(name = "nomeTransportador")
    @ApiModelProperty(value = "Nome da empresa transportadora.<br/>Tamanho: 100")
    /**
     * Nome da empresa transportadora.<br/>Tamanho: 100
     **/
    private String nomeTransportador = null;
    @XmlElement(name = "transportadorEstrangeiro")
    @ApiModelProperty(value = "Identificação fiscal de empresa estrangeira responsável pelo transporte. Por exemplo: TIN - Trade Identification Number (Número de Identificação do Operador)<br/>Tamanho: 50")
    /**
     * Identificação fiscal de empresa estrangeira responsável pelo transporte. Por exemplo: TIN - Trade Identification Number (Número de Identificação do Operador)<br/>Tamanho: 50
     **/
    private String transportadorEstrangeiro = null;
    @XmlElement(name = "oogPeso")
    @ApiModelProperty(example = "false", value = "Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. <font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'oogPeso' quando o atributo 'operacao' for informado com  valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. <font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'oogPeso' quando o atributo 'operacao' for informado com  valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean oogPeso = null;
    @XmlElement(name = "motorista")
    @ApiModelProperty(value = "")
    @Valid
    private DadosMotorista motorista = null;
    @XmlElement(name = "operacao", required = true)
    @ApiModelProperty(example = "G", required = true, value = "Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>G - Agendamento<br/>C - Acesso")
    /**
     * Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>G - Agendamento<br/>C - Acesso
     **/
    private OperacaoEnum operacao = null;
    @XmlElement(name = "cnpjTransportador")
    @ApiModelProperty(example = "44444444444444", value = "CNPJ da empresa transportadora.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'")
    /**
     * CNPJ da empresa transportadora.<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'
     **/
    private String cnpjTransportador = null;
    @XmlElement(name = "gate")
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Identificação do Gate.<br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'gate' quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 36")
    /**
     * Identificação do Gate.<br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'gate' quando o atributo 'operacao' for informado com valor 'C'.<br/>Tamanho: 36
     **/
    private String gate = null;
    @XmlElement(name = "oogDimensao")
    @ApiModelProperty(example = "false", value = "Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'oogDimensao' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'oogDimensao' quando o atributo 'operacao' for informado com valor 'C'.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean oogDimensao = null;
    @XmlElement(name = "listaSemirreboque")
    @ApiModelProperty(value = "Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.")
    @Valid
    /**
     * Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.
     **/
    private List<DadosSemirreboque> listaSemirreboque = null;
    @XmlElement(name = "cpfOperadorOcorrencia")
    @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.<br/>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfOperadorOcorrencia = null;
    @XmlElement(name = "contingencia", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não")
    /**
     * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.<br/>Domínio:<br/>true - Sim<br/>false - Não
     **/
    private Boolean contingencia = null;
    @XmlElement(name = "listaMalas")
    @ApiModelProperty(value = "Lista com as malas postais. Utilizar apenas para remessa postal internacional.")
    @Valid
    /**
     * Lista com as malas postais. Utilizar apenas para remessa postal internacional.
     **/
    private List<DadosDaMala> listaMalas = null;

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

    /**
     * Informar data e hora de partida do veículo da origem sob regime de trânsito.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
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
     * Direção do veículo. Indica se é um movimento de entrada ou de saída do veículo. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada&lt;br/&gt;S - Saída
     *
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
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;ocrPlaca&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return ocrPlaca
     **/
    @JsonProperty("ocrPlaca")
    public Boolean isisOcrPlaca() {
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
     * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
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
     * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;listaChassi.chassi&#39; quando o atributo &#39;placa&#39; não for informado.&lt;br/&gt;Tamanho: 50
     *
     * @return listaChassi
     **/
    @JsonProperty("listaChassi")
    public List<DadosDoChassiEmbarque> getListaChassi() {
        return listaChassi;
    }

    public void setListaChassi(List<DadosDoChassiEmbarque> listaChassi) {
        this.listaChassi = listaChassi;
    }

    public DadosAcessoVeculo listaChassi(List<DadosDoChassiEmbarque> listaChassi) {
        this.listaChassi = listaChassi;
        return this;
    }

    public DadosAcessoVeculo addListaChassiItem(DadosDoChassiEmbarque listaChassiItem) {
        this.listaChassi.add(listaChassiItem);
        return this;
    }

    /**
     * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.&lt;br&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
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
     * Código Siscomex do recinto de origem. Informar apenas no caso de chegada em recinto em regime de trânsito.&lt;br/&gt;Tamanho: 15
     *
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
     * Lista de chaves das NFE que amparam o transporte.
     *
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
     * Lista de declarações aduaneiras associadas à carga.
     *
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
     * CPF do transportador, aplicável quando for transportador autônomo sem empresa.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
     * @return cpfTransportador
     **/
    @JsonProperty("cpfTransportador")
    public String getCpfTransportador() {
        return cpfTransportador;
    }

    public void setCpfTransportador(String cpfTransportador) {
        this.cpfTransportador = cpfTransportador;
    }

    public DadosAcessoVeculo cpfTransportador(String cpfTransportador) {
        this.cpfTransportador = cpfTransportador;
        return this;
    }

    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.&lt;br/&gt;Tamanho: 15
     *
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
     * Código Siscomex do recinto de destino. Informar apenas no caso de saída do recinto em regime de trânsito.&lt;br/&gt;Tamanho: 15
     *
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
     * Modal. Forma como a carga chegou/saiu do recinto, transporte rodoviário ou transporte ferroviário. Conforme tabela domínio.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;modal&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;. &lt;br/&gt; &lt;br/&gt;Domínio:&lt;br/&gt;R - Rodoviário&lt;br/&gt;F - Ferroviário
     *
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
     * Tipo de granel conforme tabela de domínio.&lt;br/&gt;Domínio:&lt;br/&gt;01 - SÓLIDOS - MINÉRIOS&lt;br/&gt;02 - SÓLIDOS - GRÃOS&lt;br/&gt;03 - SÓLIDOS - FARELOS&lt;br/&gt;04 - SÓLIDOS - OUTROS&lt;br/&gt;05 - LÍQUIDOS - COMBUSTÍVEIS&lt;br/&gt;06 - LÍQUIDOS - OUTROS&lt;br/&gt;07 - GASOSOS&lt;br/&gt;99 - OUTROS
     *
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
     * Placa do veículo (Cavalo-trator/truck/automóvel/locomotiva).&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;placa&#39; quando o atributo &#39;lista.Chassi.chassi&#39; não for informado. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 50
     *
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
     * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
     *
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
     * UF Emplacamento.&lt;br/&gt;Informar apenas no caso de trânsito terrestre cuja chegada da carga no país ocorreu via aeroporto&lt;br/&gt;Tamanho: 2
     *
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
     * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem o Gate por onde o veículo ingressou/saiu.
     *
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

    /**
     * Protocolo do Evento de Agendamento que foi recebido quando do envio do evento.&lt;br/&gt;Tamanho: 36
     *
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
     * Lista de manifestos.
     *
     * @return listaManifestos
     **/
    @JsonProperty("listaManifestos")
    public List<DadosDoManifestoDaCarga> getListaManifestos() {
        return listaManifestos;
    }

    public void setListaManifestos(List<DadosDoManifestoDaCarga> listaManifestos) {
        this.listaManifestos = listaManifestos;
    }

    public DadosAcessoVeculo listaManifestos(List<DadosDoManifestoDaCarga> listaManifestos) {
        this.listaManifestos = listaManifestos;
        return this;
    }

    public DadosAcessoVeculo addListaManifestosItem(DadosDoManifestoDaCarga listaManifestosItem) {
        this.listaManifestos.add(listaManifestosItem);
        return this;
    }

    /**
     * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.&lt;br/&gt; O idEvento informado em cada evento não pode ser repetido quando \&quot;tipoOperacao\&quot;&#x3D;\&quot;I-Incluir\&quot;, ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.&lt;br/&gt;Tamanho: 100
     *
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
     * Data e Hora agendada. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;dataHoraAgenda&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;G&#39;.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
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
     * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
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
     * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.&lt;br/&gt;Domínio:&lt;br/&gt;I - Incluir&lt;br/&gt;R - Retificar&lt;br/&gt;E - Excluir
     *
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
     * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.&lt;br/&gt;Tamanho: 36
     *
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
     * Nome da empresa transportadora.&lt;br/&gt;Tamanho: 100
     *
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
     * Identificação fiscal de empresa estrangeira responsável pelo transporte. Por exemplo: TIN - Trade Identification Number (Número de Identificação do Operador)&lt;br/&gt;Tamanho: 50
     *
     * @return transportadorEstrangeiro
     **/
    @JsonProperty("transportadorEstrangeiro")
    public String getTransportadorEstrangeiro() {
        return transportadorEstrangeiro;
    }

    public void setTransportadorEstrangeiro(String transportadorEstrangeiro) {
        this.transportadorEstrangeiro = transportadorEstrangeiro;
    }

    public DadosAcessoVeculo transportadorEstrangeiro(String transportadorEstrangeiro) {
        this.transportadorEstrangeiro = transportadorEstrangeiro;
        return this;
    }

    /**
     * Peso que impeça a entrada/saída OOG (Out of Gauge) pelo gate padrão, a pesagem ou a passagem pelo scanner. &lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;oogPeso&#39; quando o atributo &#39;operacao&#39; for informado com  valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return oogPeso
     **/
    @JsonProperty("oogPeso")
    public Boolean isisOogPeso() {
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
     * Get motorista
     *
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
     * Operação de agendamento de entrada/saída de veículo (agendamento) ou de entrada/saída de veículo (acesso). Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;G - Agendamento&lt;br/&gt;C - Acesso
     *
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
     * CNPJ da empresa transportadora.&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
     *
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
     * Identificação do Gate.&lt;br/&gt;Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;gate&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Tamanho: 36
     *
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
     * Dimensões que impeçam a entrada/saída OOG (Out of Gauge) pelo gate padrão ou a pesagem ou a passagem pelo scanner.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;oogDimensao&#39; quando o atributo &#39;operacao&#39; for informado com valor &#39;C&#39;.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return oogDimensao
     **/
    @JsonProperty("oogDimensao")
    public Boolean isisOogDimensao() {
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
     * Lista de semirreboques ou vagões. No caso de caminhão truck utilizar essa estrutura repetindo a identificação da placa do veículo.
     *
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
     * CPF da pessoa que coletou, em formulário papel durante uma contingência, os dados do evento.&lt;br/&gt;Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
     *
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
     * Indica que este evento ocorreu durante uma contingência. Via de regra deverá haver um evento (Ocorrências de indisponibilidade de equipamentos) para o equipamento envolvido. Transmitir como true sempre que ocorrer falha operacional no sistema do recinto que impeça o registro e/ou envio de informações em seu sistema.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não
     *
     * @return contingencia
     **/
    @JsonProperty("contingencia")
    @NotNull
    public Boolean isisContingencia() {
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
     * Lista com as malas postais. Utilizar apenas para remessa postal internacional.
     *
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

    @Override
    public String toString() {

        String sb = "class DadosAcessoVeculo {\n" +
                "    dataHoraPartidaOrigem: " + toIndentedString(dataHoraPartidaOrigem) + "\n" +
                "    direcao: " + toIndentedString(direcao) + "\n" +
                "    ocrPlaca: " + toIndentedString(ocrPlaca) + "\n" +
                "    dataHoraOcorrencia: " + toIndentedString(dataHoraOcorrencia) + "\n" +
                "    listaChassi: " + toIndentedString(listaChassi) + "\n" +
                "    cpfOperadorRegistro: " + toIndentedString(cpfOperadorRegistro) + "\n" +
                "    codigoRecintoOrigem: " + toIndentedString(codigoRecintoOrigem) + "\n" +
                "    listaNfe: " + toIndentedString(listaNfe) + "\n" +
                "    listaDeclaracaoAduaneira: " + toIndentedString(listaDeclaracaoAduaneira) + "\n" +
                "    cpfTransportador: " + toIndentedString(cpfTransportador) + "\n" +
                "    codigoRecinto: " + toIndentedString(codigoRecinto) + "\n" +
                "    codigoRecintoDestino: " + toIndentedString(codigoRecintoDestino) + "\n" +
                "    modal: " + toIndentedString(modal) + "\n" +
                "    tipoGranel: " + toIndentedString(tipoGranel) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
                "    listaConteineresUld: " + toIndentedString(listaConteineresUld) + "\n" +
                "    ufEmplacamento: " + toIndentedString(ufEmplacamento) + "\n" +
                "    listaCameras: " + toIndentedString(listaCameras) + "\n" +
                "    protocoloAgenda: " + toIndentedString(protocoloAgenda) + "\n" +
                "    listaManifestos: " + toIndentedString(listaManifestos) + "\n" +
                "    idEvento: " + toIndentedString(idEvento) + "\n" +
                "    dataHoraAgenda: " + toIndentedString(dataHoraAgenda) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    protocoloEventoRetificadoOuExcluido: " + toIndentedString(protocoloEventoRetificadoOuExcluido) + "\n" +
                "    nomeTransportador: " + toIndentedString(nomeTransportador) + "\n" +
                "    transportadorEstrangeiro: " + toIndentedString(transportadorEstrangeiro) + "\n" +
                "    oogPeso: " + toIndentedString(oogPeso) + "\n" +
                "    motorista: " + toIndentedString(motorista) + "\n" +
                "    operacao: " + toIndentedString(operacao) + "\n" +
                "    cnpjTransportador: " + toIndentedString(cnpjTransportador) + "\n" +
                "    gate: " + toIndentedString(gate) + "\n" +
                "    oogDimensao: " + toIndentedString(oogDimensao) + "\n" +
                "    listaSemirreboque: " + toIndentedString(listaSemirreboque) + "\n" +
                "    cpfOperadorOcorrencia: " + toIndentedString(cpfOperadorOcorrencia) + "\n" +
                "    contingencia: " + toIndentedString(contingencia) + "\n" +
                "    listaMalas: " + toIndentedString(listaMalas) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "DirecaoEnum")
    @XmlEnum(String.class)
    public enum DirecaoEnum {

        @XmlEnumValue("'E'")
        @JsonProperty("'E'")
        E_("'E'"),

        @XmlEnumValue("'S'")
        @JsonProperty("'S'")
        S_("'S'");


        private final String value;

        DirecaoEnum(String v) {
            value = v;
        }

        public static DirecaoEnum fromValue(String v) {
            for (DirecaoEnum b : DirecaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to DirecaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "ModalEnum")
    @XmlEnum(String.class)
    public enum ModalEnum {

        @XmlEnumValue("'R'")
        @JsonProperty("'R'")
        R_("'R'"),

        @XmlEnumValue("'F'")
        @JsonProperty("'F'")
        F_("'F'");


        private final String value;

        ModalEnum(String v) {
            value = v;
        }

        public static ModalEnum fromValue(String v) {
            for (ModalEnum b : ModalEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to ModalEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "TipoGranelEnum")
    @XmlEnum(String.class)
    public enum TipoGranelEnum {

        @XmlEnumValue("'01'")
        @JsonProperty("'01'")
        _01_("'01'"),

        @XmlEnumValue("'02'")
        @JsonProperty("'02'")
        _02_("'02'"),

        @XmlEnumValue("'03'")
        @JsonProperty("'03'")
        _03_("'03'"),

        @XmlEnumValue("'04'")
        @JsonProperty("'04'")
        _04_("'04'"),

        @XmlEnumValue("'05'")
        @JsonProperty("'05'")
        _05_("'05'"),

        @XmlEnumValue("'06'")
        @JsonProperty("'06'")
        _06_("'06'"),

        @XmlEnumValue("'07'")
        @JsonProperty("'07'")
        _07_("'07'"),

        @XmlEnumValue("'99'")
        @JsonProperty("'99'")
        _99_("'99'");


        private final String value;

        TipoGranelEnum(String v) {
            value = v;
        }

        public static TipoGranelEnum fromValue(String v) {
            for (TipoGranelEnum b : TipoGranelEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoGranelEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    @XmlType(name = "TipoOperacaoEnum")
    @XmlEnum(String.class)
    public enum TipoOperacaoEnum {

        @XmlEnumValue("'I'")
        @JsonProperty("'I'")
        I_("'I'"),

        @XmlEnumValue("'R'")
        @JsonProperty("'R'")
        R_("'R'"),

        @XmlEnumValue("'E'")
        @JsonProperty("'E'")
        E_("'E'");


        private final String value;

        TipoOperacaoEnum(String v) {
            value = v;
        }

        public static TipoOperacaoEnum fromValue(String v) {
            for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoOperacaoEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @XmlType(name = "OperacaoEnum")
    @XmlEnum(String.class)
    public enum OperacaoEnum {

        @XmlEnumValue("G")
        @JsonProperty("G")
        G("G"),

        @XmlEnumValue("C")
        @JsonProperty("C")
        C("C");


        private final String value;

        OperacaoEnum(String v) {
            value = v;
        }

        public static OperacaoEnum fromValue(String v) {
            for (OperacaoEnum b : OperacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to OperacaoEnum");
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
