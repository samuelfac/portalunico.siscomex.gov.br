package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemessaConforme", propOrder =
        {"codigoECE", "codigoOND", "nomeECE", "nomeOND", "valorProvICMS", "valorProvII"
        })

@XmlRootElement(name = "RemessaConforme")
public class RemessaConforme {

    @XmlElement(name = "codigoECE")
    @ApiModelProperty(value = "Código Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 35 caracteres alfanuméricos.")
    /**
     * Código Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 35 caracteres alfanuméricos.
     **/
    private String codigoECE = null;

    @XmlElement(name = "codigoOND")
    @ApiModelProperty(value = "Código Operador Não Designado. Máximo de 35 caracteres alfanuméricos.")
    /**
     * Código Operador Não Designado. Máximo de 35 caracteres alfanuméricos.
     **/
    private String codigoOND = null;

    @XmlElement(name = "nomeECE")
    @ApiModelProperty(value = "Nome Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Nome Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String nomeECE = null;

    @XmlElement(name = "nomeOND")
    @ApiModelProperty(value = "Nome Operador Não Designado. Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.")
    /**
     * Nome Operador Não Designado. Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.
     **/
    private String nomeOND = null;

    @XmlElement(name = "valorProvICMS")
    @ApiModelProperty(value = "Valor Provisionado do ICMS. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor Provisionado do ICMS. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorProvICMS = null;

    @XmlElement(name = "valorProvII")
    @ApiModelProperty(value = "Valor Provisionado do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor Provisionado do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorProvII = null;

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
     * Código Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 35 caracteres alfanuméricos.
     *
     * @return codigoECE
     **/
    @JsonProperty("codigoECE")
    public String getCodigoECE() {
        return codigoECE;
    }

    public void setCodigoECE(String codigoECE) {
        this.codigoECE = codigoECE;
    }

    /**
     * Código Operador Não Designado. Máximo de 35 caracteres alfanuméricos.
     *
     * @return codigoOND
     **/
    @JsonProperty("codigoOND")
    public String getCodigoOND() {
        return codigoOND;
    }

    public void setCodigoOND(String codigoOND) {
        this.codigoOND = codigoOND;
    }

    public RemessaConforme codigoOND(String codigoOND) {
        this.codigoOND = codigoOND;
        return this;
    }

    /**
     * Nome Empresa de Comércio Eletrônico. TIN number ou CNPJ (quando for empresa brasileira). Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return nomeECE
     **/
    @JsonProperty("nomeECE")
    public String getNomeECE() {
        return nomeECE;
    }

    public void setNomeECE(String nomeECE) {
        this.nomeECE = nomeECE;
    }

    public RemessaConforme nomeECE(String nomeECE) {
        this.nomeECE = nomeECE;
        return this;
    }

    /**
     * Nome Operador Não Designado. Máximo de 250 caracteres alfanuméricos, além de quaisquer caracteres referentes a codificação UTF-8.
     *
     * @return nomeOND
     **/
    @JsonProperty("nomeOND")
    public String getNomeOND() {
        return nomeOND;
    }

    public void setNomeOND(String nomeOND) {
        this.nomeOND = nomeOND;
    }

    public RemessaConforme nomeOND(String nomeOND) {
        this.nomeOND = nomeOND;
        return this;
    }

    /**
     * Valor Provisionado do ICMS. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorProvICMS
     **/
    @JsonProperty("valorProvICMS")
    public BigDecimal getValorProvICMS() {
        return valorProvICMS;
    }

    public void setValorProvICMS(BigDecimal valorProvICMS) {
        this.valorProvICMS = valorProvICMS;
    }

    public RemessaConforme valorProvICMS(BigDecimal valorProvICMS) {
        this.valorProvICMS = valorProvICMS;
        return this;
    }

    public RemessaConforme codigoECE(String codigoECE) {
        this.codigoECE = codigoECE;
        return this;
    }

    /**
     * Valor Provisionado do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorProvII
     **/
    @JsonProperty("valorProvII")
    public BigDecimal getValorProvII() {
        return valorProvII;
    }

    public void setValorProvII(BigDecimal valorProvII) {
        this.valorProvII = valorProvII;
    }

    public RemessaConforme valorProvII(BigDecimal valorProvII) {
        this.valorProvII = valorProvII;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RemessaConforme {\n" +
                "    codigoECE: " + toIndentedString(codigoECE) + "\n" +
                "    codigoOND: " + toIndentedString(codigoOND) + "\n" +
                "    nomeECE: " + toIndentedString(nomeECE) + "\n" +
                "    nomeOND: " + toIndentedString(nomeOND) + "\n" +
                "    valorProvICMS: " + toIndentedString(valorProvICMS) + "\n" +
                "    valorProvII: " + toIndentedString(valorProvII) + "\n" +
                "}";
        return sb;
    }
}
