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
@XmlType(name = "RespostaApi", propOrder =
        {"identificacao", "links", "message"
        })

@XmlRootElement(name = "RespostaApi")
public class RespostaApi {

    @XmlElement(name = "identificacao")
    @ApiModelProperty(value = "")
    @Valid
    private IdentificacaoDuimpRespostaApi identificacao = null;

    @XmlElement(name = "links")
    @ApiModelProperty(value = "Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.")
    @Valid
    /**
     * Operações disponíveis sobre o recurso.<br>Lista devolvida apenas quando a operação realizada sobre um recurso permite a realização de operações relacionadas.
     **/
    private List<LinkCover> links = null;

    @XmlElement(name = "message")
    @ApiModelProperty(example = "Mensagem de exemplo.", value = "Mensagem de resposta do resultado da operação.")
    /**
     * Mensagem de resposta do resultado da operação.
     **/
    private String message = null;

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

    public RespostaApi identificacao(IdentificacaoDuimpRespostaApi identificacao) {
        this.identificacao = identificacao;
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

    public RespostaApi links(List<LinkCover> links) {
        this.links = links;
        return this;
    }

    public RespostaApi addLinksItem(LinkCover linksItem) {
        this.links.add(linksItem);
        return this;
    }

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

    public RespostaApi message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RespostaApi {\n" +
                "    identificacao: " + toIndentedString(identificacao) + "\n" +
                "    links: " + toIndentedString(links) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "}";
        return sb;
    }
}
