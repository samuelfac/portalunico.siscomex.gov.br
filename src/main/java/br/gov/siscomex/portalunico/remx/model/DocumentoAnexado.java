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
@XmlType(name = "DocumentoAnexado", propOrder =
        {"dataUltimaAnexacao", "documentoAnexado"
        })

@XmlRootElement(name = "DocumentoAnexado")
public class DocumentoAnexado {

    @XmlElement(name = "dataUltimaAnexacao")
    @ApiModelProperty(value = "Data da última atualização do Dossiê.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS")
    /**
     * Data da última atualização do Dossiê.<br/>Formato: yyyy-MM-dd'T'HH:mm:ss.SSS
     **/
    private OffsetDateTime dataUltimaAnexacao = null;

    @XmlElement(name = "documentoAnexado")
    @ApiModelProperty(value = "Indica se a remessa tem documento anexado ou não.")
    /**
     * Indica se a remessa tem documento anexado ou não.
     **/
    private String documentoAnexado = null;

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
     * Data da última atualização do Dossiê.&lt;br/&gt;Formato: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS
     *
     * @return dataUltimaAnexacao
     **/
    @JsonProperty("dataUltimaAnexacao")
    public OffsetDateTime getDataUltimaAnexacao() {
        return dataUltimaAnexacao;
    }

    public void setDataUltimaAnexacao(OffsetDateTime dataUltimaAnexacao) {
        this.dataUltimaAnexacao = dataUltimaAnexacao;
    }

    public DocumentoAnexado dataUltimaAnexacao(OffsetDateTime dataUltimaAnexacao) {
        this.dataUltimaAnexacao = dataUltimaAnexacao;
        return this;
    }

    /**
     * Indica se a remessa tem documento anexado ou não.
     *
     * @return documentoAnexado
     **/
    @JsonProperty("documentoAnexado")
    public String getDocumentoAnexado() {
        return documentoAnexado;
    }

    public void setDocumentoAnexado(String documentoAnexado) {
        this.documentoAnexado = documentoAnexado;
    }

    public DocumentoAnexado documentoAnexado(String documentoAnexado) {
        this.documentoAnexado = documentoAnexado;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoAnexado {\n" +
                "    dataUltimaAnexacao: " + toIndentedString(dataUltimaAnexacao) + "\n" +
                "    documentoAnexado: " + toIndentedString(documentoAnexado) + "\n" +
                "}";
        return sb;
    }
}
