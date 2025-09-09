package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", propOrder =
        {"path", "trackerId", "details", "error", "message", "status", "timestamp"
        })

@XmlRootElement(name = "Error")
/**
 * Representação de Erros
 **/
@ApiModel(description = "Representação de Erros")
public class Error {

    @XmlElement(name = "path")
    @ApiModelProperty(value = "")
    private String path = null;

    @XmlElement(name = "trackerId")
    @ApiModelProperty(value = "")
    private String trackerId = null;

    @XmlElement(name = "details")
    @ApiModelProperty(value = "")
    private List<String> details = null;

    @XmlElement(name = "error")
    @ApiModelProperty(value = "")
    private String error = null;

    @XmlElement(name = "message")
    @ApiModelProperty(value = "")
    private String message = null;

    @XmlElement(name = "status")
    @ApiModelProperty(value = "")
    private Integer status = null;

    @XmlElement(name = "timestamp")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "")
    private String timestamp = null;

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

    public Error path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get trackerId
     *
     * @return trackerId
     **/
    @JsonProperty("trackerId")
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public Error trackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * Get details
     *
     * @return details
     **/
    @JsonProperty("details")
    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public Error details(List<String> details) {
        this.details = details;
        return this;
    }

    public Error addDetailsItem(String detailsItem) {
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Error error(String error) {
        this.error = error;
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

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Error status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Error timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Error {\n" +
                "    path: " + toIndentedString(path) + "\n" +
                "    trackerId: " + toIndentedString(trackerId) + "\n" +
                "    details: " + toIndentedString(details) + "\n" +
                "    error: " + toIndentedString(error) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
                "}";
        return sb;
    }
}
