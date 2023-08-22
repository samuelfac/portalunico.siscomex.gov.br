package br.gov.siscomex.portalunico.rcnt.model;

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
 @XmlType(name = "ExceptionCoverDocumentacao", propOrder =
    { "code", "date", "field", "info", "message", "path", "severity", "tag"
})

@XmlRootElement(name="ExceptionCoverDocumentacao")
public class ExceptionCoverDocumentacao  {
  
  @XmlElement(name="code")
  @ApiModelProperty(value = "")
  private String code = null;

  @XmlElement(name="date")
  @ApiModelProperty(value = "")
  private String date = null;

  @XmlElement(name="field")
  @ApiModelProperty(value = "")
  private String field = null;

  @XmlElement(name="info")
  @ApiModelProperty(value = "")
  @Valid
  private DiagnosticInfo info = null;

  @XmlElement(name="message")
  @ApiModelProperty(value = "")
  private String message = null;

  @XmlElement(name="path")
  @ApiModelProperty(value = "")
  private String path = null;


@XmlType(name="SeverityEnum")
@XmlEnum(String.class)
public enum SeverityEnum {

	@XmlEnumValue("ERROR")
	@JsonProperty("ERROR")
	ERROR(String.valueOf("ERROR")),
	
	@XmlEnumValue("ALERT")
	@JsonProperty("ALERT")
	ALERT(String.valueOf("ALERT")),
	
	@XmlEnumValue("INFO")
	@JsonProperty("INFO")
	INFO(String.valueOf("INFO"));


    private String value;

    SeverityEnum (String v) {
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

  @XmlElement(name="severity")
  @ApiModelProperty(value = "")
  private SeverityEnum severity = null;

  @XmlElement(name="tag")
  @ApiModelProperty(value = "")
  private String tag = null;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ExceptionCoverDocumentacao code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExceptionCoverDocumentacao date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Get field
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ExceptionCoverDocumentacao field(String field) {
    this.field = field;
    return this;
  }

 /**
   * Get info
   * @return info
  **/
  @JsonProperty("info")
  public DiagnosticInfo getInfo() {
    return info;
  }

  public void setInfo(DiagnosticInfo info) {
    this.info = info;
  }

  public ExceptionCoverDocumentacao info(DiagnosticInfo info) {
    this.info = info;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExceptionCoverDocumentacao message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ExceptionCoverDocumentacao path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Get severity
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

  public ExceptionCoverDocumentacao severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

 /**
   * Get tag
   * @return tag
  **/
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ExceptionCoverDocumentacao tag(String tag) {
    this.tag = tag;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionCoverDocumentacao {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("}");
    return sb.toString();
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

