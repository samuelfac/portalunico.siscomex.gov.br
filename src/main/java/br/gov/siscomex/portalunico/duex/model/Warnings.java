package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warnings", propOrder =
        {"warning", "empty"
        })

@XmlRootElement(name = "Warnings")
public class Warnings {

    @XmlElement(name = "warning")
    @ApiModelProperty(value = "")
    private List<String> warning = null;

    @XmlElement(name = "empty")
    @ApiModelProperty(value = "")
    private Boolean empty = null;

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
     * Get warning
     *
     * @return warning
     **/
    @JsonProperty("warning")
    public List<String> getWarning() {
        return warning;
    }

    public void setWarning(List<String> warning) {
        this.warning = warning;
    }

    public Warnings warning(List<String> warning) {
        this.warning = warning;
        return this;
    }

    public Warnings addWarningItem(String warningItem) {
        this.warning.add(warningItem);
        return this;
    }

    /**
     * Get empty
     *
     * @return empty
     **/
    @JsonProperty("empty")
    public Boolean isisEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Warnings empty(Boolean empty) {
        this.empty = empty;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Warnings {\n" +
                "    warning: " + toIndentedString(warning) + "\n" +
                "    empty: " + toIndentedString(empty) + "\n" +
                "}";
        return sb;
    }
}
