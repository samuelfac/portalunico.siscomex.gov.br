package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "RetornoXmlServico", propOrder =
        {"listaOperacao", "mensagem"
        })

@XmlRootElement(name = "RetornoXmlServico")
public class RetornoXmlServico {

    @XmlElement(name = "listaOperacao")
    @ApiModelProperty(value = "")
    @Valid
    private List<Operacao> listaOperacao = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(value = "")
    @Valid
    private List<MensagemServico> mensagem = null;

    /**
     * Get listaOperacao
     *
     * @return listaOperacao
     **/
    @JsonProperty("listaOperacao")
    public List<Operacao> getListaOperacao() {
        return listaOperacao;
    }

    public void setListaOperacao(List<Operacao> listaOperacao) {
        this.listaOperacao = listaOperacao;
    }

    public RetornoXmlServico listaOperacao(List<Operacao> listaOperacao) {
        this.listaOperacao = listaOperacao;
        return this;
    }

    public RetornoXmlServico addListaOperacaoItem(Operacao listaOperacaoItem) {
        this.listaOperacao.add(listaOperacaoItem);
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
     * Get mensagem
     *
     * @return mensagem
     **/
    @JsonProperty("mensagem")
    public List<MensagemServico> getMensagem() {
        return mensagem;
    }

    public void setMensagem(List<MensagemServico> mensagem) {
        this.mensagem = mensagem;
    }

    public RetornoXmlServico mensagem(List<MensagemServico> mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public RetornoXmlServico addMensagemItem(MensagemServico mensagemItem) {
        this.mensagem.add(mensagemItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RetornoXmlServico {\n" +
                "    listaOperacao: " + toIndentedString(listaOperacao) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "}";
        return sb;
    }
}
