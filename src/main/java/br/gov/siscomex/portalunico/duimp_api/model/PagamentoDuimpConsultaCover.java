package br.gov.siscomex.portalunico.duimp_api.model;

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
 @XmlType(name = "PagamentoDuimpConsultaCover", propOrder =
    { "versaoOrigem", "principal"
})

@XmlRootElement(name="PagamentoDuimpConsultaCover")
/**
  * Dados de um pagamento.
 **/
@ApiModel(description="Dados de um pagamento.")
public class PagamentoDuimpConsultaCover  {
  
  @XmlElement(name="versaoOrigem")
  @ApiModelProperty(example = "1", value = "Versão da Duimp em que este pagamento foi realizado.<br>Valor mínimo: 1<br>Valor máximo: 9999")
 /**
   * Versão da Duimp em que este pagamento foi realizado.<br>Valor mínimo: 1<br>Valor máximo: 9999
  **/
  private String versaoOrigem = null;

  @XmlElement(name="principal")
  @ApiModelProperty(value = "")
  @Valid
  private DadosPagamentoCover principal = null;
 /**
   * Versão da Duimp em que este pagamento foi realizado.&lt;br&gt;Valor mínimo: 1&lt;br&gt;Valor máximo: 9999
   * @return versaoOrigem
  **/
  @JsonProperty("versaoOrigem")
  public String getVersaoOrigem() {
    return versaoOrigem;
  }

  public void setVersaoOrigem(String versaoOrigem) {
    this.versaoOrigem = versaoOrigem;
  }

  public PagamentoDuimpConsultaCover versaoOrigem(String versaoOrigem) {
    this.versaoOrigem = versaoOrigem;
    return this;
  }

 /**
   * Get principal
   * @return principal
  **/
  @JsonProperty("principal")
  public DadosPagamentoCover getPrincipal() {
    return principal;
  }

  public void setPrincipal(DadosPagamentoCover principal) {
    this.principal = principal;
  }

  public PagamentoDuimpConsultaCover principal(DadosPagamentoCover principal) {
    this.principal = principal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoDuimpConsultaCover {\n");
    
    sb.append("    versaoOrigem: ").append(toIndentedString(versaoOrigem)).append("\n");
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

