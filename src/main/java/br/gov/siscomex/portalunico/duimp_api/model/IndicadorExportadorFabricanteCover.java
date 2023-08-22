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
 @XmlType(name = "IndicadorExportadorFabricanteCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="IndicadorExportadorFabricanteCover")
/**
  * Relação exportador x fabricante.
 **/
@ApiModel(description="Relação exportador x fabricante.")
public class IndicadorExportadorFabricanteCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("EXPORTADOR_DIFERENTE_FABRICANTE")
	@JsonProperty("EXPORTADOR_DIFERENTE_FABRICANTE")
	DIFERENTE_FABRICANTE(String.valueOf("EXPORTADOR_DIFERENTE_FABRICANTE")),
	
	@XmlEnumValue("EXPORTADOR_IGUAL_FABRICANTE")
	@JsonProperty("EXPORTADOR_IGUAL_FABRICANTE")
	IGUAL_FABRICANTE(String.valueOf("EXPORTADOR_IGUAL_FABRICANTE"));


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
  @ApiModelProperty(example = "EXPORTADOR_DIFERENTE_FABRICANTE", required = true, value = "Código da relação exportador x fabricante.<br>Domínio:")
 /**
   * Código da relação exportador x fabricante.<br>Domínio:
  **/
  private CodigoEnum codigo = null;
 /**
   * Código da relação exportador x fabricante.&lt;br&gt;Domínio:
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

  public IndicadorExportadorFabricanteCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicadorExportadorFabricanteCover {\n");
    
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

