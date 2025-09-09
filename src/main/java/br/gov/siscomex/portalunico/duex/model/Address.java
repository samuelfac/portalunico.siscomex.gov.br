package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder =
        {"line"
        })

@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "line", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AddressLineTextType line = null;

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
     * Get line
     *
     * @return line
     **/
    @JsonProperty("line")
    @NotNull
    public AddressLineTextType getLine() {
        return line;
    }

    public void setLine(AddressLineTextType line) {
        this.line = line;
    }

    public Address line(AddressLineTextType line) {
        this.line = line;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Address {\n" +
                "    line: " + toIndentedString(line) + "\n" +
                "}";
        return sb;
    }
}
