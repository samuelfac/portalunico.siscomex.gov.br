package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoTotalMoedaDestino", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoTotalMoedaDestino")
public class TipoTotalMoedaDestino  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("M")
	@JsonProperty("M")
	M(String.valueOf("M")),
	
	@XmlEnumValue("E")
	@JsonProperty("E")
	E(String.valueOf("E")),
	
	@XmlEnumValue("C")
	@JsonProperty("C")
	C(String.valueOf("C"));


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
  @ApiModelProperty(example = "E", value = "Código do total na moeda de destino.<br/>Tamanho: 1<br/>M - Total na Moeda de Destino<br/>E - Encargos no Destino<br/>C - Total Collect")
 /**
   * Código do total na moeda de destino.<br/>Tamanho: 1<br/>M - Total na Moeda de Destino<br/>E - Encargos no Destino<br/>C - Total Collect
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Encargos no Destino", value = "Descrição do total na moeda de destino.<br/>Tamanho: 25")
 /**
   * Descrição do total na moeda de destino.<br/>Tamanho: 25
  **/
  private String descricao = null;
 /**
   * Código do total na moeda de destino.&lt;br/&gt;Tamanho: 1&lt;br/&gt;M - Total na Moeda de Destino&lt;br/&gt;E - Encargos no Destino&lt;br/&gt;C - Total Collect
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

  public TipoTotalMoedaDestino codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição do total na moeda de destino.&lt;br/&gt;Tamanho: 25
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoTotalMoedaDestino descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTotalMoedaDestino {\n");
    
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

