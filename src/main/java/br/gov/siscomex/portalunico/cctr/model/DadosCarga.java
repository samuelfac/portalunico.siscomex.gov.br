package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCarga", propOrder =
        {"documentos", "conteiner"
        })

@XmlRootElement(name = "DadosCarga")
/**
 * Dados das cargas Manifestadas
 **/
@ApiModel(description = "Dados das cargas Manifestadas")
public class DadosCarga {

    @XmlElement(name = "documentos", required = true)
    @ApiModelProperty(required = true, value = "Lista das cargas do tipo solta e granel")
    @Valid
    /**
     * Lista das cargas do tipo solta e granel
     **/
    private List<DocumentoCarga> documentos = new ArrayList<>();

    @XmlElement(name = "conteiner", required = true)
    @ApiModelProperty(required = true, value = "Lista dos contêineres")
    @Valid
    /**
     * Lista dos contêineres
     **/
    private List<Conteiner> conteiner = new ArrayList<>();

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
     * Lista das cargas do tipo solta e granel
     *
     * @return documentos
     **/
    @JsonProperty("documentos")
    @NotNull
    public List<DocumentoCarga> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoCarga> documentos) {
        this.documentos = documentos;
    }

    public DadosCarga documentos(List<DocumentoCarga> documentos) {
        this.documentos = documentos;
        return this;
    }

    public DadosCarga addDocumentosItem(DocumentoCarga documentosItem) {
        this.documentos.add(documentosItem);
        return this;
    }

    /**
     * Lista dos contêineres
     *
     * @return conteiner
     **/
    @JsonProperty("conteiner")
    @NotNull
    public List<Conteiner> getConteiner() {
        return conteiner;
    }

    public void setConteiner(List<Conteiner> conteiner) {
        this.conteiner = conteiner;
    }

    public DadosCarga conteiner(List<Conteiner> conteiner) {
        this.conteiner = conteiner;
        return this;
    }

    public DadosCarga addConteinerItem(Conteiner conteinerItem) {
        this.conteiner.add(conteinerItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DadosCarga {\n" +
                "    documentos: " + toIndentedString(documentos) + "\n" +
                "    conteiner: " + toIndentedString(conteiner) + "\n" +
                "}";
        return sb;
    }
}
