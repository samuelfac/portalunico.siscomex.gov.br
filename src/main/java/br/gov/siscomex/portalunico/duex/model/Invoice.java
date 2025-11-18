package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder =
        {"additionalInformation", "typeCode"
        })

@XmlRootElement(name = "Invoice")
public class Invoice {

    @XmlElement(name = "additionalInformation")
    @ApiModelProperty(value = "")
    @Valid
    private AdditionalInformation additionalInformation = null;

    @XmlElement(name = "typeCode")
    @ApiModelProperty(value = "")
    private String typeCode = null;

    /**
     * Get additionalInformation
     *
     * @return additionalInformation
     **/
    @JsonProperty("additionalInformation")
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Invoice additionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Get typeCode
     *
     * @return typeCode
     **/
    @JsonProperty("typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Invoice typeCode(String typeCode) {
        this.typeCode = typeCode;
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

        String sb = "class Invoice {\n" +
                "    additionalInformation: " + toIndentedString(additionalInformation) + "\n" +
                "    typeCode: " + toIndentedString(typeCode) + "\n" +
                "}";
        return sb;
    }
}
