package br.gov.siscomex.portalunico.duimp_balanca_itens.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuimpApiMessageCover", propOrder =
        {"code", "field", "message"
        })

@XmlRootElement(name = "DuimpApiMessageCover")
public class DuimpApiMessageCover {

    @XmlElement(name = "code")
    @ApiModelProperty(example = "DIMP-ER9999", value = "Código interno da mensagem de erro.")
    /**
     * Código interno da mensagem de erro.
     **/
    private String code = null;

    @XmlElement(name = "field")
    @ApiModelProperty(example = "numero", value = "Nome do campo que contém o valor inválido. <br> Atributo opcional: Só será devolvido caso o erro tenha sido provocado por um atributo inválido")
    /**
     * Nome do campo que contém o valor inválido. <br> Atributo opcional: Só será devolvido caso o erro tenha sido provocado por um atributo inválido
     **/
    private String field = null;

    @XmlElement(name = "message")
    @ApiModelProperty(example = "Mensagem de negócio detalhando o código de erro informado no atributo 'code'.", value = "Mensagem de erro.")
    /**
     * Mensagem de erro.
     **/
    private String message = null;

    /**
     * Código interno da mensagem de erro.
     *
     * @return code
     **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DuimpApiMessageCover code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Nome do campo que contém o valor inválido. &lt;br&gt; Atributo opcional: Só será devolvido caso o erro tenha sido provocado por um atributo inválido
     *
     * @return field
     **/
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public DuimpApiMessageCover field(String field) {
        this.field = field;
        return this;
    }

    /**
     * Mensagem de erro.
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

    public DuimpApiMessageCover message(String message) {
        this.message = message;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class DuimpApiMessageCover {\n" +
                "    code: " + toIndentedString(code) + "\n" +
                "    field: " + toIndentedString(field) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
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

