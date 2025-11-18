package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocoloDeEnvioDeDocumento", propOrder =
        {"dataHoraTransmissao", "numeroProtocolo"
        })

@XmlRootElement(name = "ProtocoloDeEnvioDeDocumento")
public class ProtocoloDeEnvioDeDocumento {

    @XmlElement(name = "dataHoraTransmissao", required = true)
    @ApiModelProperty(required = true, value = "Data e horário do transmissão.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data e horário do transmissão.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataHoraTransmissao = null;

    @XmlElement(name = "numeroProtocolo", required = true)
    @ApiModelProperty(required = true, value = "Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.")
    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     **/
    private String numeroProtocolo = null;

    /**
     * Data e horário do transmissão.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataHoraTransmissao
     **/
    @JsonProperty("dataHoraTransmissao")
    @NotNull
    public OffsetDateTime getDataHoraTransmissao() {
        return dataHoraTransmissao;
    }

    public void setDataHoraTransmissao(OffsetDateTime dataHoraTransmissao) {
        this.dataHoraTransmissao = dataHoraTransmissao;
    }

    public ProtocoloDeEnvioDeDocumento dataHoraTransmissao(OffsetDateTime dataHoraTransmissao) {
        this.dataHoraTransmissao = dataHoraTransmissao;
        return this;
    }

    /**
     * Número do protocolo composto por 36 caracteres alfanuméricos. Este campo é criado pelo sistema e deve ser usado para consulta do resultado.
     *
     * @return numeroProtocolo
     **/
    @JsonProperty("numeroProtocolo")
    @NotNull
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public ProtocoloDeEnvioDeDocumento numeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
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

    @Override
    public String toString() {

        String sb = "class ProtocoloDeEnvioDeDocumento {\n" +
                "    dataHoraTransmissao: " + toIndentedString(dataHoraTransmissao) + "\n" +
                "    numeroProtocolo: " + toIndentedString(numeroProtocolo) + "\n" +
                "}";
        return sb;
    }
}
