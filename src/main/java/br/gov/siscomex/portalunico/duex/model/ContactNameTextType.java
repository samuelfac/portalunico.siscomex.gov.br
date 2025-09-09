package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactNameTextType", propOrder =
        {"value"
        })

@XmlRootElement(name = "ContactNameTextType")
public class ContactNameTextType {

    @XmlElement(name = "value")
    @ApiModelProperty(value = "")
    private String value = null;

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
     * Get value
     *
     * @return value
     **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ContactNameTextType value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ContactNameTextType {\n" +
                "    value: " + toIndentedString(value) + "\n" +
                "}";
        return sb;
    }
}
