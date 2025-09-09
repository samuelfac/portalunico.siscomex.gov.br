package br.gov.siscomex.portalunico.dimp.model;

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
@XmlType(name = "DocumentoInstrutivoDoDespacho", propOrder =
        {"tipo", "palavrasChave"
        })

@XmlRootElement(name = "DocumentoInstrutivoDoDespacho")
public class DocumentoInstrutivoDoDespacho {

    @XmlElement(name = "tipo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo = null;

    @XmlElement(name = "palavrasChave")
    @ApiModelProperty(value = "Lista de palavras chave associadas ao documento instrutivo")
    @Valid
    /**
     * Lista de palavras chave associadas ao documento instrutivo
     **/
    private List<SefazPalavraChaveCover> palavrasChave = null;

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
     * Get tipo
     *
     * @return tipo
     **/
    @JsonProperty("tipo")
    public TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
        this.tipo = tipo;
    }

    public DocumentoInstrutivoDoDespacho tipo(TipoDeDocumentoObjetoCompostoPelosAtributosCdigoEDescrio tipo) {
        this.tipo = tipo;
        return this;
    }

    /**
     * Lista de palavras chave associadas ao documento instrutivo
     *
     * @return palavrasChave
     **/
    @JsonProperty("palavrasChave")
    public List<SefazPalavraChaveCover> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(List<SefazPalavraChaveCover> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public DocumentoInstrutivoDoDespacho palavrasChave(List<SefazPalavraChaveCover> palavrasChave) {
        this.palavrasChave = palavrasChave;
        return this;
    }

    public DocumentoInstrutivoDoDespacho addPalavrasChaveItem(SefazPalavraChaveCover palavrasChaveItem) {
        this.palavrasChave.add(palavrasChaveItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoInstrutivoDoDespacho {\n" +
                "    tipo: " + toIndentedString(tipo) + "\n" +
                "    palavrasChave: " + toIndentedString(palavrasChave) + "\n" +
                "}";
        return sb;
    }
}
