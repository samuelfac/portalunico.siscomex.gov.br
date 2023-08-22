package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.Payment;
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

