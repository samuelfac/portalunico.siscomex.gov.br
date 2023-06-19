package br.gov.siscomex.portalunico.due.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Address", propOrder =
    { "countryCode", "line"
})

@XmlRootElement(name="Address")
public class Address  {
  

@XmlType(name="CountryCodeEnum")
@XmlEnum(String.class)
public enum CountryCodeEnum {

	@XmlEnumValue("AD")
	@JsonProperty("AD")
	AD(String.valueOf("AD")),
	
	@XmlEnumValue("AE")
	@JsonProperty("AE")
	AE(String.valueOf("AE")),
	
	@XmlEnumValue("AF")
	@JsonProperty("AF")
	AF(String.valueOf("AF")),
	
	@XmlEnumValue("AG")
	@JsonProperty("AG")
	AG(String.valueOf("AG")),
	
	@XmlEnumValue("AI")
	@JsonProperty("AI")
	AI(String.valueOf("AI")),
	
	@XmlEnumValue("AL")
	@JsonProperty("AL")
	AL(String.valueOf("AL")),
	
	@XmlEnumValue("AM")
	@JsonProperty("AM")
	AM(String.valueOf("AM")),
	
	@XmlEnumValue("AO")
	@JsonProperty("AO")
	AO(String.valueOf("AO")),
	
	@XmlEnumValue("AR")
	@JsonProperty("AR")
	AR(String.valueOf("AR")),
	
	@XmlEnumValue("AS")
	@JsonProperty("AS")
	AS(String.valueOf("AS")),
	
	@XmlEnumValue("AT")
	@JsonProperty("AT")
	AT(String.valueOf("AT")),
	
	@XmlEnumValue("AU")
	@JsonProperty("AU")
	AU(String.valueOf("AU")),
	
	@XmlEnumValue("AW")
	@JsonProperty("AW")
	AW(String.valueOf("AW")),
	
	@XmlEnumValue("AX")
	@JsonProperty("AX")
	AX(String.valueOf("AX")),
	
	@XmlEnumValue("AZ")
	@JsonProperty("AZ")
	AZ(String.valueOf("AZ")),
	
	@XmlEnumValue("BA")
	@JsonProperty("BA")
	BA(String.valueOf("BA")),
	
	@XmlEnumValue("BB")
	@JsonProperty("BB")
	BB(String.valueOf("BB")),
	
	@XmlEnumValue("BD")
	@JsonProperty("BD")
	BD(String.valueOf("BD")),
	
	@XmlEnumValue("BE")
	@JsonProperty("BE")
	BE(String.valueOf("BE")),
	
	@XmlEnumValue("BF")
	@JsonProperty("BF")
	BF(String.valueOf("BF")),
	
	@XmlEnumValue("BG")
	@JsonProperty("BG")
	BG(String.valueOf("BG")),
	
	@XmlEnumValue("BH")
	@JsonProperty("BH")
	BH(String.valueOf("BH")),
	
	@XmlEnumValue("BI")
	@JsonProperty("BI")
	BI(String.valueOf("BI")),
	
	@XmlEnumValue("BJ")
	@JsonProperty("BJ")
	BJ(String.valueOf("BJ")),
	
	@XmlEnumValue("BL")
	@JsonProperty("BL")
	BL(String.valueOf("BL")),
	
	@XmlEnumValue("BM")
	@JsonProperty("BM")
	BM(String.valueOf("BM")),
	
	@XmlEnumValue("BN")
	@JsonProperty("BN")
	BN(String.valueOf("BN")),
	
	@XmlEnumValue("BO")
	@JsonProperty("BO")
	BO(String.valueOf("BO")),
	
	@XmlEnumValue("BQ")
	@JsonProperty("BQ")
	BQ(String.valueOf("BQ")),
	
	@XmlEnumValue("BR")
	@JsonProperty("BR")
	BR(String.valueOf("BR")),
	
	@XmlEnumValue("BS")
	@JsonProperty("BS")
	BS(String.valueOf("BS")),
	
	@XmlEnumValue("BT")
	@JsonProperty("BT")
	BT(String.valueOf("BT")),
	
	@XmlEnumValue("BV")
	@JsonProperty("BV")
	BV(String.valueOf("BV")),
	
	@XmlEnumValue("BW")
	@JsonProperty("BW")
	BW(String.valueOf("BW")),
	
	@XmlEnumValue("BY")
	@JsonProperty("BY")
	BY(String.valueOf("BY")),
	
	@XmlEnumValue("BZ")
	@JsonProperty("BZ")
	BZ(String.valueOf("BZ")),
	
	@XmlEnumValue("CA")
	@JsonProperty("CA")
	CA(String.valueOf("CA")),
	
	@XmlEnumValue("CC")
	@JsonProperty("CC")
	CC(String.valueOf("CC")),
	
	@XmlEnumValue("CD")
	@JsonProperty("CD")
	CD(String.valueOf("CD")),
	
	@XmlEnumValue("CF")
	@JsonProperty("CF")
	CF(String.valueOf("CF")),
	
	@XmlEnumValue("CG")
	@JsonProperty("CG")
	CG(String.valueOf("CG")),
	
	@XmlEnumValue("CH")
	@JsonProperty("CH")
	CH(String.valueOf("CH")),
	
	@XmlEnumValue("CI")
	@JsonProperty("CI")
	CI(String.valueOf("CI")),
	
	@XmlEnumValue("CK")
	@JsonProperty("CK")
	CK(String.valueOf("CK")),
	
	@XmlEnumValue("CL")
	@JsonProperty("CL")
	CL(String.valueOf("CL")),
	
	@XmlEnumValue("CM")
	@JsonProperty("CM")
	CM(String.valueOf("CM")),
	
	@XmlEnumValue("CN")
	@JsonProperty("CN")
	CN(String.valueOf("CN")),
	
	@XmlEnumValue("CO")
	@JsonProperty("CO")
	CO(String.valueOf("CO")),
	
	@XmlEnumValue("CR")
	@JsonProperty("CR")
	CR(String.valueOf("CR")),
	
	@XmlEnumValue("CU")
	@JsonProperty("CU")
	CU(String.valueOf("CU")),
	
	@XmlEnumValue("CV")
	@JsonProperty("CV")
	CV(String.valueOf("CV")),
	
	@XmlEnumValue("CW")
	@JsonProperty("CW")
	CW(String.valueOf("CW")),
	
	@XmlEnumValue("CX")
	@JsonProperty("CX")
	CX(String.valueOf("CX")),
	
	@XmlEnumValue("CY")
	@JsonProperty("CY")
	CY(String.valueOf("CY")),
	
	@XmlEnumValue("CZ")
	@JsonProperty("CZ")
	CZ(String.valueOf("CZ")),
	
	@XmlEnumValue("DE")
	@JsonProperty("DE")
	DE(String.valueOf("DE")),
	
	@XmlEnumValue("DJ")
	@JsonProperty("DJ")
	DJ(String.valueOf("DJ")),
	
	@XmlEnumValue("DK")
	@JsonProperty("DK")
	DK(String.valueOf("DK")),
	
	@XmlEnumValue("DM")
	@JsonProperty("DM")
	DM(String.valueOf("DM")),
	
	@XmlEnumValue("DO")
	@JsonProperty("DO")
	DO(String.valueOf("DO")),
	
	@XmlEnumValue("DZ")
	@JsonProperty("DZ")
	DZ(String.valueOf("DZ")),
	
	@XmlEnumValue("EC")
	@JsonProperty("EC")
	EC(String.valueOf("EC")),
	
	@XmlEnumValue("EE")
	@JsonProperty("EE")
	EE(String.valueOf("EE")),
	
	@XmlEnumValue("EG")
	@JsonProperty("EG")
	EG(String.valueOf("EG")),
	
	@XmlEnumValue("EH")
	@JsonProperty("EH")
	EH(String.valueOf("EH")),
	
	@XmlEnumValue("ER")
	@JsonProperty("ER")
	ER(String.valueOf("ER")),
	
	@XmlEnumValue("ES")
	@JsonProperty("ES")
	ES(String.valueOf("ES")),
	
	@XmlEnumValue("ET")
	@JsonProperty("ET")
	ET(String.valueOf("ET")),
	
	@XmlEnumValue("FI")
	@JsonProperty("FI")
	FI(String.valueOf("FI")),
	
	@XmlEnumValue("FJ")
	@JsonProperty("FJ")
	FJ(String.valueOf("FJ")),
	
	@XmlEnumValue("FK")
	@JsonProperty("FK")
	FK(String.valueOf("FK")),
	
	@XmlEnumValue("FM")
	@JsonProperty("FM")
	FM(String.valueOf("FM")),
	
	@XmlEnumValue("FO")
	@JsonProperty("FO")
	FO(String.valueOf("FO")),
	
	@XmlEnumValue("FR")
	@JsonProperty("FR")
	FR(String.valueOf("FR")),
	
	@XmlEnumValue("GA")
	@JsonProperty("GA")
	GA(String.valueOf("GA")),
	
	@XmlEnumValue("GB")
	@JsonProperty("GB")
	GB(String.valueOf("GB")),
	
	@XmlEnumValue("GD")
	@JsonProperty("GD")
	GD(String.valueOf("GD")),
	
	@XmlEnumValue("GE")
	@JsonProperty("GE")
	GE(String.valueOf("GE")),
	
	@XmlEnumValue("GF")
	@JsonProperty("GF")
	GF(String.valueOf("GF")),
	
	@XmlEnumValue("GG")
	@JsonProperty("GG")
	GG(String.valueOf("GG")),
	
	@XmlEnumValue("GH")
	@JsonProperty("GH")
	GH(String.valueOf("GH")),
	
	@XmlEnumValue("GI")
	@JsonProperty("GI")
	GI(String.valueOf("GI")),
	
	@XmlEnumValue("GL")
	@JsonProperty("GL")
	GL(String.valueOf("GL")),
	
	@XmlEnumValue("GM")
	@JsonProperty("GM")
	GM(String.valueOf("GM")),
	
	@XmlEnumValue("GN")
	@JsonProperty("GN")
	GN(String.valueOf("GN")),
	
	@XmlEnumValue("GP")
	@JsonProperty("GP")
	GP(String.valueOf("GP")),
	
	@XmlEnumValue("GQ")
	@JsonProperty("GQ")
	GQ(String.valueOf("GQ")),
	
	@XmlEnumValue("GR")
	@JsonProperty("GR")
	GR(String.valueOf("GR")),
	
	@XmlEnumValue("GS")
	@JsonProperty("GS")
	GS(String.valueOf("GS")),
	
	@XmlEnumValue("GT")
	@JsonProperty("GT")
	GT(String.valueOf("GT")),
	
	@XmlEnumValue("GU")
	@JsonProperty("GU")
	GU(String.valueOf("GU")),
	
	@XmlEnumValue("GW")
	@JsonProperty("GW")
	GW(String.valueOf("GW")),
	
	@XmlEnumValue("GY")
	@JsonProperty("GY")
	GY(String.valueOf("GY")),
	
	@XmlEnumValue("HK")
	@JsonProperty("HK")
	HK(String.valueOf("HK")),
	
	@XmlEnumValue("HM")
	@JsonProperty("HM")
	HM(String.valueOf("HM")),
	
	@XmlEnumValue("HN")
	@JsonProperty("HN")
	HN(String.valueOf("HN")),
	
	@XmlEnumValue("HR")
	@JsonProperty("HR")
	HR(String.valueOf("HR")),
	
	@XmlEnumValue("HT")
	@JsonProperty("HT")
	HT(String.valueOf("HT")),
	
	@XmlEnumValue("HU")
	@JsonProperty("HU")
	HU(String.valueOf("HU")),
	
	@XmlEnumValue("ID")
	@JsonProperty("ID")
	ID(String.valueOf("ID")),
	
	@XmlEnumValue("IE")
	@JsonProperty("IE")
	IE(String.valueOf("IE")),
	
	@XmlEnumValue("IL")
	@JsonProperty("IL")
	IL(String.valueOf("IL")),
	
	@XmlEnumValue("IM")
	@JsonProperty("IM")
	IM(String.valueOf("IM")),
	
	@XmlEnumValue("IN")
	@JsonProperty("IN")
	IN(String.valueOf("IN")),
	
	@XmlEnumValue("IO")
	@JsonProperty("IO")
	IO(String.valueOf("IO")),
	
	@XmlEnumValue("IQ")
	@JsonProperty("IQ")
	IQ(String.valueOf("IQ")),
	
	@XmlEnumValue("IR")
	@JsonProperty("IR")
	IR(String.valueOf("IR")),
	
	@XmlEnumValue("IS")
	@JsonProperty("IS")
	IS(String.valueOf("IS")),
	
	@XmlEnumValue("IT")
	@JsonProperty("IT")
	IT(String.valueOf("IT")),
	
	@XmlEnumValue("JE")
	@JsonProperty("JE")
	JE(String.valueOf("JE")),
	
	@XmlEnumValue("JM")
	@JsonProperty("JM")
	JM(String.valueOf("JM")),
	
	@XmlEnumValue("JO")
	@JsonProperty("JO")
	JO(String.valueOf("JO")),
	
	@XmlEnumValue("JP")
	@JsonProperty("JP")
	JP(String.valueOf("JP")),
	
	@XmlEnumValue("KE")
	@JsonProperty("KE")
	KE(String.valueOf("KE")),
	
	@XmlEnumValue("KG")
	@JsonProperty("KG")
	KG(String.valueOf("KG")),
	
	@XmlEnumValue("KH")
	@JsonProperty("KH")
	KH(String.valueOf("KH")),
	
	@XmlEnumValue("KI")
	@JsonProperty("KI")
	KI(String.valueOf("KI")),
	
	@XmlEnumValue("KM")
	@JsonProperty("KM")
	KM(String.valueOf("KM")),
	
	@XmlEnumValue("KN")
	@JsonProperty("KN")
	KN(String.valueOf("KN")),
	
	@XmlEnumValue("KP")
	@JsonProperty("KP")
	KP(String.valueOf("KP")),
	
	@XmlEnumValue("KR")
	@JsonProperty("KR")
	KR(String.valueOf("KR")),
	
	@XmlEnumValue("KW")
	@JsonProperty("KW")
	KW(String.valueOf("KW")),
	
	@XmlEnumValue("KY")
	@JsonProperty("KY")
	KY(String.valueOf("KY")),
	
	@XmlEnumValue("KZ")
	@JsonProperty("KZ")
	KZ(String.valueOf("KZ")),
	
	@XmlEnumValue("LA")
	@JsonProperty("LA")
	LA(String.valueOf("LA")),
	
	@XmlEnumValue("LB")
	@JsonProperty("LB")
	LB(String.valueOf("LB")),
	
	@XmlEnumValue("LC")
	@JsonProperty("LC")
	LC(String.valueOf("LC")),
	
	@XmlEnumValue("LI")
	@JsonProperty("LI")
	LI(String.valueOf("LI")),
	
	@XmlEnumValue("LK")
	@JsonProperty("LK")
	LK(String.valueOf("LK")),
	
	@XmlEnumValue("LR")
	@JsonProperty("LR")
	LR(String.valueOf("LR")),
	
	@XmlEnumValue("LS")
	@JsonProperty("LS")
	LS(String.valueOf("LS")),
	
	@XmlEnumValue("LT")
	@JsonProperty("LT")
	LT(String.valueOf("LT")),
	
	@XmlEnumValue("LU")
	@JsonProperty("LU")
	LU(String.valueOf("LU")),
	
	@XmlEnumValue("LV")
	@JsonProperty("LV")
	LV(String.valueOf("LV")),
	
	@XmlEnumValue("LY")
	@JsonProperty("LY")
	LY(String.valueOf("LY")),
	
	@XmlEnumValue("MA")
	@JsonProperty("MA")
	MA(String.valueOf("MA")),
	
	@XmlEnumValue("MC")
	@JsonProperty("MC")
	MC(String.valueOf("MC")),
	
	@XmlEnumValue("MD")
	@JsonProperty("MD")
	MD(String.valueOf("MD")),
	
	@XmlEnumValue("ME")
	@JsonProperty("ME")
	ME(String.valueOf("ME")),
	
	@XmlEnumValue("MF")
	@JsonProperty("MF")
	MF(String.valueOf("MF")),
	
	@XmlEnumValue("MG")
	@JsonProperty("MG")
	MG(String.valueOf("MG")),
	
	@XmlEnumValue("MH")
	@JsonProperty("MH")
	MH(String.valueOf("MH")),
	
	@XmlEnumValue("MK")
	@JsonProperty("MK")
	MK(String.valueOf("MK")),
	
	@XmlEnumValue("ML")
	@JsonProperty("ML")
	ML(String.valueOf("ML")),
	
	@XmlEnumValue("MM")
	@JsonProperty("MM")
	MM(String.valueOf("MM")),
	
	@XmlEnumValue("MN")
	@JsonProperty("MN")
	MN(String.valueOf("MN")),
	
	@XmlEnumValue("MO")
	@JsonProperty("MO")
	MO(String.valueOf("MO")),
	
	@XmlEnumValue("MP")
	@JsonProperty("MP")
	MP(String.valueOf("MP")),
	
	@XmlEnumValue("MQ")
	@JsonProperty("MQ")
	MQ(String.valueOf("MQ")),
	
	@XmlEnumValue("MR")
	@JsonProperty("MR")
	MR(String.valueOf("MR")),
	
	@XmlEnumValue("MS")
	@JsonProperty("MS")
	MS(String.valueOf("MS")),
	
	@XmlEnumValue("MT")
	@JsonProperty("MT")
	MT(String.valueOf("MT")),
	
	@XmlEnumValue("MU")
	@JsonProperty("MU")
	MU(String.valueOf("MU")),
	
	@XmlEnumValue("MV")
	@JsonProperty("MV")
	MV(String.valueOf("MV")),
	
	@XmlEnumValue("MW")
	@JsonProperty("MW")
	MW(String.valueOf("MW")),
	
	@XmlEnumValue("MX")
	@JsonProperty("MX")
	MX(String.valueOf("MX")),
	
	@XmlEnumValue("MY")
	@JsonProperty("MY")
	MY(String.valueOf("MY")),
	
	@XmlEnumValue("MZ")
	@JsonProperty("MZ")
	MZ(String.valueOf("MZ")),
	
	@XmlEnumValue("NA")
	@JsonProperty("NA")
	NA(String.valueOf("NA")),
	
	@XmlEnumValue("NC")
	@JsonProperty("NC")
	NC(String.valueOf("NC")),
	
	@XmlEnumValue("NE")
	@JsonProperty("NE")
	NE(String.valueOf("NE")),
	
	@XmlEnumValue("NF")
	@JsonProperty("NF")
	NF(String.valueOf("NF")),
	
	@XmlEnumValue("NG")
	@JsonProperty("NG")
	NG(String.valueOf("NG")),
	
	@XmlEnumValue("NI")
	@JsonProperty("NI")
	NI(String.valueOf("NI")),
	
	@XmlEnumValue("NL")
	@JsonProperty("NL")
	NL(String.valueOf("NL")),
	
	@XmlEnumValue("NO")
	@JsonProperty("NO")
	NO(String.valueOf("NO")),
	
	@XmlEnumValue("NP")
	@JsonProperty("NP")
	NP(String.valueOf("NP")),
	
	@XmlEnumValue("NR")
	@JsonProperty("NR")
	NR(String.valueOf("NR")),
	
	@XmlEnumValue("NU")
	@JsonProperty("NU")
	NU(String.valueOf("NU")),
	
	@XmlEnumValue("NZ")
	@JsonProperty("NZ")
	NZ(String.valueOf("NZ")),
	
	@XmlEnumValue("OM")
	@JsonProperty("OM")
	OM(String.valueOf("OM")),
	
	@XmlEnumValue("PA")
	@JsonProperty("PA")
	PA(String.valueOf("PA")),
	
	@XmlEnumValue("PE")
	@JsonProperty("PE")
	PE(String.valueOf("PE")),
	
	@XmlEnumValue("PF")
	@JsonProperty("PF")
	PF(String.valueOf("PF")),
	
	@XmlEnumValue("PG")
	@JsonProperty("PG")
	PG(String.valueOf("PG")),
	
	@XmlEnumValue("PH")
	@JsonProperty("PH")
	PH(String.valueOf("PH")),
	
	@XmlEnumValue("PK")
	@JsonProperty("PK")
	PK(String.valueOf("PK")),
	
	@XmlEnumValue("PL")
	@JsonProperty("PL")
	PL(String.valueOf("PL")),
	
	@XmlEnumValue("PM")
	@JsonProperty("PM")
	PM(String.valueOf("PM")),
	
	@XmlEnumValue("PN")
	@JsonProperty("PN")
	PN(String.valueOf("PN")),
	
	@XmlEnumValue("PR")
	@JsonProperty("PR")
	PR(String.valueOf("PR")),
	
	@XmlEnumValue("PS")
	@JsonProperty("PS")
	PS(String.valueOf("PS")),
	
	@XmlEnumValue("PT")
	@JsonProperty("PT")
	PT(String.valueOf("PT")),
	
	@XmlEnumValue("PW")
	@JsonProperty("PW")
	PW(String.valueOf("PW")),
	
	@XmlEnumValue("PY")
	@JsonProperty("PY")
	PY(String.valueOf("PY")),
	
	@XmlEnumValue("QA")
	@JsonProperty("QA")
	QA(String.valueOf("QA")),
	
	@XmlEnumValue("RE")
	@JsonProperty("RE")
	RE(String.valueOf("RE")),
	
	@XmlEnumValue("RO")
	@JsonProperty("RO")
	RO(String.valueOf("RO")),
	
	@XmlEnumValue("RS")
	@JsonProperty("RS")
	RS(String.valueOf("RS")),
	
	@XmlEnumValue("RU")
	@JsonProperty("RU")
	RU(String.valueOf("RU")),
	
	@XmlEnumValue("RW")
	@JsonProperty("RW")
	RW(String.valueOf("RW")),
	
	@XmlEnumValue("SA")
	@JsonProperty("SA")
	SA(String.valueOf("SA")),
	
	@XmlEnumValue("SB")
	@JsonProperty("SB")
	SB(String.valueOf("SB")),
	
	@XmlEnumValue("SC")
	@JsonProperty("SC")
	SC(String.valueOf("SC")),
	
	@XmlEnumValue("SD")
	@JsonProperty("SD")
	SD(String.valueOf("SD")),
	
	@XmlEnumValue("SE")
	@JsonProperty("SE")
	SE(String.valueOf("SE")),
	
	@XmlEnumValue("SG")
	@JsonProperty("SG")
	SG(String.valueOf("SG")),
	
	@XmlEnumValue("SH")
	@JsonProperty("SH")
	SH(String.valueOf("SH")),
	
	@XmlEnumValue("SI")
	@JsonProperty("SI")
	SI(String.valueOf("SI")),
	
	@XmlEnumValue("SJ")
	@JsonProperty("SJ")
	SJ(String.valueOf("SJ")),
	
	@XmlEnumValue("SK")
	@JsonProperty("SK")
	SK(String.valueOf("SK")),
	
	@XmlEnumValue("SL")
	@JsonProperty("SL")
	SL(String.valueOf("SL")),
	
	@XmlEnumValue("SM")
	@JsonProperty("SM")
	SM(String.valueOf("SM")),
	
	@XmlEnumValue("SN")
	@JsonProperty("SN")
	SN(String.valueOf("SN")),
	
	@XmlEnumValue("SO")
	@JsonProperty("SO")
	SO(String.valueOf("SO")),
	
	@XmlEnumValue("SR")
	@JsonProperty("SR")
	SR(String.valueOf("SR")),
	
	@XmlEnumValue("SS")
	@JsonProperty("SS")
	SS(String.valueOf("SS")),
	
	@XmlEnumValue("ST")
	@JsonProperty("ST")
	ST(String.valueOf("ST")),
	
	@XmlEnumValue("SV")
	@JsonProperty("SV")
	SV(String.valueOf("SV")),
	
	@XmlEnumValue("SX")
	@JsonProperty("SX")
	SX(String.valueOf("SX")),
	
	@XmlEnumValue("SY")
	@JsonProperty("SY")
	SY(String.valueOf("SY")),
	
	@XmlEnumValue("SZ")
	@JsonProperty("SZ")
	SZ(String.valueOf("SZ")),
	
	@XmlEnumValue("TC")
	@JsonProperty("TC")
	TC(String.valueOf("TC")),
	
	@XmlEnumValue("TD")
	@JsonProperty("TD")
	TD(String.valueOf("TD")),
	
	@XmlEnumValue("TF")
	@JsonProperty("TF")
	TF(String.valueOf("TF")),
	
	@XmlEnumValue("TG")
	@JsonProperty("TG")
	TG(String.valueOf("TG")),
	
	@XmlEnumValue("TH")
	@JsonProperty("TH")
	TH(String.valueOf("TH")),
	
	@XmlEnumValue("TJ")
	@JsonProperty("TJ")
	TJ(String.valueOf("TJ")),
	
	@XmlEnumValue("TK")
	@JsonProperty("TK")
	TK(String.valueOf("TK")),
	
	@XmlEnumValue("TL")
	@JsonProperty("TL")
	TL(String.valueOf("TL")),
	
	@XmlEnumValue("TM")
	@JsonProperty("TM")
	TM(String.valueOf("TM")),
	
	@XmlEnumValue("TN")
	@JsonProperty("TN")
	TN(String.valueOf("TN")),
	
	@XmlEnumValue("TO")
	@JsonProperty("TO")
	TO(String.valueOf("TO")),
	
	@XmlEnumValue("TR")
	@JsonProperty("TR")
	TR(String.valueOf("TR")),
	
	@XmlEnumValue("TT")
	@JsonProperty("TT")
	TT(String.valueOf("TT")),
	
	@XmlEnumValue("TV")
	@JsonProperty("TV")
	TV(String.valueOf("TV")),
	
	@XmlEnumValue("TW")
	@JsonProperty("TW")
	TW(String.valueOf("TW")),
	
	@XmlEnumValue("TZ")
	@JsonProperty("TZ")
	TZ(String.valueOf("TZ")),
	
	@XmlEnumValue("UA")
	@JsonProperty("UA")
	UA(String.valueOf("UA")),
	
	@XmlEnumValue("UG")
	@JsonProperty("UG")
	UG(String.valueOf("UG")),
	
	@XmlEnumValue("UM")
	@JsonProperty("UM")
	UM(String.valueOf("UM")),
	
	@XmlEnumValue("US")
	@JsonProperty("US")
	US(String.valueOf("US")),
	
	@XmlEnumValue("UY")
	@JsonProperty("UY")
	UY(String.valueOf("UY")),
	
	@XmlEnumValue("UZ")
	@JsonProperty("UZ")
	UZ(String.valueOf("UZ")),
	
	@XmlEnumValue("VA")
	@JsonProperty("VA")
	VA(String.valueOf("VA")),
	
	@XmlEnumValue("VC")
	@JsonProperty("VC")
	VC(String.valueOf("VC")),
	
	@XmlEnumValue("VE")
	@JsonProperty("VE")
	VE(String.valueOf("VE")),
	
	@XmlEnumValue("VG")
	@JsonProperty("VG")
	VG(String.valueOf("VG")),
	
	@XmlEnumValue("VI")
	@JsonProperty("VI")
	VI(String.valueOf("VI")),
	
	@XmlEnumValue("VN")
	@JsonProperty("VN")
	VN(String.valueOf("VN")),
	
	@XmlEnumValue("VU")
	@JsonProperty("VU")
	VU(String.valueOf("VU")),
	
	@XmlEnumValue("WF")
	@JsonProperty("WF")
	WF(String.valueOf("WF")),
	
	@XmlEnumValue("WS")
	@JsonProperty("WS")
	WS(String.valueOf("WS")),
	
	@XmlEnumValue("YE")
	@JsonProperty("YE")
	YE(String.valueOf("YE")),
	
	@XmlEnumValue("YT")
	@JsonProperty("YT")
	YT(String.valueOf("YT")),
	
	@XmlEnumValue("ZA")
	@JsonProperty("ZA")
	ZA(String.valueOf("ZA")),
	
	@XmlEnumValue("ZM")
	@JsonProperty("ZM")
	ZM(String.valueOf("ZM")),
	
	@XmlEnumValue("ZW")
	@JsonProperty("ZW")
	ZW(String.valueOf("ZW"));


    private String value;

    CountryCodeEnum (String v) {
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

  @XmlElement(name="countryCode", required = true)
  @ApiModelProperty(required = true, value = "")
  private CountryCodeEnum countryCode = null;

  @XmlElement(name="line", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AddressLineTextType line = null;
 /**
   * Get countryCode
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
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

