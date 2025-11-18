package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificadoDTO", propOrder =
        {"codigoCertificado", "dataRegistro", "qtdUnidadeEstatistica", "tipoCertificadoMercosul"
        })

@XmlRootElement(name = "CertificadoDTO")
public class CertificadoDTO {

    @XmlElement(name = "codigoCertificado")
    @ApiModelProperty(value = "")
    private String codigoCertificado = null;

    @XmlElement(name = "dataRegistro")
    @ApiModelProperty(value = "")
    private OffsetDateTime dataRegistro = null;

    @XmlElement(name = "qtdUnidadeEstatistica")
    @ApiModelProperty(value = "")
    @Valid
    private BigDecimal qtdUnidadeEstatistica = null;

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

    @XmlElement(name = "tipoCertificadoMercosul")
    @ApiModelProperty(value = "")
    private TipoCertificadoMercosulEnum tipoCertificadoMercosul = null;

    /**
     * Get codigoCertificado
     *
     * @return codigoCertificado
     **/
    @JsonProperty("codigoCertificado")
    public String getCodigoCertificado() {
        return codigoCertificado;
    }

    public void setCodigoCertificado(String codigoCertificado) {
        this.codigoCertificado = codigoCertificado;
    }

    public CertificadoDTO codigoCertificado(String codigoCertificado) {
        this.codigoCertificado = codigoCertificado;
        return this;
    }

    /**
     * Get dataRegistro
     *
     * @return dataRegistro
     **/
    @JsonProperty("dataRegistro")
    public OffsetDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public CertificadoDTO dataRegistro(OffsetDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
        return this;
    }

    /**
     * Get qtdUnidadeEstatistica
     *
     * @return qtdUnidadeEstatistica
     **/
    @JsonProperty("qtdUnidadeEstatistica")
    public BigDecimal getQtdUnidadeEstatistica() {
        return qtdUnidadeEstatistica;
    }

    public void setQtdUnidadeEstatistica(BigDecimal qtdUnidadeEstatistica) {
        this.qtdUnidadeEstatistica = qtdUnidadeEstatistica;
    }

    public CertificadoDTO qtdUnidadeEstatistica(BigDecimal qtdUnidadeEstatistica) {
        this.qtdUnidadeEstatistica = qtdUnidadeEstatistica;
        return this;
    }

    /**
     * Get tipoCertificadoMercosul
     *
     * @return tipoCertificadoMercosul
     **/
    @JsonProperty("tipoCertificadoMercosul")
    public String getTipoCertificadoMercosul() {
        if (tipoCertificadoMercosul == null) {
            return null;
        }
        return tipoCertificadoMercosul.value();
    }

    public void setTipoCertificadoMercosul(TipoCertificadoMercosulEnum tipoCertificadoMercosul) {
        this.tipoCertificadoMercosul = tipoCertificadoMercosul;
    }

    public CertificadoDTO tipoCertificadoMercosul(TipoCertificadoMercosulEnum tipoCertificadoMercosul) {
        this.tipoCertificadoMercosul = tipoCertificadoMercosul;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CertificadoDTO {\n" +
                "    codigoCertificado: " + toIndentedString(codigoCertificado) + "\n" +
                "    dataRegistro: " + toIndentedString(dataRegistro) + "\n" +
                "    qtdUnidadeEstatistica: " + toIndentedString(qtdUnidadeEstatistica) + "\n" +
                "    tipoCertificadoMercosul: " + toIndentedString(tipoCertificadoMercosul) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "TipoCertificadoMercosulEnum")
    @XmlEnum(String.class)
    public enum TipoCertificadoMercosulEnum {

        @XmlEnumValue("MERCADORIA_AMPARADA_CCPTC")
        @JsonProperty("MERCADORIA_AMPARADA_CCPTC")
        CCPTC("MERCADORIA_AMPARADA_CCPTC"),

        @XmlEnumValue("MERCADORIA_AMPARADA_CCROM")
        @JsonProperty("MERCADORIA_AMPARADA_CCROM")
        CCROM("MERCADORIA_AMPARADA_CCROM");


        private final String value;

        TipoCertificadoMercosulEnum(String v) {
            value = v;
        }

        public static TipoCertificadoMercosulEnum fromValue(String v) {
            for (TipoCertificadoMercosulEnum b : TipoCertificadoMercosulEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoCertificadoMercosulEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
