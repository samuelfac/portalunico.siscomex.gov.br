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
@XmlType(name = "DadosRepresentante", propOrder =
        {"documentoEstrangeiroRepresentante", "motivo", "cnpjRepresentante", "idEvento", "dataHoraRegistro", "operadorEstrangeiroRepresentado", "dataHoraOcorrencia", "cpfRepresentado", "operadorEstrangeiroRepresentante", "tipoOperacao", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "dataHoraInicioValidade", "nomeRepresentante", "nomeRepresentado", "cpfRepresentante", "codigoRecinto", "dataHoraFimValidade", "documentoEstrangeiroRepresentado", "cpfOperadorOcorrencia", "contingencia", "cnpjRepresentado"
        })

@XmlRootElement(name = "DadosRepresentante")
public class DadosRepresentante {

    @XmlElement(name = "documentoEstrangeiroRepresentante")
    @ApiModelProperty(value = "")
    @Valid
    private DadosDocumentoDeEstrangeiroRepresentante documentoEstrangeiroRepresentante = null;

    @XmlElement(name = "motivo", required = true)
    @ApiModelProperty(example = "representação para trâmite de documentos, representação para fechar faturamento com recinto, representação para monitoramento de cargas no portal do recinto...", required = true, value = "Motivo da representação<br/>Tamanho: 100")
    /**
     * Motivo da representação<br/>Tamanho: 100
     **/
    private String motivo = null;

    @XmlElement(name = "cnpjRepresentante")
    @ApiModelProperty(example = "44444444444444", value = "CNPJ representante<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.")
    /**
     * CNPJ representante<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.
     **/
    private String cnpjRepresentante = null;

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

    @XmlElement(name = "operadorEstrangeiroRepresentado")
    @ApiModelProperty(example = "TIN - Trade Identification Number (Número de Identificação do Operador)", value = "Identificação fiscal de empresa estrangeira representada<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.<br/>Tamanho: 50")
    /**
     * Identificação fiscal de empresa estrangeira representada<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.<br/>Tamanho: 50
     **/
    private String operadorEstrangeiroRepresentado = null;

    @XmlElement(name = "dataHoraOcorrencia", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que o evento ocorreu ou que se coletou, em formulário papel durante uma contingência, os dados do evento. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraOcorrencia = null;

    @XmlElement(name = "cpfRepresentado")
    @ApiModelProperty(example = "55555555555", value = "CPF representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.")
    /**
     * CPF representado<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.
     **/
    private String cpfRepresentado = null;

    @XmlElement(name = "operadorEstrangeiroRepresentante")
    @ApiModelProperty(example = "TIN - Trade Identification Number (Número de Identificação do Operador)", value = "Identificação fiscal de empresa estrangeira representante<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.<br/>Tamanho: 50")
    /**
     * Identificação fiscal de empresa estrangeira representante<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.<br/>Tamanho: 50
     **/
    private String operadorEstrangeiroRepresentante = null;
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
    @XmlElement(name = "dataHoraInicioValidade")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data Início representação<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data Início representação<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraInicioValidade = null;
    @XmlElement(name = "nomeRepresentante")
    @ApiModelProperty(value = "Nome representante<br/>Tamanho: 100")
    /**
     * Nome representante<br/>Tamanho: 100
     **/
    private String nomeRepresentante = null;
    @XmlElement(name = "nomeRepresentado")
    @ApiModelProperty(value = "Nome do representado<br/>Tamanho: 100")
    /**
     * Nome do representado<br/>Tamanho: 100
     **/
    private String nomeRepresentado = null;
    @XmlElement(name = "cpfRepresentante")
    @ApiModelProperty(example = "55555555555", value = "CPF representante<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.")
    /**
     * CPF representante<br/>Tamanho: 11<br/>Formato: 'NNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante'.
     **/
    private String cpfRepresentante = null;
    @XmlElement(name = "codigoRecinto", required = true)
    @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
     **/
    private String codigoRecinto = null;
    @XmlElement(name = "dataHoraFimValidade")
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", value = "Data Fim representação, se houver<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data Fim representação, se houver<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraFimValidade = null;
    @XmlElement(name = "documentoEstrangeiroRepresentado")
    @ApiModelProperty(value = "")
    @Valid
    private DadosDocumentoDeEstrangeiroRepresentado documentoEstrangeiroRepresentado = null;
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
    @XmlElement(name = "cnpjRepresentado")
    @ApiModelProperty(example = "44444444444444", value = "CNPJ representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.")
    /**
     * CNPJ representado<br/>Tamanho: 14<br/>Formato: 'NNNNNNNNNNNNNN'<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado'.
     **/
    private String cnpjRepresentado = null;

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
     * Get documentoEstrangeiroRepresentante
     *
     * @return documentoEstrangeiroRepresentante
     **/
    @JsonProperty("documentoEstrangeiroRepresentante")
    public DadosDocumentoDeEstrangeiroRepresentante getDocumentoEstrangeiroRepresentante() {
        return documentoEstrangeiroRepresentante;
    }

    public void setDocumentoEstrangeiroRepresentante(DadosDocumentoDeEstrangeiroRepresentante documentoEstrangeiroRepresentante) {
        this.documentoEstrangeiroRepresentante = documentoEstrangeiroRepresentante;
    }

    public DadosRepresentante documentoEstrangeiroRepresentante(DadosDocumentoDeEstrangeiroRepresentante documentoEstrangeiroRepresentante) {
        this.documentoEstrangeiroRepresentante = documentoEstrangeiroRepresentante;
        return this;
    }

    /**
     * Motivo da representação&lt;br/&gt;Tamanho: 100
     *
     * @return motivo
     **/
    @JsonProperty("motivo")
    @NotNull
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public DadosRepresentante motivo(String motivo) {
        this.motivo = motivo;
        return this;
    }

    /**
     * CNPJ representante&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante&#39;.
     *
     * @return cnpjRepresentante
     **/
    @JsonProperty("cnpjRepresentante")
    public String getCnpjRepresentante() {
        return cnpjRepresentante;
    }

    public void setCnpjRepresentante(String cnpjRepresentante) {
        this.cnpjRepresentante = cnpjRepresentante;
    }

    public DadosRepresentante cnpjRepresentante(String cnpjRepresentante) {
        this.cnpjRepresentante = cnpjRepresentante;
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

    public DadosRepresentante idEvento(String idEvento) {
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

    public DadosRepresentante dataHoraRegistro(String dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    /**
     * Identificação fiscal de empresa estrangeira representada&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado&#39;.&lt;br/&gt;Tamanho: 50
     *
     * @return operadorEstrangeiroRepresentado
     **/
    @JsonProperty("operadorEstrangeiroRepresentado")
    public String getOperadorEstrangeiroRepresentado() {
        return operadorEstrangeiroRepresentado;
    }

    public void setOperadorEstrangeiroRepresentado(String operadorEstrangeiroRepresentado) {
        this.operadorEstrangeiroRepresentado = operadorEstrangeiroRepresentado;
    }

    public DadosRepresentante operadorEstrangeiroRepresentado(String operadorEstrangeiroRepresentado) {
        this.operadorEstrangeiroRepresentado = operadorEstrangeiroRepresentado;
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

    public DadosRepresentante dataHoraOcorrencia(String dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        return this;
    }

    /**
     * CPF representado&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado&#39;.
     *
     * @return cpfRepresentado
     **/
    @JsonProperty("cpfRepresentado")
    public String getCpfRepresentado() {
        return cpfRepresentado;
    }

    public void setCpfRepresentado(String cpfRepresentado) {
        this.cpfRepresentado = cpfRepresentado;
    }

    public DadosRepresentante cpfRepresentado(String cpfRepresentado) {
        this.cpfRepresentado = cpfRepresentado;
        return this;
    }

    /**
     * Identificação fiscal de empresa estrangeira representante&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante&#39;.&lt;br/&gt;Tamanho: 50
     *
     * @return operadorEstrangeiroRepresentante
     **/
    @JsonProperty("operadorEstrangeiroRepresentante")
    public String getOperadorEstrangeiroRepresentante() {
        return operadorEstrangeiroRepresentante;
    }

    public void setOperadorEstrangeiroRepresentante(String operadorEstrangeiroRepresentante) {
        this.operadorEstrangeiroRepresentante = operadorEstrangeiroRepresentante;
    }

    public DadosRepresentante operadorEstrangeiroRepresentante(String operadorEstrangeiroRepresentante) {
        this.operadorEstrangeiroRepresentante = operadorEstrangeiroRepresentante;
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

    public DadosRepresentante tipoOperacao(TipoOperacaoEnum tipoOperacao) {
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

    public DadosRepresentante cpfOperadorRegistro(String cpfOperadorRegistro) {
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

    public DadosRepresentante protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
        this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
        return this;
    }

    /**
     * Data Início representação&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
     * @return dataHoraInicioValidade
     **/
    @JsonProperty("dataHoraInicioValidade")
    public String getDataHoraInicioValidade() {
        return dataHoraInicioValidade;
    }

    public void setDataHoraInicioValidade(String dataHoraInicioValidade) {
        this.dataHoraInicioValidade = dataHoraInicioValidade;
    }

    public DadosRepresentante dataHoraInicioValidade(String dataHoraInicioValidade) {
        this.dataHoraInicioValidade = dataHoraInicioValidade;
        return this;
    }

    /**
     * Nome representante&lt;br/&gt;Tamanho: 100
     *
     * @return nomeRepresentante
     **/
    @JsonProperty("nomeRepresentante")
    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public DadosRepresentante nomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
        return this;
    }

    /**
     * Nome do representado&lt;br/&gt;Tamanho: 100
     *
     * @return nomeRepresentado
     **/
    @JsonProperty("nomeRepresentado")
    public String getNomeRepresentado() {
        return nomeRepresentado;
    }

    public void setNomeRepresentado(String nomeRepresentado) {
        this.nomeRepresentado = nomeRepresentado;
    }

    public DadosRepresentante nomeRepresentado(String nomeRepresentado) {
        this.nomeRepresentado = nomeRepresentado;
        return this;
    }

    /**
     * CPF representante&lt;br/&gt;Tamanho: 11&lt;br/&gt;Formato: &#39;NNNNNNNNNNN&#39;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentante OU cnpjRepresentante OU  documentoEstrangeiroRepresentante (número, tipo, país) OU  operadorEstrangeiroRepresentante&#39;.
     *
     * @return cpfRepresentante
     **/
    @JsonProperty("cpfRepresentante")
    public String getCpfRepresentante() {
        return cpfRepresentante;
    }

    public void setCpfRepresentante(String cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
    }

    public DadosRepresentante cpfRepresentante(String cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
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

    public DadosRepresentante codigoRecinto(String codigoRecinto) {
        this.codigoRecinto = codigoRecinto;
        return this;
    }

    /**
     * Data Fim representação, se houver&lt;br/&gt;Formato: &#39;yyyy-MM-ddTHH:mm:ss.SSSZ&#39;
     *
     * @return dataHoraFimValidade
     **/
    @JsonProperty("dataHoraFimValidade")
    public String getDataHoraFimValidade() {
        return dataHoraFimValidade;
    }

    public void setDataHoraFimValidade(String dataHoraFimValidade) {
        this.dataHoraFimValidade = dataHoraFimValidade;
    }

    public DadosRepresentante dataHoraFimValidade(String dataHoraFimValidade) {
        this.dataHoraFimValidade = dataHoraFimValidade;
        return this;
    }

    /**
     * Get documentoEstrangeiroRepresentado
     *
     * @return documentoEstrangeiroRepresentado
     **/
    @JsonProperty("documentoEstrangeiroRepresentado")
    public DadosDocumentoDeEstrangeiroRepresentado getDocumentoEstrangeiroRepresentado() {
        return documentoEstrangeiroRepresentado;
    }

    public void setDocumentoEstrangeiroRepresentado(DadosDocumentoDeEstrangeiroRepresentado documentoEstrangeiroRepresentado) {
        this.documentoEstrangeiroRepresentado = documentoEstrangeiroRepresentado;
    }

    public DadosRepresentante documentoEstrangeiroRepresentado(DadosDocumentoDeEstrangeiroRepresentado documentoEstrangeiroRepresentado) {
        this.documentoEstrangeiroRepresentado = documentoEstrangeiroRepresentado;
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

    public DadosRepresentante cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

    public DadosRepresentante contingencia(Boolean contingencia) {
        this.contingencia = contingencia;
        return this;
    }

    /**
     * CNPJ representado&lt;br/&gt;Tamanho: 14&lt;br/&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que pelo menos um dos seguintes atributos seja informado:  cpfRepresentado OU cnpjRepresentado OU  documentoEstrangeiroRepresentado (número, tipo, país) OU  operadorEstrangeiroRepresentado&#39;.
     *
     * @return cnpjRepresentado
     **/
    @JsonProperty("cnpjRepresentado")
    public String getCnpjRepresentado() {
        return cnpjRepresentado;
    }

    public void setCnpjRepresentado(String cnpjRepresentado) {
        this.cnpjRepresentado = cnpjRepresentado;
    }

    public DadosRepresentante cnpjRepresentado(String cnpjRepresentado) {
        this.cnpjRepresentado = cnpjRepresentado;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosRepresentante {\n" +
                "    documentoEstrangeiroRepresentante: " + toIndentedString(documentoEstrangeiroRepresentante) + "\n" +
                "    motivo: " + toIndentedString(motivo) + "\n" +
                "    cnpjRepresentante: " + toIndentedString(cnpjRepresentante) + "\n" +
                "    idEvento: " + toIndentedString(idEvento) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    operadorEstrangeiroRepresentado: " + toIndentedString(operadorEstrangeiroRepresentado) + "\n" +
                "    dataHoraOcorrencia: " + toIndentedString(dataHoraOcorrencia) + "\n" +
                "    cpfRepresentado: " + toIndentedString(cpfRepresentado) + "\n" +
                "    operadorEstrangeiroRepresentante: " + toIndentedString(operadorEstrangeiroRepresentante) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    cpfOperadorRegistro: " + toIndentedString(cpfOperadorRegistro) + "\n" +
                "    protocoloEventoRetificadoOuExcluido: " + toIndentedString(protocoloEventoRetificadoOuExcluido) + "\n" +
                "    dataHoraInicioValidade: " + toIndentedString(dataHoraInicioValidade) + "\n" +
                "    nomeRepresentante: " + toIndentedString(nomeRepresentante) + "\n" +
                "    nomeRepresentado: " + toIndentedString(nomeRepresentado) + "\n" +
                "    cpfRepresentante: " + toIndentedString(cpfRepresentante) + "\n" +
                "    codigoRecinto: " + toIndentedString(codigoRecinto) + "\n" +
                "    dataHoraFimValidade: " + toIndentedString(dataHoraFimValidade) + "\n" +
                "    documentoEstrangeiroRepresentado: " + toIndentedString(documentoEstrangeiroRepresentado) + "\n" +
                "    cpfOperadorOcorrencia: " + toIndentedString(cpfOperadorOcorrencia) + "\n" +
                "    contingencia: " + toIndentedString(contingencia) + "\n" +
                "    cnpjRepresentado: " + toIndentedString(cnpjRepresentado) + "\n" +
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
