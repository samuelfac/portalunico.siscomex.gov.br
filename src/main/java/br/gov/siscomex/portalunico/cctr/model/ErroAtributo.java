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
@XmlType(name = "ErroAtributo", propOrder =
        {"atributo", "mensagens"
        })

@XmlRootElement(name = "ErroAtributo")
/**
 * Campo (atributo) que apresenta erro de validação
 **/
@ApiModel(description = "Campo (atributo) que apresenta erro de validação")
public class ErroAtributo {

    @XmlElement(name = "atributo")
    @ApiModelProperty(example = "cnpjResp", value = "Nome do campo (atributo) que viola as regras de validação")
    /**
     * Nome do campo (atributo) que viola as regras de validação
     **/
    private String atributo = null;

    @XmlElement(name = "mensagens")
    @ApiModelProperty(example = "[\"deve corresponder a 'd{14}'\",\"não deve estar em branco\"]", value = "Lista com as regras de validação que não foram atendidas")
    /**
     * Lista com as regras de validação que não foram atendidas
     **/
    private String mensagens = null;

    /**
     * Nome do campo (atributo) que viola as regras de validação
     *
     * @return atributo
     **/
    @JsonProperty("atributo")
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public ErroAtributo atributo(String atributo) {
        this.atributo = atributo;
        return this;
    }

    /**
     * Lista com as regras de validação que não foram atendidas
     *
     * @return mensagens
     **/
    @JsonProperty("mensagens")
    public String getMensagens() {
        return mensagens;
    }

    public void setMensagens(String mensagens) {
        this.mensagens = mensagens;
    }

    public ErroAtributo mensagens(String mensagens) {
        this.mensagens = mensagens;
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

        String sb = "class ErroAtributo {\n" +
                "    atributo: " + toIndentedString(atributo) + "\n" +
                "    mensagens: " + toIndentedString(mensagens) + "\n" +
                "}";
        return sb;
    }
}
