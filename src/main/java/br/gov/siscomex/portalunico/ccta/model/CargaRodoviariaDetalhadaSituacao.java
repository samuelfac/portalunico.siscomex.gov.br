package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargaRodoviariaDetalhadaSituacao", propOrder =
        {"documentoSaida", "itensEstoque"
        })

@XmlRootElement(name = "CargaRodoviariaDetalhadaSituacao")
public class CargaRodoviariaDetalhadaSituacao {

    @XmlElement(name = "documentoSaida")
    @ApiModelProperty(value = "")
    @Valid
    private List<DocumentoSaida> documentoSaida = null;

    @XmlElement(name = "itensEstoque")
    @ApiModelProperty(value = "")
    @Valid
    private List<CargaRodoviariaEstoque> itensEstoque = null;

    /**
     * Get documentoSaida
     *
     * @return documentoSaida
     **/
    @JsonProperty("documentoSaida")
    public List<DocumentoSaida> getDocumentoSaida() {
        return documentoSaida;
    }

    public void setDocumentoSaida(List<DocumentoSaida> documentoSaida) {
        this.documentoSaida = documentoSaida;
    }

    public CargaRodoviariaDetalhadaSituacao documentoSaida(List<DocumentoSaida> documentoSaida) {
        this.documentoSaida = documentoSaida;
        return this;
    }

    public CargaRodoviariaDetalhadaSituacao addDocumentoSaidaItem(DocumentoSaida documentoSaidaItem) {
        this.documentoSaida.add(documentoSaidaItem);
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
     * Get itensEstoque
     *
     * @return itensEstoque
     **/
    @JsonProperty("itensEstoque")
    public List<CargaRodoviariaEstoque> getItensEstoque() {
        return itensEstoque;
    }

    public void setItensEstoque(List<CargaRodoviariaEstoque> itensEstoque) {
        this.itensEstoque = itensEstoque;
    }

    public CargaRodoviariaDetalhadaSituacao itensEstoque(List<CargaRodoviariaEstoque> itensEstoque) {
        this.itensEstoque = itensEstoque;
        return this;
    }

    public CargaRodoviariaDetalhadaSituacao addItensEstoqueItem(CargaRodoviariaEstoque itensEstoqueItem) {
        this.itensEstoque.add(itensEstoqueItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CargaRodoviariaDetalhadaSituacao {\n" +
                "    documentoSaida: " + toIndentedString(documentoSaida) + "\n" +
                "    itensEstoque: " + toIndentedString(itensEstoque) + "\n" +
                "}";
        return sb;
    }
}
