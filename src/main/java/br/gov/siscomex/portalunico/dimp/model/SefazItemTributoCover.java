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
@XmlType(name = "SefazItemTributoCover", propOrder =
        {"dadosMercadoria", "valorMercadoria", "tributosAplicados", "calculosTributos", "atributosFundamentoLegalDuimp"
        })

@XmlRootElement(name = "SefazItemTributoCover")
/**
 * Dados da mercadoria e dos tributos do item
 **/
@ApiModel(description = "Dados da mercadoria e dos tributos do item")
public class SefazItemTributoCover {

    @XmlElement(name = "dadosMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private SefazDadosMercadoriaCover dadosMercadoria = null;

    @XmlElement(name = "valorMercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private SefazValorMercadoriaCover valorMercadoria = null;

    @XmlElement(name = "tributosAplicados")
    @ApiModelProperty(value = "Lista de tributos aplicados")
    @Valid
    /**
     * Lista de tributos aplicados
     **/
    private List<SefazTributoAplicadoCover> tributosAplicados = null;

    @XmlElement(name = "calculosTributos")
    @ApiModelProperty(value = "Lista de tributos calculados")
    @Valid
    /**
     * Lista de tributos calculados
     **/
    private List<SefazCalculoTributoCover> calculosTributos = null;

    @XmlElement(name = "atributosFundamentoLegalDuimp")
    @ApiModelProperty(value = "Lista de atributos dinâmicos informativos de fundamento legal")
    @Valid
    /**
     * Lista de atributos dinâmicos informativos de fundamento legal
     **/
    private List<SefazAtributoCover> atributosFundamentoLegalDuimp = null;

    /**
     * Get dadosMercadoria
     *
     * @return dadosMercadoria
     **/
    @JsonProperty("dadosMercadoria")
    public SefazDadosMercadoriaCover getDadosMercadoria() {
        return dadosMercadoria;
    }

    public void setDadosMercadoria(SefazDadosMercadoriaCover dadosMercadoria) {
        this.dadosMercadoria = dadosMercadoria;
    }

    public SefazItemTributoCover dadosMercadoria(SefazDadosMercadoriaCover dadosMercadoria) {
        this.dadosMercadoria = dadosMercadoria;
        return this;
    }

    /**
     * Get valorMercadoria
     *
     * @return valorMercadoria
     **/
    @JsonProperty("valorMercadoria")
    public SefazValorMercadoriaCover getValorMercadoria() {
        return valorMercadoria;
    }

    public void setValorMercadoria(SefazValorMercadoriaCover valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
    }

    public SefazItemTributoCover valorMercadoria(SefazValorMercadoriaCover valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
        return this;
    }

    /**
     * Lista de tributos aplicados
     *
     * @return tributosAplicados
     **/
    @JsonProperty("tributosAplicados")
    public List<SefazTributoAplicadoCover> getTributosAplicados() {
        return tributosAplicados;
    }

    public void setTributosAplicados(List<SefazTributoAplicadoCover> tributosAplicados) {
        this.tributosAplicados = tributosAplicados;
    }

    public SefazItemTributoCover tributosAplicados(List<SefazTributoAplicadoCover> tributosAplicados) {
        this.tributosAplicados = tributosAplicados;
        return this;
    }

    public SefazItemTributoCover addTributosAplicadosItem(SefazTributoAplicadoCover tributosAplicadosItem) {
        this.tributosAplicados.add(tributosAplicadosItem);
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
     * Lista de tributos calculados
     *
     * @return calculosTributos
     **/
    @JsonProperty("calculosTributos")
    public List<SefazCalculoTributoCover> getCalculosTributos() {
        return calculosTributos;
    }

    public void setCalculosTributos(List<SefazCalculoTributoCover> calculosTributos) {
        this.calculosTributos = calculosTributos;
    }

    public SefazItemTributoCover calculosTributos(List<SefazCalculoTributoCover> calculosTributos) {
        this.calculosTributos = calculosTributos;
        return this;
    }

    /**
     * Lista de atributos dinâmicos informativos de fundamento legal
     *
     * @return atributosFundamentoLegalDuimp
     **/
    @JsonProperty("atributosFundamentoLegalDuimp")
    public List<SefazAtributoCover> getAtributosFundamentoLegalDuimp() {
        return atributosFundamentoLegalDuimp;
    }

    public void setAtributosFundamentoLegalDuimp(List<SefazAtributoCover> atributosFundamentoLegalDuimp) {
        this.atributosFundamentoLegalDuimp = atributosFundamentoLegalDuimp;
    }

    public SefazItemTributoCover atributosFundamentoLegalDuimp(List<SefazAtributoCover> atributosFundamentoLegalDuimp) {
        this.atributosFundamentoLegalDuimp = atributosFundamentoLegalDuimp;
        return this;
    }

    public SefazItemTributoCover addAtributosFundamentoLegalDuimpItem(SefazAtributoCover atributosFundamentoLegalDuimpItem) {
        this.atributosFundamentoLegalDuimp.add(atributosFundamentoLegalDuimpItem);
        return this;
    }

    public SefazItemTributoCover addCalculosTributosItem(SefazCalculoTributoCover calculosTributosItem) {
        this.calculosTributos.add(calculosTributosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class SefazItemTributoCover {\n" +
                "    dadosMercadoria: " + toIndentedString(dadosMercadoria) + "\n" +
                "    valorMercadoria: " + toIndentedString(valorMercadoria) + "\n" +
                "    tributosAplicados: " + toIndentedString(tributosAplicados) + "\n" +
                "    calculosTributos: " + toIndentedString(calculosTributos) + "\n" +
                "    atributosFundamentoLegalDuimp: " + toIndentedString(atributosFundamentoLegalDuimp) + "\n" +
                "}";
        return sb;
    }
}
