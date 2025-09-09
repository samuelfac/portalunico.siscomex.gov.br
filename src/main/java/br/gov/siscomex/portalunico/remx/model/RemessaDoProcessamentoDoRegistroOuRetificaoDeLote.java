package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemessaDoProcessamentoDoRegistroOuRetificaoDeLote", propOrder =
        {"versaoDIR", "numeroRemessa", "ocorrencias", "txCambioDtRegistro", "valorFreteUSD", "valorTributavelUSD", "valorTotalBRL", "valorIIBRL", "valorFreteBRL", "valorTotalUSD", "valorMultasBRL", "novaSituacaoRemessa", "numeroDIR", "valorTributavelBRL"
        })

@XmlRootElement(name = "RemessaDoProcessamentoDoRegistroOuRetificaoDeLote")
public class RemessaDoProcessamentoDoRegistroOuRetificaoDeLote {

    @XmlElement(name = "versaoDIR", required = true)
    @ApiModelProperty(required = true, value = "Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).")
    /**
     * Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).
     **/
    private String versaoDIR = null;

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "ocorrencias", required = true)
    @ApiModelProperty(required = true, value = "Lista de ocorrências.")
    @Valid
    /**
     * Lista de ocorrências.
     **/
    private List<Ocorrncia> ocorrencias = new ArrayList<>();

    @XmlElement(name = "txCambioDtRegistro", required = true)
    @ApiModelProperty(required = true, value = "Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.")
    @Valid
    /**
     * Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.
     **/
    private BigDecimal txCambioDtRegistro = null;

    @XmlElement(name = "valorFreteUSD", required = true)
    @ApiModelProperty(required = true, value = "Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorFreteUSD = null;

    @XmlElement(name = "valorTributavelUSD", required = true)
    @ApiModelProperty(required = true, value = "Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTributavelUSD = null;

    @XmlElement(name = "valorTotalBRL", required = true)
    @ApiModelProperty(required = true, value = "Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTotalBRL = null;

    @XmlElement(name = "valorIIBRL", required = true)
    @ApiModelProperty(required = true, value = "Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorIIBRL = null;

    @XmlElement(name = "valorFreteBRL", required = true)
    @ApiModelProperty(required = true, value = "Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorFreteBRL = null;

    @XmlElement(name = "valorTotalUSD", required = true)
    @ApiModelProperty(required = true, value = "Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTotalUSD = null;

    @XmlElement(name = "valorMultasBRL", required = true)
    @ApiModelProperty(required = true, value = "Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorMultasBRL = null;

    @XmlElement(name = "novaSituacaoRemessa", required = true)
    @ApiModelProperty(required = true, value = "Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.")
    /**
     * Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.
     **/
    private Integer novaSituacaoRemessa = null;

    @XmlElement(name = "numeroDIR", required = true)
    @ApiModelProperty(required = true, value = "Número da DIR gerado pelo sistema. O número da DIR é composto por 12 caracteres numéricos.")
    /**
     * Número da DIR gerado pelo sistema. O número da DIR é composto por 12 caracteres numéricos.
     **/
    private String numeroDIR = null;

    @XmlElement(name = "valorTributavelBRL", required = true)
    @ApiModelProperty(required = true, value = "Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorTributavelBRL = null;

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
     * Número da versão da DIR. Máximo de 4 caracteres numéricos (de 1 a 9999).
     *
     * @return versaoDIR
     **/
    @JsonProperty("versaoDIR")
    @NotNull
    public String getVersaoDIR() {
        return versaoDIR;
    }

    public void setVersaoDIR(String versaoDIR) {
        this.versaoDIR = versaoDIR;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote versaoDIR(String versaoDIR) {
        this.versaoDIR = versaoDIR;
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Lista de ocorrências.
     *
     * @return ocorrencias
     **/
    @JsonProperty("ocorrencias")
    @NotNull
    public List<Ocorrncia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrncia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote ocorrencias(List<Ocorrncia> ocorrencias) {
        this.ocorrencias = ocorrencias;
        return this;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote addOcorrenciasItem(Ocorrncia ocorrenciasItem) {
        this.ocorrencias.add(ocorrenciasItem);
        return this;
    }

    /**
     * Valor da taxa de câmbio USD x BRL na data de registro da DIR. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 5 dígitos após o ponto.
     *
     * @return txCambioDtRegistro
     **/
    @JsonProperty("txCambioDtRegistro")
    @NotNull
    public BigDecimal getTxCambioDtRegistro() {
        return txCambioDtRegistro;
    }

    public void setTxCambioDtRegistro(BigDecimal txCambioDtRegistro) {
        this.txCambioDtRegistro = txCambioDtRegistro;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote txCambioDtRegistro(BigDecimal txCambioDtRegistro) {
        this.txCambioDtRegistro = txCambioDtRegistro;
        return this;
    }

    /**
     * Valor do Frete da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorFreteUSD
     **/
    @JsonProperty("valorFreteUSD")
    @NotNull
    public BigDecimal getValorFreteUSD() {
        return valorFreteUSD;
    }

    public void setValorFreteUSD(BigDecimal valorFreteUSD) {
        this.valorFreteUSD = valorFreteUSD;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorFreteUSD(BigDecimal valorFreteUSD) {
        this.valorFreteUSD = valorFreteUSD;
        return this;
    }

    /**
     * Valor tributável da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTributavelUSD
     **/
    @JsonProperty("valorTributavelUSD")
    @NotNull
    public BigDecimal getValorTributavelUSD() {
        return valorTributavelUSD;
    }

    public void setValorTributavelUSD(BigDecimal valorTributavelUSD) {
        this.valorTributavelUSD = valorTributavelUSD;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorTributavelUSD(BigDecimal valorTributavelUSD) {
        this.valorTributavelUSD = valorTributavelUSD;
        return this;
    }

    /**
     * Valor total da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTotalBRL
     **/
    @JsonProperty("valorTotalBRL")
    @NotNull
    public BigDecimal getValorTotalBRL() {
        return valorTotalBRL;
    }

    public void setValorTotalBRL(BigDecimal valorTotalBRL) {
        this.valorTotalBRL = valorTotalBRL;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorTotalBRL(BigDecimal valorTotalBRL) {
        this.valorTotalBRL = valorTotalBRL;
        return this;
    }

    /**
     * Valor total do Imposto de Importação em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorIIBRL
     **/
    @JsonProperty("valorIIBRL")
    @NotNull
    public BigDecimal getValorIIBRL() {
        return valorIIBRL;
    }

    public void setValorIIBRL(BigDecimal valorIIBRL) {
        this.valorIIBRL = valorIIBRL;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorIIBRL(BigDecimal valorIIBRL) {
        this.valorIIBRL = valorIIBRL;
        return this;
    }

    /**
     * Valor do Frete da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorFreteBRL
     **/
    @JsonProperty("valorFreteBRL")
    @NotNull
    public BigDecimal getValorFreteBRL() {
        return valorFreteBRL;
    }

    public void setValorFreteBRL(BigDecimal valorFreteBRL) {
        this.valorFreteBRL = valorFreteBRL;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorFreteBRL(BigDecimal valorFreteBRL) {
        this.valorFreteBRL = valorFreteBRL;
        return this;
    }

    /**
     * Valor total da remessa em Dólares Americanos (USD). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTotalUSD
     **/
    @JsonProperty("valorTotalUSD")
    @NotNull
    public BigDecimal getValorTotalUSD() {
        return valorTotalUSD;
    }

    public void setValorTotalUSD(BigDecimal valorTotalUSD) {
        this.valorTotalUSD = valorTotalUSD;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorTotalUSD(BigDecimal valorTotalUSD) {
        this.valorTotalUSD = valorTotalUSD;
        return this;
    }

    /**
     * Valor total das multas da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorMultasBRL
     **/
    @JsonProperty("valorMultasBRL")
    @NotNull
    public BigDecimal getValorMultasBRL() {
        return valorMultasBRL;
    }

    public void setValorMultasBRL(BigDecimal valorMultasBRL) {
        this.valorMultasBRL = valorMultasBRL;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorMultasBRL(BigDecimal valorMultasBRL) {
        this.valorMultasBRL = valorMultasBRL;
        return this;
    }

    /**
     * Código da nova situação da remessa. O código da situação é composto por até 2 dígitos.
     *
     * @return novaSituacaoRemessa
     **/
    @JsonProperty("novaSituacaoRemessa")
    @NotNull
    public Integer getNovaSituacaoRemessa() {
        return novaSituacaoRemessa;
    }

    public void setNovaSituacaoRemessa(Integer novaSituacaoRemessa) {
        this.novaSituacaoRemessa = novaSituacaoRemessa;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote novaSituacaoRemessa(Integer novaSituacaoRemessa) {
        this.novaSituacaoRemessa = novaSituacaoRemessa;
        return this;
    }

    /**
     * Número da DIR gerado pelo sistema. O número da DIR é composto por 12 caracteres numéricos.
     *
     * @return numeroDIR
     **/
    @JsonProperty("numeroDIR")
    @NotNull
    public String getNumeroDIR() {
        return numeroDIR;
    }

    public void setNumeroDIR(String numeroDIR) {
        this.numeroDIR = numeroDIR;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote numeroDIR(String numeroDIR) {
        this.numeroDIR = numeroDIR;
        return this;
    }

    /**
     * Valor tributável da remessa em Reais (BRL). Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorTributavelBRL
     **/
    @JsonProperty("valorTributavelBRL")
    @NotNull
    public BigDecimal getValorTributavelBRL() {
        return valorTributavelBRL;
    }

    public void setValorTributavelBRL(BigDecimal valorTributavelBRL) {
        this.valorTributavelBRL = valorTributavelBRL;
    }

    public RemessaDoProcessamentoDoRegistroOuRetificaoDeLote valorTributavelBRL(BigDecimal valorTributavelBRL) {
        this.valorTributavelBRL = valorTributavelBRL;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RemessaDoProcessamentoDoRegistroOuRetificaoDeLote {\n" +
                "    versaoDIR: " + toIndentedString(versaoDIR) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    ocorrencias: " + toIndentedString(ocorrencias) + "\n" +
                "    txCambioDtRegistro: " + toIndentedString(txCambioDtRegistro) + "\n" +
                "    valorFreteUSD: " + toIndentedString(valorFreteUSD) + "\n" +
                "    valorTributavelUSD: " + toIndentedString(valorTributavelUSD) + "\n" +
                "    valorTotalBRL: " + toIndentedString(valorTotalBRL) + "\n" +
                "    valorIIBRL: " + toIndentedString(valorIIBRL) + "\n" +
                "    valorFreteBRL: " + toIndentedString(valorFreteBRL) + "\n" +
                "    valorTotalUSD: " + toIndentedString(valorTotalUSD) + "\n" +
                "    valorMultasBRL: " + toIndentedString(valorMultasBRL) + "\n" +
                "    novaSituacaoRemessa: " + toIndentedString(novaSituacaoRemessa) + "\n" +
                "    numeroDIR: " + toIndentedString(numeroDIR) + "\n" +
                "    valorTributavelBRL: " + toIndentedString(valorTributavelBRL) + "\n" +
                "}";
        return sb;
    }
}
