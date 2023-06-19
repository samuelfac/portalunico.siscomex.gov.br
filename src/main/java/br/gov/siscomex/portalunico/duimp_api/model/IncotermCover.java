package br.gov.siscomex.portalunico.duimp_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "IncotermCover", propOrder =
    { "codigo", "complemento"
})

@XmlRootElement(name="IncotermCover")
/**
  * Condição de Venda<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Este grupo só deve ser preenchido quando o atributo \"código do método de valoração\" for preenchido com o valor '1'.
 **/
@ApiModel(description="Condição de Venda<br>Origem: Sistema de Tabelas Aduaneiras - https://api-docs.portalunico.siscomex.gov.br/<br>Observação: Este grupo só deve ser preenchido quando o atributo \"código do método de valoração\" for preenchido com o valor '1'.")
public class IncotermCover  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("EXW")
	@JsonProperty("EXW")
	EXW(String.valueOf("EXW")),
	
	@XmlEnumValue("FAS")
	@JsonProperty("FAS")
	FAS(String.valueOf("FAS")),
	
	@XmlEnumValue("FCA")
	@JsonProperty("FCA")
	FCA(String.valueOf("FCA")),
	
	@XmlEnumValue("FOB")
	@JsonProperty("FOB")
	FOB(String.valueOf("FOB")),
	
	@XmlEnumValue("OCV")
	@JsonProperty("OCV")
	OCV(String.valueOf("OCV")),
	
	@XmlEnumValue("C_F")
	@JsonProperty("C_F")
	C_F(String.valueOf("C_F")),
	
	@XmlEnumValue("CFR")
	@JsonProperty("CFR")
	CFR(String.valueOf("CFR")),
	
	@XmlEnumValue("CPT")
	@JsonProperty("CPT")
	CPT(String.valueOf("CPT")),
	
	@XmlEnumValue("C_I")
	@JsonProperty("C_I")
	C_I(String.valueOf("C_I")),
	
	@XmlEnumValue("DAT")
	@JsonProperty("DAT")
	DAT(String.valueOf("DAT")),
	
	@XmlEnumValue("CIF")
	@JsonProperty("CIF")
	CIF(String.valueOf("CIF")),
	
	@XmlEnumValue("CIP")
	@JsonProperty("CIP")
	CIP(String.valueOf("CIP")),
	
	@XmlEnumValue("DAP")
	@JsonProperty("DAP")
	DAP(String.valueOf("DAP"));


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
  @ApiModelProperty(example = "FOB", value = "Código da Condição de Venda (Código INCOTERM).<br>Tamanho: 3<br>Domínio:")
 /**
   * Código da Condição de Venda (Código INCOTERM).<br>Tamanho: 3<br>Domínio:
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="complemento")
  @ApiModelProperty(example = "1", value = "Descrição complementar da condição de venda.<br>Tamanho mínimo: 0<br>Tamanho máximo: 250")
 /**
   * Descrição complementar da condição de venda.<br>Tamanho mínimo: 0<br>Tamanho máximo: 250
  **/
  private String complemento = null;
 /**
   * Código da Condição de Venda (Código INCOTERM).&lt;br&gt;Tamanho: 3&lt;br&gt;Domínio:
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

  public IncotermCover codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição complementar da condição de venda.&lt;br&gt;Tamanho mínimo: 0&lt;br&gt;Tamanho máximo: 250
   * @return complemento
  **/
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public IncotermCover complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncotermCover {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
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

