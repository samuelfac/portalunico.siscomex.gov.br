package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "ValorMonetario", propOrder =
    { "moeda", "valor"
})

@XmlRootElement(name="ValorMonetario")
public class ValorMonetario  {
  
  @XmlElement(name="moeda")
  @ApiModelProperty(value = "")
  @Valid
  private Moeda moeda = null;

  @XmlElement(name="valor")
  @ApiModelProperty(example = "3284.58", value = "Valor")
  @Valid
 /**
   * Valor
  **/
  private BigDecimal valor = null;
 /**
   * Get moeda
   * @return moeda
  **/
  @JsonProperty("moeda")
  public Moeda getMoeda() {
    return moeda;
  }

  public void setMoeda(Moeda moeda) {
    this.moeda = moeda;
  }

  public ValorMonetario moeda(Moeda moeda) {
    this.moeda = moeda;
    return this;
  }

 /**
   * Valor
   * @return valor
  **/
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public ValorMonetario valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValorMonetario {\n");
    
    sb.append("    moeda: ").append(toIndentedString(moeda)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

