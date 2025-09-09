package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNPJ", propOrder =
        {"numero", "cpf", "nome", "cnpj"
        })

@XmlRootElement(name = "CNPJ")
public class CNPJ {

    @XmlElement(name = "numero")
    @ApiModelProperty(example = "84982428000177", value = "Numero<br />Tamanho: 14<br />Formato: 'NNNNNNNNNNNNNN'")
    /**
     * Numero<br />Tamanho: 14<br />Formato: 'NNNNNNNNNNNNNN'
     **/
    private String numero = null;

    @XmlElement(name = "cpf")
    @ApiModelProperty(value = "")
    private Boolean cpf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150")
    /**
     * Nome<br />Tamanho mínimo: 1<br />Tamanho máximo: 150
     **/
    private String nome = null;

    @XmlElement(name = "cnpj")
    @ApiModelProperty(value = "")
    private Boolean cnpj = null;

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
     * Numero&lt;br /&gt;Tamanho: 14&lt;br /&gt;Formato: &#39;NNNNNNNNNNNNNN&#39;
     *
     * @return numero
     **/
    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public CNPJ numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get cpf
     *
     * @return cpf
     **/
    @JsonProperty("cpf")
    public Boolean isisCpf() {
        return cpf;
    }

    public void setCpf(Boolean cpf) {
        this.cpf = cpf;
    }

    public CNPJ cpf(Boolean cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * Nome&lt;br /&gt;Tamanho mínimo: 1&lt;br /&gt;Tamanho máximo: 150
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

    public CNPJ nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Get cnpj
     *
     * @return cnpj
     **/
    @JsonProperty("cnpj")
    public Boolean isisCnpj() {
        return cnpj;
    }

    public void setCnpj(Boolean cnpj) {
        this.cnpj = cnpj;
    }

    public CNPJ cnpj(Boolean cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class CNPJ {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    cpf: " + toIndentedString(cpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    cnpj: " + toIndentedString(cnpj) + "\n" +
                "}";
        return sb;
    }
}
