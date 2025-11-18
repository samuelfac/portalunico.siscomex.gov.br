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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TratamentoTributarioDTO", propOrder =
        {"tributo", "regime", "fundamentoLegal", "mercadorias"
        })

@XmlRootElement(name = "TratamentoTributarioDTO")
/**
 * DTO que representa um Tratamento Tributário de Importação.
 **/
@ApiModel(description = "DTO que representa um Tratamento Tributário de Importação.")
public class TratamentoTributarioDTO {

    @XmlElement(name = "tributo", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CodigoNomeTributoDTO tributo = null;

    @XmlElement(name = "regime", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CodigoNomeRegimeDTO regime = null;

    @XmlElement(name = "fundamentoLegal", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private FundamentoLegalDTO fundamentoLegal = null;

    @XmlElement(name = "mercadorias", required = true)
    @ApiModelProperty(required = true, value = "Lista de mercadorias (NCMs) que se enquadram nesse Tratamento Tributário mas que possuem características específicas (lista de Atributos).")
    @Valid
    /**
     * Lista de mercadorias (NCMs) que se enquadram nesse Tratamento Tributário mas que possuem características específicas (lista de Atributos).
     **/
    private List<MercadoriaDTO> mercadorias = new ArrayList<>();

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

    public TratamentoTributarioDTO regime(CodigoNomeRegimeDTO regime) {
        this.regime = regime;
        return this;
    }

    public TratamentoTributarioDTO tributo(CodigoNomeTributoDTO tributo) {
        this.tributo = tributo;
        return this;
    }

    /**
     * Get fundamentoLegal
     *
     * @return fundamentoLegal
     **/
    @JsonProperty("fundamentoLegal")
    @NotNull
    public FundamentoLegalDTO getFundamentoLegal() {
        return fundamentoLegal;
    }

    public void setFundamentoLegal(FundamentoLegalDTO fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
    }

    /**
     * Lista de mercadorias (NCMs) que se enquadram nesse Tratamento Tributário mas que possuem características específicas (lista de Atributos).
     *
     * @return mercadorias
     **/
    @JsonProperty("mercadorias")
    @NotNull
    public List<MercadoriaDTO> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<MercadoriaDTO> mercadorias) {
        this.mercadorias = mercadorias;
    }

    public TratamentoTributarioDTO mercadorias(List<MercadoriaDTO> mercadorias) {
        this.mercadorias = mercadorias;
        return this;
    }

    public TratamentoTributarioDTO addMercadoriasItem(MercadoriaDTO mercadoriasItem) {
        this.mercadorias.add(mercadoriasItem);
        return this;
    }

    public TratamentoTributarioDTO fundamentoLegal(FundamentoLegalDTO fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TratamentoTributarioDTO {\n" +
                "    tributo: " + toIndentedString(tributo) + "\n" +
                "    regime: " + toIndentedString(regime) + "\n" +
                "    fundamentoLegal: " + toIndentedString(fundamentoLegal) + "\n" +
                "    mercadorias: " + toIndentedString(mercadorias) + "\n" +
                "}";
        return sb;
    }
}
