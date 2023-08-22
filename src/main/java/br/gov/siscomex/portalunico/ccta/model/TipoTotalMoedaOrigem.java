package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoTotalMoedaOrigem", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoTotalMoedaOrigem")
public class TipoTotalMoedaOrigem  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
	@XmlEnumValue("V")
	@JsonProperty("V")
	V(String.valueOf("V")),
	
	@XmlEnumValue("I")
	@JsonProperty("I")
	I(String.valueOf("I")),
	
	@XmlEnumValue("A")
	@JsonProperty("A")
	A(String.valueOf("A")),
	
	@XmlEnumValue("C")
	@JsonProperty("C")
	C(String.valueOf("C")),
	
	@XmlEnumValue("T")
	@JsonProperty("T")
	T(String.valueOf("T"));


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
  @ApiModelProperty(example = "P", value = "Código do total na moeda de origem.<br/>Tamanho: 1<br/>P - Por Peso<br/>V - Por Valor<br/>I - Impostos<br/>A - Outros Serviços (Agente de Carga)<br/>C - Outros Serviços (Transportador)<br/>T - Total")
 /**
   * Código do total na moeda de origem.<br/>Tamanho: 1<br/>P - Por Peso<br/>V - Por Valor<br/>I - Impostos<br/>A - Outros Serviços (Agente de Carga)<br/>C - Outros Serviços (Transportador)<br/>T - Total
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Por Peso", value = "Descrição do total na moeda de origem.<br/>Tamanho: 33")
 /**
   * Descrição do total na moeda de origem.<br/>Tamanho: 33
  **/
  private String descricao = null;
 /**
   * Código do total na moeda de origem.&lt;br/&gt;Tamanho: 1&lt;br/&gt;P - Por Peso&lt;br/&gt;V - Por Valor&lt;br/&gt;I - Impostos&lt;br/&gt;A - Outros Serviços (Agente de Carga)&lt;br/&gt;C - Outros Serviços (Transportador)&lt;br/&gt;T - Total
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

  public TipoTotalMoedaOrigem codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do total na moeda de origem.&lt;br/&gt;Tamanho: 33
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoTotalMoedaOrigem descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTotalMoedaOrigem {\n");
    
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

