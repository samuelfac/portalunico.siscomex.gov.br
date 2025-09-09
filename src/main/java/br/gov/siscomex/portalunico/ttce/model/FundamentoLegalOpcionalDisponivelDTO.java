package br.gov.siscomex.portalunico.ttce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundamentoLegalOpcionalDisponivelDTO", propOrder =
        {"fundamentoLegal", "possuiAtributosAdicionais", "regime", "tributo"
        })

@XmlRootElement(name = "FundamentoLegalOpcionalDisponivelDTO")
/**
 * DTO que representa um Fundamento Legal opcional, disponível para o importador.
 **/
@ApiModel(description = "DTO que representa um Fundamento Legal opcional, disponível para o importador.")
public class FundamentoLegalOpcionalDisponivelDTO {

    @XmlElement(name = "fundamentoLegal", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CodigoNomeTipoFundamentoOpcionalDTO fundamentoLegal = null;

    @XmlElement(name = "possuiAtributosAdicionais", required = true)
    @ApiModelProperty(required = true, value = "Indicador se o Fundamento Opcional possui Atributos Adicionais. S-Sim N-Não")
    /**
     * Indicador se o Fundamento Opcional possui Atributos Adicionais. S-Sim N-Não
     **/
    private String possuiAtributosAdicionais = null;

    @XmlElement(name = "regime", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CodigoNomeRegimeDTO regime = null;

    @XmlElement(name = "tributo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CodigoNomeTributoDTO tributo = null;

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
     * Get fundamentoLegal
     *
     * @return fundamentoLegal
     **/
    @JsonProperty("fundamentoLegal")
    @NotNull
    public CodigoNomeTipoFundamentoOpcionalDTO getFundamentoLegal() {
        return fundamentoLegal;
    }

    public void setFundamentoLegal(CodigoNomeTipoFundamentoOpcionalDTO fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
    }

    public FundamentoLegalOpcionalDisponivelDTO fundamentoLegal(CodigoNomeTipoFundamentoOpcionalDTO fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
        return this;
    }

    /**
     * Indicador se o Fundamento Opcional possui Atributos Adicionais. S-Sim N-Não
     *
     * @return possuiAtributosAdicionais
     **/
    @JsonProperty("possuiAtributosAdicionais")
    @NotNull
    public String getPossuiAtributosAdicionais() {
        return possuiAtributosAdicionais;
    }

    public void setPossuiAtributosAdicionais(String possuiAtributosAdicionais) {
        this.possuiAtributosAdicionais = possuiAtributosAdicionais;
    }

    public FundamentoLegalOpcionalDisponivelDTO possuiAtributosAdicionais(String possuiAtributosAdicionais) {
        this.possuiAtributosAdicionais = possuiAtributosAdicionais;
        return this;
    }

    /**
     * Get regime
     *
     * @return regime
     **/
    @JsonProperty("regime")
    @NotNull
    public CodigoNomeRegimeDTO getRegime() {
        return regime;
    }

    public void setRegime(CodigoNomeRegimeDTO regime) {
        this.regime = regime;
    }

    public FundamentoLegalOpcionalDisponivelDTO regime(CodigoNomeRegimeDTO regime) {
        this.regime = regime;
        return this;
    }

    /**
     * Get tributo
     *
     * @return tributo
     **/
    @JsonProperty("tributo")
    @NotNull
    public CodigoNomeTributoDTO getTributo() {
        return tributo;
    }

    public void setTributo(CodigoNomeTributoDTO tributo) {
        this.tributo = tributo;
    }

    public FundamentoLegalOpcionalDisponivelDTO tributo(CodigoNomeTributoDTO tributo) {
        this.tributo = tributo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class FundamentoLegalOpcionalDisponivelDTO {\n" +
                "    fundamentoLegal: " + toIndentedString(fundamentoLegal) + "\n" +
                "    possuiAtributosAdicionais: " + toIndentedString(possuiAtributosAdicionais) + "\n" +
                "    regime: " + toIndentedString(regime) + "\n" +
                "    tributo: " + toIndentedString(tributo) + "\n" +
                "}";
        return sb;
    }
}
