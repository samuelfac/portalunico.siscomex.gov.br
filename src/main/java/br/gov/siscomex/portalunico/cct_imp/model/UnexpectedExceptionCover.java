package br.gov.siscomex.portalunico.cct_imp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnexpectedExceptionCover", propOrder =
        {"message", "code", "field", "path", "tag", "date", "severity", "info"
        })

@XmlRootElement(name = "UnexpectedExceptionCover")
public class UnexpectedExceptionCover {

    @XmlElement(name = "message")
    @ApiModelProperty(example = "Ocorreu um erro inesperado. Por favor, tente novamente. Se o problema persistir, acione a Central Serpro de Atendimento anexando todo o conteúdo do response.", value = "Mensagem descritiva do erro")
    /**
     * Mensagem descritiva do erro
     **/
    private String message = null;

    @XmlElement(name = "code")
    @ApiModelProperty(example = "PUCX-ER0001", value = "Código do erro")
    /**
     * Código do erro
     **/
    private String code = null;

    @XmlElement(name = "field")
    @ApiModelProperty(value = "Não aplicável neste contexto de negócio")
    /**
     * Não aplicável neste contexto de negócio
     **/
    private String field = null;

    @XmlElement(name = "path")
    @ApiModelProperty(value = "Não aplicável neste contexto de negócio")
    /**
     * Não aplicável neste contexto de negócio
     **/
    private String path = null;

    @XmlElement(name = "tag")
    @ApiModelProperty(example = "[CCTR-AWCEGJ2248]", value = "Identificador único do erro")
    /**
     * Identificador único do erro
     **/
    private String tag = null;

    @XmlElement(name = "date")
    @ApiModelProperty(example = "2024-08-16T16:43:52", value = "Data e hora do erro")
    /**
     * Data e hora do erro
     **/
    private String date = null;


    @XmlType(name = "SeverityEnum")
    @XmlEnum(String.class)
    public enum SeverityEnum {

        @XmlEnumValue("ERROR")
        @JsonProperty("ERROR")
        ERROR("ERROR"),

        @XmlEnumValue("ALERT")
        @JsonProperty("ALERT")
        ALERT("ALERT"),

        @XmlEnumValue("INFO")
        @JsonProperty("INFO")
        INFO("INFO");


        private final String value;

        SeverityEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SeverityEnum fromValue(String v) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SeverityEnum");
        }
    }

    @XmlElement(name = "severity")
    @ApiModelProperty(example = "ERROR", value = "Severidade da falha")
    /**
     * Severidade da falha
     **/
    private SeverityEnum severity = null;

    @XmlElement(name = "info")
    @ApiModelProperty(value = "")
    @Valid
    private DiagnosticInfo info = null;

    /**
     * Mensagem descritiva do erro
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

    public UnexpectedExceptionCover message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Código do erro
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

    public UnexpectedExceptionCover code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Não aplicável neste contexto de negócio
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

    public UnexpectedExceptionCover field(String field) {
        this.field = field;
        return this;
    }

    /**
     * Não aplicável neste contexto de negócio
     *
     * @return path
     **/
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UnexpectedExceptionCover path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Identificador único do erro
     *
     * @return tag
     **/
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public UnexpectedExceptionCover tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Data e hora do erro
     *
     * @return date
     **/
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UnexpectedExceptionCover date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Severidade da falha
     *
     * @return severity
     **/
    @JsonProperty("severity")
    public String getSeverity() {
        if (severity == null) {
            return null;
        }
        return severity.value();
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public UnexpectedExceptionCover severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get info
     *
     * @return info
     **/
    @JsonProperty("info")
    public DiagnosticInfo getInfo() {
        return info;
    }

    public void setInfo(DiagnosticInfo info) {
        this.info = info;
    }

    public UnexpectedExceptionCover info(DiagnosticInfo info) {
        this.info = info;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class UnexpectedExceptionCover {\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    code: " + toIndentedString(code) + "\n" +
                "    field: " + toIndentedString(field) + "\n" +
                "    path: " + toIndentedString(path) + "\n" +
                "    tag: " + toIndentedString(tag) + "\n" +
                "    date: " + toIndentedString(date) + "\n" +
                "    severity: " + toIndentedString(severity) + "\n" +
                "    info: " + toIndentedString(info) + "\n" +
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

