package br.gov.siscomex.portalunico.plat.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponseDTO", propOrder =
        {"status", "message", "tag", "code"
        })

@XmlRootElement(name = "ErrorResponseDTO")
/**
 * DTO de resposta de erro
 **/
@ApiModel(description = "DTO de resposta de erro")
public class ErrorResponseDTO {

    @XmlElement(name = "status", required = true)
    @ApiModelProperty(required = true, value = "Código de status HTTP.")
    /**
     * Código de status HTTP.
     **/
    private Integer status = null;

    @XmlElement(name = "message", required = true)
    @ApiModelProperty(required = true, value = "Mensagem descrevendo o erro.")
    /**
     * Mensagem descrevendo o erro.
     **/
    private String message = null;

    @XmlElement(name = "tag", required = true)
    @ApiModelProperty(required = true, value = "Tag de erro. Usada para rastreio em logs em caso de acionamento.")
    /**
     * Tag de erro. Usada para rastreio em logs em caso de acionamento.
     **/
    private String tag = null;

    @XmlElement(name = "code", required = true)
    @ApiModelProperty(required = true, value = "Código de erro. Na seção inicial, estão listados os erros de negócio mapeados.")
    /**
     * Código de erro. Na seção inicial, estão listados os erros de negócio mapeados.
     **/
    private String code = null;

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
     * Código de status HTTP.
     *
     * @return status
     **/
    @JsonProperty("status")
    @NotNull
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Mensagem descrevendo o erro.
     *
     * @return message
     **/
    @JsonProperty("message")
    @NotNull
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponseDTO message(String message) {
        this.message = message;
        return this;
    }

    public ErrorResponseDTO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Tag de erro. Usada para rastreio em logs em caso de acionamento.
     *
     * @return tag
     **/
    @JsonProperty("tag")
    @NotNull
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ErrorResponseDTO tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Código de erro. Na seção inicial, estão listados os erros de negócio mapeados.
     *
     * @return code
     **/
    @JsonProperty("code")
    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ErrorResponseDTO code(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ErrorResponseDTO {\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    tag: " + toIndentedString(tag) + "\n" +
                "    code: " + toIndentedString(code) + "\n" +
                "}";
        return sb;
    }
}
