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
@XmlType(name = "DadosDaInspeoNoInvasiva", propOrder =
        {"listaCarga", "listaCameras", "listaManifestos", "idEvento", "dataHoraRegistro", "ocrPlaca", "dataHoraOcorrencia", "tipoOperacao", "arquivoMetadados", "cpfOperadorRegistro", "protocoloEventoRetificadoOuExcluido", "listaNfe", "listaChassis", "codigoRecinto", "imagemScanner", "scanner", "vazio", "listaSemirreboque", "cpfOperadorOcorrencia", "contingencia", "listaConteineresUld", "placa"
        })

@XmlRootElement(name = "DadosDaInspeoNoInvasiva")
public class DadosDaInspeoNoInvasiva {

    @XmlElement(name = "listaCarga")
    @ApiModelProperty(value = "Lista de identificadores de Carga.")
    @Valid
    /**
     * Lista de identificadores de Carga.
     **/
    private List<DadosDaCarga> listaCarga = null;

    @XmlElement(name = "listaCameras")
    @ApiModelProperty(value = "Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.")
    @Valid
    /**
     * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.
     **/
    private List<DadosDaCmera> listaCameras = null;

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

    @XmlElement(name = "dataHoraRegistro", required = true)
    @ApiModelProperty(example = "2020-04-01T10:50:30.150-0300", required = true, value = "Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'")
    /**
     * Data e hora em que se efetuou o lançamento, no sistema informatizado, seja em operações normais, seja das informações coletadas durante uma contingência. Deve-se enviar, junto da data, o fuso horário no qual tal data e hora foi gerada.<br/>Formato: 'yyyy-MM-ddTHH:mm:ss.SSSZ'
     **/
    private String dataHoraRegistro = null;

    @XmlElement(name = "ocrPlaca")
    @ApiModelProperty(example = "false", value = "Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<br/>Domínio:<br/>true - Sim<br/>false - Não<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'ocrPlaca' seja informado quando o atributo 'placa' for informado.")
    /**
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)<br/>Domínio:<br/>true - Sim<br/>false - Não<font color=\"red\"><strong><br/>(!)</strong></font>É obrigatório que o atributo 'ocrPlaca' seja informado quando o atributo 'placa' for informado.
     **/
    private Boolean ocrPlaca = null;

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
    @XmlElement(name = "arquivoMetadados")
    @ApiModelProperty(example = "xml", value = "Arquivo gerado que acompanha a imagem do scanner, geralmente um xml<br/>Tamanho: 14000")
    /**
     * Arquivo gerado que acompanha a imagem do scanner, geralmente um xml<br/>Tamanho: 14000
     **/
    private String arquivoMetadados = null;
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
    @XmlElement(name = "listaNfe")
    @ApiModelProperty(value = "Lista de chaves das NFE que amparam o transporte.")
    @Valid
    /**
     * Lista de chaves das NFE que amparam o transporte.
     **/
    private List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe = null;
    @XmlElement(name = "listaChassis")
    @ApiModelProperty(value = "Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).")
    @Valid
    /**
     * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).
     **/
    private List<DadosDoChassiEmbarque> listaChassis = null;
    @XmlElement(name = "codigoRecinto", required = true)
    @ApiModelProperty(example = "1111111", required = true, value = "Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15")
    /**
     * Código Siscomex do recinto onde ocorreu o evento a ser transmitido.<br/>Tamanho: 15
     **/
    private String codigoRecinto = null;
    @XmlElement(name = "imagemScanner", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private DadosImagemScanner imagemScanner = null;
    @XmlElement(name = "scanner", required = true)
    @ApiModelProperty(example = "66d24eb1-6ac9-4798-bc93-f4c66eb6fa9b", required = true, value = "Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 36")
    /**
     * Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner. Pode ser nulo quando o evento for de exclusão.<br/>Tamanho: 36
     **/
    private String scanner = null;
    @XmlElement(name = "vazio", required = true)
    @ApiModelProperty(example = "false", required = true, value = "Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não Pode ser nulo quando o evento for de exclusão.")
    /**
     * Vazio.<br/>Domínio:<br/>true - Sim<br/>false - Não Pode ser nulo quando o evento for de exclusão.
     **/
    private Boolean vazio = null;
    @XmlElement(name = "listaSemirreboque")
    @ApiModelProperty(value = "Lista de semirreboques ou vagões.")
    @Valid
    /**
     * Lista de semirreboques ou vagões.
     **/
    private List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque = null;
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
    @XmlElement(name = "listaConteineresUld")
    @ApiModelProperty(value = "Lista de contêineres ou ULD (Unit Load Device – Aéreo).")
    @Valid
    /**
     * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
     **/
    private List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld = null;
    @XmlElement(name = "placa")
    @ApiModelProperty(value = "Placa do veículo (Cavalo-trator/truck/locomotiva).<br/>Tamanho: 50")
    /**
     * Placa do veículo (Cavalo-trator/truck/locomotiva).<br/>Tamanho: 50
     **/
    private String placa = null;

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
     * Lista de identificadores de Carga.
     *
     * @return listaCarga
     **/
    @JsonProperty("listaCarga")
    public List<DadosDaCarga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(List<DadosDaCarga> listaCarga) {
        this.listaCarga = listaCarga;
    }

    public DadosDaInspeoNoInvasiva listaCarga(List<DadosDaCarga> listaCarga) {
        this.listaCarga = listaCarga;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaCargaItem(DadosDaCarga listaCargaItem) {
        this.listaCarga.add(listaCargaItem);
        return this;
    }

    /**
     * Lista de identificação das câmeras. Usar o protocolo do evento de georreferenciamento para indicar, nesta lista, todas as câmeras que cobrem a área onde foi realizado o escaneamento.
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

    public DadosDaInspeoNoInvasiva listaCameras(List<DadosDaCmera> listaCameras) {
        this.listaCameras = listaCameras;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaCamerasItem(DadosDaCmera listaCamerasItem) {
        this.listaCameras.add(listaCamerasItem);
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

    public DadosDaInspeoNoInvasiva listaManifestos(List<DadosDoManifestoDaCarga> listaManifestos) {
        this.listaManifestos = listaManifestos;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaManifestosItem(DadosDoManifestoDaCarga listaManifestosItem) {
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

    public DadosDaInspeoNoInvasiva idEvento(String idEvento) {
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

    public DadosDaInspeoNoInvasiva dataHoraRegistro(String dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    /**
     * Captura automática da placa. Indica se a placa foi obtida via OCR (Optical Character Recognition)&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não&lt;font color&#x3D;\&quot;red\&quot;&gt;&lt;strong&gt;&lt;br/&gt;(!)&lt;/strong&gt;&lt;/font&gt;É obrigatório que o atributo &#39;ocrPlaca&#39; seja informado quando o atributo &#39;placa&#39; for informado.
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

    public DadosDaInspeoNoInvasiva ocrPlaca(Boolean ocrPlaca) {
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

    public DadosDaInspeoNoInvasiva dataHoraOcorrencia(String dataHoraOcorrencia) {
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

    public DadosDaInspeoNoInvasiva tipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
        return this;
    }

    /**
     * Arquivo gerado que acompanha a imagem do scanner, geralmente um xml&lt;br/&gt;Tamanho: 14000
     *
     * @return arquivoMetadados
     **/
    @JsonProperty("arquivoMetadados")
    public String getArquivoMetadados() {
        return arquivoMetadados;
    }

    public void setArquivoMetadados(String arquivoMetadados) {
        this.arquivoMetadados = arquivoMetadados;
    }

    public DadosDaInspeoNoInvasiva arquivoMetadados(String arquivoMetadados) {
        this.arquivoMetadados = arquivoMetadados;
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

    public DadosDaInspeoNoInvasiva cpfOperadorRegistro(String cpfOperadorRegistro) {
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

    public DadosDaInspeoNoInvasiva protocoloEventoRetificadoOuExcluido(String protocoloEventoRetificadoOuExcluido) {
        this.protocoloEventoRetificadoOuExcluido = protocoloEventoRetificadoOuExcluido;
        return this;
    }

    /**
     * Lista de chaves das NFE que amparam o transporte.
     *
     * @return listaNfe
     **/
    @JsonProperty("listaNfe")
    public List<DadosDaNotaFiscalEmbarqueDesembarque> getListaNfe() {
        return listaNfe;
    }

    public void setListaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
        this.listaNfe = listaNfe;
    }

    public DadosDaInspeoNoInvasiva listaNfe(List<DadosDaNotaFiscalEmbarqueDesembarque> listaNfe) {
        this.listaNfe = listaNfe;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaNfeItem(DadosDaNotaFiscalEmbarqueDesembarque listaNfeItem) {
        this.listaNfe.add(listaNfeItem);
        return this;
    }

    /**
     * Lista de Chassis. Informar todos os chassis das mercadorias, inclusive o tipo meios próprios (Impo/Expo ônibus, cavalo-trator, semirreboque...).
     *
     * @return listaChassis
     **/
    @JsonProperty("listaChassis")
    public List<DadosDoChassiEmbarque> getListaChassis() {
        return listaChassis;
    }

    public void setListaChassis(List<DadosDoChassiEmbarque> listaChassis) {
        this.listaChassis = listaChassis;
    }

    public DadosDaInspeoNoInvasiva listaChassis(List<DadosDoChassiEmbarque> listaChassis) {
        this.listaChassis = listaChassis;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaChassisItem(DadosDoChassiEmbarque listaChassisItem) {
        this.listaChassis.add(listaChassisItem);
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

    public DadosDaInspeoNoInvasiva codigoRecinto(String codigoRecinto) {
        this.codigoRecinto = codigoRecinto;
        return this;
    }

    /**
     * Get imagemScanner
     *
     * @return imagemScanner
     **/
    @JsonProperty("imagemScanner")
    @NotNull
    public DadosImagemScanner getImagemScanner() {
        return imagemScanner;
    }

    public void setImagemScanner(DadosImagemScanner imagemScanner) {
        this.imagemScanner = imagemScanner;
    }

    public DadosDaInspeoNoInvasiva imagemScanner(DadosImagemScanner imagemScanner) {
        this.imagemScanner = imagemScanner;
        return this;
    }

    /**
     * Identificação do scanner. Usar o protocolo do evento de georreferenciamento relativo ao scanner. Pode ser nulo quando o evento for de exclusão.&lt;br/&gt;Tamanho: 36
     *
     * @return scanner
     **/
    @JsonProperty("scanner")
    @NotNull
    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public DadosDaInspeoNoInvasiva scanner(String scanner) {
        this.scanner = scanner;
        return this;
    }

    /**
     * Vazio.&lt;br/&gt;Domínio:&lt;br/&gt;true - Sim&lt;br/&gt;false - Não Pode ser nulo quando o evento for de exclusão.
     *
     * @return vazio
     **/
    @JsonProperty("vazio")
    @NotNull
    public Boolean isisVazio() {
        return vazio;
    }

    public void setVazio(Boolean vazio) {
        this.vazio = vazio;
    }

    public DadosDaInspeoNoInvasiva vazio(Boolean vazio) {
        this.vazio = vazio;
        return this;
    }

    /**
     * Lista de semirreboques ou vagões.
     *
     * @return listaSemirreboque
     **/
    @JsonProperty("listaSemirreboque")
    public List<DadosSemirreboqueDaInspeoNoInvasiva> getListaSemirreboque() {
        return listaSemirreboque;
    }

    public void setListaSemirreboque(List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque) {
        this.listaSemirreboque = listaSemirreboque;
    }

    public DadosDaInspeoNoInvasiva listaSemirreboque(List<DadosSemirreboqueDaInspeoNoInvasiva> listaSemirreboque) {
        this.listaSemirreboque = listaSemirreboque;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaSemirreboqueItem(DadosSemirreboqueDaInspeoNoInvasiva listaSemirreboqueItem) {
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

    public DadosDaInspeoNoInvasiva cpfOperadorOcorrencia(String cpfOperadorOcorrencia) {
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

    public DadosDaInspeoNoInvasiva contingencia(Boolean contingencia) {
        this.contingencia = contingencia;
        return this;
    }

    /**
     * Lista de contêineres ou ULD (Unit Load Device – Aéreo).
     *
     * @return listaConteineresUld
     **/
    @JsonProperty("listaConteineresUld")
    public List<DadosContinerUldInspeoNoInvasiva> getListaConteineresUld() {
        return listaConteineresUld;
    }

    public void setListaConteineresUld(List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld) {
        this.listaConteineresUld = listaConteineresUld;
    }

    public DadosDaInspeoNoInvasiva listaConteineresUld(List<DadosContinerUldInspeoNoInvasiva> listaConteineresUld) {
        this.listaConteineresUld = listaConteineresUld;
        return this;
    }

    public DadosDaInspeoNoInvasiva addListaConteineresUldItem(DadosContinerUldInspeoNoInvasiva listaConteineresUldItem) {
        this.listaConteineresUld.add(listaConteineresUldItem);
        return this;
    }

    /**
     * Placa do veículo (Cavalo-trator/truck/locomotiva).&lt;br/&gt;Tamanho: 50
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

    public DadosDaInspeoNoInvasiva placa(String placa) {
        this.placa = placa;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DadosDaInspeoNoInvasiva {\n" +
                "    listaCarga: " + toIndentedString(listaCarga) + "\n" +
                "    listaCameras: " + toIndentedString(listaCameras) + "\n" +
                "    listaManifestos: " + toIndentedString(listaManifestos) + "\n" +
                "    idEvento: " + toIndentedString(idEvento) + "\n" +
                "    dataHoraRegistro: " + toIndentedString(dataHoraRegistro) + "\n" +
                "    ocrPlaca: " + toIndentedString(ocrPlaca) + "\n" +
                "    dataHoraOcorrencia: " + toIndentedString(dataHoraOcorrencia) + "\n" +
                "    tipoOperacao: " + toIndentedString(tipoOperacao) + "\n" +
                "    arquivoMetadados: " + toIndentedString(arquivoMetadados) + "\n" +
                "    cpfOperadorRegistro: " + toIndentedString(cpfOperadorRegistro) + "\n" +
                "    protocoloEventoRetificadoOuExcluido: " + toIndentedString(protocoloEventoRetificadoOuExcluido) + "\n" +
                "    listaNfe: " + toIndentedString(listaNfe) + "\n" +
                "    listaChassis: " + toIndentedString(listaChassis) + "\n" +
                "    codigoRecinto: " + toIndentedString(codigoRecinto) + "\n" +
                "    imagemScanner: " + toIndentedString(imagemScanner) + "\n" +
                "    scanner: " + toIndentedString(scanner) + "\n" +
                "    vazio: " + toIndentedString(vazio) + "\n" +
                "    listaSemirreboque: " + toIndentedString(listaSemirreboque) + "\n" +
                "    cpfOperadorOcorrencia: " + toIndentedString(cpfOperadorOcorrencia) + "\n" +
                "    contingencia: " + toIndentedString(contingencia) + "\n" +
                "    listaConteineresUld: " + toIndentedString(listaConteineresUld) + "\n" +
                "    placa: " + toIndentedString(placa) + "\n" +
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
