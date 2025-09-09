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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Desunitizacao", propOrder =
        {"documentos", "numeroConteiner"
        })

@XmlRootElement(name = "Desunitizacao")
/**
 * Dados das cargas desunitizadas
 **/
@ApiModel(description = "Dados das cargas desunitizadas")
public class Desunitizacao {

    @XmlElement(name = "documentos", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Documentos documentos = null;

    @XmlElement(name = "numeroConteiner", required = true)
    @ApiModelProperty(example = "CONT0001", required = true, value = "Número do contêiner que será desunitizado<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA")
    /**
     * Número do contêiner que será desunitizado<br>Tamanho: 20<br>Formato: AAAAAAAAAAAAAAAAAAAA
     **/
    private String numeroConteiner = null;

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
     * Get documentos
     *
     * @return documentos
     **/
    @JsonProperty("documentos")
    @NotNull
    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    public Desunitizacao documentos(Documentos documentos) {
        this.documentos = documentos;
        return this;
    }

    /**
     * Número do contêiner que será desunitizado&lt;br&gt;Tamanho: 20&lt;br&gt;Formato: AAAAAAAAAAAAAAAAAAAA
     *
     * @return numeroConteiner
     **/
    @JsonProperty("numeroConteiner")
    @NotNull
    public String getNumeroConteiner() {
        return numeroConteiner;
    }

    public void setNumeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
    }

    public Desunitizacao numeroConteiner(String numeroConteiner) {
        this.numeroConteiner = numeroConteiner;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Desunitizacao {\n" +
                "    documentos: " + toIndentedString(documentos) + "\n" +
                "    numeroConteiner: " + toIndentedString(numeroConteiner) + "\n" +
                "}";
        return sb;
    }
}
