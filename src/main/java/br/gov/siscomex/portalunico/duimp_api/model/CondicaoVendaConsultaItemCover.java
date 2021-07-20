package br.gov.siscomex.portalunico.duimp_api.model;

import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CondicaoVendaConsultaItemCover", propOrder =
    { "metodoValoracao", "incoterm", "valorBRL", "valorMoedaNegociada", "frete", "seguro", "acrescimosDeducoes"
})

@XmlRootElement(name="CondicaoVendaConsultaItemCover")
/**
  * Condição de venda da mercadoria.
 **/
@ApiModel(description="Condição de venda da mercadoria.")
public class CondicaoVendaConsultaItemCover  {
  
  @XmlElement(name="metodoValoracao")
  @ApiModelProperty(value = "")
  @Valid
  private MetodoValoracaoCover metodoValoracao = null;

  @XmlElement(name="incoterm")
  @ApiModelProperty(value = "")
  @Valid
  private IncotermCover incoterm = null;

  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "1.0", value = "Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor na moeda negociada convertido em R$ (Reais).<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valorBRL = null;

  @XmlElement(name="valorMoedaNegociada")
  @ApiModelProperty(example = "1.0", value = "Valor na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.")
 /**
   * Valor na moeda negociada.<br>Tamanho: 13,2<br>Formato: Decimal, com até 2 casas decimais separadas por ponto.
  **/
  private Double valorMoedaNegociada = null;

  @XmlElement(name="frete")
  @ApiModelProperty(value = "")
  @Valid
  private FreteConsultaItemCover frete = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private SeguroConsultaItemCover seguro = null;

  @XmlElement(name="acrescimosDeducoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes = null;
 /**
   * Get metodoValoracao
   * @return metodoValoracao
  **/
  @JsonProperty("metodoValoracao")
  public MetodoValoracaoCover getMetodoValoracao() {
    return metodoValoracao;
  }

  public void setMetodoValoracao(MetodoValoracaoCover metodoValoracao) {
    this.metodoValoracao = metodoValoracao;
  }

  public CondicaoVendaConsultaItemCover metodoValoracao(MetodoValoracaoCover metodoValoracao) {
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

  public CondicaoVendaConsultaItemCover incoterm(IncotermCover incoterm) {
    this.incoterm = incoterm;
    return this;
  }

 /**
   * Valor na moeda negociada convertido em R$ (Reais).&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public Double getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
  }

  public CondicaoVendaConsultaItemCover valorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }

 /**
   * Valor na moeda negociada.&lt;br&gt;Tamanho: 13,2&lt;br&gt;Formato: Decimal, com até 2 casas decimais separadas por ponto.
   * @return valorMoedaNegociada
  **/
  @JsonProperty("valorMoedaNegociada")
  public Double getValorMoedaNegociada() {
    return valorMoedaNegociada;
  }

  public void setValorMoedaNegociada(Double valorMoedaNegociada) {
    this.valorMoedaNegociada = valorMoedaNegociada;
  }

  public CondicaoVendaConsultaItemCover valorMoedaNegociada(Double valorMoedaNegociada) {
    this.valorMoedaNegociada = valorMoedaNegociada;
    return this;
  }

 /**
   * Get frete
   * @return frete
  **/
  @JsonProperty("frete")
  public FreteConsultaItemCover getFrete() {
    return frete;
  }

  public void setFrete(FreteConsultaItemCover frete) {
    this.frete = frete;
  }

  public CondicaoVendaConsultaItemCover frete(FreteConsultaItemCover frete) {
    this.frete = frete;
    return this;
  }

 /**
   * Get seguro
   * @return seguro
  **/
  @JsonProperty("seguro")
  public SeguroConsultaItemCover getSeguro() {
    return seguro;
  }

  public void setSeguro(SeguroConsultaItemCover seguro) {
    this.seguro = seguro;
  }

  public CondicaoVendaConsultaItemCover seguro(SeguroConsultaItemCover seguro) {
    this.seguro = seguro;
    return this;
  }

 /**
   * Get acrescimosDeducoes
   * @return acrescimosDeducoes
  **/
  @JsonProperty("acrescimosDeducoes")
  public List<AcrescimoDeducaoConsultaItemCover> getAcrescimosDeducoes() {
    return acrescimosDeducoes;
  }

  public void setAcrescimosDeducoes(List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
  }

  public CondicaoVendaConsultaItemCover acrescimosDeducoes(List<AcrescimoDeducaoConsultaItemCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
    return this;
  }

  public CondicaoVendaConsultaItemCover addAcrescimosDeducoesItem(AcrescimoDeducaoConsultaItemCover acrescimosDeducoesItem) {
    this.acrescimosDeducoes.add(acrescimosDeducoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CondicaoVendaConsultaItemCover {\n");
    
    sb.append("    metodoValoracao: ").append(toIndentedString(metodoValoracao)).append("\n");
    sb.append("    incoterm: ").append(toIndentedString(incoterm)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    valorMoedaNegociada: ").append(toIndentedString(valorMoedaNegociada)).append("\n");
    sb.append("    frete: ").append(toIndentedString(frete)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
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

