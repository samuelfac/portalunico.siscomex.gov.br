package br.gov.siscomex.portalunico.due.model;

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
@XmlType(name = "Address", propOrder =
        {"countryCode", "line"
        })

@XmlRootElement(name = "Address")
public class Address {


    @XmlType(name = "CountryCodeEnum")
    @XmlEnum(String.class)
    public enum CountryCodeEnum {

        @XmlEnumValue("AD")
        @JsonProperty("AD")
        AD("AD"),

        @XmlEnumValue("AE")
        @JsonProperty("AE")
        AE("AE"),

        @XmlEnumValue("AF")
        @JsonProperty("AF")
        AF("AF"),

        @XmlEnumValue("AG")
        @JsonProperty("AG")
        AG("AG"),

        @XmlEnumValue("AI")
        @JsonProperty("AI")
        AI("AI"),

        @XmlEnumValue("AL")
        @JsonProperty("AL")
        AL("AL"),

        @XmlEnumValue("AM")
        @JsonProperty("AM")
        AM("AM"),

        @XmlEnumValue("AO")
        @JsonProperty("AO")
        AO("AO"),

        @XmlEnumValue("AR")
        @JsonProperty("AR")
        AR("AR"),

        @XmlEnumValue("AS")
        @JsonProperty("AS")
        AS("AS"),

        @XmlEnumValue("AT")
        @JsonProperty("AT")
        AT("AT"),

        @XmlEnumValue("AU")
        @JsonProperty("AU")
        AU("AU"),

        @XmlEnumValue("AW")
        @JsonProperty("AW")
        AW("AW"),

        @XmlEnumValue("AX")
        @JsonProperty("AX")
        AX("AX"),

        @XmlEnumValue("AZ")
        @JsonProperty("AZ")
        AZ("AZ"),

        @XmlEnumValue("BA")
        @JsonProperty("BA")
        BA("BA"),

        @XmlEnumValue("BB")
        @JsonProperty("BB")
        BB("BB"),

        @XmlEnumValue("BD")
        @JsonProperty("BD")
        BD("BD"),

        @XmlEnumValue("BE")
        @JsonProperty("BE")
        BE("BE"),

        @XmlEnumValue("BF")
        @JsonProperty("BF")
        BF("BF"),

        @XmlEnumValue("BG")
        @JsonProperty("BG")
        BG("BG"),

        @XmlEnumValue("BH")
        @JsonProperty("BH")
        BH("BH"),

        @XmlEnumValue("BI")
        @JsonProperty("BI")
        BI("BI"),

        @XmlEnumValue("BJ")
        @JsonProperty("BJ")
        BJ("BJ"),

        @XmlEnumValue("BL")
        @JsonProperty("BL")
        BL("BL"),

        @XmlEnumValue("BM")
        @JsonProperty("BM")
        BM("BM"),

        @XmlEnumValue("BN")
        @JsonProperty("BN")
        BN("BN"),

        @XmlEnumValue("BO")
        @JsonProperty("BO")
        BO("BO"),

        @XmlEnumValue("BQ")
        @JsonProperty("BQ")
        BQ("BQ"),

        @XmlEnumValue("BR")
        @JsonProperty("BR")
        BR("BR"),

        @XmlEnumValue("BS")
        @JsonProperty("BS")
        BS("BS"),

        @XmlEnumValue("BT")
        @JsonProperty("BT")
        BT("BT"),

        @XmlEnumValue("BV")
        @JsonProperty("BV")
        BV("BV"),

        @XmlEnumValue("BW")
        @JsonProperty("BW")
        BW("BW"),

        @XmlEnumValue("BY")
        @JsonProperty("BY")
        BY("BY"),

        @XmlEnumValue("BZ")
        @JsonProperty("BZ")
        BZ("BZ"),

        @XmlEnumValue("CA")
        @JsonProperty("CA")
        CA("CA"),

        @XmlEnumValue("CC")
        @JsonProperty("CC")
        CC("CC"),

        @XmlEnumValue("CD")
        @JsonProperty("CD")
        CD("CD"),

        @XmlEnumValue("CF")
        @JsonProperty("CF")
        CF("CF"),

        @XmlEnumValue("CG")
        @JsonProperty("CG")
        CG("CG"),

        @XmlEnumValue("CH")
        @JsonProperty("CH")
        CH("CH"),

        @XmlEnumValue("CI")
        @JsonProperty("CI")
        CI("CI"),

        @XmlEnumValue("CK")
        @JsonProperty("CK")
        CK("CK"),

        @XmlEnumValue("CL")
        @JsonProperty("CL")
        CL("CL"),

        @XmlEnumValue("CM")
        @JsonProperty("CM")
        CM("CM"),

        @XmlEnumValue("CN")
        @JsonProperty("CN")
        CN("CN"),

        @XmlEnumValue("CO")
        @JsonProperty("CO")
        CO("CO"),

        @XmlEnumValue("CR")
        @JsonProperty("CR")
        CR("CR"),

        @XmlEnumValue("CU")
        @JsonProperty("CU")
        CU("CU"),

        @XmlEnumValue("CV")
        @JsonProperty("CV")
        CV("CV"),

        @XmlEnumValue("CW")
        @JsonProperty("CW")
        CW("CW"),

        @XmlEnumValue("CX")
        @JsonProperty("CX")
        CX("CX"),

        @XmlEnumValue("CY")
        @JsonProperty("CY")
        CY("CY"),

        @XmlEnumValue("CZ")
        @JsonProperty("CZ")
        CZ("CZ"),

        @XmlEnumValue("DE")
        @JsonProperty("DE")
        DE("DE"),

        @XmlEnumValue("DJ")
        @JsonProperty("DJ")
        DJ("DJ"),

        @XmlEnumValue("DK")
        @JsonProperty("DK")
        DK("DK"),

        @XmlEnumValue("DM")
        @JsonProperty("DM")
        DM("DM"),

        @XmlEnumValue("DO")
        @JsonProperty("DO")
        DO("DO"),

        @XmlEnumValue("DZ")
        @JsonProperty("DZ")
        DZ("DZ"),

        @XmlEnumValue("EC")
        @JsonProperty("EC")
        EC("EC"),

        @XmlEnumValue("EE")
        @JsonProperty("EE")
        EE("EE"),

        @XmlEnumValue("EG")
        @JsonProperty("EG")
        EG("EG"),

        @XmlEnumValue("EH")
        @JsonProperty("EH")
        EH("EH"),

        @XmlEnumValue("ER")
        @JsonProperty("ER")
        ER("ER"),

        @XmlEnumValue("ES")
        @JsonProperty("ES")
        ES("ES"),

        @XmlEnumValue("ET")
        @JsonProperty("ET")
        ET("ET"),

        @XmlEnumValue("FI")
        @JsonProperty("FI")
        FI("FI"),

        @XmlEnumValue("FJ")
        @JsonProperty("FJ")
        FJ("FJ"),

        @XmlEnumValue("FK")
        @JsonProperty("FK")
        FK("FK"),

        @XmlEnumValue("FM")
        @JsonProperty("FM")
        FM("FM"),

        @XmlEnumValue("FO")
        @JsonProperty("FO")
        FO("FO"),

        @XmlEnumValue("FR")
        @JsonProperty("FR")
        FR("FR"),

        @XmlEnumValue("GA")
        @JsonProperty("GA")
        GA("GA"),

        @XmlEnumValue("GB")
        @JsonProperty("GB")
        GB("GB"),

        @XmlEnumValue("GD")
        @JsonProperty("GD")
        GD("GD"),

        @XmlEnumValue("GE")
        @JsonProperty("GE")
        GE("GE"),

        @XmlEnumValue("GF")
        @JsonProperty("GF")
        GF("GF"),

        @XmlEnumValue("GG")
        @JsonProperty("GG")
        GG("GG"),

        @XmlEnumValue("GH")
        @JsonProperty("GH")
        GH("GH"),

        @XmlEnumValue("GI")
        @JsonProperty("GI")
        GI("GI"),

        @XmlEnumValue("GL")
        @JsonProperty("GL")
        GL("GL"),

        @XmlEnumValue("GM")
        @JsonProperty("GM")
        GM("GM"),

        @XmlEnumValue("GN")
        @JsonProperty("GN")
        GN("GN"),

        @XmlEnumValue("GP")
        @JsonProperty("GP")
        GP("GP"),

        @XmlEnumValue("GQ")
        @JsonProperty("GQ")
        GQ("GQ"),

        @XmlEnumValue("GR")
        @JsonProperty("GR")
        GR("GR"),

        @XmlEnumValue("GS")
        @JsonProperty("GS")
        GS("GS"),

        @XmlEnumValue("GT")
        @JsonProperty("GT")
        GT("GT"),

        @XmlEnumValue("GU")
        @JsonProperty("GU")
        GU("GU"),

        @XmlEnumValue("GW")
        @JsonProperty("GW")
        GW("GW"),

        @XmlEnumValue("GY")
        @JsonProperty("GY")
        GY("GY"),

        @XmlEnumValue("HK")
        @JsonProperty("HK")
        HK("HK"),

        @XmlEnumValue("HM")
        @JsonProperty("HM")
        HM("HM"),

        @XmlEnumValue("HN")
        @JsonProperty("HN")
        HN("HN"),

        @XmlEnumValue("HR")
        @JsonProperty("HR")
        HR("HR"),

        @XmlEnumValue("HT")
        @JsonProperty("HT")
        HT("HT"),

        @XmlEnumValue("HU")
        @JsonProperty("HU")
        HU("HU"),

        @XmlEnumValue("ID")
        @JsonProperty("ID")
        ID("ID"),

        @XmlEnumValue("IE")
        @JsonProperty("IE")
        IE("IE"),

        @XmlEnumValue("IL")
        @JsonProperty("IL")
        IL("IL"),

        @XmlEnumValue("IM")
        @JsonProperty("IM")
        IM("IM"),

        @XmlEnumValue("IN")
        @JsonProperty("IN")
        IN("IN"),

        @XmlEnumValue("IO")
        @JsonProperty("IO")
        IO("IO"),

        @XmlEnumValue("IQ")
        @JsonProperty("IQ")
        IQ("IQ"),

        @XmlEnumValue("IR")
        @JsonProperty("IR")
        IR("IR"),

        @XmlEnumValue("IS")
        @JsonProperty("IS")
        IS("IS"),

        @XmlEnumValue("IT")
        @JsonProperty("IT")
        IT("IT"),

        @XmlEnumValue("JE")
        @JsonProperty("JE")
        JE("JE"),

        @XmlEnumValue("JM")
        @JsonProperty("JM")
        JM("JM"),

        @XmlEnumValue("JO")
        @JsonProperty("JO")
        JO("JO"),

        @XmlEnumValue("JP")
        @JsonProperty("JP")
        JP("JP"),

        @XmlEnumValue("KE")
        @JsonProperty("KE")
        KE("KE"),

        @XmlEnumValue("KG")
        @JsonProperty("KG")
        KG("KG"),

        @XmlEnumValue("KH")
        @JsonProperty("KH")
        KH("KH"),

        @XmlEnumValue("KI")
        @JsonProperty("KI")
        KI("KI"),

        @XmlEnumValue("KM")
        @JsonProperty("KM")
        KM("KM"),

        @XmlEnumValue("KN")
        @JsonProperty("KN")
        KN("KN"),

        @XmlEnumValue("KP")
        @JsonProperty("KP")
        KP("KP"),

        @XmlEnumValue("KR")
        @JsonProperty("KR")
        KR("KR"),

        @XmlEnumValue("KW")
        @JsonProperty("KW")
        KW("KW"),

        @XmlEnumValue("KY")
        @JsonProperty("KY")
        KY("KY"),

        @XmlEnumValue("KZ")
        @JsonProperty("KZ")
        KZ("KZ"),

        @XmlEnumValue("LA")
        @JsonProperty("LA")
        LA("LA"),

        @XmlEnumValue("LB")
        @JsonProperty("LB")
        LB("LB"),

        @XmlEnumValue("LC")
        @JsonProperty("LC")
        LC("LC"),

        @XmlEnumValue("LI")
        @JsonProperty("LI")
        LI("LI"),

        @XmlEnumValue("LK")
        @JsonProperty("LK")
        LK("LK"),

        @XmlEnumValue("LR")
        @JsonProperty("LR")
        LR("LR"),

        @XmlEnumValue("LS")
        @JsonProperty("LS")
        LS("LS"),

        @XmlEnumValue("LT")
        @JsonProperty("LT")
        LT("LT"),

        @XmlEnumValue("LU")
        @JsonProperty("LU")
        LU("LU"),

        @XmlEnumValue("LV")
        @JsonProperty("LV")
        LV("LV"),

        @XmlEnumValue("LY")
        @JsonProperty("LY")
        LY("LY"),

        @XmlEnumValue("MA")
        @JsonProperty("MA")
        MA("MA"),

        @XmlEnumValue("MC")
        @JsonProperty("MC")
        MC("MC"),

        @XmlEnumValue("MD")
        @JsonProperty("MD")
        MD("MD"),

        @XmlEnumValue("ME")
        @JsonProperty("ME")
        ME("ME"),

        @XmlEnumValue("MF")
        @JsonProperty("MF")
        MF("MF"),

        @XmlEnumValue("MG")
        @JsonProperty("MG")
        MG("MG"),

        @XmlEnumValue("MH")
        @JsonProperty("MH")
        MH("MH"),

        @XmlEnumValue("MK")
        @JsonProperty("MK")
        MK("MK"),

        @XmlEnumValue("ML")
        @JsonProperty("ML")
        ML("ML"),

        @XmlEnumValue("MM")
        @JsonProperty("MM")
        MM("MM"),

        @XmlEnumValue("MN")
        @JsonProperty("MN")
        MN("MN"),

        @XmlEnumValue("MO")
        @JsonProperty("MO")
        MO("MO"),

        @XmlEnumValue("MP")
        @JsonProperty("MP")
        MP("MP"),

        @XmlEnumValue("MQ")
        @JsonProperty("MQ")
        MQ("MQ"),

        @XmlEnumValue("MR")
        @JsonProperty("MR")
        MR("MR"),

        @XmlEnumValue("MS")
        @JsonProperty("MS")
        MS("MS"),

        @XmlEnumValue("MT")
        @JsonProperty("MT")
        MT("MT"),

        @XmlEnumValue("MU")
        @JsonProperty("MU")
        MU("MU"),

        @XmlEnumValue("MV")
        @JsonProperty("MV")
        MV("MV"),

        @XmlEnumValue("MW")
        @JsonProperty("MW")
        MW("MW"),

        @XmlEnumValue("MX")
        @JsonProperty("MX")
        MX("MX"),

        @XmlEnumValue("MY")
        @JsonProperty("MY")
        MY("MY"),

        @XmlEnumValue("MZ")
        @JsonProperty("MZ")
        MZ("MZ"),

        @XmlEnumValue("NA")
        @JsonProperty("NA")
        NA("NA"),

        @XmlEnumValue("NC")
        @JsonProperty("NC")
        NC("NC"),

        @XmlEnumValue("NE")
        @JsonProperty("NE")
        NE("NE"),

        @XmlEnumValue("NF")
        @JsonProperty("NF")
        NF("NF"),

        @XmlEnumValue("NG")
        @JsonProperty("NG")
        NG("NG"),

        @XmlEnumValue("NI")
        @JsonProperty("NI")
        NI("NI"),

        @XmlEnumValue("NL")
        @JsonProperty("NL")
        NL("NL"),

        @XmlEnumValue("NO")
        @JsonProperty("NO")
        NO("NO"),

        @XmlEnumValue("NP")
        @JsonProperty("NP")
        NP("NP"),

        @XmlEnumValue("NR")
        @JsonProperty("NR")
        NR("NR"),

        @XmlEnumValue("NU")
        @JsonProperty("NU")
        NU("NU"),

        @XmlEnumValue("NZ")
        @JsonProperty("NZ")
        NZ("NZ"),

        @XmlEnumValue("OM")
        @JsonProperty("OM")
        OM("OM"),

        @XmlEnumValue("PA")
        @JsonProperty("PA")
        PA("PA"),

        @XmlEnumValue("PE")
        @JsonProperty("PE")
        PE("PE"),

        @XmlEnumValue("PF")
        @JsonProperty("PF")
        PF("PF"),

        @XmlEnumValue("PG")
        @JsonProperty("PG")
        PG("PG"),

        @XmlEnumValue("PH")
        @JsonProperty("PH")
        PH("PH"),

        @XmlEnumValue("PK")
        @JsonProperty("PK")
        PK("PK"),

        @XmlEnumValue("PL")
        @JsonProperty("PL")
        PL("PL"),

        @XmlEnumValue("PM")
        @JsonProperty("PM")
        PM("PM"),

        @XmlEnumValue("PN")
        @JsonProperty("PN")
        PN("PN"),

        @XmlEnumValue("PR")
        @JsonProperty("PR")
        PR("PR"),

        @XmlEnumValue("PS")
        @JsonProperty("PS")
        PS("PS"),

        @XmlEnumValue("PT")
        @JsonProperty("PT")
        PT("PT"),

        @XmlEnumValue("PW")
        @JsonProperty("PW")
        PW("PW"),

        @XmlEnumValue("PY")
        @JsonProperty("PY")
        PY("PY"),

        @XmlEnumValue("QA")
        @JsonProperty("QA")
        QA("QA"),

        @XmlEnumValue("RE")
        @JsonProperty("RE")
        RE("RE"),

        @XmlEnumValue("RO")
        @JsonProperty("RO")
        RO("RO"),

        @XmlEnumValue("RS")
        @JsonProperty("RS")
        RS("RS"),

        @XmlEnumValue("RU")
        @JsonProperty("RU")
        RU("RU"),

        @XmlEnumValue("RW")
        @JsonProperty("RW")
        RW("RW"),

        @XmlEnumValue("SA")
        @JsonProperty("SA")
        SA("SA"),

        @XmlEnumValue("SB")
        @JsonProperty("SB")
        SB("SB"),

        @XmlEnumValue("SC")
        @JsonProperty("SC")
        SC("SC"),

        @XmlEnumValue("SD")
        @JsonProperty("SD")
        SD("SD"),

        @XmlEnumValue("SE")
        @JsonProperty("SE")
        SE("SE"),

        @XmlEnumValue("SG")
        @JsonProperty("SG")
        SG("SG"),

        @XmlEnumValue("SH")
        @JsonProperty("SH")
        SH("SH"),

        @XmlEnumValue("SI")
        @JsonProperty("SI")
        SI("SI"),

        @XmlEnumValue("SJ")
        @JsonProperty("SJ")
        SJ("SJ"),

        @XmlEnumValue("SK")
        @JsonProperty("SK")
        SK("SK"),

        @XmlEnumValue("SL")
        @JsonProperty("SL")
        SL("SL"),

        @XmlEnumValue("SM")
        @JsonProperty("SM")
        SM("SM"),

        @XmlEnumValue("SN")
        @JsonProperty("SN")
        SN("SN"),

        @XmlEnumValue("SO")
        @JsonProperty("SO")
        SO("SO"),

        @XmlEnumValue("SR")
        @JsonProperty("SR")
        SR("SR"),

        @XmlEnumValue("SS")
        @JsonProperty("SS")
        SS("SS"),

        @XmlEnumValue("ST")
        @JsonProperty("ST")
        ST("ST"),

        @XmlEnumValue("SV")
        @JsonProperty("SV")
        SV("SV"),

        @XmlEnumValue("SX")
        @JsonProperty("SX")
        SX("SX"),

        @XmlEnumValue("SY")
        @JsonProperty("SY")
        SY("SY"),

        @XmlEnumValue("SZ")
        @JsonProperty("SZ")
        SZ("SZ"),

        @XmlEnumValue("TC")
        @JsonProperty("TC")
        TC("TC"),

        @XmlEnumValue("TD")
        @JsonProperty("TD")
        TD("TD"),

        @XmlEnumValue("TF")
        @JsonProperty("TF")
        TF("TF"),

        @XmlEnumValue("TG")
        @JsonProperty("TG")
        TG("TG"),

        @XmlEnumValue("TH")
        @JsonProperty("TH")
        TH("TH"),

        @XmlEnumValue("TJ")
        @JsonProperty("TJ")
        TJ("TJ"),

        @XmlEnumValue("TK")
        @JsonProperty("TK")
        TK("TK"),

        @XmlEnumValue("TL")
        @JsonProperty("TL")
        TL("TL"),

        @XmlEnumValue("TM")
        @JsonProperty("TM")
        TM("TM"),

        @XmlEnumValue("TN")
        @JsonProperty("TN")
        TN("TN"),

        @XmlEnumValue("TO")
        @JsonProperty("TO")
        TO("TO"),

        @XmlEnumValue("TR")
        @JsonProperty("TR")
        TR("TR"),

        @XmlEnumValue("TT")
        @JsonProperty("TT")
        TT("TT"),

        @XmlEnumValue("TV")
        @JsonProperty("TV")
        TV("TV"),

        @XmlEnumValue("TW")
        @JsonProperty("TW")
        TW("TW"),

        @XmlEnumValue("TZ")
        @JsonProperty("TZ")
        TZ("TZ"),

        @XmlEnumValue("UA")
        @JsonProperty("UA")
        UA("UA"),

        @XmlEnumValue("UG")
        @JsonProperty("UG")
        UG("UG"),

        @XmlEnumValue("UM")
        @JsonProperty("UM")
        UM("UM"),

        @XmlEnumValue("US")
        @JsonProperty("US")
        US("US"),

        @XmlEnumValue("UY")
        @JsonProperty("UY")
        UY("UY"),

        @XmlEnumValue("UZ")
        @JsonProperty("UZ")
        UZ("UZ"),

        @XmlEnumValue("VA")
        @JsonProperty("VA")
        VA("VA"),

        @XmlEnumValue("VC")
        @JsonProperty("VC")
        VC("VC"),

        @XmlEnumValue("VE")
        @JsonProperty("VE")
        VE("VE"),

        @XmlEnumValue("VG")
        @JsonProperty("VG")
        VG("VG"),

        @XmlEnumValue("VI")
        @JsonProperty("VI")
        VI("VI"),

        @XmlEnumValue("VN")
        @JsonProperty("VN")
        VN("VN"),

        @XmlEnumValue("VU")
        @JsonProperty("VU")
        VU("VU"),

        @XmlEnumValue("WF")
        @JsonProperty("WF")
        WF("WF"),

        @XmlEnumValue("WS")
        @JsonProperty("WS")
        WS("WS"),

        @XmlEnumValue("YE")
        @JsonProperty("YE")
        YE("YE"),

        @XmlEnumValue("YT")
        @JsonProperty("YT")
        YT("YT"),

        @XmlEnumValue("ZA")
        @JsonProperty("ZA")
        ZA("ZA"),

        @XmlEnumValue("ZM")
        @JsonProperty("ZM")
        ZM("ZM"),

        @XmlEnumValue("ZW")
        @JsonProperty("ZW")
        ZW("ZW");


        private final String value;

        CountryCodeEnum(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CountryCodeEnum fromValue(String v) {
            for (CountryCodeEnum b : CountryCodeEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "' to CountryCodeEnum");
        }
    }

    @XmlElement(name = "countryCode", required = true)
    @ApiModelProperty(required = true, value = "")
    private CountryCodeEnum countryCode = null;

    @XmlElement(name = "line", required = true)
    @ApiModelProperty(required = true, value = "")
    @Valid
    private AddressLineTextType line = null;

    /**
     * Get countryCode
     *
     * @return countryCode
     **/
    @JsonProperty("countryCode")
    @NotNull
    public String getCountryCode() {
        if (countryCode == null) {
            return null;
        }
        return countryCode.value();
    }

    public void setCountryCode(CountryCodeEnum countryCode) {
        this.countryCode = countryCode;
    }

    public Address countryCode(CountryCodeEnum countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get line
     *
     * @return line
     **/
    @JsonProperty("line")
    @NotNull
    public AddressLineTextType getLine() {
        return line;
    }

    public void setLine(AddressLineTextType line) {
        this.line = line;
    }

    public Address line(AddressLineTextType line) {
        this.line = line;
        return this;
    }


    @Override
    public String toString() {

        String sb = "class Address {\n" +
                "    countryCode: " + toIndentedString(countryCode) + "\n" +
                "    line: " + toIndentedString(line) + "\n" +
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

