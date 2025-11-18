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
@XmlType(name = "LoteDaConsultaDeLotesPelaRFB", propOrder =
        {"dataHorarioRegistroLote", "identificadorLote", "listaNumeroRemessa", "numeroLote", "operadora", "qtdRemessas", "qtdRemessasSelecionadas", "situacaoLote", "uaDespacho"
        })

@XmlRootElement(name = "LoteDaConsultaDeLotesPelaRFB")
public class LoteDaConsultaDeLotesPelaRFB {

    @XmlElement(name = "dataHorarioRegistroLote")
    @ApiModelProperty(value = "Data e horário do registro do lote de declarações.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do lote de declarações.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHorarioRegistroLote = null;

    @XmlElement(name = "identificadorLote")
    @ApiModelProperty(value = "Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String identificadorLote = null;

    @XmlElement(name = "listaNumeroRemessa")
    @ApiModelProperty(value = "Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Lista de números de remessas. Cada item da lista contém: <br/>Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private List<String> listaNumeroRemessa = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "operadora")
    @ApiModelProperty(value = "Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.")
    /**
     * Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     **/
    private String operadora = null;

    @XmlElement(name = "qtdRemessas")
    @ApiModelProperty(value = "Quantidade de remessas do lote. Composto por 5 caracteres numéricos.")
    /**
     * Quantidade de remessas do lote. Composto por 5 caracteres numéricos.
     **/
    private Integer qtdRemessas = null;

    @XmlElement(name = "qtdRemessasSelecionadas")
    @ApiModelProperty(value = "Quantidade de remessas selecionadas. Número entre 0000 e 9999.")
    /**
     * Quantidade de remessas selecionadas. Número entre 0000 e 9999.
     **/
    private Integer qtdRemessasSelecionadas = null;

    @XmlElement(name = "situacaoLote")
    @ApiModelProperty(value = "Situação do lote. Máximo de 2 caracteres numéricos. Domínio: <br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.")
    /**
     * Situação do lote. Máximo de 2 caracteres numéricos. Domínio: <br/>5 - Seleção em andamento;<br/>6 - Seleção encerrada.
     **/
    private String situacaoLote = null;

    @XmlElement(name = "uaDespacho")
    @ApiModelProperty(value = "Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.")
    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     **/
    private String uaDespacho = null;

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
     * Data e horário do registro do lote de declarações.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHorarioRegistroLote
     **/
    @JsonProperty("dataHorarioRegistroLote")
    public OffsetDateTime getDataHorarioRegistroLote() {
        return dataHorarioRegistroLote;
    }

    public void setDataHorarioRegistroLote(OffsetDateTime dataHorarioRegistroLote) {
        this.dataHorarioRegistroLote = dataHorarioRegistroLote;
    }

    /**
     * Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return identificadorLote
     **/
    @JsonProperty("identificadorLote")
    public String getIdentificadorLote() {
        return identificadorLote;
    }

    public void setIdentificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
    }

    public LoteDaConsultaDeLotesPelaRFB identificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
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

    public LoteDaConsultaDeLotesPelaRFB listaNumeroRemessa(List<String> listaNumeroRemessa) {
        this.listaNumeroRemessa = listaNumeroRemessa;
        return this;
    }

    public LoteDaConsultaDeLotesPelaRFB addListaNumeroRemessaItem(String listaNumeroRemessaItem) {
        this.listaNumeroRemessa.add(listaNumeroRemessaItem);
        return this;
    }

    public LoteDaConsultaDeLotesPelaRFB dataHorarioRegistroLote(OffsetDateTime dataHorarioRegistroLote) {
        this.dataHorarioRegistroLote = dataHorarioRegistroLote;
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

    /**
     * Código da empresa operadora de remessa (mneumônico). Composto por 3 caracteres alfanuméricos. Valores de acordo com a tabela de domínio.
     *
     * @return operadora
     **/
    @JsonProperty("operadora")
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public LoteDaConsultaDeLotesPelaRFB operadora(String operadora) {
        this.operadora = operadora;
        return this;
    }

    /**
     * Quantidade de remessas do lote. Composto por 5 caracteres numéricos.
     *
     * @return qtdRemessas
     **/
    @JsonProperty("qtdRemessas")
    public Integer getQtdRemessas() {
        return qtdRemessas;
    }

    public void setQtdRemessas(Integer qtdRemessas) {
        this.qtdRemessas = qtdRemessas;
    }

    public LoteDaConsultaDeLotesPelaRFB qtdRemessas(Integer qtdRemessas) {
        this.qtdRemessas = qtdRemessas;
        return this;
    }

    public LoteDaConsultaDeLotesPelaRFB numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
        return this;
    }

    /**
     * Quantidade de remessas selecionadas. Número entre 0000 e 9999.
     *
     * @return qtdRemessasSelecionadas
     **/
    @JsonProperty("qtdRemessasSelecionadas")
    public Integer getQtdRemessasSelecionadas() {
        return qtdRemessasSelecionadas;
    }

    public void setQtdRemessasSelecionadas(Integer qtdRemessasSelecionadas) {
        this.qtdRemessasSelecionadas = qtdRemessasSelecionadas;
    }

    public LoteDaConsultaDeLotesPelaRFB qtdRemessasSelecionadas(Integer qtdRemessasSelecionadas) {
        this.qtdRemessasSelecionadas = qtdRemessasSelecionadas;
        return this;
    }

    /**
     * Situação do lote. Máximo de 2 caracteres numéricos. Domínio: &lt;br/&gt;5 - Seleção em andamento;&lt;br/&gt;6 - Seleção encerrada.
     *
     * @return situacaoLote
     **/
    @JsonProperty("situacaoLote")
    public String getSituacaoLote() {
        return situacaoLote;
    }

    public void setSituacaoLote(String situacaoLote) {
        this.situacaoLote = situacaoLote;
    }

    public LoteDaConsultaDeLotesPelaRFB situacaoLote(String situacaoLote) {
        this.situacaoLote = situacaoLote;
        return this;
    }

    /**
     * Código da unidade administrativa de despacho da carga. Composto por 7 caracteres numéricos. Valores de acordo com a tabela de domínio.
     *
     * @return uaDespacho
     **/
    @JsonProperty("uaDespacho")
    public String getUaDespacho() {
        return uaDespacho;
    }

    public void setUaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
    }

    public LoteDaConsultaDeLotesPelaRFB uaDespacho(String uaDespacho) {
        this.uaDespacho = uaDespacho;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class LoteDaConsultaDeLotesPelaRFB {\n" +
                "    dataHorarioRegistroLote: " + toIndentedString(dataHorarioRegistroLote) + "\n" +
                "    identificadorLote: " + toIndentedString(identificadorLote) + "\n" +
                "    listaNumeroRemessa: " + toIndentedString(listaNumeroRemessa) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    operadora: " + toIndentedString(operadora) + "\n" +
                "    qtdRemessas: " + toIndentedString(qtdRemessas) + "\n" +
                "    qtdRemessasSelecionadas: " + toIndentedString(qtdRemessasSelecionadas) + "\n" +
                "    situacaoLote: " + toIndentedString(situacaoLote) + "\n" +
                "    uaDespacho: " + toIndentedString(uaDespacho) + "\n" +
                "}";
        return sb;
    }
}
