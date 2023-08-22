package br.gov.siscomex.portalunico.ccta.model;

import br.gov.siscomex.portalunico.ccta.model.FormaPagamento;
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
 @XmlType(name = "CargaDetalheFreteFormaPgto", propOrder =
    { "valorOutrosEncargos", "valorPorPesoValor"
})

@XmlRootElement(name="CargaDetalheFreteFormaPgto")
public class CargaDetalheFreteFormaPgto  {
  
  @XmlElement(name="valorOutrosEncargos")
  @ApiModelProperty(value = "")
  @Valid
  private FormaPagamento valorOutrosEncargos = null;

  @XmlElement(name="valorPorPesoValor")
  @ApiModelProperty(value = "")
  @Valid
  private FormaPagamento valorPorPesoValor = null;
 /**
   * Get valorOutrosEncargos
   * @return valorOutrosEncargos
  **/
  @JsonProperty("valorOutrosEncargos")
  public FormaPagamento getValorOutrosEncargos() {
    return valorOutrosEncargos;
  }

  public void setValorOutrosEncargos(FormaPagamento valorOutrosEncargos) {
    this.valorOutrosEncargos = valorOutrosEncargos;
  }

  public CargaDetalheFreteFormaPgto valorOutrosEncargos(FormaPagamento valorOutrosEncargos) {
    this.valorOutrosEncargos = valorOutrosEncargos;
    return this;
  }

 /**
   * Get valorPorPesoValor
   * @return valorPorPesoValor
  **/
  @JsonProperty("valorPorPesoValor")
  public FormaPagamento getValorPorPesoValor() {
    return valorPorPesoValor;
  }

  public void setValorPorPesoValor(FormaPagamento valorPorPesoValor) {
    this.valorPorPesoValor = valorPorPesoValor;
  }

  public CargaDetalheFreteFormaPgto valorPorPesoValor(FormaPagamento valorPorPesoValor) {
    this.valorPorPesoValor = valorPorPesoValor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargaDetalheFreteFormaPgto {\n");
    
    sb.append("    valorOutrosEncargos: ").append(toIndentedString(valorOutrosEncargos)).append("\n");
    sb.append("    valorPorPesoValor: ").append(toIndentedString(valorPorPesoValor)).append("\n");
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

