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
@XmlType(name = "Proprietrio", propOrder =
        {"idFiscal", "endereco", "numeroCpf", "nome", "numeroCnpj", "codigoPais"
        })

@XmlRootElement(name = "Proprietrio")
/**
 * Dados do proprietário
 **/
@ApiModel(description = "Dados do proprietário")
public class Proprietrio {

    @XmlElement(name = "idFiscal")
    @ApiModelProperty(example = "99999999", value = "Identificação fiscal do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere à identificação fiscal do transportador estrangeiro no seu país.<br>Tamanho: 14")
    /**
     * Identificação fiscal do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere à identificação fiscal do transportador estrangeiro no seu país.<br>Tamanho: 14
     **/
    private String idFiscal = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(example = "Endereço do proprietário estrangeiro", value = "Endereço do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao endereço do transportador estrangeiro.<br>Tamanho: 120")
    /**
     * Endereço do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao endereço do transportador estrangeiro.<br>Tamanho: 120
     **/
    private String endereco = null;

    @XmlElement(name = "numeroCpf")
    @ApiModelProperty(example = "99999999999", value = "CPF do proprietário<br>Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.<br>Tamanho: 11<br>Formato: NNNNNNNNNNN")
    /**
     * CPF do proprietário<br>Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.<br>Tamanho: 11<br>Formato: NNNNNNNNNNN
     **/
    private String numeroCpf = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(example = "Nome do proprietário estrangeiro", value = "Nome do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao nome do transportador estrangeiro.<br>Tamanho: 60")
    /**
     * Nome do proprietário estrangeiro<br>Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao nome do transportador estrangeiro.<br>Tamanho: 60
     **/
    private String nome = null;

    @XmlElement(name = "numeroCnpj")
    @ApiModelProperty(example = "99999999999999", value = "CNPJ do proprietário<br>Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN")
    /**
     * CNPJ do proprietário<br>Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.<br>Tamanho: 14<br>Formato: NNNNNNNNNNNNNN
     **/
    private String numeroCnpj = null;

    @XmlElement(name = "codigoPais")
    @ApiModelProperty(value = "Código do país do proprietário")
    /**
     * Código do país do proprietário
     **/
    private String codigoPais = null;

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
     * Identificação fiscal do proprietário estrangeiro&lt;br&gt;Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere à identificação fiscal do transportador estrangeiro no seu país.&lt;br&gt;Tamanho: 14
     *
     * @return idFiscal
     **/
    @JsonProperty("idFiscal")
    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public Proprietrio idFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
        return this;
    }

    /**
     * Endereço do proprietário estrangeiro&lt;br&gt;Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao endereço do transportador estrangeiro.&lt;br&gt;Tamanho: 120
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Proprietrio endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * CPF do proprietário&lt;br&gt;Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: NNNNNNNNNNN
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

    public Proprietrio numeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
        return this;
    }

    /**
     * Nome do proprietário estrangeiro&lt;br&gt;Informado e obrigatório apenas quando o transportador não for o proprietário do veículo e o proprietário for estrangeiro. Este campo ser refere ao nome do transportador estrangeiro.&lt;br&gt;Tamanho: 60
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

    public Proprietrio nome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * CNPJ do proprietário&lt;br&gt;Informado e obrigatório apenas se o transportador não for o proprietário do veículo, e o proprietário for brasileiro.&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: NNNNNNNNNNNNNN
     *
     * @return numeroCnpj
     **/
    @JsonProperty("numeroCnpj")
    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    public void setNumeroCnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
    }

    public Proprietrio numeroCnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
        return this;
    }

    /**
     * Código do país do proprietário
     *
     * @return codigoPais
     **/
    @JsonProperty("codigoPais")
    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Proprietrio codigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Proprietrio {\n" +
                "    idFiscal: " + toIndentedString(idFiscal) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    numeroCpf: " + toIndentedString(numeroCpf) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    numeroCnpj: " + toIndentedString(numeroCnpj) + "\n" +
                "    codigoPais: " + toIndentedString(codigoPais) + "\n" +
                "}";
        return sb;
    }
}
