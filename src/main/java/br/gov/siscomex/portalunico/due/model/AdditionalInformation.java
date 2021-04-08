package br.gov.siscomex.portalunico.due.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "AdditionalInformation", propOrder =
    { "statementCode", "statementTypeCode"
})

@XmlRootElement(name="AdditionalInformation")
public class AdditionalInformation  {
  
  @XmlElement(name="statementCode")
  @ApiModelProperty(value = "")
  private String statementCode = null;


@XmlType(name="StatementTypeCodeEnum")
@XmlEnum(String.class)
public enum StatementTypeCodeEnum {

	@XmlEnumValue("AAI")
	@JsonProperty("AAI")
	AAI(String.valueOf("AAI")),
	
	@XmlEnumValue("AGT")
	@JsonProperty("AGT")
	AGT(String.valueOf("AGT")),
	
	@XmlEnumValue("AHZ")
	@JsonProperty("AHZ")
	AHZ(String.valueOf("AHZ")),
	
	@XmlEnumValue("CUS")
	@JsonProperty("CUS")
	CUS(String.valueOf("CUS")),
	
	@XmlEnumValue("DEF")
	@JsonProperty("DEF")
	DEF(String.valueOf("DEF")),
	
	@XmlEnumValue("FGH")
	@JsonProperty("FGH")
	FGH(String.valueOf("FGH")),
	
	@XmlEnumValue("TRA")
	@JsonProperty("TRA")
	TRA(String.valueOf("TRA")),
	
	@XmlEnumValue("ACG")
	@JsonProperty("ACG")
	ACG(String.valueOf("ACG")),
	
	@XmlEnumValue("AAZ")
	@JsonProperty("AAZ")
	AAZ(String.valueOf("AAZ")),
	
	@XmlEnumValue("ABA")
	@JsonProperty("ABA")
	ABA(String.valueOf("ABA")),
	
	@XmlEnumValue("AVD")
	@JsonProperty("AVD")
	AVD(String.valueOf("AVD")),
	
	@XmlEnumValue("PRI")
	@JsonProperty("PRI")
	PRI(String.valueOf("PRI")),
	
	@XmlEnumValue("ABC")
	@JsonProperty("ABC")
	ABC(String.valueOf("ABC"));


    private String value;

    StatementTypeCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatementTypeCodeEnum fromValue(String v) {
        for (StatementTypeCodeEnum b : StatementTypeCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to StatementTypeCodeEnum");
    }
}

  @XmlElement(name="statementTypeCode", required = true)
  @ApiModelProperty(required = true, value = "")
  private StatementTypeCodeEnum statementTypeCode = null;
 /**
   * Get statementCode
   * @return statementCode
  **/
  @JsonProperty("statementCode")
  public String getStatementCode() {
    return statementCode;
  }

  public void setStatementCode(String statementCode) {
    this.statementCode = statementCode;
  }

  public AdditionalInformation statementCode(String statementCode) {
    this.statementCode = statementCode;
    return this;
  }

 /**
   * Get statementTypeCode
   * @return statementTypeCode
  **/
  @JsonProperty("statementTypeCode")
  @NotNull
  public String getStatementTypeCode() {
    if (statementTypeCode == null) {
      return null;
    }
    return statementTypeCode.value();
  }

  public void setStatementTypeCode(StatementTypeCodeEnum statementTypeCode) {
    this.statementTypeCode = statementTypeCode;
  }

  public AdditionalInformation statementTypeCode(StatementTypeCodeEnum statementTypeCode) {
    this.statementTypeCode = statementTypeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformation {\n");
    
    sb.append("    statementCode: ").append(toIndentedString(statementCode)).append("\n");
    sb.append("    statementTypeCode: ").append(toIndentedString(statementTypeCode)).append("\n");
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

