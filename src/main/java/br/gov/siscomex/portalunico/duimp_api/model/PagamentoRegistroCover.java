package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "PagamentoRegistroCover", propOrder =
    { "principal"
})

@XmlRootElement(name="PagamentoRegistroCover")
/**
  * Dados de um pagamento.
 **/
@ApiModel(description="Dados de um pagamento.")
public class PagamentoRegistroCover  {
  
  @XmlElement(name="principal")
  @ApiModelProperty(value = "")
  @Valid
  private ValorPagamentoRegistroCover principal = null;
 /**
   * Get principal
   * @return principal
  **/
  @JsonProperty("principal")
  public ValorPagamentoRegistroCover getPrincipal() {
    return principal;
  }

  public void setPrincipal(ValorPagamentoRegistroCover principal) {
    this.principal = principal;
  }

  public PagamentoRegistroCover principal(ValorPagamentoRegistroCover principal) {
    this.principal = principal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoRegistroCover {\n");
    
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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

