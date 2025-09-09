package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDeRemessasDaRFB", propOrder =
        {"historicoOperacional", "versaoDIR", "listaCodOcorrencia", "numeroLote", "numeroManifesto", "listaNumeroRemessa", "listaSituacaoFiscalizacao", "listaSituacaoRemessa", "listaSituacaoOcorrencia", "listaOrgaoFiscalizacao"
        })

@XmlRootElement(name = "ConsultaDeRemessasDaRFB")
public class ConsultaDeRemessasDaRFB {

    @XmlElement(name = "historicoOperacional")
    @ApiModelProperty(value = "Indica se o resultado da consulta conterá o histórico operacional. Composto por 1 caractere alfanumérico. Quando não houver preenchimento deste atributo, o sistema assume o valor 'N'.<br/>S;<br/>N.")
    /**
     * Indica se o resultado da consulta conterá o histórico operacional. Composto por 1 caractere alfanumérico. Quando não houver preenchimento deste atributo, o sistema assume o valor 'N'.<br/>S;<br/>N.
     **/
    private String historicoOperacional = null;

    @XmlElement(name = "versaoDIR")
    @ApiModelProperty(value = "Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).")
    /**
     * Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).
     **/
    private String versaoDIR = null;

    @XmlElement(name = "listaCodOcorrencia")
    @ApiModelProperty(value = "Lista de código de ocorrência. Cada item da lista contém:<br/>Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.")
    /**
     * Lista de código de ocorrência. Cada item da lista contém:<br/>Código da ocorrência. O código da ocorrência é composto por 3 caracteres numéricos.
     **/
    private List<Integer> listaCodOcorrencia = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "numeroManifesto")
    @ApiModelProperty(value = "Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.")
    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     **/
    private String numeroManifesto = null;

    @XmlElement(name = "listaNumeroRemessa")
    @ApiModelProperty(value = "Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private List<String> listaNumeroRemessa = null;

    @XmlElement(name = "listaSituacaoFiscalizacao")
    @ApiModelProperty(value = "Lista de situação de fiscalização. Cada item da lista contém:<br/>Código da situação da fiscalização. Composto por até 2 caracteres numéricos.<br/>1 - Liberada;<br/>2 - Não Liberada;<br/>3 - Em Fiscalização;<br/>4 - Encerrada;<br/>5 - Fiscalização Interrompida;<br/>6 - Selecionada;<br/>7 - Fiscalização Suspensa;<br/>8 - Em Fiscalização - Verificação Física Requisitada;<br/>9 - Em Fiscalização - Verificação Física Realizada;<br/>10 - Sem Fiscalização.")
    /**
     * Lista de situação de fiscalização. Cada item da lista contém:<br/>Código da situação da fiscalização. Composto por até 2 caracteres numéricos.<br/>1 - Liberada;<br/>2 - Não Liberada;<br/>3 - Em Fiscalização;<br/>4 - Encerrada;<br/>5 - Fiscalização Interrompida;<br/>6 - Selecionada;<br/>7 - Fiscalização Suspensa;<br/>8 - Em Fiscalização - Verificação Física Requisitada;<br/>9 - Em Fiscalização - Verificação Física Realizada;<br/>10 - Sem Fiscalização.
     **/
    private List<Integer> listaSituacaoFiscalizacao = null;

    @XmlElement(name = "listaSituacaoRemessa")
    @ApiModelProperty(value = "Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.")
    /**
     * Lista de situação de remessa. Cada item da lista contém:<br/>Código da situação da remessa. O código da situação é composto por 2 dígitos.<br/>18 - Manifestada;<br/>19 - Liberada;<br/>20 - Descaracterizada / Declaração Cancelada;<br/>21 - Em Perdimento;<br/>22 - Abandonada;<br/>23 - Destruída;<br/>24 - Devolvida / Declaração Cancelada;<br/>25 - Desembaraçada;<br/>26 - Em Seleção;<br/>27 - Em Fiscalização;<br/>28 - Cancelada;<br/>29 - Não Liberada;<br/>30 - Baixada - Presença de Carga em Outro Manifesto;<br/>31 - Baixada - Sem Presença de Carga;<br/>32 - Em Divergência por Abandono - Falta de Declaração;<br/>33 - Em Divergência por Abandono - Sem Pagamento;<br/>34 - Em Divergência por Abandono - Ocorrência Sem Resolução;<br/>35 - Devolvida;<br/>36 - Em Devolução / Declaração Cancelada;<br/>37 - Em Divergência de Manifesto;<br/>38 - Em Fiscalização por Revisão.
     **/
    private List<Integer> listaSituacaoRemessa = null;

    @XmlElement(name = "listaSituacaoOcorrencia")
    @ApiModelProperty(value = "Lista de situação de ocorrência. Cada item da lista contém:<br/>Código da situação da ocorrência. Composto por até 2 caracteres numéricos.<br/>1 - Exigência em aberto - Todas;<br/>2 - Interrompida pela RFB;<br/>3 - Resolvida;<br/>4 - Sem ocorrência;<br/>5 - Não resolvida;<br/>6 - Exigência em aberto - RCV - Retenção para comprovação de valor;<br/>7 - Exigência em aberto - RPE - Retenção para esclarecimentos;<br/>8 - Verificação física requisitada;<br/>9 - Verificação física realizada.")
    /**
     * Lista de situação de ocorrência. Cada item da lista contém:<br/>Código da situação da ocorrência. Composto por até 2 caracteres numéricos.<br/>1 - Exigência em aberto - Todas;<br/>2 - Interrompida pela RFB;<br/>3 - Resolvida;<br/>4 - Sem ocorrência;<br/>5 - Não resolvida;<br/>6 - Exigência em aberto - RCV - Retenção para comprovação de valor;<br/>7 - Exigência em aberto - RPE - Retenção para esclarecimentos;<br/>8 - Verificação física requisitada;<br/>9 - Verificação física realizada.
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
     * Indica se o resultado da consulta conterá o histórico operacional. Composto por 1 caractere alfanumérico. Quando não houver preenchimento deste atributo, o sistema assume o valor &#39;N&#39;.&lt;br/&gt;S;&lt;br/&gt;N.
     *
     * @return historicoOperacional
     **/
    @JsonProperty("historicoOperacional")
    public String getHistoricoOperacional() {
        return historicoOperacional;
    }

    public void setHistoricoOperacional(String historicoOperacional) {
        this.historicoOperacional = historicoOperacional;
    }

    public ConsultaDeRemessasDaRFB historicoOperacional(String historicoOperacional) {
        this.historicoOperacional = historicoOperacional;
        return this;
    }

    /**
     * Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).
     *
     * @return versaoDIR
     **/
    @JsonProperty("versaoDIR")
    public String getVersaoDIR() {
        return versaoDIR;
    }

    public void setVersaoDIR(String versaoDIR) {
        this.versaoDIR = versaoDIR;
    }

    public ConsultaDeRemessasDaRFB versaoDIR(String versaoDIR) {
        this.versaoDIR = versaoDIR;
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

    public ConsultaDeRemessasDaRFB listaCodOcorrencia(List<Integer> listaCodOcorrencia) {
        this.listaCodOcorrencia = listaCodOcorrencia;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaCodOcorrenciaItem(Integer listaCodOcorrenciaItem) {
        this.listaCodOcorrencia.add(listaCodOcorrenciaItem);
        return this;
    }

    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     *
     * @return numeroLote
     **/
    @JsonProperty("numeroLote")
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public ConsultaDeRemessasDaRFB numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Número do manifesto composto por 15 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do manifesto de carga para modalidade expressa ou registro do lote de declaração para modalidade postal.
     *
     * @return numeroManifesto
     **/
    @JsonProperty("numeroManifesto")
    public String getNumeroManifesto() {
        return numeroManifesto;
    }

    public void setNumeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
    }

    public ConsultaDeRemessasDaRFB numeroManifesto(String numeroManifesto) {
        this.numeroManifesto = numeroManifesto;
        return this;
    }

    /**
     * Lista de números de remessas. Cada item da lista contém: &lt;br/&gt;Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return listaNumeroRemessa
     **/
    @JsonProperty("listaNumeroRemessa")
    public List<String> getListaNumeroRemessa() {
        return listaNumeroRemessa;
    }

    public void setListaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
    }

    public ConsultaDeRemessasDaRFB listaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaNumeroRemessaItem(String listaNumeroRemessaItem) {
        this.listaNumeroRemessa.add(listaNumeroRemessaItem);
        return this;
    }

    /**
     * Lista de situação de fiscalização. Cada item da lista contém:&lt;br/&gt;Código da situação da fiscalização. Composto por até 2 caracteres numéricos.&lt;br/&gt;1 - Liberada;&lt;br/&gt;2 - Não Liberada;&lt;br/&gt;3 - Em Fiscalização;&lt;br/&gt;4 - Encerrada;&lt;br/&gt;5 - Fiscalização Interrompida;&lt;br/&gt;6 - Selecionada;&lt;br/&gt;7 - Fiscalização Suspensa;&lt;br/&gt;8 - Em Fiscalização - Verificação Física Requisitada;&lt;br/&gt;9 - Em Fiscalização - Verificação Física Realizada;&lt;br/&gt;10 - Sem Fiscalização.
     *
     * @return listaSituacaoFiscalizacao
     **/
    @JsonProperty("listaSituacaoFiscalizacao")
    public List<Integer> getListaSituacaoFiscalizacao() {
        return listaSituacaoFiscalizacao;
    }

    public void setListaSituacaoFiscalizacao(List<Integer> listaSituacaoFiscalizacao) {
        this.listaSituacaoFiscalizacao = listaSituacaoFiscalizacao;
    }

    public ConsultaDeRemessasDaRFB listaSituacaoFiscalizacao(List<Integer> listaSituacaoFiscalizacao) {
        this.listaSituacaoFiscalizacao = listaSituacaoFiscalizacao;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaSituacaoFiscalizacaoItem(Integer listaSituacaoFiscalizacaoItem) {
        this.listaSituacaoFiscalizacao.add(listaSituacaoFiscalizacaoItem);
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

    public ConsultaDeRemessasDaRFB listaSituacaoRemessa(List<Integer> listaSituacaoRemessa) {
        this.listaSituacaoRemessa = listaSituacaoRemessa;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaSituacaoRemessaItem(Integer listaSituacaoRemessaItem) {
        this.listaSituacaoRemessa.add(listaSituacaoRemessaItem);
        return this;
    }

    /**
     * Lista de situação de ocorrência. Cada item da lista contém:&lt;br/&gt;Código da situação da ocorrência. Composto por até 2 caracteres numéricos.&lt;br/&gt;1 - Exigência em aberto - Todas;&lt;br/&gt;2 - Interrompida pela RFB;&lt;br/&gt;3 - Resolvida;&lt;br/&gt;4 - Sem ocorrência;&lt;br/&gt;5 - Não resolvida;&lt;br/&gt;6 - Exigência em aberto - RCV - Retenção para comprovação de valor;&lt;br/&gt;7 - Exigência em aberto - RPE - Retenção para esclarecimentos;&lt;br/&gt;8 - Verificação física requisitada;&lt;br/&gt;9 - Verificação física realizada.
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

    public ConsultaDeRemessasDaRFB listaSituacaoOcorrencia(List<Integer> listaSituacaoOcorrencia) {
        this.listaSituacaoOcorrencia = listaSituacaoOcorrencia;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaSituacaoOcorrenciaItem(Integer listaSituacaoOcorrenciaItem) {
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

    public ConsultaDeRemessasDaRFB listaOrgaoFiscalizacao(List<String> listaOrgaoFiscalizacao) {
        this.listaOrgaoFiscalizacao = listaOrgaoFiscalizacao;
        return this;
    }

    public ConsultaDeRemessasDaRFB addListaOrgaoFiscalizacaoItem(String listaOrgaoFiscalizacaoItem) {
        this.listaOrgaoFiscalizacao.add(listaOrgaoFiscalizacaoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ConsultaDeRemessasDaRFB {\n" +
                "    historicoOperacional: " + toIndentedString(historicoOperacional) + "\n" +
                "    versaoDIR: " + toIndentedString(versaoDIR) + "\n" +
                "    listaCodOcorrencia: " + toIndentedString(listaCodOcorrencia) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    numeroManifesto: " + toIndentedString(numeroManifesto) + "\n" +
                "    listaNumeroRemessa: " + toIndentedString(listaNumeroRemessa) + "\n" +
                "    listaSituacaoFiscalizacao: " + toIndentedString(listaSituacaoFiscalizacao) + "\n" +
                "    listaSituacaoRemessa: " + toIndentedString(listaSituacaoRemessa) + "\n" +
                "    listaSituacaoOcorrencia: " + toIndentedString(listaSituacaoOcorrencia) + "\n" +
                "    listaOrgaoFiscalizacao: " + toIndentedString(listaOrgaoFiscalizacao) + "\n" +
                "}";
        return sb;
    }
}
