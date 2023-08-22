package br.gov.siscomex.portalunico.duimp_api.model;

import io.swagger.v3.oas.annotations.media.Schema;
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
 @XmlType(name = "CoberturaCambialCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="CoberturaCambialCover")
/**
  * Cobertura cambial.
 **/
@ApiModel(description="Cobertura cambial.")
public class CoberturaCambialCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("ATE_180_DIAS")
	@JsonProperty("ATE_180_DIAS")
	ATE_180_DIAS(String.valueOf("ATE_180_DIAS")),
	
	@XmlEnumValue("DE_180_ATE_360")
	@JsonProperty("DE_180_ATE_360")
	DE_180_ATE_360(String.valueOf("DE_180_ATE_360")),
	
	@XmlEnumValue("ACIMA_360")
	@JsonProperty("ACIMA_360")
	ACIMA_360(String.valueOf("ACIMA_360")),
	
	@XmlEnumValue("SEM_COBERTURA")
	@JsonProperty("SEM_COBERTURA")
	SEM_COBERTURA(String.valueOf("SEM_COBERTURA"));


    private String value;

    CodigoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CodigoEnum fromValue(String v) {
        for (CodigoEnum b : CodigoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to CodigoEnum");
    }
}

  @XmlElement(name="codigo", required = true)
  @ApiModelProperty(example = "ATE_180_DIAS", required = true, value = "Código da cobertura cambial.<br>Domínio:")
 /**
   * Código da cobertura cambial.<br>Domínio:
  **/
  private CodigoEnum codigo = null;
 /**
   * Código da cobertura cambial.&lt;br&gt;Domínio:
   * @return codigo
  **/
  @JsonProperty("codigo")
  @NotNull
  public String getCodigo() {
    if (codigo == null) {
      return null;
    }
    return codigo.value();
  }

  public void setCodigo(CodigoEnum codigo) {
    this.codigo = codigo;
  }

  public CoberturaCambialCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoberturaCambialCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

