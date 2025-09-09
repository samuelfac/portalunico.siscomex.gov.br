package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDeManifestosDosRgosAnuentes", propOrder =
        {"listaUaDespacho", "listaCodOcorrencia", "dataFimAnexacao", "dataInicioManifesto", "dataInicioAnexacao", "listaSituacaoRemessa", "dataFimOcorrencia", "listaSituacaoLote", "dataFimLote", "dataFimManifesto", "dataInicioLote", "dataInicioOcorrencia", "listaOperadora", "listaSituacaoOcorrencia", "listaOrgaoFiscalizacao"
        })

@XmlRootElement(name = "ConsultaDeManifestosDosRgosAnuentes")
public class ConsultaDeManifestosDosRgosAnuentes {

    @XmlElement(name = "listaUaDespacho")
    @ApiModelProperty(value = "Lista de UA despacho. Cada item da lista contém:<br/>Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).")
    /**
     * Lista de UA despacho. Cada item da lista contém:<br/>Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).
     **/
    private List<String> listaUaDespacho = null;

    @XmlElement(name = "listaCodOcorrencia")
    @ApiModelProperty(value = "Lista de código de ocorrência. Cada item da lista contém:<br/>Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.")
    /**
     * Lista de código de ocorrência. Cada item da lista contém:<br/>Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.
     **/
    private List<Integer> listaCodOcorrencia = null;

    @XmlElement(name = "dataFimAnexacao")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de anexação de documentos.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de anexação de documentos.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimAnexacao = null;

    @XmlElement(name = "dataInicioManifesto")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioManifesto = null;

    @XmlElement(name = "dataInicioAnexacao")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de anexação de documentos.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de anexação de documentos.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioAnexacao = null;

    @XmlElement(name = "listaSituacaoRemessa")
    @ApiModelProperty(value = "Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.")
    /**
     * Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.
     **/
    private List<Integer> listaSituacaoRemessa = null;

    @XmlElement(name = "dataFimOcorrencia")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de inclusão da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de inclusão da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimOcorrencia = null;

    @XmlElement(name = "listaSituacaoLote")
    @ApiModelProperty(value = "Lista de situação do lote. Cada item da lista contém:<br/>Situação do lote. Máximo de 2 caracteres numéricos. Domínio: <br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.<br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.")
    /**
     * Lista de situação do lote. Cada item da lista contém:<br/>Situação do lote. Máximo de 2 caracteres numéricos. Domínio: <br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.<br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.
     **/
    private List<Integer> listaSituacaoLote = null;

    @XmlElement(name = "dataFimLote")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimLote = null;

    @XmlElement(name = "dataFimManifesto")
    @ApiModelProperty(value = "Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data final relacionada ao filtro por período de registro de manifesto.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataFimManifesto = null;

    @XmlElement(name = "dataInicioLote")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de registro de lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioLote = null;

    @XmlElement(name = "dataInicioOcorrencia")
    @ApiModelProperty(value = "Data inicial relacionada ao filtro por período de inclusão da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data inicial relacionada ao filtro por período de inclusão da ocorrência.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataInicioOcorrencia = null;

    @XmlElement(name = "listaOperadora")
    @ApiModelProperty(value = "Lista de operadora. Cada item da lista contém:<br/>Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.")
    /**
     * Lista de operadora. Cada item da lista contém:<br/>Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     **/
    private List<String> listaOperadora = null;

    @XmlElement(name = "listaSituacaoOcorrencia")
    @ApiModelProperty(value = "Lista de situação de ocorrência. Cada item da lista contém:<br/>Código da situação da ocorrência. Composto por até 2 caracteres numéricos.<br/>1 - Exigência em aberto - Todas;<br/>2 - Interrompida pela RFB;<br/>3 - Resolvida;<br/>4 - Sem ocorrência;<br/>5 - Não resolvida.")
    /**
     * Lista de situação de ocorrência. Cada item da lista contém:<br/>Código da situação da ocorrência. Composto por até 2 caracteres numéricos.<br/>1 - Exigência em aberto - Todas;<br/>2 - Interrompida pela RFB;<br/>3 - Resolvida;<br/>4 - Sem ocorrência;<br/>5 - Não resolvida.
     **/
    private List<Integer> listaSituacaoOcorrencia = null;

    @XmlElement(name = "listaOrgaoFiscalizacao")
    @ApiModelProperty(value = "Lista de ID do órgão fiscalizador. Cada item da lista contém:<br/>Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.<br/>RFB;<br/>ANVISA;<br/>IBAMA;<br/>MAPA.")
    /**
     * Lista de ID do órgão fiscalizador. Cada item da lista contém:<br/>Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.<br/>RFB;<br/>ANVISA;<br/>IBAMA;<br/>MAPA.
     **/
    private List<String> listaOrgaoFiscalizacao = null;

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
     * Lista de UA despacho. Cada item da lista contém:&lt;br/&gt;Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio. O sistema permitirá o preenchimento de uaDespacho sem o zero à esquerda (com 6 caracteres).
     *
     * @return listaUaDespacho
     **/
    @JsonProperty("listaUaDespacho")
    public List<String> getListaUaDespacho() {
        return listaUaDespacho;
    }

    public void setListaUaDespacho(List<String> listaUaDespacho) {
        this.listaUaDespacho = listaUaDespacho;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaUaDespacho(List<String> listaUaDespacho) {
        this.listaUaDespacho = listaUaDespacho;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaUaDespachoItem(String listaUaDespachoItem) {
        this.listaUaDespacho.add(listaUaDespachoItem);
        return this;
    }

    /**
     * Lista de código de ocorrência. Cada item da lista contém:&lt;br/&gt;Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.
     *
     * @return listaCodOcorrencia
     **/
    @JsonProperty("listaCodOcorrencia")
    public List<Integer> getListaCodOcorrencia() {
        return listaCodOcorrencia;
    }

    public void setListaCodOcorrencia(List<Integer> listaCodOcorrencia) {
        this.listaCodOcorrencia = listaCodOcorrencia;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaCodOcorrencia(List<Integer> listaCodOcorrencia) {
        this.listaCodOcorrencia = listaCodOcorrencia;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaCodOcorrenciaItem(Integer listaCodOcorrenciaItem) {
        this.listaCodOcorrencia.add(listaCodOcorrenciaItem);
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de anexação de documentos.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimAnexacao
     **/
    @JsonProperty("dataFimAnexacao")
    public OffsetDateTime getDataFimAnexacao() {
        return dataFimAnexacao;
    }

    public void setDataFimAnexacao(OffsetDateTime dataFimAnexacao) {
        this.dataFimAnexacao = dataFimAnexacao;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataFimAnexacao(OffsetDateTime dataFimAnexacao) {
        this.dataFimAnexacao = dataFimAnexacao;
        return this;
    }

    /**
     * Data inicial relacionada ao filtro por período de registro de manifesto.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioManifesto
     **/
    @JsonProperty("dataInicioManifesto")
    public OffsetDateTime getDataInicioManifesto() {
        return dataInicioManifesto;
    }

    public void setDataInicioManifesto(OffsetDateTime dataInicioManifesto) {
        this.dataInicioManifesto = dataInicioManifesto;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataInicioManifesto(OffsetDateTime dataInicioManifesto) {
        this.dataInicioManifesto = dataInicioManifesto;
        return this;
    }

    /**
     * Data inicial relacionada ao filtro por período de anexação de documentos.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioAnexacao
     **/
    @JsonProperty("dataInicioAnexacao")
    public OffsetDateTime getDataInicioAnexacao() {
        return dataInicioAnexacao;
    }

    public void setDataInicioAnexacao(OffsetDateTime dataInicioAnexacao) {
        this.dataInicioAnexacao = dataInicioAnexacao;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataInicioAnexacao(OffsetDateTime dataInicioAnexacao) {
        this.dataInicioAnexacao = dataInicioAnexacao;
        return this;
    }

    /**
     * Lista de situação de remessa. Cada item da lista contém:&lt;br/&gt;Código da situação da remessa. O código da situação é composto por 2 dígitos.&lt;br/&gt;18 - Manifestada;&lt;br/&gt;19 - Liberada;&lt;br/&gt;20 - Descaracterizada / Declaração Cancelada;&lt;br/&gt;21 - Em Perdimento;&lt;br/&gt;22 - Abandonada;&lt;br/&gt;23 - Destruída;&lt;br/&gt;24 - Devolvida / Declaração Cancelada;&lt;br/&gt;25 - Desembaraçada;&lt;br/&gt;26 - Em Seleção;&lt;br/&gt;27 - Em Fiscalização;&lt;br/&gt;28 - Cancelada;&lt;br/&gt;29 - Não Liberada;&lt;br/&gt;30 - Baixada - Presença de Carga em Outro Manifesto;&lt;br/&gt;31 - Baixada - Sem Presença de Carga;&lt;br/&gt;32 - Em Divergência por Abandono - Falta de Declaração;&lt;br/&gt;33 - Em Divergência por Abandono - Sem Pagamento;&lt;br/&gt;34 - Em Divergência por Abandono - Ocorrência Sem Resolução;&lt;br/&gt;35 - Devolvida;&lt;br/&gt;36 - Em Devolução / Declaração Cancelada;&lt;br/&gt;37 - Em Divergência de Manifesto;&lt;br/&gt;38 - Em Fiscalização por Revisão.
     *
     * @return listaSituacaoRemessa
     **/
    @JsonProperty("listaSituacaoRemessa")
    public List<Integer> getListaSituacaoRemessa() {
        return listaSituacaoRemessa;
    }

    public void setListaSituacaoRemessa(List<Integer> listaSituacaoRemessa) {
        this.listaSituacaoRemessa = listaSituacaoRemessa;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaSituacaoRemessa(List<Integer> listaSituacaoRemessa) {
        this.listaSituacaoRemessa = listaSituacaoRemessa;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaSituacaoRemessaItem(Integer listaSituacaoRemessaItem) {
        this.listaSituacaoRemessa.add(listaSituacaoRemessaItem);
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de inclusão da ocorrência.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimOcorrencia
     **/
    @JsonProperty("dataFimOcorrencia")
    public OffsetDateTime getDataFimOcorrencia() {
        return dataFimOcorrencia;
    }

    public void setDataFimOcorrencia(OffsetDateTime dataFimOcorrencia) {
        this.dataFimOcorrencia = dataFimOcorrencia;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataFimOcorrencia(OffsetDateTime dataFimOcorrencia) {
        this.dataFimOcorrencia = dataFimOcorrencia;
        return this;
    }

    /**
     * Lista de situação do lote. Cada item da lista contém:&lt;br/&gt;Situação do lote. Máximo de 2 caracteres numéricos. Domínio: &lt;br/&gt;5 - Seleção em andamento;&lt;br/&gt;6 - Seleção encerrada.&lt;br/&gt;5 - Seleção em andamento;&lt;br/&gt;6 - Seleção encerrada.
     *
     * @return listaSituacaoLote
     **/
    @JsonProperty("listaSituacaoLote")
    public List<Integer> getListaSituacaoLote() {
        return listaSituacaoLote;
    }

    public void setListaSituacaoLote(List<Integer> listaSituacaoLote) {
        this.listaSituacaoLote = listaSituacaoLote;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaSituacaoLote(List<Integer> listaSituacaoLote) {
        this.listaSituacaoLote = listaSituacaoLote;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaSituacaoLoteItem(Integer listaSituacaoLoteItem) {
        this.listaSituacaoLote.add(listaSituacaoLoteItem);
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de registro de manifesto.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimLote
     **/
    @JsonProperty("dataFimLote")
    public OffsetDateTime getDataFimLote() {
        return dataFimLote;
    }

    public void setDataFimLote(OffsetDateTime dataFimLote) {
        this.dataFimLote = dataFimLote;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataFimLote(OffsetDateTime dataFimLote) {
        this.dataFimLote = dataFimLote;
        return this;
    }

    /**
     * Data final relacionada ao filtro por período de registro de manifesto.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataFimManifesto
     **/
    @JsonProperty("dataFimManifesto")
    public OffsetDateTime getDataFimManifesto() {
        return dataFimManifesto;
    }

    public void setDataFimManifesto(OffsetDateTime dataFimManifesto) {
        this.dataFimManifesto = dataFimManifesto;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataFimManifesto(OffsetDateTime dataFimManifesto) {
        this.dataFimManifesto = dataFimManifesto;
        return this;
    }

    /**
     * Data inicial relacionada ao filtro por período de registro de lote.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioLote
     **/
    @JsonProperty("dataInicioLote")
    public OffsetDateTime getDataInicioLote() {
        return dataInicioLote;
    }

    public void setDataInicioLote(OffsetDateTime dataInicioLote) {
        this.dataInicioLote = dataInicioLote;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataInicioLote(OffsetDateTime dataInicioLote) {
        this.dataInicioLote = dataInicioLote;
        return this;
    }

    /**
     * Data inicial relacionada ao filtro por período de inclusão da ocorrência.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataInicioOcorrencia
     **/
    @JsonProperty("dataInicioOcorrencia")
    public OffsetDateTime getDataInicioOcorrencia() {
        return dataInicioOcorrencia;
    }

    public void setDataInicioOcorrencia(OffsetDateTime dataInicioOcorrencia) {
        this.dataInicioOcorrencia = dataInicioOcorrencia;
    }

    public ConsultaDeManifestosDosRgosAnuentes dataInicioOcorrencia(OffsetDateTime dataInicioOcorrencia) {
        this.dataInicioOcorrencia = dataInicioOcorrencia;
        return this;
    }

    /**
     * Lista de operadora. Cada item da lista contém:&lt;br/&gt;Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     *
     * @return listaOperadora
     **/
    @JsonProperty("listaOperadora")
    public List<String> getListaOperadora() {
        return listaOperadora;
    }

    public void setListaOperadora(List<String> listaOperadora) {
        this.listaOperadora = listaOperadora;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaOperadora(List<String> listaOperadora) {
        this.listaOperadora = listaOperadora;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaOperadoraItem(String listaOperadoraItem) {
        this.listaOperadora.add(listaOperadoraItem);
        return this;
    }

    /**
     * Lista de situação de ocorrência. Cada item da lista contém:&lt;br/&gt;Código da situação da ocorrência. Composto por até 2 caracteres numéricos.&lt;br/&gt;1 - Exigência em aberto - Todas;&lt;br/&gt;2 - Interrompida pela RFB;&lt;br/&gt;3 - Resolvida;&lt;br/&gt;4 - Sem ocorrência;&lt;br/&gt;5 - Não resolvida.
     *
     * @return listaSituacaoOcorrencia
     **/
    @JsonProperty("listaSituacaoOcorrencia")
    public List<Integer> getListaSituacaoOcorrencia() {
        return listaSituacaoOcorrencia;
    }

    public void setListaSituacaoOcorrencia(List<Integer> listaSituacaoOcorrencia) {
        this.listaSituacaoOcorrencia = listaSituacaoOcorrencia;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaSituacaoOcorrencia(List<Integer> listaSituacaoOcorrencia) {
        this.listaSituacaoOcorrencia = listaSituacaoOcorrencia;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaSituacaoOcorrenciaItem(Integer listaSituacaoOcorrenciaItem) {
        this.listaSituacaoOcorrencia.add(listaSituacaoOcorrenciaItem);
        return this;
    }

    /**
     * Lista de ID do órgão fiscalizador. Cada item da lista contém:&lt;br/&gt;Código do órgão (mneumônico) fiscalizador.  Máximo de 50 caracteres alfanuméricos.&lt;br/&gt;RFB;&lt;br/&gt;ANVISA;&lt;br/&gt;IBAMA;&lt;br/&gt;MAPA.
     *
     * @return listaOrgaoFiscalizacao
     **/
    @JsonProperty("listaOrgaoFiscalizacao")
    public List<String> getListaOrgaoFiscalizacao() {
        return listaOrgaoFiscalizacao;
    }

    public void setListaOrgaoFiscalizacao(List<String> listaOrgaoFiscalizacao) {
        this.listaOrgaoFiscalizacao = listaOrgaoFiscalizacao;
    }

    public ConsultaDeManifestosDosRgosAnuentes listaOrgaoFiscalizacao(List<String> listaOrgaoFiscalizacao) {
        this.listaOrgaoFiscalizacao = listaOrgaoFiscalizacao;
        return this;
    }

    public ConsultaDeManifestosDosRgosAnuentes addListaOrgaoFiscalizacaoItem(String listaOrgaoFiscalizacaoItem) {
        this.listaOrgaoFiscalizacao.add(listaOrgaoFiscalizacaoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaDeManifestosDosRgosAnuentes {\n" +
                "    listaUaDespacho: " + toIndentedString(listaUaDespacho) + "\n" +
                "    listaCodOcorrencia: " + toIndentedString(listaCodOcorrencia) + "\n" +
                "    dataFimAnexacao: " + toIndentedString(dataFimAnexacao) + "\n" +
                "    dataInicioManifesto: " + toIndentedString(dataInicioManifesto) + "\n" +
                "    dataInicioAnexacao: " + toIndentedString(dataInicioAnexacao) + "\n" +
                "    listaSituacaoRemessa: " + toIndentedString(listaSituacaoRemessa) + "\n" +
                "    dataFimOcorrencia: " + toIndentedString(dataFimOcorrencia) + "\n" +
                "    listaSituacaoLote: " + toIndentedString(listaSituacaoLote) + "\n" +
                "    dataFimLote: " + toIndentedString(dataFimLote) + "\n" +
                "    dataFimManifesto: " + toIndentedString(dataFimManifesto) + "\n" +
                "    dataInicioLote: " + toIndentedString(dataInicioLote) + "\n" +
                "    dataInicioOcorrencia: " + toIndentedString(dataInicioOcorrencia) + "\n" +
                "    listaOperadora: " + toIndentedString(listaOperadora) + "\n" +
                "    listaSituacaoOcorrencia: " + toIndentedString(listaSituacaoOcorrencia) + "\n" +
                "    listaOrgaoFiscalizacao: " + toIndentedString(listaOrgaoFiscalizacao) + "\n" +
                "}";
        return sb;
    }
}
