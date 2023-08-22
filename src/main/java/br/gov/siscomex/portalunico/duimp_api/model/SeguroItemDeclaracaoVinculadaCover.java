package br.gov.siscomex.portalunico.duimp_api.model;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SeguroItemDeclaracaoVinculadaCover", propOrder =
    { "valorBRL"
})

@XmlRootElement(name="SeguroItemDeclaracaoVinculadaCover")
public class SeguroItemDeclaracaoVinculadaCover  {
  
  @XmlElement(name="valorBRL")
  @ApiModelProperty(example = "10.53", value = "Valor do seguro (R$) do item da declaração vinculada, quando o tipo for \"Duimp\"  E  quando o seguro foi calculado durante a elaboração/registro. Para os demais casos, esse atributo será fornecido com o valor nulo")
  @Valid
 /**
   * Valor do seguro (R$) do item da declaração vinculada, quando o tipo for \"Duimp\"  E  quando o seguro foi calculado durante a elaboração/registro. Para os demais casos, esse atributo será fornecido com o valor nulo
  **/
  private BigDecimal valorBRL = null;
 /**
   * Valor do seguro (R$) do item da declaração vinculada, quando o tipo for \&quot;Duimp\&quot;  E  quando o seguro foi calculado durante a elaboração/registro. Para os demais casos, esse atributo será fornecido com o valor nulo
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
