package br.gov.siscomex.portalunico.cctr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cargas", propOrder =
        {"quantidadeManifestada", "numeroDue", "tipoCarga", "numeroRuc", "siglaUnidadeMedida"
        })

@XmlRootElement(name = "Cargas")
/**
 * Lista de DUE’s e/ou RUC’s vinculados ao documento de transporte
 **/
@ApiModel(description = "Lista de DUE’s e/ou RUC’s vinculados ao documento de transporte")
public class Cargas {

    @XmlElement(name = "quantidadeManifestada")
    @ApiModelProperty(example = "100.0", value = "quantidade Manifestada")
    @Valid
    /**
     * quantidade Manifestada
     **/
    private BigDecimal quantidadeManifestada = null;

    @XmlElement(name = "numeroDue")
    @ApiModelProperty(example = "19BR0003000299", value = "Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV")
    /**
     * Número da DU-E<br>Tamanho: 14<br>Formato: AABRSSSSSSSSSD <br>Descrição Formato<br>AA - Ano<br>BR - Brasil<br>SSSSSSSSS - Numeração sequencial<br>D - DV
     **/
    private String numeroDue = null;

    @XmlElement(name = "tipoCarga")
    @ApiModelProperty(value = "")
    @Valid
    private ItemDTO tipoCarga = null;

    @XmlElement(name = "numeroRuc")
    @ApiModelProperty(example = "9BR00000000100000000000000000016630", value = "Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN")
    /**
     * Número da RUC ou RUC Master<br>Tamanho mínimo: 13<br>Tamanho máximo: 35<br>Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     **/
    private String numeroRuc = null;

    @XmlElement(name = "siglaUnidadeMedida")
    @ApiModelProperty(example = "un", value = "Sigla da Unidade de Medida")
    /**
     * Sigla da Unidade de Medida
     **/
    private String siglaUnidadeMedida = null;

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
     * quantidade Manifestada
     *
     * @return quantidadeManifestada
     **/
    @JsonProperty("quantidadeManifestada")
    public BigDecimal getQuantidadeManifestada() {
        return quantidadeManifestada;
    }

    public void setQuantidadeManifestada(BigDecimal quantidadeManifestada) {
        this.quantidadeManifestada = quantidadeManifestada;
    }

    public Cargas quantidadeManifestada(BigDecimal quantidadeManifestada) {
        this.quantidadeManifestada = quantidadeManifestada;
        return this;
    }

    /**
     * Número da DU-E&lt;br&gt;Tamanho: 14&lt;br&gt;Formato: AABRSSSSSSSSSD &lt;br&gt;Descrição Formato&lt;br&gt;AA - Ano&lt;br&gt;BR - Brasil&lt;br&gt;SSSSSSSSS - Numeração sequencial&lt;br&gt;D - DV
     *
     * @return numeroDue
     **/
    @JsonProperty("numeroDue")
    public String getNumeroDue() {
        return numeroDue;
    }

    public void setNumeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
    }

    public Cargas numeroDue(String numeroDue) {
        this.numeroDue = numeroDue;
        return this;
    }

    /**
     * Get tipoCarga
     *
     * @return tipoCarga
     **/
    @JsonProperty("tipoCarga")
    public ItemDTO getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(ItemDTO tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public Cargas tipoCarga(ItemDTO tipoCarga) {
        this.tipoCarga = tipoCarga;
        return this;
    }

    /**
     * Número da RUC ou RUC Master&lt;br&gt;Tamanho mínimo: 13&lt;br&gt;Tamanho máximo: 35&lt;br&gt;Formato: NAANNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
     *
     * @return numeroRuc
     **/
    @JsonProperty("numeroRuc")
    public String getNumeroRuc() {
        return numeroRuc;
    }

    public void setNumeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
    }

    public Cargas numeroRuc(String numeroRuc) {
        this.numeroRuc = numeroRuc;
        return this;
    }

    /**
     * Sigla da Unidade de Medida
     *
     * @return siglaUnidadeMedida
     **/
    @JsonProperty("siglaUnidadeMedida")
    public String getSiglaUnidadeMedida() {
        return siglaUnidadeMedida;
    }

    public void setSiglaUnidadeMedida(String siglaUnidadeMedida) {
        this.siglaUnidadeMedida = siglaUnidadeMedida;
    }

    public Cargas siglaUnidadeMedida(String siglaUnidadeMedida) {
        this.siglaUnidadeMedida = siglaUnidadeMedida;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Cargas {\n" +
                "    quantidadeManifestada: " + toIndentedString(quantidadeManifestada) + "\n" +
                "    numeroDue: " + toIndentedString(numeroDue) + "\n" +
                "    tipoCarga: " + toIndentedString(tipoCarga) + "\n" +
                "    numeroRuc: " + toIndentedString(numeroRuc) + "\n" +
                "    siglaUnidadeMedida: " + toIndentedString(siglaUnidadeMedida) + "\n" +
                "}";
        return sb;
    }
}
