package br.gov.siscomex.portalunico.remx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemessaDaSolicitaoDarf", propOrder =
        {"bases", "valorJurosOficio", "numeroRemessa", "valorJurosMora", "valorMultaMora", "impostoImportacao"
        })

@XmlRootElement(name = "RemessaDaSolicitaoDarf")
public class RemessaDaSolicitaoDarf {

    @XmlElement(name = "bases")
    @ApiModelProperty(value = "Lista de bases legais.")
    @Valid
    /**
     * Lista de bases legais.
     **/
    private List<BaseLegalDaSolicitacaoDarf> bases = null;

    @XmlElement(name = "valorJurosOficio")
    @ApiModelProperty(value = "Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorJurosOficio = null;

    @XmlElement(name = "numeroRemessa", required = true)
    @ApiModelProperty(example = "1059756472772322", required = true, value = "Número da remessa composto por no máximo 18 caracteres alfanuméricos.")
    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     **/
    private String numeroRemessa = null;

    @XmlElement(name = "valorJurosMora")
    @ApiModelProperty(value = "Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorJurosMora = null;

    @XmlElement(name = "valorMultaMora")
    @ApiModelProperty(value = "Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.")
    @Valid
    /**
     * Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     **/
    private BigDecimal valorMultaMora = null;

    @XmlElement(name = "impostoImportacao", required = true)
    @ApiModelProperty(required = true, value = "Indicação que se deseja pagar o II<br/>Domínio:<br/>S - Sim;<br/>N - Não.")
    /**
     * Indicação que se deseja pagar o II<br/>Domínio:<br/>S - Sim;<br/>N - Não.
     **/
    private String impostoImportacao = null;

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
     * Lista de bases legais.
     *
     * @return bases
     **/
    @JsonProperty("bases")
    public List<BaseLegalDaSolicitacaoDarf> getBases() {
        return bases;
    }

    public void setBases(List<BaseLegalDaSolicitacaoDarf> bases) {
        this.bases = bases;
    }

    public RemessaDaSolicitaoDarf bases(List<BaseLegalDaSolicitacaoDarf> bases) {
        this.bases = bases;
        return this;
    }

    public RemessaDaSolicitaoDarf addBasesItem(BaseLegalDaSolicitacaoDarf basesItem) {
        this.bases.add(basesItem);
        return this;
    }

    /**
     * Valor de juros de ofício para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * minimum: 0
     *
     * @return valorJurosOficio
     **/
    @JsonProperty("valorJurosOficio")
    @DecimalMin("0")
    public BigDecimal getValorJurosOficio() {
        return valorJurosOficio;
    }

    public void setValorJurosOficio(BigDecimal valorJurosOficio) {
        this.valorJurosOficio = valorJurosOficio;
    }

    public RemessaDaSolicitaoDarf valorJurosOficio(BigDecimal valorJurosOficio) {
        this.valorJurosOficio = valorJurosOficio;
        return this;
    }

    /**
     * Número da remessa composto por no máximo 18 caracteres alfanuméricos.
     *
     * @return numeroRemessa
     **/
    @JsonProperty("numeroRemessa")
    @NotNull
    @Size(min = 1, max = 18)
    public String getNumeroRemessa() {
        return numeroRemessa;
    }

    public void setNumeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
    }

    public RemessaDaSolicitaoDarf numeroRemessa(String numeroRemessa) {
        this.numeroRemessa = numeroRemessa;
        return this;
    }

    /**
     * Valor de juros de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * minimum: 0
     *
     * @return valorJurosMora
     **/
    @JsonProperty("valorJurosMora")
    @DecimalMin("0")
    public BigDecimal getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(BigDecimal valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public RemessaDaSolicitaoDarf valorJurosMora(BigDecimal valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
        return this;
    }

    /**
     * Valor de multa de mora para a remessa. Número fracionário, aceitando no máximo até 9 dígitos antes do ponto e 2 dígitos após o ponto.
     * minimum: 0
     *
     * @return valorMultaMora
     **/
    @JsonProperty("valorMultaMora")
    @DecimalMin("0")
    public BigDecimal getValorMultaMora() {
        return valorMultaMora;
    }

    public void setValorMultaMora(BigDecimal valorMultaMora) {
        this.valorMultaMora = valorMultaMora;
    }

    public RemessaDaSolicitaoDarf valorMultaMora(BigDecimal valorMultaMora) {
        this.valorMultaMora = valorMultaMora;
        return this;
    }

    /**
     * Indicação que se deseja pagar o II&lt;br/&gt;Domínio:&lt;br/&gt;S - Sim;&lt;br/&gt;N - Não.
     *
     * @return impostoImportacao
     **/
    @JsonProperty("impostoImportacao")
    @NotNull
    public String getImpostoImportacao() {
        return impostoImportacao;
    }

    public void setImpostoImportacao(String impostoImportacao) {
        this.impostoImportacao = impostoImportacao;
    }

    public RemessaDaSolicitaoDarf impostoImportacao(String impostoImportacao) {
        this.impostoImportacao = impostoImportacao;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class RemessaDaSolicitaoDarf {\n" +
                "    bases: " + toIndentedString(bases) + "\n" +
                "    valorJurosOficio: " + toIndentedString(valorJurosOficio) + "\n" +
                "    numeroRemessa: " + toIndentedString(numeroRemessa) + "\n" +
                "    valorJurosMora: " + toIndentedString(valorJurosMora) + "\n" +
                "    valorMultaMora: " + toIndentedString(valorMultaMora) + "\n" +
                "    impostoImportacao: " + toIndentedString(impostoImportacao) + "\n" +
                "}";
        return sb;
    }
}
