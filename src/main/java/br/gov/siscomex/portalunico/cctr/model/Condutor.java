package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condutor", propOrder =
        {"numeroCpf", "nome", "numeroDocumento", "tipoDocumento"
        })

@XmlRootElement(name = "Condutor")
/**
 * Dados do condutor
 **/
@ApiModel(description = "Dados do condutor")
public class Condutor {

    @XmlElement(name = "numeroCpf")
    @ApiModelProperty(example = "99999999999", value = "CPF do Condutor<br>Informado e obrigatório apenas para condutor brasileiro.<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
    /**
     * CPF do Condutor<br>Informado e obrigatório apenas para condutor brasileiro.<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
     **/
    private String numeroCpf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome do condutor estrangeiro", value = "Nome do condutor estrangeiro<br>Informado e obrigatório apenas para condutor estrangeiro.")
    /**
     * Nome do condutor estrangeiro<br>Informado e obrigatório apenas para condutor estrangeiro.
     **/
    private String nome = null;

    @XmlElement(name = "numeroDocumento")
    @ApiModelProperty(example = "999999999", value = "Número do documento do condutor estrangeiro<br>Informado e obrigatório apenas para condutor estrangeiro.")
    /**
     * Número do documento do condutor estrangeiro<br>Informado e obrigatório apenas para condutor estrangeiro.
     **/
    private String numeroDocumento = null;

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "Tipo de documento do condutor")
    /**
     * Tipo de documento do condutor
     **/
    private String tipoDocumento = null;

    /**
     * CPF do Condutor&lt;br&gt;Informado e obrigatório apenas para condutor brasileiro.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
     *
     * @return numeroCpf
     **/
    @JsonProperty("numeroCpf")
    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public Condutor numeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
        return this;
    }

    /**
     * Nome do condutor estrangeiro&lt;br&gt;Informado e obrigatório apenas para condutor estrangeiro.
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

    public Condutor nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Número do documento do condutor estrangeiro&lt;br&gt;Informado e obrigatório apenas para condutor estrangeiro.
     *
     * @return numeroDocumento
     **/
    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Condutor numeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
     * Tipo de documento do condutor
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Condutor tipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Condutor {\n" +
                "    numeroCpf: " + toIndentedString(numeroCpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroDocumento: " + toIndentedString(numeroDocumento) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "}";
        return sb;
    }
}
