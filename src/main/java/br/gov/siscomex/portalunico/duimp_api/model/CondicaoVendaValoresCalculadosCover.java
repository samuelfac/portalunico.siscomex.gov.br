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
 @XmlType(name = "CondicaoVendaValoresCalculadosCover", propOrder =
    { "valorBRL", "frete", "seguro", "acrescimosDeducoes"
})

@XmlRootElement(name="CondicaoVendaValoresCalculadosCover")
/**
  * Valor na Condição de Venda.
 **/
@ApiModel(description="Valor na Condição de Venda.")
public class CondicaoVendaValoresCalculadosCover  {
  
  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "10.4", value = "Valor unitário da mercadoria na condição de venda.<br>Tamanho: 13,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.")
 /**
   * Valor unitário da mercadoria na condição de venda.<br>Tamanho: 13,7<br>Formato: Decimal, com até 7 casas decimais separadas por ponto.
  **/
  private Double valorBRL = null;

  @XmlElement(name="frete")
  @ApiModelProperty(value = "")
  @Valid
  private FreteValoresCalculadosItemCover frete = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private SeguroValoresCalculadosItemCover seguro = null;

  @XmlElement(name="acrescimosDeducoes")
  @ApiModelProperty(value = "")
  @Valid
  private List<AcrescimoDeducaoValoresCalculadosCover> acrescimosDeducoes = null;
 /**
   * Valor unitário da mercadoria na condição de venda.&lt;br&gt;Tamanho: 13,7&lt;br&gt;Formato: Decimal, com até 7 casas decimais separadas por ponto.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public Double getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
  }

  public CondicaoVendaValoresCalculadosCover valorBRL(Double valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }

 /**
   * Get frete
   * @return frete
  **/
  @JsonProperty("frete")
  public FreteValoresCalculadosItemCover getFrete() {
    return frete;
  }

  public void setFrete(FreteValoresCalculadosItemCover frete) {
    this.frete = frete;
  }

  public CondicaoVendaValoresCalculadosCover frete(FreteValoresCalculadosItemCover frete) {
    this.frete = frete;
    return this;
  }

 /**
   * Get seguro
   * @return seguro
  **/
  @JsonProperty("seguro")
  public SeguroValoresCalculadosItemCover getSeguro() {
    return seguro;
  }

  public void setSeguro(SeguroValoresCalculadosItemCover seguro) {
    this.seguro = seguro;
  }

  public CondicaoVendaValoresCalculadosCover seguro(SeguroValoresCalculadosItemCover seguro) {
    this.seguro = seguro;
    return this;
  }

 /**
   * Get acrescimosDeducoes
   * @return acrescimosDeducoes
  **/
  @JsonProperty("acrescimosDeducoes")
  public List<AcrescimoDeducaoValoresCalculadosCover> getAcrescimosDeducoes() {
    return acrescimosDeducoes;
  }

  public void setAcrescimosDeducoes(List<AcrescimoDeducaoValoresCalculadosCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
  }

  public CondicaoVendaValoresCalculadosCover acrescimosDeducoes(List<AcrescimoDeducaoValoresCalculadosCover> acrescimosDeducoes) {
    this.acrescimosDeducoes = acrescimosDeducoes;
    return this;
  }

  public CondicaoVendaValoresCalculadosCover addAcrescimosDeducoesItem(AcrescimoDeducaoValoresCalculadosCover acrescimosDeducoesItem) {
    this.acrescimosDeducoes.add(acrescimosDeducoesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CondicaoVendaValoresCalculadosCover {\n");
    
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
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

