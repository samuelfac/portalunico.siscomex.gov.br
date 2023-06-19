package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "DutyTaxFee", propOrder =
    { "payment"
})

@XmlRootElement(name="DutyTaxFee")
public class DutyTaxFee  {
  
  @XmlElement(name="payment", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Payment payment = null;
 /**
   * Get payment
   * @return payment
  **/
  @JsonProperty("payment")
  @NotNull
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public DutyTaxFee payment(Payment payment) {
    this.payment = payment;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTaxFee {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

