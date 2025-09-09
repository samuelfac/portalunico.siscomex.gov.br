package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentosAnexo", propOrder =
        {"documentoAnexo"
        })

@XmlRootElement(name = "DocumentosAnexo")
/**
 * Documentos em Anexo
 **/
@ApiModel(description = "Documentos em Anexo")
public class DocumentosAnexo {

    @XmlElement(name = "documentoAnexo")
    @ApiModelProperty(value = "Documentos em Passagem")
    @Valid
    /**
     * Documentos em Passagem
     **/
    private List<DocumentoAnexo> documentoAnexo = null;

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
     * Documentos em Passagem
     *
     * @return documentoAnexo
     **/
    @JsonProperty("documentoAnexo")
    public List<DocumentoAnexo> getDocumentoAnexo() {
        return documentoAnexo;
    }

    public void setDocumentoAnexo(List<DocumentoAnexo> documentoAnexo) {
        this.documentoAnexo = documentoAnexo;
    }

    public DocumentosAnexo documentoAnexo(List<DocumentoAnexo> documentoAnexo) {
        this.documentoAnexo = documentoAnexo;
        return this;
    }

    public DocumentosAnexo addDocumentoAnexoItem(DocumentoAnexo documentoAnexoItem) {
        this.documentoAnexo.add(documentoAnexoItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentosAnexo {\n" +
                "    documentoAnexo: " + toIndentedString(documentoAnexo) + "\n" +
                "}";
        return sb;
    }
}
