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
@XmlType(name = "DadosAcessoPessoa", propOrder =
        {"tipoOperacao", "idEvento", "dataHoraOcorrencia", "dataHoraRegistro", "cpfOperadorOcorrencia", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "contingencia", "codigoRecinto", "cpf", "direcao", "identificacao", "identidadeEstrangeiro", "nome", "reserva", "voo", "catraca", "listaCameras"
        })

@XmlRootElement(name = "DadosAcessoPessoa")
public class DadosAcessoPessoa {


    @XmlElement(name = "tipoOperacao", required = true)
    @ApiModelProperty(example = "I", required = true, value = "Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir")
    /**
     * Indica se o evento transmitido é novo (incluir) ou retifica/exclui evento anterior.<br/>Domínio:<br/>I - Incluir<br/>R - Retificar<br/>E - Excluir
     **/
    private TipoOperacaoEnum tipoOperacao = null;
    @XmlElement(name = "dataHoraRegistro", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraRegistro = null;

    @XmlElement(name = "idEvento", required = true)
    @ApiModelProperty(required = true, value = "Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100")
    /**
     * Identificador único do evento que pode ser utilizado para recuperar as informações do Evento no sistema de origem do Recinto remetente. Ex.: Chave tabela 1 + ... + chave tabela n - tantas chaves quantas forem as tabelas necessárias para montar o registro do evento.<br/> O idEvento informado em cada evento não pode ser repetido quando \"tipoOperacao\"=\"I-Incluir\", ou seja, não pode ser reutilizado em novos eventos de inclusão para o mesmo tipo de evento e pelo mesmo recinto remetente.<br/>Tamanho: 100
     **/
    private String idEvento = null;

    @XmlElement(name = "dataHoraOcorrencia", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraOcorrencia = null;
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
    @XmlElement(name = "direcao", required = true)
    @ApiModelProperty(example = "E", required = true, value = "Direção do acesso. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída")
    /**
     * Direção do acesso. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>E - Entrada<br/>S - Saída
     **/
    private DirecaoEnum direcao = null;

    @XmlElement(name = "codigoRecinto", required = true)
    @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
     **/
    private String codigoRecinto = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(example = "55555555555", value = "CPF da pessoa que está acessando o recinto (entrada ou saída).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'cpf' quando o atributo 'identidadeEstrangeiro' não for informado.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'")
    /**
     * CPF da pessoa que está acessando o recinto (entrada ou saída).<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'cpf' quando o atributo 'identidadeEstrangeiro' não for informado.<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'
     **/
    private String cpf = null;
    @XmlElement(name = "identificacao", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Forma de identificação conforme tabela de domínio. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>1 - cartão<br/>2 - biométrico<br/>3 - cartão + biometria <br/>4 - manual")
    /**
     * Forma de identificação conforme tabela de domínio. Pode ser nulo quando o evento for de exclusão.<br/>Domínio:<br/>1 - cartão<br/>2 - biométrico<br/>3 - cartão + biometria <br/>4 - manual
     **/
    private IdentificacaoEnum identificacao = null;
    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(required = true, value = "Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100")
    /**
     * Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 100
     **/
    private String nome = null;
    @XmlElement(name = "voo")
    @ApiModelProperty(value = "Número do vôo do passageiro.<br/>Acesso de pessoas em áreas alfandegadas de aeroportos.<br/>Tamanho: 20")
    /**
     * Número do vôo do passageiro.<br/>Acesso de pessoas em áreas alfandegadas de aeroportos.<br/>Tamanho: 20
     **/
    private String voo = null;
    @XmlElement(name = "catraca", required = true)
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", required = true, value = "Portão ou catraca de acesso. <br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 36")
    /**
     * Portão ou catraca de acesso. <br/>Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 36
     **/
    private String catraca = null;

    @XmlElement(name = "identidadeEstrangeiro")
    @ApiModelProperty(example = "FB000001", value = "Número do documento de estrangeiro. <br/> Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'identidadeEstrangeiro' quando o atributo 'cpf' não for informado.<br/>Tamanho: 50")
    /**
     * Número do documento de estrangeiro. <br/> Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório informar o atributo 'identidadeEstrangeiro' quando o atributo 'cpf' não for informado.<br/>Tamanho: 50
     **/
    private String identidadeEstrangeiro = null;
    @XmlElement(name = "listaCameras")
    @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área de acesso.")
    @Valid
    /**
     * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área de acesso.
     **/
    private List<DadosDaCmera> listaCameras = null;

    @XmlElement(name = "reserva")
    @ApiModelProperty(value = "Número da reserva do passageiro.<br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 50")
    /**
     * Número da reserva do passageiro.<br/>Acesso de pessoas em áreas alfandegadas de aeroportos<br/>Tamanho: 50
     **/
    private String reserva = null;

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

    public DadosAcessoPessoa tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
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

    public DadosAcessoPessoa idEvento(String idEvento) {
        this.idEvento = idEvento;
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

    public DadosAcessoPessoa dataHoraOcorrencia(String dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        return this;
    }

    public DadosAcessoPessoa dataHoraRegistro(String dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
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

    public DadosAcessoPessoa cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

    public DadosAcessoPessoa cpfOperadorRegistro(String cpfOperadorRegistro) {
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

    public DadosAcessoPessoa protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
        this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
        return this;
    }

    public DadosAcessoPessoa contingencia(Boolean contingencia) {
        this.contingencia = contingencia;
        return this;
    }

    /**
     * Direção do acesso. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;E - Entrada&lt;br/&gt;S - Saída
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
     * CPF da pessoa que está acessando o recinto (entrada ou saída).&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;cpf&#39; quando o atributo &#39;identidadeEstrangeiro&#39; não for informado.&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;
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

    public DadosAcessoPessoa direcao(DirecaoEnum direcao) {
        this.direcao = direcao;
        return this;
    }

    /**
     * Forma de identificação conforme tabela de domínio. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Domínio:&lt;br/&gt;1 - cartão&lt;br/&gt;2 - biométrico&lt;br/&gt;3 - cartão + biometria &lt;br/&gt;4 - manual
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    @NotNull
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
     * Nome da pessoa que está acessando o recinto (entrada ou saída). Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 100
     *
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

    /**
     * Número do documento de estrangeiro. &lt;br/&gt; Informar apenas no caso de estrangeiro sem CPF. Usar o passaporte sempre que possível.&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório informar o atributo &#39;identidadeEstrangeiro&#39; quando o atributo &#39;cpf&#39; não for informado.&lt;br/&gt;Tamanho: 50
     *
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

    public DadosAcessoPessoa nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número do vôo do passageiro.&lt;br/&gt;Acesso de pessoas em áreas alfandegadas de aeroportos.&lt;br/&gt;Tamanho: 20
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

    /**
     * Número da reserva do passageiro.&lt;br/&gt;Acesso de pessoas em áreas alfandegadas de aeroportos&lt;br/&gt;Tamanho: 50
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

    public DadosAcessoPessoa voo(String voo) {
        this.voo = voo;
        return this;
    }

    /**
     * Portão ou catraca de acesso. &lt;br/&gt;Usar o protocolo do evento de georreferenciamento relativo ao ponto de acesso utilizado. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 36
     * @return catraca
     **/
    @JsonProperty("catraca")
    @NotNull
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

        String sb = "class DadosAcessoPessoa {\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    idEvento: " + toIndentedString(idEvento) + "\n" +
                "    dataHoraOcorrencia: " + toIndentedString(dataHoraOcorrencia) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    cpfOperadorOcorrencia: " + toIndentedString(cpfOperadorOcorrencia) + "\n" +
                "    cpfOperadorRegistro: " + toIndentedString(cpfOperadorRegistro) + "\n" +
                "    protocoloEventoRetificadoOuExcluido: " + toIndentedString(protocoloEventoRetificadoOuExcluido) + "\n" +
                "    contingencia: " + toIndentedString(contingencia) + "\n" +
                "    codigoRecinto: " + toIndentedString(codigoRecinto) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    direcao: " + toIndentedString(direcao) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    identidadeEstrangeiro: " + toIndentedString(identidadeEstrangeiro) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    reserva: " + toIndentedString(reserva) + "\n" +
                "    voo: " + toIndentedString(voo) + "\n" +
                "    catraca: " + toIndentedString(catraca) + "\n" +
                "    listaCameras: " + toIndentedString(listaCameras) + "\n" +
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

    @XmlType(name = "IdentificacaoEnum")
    @XmlEnum(String.class)
    public enum IdentificacaoEnum {

        @XmlEnumValue("'1'")
        @JsonProperty("'1'")
        _1_("'1'"),

        @XmlEnumValue("'2'")
        @JsonProperty("'2'")
        _2_("'2'"),

        @XmlEnumValue("'3'")
        @JsonProperty("'3'")
        _3_("'3'"),

        @XmlEnumValue("'4'")
        @JsonProperty("'4'")
        _4_("'4'");


        private final String value;

        IdentificacaoEnum(String v) {
            value = v;
        }

        public static IdentificacaoEnum fromValue(String v) {
            for (IdentificacaoEnum b : IdentificacaoEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to IdentificacaoEnum");
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
