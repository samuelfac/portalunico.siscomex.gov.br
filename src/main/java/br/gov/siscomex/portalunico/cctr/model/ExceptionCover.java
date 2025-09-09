package br.gov.siscomex.portalunico.cctr.model;

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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionCover", propOrder =
        {"date", "severity", "path", "code", "field", "tag", "detail", "message", "info"
        })

@XmlRootElement(name = "ExceptionCover")
public class ExceptionCover {

    @XmlElement(name = "date")
    @ApiModelProperty(value = "")
    private String date = null;
    @XmlElement(name = "severity")
    @ApiModelProperty(value = "")
    private SeverityEnum severity = null;
    @XmlElement(name = "path")
    @ApiModelProperty(value = "")
    private String path = null;
    @XmlElement(name = "code")
    @ApiModelProperty(value = "")
    private String code = null;
    @XmlElement(name = "field")
    @ApiModelProperty(value = "")
    private String field = null;
    @XmlElement(name = "tag")
    @ApiModelProperty(value = "")
    private String tag = null;
    @XmlElement(name = "detail")
    @ApiModelProperty(value = "")
    @Valid
    private List<IExceptionCover> detail = null;
    @XmlElement(name = "message")
    @ApiModelProperty(value = "")
    private String message = null;
    @XmlElement(name = "info")
    @ApiModelProperty(value = "")
    @Valid
    private DiagnosticInfo info = null;

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
     * Get date
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

    public ExceptionCover date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get severity
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

    public ExceptionCover severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get path
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

    public ExceptionCover path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get code
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

    public ExceptionCover code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get field
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

    public ExceptionCover field(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get tag
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

    public ExceptionCover tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get detail
     *
     * @return detail
     **/
    @JsonProperty("detail")
    public List<IExceptionCover> getDetail() {
        return detail;
    }

    public void setDetail(List<IExceptionCover> detail) {
        this.detail = detail;
    }

    public ExceptionCover detail(List<IExceptionCover> detail) {
        this.detail = detail;
        return this;
    }

    public ExceptionCover addDetailItem(IExceptionCover detailItem) {
        this.detail.add(detailItem);
        return this;
    }

    /**
     * Get message
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

    public ExceptionCover message(String message) {
        this.message = message;
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

    public ExceptionCover info(DiagnosticInfo info) {
        this.info = info;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class ExceptionCover {\n" +
                "    date: " + toIndentedString(date) + "\n" +
                "    severity: " + toIndentedString(severity) + "\n" +
                "    path: " + toIndentedString(path) + "\n" +
                "    code: " + toIndentedString(code) + "\n" +
                "    field: " + toIndentedString(field) + "\n" +
                "    tag: " + toIndentedString(tag) + "\n" +
                "    detail: " + toIndentedString(detail) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    info: " + toIndentedString(info) + "\n" +
                "}";
        return sb;
    }

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

        public static SeverityEnum fromValue(String v) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to SeverityEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
