package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "ItemDeclaracaoVinculadaCover", propOrder =
    { "numeroItemDeclaracaoVinculada", "frete", "seguro", "qtdUnidadeEstatistica", "ncm"
})

@XmlRootElement(name="ItemDeclaracaoVinculadaCover")
public class ItemDeclaracaoVinculadaCover  {
  
  @XmlElement(name="numeroItemDeclaracaoVinculada")
  @ApiModelProperty(example = "10001", value = "Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999")
 /**
   * Número do item/adição da declaração.<br>Valor mínimo: 1<br>Valor máximo: 99999
  **/
  private Integer numeroItemDeclaracaoVinculada = null;

  @XmlElement(name="frete")
  @ApiModelProperty(value = "")
  @Valid
  private FreteItemDeclaracaoVinculadaCover frete = null;

  @XmlElement(name="seguro")
  @ApiModelProperty(value = "")
  @Valid
  private SeguroItemDeclaracaoVinculadaCover seguro = null;

  @XmlElement(name="qtdUnidadeEstatistica")
  @ApiModelProperty(example = "10.53", value = "Quantidade na unidade estatística do item.<br>A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.")
  @Valid
 /**
   * Quantidade na unidade estatística do item.<br>A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
  **/
  private BigDecimal qtdUnidadeEstatistica = null;

  @XmlElement(name="ncm")
  @ApiModelProperty(example = "02013000", value = "NCM do item da Duimp informada como vinculada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo.")
 /**
   * NCM do item da Duimp informada como vinculada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \"Duimp\", caso contrário, esse atributo será fornecido com o valor nulo.
  **/
  private String ncm = null;
 /**
   * Número do item/adição da declaração.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 99999
   * @return numeroItemDeclaracaoVinculada
  **/
  @JsonProperty("numeroItemDeclaracaoVinculada")
  public Integer getNumeroItemDeclaracaoVinculada() {
    return numeroItemDeclaracaoVinculada;
  }

  public void setNumeroItemDeclaracaoVinculada(Integer numeroItemDeclaracaoVinculada) {
    this.numeroItemDeclaracaoVinculada = numeroItemDeclaracaoVinculada;
  }

  public ItemDeclaracaoVinculadaCover numeroItemDeclaracaoVinculada(Integer numeroItemDeclaracaoVinculada) {
    this.numeroItemDeclaracaoVinculada = numeroItemDeclaracaoVinculada;
    return this;
  }

 /**
   * Get frete
   * @return frete
  **/
  @JsonProperty("frete")
  public FreteItemDeclaracaoVinculadaCover getFrete() {
    return frete;
  }

  public void setFrete(FreteItemDeclaracaoVinculadaCover frete) {
    this.frete = frete;
  }

  public ItemDeclaracaoVinculadaCover frete(FreteItemDeclaracaoVinculadaCover frete) {
    this.frete = frete;
    return this;
  }

 /**
   * Get seguro
   * @return seguro
  **/
  @JsonProperty("seguro")
  public SeguroItemDeclaracaoVinculadaCover getSeguro() {
    return seguro;
  }

  public void setSeguro(SeguroItemDeclaracaoVinculadaCover seguro) {
    this.seguro = seguro;
  }

  public ItemDeclaracaoVinculadaCover seguro(SeguroItemDeclaracaoVinculadaCover seguro) {
    this.seguro = seguro;
    return this;
  }

 /**
   * Quantidade na unidade estatística do item.&lt;br&gt;A quantidade na unidade estatística do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o frete foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: quantidade na unidade estatística do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou quantidade na unidade estatística do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
   * @return qtdUnidadeEstatistica
  **/
  @JsonProperty("qtdUnidadeEstatistica")
  public BigDecimal getQtdUnidadeEstatistica() {
    return qtdUnidadeEstatistica;
  }

  public void setQtdUnidadeEstatistica(BigDecimal qtdUnidadeEstatistica) {
    this.qtdUnidadeEstatistica = qtdUnidadeEstatistica;
  }

  public ItemDeclaracaoVinculadaCover qtdUnidadeEstatistica(BigDecimal qtdUnidadeEstatistica) {
    this.qtdUnidadeEstatistica = qtdUnidadeEstatistica;
    return this;
  }

 /**
   * NCM do item da Duimp informada como vinculada. Este atributo é informado apenas quando a Duimp consultada for COM situação especial de despacho e o tipo da declaração vinculada for \&quot;Duimp\&quot;, caso contrário, esse atributo será fornecido com o valor nulo.
   * @return ncm
  **/
  @JsonProperty("ncm")
  public String getNcm() {
    return ncm;
  }

  public void setNcm(String ncm) {
    this.ncm = ncm;
  }

  public ItemDeclaracaoVinculadaCover ncm(String ncm) {
    this.ncm = ncm;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDeclaracaoVinculadaCover {\n");
    
    sb.append("    numeroItemDeclaracaoVinculada: ").append(toIndentedString(numeroItemDeclaracaoVinculada)).append("\n");
    sb.append("    frete: ").append(toIndentedString(frete)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
    sb.append("    qtdUnidadeEstatistica: ").append(toIndentedString(qtdUnidadeEstatistica)).append("\n");
    sb.append("    ncm: ").append(toIndentedString(ncm)).append("\n");
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

