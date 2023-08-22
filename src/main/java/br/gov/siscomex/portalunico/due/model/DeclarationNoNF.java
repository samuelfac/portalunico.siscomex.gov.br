package br.gov.siscomex.portalunico.due.model;

import br.gov.siscomex.portalunico.due.model.AdditionalInformation;
import br.gov.siscomex.portalunico.due.model.CurrencyExchange;
import br.gov.siscomex.portalunico.due.model.Declarant;
import br.gov.siscomex.portalunico.due.model.DeclarationIdentificationIDType;
import br.gov.siscomex.portalunico.due.model.DeclarationOffice;
import br.gov.siscomex.portalunico.due.model.ExitOffice;
import br.gov.siscomex.portalunico.due.model.GoodsShipment;
import br.gov.siscomex.portalunico.due.model.UCR;
import java.util.ArrayList;
import java.util.List;
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
 @XmlType(name = "DeclarationNoNF", propOrder =
    { "additionalInformation", "currencyExchange", "declarant", "declarationOffice", "exitOffice", "goodsShipment", "id", "ucr"
})

@XmlRootElement(name="DeclarationNoNF")
public class DeclarationNoNF  {
  
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

  public DeclarationNoNF additionalInformation(List<AdditionalInformation> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public DeclarationNoNF addAdditionalInformationItem(AdditionalInformation additionalInformationItem) {
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

  public DeclarationNoNF currencyExchange(CurrencyExchange currencyExchange) {
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

  public DeclarationNoNF declarant(Declarant declarant) {
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

  public DeclarationNoNF declarationOffice(DeclarationOffice declarationOffice) {
    this.declarationOffice = declarationOffice;
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

  public DeclarationNoNF exitOffice(ExitOffice exitOffice) {
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

  public DeclarationNoNF goodsShipment(List<GoodsShipment> goodsShipment) {
    this.goodsShipment = goodsShipment;
    return this;
  }

  public DeclarationNoNF addGoodsShipmentItem(GoodsShipment goodsShipmentItem) {
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

  public DeclarationNoNF id(DeclarationIdentificationIDType id) {
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

  public DeclarationNoNF ucr(UCR ucr) {
    this.ucr = ucr;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclarationNoNF {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    declarant: ").append(toIndentedString(declarant)).append("\n");
    sb.append("    declarationOffice: ").append(toIndentedString(declarationOffice)).append("\n");
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

