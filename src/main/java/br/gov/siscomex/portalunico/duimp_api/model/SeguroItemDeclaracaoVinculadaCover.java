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
 @XmlType(name = "SeguroItemDeclaracaoVinculadaCover", propOrder =
    { "valorBRL"
})

@XmlRootElement(name="SeguroItemDeclaracaoVinculadaCover")
public class SeguroItemDeclaracaoVinculadaCover  {
  
  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "10.53", value = "Valor do seguro (R$) do item.<br>O valor do seguro (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.")
  @Valid
 /**
   * Valor do seguro (R$) do item.<br>O valor do seguro (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \"Duimp\" e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
  **/
  private BigDecimal valorBRL = null;
 /**
   * Valor do seguro (R$) do item.&lt;br&gt;O valor do seguro (R$) do item é informado apenas quando a Duimp consultada for COM situação especial de despacho, o tipo da declaração vinculada for \&quot;Duimp\&quot; e quando o seguro foi calculado durante a elaboração/registro da Duimp consultada, caso contrário, esse atributo será fornecido com o valor nulo. O conteúdo será preenchido da seguinte forma: o valor do seguro (R$) do item da Duimp informada como vinculada, quando esta for SEM situação especial de despacho ou o valor do seguro (R$) do item da Duimp original (Duimp de admissão em regime especial), quando a Duimp informada como vinculada for COM situação especial de despacho.
   * @return valorBRL
  **/
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }

  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  public SeguroItemDeclaracaoVinculadaCover valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeguroItemDeclaracaoVinculadaCover {\n");
    
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
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

