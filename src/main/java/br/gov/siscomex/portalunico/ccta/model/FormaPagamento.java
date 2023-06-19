package br.gov.siscomex.portalunico.ccta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "FormaPagamento", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="FormaPagamento")
public class FormaPagamento  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("P")
	@JsonProperty("P")
	P(String.valueOf("P")),
	
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
  @ApiModelProperty(example = "P", value = "Código da forma de pagamento.<br/>Tamanho: 1<br/>P - Prepaid<br/>C - Collect")
 /**
   * Código da forma de pagamento.<br/>Tamanho: 1<br/>P - Prepaid<br/>C - Collect
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Prepaid", value = "Descrição da forma de pagamento.<br/>Tamanho: 7")
 /**
   * Descrição da forma de pagamento.<br/>Tamanho: 7
  **/
  private String descricao = null;
 /**
   * Código da forma de pagamento.&lt;br/&gt;Tamanho: 1&lt;br/&gt;P - Prepaid&lt;br/&gt;C - Collect
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

  public FormaPagamento codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição da forma de pagamento.&lt;br/&gt;Tamanho: 7
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public FormaPagamento descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormaPagamento {\n");
    
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

