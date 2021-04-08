package br.gov.siscomex.portalunico.due.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DeclaracaoTributaria", propOrder =
    { "compensacoes", "contestacoes", "divergente", "recolhimentos"
})

@XmlRootElement(name="DeclaracaoTributaria")
public class DeclaracaoTributaria  {
  
  @XmlElement(name="compensacoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<Compensacao> compensacoes = null;

  @XmlElement(name="contestacoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<Contestacao> contestacoes = null;

  @XmlElement(name="divergente")
  @ApiModelProperty(value = "")
  private Boolean divergente = false;

  @XmlElement(name="recolhimentos")
  @ApiModelProperty(value = "")
  @Valid
  private List<Recolhimento> recolhimentos = null;
 /**
   * Get compensacoes
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

 /**
   * Get divergente
   * @return divergente
  **/
  @JsonProperty("divergente")
  public Boolean isDivergente() {
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
   * Get recolhimentos
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclaracaoTributaria {\n");
    
    sb.append("    compensacoes: ").append(toIndentedString(compensacoes)).append("\n");
    sb.append("    contestacoes: ").append(toIndentedString(contestacoes)).append("\n");
    sb.append("    divergente: ").append(toIndentedString(divergente)).append("\n");
    sb.append("    recolhimentos: ").append(toIndentedString(recolhimentos)).append("\n");
    sb.append("}");
    return sb.toString();
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
}

