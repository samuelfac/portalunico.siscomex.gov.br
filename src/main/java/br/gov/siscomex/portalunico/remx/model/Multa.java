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
@XmlType(name = "Multa", propOrder =
        {"baseLegal", "valorRecolhido", "valorPendente", "valorDevido", "darfs", "responsavel"
        })

@XmlRootElement(name = "Multa")
public class Multa {

    @XmlElement(name = "baseLegal")
    @ApiModelProperty(value = "Base legal da multa a ser paga para a remessa a ser incluída no DARF.")
    /**
     * Base legal da multa a ser paga para a remessa a ser incluída no DARF.
     **/
    private String baseLegal = null;

    @XmlElement(name = "valorRecolhido")
    @ApiModelProperty(value = "Valor total recolhido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total recolhido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorRecolhido = null;

    @XmlElement(name = "valorPendente")
    @ApiModelProperty(value = "Valor total pendente de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total pendente de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorPendente = null;

    @XmlElement(name = "valorDevido")
    @ApiModelProperty(value = "Valor total devido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor total devido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorDevido = null;

    @XmlElement(name = "darfs")
    @ApiModelProperty(value = "Lista de DARFS.")
    @Valid
    /**
     * Lista de DARFS.
     **/
    private List<DARF> darfs = null;

    @XmlElement(name = "responsavel")
    @ApiModelProperty(value = "Responsável pelo pagamento da multa. Domínio: 'destinatario', 'operador'.")
    /**
     * Responsável pelo pagamento da multa. Domínio: 'destinatario', 'operador'.
     **/
    private String responsavel = null;

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
     * Base legal da multa a ser paga para a remessa a ser incluída no DARF.
     *
     * @return baseLegal
     **/
    @JsonProperty("baseLegal")
    public String getBaseLegal() {
        return baseLegal;
    }

    public void setBaseLegal(String baseLegal) {
        this.baseLegal = baseLegal;
    }

    public Multa baseLegal(String baseLegal) {
        this.baseLegal = baseLegal;
        return this;
    }

    /**
     * Valor total recolhido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
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

    public Multa valorRecolhido(BigDecimal valorRecolhido) {
        this.valorRecolhido = valorRecolhido;
        return this;
    }

    /**
     * Valor total pendente de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
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

    public Multa valorPendente(BigDecimal valorPendente) {
        this.valorPendente = valorPendente;
        return this;
    }

    /**
     * Valor total devido de multas. Número fracionário, aceitando no máximo até 10 dígitos antes do ponto e 2 dígitos após o ponto.
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

    public Multa valorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
        return this;
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

    public Multa darfs(List<DARF> darfs) {
        this.darfs = darfs;
        return this;
    }

    public Multa addDarfsItem(DARF darfsItem) {
        this.darfs.add(darfsItem);
        return this;
    }

    /**
     * Responsável pelo pagamento da multa. Domínio: &#39;destinatario&#39;, &#39;operador&#39;.
     *
     * @return responsavel
     **/
    @JsonProperty("responsavel")
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Multa responsavel(String responsavel) {
        this.responsavel = responsavel;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class Multa {\n" +
                "    baseLegal: " + toIndentedString(baseLegal) + "\n" +
                "    valorRecolhido: " + toIndentedString(valorRecolhido) + "\n" +
                "    valorPendente: " + toIndentedString(valorPendente) + "\n" +
                "    valorDevido: " + toIndentedString(valorDevido) + "\n" +
                "    darfs: " + toIndentedString(darfs) + "\n" +
                "    responsavel: " + toIndentedString(responsavel) + "\n" +
                "}";
        return sb;
    }
}
