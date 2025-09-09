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
@XmlType(name = "BrasileiroRegular", propOrder =
        {"licencaTNTI"
        })

@XmlRootElement(name = "BrasileiroRegular")
/**
 * Dados do transportador brasileiro regular
 **/
@ApiModel(description = "Dados do transportador brasileiro regular")
public class BrasileiroRegular {

    @XmlElement(name = "licencaTNTI")
    @ApiModelProperty(example = "1234/17", value = "Número da licença TNTI<br>Formato: NNNN/NN")
    /**
     * Número da licença TNTI<br>Formato: NNNN/NN
     **/
    private String licencaTNTI = null;

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
     * Número da licença TNTI&lt;br&gt;Formato: NNNN/NN
     *
     * @return licencaTNTI
     **/
    @JsonProperty("licencaTNTI")
    public String getLicencaTNTI() {
        return licencaTNTI;
    }

    public void setLicencaTNTI(String licencaTNTI) {
        this.licencaTNTI = licencaTNTI;
    }

    public BrasileiroRegular licencaTNTI(String licencaTNTI) {
        this.licencaTNTI = licencaTNTI;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class BrasileiroRegular {\n" +
                "    licencaTNTI: " + toIndentedString(licencaTNTI) + "\n" +
                "}";
        return sb;
    }
}
