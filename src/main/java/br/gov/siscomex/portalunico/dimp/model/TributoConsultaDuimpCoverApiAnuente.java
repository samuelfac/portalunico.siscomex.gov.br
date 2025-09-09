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
@XmlType(name = "TributoConsultaDuimpCoverApiAnuente", propOrder =
        {"mercadoria", "tributosCalculados"
        })

@XmlRootElement(name = "TributoConsultaDuimpCoverApiAnuente")
/**
 * Dados dos Tributos.<br>Esses dados são retornados apenas para o anuente Gestor (SECEX)
 **/
@ApiModel(description = "Dados dos Tributos.<br>Esses dados são retornados apenas para o anuente Gestor (SECEX)")
public class TributoConsultaDuimpCoverApiAnuente {

    @XmlElement(name = "mercadoria")
    @ApiModelProperty(value = "")
    @Valid
    private MercadoriaDuimpConsultaCover mercadoria = null;

    @XmlElement(name = "tributosCalculados")
    @ApiModelProperty(value = "")
    @Valid
    private List<TributoCalculadoDuimpConsultaCover> tributosCalculados = null;

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
     * Get mercadoria
     *
     * @return mercadoria
     **/
    @JsonProperty("mercadoria")
    public MercadoriaDuimpConsultaCover getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(MercadoriaDuimpConsultaCover mercadoria) {
        this.mercadoria = mercadoria;
    }

    public TributoConsultaDuimpCoverApiAnuente mercadoria(MercadoriaDuimpConsultaCover mercadoria) {
        this.mercadoria = mercadoria;
        return this;
    }

    /**
     * Get tributosCalculados
     *
     * @return tributosCalculados
     **/
    @JsonProperty("tributosCalculados")
    public List<TributoCalculadoDuimpConsultaCover> getTributosCalculados() {
        return tributosCalculados;
    }

    public void setTributosCalculados(List<TributoCalculadoDuimpConsultaCover> tributosCalculados) {
        this.tributosCalculados = tributosCalculados;
    }

    public TributoConsultaDuimpCoverApiAnuente tributosCalculados(List<TributoCalculadoDuimpConsultaCover> tributosCalculados) {
        this.tributosCalculados = tributosCalculados;
        return this;
    }

    public TributoConsultaDuimpCoverApiAnuente addTributosCalculadosItem(TributoCalculadoDuimpConsultaCover tributosCalculadosItem) {
        this.tributosCalculados.add(tributosCalculadosItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class TributoConsultaDuimpCoverApiAnuente {\n" +
                "    mercadoria: " + toIndentedString(mercadoria) + "\n" +
                "    tributosCalculados: " + toIndentedString(tributosCalculados) + "\n" +
                "}";
        return sb;
    }
}
