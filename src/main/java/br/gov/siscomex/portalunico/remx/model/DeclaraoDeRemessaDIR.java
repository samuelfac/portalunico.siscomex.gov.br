package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclaraoDeRemessaDIR", propOrder =
        {"dataHoraEncerramentoLote", "dataRegistro", "identificadorLote", "numeroDeclaracao", "numeroLote", "versaoDIR"
        })

@XmlRootElement(name = "DeclaraoDeRemessaDIR")
public class DeclaraoDeRemessaDIR {

    @XmlElement(name = "dataHoraEncerramentoLote")
    @ApiModelProperty(value = "Data e horário do encerramento de seleção do lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do encerramento de seleção do lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraEncerramentoLote = null;

    @XmlElement(name = "dataRegistro")
    @ApiModelProperty(value = "Data e horário do registro do lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do registro do lote.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataRegistro = null;

    @XmlElement(name = "identificadorLote")
    @ApiModelProperty(value = "Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Contém o identificador do lote.  Máximo de 255 caracteres, que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String identificadorLote = null;

    @XmlElement(name = "numeroDeclaracao")
    @ApiModelProperty(value = "Número da DIR. O número da DIR é composto por 12 caracteres numéricos.")
    /**
     * Número da DIR. O número da DIR é composto por 12 caracteres numéricos.
     **/
    private String numeroDeclaracao = null;

    @XmlElement(name = "numeroLote")
    @ApiModelProperty(value = "Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.")
    /**
     * Número do lote composto por 16 caracteres alfanuméricos. Este campo é criado pelo sistema quando é feito o registro do lote de declaração.
     **/
    private String numeroLote = null;

    @XmlElement(name = "versaoDIR")
    @ApiModelProperty(value = "Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).")
    /**
     * Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).
     **/
    private String versaoDIR = null;

    /**
     * Data e horário do encerramento de seleção do lote.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHoraEncerramentoLote
     **/
    @JsonProperty("dataHoraEncerramentoLote")
    public OffsetDateTime getDataHoraEncerramentoLote() {
        return dataHoraEncerramentoLote;
    }

    public void setDataHoraEncerramentoLote(OffsetDateTime dataHoraEncerramentoLote) {
        this.dataHoraEncerramentoLote = dataHoraEncerramentoLote;
    }

    public DeclaraoDeRemessaDIR dataHoraEncerramentoLote(OffsetDateTime dataHoraEncerramentoLote) {
        this.dataHoraEncerramentoLote = dataHoraEncerramentoLote;
        return this;
    }

    /**
     * Data e horário do registro do lote.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataRegistro
     **/
    @JsonProperty("dataRegistro")
    public OffsetDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public DeclaraoDeRemessaDIR dataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
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

    public DeclaraoDeRemessaDIR identificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
        return this;
    }

    /**
     * Número da DIR. O número da DIR é composto por 12 caracteres numéricos.
     *
     * @return numeroDeclaracao
     **/
    @JsonProperty("numeroDeclaracao")
    public String getNumeroDeclaracao() {
        return numeroDeclaracao;
    }

    public void setNumeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
    }

    public DeclaraoDeRemessaDIR numeroDeclaracao(String numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
        return this;
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

    public DeclaraoDeRemessaDIR numeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
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

    public DeclaraoDeRemessaDIR versaoDIR(String versaoDIR) {
        this.versaoDIR = versaoDIR;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DeclaraoDeRemessaDIR {\n" +
                "    dataHoraEncerramentoLote: " + toIndentedString(dataHoraEncerramentoLote) + "\n" +
                "    dataRegistro: " + toIndentedString(dataRegistro) + "\n" +
                "    identificadorLote: " + toIndentedString(identificadorLote) + "\n" +
                "    numeroDeclaracao: " + toIndentedString(numeroDeclaracao) + "\n" +
                "    numeroLote: " + toIndentedString(numeroLote) + "\n" +
                "    versaoDIR: " + toIndentedString(versaoDIR) + "\n" +
                "}";
        return sb;
    }
}
