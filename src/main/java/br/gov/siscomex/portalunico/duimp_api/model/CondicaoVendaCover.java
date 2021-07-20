package br.gov.siscomex.portalunico.duimp_api.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CondicaoVendaCover", propOrder =
    { "metodoValoracao", "incoterm", "acrescimosDeducoes"
})

@XmlRootElement(name="CondicaoVendaCover")
/**
  * Condição de venda da mercadoria.
 **/
@ApiModel(description="Condição de venda da mercadoria.")
public class CondicaoVendaCover  {
  
  @XmlElement(name="metodoValoracao", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private MetodoValoracaoCover metodoValoracao = null;

  @XmlElement(name="incoterm")
  @ApiModelProperty(value = "")
  @Valid
  private IncotermCover incoterm = null;

  @XmlElement(name="acrescimosDeducoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<AcrescimoDeducaoCover> acrescimosDeducoes = null;
 /**
   * Get metodoValoracao
   * @return metodoValoracao
  **/
  @JsonProperty("metodoValoracao")
  @NotNull
  public MetodoValoracaoCover getMetodoValoracao() {
    return metodoValoracao;
  }

  public void setMetodoValoracao(MetodoValoracaoCover metodoValoracao) {
    this.metodoValoracao = metodoValoracao;
  }

  public CondicaoVendaCover metodoValoracao(MetodoValoracaoCover metodoValoracao) {
    this.metodoValoracao = metodoValoracao;
    return this;
  }

 /**
   * Get incoterm
   * @return incoterm
  **/
  @JsonProperty("incoterm")
  public IncotermCover getIncoterm() {
    return incoterm;
  }

  public void setIncoterm(IncotermCover incoterm) {
    this.incoterm = incoterm;
  }

  public CondicaoVendaCover incoterm(IncotermCover incoterm) {
    this.incoterm = incoterm;
    return this;
  }

 /**
   * Get acrescimosDeducoes
   * @return acrescimosDeducoes
  **/
  @JsonProperty("acrescimosDeducoes")
  public List<AcrescimoDeducaoCover> getAcrescimosDeducoes() {
    return acrescimosDeducoes;
  }

  public void setAcrescimosDeducoes(List<AcrescimoDeducaoCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
  }

  public CondicaoVendaCover acrescimosDeducoes(List<AcrescimoDeducaoCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
    return this;
  }

  public CondicaoVendaCover addAcrescimosDeducoesItem(AcrescimoDeducaoCover acrescimosDeducoesItem) {
    this.acrescimosDeducoes.add(acrescimosDeducoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CondicaoVendaCover {\n");
    
    sb.append("    metodoValoracao: ").append(toIndentedString(metodoValoracao)).append("\n");
    sb.append("    incoterm: ").append(toIndentedString(incoterm)).append("\n");
    sb.append("    acrescimosDeducoes: ").append(toIndentedString(acrescimosDeducoes)).append("\n");
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

