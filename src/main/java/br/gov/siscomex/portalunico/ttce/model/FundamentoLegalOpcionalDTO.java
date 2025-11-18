package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundamentoLegalOpcionalDTO", propOrder =
        {"codigoTributo", "codigoRegime", "codigoFundamentoLegal", "codigoNomenclaturaAlternativa"
        })

@XmlRootElement(name = "FundamentoLegalOpcionalDTO")
/**
 * DTO que representa um Fundamento Legal opcional.
 **/
@ApiModel(description = "DTO que representa um Fundamento Legal opcional.")
public class FundamentoLegalOpcionalDTO {

    @XmlElement(name = "codigoTributo", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código do Tributo.")
    /**
     * Código do Tributo.
     **/
    private Long codigoTributo = null;

    @XmlElement(name = "codigoRegime", required = true)
    @ApiModelProperty(example = "1", required = true, value = "Código identificador do Regime Tributário.")
    /**
     * Código identificador do Regime Tributário.
     **/
    private Long codigoRegime = null;

    @XmlElement(name = "codigoFundamentoLegal", required = true)
    @ApiModelProperty(example = "15", required = true, value = "Código identificador do Fundamento Legal, com até 4 dígitos.")
    /**
     * Código identificador do Fundamento Legal, com até 4 dígitos.
     **/
    private Long codigoFundamentoLegal = null;

    @XmlElement(name = "codigoNomenclaturaAlternativa")
    @ApiModelProperty(example = "38151210", value = "Código da nomenclatura alternativa, pode ser uma NALADI ou NCM SH. É um campo opcional.")
    /**
     * Código da nomenclatura alternativa, pode ser uma NALADI ou NCM SH. É um campo opcional.
     **/
    private String codigoNomenclaturaAlternativa = null;

    /**
     * Código do Tributo.
     *
     * @return codigoTributo
     **/
    @JsonProperty("codigoTributo")
    @NotNull
    public Long getCodigoTributo() {
        return codigoTributo;
    }

    public void setCodigoTributo(Long codigoTributo) {
        this.codigoTributo = codigoTributo;
    }

    public FundamentoLegalOpcionalDTO codigoTributo(Long codigoTributo) {
        this.codigoTributo = codigoTributo;
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

    /**
     * Código identificador do Regime Tributário.
     *
     * @return codigoRegime
     **/
    @JsonProperty("codigoRegime")
    @NotNull
    public Long getCodigoRegime() {
        return codigoRegime;
    }

    public void setCodigoRegime(Long codigoRegime) {
        this.codigoRegime = codigoRegime;
    }

    /**
     * Código identificador do Fundamento Legal, com até 4 dígitos.
     *
     * @return codigoFundamentoLegal
     **/
    @JsonProperty("codigoFundamentoLegal")
    @NotNull
    public Long getCodigoFundamentoLegal() {
        return codigoFundamentoLegal;
    }

    public void setCodigoFundamentoLegal(Long codigoFundamentoLegal) {
        this.codigoFundamentoLegal = codigoFundamentoLegal;
    }

    public FundamentoLegalOpcionalDTO codigoFundamentoLegal(Long codigoFundamentoLegal) {
        this.codigoFundamentoLegal = codigoFundamentoLegal;
        return this;
    }

    /**
     * Código da nomenclatura alternativa, pode ser uma NALADI ou NCM SH. É um campo opcional.
     *
     * @return codigoNomenclaturaAlternativa
     **/
    @JsonProperty("codigoNomenclaturaAlternativa")
    public String getCodigoNomenclaturaAlternativa() {
        return codigoNomenclaturaAlternativa;
    }

    public void setCodigoNomenclaturaAlternativa(String codigoNomenclaturaAlternativa) {
        this.codigoNomenclaturaAlternativa = codigoNomenclaturaAlternativa;
    }

    public FundamentoLegalOpcionalDTO codigoNomenclaturaAlternativa(String codigoNomenclaturaAlternativa) {
        this.codigoNomenclaturaAlternativa = codigoNomenclaturaAlternativa;
        return this;
    }

    public FundamentoLegalOpcionalDTO codigoRegime(Long codigoRegime) {
        this.codigoRegime = codigoRegime;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class FundamentoLegalOpcionalDTO {\n" +
                "    codigoTributo: " + toIndentedString(codigoTributo) + "\n" +
                "    codigoRegime: " + toIndentedString(codigoRegime) + "\n" +
                "    codigoFundamentoLegal: " + toIndentedString(codigoFundamentoLegal) + "\n" +
                "    codigoNomenclaturaAlternativa: " + toIndentedString(codigoNomenclaturaAlternativa) + "\n" +
                "}";
        return sb;
    }
}
