package br.gov.siscomex.portalunico.dimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SefazTributoAplicadoCover", propOrder =
        {"fundamentoLegal", "regime", "atributosDinamicos", "tributo"
        })

@XmlRootElement(name = "SefazTributoAplicadoCover")
/**
 * Dados de um tributo aplicado
 **/
@ApiModel(description = "Dados de um tributo aplicado")
public class SefazTributoAplicadoCover {

    @XmlElement(name = "fundamentoLegal")
    @ApiModelProperty(value = "")
    @Valid
    private FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal = null;

    @XmlElement(name = "regime")
    @ApiModelProperty(value = "")
    @Valid
    private RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime = null;

    @XmlElement(name = "atributosDinamicos")
    @ApiModelProperty(value = "Lista de atributos dinâmicos dos tributos")
    @Valid
    /**
     * Lista de atributos dinâmicos dos tributos
     **/
    private List<SefazAtributoTributoCover> atributosDinamicos = null;

    @XmlElement(name = "tributo")
    @ApiModelProperty(value = "")
    @Valid
    private TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo = null;

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
    public FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio getFundamentoLegal() {
        return fundamentoLegal;
    }

    public void setFundamentoLegal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
    }

    public SefazTributoAplicadoCover fundamentoLegal(FundamentoLegalDoRegimeTributrioDeImportaoObjetoCompostoPelosAtributosCdigoEDescrio fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
        return this;
    }

    /**
     * Get regime
     *
     * @return regime
     **/
    @JsonProperty("regime")
    public RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio getRegime() {
        return regime;
    }

    public void setRegime(RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime) {
        this.regime = regime;
    }

    public SefazTributoAplicadoCover regime(RegimeTributrioObjetoCompostoPelosAtributosCdigoEDescrio regime) {
        this.regime = regime;
        return this;
    }

    /**
     * Lista de atributos dinâmicos dos tributos
     *
     * @return atributosDinamicos
     **/
    @JsonProperty("atributosDinamicos")
    public List<SefazAtributoTributoCover> getAtributosDinamicos() {
        return atributosDinamicos;
    }

    public void setAtributosDinamicos(List<SefazAtributoTributoCover> atributosDinamicos) {
        this.atributosDinamicos = atributosDinamicos;
    }

    public SefazTributoAplicadoCover atributosDinamicos(List<SefazAtributoTributoCover> atributosDinamicos) {
        this.atributosDinamicos = atributosDinamicos;
        return this;
    }

    public SefazTributoAplicadoCover addAtributosDinamicosItem(SefazAtributoTributoCover atributosDinamicosItem) {
        this.atributosDinamicos.add(atributosDinamicosItem);
        return this;
    }

    /**
     * Get tributo
     *
     * @return tributo
     **/
    @JsonProperty("tributo")
    public TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio getTributo() {
        return tributo;
    }

    public void setTributo(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo) {
        this.tributo = tributo;
    }

    public SefazTributoAplicadoCover tributo(TipoDeTributoObjetoCompostoPelosAtributosCdigoEDescrio tributo) {
        this.tributo = tributo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazTributoAplicadoCover {\n" +
                "    fundamentoLegal: " + toIndentedString(fundamentoLegal) + "\n" +
                "    regime: " + toIndentedString(regime) + "\n" +
                "    atributosDinamicos: " + toIndentedString(atributosDinamicos) + "\n" +
                "    tributo: " + toIndentedString(tributo) + "\n" +
                "}";
        return sb;
    }
}
