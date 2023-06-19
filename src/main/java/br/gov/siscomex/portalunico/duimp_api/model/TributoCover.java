package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="TributoCover")
/**
  * Dados de um tributo.
 **/
@ApiModel(description="Dados de um tributo.")
public class TributoCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("II")
	@JsonProperty("II")
	II(String.valueOf("II")),
	
	@XmlEnumValue("IPI")
	@JsonProperty("IPI")
	IPI(String.valueOf("IPI")),
	
	@XmlEnumValue("PIS")
	@JsonProperty("PIS")
	PIS(String.valueOf("PIS")),
	
	@XmlEnumValue("COFINS")
	@JsonProperty("COFINS")
	COFINS(String.valueOf("COFINS")),
	
	@XmlEnumValue("CIDE")
	@JsonProperty("CIDE")
	CIDE(String.valueOf("CIDE")),
	
	@XmlEnumValue("ANTIDUMPING")
	@JsonProperty("ANTIDUMPING")
	ANTIDUMPING(String.valueOf("ANTIDUMPING")),
	
	@XmlEnumValue("MEDIDAS")
	@JsonProperty("MEDIDAS")
	MEDIDAS(String.valueOf("MEDIDAS")),
	
	@XmlEnumValue("SALVAGUARDA")
	@JsonProperty("SALVAGUARDA")
	SALVAGUARDA(String.valueOf("SALVAGUARDA")),
	
	@XmlEnumValue("MULTA")
	@JsonProperty("MULTA")
	MULTA(String.valueOf("MULTA"));


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

  @XmlElement(name="codigo")
  @ApiModelProperty(example = "IPI", value = "Código do regime tributário.<br>Domínio:")
 /**
   * Código do regime tributário.<br>Domínio:
  **/
  private CodigoEnum codigo = null;
 /**
   * Código do regime tributário.&lt;br&gt;Domínio:
   * @return codigo
  **/
  @JsonProperty("codigo")
  public String getCodigo() {
    if (codigo == null) {
      return null;
    }
    return codigo.value();
  }

  public void setCodigo(CodigoEnum codigo) {
    this.codigo = codigo;
  }

  public TributoCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoCover {\n");
    
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

