package br.gov.siscomex.portalunico.duimp_api.model;

import br.gov.siscomex.portalunico.duimp_api.model.MemoriaCalculoItemCover;
import br.gov.siscomex.portalunico.duimp_api.model.ValoresTributoItemCover;
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
 @XmlType(name = "TributoCalculadoItemCover", propOrder =
    { "tipo", "valoresBRL", "memoriaCalculo"
})

@XmlRootElement(name="TributoCalculadoItemCover")
/**
  * Valores do cálculo do tributo e a memória de cálculo.
 **/
@ApiModel(description="Valores do cálculo do tributo e a memória de cálculo.")
public class TributoCalculadoItemCover  {
  

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

  @XmlElement(name="valoresBRL")
  @ApiModelProperty(value = "")
  @Valid
  private ValoresTributoItemCover valoresBRL = null;

  @XmlElement(name="memoriaCalculo")
  @ApiModelProperty(value = "")
  @Valid
  private MemoriaCalculoItemCover memoriaCalculo = null;
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

  public TributoCalculadoItemCover tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

 /**
   * Get valoresBRL
   * @return valoresBRL
  **/
  @JsonProperty("valoresBRL")
  public ValoresTributoItemCover getValoresBRL() {
    return valoresBRL;
  }

  public void setValoresBRL(ValoresTributoItemCover valoresBRL) {
    this.valoresBRL = valoresBRL;
  }

  public TributoCalculadoItemCover valoresBRL(ValoresTributoItemCover valoresBRL) {
    this.valoresBRL = valoresBRL;
    return this;
  }

 /**
   * Get memoriaCalculo
   * @return memoriaCalculo
  **/
  @JsonProperty("memoriaCalculo")
  public MemoriaCalculoItemCover getMemoriaCalculo() {
    return memoriaCalculo;
  }

  public void setMemoriaCalculo(MemoriaCalculoItemCover memoriaCalculo) {
    this.memoriaCalculo = memoriaCalculo;
  }

  public TributoCalculadoItemCover memoriaCalculo(MemoriaCalculoItemCover memoriaCalculo) {
    this.memoriaCalculo = memoriaCalculo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TributoCalculadoItemCover {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valoresBRL: ").append(toIndentedString(valoresBRL)).append("\n");
    sb.append("    memoriaCalculo: ").append(toIndentedString(memoriaCalculo)).append("\n");
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

