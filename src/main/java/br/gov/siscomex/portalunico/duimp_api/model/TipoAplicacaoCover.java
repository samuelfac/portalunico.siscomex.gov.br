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
 @XmlType(name = "TipoAplicacaoCover", propOrder =
    { "codigo"
})

@XmlRootElement(name="TipoAplicacaoCover")
/**
  * Destinação da mercadoria.
 **/
@ApiModel(description="Destinação da mercadoria.")
public class TipoAplicacaoCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("CONSUMO")
	@JsonProperty("CONSUMO")
	CONSUMO(String.valueOf("CONSUMO")),
	
	@XmlEnumValue("INCORPORACAO_ATIVO_FIXO")
	@JsonProperty("INCORPORACAO_ATIVO_FIXO")
	INCORPORACAO_ATIVO_FIXO(String.valueOf("INCORPORACAO_ATIVO_FIXO")),
	
	@XmlEnumValue("INDUSTRIALIZACAO")
	@JsonProperty("INDUSTRIALIZACAO")
	INDUSTRIALIZACAO(String.valueOf("INDUSTRIALIZACAO")),
	
	@XmlEnumValue("REVENDA")
	@JsonProperty("REVENDA")
	REVENDA(String.valueOf("REVENDA")),
	
	@XmlEnumValue("OUTRA")
	@JsonProperty("OUTRA")
	OUTRA(String.valueOf("OUTRA"));


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
  @ApiModelProperty(example = "CONSUMO", required = true, value = "Destinação da mercadoria de acordo com o domínio a seguir.<br>Domínio:")
 /**
   * Destinação da mercadoria de acordo com o domínio a seguir.<br>Domínio:
  **/
  private CodigoEnum codigo = null;
 /**
   * Destinação da mercadoria de acordo com o domínio a seguir.&lt;br&gt;Domínio:
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

  public TipoAplicacaoCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAplicacaoCover {\n");
    
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

