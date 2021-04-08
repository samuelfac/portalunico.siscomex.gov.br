package br.gov.siscomex.portalunico.due.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "GovernmentAgencyGoodsItem", propOrder =
    { "additionalDocument", "governmentProcedure", "sequenceNumeric"
})

@XmlRootElement(name="GovernmentAgencyGoodsItem")
public class GovernmentAgencyGoodsItem  {
  
  @XmlElement(name="additionalDocument", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<AdditionalDocument> additionalDocument = new ArrayList<>();

  @XmlElement(name="governmentProcedure", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<GovernmentProcedure> governmentProcedure = new ArrayList<>();

  @XmlElement(name="sequenceNumeric", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal sequenceNumeric = null;
 /**
   * Get additionalDocument
   * @return additionalDocument
  **/
  @JsonProperty("additionalDocument")
  @NotNull
  public List<AdditionalDocument> getAdditionalDocument() {
    return additionalDocument;
  }

  public void setAdditionalDocument(List<AdditionalDocument> additionalDocument) {
    this.additionalDocument = additionalDocument;
  }

  public GovernmentAgencyGoodsItem additionalDocument(List<AdditionalDocument> additionalDocument) {
    this.additionalDocument = additionalDocument;
    return this;
  }

  public GovernmentAgencyGoodsItem addAdditionalDocumentItem(AdditionalDocument additionalDocumentItem) {
    this.additionalDocument.add(additionalDocumentItem);
    return this;
  }

 /**
   * Get governmentProcedure
   * @return governmentProcedure
  **/
  @JsonProperty("governmentProcedure")
  @NotNull
  public List<GovernmentProcedure> getGovernmentProcedure() {
    return governmentProcedure;
  }

  public void setGovernmentProcedure(List<GovernmentProcedure> governmentProcedure) {
    this.governmentProcedure = governmentProcedure;
  }

  public GovernmentAgencyGoodsItem governmentProcedure(List<GovernmentProcedure> governmentProcedure) {
    this.governmentProcedure = governmentProcedure;
    return this;
  }

  public GovernmentAgencyGoodsItem addGovernmentProcedureItem(GovernmentProcedure governmentProcedureItem) {
    this.governmentProcedure.add(governmentProcedureItem);
    return this;
  }

 /**
   * Get sequenceNumeric
   * @return sequenceNumeric
  **/
  @JsonProperty("sequenceNumeric")
  @NotNull
  public BigDecimal getSequenceNumeric() {
    return sequenceNumeric;
  }

  public void setSequenceNumeric(BigDecimal sequenceNumeric) {
    this.sequenceNumeric = sequenceNumeric;
  }

  public GovernmentAgencyGoodsItem sequenceNumeric(BigDecimal sequenceNumeric) {
    this.sequenceNumeric = sequenceNumeric;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernmentAgencyGoodsItem {\n");
    
    sb.append("    additionalDocument: ").append(toIndentedString(additionalDocument)).append("\n");
    sb.append("    governmentProcedure: ").append(toIndentedString(governmentProcedure)).append("\n");
    sb.append("    sequenceNumeric: ").append(toIndentedString(sequenceNumeric)).append("\n");
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

