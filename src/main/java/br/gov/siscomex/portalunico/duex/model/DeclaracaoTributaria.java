package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclaracaoTributaria", propOrder =
        {"recolhimentos", "divergente", "compensacoes", "contestacoes"
        })

@XmlRootElement(name = "DeclaracaoTributaria")
public class DeclaracaoTributaria {

    @XmlElement(name = "recolhimentos")
    @ApiModelProperty(value = "")
    @Valid
    private List<Recolhimento> recolhimentos = null;

    @XmlElement(name = "divergente")
    @ApiModelProperty(value = "")
    private Boolean divergente = null;

    @XmlElement(name = "compensacoes")
    @ApiModelProperty(value = "")
    @Valid
    private List<Compensacao> compensacoes = null;

    @XmlElement(name = "contestacoes")
    @ApiModelProperty(value = "")
    @Valid
    private List<Contestacao> contestacoes = null;

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
     * Get recolhimentos
     *
     * @return recolhimentos
     **/
    @JsonProperty("recolhimentos")
    public List<Recolhimento> getRecolhimentos() {
        return recolhimentos;
    }

    public void setRecolhimentos(List<Recolhimento> recolhimentos) {
        this.recolhimentos = recolhimentos;
    }

    public DeclaracaoTributaria recolhimentos(List<Recolhimento> recolhimentos) {
        this.recolhimentos = recolhimentos;
        return this;
    }

    public DeclaracaoTributaria addRecolhimentosItem(Recolhimento recolhimentosItem) {
        this.recolhimentos.add(recolhimentosItem);
        return this;
    }

    /**
     * Get divergente
     *
     * @return divergente
     **/
    @JsonProperty("divergente")
    public Boolean isisDivergente() {
        return divergente;
    }

    public void setDivergente(Boolean divergente) {
        this.divergente = divergente;
    }

    public DeclaracaoTributaria divergente(Boolean divergente) {
        this.divergente = divergente;
        return this;
    }

    /**
     * Get compensacoes
     *
     * @return compensacoes
     **/
    @JsonProperty("compensacoes")
    public List<Compensacao> getCompensacoes() {
        return compensacoes;
    }

    public void setCompensacoes(List<Compensacao> compensacoes) {
        this.compensacoes = compensacoes;
    }

    public DeclaracaoTributaria compensacoes(List<Compensacao> compensacoes) {
        this.compensacoes = compensacoes;
        return this;
    }

    public DeclaracaoTributaria addCompensacoesItem(Compensacao compensacoesItem) {
        this.compensacoes.add(compensacoesItem);
        return this;
    }

    /**
     * Get contestacoes
     *
     * @return contestacoes
     **/
    @JsonProperty("contestacoes")
    public List<Contestacao> getContestacoes() {
        return contestacoes;
    }

    public void setContestacoes(List<Contestacao> contestacoes) {
        this.contestacoes = contestacoes;
    }

    public DeclaracaoTributaria contestacoes(List<Contestacao> contestacoes) {
        this.contestacoes = contestacoes;
        return this;
    }

    public DeclaracaoTributaria addContestacoesItem(Contestacao contestacoesItem) {
        this.contestacoes.add(contestacoesItem);
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DeclaracaoTributaria {\n" +
                "    recolhimentos: " + toIndentedString(recolhimentos) + "\n" +
                "    divergente: " + toIndentedString(divergente) + "\n" +
                "    compensacoes: " + toIndentedString(compensacoes) + "\n" +
                "    contestacoes: " + toIndentedString(contestacoes) + "\n" +
                "}";
        return sb;
    }
}
