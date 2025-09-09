package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaParaRegistroERetificaoDeManifesto", propOrder =
        {"tipoDocumento", "endereco", "conta", "documento", "nome"
        })

@XmlRootElement(name = "PessoaParaRegistroERetificaoDeManifesto")
public class PessoaParaRegistroERetificaoDeManifesto {

    @XmlElement(name = "tipoDocumento", required = true)
    @ApiModelProperty(required = true, value = "Tipo do documento de identificação fiscal.<br/>1 – CPF.<br/>2 – CNPJ.<br/>3 – Passaporte<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.")
    /**
     * Tipo do documento de identificação fiscal.<br/>1 – CPF.<br/>2 – CNPJ.<br/>3 – Passaporte<br/>Sempre que o atributo 'documento' for inserido no Json, o atributo 'tipoDocumento' deve acompanhá-lo.
     **/
    private String tipoDocumento = null;

    @XmlElement(name = "endereco")
    @ApiModelProperty(value = "")
    @Valid
    private EndereoParaRegistroERetificaoDeManifesto endereco = null;

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

    @XmlElement(name = "nome", required = true)
    @ApiModelProperty(required = true, value = "Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String nome = null;

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
     * Tipo do documento de identificação fiscal.&lt;br/&gt;1 – CPF.&lt;br/&gt;2 – CNPJ.&lt;br/&gt;3 – Passaporte&lt;br/&gt;Sempre que o atributo &#39;documento&#39; for inserido no Json, o atributo &#39;tipoDocumento&#39; deve acompanhá-lo.
     *
     * @return tipoDocumento
     **/
    @JsonProperty("tipoDocumento")
    @NotNull
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public PessoaParaRegistroERetificaoDeManifesto tipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    /**
     * Get endereco
     *
     * @return endereco
     **/
    @JsonProperty("endereco")
    public EndereoParaRegistroERetificaoDeManifesto getEndereco() {
        return endereco;
    }

    public void setEndereco(EndereoParaRegistroERetificaoDeManifesto endereco) {
        this.endereco = endereco;
    }

    public PessoaParaRegistroERetificaoDeManifesto endereco(EndereoParaRegistroERetificaoDeManifesto endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
     * Código da conta da pessoa com o operador. Máximo de 10 caracteres alfanuméricos.
     *
     * @return conta
     **/
    @JsonProperty("conta")
    @Size(min = 0, max = 10)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public PessoaParaRegistroERetificaoDeManifesto conta(String conta) {
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

    public PessoaParaRegistroERetificaoDeManifesto documento(String documento) {
        this.documento = documento;
        return this;
    }

    /**
     * Nome da pessoa física ou jurídica. 255 caracteres que podem ser letras, números, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return nome
     **/
    @JsonProperty("nome")
    @NotNull
    @Size(min = 1, max = 255)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PessoaParaRegistroERetificaoDeManifesto nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class PessoaParaRegistroERetificaoDeManifesto {\n" +
                "    tipoDocumento: " + toIndentedString(tipoDocumento) + "\n" +
                "    endereco: " + toIndentedString(endereco) + "\n" +
                "    conta: " + toIndentedString(conta) + "\n" +
                "    documento: " + toIndentedString(documento) + "\n" +
                "    nome: " + toIndentedString(nome) + "\n" +
                "}";
        return sb;
    }
}
