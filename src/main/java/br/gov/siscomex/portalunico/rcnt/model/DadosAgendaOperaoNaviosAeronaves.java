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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosAgendaOperaoNaviosAeronaves", propOrder =
        {"idEvento", "dataHoraRegistro", "dataHoraOcorrencia", "tipoOperacao", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "viagem", "navio", "periodoOperacao", "voo", "chegada", "codigoRecinto", "iataAeronave", "prefixoAeronave", "escala", "cpfOperadorOcorrencia", "contingencia", "agendamento"
        })

@XmlRootElement(name = "DadosAgendaOperaoNaviosAeronaves")
public class DadosAgendaOperaoNaviosAeronaves {

    @XmlElement(name = "idEvento", required = true)
    @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100")
    /**
     * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100
     **/
    private String idEvento = null;

    @XmlElement(name = "dataHoraRegistro", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraRegistro = null;

    @XmlElement(name = "dataHoraOcorrencia", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraOcorrencia = null;
    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
    /**
     * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
     **/
    private TipoOperacaoEnum tipoOperacao = null;
    @XmlElement(name = "cpfOperadorRegistro")
    @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF da pessoa que efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência.<br>Pode ser nulo quando o processo for automatizado, com isso, não há operador de ocorrência e nem de registro.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpfOperadorRegistro = null;
    @XmlElement(name = "protocoloEventoRetificadoOuExcluido")
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", value = "Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36")
    /**
     * Observar que no caso de evento retificador ou de exclusão, o protocolo do evento retificado ou excluído deve ser informado para possibilitar a correta vinculação. Usar protocolo recebido após o envio do evento original. O envio de eventos retificadores substitui completamente as informações prestadas no evento retificado.<br/>Tamanho: 36
     **/
    private String protocoloEventoRetificadoOuExcluido = null;
    @XmlElement(name = "viagem", required = true)
    @ApiModelProperty(example = "AA090520191209MIA', onde vôo = 'AA0905', data de partida prevista = '20191209' e aeroporto da partida = 'MIA", required = true, value = "<br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.<br/>Tamanho: 20")
    /**
     * <br/>No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.<br/>Tamanho: 20
     **/
    private String viagem = null;
    @XmlElement(name = "navio")
    @ApiModelProperty(value = "")
    @Valid
    private DadosNavioAgenda navio = null;
    @XmlElement(name = "periodoOperacao")
    @ApiModelProperty(value = "")
    @Valid
    private DadosAgendaOperaoNaviosAeronavesOperao periodoOperacao = null;
    @XmlElement(name = "voo")
    @ApiModelProperty(value = "Vôo<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20")
    /**
     * Vôo<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20
     **/
    private String voo = null;
    @XmlElement(name = "chegada")
    @ApiModelProperty(value = "")
    @Valid
    private DadosAgendaOperaoNaviosAeronavesChegada chegada = null;
    @XmlElement(name = "codigoRecinto", required = true)
    @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
     **/
    private String codigoRecinto = null;
    @XmlElement(name = "iataAeronave")
    @ApiModelProperty(value = "Código IATA da Aeronave<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 50")
    /**
     * Código IATA da Aeronave<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 50
     **/
    private String iataAeronave = null;
    @XmlElement(name = "prefixoAeronave")
    @ApiModelProperty(value = "Prefixo da aeronave<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20")
    /**
     * Prefixo da aeronave<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20
     **/
    private String prefixoAeronave = null;
    @XmlElement(name = "escala")
    @ApiModelProperty(value = "Escala<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20")
    /**
     * Escala<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: ('navio.imo', 'navio.nome' e 'escala') ou ('iataAeronave', 'prefixoAeronave' e 'voo')<br/>Tamanho: 20
     **/
    private String escala = null;
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
    @XmlElement(name = "agendamento")
    @ApiModelProperty(value = "")
    @Valid
    private DadosAgendaOperaoNaviosAeronavesAgendamento agendamento = null;

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

    public DadosAgendaOperaoNaviosAeronaves idEvento(String idEvento) {
        this.idEvento = idEvento;
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

    public DadosAgendaOperaoNaviosAeronaves dataHoraRegistro(String dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
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

    public DadosAgendaOperaoNaviosAeronaves dataHoraOcorrencia(String dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
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

    public DadosAgendaOperaoNaviosAeronaves tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
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

    public DadosAgendaOperaoNaviosAeronaves cpfOperadorRegistro(String cpfOperadorRegistro) {
        this.cpfOperadorRegistro = cpfOperadorRegistro;
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

    public DadosAgendaOperaoNaviosAeronaves protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
        this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
        return this;
    }

    /**
     * &lt;br/&gt;No aéreo a composição da viagem é: vôo + data da partida prevista + aeroporto da partida.No aquaviário também deve ser informado o campo viagem no formato disponível.&lt;br/&gt;Tamanho: 20
     *
     * @return viagem
     **/
    @JsonProperty("viagem")
    @NotNull
    public String getViagem() {
        return viagem;
    }

    public void setViagem(String viagem) {
        this.viagem = viagem;
    }

    public DadosAgendaOperaoNaviosAeronaves viagem(String viagem) {
        this.viagem = viagem;
        return this;
    }

    /**
     * Get navio
     *
     * @return navio
     **/
    @JsonProperty("navio")
    public DadosNavioAgenda getNavio() {
        return navio;
    }

    public void setNavio(DadosNavioAgenda navio) {
        this.navio = navio;
    }

    public DadosAgendaOperaoNaviosAeronaves navio(DadosNavioAgenda navio) {
        this.navio = navio;
        return this;
    }

    /**
     * Get periodoOperacao
     *
     * @return periodoOperacao
     **/
    @JsonProperty("periodoOperacao")
    public DadosAgendaOperaoNaviosAeronavesOperao getPeriodoOperacao() {
        return periodoOperacao;
    }

    public void setPeriodoOperacao(DadosAgendaOperaoNaviosAeronavesOperao periodoOperacao) {
        this.periodoOperacao = periodoOperacao;
    }

    public DadosAgendaOperaoNaviosAeronaves periodoOperacao(DadosAgendaOperaoNaviosAeronavesOperao periodoOperacao) {
        this.periodoOperacao = periodoOperacao;
        return this;
    }

    /**
     * Vôo&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 20
     *
     * @return voo
     **/
    @JsonProperty("voo")
    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public DadosAgendaOperaoNaviosAeronaves voo(String voo) {
        this.voo = voo;
        return this;
    }

    /**
     * Get chegada
     *
     * @return chegada
     **/
    @JsonProperty("chegada")
    public DadosAgendaOperaoNaviosAeronavesChegada getChegada() {
        return chegada;
    }

    public void setChegada(DadosAgendaOperaoNaviosAeronavesChegada chegada) {
        this.chegada = chegada;
    }

    public DadosAgendaOperaoNaviosAeronaves chegada(DadosAgendaOperaoNaviosAeronavesChegada chegada) {
        this.chegada = chegada;
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

    public DadosAgendaOperaoNaviosAeronaves codigoRecinto(String codigoRecinto) {
        this.codigoRecinto = codigoRecinto;
        return this;
    }

    /**
     * Código IATA da Aeronave&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 50
     *
     * @return iataAeronave
     **/
    @JsonProperty("iataAeronave")
    public String getIataAeronave() {
        return iataAeronave;
    }

    public void setIataAeronave(String iataAeronave) {
        this.iataAeronave = iataAeronave;
    }

    public DadosAgendaOperaoNaviosAeronaves iataAeronave(String iataAeronave) {
        this.iataAeronave = iataAeronave;
        return this;
    }

    /**
     * Prefixo da aeronave&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 20
     *
     * @return prefixoAeronave
     **/
    @JsonProperty("prefixoAeronave")
    public String getPrefixoAeronave() {
        return prefixoAeronave;
    }

    public void setPrefixoAeronave(String prefixoAeronave) {
        this.prefixoAeronave = prefixoAeronave;
    }

    public DadosAgendaOperaoNaviosAeronaves prefixoAeronave(String prefixoAeronave) {
        this.prefixoAeronave = prefixoAeronave;
        return this;
    }

    /**
     * Escala&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o valor para pelo menos um dos seguintes grupos de atributos: (&#39;navio.imo&#39;, &#39;navio.nome&#39; e &#39;escala&#39;) ou (&#39;iataAeronave&#39;, &#39;prefixoAeronave&#39; e &#39;voo&#39;)&lt;br/&gt;Tamanho: 20
     *
     * @return escala
     **/
    @JsonProperty("escala")
    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public DadosAgendaOperaoNaviosAeronaves escala(String escala) {
        this.escala = escala;
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

    public DadosAgendaOperaoNaviosAeronaves cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

    public DadosAgendaOperaoNaviosAeronaves contingencia(Boolean contingencia) {
        this.contingencia = contingencia;
        return this;
    }

    /**
     * Get agendamento
     *
     * @return agendamento
     **/
    @JsonProperty("agendamento")
    public DadosAgendaOperaoNaviosAeronavesAgendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(DadosAgendaOperaoNaviosAeronavesAgendamento agendamento) {
        this.agendamento = agendamento;
    }

    public DadosAgendaOperaoNaviosAeronaves agendamento(DadosAgendaOperaoNaviosAeronavesAgendamento agendamento) {
        this.agendamento = agendamento;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosAgendaOperaoNaviosAeronaves {\n" +
                "    idEvento: " + toIndentedString(idEvento) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    dataHoraOcorrencia: " + toIndentedString(dataHoraOcorrencia) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    cpfOperadorRegistro: " + toIndentedString(cpfOperadorRegistro) + "\n" +
                "    protocoloEventoRetificadoOuExcluido: " + toIndentedString(protocoloEventoRetificadoOuExcluido) + "\n" +
                "    viagem: " + toIndentedString(viagem) + "\n" +
                "    navio: " + toIndentedString(navio) + "\n" +
                "    periodoOperacao: " + toIndentedString(periodoOperacao) + "\n" +
                "    voo: " + toIndentedString(voo) + "\n" +
                "    chegada: " + toIndentedString(chegada) + "\n" +
                "    codigoRecinto: " + toIndentedString(codigoRecinto) + "\n" +
                "    iataAeronave: " + toIndentedString(iataAeronave) + "\n" +
                "    prefixoAeronave: " + toIndentedString(prefixoAeronave) + "\n" +
                "    escala: " + toIndentedString(escala) + "\n" +
                "    cpfOperadorOcorrencia: " + toIndentedString(cpfOperadorOcorrencia) + "\n" +
                "    contingencia: " + toIndentedString(contingencia) + "\n" +
                "    agendamento: " + toIndentedString(agendamento) + "\n" +
                "}";
        return sb;
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
}
