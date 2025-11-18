package br.gov.siscomex.portalunico.cctr.model;

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
@XmlType(name = "VeiculoAereo", propOrder =
        {"codigoTipoModal", "prefixoAeronave", "numeroVoo", "dataPartidaProcedencia"
        })

@XmlRootElement(name = "VeiculoAereo")
/**
 * Dados do veículo aéreo
 **/
@ApiModel(description = "Dados do veículo aéreo")
public class VeiculoAereo {

    @XmlElement(name = "codigoTipoModal", required = true)
    @ApiModelProperty(example = "04", required = true, value = "Codigo do tipo de modal<br>Tamanho: 2<br>Formato: NN")
    /**
     * Codigo do tipo de modal<br>Tamanho: 2<br>Formato: NN
     **/
    private String codigoTipoModal = null;

    @XmlElement(name = "prefixoAeronave", required = true)
    @ApiModelProperty(example = "LMF1203", required = true, value = "Prefixo aeronave<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA")
    /**
     * Prefixo aeronave<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA
     **/
    private String prefixoAeronave = null;

    @XmlElement(name = "numeroVoo", required = true)
    @ApiModelProperty(example = "70544", required = true, value = "Número do vôo<br>Tamanho: 9<br>Formato: AAAAAAAAA")
    /**
     * Número do vôo<br>Tamanho: 9<br>Formato: AAAAAAAAA
     **/
    private String numeroVoo = null;

    @XmlElement(name = "dataPartidaProcedencia", required = true)
    @ApiModelProperty(example = "2016-12-18", required = true, value = "Data de partida da procedencia<br>Formato: AAAA-MM-DD")
    /**
     * Data de partida da procedencia<br>Formato: AAAA-MM-DD
     **/
    private String dataPartidaProcedencia = null;

    /**
     * Codigo do tipo de modal&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: NN
     *
     * @return codigoTipoModal
     **/
    @JsonProperty("codigoTipoModal")
    @NotNull
    public String getCodigoTipoModal() {
        return codigoTipoModal;
    }

    public void setCodigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
    }

    public VeiculoAereo codigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
        return this;
    }

    /**
     * Prefixo aeronave&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: AAAAAAAAAAAAAAA
     *
     * @return prefixoAeronave
     **/
    @JsonProperty("prefixoAeronave")
    @NotNull
    public String getPrefixoAeronave() {
        return prefixoAeronave;
    }

    public void setPrefixoAeronave(String prefixoAeronave) {
        this.prefixoAeronave = prefixoAeronave;
    }

    public VeiculoAereo prefixoAeronave(String prefixoAeronave) {
        this.prefixoAeronave = prefixoAeronave;
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
     * Número do vôo&lt;br&gt;Tamanho: 9&lt;br&gt;Formato: AAAAAAAAA
     *
     * @return numeroVoo
     **/
    @JsonProperty("numeroVoo")
    @NotNull
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    /**
     * Data de partida da procedencia&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataPartidaProcedencia
     **/
    @JsonProperty("dataPartidaProcedencia")
    @NotNull
    public String getDataPartidaProcedencia() {
        return dataPartidaProcedencia;
    }

    public void setDataPartidaProcedencia(String dataPartidaProcedencia) {
        this.dataPartidaProcedencia = dataPartidaProcedencia;
    }

    public VeiculoAereo dataPartidaProcedencia(String dataPartidaProcedencia) {
        this.dataPartidaProcedencia = dataPartidaProcedencia;
        return this;
    }

    public VeiculoAereo numeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoAereo {\n" +
                "    codigoTipoModal: " + toIndentedString(codigoTipoModal) + "\n" +
                "    prefixoAeronave: " + toIndentedString(prefixoAeronave) + "\n" +
                "    numeroVoo: " + toIndentedString(numeroVoo) + "\n" +
                "    dataPartidaProcedencia: " + toIndentedString(dataPartidaProcedencia) + "\n" +
                "}";
        return sb;
    }
}
