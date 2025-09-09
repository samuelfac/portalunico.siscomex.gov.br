package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationNoNFSimplified", propOrder =
        {"additionalInformation", "exitOffice", "ucr", "declarationOffice", "goodsShipment", "invoice", "declarant", "currencyExchange"
        })

@XmlRootElement(name = "DeclarationNoNFSimplified")
public class DeclarationNoNFSimplified {

    @XmlElement(name = "additionalInformation")
    @ApiModelProperty(value = "")
    @Valid
    private List<AdditionalInformation> additionalInformation = null;

    @XmlElement(name = "exitOffice", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private ExitOffice exitOffice = null;

    @XmlElement(name = "ucr")
    @ApiModelProperty(value = "")
    @Valid
    private UCR ucr = null;

    @XmlElement(name = "declarationOffice", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private DeclarationOffice declarationOffice = null;

    @XmlElement(name = "goodsShipment", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private List<GoodsShipment> goodsShipment = new ArrayList<>();

    @XmlElement(name = "invoice", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Invoice invoice = null;

    @XmlElement(name = "declarant", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private Declarant declarant = null;

    @XmlElement(name = "currencyExchange", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private CurrencyExchange currencyExchange = null;

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

    /**
     * Get additionalInformation
     *
     * @return additionalInformation
     **/
    @JsonProperty("additionalInformation")
    public List<AdditionalInformation> getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(List<AdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public DeclarationNoNFSimplified additionalInformation(List<AdditionalInformation> additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    public DeclarationNoNFSimplified addAdditionalInformationItem(AdditionalInformation additionalInformationItem) {
        this.additionalInformation.add(additionalInformationItem);
        return this;
    }

    /**
     * Get exitOffice
     *
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

    public DeclarationNoNFSimplified exitOffice(ExitOffice exitOffice) {
        this.exitOffice = exitOffice;
        return this;
    }

    /**
     * Get ucr
     *
     * @return ucr
     **/
    @JsonProperty("ucr")
    public UCR getUcr() {
        return ucr;
    }

    public void setUcr(UCR ucr) {
        this.ucr = ucr;
    }

    public DeclarationNoNFSimplified ucr(UCR ucr) {
        this.ucr = ucr;
        return this;
    }

    /**
     * Get declarationOffice
     *
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

    public DeclarationNoNFSimplified declarationOffice(DeclarationOffice declarationOffice) {
        this.declarationOffice = declarationOffice;
        return this;
    }

    /**
     * Get goodsShipment
     *
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

    public DeclarationNoNFSimplified goodsShipment(List<GoodsShipment> goodsShipment) {
        this.goodsShipment = goodsShipment;
        return this;
    }

    public DeclarationNoNFSimplified addGoodsShipmentItem(GoodsShipment goodsShipmentItem) {
        this.goodsShipment.add(goodsShipmentItem);
        return this;
    }

    /**
     * Get invoice
     *
     * @return invoice
     **/
    @JsonProperty("invoice")
    @NotNull
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public DeclarationNoNFSimplified invoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Get declarant
     *
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

    public DeclarationNoNFSimplified declarant(Declarant declarant) {
        this.declarant = declarant;
        return this;
    }

    /**
     * Get currencyExchange
     *
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

    public DeclarationNoNFSimplified currencyExchange(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
        return this;
    }

    @Override
    public String toString() {

        String sb = "class DeclarationNoNFSimplified {\n" +
                "    additionalInformation: " + toIndentedString(additionalInformation) + "\n" +
                "    exitOffice: " + toIndentedString(exitOffice) + "\n" +
                "    ucr: " + toIndentedString(ucr) + "\n" +
                "    declarationOffice: " + toIndentedString(declarationOffice) + "\n" +
                "    goodsShipment: " + toIndentedString(goodsShipment) + "\n" +
                "    invoice: " + toIndentedString(invoice) + "\n" +
                "    declarant: " + toIndentedString(declarant) + "\n" +
                "    currencyExchange: " + toIndentedString(currencyExchange) + "\n" +
                "}";
        return sb;
    }
}
