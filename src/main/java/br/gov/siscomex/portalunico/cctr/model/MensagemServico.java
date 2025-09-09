package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensagemServico", propOrder =
        {"numero", "codigoErro", "idOperacao", "mensagem", "msgxsd"
        })

@XmlRootElement(name = "MensagemServico")
public class MensagemServico {

    @XmlElement(name = "numero")
    @ApiModelProperty(value = "")
    private String numero = null;

    @XmlElement(name = "codigoErro")
    @ApiModelProperty(value = "")
    private String codigoErro = null;

    @XmlElement(name = "idOperacao")
    @ApiModelProperty(value = "")
    private String idOperacao = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(value = "")
    private String mensagem = null;

    @XmlElement(name = "msgxsd")
    @ApiModelProperty(value = "")
    private String msgxsd = null;

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
     * Get numero
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

    public MensagemServico numero(String numero) {
        this.numero = numero;
        return this;
    }

    /**
     * Get codigoErro
     *
     * @return codigoErro
     **/
    @JsonProperty("codigoErro")
    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    public MensagemServico codigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
        return this;
    }

    /**
     * Get idOperacao
     *
     * @return idOperacao
     **/
    @JsonProperty("idOperacao")
    public String getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(String idOperacao) {
        this.idOperacao = idOperacao;
    }

    public MensagemServico idOperacao(String idOperacao) {
        this.idOperacao = idOperacao;
        return this;
    }

    /**
     * Get mensagem
     *
     * @return mensagem
     **/
    @JsonProperty("mensagem")
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public MensagemServico mensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    /**
     * Get msgxsd
     *
     * @return msgxsd
     **/
    @JsonProperty("msgxsd")
    public String getMsgxsd() {
        return msgxsd;
    }

    public void setMsgxsd(String msgxsd) {
        this.msgxsd = msgxsd;
    }

    public MensagemServico msgxsd(String msgxsd) {
        this.msgxsd = msgxsd;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class MensagemServico {\n" +
                "    numero: " + toIndentedString(numero) + "\n" +
                "    codigoErro: " + toIndentedString(codigoErro) + "\n" +
                "    idOperacao: " + toIndentedString(idOperacao) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "    msgxsd: " + toIndentedString(msgxsd) + "\n" +
                "}";
        return sb;
    }
}
