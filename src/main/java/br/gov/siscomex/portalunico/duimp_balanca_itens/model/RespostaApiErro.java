package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

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
@XmlType(name = "RespostaApiErro", propOrder =
        {"message", "identificacao", "errors", "links"
        })

@XmlRootElement(name = "RespostaApiErro")
public class RespostaApiErro {

    @XmlElement(name = "message")
    @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação.")
    /**
     * Mensagem de resposta do resultado da operação.
     **/
    private String message = null;

    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "")
    @Valid
    private IdentificacaoDuimpRespostaApi identificacao = null;

    @XmlElement(name = "errors")
    @ApiModelProperty(value = "Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422. <br> Esta é uma lista opcional e fornece o detalhamento de todos os erros que deram origem ao erro 422<br> Quando houver mais de um erro, essa lista será preenchida com cada um dos erros<br> <b>Exemplo:</b> A lista detalhada dos problemas encontrados em um item, quando for gerado um erro 422 ao validar a inclusão de um item.")
    @Valid
    /**
     * Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422. <br> Esta é uma lista opcional e fornece o detalhamento de todos os erros que deram origem ao erro 422<br> Quando houver mais de um erro, essa lista será preenchida com cada um dos erros<br> <b>Exemplo:</b> A lista detalhada dos problemas encontrados em um item, quando for gerado um erro 422 ao validar a inclusão de um item.
     **/
    private List<DuimpApiMessageCover> errors = null;

    @XmlElement(name = "links")
    @ApiModelProperty(value = "Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.")
    @Valid
    /**
     * Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.
     **/
    private List<LinkCover> links = null;

    /**
     * Mensagem de resposta do resultado da operação.
     *
     * @return message
     **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RespostaApiErro message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get identificacao
     *
     * @return identificacao
     **/
    @JsonProperty("identificacao")
    public IdentificacaoDuimpRespostaApi getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(IdentificacaoDuimpRespostaApi identificacao) {
        this.identificacao = identificacao;
    }

    public RespostaApiErro identificacao(IdentificacaoDuimpRespostaApi identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    /**
     * Conjunto de erros de validação dos campos. Devolvido apenas para erros HTTP 422. &lt;br&gt; Esta é uma lista opcional e fornece o detalhamento de todos os erros que deram origem ao erro 422&lt;br&gt; Quando houver mais de um erro, essa lista será preenchida com cada um dos erros&lt;br&gt; &lt;b&gt;Exemplo:&lt;/b&gt; A lista detalhada dos problemas encontrados em um item, quando for gerado um erro 422 ao validar a inclusão de um item.
     *
     * @return errors
     **/
    @JsonProperty("errors")
    public List<DuimpApiMessageCover> getErrors() {
        return errors;
    }

    public void setErrors(List<DuimpApiMessageCover> errors) {
        this.errors = errors;
    }

    public RespostaApiErro errors(List<DuimpApiMessageCover> errors) {
        this.errors = errors;
        return this;
    }

    public RespostaApiErro addErrorsItem(DuimpApiMessageCover errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Operações disponíveis sobre o recurso.&lt;br&gt;Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.
     *
     * @return links
     **/
    @JsonProperty("links")
    public List<LinkCover> getLinks() {
        return links;
    }

    public void setLinks(List<LinkCover> links) {
        this.links = links;
    }

    public RespostaApiErro links(List<LinkCover> links) {
        this.links = links;
        return this;
    }

    public RespostaApiErro addLinksItem(LinkCover linksItem) {
        this.links.add(linksItem);
        return this;
    }


    @Override
    public String toString() {

        String sb = "class RespostaApiErro {\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    errors: " + toIndentedString(errors) + "\n" +
                "    links: " + toIndentedString(links) + "\n" +
                "}";
        return sb;
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
}

