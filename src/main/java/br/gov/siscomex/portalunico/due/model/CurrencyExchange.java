package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange", propOrder =
        {"currencyTypeCode"
        })

@XmlRootElement(name = "CurrencyExchange")
public class CurrencyExchange {


    @XmlType(name = "CurrencyTypeCodeEnum")
    @XmlEnum(String.class)
    public enum CurrencyTypeCodeEnum {

        @XmlEnumValue("AED")
        @JsonProperty("AED")
        AED("AED"),

        @XmlEnumValue("AFN")
        @JsonProperty("AFN")
        AFN("AFN"),

        @XmlEnumValue("ALL")
        @JsonProperty("ALL")
        ALL("ALL"),

        @XmlEnumValue("AMD")
        @JsonProperty("AMD")
        AMD("AMD"),

        @XmlEnumValue("ANG")
        @JsonProperty("ANG")
        ANG("ANG"),

        @XmlEnumValue("AOA")
        @JsonProperty("AOA")
        AOA("AOA"),

        @XmlEnumValue("ARS")
        @JsonProperty("ARS")
        ARS("ARS"),

        @XmlEnumValue("AUD")
        @JsonProperty("AUD")
        AUD("AUD"),

        @XmlEnumValue("AWG")
        @JsonProperty("AWG")
        AWG("AWG"),

        @XmlEnumValue("BBD")
        @JsonProperty("BBD")
        BBD("BBD"),

        @XmlEnumValue("BDT")
        @JsonProperty("BDT")
        BDT("BDT"),

        @XmlEnumValue("BGN")
        @JsonProperty("BGN")
        BGN("BGN"),

        @XmlEnumValue("BHD")
        @JsonProperty("BHD")
        BHD("BHD"),

        @XmlEnumValue("BIF")
        @JsonProperty("BIF")
        BIF("BIF"),

        @XmlEnumValue("BMD")
        @JsonProperty("BMD")
        BMD("BMD"),

        @XmlEnumValue("BND")
        @JsonProperty("BND")
        BND("BND"),

        @XmlEnumValue("BOB")
        @JsonProperty("BOB")
        BOB("BOB"),

        @XmlEnumValue("BRL")
        @JsonProperty("BRL")
        BRL("BRL"),

        @XmlEnumValue("BSD")
        @JsonProperty("BSD")
        BSD("BSD"),

        @XmlEnumValue("BTN")
        @JsonProperty("BTN")
        BTN("BTN"),

        @XmlEnumValue("BWP")
        @JsonProperty("BWP")
        BWP("BWP"),

        @XmlEnumValue("BYN")
        @JsonProperty("BYN")
        BYN("BYN"),

        @XmlEnumValue("BZD")
        @JsonProperty("BZD")
        BZD("BZD"),

        @XmlEnumValue("CAD")
        @JsonProperty("CAD")
        CAD("CAD"),

        @XmlEnumValue("CDF")
        @JsonProperty("CDF")
        CDF("CDF"),

        @XmlEnumValue("CHF")
        @JsonProperty("CHF")
        CHF("CHF"),

        @XmlEnumValue("CLF")
        @JsonProperty("CLF")
        CLF("CLF"),

        @XmlEnumValue("CLP")
        @JsonProperty("CLP")
        CLP("CLP"),

        @XmlEnumValue("CNH")
        @JsonProperty("CNH")
        CNH("CNH"),

        @XmlEnumValue("CNY")
        @JsonProperty("CNY")
        CNY("CNY"),

        @XmlEnumValue("COP")
        @JsonProperty("COP")
        COP("COP"),

        @XmlEnumValue("CRC")
        @JsonProperty("CRC")
        CRC("CRC"),

        @XmlEnumValue("CUP")
        @JsonProperty("CUP")
        CUP("CUP"),

        @XmlEnumValue("CVE")
        @JsonProperty("CVE")
        CVE("CVE"),

        @XmlEnumValue("CZK")
        @JsonProperty("CZK")
        CZK("CZK"),

        @XmlEnumValue("DJF")
        @JsonProperty("DJF")
        DJF("DJF"),

        @XmlEnumValue("DKK")
        @JsonProperty("DKK")
        DKK("DKK"),

        @XmlEnumValue("DOP")
        @JsonProperty("DOP")
        DOP("DOP"),

        @XmlEnumValue("DZD")
        @JsonProperty("DZD")
        DZD("DZD"),

        @XmlEnumValue("EGP")
        @JsonProperty("EGP")
        EGP("EGP"),

        @XmlEnumValue("ERN")
        @JsonProperty("ERN")
        ERN("ERN"),

        @XmlEnumValue("ETB")
        @JsonProperty("ETB")
        ETB("ETB"),

        @XmlEnumValue("EUR")
        @JsonProperty("EUR")
        EUR("EUR"),

        @XmlEnumValue("FJD")
        @JsonProperty("FJD")
        FJD("FJD"),

        @XmlEnumValue("FKP")
        @JsonProperty("FKP")
        FKP("FKP"),

        @XmlEnumValue("GBP")
        @JsonProperty("GBP")
        GBP("GBP"),

        @XmlEnumValue("GEL")
        @JsonProperty("GEL")
        GEL("GEL"),

        @XmlEnumValue("GHS")
        @JsonProperty("GHS")
        GHS("GHS"),

        @XmlEnumValue("GIP")
        @JsonProperty("GIP")
        GIP("GIP"),

        @XmlEnumValue("GMD")
        @JsonProperty("GMD")
        GMD("GMD"),

        @XmlEnumValue("GNF")
        @JsonProperty("GNF")
        GNF("GNF"),

        @XmlEnumValue("GTQ")
        @JsonProperty("GTQ")
        GTQ("GTQ"),

        @XmlEnumValue("GYD")
        @JsonProperty("GYD")
        GYD("GYD"),

        @XmlEnumValue("HKD")
        @JsonProperty("HKD")
        HKD("HKD"),

        @XmlEnumValue("HNL")
        @JsonProperty("HNL")
        HNL("HNL"),

        @XmlEnumValue("HRK")
        @JsonProperty("HRK")
        HRK("HRK"),

        @XmlEnumValue("HTG")
        @JsonProperty("HTG")
        HTG("HTG"),

        @XmlEnumValue("HUF")
        @JsonProperty("HUF")
        HUF("HUF"),

        @XmlEnumValue("IDR")
        @JsonProperty("IDR")
        IDR("IDR"),

        @XmlEnumValue("ILS")
        @JsonProperty("ILS")
        ILS("ILS"),

        @XmlEnumValue("INR")
        @JsonProperty("INR")
        INR("INR"),

        @XmlEnumValue("IQD")
        @JsonProperty("IQD")
        IQD("IQD"),

        @XmlEnumValue("IRR")
        @JsonProperty("IRR")
        IRR("IRR"),

        @XmlEnumValue("ISK")
        @JsonProperty("ISK")
        ISK("ISK"),

        @XmlEnumValue("JMD")
        @JsonProperty("JMD")
        JMD("JMD"),

        @XmlEnumValue("JOD")
        @JsonProperty("JOD")
        JOD("JOD"),

        @XmlEnumValue("JPY")
        @JsonProperty("JPY")
        JPY("JPY"),

        @XmlEnumValue("KES")
        @JsonProperty("KES")
        KES("KES"),

        @XmlEnumValue("KGS")
        @JsonProperty("KGS")
        KGS("KGS"),

        @XmlEnumValue("KHR")
        @JsonProperty("KHR")
        KHR("KHR"),

        @XmlEnumValue("KMF")
        @JsonProperty("KMF")
        KMF("KMF"),

        @XmlEnumValue("KRW")
        @JsonProperty("KRW")
        KRW("KRW"),

        @XmlEnumValue("KWD")
        @JsonProperty("KWD")
        KWD("KWD"),

        @XmlEnumValue("KYD")
        @JsonProperty("KYD")
        KYD("KYD"),

        @XmlEnumValue("KZT")
        @JsonProperty("KZT")
        KZT("KZT"),

        @XmlEnumValue("LAK")
        @JsonProperty("LAK")
        LAK("LAK"),

        @XmlEnumValue("LBP")
        @JsonProperty("LBP")
        LBP("LBP"),

        @XmlEnumValue("LKR")
        @JsonProperty("LKR")
        LKR("LKR"),

        @XmlEnumValue("LRD")
        @JsonProperty("LRD")
        LRD("LRD"),

        @XmlEnumValue("LSL")
        @JsonProperty("LSL")
        LSL("LSL"),

        @XmlEnumValue("LYD")
        @JsonProperty("LYD")
        LYD("LYD"),

        @XmlEnumValue("MAD")
        @JsonProperty("MAD")
        MAD("MAD"),

        @XmlEnumValue("MDL")
        @JsonProperty("MDL")
        MDL("MDL"),

        @XmlEnumValue("MGA")
        @JsonProperty("MGA")
        MGA("MGA"),

        @XmlEnumValue("MKD")
        @JsonProperty("MKD")
        MKD("MKD"),

        @XmlEnumValue("MMK")
        @JsonProperty("MMK")
        MMK("MMK"),

        @XmlEnumValue("MNT")
        @JsonProperty("MNT")
        MNT("MNT"),

        @XmlEnumValue("MOP")
        @JsonProperty("MOP")
        MOP("MOP"),

        @XmlEnumValue("MRO")
        @JsonProperty("MRO")
        MRO("MRO"),

        @XmlEnumValue("MUR")
        @JsonProperty("MUR")
        MUR("MUR"),

        @XmlEnumValue("MVR")
        @JsonProperty("MVR")
        MVR("MVR"),

        @XmlEnumValue("MWK")
        @JsonProperty("MWK")
        MWK("MWK"),

        @XmlEnumValue("MXN")
        @JsonProperty("MXN")
        MXN("MXN"),

        @XmlEnumValue("MYR")
        @JsonProperty("MYR")
        MYR("MYR"),

        @XmlEnumValue("MZN")
        @JsonProperty("MZN")
        MZN("MZN"),

        @XmlEnumValue("NAD")
        @JsonProperty("NAD")
        NAD("NAD"),

        @XmlEnumValue("NGN")
        @JsonProperty("NGN")
        NGN("NGN"),

        @XmlEnumValue("NIO")
        @JsonProperty("NIO")
        NIO("NIO"),

        @XmlEnumValue("NOK")
        @JsonProperty("NOK")
        NOK("NOK"),

        @XmlEnumValue("NPR")
        @JsonProperty("NPR")
        NPR("NPR"),

        @XmlEnumValue("NZD")
        @JsonProperty("NZD")
        NZD("NZD"),

        @XmlEnumValue("OMR")
        @JsonProperty("OMR")
        OMR("OMR"),

        @XmlEnumValue("PAB")
        @JsonProperty("PAB")
        PAB("PAB"),

        @XmlEnumValue("PEN")
        @JsonProperty("PEN")
        PEN("PEN"),

        @XmlEnumValue("PGK")
        @JsonProperty("PGK")
        PGK("PGK"),

        @XmlEnumValue("PHP")
        @JsonProperty("PHP")
        PHP("PHP"),

        @XmlEnumValue("PKR")
        @JsonProperty("PKR")
        PKR("PKR"),

        @XmlEnumValue("PLN")
        @JsonProperty("PLN")
        PLN("PLN"),

        @XmlEnumValue("PYG")
        @JsonProperty("PYG")
        PYG("PYG"),

        @XmlEnumValue("QAR")
        @JsonProperty("QAR")
        QAR("QAR"),

        @XmlEnumValue("RON")
        @JsonProperty("RON")
        RON("RON"),

        @XmlEnumValue("RSD")
        @JsonProperty("RSD")
        RSD("RSD"),

        @XmlEnumValue("RUB")
        @JsonProperty("RUB")
        RUB("RUB"),

        @XmlEnumValue("RWF")
        @JsonProperty("RWF")
        RWF("RWF"),

        @XmlEnumValue("SAR")
        @JsonProperty("SAR")
        SAR("SAR"),

        @XmlEnumValue("SBD")
        @JsonProperty("SBD")
        SBD("SBD"),

        @XmlEnumValue("SCR")
        @JsonProperty("SCR")
        SCR("SCR"),

        @XmlEnumValue("SDG")
        @JsonProperty("SDG")
        SDG("SDG"),

        @XmlEnumValue("SDR")
        @JsonProperty("SDR")
        SDR("SDR"),

        @XmlEnumValue("SEK")
        @JsonProperty("SEK")
        SEK("SEK"),

        @XmlEnumValue("SGD")
        @JsonProperty("SGD")
        SGD("SGD"),

        @XmlEnumValue("SHP")
        @JsonProperty("SHP")
        SHP("SHP"),

        @XmlEnumValue("SLL")
        @JsonProperty("SLL")
        SLL("SLL"),

        @XmlEnumValue("SOS")
        @JsonProperty("SOS")
        SOS("SOS"),

        @XmlEnumValue("SRD")
        @JsonProperty("SRD")
        SRD("SRD"),

        @XmlEnumValue("SSP")
        @JsonProperty("SSP")
        SSP("SSP"),

        @XmlEnumValue("STD")
        @JsonProperty("STD")
        STD("STD"),

        @XmlEnumValue("SVC")
        @JsonProperty("SVC")
        SVC("SVC"),

        @XmlEnumValue("SYP")
        @JsonProperty("SYP")
        SYP("SYP"),

        @XmlEnumValue("SZL")
        @JsonProperty("SZL")
        SZL("SZL"),

        @XmlEnumValue("THB")
        @JsonProperty("THB")
        THB("THB"),

        @XmlEnumValue("TJS")
        @JsonProperty("TJS")
        TJS("TJS"),

        @XmlEnumValue("TMT")
        @JsonProperty("TMT")
        TMT("TMT"),

        @XmlEnumValue("TND")
        @JsonProperty("TND")
        TND("TND"),

        @XmlEnumValue("TOP")
        @JsonProperty("TOP")
        TOP("TOP"),

        @XmlEnumValue("TRY")
        @JsonProperty("TRY")
        TRY("TRY"),

        @XmlEnumValue("TTD")
        @JsonProperty("TTD")
        TTD("TTD"),

        @XmlEnumValue("TWD")
        @JsonProperty("TWD")
        TWD("TWD"),

        @XmlEnumValue("TZS")
        @JsonProperty("TZS")
        TZS("TZS"),

        @XmlEnumValue("UAH")
        @JsonProperty("UAH")
        UAH("UAH"),

        @XmlEnumValue("UGX")
        @JsonProperty("UGX")
        UGX("UGX"),

        @XmlEnumValue("USD")
        @JsonProperty("USD")
        USD("USD"),

        @XmlEnumValue("UYU")
        @JsonProperty("UYU")
        UYU("UYU"),

        @XmlEnumValue("UZS")
        @JsonProperty("UZS")
        UZS("UZS"),

        @XmlEnumValue("VEF")
        @JsonProperty("VEF")
        VEF("VEF"),

        @XmlEnumValue("VND")
        @JsonProperty("VND")
        VND("VND"),

        @XmlEnumValue("VUV")
        @JsonProperty("VUV")
        VUV("VUV"),

        @XmlEnumValue("WST")
        @JsonProperty("WST")
        WST("WST"),

        @XmlEnumValue("XAF")
        @JsonProperty("XAF")
        XAF("XAF"),

        @XmlEnumValue("XAU")
        @JsonProperty("XAU")
        XAU("XAU"),

        @XmlEnumValue("XCD")
        @JsonProperty("XCD")
        XCD("XCD"),

        @XmlEnumValue("XOF")
        @JsonProperty("XOF")
        XOF("XOF"),

        @XmlEnumValue("XPF")
        @JsonProperty("XPF")
        XPF("XPF"),

        @XmlEnumValue("YER")
        @JsonProperty("YER")
        YER("YER"),

        @XmlEnumValue("ZAR")
        @JsonProperty("ZAR")
        ZAR("ZAR"),

        @XmlEnumValue("ZMW")
        @JsonProperty("ZMW")
        ZMW("ZMW");


        private final String value;

        CurrencyTypeCodeEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CurrencyTypeCodeEnum fromValue(String v) {
            for (CurrencyTypeCodeEnum b : CurrencyTypeCodeEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CurrencyTypeCodeEnum");
        }
    }

    @XmlElement(name = "currencyTypeCode", required = true)
    @ApiModelProperty(required = true, value = "")
    private CurrencyTypeCodeEnum currencyTypeCode = null;

    /**
     * Get currencyTypeCode
     *
     * @return currencyTypeCode
     **/
    @JsonProperty("currencyTypeCode")
    @NotNull
    public String getCurrencyTypeCode() {
        if (currencyTypeCode == null) {
            return null;
        }
        return currencyTypeCode.value();
    }

    public void setCurrencyTypeCode(CurrencyTypeCodeEnum currencyTypeCode) {
        this.currencyTypeCode = currencyTypeCode;
    }

    public CurrencyExchange currencyTypeCode(CurrencyTypeCodeEnum currencyTypeCode) {
        this.currencyTypeCode = currencyTypeCode;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class CurrencyExchange {\n" +
                "    currencyTypeCode: " + toIndentedString(currencyTypeCode) + "\n" +
                "}";
        return sb;
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

