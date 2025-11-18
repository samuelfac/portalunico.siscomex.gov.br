package br.gov.siscomex.portalunico.duex.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDocument", propOrder =
        {"categoryCode", "drawbackHsClassification", "drawbackRecipientId", "id", "itemID", "quantityQuantity", "valueWithExchangeCoverAmount"
        })

@XmlRootElement(name = "AdditionalDocument")
public class AdditionalDocument {


    @XmlElement(name = "categoryCode", required = true)
    @ApiModelProperty(required = true, value = "")
    private CategoryCodeEnum categoryCode = null;
    @XmlElement(name = "drawbackRecipientId", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AdditionalDocumentDrawbackRecipientIdTextType drawbackRecipientId = null;

    @XmlElement(name = "drawbackHsClassification", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AdditionalDocumentDrawbackHsClassificationTextType drawbackHsClassification = null;
    @XmlElement(name = "id", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AdditionalDocumentIdentificationIDType id = null;

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

    @XmlElement(name = "itemID")
    @ApiModelProperty(value = "")
    @Valid
    private AdditionalDocumentItemIDType itemID = null;

    @XmlElement(name = "quantityQuantity", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AdditionalDocumentQuantityQuantityType quantityQuantity = null;

    @XmlElement(name = "valueWithExchangeCoverAmount", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AdditionalDocumentValueWithExchangeCoverAmountType valueWithExchangeCoverAmount = null;

    /**
     * Get categoryCode
     *
     * @return categoryCode
     **/
    @JsonProperty("categoryCode")
    @NotNull
    public String getCategoryCode() {
        if (categoryCode == null) {
            return null;
        }
        return categoryCode.value();
    }

    public void setCategoryCode(CategoryCodeEnum categoryCode) {
        this.categoryCode = categoryCode;
    }

    public AdditionalDocument categoryCode(CategoryCodeEnum categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Get drawbackHsClassification
     *
     * @return drawbackHsClassification
     **/
    @JsonProperty("drawbackHsClassification")
    @NotNull
    public AdditionalDocumentDrawbackHsClassificationTextType getDrawbackHsClassification() {
        return drawbackHsClassification;
    }

    public void setDrawbackHsClassification(AdditionalDocumentDrawbackHsClassificationTextType drawbackHsClassification) {
        this.drawbackHsClassification = drawbackHsClassification;
    }

    public AdditionalDocument drawbackHsClassification(AdditionalDocumentDrawbackHsClassificationTextType drawbackHsClassification) {
        this.drawbackHsClassification = drawbackHsClassification;
        return this;
    }

    /**
     * Get drawbackRecipientId
     *
     * @return drawbackRecipientId
     **/
    @JsonProperty("drawbackRecipientId")
    @NotNull
    public AdditionalDocumentDrawbackRecipientIdTextType getDrawbackRecipientId() {
        return drawbackRecipientId;
    }

    public void setDrawbackRecipientId(AdditionalDocumentDrawbackRecipientIdTextType drawbackRecipientId) {
        this.drawbackRecipientId = drawbackRecipientId;
    }

    public AdditionalDocument drawbackRecipientId(AdditionalDocumentDrawbackRecipientIdTextType drawbackRecipientId) {
        this.drawbackRecipientId = drawbackRecipientId;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @JsonProperty("id")
    @NotNull
    public AdditionalDocumentIdentificationIDType getId() {
        return id;
    }

    public void setId(AdditionalDocumentIdentificationIDType id) {
        this.id = id;
    }

    public AdditionalDocument id(AdditionalDocumentIdentificationIDType id) {
        this.id = id;
        return this;
    }

    /**
     * Get itemID
     *
     * @return itemID
     **/
    @JsonProperty("itemID")
    public AdditionalDocumentItemIDType getItemID() {
        return itemID;
    }

    public void setItemID(AdditionalDocumentItemIDType itemID) {
        this.itemID = itemID;
    }

    public AdditionalDocument itemID(AdditionalDocumentItemIDType itemID) {
        this.itemID = itemID;
        return this;
    }

    /**
     * Get quantityQuantity
     *
     * @return quantityQuantity
     **/
    @JsonProperty("quantityQuantity")
    @NotNull
    public AdditionalDocumentQuantityQuantityType getQuantityQuantity() {
        return quantityQuantity;
    }

    public void setQuantityQuantity(AdditionalDocumentQuantityQuantityType quantityQuantity) {
        this.quantityQuantity = quantityQuantity;
    }

    public AdditionalDocument quantityQuantity(AdditionalDocumentQuantityQuantityType quantityQuantity) {
        this.quantityQuantity = quantityQuantity;
        return this;
    }

    /**
     * Get valueWithExchangeCoverAmount
     *
     * @return valueWithExchangeCoverAmount
     **/
    @JsonProperty("valueWithExchangeCoverAmount")
    @NotNull
    public AdditionalDocumentValueWithExchangeCoverAmountType getValueWithExchangeCoverAmount() {
        return valueWithExchangeCoverAmount;
    }

    public void setValueWithExchangeCoverAmount(AdditionalDocumentValueWithExchangeCoverAmountType valueWithExchangeCoverAmount) {
        this.valueWithExchangeCoverAmount = valueWithExchangeCoverAmount;
    }

    public AdditionalDocument valueWithExchangeCoverAmount(AdditionalDocumentValueWithExchangeCoverAmountType valueWithExchangeCoverAmount) {
        this.valueWithExchangeCoverAmount = valueWithExchangeCoverAmount;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class AdditionalDocument {\n" +
                "    categoryCode: " + toIndentedString(categoryCode) + "\n" +
                "    drawbackHsClassification: " + toIndentedString(drawbackHsClassification) + "\n" +
                "    drawbackRecipientId: " + toIndentedString(drawbackRecipientId) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    itemID: " + toIndentedString(itemID) + "\n" +
                "    quantityQuantity: " + toIndentedString(quantityQuantity) + "\n" +
                "    valueWithExchangeCoverAmount: " + toIndentedString(valueWithExchangeCoverAmount) + "\n" +
                "}";
        return sb;
    }

    @XmlType(name = "CategoryCodeEnum")
    @XmlEnum(String.class)
    public enum CategoryCodeEnum {

        @XmlEnumValue("AC")
        @JsonProperty("AC")
        AC("AC"),

        @XmlEnumValue("DSG")
        @JsonProperty("DSG")
        DSG("DSG"),

        @XmlEnumValue("DBSI")
        @JsonProperty("DBSI")
        DBSI("DBSI"),

        @XmlEnumValue("DSIG")
        @JsonProperty("DSIG")
        DSIG("DSIG"),

        @XmlEnumValue("DSEC")
        @JsonProperty("DSEC")
        DSEC("DSEC"),

        @XmlEnumValue("DSEG")
        @JsonProperty("DSEG")
        DSEG("DSEG"),

        @XmlEnumValue("DSMC")
        @JsonProperty("DSMC")
        DSMC("DSMC"),

        @XmlEnumValue("DSMG")
        @JsonProperty("DSMG")
        DSMG("DSMG"),

        @XmlEnumValue("DBI")
        @JsonProperty("DBI")
        DBI("DBI"),

        @XmlEnumValue("DBII")
        @JsonProperty("DBII")
        DBII("DBII"),

        @XmlEnumValue("LPCO")
        @JsonProperty("LPCO")
        LPCO("LPCO"),

        @XmlEnumValue("DSI")
        @JsonProperty("DSI")
        DSI("DSI"),

        @XmlEnumValue("DSIF")
        @JsonProperty("DSIF")
        DSIF("DSIF"),

        @XmlEnumValue("DI")
        @JsonProperty("DI")
        DI("DI"),

        @XmlEnumValue("EDBV")
        @JsonProperty("EDBV")
        EDBV("EDBV"),

        @XmlEnumValue("DUIMP")
        @JsonProperty("DUIMP")
        DUIMP("DUIMP"),

        @XmlEnumValue("DDE")
        @JsonProperty("DDE")
        DDE("DDE"),

        @XmlEnumValue("DE")
        @JsonProperty("DE")
        DE("DE"),

        @XmlEnumValue("DSE")
        @JsonProperty("DSE")
        DSE("DSE"),

        @XmlEnumValue("DSEF")
        @JsonProperty("DSEF")
        DSEF("DSEF"),

        @XmlEnumValue("RE")
        @JsonProperty("RE")
        RE("RE"),

        @XmlEnumValue("DUE")
        @JsonProperty("DUE")
        DUE("DUE"),

        @XmlEnumValue("COM")
        @JsonProperty("COM")
        COM("COM"),

        @XmlEnumValue("CON")
        @JsonProperty("CON")
        CON("CON");


        private final String value;

        CategoryCodeEnum(String v) {
            value = v;
        }

        public static CategoryCodeEnum fromValue(String v) {
            for (CategoryCodeEnum b : CategoryCodeEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CategoryCodeEnum");
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
