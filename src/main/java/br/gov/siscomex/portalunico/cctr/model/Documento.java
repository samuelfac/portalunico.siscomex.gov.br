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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", propOrder =
        {"veiculo", "cargaSolta", "granel", "numeroDUIMP"
        })

@XmlRootElement(name = "Documento")
/**
 * Documento de carga de importação envolvido na entrega (DUIMP)<br>Para Desunitização, pelo menos 1 tipo (Carga Solta, Granel ou Veículo) é obrigatório.<br>Para Recepção e Entrega, os 3 tipos são opcionais.
 **/
@ApiModel(description = "Documento de carga de importação envolvido na entrega (DUIMP)<br>Para Desunitização, pelo menos 1 tipo (Carga Solta, Granel ou Veículo) é obrigatório.<br>Para Recepção e Entrega, os 3 tipos são opcionais.")
public class Documento {

    @XmlElement(name = "veiculo")
    @ApiModelProperty(value = "")
    @Valid
    private Veiculos veiculo = null;

    @XmlElement(name = "cargaSolta")
    @ApiModelProperty(value = "")
    @Valid
    private CargaSolta cargaSolta = null;

    @XmlElement(name = "granel")
    @ApiModelProperty(value = "")
    @Valid
    private Granel granel = null;

    @XmlElement(name = "numeroDUIMP", required = true)
    @ApiModelProperty(example = "24BR00001058587", required = true, value = "Número da DUIMP<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV")
    /**
     * Número da DUIMP<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV
     **/
    private String numeroDUIMP = null;

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
     * Get veiculo
     *
     * @return veiculo
     **/
    @JsonProperty("veiculo")
    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public Documento veiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
        return this;
    }

    /**
     * Get cargaSolta
     *
     * @return cargaSolta
     **/
    @JsonProperty("cargaSolta")
    public CargaSolta getCargaSolta() {
        return cargaSolta;
    }

    public void setCargaSolta(CargaSolta cargaSolta) {
        this.cargaSolta = cargaSolta;
    }

    public Documento cargaSolta(CargaSolta cargaSolta) {
        this.cargaSolta = cargaSolta;
        return this;
    }

    /**
     * Get granel
     *
     * @return granel
     **/
    @JsonProperty("granel")
    public Granel getGranel() {
        return granel;
    }

    public void setGranel(Granel granel) {
        this.granel = granel;
    }

    public Documento granel(Granel granel) {
        this.granel = granel;
        return this;
    }

    /**
     * Número da DUIMP&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD &lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV
     *
     * @return numeroDUIMP
     **/
    @JsonProperty("numeroDUIMP")
    @NotNull
    public String getNumeroDUIMP() {
        return numeroDUIMP;
    }

    public void setNumeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
    }

    public Documento numeroDUIMP(String numeroDUIMP) {
        this.numeroDUIMP = numeroDUIMP;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Documento {\n" +
                "    veiculo: " + toIndentedString(veiculo) + "\n" +
                "    cargaSolta: " + toIndentedString(cargaSolta) + "\n" +
                "    granel: " + toIndentedString(granel) + "\n" +
                "    numeroDUIMP: " + toIndentedString(numeroDUIMP) + "\n" +
                "}";
        return sb;
    }
}
