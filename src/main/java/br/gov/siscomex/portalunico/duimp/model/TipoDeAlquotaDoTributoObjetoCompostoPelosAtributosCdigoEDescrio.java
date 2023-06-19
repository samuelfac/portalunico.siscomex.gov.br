package br.gov.siscomex.portalunico.duimp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio", propOrder =
    { "codigo", "descricao"
})

@XmlRootElement(name="TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio")
public class TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio  {
  

@XmlType(name="CodigoEnum")
@XmlEnum(String.class)
public enum CodigoEnum {

	@XmlEnumValue("1")
	@JsonProperty("1")
	_1(String.valueOf("1")),
	
	@XmlEnumValue("2")
	@JsonProperty("2")
	_2(String.valueOf("2")),
	
	@XmlEnumValue("3")
	@JsonProperty("3")
	_3(String.valueOf("3")),
	
	@XmlEnumValue("4")
	@JsonProperty("4")
	_4(String.valueOf("4")),
	
	@XmlEnumValue("5")
	@JsonProperty("5")
	_5(String.valueOf("5"));


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
  @ApiModelProperty(example = "1", value = "Tipo de alíquota.<br>Dominio: <br>1 - Ad valorem, <br>2 - Específica, <br>3 - Ambas, <br>4 - Maior entre as duas, <br>5 - Menor entre as duas<br>Tamanho: 1")
 /**
   * Tipo de alíquota.<br>Dominio: <br>1 - Ad valorem, <br>2 - Específica, <br>3 - Ambas, <br>4 - Maior entre as duas, <br>5 - Menor entre as duas<br>Tamanho: 1
  **/
  private CodigoEnum codigo = null;

  @XmlElement(name="descricao")
  @ApiModelProperty(example = "Ad valorem", value = "Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80")
 /**
   * Descrição correspondente ao valor informado no atributo 'codigo'. <br>Tamanho mínimo: 1<br>Tamanho máximo: 80
  **/
  private String descricao = null;
 /**
   * Tipo de alíquota.&lt;br&gt;Dominio: &lt;br&gt;1 - Ad valorem, &lt;br&gt;2 - Específica, &lt;br&gt;3 - Ambas, &lt;br&gt;4 - Maior entre as duas, &lt;br&gt;5 - Menor entre as duas&lt;br&gt;Tamanho: 1
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

  public TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio codigo(CodigoEnum codigo) {
    this.codigo = codigo;
    return this;
  }

 /**
   * Descrição correspondente ao valor informado no atributo &#39;codigo&#39;. &lt;br&gt;Tamanho mínimo: 1&lt;br&gt;Tamanho máximo: 80
   * @return descricao
  **/
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDeAlquotaDoTributoObjetoCompostoPelosAtributosCdigoEDescrio {\n");
    
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

