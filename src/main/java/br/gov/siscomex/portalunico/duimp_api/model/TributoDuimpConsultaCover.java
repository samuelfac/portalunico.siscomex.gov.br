package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TributoDuimpConsultaCover", propOrder =
    { "tipo"
})

@XmlRootElement(name="TributoDuimpConsultaCover")
/**
  * Valores do cálculo do tributo.
 **/
@ApiModel(description="Valores do cálculo do tributo.")
public class TributoDuimpConsultaCover  {
  

@XmlType(name="TipoEnum")
@XmlEnum(String.class)
public enum TipoEnum {

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
	
	@XmlEnumValue("MULTA_COM_REDUCAO")
	@JsonProperty("MULTA_COM_REDUCAO")
	MULTA_COM_REDUCAO(String.valueOf("MULTA_COM_REDUCAO")),
	
	@XmlEnumValue("MULTA_SEM_REDUCAO")
	@JsonProperty("MULTA_SEM_REDUCAO")
	MULTA_SEM_REDUCAO(String.valueOf("MULTA_SEM_REDUCAO")),
	
	@XmlEnumValue("TAXA_UTILIZACAO")
	@JsonProperty("TAXA_UTILIZACAO")
	TAXA_UTILIZACAO(String.valueOf("TAXA_UTILIZACAO"));


    private String value;

    TipoEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String v) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "' to TipoEnum");
    }
}

  @XmlElement(name="tipo")
  @ApiModelProperty(example = "II", value = "Tipo de impostos (códigos de receita principal únicos).<br>Domínio:")
 /**
   * Tipo de impostos (códigos de receita principal únicos).<br>Domínio:
  **/
  private TipoEnum tipo = null;
 /**
   * Tipo de impostos (códigos de receita principal únicos).&lt;br&gt;Domínio:
   * @return tipo
  **/
  @JsonProperty("tipo")
  public String getTipo() {
    if (tipo == null) {
      return null;
    }
    return tipo.value();
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public TributoDuimpConsultaCover tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoDuimpConsultaCover {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

