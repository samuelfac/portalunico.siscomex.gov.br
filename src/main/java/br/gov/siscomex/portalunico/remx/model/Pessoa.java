package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pessoa", propOrder =
        {"conta", "documento", "endereco", "nome", "tipoDocumento"
        })

@XmlRootElement(name = "Pessoa")
public class Pessoa {

    @XmlElement(name = "conta")
    @ApiModelProperty(value = "Código da conta da pessoa com o operador. Máximo de 10 caracteres alfanuméricos.")
    /**
     * Código da conta da pessoa com o operador. Máximo de 10 caracteres alfanuméricos.
     **/
    private String conta = null;

    @XmlElement(name = "documento")
    @ApiModelProperty(value = "Documento de identificação fiscal da pessoa.<br/>Caso seja CPF – 11 caracteres numéricos.<br/>Caso seja CNPJ – 14 caracteres numéricos.<br/>Caso seja Passaporte – Até 10 caracteres alfanuméricos.<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.")
    /**
     * Documento de identificação fiscal da pessoa.<br/>Caso seja CPF – 11 caracteres numéricos.<br/>Caso seja CNPJ – 14 caracteres numéricos.<br/>Caso seja Passaporte – Até 10 caracteres alfanuméricos.<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.
     **/
    private String documento = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private Endereo endereco = null;

    @XmlElement(name = "nome")
    @ApiModelProperty(value = "Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String nome = null;

    @XmlElement(name = "tipoDocumento")
    @ApiModelProperty(value = "Tipo do documento de identificação fiscal.<br/>1 – CPF.<br/>2 – CNPJ.<br/>3 – Passaporte<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.")
    /**
     * Tipo do documento de identificação fiscal.<br/>1 – CPF.<br/>2 – CNPJ.<br/>3 – Passaporte<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.
     **/
    private String tipoDocumento = null;

    /**
     * Código da conta da pessoa com o operador. Máximo de 10 caracteres alfanuméricos.
     *
     * @return conta
     **/
    @JsonProperty("conta")
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Pessoa conta(String conta) {
        this.conta = conta;
        return this;
    }

    /**
     * Documento de identificação fiscal da pessoa.&lt;br/&gt;Caso seja CPF – 11 caracteres numéricos.&lt;br/&gt;Caso seja CNPJ – 14 caracteres numéricos.&lt;br/&gt;Caso seja Passaporte – Até 10 caracteres alfanuméricos.&lt;br/&gt;Sempre que o atributo &#39;documento&#39; for inserido no Json, o atributo &#39;tipoDocumento&#39; deve acompanhá-lo.
     *
     * @return documento
     **/
    @JsonProperty("documento")
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Pessoa documento(String documento) {
        this.documento = documento;
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
     * Get endereco
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public Endereo getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereo endereco) {
        this.endereco = endereco;
    }

    /**
     * Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
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

    public Pessoa nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa endereco(Endereo endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * Tipo do documento de identificação fiscal.&lt;br/&gt;1 – CPF.&lt;br/&gt;2 – CNPJ.&lt;br/&gt;3 – Passaporte&lt;br/&gt;Sempre que o atributo &#39;documento&#39; for inserido no Json, o atributo &#39;tipoDocumento&#39; deve acompanhá-lo.
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

    public Pessoa tipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Pessoa {\n" +
                "    conta: " + toIndentedString(conta) + "\n" +
                "    documento: " + toIndentedString(documento) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "}";
        return sb;
    }
}
