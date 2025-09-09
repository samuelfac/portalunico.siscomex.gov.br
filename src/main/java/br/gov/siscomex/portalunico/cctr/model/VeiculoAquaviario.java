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
@XmlType(name = "VeiculoAquaviario", propOrder =
        {"codigoTipoModal", "dataEncerramentoManifesto", "codigoIMO", "numeroEscala"
        })

@XmlRootElement(name = "VeiculoAquaviario")
/**
 * Dados do veículo aquaviário
 **/
@ApiModel(description = "Dados do veículo aquaviário")
public class VeiculoAquaviario {

    @XmlElement(name = "codigoTipoModal", required = true)
    @ApiModelProperty(example = "03", required = true, value = "Código do tipo do modal<br>Tamanho: 2<br>Formato: ((")
    /**
     * Código do tipo do modal<br>Tamanho: 2<br>Formato: ((
     **/
    private String codigoTipoModal = null;

    @XmlElement(name = "dataEncerramentoManifesto", required = true)
    @ApiModelProperty(example = "2016-12-18", required = true, value = "Data de encerramento do manifesto<br>Formato: AAAA-MM-DD")
    /**
     * Data de encerramento do manifesto<br>Formato: AAAA-MM-DD
     **/
    private String dataEncerramentoManifesto = null;

    @XmlElement(name = "codigoIMO", required = true)
    @ApiModelProperty(example = "1557345", required = true, value = "Código IMO da embarcação<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA")
    /**
     * Código IMO da embarcação<br>Tamanho: 15<br>Formato: AAAAAAAAAAAAAAA
     **/
    private String codigoIMO = null;

    @XmlElement(name = "numeroEscala", required = true)
    @ApiModelProperty(example = "19123456", required = true, value = "Número da escala<br>Tamanho: 11<br>Formato: AAAAAAAAAAA")
    /**
     * Número da escala<br>Tamanho: 11<br>Formato: AAAAAAAAAAA
     **/
    private String numeroEscala = null;

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
     * Código do tipo do modal&lt;br&gt;Tamanho: 2&lt;br&gt;Formato: ((
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

    public VeiculoAquaviario codigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
        return this;
    }

    /**
     * Data de encerramento do manifesto&lt;br&gt;Formato: AAAA-MM-DD
     *
     * @return dataEncerramentoManifesto
     **/
    @JsonProperty("dataEncerramentoManifesto")
    @NotNull
    public String getDataEncerramentoManifesto() {
        return dataEncerramentoManifesto;
    }

    public void setDataEncerramentoManifesto(String dataEncerramentoManifesto) {
        this.dataEncerramentoManifesto = dataEncerramentoManifesto;
    }

    public VeiculoAquaviario dataEncerramentoManifesto(String dataEncerramentoManifesto) {
        this.dataEncerramentoManifesto = dataEncerramentoManifesto;
        return this;
    }

    /**
     * Código IMO da embarcação&lt;br&gt;Tamanho: 15&lt;br&gt;Formato: AAAAAAAAAAAAAAA
     *
     * @return codigoIMO
     **/
    @JsonProperty("codigoIMO")
    @NotNull
    public String getCodigoIMO() {
        return codigoIMO;
    }

    public void setCodigoIMO(String codigoIMO) {
        this.codigoIMO = codigoIMO;
    }

    public VeiculoAquaviario codigoIMO(String codigoIMO) {
        this.codigoIMO = codigoIMO;
        return this;
    }

    /**
     * Número da escala&lt;br&gt;Tamanho: 11&lt;br&gt;Formato: AAAAAAAAAAA
     *
     * @return numeroEscala
     **/
    @JsonProperty("numeroEscala")
    @NotNull
    public String getNumeroEscala() {
        return numeroEscala;
    }

    public void setNumeroEscala(String numeroEscala) {
        this.numeroEscala = numeroEscala;
    }

    public VeiculoAquaviario numeroEscala(String numeroEscala) {
        this.numeroEscala = numeroEscala;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class VeiculoAquaviario {\n" +
                "    codigoTipoModal: " + toIndentedString(codigoTipoModal) + "\n" +
                "    dataEncerramentoManifesto: " + toIndentedString(dataEncerramentoManifesto) + "\n" +
                "    codigoIMO: " + toIndentedString(codigoIMO) + "\n" +
                "    numeroEscala: " + toIndentedString(numeroEscala) + "\n" +
                "}";
        return sb;
    }
}
