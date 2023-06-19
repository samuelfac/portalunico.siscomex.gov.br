package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Payment", propOrder =
    { "dueDateTime", "interest", "paymentAmount", "penalty"
})

@XmlRootElement(name="Payment")
public class Payment  {
  
  @XmlElement(name="dueDateTime", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PaymentDueDateTimeType dueDateTime = null;

  @XmlElement(name="interest", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PaymentInterestType interest = null;

  @XmlElement(name="paymentAmount", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PaymentPaymentAmountType paymentAmount = null;

  @XmlElement(name="penalty", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private PaymentPenaltyType penalty = null;
 /**
   * Get dueDateTime
   * @return dueDateTime
  **/
  @JsonProperty("dueDateTime")
  @NotNull
  public PaymentDueDateTimeType getDueDateTime() {
    return dueDateTime;
  }

  public void setDueDateTime(PaymentDueDateTimeType dueDateTime) {
    this.dueDateTime = dueDateTime;
  }

  public Payment dueDateTime(PaymentDueDateTimeType dueDateTime) {
    this.dueDateTime = dueDateTime;
    return this;
  }

 /**
   * Get interest
   * @return interest
  **/
  @JsonProperty("interest")
  @NotNull
  public PaymentInterestType getInterest() {
    return interest;
  }

  public void setInterest(PaymentInterestType interest) {
    this.interest = interest;
  }

  public Payment interest(PaymentInterestType interest) {
    this.interest = interest;
    return this;
  }

 /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @JsonProperty("paymentAmount")
  @NotNull
  public PaymentPaymentAmountType getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(PaymentPaymentAmountType paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public Payment paymentAmount(PaymentPaymentAmountType paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

 /**
   * Get penalty
   * @return penalty
  **/
  @JsonProperty("penalty")
  @NotNull
  public PaymentPenaltyType getPenalty() {
    return penalty;
  }

  public void setPenalty(PaymentPenaltyType penalty) {
    this.penalty = penalty;
  }

  public Payment penalty(PaymentPenaltyType penalty) {
    this.penalty = penalty;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    dueDateTime: ").append(toIndentedString(dueDateTime)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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

