package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Responsavel", propOrder =
        {"documento", "nome"
        })

@XmlRootElement(name = "Responsavel")
public class Responsavel {

    @XmlElement(name = "documento")
    @ApiModelProperty(value = "")
    @Valid
    private Documento documento = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "")
    private String nome = null;

    /**
     * Get documento
     *
     * @return documento
     **/
    @JsonProperty("documento")
    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Responsavel documento(Documento documento) {
        this.documento = documento;
        return this;
    }

    /**
     * Get nome
     *
     * @return nome
     **/
    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Responsavel nome(String nome) {
        this.nome = nome;
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

        String sb = "class Responsavel {\n" +
                "    documento: " + toIndentedString(documento) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
    }
}
