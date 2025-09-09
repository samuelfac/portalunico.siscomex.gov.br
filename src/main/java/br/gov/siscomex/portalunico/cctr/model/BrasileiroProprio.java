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
@XmlType(name = "BrasileiroProprio", propOrder =
        {"dataVencimentoLicenca", "licencaTNTI"
        })

@XmlRootElement(name = "BrasileiroProprio")
/**
 * Dados do transportador brasileiro próprio
 **/
@ApiModel(description = "Dados do transportador brasileiro próprio")
public class BrasileiroProprio {

    @XmlElement(name = "dataVencimentoLicenca")
    @ApiModelProperty(example = "2019-05-30", value = "Data de vencimento da licença TNTI<br>Formato: AAAA-MM-DD")
    /**
     * Data de vencimento da licença TNTI<br>Formato: AAAA-MM-DD
     **/
    private String dataVencimentoLicenca = null;

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
     * Data de vencimento da licença TNTI&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataVencimentoLicenca
     **/
    @JsonProperty("dataVencimentoLicenca")
    public String getDataVencimentoLicenca() {
        return dataVencimentoLicenca;
    }

    public void setDataVencimentoLicenca(String dataVencimentoLicenca) {
        this.dataVencimentoLicenca = dataVencimentoLicenca;
    }

    public BrasileiroProprio dataVencimentoLicenca(String dataVencimentoLicenca) {
        this.dataVencimentoLicenca = dataVencimentoLicenca;
        return this;
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

    public BrasileiroProprio licencaTNTI(String licencaTNTI) {
        this.licencaTNTI = licencaTNTI;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class BrasileiroProprio {\n" +
                "    dataVencimentoLicenca: " + toIndentedString(dataVencimentoLicenca) + "\n" +
                "    licencaTNTI: " + toIndentedString(licencaTNTI) + "\n" +
                "}";
        return sb;
    }
}
