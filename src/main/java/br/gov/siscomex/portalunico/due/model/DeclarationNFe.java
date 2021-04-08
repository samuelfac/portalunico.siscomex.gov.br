package br.gov.siscomex.portalunico.due.model;

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
 @XmlType(name = "DeclarationNFe", propOrder =
    { "additionalDocument", "additionalInformation", "currencyExchange", "declarant", "declarationOffice", "dutyTaxFee", "exitOffice", "goodsShipment", "id", "ucr"
})

@XmlRootElement(name="DeclarationNFe")
public class DeclarationNFe  {
  
  @XmlElement(name="additionalDocument")
  @ApiModelProperty(value = "")
  @Valid
  private List<AdditionalDocument> additionalDocument = null;

  @XmlElement(name="additionalInformation")
  @ApiModelProperty(value = "")
  @Valid
  private List<AdditionalInformation> additionalInformation = null;

  @XmlElement(name="currencyExchange", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CurrencyExchange currencyExchange = null;

  @XmlElement(name="declarant", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Declarant declarant = null;

  @XmlElement(name="declarationOffice", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DeclarationOffice declarationOffice = null;

  @XmlElement(name="dutyTaxFee")
  @ApiModelProperty(value = "")
  @Valid
  private List<DutyTaxFee> dutyTaxFee = null;

  @XmlElement(name="exitOffice", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ExitOffice exitOffice = null;

  @XmlElement(name="goodsShipment", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<GoodsShipment> goodsShipment = new ArrayList<>();

  @XmlElement(name="id")
  @ApiModelProperty(value = "")
  @Valid
  private DeclarationIdentificationIDType id = null;

  @XmlElement(name="ucr")
  @ApiModelProperty(value = "")
  @Valid
  private UCR ucr = null;
 /**
   * Get additionalDocument
   * @return additionalDocument
  **/
  @JsonProperty("additionalDocument")
  public List<AdditionalDocument> getAdditionalDocument() {
    return additionalDocument;
  }

  public void setAdditionalDocument(List<AdditionalDocument> additionalDocument) {
    this.additionalDocument = additionalDocument;
  }

  public DeclarationNFe additionalDocument(List<AdditionalDocument> additionalDocument) {
    this.additionalDocument = additionalDocument;
    return this;
  }

  public DeclarationNFe addAdditionalDocumentItem(AdditionalDocument additionalDocumentItem) {
    this.additionalDocument.add(additionalDocumentItem);
    return this;
  }

 /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @JsonProperty("additionalInformation")
  public List<AdditionalInformation> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<AdditionalInformation> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public DeclarationNFe additionalInformation(List<AdditionalInformation> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public DeclarationNFe addAdditionalInformationItem(AdditionalInformation additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

 /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @JsonProperty("currencyExchange")
  @NotNull
  public CurrencyExchange getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(CurrencyExchange currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public DeclarationNFe currencyExchange(CurrencyExchange currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

 /**
   * Get declarant
   * @return declarant
  **/
  @JsonProperty("declarant")
  @NotNull
  public Declarant getDeclarant() {
    return declarant;
  }

  public void setDeclarant(Declarant declarant) {
    this.declarant = declarant;
  }

  public DeclarationNFe declarant(Declarant declarant) {
    this.declarant = declarant;
    return this;
  }

 /**
   * Get declarationOffice
   * @return declarationOffice
  **/
  @JsonProperty("declarationOffice")
  @NotNull
  public DeclarationOffice getDeclarationOffice() {
    return declarationOffice;
  }

  public void setDeclarationOffice(DeclarationOffice declarationOffice) {
    this.declarationOffice = declarationOffice;
  }

  public DeclarationNFe declarationOffice(DeclarationOffice declarationOffice) {
    this.declarationOffice = declarationOffice;
    return this;
  }

 /**
   * Get dutyTaxFee
   * @return dutyTaxFee
  **/
  @JsonProperty("dutyTaxFee")
  public List<DutyTaxFee> getDutyTaxFee() {
    return dutyTaxFee;
  }

  public void setDutyTaxFee(List<DutyTaxFee> dutyTaxFee) {
    this.dutyTaxFee = dutyTaxFee;
  }

  public DeclarationNFe dutyTaxFee(List<DutyTaxFee> dutyTaxFee) {
    this.dutyTaxFee = dutyTaxFee;
    return this;
  }

  public DeclarationNFe addDutyTaxFeeItem(DutyTaxFee dutyTaxFeeItem) {
    this.dutyTaxFee.add(dutyTaxFeeItem);
    return this;
  }

 /**
   * Get exitOffice
   * @return exitOffice
  **/
  @JsonProperty("exitOffice")
  @NotNull
  public ExitOffice getExitOffice() {
    return exitOffice;
  }

  public void setExitOffice(ExitOffice exitOffice) {
    this.exitOffice = exitOffice;
  }

  public DeclarationNFe exitOffice(ExitOffice exitOffice) {
    this.exitOffice = exitOffice;
    return this;
  }

 /**
   * Get goodsShipment
   * @return goodsShipment
  **/
  @JsonProperty("goodsShipment")
  @NotNull
  public List<GoodsShipment> getGoodsShipment() {
    return goodsShipment;
  }

  public void setGoodsShipment(List<GoodsShipment> goodsShipment) {
    this.goodsShipment = goodsShipment;
  }

  public DeclarationNFe goodsShipment(List<GoodsShipment> goodsShipment) {
    this.goodsShipment = goodsShipment;
    return this;
  }

  public DeclarationNFe addGoodsShipmentItem(GoodsShipment goodsShipmentItem) {
    this.goodsShipment.add(goodsShipmentItem);
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public DeclarationIdentificationIDType getId() {
    return id;
  }

  public void setId(DeclarationIdentificationIDType id) {
    this.id = id;
  }

  public DeclarationNFe id(DeclarationIdentificationIDType id) {
    this.id = id;
    return this;
  }

 /**
   * Get ucr
   * @return ucr
  **/
  @JsonProperty("ucr")
  public UCR getUcr() {
    return ucr;
  }

  public void setUcr(UCR ucr) {
    this.ucr = ucr;
  }

  public DeclarationNFe ucr(UCR ucr) {
    this.ucr = ucr;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclarationNFe {\n");
    
    sb.append("    additionalDocument: ").append(toIndentedString(additionalDocument)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    declarant: ").append(toIndentedString(declarant)).append("\n");
    sb.append("    declarationOffice: ").append(toIndentedString(declarationOffice)).append("\n");
    sb.append("    dutyTaxFee: ").append(toIndentedString(dutyTaxFee)).append("\n");
    sb.append("    exitOffice: ").append(toIndentedString(exitOffice)).append("\n");
    sb.append("    goodsShipment: ").append(toIndentedString(goodsShipment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ucr: ").append(toIndentedString(ucr)).append("\n");
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

