package br.gov.siscomex.portalunico.ccta.model;

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
 @XmlType(name = "Avaria", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="Avaria")
public class Avaria  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("A")
	@JsonProperty("A")
	A(String.valueOf("A")),
	
	@XmlEnumValue("B")
	@JsonProperty("B")
	B(String.valueOf("B")),
	
	@XmlEnumValue("C")
	@JsonProperty("C")
	C(String.valueOf("C")),
	
	@XmlEnumValue("D")
	@JsonProperty("D")
	D(String.valueOf("D")),
	
	@XmlEnumValue("E")
	@JsonProperty("E")
	E(String.valueOf("E")),
	
	@XmlEnumValue("F")
	@JsonProperty("F")
	F(String.valueOf("F")),
	
	@XmlEnumValue("G")
	@JsonProperty("G")
	G(String.valueOf("G")),
	
	@XmlEnumValue("H")
	@JsonProperty("H")
	H(String.valueOf("H")),
	
	@XmlEnumValue("I")
	@JsonProperty("I")
	I(String.valueOf("I")),
	
	@XmlEnumValue("J")
	@JsonProperty("J")
	J(String.valueOf("J")),
	
	@XmlEnumValue("K")
	@JsonProperty("K")
	K(String.valueOf("K")),
	
	@XmlEnumValue("L")
	@JsonProperty("L")
	L(String.valueOf("L")),
	
	@XmlEnumValue("M")
	@JsonProperty("M")
	M(String.valueOf("M")),
	
	@XmlEnumValue("N")
	@JsonProperty("N")
	N(String.valueOf("N")),
	
	@XmlEnumValue("O")
	@JsonProperty("O")
	O(String.valueOf("O")),
	
	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
	@XmlEnumValue("Q")
	@JsonProperty("Q")
	Q(String.valueOf("Q")),
	
	@XmlEnumValue("R")
	@JsonProperty("R")
	R(String.valueOf("R")),
	
	@XmlEnumValue("S")
	@JsonProperty("S")
	S(String.valueOf("S"));


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
  @ApiModelProperty(example = "A", value = "Código da avaria<br>Tamanho: 1")
 /**
   * Código da avaria<br>Tamanho: 1
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Diferença de peso", value = "Descrição da avaria<br>Tamanho: 60")
 /**
   * Descrição da avaria<br>Tamanho: 60
  **/
  private String descricao = null;
 /**
   * Código da avaria&lt;br&gt;Tamanho: 1
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

  public Avaria codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da avaria&lt;br&gt;Tamanho: 60
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Avaria descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avaria {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

