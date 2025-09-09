package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "DocumentoCarga", propOrder =
        {"numeroDUE", "cargaSoltaVeiculo", "numeroRUC", "granel"
        })

@XmlRootElement(name = "DocumentoCarga")
/**
 * Dados das cargas do tipo solta e granel
 **/
@ApiModel(description = "Dados das cargas do tipo solta e granel")
public class DocumentoCarga {

    @XmlElement(name = "numeroDUE", required = true)
    @ApiModelProperty(example = "17BR0000451567", required = true, value = "Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV")
    /**
     * Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV
     **/
    private String numeroDUE = null;

    @XmlElement(name = "cargaSoltaVeiculo", required = true)
    @ApiModelProperty(required = true, value = "Lista de cargas soltas/veículos")
    @Valid
    /**
     * Lista de cargas soltas/veículos
     **/
    private List<CargaSoltaVeiculo> cargaSoltaVeiculo = new ArrayList<>();

    @XmlElement(name = "numeroRUC", required = true)
    @ApiModelProperty(example = "7BR276574827551833214353477473070", required = true, value = "Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
    /**
     * Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     **/
    private String numeroRUC = null;

    @XmlElement(name = "granel", required = true)
    @ApiModelProperty(required = true, value = "Lista de graneis")
    @Valid
    /**
     * Lista de graneis
     **/
    private List<Granel> granel = new ArrayList<>();

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
     * Número da DU-E&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD &lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV
     *
     * @return numeroDUE
     **/
    @JsonProperty("numeroDUE")
    @NotNull
    public String getNumeroDUE() {
        return numeroDUE;
    }

    public void setNumeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
    }

    public DocumentoCarga numeroDUE(String numeroDUE) {
        this.numeroDUE = numeroDUE;
        return this;
    }

    /**
     * Lista de cargas soltas/veículos
     *
     * @return cargaSoltaVeiculo
     **/
    @JsonProperty("cargaSoltaVeiculo")
    @NotNull
    public List<CargaSoltaVeiculo> getCargaSoltaVeiculo() {
        return cargaSoltaVeiculo;
    }

    public void setCargaSoltaVeiculo(List<CargaSoltaVeiculo> cargaSoltaVeiculo) {
        this.cargaSoltaVeiculo = cargaSoltaVeiculo;
    }

    public DocumentoCarga cargaSoltaVeiculo(List<CargaSoltaVeiculo> cargaSoltaVeiculo) {
        this.cargaSoltaVeiculo = cargaSoltaVeiculo;
        return this;
    }

    public DocumentoCarga addCargaSoltaVeiculoItem(CargaSoltaVeiculo cargaSoltaVeiculoItem) {
        this.cargaSoltaVeiculo.add(cargaSoltaVeiculoItem);
        return this;
    }

    /**
     * Número da RUC ou RUC Master&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     *
     * @return numeroRUC
     **/
    @JsonProperty("numeroRUC")
    @NotNull
    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public DocumentoCarga numeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
        return this;
    }

    /**
     * Lista de graneis
     *
     * @return granel
     **/
    @JsonProperty("granel")
    @NotNull
    public List<Granel> getGranel() {
        return granel;
    }

    public void setGranel(List<Granel> granel) {
        this.granel = granel;
    }

    public DocumentoCarga granel(List<Granel> granel) {
        this.granel = granel;
        return this;
    }

    public DocumentoCarga addGranelItem(Granel granelItem) {
        this.granel.add(granelItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DocumentoCarga {\n" +
                "    numeroDUE: " + toIndentedString(numeroDUE) + "\n" +
                "    cargaSoltaVeiculo: " + toIndentedString(cargaSoltaVeiculo) + "\n" +
                "    numeroRUC: " + toIndentedString(numeroRUC) + "\n" +
                "    granel: " + toIndentedString(granel) + "\n" +
                "}";
        return sb;
    }
}
