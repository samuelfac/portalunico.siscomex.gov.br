package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemessaDaSolicitaoDeDevoluo", propOrder =
        {"numeroRemessa", "observacao", "dtDocExportacao", "numeroDocumentoExportacao", "codigoMotivoDevolucao"
        })

@XmlRootElement(name = "RemessaDaSolicitaoDeDevoluo")
public class RemessaDaSolicitaoDeDevoluo {

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(example = "1059756472772322", required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "observacao")
    @ApiModelProperty(value = "Observação relacionada ao processo de devolução. Máximo de 500 caracteres,que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Observação relacionada ao processo de devolução. Máximo de 500 caracteres,que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String observacao = null;

    @XmlElement(name = "dtDocExportacao", required = true)
    @ApiModelProperty(required = true, value = "Data relacionada ao documento de exportação. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data relacionada ao documento de exportação. <br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dtDocExportacao = null;

    @XmlElement(name = "numeroDocumentoExportacao", required = true)
    @ApiModelProperty(required = true, value = "Número do documento de exportação. Máximo de 18 caracteres alfanuméricos.")
    /**
     * Número do documento de exportação. Máximo de 18 caracteres alfanuméricos.
     **/
    private String numeroDocumentoExportacao = null;

    @XmlElement(name = "codigoMotivoDevolucao", required = true)
    @ApiModelProperty(required = true, value = "Código do motivo da solicitação de devolução. No máximo 3 dígitos.")
    /**
     * Código do motivo da solicitação de devolução. No máximo 3 dígitos.
     **/
    private String codigoMotivoDevolucao = null;

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
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public RemessaDaSolicitaoDeDevoluo numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Observação relacionada ao processo de devolução. Máximo de 500 caracteres,que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return observacao
     **/
    @JsonProperty("observacao")
    @Size(min = 1, max = 500)
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public RemessaDaSolicitaoDeDevoluo observacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    /**
     * Data relacionada ao documento de exportação. &lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dtDocExportacao
     **/
    @JsonProperty("dtDocExportacao")
    @NotNull
    public OffsetDateTime getDtDocExportacao() {
        return dtDocExportacao;
    }

    public void setDtDocExportacao(OffsetDateTime dtDocExportacao) {
        this.dtDocExportacao = dtDocExportacao;
    }

    public RemessaDaSolicitaoDeDevoluo dtDocExportacao(OffsetDateTime dtDocExportacao) {
        this.dtDocExportacao = dtDocExportacao;
        return this;
    }

    /**
     * Número do documento de exportação. Máximo de 18 caracteres alfanuméricos.
     *
     * @return numeroDocumentoExportacao
     **/
    @JsonProperty("numeroDocumentoExportacao")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroDocumentoExportacao() {
        return numeroDocumentoExportacao;
    }

    public void setNumeroDocumentoExportacao(String numeroDocumentoExportacao) {
        this.numeroDocumentoExportacao = numeroDocumentoExportacao;
    }

    public RemessaDaSolicitaoDeDevoluo numeroDocumentoExportacao(String numeroDocumentoExportacao) {
        this.numeroDocumentoExportacao = numeroDocumentoExportacao;
        return this;
    }

    /**
     * Código do motivo da solicitação de devolução. No máximo 3 dígitos.
     *
     * @return codigoMotivoDevolucao
     **/
    @JsonProperty("codigoMotivoDevolucao")
    @NotNull
    @Size(min = 1, max = 3)
    public String getCodigoMotivoDevolucao() {
        return codigoMotivoDevolucao;
    }

    public void setCodigoMotivoDevolucao(String codigoMotivoDevolucao) {
        this.codigoMotivoDevolucao = codigoMotivoDevolucao;
    }

    public RemessaDaSolicitaoDeDevoluo codigoMotivoDevolucao(String codigoMotivoDevolucao) {
        this.codigoMotivoDevolucao = codigoMotivoDevolucao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RemessaDaSolicitaoDeDevoluo {\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    observacao: " + toIndentedString(observacao) + "\n" +
                "    dtDocExportacao: " + toIndentedString(dtDocExportacao) + "\n" +
                "    numeroDocumentoExportacao: " + toIndentedString(numeroDocumentoExportacao) + "\n" +
                "    codigoMotivoDevolucao: " + toIndentedString(codigoMotivoDevolucao) + "\n" +
                "}";
        return sb;
    }
}
