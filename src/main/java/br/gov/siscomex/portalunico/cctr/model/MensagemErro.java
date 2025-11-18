package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensagemErro", propOrder =
        {"codigo", "mensagem"
        })

@XmlRootElement(name = "MensagemErro")
public class MensagemErro {

    @XmlElement(name = "codigo")
    @ApiModelProperty(example = "CCTR-ER0001", value = "Código da mensagem")
    /**
     * Código da mensagem
     **/
    private String codigo = null;

    @XmlElement(name = "mensagem")
    @ApiModelProperty(example = "Ação não permitida", value = "Descrição da mensagem")
    /**
     * Descrição da mensagem
     **/
    private String mensagem = null;

    /**
     * Código da mensagem
     *
     * @return codigo
     **/
    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public MensagemErro codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Descrição da mensagem
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

    public MensagemErro mensagem(String mensagem) {
        this.mensagem = mensagem;
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

        String sb = "class MensagemErro {\n" +
                "    codigo: " + toIndentedString(codigo) + "\n" +
                "    mensagem: " + toIndentedString(mensagem) + "\n" +
                "}";
        return sb;
    }
}
