package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "CurrencyExchange", propOrder =
    { "currencyTypeCode"
})

@XmlRootElement(name="CurrencyExchange")
public class CurrencyExchange  {
  

@XmlType(name="CurrencyTypeCodeEnum")
@XmlEnum(String.class)
public enum CurrencyTypeCodeEnum {

	@XmlEnumValue("AED")
	@JsonProperty("AED")
	AED(String.valueOf("AED")),
	
	@XmlEnumValue("AFN")
	@JsonProperty("AFN")
	AFN(String.valueOf("AFN")),
	
	@XmlEnumValue("ALL")
	@JsonProperty("ALL")
	ALL(String.valueOf("ALL")),
	
	@XmlEnumValue("AMD")
	@JsonProperty("AMD")
	AMD(String.valueOf("AMD")),
	
	@XmlEnumValue("ANG")
	@JsonProperty("ANG")
	ANG(String.valueOf("ANG")),
	
	@XmlEnumValue("AOA")
	@JsonProperty("AOA")
	AOA(String.valueOf("AOA")),
	
	@XmlEnumValue("ARS")
	@JsonProperty("ARS")
	ARS(String.valueOf("ARS")),
	
	@XmlEnumValue("AUD")
	@JsonProperty("AUD")
	AUD(String.valueOf("AUD")),
	
	@XmlEnumValue("AWG")
	@JsonProperty("AWG")
	AWG(String.valueOf("AWG")),
	
	@XmlEnumValue("BBD")
	@JsonProperty("BBD")
	BBD(String.valueOf("BBD")),
	
	@XmlEnumValue("BDT")
	@JsonProperty("BDT")
	BDT(String.valueOf("BDT")),
	
	@XmlEnumValue("BGN")
	@JsonProperty("BGN")
	BGN(String.valueOf("BGN")),
	
	@XmlEnumValue("BHD")
	@JsonProperty("BHD")
	BHD(String.valueOf("BHD")),
	
	@XmlEnumValue("BIF")
	@JsonProperty("BIF")
	BIF(String.valueOf("BIF")),
	
	@XmlEnumValue("BMD")
	@JsonProperty("BMD")
	BMD(String.valueOf("BMD")),
	
	@XmlEnumValue("BND")
	@JsonProperty("BND")
	BND(String.valueOf("BND")),
	
	@XmlEnumValue("BOB")
	@JsonProperty("BOB")
	BOB(String.valueOf("BOB")),
	
	@XmlEnumValue("BRL")
	@JsonProperty("BRL")
	BRL(String.valueOf("BRL")),
	
	@XmlEnumValue("BSD")
	@JsonProperty("BSD")
	BSD(String.valueOf("BSD")),
	
	@XmlEnumValue("BTN")
	@JsonProperty("BTN")
	BTN(String.valueOf("BTN")),
	
	@XmlEnumValue("BWP")
	@JsonProperty("BWP")
	BWP(String.valueOf("BWP")),
	
	@XmlEnumValue("BYN")
	@JsonProperty("BYN")
	BYN(String.valueOf("BYN")),
	
	@XmlEnumValue("BZD")
	@JsonProperty("BZD")
	BZD(String.valueOf("BZD")),
	
	@XmlEnumValue("CAD")
	@JsonProperty("CAD")
	CAD(String.valueOf("CAD")),
	
	@XmlEnumValue("CDF")
	@JsonProperty("CDF")
	CDF(String.valueOf("CDF")),
	
	@XmlEnumValue("CHF")
	@JsonProperty("CHF")
	CHF(String.valueOf("CHF")),
	
	@XmlEnumValue("CLF")
	@JsonProperty("CLF")
	CLF(String.valueOf("CLF")),
	
	@XmlEnumValue("CLP")
	@JsonProperty("CLP")
	CLP(String.valueOf("CLP")),
	
	@XmlEnumValue("CNH")
	@JsonProperty("CNH")
	CNH(String.valueOf("CNH")),
	
	@XmlEnumValue("CNY")
	@JsonProperty("CNY")
	CNY(String.valueOf("CNY")),
	
	@XmlEnumValue("COP")
	@JsonProperty("COP")
	COP(String.valueOf("COP")),
	
	@XmlEnumValue("CRC")
	@JsonProperty("CRC")
	CRC(String.valueOf("CRC")),
	
	@XmlEnumValue("CUP")
	@JsonProperty("CUP")
	CUP(String.valueOf("CUP")),
	
	@XmlEnumValue("CVE")
	@JsonProperty("CVE")
	CVE(String.valueOf("CVE")),
	
	@XmlEnumValue("CZK")
	@JsonProperty("CZK")
	CZK(String.valueOf("CZK")),
	
	@XmlEnumValue("DJF")
	@JsonProperty("DJF")
	DJF(String.valueOf("DJF")),
	
	@XmlEnumValue("DKK")
	@JsonProperty("DKK")
	DKK(String.valueOf("DKK")),
	
	@XmlEnumValue("DOP")
	@JsonProperty("DOP")
	DOP(String.valueOf("DOP")),
	
	@XmlEnumValue("DZD")
	@JsonProperty("DZD")
	DZD(String.valueOf("DZD")),
	
	@XmlEnumValue("EGP")
	@JsonProperty("EGP")
	EGP(String.valueOf("EGP")),
	
	@XmlEnumValue("ERN")
	@JsonProperty("ERN")
	ERN(String.valueOf("ERN")),
	
	@XmlEnumValue("ETB")
	@JsonProperty("ETB")
	ETB(String.valueOf("ETB")),
	
	@XmlEnumValue("EUR")
	@JsonProperty("EUR")
	EUR(String.valueOf("EUR")),
	
	@XmlEnumValue("FJD")
	@JsonProperty("FJD")
	FJD(String.valueOf("FJD")),
	
	@XmlEnumValue("FKP")
	@JsonProperty("FKP")
	FKP(String.valueOf("FKP")),
	
	@XmlEnumValue("GBP")
	@JsonProperty("GBP")
	GBP(String.valueOf("GBP")),
	
	@XmlEnumValue("GEL")
	@JsonProperty("GEL")
	GEL(String.valueOf("GEL")),
	
	@XmlEnumValue("GHS")
	@JsonProperty("GHS")
	GHS(String.valueOf("GHS")),
	
	@XmlEnumValue("GIP")
	@JsonProperty("GIP")
	GIP(String.valueOf("GIP")),
	
	@XmlEnumValue("GMD")
	@JsonProperty("GMD")
	GMD(String.valueOf("GMD")),
	
	@XmlEnumValue("GNF")
	@JsonProperty("GNF")
	GNF(String.valueOf("GNF")),
	
	@XmlEnumValue("GTQ")
	@JsonProperty("GTQ")
	GTQ(String.valueOf("GTQ")),
	
	@XmlEnumValue("GYD")
	@JsonProperty("GYD")
	GYD(String.valueOf("GYD")),
	
	@XmlEnumValue("HKD")
	@JsonProperty("HKD")
	HKD(String.valueOf("HKD")),
	
	@XmlEnumValue("HNL")
	@JsonProperty("HNL")
	HNL(String.valueOf("HNL")),
	
	@XmlEnumValue("HRK")
	@JsonProperty("HRK")
	HRK(String.valueOf("HRK")),
	
	@XmlEnumValue("HTG")
	@JsonProperty("HTG")
	HTG(String.valueOf("HTG")),
	
	@XmlEnumValue("HUF")
	@JsonProperty("HUF")
	HUF(String.valueOf("HUF")),
	
	@XmlEnumValue("IDR")
	@JsonProperty("IDR")
	IDR(String.valueOf("IDR")),
	
	@XmlEnumValue("ILS")
	@JsonProperty("ILS")
	ILS(String.valueOf("ILS")),
	
	@XmlEnumValue("INR")
	@JsonProperty("INR")
	INR(String.valueOf("INR")),
	
	@XmlEnumValue("IQD")
	@JsonProperty("IQD")
	IQD(String.valueOf("IQD")),
	
	@XmlEnumValue("IRR")
	@JsonProperty("IRR")
	IRR(String.valueOf("IRR")),
	
	@XmlEnumValue("ISK")
	@JsonProperty("ISK")
	ISK(String.valueOf("ISK")),
	
	@XmlEnumValue("JMD")
	@JsonProperty("JMD")
	JMD(String.valueOf("JMD")),
	
	@XmlEnumValue("JOD")
	@JsonProperty("JOD")
	JOD(String.valueOf("JOD")),
	
	@XmlEnumValue("JPY")
	@JsonProperty("JPY")
	JPY(String.valueOf("JPY")),
	
	@XmlEnumValue("KES")
	@JsonProperty("KES")
	KES(String.valueOf("KES")),
	
	@XmlEnumValue("KGS")
	@JsonProperty("KGS")
	KGS(String.valueOf("KGS")),
	
	@XmlEnumValue("KHR")
	@JsonProperty("KHR")
	KHR(String.valueOf("KHR")),
	
	@XmlEnumValue("KMF")
	@JsonProperty("KMF")
	KMF(String.valueOf("KMF")),
	
	@XmlEnumValue("KRW")
	@JsonProperty("KRW")
	KRW(String.valueOf("KRW")),
	
	@XmlEnumValue("KWD")
	@JsonProperty("KWD")
	KWD(String.valueOf("KWD")),
	
	@XmlEnumValue("KYD")
	@JsonProperty("KYD")
	KYD(String.valueOf("KYD")),
	
	@XmlEnumValue("KZT")
	@JsonProperty("KZT")
	KZT(String.valueOf("KZT")),
	
	@XmlEnumValue("LAK")
	@JsonProperty("LAK")
	LAK(String.valueOf("LAK")),
	
	@XmlEnumValue("LBP")
	@JsonProperty("LBP")
	LBP(String.valueOf("LBP")),
	
	@XmlEnumValue("LKR")
	@JsonProperty("LKR")
	LKR(String.valueOf("LKR")),
	
	@XmlEnumValue("LRD")
	@JsonProperty("LRD")
	LRD(String.valueOf("LRD")),
	
	@XmlEnumValue("LSL")
	@JsonProperty("LSL")
	LSL(String.valueOf("LSL")),
	
	@XmlEnumValue("LYD")
	@JsonProperty("LYD")
	LYD(String.valueOf("LYD")),
	
	@XmlEnumValue("MAD")
	@JsonProperty("MAD")
	MAD(String.valueOf("MAD")),
	
	@XmlEnumValue("MDL")
	@JsonProperty("MDL")
	MDL(String.valueOf("MDL")),
	
	@XmlEnumValue("MGA")
	@JsonProperty("MGA")
	MGA(String.valueOf("MGA")),
	
	@XmlEnumValue("MKD")
	@JsonProperty("MKD")
	MKD(String.valueOf("MKD")),
	
	@XmlEnumValue("MMK")
	@JsonProperty("MMK")
	MMK(String.valueOf("MMK")),
	
	@XmlEnumValue("MNT")
	@JsonProperty("MNT")
	MNT(String.valueOf("MNT")),
	
	@XmlEnumValue("MOP")
	@JsonProperty("MOP")
	MOP(String.valueOf("MOP")),
	
	@XmlEnumValue("MRO")
	@JsonProperty("MRO")
	MRO(String.valueOf("MRO")),
	
	@XmlEnumValue("MUR")
	@JsonProperty("MUR")
	MUR(String.valueOf("MUR")),
	
	@XmlEnumValue("MVR")
	@JsonProperty("MVR")
	MVR(String.valueOf("MVR")),
	
	@XmlEnumValue("MWK")
	@JsonProperty("MWK")
	MWK(String.valueOf("MWK")),
	
	@XmlEnumValue("MXN")
	@JsonProperty("MXN")
	MXN(String.valueOf("MXN")),
	
	@XmlEnumValue("MYR")
	@JsonProperty("MYR")
	MYR(String.valueOf("MYR")),
	
	@XmlEnumValue("MZN")
	@JsonProperty("MZN")
	MZN(String.valueOf("MZN")),
	
	@XmlEnumValue("NAD")
	@JsonProperty("NAD")
	NAD(String.valueOf("NAD")),
	
	@XmlEnumValue("NGN")
	@JsonProperty("NGN")
	NGN(String.valueOf("NGN")),
	
	@XmlEnumValue("NIO")
	@JsonProperty("NIO")
	NIO(String.valueOf("NIO")),
	
	@XmlEnumValue("NOK")
	@JsonProperty("NOK")
	NOK(String.valueOf("NOK")),
	
	@XmlEnumValue("NPR")
	@JsonProperty("NPR")
	NPR(String.valueOf("NPR")),
	
	@XmlEnumValue("NZD")
	@JsonProperty("NZD")
	NZD(String.valueOf("NZD")),
	
	@XmlEnumValue("OMR")
	@JsonProperty("OMR")
	OMR(String.valueOf("OMR")),
	
	@XmlEnumValue("PAB")
	@JsonProperty("PAB")
	PAB(String.valueOf("PAB")),
	
	@XmlEnumValue("PEN")
	@JsonProperty("PEN")
	PEN(String.valueOf("PEN")),
	
	@XmlEnumValue("PGK")
	@JsonProperty("PGK")
	PGK(String.valueOf("PGK")),
	
	@XmlEnumValue("PHP")
	@JsonProperty("PHP")
	PHP(String.valueOf("PHP")),
	
	@XmlEnumValue("PKR")
	@JsonProperty("PKR")
	PKR(String.valueOf("PKR")),
	
	@XmlEnumValue("PLN")
	@JsonProperty("PLN")
	PLN(String.valueOf("PLN")),
	
	@XmlEnumValue("PYG")
	@JsonProperty("PYG")
	PYG(String.valueOf("PYG")),
	
	@XmlEnumValue("QAR")
	@JsonProperty("QAR")
	QAR(String.valueOf("QAR")),
	
	@XmlEnumValue("RON")
	@JsonProperty("RON")
	RON(String.valueOf("RON")),
	
	@XmlEnumValue("RSD")
	@JsonProperty("RSD")
	RSD(String.valueOf("RSD")),
	
	@XmlEnumValue("RUB")
	@JsonProperty("RUB")
	RUB(String.valueOf("RUB")),
	
	@XmlEnumValue("RWF")
	@JsonProperty("RWF")
	RWF(String.valueOf("RWF")),
	
	@XmlEnumValue("SAR")
	@JsonProperty("SAR")
	SAR(String.valueOf("SAR")),
	
	@XmlEnumValue("SBD")
	@JsonProperty("SBD")
	SBD(String.valueOf("SBD")),
	
	@XmlEnumValue("SCR")
	@JsonProperty("SCR")
	SCR(String.valueOf("SCR")),
	
	@XmlEnumValue("SDG")
	@JsonProperty("SDG")
	SDG(String.valueOf("SDG")),
	
	@XmlEnumValue("SDR")
	@JsonProperty("SDR")
	SDR(String.valueOf("SDR")),
	
	@XmlEnumValue("SEK")
	@JsonProperty("SEK")
	SEK(String.valueOf("SEK")),
	
	@XmlEnumValue("SGD")
	@JsonProperty("SGD")
	SGD(String.valueOf("SGD")),
	
	@XmlEnumValue("SHP")
	@JsonProperty("SHP")
	SHP(String.valueOf("SHP")),
	
	@XmlEnumValue("SLL")
	@JsonProperty("SLL")
	SLL(String.valueOf("SLL")),
	
	@XmlEnumValue("SOS")
	@JsonProperty("SOS")
	SOS(String.valueOf("SOS")),
	
	@XmlEnumValue("SRD")
	@JsonProperty("SRD")
	SRD(String.valueOf("SRD")),
	
	@XmlEnumValue("SSP")
	@JsonProperty("SSP")
	SSP(String.valueOf("SSP")),
	
	@XmlEnumValue("STD")
	@JsonProperty("STD")
	STD(String.valueOf("STD")),
	
	@XmlEnumValue("SVC")
	@JsonProperty("SVC")
	SVC(String.valueOf("SVC")),
	
	@XmlEnumValue("SYP")
	@JsonProperty("SYP")
	SYP(String.valueOf("SYP")),
	
	@XmlEnumValue("SZL")
	@JsonProperty("SZL")
	SZL(String.valueOf("SZL")),
	
	@XmlEnumValue("THB")
	@JsonProperty("THB")
	THB(String.valueOf("THB")),
	
	@XmlEnumValue("TJS")
	@JsonProperty("TJS")
	TJS(String.valueOf("TJS")),
	
	@XmlEnumValue("TMT")
	@JsonProperty("TMT")
	TMT(String.valueOf("TMT")),
	
	@XmlEnumValue("TND")
	@JsonProperty("TND")
	TND(String.valueOf("TND")),
	
	@XmlEnumValue("TOP")
	@JsonProperty("TOP")
	TOP(String.valueOf("TOP")),
	
	@XmlEnumValue("TRY")
	@JsonProperty("TRY")
	TRY(String.valueOf("TRY")),
	
	@XmlEnumValue("TTD")
	@JsonProperty("TTD")
	TTD(String.valueOf("TTD")),
	
	@XmlEnumValue("TWD")
	@JsonProperty("TWD")
	TWD(String.valueOf("TWD")),
	
	@XmlEnumValue("TZS")
	@JsonProperty("TZS")
	TZS(String.valueOf("TZS")),
	
	@XmlEnumValue("UAH")
	@JsonProperty("UAH")
	UAH(String.valueOf("UAH")),
	
	@XmlEnumValue("UGX")
	@JsonProperty("UGX")
	UGX(String.valueOf("UGX")),
	
	@XmlEnumValue("USD")
	@JsonProperty("USD")
	USD(String.valueOf("USD")),
	
	@XmlEnumValue("UYU")
	@JsonProperty("UYU")
	UYU(String.valueOf("UYU")),
	
	@XmlEnumValue("UZS")
	@JsonProperty("UZS")
	UZS(String.valueOf("UZS")),
	
	@XmlEnumValue("VEF")
	@JsonProperty("VEF")
	VEF(String.valueOf("VEF")),
	
	@XmlEnumValue("VND")
	@JsonProperty("VND")
	VND(String.valueOf("VND")),
	
	@XmlEnumValue("VUV")
	@JsonProperty("VUV")
	VUV(String.valueOf("VUV")),
	
	@XmlEnumValue("WST")
	@JsonProperty("WST")
	WST(String.valueOf("WST")),
	
	@XmlEnumValue("XAF")
	@JsonProperty("XAF")
	XAF(String.valueOf("XAF")),
	
	@XmlEnumValue("XAU")
	@JsonProperty("XAU")
	XAU(String.valueOf("XAU")),
	
	@XmlEnumValue("XCD")
	@JsonProperty("XCD")
	XCD(String.valueOf("XCD")),
	
	@XmlEnumValue("XOF")
	@JsonProperty("XOF")
	XOF(String.valueOf("XOF")),
	
	@XmlEnumValue("XPF")
	@JsonProperty("XPF")
	XPF(String.valueOf("XPF")),
	
	@XmlEnumValue("YER")
	@JsonProperty("YER")
	YER(String.valueOf("YER")),
	
	@XmlEnumValue("ZAR")
	@JsonProperty("ZAR")
	ZAR(String.valueOf("ZAR")),
	
	@XmlEnumValue("ZMW")
	@JsonProperty("ZMW")
	ZMW(String.valueOf("ZMW"));


    private String value;

    CurrencyTypeCodeEnum (String v) {
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

  @XmlElement(name="currencyTypeCode", required = true)
  @ApiModelProperty(required = true, value = "")
  private CurrencyTypeCodeEnum currencyTypeCode = null;
 /**
   * Get currencyTypeCode
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
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyExchange {\n");
    
    sb.append("    currencyTypeCode: ").append(toIndentedString(currencyTypeCode)).append("\n");
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

