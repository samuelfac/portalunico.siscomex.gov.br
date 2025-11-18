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
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpostoDeImportao", propOrder =
        {"darfs", "valorDevido", "valorPendente", "valorRecolhido"
        })

@XmlRootElement(name = "ImpostoDeImportao")
public class ImpostoDeImportao {

    @XmlElement(name = "darfs")
    @ApiModelProperty(value = "Lista de DARFS.")
    @Valid
    /**
     * Lista de DARFS.
     **/
    private List<DARF> darfs = null;

    @XmlElement(name = "valorDevido")
    @ApiModelProperty(value = "Valor devido de II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor devido de II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorDevido = null;

    @XmlElement(name = "valorPendente")
    @ApiModelProperty(value = "Valor pendente de pagamento do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor pendente de pagamento do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorPendente = null;

    @XmlElement(name = "valorRecolhido")
    @ApiModelProperty(value = "Valor que foi recolhido do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor que foi recolhido do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorRecolhido = null;

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
     * Lista de DARFS.
     *
     * @return darfs
     **/
    @JsonProperty("darfs")
    public List<DARF> getDarfs() {
        return darfs;
    }

    public void setDarfs(List<DARF> darfs) {
        this.darfs = darfs;
    }

    public ImpostoDeImportao darfs(List<DARF> darfs) {
        this.darfs = darfs;
        return this;
    }

    /**
     * Valor devido de II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorDevido
     **/
    @JsonProperty("valorDevido")
    public BigDecimal getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
    }

    public ImpostoDeImportao valorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
        return this;
    }

    public ImpostoDeImportao addDarfsItem(DARF darfsItem) {
        this.darfs.add(darfsItem);
        return this;
    }

    /**
     * Valor pendente de pagamento do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorPendente
     **/
    @JsonProperty("valorPendente")
    public BigDecimal getValorPendente() {
        return valorPendente;
    }

    public void setValorPendente(BigDecimal valorPendente) {
        this.valorPendente = valorPendente;
    }

    public ImpostoDeImportao valorPendente(BigDecimal valorPendente) {
        this.valorPendente = valorPendente;
        return this;
    }

    /**
     * Valor que foi recolhido do II. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     *
     * @return valorRecolhido
     **/
    @JsonProperty("valorRecolhido")
    public BigDecimal getValorRecolhido() {
        return valorRecolhido;
    }

    public void setValorRecolhido(BigDecimal valorRecolhido) {
        this.valorRecolhido = valorRecolhido;
    }

    public ImpostoDeImportao valorRecolhido(BigDecimal valorRecolhido) {
        this.valorRecolhido = valorRecolhido;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class ImpostoDeImportao {\n" +
                "    darfs: " + toIndentedString(darfs) + "\n" +
                "    valorDevido: " + toIndentedString(valorDevido) + "\n" +
                "    valorPendente: " + toIndentedString(valorPendente) + "\n" +
                "    valorRecolhido: " + toIndentedString(valorRecolhido) + "\n" +
                "}";
        return sb;
    }
}
