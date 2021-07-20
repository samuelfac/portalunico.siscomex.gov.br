package br.gov.siscomex.portalunico.duimp_api.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IndicadorCompradorVendedorCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="IndicadorCompradorVendedorCover")
/**
  * Vinculação comprador x vendedor.
 **/
@ApiModel(description="Vinculação comprador x vendedor.")
public class IndicadorCompradorVendedorCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("NAO_HA_VINCULACAO")
	@JsonProperty("NAO_HA_VINCULACAO")
	NAO_HA_VINCULACAO(String.valueOf("NAO_HA_VINCULACAO")),
	
	@XmlEnumValue("VINCULACAO_SEM_INFLUENCIA_PRECO")
	@JsonProperty("VINCULACAO_SEM_INFLUENCIA_PRECO")
	VINCULACAO_SEM_INFLUENCIA_PRECO(String.valueOf("VINCULACAO_SEM_INFLUENCIA_PRECO")),
	
	@XmlEnumValue("VINCULACAO_COM_INFLUENCIA_PRECO")
	@JsonProperty("VINCULACAO_COM_INFLUENCIA_PRECO")
	VINCULACAO_COM_INFLUENCIA_PRECO(String.valueOf("VINCULACAO_COM_INFLUENCIA_PRECO"));


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
  @ApiModelProperty(example = "NAO_HA_VINCULACAO", required = true, value = "Código de vinculação comprador x vendedor.<br>Domínio:")
 /**
   * Código de vinculação comprador x vendedor.<br>Domínio:
  **/
  private CodigoEnum codigo = null;
 /**
   * Código de vinculação comprador x vendedor.&lt;br&gt;Domínio:
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

  public IndicadorCompradorVendedorCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicadorCompradorVendedorCover {\n");
    
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

