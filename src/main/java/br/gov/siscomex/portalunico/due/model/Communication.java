package br.gov.siscomex.portalunico.due.model;

import javax.validation.Valid;
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
 @XmlType(name = "Communication", propOrder =
    { "id", "typeCode"
})

@XmlRootElement(name="Communication")
public class Communication  {
  
  @XmlElement(name="id", required = true)
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CommunicationIdentificationIDType id = null;


@XmlType(name="TypeCodeEnum")
@XmlEnum(String.class)
public enum TypeCodeEnum {

	@XmlEnumValue("EM")
	@JsonProperty("EM")
	EM(String.valueOf("EM")),
	
	@XmlEnumValue("TE")
	@JsonProperty("TE")
	TE(String.valueOf("TE"));


    private String value;

    TypeCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeCodeEnum fromValue(String v) {
        for (TypeCodeEnum b : TypeCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TypeCodeEnum");
    }
}

  @XmlElement(name="typeCode", required = true)
  @ApiModelProperty(required = true, value = "")
  private TypeCodeEnum typeCode = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public CommunicationIdentificationIDType getId() {
    return id;
  }

  public void setId(CommunicationIdentificationIDType id) {
    this.id = id;
  }

  public Communication id(CommunicationIdentificationIDType id) {
    this.id = id;
    return this;
  }

 /**
   * Get typeCode
   * @return typeCode
  **/
  @JsonProperty("typeCode")
  @NotNull
  public String getTypeCode() {
    if (typeCode == null) {
      return null;
    }
    return typeCode.value();
  }

  public void setTypeCode(TypeCodeEnum typeCode) {
    this.typeCode = typeCode;
  }

  public Communication typeCode(TypeCodeEnum typeCode) {
    this.typeCode = typeCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Communication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

